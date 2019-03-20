/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacemetering;

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

import com.amazonaws.services.marketplacemetering.AWSMarketplaceMeteringClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.marketplacemetering.model.*;
import com.amazonaws.services.marketplacemetering.model.transform.*;

/**
 * Client for accessing AWSMarketplace Metering. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>AWS Marketplace Metering Service</fullname>
 * <p>
 * This reference provides descriptions of the low-level AWS Marketplace Metering Service API.
 * </p>
 * <p>
 * AWS Marketplace sellers can use this API to submit usage data for custom usage dimensions.
 * </p>
 * <p>
 * <b>Submitting Metering Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product. MeterUsage is called from an EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchMeterUsage</i>- Submits the metering record for a set of customers. BatchMeterUsage is called from a
 * software-as-a-service (SaaS) application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Accepting New Customers</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ResolveCustomer</i>- Called by a SaaS application during the registration process. When a buyer visits your
 * website during the registration process, the buyer submits a Registration Token through the browser. The Registration
 * Token is resolved through this API to obtain a CustomerIdentifier and Product Code.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Entitlement and Metering for Paid Container Products</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
 * Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
 * containers running outside of Amazon Elastic Container Service (Amazon ECR) isn't supported. Free and BYOL products
 * for ECS aren't required to call RegisterUsage, but you can do so if you want to receive usage data in your seller
 * reports. For more information on using the RegisterUsage operation, see <a
 * href="https://docs.aws.amazon.com/marketplace/latest/userguide/container-based-products.html">Container-Based
 * Products</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * BatchMeterUsage API calls are captured by AWS CloudTrail. You can use Cloudtrail to verify that the SaaS metering
 * records that you sent are accurate by searching for records with the eventName of BatchMeterUsage. You can also use
 * CloudTrail to audit records over time. For more information, see the <i> <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html">AWS CloudTrail User
 * Guide</a> </i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceMeteringClient extends AmazonWebServiceClient implements AWSMarketplaceMetering {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMarketplaceMetering.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aws-marketplace";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTokenException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredTokenException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.ExpiredTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEndpointRegionException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidEndpointRegionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PlatformNotSupportedException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.PlatformNotSupportedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TimestampOutOfBoundsException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.TimestampOutOfBoundsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InternalServiceErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUsageDimensionException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidUsageDimensionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateRequestException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.DuplicateRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPublicKeyVersionException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidPublicKeyVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRegionException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidRegionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomerNotEntitledException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.CustomerNotEntitledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledApiException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.DisabledApiException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCustomerIdentifierException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidCustomerIdentifierException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidProductCodeException").withModeledClass(
                                    com.amazonaws.services.marketplacemetering.model.InvalidProductCodeException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.marketplacemetering.model.AWSMarketplaceMeteringException.class));

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWSMarketplace Metering (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSMarketplaceMeteringClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSMarketplace Metering (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceMeteringClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSMarketplace Metering (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceMeteringClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSMarketplace Metering (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSMarketplaceMeteringClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceMeteringClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSMarketplaceMeteringClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSMarketplaceMeteringClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSMarketplaceMeteringClientBuilder builder() {
        return AWSMarketplaceMeteringClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceMeteringClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMarketplace Metering using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceMeteringClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://metering.marketplace.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/marketplacemetering/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/marketplacemetering/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a
     * set of customers.
     * </p>
     * <p>
     * For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the
     * input records.
     * </p>
     * <p>
     * Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must
     * make multiple calls to BatchMeterUsage.
     * </p>
     * <p>
     * BatchMeterUsage can process up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param batchMeterUsageRequest
     *        A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your
     *        application.
     * @return Result of the BatchMeterUsage operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidUsageDimensionException
     *         The usage dimension does not match one of the UsageDimensions associated with products.
     * @throws InvalidCustomerIdentifierException
     *         You have metered usage for a CustomerIdentifier that does not exist.
     * @throws TimestampOutOfBoundsException
     *         The timestamp value passed in the meterUsage() is out of allowed range.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.BatchMeterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchMeterUsageResult batchMeterUsage(BatchMeterUsageRequest request) {
        request = beforeClientExecution(request);
        return executeBatchMeterUsage(request);
    }

    @SdkInternalApi
    final BatchMeterUsageResult executeBatchMeterUsage(BatchMeterUsageRequest batchMeterUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(batchMeterUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchMeterUsageRequest> request = null;
        Response<BatchMeterUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchMeterUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchMeterUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Metering");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchMeterUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchMeterUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchMeterUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
     * record ID.
     * </p>
     * <p>
     * MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS
     * Marketplace.
     * </p>
     * 
     * @param meterUsageRequest
     * @return Result of the MeterUsage operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidUsageDimensionException
     *         The usage dimension does not match one of the UsageDimensions associated with products.
     * @throws InvalidEndpointRegionException
     *         The endpoint being called is in a Region different from your EC2 instance. The Region of the Metering
     *         Service endpoint and the Region of the EC2 instance must match.
     * @throws TimestampOutOfBoundsException
     *         The timestamp value passed in the meterUsage() is out of allowed range.
     * @throws DuplicateRequestException
     *         A metering record has already been emitted by the same EC2 instance for the given {usageDimension,
     *         timestamp} with a different usageQuantity.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @sample AWSMarketplaceMetering.MeterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/MeterUsage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public MeterUsageResult meterUsage(MeterUsageRequest request) {
        request = beforeClientExecution(request);
        return executeMeterUsage(request);
    }

    @SdkInternalApi
    final MeterUsageResult executeMeterUsage(MeterUsageRequest meterUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(meterUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MeterUsageRequest> request = null;
        Response<MeterUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MeterUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(meterUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Metering");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MeterUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MeterUsageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new MeterUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
     * Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
     * containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to
     * call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports.
     * The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering
     * and entitlement.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Entitlement</i>: RegisterUsage allows you to verify that the customer running your paid software is subscribed
     * to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that
     * integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a
     * CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to
     * RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a
     * CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Metering</i>: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A
     * minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS
     * cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster
     * nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by
     * the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific
     * actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace
     * Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers
     * subscription state, removing the need for your software to perform entitlement checks at runtime.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerUsageRequest
     * @return Result of the RegisterUsage operation returned by the service.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidRegionException
     *         RegisterUsage must be called in the same AWS Region the ECS task was launched in. This prevents a
     *         container from hardcoding a Region (e.g. withRegion(“us-east-1”) when calling RegisterUsage.
     * @throws InvalidPublicKeyVersionException
     *         Public Key version is invalid.
     * @throws PlatformNotSupportedException
     *         AWS Marketplace does not support metering usage from the underlying platform. Currently, only Amazon ECS
     *         is supported.
     * @throws CustomerNotEntitledException
     *         Exception thrown when the customer does not have a valid subscription for the product.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.RegisterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterUsageResult registerUsage(RegisterUsageRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterUsage(request);
    }

    @SdkInternalApi
    final RegisterUsageResult executeRegisterUsage(RegisterUsageRequest registerUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(registerUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterUsageRequest> request = null;
        Response<RegisterUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Metering");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
     * during the registration process, the buyer submits a registration token through their browser. The registration
     * token is resolved through this API to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest
     *        Contains input to the ResolveCustomer operation.
     * @return Result of the ResolveCustomer operation returned by the service.
     * @throws InvalidTokenException
     *         Registration token is invalid.
     * @throws ExpiredTokenException
     *         The submitted registration token has expired. This can happen if the buyer's browser takes too long to
     *         redirect to your page, the buyer has resubmitted the registration token, or your application has held on
     *         to the registration token for too long. Your SaaS registration website should redeem this token as soon
     *         as it is submitted by the buyer's browser.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.ResolveCustomer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResolveCustomerResult resolveCustomer(ResolveCustomerRequest request) {
        request = beforeClientExecution(request);
        return executeResolveCustomer(request);
    }

    @SdkInternalApi
    final ResolveCustomerResult executeResolveCustomer(ResolveCustomerRequest resolveCustomerRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveCustomerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveCustomerRequest> request = null;
        Response<ResolveCustomerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveCustomerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resolveCustomerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Metering");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveCustomer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveCustomerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResolveCustomerResultJsonUnmarshaller());
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

}
