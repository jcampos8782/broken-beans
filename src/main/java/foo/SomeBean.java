package foo;

import javax.inject.Inject;
import javax.ws.rs.QueryParam;

public class SomeBean {

	@QueryParam("foo")
	private String foo;

	@QueryParam("bar")
	private String bar;

	@Inject
	public SomeBean() {

	}

	public String getFoo() {
		return foo;
	}

	public void setFoo(final String foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(final String bar) {
		this.bar = bar;
	}

}
