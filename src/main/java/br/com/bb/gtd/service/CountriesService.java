package br.com.bb.gtd.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.com.bb.gtd.model.Country;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/v2")
//@RegisterRestClient(baseUri="https://restcountries.eu/rest")
@RegisterRestClient
@Singleton
public interface CountriesService {

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    Set<Country> getByName(@PathParam String name);

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    CompletionStage<Set<Country>> getByNameAsync(@PathParam String name);
}
