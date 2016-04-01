<@LicenseCommentBlockMacro.content />
<#assign serviceAbbreviation = (metadata.serviceAbbreviation)!metadata.serviceFullName/>
package ${metadata.packageName};

import org.w3c.dom.*;

<#if metadata.hasApiWithStreamInput>
import java.io.*;
</#if>
import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
<#if customizationConfig.serviceClientHoldInputStream>
import com.amazonaws.util.ServiceClientHolderInputStream;
</#if>


import ${metadata.packageName}.model.*;
import ${metadata.packageName}.model.transform.*;

<#assign documentation = (metadata.documentation)!""/>

/**
 * Client for accessing ${serviceAbbreviation}.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * ${documentation}
 */
 @ThreadSafe
public class ${metadata.syncClient} extends AmazonWebServiceClient implements ${metadata.syncInterface} {
<#if customizationConfig.requestMetrics?has_content>
    // register the service specific set of predefined metrics
    static {
        AwsSdkMetrics.addAll(Arrays.asList(${customizationConfig.requestMetrics}.values()));
    }
</#if>
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(${metadata.syncInterface}.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "${metadata.signingName}";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "${metadata.endpointPrefix}";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ${clientConfigFactory} configFactory = new ${clientConfigFactory}();

    /**
     * List of exception unmarshallers for all ${serviceAbbreviation} exceptions.
     */
<@ExceptionUnmarshallerListVariableDeclarationMacro.content />

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation}.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public ${metadata.syncClient}() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation}.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to ${serviceAbbreviation}
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public ${metadata.syncClient}(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public ${metadata.syncClient}(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to ${serviceAbbreviation}
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public ${metadata.syncClient}(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public ${metadata.syncClient}(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to ${serviceAbbreviation}
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public ${metadata.syncClient}(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to ${serviceAbbreviation}
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public ${metadata.syncClient}(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

<@ClientInitMethodMacro.content .data_model />

<#list operations?values as operationModel>
    <@ClientMethodForOperation.content metadata operationModel />
    <@ClientMethodForOperationWithSimpleForm.content operationModel />
</#list>

<#if AdditionalClientMethodsMacro?has_content>
    <@AdditionalClientMethodsMacro.content .data_model />
</#if>

<#assign responseMetadataClassName=customizationConfig.customResponseMetadataClassName!"ResponseMetadata" />
    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ${responseMetadataClassName} getCachedResponseMetadata(AmazonWebServiceRequest request) {
    <#if customizationConfig.customResponseMetadataClassName?has_content>
        ResponseMetadata metadata = client.getResponseMetadataForRequest(request);
        if (metadata != null)
            return new ${responseMetadataClassName}(metadata);
        else
            return null;
    <#else>
        return client.getResponseMetadataForRequest(request);
    </#if>
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        <@ClientInvokeMethodErrorResponseHandlerCreation.content metadata/>

        return client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
    }

}
