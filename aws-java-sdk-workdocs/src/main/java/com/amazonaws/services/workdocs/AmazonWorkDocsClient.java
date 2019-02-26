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
package com.amazonaws.services.workdocs;

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

import com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workdocs.model.*;
import com.amazonaws.services.workdocs.model.transform.*;

/**
 * Client for accessing Amazon WorkDocs. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * The WorkDocs API is designed for the following use cases:
 * </p>
 * <ul>
 * <li>
 * <p>
 * File Migration: File migration applications are supported for users who want to migrate their files from an
 * on-premises or off-premises file system or service. Users can insert files into a user directory structure, as well
 * as allow for basic metadata changes, such as modifications to the permissions of files.
 * </p>
 * </li>
 * <li>
 * <p>
 * Security: Support security applications are supported for users who have additional security needs, such as antivirus
 * or data loss prevention. The API actions, along with AWS CloudTrail, allow these applications to detect when changes
 * occur in Amazon WorkDocs. Then, the application can take the necessary actions and replace the target file. If the
 * target file violates the policy, the application can also choose to email the user.
 * </p>
 * </li>
 * <li>
 * <p>
 * eDiscovery/Analytics: General administrative applications are supported, such as eDiscovery and analytics. These
 * applications can choose to mimic or record the actions in an Amazon WorkDocs site, along with AWS CloudTrail, to
 * replicate data for eDiscovery, backup, or analytical applications.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All Amazon WorkDocs API actions are Amazon authenticated and certificate-signed. They not only require the use of the
 * AWS SDK, but also allow for the exclusive use of IAM users and roles to help facilitate access, trust, and permission
 * policies. By creating a role and allowing an IAM user to access the Amazon WorkDocs site, the IAM user gains full
 * administrative visibility into the entire Amazon WorkDocs site (or as set in the IAM policy). This includes, but is
 * not limited to, the ability to modify file permissions and upload any file to any user. This allows developers to
 * perform the three use cases above, as well as give users the ability to grant access on a selective basis using the
 * IAM model.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkDocsClient extends AmazonWebServiceClient implements AmazonWorkDocs {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkDocs.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workdocs";

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
                            new JsonErrorShapeMetadata().withErrorCode("FailedDependencyException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.FailedDependencyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.InvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomMetadataLimitExceededException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.CustomMetadataLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedResourceAccessException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManySubscriptionsException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.TooManySubscriptionsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.EntityAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityNotExistsException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.EntityNotExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentLockedForCommentsException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.DocumentLockedForCommentsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StorageLimitExceededException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.StorageLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StorageLimitWillExceedException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.StorageLimitWillExceedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProhibitedStateException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.ProhibitedStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IllegalUserStateException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.IllegalUserStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictingOperationException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.ConflictingOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCommentOperationException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.InvalidCommentOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPasswordException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.InvalidPasswordException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedOperationException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.UnauthorizedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyLabelsException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.TooManyLabelsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DraftUploadOutOfSyncException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.DraftUploadOutOfSyncException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyCheckedOutException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.ResourceAlreadyCheckedOutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestedEntityTooLargeException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.RequestedEntityTooLargeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeactivatingLastSystemUserException").withModeledClass(
                                    com.amazonaws.services.workdocs.model.DeactivatingLastSystemUserException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workdocs.model.AmazonWorkDocsException.class));

    public static AmazonWorkDocsClientBuilder builder() {
        return AmazonWorkDocsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkDocs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkDocsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkDocs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkDocsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("workdocs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workdocs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workdocs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Aborts the upload of the specified document version that was previously initiated by
     * <a>InitiateDocumentVersionUpload</a>. The client should make this call only when it no longer intends to upload
     * the document version, or fails to do so.
     * </p>
     * 
     * @param abortDocumentVersionUploadRequest
     * @return Result of the AbortDocumentVersionUpload operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.AbortDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AbortDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AbortDocumentVersionUploadResult abortDocumentVersionUpload(AbortDocumentVersionUploadRequest request) {
        request = beforeClientExecution(request);
        return executeAbortDocumentVersionUpload(request);
    }

    @SdkInternalApi
    final AbortDocumentVersionUploadResult executeAbortDocumentVersionUpload(AbortDocumentVersionUploadRequest abortDocumentVersionUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(abortDocumentVersionUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortDocumentVersionUploadRequest> request = null;
        Response<AbortDocumentVersionUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AbortDocumentVersionUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(abortDocumentVersionUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AbortDocumentVersionUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AbortDocumentVersionUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AbortDocumentVersionUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     * </p>
     * 
     * @param activateUserRequest
     * @return Result of the ActivateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.ActivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ActivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ActivateUserResult activateUser(ActivateUserRequest request) {
        request = beforeClientExecution(request);
        return executeActivateUser(request);
    }

    @SdkInternalApi
    final ActivateUserResult executeActivateUser(ActivateUserRequest activateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(activateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateUserRequest> request = null;
        Response<ActivateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
     * the principals already have different permissions.
     * </p>
     * 
     * @param addResourcePermissionsRequest
     * @return Result of the AddResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.AddResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddResourcePermissionsResult addResourcePermissions(AddResourcePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeAddResourcePermissions(request);
    }

    @SdkInternalApi
    final AddResourcePermissionsResult executeAddResourcePermissions(AddResourcePermissionsRequest addResourcePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(addResourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddResourcePermissionsRequest> request = null;
        Response<AddResourcePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddResourcePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addResourcePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddResourcePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddResourcePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddResourcePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new comment to the specified document version.
     * </p>
     * 
     * @param createCommentRequest
     * @return Result of the CreateComment operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DocumentLockedForCommentsException
     *         This exception is thrown when the document is locked for comments and user tries to create or delete a
     *         comment on that document.
     * @throws InvalidCommentOperationException
     *         The requested operation is not allowed on the specified comment object.
     * @sample AmazonWorkDocs.CreateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateComment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCommentResult createComment(CreateCommentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComment(request);
    }

    @SdkInternalApi
    final CreateCommentResult executeCreateComment(CreateCommentRequest createCommentRequest) {

        ExecutionContext executionContext = createExecutionContext(createCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCommentRequest> request = null;
        Response<CreateCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCommentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCommentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCommentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     * </p>
     * 
     * @param createCustomMetadataRequest
     * @return Result of the CreateCustomMetadata operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws CustomMetadataLimitExceededException
     *         The limit has been reached on the number of custom properties for the specified resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCustomMetadataResult createCustomMetadata(CreateCustomMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomMetadata(request);
    }

    @SdkInternalApi
    final CreateCustomMetadataResult executeCreateCustomMetadata(CreateCustomMetadataRequest createCustomMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomMetadataRequest> request = null;
        Response<CreateCustomMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCustomMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a folder with the specified name and parent folder.
     * </p>
     * 
     * @param createFolderRequest
     * @return Result of the CreateFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFolderResult createFolder(CreateFolderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFolder(request);
    }

    @SdkInternalApi
    final CreateFolderResult executeCreateFolder(CreateFolderRequest createFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(createFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFolderRequest> request = null;
        Response<CreateFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFolderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified list of labels to the given resource (a document or folder)
     * </p>
     * 
     * @param createLabelsRequest
     * @return Result of the CreateLabels operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws TooManyLabelsException
     *         The limit has been reached on the number of labels for the specified resource.
     * @sample AmazonWorkDocs.CreateLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateLabels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLabelsResult createLabels(CreateLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLabels(request);
    }

    @SdkInternalApi
    final CreateLabelsResult executeCreateLabels(CreateLabelsRequest createLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLabelsRequest> request = null;
        Response<CreateLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLabelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
     * confirm the subscription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/subscribe-notifications.html">Subscribe to
     * Notifications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param createNotificationSubscriptionRequest
     * @return Result of the CreateNotificationSubscription operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws TooManySubscriptionsException
     *         You've reached the limit on the number of subscriptions for the WorkDocs instance.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNotificationSubscriptionResult createNotificationSubscription(CreateNotificationSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotificationSubscription(request);
    }

    @SdkInternalApi
    final CreateNotificationSubscriptionResult executeCreateNotificationSubscription(CreateNotificationSubscriptionRequest createNotificationSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotificationSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotificationSubscriptionRequest> request = null;
        Response<CreateNotificationSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotificationSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createNotificationSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNotificationSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotificationSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNotificationSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New
     * users can access Amazon WorkDocs.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
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
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     * </p>
     * 
     * @param deactivateUserRequest
     * @return Result of the DeactivateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeactivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeactivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeactivateUserResult deactivateUser(DeactivateUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivateUser(request);
    }

    @SdkInternalApi
    final DeactivateUserResult executeDeactivateUser(DeactivateUserRequest deactivateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deactivateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivateUserRequest> request = null;
        Response<DeactivateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deactivateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeactivateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeactivateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified comment from the document version.
     * </p>
     * 
     * @param deleteCommentRequest
     * @return Result of the DeleteComment operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DocumentLockedForCommentsException
     *         This exception is thrown when the document is locked for comments and user tries to create or delete a
     *         comment on that document.
     * @sample AmazonWorkDocs.DeleteComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteComment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCommentResult deleteComment(DeleteCommentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComment(request);
    }

    @SdkInternalApi
    final DeleteCommentResult executeDeleteComment(DeleteCommentRequest deleteCommentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCommentRequest> request = null;
        Response<DeleteCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCommentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCommentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCommentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes custom metadata from the specified resource.
     * </p>
     * 
     * @param deleteCustomMetadataRequest
     * @return Result of the DeleteCustomMetadata operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCustomMetadataResult deleteCustomMetadata(DeleteCustomMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomMetadata(request);
    }

    @SdkInternalApi
    final DeleteCustomMetadataResult executeDeleteCustomMetadata(DeleteCustomMetadataRequest deleteCustomMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomMetadataRequest> request = null;
        Response<DeleteCustomMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCustomMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes the specified document and its associated metadata.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDocument(request);
    }

    @SdkInternalApi
    final DeleteDocumentResult executeDeleteDocument(DeleteDocumentRequest deleteDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes the specified folder and its contents.
     * </p>
     * 
     * @param deleteFolderRequest
     * @return Result of the DeleteFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFolderResult deleteFolder(DeleteFolderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFolder(request);
    }

    @SdkInternalApi
    final DeleteFolderResult executeDeleteFolder(DeleteFolderRequest deleteFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFolderRequest> request = null;
        Response<DeleteFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFolderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the contents of the specified folder.
     * </p>
     * 
     * @param deleteFolderContentsRequest
     * @return Result of the DeleteFolderContents operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolderContents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFolderContentsResult deleteFolderContents(DeleteFolderContentsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFolderContents(request);
    }

    @SdkInternalApi
    final DeleteFolderContentsResult executeDeleteFolderContents(DeleteFolderContentsRequest deleteFolderContentsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFolderContentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFolderContentsRequest> request = null;
        Response<DeleteFolderContentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFolderContentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFolderContentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFolderContents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFolderContentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFolderContentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified list of labels from a resource.
     * </p>
     * 
     * @param deleteLabelsRequest
     * @return Result of the DeleteLabels operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteLabels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLabelsResult deleteLabels(DeleteLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLabels(request);
    }

    @SdkInternalApi
    final DeleteLabelsResult executeDeleteLabels(DeleteLabelsRequest deleteLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLabelsRequest> request = null;
        Response<DeleteLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLabelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified subscription from the specified organization.
     * </p>
     * 
     * @param deleteNotificationSubscriptionRequest
     * @return Result of the DeleteNotificationSubscription operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DeleteNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNotificationSubscriptionResult deleteNotificationSubscription(DeleteNotificationSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotificationSubscription(request);
    }

    @SdkInternalApi
    final DeleteNotificationSubscriptionResult executeDeleteNotificationSubscription(DeleteNotificationSubscriptionRequest deleteNotificationSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotificationSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationSubscriptionRequest> request = null;
        Response<DeleteNotificationSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteNotificationSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotificationSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotificationSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNotificationSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
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
     * Describes the user activities in a specified time period.
     * </p>
     * 
     * @param describeActivitiesRequest
     * @return Result of the DescribeActivities operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeActivitiesResult describeActivities(DescribeActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeActivities(request);
    }

    @SdkInternalApi
    final DescribeActivitiesResult executeDescribeActivities(DescribeActivitiesRequest describeActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivitiesRequest> request = null;
        Response<DescribeActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeActivitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all the comments for the specified document version.
     * </p>
     * 
     * @param describeCommentsRequest
     * @return Result of the DescribeComments operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeComments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeComments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCommentsResult describeComments(DescribeCommentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComments(request);
    }

    @SdkInternalApi
    final DescribeCommentsResult executeDescribeComments(DescribeCommentsRequest describeCommentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCommentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommentsRequest> request = null;
        Response<DescribeCommentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCommentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCommentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCommentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the document versions for the specified document.
     * </p>
     * <p>
     * By default, only active versions are returned.
     * </p>
     * 
     * @param describeDocumentVersionsRequest
     * @return Result of the DescribeDocumentVersions operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DescribeDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeDocumentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDocumentVersions(request);
    }

    @SdkInternalApi
    final DescribeDocumentVersionsResult executeDescribeDocumentVersions(DescribeDocumentVersionsRequest describeDocumentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDocumentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentVersionsRequest> request = null;
        Response<DescribeDocumentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDocumentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDocumentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDocumentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the contents of the specified folder, including its documents and subfolders.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
     * results, the response includes a marker that you can use to request the next set of results. You can also request
     * initialized documents.
     * </p>
     * 
     * @param describeFolderContentsRequest
     * @return Result of the DescribeFolderContents operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DescribeFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeFolderContents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFolderContentsResult describeFolderContents(DescribeFolderContentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFolderContents(request);
    }

    @SdkInternalApi
    final DescribeFolderContentsResult executeDescribeFolderContents(DescribeFolderContentsRequest describeFolderContentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFolderContentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFolderContentsRequest> request = null;
        Response<DescribeFolderContentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFolderContentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFolderContentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFolderContents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFolderContentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFolderContentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     * </p>
     * 
     * @param describeGroupsRequest
     * @return Result of the DescribeGroups operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeGroupsResult describeGroups(DescribeGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGroups(request);
    }

    @SdkInternalApi
    final DescribeGroupsResult executeDescribeGroups(DescribeGroupsRequest describeGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupsRequest> request = null;
        Response<DescribeGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified notification subscriptions.
     * </p>
     * 
     * @param describeNotificationSubscriptionsRequest
     * @return Result of the DescribeNotificationSubscriptions operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeNotificationSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeNotificationSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotificationSubscriptionsResult describeNotificationSubscriptions(DescribeNotificationSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotificationSubscriptions(request);
    }

    @SdkInternalApi
    final DescribeNotificationSubscriptionsResult executeDescribeNotificationSubscriptions(
            DescribeNotificationSubscriptionsRequest describeNotificationSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotificationSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationSubscriptionsRequest> request = null;
        Response<DescribeNotificationSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotificationSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotificationSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotificationSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNotificationSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions of a specified resource.
     * </p>
     * 
     * @param describeResourcePermissionsRequest
     * @return Result of the DescribeResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourcePermissionsResult describeResourcePermissions(DescribeResourcePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourcePermissions(request);
    }

    @SdkInternalApi
    final DescribeResourcePermissionsResult executeDescribeResourcePermissions(DescribeResourcePermissionsRequest describeResourcePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourcePermissionsRequest> request = null;
        Response<DescribeResourcePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourcePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeResourcePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourcePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourcePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourcePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current user's special folders; the <code>RootFolder</code> and the <code>RecycleBin</code>.
     * <code>RootFolder</code> is the root of user's files and folders and <code>RecycleBin</code> is the root of
     * recycled items. This is not a valid action for SigV4 (administrative API) clients.
     * </p>
     * <p>
     * This action requires an authentication token. To get an authentication token, register an application with Amazon
     * WorkDocs. For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/wd-auth-user.html">Authentication and Access
     * Control for User Applications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param describeRootFoldersRequest
     * @return Result of the DescribeRootFolders operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeRootFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRootFoldersResult describeRootFolders(DescribeRootFoldersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRootFolders(request);
    }

    @SdkInternalApi
    final DescribeRootFoldersResult executeDescribeRootFolders(DescribeRootFoldersRequest describeRootFoldersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRootFoldersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRootFoldersRequest> request = null;
        Response<DescribeRootFoldersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRootFoldersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRootFoldersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRootFolders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRootFoldersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRootFoldersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified users. You can describe all users or filter the results (for example, by status or
     * organization).
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
     * includes a marker that you can use to request the next set of results.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws RequestedEntityTooLargeException
     *         The response is too large to return. The request must include a filter to reduce the size of the
     *         response.
     * @sample AmazonWorkDocs.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUsersResult describeUsers(DescribeUsersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUsers(request);
    }

    @SdkInternalApi
    final DescribeUsersResult executeDescribeUsers(DescribeUsersRequest describeUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUsersRequest> request = null;
        Response<DescribeUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
     * for SigV4 (administrative API) clients.
     * </p>
     * 
     * @param getCurrentUserRequest
     * @return Result of the GetCurrentUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetCurrentUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetCurrentUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCurrentUserResult getCurrentUser(GetCurrentUserRequest request) {
        request = beforeClientExecution(request);
        return executeGetCurrentUser(request);
    }

    @SdkInternalApi
    final GetCurrentUserResult executeGetCurrentUser(GetCurrentUserRequest getCurrentUserRequest) {

        ExecutionContext executionContext = createExecutionContext(getCurrentUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCurrentUserRequest> request = null;
        Response<GetCurrentUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCurrentUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCurrentUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCurrentUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCurrentUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCurrentUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details of a document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws InvalidPasswordException
     *         The password is invalid.
     * @sample AmazonWorkDocs.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDocumentResult getDocument(GetDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocument(request);
    }

    @SdkInternalApi
    final GetDocumentResult executeGetDocument(GetDocumentRequest getDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the requested document.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * names of the parent folders.
     * </p>
     * 
     * @param getDocumentPathRequest
     * @return Result of the GetDocumentPath operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetDocumentPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentPath" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDocumentPathResult getDocumentPath(GetDocumentPathRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentPath(request);
    }

    @SdkInternalApi
    final GetDocumentPathResult executeGetDocumentPath(GetDocumentPathRequest getDocumentPathRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentPathRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentPathRequest> request = null;
        Response<GetDocumentPathResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentPathRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentPathRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentPath");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentPathResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentPathResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves version metadata for the specified document.
     * </p>
     * 
     * @param getDocumentVersionRequest
     * @return Result of the GetDocumentVersion operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws InvalidPasswordException
     *         The password is invalid.
     * @sample AmazonWorkDocs.GetDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDocumentVersionResult getDocumentVersion(GetDocumentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentVersion(request);
    }

    @SdkInternalApi
    final GetDocumentVersionResult executeGetDocumentVersion(GetDocumentVersionRequest getDocumentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentVersionRequest> request = null;
        Response<GetDocumentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the metadata of the specified folder.
     * </p>
     * 
     * @param getFolderRequest
     * @return Result of the GetFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFolderResult getFolder(GetFolderRequest request) {
        request = beforeClientExecution(request);
        return executeGetFolder(request);
    }

    @SdkInternalApi
    final GetFolderResult executeGetFolder(GetFolderRequest getFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(getFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFolderRequest> request = null;
        Response<GetFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFolderResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * parent folder names.
     * </p>
     * 
     * @param getFolderPathRequest
     * @return Result of the GetFolderPath operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetFolderPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolderPath" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFolderPathResult getFolderPath(GetFolderPathRequest request) {
        request = beforeClientExecution(request);
        return executeGetFolderPath(request);
    }

    @SdkInternalApi
    final GetFolderPathResult executeGetFolderPath(GetFolderPathRequest getFolderPathRequest) {

        ExecutionContext executionContext = createExecutionContext(getFolderPathRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFolderPathRequest> request = null;
        Response<GetFolderPathResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFolderPathRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFolderPathRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFolderPath");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFolderPathResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFolderPathResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a collection of resources, including folders and documents. The only <code>CollectionType</code>
     * supported is <code>SHARED_WITH_ME</code>.
     * </p>
     * 
     * @param getResourcesRequest
     * @return Result of the GetResources operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetResources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResources(request);
    }

    @SdkInternalApi
    final GetResourcesResult executeGetResources(GetResourcesRequest getResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new document object and version object.
     * </p>
     * <p>
     * The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
     * creating a new version of an existing document. This is the first step to upload a document. Next, upload the
     * document to the URL returned from the call, and then call <a>UpdateDocumentVersion</a>.
     * </p>
     * <p>
     * To cancel the document upload, call <a>AbortDocumentVersionUpload</a>.
     * </p>
     * 
     * @param initiateDocumentVersionUploadRequest
     * @return Result of the InitiateDocumentVersionUpload operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws StorageLimitExceededException
     *         The storage limit has been exceeded.
     * @throws StorageLimitWillExceedException
     *         The storage limit will be exceeded.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DraftUploadOutOfSyncException
     *         This exception is thrown when a valid checkout ID is not presented on document version upload calls for a
     *         document that has been checked out from Web client.
     * @throws ResourceAlreadyCheckedOutException
     *         The resource is already checked out.
     * @sample AmazonWorkDocs.InitiateDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InitiateDocumentVersionUploadResult initiateDocumentVersionUpload(InitiateDocumentVersionUploadRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateDocumentVersionUpload(request);
    }

    @SdkInternalApi
    final InitiateDocumentVersionUploadResult executeInitiateDocumentVersionUpload(InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateDocumentVersionUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateDocumentVersionUploadRequest> request = null;
        Response<InitiateDocumentVersionUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateDocumentVersionUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(initiateDocumentVersionUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateDocumentVersionUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateDocumentVersionUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InitiateDocumentVersionUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes all the permissions from the specified resource.
     * </p>
     * 
     * @param removeAllResourcePermissionsRequest
     * @return Result of the RemoveAllResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.RemoveAllResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveAllResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveAllResourcePermissionsResult removeAllResourcePermissions(RemoveAllResourcePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAllResourcePermissions(request);
    }

    @SdkInternalApi
    final RemoveAllResourcePermissionsResult executeRemoveAllResourcePermissions(RemoveAllResourcePermissionsRequest removeAllResourcePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAllResourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAllResourcePermissionsRequest> request = null;
        Response<RemoveAllResourcePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAllResourcePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeAllResourcePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAllResourcePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAllResourcePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveAllResourcePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the permission for the specified principal from the specified resource.
     * </p>
     * 
     * @param removeResourcePermissionRequest
     * @return Result of the RemoveResourcePermission operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.RemoveResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveResourcePermissionResult removeResourcePermission(RemoveResourcePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveResourcePermission(request);
    }

    @SdkInternalApi
    final RemoveResourcePermissionResult executeRemoveResourcePermission(RemoveResourcePermissionRequest removeResourcePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeResourcePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveResourcePermissionRequest> request = null;
        Response<RemoveResourcePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveResourcePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeResourcePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveResourcePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveResourcePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveResourcePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified attributes of a document. The user must have access to both the document and its parent
     * folder, if applicable.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return Result of the UpdateDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDocumentResult updateDocument(UpdateDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocument(request);
    }

    @SdkInternalApi
    final UpdateDocumentResult executeUpdateDocument(UpdateDocumentRequest updateDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentRequest> request = null;
        Response<UpdateDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of the document version to ACTIVE.
     * </p>
     * <p>
     * Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
     * client uploads the document to an S3-presigned URL returned by <a>InitiateDocumentVersionUpload</a>.
     * </p>
     * 
     * @param updateDocumentVersionRequest
     * @return Result of the UpdateDocumentVersion operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws InvalidOperationException
     *         The operation is invalid.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDocumentVersionResult updateDocumentVersion(UpdateDocumentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocumentVersion(request);
    }

    @SdkInternalApi
    final UpdateDocumentVersionResult executeUpdateDocumentVersion(UpdateDocumentVersionRequest updateDocumentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentVersionRequest> request = null;
        Response<UpdateDocumentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDocumentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocumentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDocumentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its
     * parent folder, if applicable.
     * </p>
     * 
     * @param updateFolderRequest
     * @return Result of the UpdateFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFolderResult updateFolder(UpdateFolderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFolder(request);
    }

    @SdkInternalApi
    final UpdateFolderResult executeUpdateFolder(UpdateFolderRequest updateFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFolderRequest> request = null;
        Response<UpdateFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFolderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
     * Amazon WorkDocs site.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws IllegalUserStateException
     *         The user is undergoing transfer of ownership.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DeactivatingLastSystemUserException
     *         The last user in the organization is being deactivated.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @sample AmazonWorkDocs.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkDocs");
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

}
