package br.com.bb.gtd.resource;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.bb.gtd.model.CursoAlura;
import br.com.bb.gtd.service.CursosAluraService;

@Path("/alura")
public class CursosAluraResource {

    @Inject
    @RestClient
    CursosAluraService CursosAluraService;


    @GET
    @Path("/cursos")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<CursoAlura> cursos() {
        return CursosAluraService.get();
    }

    @GET
    @Path("/cursos-async")
    @Produces(MediaType.APPLICATION_JSON)
    public CompletionStage<Set<CursoAlura>> cursosAsync() {
        return CursosAluraService.getAsync();
    }
}
