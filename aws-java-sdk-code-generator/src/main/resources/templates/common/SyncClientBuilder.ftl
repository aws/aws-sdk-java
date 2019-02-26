${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsSyncClientBuilder;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain;
import com.amazonaws.endpointdiscovery.DefaultEndpointDiscoveryProviderChain;
import com.amazonaws.internal.config.InternalConfig;

/**
 * Fluent builder for {@link ${metadata.packageName + "." + metadata.syncInterface}}. Use of the
 * builder is preferred over using constructors of the client class.
**/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ${metadata.syncClientBuilderClassName}
    extends AwsSyncClientBuilder<${metadata.syncClientBuilderClassName}, ${metadata.syncInterface}> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ${clientConfigFactory}();

    <#if endpointOperation?has_content>
    private static final EndpointDiscoveryProviderChain DEFAULT_ENDPOINT_DISCOVERY_PROVIDER = new DefaultEndpointDiscoveryProviderChain();

    private boolean endpointDiscoveryEnabled = false;
    private boolean endpointDiscoveryDisabled = false;
    </#if>

    /**
    * @return Create new instance of builder with all defaults set.
    */
    public static ${metadata.syncClientBuilderClassName} standard() {
        return new ${metadata.syncClientBuilderClassName}();
    }

    /**
     * @return Default client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain}
     * and {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static ${metadata.syncInterface} defaultClient() {
        return standard().build();
    }

    private ${metadata.syncClientBuilderClassName}() {
        super(CLIENT_CONFIG_FACTORY);
    }

    <#if endpointOperation?has_content>
    public ${metadata.syncClientBuilderClassName} enableEndpointDiscovery() {
        this.endpointDiscoveryEnabled = true;
        return this;
    }

    public ${metadata.syncClientBuilderClassName} disableEndpointDiscovery() {
        this.endpointDiscoveryDisabled = true;
        return this;
    }

    private boolean endpointDiscoveryEnabled() {

        Boolean endpointDiscoveryChainSetting = DEFAULT_ENDPOINT_DISCOVERY_PROVIDER.endpointDiscoveryEnabled();

        if (endpointDiscoveryDisabled) {
            return false;
        }

        if (endpointDiscoveryEnabled) {
            return true;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting == false) {
            return false;
        }

        if (endpointDiscoveryChainSetting != null && endpointDiscoveryChainSetting) {
            return true;
        }

        if (InternalConfig.Factory.getInternalConfig().endpointDiscoveryEnabled()) {
            return true;
        }

        return false;
    }
    </#if>

    <#if AdditionalBuilderMethods?has_content>
        <@AdditionalBuilderMethods.content .data_model, metadata.syncClientBuilderClassName />
    </#if>

    /**
     * Construct a synchronous implementation of ${metadata.syncInterface} using the current builder configuration.
     *
     * @param params Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ${metadata.syncInterface}.
     */
    @Override
    protected ${metadata.syncInterface} build(AwsSyncClientParams params) {
        <#if endpointOperation?has_content>
        if (endpointDiscoveryEnabled() && getEndpoint() == null) {
            return new ${metadata.syncClient}(params, true);
        }
        </#if>
        return new ${metadata.syncClient}(params);
    }

}
