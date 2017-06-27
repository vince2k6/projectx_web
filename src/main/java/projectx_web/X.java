package projectx_web;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

@ApplicationPath("/projectx")
public class X extends Application {

    /**
     * Retrieves representation of an instance of Test
     *
     * @return an instance of String
     */
    @GET
    @Path("/x")
    @Produces(MediaType.APPLICATION_JSON)
    public String resourceMethodGET() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "OK");
        return jsonObject.toString();
    }

}
