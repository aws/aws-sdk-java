${fileHeader}
package ${metadata.packageName};

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import ${metadata.packageName}.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing ${metadata.serviceName} asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can
 * be used to receive notification when an asynchronous operation completes.
<#if metadata.documentation??>
 * <p>
 * ${metadata.documentation}
</#if>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${metadata.asyncClient} extends ${metadata.syncClient}
        implements ${metadata.asyncInterface} {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

<#if customizationConfig.emitClientConstructors()>
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName}. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     * <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     * <li> Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI </li>
     * <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#defaultClient()}
     */
    @Deprecated
    public ${metadata.asyncClient}() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName}. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     * <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     * <li> Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI </li>
     * <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing a number of threads equal to the maximum number of concurrent
     * connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to ${metadata.serviceName}
     *            (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public ${metadata.asyncClient}(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(),
                clientConfiguration,
                newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withClientConfiguration(ClientConfiguration)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the provided AWS account credentials
     * provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing a number of threads equal to the maximum number of concurrent
     * connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     * @deprecated use {@link ${metadata.asyncClientBuilderClassName}#withCredentials(AWSCredentialsProvider)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withClientConfiguration(ClientConfiguration)}
     *             and {@link ${metadata.asyncClientBuilderClassName}#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public ${metadata.asyncClient}(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }
</#if>

    public static ${metadata.asyncClientBuilderClassName} asyncBuilder() {
        return ${metadata.asyncClientBuilderClassName}.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified parameters.
     *
     * @param asyncClientParams Object providing client parameters.
     */
    ${metadata.asyncClient}(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *             requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

  <#list operations?values as operationModel>
    <#if !customizationConfig.skipClientMethodForOperations?seq_contains("${operationModel.operationName}")>
        <@AsyncClientMethodForOperation.content operationModel />
        <@AsyncClientMethodForOperationWithSimpleForm.content operationModel />
    </#if>
  </#list>

  <#if AdditionalClientMethodsMacro?has_content>
    <@AdditionalClientMethodsMacro.content .data_model />
  </#if>

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
