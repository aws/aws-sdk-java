${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryProviderChain;
import com.amazonaws.endpointdiscovery.DefaultEndpointDiscoveryProviderChain;
import com.amazonaws.internal.config.InternalConfig;

/**
 * Fluent builder for {@link ${metadata.packageName + "." + metadata.asyncInterface}}. Use of the
 * builder is preferred over using constructors of the client class.
**/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ${metadata.asyncClientBuilderClassName}
    extends AwsAsyncClientBuilder<${metadata.asyncClientBuilderClassName}, ${metadata.asyncInterface}> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ${clientConfigFactory}();;

    <#if endpointOperation?has_content>
    private static final EndpointDiscoveryProviderChain DEFAULT_ENDPOINT_DISCOVERY_PROVIDER = new DefaultEndpointDiscoveryProviderChain();

    <#if endpointOperation.endpointCacheRequired == true>
    private boolean endpointDiscoveryEnabled = true;
    <#else>
    private boolean endpointDiscoveryEnabled = false;
    </#if>
    private boolean endpointDiscoveryDisabled = false;
    </#if>

    /**
    * @return Create new instance of builder with all defaults set.
    */
    public static ${metadata.asyncClientBuilderClassName} standard() {
        return new ${metadata.asyncClientBuilderClassName}();
    }

    /**
     * @return Default async client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain}
     * and {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static ${metadata.asyncInterface} defaultClient() {
        return standard().build();
    }

    private ${metadata.asyncClientBuilderClassName}() {
        super(CLIENT_CONFIG_FACTORY);
    }

    <#if endpointOperation?has_content>
    public ${metadata.asyncClientBuilderClassName} enableEndpointDiscovery() {
    this.endpointDiscoveryEnabled = true;
    return this;
    }

    public ${metadata.asyncClientBuilderClassName} disableEndpointDiscovery() {
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
        <@AdditionalBuilderMethods.content .data_model, metadata.asyncClientBuilderClassName />
    </#if>

    /**
     * Construct an asynchronous implementation of ${metadata.asyncInterface} using the
     * current builder configuration.
     *
     * @param params Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ${metadata.asyncInterface}.
     */
    @Override
    protected ${metadata.asyncInterface} build(AwsAsyncClientParams params) {
        <#if endpointOperation?has_content>
        if (endpointDiscoveryEnabled() && getEndpoint() == null) {
            return new ${metadata.asyncClient}(params, true);
        }
        </#if>
        return new ${metadata.asyncClient}(params);
    }

}
