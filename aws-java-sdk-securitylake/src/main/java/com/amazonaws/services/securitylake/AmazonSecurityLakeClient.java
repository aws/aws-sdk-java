/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * Amazon Security Lake is in preview release. Your use of the Security Lake preview is subject to Section 2 of the <a
 * href="http://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a>("Betas and Previews").
 * </p>
 * </note>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Servicesaccount. Amazon Web Services Organizations is an account management service that lets you consolidate
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
 * or an Amazon Web Services service in Security Lake CloudTrail captures API calls for Security Lake as events. The
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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictSourceNamesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ConflictSourceNamesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.S3ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BucketNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.BucketNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictSubscriptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ConflictSubscriptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.AccountNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventBridgeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securitylake.model.transform.EventBridgeExceptionUnmarshaller.getInstance()))
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
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. At least
     * one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the
     * three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. When you don't provide a dimension, Security Lake assumes that
     * the missing dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API enables all Security Lake member accounts for all sources.
     * Similarly, when you do not specify Regions, Security Lake is enabled for all the Regions where Security Lake is
     * available as a service.
     * </p>
     * <p>
     * You can use this API only to enable natively supported Amazon Web Services as a source. Use
     * <code>CreateCustomLogSource</code> to enable data collection from a custom source.
     * </p>
     * 
     * @param createAwsLogSourceRequest
     * @return Result of the CreateAwsLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws S3Exception
     *         Provides an extension of the AmazonServiceException for errors reported by Amazon S3 while processing a
     *         request. In particular, this class provides access to the Amazon S3 extended request ID. If Amazon S3 is
     *         incorrectly handling a request and you need to contact Amazon, this extended request ID may provide
     *         useful debugging information.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * the custom source in addition to an associated Glue table and an Glue crawler.
     * </p>
     * 
     * @param createCustomLogSourceRequest
     * @return Result of the CreateCustomLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ConflictSourceNamesException
     *         There was a conflict when you attempted to modify a Security Lake source name.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * You can either use the <code>enableAll</code> parameter to specify all Regions or specify the Regions where you
     * want to enable Security Lake. To specify particular Regions, use the <code>Regions</code> parameter and then
     * configure these Regions using the <code>configurations</code> parameter. If you have already enabled Security
     * Lake in a Region when you call this command, the command will update the Region if you provide new configuration
     * parameters. If you have not already enabled Security Lake in the Region when you call this API, it will set up
     * the data lake in the Region with the specified configurations.
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
     * @param createDatalakeRequest
     * @return Result of the CreateDatalake operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.CreateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDatalakeResult createDatalake(CreateDatalakeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatalake(request);
    }

    @SdkInternalApi
    final CreateDatalakeResult executeCreateDatalake(CreateDatalakeRequest createDatalakeRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatalakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatalakeRequest> request = null;
        Response<CreateDatalakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatalakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatalakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatalake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatalakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatalakeResultJsonUnmarshaller());
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
     * @param createDatalakeAutoEnableRequest
     * @return Result of the CreateDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.CreateDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatalakeAutoEnableResult createDatalakeAutoEnable(CreateDatalakeAutoEnableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatalakeAutoEnable(request);
    }

    @SdkInternalApi
    final CreateDatalakeAutoEnableResult executeCreateDatalakeAutoEnable(CreateDatalakeAutoEnableRequest createDatalakeAutoEnableRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatalakeAutoEnableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatalakeAutoEnableRequest> request = null;
        Response<CreateDatalakeAutoEnableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatalakeAutoEnableRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDatalakeAutoEnableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatalakeAutoEnable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatalakeAutoEnableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDatalakeAutoEnableResultJsonUnmarshaller());
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
     * @param createDatalakeDelegatedAdminRequest
     * @return Result of the CreateDatalakeDelegatedAdmin operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @sample AmazonSecurityLake.CreateDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatalakeDelegatedAdminResult createDatalakeDelegatedAdmin(CreateDatalakeDelegatedAdminRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatalakeDelegatedAdmin(request);
    }

    @SdkInternalApi
    final CreateDatalakeDelegatedAdminResult executeCreateDatalakeDelegatedAdmin(CreateDatalakeDelegatedAdminRequest createDatalakeDelegatedAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatalakeDelegatedAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatalakeDelegatedAdminRequest> request = null;
        Response<CreateDatalakeDelegatedAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatalakeDelegatedAdminRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDatalakeDelegatedAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatalakeDelegatedAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatalakeDelegatedAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDatalakeDelegatedAdminResultJsonUnmarshaller());
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
     * @param createDatalakeExceptionsSubscriptionRequest
     * @return Result of the CreateDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.CreateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatalakeExceptionsSubscriptionResult createDatalakeExceptionsSubscription(CreateDatalakeExceptionsSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatalakeExceptionsSubscription(request);
    }

    @SdkInternalApi
    final CreateDatalakeExceptionsSubscriptionResult executeCreateDatalakeExceptionsSubscription(
            CreateDatalakeExceptionsSubscriptionRequest createDatalakeExceptionsSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatalakeExceptionsSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatalakeExceptionsSubscriptionRequest> request = null;
        Response<CreateDatalakeExceptionsSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatalakeExceptionsSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDatalakeExceptionsSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatalakeExceptionsSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatalakeExceptionsSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDatalakeExceptionsSubscriptionResultJsonUnmarshaller());
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
     * @throws ConflictSubscriptionException
     *         A conflicting subscription exception operation is in progress.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * Security Lake.
     * </p>
     * 
     * @param createSubscriptionNotificationConfigurationRequest
     * @return Result of the CreateSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.CreateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSubscriptionNotificationConfigurationResult createSubscriptionNotificationConfiguration(
            CreateSubscriptionNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriptionNotificationConfiguration(request);
    }

    @SdkInternalApi
    final CreateSubscriptionNotificationConfigurationResult executeCreateSubscriptionNotificationConfiguration(
            CreateSubscriptionNotificationConfigurationRequest createSubscriptionNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriptionNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionNotificationConfigurationRequest> request = null;
        Response<CreateSubscriptionNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionNotificationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSubscriptionNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscriptionNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriptionNotificationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSubscriptionNotificationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. When you remove the source,
     * Security Lake stops collecting data from that source, and subscribers can no longer consume new data from the
     * source. Subscribers can still consume data that Security Lake collected from the source before disablement.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API.
     * However, you can supply any combination of the three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API disables all Security Lake member accounts for sources.
     * Similarly, when you do not specify Regions, Security Lake is disabled for all the Regions where Security Lake is
     * available as a service.
     * </p>
     * <p>
     * When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set.
     * For example, if you don't provide specific accounts, the API applies to the entire set of accounts in your
     * organization.
     * </p>
     * 
     * @param deleteAwsLogSourceRequest
     * @return Result of the DeleteAwsLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * Removes a custom log source from Amazon Security Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @return Result of the DeleteCustomLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ConflictSourceNamesException
     *         There was a conflict when you attempted to modify a Security Lake source name.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * When you delete Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions. Also, this API automatically takes steps to remove the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeRequest
     * @return Result of the DeleteDatalake operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.DeleteDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDatalakeResult deleteDatalake(DeleteDatalakeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatalake(request);
    }

    @SdkInternalApi
    final DeleteDatalakeResult executeDeleteDatalake(DeleteDatalakeRequest deleteDatalakeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatalakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatalakeRequest> request = null;
        Response<DeleteDatalakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatalakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatalakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatalake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatalakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatalakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Automatically deletes Amazon Security Lake to stop collecting security data. When you delete Amazon Security Lake
     * from your account, Security Lake is disabled in all Regions. Also, this API automatically takes steps to remove
     * the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeAutoEnableRequest
     * @return Result of the DeleteDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatalakeAutoEnableResult deleteDatalakeAutoEnable(DeleteDatalakeAutoEnableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatalakeAutoEnable(request);
    }

    @SdkInternalApi
    final DeleteDatalakeAutoEnableResult executeDeleteDatalakeAutoEnable(DeleteDatalakeAutoEnableRequest deleteDatalakeAutoEnableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatalakeAutoEnableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatalakeAutoEnableRequest> request = null;
        Response<DeleteDatalakeAutoEnableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatalakeAutoEnableRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDatalakeAutoEnableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatalakeAutoEnable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatalakeAutoEnableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDatalakeAutoEnableResultJsonUnmarshaller());
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
     * @param deleteDatalakeDelegatedAdminRequest
     * @return Result of the DeleteDatalakeDelegatedAdmin operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @sample AmazonSecurityLake.DeleteDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatalakeDelegatedAdminResult deleteDatalakeDelegatedAdmin(DeleteDatalakeDelegatedAdminRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatalakeDelegatedAdmin(request);
    }

    @SdkInternalApi
    final DeleteDatalakeDelegatedAdminResult executeDeleteDatalakeDelegatedAdmin(DeleteDatalakeDelegatedAdminRequest deleteDatalakeDelegatedAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatalakeDelegatedAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatalakeDelegatedAdminRequest> request = null;
        Response<DeleteDatalakeDelegatedAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatalakeDelegatedAdminRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDatalakeDelegatedAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatalakeDelegatedAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatalakeDelegatedAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDatalakeDelegatedAdminResultJsonUnmarshaller());
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
     * @param deleteDatalakeExceptionsSubscriptionRequest
     * @return Result of the DeleteDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatalakeExceptionsSubscriptionResult deleteDatalakeExceptionsSubscription(DeleteDatalakeExceptionsSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatalakeExceptionsSubscription(request);
    }

    @SdkInternalApi
    final DeleteDatalakeExceptionsSubscriptionResult executeDeleteDatalakeExceptionsSubscription(
            DeleteDatalakeExceptionsSubscriptionRequest deleteDatalakeExceptionsSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatalakeExceptionsSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatalakeExceptionsSubscriptionRequest> request = null;
        Response<DeleteDatalakeExceptionsSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatalakeExceptionsSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDatalakeExceptionsSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatalakeExceptionsSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatalakeExceptionsSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDatalakeExceptionsSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete
     * a subscriber and remove access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * @param deleteSubscriptionNotificationConfigurationRequest
     * @return Result of the DeleteSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.DeleteSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSubscriptionNotificationConfigurationResult deleteSubscriptionNotificationConfiguration(
            DeleteSubscriptionNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriptionNotificationConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionNotificationConfigurationResult executeDeleteSubscriptionNotificationConfiguration(
            DeleteSubscriptionNotificationConfigurationRequest deleteSubscriptionNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionNotificationConfigurationRequest> request = null;
        Response<DeleteSubscriptionNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionNotificationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriptionNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriptionNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionNotificationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteSubscriptionNotificationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can
     * use the <code>GetDatalake</code> API to know whether Security Lake is enabled for the current Region. This API
     * does not take input parameters.
     * </p>
     * 
     * @param getDatalakeRequest
     * @return Result of the GetDatalake operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalake" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatalakeResult getDatalake(GetDatalakeRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatalake(request);
    }

    @SdkInternalApi
    final GetDatalakeResult executeGetDatalake(GetDatalakeRequest getDatalakeRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatalakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatalakeRequest> request = null;
        Response<GetDatalakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatalakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatalakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatalake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatalakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatalakeResultJsonUnmarshaller());
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
     * @param getDatalakeAutoEnableRequest
     * @return Result of the GetDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDatalakeAutoEnableResult getDatalakeAutoEnable(GetDatalakeAutoEnableRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatalakeAutoEnable(request);
    }

    @SdkInternalApi
    final GetDatalakeAutoEnableResult executeGetDatalakeAutoEnable(GetDatalakeAutoEnableRequest getDatalakeAutoEnableRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatalakeAutoEnableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatalakeAutoEnableRequest> request = null;
        Response<GetDatalakeAutoEnableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatalakeAutoEnableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatalakeAutoEnableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatalakeAutoEnable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatalakeAutoEnableResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetDatalakeAutoEnableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions
     * are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take
     * input parameters.
     * </p>
     * 
     * @param getDatalakeExceptionsExpiryRequest
     * @return Result of the GetDatalakeExceptionsExpiry operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDatalakeExceptionsExpiryResult getDatalakeExceptionsExpiry(GetDatalakeExceptionsExpiryRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatalakeExceptionsExpiry(request);
    }

    @SdkInternalApi
    final GetDatalakeExceptionsExpiryResult executeGetDatalakeExceptionsExpiry(GetDatalakeExceptionsExpiryRequest getDatalakeExceptionsExpiryRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatalakeExceptionsExpiryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatalakeExceptionsExpiryRequest> request = null;
        Response<GetDatalakeExceptionsExpiryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatalakeExceptionsExpiryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDatalakeExceptionsExpiryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatalakeExceptionsExpiry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatalakeExceptionsExpiryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDatalakeExceptionsExpiryResultJsonUnmarshaller());
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
     * @param getDatalakeExceptionsSubscriptionRequest
     * @return Result of the GetDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeExceptionsSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDatalakeExceptionsSubscriptionResult getDatalakeExceptionsSubscription(GetDatalakeExceptionsSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatalakeExceptionsSubscription(request);
    }

    @SdkInternalApi
    final GetDatalakeExceptionsSubscriptionResult executeGetDatalakeExceptionsSubscription(
            GetDatalakeExceptionsSubscriptionRequest getDatalakeExceptionsSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatalakeExceptionsSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatalakeExceptionsSubscriptionRequest> request = null;
        Response<GetDatalakeExceptionsSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatalakeExceptionsSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDatalakeExceptionsSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatalakeExceptionsSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatalakeExceptionsSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDatalakeExceptionsSubscriptionResultJsonUnmarshaller());
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
     * @param getDatalakeStatusRequest
     * @return Result of the GetDatalakeStatus operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDatalakeStatusResult getDatalakeStatus(GetDatalakeStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatalakeStatus(request);
    }

    @SdkInternalApi
    final GetDatalakeStatusResult executeGetDatalakeStatus(GetDatalakeStatusRequest getDatalakeStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatalakeStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatalakeStatusRequest> request = null;
        Response<GetDatalakeStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatalakeStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatalakeStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatalakeStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatalakeStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatalakeStatusResultJsonUnmarshaller());
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
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * @param listDatalakeExceptionsRequest
     * @return Result of the ListDatalakeExceptions operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.ListDatalakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDatalakeExceptionsResult listDatalakeExceptions(ListDatalakeExceptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatalakeExceptions(request);
    }

    @SdkInternalApi
    final ListDatalakeExceptionsResult executeListDatalakeExceptions(ListDatalakeExceptionsRequest listDatalakeExceptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatalakeExceptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatalakeExceptionsRequest> request = null;
        Response<ListDatalakeExceptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatalakeExceptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatalakeExceptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatalakeExceptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatalakeExceptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDatalakeExceptionsResultJsonUnmarshaller());
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
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDatalakeRequest
     * @return Result of the UpdateDatalake operation returned by the service.
     * @throws EventBridgeException
     *         Represents an error interacting with the Amazon EventBridge service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.UpdateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDatalakeResult updateDatalake(UpdateDatalakeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatalake(request);
    }

    @SdkInternalApi
    final UpdateDatalakeResult executeUpdateDatalake(UpdateDatalakeRequest updateDatalakeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatalakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatalakeRequest> request = null;
        Response<UpdateDatalakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatalakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatalakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatalake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatalakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatalakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL)
     * for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created
     * in Amazon Security Lake.
     * </p>
     * 
     * @param updateDatalakeExceptionsExpiryRequest
     * @return Result of the UpdateDatalakeExceptionsExpiry operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.UpdateDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDatalakeExceptionsExpiryResult updateDatalakeExceptionsExpiry(UpdateDatalakeExceptionsExpiryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatalakeExceptionsExpiry(request);
    }

    @SdkInternalApi
    final UpdateDatalakeExceptionsExpiryResult executeUpdateDatalakeExceptionsExpiry(UpdateDatalakeExceptionsExpiryRequest updateDatalakeExceptionsExpiryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatalakeExceptionsExpiryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatalakeExceptionsExpiryRequest> request = null;
        Response<UpdateDatalakeExceptionsExpiryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatalakeExceptionsExpiryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDatalakeExceptionsExpiryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatalakeExceptionsExpiry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatalakeExceptionsExpiryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDatalakeExceptionsExpiryResultJsonUnmarshaller());
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
     * @param updateDatalakeExceptionsSubscriptionRequest
     * @return Result of the UpdateDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.UpdateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDatalakeExceptionsSubscriptionResult updateDatalakeExceptionsSubscription(UpdateDatalakeExceptionsSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatalakeExceptionsSubscription(request);
    }

    @SdkInternalApi
    final UpdateDatalakeExceptionsSubscriptionResult executeUpdateDatalakeExceptionsSubscription(
            UpdateDatalakeExceptionsSubscriptionRequest updateDatalakeExceptionsSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatalakeExceptionsSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatalakeExceptionsSubscriptionRequest> request = null;
        Response<UpdateDatalakeExceptionsSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatalakeExceptionsSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDatalakeExceptionsSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatalakeExceptionsSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatalakeExceptionsSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDatalakeExceptionsSubscriptionResultJsonUnmarshaller());
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
     * @throws ConflictSubscriptionException
     *         A conflicting subscription exception operation is in progress.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * Creates a new subscription notification or adds the existing subscription notification setting for the specified
     * subscription ID.
     * </p>
     * 
     * @param updateSubscriptionNotificationConfigurationRequest
     * @return Result of the UpdateSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.UpdateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriptionNotificationConfigurationResult updateSubscriptionNotificationConfiguration(
            UpdateSubscriptionNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriptionNotificationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionNotificationConfigurationResult executeUpdateSubscriptionNotificationConfiguration(
            UpdateSubscriptionNotificationConfigurationRequest updateSubscriptionNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionNotificationConfigurationRequest> request = null;
        Response<UpdateSubscriptionNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionNotificationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriptionNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityLake");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriptionNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionNotificationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateSubscriptionNotificationConfigurationResultJsonUnmarshaller());
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
