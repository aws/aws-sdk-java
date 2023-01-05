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
package com.amazonaws.services.transfer;

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

import com.amazonaws.services.transfer.AWSTransferClientBuilder;
import com.amazonaws.services.transfer.waiters.AWSTransferWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.services.transfer.model.transform.*;

/**
 * Client for accessing AWS Transfer. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Transfer Family is a fully managed service that enables the transfer of files over the File Transfer Protocol (FTP),
 * File Transfer Protocol over SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP) directly into and out of
 * Amazon Simple Storage Service (Amazon S3) or Amazon EFS. Additionally, you can use Applicability Statement 2 (AS2) to
 * transfer files into and out of Amazon S3. Amazon Web Services helps you seamlessly migrate your file transfer
 * workflows to Transfer Family by integrating with existing authentication systems, and providing DNS routing with
 * Amazon Route 53 so nothing changes for your customers and partners, or their applications. With your data in Amazon
 * S3, you can use it with Amazon Web Services for processing, analytics, machine learning, and archiving. Getting
 * started with Transfer Family is easy since there is no infrastructure to buy and set up.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTransferClient extends AmazonWebServiceClient implements AWSTransfer {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSTransfer.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "transfer";

    private volatile AWSTransferWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.ResourceExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.transfer.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.transfer.model.AWSTransferException.class));

    public static AWSTransferClientBuilder builder() {
        return AWSTransferClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Transfer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTransferClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Transfer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTransferClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("transfer.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/transfer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/transfer/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000
     * users, but only a small fraction might need the ability to transfer files to the server. An administrator can use
     * <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
     * </p>
     * 
     * @param createAccessRequest
     * @return Result of the CreateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAccessResult createAccess(CreateAccessRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccess(request);
    }

    @SdkInternalApi
    final CreateAccessResult executeCreateAccess(CreateAccessRequest createAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessRequest> request = null;
        Response<CreateAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an agreement. An agreement is a bilateral trading partner agreement, or partnership, between an Transfer
     * Family server and an AS2 process. The agreement defines the file and message transfer relationship between the
     * server and the AS2 process. To define an agreement, Transfer Family combines a server, local profile, partner
     * profile, certificate, and other attributes.
     * </p>
     * <p>
     * The partner is identified with the <code>PartnerProfileId</code>, and the AS2 process is identified with the
     * <code>LocalProfileId</code>.
     * </p>
     * 
     * @param createAgreementRequest
     * @return Result of the CreateAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAgreementResult createAgreement(CreateAgreementRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgreement(request);
    }

    @SdkInternalApi
    final CreateAgreementResult executeCreateAgreement(CreateAgreementRequest createAgreementRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgreementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgreementRequest> request = null;
        Response<CreateAgreementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgreementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgreementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgreement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgreementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAgreementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the connector, which captures the parameters for an outbound connection for the AS2 protocol. The
     * connector is required for sending files to an externally hosted AS2 server. For more details about connectors,
     * see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/create-b2b-server.html#configure-as2-connector"
     * >Create AS2 connectors</a>.
     * </p>
     * 
     * @param createConnectorRequest
     * @return Result of the CreateConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateConnectorResult createConnector(CreateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnector(request);
    }

    @SdkInternalApi
    final CreateConnectorResult executeCreateConnector(CreateConnectorRequest createConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectorRequest> request = null;
        Response<CreateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the local or partner profile to use for AS2 transfers.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfile(request);
    }

    @SdkInternalApi
    final CreateProfileResult executeCreateProfile(CreateProfileRequest createProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services.
     * When you make updates to your file transfer protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return Result of the CreateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServerResult createServer(CreateServerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServer(request);
    }

    @SdkInternalApi
    final CreateServerResult executeCreateServer(CreateServerRequest createServerRequest) {

        ExecutionContext executionContext = createExecutionContext(createServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServerRequest> request = null;
        Response<CreateServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create
     * and associate users with servers that have the <code>IdentityProviderType</code> set to
     * <code>SERVICE_MANAGED</code>. Using parameters for <code>CreateUser</code>, you can specify the user name, set
     * the home directory, store the user's public key, and assign the user's Identity and Access Management (IAM) role.
     * You can also optionally add a session policy, and assign metadata with tags that can be used to group and search
     * for users.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer
     * completes. After creating a workflow, you can associate the workflow created with any transfer servers by
     * specifying the <code>workflow-details</code> field in <code>CreateServer</code> and <code>UpdateServer</code>
     * operations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkflowResult createWorkflow(CreateWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkflow(request);
    }

    @SdkInternalApi
    final CreateWorkflowResult executeCreateWorkflow(CreateWorkflowRequest createWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkflowRequest> request = null;
        Response<CreateWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to delete the access specified in the <code>ServerID</code> and <code>ExternalID</code> parameters.
     * </p>
     * 
     * @param deleteAccessRequest
     * @return Result of the DeleteAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccessResult deleteAccess(DeleteAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccess(request);
    }

    @SdkInternalApi
    final DeleteAccessResult executeDeleteAccess(DeleteAccessRequest deleteAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessRequest> request = null;
        Response<DeleteAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the agreement that's specified in the provided <code>AgreementId</code>.
     * </p>
     * 
     * @param deleteAgreementRequest
     * @return Result of the DeleteAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAgreementResult deleteAgreement(DeleteAgreementRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgreement(request);
    }

    @SdkInternalApi
    final DeleteAgreementResult executeDeleteAgreement(DeleteAgreementRequest deleteAgreementRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgreementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgreementRequest> request = null;
        Response<DeleteAgreementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgreementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgreementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgreement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgreementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAgreementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the certificate that's specified in the <code>CertificateId</code> parameter.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
     * Deletes the agreement that's specified in the provided <code>ConnectorId</code>.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConnectorResult deleteConnector(DeleteConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnector(request);
    }

    @SdkInternalApi
    final DeleteConnectorResult executeDeleteConnector(DeleteConnectorRequest deleteConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectorRequest> request = null;
        Response<DeleteConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the host key that's specified in the <code>HoskKeyId</code> parameter.
     * </p>
     * 
     * @param deleteHostKeyRequest
     * @return Result of the DeleteHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.DeleteHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteHostKeyResult deleteHostKey(DeleteHostKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHostKey(request);
    }

    @SdkInternalApi
    final DeleteHostKeyResult executeDeleteHostKey(DeleteHostKeyRequest deleteHostKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHostKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHostKeyRequest> request = null;
        Response<DeleteHostKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHostKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHostKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHostKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHostKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHostKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the profile that's specified in the <code>ProfileId</code> parameter.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfile(request);
    }

    @SdkInternalApi
    final DeleteProfileResult executeDeleteProfile(DeleteProfileRequest deleteProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @return Result of the DeleteServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServerResult deleteServer(DeleteServerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServer(request);
    }

    @SdkInternalApi
    final DeleteServerResult executeDeleteServer(DeleteServerRequest deleteServerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServerRequest> request = null;
        Response<DeleteServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @return Result of the DeleteSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSshPublicKeyResult deleteSshPublicKey(DeleteSshPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSshPublicKey(request);
    }

    @SdkInternalApi
    final DeleteSshPublicKeyResult executeDeleteSshPublicKey(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSshPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSshPublicKeyRequest> request = null;
        Response<DeleteSshPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSshPublicKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSshPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSshPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSshPublicKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSshPublicKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the user belonging to a file transfer protocol-enabled server you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * <note>
     * <p>
     * When you delete a user from a server, the user's information is lost.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkflow(request);
    }

    @SdkInternalApi
    final DeleteWorkflowResult executeDeleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkflowRequest> request = null;
        Response<DeleteWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property and its <code>ExternalId</code>.
     * </p>
     * <p>
     * The response from this call returns the properties of the access that is associated with the
     * <code>ServerId</code> value that was specified.
     * </p>
     * 
     * @param describeAccessRequest
     * @return Result of the DescribeAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAccessResult describeAccess(DescribeAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccess(request);
    }

    @SdkInternalApi
    final DescribeAccessResult executeDescribeAccess(DescribeAccessRequest describeAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccessRequest> request = null;
        Response<DescribeAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the agreement that's identified by the <code>AgreementId</code>.
     * </p>
     * 
     * @param describeAgreementRequest
     * @return Result of the DescribeAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAgreementResult describeAgreement(DescribeAgreementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgreement(request);
    }

    @SdkInternalApi
    final DescribeAgreementResult executeDescribeAgreement(DescribeAgreementRequest describeAgreementRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgreementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgreementRequest> request = null;
        Response<DescribeAgreementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgreementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgreementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgreement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgreementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgreementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the certificate that's identified by the <code>CertificateId</code>.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificate(request);
    }

    @SdkInternalApi
    final DescribeCertificateResult executeDescribeCertificate(DescribeCertificateRequest describeCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the connector that's identified by the <code>ConnectorId.</code>
     * </p>
     * 
     * @param describeConnectorRequest
     * @return Result of the DescribeConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeConnectorResult describeConnector(DescribeConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnector(request);
    }

    @SdkInternalApi
    final DescribeConnectorResult executeDescribeConnector(DescribeConnectorRequest describeConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectorRequest> request = null;
        Response<DescribeConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can use <code>DescribeExecution</code> to check the details of the execution of the specified workflow.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExecution(request);
    }

    @SdkInternalApi
    final DescribeExecutionResult executeDescribeExecution(DescribeExecutionRequest describeExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExecutionRequest> request = null;
        Response<DescribeExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the host key that's specified by the <code>HostKeyId</code> and <code>ServerId</code>.
     * </p>
     * 
     * @param describeHostKeyRequest
     * @return Result of the DescribeHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeHostKeyResult describeHostKey(DescribeHostKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHostKey(request);
    }

    @SdkInternalApi
    final DescribeHostKeyResult executeDescribeHostKey(DescribeHostKeyRequest describeHostKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHostKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHostKeyRequest> request = null;
        Response<DescribeHostKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHostKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeHostKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHostKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHostKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeHostKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the profile that's specified by the <code>ProfileId</code>.
     * </p>
     * 
     * @param describeProfileRequest
     * @return Result of the DescribeProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeProfileResult describeProfile(DescribeProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProfile(request);
    }

    @SdkInternalApi
    final DescribeProfileResult executeDescribeProfile(DescribeProfileRequest describeProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProfileRequest> request = null;
        Response<DescribeProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the security policy that is attached to your file transfer protocol-enabled server. The response
     * contains a description of the security policy's properties. For more information about security policies, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
     * policies</a>.
     * </p>
     * 
     * @param describeSecurityPolicyRequest
     * @return Result of the DescribeSecurityPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSecurityPolicyResult describeSecurityPolicy(DescribeSecurityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSecurityPolicy(request);
    }

    @SdkInternalApi
    final DescribeSecurityPolicyResult executeDescribeSecurityPolicy(DescribeSecurityPolicyRequest describeSecurityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSecurityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityPolicyRequest> request = null;
        Response<DescribeSecurityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSecurityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSecurityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSecurityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSecurityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * <p>
     * The response contains a description of a server's properties. When you set <code>EndpointType</code> to VPC, the
     * response will contain the <code>EndpointDetails</code>.
     * </p>
     * 
     * @param describeServerRequest
     * @return Result of the DescribeServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServerResult describeServer(DescribeServerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServer(request);
    }

    @SdkInternalApi
    final DescribeServerResult executeDescribeServer(DescribeServerRequest describeServerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServerRequest> request = null;
        Response<DescribeServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated with the <code>ServerId</code> value
     * that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUser(request);
    }

    @SdkInternalApi
    final DescribeUserResult executeDescribeUser(DescribeUserRequest describeUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified workflow.
     * </p>
     * 
     * @param describeWorkflowRequest
     * @return Result of the DescribeWorkflow operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorkflowResult describeWorkflow(DescribeWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkflow(request);
    }

    @SdkInternalApi
    final DescribeWorkflowResult executeDescribeWorkflow(DescribeWorkflowRequest describeWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkflowRequest> request = null;
        Response<DescribeWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner
     * profiles.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportCertificateResult importCertificate(ImportCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeImportCertificate(request);
    }

    @SdkInternalApi
    final ImportCertificateResult executeImportCertificate(ImportCertificateRequest importCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(importCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateRequest> request = null;
        Response<ImportCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a host key to the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param importHostKeyRequest
     * @return Result of the ImportHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.ImportHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportHostKeyResult importHostKey(ImportHostKeyRequest request) {
        request = beforeClientExecution(request);
        return executeImportHostKey(request);
    }

    @SdkInternalApi
    final ImportHostKeyResult executeImportHostKey(ImportHostKeyRequest importHostKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(importHostKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportHostKeyRequest> request = null;
        Response<ImportHostKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportHostKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importHostKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportHostKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportHostKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportHostKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a <code>UserName</code> value assigned to
     * the specific file transfer protocol-enabled server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @return Result of the ImportSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeImportSshPublicKey(request);
    }

    @SdkInternalApi
    final ImportSshPublicKeyResult executeImportSshPublicKey(ImportSshPublicKeyRequest importSshPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(importSshPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportSshPublicKeyRequest> request = null;
        Response<ImportSshPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportSshPublicKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importSshPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportSshPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportSshPublicKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportSshPublicKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the details for all the accesses you have on your server.
     * </p>
     * 
     * @param listAccessesRequest
     * @return Result of the ListAccesses operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListAccesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccessesResult listAccesses(ListAccessesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccesses(request);
    }

    @SdkInternalApi
    final ListAccessesResult executeListAccesses(ListAccessesRequest listAccessesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessesRequest> request = null;
        Response<ListAccessesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccessesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccesses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccessesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the agreements for the server that's identified by the <code>ServerId</code> that you supply.
     * If you want to limit the results to a certain number, supply a value for the <code>MaxResults</code> parameter.
     * If you ran the command previously and received a value for <code>NextToken</code>, you can supply that value to
     * continue listing agreements from where you left off.
     * </p>
     * 
     * @param listAgreementsRequest
     * @return Result of the ListAgreements operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAgreementsResult listAgreements(ListAgreementsRequest request) {
        request = beforeClientExecution(request);
        return executeListAgreements(request);
    }

    @SdkInternalApi
    final ListAgreementsResult executeListAgreements(ListAgreementsRequest listAgreementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgreementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgreementsRequest> request = null;
        Response<ListAgreementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgreementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgreementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgreements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgreementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgreementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the
     * results to a certain number, supply a value for the <code>MaxResults</code> parameter. If you ran the command
     * previously and received a value for the <code>NextToken</code> parameter, you can supply that value to continue
     * listing certificates from where you left off.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCertificatesResult listCertificates(ListCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCertificates(request);
    }

    @SdkInternalApi
    final ListCertificatesResult executeListCertificates(ListCertificatesRequest listCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the connectors for the specified Region.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListConnectorsResult listConnectors(ListConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListConnectors(request);
    }

    @SdkInternalApi
    final ListConnectorsResult executeListConnectors(ListConnectorsRequest listConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectorsRequest> request = null;
        Response<ListConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all executions for the specified workflow.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExecutions(request);
    }

    @SdkInternalApi
    final ListExecutionsResult executeListExecutions(ListExecutionsRequest listExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExecutionsRequest> request = null;
        Response<ListExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of host keys for the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listHostKeysRequest
     * @return Result of the ListHostKeys operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListHostKeysResult listHostKeys(ListHostKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListHostKeys(request);
    }

    @SdkInternalApi
    final ListHostKeysResult executeListHostKeys(ListHostKeysRequest listHostKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listHostKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHostKeysRequest> request = null;
        Response<ListHostKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHostKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHostKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHostKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHostKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHostKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a
     * value for the <code>MaxResults</code> parameter. If you ran the command previously and received a value for
     * <code>NextToken</code>, you can supply that value to continue listing profiles from where you left off.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProfilesResult listProfiles(ListProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfiles(request);
    }

    @SdkInternalApi
    final ListProfilesResult executeListProfiles(ListProfilesRequest listProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfilesRequest> request = null;
        Response<ListProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the security policies that are attached to your file transfer protocol-enabled servers.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return Result of the ListSecurityPolicies operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSecurityPoliciesResult listSecurityPolicies(ListSecurityPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityPolicies(request);
    }

    @SdkInternalApi
    final ListSecurityPoliciesResult executeListSecurityPolicies(ListSecurityPoliciesRequest listSecurityPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityPoliciesRequest> request = null;
        Response<ListSecurityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServersResult listServers(ListServersRequest request) {
        request = beforeClientExecution(request);
        return executeListServers(request);
    }

    @SdkInternalApi
    final ListServersResult executeListServers(ListServersRequest listServersRequest) {

        ExecutionContext executionContext = createExecutionContext(listServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServersRequest> request = null;
        Response<ListServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
     * Lists the users for a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
     * Lists all of your workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkflowsResult listWorkflows(ListWorkflowsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkflows(request);
    }

    @SdkInternalApi
    final ListWorkflowsResult executeListWorkflows(ListWorkflowsRequest listWorkflowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowsRequest> request = null;
        Response<ListWorkflowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkflowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkflows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkflowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkflowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a callback for asynchronous custom steps.
     * </p>
     * <p>
     * The <code>ExecutionId</code>, <code>WorkflowId</code>, and <code>Token</code> are passed to the target resource
     * during execution of a custom step of a workflow. You must include those with their callback as well as providing
     * a status.
     * </p>
     * 
     * @param sendWorkflowStepStateRequest
     * @return Result of the SendWorkflowStepState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.SendWorkflowStepState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SendWorkflowStepStateResult sendWorkflowStepState(SendWorkflowStepStateRequest request) {
        request = beforeClientExecution(request);
        return executeSendWorkflowStepState(request);
    }

    @SdkInternalApi
    final SendWorkflowStepStateResult executeSendWorkflowStepState(SendWorkflowStepStateRequest sendWorkflowStepStateRequest) {

        ExecutionContext executionContext = createExecutionContext(sendWorkflowStepStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendWorkflowStepStateRequest> request = null;
        Response<SendWorkflowStepStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendWorkflowStepStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendWorkflowStepStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendWorkflowStepState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendWorkflowStepStateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SendWorkflowStepStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Begins an outbound file transfer to a remote AS2 server. You specify the <code>ConnectorId</code> and the file
     * paths for where to send the files.
     * </p>
     * 
     * @param startFileTransferRequest
     * @return Result of the StartFileTransfer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StartFileTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFileTransferResult startFileTransfer(StartFileTransferRequest request) {
        request = beforeClientExecution(request);
        return executeStartFileTransfer(request);
    }

    @SdkInternalApi
    final StartFileTransferResult executeStartFileTransfer(StartFileTransferRequest startFileTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(startFileTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFileTransferRequest> request = null;
        Response<StartFileTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFileTransferRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFileTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFileTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFileTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFileTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>OFFLINE</code> to <code>ONLINE</code>. It
     * has no impact on a server that is already <code>ONLINE</code>. An <code>ONLINE</code> server can accept and
     * process file transfer jobs.
     * </p>
     * <p>
     * The state of <code>STARTING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully online. The values of <code>START_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param startServerRequest
     * @return Result of the StartServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartServerResult startServer(StartServerRequest request) {
        request = beforeClientExecution(request);
        return executeStartServer(request);
    }

    @SdkInternalApi
    final StartServerResult executeStartServer(StartServerRequest startServerRequest) {

        ExecutionContext executionContext = createExecutionContext(startServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartServerRequest> request = null;
        Response<StartServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>ONLINE</code> to <code>OFFLINE</code>. An
     * <code>OFFLINE</code> server cannot accept and process file transfer jobs. Information tied to your server, such
     * as server and user properties, are not affected by stopping your server.
     * </p>
     * <note>
     * <p>
     * Stopping the server does not reduce or impact your file transfer protocol endpoint billing; you must delete the
     * server to stop being billed.
     * </p>
     * </note>
     * <p>
     * The state of <code>STOPPING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully offline. The values of <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @return Result of the StopServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StopServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StopServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopServerResult stopServer(StopServerRequest request) {
        request = beforeClientExecution(request);
        return executeStopServer(request);
    }

    @SdkInternalApi
    final StopServerResult executeStopServer(StopServerRequest stopServerRequest) {

        ExecutionContext executionContext = createExecutionContext(stopServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopServerRequest> request = null;
        Response<StopServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopServerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
     * If the <code>IdentityProviderType</code> of a file transfer protocol-enabled server is
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_Gateway</code>, tests whether your identity provider is set up
     * successfully. We highly recommend that you call this operation to test your authentication method as soon as you
     * create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure
     * that your users can successfully use the service.
     * </p>
     * <p>
     * The <code>ServerId</code> and <code>UserName</code> parameters are required. The <code>ServerProtocol</code>,
     * <code>SourceIp</code>, and <code>UserPassword</code> are all optional.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>TestIdentityProvider</code> if the <code>IdentityProviderType</code> of your server is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If you provide any incorrect values for any parameters, the <code>Response</code> field is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you provide a server ID for a server that uses service-managed users, you get an error:
     * </p>
     * <p>
     * <code> An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-<i>server-ID</i> not configured for external auth </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enter a Server ID for the <code>--server-id</code> parameter that does not identify an actual Transfer
     * server, you receive the following error:
     * </p>
     * <p>
     * <code>An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param testIdentityProviderRequest
     * @return Result of the TestIdentityProvider operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TestIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TestIdentityProviderResult testIdentityProvider(TestIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeTestIdentityProvider(request);
    }

    @SdkInternalApi
    final TestIdentityProviderResult executeTestIdentityProvider(TestIdentityProviderRequest testIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(testIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestIdentityProviderRequest> request = null;
        Response<TestIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
     * Allows you to update parameters for the access specified in the <code>ServerID</code> and <code>ExternalID</code>
     * parameters.
     * </p>
     * 
     * @param updateAccessRequest
     * @return Result of the UpdateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAccessResult updateAccess(UpdateAccessRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccess(request);
    }

    @SdkInternalApi
    final UpdateAccessResult executeUpdateAccess(UpdateAccessRequest updateAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessRequest> request = null;
        Response<UpdateAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters for an existing agreement. Provide the <code>AgreementId</code> and the
     * <code>ServerId</code> for the agreement that you want to update, along with the new values for the parameters to
     * update.
     * </p>
     * 
     * @param updateAgreementRequest
     * @return Result of the UpdateAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAgreementResult updateAgreement(UpdateAgreementRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgreement(request);
    }

    @SdkInternalApi
    final UpdateAgreementResult executeUpdateAgreement(UpdateAgreementRequest updateAgreementRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgreementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgreementRequest> request = null;
        Response<UpdateAgreementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgreementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgreementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgreement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgreementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAgreementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the active and inactive dates for a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     * @return Result of the UpdateCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCertificateResult updateCertificate(UpdateCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCertificate(request);
    }

    @SdkInternalApi
    final UpdateCertificateResult executeUpdateCertificate(UpdateCertificateRequest updateCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateRequest> request = null;
        Response<UpdateCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters for an existing connector. Provide the <code>ConnectorId</code> for the connector
     * that you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return Result of the UpdateConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateConnectorResult updateConnector(UpdateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnector(request);
    }

    @SdkInternalApi
    final UpdateConnectorResult executeUpdateConnector(UpdateConnectorRequest updateConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectorRequest> request = null;
        Response<UpdateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description for the host key that's specified by the <code>ServerId</code> and <code>HostKeyId</code>
     * parameters.
     * </p>
     * 
     * @param updateHostKeyRequest
     * @return Result of the UpdateHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateHostKeyResult updateHostKey(UpdateHostKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHostKey(request);
    }

    @SdkInternalApi
    final UpdateHostKeyResult executeUpdateHostKey(UpdateHostKeyRequest updateHostKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHostKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHostKeyRequest> request = null;
        Response<UpdateHostKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHostKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHostKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHostKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHostKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateHostKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters for an existing profile. Provide the <code>ProfileId</code> for the profile that
     * you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProfileResult updateProfile(UpdateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfile(request);
    }

    @SdkInternalApi
    final UpdateProfileResult executeUpdateProfile(UpdateProfileRequest updateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws ConflictException
     *         This exception is thrown when the <code>UpdateServer</code> is called for a file transfer
     *         protocol-enabled server that has VPC as the endpoint type and the server's <code>VpcEndpointID</code> is
     *         not in the available state.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServerResult updateServer(UpdateServerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServer(request);
    }

    @SdkInternalApi
    final UpdateServerResult executeUpdateServer(UpdateServerRequest updateServerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServerRequest> request = null;
        Response<UpdateServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
     * role, and policy for the <code>UserName</code> and <code>ServerId</code> you specify.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> and the <code>UserName</code> for the updated user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Transfer");
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
    public AWSTransferWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSTransferWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
