package id.kawahedukasi.controller;

import id.kawahedukasi.service.FaktorialService;
import io.vertx.core.json.JsonObject;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/faktorial")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FaktorialController {

    @Inject
    FaktorialService faktorialService;

    @POST
    public Response create(JsonObject request){
        return faktorialService.created(request);
    }
}
