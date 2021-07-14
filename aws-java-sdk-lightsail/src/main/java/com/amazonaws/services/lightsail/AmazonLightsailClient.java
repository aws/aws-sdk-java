/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.lightsail.AmazonLightsailClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.services.lightsail.model.transform.*;

/**
 * Client for accessing Amazon Lightsail. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with Amazon Web Services (AWS) for developers who need to build
 * websites or web applications. It includes everything you need to launch your project quickly - instances (virtual
 * private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP
 * addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and
 * resource snapshots (backups) - for a low, predictable monthly price.
 * </p>
 * <p>
 * You can manage your Lightsail resources using the Lightsail console, Lightsail API, AWS Command Line Interface (AWS
 * CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Amazon Lightsail Developer Guide</a>.
 * </p>
 * <p>
 * This API Reference provides detailed information about the actions, data types, parameters, and errors of the
 * Lightsail service. For more information about the supported AWS Regions, endpoints, and service quotas of the
 * Lightsail service, see <a href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail
 * Endpoints and Quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLightsailClient extends AmazonWebServiceClient implements AmazonLightsail {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLightsail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lightsail";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthenticatedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.UnauthenticatedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountSetupInProgressException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.AccountSetupInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.OperationFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lightsail.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lightsail.model.AmazonLightsailException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonLightsailClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonLightsailClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonLightsailClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonLightsailClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonLightsailClientBuilder builder() {
        return AmazonLightsailClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLightsailClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLightsailClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lightsail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lightsail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lightsail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return Result of the AllocateStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeAllocateStaticIp(request);
    }

    @SdkInternalApi
    final AllocateStaticIpResult executeAllocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(allocateStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateStaticIpRequest> request = null;
        Response<AllocateStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(allocateStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllocateStaticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocateStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AllocateStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an SSL/TLS certificate to your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After the certificate is attached, your distribution accepts HTTPS traffic for all of the domains that are
     * associated with the certificate.
     * </p>
     * <p>
     * Use the <code>CreateCertificate</code> action to create a certificate that you can attach to your distribution.
     * </p>
     * <important>
     * <p>
     * Only certificates created in the <code>us-east-1</code> AWS Region can be attached to Lightsail distributions.
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </important>
     * 
     * @param attachCertificateToDistributionRequest
     * @return Result of the AttachCertificateToDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachCertificateToDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachCertificateToDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachCertificateToDistributionResult attachCertificateToDistribution(AttachCertificateToDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeAttachCertificateToDistribution(request);
    }

    @SdkInternalApi
    final AttachCertificateToDistributionResult executeAttachCertificateToDistribution(
            AttachCertificateToDistributionRequest attachCertificateToDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(attachCertificateToDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachCertificateToDistributionRequest> request = null;
        Response<AttachCertificateToDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachCertificateToDistributionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachCertificateToDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachCertificateToDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachCertificateToDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AttachCertificateToDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
     * specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @return Result of the AttachDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachDiskResult attachDisk(AttachDiskRequest request) {
        request = beforeClientExecution(request);
        return executeAttachDisk(request);
    }

    @SdkInternalApi
    final AttachDiskResult executeAttachDisk(AttachDiskRequest attachDiskRequest) {

        ExecutionContext executionContext = createExecutionContext(attachDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachDiskRequest> request = null;
        Response<AttachDiskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachDiskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachDiskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachDisk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachDiskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachDiskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @return Result of the AttachInstancesToLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachInstancesToLoadBalancerResult attachInstancesToLoadBalancer(AttachInstancesToLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeAttachInstancesToLoadBalancer(request);
    }

    @SdkInternalApi
    final AttachInstancesToLoadBalancerResult executeAttachInstancesToLoadBalancer(AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(attachInstancesToLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachInstancesToLoadBalancerRequest> request = null;
        Response<AttachInstancesToLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachInstancesToLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachInstancesToLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachInstancesToLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachInstancesToLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AttachInstancesToLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
     * version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
     * to rotate the certificates on your account. Use the <code>AttachLoadBalancerTlsCertificate</code> action with the
     * non-attached certificate, and it will replace the existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>AttachLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @return Result of the AttachLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachLoadBalancerTlsCertificateResult attachLoadBalancerTlsCertificate(AttachLoadBalancerTlsCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeAttachLoadBalancerTlsCertificate(request);
    }

    @SdkInternalApi
    final AttachLoadBalancerTlsCertificateResult executeAttachLoadBalancerTlsCertificate(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerTlsCertificateRequest> request = null;
        Response<AttachLoadBalancerTlsCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachLoadBalancerTlsCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachLoadBalancerTlsCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachLoadBalancerTlsCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachLoadBalancerTlsCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AttachLoadBalancerTlsCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return Result of the AttachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeAttachStaticIp(request);
    }

    @SdkInternalApi
    final AttachStaticIpResult executeAttachStaticIp(AttachStaticIpRequest attachStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(attachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachStaticIpRequest> request = null;
        Response<AttachStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachStaticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Closes ports for a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>CloseInstancePublicPorts</code> action supports tag-based access control via resource tags applied to
     * the resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return Result of the CloseInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CloseInstancePublicPortsResult closeInstancePublicPorts(CloseInstancePublicPortsRequest request) {
        request = beforeClientExecution(request);
        return executeCloseInstancePublicPorts(request);
    }

    @SdkInternalApi
    final CloseInstancePublicPortsResult executeCloseInstancePublicPorts(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest) {

        ExecutionContext executionContext = createExecutionContext(closeInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloseInstancePublicPortsRequest> request = null;
        Response<CloseInstancePublicPortsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloseInstancePublicPortsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(closeInstancePublicPortsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CloseInstancePublicPorts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CloseInstancePublicPortsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CloseInstancePublicPortsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an
     * instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of
     * an instance or a disk from one AWS Region to another in Amazon Lightsail.
     * </p>
     * <p>
     * When copying a <i>manual snapshot</i>, be sure to define the <code>source region</code>,
     * <code>source snapshot name</code>, and <code>target snapshot name</code> parameters.
     * </p>
     * <p>
     * When copying an <i>automatic snapshot</i>, be sure to define the <code>source region</code>,
     * <code>source resource name</code>, <code>target snapshot name</code>, and either the <code>restore date</code> or
     * the <code>use latest restorable auto snapshot</code> parameters.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopySnapshotResult copySnapshot(CopySnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopySnapshot(request);
    }

    @SdkInternalApi
    final CopySnapshotResult executeCopySnapshot(CopySnapshotRequest copySnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<CopySnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copySnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopySnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopySnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopySnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Lightsail bucket.
     * </p>
     * <p>
     * A bucket is a cloud storage resource available in the Lightsail object storage service. Use buckets to store
     * objects such as data and its descriptive metadata. For more information about buckets, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/buckets-in-amazon-lightsail">Buckets in Amazon
     * Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param createBucketRequest
     * @return Result of the CreateBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBucketResult createBucket(CreateBucketRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBucket(request);
    }

    @SdkInternalApi
    final CreateBucketResult executeCreateBucket(CreateBucketRequest createBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(createBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBucketRequest> request = null;
        Response<CreateBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBucketRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBucketResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new access key for the specified Amazon Lightsail bucket. Access keys consist of an access key ID and
     * corresponding secret access key.
     * </p>
     * <p>
     * Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two
     * access keys per bucket. Use the <a>GetBucketAccessKeys</a> action to get a list of current access keys for a
     * specific bucket. For more information about access keys, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys"
     * >Creating access keys for a bucket in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * The <code>secretAccessKey</code> value is returned only in response to the <code>CreateBucketAccessKey</code>
     * action. You can get a secret access key only when you first create an access key; you cannot get the secret
     * access key later. If you lose the secret access key, you must create a new access key.
     * </p>
     * </important>
     * 
     * @param createBucketAccessKeyRequest
     * @return Result of the CreateBucketAccessKey operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBucketAccessKeyResult createBucketAccessKey(CreateBucketAccessKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBucketAccessKey(request);
    }

    @SdkInternalApi
    final CreateBucketAccessKeyResult executeCreateBucketAccessKey(CreateBucketAccessKeyRequest createBucketAccessKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createBucketAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBucketAccessKeyRequest> request = null;
        Response<CreateBucketAccessKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBucketAccessKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBucketAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBucketAccessKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBucketAccessKeyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateBucketAccessKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an SSL/TLS certificate for an Amazon Lightsail content delivery network (CDN) distribution and a
     * container service.
     * </p>
     * <p>
     * After the certificate is valid, use the <code>AttachCertificateToDistribution</code> action to use the
     * certificate and its domains with your distribution. Or use the <code>UpdateContainerService</code> action to use
     * the certificate and its domains with your container service.
     * </p>
     * <important>
     * <p>
     * Only certificates created in the <code>us-east-1</code> AWS Region can be attached to Lightsail distributions.
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </important>
     * 
     * @param createCertificateRequest
     * @return Result of the CreateCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCertificateResult createCertificate(CreateCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCertificate(request);
    }

    @SdkInternalApi
    final CreateCertificateResult executeCreateCertificate(CreateCertificateRequest createCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(createCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateRequest> request = null;
        Response<CreateCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
     * snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
     * CloudFormation stack created. Use the <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running the
     * <code>create cloud formation stack</code> operation again with the same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @return Result of the CreateCloudFormationStack operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCloudFormationStackResult createCloudFormationStack(CreateCloudFormationStackRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCloudFormationStack(request);
    }

    @SdkInternalApi
    final CreateCloudFormationStackResult executeCreateCloudFormationStack(CreateCloudFormationStackRequest createCloudFormationStackRequest) {

        ExecutionContext executionContext = createExecutionContext(createCloudFormationStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFormationStackRequest> request = null;
        Response<CreateCloudFormationStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCloudFormationStackRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCloudFormationStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCloudFormationStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCloudFormationStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCloudFormationStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an email or SMS text message contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param createContactMethodRequest
     * @return Result of the CreateContactMethod operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateContactMethodResult createContactMethod(CreateContactMethodRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContactMethod(request);
    }

    @SdkInternalApi
    final CreateContactMethodResult executeCreateContactMethod(CreateContactMethodRequest createContactMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactMethodRequest> request = null;
        Response<CreateContactMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContactMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Lightsail container service.
     * </p>
     * <p>
     * A Lightsail container service is a compute resource to which you can deploy containers. For more information, see
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-services">Container
     * services in Amazon Lightsail</a> in the <i>Lightsail Dev Guide</i>.
     * </p>
     * 
     * @param createContainerServiceRequest
     * @return Result of the CreateContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateContainerServiceResult createContainerService(CreateContainerServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContainerService(request);
    }

    @SdkInternalApi
    final CreateContainerServiceResult executeCreateContainerService(CreateContainerServiceRequest createContainerServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createContainerServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContainerServiceRequest> request = null;
        Response<CreateContainerServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContainerServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContainerServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContainerService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContainerServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateContainerServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a deployment for your Amazon Lightsail container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     * <p>
     * You can deploy containers to your container service using container images from a public registry like Docker
     * Hub, or from your local machine. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-container-images"
     * >Creating container images for your Amazon Lightsail container services</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @param createContainerServiceDeploymentRequest
     * @return Result of the CreateContainerServiceDeployment operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerServiceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateContainerServiceDeploymentResult createContainerServiceDeployment(CreateContainerServiceDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContainerServiceDeployment(request);
    }

    @SdkInternalApi
    final CreateContainerServiceDeploymentResult executeCreateContainerServiceDeployment(
            CreateContainerServiceDeploymentRequest createContainerServiceDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createContainerServiceDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContainerServiceDeploymentRequest> request = null;
        Response<CreateContainerServiceDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContainerServiceDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createContainerServiceDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContainerServiceDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContainerServiceDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateContainerServiceDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a temporary set of log in credentials that you can use to log in to the Docker process on your local
     * machine. After you're logged in, you can use the native Docker commands to push your local container images to
     * the container image registry of your Amazon Lightsail account so that you can use them with your Lightsail
     * container service. The log in credentials expire 12 hours after they are created, at which point you will need to
     * create a new set of log in credentials.
     * </p>
     * <note>
     * <p>
     * You can only push container images to the container service registry of your Lightsail account. You cannot pull
     * container images or perform any other container image management actions on the container service registry.
     * </p>
     * </note>
     * <p>
     * After you push your container images to the container image registry of your Lightsail account, use the
     * <code>RegisterContainerImage</code> action to register the pushed images to a specific Lightsail container
     * service.
     * </p>
     * <note>
     * <p>
     * This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container
     * images to your Lightsail container service. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-pushing-container-images">Pushing
     * and managing container images on your Amazon Lightsail container services</a> in the <i>Amazon Lightsail
     * Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createContainerServiceRegistryLoginRequest
     * @return Result of the CreateContainerServiceRegistryLogin operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerServiceRegistryLogin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceRegistryLogin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateContainerServiceRegistryLoginResult createContainerServiceRegistryLogin(CreateContainerServiceRegistryLoginRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContainerServiceRegistryLogin(request);
    }

    @SdkInternalApi
    final CreateContainerServiceRegistryLoginResult executeCreateContainerServiceRegistryLogin(
            CreateContainerServiceRegistryLoginRequest createContainerServiceRegistryLoginRequest) {

        ExecutionContext executionContext = createExecutionContext(createContainerServiceRegistryLoginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContainerServiceRegistryLoginRequest> request = null;
        Response<CreateContainerServiceRegistryLoginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContainerServiceRegistryLoginRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createContainerServiceRegistryLoginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContainerServiceRegistryLogin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContainerServiceRegistryLoginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateContainerServiceRegistryLoginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone
     * (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control via request tags. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @return Result of the CreateDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDiskResult createDisk(CreateDiskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDisk(request);
    }

    @SdkInternalApi
    final CreateDiskResult executeCreateDisk(CreateDiskRequest createDiskRequest) {

        ExecutionContext executionContext = createExecutionContext(createDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskRequest> request = null;
        Response<CreateDiskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDiskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDisk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDiskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDiskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to
     * an Amazon Lightsail instance in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by <code>disk snapshot name</code>. For more information, see
     * the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @return Result of the CreateDiskFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDiskFromSnapshotResult createDiskFromSnapshot(CreateDiskFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDiskFromSnapshot(request);
    }

    @SdkInternalApi
    final CreateDiskFromSnapshotResult executeCreateDiskFromSnapshot(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createDiskFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskFromSnapshotRequest> request = null;
        Response<CreateDiskFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDiskFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDiskFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDiskFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDiskFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
     * save data before shutting down a Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
     * written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
     * by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
     * snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
     * should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
     * remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
     * snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
     * for example, to recover data from the system volume of a botched instance or to create a backup of the system
     * volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
     * <code>instance name</code> parameter when issuing the snapshot command, and a snapshot of the defined instance's
     * system volume will be created. After the snapshot is available, you can create a block storage disk from the
     * snapshot and attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @return Result of the CreateDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDiskSnapshotResult createDiskSnapshot(CreateDiskSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDiskSnapshot(request);
    }

    @SdkInternalApi
    final CreateDiskSnapshotResult executeCreateDiskSnapshot(CreateDiskSnapshotRequest createDiskSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiskSnapshotRequest> request = null;
        Response<CreateDiskSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiskSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDiskSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDiskSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDiskSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDiskSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * A distribution is a globally distributed network of caching servers that improve the performance of your website
     * or web application hosted on a Lightsail instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-content-delivery-network-distributions"
     * >Content delivery networks in Amazon Lightsail</a>.
     * </p>
     * 
     * @param createDistributionRequest
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDistributionResult createDistribution(CreateDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDistribution(request);
    }

    @SdkInternalApi
    final CreateDistributionResult executeCreateDistribution(CreateDistributionRequest createDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionRequest> request = null;
        Response<CreateDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDistributionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one of the following domain name system (DNS) records in a domain DNS zone: Address (A), canonical name
     * (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return Result of the CreateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomainEntry(request);
    }

    @SdkInternalApi
    final CreateDomainEntryResult executeCreateDomainEntry(CreateDomainEntryRequest createDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainEntryRequest> request = null;
        Response<CreateDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomainEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return Result of the CreateInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceSnapshot(request);
    }

    @SdkInternalApi
    final CreateInstanceSnapshotResult executeCreateInstanceSnapshot(CreateInstanceSnapshotRequest createInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceSnapshotRequest> request = null;
        Response<CreateInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstanceSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more Amazon Lightsail instances.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return Result of the CreateInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstancesResult createInstances(CreateInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstances(request);
    }

    @SdkInternalApi
    final CreateInstancesResult executeCreateInstances(CreateInstancesRequest createInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesRequest> request = null;
        Response<CreateInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more new instances from a manual or automatic snapshot of an instance.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by <code>instance snapshot name</code>. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return Result of the CreateInstancesFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstancesFromSnapshotResult createInstancesFromSnapshot(CreateInstancesFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstancesFromSnapshot(request);
    }

    @SdkInternalApi
    final CreateInstancesFromSnapshotResult executeCreateInstancesFromSnapshot(CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstancesFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesFromSnapshotRequest> request = null;
        Response<CreateInstancesFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInstancesFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstancesFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstancesFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInstancesFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return Result of the CreateKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKeyPair(request);
    }

    @SdkInternalApi
    final CreateKeyPairResult executeCreateKeyPair(CreateKeyPairRequest createKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyPairRequest> request = null;
        Response<CreateKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/configure-lightsail-instances-for-load-balancing">
     * Configure your Lightsail instances for load balancing</a>. You can create up to 5 load balancers per AWS Region
     * in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port settings. To change additional load
     * balancer settings, use the <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return Result of the CreateLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoadBalancer(request);
    }

    @SdkInternalApi
    final CreateLoadBalancerResult executeCreateLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerRequest> request = null;
        Response<CreateLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an SSL/TLS certificate for an Amazon Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>CreateLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @return Result of the CreateLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLoadBalancerTlsCertificateResult createLoadBalancerTlsCertificate(CreateLoadBalancerTlsCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoadBalancerTlsCertificate(request);
    }

    @SdkInternalApi
    final CreateLoadBalancerTlsCertificateResult executeCreateLoadBalancerTlsCertificate(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerTlsCertificateRequest> request = null;
        Response<CreateLoadBalancerTlsCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerTlsCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLoadBalancerTlsCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoadBalancerTlsCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLoadBalancerTlsCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLoadBalancerTlsCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based access control via request tags. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @return Result of the CreateRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRelationalDatabaseResult createRelationalDatabase(CreateRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRelationalDatabase(request);
    }

    @SdkInternalApi
    final CreateRelationalDatabaseResult executeCreateRelationalDatabase(CreateRelationalDatabaseRequest createRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseRequest> request = null;
        Response<CreateRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong with your original database, or to
     * change it to a different plan, such as a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation supports tag-based access control via request
     * tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @return Result of the CreateRelationalDatabaseFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRelationalDatabaseFromSnapshot(request);
    }

    @SdkInternalApi
    final CreateRelationalDatabaseFromSnapshotResult executeCreateRelationalDatabaseFromSnapshot(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseFromSnapshotRequest> request = null;
        Response<CreateRelationalDatabaseFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRelationalDatabaseFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRelationalDatabaseFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRelationalDatabaseFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRelationalDatabaseFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
     * database, and to save data before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports tag-based access control via request
     * tags. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @return Result of the CreateRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRelationalDatabaseSnapshotResult createRelationalDatabaseSnapshot(CreateRelationalDatabaseSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRelationalDatabaseSnapshot(request);
    }

    @SdkInternalApi
    final CreateRelationalDatabaseSnapshotResult executeCreateRelationalDatabaseSnapshot(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelationalDatabaseSnapshotRequest> request = null;
        Response<CreateRelationalDatabaseSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelationalDatabaseSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRelationalDatabaseSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRelationalDatabaseSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRelationalDatabaseSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRelationalDatabaseSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteAlarmRequest
     * @return Result of the DeleteAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.DeleteAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlarm(request);
    }

    @SdkInternalApi
    final DeleteAlarmResult executeDeleteAlarm(DeleteAlarmRequest deleteAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlarmRequest> request = null;
        Response<DeleteAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAlarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @return Result of the DeleteAutoSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteAutoSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAutoSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAutoSnapshotResult deleteAutoSnapshot(DeleteAutoSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAutoSnapshot(request);
    }

    @SdkInternalApi
    final DeleteAutoSnapshotResult executeDeleteAutoSnapshot(DeleteAutoSnapshotRequest deleteAutoSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAutoSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutoSnapshotRequest> request = null;
        Response<DeleteAutoSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAutoSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAutoSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAutoSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAutoSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAutoSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Amazon Lightsail bucket.
     * </p>
     * <note>
     * <p>
     * When you delete your bucket, the bucket name is released and can be reused for a new bucket in your account or
     * another AWS account.
     * </p>
     * </note>
     * 
     * @param deleteBucketRequest
     * @return Result of the DeleteBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBucketResult deleteBucket(DeleteBucketRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucket(request);
    }

    @SdkInternalApi
    final DeleteBucketResult executeDeleteBucket(DeleteBucketRequest deleteBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketRequest> request = null;
        Response<DeleteBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBucketRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBucketResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an access key for the specified Amazon Lightsail bucket.
     * </p>
     * <p>
     * We recommend that you delete an access key if the secret access key is compromised.
     * </p>
     * <p>
     * For more information about access keys, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys"
     * >Creating access keys for a bucket in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param deleteBucketAccessKeyRequest
     * @return Result of the DeleteBucketAccessKey operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBucketAccessKeyResult deleteBucketAccessKey(DeleteBucketAccessKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketAccessKey(request);
    }

    @SdkInternalApi
    final DeleteBucketAccessKeyResult executeDeleteBucketAccessKey(DeleteBucketAccessKeyRequest deleteBucketAccessKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketAccessKeyRequest> request = null;
        Response<DeleteBucketAccessKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBucketAccessKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBucketAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketAccessKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBucketAccessKeyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteBucketAccessKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an SSL/TLS certificate for your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Certificates that are currently attached to a distribution cannot be deleted. Use the
     * <code>DetachCertificateFromDistribution</code> action to detach a certificate from a distribution.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCertificate(request);
    }

    @SdkInternalApi
    final DeleteCertificateResult executeDeleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteContactMethodRequest
     * @return Result of the DeleteContactMethod operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.DeleteContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteContactMethodResult deleteContactMethod(DeleteContactMethodRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContactMethod(request);
    }

    @SdkInternalApi
    final DeleteContactMethodResult executeDeleteContactMethod(DeleteContactMethodRequest deleteContactMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactMethodRequest> request = null;
        Response<DeleteContactMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContactMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a container image that is registered to your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerImageRequest
     * @return Result of the DeleteContainerImage operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteContainerImageResult deleteContainerImage(DeleteContainerImageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContainerImage(request);
    }

    @SdkInternalApi
    final DeleteContainerImageResult executeDeleteContainerImage(DeleteContainerImageRequest deleteContainerImageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContainerImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContainerImageRequest> request = null;
        Response<DeleteContainerImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContainerImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContainerImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContainerImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContainerImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContainerImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerServiceRequest
     * @return Result of the DeleteContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteContainerServiceResult deleteContainerService(DeleteContainerServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContainerService(request);
    }

    @SdkInternalApi
    final DeleteContainerServiceResult executeDeleteContainerService(DeleteContainerServiceRequest deleteContainerServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContainerServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContainerServiceRequest> request = null;
        Response<DeleteContainerServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContainerServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContainerServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContainerService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContainerServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteContainerServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the <code>available</code> state (not attached to a
     * Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @return Result of the DeleteDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDiskResult deleteDisk(DeleteDiskRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDisk(request);
    }

    @SdkInternalApi
    final DeleteDiskResult executeDeleteDisk(DeleteDiskRequest deleteDiskRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiskRequest> request = null;
        Response<DeleteDiskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDiskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDisk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDiskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDiskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
     * have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
     * not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by <code>disk snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @return Result of the DeleteDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDiskSnapshotResult deleteDiskSnapshot(DeleteDiskSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDiskSnapshot(request);
    }

    @SdkInternalApi
    final DeleteDiskSnapshotResult executeDeleteDiskSnapshot(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiskSnapshotRequest> request = null;
        Response<DeleteDiskSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiskSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDiskSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDiskSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDiskSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDiskSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDistributionResult deleteDistribution(DeleteDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDistribution(request);
    }

    @SdkInternalApi
    final DeleteDistributionResult executeDeleteDistribution(DeleteDistributionRequest deleteDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDistributionRequest> request = null;
        Response<DeleteDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDistributionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return Result of the DeleteDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainEntry(request);
    }

    @SdkInternalApi
    final DeleteDomainEntryResult executeDeleteDomainEntry(DeleteDomainEntryRequest deleteDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainEntryRequest> request = null;
        Response<DeleteDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomainEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstance(request);
    }

    @SdkInternalApi
    final DeleteInstanceResult executeDeleteInstance(DeleteInstanceRequest deleteInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<DeleteInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by <code>instance snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return Result of the DeleteInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInstanceSnapshotResult deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceSnapshot(request);
    }

    @SdkInternalApi
    final DeleteInstanceSnapshotResult executeDeleteInstanceSnapshot(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceSnapshotRequest> request = null;
        Response<DeleteInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>key pair name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKeyPair(request);
    }

    @SdkInternalApi
    final DeleteKeyPairResult executeDeleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyPairRequest> request = null;
        Response<DeleteKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
     * authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
     * instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
     * with the new host key or certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @return Result of the DeleteKnownHostKeys operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteKnownHostKeysResult deleteKnownHostKeys(DeleteKnownHostKeysRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKnownHostKeys(request);
    }

    @SdkInternalApi
    final DeleteKnownHostKeysResult executeDeleteKnownHostKeys(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKnownHostKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKnownHostKeysRequest> request = null;
        Response<DeleteKnownHostKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKnownHostKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKnownHostKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKnownHostKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKnownHostKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKnownHostKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
     * you will need to create a new load balancer, create a new certificate, and verify domain ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return Result of the DeleteLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoadBalancer(request);
    }

    @SdkInternalApi
    final DeleteLoadBalancerResult executeDeleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerRequest> request = null;
        Response<DeleteLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>DeleteLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @return Result of the DeleteLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoadBalancerTlsCertificateResult deleteLoadBalancerTlsCertificate(DeleteLoadBalancerTlsCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoadBalancerTlsCertificate(request);
    }

    @SdkInternalApi
    final DeleteLoadBalancerTlsCertificateResult executeDeleteLoadBalancerTlsCertificate(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerTlsCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerTlsCertificateRequest> request = null;
        Response<DeleteLoadBalancerTlsCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerTlsCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLoadBalancerTlsCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoadBalancerTlsCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLoadBalancerTlsCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLoadBalancerTlsCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @return Result of the DeleteRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRelationalDatabaseResult deleteRelationalDatabase(DeleteRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRelationalDatabase(request);
    }

    @SdkInternalApi
    final DeleteRelationalDatabaseResult executeDeleteRelationalDatabase(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRelationalDatabaseRequest> request = null;
        Response<DeleteRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @return Result of the DeleteRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRelationalDatabaseSnapshotResult deleteRelationalDatabaseSnapshot(DeleteRelationalDatabaseSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRelationalDatabaseSnapshot(request);
    }

    @SdkInternalApi
    final DeleteRelationalDatabaseSnapshotResult executeDeleteRelationalDatabaseSnapshot(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRelationalDatabaseSnapshotRequest> request = null;
        Response<DeleteRelationalDatabaseSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRelationalDatabaseSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRelationalDatabaseSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRelationalDatabaseSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRelationalDatabaseSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRelationalDatabaseSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches an SSL/TLS certificate from your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After the certificate is detached, your distribution stops accepting traffic for all of the domains that are
     * associated with the certificate.
     * </p>
     * 
     * @param detachCertificateFromDistributionRequest
     * @return Result of the DetachCertificateFromDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachCertificateFromDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachCertificateFromDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachCertificateFromDistributionResult detachCertificateFromDistribution(DetachCertificateFromDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeDetachCertificateFromDistribution(request);
    }

    @SdkInternalApi
    final DetachCertificateFromDistributionResult executeDetachCertificateFromDistribution(
            DetachCertificateFromDistributionRequest detachCertificateFromDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(detachCertificateFromDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachCertificateFromDistributionRequest> request = null;
        Response<DetachCertificateFromDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachCertificateFromDistributionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detachCertificateFromDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachCertificateFromDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachCertificateFromDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetachCertificateFromDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
     * device within your operating system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @return Result of the DetachDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachDiskResult detachDisk(DetachDiskRequest request) {
        request = beforeClientExecution(request);
        return executeDetachDisk(request);
    }

    @SdkInternalApi
    final DetachDiskResult executeDetachDisk(DetachDiskRequest detachDiskRequest) {

        ExecutionContext executionContext = createExecutionContext(detachDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachDiskRequest> request = null;
        Response<DetachDiskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachDiskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachDiskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachDisk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachDiskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachDiskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags">Amazon
     * Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @return Result of the DetachInstancesFromLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachInstancesFromLoadBalancerResult detachInstancesFromLoadBalancer(DetachInstancesFromLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDetachInstancesFromLoadBalancer(request);
    }

    @SdkInternalApi
    final DetachInstancesFromLoadBalancerResult executeDetachInstancesFromLoadBalancer(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(detachInstancesFromLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachInstancesFromLoadBalancerRequest> request = null;
        Response<DetachInstancesFromLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachInstancesFromLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detachInstancesFromLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachInstancesFromLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachInstancesFromLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetachInstancesFromLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return Result of the DetachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachStaticIpResult detachStaticIp(DetachStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeDetachStaticIp(request);
    }

    @SdkInternalApi
    final DetachStaticIpResult executeDetachStaticIp(DetachStaticIpRequest detachStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(detachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachStaticIpRequest> request = null;
        Response<DetachStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachStaticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @return Result of the DisableAddOn operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DisableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DisableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableAddOnResult disableAddOn(DisableAddOnRequest request) {
        request = beforeClientExecution(request);
        return executeDisableAddOn(request);
    }

    @SdkInternalApi
    final DisableAddOnResult executeDisableAddOn(DisableAddOnRequest disableAddOnRequest) {

        ExecutionContext executionContext = createExecutionContext(disableAddOnRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAddOnRequest> request = null;
        Response<DisableAddOnResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAddOnRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableAddOnRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableAddOn");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableAddOnResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableAddOnResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return Result of the DownloadDefaultKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeDownloadDefaultKeyPair(request);
    }

    @SdkInternalApi
    final DownloadDefaultKeyPairResult executeDownloadDefaultKeyPair(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(downloadDefaultKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DownloadDefaultKeyPairRequest> request = null;
        Response<DownloadDefaultKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DownloadDefaultKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(downloadDefaultKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DownloadDefaultKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DownloadDefaultKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DownloadDefaultKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @return Result of the EnableAddOn operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.EnableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EnableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableAddOnResult enableAddOn(EnableAddOnRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAddOn(request);
    }

    @SdkInternalApi
    final EnableAddOnResult executeEnableAddOn(EnableAddOnRequest enableAddOnRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAddOnRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAddOnRequest> request = null;
        Response<EnableAddOnResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAddOnRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableAddOnRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAddOn");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableAddOnResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableAddOnResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
     * This operation results in an export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
     * appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
     * Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
     * Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>source snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or <code>get disk snapshots</code> operations to get a list of
     * snapshots that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @return Result of the ExportSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportSnapshotResult exportSnapshot(ExportSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeExportSnapshot(request);
    }

    @SdkInternalApi
    final ExportSnapshotResult executeExportSnapshot(ExportSnapshotRequest exportSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(exportSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportSnapshotRequest> request = null;
        Response<ExportSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return Result of the GetActiveNames operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetActiveNamesResult getActiveNames(GetActiveNamesRequest request) {
        request = beforeClientExecution(request);
        return executeGetActiveNames(request);
    }

    @SdkInternalApi
    final GetActiveNamesResult executeGetActiveNames(GetActiveNamesRequest getActiveNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(getActiveNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActiveNamesRequest> request = null;
        Response<GetActiveNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActiveNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getActiveNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetActiveNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetActiveNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetActiveNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the configured alarms. Specify an alarm name in your request to return information
     * about a specific alarm, or specify a monitored resource name to return information about all alarms for a
     * specific resource.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getAlarmsRequest
     * @return Result of the GetAlarms operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.GetAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAlarmsResult getAlarms(GetAlarmsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAlarms(request);
    }

    @SdkInternalApi
    final GetAlarmsResult executeGetAlarms(GetAlarmsRequest getAlarmsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAlarmsRequest> request = null;
        Response<GetAlarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAlarmsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAlarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAlarms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAlarmsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAlarmsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @return Result of the GetAutoSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetAutoSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAutoSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAutoSnapshotsResult getAutoSnapshots(GetAutoSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAutoSnapshots(request);
    }

    @SdkInternalApi
    final GetAutoSnapshotsResult executeGetAutoSnapshots(GetAutoSnapshotsRequest getAutoSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAutoSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutoSnapshotsRequest> request = null;
        Response<GetAutoSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutoSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAutoSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAutoSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAutoSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAutoSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * instance already running a specific operating system, as well as a preinstalled app or development stack. The
     * software each instance is running depends on the blueprint image you choose.
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with
     * existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when
     * they become outdated due to operating system updates or new application releases.
     * </p>
     * </note>
     * 
     * @param getBlueprintsRequest
     * @return Result of the GetBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBlueprintsResult getBlueprints(GetBlueprintsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBlueprints(request);
    }

    @SdkInternalApi
    final GetBlueprintsResult executeGetBlueprints(GetBlueprintsRequest getBlueprintsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlueprintsRequest> request = null;
        Response<GetBlueprintsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlueprintsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBlueprintsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBlueprints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBlueprintsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBlueprintsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the existing access key IDs for the specified Amazon Lightsail bucket.
     * </p>
     * <important>
     * <p>
     * This action does not return the secret access key value of an access key. You can get a secret access key only
     * when you create it from the response of the <a>CreateBucketAccessKey</a> action. If you lose the secret access
     * key, you must create a new access key.
     * </p>
     * </important>
     * 
     * @param getBucketAccessKeysRequest
     * @return Result of the GetBucketAccessKeys operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketAccessKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketAccessKeys" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBucketAccessKeysResult getBucketAccessKeys(GetBucketAccessKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketAccessKeys(request);
    }

    @SdkInternalApi
    final GetBucketAccessKeysResult executeGetBucketAccessKeys(GetBucketAccessKeysRequest getBucketAccessKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketAccessKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketAccessKeysRequest> request = null;
        Response<GetBucketAccessKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketAccessKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBucketAccessKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketAccessKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBucketAccessKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBucketAccessKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the bundles that you can apply to a Amazon Lightsail bucket.
     * </p>
     * <p>
     * The bucket bundle specifies the monthly cost, storage quota, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to update the bundle for a bucket.
     * </p>
     * 
     * @param getBucketBundlesRequest
     * @return Result of the GetBucketBundles operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketBundles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketBundlesResult getBucketBundles(GetBucketBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketBundles(request);
    }

    @SdkInternalApi
    final GetBucketBundlesResult executeGetBucketBundles(GetBucketBundlesRequest getBucketBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketBundlesRequest> request = null;
        Response<GetBucketBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBucketBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBucketBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBucketBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points of a specific metric for an Amazon Lightsail bucket.
     * </p>
     * <p>
     * Metrics report the utilization of a bucket. View and collect metric data regularly to monitor the number of
     * objects stored in a bucket (including object versions) and the storage space used by those objects.
     * </p>
     * 
     * @param getBucketMetricDataRequest
     * @return Result of the GetBucketMetricData operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBucketMetricDataResult getBucketMetricData(GetBucketMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketMetricData(request);
    }

    @SdkInternalApi
    final GetBucketMetricDataResult executeGetBucketMetricData(GetBucketMetricDataRequest getBucketMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketMetricDataRequest> request = null;
        Response<GetBucketMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBucketMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBucketMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBucketMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more Amazon Lightsail buckets.
     * </p>
     * <p>
     * For more information about buckets, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/buckets-in-amazon-lightsail">Buckets in Amazon
     * Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>..
     * </p>
     * 
     * @param getBucketsRequest
     * @return Result of the GetBuckets operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketsResult getBuckets(GetBucketsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBuckets(request);
    }

    @SdkInternalApi
    final GetBucketsResult executeGetBuckets(GetBucketsRequest getBucketsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketsRequest> request = null;
        Response<GetBucketsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBucketsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBuckets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBucketsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBucketsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return Result of the GetBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBundlesResult getBundles(GetBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeGetBundles(request);
    }

    @SdkInternalApi
    final GetBundlesResult executeGetBundles(GetBundlesRequest getBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(getBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBundlesRequest> request = null;
        Response<GetBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBundlesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more Amazon Lightsail SSL/TLS certificates.
     * </p>
     * <note>
     * <p>
     * To get a summary of a certificate, ommit <code>includeCertificateDetails</code> from your request. The response
     * will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags.
     * </p>
     * </note>
     * 
     * @param getCertificatesRequest
     * @return Result of the GetCertificates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCertificatesResult getCertificates(GetCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetCertificates(request);
    }

    @SdkInternalApi
    final GetCertificatesResult executeGetCertificates(GetCertificatesRequest getCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificatesRequest> request = null;
        Response<GetCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the <code>create cloud formation stack</code>
     * operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @return Result of the GetCloudFormationStackRecords operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCloudFormationStackRecordsResult getCloudFormationStackRecords(GetCloudFormationStackRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCloudFormationStackRecords(request);
    }

    @SdkInternalApi
    final GetCloudFormationStackRecordsResult executeGetCloudFormationStackRecords(GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCloudFormationStackRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFormationStackRecordsRequest> request = null;
        Response<GetCloudFormationStackRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCloudFormationStackRecordsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCloudFormationStackRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCloudFormationStackRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCloudFormationStackRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCloudFormationStackRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the configured contact methods. Specify a protocol in your request to return
     * information about a specific contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param getContactMethodsRequest
     * @return Result of the GetContactMethods operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContactMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContactMethods" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactMethodsResult getContactMethods(GetContactMethodsRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactMethods(request);
    }

    @SdkInternalApi
    final GetContactMethodsResult executeGetContactMethods(GetContactMethodsRequest getContactMethodsRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactMethodsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactMethodsRequest> request = null;
        Response<GetContactMethodsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactMethodsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactMethodsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactMethods");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactMethodsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactMethodsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control
     * (lightsailctl) plugin.
     * </p>
     * 
     * @param getContainerAPIMetadataRequest
     * @return Result of the GetContainerAPIMetadata operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerAPIMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerAPIMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContainerAPIMetadataResult getContainerAPIMetadata(GetContainerAPIMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerAPIMetadata(request);
    }

    @SdkInternalApi
    final GetContainerAPIMetadataResult executeGetContainerAPIMetadata(GetContainerAPIMetadataRequest getContainerAPIMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerAPIMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerAPIMetadataRequest> request = null;
        Response<GetContainerAPIMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerAPIMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getContainerAPIMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerAPIMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerAPIMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetContainerAPIMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the container images that are registered to your Amazon Lightsail container service.
     * </p>
     * <note>
     * <p>
     * If you created a deployment on your Lightsail container service that uses container images from a public registry
     * like Docker Hub, those images are not returned as part of this action. Those images are not registered to your
     * Lightsail container service.
     * </p>
     * </note>
     * 
     * @param getContainerImagesRequest
     * @return Result of the GetContainerImages operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerImages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContainerImagesResult getContainerImages(GetContainerImagesRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerImages(request);
    }

    @SdkInternalApi
    final GetContainerImagesResult executeGetContainerImages(GetContainerImagesRequest getContainerImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerImagesRequest> request = null;
        Response<GetContainerImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContainerImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContainerImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the log events of a container of your Amazon Lightsail container service.
     * </p>
     * <p>
     * If your container service has more than one node (i.e., a scale greater than 1), then the log events that are
     * returned for the specified container are merged from all nodes on your container service.
     * </p>
     * <note>
     * <p>
     * Container logs are retained for a certain amount of time. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail endpoints and quotas</a> in
     * the <i>AWS General Reference</i>.
     * </p>
     * </note>
     * 
     * @param getContainerLogRequest
     * @return Result of the GetContainerLog operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerLog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetContainerLogResult getContainerLog(GetContainerLogRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerLog(request);
    }

    @SdkInternalApi
    final GetContainerLogResult executeGetContainerLog(GetContainerLogRequest getContainerLogRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerLogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerLogRequest> request = null;
        Response<GetContainerLogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerLogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContainerLogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerLog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerLogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContainerLogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the deployments for your Amazon Lightsail container service
     * </p>
     * <p>
     * A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to
     * your container service.
     * </p>
     * <p>
     * The deployments are ordered by version in ascending order. The newest version is listed at the top of the
     * response.
     * </p>
     * <note>
     * <p>
     * A set number of deployments are kept before the oldest one is replaced with the newest one. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail endpoints and
     * quotas</a> in the <i>AWS General Reference</i>.
     * </p>
     * </note>
     * 
     * @param getContainerServiceDeploymentsRequest
     * @return Result of the GetContainerServiceDeployments operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServiceDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContainerServiceDeploymentsResult getContainerServiceDeployments(GetContainerServiceDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerServiceDeployments(request);
    }

    @SdkInternalApi
    final GetContainerServiceDeploymentsResult executeGetContainerServiceDeployments(GetContainerServiceDeploymentsRequest getContainerServiceDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerServiceDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerServiceDeploymentsRequest> request = null;
        Response<GetContainerServiceDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerServiceDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getContainerServiceDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerServiceDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerServiceDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetContainerServiceDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points of a specific metric of your Amazon Lightsail container service.
     * </p>
     * <p>
     * Metrics report the utilization of your resources. Monitor and collect metric data regularly to maintain the
     * reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getContainerServiceMetricDataRequest
     * @return Result of the GetContainerServiceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServiceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContainerServiceMetricDataResult getContainerServiceMetricData(GetContainerServiceMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerServiceMetricData(request);
    }

    @SdkInternalApi
    final GetContainerServiceMetricDataResult executeGetContainerServiceMetricData(GetContainerServiceMetricDataRequest getContainerServiceMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerServiceMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerServiceMetricDataRequest> request = null;
        Response<GetContainerServiceMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerServiceMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getContainerServiceMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerServiceMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerServiceMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetContainerServiceMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of powers that can be specified for your Amazon Lightsail container services.
     * </p>
     * <p>
     * The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param getContainerServicePowersRequest
     * @return Result of the GetContainerServicePowers operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServicePowers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServicePowers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContainerServicePowersResult getContainerServicePowers(GetContainerServicePowersRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerServicePowers(request);
    }

    @SdkInternalApi
    final GetContainerServicePowersResult executeGetContainerServicePowers(GetContainerServicePowersRequest getContainerServicePowersRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerServicePowersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerServicePowersRequest> request = null;
        Response<GetContainerServicePowersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerServicePowersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getContainerServicePowersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerServicePowers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerServicePowersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetContainerServicePowersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail container services.
     * </p>
     * 
     * @param getContainerServicesRequest
     * @return Result of the GetContainerServices operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContainerServicesResult getContainerServices(GetContainerServicesRequest request) {
        request = beforeClientExecution(request);
        return executeGetContainerServices(request);
    }

    @SdkInternalApi
    final GetContainerServicesResult executeGetContainerServices(GetContainerServicesRequest getContainerServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(getContainerServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContainerServicesRequest> request = null;
        Response<GetContainerServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContainerServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContainerServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContainerServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContainerServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContainerServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return Result of the GetDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDiskResult getDisk(GetDiskRequest request) {
        request = beforeClientExecution(request);
        return executeGetDisk(request);
    }

    @SdkInternalApi
    final GetDiskResult executeGetDisk(GetDiskRequest getDiskRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskRequest> request = null;
        Response<GetDiskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDiskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDisk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDiskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return Result of the GetDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDiskSnapshotResult getDiskSnapshot(GetDiskSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetDiskSnapshot(request);
    }

    @SdkInternalApi
    final GetDiskSnapshotResult executeGetDiskSnapshot(GetDiskSnapshotRequest getDiskSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiskSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskSnapshotRequest> request = null;
        Response<GetDiskSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDiskSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDiskSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiskSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDiskSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return Result of the GetDiskSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDiskSnapshotsResult getDiskSnapshots(GetDiskSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDiskSnapshots(request);
    }

    @SdkInternalApi
    final GetDiskSnapshotsResult executeGetDiskSnapshots(GetDiskSnapshotsRequest getDiskSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiskSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiskSnapshotsRequest> request = null;
        Response<GetDiskSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiskSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDiskSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDiskSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiskSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDiskSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * 
     * @param getDisksRequest
     * @return Result of the GetDisks operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDisksResult getDisks(GetDisksRequest request) {
        request = beforeClientExecution(request);
        return executeGetDisks(request);
    }

    @SdkInternalApi
    final GetDisksResult executeGetDisks(GetDisksRequest getDisksRequest) {

        ExecutionContext executionContext = createExecutionContext(getDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDisksRequest> request = null;
        Response<GetDisksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDisksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDisksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDisks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDisksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDisksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * 
     * @param getDistributionBundlesRequest
     * @return Result of the GetDistributionBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionBundles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDistributionBundlesResult getDistributionBundles(GetDistributionBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributionBundles(request);
    }

    @SdkInternalApi
    final GetDistributionBundlesResult executeGetDistributionBundles(GetDistributionBundlesRequest getDistributionBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionBundlesRequest> request = null;
        Response<GetDistributionBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDistributionBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributionBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDistributionBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDistributionBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network
     * (CDN) distribution.
     * </p>
     * 
     * @param getDistributionLatestCacheResetRequest
     * @return Result of the GetDistributionLatestCacheReset operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionLatestCacheReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDistributionLatestCacheResetResult getDistributionLatestCacheReset(GetDistributionLatestCacheResetRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributionLatestCacheReset(request);
    }

    @SdkInternalApi
    final GetDistributionLatestCacheResetResult executeGetDistributionLatestCacheReset(
            GetDistributionLatestCacheResetRequest getDistributionLatestCacheResetRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionLatestCacheResetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionLatestCacheResetRequest> request = null;
        Response<GetDistributionLatestCacheResetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionLatestCacheResetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDistributionLatestCacheResetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributionLatestCacheReset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDistributionLatestCacheResetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDistributionLatestCacheResetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points of a specific metric for an Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getDistributionMetricDataRequest
     * @return Result of the GetDistributionMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDistributionMetricDataResult getDistributionMetricData(GetDistributionMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributionMetricData(request);
    }

    @SdkInternalApi
    final GetDistributionMetricDataResult executeGetDistributionMetricData(GetDistributionMetricDataRequest getDistributionMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionMetricDataRequest> request = null;
        Response<GetDistributionMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDistributionMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributionMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDistributionMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDistributionMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * 
     * @param getDistributionsRequest
     * @return Result of the GetDistributions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDistributionsResult getDistributions(GetDistributionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributions(request);
    }

    @SdkInternalApi
    final GetDistributionsResult executeGetDistributions(GetDistributionsRequest getDistributionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionsRequest> request = null;
        Response<GetDistributionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDistributionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDistributionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDistributionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomain(request);
    }

    @SdkInternalApi
    final GetDomainResult executeGetDomain(GetDomainRequest getDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return Result of the GetDomains operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainsResult getDomains(GetDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomains(request);
    }

    @SdkInternalApi
    final GetDomainsResult executeGetDomains(GetDomainsRequest getDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainsRequest> request = null;
        Response<GetDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all export snapshot records created as a result of the <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
     * <a>CreateCloudFormationStack</a> action.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @return Result of the GetExportSnapshotRecords operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetExportSnapshotRecordsResult getExportSnapshotRecords(GetExportSnapshotRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExportSnapshotRecords(request);
    }

    @SdkInternalApi
    final GetExportSnapshotRecordsResult executeGetExportSnapshotRecords(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExportSnapshotRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportSnapshotRecordsRequest> request = null;
        Response<GetExportSnapshotRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportSnapshotRecordsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getExportSnapshotRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExportSnapshotRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExportSnapshotRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetExportSnapshotRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceResult getInstance(GetInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstance(request);
    }

    @SdkInternalApi
    final GetInstanceResult executeGetInstance(GetInstanceRequest getInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceRequest> request = null;
        Response<GetInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return Result of the GetInstanceAccessDetails operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceAccessDetails(request);
    }

    @SdkInternalApi
    final GetInstanceAccessDetailsResult executeGetInstanceAccessDetails(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceAccessDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceAccessDetailsRequest> request = null;
        Response<GetInstanceAccessDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceAccessDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInstanceAccessDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceAccessDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceAccessDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInstanceAccessDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return Result of the GetInstanceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstanceMetricDataResult getInstanceMetricData(GetInstanceMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceMetricData(request);
    }

    @SdkInternalApi
    final GetInstanceMetricDataResult executeGetInstanceMetricData(GetInstanceMetricDataRequest getInstanceMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceMetricDataRequest> request = null;
        Response<GetInstanceMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceMetricDataResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetInstanceMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to
     * the instance through the ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return Result of the GetInstancePortStates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstancePortStatesResult getInstancePortStates(GetInstancePortStatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstancePortStates(request);
    }

    @SdkInternalApi
    final GetInstancePortStatesResult executeGetInstancePortStates(GetInstancePortStatesRequest getInstancePortStatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstancePortStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancePortStatesRequest> request = null;
        Response<GetInstancePortStatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancePortStatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstancePortStatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstancePortStates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstancePortStatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetInstancePortStatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return Result of the GetInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceSnapshotResult getInstanceSnapshot(GetInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceSnapshot(request);
    }

    @SdkInternalApi
    final GetInstanceSnapshotResult executeGetInstanceSnapshot(GetInstanceSnapshotRequest getInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotRequest> request = null;
        Response<GetInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return Result of the GetInstanceSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceSnapshotsResult getInstanceSnapshots(GetInstanceSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceSnapshots(request);
    }

    @SdkInternalApi
    final GetInstanceSnapshotsResult executeGetInstanceSnapshots(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotsRequest> request = null;
        Response<GetInstanceSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return Result of the GetInstanceState operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceStateResult getInstanceState(GetInstanceStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceState(request);
    }

    @SdkInternalApi
    final GetInstanceStateResult executeGetInstanceState(GetInstanceStateRequest getInstanceStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceStateRequest> request = null;
        Response<GetInstanceStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return Result of the GetInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstancesResult getInstances(GetInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstances(request);
    }

    @SdkInternalApi
    final GetInstancesResult executeGetInstances(GetInstancesRequest getInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancesRequest> request = null;
        Response<GetInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return Result of the GetKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyPairResult getKeyPair(GetKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyPair(request);
    }

    @SdkInternalApi
    final GetKeyPairResult executeGetKeyPair(GetKeyPairRequest getKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairRequest> request = null;
        Response<GetKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return Result of the GetKeyPairs operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyPairsResult getKeyPairs(GetKeyPairsRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyPairs(request);
    }

    @SdkInternalApi
    final GetKeyPairsResult executeGetKeyPairs(GetKeyPairsRequest getKeyPairsRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyPairsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairsRequest> request = null;
        Response<GetKeyPairsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyPairsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyPairs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyPairsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyPairsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return Result of the GetLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLoadBalancerResult getLoadBalancer(GetLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoadBalancer(request);
    }

    @SdkInternalApi
    final GetLoadBalancerResult executeGetLoadBalancer(GetLoadBalancerRequest getLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerRequest> request = null;
        Response<GetLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoadBalancerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLoadBalancerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load balancer.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @return Result of the GetLoadBalancerMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLoadBalancerMetricDataResult getLoadBalancerMetricData(GetLoadBalancerMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoadBalancerMetricData(request);
    }

    @SdkInternalApi
    final GetLoadBalancerMetricDataResult executeGetLoadBalancerMetricData(GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoadBalancerMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerMetricDataRequest> request = null;
        Response<GetLoadBalancerMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLoadBalancerMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoadBalancerMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoadBalancerMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLoadBalancerMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
     * is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @return Result of the GetLoadBalancerTlsCertificates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLoadBalancerTlsCertificatesResult getLoadBalancerTlsCertificates(GetLoadBalancerTlsCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoadBalancerTlsCertificates(request);
    }

    @SdkInternalApi
    final GetLoadBalancerTlsCertificatesResult executeGetLoadBalancerTlsCertificates(GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoadBalancerTlsCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancerTlsCertificatesRequest> request = null;
        Response<GetLoadBalancerTlsCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancerTlsCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLoadBalancerTlsCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoadBalancerTlsCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoadBalancerTlsCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLoadBalancerTlsCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return Result of the GetLoadBalancers operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLoadBalancersResult getLoadBalancers(GetLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoadBalancers(request);
    }

    @SdkInternalApi
    final GetLoadBalancersResult executeGetLoadBalancers(GetLoadBalancersRequest getLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoadBalancersRequest> request = null;
        Response<GetLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoadBalancersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoadBalancersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLoadBalancersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperation(request);
    }

    @SdkInternalApi
    final GetOperationResult executeGetOperation(GetOperationRequest getOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return Result of the GetOperations operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOperationsResult getOperations(GetOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperations(request);
    }

    @SdkInternalApi
    final GetOperationsResult executeGetOperations(GetOperationsRequest getOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsRequest> request = null;
        Response<GetOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return Result of the GetOperationsForResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOperationsForResourceResult getOperationsForResource(GetOperationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperationsForResource(request);
    }

    @SdkInternalApi
    final GetOperationsForResourceResult executeGetOperationsForResource(GetOperationsForResourceRequest getOperationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsForResourceRequest> request = null;
        Response<GetOperationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOperationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperationsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOperationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return Result of the GetRegions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRegionsResult getRegions(GetRegionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegions(request);
    }

    @SdkInternalApi
    final GetRegionsResult executeGetRegions(GetRegionsRequest getRegionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegionsRequest> request = null;
        Response<GetRegionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRegionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRegions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegionsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRegionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return Result of the GetRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseResult getRelationalDatabase(GetRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabase(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseResult executeGetRelationalDatabase(GetRelationalDatabaseRequest getRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseRequest> request = null;
        Response<GetRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @return Result of the GetRelationalDatabaseBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseBlueprintsResult getRelationalDatabaseBlueprints(GetRelationalDatabaseBlueprintsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseBlueprints(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseBlueprintsResult executeGetRelationalDatabaseBlueprints(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseBlueprintsRequest> request = null;
        Response<GetRelationalDatabaseBlueprintsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseBlueprintsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseBlueprintsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseBlueprints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseBlueprintsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseBlueprintsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
     * specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @return Result of the GetRelationalDatabaseBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseBundlesResult getRelationalDatabaseBundles(GetRelationalDatabaseBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseBundles(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseBundlesResult executeGetRelationalDatabaseBundles(GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseBundlesRequest> request = null;
        Response<GetRelationalDatabaseBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseBundlesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return Result of the GetRelationalDatabaseEvents operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseEventsResult getRelationalDatabaseEvents(GetRelationalDatabaseEventsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseEvents(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseEventsResult executeGetRelationalDatabaseEvents(GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseEventsRequest> request = null;
        Response<GetRelationalDatabaseEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return Result of the GetRelationalDatabaseLogEvents operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseLogEventsResult getRelationalDatabaseLogEvents(GetRelationalDatabaseLogEventsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseLogEvents(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseLogEventsResult executeGetRelationalDatabaseLogEvents(GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseLogEventsRequest> request = null;
        Response<GetRelationalDatabaseLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseLogEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseLogEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseLogEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseLogEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return Result of the GetRelationalDatabaseLogStreams operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseLogStreamsResult getRelationalDatabaseLogStreams(GetRelationalDatabaseLogStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseLogStreams(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseLogStreamsResult executeGetRelationalDatabaseLogStreams(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseLogStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseLogStreamsRequest> request = null;
        Response<GetRelationalDatabaseLogStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseLogStreamsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseLogStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseLogStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseLogStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseLogStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user password for a Lightsail database.
     * </p>
     * <p>
     * The <code>GetRelationalDatabaseMasterUserPassword</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @return Result of the GetRelationalDatabaseMasterUserPassword operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseMasterUserPasswordResult getRelationalDatabaseMasterUserPassword(GetRelationalDatabaseMasterUserPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseMasterUserPassword(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseMasterUserPasswordResult executeGetRelationalDatabaseMasterUserPassword(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseMasterUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseMasterUserPasswordRequest> request = null;
        Response<GetRelationalDatabaseMasterUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseMasterUserPasswordRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseMasterUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseMasterUserPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseMasterUserPasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRelationalDatabaseMasterUserPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon Lightsail.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @return Result of the GetRelationalDatabaseMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseMetricDataResult getRelationalDatabaseMetricData(GetRelationalDatabaseMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseMetricData(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseMetricDataResult executeGetRelationalDatabaseMetricData(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseMetricDataRequest> request = null;
        Response<GetRelationalDatabaseMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
     * database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns other information about each parameter.
     * This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
     * values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @return Result of the GetRelationalDatabaseParameters operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseParametersResult getRelationalDatabaseParameters(GetRelationalDatabaseParametersRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseParameters(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseParametersResult executeGetRelationalDatabaseParameters(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseParametersRequest> request = null;
        Response<GetRelationalDatabaseParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseParametersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return Result of the GetRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseSnapshotResult getRelationalDatabaseSnapshot(GetRelationalDatabaseSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseSnapshot(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseSnapshotResult executeGetRelationalDatabaseSnapshot(GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseSnapshotRequest> request = null;
        Response<GetRelationalDatabaseSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return Result of the GetRelationalDatabaseSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabaseSnapshotsResult getRelationalDatabaseSnapshots(GetRelationalDatabaseSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabaseSnapshots(request);
    }

    @SdkInternalApi
    final GetRelationalDatabaseSnapshotsResult executeGetRelationalDatabaseSnapshots(GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabaseSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabaseSnapshotsRequest> request = null;
        Response<GetRelationalDatabaseSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabaseSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRelationalDatabaseSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabaseSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabaseSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabaseSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return Result of the GetRelationalDatabases operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRelationalDatabasesResult getRelationalDatabases(GetRelationalDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelationalDatabases(request);
    }

    @SdkInternalApi
    final GetRelationalDatabasesResult executeGetRelationalDatabases(GetRelationalDatabasesRequest getRelationalDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelationalDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelationalDatabasesRequest> request = null;
        Response<GetRelationalDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelationalDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRelationalDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelationalDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelationalDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRelationalDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an Amazon Lightsail static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return Result of the GetStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStaticIpResult getStaticIp(GetStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeGetStaticIp(request);
    }

    @SdkInternalApi
    final GetStaticIpResult executeGetStaticIp(GetStaticIpRequest getStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(getStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpRequest> request = null;
        Response<GetStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStaticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return Result of the GetStaticIps operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStaticIpsResult getStaticIps(GetStaticIpsRequest request) {
        request = beforeClientExecution(request);
        return executeGetStaticIps(request);
    }

    @SdkInternalApi
    final GetStaticIpsResult executeGetStaticIps(GetStaticIpsRequest getStaticIpsRequest) {

        ExecutionContext executionContext = createExecutionContext(getStaticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpsRequest> request = null;
        Response<GetStaticIpsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStaticIpsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStaticIps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStaticIpsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStaticIpsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return Result of the ImportKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeImportKeyPair(request);
    }

    @SdkInternalApi
    final ImportKeyPairResult executeImportKeyPair(ImportKeyPairRequest importKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(importKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyPairRequest> request = null;
        Response<ImportKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return Result of the IsVpcPeered operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest request) {
        request = beforeClientExecution(request);
        return executeIsVpcPeered(request);
    }

    @SdkInternalApi
    final IsVpcPeeredResult executeIsVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest) {

        ExecutionContext executionContext = createExecutionContext(isVpcPeeredRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsVpcPeeredRequest> request = null;
        Response<IsVpcPeeredResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsVpcPeeredRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(isVpcPeeredRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IsVpcPeered");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IsVpcPeeredResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new IsVpcPeeredResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the
     * instance through the ports, and the protocol.
     * </p>
     * <p>
     * The <code>OpenInstancePublicPorts</code> action supports tag-based access control via resource tags applied to
     * the resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return Result of the OpenInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public OpenInstancePublicPortsResult openInstancePublicPorts(OpenInstancePublicPortsRequest request) {
        request = beforeClientExecution(request);
        return executeOpenInstancePublicPorts(request);
    }

    @SdkInternalApi
    final OpenInstancePublicPortsResult executeOpenInstancePublicPorts(OpenInstancePublicPortsRequest openInstancePublicPortsRequest) {

        ExecutionContext executionContext = createExecutionContext(openInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OpenInstancePublicPortsRequest> request = null;
        Response<OpenInstancePublicPortsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OpenInstancePublicPortsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(openInstancePublicPortsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "OpenInstancePublicPorts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<OpenInstancePublicPortsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new OpenInstancePublicPortsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Peers the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return Result of the PeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PeerVpcResult peerVpc(PeerVpcRequest request) {
        request = beforeClientExecution(request);
        return executePeerVpc(request);
    }

    @SdkInternalApi
    final PeerVpcResult executePeerVpc(PeerVpcRequest peerVpcRequest) {

        ExecutionContext executionContext = createExecutionContext(peerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PeerVpcRequest> request = null;
        Response<PeerVpcResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PeerVpcRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(peerVpcRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PeerVpc");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PeerVpcResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PeerVpcResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an alarm, and associates it with the specified metric.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * <p>
     * When this action creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm. The alarm is then evaluated with the updated configuration.
     * </p>
     * 
     * @param putAlarmRequest
     * @return Result of the PutAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.PutAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAlarmResult putAlarm(PutAlarmRequest request) {
        request = beforeClientExecution(request);
        return executePutAlarm(request);
    }

    @SdkInternalApi
    final PutAlarmResult executePutAlarm(PutAlarmRequest putAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(putAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAlarmRequest> request = null;
        Response<PutAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAlarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the
     * instance through the ports, and the protocol. This action also closes all currently open ports that are not
     * included in the request. Include all of the ports and the protocols you want to open in your
     * <code>PutInstancePublicPorts</code>request. Or use the <code>OpenInstancePublicPorts</code> action to open ports
     * without closing currently open ports.
     * </p>
     * <p>
     * The <code>PutInstancePublicPorts</code> action supports tag-based access control via resource tags applied to the
     * resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return Result of the PutInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutInstancePublicPortsResult putInstancePublicPorts(PutInstancePublicPortsRequest request) {
        request = beforeClientExecution(request);
        return executePutInstancePublicPorts(request);
    }

    @SdkInternalApi
    final PutInstancePublicPortsResult executePutInstancePublicPorts(PutInstancePublicPortsRequest putInstancePublicPortsRequest) {

        ExecutionContext executionContext = createExecutionContext(putInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInstancePublicPortsRequest> request = null;
        Response<PutInstancePublicPortsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInstancePublicPortsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putInstancePublicPortsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInstancePublicPorts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInstancePublicPortsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutInstancePublicPortsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RebootInstanceResult rebootInstance(RebootInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRebootInstance(request);
    }

    @SdkInternalApi
    final RebootInstanceResult executeRebootInstance(RebootInstanceRequest rebootInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootInstanceRequest> request = null;
        Response<RebootInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @return Result of the RebootRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RebootRelationalDatabaseResult rebootRelationalDatabase(RebootRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeRebootRelationalDatabase(request);
    }

    @SdkInternalApi
    final RebootRelationalDatabaseResult executeRebootRelationalDatabase(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootRelationalDatabaseRequest> request = null;
        Response<RebootRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rebootRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RebootRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a container image to your Amazon Lightsail container service.
     * </p>
     * <note>
     * <p>
     * This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container
     * images to your Lightsail container service. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-pushing-container-images">Pushing
     * and managing container images on your Amazon Lightsail container services</a> in the <i>Amazon Lightsail
     * Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param registerContainerImageRequest
     * @return Result of the RegisterContainerImage operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RegisterContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterContainerImageResult registerContainerImage(RegisterContainerImageRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterContainerImage(request);
    }

    @SdkInternalApi
    final RegisterContainerImageResult executeRegisterContainerImage(RegisterContainerImageRequest registerContainerImageRequest) {

        ExecutionContext executionContext = createExecutionContext(registerContainerImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterContainerImageRequest> request = null;
        Response<RegisterContainerImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterContainerImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerContainerImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterContainerImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterContainerImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterContainerImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return Result of the ReleaseStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeReleaseStaticIp(request);
    }

    @SdkInternalApi
    final ReleaseStaticIpResult executeReleaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(releaseStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleaseStaticIpRequest> request = null;
        Response<ReleaseStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleaseStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(releaseStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReleaseStaticIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReleaseStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReleaseStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes currently cached content from your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After resetting the cache, the next time a content request is made, your distribution pulls, serves, and caches
     * it from the origin.
     * </p>
     * 
     * @param resetDistributionCacheRequest
     * @return Result of the ResetDistributionCache operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ResetDistributionCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResetDistributionCache"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetDistributionCacheResult resetDistributionCache(ResetDistributionCacheRequest request) {
        request = beforeClientExecution(request);
        return executeResetDistributionCache(request);
    }

    @SdkInternalApi
    final ResetDistributionCacheResult executeResetDistributionCache(ResetDistributionCacheRequest resetDistributionCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(resetDistributionCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetDistributionCacheRequest> request = null;
        Response<ResetDistributionCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetDistributionCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetDistributionCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetDistributionCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetDistributionCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResetDistributionCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a verification request to an email contact method to ensure it's owned by the requester. SMS contact
     * methods don't need to be verified.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * <p>
     * A verification request is sent to the contact method when you initially create it. Use this action to send
     * another verification request if a previous verification request was deleted, or has expired.
     * </p>
     * <important>
     * <p>
     * Notifications are not sent to an email contact method until after it is verified, and confirmed as valid.
     * </p>
     * </important>
     * 
     * @param sendContactMethodVerificationRequest
     * @return Result of the SendContactMethodVerification operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.SendContactMethodVerification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SendContactMethodVerification"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendContactMethodVerificationResult sendContactMethodVerification(SendContactMethodVerificationRequest request) {
        request = beforeClientExecution(request);
        return executeSendContactMethodVerification(request);
    }

    @SdkInternalApi
    final SendContactMethodVerificationResult executeSendContactMethodVerification(SendContactMethodVerificationRequest sendContactMethodVerificationRequest) {

        ExecutionContext executionContext = createExecutionContext(sendContactMethodVerificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendContactMethodVerificationRequest> request = null;
        Response<SendContactMethodVerificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendContactMethodVerificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendContactMethodVerificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendContactMethodVerification");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendContactMethodVerificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendContactMethodVerificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the IP address type for an Amazon Lightsail resource.
     * </p>
     * <p>
     * Use this action to enable dual-stack for a resource, which enables IPv4 and IPv6 for the specified resource.
     * Alternately, you can use this action to disable dual-stack, and enable IPv4 only.
     * </p>
     * 
     * @param setIpAddressTypeRequest
     * @return Result of the SetIpAddressType operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetIpAddressType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetIpAddressTypeResult setIpAddressType(SetIpAddressTypeRequest request) {
        request = beforeClientExecution(request);
        return executeSetIpAddressType(request);
    }

    @SdkInternalApi
    final SetIpAddressTypeResult executeSetIpAddressType(SetIpAddressTypeRequest setIpAddressTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(setIpAddressTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIpAddressTypeRequest> request = null;
        Response<SetIpAddressTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIpAddressTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setIpAddressTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIpAddressType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetIpAddressTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetIpAddressTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket.
     * </p>
     * <p>
     * Lightsail buckets currently support setting access for Lightsail instances in the same AWS Region.
     * </p>
     * 
     * @param setResourceAccessForBucketRequest
     * @return Result of the SetResourceAccessForBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.SetResourceAccessForBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetResourceAccessForBucket"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetResourceAccessForBucketResult setResourceAccessForBucket(SetResourceAccessForBucketRequest request) {
        request = beforeClientExecution(request);
        return executeSetResourceAccessForBucket(request);
    }

    @SdkInternalApi
    final SetResourceAccessForBucketResult executeSetResourceAccessForBucket(SetResourceAccessForBucketRequest setResourceAccessForBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(setResourceAccessForBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetResourceAccessForBucketRequest> request = null;
        Response<SetResourceAccessForBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetResourceAccessForBucketRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setResourceAccessForBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetResourceAccessForBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetResourceAccessForBucketResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetResourceAccessForBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
     * <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-create-static-ip">Amazon Lightsail
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return Result of the StartInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartInstanceResult startInstance(StartInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartInstance(request);
    }

    @SdkInternalApi
    final StartInstanceResult executeStartInstance(StartInstanceRequest startInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceRequest> request = null;
        Response<StartInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @return Result of the StartRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeStartRelationalDatabase(request);
    }

    @SdkInternalApi
    final StartRelationalDatabaseResult executeStartRelationalDatabase(StartRelationalDatabaseRequest startRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(startRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRelationalDatabaseRequest> request = null;
        Response<StartRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-create-static-ip">Amazon Lightsail
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return Result of the StopInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopInstanceResult stopInstance(StopInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStopInstance(request);
    }

    @SdkInternalApi
    final StopInstanceResult executeStopInstance(StopInstanceRequest stopInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstanceRequest> request = null;
        Response<StopInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @return Result of the StopRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopRelationalDatabaseResult stopRelationalDatabase(StopRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeStopRelationalDatabase(request);
    }

    @SdkInternalApi
    final StopRelationalDatabaseResult executeStopRelationalDatabase(StopRelationalDatabaseRequest stopRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(stopRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopRelationalDatabaseRequest> request = null;
        Response<StopRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by <code>resource name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests an alarm by displaying a banner on the Amazon Lightsail console. If a notification trigger is configured
     * for the specified alarm, the test also sends a notification to the notification protocol (<code>Email</code>
     * and/or <code>SMS</code>) configured for the alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param testAlarmRequest
     * @return Result of the TestAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.TestAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TestAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestAlarmResult testAlarm(TestAlarmRequest request) {
        request = beforeClientExecution(request);
        return executeTestAlarm(request);
    }

    @SdkInternalApi
    final TestAlarmResult executeTestAlarm(TestAlarmRequest testAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(testAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestAlarmRequest> request = null;
        Response<TestAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestAlarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestAlarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestAlarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unpeers the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return Result of the UnpeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnpeerVpcResult unpeerVpc(UnpeerVpcRequest request) {
        request = beforeClientExecution(request);
        return executeUnpeerVpc(request);
    }

    @SdkInternalApi
    final UnpeerVpcResult executeUnpeerVpc(UnpeerVpcRequest unpeerVpcRequest) {

        ExecutionContext executionContext = createExecutionContext(unpeerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnpeerVpcRequest> request = null;
        Response<UnpeerVpcResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnpeerVpcRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unpeerVpcRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnpeerVpc");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnpeerVpcResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnpeerVpcResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by <code>resource name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Lightsail bucket.
     * </p>
     * <p>
     * Use this action to update the configuration of an existing bucket, such as versioning, public accessibility, and
     * the AWS accounts that can access the bucket.
     * </p>
     * 
     * @param updateBucketRequest
     * @return Result of the UpdateBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBucketResult updateBucket(UpdateBucketRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBucket(request);
    }

    @SdkInternalApi
    final UpdateBucketResult executeUpdateBucket(UpdateBucketRequest updateBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBucketRequest> request = null;
        Response<UpdateBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBucketRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBucketResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the bundle, or storage plan, of an existing Amazon Lightsail bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. You can update a
     * bucket's bundle only one time within a monthly AWS billing cycle. To determine if you can update a bucket's
     * bundle, use the <a>GetBuckets</a> action. The <code>ableToUpdateBundle</code> parameter in the response will
     * indicate whether you can currently update a bucket's bundle.
     * </p>
     * <p>
     * Update a bucket's bundle if it's consistently going over its storage space or data transfer quota, or if a
     * bucket's usage is consistently in the lower range of its storage space or data transfer quota. Due to the
     * unpredictable usage fluctuations that a bucket might experience, we strongly recommend that you update a bucket's
     * bundle only as a long-term strategy, instead of as a short-term, monthly cost-cutting measure. Choose a bucket
     * bundle that will provide the bucket with ample storage space and data transfer for a long time to come.
     * </p>
     * 
     * @param updateBucketBundleRequest
     * @return Result of the UpdateBucketBundle operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateBucketBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucketBundle" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateBucketBundleResult updateBucketBundle(UpdateBucketBundleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBucketBundle(request);
    }

    @SdkInternalApi
    final UpdateBucketBundleResult executeUpdateBucketBundle(UpdateBucketBundleRequest updateBucketBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBucketBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBucketBundleRequest> request = null;
        Response<UpdateBucketBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBucketBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBucketBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBucketBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBucketBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBucketBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain
     * names.
     * </p>
     * 
     * @param updateContainerServiceRequest
     * @return Result of the UpdateContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContainerServiceResult updateContainerService(UpdateContainerServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContainerService(request);
    }

    @SdkInternalApi
    final UpdateContainerServiceResult executeUpdateContainerService(UpdateContainerServiceRequest updateContainerServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContainerServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerServiceRequest> request = null;
        Response<UpdateContainerServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContainerServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContainerService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContainerServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContainerServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Use this action to update the configuration of your existing distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     * @return Result of the UpdateDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDistribution(request);
    }

    @SdkInternalApi
    final UpdateDistributionResult executeUpdateDistribution(UpdateDistributionRequest updateDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistributionRequest> request = null;
        Response<UpdateDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDistributionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the bundle of your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * <p>
     * Update your distribution's bundle if your distribution is going over its monthly network transfer quota and is
     * incurring an overage fee.
     * </p>
     * <p>
     * You can update your distribution's bundle only one time within your monthly AWS billing cycle. To determine if
     * you can update your distribution's bundle, use the <code>GetDistributions</code> action. The
     * <code>ableToUpdateBundle</code> parameter in the result will indicate whether you can currently update your
     * distribution's bundle.
     * </p>
     * 
     * @param updateDistributionBundleRequest
     * @return Result of the UpdateDistributionBundle operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDistributionBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistributionBundle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDistributionBundleResult updateDistributionBundle(UpdateDistributionBundleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDistributionBundle(request);
    }

    @SdkInternalApi
    final UpdateDistributionBundleResult executeUpdateDistributionBundle(UpdateDistributionBundleRequest updateDistributionBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDistributionBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistributionBundleRequest> request = null;
        Response<UpdateDistributionBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDistributionBundleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDistributionBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDistributionBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDistributionBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDistributionBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return Result of the UpdateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainEntry(request);
    }

    @SdkInternalApi
    final UpdateDomainEntryResult executeUpdateDomainEntry(UpdateDomainEntryRequest updateDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainEntryRequest> request = null;
        Response<UpdateDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @return Result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLoadBalancerAttributeResult updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLoadBalancerAttribute(request);
    }

    @SdkInternalApi
    final UpdateLoadBalancerAttributeResult executeUpdateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLoadBalancerAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoadBalancerAttributeRequest> request = null;
        Response<UpdateLoadBalancerAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoadBalancerAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLoadBalancerAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLoadBalancerAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLoadBalancerAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLoadBalancerAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
     * database's predefined maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @return Result of the UpdateRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRelationalDatabaseResult updateRelationalDatabase(UpdateRelationalDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRelationalDatabase(request);
    }

    @SdkInternalApi
    final UpdateRelationalDatabaseResult executeUpdateRelationalDatabase(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRelationalDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRelationalDatabaseRequest> request = null;
        Response<UpdateRelationalDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRelationalDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRelationalDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRelationalDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRelationalDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRelationalDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
     * window. However, there are two ways in which parameter updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a <code>dynamic</code> apply type are applied immediately.
     * Parameters marked with a <code>pending-reboot</code> apply type are applied only after the database is rebooted
     * using the <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @return Result of the UpdateRelationalDatabaseParameters operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRelationalDatabaseParametersResult updateRelationalDatabaseParameters(UpdateRelationalDatabaseParametersRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRelationalDatabaseParameters(request);
    }

    @SdkInternalApi
    final UpdateRelationalDatabaseParametersResult executeUpdateRelationalDatabaseParameters(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRelationalDatabaseParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRelationalDatabaseParametersRequest> request = null;
        Response<UpdateRelationalDatabaseParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRelationalDatabaseParametersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRelationalDatabaseParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lightsail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRelationalDatabaseParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRelationalDatabaseParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRelationalDatabaseParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
