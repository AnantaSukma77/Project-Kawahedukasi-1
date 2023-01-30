package id.kawahedukasi.service;

import id.kawahedukasi.model.Employee;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.Map;

@ApplicationScoped
public class EmployeeService {

    @Transactional
    public Response create(JsonObject request){
        String name = request.getString("name");
        Integer manager_id = request.getInteger("manager_id");

        if(name == null){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("message", "BAD REQUEST"))
                    .build();
        }
        Employee employee = new Employee();
        employee.setName(name);
        employee.setManager_id(manager_id);

        employee.persist();

        return Response.ok().entity(Map.of("Hasil", employee.getId())).build();
    }
}
