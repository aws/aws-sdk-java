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
package com.amazonaws.services.chime;

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

import com.amazonaws.services.chime.AmazonChimeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.services.chime.model.transform.*;

/**
 * Client for accessing Amazon Chime. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The Amazon Chime API (application programming interface) is designed for administrators to use to perform key tasks,
 * such as creating and managing Amazon Chime accounts and users. This guide provides detailed information about the
 * Amazon Chime API, including operations, types, inputs and outputs, and error codes.
 * </p>
 * <p>
 * You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST API to make API calls. We recommend
 * using an AWS SDK or the AWS CLI. Each API operation includes links to information about using it with a
 * language-specific AWS SDK or the AWS CLI.
 * </p>
 * <dl>
 * <dt>Using an AWS SDK</dt>
 * <dd>
 * <p>
 * You don't need to write code to calculate a signature for request authentication. The SDK clients authenticate your
 * requests by using access keys that you provide. For more information about AWS SDKs, see the <a
 * href="http://aws.amazon.com/developer/">AWS Developer Center</a>.
 * </p>
 * </dd>
 * <dt>Using the AWS CLI</dt>
 * <dd>
 * <p>
 * Use your access keys with the AWS CLI to make API calls. For information about setting up the AWS CLI, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/installing.html">Installing the AWS Command Line Interface</a>
 * in the <i>AWS Command Line Interface User Guide</i>. For a list of available Amazon Chime commands, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/chime/index.html">Amazon Chime commands</a> in the <i>AWS CLI
 * Command Reference</i>.
 * </p>
 * </dd>
 * <dt>Using REST API</dt>
 * <dd>
 * <p>
 * If you use REST to make API calls, you must authenticate your request by providing a signature. Amazon Chime supports
 * signature version 4. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>
 * in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * <p>
 * When making REST API calls, use the service name <code>chime</code> and REST endpoint
 * <code>https://service.chime.aws.amazon.com</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * Administrative permissions are controlled using AWS Identity and Access Management (IAM). For more information, see
 * <a href="https://docs.aws.amazon.com/chime/latest/ag/control-access.html">Control Access to the Amazon Chime
 * Console</a> in the <i>Amazon Chime Administration Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeClient extends AmazonWebServiceClient implements AmazonChime {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChime.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "chime";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withModeledClass(
                                    com.amazonaws.services.chime.model.UnauthorizedClientException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.chime.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withModeledClass(
                                    com.amazonaws.services.chime.model.ServiceFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.chime.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withModeledClass(
                                    com.amazonaws.services.chime.model.UnprocessableEntityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledClientException").withModeledClass(
                                    com.amazonaws.services.chime.model.ThrottledClientException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.chime.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.chime.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.chime.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chime.model.AmazonChimeException.class));

    public static AmazonChimeClientBuilder builder() {
        return AmazonChimeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chime/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @return Result of the AssociatePhoneNumberWithUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociatePhoneNumberWithUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumberWithUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePhoneNumberWithUserResult associatePhoneNumberWithUser(AssociatePhoneNumberWithUserRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePhoneNumberWithUser(request);
    }

    @SdkInternalApi
    final AssociatePhoneNumberWithUserResult executeAssociatePhoneNumberWithUser(AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePhoneNumberWithUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumberWithUserRequest> request = null;
        Response<AssociatePhoneNumberWithUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumberWithUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePhoneNumberWithUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePhoneNumberWithUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePhoneNumberWithUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociatePhoneNumberWithUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociatePhoneNumbersWithVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(AssociatePhoneNumbersWithVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePhoneNumbersWithVoiceConnector(request);
    }

    @SdkInternalApi
    final AssociatePhoneNumbersWithVoiceConnectorResult executeAssociatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePhoneNumbersWithVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumbersWithVoiceConnectorRequest> request = null;
        Response<AssociatePhoneNumbersWithVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumbersWithVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePhoneNumbersWithVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePhoneNumbersWithVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePhoneNumbersWithVoiceConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociatePhoneNumbersWithVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be disassociated from any users or Amazon
     * Chime Voice Connectors before they can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return Result of the BatchDeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchDeletePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDeletePhoneNumberResult batchDeletePhoneNumber(BatchDeletePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeletePhoneNumber(request);
    }

    @SdkInternalApi
    final BatchDeletePhoneNumberResult executeBatchDeletePhoneNumber(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeletePhoneNumberRequest> request = null;
        Response<BatchDeletePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeletePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeletePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeletePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeletePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeletePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends up to 50 users from a <code>Team</code> or <code>EnterpriseLWA</code> Amazon Chime account. For more
     * information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are dissociated from the account, but they can continue to use
     * Amazon Chime as free users. To remove the suspension from suspended <code>Team</code> account users, invite them
     * to the <code>Team</code> account again. You can use the <a>InviteUsers</a> action to do so.
     * </p>
     * <p>
     * Users suspended from an <code>EnterpriseLWA</code> account are immediately signed out of Amazon Chime and can no
     * longer sign in. To remove the suspension from suspended <code>EnterpriseLWA</code> account users, use the
     * <a>BatchUnsuspendUser</a> action.
     * </p>
     * <p>
     * To sign out users without suspending them, use the <a>LogoutUser</a> action.
     * </p>
     * 
     * @param batchSuspendUserRequest
     * @return Result of the BatchSuspendUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchSuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchSuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchSuspendUserResult batchSuspendUser(BatchSuspendUserRequest request) {
        request = beforeClientExecution(request);
        return executeBatchSuspendUser(request);
    }

    @SdkInternalApi
    final BatchSuspendUserResult executeBatchSuspendUser(BatchSuspendUserRequest batchSuspendUserRequest) {

        ExecutionContext executionContext = createExecutionContext(batchSuspendUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchSuspendUserRequest> request = null;
        Response<BatchSuspendUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchSuspendUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchSuspendUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchSuspendUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchSuspendUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchSuspendUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime
     * <code>EnterpriseLWA</code> account. Only users on <code>EnterpriseLWA</code> accounts can be unsuspended using
     * this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Previously suspended users who are unsuspended using this action are returned to <code>Registered</code> status.
     * Users who are not previously suspended are ignored.
     * </p>
     * 
     * @param batchUnsuspendUserRequest
     * @return Result of the BatchUnsuspendUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUnsuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUnsuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchUnsuspendUserResult batchUnsuspendUser(BatchUnsuspendUserRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUnsuspendUser(request);
    }

    @SdkInternalApi
    final BatchUnsuspendUserResult executeBatchUnsuspendUser(BatchUnsuspendUserRequest batchUnsuspendUserRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUnsuspendUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUnsuspendUserRequest> request = null;
        Response<BatchUnsuspendUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUnsuspendUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUnsuspendUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUnsuspendUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUnsuspendUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUnsuspendUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector
     * product types.
     * </p>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return Result of the BatchUpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdatePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdatePhoneNumber(request);
    }

    @SdkInternalApi
    final BatchUpdatePhoneNumberResult executeBatchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdatePhoneNumberRequest> request = null;
        Response<BatchUpdatePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdatePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdatePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdatePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdatePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchUpdatePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates user details within the <a>UpdateUserRequestItem</a> object for up to 20 users for the specified Amazon
     * Chime account. Currently, only <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @return Result of the BatchUpdateUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchUpdateUserResult batchUpdateUser(BatchUpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateUser(request);
    }

    @SdkInternalApi
    final BatchUpdateUserResult executeBatchUpdateUser(BatchUpdateUserRequest batchUpdateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateUserRequest> request = null;
        Response<BatchUpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Chime account under the administrator's AWS account. Only <code>Team</code> account types are
     * currently supported for this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @return Result of the CreateAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAccountResult createAccount(CreateAccountRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccount(request);
    }

    @SdkInternalApi
    final CreateAccountResult executeCreateAccount(CreateAccountRequest createAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountRequest> request = null;
        Response<CreateAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
     * Voice Connector product types.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePhoneNumberOrderResult createPhoneNumberOrder(CreatePhoneNumberOrderRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePhoneNumberOrder(request);
    }

    @SdkInternalApi
    final CreatePhoneNumberOrderResult executeCreatePhoneNumberOrder(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(createPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePhoneNumberOrderRequest> request = null;
        Response<CreatePhoneNumberOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePhoneNumberOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPhoneNumberOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePhoneNumberOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePhoneNumberOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePhoneNumberOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling
     * <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures your Amazon Chime Voice Connector to use TLS
     * transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
     * outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVoiceConnectorResult createVoiceConnector(CreateVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceConnector(request);
    }

    @SdkInternalApi
    final CreateVoiceConnectorResult executeCreateVoiceConnector(CreateVoiceConnectorRequest createVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceConnectorRequest> request = null;
        Response<CreateVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting a <code>Team</code>
     * account. You can use the <a>BatchSuspendUser</a> action to do so.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts, you must release the claimed domains for
     * your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
     * suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for 90 days. To restore a deleted account
     * from your <code>Disabled</code> accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @return Result of the DeleteAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccountResult deleteAccount(DeleteAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccount(request);
    }

    @SdkInternalApi
    final DeleteAccountResult executeDeleteAccount(DeleteAccountRequest deleteAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountRequest> request = null;
        Response<DeleteAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone number must be disassociated from any
     * users or Amazon Chime Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @return Result of the DeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeletePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePhoneNumberResult deletePhoneNumber(DeletePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePhoneNumber(request);
    }

    @SdkInternalApi
    final DeletePhoneNumberResult executeDeletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePhoneNumberRequest> request = null;
        Response<DeletePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice
     * Connector must be unassigned from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return Result of the DeleteVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnector(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorResult executeDeleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorRequest> request = null;
        Response<DeleteVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @return Result of the DeleteVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorOriginationResult executeDeleteVoiceConnectorOrigination(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorOriginationRequest> request = null;
        Response<DeleteVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @return Result of the DeleteVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorTerminationResult deleteVoiceConnectorTermination(DeleteVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorTerminationResult executeDeleteVoiceConnectorTermination(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationRequest> request = null;
        Response<DeleteVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorTerminationCredentialsResult deleteVoiceConnectorTerminationCredentials(DeleteVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorTerminationCredentialsResult executeDeleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<DeleteVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @return Result of the DisassociatePhoneNumberFromUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociatePhoneNumberFromUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumberFromUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePhoneNumberFromUserResult disassociatePhoneNumberFromUser(DisassociatePhoneNumberFromUserRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePhoneNumberFromUser(request);
    }

    @SdkInternalApi
    final DisassociatePhoneNumberFromUserResult executeDisassociatePhoneNumberFromUser(
            DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumberFromUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumberFromUserRequest> request = null;
        Response<DisassociatePhoneNumberFromUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumberFromUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePhoneNumberFromUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePhoneNumberFromUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePhoneNumberFromUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociatePhoneNumberFromUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(DisassociatePhoneNumbersFromVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePhoneNumbersFromVoiceConnector(request);
    }

    @SdkInternalApi
    final DisassociatePhoneNumbersFromVoiceConnectorResult executeDisassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumbersFromVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumbersFromVoiceConnectorRequest> request = null;
        Response<DisassociatePhoneNumbersFromVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumbersFromVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePhoneNumbersFromVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePhoneNumbersFromVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePhoneNumbersFromVoiceConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociatePhoneNumbersFromVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountResult getAccount(GetAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccount(request);
    }

    @SdkInternalApi
    final GetAccountResult executeGetAccount(GetAccountRequest getAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out
     * settings. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetGlobalSettings(request);
    }

    @SdkInternalApi
    final GetGlobalSettingsResult executeGetGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlobalSettingsRequest> request = null;
        Response<GetGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return Result of the GetPhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeGetPhoneNumber(request);
    }

    @SdkInternalApi
    final GetPhoneNumberResult executeGetPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(getPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberRequest> request = null;
        Response<GetPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164
     * format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return Result of the GetPhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberOrder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest request) {
        request = beforeClientExecution(request);
        return executeGetPhoneNumberOrder(request);
    }

    @SdkInternalApi
    final GetPhoneNumberOrderResult executeGetPhoneNumberOrder(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(getPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberOrderRequest> request = null;
        Response<GetPhoneNumberOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPhoneNumberOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPhoneNumberOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPhoneNumberOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPhoneNumberOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting
     * PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use the <a>ListUsers</a> action, and then
     * filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserResult getUser(GetUserRequest request) {
        request = beforeClientExecution(request);
        return executeGetUser(request);
    }

    @SdkInternalApi
    final GetUserResult executeGetUser(GetUserRequest getUserRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves settings for the specified user ID, such as any associated phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return Result of the GetUserSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserSettingsResult getUserSettings(GetUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserSettings(request);
    }

    @SdkInternalApi
    final GetUserSettingsResult executeGetUserSettings(GetUserSettingsRequest getUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserSettingsRequest> request = null;
        Response<GetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return Result of the GetVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnector(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorResult executeGetVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorRequest> request = null;
        Response<GetVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return Result of the GetVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorOriginationResult executeGetVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorOriginationRequest> request = null;
        Response<GetVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return Result of the GetVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorTerminationResult getVoiceConnectorTermination(GetVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorTerminationResult executeGetVoiceConnectorTermination(GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationRequest> request = null;
        Response<GetVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return Result of the GetVoiceConnectorTerminationHealth operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorTerminationHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(GetVoiceConnectorTerminationHealthRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorTerminationHealth(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorTerminationHealthResult executeGetVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationHealthRequest> request = null;
        Response<GetVoiceConnectorTerminationHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationHealthRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorTerminationHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorTerminationHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorTerminationHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorTerminationHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime <code>Team</code>
     * account. Only <code>Team</code> account types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @return Result of the InviteUsers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.InviteUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InviteUsersResult inviteUsers(InviteUsersRequest request) {
        request = beforeClientExecution(request);
        return executeInviteUsers(request);
    }

    @SdkInternalApi
    final InviteUsersResult executeInviteUsers(InviteUsersRequest inviteUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(inviteUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteUsersRequest> request = null;
        Response<InviteUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(inviteUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InviteUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InviteUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InviteUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
     * prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
     * which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @return Result of the ListAccounts operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccountsResult listAccounts(ListAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccounts(request);
    }

    @SdkInternalApi
    final ListAccountsResult executeListAccounts(ListAccountsRequest listAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsRequest> request = null;
        Response<ListAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the phone number orders for the administrator's Amazon Chime account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumberOrders" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPhoneNumberOrdersResult listPhoneNumberOrders(ListPhoneNumberOrdersRequest request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumberOrders(request);
    }

    @SdkInternalApi
    final ListPhoneNumberOrdersResult executeListPhoneNumberOrders(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumberOrdersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumberOrdersRequest> request = null;
        Response<ListPhoneNumberOrdersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumberOrdersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPhoneNumberOrdersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumberOrders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPhoneNumberOrdersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPhoneNumberOrdersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumbers(request);
    }

    @SdkInternalApi
    final ListPhoneNumbersResult executeListPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersRequest> request = null;
        Response<ListPhoneNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumbersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPhoneNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPhoneNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPhoneNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
     * the user that the email address belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return Result of the ListVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final ListVoiceConnectorTerminationCredentialsResult executeListVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<ListVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return Result of the ListVoiceConnectors operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVoiceConnectorsResult listVoiceConnectors(ListVoiceConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceConnectors(request);
    }

    @SdkInternalApi
    final ListVoiceConnectorsResult executeListVoiceConnectors(ListVoiceConnectorsRequest listVoiceConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorsRequest> request = null;
        Response<ListVoiceConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVoiceConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVoiceConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Logs out the specified user from all of the devices they are currently logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @return Result of the LogoutUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.LogoutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/LogoutUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public LogoutUserResult logoutUser(LogoutUserRequest request) {
        request = beforeClientExecution(request);
        return executeLogoutUser(request);
    }

    @SdkInternalApi
    final LogoutUserResult executeLogoutUser(LogoutUserRequest logoutUserRequest) {

        ExecutionContext executionContext = createExecutionContext(logoutUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LogoutUserRequest> request = null;
        Response<LogoutUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LogoutUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(logoutUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LogoutUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LogoutUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new LogoutUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return Result of the PutVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorOriginationResult executePutVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorOriginationRequest> request = null;
        Response<PutVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return Result of the PutVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorTerminationResult putVoiceConnectorTermination(PutVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorTerminationResult executePutVoiceConnectorTermination(PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationRequest> request = null;
        Response<PutVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return Result of the PutVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorTerminationCredentialsResult putVoiceConnectorTerminationCredentials(PutVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorTerminationCredentialsResult executePutVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<PutVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the <a>User</a> object
     * with the updated personal meeting PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @return Result of the ResetPersonalPIN operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ResetPersonalPIN
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ResetPersonalPIN" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetPersonalPINResult resetPersonalPIN(ResetPersonalPINRequest request) {
        request = beforeClientExecution(request);
        return executeResetPersonalPIN(request);
    }

    @SdkInternalApi
    final ResetPersonalPINResult executeResetPersonalPIN(ResetPersonalPINRequest resetPersonalPINRequest) {

        ExecutionContext executionContext = createExecutionContext(resetPersonalPINRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetPersonalPINRequest> request = null;
        Response<ResetPersonalPINResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetPersonalPINRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetPersonalPINRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetPersonalPIN");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetPersonalPINResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetPersonalPINResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves a phone number from the <b>Deletion queue</b> back into the phone number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return Result of the RestorePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RestorePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeRestorePhoneNumber(request);
    }

    @SdkInternalApi
    final RestorePhoneNumberResult executeRestorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(restorePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestorePhoneNumberRequest> request = null;
        Response<RestorePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestorePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restorePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestorePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestorePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestorePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAvailablePhoneNumbers(request);
    }

    @SdkInternalApi
    final SearchAvailablePhoneNumbersResult executeSearchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAvailablePhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAvailablePhoneNumbersRequest> request = null;
        Response<SearchAvailablePhoneNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAvailablePhoneNumbersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchAvailablePhoneNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAvailablePhoneNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchAvailablePhoneNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchAvailablePhoneNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are
     * supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAccountResult updateAccount(UpdateAccountRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccount(request);
    }

    @SdkInternalApi
    final UpdateAccountResult executeUpdateAccount(UpdateAccountRequest updateAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountRequest> request = null;
        Response<UpdateAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
     * screens, or for the dial-out option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSettings(request);
    }

    @SdkInternalApi
    final UpdateAccountSettingsResult executeUpdateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalSettings(request);
    }

    @SdkInternalApi
    final UpdateGlobalSettingsResult executeUpdateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalSettingsRequest> request = null;
        Response<UpdateGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates phone number details, such as product type, for the specified phone number ID.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePhoneNumber(request);
    }

    @SdkInternalApi
    final UpdatePhoneNumberResult executeUpdatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberRequest> request = null;
        Response<UpdatePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates user details for a specified user ID. Currently, only <code>LicenseType</code> updates are supported for
     * this action.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for the specified user, such as phone number settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return Result of the UpdateUserSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserSettingsResult updateUserSettings(UpdateUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserSettings(request);
    }

    @SdkInternalApi
    final UpdateUserSettingsResult executeUpdateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserSettingsRequest> request = null;
        Response<UpdateUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return Result of the UpdateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVoiceConnectorResult updateVoiceConnector(UpdateVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceConnector(request);
    }

    @SdkInternalApi
    final UpdateVoiceConnectorResult executeUpdateVoiceConnector(UpdateVoiceConnectorRequest updateVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceConnectorRequest> request = null;
        Response<UpdateVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVoiceConnectorResultJsonUnmarshaller());
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
