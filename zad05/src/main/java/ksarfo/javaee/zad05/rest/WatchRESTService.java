package ksarfo.javaee.zad05.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ksarfo.javaee.zad05.domain.Watch;
import ksarfo.javaee.zad05.service.WatchManager;

@Path("watch")
@Stateless
public class WatchRESTService {

    @Inject
    private WatchManager watchManager;

    @GET
    @Path("/id={watchId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Watch getWatch(@PathParam("watchId") Long id) {
        return watchManager.getWatch(id);
    }

    @GET
    @Path("/producer={watchProducer}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Watch> getByProducer(@PathParam("watchProducer") String producer) {
        return watchManager.getWatchesByProducer(producer);
    }
    
    @GET
    @Path("/priceLT={price}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Watch> getByPriceL(@PathParam("price") double price) {
    	return watchManager.getWatchesLTPrice(price);
    }
    
    @GET
    @Path("/priceGT={price}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Watch> getByPriceG(@PathParam("price") double price) {
    	return watchManager.getWatchesGTPrice(price);
    }
    
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Watch> getAllWatches() {
        return watchManager.getAllWatches();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewWatch(Watch watch) {
        watchManager.addNewWatch(watch);

        return Response.status(201).entity("New watch added").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateWatch(Watch watch) {
        watchManager.updateWatch(watch);
        return Response.status(201).entity("Watch has been updated").build();
    }

    @DELETE
    @Path("/id={watchId}")
    public Response deleteWatch(@PathParam("watchId") long id) {
        watchManager.deleteWatch(id);
        return Response.status(200).entity("Watch has been removed").build();
    }
    
    @DELETE
    public Response deleteAll() {
    	watchManager.deleteAllWatches();
    	return Response.status(201).entity("All watches has been removed").build();
    }

}
