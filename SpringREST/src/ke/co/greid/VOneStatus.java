package ke.co.greid;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class VOneStatus {
	private static final String API_VERSION="0.0.1";
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Got the thing at the other end</p>";
	}

	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "Version: "+API_VERSION;
	}
}
