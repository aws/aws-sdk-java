/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake;

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

import com.amazonaws.services.securitylake.AmazonSecurityLakeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.services.securitylake.model.transform.*;

/**
 * Client for accessing Amazon Security Lake. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Services account. Amazon Web Services Organizations is an account management service that lets you consolidate
 * multiple Amazon Web Services accounts into an organization that you create and centrally manage. With Organizations,
 * you can create member accounts and invite existing accounts to join your organization. Security Lake helps you
 * analyze security data for a more complete understanding of your security posture across the entire organization. It
 * can also help you improve the protection of your workloads, applications, and data.
 * </p>
 * <p>
 * The data lake is backed by Amazon Simple Storage Service (Amazon S3) buckets, and you retain ownership over your
 * data.
 * </p>
 * <p>
 * Amazon Security Lake integrates with CloudTrail, a service that provides a record of actions taken by a user, role,
 * or an Amazon Web Services service. In Security Lake, CloudTrail captures API calls for Security Lake as events. The
 * calls captured include calls from the Security Lake console and code calls to the Security Lake API operations. If
 * you create a trail, you can enable continuous delivery of CloudTrail events to an Amazon S3 bucket, including events
 * for Security Lake. If you don't configure a trail, you can still view the most recent events in the CloudTrail
 * console in Event history. Using the information collected by CloudTrail you can determine the request that was made
 * to Security Lake, the IP address from which the request was made, who made the request, when it was made, and
 * additional details. To learn more about Security Lake information in CloudTrail, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/securitylake-cloudtrail.html">Amazon Security Lake
 * User Guide</a>.
 * </p>
 * <p>
 * Security Lake automates the collection of security-related log and event data from integrated Amazon Web Services and
 * third-party services. It also helps you manage the lifecycle of data with customizable retention and replication
 * settings. Security Lake converts ingested data into Apache Parquet format and a standard open-source schema called
 * the Open Cybersecurity Schema Framework (OCSF).
 * </p>
 * <p>
 * Other Amazon Web Services and third-party services can subscribe to the data that's stored in Security Lake for
 * incident response and security data analytics.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSecurityLakeClient extends AmazonWebServiceClient implements AmazonSecurityLake {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSecurityLake.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "securitylake";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.securitylake.model.AmazonSecurityLakeException.class));

    public static AmazonSecurityLakeClientBuilder builder() {
        return AmazonSecurityLakeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Security Lake using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSecurityLakeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Security Lake using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSecurityLakeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("securitylake.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/securitylake/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/securitylake/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a natively supported Amazon Web Service as an Amazon Security Lake source. Enables source types for member
     * accounts in required Amazon Web Services Regions, based on the parameters you specify. You can choose any source
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. Once you
     * add an Amazon Web Service as a source, Security Lake starts collecting logs and events from it.
     * </p>
     * <p>
     * You can use this API only to enable natively supported Amazon Web Services as a source. Use
     * <code>CreateCustomLogSource</code> to enable data collection from a custom source.
     * </p>
     * 
     * @param createAwsLogSourceRequest
     * @return Result of the CreateAwsLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAwsLogSourceResult createAwsLogSource(CreateAwsLogSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAwsLogSource(request);
    }

    @SdkInternalApi
    final CreateAwsLogSourceResult executeCreateAwsLogSource(CreateAwsLogSourceRequest createAwsLogSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createAwsLogSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAwsLogSourceRequest> request = null;
        Response<CreateAwsLogSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAwsLogSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAwsLogSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAwsLogSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAwsLogSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAwsLogSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a third-party custom source in Amazon Security Lake, from the Amazon Web Services Region where you want to
     * create a custom source. Security Lake can collect logs and events from third-party custom sources. After creating
     * the appropriate IAM role to invoke Glue crawler, use this API to add a custom source name in Security Lake. This
     * operation creates a partition in the Amazon S3 bucket for Security Lake as the target location for log files from
     * the custom source. In addition, this operation also creates an associated Glue table and an Glue crawler.
     * </p>
     * 
     * @param createCustomLogSourceRequest
     * @return Result of the CreateCustomLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomLogSourceResult createCustomLogSource(CreateCustomLogSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomLogSource(request);
    }

    @SdkInternalApi
    final CreateCustomLogSourceResult executeCreateCustomLogSource(CreateCustomLogSourceRequest createCustomLogSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomLogSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomLogSourceRequest> request = null;
        Response<CreateCustomLogSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomLogSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomLogSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomLogSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomLogSourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateCustomLogSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable
     * Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions.
     * To specify particular Regions, configure these Regions using the <code>configurations</code> parameter. If you
     * have already enabled Security Lake in a Region when you call this command, the command will update the Region if
     * you provide new configuration parameters. If you have not already enabled Security Lake in the Region when you
     * call this API, it will set up the data lake in the Region with the specified configurations.
     * </p>
     * <p>
     * When you enable Security Lake, it starts ingesting security data after the <code>CreateAwsLogSource</code> call.
     * This includes ingesting security data from sources, storing data, and making data accessible to subscribers.
     * Security Lake also enables all the existing settings and resources that it stores or maintains for your Amazon
     * Web Services account in the current Region, including security log and event data. For more information, see the
     * <a href="https://docs.aws.amazon.com/security-lake/latest/userguide/what-is-security-lake.html">Amazon Security
     * Lake User Guide</a>.
     * </p>
     * 
     * @param createDataLakeRequest
     * @return Result of the CreateDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDataLakeResult createDataLake(CreateDataLakeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataLake(request);
    }

    @SdkInternalApi
    final CreateDataLakeResult executeCreateDataLake(CreateDataLakeRequest createDataLakeRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataLakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataLakeRequest> request = null;
        Response<CreateDataLakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataLakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataLakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataLake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataLakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataLakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDataLakeExceptionSubscriptionRequest
     * @return Result of the CreateDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDataLakeExceptionSubscriptionResult createDataLakeExceptionSubscription(CreateDataLakeExceptionSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataLakeExceptionSubscription(request);
    }

    @SdkInternalApi
    final CreateDataLakeExceptionSubscriptionResult executeCreateDataLakeExceptionSubscription(
            CreateDataLakeExceptionSubscriptionRequest createDataLakeExceptionSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataLakeExceptionSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataLakeExceptionSubscriptionRequest> request = null;
        Response<CreateDataLakeExceptionSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataLakeExceptionSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataLakeExceptionSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataLakeExceptionSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataLakeExceptionSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataLakeExceptionSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDataLakeOrganizationConfigurationRequest
     * @return Result of the CreateDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDataLakeOrganizationConfigurationResult createDataLakeOrganizationConfiguration(CreateDataLakeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataLakeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final CreateDataLakeOrganizationConfigurationResult executeCreateDataLakeOrganizationConfiguration(
            CreateDataLakeOrganizationConfigurationRequest createDataLakeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataLakeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataLakeOrganizationConfigurationRequest> request = null;
        Response<CreateDataLakeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataLakeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataLakeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataLakeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataLakeOrganizationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDataLakeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a
     * subscriber with access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param createSubscriberRequest
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSubscriberResult createSubscriber(CreateSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriber(request);
    }

    @SdkInternalApi
    final CreateSubscriberResult executeCreateSubscriber(CreateSubscriberRequest createSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriberRequest> request = null;
        Response<CreateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake. You can create only one subscriber notification per subscriber.
     * </p>
     * 
     * @param createSubscriberNotificationRequest
     * @return Result of the CreateSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSubscriberNotificationResult createSubscriberNotification(CreateSubscriberNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriberNotification(request);
    }

    @SdkInternalApi
    final CreateSubscriberNotificationResult executeCreateSubscriberNotification(CreateSubscriberNotificationRequest createSubscriberNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriberNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriberNotificationRequest> request = null;
        Response<CreateSubscriberNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriberNotificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSubscriberNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriberNotification");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriberNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSubscriberNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. You can remove a source for
     * one or more Regions. When you remove the source, Security Lake stops collecting data from that source in the
     * specified Regions and accounts, and subscribers can no longer consume new data from the source. However,
     * subscribers can still consume data that Security Lake collected from the source before removal.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts.
     * </p>
     * 
     * @param deleteAwsLogSourceRequest
     * @return Result of the DeleteAwsLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAwsLogSourceResult deleteAwsLogSource(DeleteAwsLogSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAwsLogSource(request);
    }

    @SdkInternalApi
    final DeleteAwsLogSourceResult executeDeleteAwsLogSource(DeleteAwsLogSourceRequest deleteAwsLogSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAwsLogSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAwsLogSourceRequest> request = null;
        Response<DeleteAwsLogSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAwsLogSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAwsLogSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAwsLogSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAwsLogSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAwsLogSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a custom log source from Amazon Security Lake, to stop sending data from the custom source to Security
     * Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @return Result of the DeleteCustomLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomLogSourceResult deleteCustomLogSource(DeleteCustomLogSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomLogSource(request);
    }

    @SdkInternalApi
    final DeleteCustomLogSourceResult executeDeleteCustomLogSource(DeleteCustomLogSourceRequest deleteCustomLogSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomLogSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomLogSourceRequest> request = null;
        Response<DeleteCustomLogSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomLogSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomLogSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomLogSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomLogSourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteCustomLogSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you disable Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions and it stops collecting data from your sources. Also, this API automatically takes steps to remove the
     * account from Security Lake. However, Security Lake retains all of your existing settings and the resources that
     * it created in your Amazon Web Services account in the current Amazon Web Services Region.
     * </p>
     * <p>
     * The <code>DeleteDataLake</code> operation does not delete the data that is stored in your Amazon S3 bucket, which
     * is owned by your Amazon Web Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDataLakeRequest
     * @return Result of the DeleteDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDataLakeResult deleteDataLake(DeleteDataLakeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataLake(request);
    }

    @SdkInternalApi
    final DeleteDataLakeResult executeDeleteDataLake(DeleteDataLakeRequest deleteDataLakeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataLakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataLakeRequest> request = null;
        Response<DeleteDataLakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataLakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataLakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataLake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataLakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataLakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDataLakeExceptionSubscriptionRequest
     * @return Result of the DeleteDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataLakeExceptionSubscriptionResult deleteDataLakeExceptionSubscription(DeleteDataLakeExceptionSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataLakeExceptionSubscription(request);
    }

    @SdkInternalApi
    final DeleteDataLakeExceptionSubscriptionResult executeDeleteDataLakeExceptionSubscription(
            DeleteDataLakeExceptionSubscriptionRequest deleteDataLakeExceptionSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataLakeExceptionSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataLakeExceptionSubscriptionRequest> request = null;
        Response<DeleteDataLakeExceptionSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataLakeExceptionSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDataLakeExceptionSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataLakeExceptionSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataLakeExceptionSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDataLakeExceptionSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Turns off automatic enablement of Amazon Security Lake for member accounts that are added to an organization in
     * Organizations. Only the delegated Security Lake administrator for an organization can perform this operation. If
     * the delegated Security Lake administrator performs this operation, new member accounts won't automatically
     * contribute data to the data lake.
     * </p>
     * 
     * @param deleteDataLakeOrganizationConfigurationRequest
     * @return Result of the DeleteDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataLakeOrganizationConfigurationResult deleteDataLakeOrganizationConfiguration(DeleteDataLakeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataLakeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final DeleteDataLakeOrganizationConfigurationResult executeDeleteDataLakeOrganizationConfiguration(
            DeleteDataLakeOrganizationConfigurationRequest deleteDataLakeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataLakeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataLakeOrganizationConfigurationRequest> request = null;
        Response<DeleteDataLakeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataLakeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDataLakeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataLakeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataLakeOrganizationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDataLakeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the subscription permission and all notification settings for accounts that are already enabled in Amazon
     * Security Lake. When you run <code>DeleteSubscriber</code>, the subscriber will no longer consume data from
     * Security Lake and the subscriber is removed. This operation deletes the subscriber and removes access to data in
     * the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriber(request);
    }

    @SdkInternalApi
    final DeleteSubscriberResult executeDeleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriberRequest> request = null;
        Response<DeleteSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteSubscriberNotificationRequest
     * @return Result of the DeleteSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSubscriberNotificationResult deleteSubscriberNotification(DeleteSubscriberNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriberNotification(request);
    }

    @SdkInternalApi
    final DeleteSubscriberNotificationResult executeDeleteSubscriberNotification(DeleteSubscriberNotificationRequest deleteSubscriberNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriberNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriberNotificationRequest> request = null;
        Response<DeleteSubscriberNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriberNotificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriberNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriberNotification");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriberNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSubscriberNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deregisterDataLakeDelegatedAdministratorRequest
     * @return Result of the DeregisterDataLakeDelegatedAdministrator operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeregisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeregisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterDataLakeDelegatedAdministratorResult deregisterDataLakeDelegatedAdministrator(DeregisterDataLakeDelegatedAdministratorRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterDataLakeDelegatedAdministrator(request);
    }

    @SdkInternalApi
    final DeregisterDataLakeDelegatedAdministratorResult executeDeregisterDataLakeDelegatedAdministrator(
            DeregisterDataLakeDelegatedAdministratorRequest deregisterDataLakeDelegatedAdministratorRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterDataLakeDelegatedAdministratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterDataLakeDelegatedAdministratorRequest> request = null;
        Response<DeregisterDataLakeDelegatedAdministratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterDataLakeDelegatedAdministratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterDataLakeDelegatedAdministratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterDataLakeDelegatedAdministrator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterDataLakeDelegatedAdministratorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeregisterDataLakeDelegatedAdministratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDataLakeExceptionSubscriptionRequest
     * @return Result of the GetDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataLakeExceptionSubscriptionResult getDataLakeExceptionSubscription(GetDataLakeExceptionSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataLakeExceptionSubscription(request);
    }

    @SdkInternalApi
    final GetDataLakeExceptionSubscriptionResult executeGetDataLakeExceptionSubscription(
            GetDataLakeExceptionSubscriptionRequest getDataLakeExceptionSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataLakeExceptionSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataLakeExceptionSubscriptionRequest> request = null;
        Response<GetDataLakeExceptionSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataLakeExceptionSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDataLakeExceptionSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataLakeExceptionSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataLakeExceptionSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDataLakeExceptionSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDataLakeOrganizationConfigurationRequest
     * @return Result of the GetDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataLakeOrganizationConfigurationResult getDataLakeOrganizationConfiguration(GetDataLakeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataLakeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final GetDataLakeOrganizationConfigurationResult executeGetDataLakeOrganizationConfiguration(
            GetDataLakeOrganizationConfigurationRequest getDataLakeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataLakeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataLakeOrganizationConfigurationRequest> request = null;
        Response<GetDataLakeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataLakeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDataLakeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataLakeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataLakeOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDataLakeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDataLakeSourcesRequest
     * @return Result of the GetDataLakeSources operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataLakeSourcesResult getDataLakeSources(GetDataLakeSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataLakeSources(request);
    }

    @SdkInternalApi
    final GetDataLakeSourcesResult executeGetDataLakeSources(GetDataLakeSourcesRequest getDataLakeSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataLakeSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataLakeSourcesRequest> request = null;
        Response<GetDataLakeSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataLakeSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataLakeSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataLakeSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataLakeSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataLakeSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the subscription information for the specified subscription ID. You can get information about a
     * specific subscriber.
     * </p>
     * 
     * @param getSubscriberRequest
     * @return Result of the GetSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetSubscriber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSubscriberResult getSubscriber(GetSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriber(request);
    }

    @SdkInternalApi
    final GetSubscriberResult executeGetSubscriber(GetSubscriberRequest getSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriberRequest> request = null;
        Response<GetSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
     * </p>
     * 
     * @param listDataLakeExceptionsRequest
     * @return Result of the ListDataLakeExceptions operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListDataLakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataLakeExceptionsResult listDataLakeExceptions(ListDataLakeExceptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataLakeExceptions(request);
    }

    @SdkInternalApi
    final ListDataLakeExceptionsResult executeListDataLakeExceptions(ListDataLakeExceptionsRequest listDataLakeExceptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataLakeExceptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataLakeExceptionsRequest> request = null;
        Response<ListDataLakeExceptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataLakeExceptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataLakeExceptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataLakeExceptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataLakeExceptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataLakeExceptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services Regions. You can
     * use this operation to determine whether Security Lake is enabled for a Region.
     * </p>
     * 
     * @param listDataLakesRequest
     * @return Result of the ListDataLakes operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListDataLakes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataLakesResult listDataLakes(ListDataLakesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataLakes(request);
    }

    @SdkInternalApi
    final ListDataLakesResult executeListDataLakes(ListDataLakesRequest listDataLakesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataLakesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataLakesRequest> request = null;
        Response<ListDataLakesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataLakesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataLakesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataLakes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataLakesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataLakesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the log sources in the current Amazon Web Services Region.
     * </p>
     * 
     * @param listLogSourcesRequest
     * @return Result of the ListLogSources operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListLogSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLogSourcesResult listLogSources(ListLogSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListLogSources(request);
    }

    @SdkInternalApi
    final ListLogSourcesResult executeListLogSources(ListLogSourcesRequest listLogSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLogSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLogSourcesRequest> request = null;
        Response<ListLogSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLogSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLogSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLogSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLogSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLogSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions
     * associated with a specific organization or Amazon Web Services account.
     * </p>
     * 
     * @param listSubscribersRequest
     * @return Result of the ListSubscribers operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListSubscribers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSubscribersResult listSubscribers(ListSubscribersRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscribers(request);
    }

    @SdkInternalApi
    final ListSubscribersResult executeListSubscribers(ListSubscribersRequest listSubscribersRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscribersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscribersRequest> request = null;
        Response<ListSubscribersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscribersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSubscribersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscribers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubscribersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSubscribersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Security Lake resource: a subscriber, or
     * the data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param registerDataLakeDelegatedAdministratorRequest
     * @return Result of the RegisterDataLakeDelegatedAdministrator operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.RegisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/RegisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterDataLakeDelegatedAdministratorResult registerDataLakeDelegatedAdministrator(RegisterDataLakeDelegatedAdministratorRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterDataLakeDelegatedAdministrator(request);
    }

    @SdkInternalApi
    final RegisterDataLakeDelegatedAdministratorResult executeRegisterDataLakeDelegatedAdministrator(
            RegisterDataLakeDelegatedAdministratorRequest registerDataLakeDelegatedAdministratorRequest) {

        ExecutionContext executionContext = createExecutionContext(registerDataLakeDelegatedAdministratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDataLakeDelegatedAdministratorRequest> request = null;
        Response<RegisterDataLakeDelegatedAdministratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDataLakeDelegatedAdministratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerDataLakeDelegatedAdministratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterDataLakeDelegatedAdministrator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterDataLakeDelegatedAdministratorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RegisterDataLakeDelegatedAdministratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates one or more tags that are associated with an Amazon Security Lake resource: a subscriber, or the
     * data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region. A
     * <i>tag</i> is a label that you can define and associate with Amazon Web Services resources. Each tag consists of
     * a required <i>tag key</i> and an associated <i>tag value</i>. A <i>tag key</i> is a general label that acts as a
     * category for a more specific tag value. A <i>tag value</i> acts as a descriptor for a tag key. Tags can help you
     * identify, categorize, and manage resources in different ways, such as by owner, environment, or other criteria.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/tagging-resources.html">Tagging Amazon Security
     * Lake resources</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
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
     * Removes one or more tags (keys and values) from an Amazon Security Lake resource: a subscriber, or the data lake
     * configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
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
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDataLakeRequest
     * @return Result of the UpdateDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDataLakeResult updateDataLake(UpdateDataLakeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataLake(request);
    }

    @SdkInternalApi
    final UpdateDataLakeResult executeUpdateDataLake(UpdateDataLakeRequest updateDataLakeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataLakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataLakeRequest> request = null;
        Response<UpdateDataLakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataLakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataLakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataLake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataLakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataLakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDataLakeExceptionSubscriptionRequest
     * @return Result of the UpdateDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataLakeExceptionSubscriptionResult updateDataLakeExceptionSubscription(UpdateDataLakeExceptionSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataLakeExceptionSubscription(request);
    }

    @SdkInternalApi
    final UpdateDataLakeExceptionSubscriptionResult executeUpdateDataLakeExceptionSubscription(
            UpdateDataLakeExceptionSubscriptionRequest updateDataLakeExceptionSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataLakeExceptionSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataLakeExceptionSubscriptionRequest> request = null;
        Response<UpdateDataLakeExceptionSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataLakeExceptionSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDataLakeExceptionSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataLakeExceptionSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataLakeExceptionSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDataLakeExceptionSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by
     * changing the sources that the subscriber consumes data from.
     * </p>
     * 
     * @param updateSubscriberRequest
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriber(request);
    }

    @SdkInternalApi
    final UpdateSubscriberResult executeUpdateSubscriber(UpdateSubscriberRequest updateSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriberRequest> request = null;
        Response<UpdateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification
     * subscription endpoint for a subscriber.
     * </p>
     * 
     * @param updateSubscriberNotificationRequest
     * @return Result of the UpdateSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriberNotificationResult updateSubscriberNotification(UpdateSubscriberNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriberNotification(request);
    }

    @SdkInternalApi
    final UpdateSubscriberNotificationResult executeUpdateSubscriberNotification(UpdateSubscriberNotificationRequest updateSubscriberNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriberNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriberNotificationRequest> request = null;
        Response<UpdateSubscriberNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriberNotificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriberNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriberNotification");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriberNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubscriberNotificationResultJsonUnmarshaller());
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
