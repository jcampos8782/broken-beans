package foo;

import com.google.inject.AbstractModule;
import com.hubspot.dropwizard.guicier.GuiceBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SomeApplication extends Application<SomeConfiguration> {

	public static void main(final String... strings) throws Exception {
		new SomeApplication().run(strings);
	}

	@Override
	public void initialize(final Bootstrap<SomeConfiguration> bootstrap) {
		final GuiceBundle<SomeConfiguration> guiceBundle = GuiceBundle
				.defaultBuilder(SomeConfiguration.class)
				.modules(new AbstractModule() {

					@Override
					public void configure() {
						bind(SomeBean.class);
					}
				})
				.build();

		bootstrap.addBundle(guiceBundle);
	}

	@Override
	public void run(final SomeConfiguration configuration, final Environment environment) throws Exception {
		environment.jersey().register(SomeResource.class);
	}
}
