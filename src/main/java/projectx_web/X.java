package projectx_web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

@Path("/projectx")
public class X {

    /**
     * Retrieves representation of an instance of Test
     *
     * @return an instance of String
     */
    @GET
    @Path("x")
    @Produces(MediaType.APPLICATION_JSON)
    public String resourceMethodGET() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "OK");
        return jsonObject.toString();
    }

    public static void main(String args[]) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "OK");
        System.out.println(jsonObject);
    }
}
