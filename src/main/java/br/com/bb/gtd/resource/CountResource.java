package br.com.bb.gtd.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bb.gtd.scheduling.CounterBean;

@Path("/count")
public class CountResource {

    @Inject
    CounterBean counter;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "count: " + counter.get();
    }
}
