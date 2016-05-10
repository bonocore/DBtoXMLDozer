package com.rh.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/gas")
public interface GasService {
	@GET
    @Path("/retrieve/{acercode}")
    @Produces(MediaType.TEXT_XML)
    public String getAssets(@PathParam("acercode") String id);
}
