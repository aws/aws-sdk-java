${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;

/**
 * Fluent builder for {@link ${metadata.packageName + "." + metadata.asyncInterface}}. Use of the
 * builder is preferred over using constructors of the client class.
**/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ${metadata.asyncClientBuilderClassName}
    extends AwsAsyncClientBuilder<${metadata.asyncClientBuilderClassName}, ${metadata.asyncInterface}> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ${clientConfigFactory}();;

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
        return new ${metadata.asyncClient}(params);
    }

}
