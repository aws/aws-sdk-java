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
package com.amazonaws.services.route53recoveryreadiness;

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

import com.amazonaws.services.route53recoveryreadiness.AWSRoute53RecoveryReadinessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53recoveryreadiness.model.*;
import com.amazonaws.services.route53recoveryreadiness.model.transform.*;

/**
 * Client for accessing AWS Route53 Recovery Readiness. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Recovery readiness
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryReadinessClient extends AmazonWebServiceClient implements AWSRoute53RecoveryReadiness {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRoute53RecoveryReadiness.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53-recovery-readiness";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoveryreadiness.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53recoveryreadiness.model.AWSRoute53RecoveryReadinessException.class));

    public static AWSRoute53RecoveryReadinessClientBuilder builder() {
        return AWSRoute53RecoveryReadinessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Route53 Recovery Readiness using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryReadinessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Route53 Recovery Readiness using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryReadinessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("route53-recovery-readiness.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53recoveryreadiness/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53recoveryreadiness/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a cell in an account.
     * </p>
     * 
     * @param createCellRequest
     * @return Result of the CreateCell operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCellResult createCell(CreateCellRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCell(request);
    }

    @SdkInternalApi
    final CreateCellResult executeCreateCell(CreateCellRequest createCellRequest) {

        ExecutionContext executionContext = createExecutionContext(createCellRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCellRequest> request = null;
        Response<CreateCellResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCellRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCellRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCell");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCellResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCellResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53
     * Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
     * </p>
     * 
     * @param createCrossAccountAuthorizationRequest
     * @return Result of the CreateCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCrossAccountAuthorizationResult createCrossAccountAuthorization(CreateCrossAccountAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCrossAccountAuthorization(request);
    }

    @SdkInternalApi
    final CreateCrossAccountAuthorizationResult executeCreateCrossAccountAuthorization(
            CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createCrossAccountAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCrossAccountAuthorizationRequest> request = null;
        Response<CreateCrossAccountAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCrossAccountAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCrossAccountAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCrossAccountAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCrossAccountAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCrossAccountAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a
     * set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The
     * audits run once every minute on every resource that's associated with a readiness check.
     * </p>
     * 
     * @param createReadinessCheckRequest
     * @return Result of the CreateReadinessCheck operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateReadinessCheckResult createReadinessCheck(CreateReadinessCheckRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReadinessCheck(request);
    }

    @SdkInternalApi
    final CreateReadinessCheckResult executeCreateReadinessCheck(CreateReadinessCheckRequest createReadinessCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(createReadinessCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReadinessCheckRequest> request = null;
        Response<CreateReadinessCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReadinessCheckRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReadinessCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReadinessCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReadinessCheckResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReadinessCheckResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the
     * cells that make up the application.
     * </p>
     * 
     * @param createRecoveryGroupRequest
     * @return Result of the CreateRecoveryGroup operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRecoveryGroupResult createRecoveryGroup(CreateRecoveryGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRecoveryGroup(request);
    }

    @SdkInternalApi
    final CreateRecoveryGroupResult executeCreateRecoveryGroup(CreateRecoveryGroupRequest createRecoveryGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createRecoveryGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRecoveryGroupRequest> request = null;
        Response<CreateRecoveryGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRecoveryGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRecoveryGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRecoveryGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRecoveryGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRecoveryGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can
     * associate a resource set with a readiness check to monitor the resources for failover readiness.
     * </p>
     * 
     * @param createResourceSetRequest
     * @return Result of the CreateResourceSet operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResourceSetResult createResourceSet(CreateResourceSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourceSet(request);
    }

    @SdkInternalApi
    final CreateResourceSetResult executeCreateResourceSet(CreateResourceSetRequest createResourceSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceSetRequest> request = null;
        Response<CreateResourceSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourceSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a cell. When successful, the response code is 204, with no response body.
     * </p>
     * 
     * @param deleteCellRequest
     * @return Result of the DeleteCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCellResult deleteCell(DeleteCellRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCell(request);
    }

    @SdkInternalApi
    final DeleteCellResult executeDeleteCell(DeleteCellRequest deleteCellRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCellRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCellRequest> request = null;
        Response<DeleteCellResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCellRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCellRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCell");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCellResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCellResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes cross account readiness authorization.
     * </p>
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @return Result of the DeleteCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCrossAccountAuthorizationResult deleteCrossAccountAuthorization(DeleteCrossAccountAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCrossAccountAuthorization(request);
    }

    @SdkInternalApi
    final DeleteCrossAccountAuthorizationResult executeDeleteCrossAccountAuthorization(
            DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCrossAccountAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCrossAccountAuthorizationRequest> request = null;
        Response<DeleteCrossAccountAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCrossAccountAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCrossAccountAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCrossAccountAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCrossAccountAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCrossAccountAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a readiness check.
     * </p>
     * 
     * @param deleteReadinessCheckRequest
     * @return Result of the DeleteReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReadinessCheckResult deleteReadinessCheck(DeleteReadinessCheckRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReadinessCheck(request);
    }

    @SdkInternalApi
    final DeleteReadinessCheckResult executeDeleteReadinessCheck(DeleteReadinessCheckRequest deleteReadinessCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReadinessCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReadinessCheckRequest> request = null;
        Response<DeleteReadinessCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReadinessCheckRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReadinessCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReadinessCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReadinessCheckResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReadinessCheckResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a recovery group.
     * </p>
     * 
     * @param deleteRecoveryGroupRequest
     * @return Result of the DeleteRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRecoveryGroupResult deleteRecoveryGroup(DeleteRecoveryGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecoveryGroup(request);
    }

    @SdkInternalApi
    final DeleteRecoveryGroupResult executeDeleteRecoveryGroup(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecoveryGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecoveryGroupRequest> request = null;
        Response<DeleteRecoveryGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecoveryGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRecoveryGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecoveryGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecoveryGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRecoveryGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource set.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @return Result of the DeleteResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourceSetResult deleteResourceSet(DeleteResourceSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceSet(request);
    }

    @SdkInternalApi
    final DeleteResourceSetResult executeDeleteResourceSet(DeleteResourceSetRequest deleteResourceSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceSetRequest> request = null;
        Response<DeleteResourceSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery
     * group.
     * </p>
     * 
     * @param getArchitectureRecommendationsRequest
     * @return Result of the GetArchitectureRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetArchitectureRecommendationsResult getArchitectureRecommendations(GetArchitectureRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchitectureRecommendations(request);
    }

    @SdkInternalApi
    final GetArchitectureRecommendationsResult executeGetArchitectureRecommendations(GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchitectureRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchitectureRecommendationsRequest> request = null;
        Response<GetArchitectureRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchitectureRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getArchitectureRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchitectureRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchitectureRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetArchitectureRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this
     * cell, and a list of those cell ARNs with their associated recovery group ARNs.
     * </p>
     * 
     * @param getCellRequest
     * @return Result of the GetCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCellResult getCell(GetCellRequest request) {
        request = beforeClientExecution(request);
        return executeGetCell(request);
    }

    @SdkInternalApi
    final GetCellResult executeGetCell(GetCellRequest getCellRequest) {

        ExecutionContext executionContext = createExecutionContext(getCellRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCellRequest> request = null;
        Response<GetCellResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCellRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCellRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCell");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCellResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCellResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a
     * single value.
     * </p>
     * 
     * @param getCellReadinessSummaryRequest
     * @return Result of the GetCellReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCellReadinessSummaryResult getCellReadinessSummary(GetCellReadinessSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetCellReadinessSummary(request);
    }

    @SdkInternalApi
    final GetCellReadinessSummaryResult executeGetCellReadinessSummary(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getCellReadinessSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCellReadinessSummaryRequest> request = null;
        Response<GetCellReadinessSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCellReadinessSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCellReadinessSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCellReadinessSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCellReadinessSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCellReadinessSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a readiness check.
     * </p>
     * 
     * @param getReadinessCheckRequest
     * @return Result of the GetReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReadinessCheckResult getReadinessCheck(GetReadinessCheckRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadinessCheck(request);
    }

    @SdkInternalApi
    final GetReadinessCheckResult executeGetReadinessCheck(GetReadinessCheckRequest getReadinessCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadinessCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadinessCheckRequest> request = null;
        Response<GetReadinessCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadinessCheckRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReadinessCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadinessCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadinessCheckResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReadinessCheckResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group,
     * that considers the readiness status for all the readiness checks in the recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @return Result of the GetReadinessCheckResourceStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReadinessCheckResourceStatusResult getReadinessCheckResourceStatus(GetReadinessCheckResourceStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadinessCheckResourceStatus(request);
    }

    @SdkInternalApi
    final GetReadinessCheckResourceStatusResult executeGetReadinessCheckResourceStatus(
            GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadinessCheckResourceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadinessCheckResourceStatusRequest> request = null;
        Response<GetReadinessCheckResourceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadinessCheckResourceStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReadinessCheckResourceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadinessCheckResourceStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadinessCheckResourceStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReadinessCheckResourceStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery
     * group, that considers the readiness status for all the readiness checks in a recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckStatusRequest
     * @return Result of the GetReadinessCheckStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReadinessCheckStatusResult getReadinessCheckStatus(GetReadinessCheckStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadinessCheckStatus(request);
    }

    @SdkInternalApi
    final GetReadinessCheckStatusResult executeGetReadinessCheckStatus(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadinessCheckStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadinessCheckStatusRequest> request = null;
        Response<GetReadinessCheckStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadinessCheckStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReadinessCheckStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadinessCheckStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadinessCheckStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReadinessCheckStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a recovery group, including a list of the cells that are included in it.
     * </p>
     * 
     * @param getRecoveryGroupRequest
     * @return Result of the GetRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecoveryGroupResult getRecoveryGroup(GetRecoveryGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecoveryGroup(request);
    }

    @SdkInternalApi
    final GetRecoveryGroupResult executeGetRecoveryGroup(GetRecoveryGroupRequest getRecoveryGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecoveryGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecoveryGroupRequest> request = null;
        Response<GetRecoveryGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecoveryGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecoveryGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecoveryGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecoveryGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecoveryGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for
     * resources in the recovery group and the readiness status of each one.
     * </p>
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @return Result of the GetRecoveryGroupReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecoveryGroupReadinessSummaryResult getRecoveryGroupReadinessSummary(GetRecoveryGroupReadinessSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecoveryGroupReadinessSummary(request);
    }

    @SdkInternalApi
    final GetRecoveryGroupReadinessSummaryResult executeGetRecoveryGroupReadinessSummary(
            GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecoveryGroupReadinessSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecoveryGroupReadinessSummaryRequest> request = null;
        Response<GetRecoveryGroupReadinessSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecoveryGroupReadinessSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecoveryGroupReadinessSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecoveryGroupReadinessSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecoveryGroupReadinessSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecoveryGroupReadinessSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the details about a resource set, including a list of the resources in the set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @return Result of the GetResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceSetResult getResourceSet(GetResourceSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceSet(request);
    }

    @SdkInternalApi
    final GetResourceSetResult executeGetResourceSet(GetResourceSetRequest getResourceSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceSetRequest> request = null;
        Response<GetResourceSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the cells for an account.
     * </p>
     * 
     * @param listCellsRequest
     * @return Result of the ListCells operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCellsResult listCells(ListCellsRequest request) {
        request = beforeClientExecution(request);
        return executeListCells(request);
    }

    @SdkInternalApi
    final ListCellsResult executeListCells(ListCellsRequest listCellsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCellsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCellsRequest> request = null;
        Response<ListCellsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCellsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCellsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCells");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCellsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCellsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the cross-account readiness authorizations that are in place for an account.
     * </p>
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @return Result of the ListCrossAccountAuthorizations operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCrossAccountAuthorizationsResult listCrossAccountAuthorizations(ListCrossAccountAuthorizationsRequest request) {
        request = beforeClientExecution(request);
        return executeListCrossAccountAuthorizations(request);
    }

    @SdkInternalApi
    final ListCrossAccountAuthorizationsResult executeListCrossAccountAuthorizations(ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCrossAccountAuthorizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCrossAccountAuthorizationsRequest> request = null;
        Response<ListCrossAccountAuthorizationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCrossAccountAuthorizationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCrossAccountAuthorizationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCrossAccountAuthorizations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCrossAccountAuthorizationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCrossAccountAuthorizationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the readiness checks for an account.
     * </p>
     * 
     * @param listReadinessChecksRequest
     * @return Result of the ListReadinessChecks operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReadinessChecksResult listReadinessChecks(ListReadinessChecksRequest request) {
        request = beforeClientExecution(request);
        return executeListReadinessChecks(request);
    }

    @SdkInternalApi
    final ListReadinessChecksResult executeListReadinessChecks(ListReadinessChecksRequest listReadinessChecksRequest) {

        ExecutionContext executionContext = createExecutionContext(listReadinessChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReadinessChecksRequest> request = null;
        Response<ListReadinessChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReadinessChecksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReadinessChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReadinessChecks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReadinessChecksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReadinessChecksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the recovery groups in an account.
     * </p>
     * 
     * @param listRecoveryGroupsRequest
     * @return Result of the ListRecoveryGroups operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecoveryGroupsResult listRecoveryGroups(ListRecoveryGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecoveryGroups(request);
    }

    @SdkInternalApi
    final ListRecoveryGroupsResult executeListRecoveryGroups(ListRecoveryGroupsRequest listRecoveryGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecoveryGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryGroupsRequest> request = null;
        Response<ListRecoveryGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecoveryGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecoveryGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecoveryGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecoveryGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource sets in an account.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @return Result of the ListResourceSets operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceSetsResult listResourceSets(ListResourceSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceSets(request);
    }

    @SdkInternalApi
    final ListResourceSetsResult executeListResourceSets(ListResourceSetsRequest listResourceSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceSetsRequest> request = null;
        Response<ListResourceSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all readiness rules, or lists the readiness rules for a specific resource type.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListRules(request);
    }

    @SdkInternalApi
    final ListRulesResult executeListRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     * @return Result of the ListTagsForResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResources(request);
    }

    @SdkInternalApi
    final ListTagsForResourcesResult executeListTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourcesRequest> request = null;
        Response<ListTagsForResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
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
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
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
     * Updates a cell to replace the list of nested cells with a new list of nested cells.
     * </p>
     * 
     * @param updateCellRequest
     * @return Result of the UpdateCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCellResult updateCell(UpdateCellRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCell(request);
    }

    @SdkInternalApi
    final UpdateCellResult executeUpdateCell(UpdateCellRequest updateCellRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCellRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCellRequest> request = null;
        Response<UpdateCellResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCellRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCellRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCell");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCellResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCellResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a readiness check.
     * </p>
     * 
     * @param updateReadinessCheckRequest
     *        Name of a readiness check to describe.
     * @return Result of the UpdateReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReadinessCheckResult updateReadinessCheck(UpdateReadinessCheckRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReadinessCheck(request);
    }

    @SdkInternalApi
    final UpdateReadinessCheckResult executeUpdateReadinessCheck(UpdateReadinessCheckRequest updateReadinessCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReadinessCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReadinessCheckRequest> request = null;
        Response<UpdateReadinessCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReadinessCheckRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReadinessCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReadinessCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReadinessCheckResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReadinessCheckResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a recovery group.
     * </p>
     * 
     * @param updateRecoveryGroupRequest
     *        Name of a recovery group.
     * @return Result of the UpdateRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRecoveryGroupResult updateRecoveryGroup(UpdateRecoveryGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecoveryGroup(request);
    }

    @SdkInternalApi
    final UpdateRecoveryGroupResult executeUpdateRecoveryGroup(UpdateRecoveryGroupRequest updateRecoveryGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecoveryGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecoveryGroupRequest> request = null;
        Response<UpdateRecoveryGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecoveryGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRecoveryGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecoveryGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecoveryGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRecoveryGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a resource set.
     * </p>
     * 
     * @param updateResourceSetRequest
     *        Name of a resource set.
     * @return Result of the UpdateResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourceSetResult updateResourceSet(UpdateResourceSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceSet(request);
    }

    @SdkInternalApi
    final UpdateResourceSetResult executeUpdateResourceSet(UpdateResourceSetRequest updateResourceSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceSetRequest> request = null;
        Response<UpdateResourceSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Readiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceSetResultJsonUnmarshaller());
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
