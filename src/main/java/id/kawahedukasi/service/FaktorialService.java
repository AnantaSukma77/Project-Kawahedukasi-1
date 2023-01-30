package id.kawahedukasi.service;

import id.kawahedukasi.model.Faktorial;
import io.vertx.core.json.JsonObject;


import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.Map;

@ApplicationScoped
public class FaktorialService {

    @Transactional
    public Response created(JsonObject request){
        Integer n = request.getInteger("n");

        if (n == null){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("message", "BAD REQUEST"))
                    .build();
        }
        Integer factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }


        Faktorial faktorial = new Faktorial();
        faktorial.setN(n);
        faktorial.setFaktorial(factorial);

        faktorial.persist();

        return Response.ok().entity(Map.of("Hasil", "masuk")).build();
    }
}
