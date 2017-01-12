${fileHeader}
<#assign packageName = metadata.packageName/>
<#assign clientName = metadata.syncClient/>
<#assign interfaceName = metadata.syncInterface/>
package ${metadata.smokeTestsPackageName};

import javax.annotation.Generated;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

import com.amazonaws.AmazonWebServiceClient;
import ${packageName}.${clientName};

/**
 * Injector that binds the AmazonWebServiceClient interface to the
 *  ${packageName}.${clientName}
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${interfaceName}ModuleInjector implements InjectorSource {

    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, new  ${interfaceName}Module());
    }

    static class  ${interfaceName}Module extends AbstractModule {

        @Override
        protected void configure() {
            bind(AmazonWebServiceClient.class).to(${clientName}.class);
        }
    }
}
