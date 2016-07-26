${fileHeader}
package ${metadata.packageName};

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsSyncClientBuilder;
import com.amazonaws.client.AwsSyncClientParams;

/**
 * Fluent builder for {@link ${metadata.packageName + "." + metadata.syncInterface}}. Use of the
 * builder is preferred over using constructors of the client class.
**/
@NotThreadSafe
public final class ${metadata.syncClientBuilderClassName}
    extends AwsSyncClientBuilder<${metadata.syncClientBuilderClassName}, ${metadata.syncInterface}> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ${clientConfigFactory}();

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

    /**
     * Construct a synchronous implementation of ${metadata.syncInterface} using the current builder configuration.
     *
     * @param params Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ${metadata.syncInterface}.
     */
    @Override
    protected ${metadata.syncInterface} build(AwsSyncClientParams params) {
        return new ${metadata.syncClient}(params);
    }

}
