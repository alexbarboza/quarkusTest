package br.com.bb.gtd.service;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.bb.gtd.model.CursoAlura;

@Path("/api")
//@RegisterRestClient(baseUri="https://cursos.alura.com.br")
@RegisterRestClient
@Singleton
public interface CursosAluraService {

    @GET
    @Path("/cursos")
    @Produces("application/json")
    Set<CursoAlura> get();

    @GET
    @Path("/cursos")
    @Produces("application/json")
    CompletionStage<Set<CursoAlura>> getAsync();
}
