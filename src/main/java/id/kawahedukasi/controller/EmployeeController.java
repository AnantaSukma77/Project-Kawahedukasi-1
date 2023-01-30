package id.kawahedukasi.controller;

import com.oracle.svm.core.annotate.Inject;

import id.kawahedukasi.service.EmployeeService;
import io.vertx.core.json.JsonObject;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {
    @Inject
    EmployeeService employeeService;


    @POST
    public Response create(JsonObject request) {
        return employeeService.create(request);
    }
}
