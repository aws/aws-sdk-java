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
package com.amazonaws.services.ssoadmin;

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

import com.amazonaws.services.ssoadmin.AWSSSOAdminClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.services.ssoadmin.model.transform.*;

/**
 * Client for accessing SSO Admin. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * IAM Identity Center (successor to Single Sign-On) helps you securely create, or connect, your workforce identities
 * and manage their access centrally across Amazon Web Services accounts and applications. IAM Identity Center is the
 * recommended approach for workforce authentication and authorization in Amazon Web Services, for organizations of any
 * size and type.
 * </p>
 * <note>
 * <p>
 * IAM Identity Center uses the <code>sso</code> and <code>identitystore</code> API namespaces.
 * </p>
 * </note>
 * <p>
 * This reference guide provides information on single sign-on operations which could be used for access management of
 * Amazon Web Services accounts. For information about IAM Identity Center features, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * <p>
 * Many operations in the IAM Identity Center APIs rely on identifiers for users and groups, known as principals. For
 * more information about how to work with principals and principal IDs in IAM Identity Center, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/welcome.html">Identity Store API
 * Reference</a>.
 * </p>
 * <note>
 * <p>
 * Amazon Web Services provides SDKs that consist of libraries and sample code for various programming languages and
 * platforms (Java, Ruby, .Net, iOS, Android, and more). The SDKs provide a convenient way to create programmatic access
 * to IAM Identity Center and other Amazon Web Services services. For more information about the Amazon Web Services
 * SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOAdminClient extends AmazonWebServiceClient implements AWSSSOAdmin {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSSOAdmin.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sso";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssoadmin.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ssoadmin.model.AWSSSOAdminException.class));

    public static AWSSSOAdminClientBuilder builder() {
        return AWSSSOAdminClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SSO Admin using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOAdminClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SSO Admin using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOAdminClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sso.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ssoadmin/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ssoadmin/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Attaches the specified customer managed policy to the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param attachCustomerManagedPolicyReferenceToPermissionSetRequest
     * @return Result of the AttachCustomerManagedPolicyReferenceToPermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.AttachCustomerManagedPolicyReferenceToPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachCustomerManagedPolicyReferenceToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachCustomerManagedPolicyReferenceToPermissionSetResult attachCustomerManagedPolicyReferenceToPermissionSet(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeAttachCustomerManagedPolicyReferenceToPermissionSet(request);
    }

    @SdkInternalApi
    final AttachCustomerManagedPolicyReferenceToPermissionSetResult executeAttachCustomerManagedPolicyReferenceToPermissionSet(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest attachCustomerManagedPolicyReferenceToPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(attachCustomerManagedPolicyReferenceToPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachCustomerManagedPolicyReferenceToPermissionSetRequest> request = null;
        Response<AttachCustomerManagedPolicyReferenceToPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachCustomerManagedPolicyReferenceToPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachCustomerManagedPolicyReferenceToPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachCustomerManagedPolicyReferenceToPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachCustomerManagedPolicyReferenceToPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AttachCustomerManagedPolicyReferenceToPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an Amazon Web Services managed policy ARN to a permission set.
     * </p>
     * <note>
     * <p>
     * If the permission set is already referenced by one or more account assignments, you will need to call
     * <code> <a>ProvisionPermissionSet</a> </code> after this operation. Calling <code>ProvisionPermissionSet</code>
     * applies the corresponding IAM policy updates to all assigned accounts.
     * </p>
     * </note>
     * 
     * @param attachManagedPolicyToPermissionSetRequest
     * @return Result of the AttachManagedPolicyToPermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.AttachManagedPolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachManagedPolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachManagedPolicyToPermissionSetResult attachManagedPolicyToPermissionSet(AttachManagedPolicyToPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeAttachManagedPolicyToPermissionSet(request);
    }

    @SdkInternalApi
    final AttachManagedPolicyToPermissionSetResult executeAttachManagedPolicyToPermissionSet(
            AttachManagedPolicyToPermissionSetRequest attachManagedPolicyToPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(attachManagedPolicyToPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachManagedPolicyToPermissionSetRequest> request = null;
        Response<AttachManagedPolicyToPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachManagedPolicyToPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(attachManagedPolicyToPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachManagedPolicyToPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachManagedPolicyToPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AttachManagedPolicyToPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns access to a principal for a specified Amazon Web Services account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * The term <i>principal</i> here refers to a user or group that is defined in IAM Identity Center.
     * </p>
     * </note> <note>
     * <p>
     * As part of a successful <code>CreateAccountAssignment</code> call, the specified permission set will
     * automatically be provisioned to the account in the form of an IAM policy. That policy is attached to the IAM role
     * created in IAM Identity Center. If the permission set is subsequently updated, the corresponding IAM policies
     * attached to roles in your accounts will not be updated automatically. In this case, you must call
     * <code> <a>ProvisionPermissionSet</a> </code> to make these updates.
     * </p>
     * </note> <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentCreationStatus</code> to describe the status of
     * an assignment creation request.
     * </p>
     * </note>
     * 
     * @param createAccountAssignmentRequest
     * @return Result of the CreateAccountAssignment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccountAssignmentResult createAccountAssignment(CreateAccountAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccountAssignment(request);
    }

    @SdkInternalApi
    final CreateAccountAssignmentResult executeCreateAccountAssignment(CreateAccountAssignmentRequest createAccountAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccountAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountAssignmentRequest> request = null;
        Response<CreateAccountAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAccountAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccountAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccountAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAccountAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application in IAM Identity Center for the given application provider.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grant application access to a user or group.
     * </p>
     * 
     * @param createApplicationAssignmentRequest
     * @return Result of the CreateApplicationAssignment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationAssignmentResult createApplicationAssignment(CreateApplicationAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplicationAssignment(request);
    }

    @SdkInternalApi
    final CreateApplicationAssignmentResult executeCreateApplicationAssignment(CreateApplicationAssignmentRequest createApplicationAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationAssignmentRequest> request = null;
        Response<CreateApplicationAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createApplicationAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplicationAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateApplicationAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an instance of IAM Identity Center for a standalone Amazon Web Services account that is not managed by
     * Organizations or a member Amazon Web Services account in an organization. You can create only one instance per
     * account and across all Amazon Web Services Regions.
     * </p>
     * <p>
     * The CreateInstance request is rejected if the following apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The instance is created within the organization management account.
     * </p>
     * </li>
     * <li>
     * <p>
     * An instance already exists in the same account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstanceResult createInstance(CreateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstance(request);
    }

    @SdkInternalApi
    final CreateInstanceResult executeCreateInstance(CreateInstanceRequest createInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceRequest> request = null;
        Response<CreateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance. You
     * can also specify new attributes to add to your ABAC configuration during the enabling process. For more
     * information about ABAC, see <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a>
     * in the <i>IAM Identity Center User Guide</i>.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeInstanceAccessControlAttributeConfiguration</code> to validate
     * that <code>InstanceAccessControlAttributeConfiguration</code> was created.
     * </p>
     * </note>
     * 
     * @param createInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the CreateInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstanceAccessControlAttributeConfigurationResult createInstanceAccessControlAttributeConfiguration(
            CreateInstanceAccessControlAttributeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceAccessControlAttributeConfiguration(request);
    }

    @SdkInternalApi
    final CreateInstanceAccessControlAttributeConfigurationResult executeCreateInstanceAccessControlAttributeConfiguration(
            CreateInstanceAccessControlAttributeConfigurationRequest createInstanceAccessControlAttributeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceAccessControlAttributeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceAccessControlAttributeConfigurationRequest> request = null;
        Response<CreateInstanceAccessControlAttributeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceAccessControlAttributeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInstanceAccessControlAttributeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstanceAccessControlAttributeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceAccessControlAttributeConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateInstanceAccessControlAttributeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a permission set within a specified IAM Identity Center instance.
     * </p>
     * <note>
     * <p>
     * To grant users and groups access to Amazon Web Services account resources, use
     * <code> <a>CreateAccountAssignment</a> </code>.
     * </p>
     * </note>
     * 
     * @param createPermissionSetRequest
     * @return Result of the CreatePermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePermissionSetResult createPermissionSet(CreatePermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePermissionSet(request);
    }

    @SdkInternalApi
    final CreatePermissionSetResult executeCreatePermissionSet(CreatePermissionSetRequest createPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePermissionSetRequest> request = null;
        Response<CreatePermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a connection to a trusted token issuer in an instance of IAM Identity Center. A trusted token issuer
     * enables trusted identity propagation to be used with applications that authenticate outside of Amazon Web
     * Services.
     * </p>
     * <p>
     * This trusted token issuer describes an external identity provider (IdP) that can generate claims or assertions in
     * the form of access tokens for a user. Applications enabled for IAM Identity Center can use these tokens for
     * authentication.
     * </p>
     * 
     * @param createTrustedTokenIssuerRequest
     * @return Result of the CreateTrustedTokenIssuer operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrustedTokenIssuerResult createTrustedTokenIssuer(CreateTrustedTokenIssuerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrustedTokenIssuer(request);
    }

    @SdkInternalApi
    final CreateTrustedTokenIssuerResult executeCreateTrustedTokenIssuer(CreateTrustedTokenIssuerRequest createTrustedTokenIssuerRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrustedTokenIssuerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustedTokenIssuerRequest> request = null;
        Response<CreateTrustedTokenIssuerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustedTokenIssuerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTrustedTokenIssuerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrustedTokenIssuer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrustedTokenIssuerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateTrustedTokenIssuerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a principal's access from a specified Amazon Web Services account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentDeletionStatus</code> to describe the status of
     * an assignment deletion request.
     * </p>
     * </note>
     * 
     * @param deleteAccountAssignmentRequest
     * @return Result of the DeleteAccountAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccountAssignmentResult deleteAccountAssignment(DeleteAccountAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountAssignment(request);
    }

    @SdkInternalApi
    final DeleteAccountAssignmentResult executeDeleteAccountAssignment(DeleteAccountAssignmentRequest deleteAccountAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountAssignmentRequest> request = null;
        Response<DeleteAccountAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccountAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccountAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association with the application. The connected service resource still exists.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an IAM Identity Center access scope from an application.
     * </p>
     * 
     * @param deleteApplicationAccessScopeRequest
     * @return Result of the DeleteApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationAccessScopeResult deleteApplicationAccessScope(DeleteApplicationAccessScopeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationAccessScope(request);
    }

    @SdkInternalApi
    final DeleteApplicationAccessScopeResult executeDeleteApplicationAccessScope(DeleteApplicationAccessScopeRequest deleteApplicationAccessScopeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationAccessScopeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationAccessScopeRequest> request = null;
        Response<DeleteApplicationAccessScopeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationAccessScopeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationAccessScopeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationAccessScope");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationAccessScopeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationAccessScopeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revoke application access to an application by deleting application assignments for a user or group.
     * </p>
     * 
     * @param deleteApplicationAssignmentRequest
     * @return Result of the DeleteApplicationAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationAssignmentResult deleteApplicationAssignment(DeleteApplicationAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationAssignment(request);
    }

    @SdkInternalApi
    final DeleteApplicationAssignmentResult executeDeleteApplicationAssignment(DeleteApplicationAssignmentRequest deleteApplicationAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationAssignmentRequest> request = null;
        Response<DeleteApplicationAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an authentication method from an application.
     * </p>
     * 
     * @param deleteApplicationAuthenticationMethodRequest
     * @return Result of the DeleteApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationAuthenticationMethodResult deleteApplicationAuthenticationMethod(DeleteApplicationAuthenticationMethodRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationAuthenticationMethod(request);
    }

    @SdkInternalApi
    final DeleteApplicationAuthenticationMethodResult executeDeleteApplicationAuthenticationMethod(
            DeleteApplicationAuthenticationMethodRequest deleteApplicationAuthenticationMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationAuthenticationMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationAuthenticationMethodRequest> request = null;
        Response<DeleteApplicationAuthenticationMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationAuthenticationMethodRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationAuthenticationMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationAuthenticationMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationAuthenticationMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationAuthenticationMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a grant from an application.
     * </p>
     * 
     * @param deleteApplicationGrantRequest
     * @return Result of the DeleteApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationGrant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationGrantResult deleteApplicationGrant(DeleteApplicationGrantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationGrant(request);
    }

    @SdkInternalApi
    final DeleteApplicationGrantResult executeDeleteApplicationGrant(DeleteApplicationGrantRequest deleteApplicationGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationGrantRequest> request = null;
        Response<DeleteApplicationGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the inline policy from a specified permission set.
     * </p>
     * 
     * @param deleteInlinePolicyFromPermissionSetRequest
     * @return Result of the DeleteInlinePolicyFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInlinePolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInlinePolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInlinePolicyFromPermissionSetResult deleteInlinePolicyFromPermissionSet(DeleteInlinePolicyFromPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInlinePolicyFromPermissionSet(request);
    }

    @SdkInternalApi
    final DeleteInlinePolicyFromPermissionSetResult executeDeleteInlinePolicyFromPermissionSet(
            DeleteInlinePolicyFromPermissionSetRequest deleteInlinePolicyFromPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInlinePolicyFromPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInlinePolicyFromPermissionSetRequest> request = null;
        Response<DeleteInlinePolicyFromPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInlinePolicyFromPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInlinePolicyFromPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInlinePolicyFromPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInlinePolicyFromPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInlinePolicyFromPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the instance of IAM Identity Center. Only the account that owns the instance can call this API. Neither
     * the delegated administrator nor member account can delete the organization instance, but those roles can delete
     * their own instance.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstance" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
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
     * Disables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance and
     * deletes all of the attribute mappings that have been configured. Once deleted, any attributes that are received
     * from an identity source and any custom attributes you have previously configured will not be passed. For more
     * information about ABAC, see <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a>
     * in the <i>IAM Identity Center User Guide</i>.
     * </p>
     * 
     * @param deleteInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the DeleteInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInstanceAccessControlAttributeConfigurationResult deleteInstanceAccessControlAttributeConfiguration(
            DeleteInstanceAccessControlAttributeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceAccessControlAttributeConfiguration(request);
    }

    @SdkInternalApi
    final DeleteInstanceAccessControlAttributeConfigurationResult executeDeleteInstanceAccessControlAttributeConfiguration(
            DeleteInstanceAccessControlAttributeConfigurationRequest deleteInstanceAccessControlAttributeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceAccessControlAttributeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceAccessControlAttributeConfigurationRequest> request = null;
        Response<DeleteInstanceAccessControlAttributeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceAccessControlAttributeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInstanceAccessControlAttributeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceAccessControlAttributeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceAccessControlAttributeConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInstanceAccessControlAttributeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified permission set.
     * </p>
     * 
     * @param deletePermissionSetRequest
     * @return Result of the DeletePermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeletePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePermissionSetResult deletePermissionSet(DeletePermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermissionSet(request);
    }

    @SdkInternalApi
    final DeletePermissionSetResult executeDeletePermissionSet(DeletePermissionSetRequest deletePermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionSetRequest> request = null;
        Response<DeletePermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the permissions boundary from a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param deletePermissionsBoundaryFromPermissionSetRequest
     * @return Result of the DeletePermissionsBoundaryFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeletePermissionsBoundaryFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionsBoundaryFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePermissionsBoundaryFromPermissionSetResult deletePermissionsBoundaryFromPermissionSet(DeletePermissionsBoundaryFromPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermissionsBoundaryFromPermissionSet(request);
    }

    @SdkInternalApi
    final DeletePermissionsBoundaryFromPermissionSetResult executeDeletePermissionsBoundaryFromPermissionSet(
            DeletePermissionsBoundaryFromPermissionSetRequest deletePermissionsBoundaryFromPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionsBoundaryFromPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionsBoundaryFromPermissionSetRequest> request = null;
        Response<DeletePermissionsBoundaryFromPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionsBoundaryFromPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePermissionsBoundaryFromPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermissionsBoundaryFromPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionsBoundaryFromPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeletePermissionsBoundaryFromPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a trusted token issuer configuration from an instance of IAM Identity Center.
     * </p>
     * <note>
     * <p>
     * Deleting this trusted token issuer configuration will cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param deleteTrustedTokenIssuerRequest
     * @return Result of the DeleteTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrustedTokenIssuerResult deleteTrustedTokenIssuer(DeleteTrustedTokenIssuerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrustedTokenIssuer(request);
    }

    @SdkInternalApi
    final DeleteTrustedTokenIssuerResult executeDeleteTrustedTokenIssuer(DeleteTrustedTokenIssuerRequest deleteTrustedTokenIssuerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrustedTokenIssuerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustedTokenIssuerRequest> request = null;
        Response<DeleteTrustedTokenIssuerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustedTokenIssuerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTrustedTokenIssuerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrustedTokenIssuer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrustedTokenIssuerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTrustedTokenIssuerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status of the assignment creation request.
     * </p>
     * 
     * @param describeAccountAssignmentCreationStatusRequest
     * @return Result of the DescribeAccountAssignmentCreationStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeAccountAssignmentCreationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountAssignmentCreationStatusResult describeAccountAssignmentCreationStatus(DescribeAccountAssignmentCreationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAssignmentCreationStatus(request);
    }

    @SdkInternalApi
    final DescribeAccountAssignmentCreationStatusResult executeDescribeAccountAssignmentCreationStatus(
            DescribeAccountAssignmentCreationStatusRequest describeAccountAssignmentCreationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAssignmentCreationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAssignmentCreationStatusRequest> request = null;
        Response<DescribeAccountAssignmentCreationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAssignmentCreationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAssignmentCreationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAssignmentCreationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAssignmentCreationStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAccountAssignmentCreationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status of the assignment deletion request.
     * </p>
     * 
     * @param describeAccountAssignmentDeletionStatusRequest
     * @return Result of the DescribeAccountAssignmentDeletionStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeAccountAssignmentDeletionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountAssignmentDeletionStatusResult describeAccountAssignmentDeletionStatus(DescribeAccountAssignmentDeletionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAssignmentDeletionStatus(request);
    }

    @SdkInternalApi
    final DescribeAccountAssignmentDeletionStatusResult executeDescribeAccountAssignmentDeletionStatus(
            DescribeAccountAssignmentDeletionStatusRequest describeAccountAssignmentDeletionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAssignmentDeletionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAssignmentDeletionStatusRequest> request = null;
        Response<DescribeAccountAssignmentDeletionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAssignmentDeletionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAssignmentDeletionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAssignmentDeletionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAssignmentDeletionStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAccountAssignmentDeletionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of an application associated with an instance of IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplication(request);
    }

    @SdkInternalApi
    final DescribeApplicationResult executeDescribeApplication(DescribeApplicationRequest describeApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationRequest> request = null;
        Response<DescribeApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a direct assignment of a user or group to an application. If the user doesn’t have a direct assignment
     * to the application, the user may still have access to the application through a group. Therefore, don’t use this
     * API to test access to an application for a user. Instead use <a>ListApplicationAssignmentsForPrincipal</a>.
     * </p>
     * 
     * @param describeApplicationAssignmentRequest
     * @return Result of the DescribeApplicationAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationAssignmentResult describeApplicationAssignment(DescribeApplicationAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationAssignment(request);
    }

    @SdkInternalApi
    final DescribeApplicationAssignmentResult executeDescribeApplicationAssignment(DescribeApplicationAssignmentRequest describeApplicationAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationAssignmentRequest> request = null;
        Response<DescribeApplicationAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about a provider that can be used to connect an Amazon Web Services managed application or
     * customer managed application to IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationProviderRequest
     * @return Result of the DescribeApplicationProvider operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplicationProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationProviderResult describeApplicationProvider(DescribeApplicationProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationProvider(request);
    }

    @SdkInternalApi
    final DescribeApplicationProviderResult executeDescribeApplicationProvider(DescribeApplicationProviderRequest describeApplicationProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationProviderRequest> request = null;
        Response<DescribeApplicationProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of an instance of IAM Identity Center. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The instance is in the process of being created. When the instance is ready for
     * use, DescribeInstance returns the status of <code>ACTIVE</code>. While the instance is in the
     * <code>CREATE_IN_PROGRESS</code> state, you can call only DescribeInstance and DeleteInstance operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> - The instance is being deleted. Returns <code>AccessDeniedException</code> after
     * the delete operation completes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The instance is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceRequest
     * @return Result of the DescribeInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInstanceResult describeInstance(DescribeInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstance(request);
    }

    @SdkInternalApi
    final DescribeInstanceResult executeDescribeInstance(DescribeInstanceRequest describeInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceRequest> request = null;
        Response<DescribeInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of IAM Identity Center identity store attributes that have been configured to work with
     * attributes-based access control (ABAC) for the specified IAM Identity Center instance. This will not return
     * attributes configured and sent by an external identity provider. For more information about ABAC, see <a
     * href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a> in the <i>IAM Identity Center
     * User Guide</i>.
     * </p>
     * 
     * @param describeInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the DescribeInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceAccessControlAttributeConfigurationResult describeInstanceAccessControlAttributeConfiguration(
            DescribeInstanceAccessControlAttributeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceAccessControlAttributeConfiguration(request);
    }

    @SdkInternalApi
    final DescribeInstanceAccessControlAttributeConfigurationResult executeDescribeInstanceAccessControlAttributeConfiguration(
            DescribeInstanceAccessControlAttributeConfigurationRequest describeInstanceAccessControlAttributeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceAccessControlAttributeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceAccessControlAttributeConfigurationRequest> request = null;
        Response<DescribeInstanceAccessControlAttributeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceAccessControlAttributeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceAccessControlAttributeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceAccessControlAttributeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceAccessControlAttributeConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeInstanceAccessControlAttributeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of the permission set.
     * </p>
     * 
     * @param describePermissionSetRequest
     * @return Result of the DescribePermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePermissionSetResult describePermissionSet(DescribePermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePermissionSet(request);
    }

    @SdkInternalApi
    final DescribePermissionSetResult executeDescribePermissionSet(DescribePermissionSetRequest describePermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describePermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePermissionSetRequest> request = null;
        Response<DescribePermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribePermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status for the given permission set provisioning request.
     * </p>
     * 
     * @param describePermissionSetProvisioningStatusRequest
     * @return Result of the DescribePermissionSetProvisioningStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribePermissionSetProvisioningStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePermissionSetProvisioningStatusResult describePermissionSetProvisioningStatus(DescribePermissionSetProvisioningStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePermissionSetProvisioningStatus(request);
    }

    @SdkInternalApi
    final DescribePermissionSetProvisioningStatusResult executeDescribePermissionSetProvisioningStatus(
            DescribePermissionSetProvisioningStatusRequest describePermissionSetProvisioningStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describePermissionSetProvisioningStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePermissionSetProvisioningStatusRequest> request = null;
        Response<DescribePermissionSetProvisioningStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePermissionSetProvisioningStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePermissionSetProvisioningStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePermissionSetProvisioningStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePermissionSetProvisioningStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribePermissionSetProvisioningStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about a trusted token issuer configuration stored in an instance of IAM Identity Center.
     * Details include the name of the trusted token issuer, the issuer URL, and the path of the source attribute and
     * the destination attribute for a trusted token issuer configuration.
     * </p>
     * 
     * @param describeTrustedTokenIssuerRequest
     * @return Result of the DescribeTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrustedTokenIssuerResult describeTrustedTokenIssuer(DescribeTrustedTokenIssuerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrustedTokenIssuer(request);
    }

    @SdkInternalApi
    final DescribeTrustedTokenIssuerResult executeDescribeTrustedTokenIssuer(DescribeTrustedTokenIssuerRequest describeTrustedTokenIssuerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustedTokenIssuerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedTokenIssuerRequest> request = null;
        Response<DescribeTrustedTokenIssuerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedTokenIssuerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrustedTokenIssuerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrustedTokenIssuer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustedTokenIssuerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrustedTokenIssuerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the specified customer managed policy from the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param detachCustomerManagedPolicyReferenceFromPermissionSetRequest
     * @return Result of the DetachCustomerManagedPolicyReferenceFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DetachCustomerManagedPolicyReferenceFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachCustomerManagedPolicyReferenceFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachCustomerManagedPolicyReferenceFromPermissionSetResult detachCustomerManagedPolicyReferenceFromPermissionSet(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDetachCustomerManagedPolicyReferenceFromPermissionSet(request);
    }

    @SdkInternalApi
    final DetachCustomerManagedPolicyReferenceFromPermissionSetResult executeDetachCustomerManagedPolicyReferenceFromPermissionSet(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest detachCustomerManagedPolicyReferenceFromPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(detachCustomerManagedPolicyReferenceFromPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest> request = null;
        Response<DetachCustomerManagedPolicyReferenceFromPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachCustomerManagedPolicyReferenceFromPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detachCustomerManagedPolicyReferenceFromPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachCustomerManagedPolicyReferenceFromPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachCustomerManagedPolicyReferenceFromPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DetachCustomerManagedPolicyReferenceFromPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the attached Amazon Web Services managed policy ARN from the specified permission set.
     * </p>
     * 
     * @param detachManagedPolicyFromPermissionSetRequest
     * @return Result of the DetachManagedPolicyFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DetachManagedPolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachManagedPolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachManagedPolicyFromPermissionSetResult detachManagedPolicyFromPermissionSet(DetachManagedPolicyFromPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeDetachManagedPolicyFromPermissionSet(request);
    }

    @SdkInternalApi
    final DetachManagedPolicyFromPermissionSetResult executeDetachManagedPolicyFromPermissionSet(
            DetachManagedPolicyFromPermissionSetRequest detachManagedPolicyFromPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(detachManagedPolicyFromPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachManagedPolicyFromPermissionSetRequest> request = null;
        Response<DetachManagedPolicyFromPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachManagedPolicyFromPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detachManagedPolicyFromPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachManagedPolicyFromPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachManagedPolicyFromPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetachManagedPolicyFromPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param getApplicationAccessScopeRequest
     * @return Result of the GetApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationAccessScopeResult getApplicationAccessScope(GetApplicationAccessScopeRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationAccessScope(request);
    }

    @SdkInternalApi
    final GetApplicationAccessScopeResult executeGetApplicationAccessScope(GetApplicationAccessScopeRequest getApplicationAccessScopeRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationAccessScopeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationAccessScopeRequest> request = null;
        Response<GetApplicationAccessScopeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationAccessScopeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationAccessScopeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationAccessScope");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationAccessScopeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationAccessScopeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration of <a>PutApplicationAssignmentConfiguration</a>.
     * </p>
     * 
     * @param getApplicationAssignmentConfigurationRequest
     * @return Result of the GetApplicationAssignmentConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationAssignmentConfigurationResult getApplicationAssignmentConfiguration(GetApplicationAssignmentConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationAssignmentConfiguration(request);
    }

    @SdkInternalApi
    final GetApplicationAssignmentConfigurationResult executeGetApplicationAssignmentConfiguration(
            GetApplicationAssignmentConfigurationRequest getApplicationAssignmentConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationAssignmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationAssignmentConfigurationRequest> request = null;
        Response<GetApplicationAssignmentConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationAssignmentConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationAssignmentConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationAssignmentConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationAssignmentConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationAssignmentConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about an authentication method used by an application.
     * </p>
     * 
     * @param getApplicationAuthenticationMethodRequest
     * @return Result of the GetApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationAuthenticationMethodResult getApplicationAuthenticationMethod(GetApplicationAuthenticationMethodRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationAuthenticationMethod(request);
    }

    @SdkInternalApi
    final GetApplicationAuthenticationMethodResult executeGetApplicationAuthenticationMethod(
            GetApplicationAuthenticationMethodRequest getApplicationAuthenticationMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationAuthenticationMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationAuthenticationMethodRequest> request = null;
        Response<GetApplicationAuthenticationMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationAuthenticationMethodRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationAuthenticationMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationAuthenticationMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationAuthenticationMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationAuthenticationMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about an application grant.
     * </p>
     * 
     * @param getApplicationGrantRequest
     * @return Result of the GetApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetApplicationGrantResult getApplicationGrant(GetApplicationGrantRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationGrant(request);
    }

    @SdkInternalApi
    final GetApplicationGrantResult executeGetApplicationGrant(GetApplicationGrantRequest getApplicationGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationGrantRequest> request = null;
        Response<GetApplicationGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains the inline policy assigned to the permission set.
     * </p>
     * 
     * @param getInlinePolicyForPermissionSetRequest
     * @return Result of the GetInlinePolicyForPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetInlinePolicyForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetInlinePolicyForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInlinePolicyForPermissionSetResult getInlinePolicyForPermissionSet(GetInlinePolicyForPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetInlinePolicyForPermissionSet(request);
    }

    @SdkInternalApi
    final GetInlinePolicyForPermissionSetResult executeGetInlinePolicyForPermissionSet(
            GetInlinePolicyForPermissionSetRequest getInlinePolicyForPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getInlinePolicyForPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInlinePolicyForPermissionSetRequest> request = null;
        Response<GetInlinePolicyForPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInlinePolicyForPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInlinePolicyForPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInlinePolicyForPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInlinePolicyForPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInlinePolicyForPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains the permissions boundary for a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param getPermissionsBoundaryForPermissionSetRequest
     * @return Result of the GetPermissionsBoundaryForPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetPermissionsBoundaryForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPermissionsBoundaryForPermissionSetResult getPermissionsBoundaryForPermissionSet(GetPermissionsBoundaryForPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetPermissionsBoundaryForPermissionSet(request);
    }

    @SdkInternalApi
    final GetPermissionsBoundaryForPermissionSetResult executeGetPermissionsBoundaryForPermissionSet(
            GetPermissionsBoundaryForPermissionSetRequest getPermissionsBoundaryForPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getPermissionsBoundaryForPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionsBoundaryForPermissionSetRequest> request = null;
        Response<GetPermissionsBoundaryForPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionsBoundaryForPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPermissionsBoundaryForPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPermissionsBoundaryForPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPermissionsBoundaryForPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetPermissionsBoundaryForPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the status of the Amazon Web Services account assignment creation requests for a specified IAM Identity
     * Center instance.
     * </p>
     * 
     * @param listAccountAssignmentCreationStatusRequest
     * @return Result of the ListAccountAssignmentCreationStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountAssignmentCreationStatusResult listAccountAssignmentCreationStatus(ListAccountAssignmentCreationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAssignmentCreationStatus(request);
    }

    @SdkInternalApi
    final ListAccountAssignmentCreationStatusResult executeListAccountAssignmentCreationStatus(
            ListAccountAssignmentCreationStatusRequest listAccountAssignmentCreationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountAssignmentCreationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAssignmentCreationStatusRequest> request = null;
        Response<ListAccountAssignmentCreationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAssignmentCreationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountAssignmentCreationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAssignmentCreationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountAssignmentCreationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountAssignmentCreationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the status of the Amazon Web Services account assignment deletion requests for a specified IAM Identity
     * Center instance.
     * </p>
     * 
     * @param listAccountAssignmentDeletionStatusRequest
     * @return Result of the ListAccountAssignmentDeletionStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountAssignmentDeletionStatusResult listAccountAssignmentDeletionStatus(ListAccountAssignmentDeletionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAssignmentDeletionStatus(request);
    }

    @SdkInternalApi
    final ListAccountAssignmentDeletionStatusResult executeListAccountAssignmentDeletionStatus(
            ListAccountAssignmentDeletionStatusRequest listAccountAssignmentDeletionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountAssignmentDeletionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAssignmentDeletionStatusRequest> request = null;
        Response<ListAccountAssignmentDeletionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAssignmentDeletionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountAssignmentDeletionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAssignmentDeletionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountAssignmentDeletionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountAssignmentDeletionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assignee of the specified Amazon Web Services account with the specified permission set.
     * </p>
     * 
     * @param listAccountAssignmentsRequest
     * @return Result of the ListAccountAssignments operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountAssignmentsResult listAccountAssignments(ListAccountAssignmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAssignments(request);
    }

    @SdkInternalApi
    final ListAccountAssignmentsResult executeListAccountAssignments(ListAccountAssignmentsRequest listAccountAssignmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountAssignmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAssignmentsRequest> request = null;
        Response<ListAccountAssignmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAssignmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountAssignmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAssignments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountAssignmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountAssignmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the IAM Identity Center associated Amazon Web Services accounts that the principal has access
     * to.
     * </p>
     * 
     * @param listAccountAssignmentsForPrincipalRequest
     * @return Result of the ListAccountAssignmentsForPrincipal operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountAssignmentsForPrincipalResult listAccountAssignmentsForPrincipal(ListAccountAssignmentsForPrincipalRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAssignmentsForPrincipal(request);
    }

    @SdkInternalApi
    final ListAccountAssignmentsForPrincipalResult executeListAccountAssignmentsForPrincipal(
            ListAccountAssignmentsForPrincipalRequest listAccountAssignmentsForPrincipalRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountAssignmentsForPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAssignmentsForPrincipalRequest> request = null;
        Response<ListAccountAssignmentsForPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAssignmentsForPrincipalRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountAssignmentsForPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAssignmentsForPrincipal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountAssignmentsForPrincipalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountAssignmentsForPrincipalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Amazon Web Services accounts where the specified permission set is provisioned.
     * </p>
     * 
     * @param listAccountsForProvisionedPermissionSetRequest
     * @return Result of the ListAccountsForProvisionedPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountsForProvisionedPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountsForProvisionedPermissionSetResult listAccountsForProvisionedPermissionSet(ListAccountsForProvisionedPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountsForProvisionedPermissionSet(request);
    }

    @SdkInternalApi
    final ListAccountsForProvisionedPermissionSetResult executeListAccountsForProvisionedPermissionSet(
            ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountsForProvisionedPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsForProvisionedPermissionSetRequest> request = null;
        Response<ListAccountsForProvisionedPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsForProvisionedPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountsForProvisionedPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountsForProvisionedPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountsForProvisionedPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAccountsForProvisionedPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the access scopes and authorized targets associated with an application.
     * </p>
     * 
     * @param listApplicationAccessScopesRequest
     * @return Result of the ListApplicationAccessScopes operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAccessScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAccessScopes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationAccessScopesResult listApplicationAccessScopes(ListApplicationAccessScopesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationAccessScopes(request);
    }

    @SdkInternalApi
    final ListApplicationAccessScopesResult executeListApplicationAccessScopes(ListApplicationAccessScopesRequest listApplicationAccessScopesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationAccessScopesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationAccessScopesRequest> request = null;
        Response<ListApplicationAccessScopesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationAccessScopesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationAccessScopesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationAccessScopes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationAccessScopesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationAccessScopesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Web Services account users that are assigned to an application.
     * </p>
     * 
     * @param listApplicationAssignmentsRequest
     * @return Result of the ListApplicationAssignments operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationAssignmentsResult listApplicationAssignments(ListApplicationAssignmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationAssignments(request);
    }

    @SdkInternalApi
    final ListApplicationAssignmentsResult executeListApplicationAssignments(ListApplicationAssignmentsRequest listApplicationAssignmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationAssignmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationAssignmentsRequest> request = null;
        Response<ListApplicationAssignmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationAssignmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationAssignmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationAssignments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationAssignmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationAssignmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the applications to which a specified principal is assigned.
     * </p>
     * 
     * @param listApplicationAssignmentsForPrincipalRequest
     * @return Result of the ListApplicationAssignmentsForPrincipal operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationAssignmentsForPrincipalResult listApplicationAssignmentsForPrincipal(ListApplicationAssignmentsForPrincipalRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationAssignmentsForPrincipal(request);
    }

    @SdkInternalApi
    final ListApplicationAssignmentsForPrincipalResult executeListApplicationAssignmentsForPrincipal(
            ListApplicationAssignmentsForPrincipalRequest listApplicationAssignmentsForPrincipalRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationAssignmentsForPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationAssignmentsForPrincipalRequest> request = null;
        Response<ListApplicationAssignmentsForPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationAssignmentsForPrincipalRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationAssignmentsForPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationAssignmentsForPrincipal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationAssignmentsForPrincipalResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListApplicationAssignmentsForPrincipalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the authentication methods supported by the specified application.
     * </p>
     * 
     * @param listApplicationAuthenticationMethodsRequest
     * @return Result of the ListApplicationAuthenticationMethods operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAuthenticationMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAuthenticationMethods"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationAuthenticationMethodsResult listApplicationAuthenticationMethods(ListApplicationAuthenticationMethodsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationAuthenticationMethods(request);
    }

    @SdkInternalApi
    final ListApplicationAuthenticationMethodsResult executeListApplicationAuthenticationMethods(
            ListApplicationAuthenticationMethodsRequest listApplicationAuthenticationMethodsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationAuthenticationMethodsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationAuthenticationMethodsRequest> request = null;
        Response<ListApplicationAuthenticationMethodsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationAuthenticationMethodsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationAuthenticationMethodsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationAuthenticationMethods");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationAuthenticationMethodsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationAuthenticationMethodsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the grants associated with an application.
     * </p>
     * 
     * @param listApplicationGrantsRequest
     * @return Result of the ListApplicationGrants operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationGrants"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationGrantsResult listApplicationGrants(ListApplicationGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationGrants(request);
    }

    @SdkInternalApi
    final ListApplicationGrantsResult executeListApplicationGrants(ListApplicationGrantsRequest listApplicationGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationGrantsRequest> request = null;
        Response<ListApplicationGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationGrantsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListApplicationGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the application providers configured in the IAM Identity Center identity store.
     * </p>
     * 
     * @param listApplicationProvidersRequest
     * @return Result of the ListApplicationProviders operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationProviders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationProvidersResult listApplicationProviders(ListApplicationProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationProviders(request);
    }

    @SdkInternalApi
    final ListApplicationProvidersResult executeListApplicationProviders(ListApplicationProvidersRequest listApplicationProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationProvidersRequest> request = null;
        Response<ListApplicationProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationProvidersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationProvidersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all applications associated with the instance of IAM Identity Center. When listing applications for an
     * instance in the management account, member accounts must use the <code>applicationAccount</code> parameter to
     * filter the list to only applications created from that account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all customer managed policies attached to a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param listCustomerManagedPolicyReferencesInPermissionSetRequest
     * @return Result of the ListCustomerManagedPolicyReferencesInPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListCustomerManagedPolicyReferencesInPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomerManagedPolicyReferencesInPermissionSetResult listCustomerManagedPolicyReferencesInPermissionSet(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomerManagedPolicyReferencesInPermissionSet(request);
    }

    @SdkInternalApi
    final ListCustomerManagedPolicyReferencesInPermissionSetResult executeListCustomerManagedPolicyReferencesInPermissionSet(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest listCustomerManagedPolicyReferencesInPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomerManagedPolicyReferencesInPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomerManagedPolicyReferencesInPermissionSetRequest> request = null;
        Response<ListCustomerManagedPolicyReferencesInPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomerManagedPolicyReferencesInPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomerManagedPolicyReferencesInPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomerManagedPolicyReferencesInPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomerManagedPolicyReferencesInPermissionSetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListCustomerManagedPolicyReferencesInPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the details of the organization and account instances of IAM Identity Center that were created in or
     * visible to the account calling this API.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstances(request);
    }

    @SdkInternalApi
    final ListInstancesResult executeListInstances(ListInstancesRequest listInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Web Services managed policy that is attached to a specified permission set.
     * </p>
     * 
     * @param listManagedPoliciesInPermissionSetRequest
     * @return Result of the ListManagedPoliciesInPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListManagedPoliciesInPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListManagedPoliciesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListManagedPoliciesInPermissionSetResult listManagedPoliciesInPermissionSet(ListManagedPoliciesInPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeListManagedPoliciesInPermissionSet(request);
    }

    @SdkInternalApi
    final ListManagedPoliciesInPermissionSetResult executeListManagedPoliciesInPermissionSet(
            ListManagedPoliciesInPermissionSetRequest listManagedPoliciesInPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(listManagedPoliciesInPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListManagedPoliciesInPermissionSetRequest> request = null;
        Response<ListManagedPoliciesInPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListManagedPoliciesInPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listManagedPoliciesInPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListManagedPoliciesInPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListManagedPoliciesInPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListManagedPoliciesInPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
     * </p>
     * 
     * @param listPermissionSetProvisioningStatusRequest
     * @return Result of the ListPermissionSetProvisioningStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListPermissionSetProvisioningStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPermissionSetProvisioningStatusResult listPermissionSetProvisioningStatus(ListPermissionSetProvisioningStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionSetProvisioningStatus(request);
    }

    @SdkInternalApi
    final ListPermissionSetProvisioningStatusResult executeListPermissionSetProvisioningStatus(
            ListPermissionSetProvisioningStatusRequest listPermissionSetProvisioningStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionSetProvisioningStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionSetProvisioningStatusRequest> request = null;
        Response<ListPermissionSetProvisioningStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionSetProvisioningStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPermissionSetProvisioningStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionSetProvisioningStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionSetProvisioningStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPermissionSetProvisioningStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the <a>PermissionSet</a>s in an IAM Identity Center instance.
     * </p>
     * 
     * @param listPermissionSetsRequest
     * @return Result of the ListPermissionSets operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListPermissionSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPermissionSetsResult listPermissionSets(ListPermissionSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionSets(request);
    }

    @SdkInternalApi
    final ListPermissionSetsResult executeListPermissionSets(ListPermissionSetsRequest listPermissionSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionSetsRequest> request = null;
        Response<ListPermissionSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPermissionSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the permission sets that are provisioned to a specified Amazon Web Services account.
     * </p>
     * 
     * @param listPermissionSetsProvisionedToAccountRequest
     * @return Result of the ListPermissionSetsProvisionedToAccount operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListPermissionSetsProvisionedToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetsProvisionedToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPermissionSetsProvisionedToAccountResult listPermissionSetsProvisionedToAccount(ListPermissionSetsProvisionedToAccountRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionSetsProvisionedToAccount(request);
    }

    @SdkInternalApi
    final ListPermissionSetsProvisionedToAccountResult executeListPermissionSetsProvisionedToAccount(
            ListPermissionSetsProvisionedToAccountRequest listPermissionSetsProvisionedToAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionSetsProvisionedToAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionSetsProvisionedToAccountRequest> request = null;
        Response<ListPermissionSetsProvisionedToAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionSetsProvisionedToAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPermissionSetsProvisionedToAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionSetsProvisionedToAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionSetsProvisionedToAccountResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPermissionSetsProvisionedToAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that are attached to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
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
     * Lists all the trusted token issuers configured in an instance of IAM Identity Center.
     * </p>
     * 
     * @param listTrustedTokenIssuersRequest
     * @return Result of the ListTrustedTokenIssuers operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListTrustedTokenIssuers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTrustedTokenIssuers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrustedTokenIssuersResult listTrustedTokenIssuers(ListTrustedTokenIssuersRequest request) {
        request = beforeClientExecution(request);
        return executeListTrustedTokenIssuers(request);
    }

    @SdkInternalApi
    final ListTrustedTokenIssuersResult executeListTrustedTokenIssuers(ListTrustedTokenIssuersRequest listTrustedTokenIssuersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrustedTokenIssuersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrustedTokenIssuersRequest> request = null;
        Response<ListTrustedTokenIssuersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrustedTokenIssuersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTrustedTokenIssuersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrustedTokenIssuers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrustedTokenIssuersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTrustedTokenIssuersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The process by which a specified permission set is provisioned to the specified target.
     * </p>
     * 
     * @param provisionPermissionSetRequest
     * @return Result of the ProvisionPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.ProvisionPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ProvisionPermissionSetResult provisionPermissionSet(ProvisionPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeProvisionPermissionSet(request);
    }

    @SdkInternalApi
    final ProvisionPermissionSetResult executeProvisionPermissionSet(ProvisionPermissionSetRequest provisionPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(provisionPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvisionPermissionSetRequest> request = null;
        Response<ProvisionPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvisionPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(provisionPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ProvisionPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ProvisionPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ProvisionPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates the list of authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param putApplicationAccessScopeRequest
     * @return Result of the PutApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutApplicationAccessScopeResult putApplicationAccessScope(PutApplicationAccessScopeRequest request) {
        request = beforeClientExecution(request);
        return executePutApplicationAccessScope(request);
    }

    @SdkInternalApi
    final PutApplicationAccessScopeResult executePutApplicationAccessScope(PutApplicationAccessScopeRequest putApplicationAccessScopeRequest) {

        ExecutionContext executionContext = createExecutionContext(putApplicationAccessScopeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApplicationAccessScopeRequest> request = null;
        Response<PutApplicationAccessScopeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApplicationAccessScopeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putApplicationAccessScopeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApplicationAccessScope");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApplicationAccessScopeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutApplicationAccessScopeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configure how users gain access to an application. If <code>AssignmentsRequired</code> is <code>true</code>
     * (default value), users don’t have access to the application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application. If an
     * assignment is created using <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment</a>., the user retains access if <code>AssignmentsRequired</code> is set to
     * <code>true</code>.
     * </p>
     * 
     * @param putApplicationAssignmentConfigurationRequest
     * @return Result of the PutApplicationAssignmentConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutApplicationAssignmentConfigurationResult putApplicationAssignmentConfiguration(PutApplicationAssignmentConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutApplicationAssignmentConfiguration(request);
    }

    @SdkInternalApi
    final PutApplicationAssignmentConfigurationResult executePutApplicationAssignmentConfiguration(
            PutApplicationAssignmentConfigurationRequest putApplicationAssignmentConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putApplicationAssignmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApplicationAssignmentConfigurationRequest> request = null;
        Response<PutApplicationAssignmentConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApplicationAssignmentConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putApplicationAssignmentConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApplicationAssignmentConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApplicationAssignmentConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutApplicationAssignmentConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates an authentication method for an application.
     * </p>
     * 
     * @param putApplicationAuthenticationMethodRequest
     * @return Result of the PutApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutApplicationAuthenticationMethodResult putApplicationAuthenticationMethod(PutApplicationAuthenticationMethodRequest request) {
        request = beforeClientExecution(request);
        return executePutApplicationAuthenticationMethod(request);
    }

    @SdkInternalApi
    final PutApplicationAuthenticationMethodResult executePutApplicationAuthenticationMethod(
            PutApplicationAuthenticationMethodRequest putApplicationAuthenticationMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(putApplicationAuthenticationMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApplicationAuthenticationMethodRequest> request = null;
        Response<PutApplicationAuthenticationMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApplicationAuthenticationMethodRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putApplicationAuthenticationMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApplicationAuthenticationMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApplicationAuthenticationMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutApplicationAuthenticationMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a grant to an application.
     * </p>
     * 
     * @param putApplicationGrantRequest
     * @return Result of the PutApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutApplicationGrantResult putApplicationGrant(PutApplicationGrantRequest request) {
        request = beforeClientExecution(request);
        return executePutApplicationGrant(request);
    }

    @SdkInternalApi
    final PutApplicationGrantResult executePutApplicationGrant(PutApplicationGrantRequest putApplicationGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(putApplicationGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApplicationGrantRequest> request = null;
        Response<PutApplicationGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApplicationGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putApplicationGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApplicationGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApplicationGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutApplicationGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an inline policy to a permission set.
     * </p>
     * <note>
     * <p>
     * If the permission set is already referenced by one or more account assignments, you will need to call
     * <code> <a>ProvisionPermissionSet</a> </code> after this action to apply the corresponding IAM policy updates to
     * all assigned accounts.
     * </p>
     * </note>
     * 
     * @param putInlinePolicyToPermissionSetRequest
     * @return Result of the PutInlinePolicyToPermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutInlinePolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutInlinePolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutInlinePolicyToPermissionSetResult putInlinePolicyToPermissionSet(PutInlinePolicyToPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executePutInlinePolicyToPermissionSet(request);
    }

    @SdkInternalApi
    final PutInlinePolicyToPermissionSetResult executePutInlinePolicyToPermissionSet(PutInlinePolicyToPermissionSetRequest putInlinePolicyToPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(putInlinePolicyToPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInlinePolicyToPermissionSetRequest> request = null;
        Response<PutInlinePolicyToPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInlinePolicyToPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putInlinePolicyToPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInlinePolicyToPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInlinePolicyToPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutInlinePolicyToPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an Amazon Web Services managed or customer managed policy to the specified <a>PermissionSet</a> as a
     * permissions boundary.
     * </p>
     * 
     * @param putPermissionsBoundaryToPermissionSetRequest
     * @return Result of the PutPermissionsBoundaryToPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutPermissionsBoundaryToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutPermissionsBoundaryToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutPermissionsBoundaryToPermissionSetResult putPermissionsBoundaryToPermissionSet(PutPermissionsBoundaryToPermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executePutPermissionsBoundaryToPermissionSet(request);
    }

    @SdkInternalApi
    final PutPermissionsBoundaryToPermissionSetResult executePutPermissionsBoundaryToPermissionSet(
            PutPermissionsBoundaryToPermissionSetRequest putPermissionsBoundaryToPermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(putPermissionsBoundaryToPermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPermissionsBoundaryToPermissionSetRequest> request = null;
        Response<PutPermissionsBoundaryToPermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPermissionsBoundaryToPermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putPermissionsBoundaryToPermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPermissionsBoundaryToPermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPermissionsBoundaryToPermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutPermissionsBoundaryToPermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a set of tags with a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
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
     * Disassociates a set of tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
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
     * Updates application properties.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the details for the instance of IAM Identity Center that is owned by the Amazon Web Services account.
     * </p>
     * 
     * @param updateInstanceRequest
     * @return Result of the UpdateInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInstanceResult updateInstance(UpdateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstance(request);
    }

    @SdkInternalApi
    final UpdateInstanceResult executeUpdateInstance(UpdateInstanceRequest updateInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceRequest> request = null;
        Response<UpdateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the IAM Identity Center identity store attributes that you can use with the IAM Identity Center instance
     * for attributes-based access control (ABAC). When using an external identity provider as an identity source, you
     * can pass attributes through the SAML assertion as an alternative to configuring attributes from the IAM Identity
     * Center identity store. If a SAML assertion passes any of these attributes, IAM Identity Center replaces the
     * attribute value with the value from the IAM Identity Center identity store. For more information about ABAC, see
     * <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a> in the <i>IAM Identity
     * Center User Guide</i>.
     * </p>
     * 
     * @param updateInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the UpdateInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInstanceAccessControlAttributeConfigurationResult updateInstanceAccessControlAttributeConfiguration(
            UpdateInstanceAccessControlAttributeConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstanceAccessControlAttributeConfiguration(request);
    }

    @SdkInternalApi
    final UpdateInstanceAccessControlAttributeConfigurationResult executeUpdateInstanceAccessControlAttributeConfiguration(
            UpdateInstanceAccessControlAttributeConfigurationRequest updateInstanceAccessControlAttributeConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceAccessControlAttributeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceAccessControlAttributeConfigurationRequest> request = null;
        Response<UpdateInstanceAccessControlAttributeConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceAccessControlAttributeConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInstanceAccessControlAttributeConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstanceAccessControlAttributeConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceAccessControlAttributeConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateInstanceAccessControlAttributeConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing permission set.
     * </p>
     * 
     * @param updatePermissionSetRequest
     * @return Result of the UpdatePermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePermissionSetResult updatePermissionSet(UpdatePermissionSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePermissionSet(request);
    }

    @SdkInternalApi
    final UpdatePermissionSetResult executeUpdatePermissionSet(UpdatePermissionSetRequest updatePermissionSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePermissionSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePermissionSetRequest> request = null;
        Response<UpdatePermissionSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePermissionSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePermissionSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePermissionSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePermissionSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePermissionSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name of the trusted token issuer, or the path of a source attribute or destination attribute for a
     * trusted token issuer configuration.
     * </p>
     * <note>
     * <p>
     * Updating this trusted token issuer configuration might cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param updateTrustedTokenIssuerRequest
     * @return Result of the UpdateTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTrustedTokenIssuerResult updateTrustedTokenIssuer(UpdateTrustedTokenIssuerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrustedTokenIssuer(request);
    }

    @SdkInternalApi
    final UpdateTrustedTokenIssuerResult executeUpdateTrustedTokenIssuer(UpdateTrustedTokenIssuerRequest updateTrustedTokenIssuerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrustedTokenIssuerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrustedTokenIssuerRequest> request = null;
        Response<UpdateTrustedTokenIssuerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrustedTokenIssuerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTrustedTokenIssuerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO Admin");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrustedTokenIssuer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrustedTokenIssuerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTrustedTokenIssuerResultJsonUnmarshaller());
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
