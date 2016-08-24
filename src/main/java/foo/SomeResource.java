package foo;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("test")
public class SomeResource {

	@GET
	public Response doTest(@BeanParam final SomeBean test) {
		if (test.getFoo() == null) {
			System.err.println("FOO");
		}

		if (test.getBar() == null) {
			System.err.println("BAR");
		}

		return Response.ok().build();
	}
}
