package 1;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class TestJobApplication extends Application<TestJobConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TestJobApplication().run(args);
    }

    @Override
    public String getName() {
        return "TestJob";
    }

    @Override
    public void initialize(final Bootstrap<TestJobConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TestJobConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
