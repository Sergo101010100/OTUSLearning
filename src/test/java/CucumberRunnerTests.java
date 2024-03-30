import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("ru.otus.qa.auto")
@ConfigurationParameters({
        @ConfigurationParameter(
                key = GLUE_PROPERTY_NAME,
                value = "ru.otus.qa.auto"
        ),
        @ConfigurationParameter(
                key = PLUGIN_PROPERTY_NAME,
                value = "org.jetbrains.plugins.cucumber.java.run.CucumberJvm5SMFormatter"
        ),
        @ConfigurationParameter(
                key = FEATURES_PROPERTY_NAME,
                value = "src/test/resources/ru.otus.qa.auto")
})
public class CucumberRunnerTests {
}
