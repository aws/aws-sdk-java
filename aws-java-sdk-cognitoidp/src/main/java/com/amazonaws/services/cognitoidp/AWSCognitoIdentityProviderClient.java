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
package com.amazonaws.services.cognitoidp;

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

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.services.cognitoidp.model.transform.*;

/**
 * Client for accessing Amazon Cognito Identity Provider. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * Using the Amazon Cognito User Pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCognitoIdentityProviderClient extends AmazonWebServiceClient implements AWSCognitoIdentityProvider {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCognitoIdentityProvider.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-idp";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLambdaResponseException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidLambdaResponseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOAuthFlowException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidOAuthFlowException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSmsRoleAccessPolicyException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidSmsRoleAccessPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UsernameExistsException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UsernameExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserImportInProgressException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserImportInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredCodeException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.ExpiredCodeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserNotFoundException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MFAMethodNotFoundException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.MFAMethodNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPasswordException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidPasswordException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AliasExistsException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.AliasExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedUserStateException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UnsupportedUserStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedIdentityProviderException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UnsupportedIdentityProviderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserNotConfirmedException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserNotConfirmedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SoftwareTokenMFANotFoundException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.SoftwareTokenMFANotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PasswordResetRequiredException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.PasswordResetRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EnableSoftwareTokenMFAException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.EnableSoftwareTokenMFAException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnexpectedLambdaException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateProviderException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.DuplicateProviderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserLambdaValidationException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserLambdaValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSmsRoleTrustRelationshipException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidSmsRoleTrustRelationshipException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyFailedAttemptsException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.TooManyFailedAttemptsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeDeliveryFailureException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.CodeDeliveryFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ScopeDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.ScopeDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEmailRoleAccessPolicyException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidEmailRoleAccessPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionNotMetException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.PreconditionNotMetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GroupExistsException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.GroupExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserPoolTaggingException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserPoolTaggingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserPoolAddOnNotEnabledException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.UserPoolAddOnNotEnabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUserPoolConfigurationException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.InvalidUserPoolConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeMismatchException").withModeledClass(
                                    com.amazonaws.services.cognitoidp.model.CodeMismatchException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cognitoidp.model.AWSCognitoIdentityProviderException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity Provider
     *        (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified AWS
     * account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AWSCognitoIdentityProviderClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified AWS
     * account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity Provider
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified AWS
     * account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified AWS
     * account credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity Provider
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified AWS
     * account credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity Provider
     *        (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCognitoIdentityProviderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCognitoIdentityProviderClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCognitoIdentityProviderClientBuilder builder() {
        return AWSCognitoIdentityProviderClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCognitoIdentityProviderClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity Provider using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCognitoIdentityProviderClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://cognito-idp.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cognitoidp/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cognitoidp/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest
     *        Represents the request to add custom attributes.
     * @return Result of the AddCustomAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you are trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AddCustomAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AddCustomAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeAddCustomAttributes(request);
    }

    @SdkInternalApi
    final AddCustomAttributesResult executeAddCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(addCustomAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomAttributesRequest> request = null;
        Response<AddCustomAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addCustomAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddCustomAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddCustomAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddCustomAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminAddUserToGroupRequest
     * @return Result of the AdminAddUserToGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminAddUserToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminAddUserToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminAddUserToGroupResult adminAddUserToGroup(AdminAddUserToGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAdminAddUserToGroup(request);
    }

    @SdkInternalApi
    final AdminAddUserToGroupResult executeAdminAddUserToGroup(AdminAddUserToGroupRequest adminAddUserToGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(adminAddUserToGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminAddUserToGroupRequest> request = null;
        Response<AdminAddUserToGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminAddUserToGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminAddUserToGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminAddUserToGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminAddUserToGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminAddUserToGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @return Result of the AdminConfirmSignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action (e.g., sign
     *         in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminConfirmSignUp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest request) {
        request = beforeClientExecution(request);
        return executeAdminConfirmSignUp(request);
    }

    @SdkInternalApi
    final AdminConfirmSignUpResult executeAdminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest) {

        ExecutionContext executionContext = createExecutionContext(adminConfirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminConfirmSignUpRequest> request = null;
        Response<AdminConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminConfirmSignUpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminConfirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminConfirmSignUp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminConfirmSignUpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminConfirmSignUpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new user in the specified user pool.
     * </p>
     * <p>
     * If <code>MessageAction</code> is not set, the default is to send a welcome message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This message is based on a template that you configured in your call to or . This template includes your custom
     * sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * </note>
     * <p>
     * Alternatively, you can call AdminCreateUser with “SUPPRESS” for the <code>MessageAction</code> parameter, and
     * Amazon Cognito will not send any email.
     * </p>
     * <p>
     * In either case, the user will be in the <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <p>
     * AdminCreateUser requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest
     *        Represents the request to create a user in the specified user pool.
     * @return Result of the AdminCreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UnsupportedUserStateException
     *         The request failed because the user is in an unsupported state.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminCreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminCreateUserResult adminCreateUser(AdminCreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminCreateUser(request);
    }

    @SdkInternalApi
    final AdminCreateUserResult executeAdminCreateUser(AdminCreateUserRequest adminCreateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminCreateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminCreateUserRequest> request = null;
        Response<AdminCreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminCreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminCreateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminCreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminCreateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminCreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @return Result of the AdminDeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminDeleteUserResult adminDeleteUser(AdminDeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminDeleteUser(request);
    }

    @SdkInternalApi
    final AdminDeleteUserResult executeAdminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminDeleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserRequest> request = null;
        Response<AdminDeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminDeleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminDeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminDeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @return Result of the AdminDeleteUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeAdminDeleteUserAttributes(request);
    }

    @SdkInternalApi
    final AdminDeleteUserAttributesResult executeAdminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(adminDeleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserAttributesRequest> request = null;
        Response<AdminDeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminDeleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminDeleteUserAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDeleteUserAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminDeleteUserAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to
     * disable is a Cognito User Pools native username + password user, they are not permitted to use their password to
     * sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is
     * removed. The next time the external user (no longer attached to the previously linked
     * <code>DestinationUser</code>) signs in, they must create a new user account. See .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when creating an IdP for the pool.
     * </p>
     * <p>
     * To disable a native username + password user, the <code>ProviderName</code> value must be <code>Cognito</code>
     * and the <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>, with the
     * <code>ProviderAttributeValue</code> being the name that is used in the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be <code>Cognito_Subject</code> for social identity providers.
     * The <code>ProviderAttributeValue</code> must always be the exact subject that was used when the user was
     * originally linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in,
     * the <code>ProviderAttributeName</code> and <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally linked in the call. (If the linking was
     * done with <code>ProviderAttributeName</code> set to <code>Cognito_Subject</code>, the same applies here).
     * However, if the user has already signed in, the <code>ProviderAttributeName</code> must be
     * <code>Cognito_Subject</code> and <code>ProviderAttributeValue</code> must be the subject of the SAML assertion.
     * </p>
     * 
     * @param adminDisableProviderForUserRequest
     * @return Result of the AdminDisableProviderForUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminDisableProviderForUserResult adminDisableProviderForUser(AdminDisableProviderForUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminDisableProviderForUser(request);
    }

    @SdkInternalApi
    final AdminDisableProviderForUserResult executeAdminDisableProviderForUser(AdminDisableProviderForUserRequest adminDisableProviderForUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminDisableProviderForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDisableProviderForUserRequest> request = null;
        Response<AdminDisableProviderForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDisableProviderForUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminDisableProviderForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminDisableProviderForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDisableProviderForUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminDisableProviderForUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDisableUserRequest
     *        Represents the request to disable any user as an administrator.
     * @return Result of the AdminDisableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminDisableUserResult adminDisableUser(AdminDisableUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminDisableUser(request);
    }

    @SdkInternalApi
    final AdminDisableUserResult executeAdminDisableUser(AdminDisableUserRequest adminDisableUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminDisableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDisableUserRequest> request = null;
        Response<AdminDisableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDisableUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminDisableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminDisableUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDisableUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminDisableUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @return Result of the AdminEnableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminEnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminEnableUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminEnableUser(request);
    }

    @SdkInternalApi
    final AdminEnableUserResult executeAdminEnableUser(AdminEnableUserRequest adminEnableUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminEnableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminEnableUserRequest> request = null;
        Response<AdminEnableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminEnableUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminEnableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminEnableUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminEnableUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminEnableUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminForgetDeviceRequest
     *        Sends the forgot device request, as an administrator.
     * @return Result of the AdminForgetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminForgetDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminForgetDeviceResult adminForgetDevice(AdminForgetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeAdminForgetDevice(request);
    }

    @SdkInternalApi
    final AdminForgetDeviceResult executeAdminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(adminForgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminForgetDeviceRequest> request = null;
        Response<AdminForgetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminForgetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminForgetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminForgetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminForgetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminForgetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetDeviceRequest
     *        Represents the request to get the device, as an administrator.
     * @return Result of the AdminGetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.AdminGetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeAdminGetDevice(request);
    }

    @SdkInternalApi
    final AdminGetDeviceResult executeAdminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(adminGetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetDeviceRequest> request = null;
        Response<AdminGetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminGetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminGetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminGetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminGetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @return Result of the AdminGetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminGetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AdminGetUserResult adminGetUser(AdminGetUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminGetUser(request);
    }

    @SdkInternalApi
    final AdminGetUserResult executeAdminGetUser(AdminGetUserRequest adminGetUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminGetUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetUserRequest> request = null;
        Response<AdminGetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminGetUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminGetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminGetUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminGetUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @return Result of the AdminInitiateAuth operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito cannot find a multi-factor authentication (MFA) method.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @sample AWSCognitoIdentityProvider.AdminInitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminInitiateAuth" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminInitiateAuthResult adminInitiateAuth(AdminInitiateAuthRequest request) {
        request = beforeClientExecution(request);
        return executeAdminInitiateAuth(request);
    }

    @SdkInternalApi
    final AdminInitiateAuthResult executeAdminInitiateAuth(AdminInitiateAuthRequest adminInitiateAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(adminInitiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminInitiateAuthRequest> request = null;
        Response<AdminInitiateAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminInitiateAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminInitiateAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminInitiateAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminInitiateAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminInitiateAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Links an existing user account in a user pool (<code>DestinationUser</code>) to an identity from an external
     * identity provider (<code>SourceUser</code>) based on a specified attribute name and value from the external
     * identity provider. This allows you to create a link from the existing user account to an external federated user
     * identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the
     * existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password, this API links that user to a federated
     * user identity, so that when the federated user identity is used, the user signs in as the existing user account.
     * </p>
     * <important>
     * <p>
     * Because this API allows a user with an external federated identity to sign in as an existing user in the user
     * pool, it is critical that it only be used with external identity providers and provider attributes that have been
     * trusted by the application owner.
     * </p>
     * </important>
     * <p>
     * See also .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * 
     * @param adminLinkProviderForUserRequest
     * @return Result of the AdminLinkProviderForUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminLinkProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminLinkProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminLinkProviderForUserResult adminLinkProviderForUser(AdminLinkProviderForUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminLinkProviderForUser(request);
    }

    @SdkInternalApi
    final AdminLinkProviderForUserResult executeAdminLinkProviderForUser(AdminLinkProviderForUserRequest adminLinkProviderForUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminLinkProviderForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminLinkProviderForUserRequest> request = null;
        Response<AdminLinkProviderForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminLinkProviderForUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminLinkProviderForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminLinkProviderForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminLinkProviderForUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminLinkProviderForUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListDevicesRequest
     *        Represents the request to list devices, as an administrator.
     * @return Result of the AdminListDevices operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.AdminListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AdminListDevicesResult adminListDevices(AdminListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeAdminListDevices(request);
    }

    @SdkInternalApi
    final AdminListDevicesResult executeAdminListDevices(AdminListDevicesRequest adminListDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(adminListDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminListDevicesRequest> request = null;
        Response<AdminListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminListDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the groups that the user belongs to.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListGroupsForUserRequest
     * @return Result of the AdminListGroupsForUser operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminListGroupsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListGroupsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminListGroupsForUserResult adminListGroupsForUser(AdminListGroupsForUserRequest request) {
        request = beforeClientExecution(request);
        return executeAdminListGroupsForUser(request);
    }

    @SdkInternalApi
    final AdminListGroupsForUserResult executeAdminListGroupsForUser(AdminListGroupsForUserRequest adminListGroupsForUserRequest) {

        ExecutionContext executionContext = createExecutionContext(adminListGroupsForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminListGroupsForUserRequest> request = null;
        Response<AdminListGroupsForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminListGroupsForUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminListGroupsForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminListGroupsForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminListGroupsForUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminListGroupsForUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminListUserAuthEventsRequest
     * @return Result of the AdminListUserAuthEvents operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons are not enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminListUserAuthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListUserAuthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminListUserAuthEventsResult adminListUserAuthEvents(AdminListUserAuthEventsRequest request) {
        request = beforeClientExecution(request);
        return executeAdminListUserAuthEvents(request);
    }

    @SdkInternalApi
    final AdminListUserAuthEventsResult executeAdminListUserAuthEvents(AdminListUserAuthEventsRequest adminListUserAuthEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(adminListUserAuthEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminListUserAuthEventsRequest> request = null;
        Response<AdminListUserAuthEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminListUserAuthEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminListUserAuthEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminListUserAuthEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminListUserAuthEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminListUserAuthEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRemoveUserFromGroupRequest
     * @return Result of the AdminRemoveUserFromGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminRemoveUserFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRemoveUserFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminRemoveUserFromGroupResult adminRemoveUserFromGroup(AdminRemoveUserFromGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAdminRemoveUserFromGroup(request);
    }

    @SdkInternalApi
    final AdminRemoveUserFromGroupResult executeAdminRemoveUserFromGroup(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(adminRemoveUserFromGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminRemoveUserFromGroupRequest> request = null;
        Response<AdminRemoveUserFromGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminRemoveUserFromGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminRemoveUserFromGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminRemoveUserFromGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminRemoveUserFromGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminRemoveUserFromGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
     * sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
     * direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
     * if the user pool has phone verification selected and a verified phone number exists for the user, or if email
     * verification is selected and a verified email exists for the user, calling this API will also result in sending a
     * message to the end user with the code to change their password.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @return Result of the AdminResetUserPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminResetUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeAdminResetUserPassword(request);
    }

    @SdkInternalApi
    final AdminResetUserPasswordResult executeAdminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(adminResetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminResetUserPasswordRequest> request = null;
        Response<AdminResetUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminResetUserPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminResetUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminResetUserPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminResetUserPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminResetUserPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @return Result of the AdminRespondToAuthChallenge operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito cannot find a multi-factor authentication (MFA) method.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token TOTP multi-factor authentication (MFA) is not enabled
     *         for the user pool.
     * @sample AWSCognitoIdentityProvider.AdminRespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(AdminRespondToAuthChallengeRequest request) {
        request = beforeClientExecution(request);
        return executeAdminRespondToAuthChallenge(request);
    }

    @SdkInternalApi
    final AdminRespondToAuthChallengeResult executeAdminRespondToAuthChallenge(AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest) {

        ExecutionContext executionContext = createExecutionContext(adminRespondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminRespondToAuthChallengeRequest> request = null;
        Response<AdminRespondToAuthChallengeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminRespondToAuthChallengeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminRespondToAuthChallengeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminRespondToAuthChallenge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminRespondToAuthChallengeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminRespondToAuthChallengeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the user's multi-factor authentication (MFA) preference.
     * </p>
     * 
     * @param adminSetUserMFAPreferenceRequest
     * @return Result of the AdminSetUserMFAPreference operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminSetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminSetUserMFAPreferenceResult adminSetUserMFAPreference(AdminSetUserMFAPreferenceRequest request) {
        request = beforeClientExecution(request);
        return executeAdminSetUserMFAPreference(request);
    }

    @SdkInternalApi
    final AdminSetUserMFAPreferenceResult executeAdminSetUserMFAPreference(AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(adminSetUserMFAPreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserMFAPreferenceRequest> request = null;
        Response<AdminSetUserMFAPreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserMFAPreferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminSetUserMFAPreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminSetUserMFAPreference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminSetUserMFAPreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminSetUserMFAPreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminSetUserSettingsRequest
     *        Represents the request to set user settings as an administrator.
     * @return Result of the AdminSetUserSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminSetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAdminSetUserSettings(request);
    }

    @SdkInternalApi
    final AdminSetUserSettingsResult executeAdminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(adminSetUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserSettingsRequest> request = null;
        Response<AdminSetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminSetUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminSetUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminSetUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdminSetUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for
     * improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminUpdateAuthEventFeedbackRequest
     * @return Result of the AdminUpdateAuthEventFeedback operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons are not enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminUpdateAuthEventFeedbackResult adminUpdateAuthEventFeedback(AdminUpdateAuthEventFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeAdminUpdateAuthEventFeedback(request);
    }

    @SdkInternalApi
    final AdminUpdateAuthEventFeedbackResult executeAdminUpdateAuthEventFeedback(AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(adminUpdateAuthEventFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateAuthEventFeedbackRequest> request = null;
        Response<AdminUpdateAuthEventFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateAuthEventFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminUpdateAuthEventFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminUpdateAuthEventFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminUpdateAuthEventFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminUpdateAuthEventFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest
     *        The request to update the device status, as an administrator.
     * @return Result of the AdminUpdateDeviceStatus operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateDeviceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(AdminUpdateDeviceStatusRequest request) {
        request = beforeClientExecution(request);
        return executeAdminUpdateDeviceStatus(request);
    }

    @SdkInternalApi
    final AdminUpdateDeviceStatusResult executeAdminUpdateDeviceStatus(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(adminUpdateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateDeviceStatusRequest> request = null;
        Response<AdminUpdateDeviceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateDeviceStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminUpdateDeviceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminUpdateDeviceStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminUpdateDeviceStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminUpdateDeviceStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * In addition to updating user attributes, this API can also be used to mark phone and email as verified.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @return Result of the AdminUpdateUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @sample AWSCognitoIdentityProvider.AdminUpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeAdminUpdateUserAttributes(request);
    }

    @SdkInternalApi
    final AdminUpdateUserAttributesResult executeAdminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(adminUpdateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateUserAttributesRequest> request = null;
        Response<AdminUpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateUserAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminUpdateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminUpdateUserAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminUpdateUserAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminUpdateUserAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @return Result of the AdminUserGlobalSignOut operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUserGlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUserGlobalSignOut"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdminUserGlobalSignOutResult adminUserGlobalSignOut(AdminUserGlobalSignOutRequest request) {
        request = beforeClientExecution(request);
        return executeAdminUserGlobalSignOut(request);
    }

    @SdkInternalApi
    final AdminUserGlobalSignOutResult executeAdminUserGlobalSignOut(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest) {

        ExecutionContext executionContext = createExecutionContext(adminUserGlobalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUserGlobalSignOutRequest> request = null;
        Response<AdminUserGlobalSignOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUserGlobalSignOutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminUserGlobalSignOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdminUserGlobalSignOut");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminUserGlobalSignOutResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AdminUserGlobalSignOutResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a unique generated shared secret key code for the user account. The request takes an access token or a
     * session string, but not both.
     * </p>
     * 
     * @param associateSoftwareTokenRequest
     * @return Result of the AssociateSoftwareToken operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token TOTP multi-factor authentication (MFA) is not enabled
     *         for the user pool.
     * @sample AWSCognitoIdentityProvider.AssociateSoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSoftwareTokenResult associateSoftwareToken(AssociateSoftwareTokenRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSoftwareToken(request);
    }

    @SdkInternalApi
    final AssociateSoftwareTokenResult executeAssociateSoftwareToken(AssociateSoftwareTokenRequest associateSoftwareTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSoftwareTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSoftwareTokenRequest> request = null;
        Response<AssociateSoftwareTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSoftwareTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateSoftwareTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSoftwareToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSoftwareTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSoftwareTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest
     *        Represents the request to change a user password.
     * @return Result of the ChangePassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ChangePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ChangePassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest request) {
        request = beforeClientExecution(request);
        return executeChangePassword(request);
    }

    @SdkInternalApi
    final ChangePasswordResult executeChangePassword(ChangePasswordRequest changePasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangePasswordRequest> request = null;
        Response<ChangePasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(changePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChangePassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChangePasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ChangePasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that begins device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest
     *        Confirms the device request.
     * @return Result of the ConfirmDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmDevice(request);
    }

    @SdkInternalApi
    final ConfirmDeviceResult executeConfirmDevice(ConfirmDeviceRequest confirmDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmDeviceRequest> request = null;
        Response<ConfirmDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConfirmDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a user to enter a confirmation code to reset a forgotten password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return Result of the ConfirmForgotPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action (e.g., sign
     *         in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmForgotPassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmForgotPassword(request);
    }

    @SdkInternalApi
    final ConfirmForgotPasswordResult executeConfirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmForgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmForgotPasswordRequest> request = null;
        Response<ConfirmForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmForgotPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmForgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmForgotPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmForgotPasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ConfirmForgotPasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a previous user.
     * </p>
     * 
     * @param confirmSignUpRequest
     *        Represents the request to confirm registration of a user.
     * @return Result of the ConfirmSignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception is thrown when the user has made too many failed attempts for a given action (e.g., sign
     *         in).
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmSignUp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmSignUp(request);
    }

    @SdkInternalApi
    final ConfirmSignUpResult executeConfirmSignUp(ConfirmSignUpRequest confirmSignUpRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSignUpRequest> request = null;
        Response<ConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmSignUpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmSignUp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmSignUpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConfirmSignUpResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new group in the specified user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws GroupExistsException
     *         This exception is thrown when Amazon Cognito encounters a group that already exists in the user pool.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an identity provider for a user pool.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return Result of the CreateIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws DuplicateProviderException
     *         This exception is thrown when the provider is already supported by the user pool.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIdentityProviderResult createIdentityProvider(CreateIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdentityProvider(request);
    }

    @SdkInternalApi
    final CreateIdentityProviderResult executeCreateIdentityProvider(CreateIdentityProviderRequest createIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentityProviderRequest> request = null;
        Response<CreateIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new OAuth2.0 resource server and defines custom scopes in it.
     * </p>
     * 
     * @param createResourceServerRequest
     * @return Result of the CreateResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResourceServerResult createResourceServer(CreateResourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourceServer(request);
    }

    @SdkInternalApi
    final CreateResourceServerResult executeCreateResourceServer(CreateResourceServerRequest createResourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceServerRequest> request = null;
        Response<CreateResourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest
     *        Represents the request to create the user import job.
     * @return Result of the CreateUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserImportJobResult createUserImportJob(CreateUserImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserImportJob(request);
    }

    @SdkInternalApi
    final CreateUserImportJobResult executeCreateUserImportJob(CreateUserImportJobRequest createUserImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserImportJobRequest> request = null;
        Response<CreateUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
     * </p>
     * 
     * @param createUserPoolRequest
     *        Represents the request to create a user pool.
     * @return Result of the CreateUserPool operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag cannot be set or updated.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserPool(request);
    }

    @SdkInternalApi
    final CreateUserPoolResult executeCreateUserPool(CreateUserPoolRequest createUserPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolRequest> request = null;
        Response<CreateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * 
     * @param createUserPoolClientRequest
     *        Represents the request to create a user pool client.
     * @return Result of the CreateUserPoolClient operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws ScopeDoesNotExistException
     *         This exception is thrown when the specified scope does not exist.
     * @throws InvalidOAuthFlowException
     *         This exception is thrown when the specified OAuth flow is invalid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserPoolClient(request);
    }

    @SdkInternalApi
    final CreateUserPoolClientResult executeCreateUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolClientRequest> request = null;
        Response<CreateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserPoolClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserPoolClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserPoolClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new domain for a user pool.
     * </p>
     * 
     * @param createUserPoolDomainRequest
     * @return Result of the CreateUserPoolDomain operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserPoolDomainResult createUserPoolDomain(CreateUserPoolDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserPoolDomain(request);
    }

    @SdkInternalApi
    final CreateUserPoolDomainResult executeCreateUserPoolDomain(CreateUserPoolDomainRequest createUserPoolDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserPoolDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolDomainRequest> request = null;
        Response<CreateUserPoolDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserPoolDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserPoolDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserPoolDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserPoolDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a group. Currently only groups with no members can be deleted.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an identity provider for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return Result of the DeleteIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnsupportedIdentityProviderException
     *         This exception is thrown when the specified identifier is not supported.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdentityProviderResult deleteIdentityProvider(DeleteIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentityProvider(request);
    }

    @SdkInternalApi
    final DeleteIdentityProviderResult executeDeleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityProviderRequest> request = null;
        Response<DeleteIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource server.
     * </p>
     * 
     * @param deleteResourceServerRequest
     * @return Result of the DeleteResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourceServerResult deleteResourceServer(DeleteResourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceServer(request);
    }

    @SdkInternalApi
    final DeleteResourceServerResult executeDeleteResourceServer(DeleteResourceServerRequest deleteResourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceServerRequest> request = null;
        Response<DeleteResourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a user to delete himself or herself.
     * </p>
     * 
     * @param deleteUserRequest
     *        Represents the request to delete a user.
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * 
     * @param deleteUserAttributesRequest
     *        Represents the request to delete user attributes.
     * @return Result of the DeleteUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserAttributes(request);
    }

    @SdkInternalApi
    final DeleteUserAttributesResult executeDeleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAttributesRequest> request = null;
        Response<DeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserAttributesResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest
     *        Represents the request to delete a user pool.
     * @return Result of the DeleteUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you are trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserPoolResult deleteUserPool(DeleteUserPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserPool(request);
    }

    @SdkInternalApi
    final DeleteUserPoolResult executeDeleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolRequest> request = null;
        Response<DeleteUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest
     *        Represents the request to delete a user pool client.
     * @return Result of the DeleteUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserPoolClientResult deleteUserPoolClient(DeleteUserPoolClientRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserPoolClient(request);
    }

    @SdkInternalApi
    final DeleteUserPoolClientResult executeDeleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolClientRequest> request = null;
        Response<DeleteUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserPoolClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserPoolClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserPoolClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a domain for a user pool.
     * </p>
     * 
     * @param deleteUserPoolDomainRequest
     * @return Result of the DeleteUserPoolDomain operation returned by the service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserPoolDomainResult deleteUserPoolDomain(DeleteUserPoolDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserPoolDomain(request);
    }

    @SdkInternalApi
    final DeleteUserPoolDomainResult executeDeleteUserPoolDomain(DeleteUserPoolDomainRequest deleteUserPoolDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserPoolDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolDomainRequest> request = null;
        Response<DeleteUserPoolDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserPoolDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserPoolDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserPoolDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserPoolDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specific identity provider.
     * </p>
     * 
     * @param describeIdentityProviderRequest
     * @return Result of the DescribeIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityProviderResult describeIdentityProvider(DescribeIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentityProvider(request);
    }

    @SdkInternalApi
    final DescribeIdentityProviderResult executeDescribeIdentityProvider(DescribeIdentityProviderRequest describeIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityProviderRequest> request = null;
        Response<DescribeIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a resource server.
     * </p>
     * 
     * @param describeResourceServerRequest
     * @return Result of the DescribeResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourceServerResult describeResourceServer(DescribeResourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourceServer(request);
    }

    @SdkInternalApi
    final DescribeResourceServerResult executeDescribeResourceServer(DescribeResourceServerRequest describeResourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceServerRequest> request = null;
        Response<DescribeResourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the risk configuration.
     * </p>
     * 
     * @param describeRiskConfigurationRequest
     * @return Result of the DescribeRiskConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons are not enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRiskConfigurationResult describeRiskConfiguration(DescribeRiskConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRiskConfiguration(request);
    }

    @SdkInternalApi
    final DescribeRiskConfigurationResult executeDescribeRiskConfiguration(DescribeRiskConfigurationRequest describeRiskConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRiskConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRiskConfigurationRequest> request = null;
        Response<DescribeRiskConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRiskConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRiskConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRiskConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRiskConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRiskConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest
     *        Represents the request to describe the user import job.
     * @return Result of the DescribeUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUserImportJobResult describeUserImportJob(DescribeUserImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserImportJob(request);
    }

    @SdkInternalApi
    final DescribeUserImportJobResult executeDescribeUserImportJob(DescribeUserImportJobRequest describeUserImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserImportJobRequest> request = null;
        Response<DescribeUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserImportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeUserImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user pool.
     * </p>
     * 
     * @param describeUserPoolRequest
     *        Represents the request to describe the user pool.
     * @return Result of the DescribeUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag cannot be set or updated.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPool" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserPool(request);
    }

    @SdkInternalApi
    final DescribeUserPoolResult executeDescribeUserPool(DescribeUserPoolRequest describeUserPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolRequest> request = null;
        Response<DescribeUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool app client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @return Result of the DescribeUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserPoolClient(request);
    }

    @SdkInternalApi
    final DescribeUserPoolClientResult executeDescribeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolClientRequest> request = null;
        Response<DescribeUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserPoolClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserPoolClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeUserPoolClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a domain.
     * </p>
     * 
     * @param describeUserPoolDomainRequest
     * @return Result of the DescribeUserPoolDomain operation returned by the service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUserPoolDomainResult describeUserPoolDomain(DescribeUserPoolDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserPoolDomain(request);
    }

    @SdkInternalApi
    final DescribeUserPoolDomainResult executeDescribeUserPoolDomain(DescribeUserPoolDomainRequest describeUserPoolDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserPoolDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolDomainRequest> request = null;
        Response<DescribeUserPoolDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserPoolDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserPoolDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserPoolDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeUserPoolDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest
     *        Represents the request to forget the device.
     * @return Result of the ForgetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ForgetDeviceResult forgetDevice(ForgetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeForgetDevice(request);
    }

    @SdkInternalApi
    final ForgetDeviceResult executeForgetDevice(ForgetDeviceRequest forgetDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(forgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetDeviceRequest> request = null;
        Response<ForgetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(forgetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ForgetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ForgetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ForgetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
     * the user's password. For the <code>Username</code> parameter, you can use the username or user alias. If a
     * verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a
     * verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a
     * verified email exists, <code>InvalidParameterException</code> is thrown. To use the confirmation code for
     * resetting the password, call .
     * </p>
     * 
     * @param forgotPasswordRequest
     *        Represents the request to reset a user's password.
     * @return Result of the ForgotPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgotPassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeForgotPassword(request);
    }

    @SdkInternalApi
    final ForgotPasswordResult executeForgotPassword(ForgotPasswordRequest forgotPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(forgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgotPasswordRequest> request = null;
        Response<ForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgotPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(forgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ForgotPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ForgotPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ForgotPasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the header information for the .csv file to be used as input for the user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest
     *        Represents the request to get the header information for the .csv file for the user import job.
     * @return Result of the GetCSVHeader operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetCSVHeader
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetCSVHeader" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest request) {
        request = beforeClientExecution(request);
        return executeGetCSVHeader(request);
    }

    @SdkInternalApi
    final GetCSVHeaderResult executeGetCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest) {

        ExecutionContext executionContext = createExecutionContext(getCSVHeaderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCSVHeaderRequest> request = null;
        Response<GetCSVHeaderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCSVHeaderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCSVHeaderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCSVHeader");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCSVHeaderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCSVHeaderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the device.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents the request to get the device.
     * @return Result of the GetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeviceResult getDevice(GetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevice(request);
    }

    @SdkInternalApi
    final GetDeviceResult executeGetDevice(GetDeviceRequest getDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified identity provider.
     * </p>
     * 
     * @param getIdentityProviderByIdentifierRequest
     * @return Result of the GetIdentityProviderByIdentifier operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetIdentityProviderByIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetIdentityProviderByIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityProviderByIdentifierResult getIdentityProviderByIdentifier(GetIdentityProviderByIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityProviderByIdentifier(request);
    }

    @SdkInternalApi
    final GetIdentityProviderByIdentifierResult executeGetIdentityProviderByIdentifier(
            GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityProviderByIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityProviderByIdentifierRequest> request = null;
        Response<GetIdentityProviderByIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityProviderByIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIdentityProviderByIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityProviderByIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdentityProviderByIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIdentityProviderByIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This method takes a user pool ID, and returns the signing certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest
     *        Request to get a signing certificate from Cognito.
     * @return Result of the GetSigningCertificate operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @sample AWSCognitoIdentityProvider.GetSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetSigningCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSigningCertificateResult getSigningCertificate(GetSigningCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetSigningCertificate(request);
    }

    @SdkInternalApi
    final GetSigningCertificateResult executeGetSigningCertificate(GetSigningCertificateRequest getSigningCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSigningCertificateRequest> request = null;
        Response<GetSigningCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSigningCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSigningCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSigningCertificateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSigningCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing
     * is set for the particular client, but there is an existing pool level customization (app <code>clientId</code>
     * will be <code>ALL</code>), then that is returned. If nothing is present, then an empty shape is returned.
     * </p>
     * 
     * @param getUICustomizationRequest
     * @return Result of the GetUICustomization operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUICustomizationResult getUICustomization(GetUICustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeGetUICustomization(request);
    }

    @SdkInternalApi
    final GetUICustomizationResult executeGetUICustomization(GetUICustomizationRequest getUICustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(getUICustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUICustomizationRequest> request = null;
        Response<GetUICustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUICustomizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUICustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUICustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUICustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUICustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest
     *        Represents the request to get information about the user.
     * @return Result of the GetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute name.
     * </p>
     * 
     * @param getUserAttributeVerificationCodeRequest
     *        Represents the request to get user attribute verification.
     * @return Result of the GetUserAttributeVerificationCode operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUserAttributeVerificationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserAttributeVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(GetUserAttributeVerificationCodeRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserAttributeVerificationCode(request);
    }

    @SdkInternalApi
    final GetUserAttributeVerificationCodeResult executeGetUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserAttributeVerificationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAttributeVerificationCodeRequest> request = null;
        Response<GetUserAttributeVerificationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAttributeVerificationCodeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getUserAttributeVerificationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserAttributeVerificationCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserAttributeVerificationCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetUserAttributeVerificationCodeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * 
     * @param getUserPoolMfaConfigRequest
     * @return Result of the GetUserPoolMfaConfig operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetUserPoolMfaConfigResult getUserPoolMfaConfig(GetUserPoolMfaConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserPoolMfaConfig(request);
    }

    @SdkInternalApi
    final GetUserPoolMfaConfigResult executeGetUserPoolMfaConfig(GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserPoolMfaConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserPoolMfaConfigRequest> request = null;
        Response<GetUserPoolMfaConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserPoolMfaConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserPoolMfaConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserPoolMfaConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserPoolMfaConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserPoolMfaConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Signs out users from all devices.
     * </p>
     * 
     * @param globalSignOutRequest
     *        Represents the request to sign out all devices.
     * @return Result of the GlobalSignOut operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GlobalSignOut" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GlobalSignOutResult globalSignOut(GlobalSignOutRequest request) {
        request = beforeClientExecution(request);
        return executeGlobalSignOut(request);
    }

    @SdkInternalApi
    final GlobalSignOutResult executeGlobalSignOut(GlobalSignOutRequest globalSignOutRequest) {

        ExecutionContext executionContext = createExecutionContext(globalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GlobalSignOutRequest> request = null;
        Response<GlobalSignOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GlobalSignOutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(globalSignOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GlobalSignOut");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GlobalSignOutResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GlobalSignOutResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates the authentication flow.
     * </p>
     * 
     * @param initiateAuthRequest
     *        Initiates the authentication request.
     * @return Result of the InitiateAuth operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.InitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/InitiateAuth" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InitiateAuthResult initiateAuth(InitiateAuthRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateAuth(request);
    }

    @SdkInternalApi
    final InitiateAuthResult executeInitiateAuth(InitiateAuthRequest initiateAuthRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateAuthRequest> request = null;
        Response<InitiateAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateAuthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateAuth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateAuthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitiateAuthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the devices.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the request to list the devices.
     * @return Result of the ListDevices operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListDevices(request);
    }

    @SdkInternalApi
    final ListDevicesResult executeListDevices(ListDevicesRequest listDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the groups associated with a user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about all identity providers for a user pool.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentityProviders(request);
    }

    @SdkInternalApi
    final ListIdentityProvidersResult executeListIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentityProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityProvidersRequest> request = null;
        Response<ListIdentityProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityProvidersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentityProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentityProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentityProvidersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListIdentityProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource servers for a user pool.
     * </p>
     * 
     * @param listResourceServersRequest
     * @return Result of the ListResourceServers operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListResourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListResourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceServersResult listResourceServers(ListResourceServersRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceServers(request);
    }

    @SdkInternalApi
    final ListResourceServersResult executeListResourceServers(ListResourceServersRequest listResourceServersRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceServersRequest> request = null;
        Response<ListResourceServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito user pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
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
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest
     *        Represents the request to list the user import jobs.
     * @return Result of the ListUserImportJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListUserImportJobsResult listUserImportJobs(ListUserImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserImportJobs(request);
    }

    @SdkInternalApi
    final ListUserImportJobsResult executeListUserImportJobs(ListUserImportJobsRequest listUserImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserImportJobsRequest> request = null;
        Response<ListUserImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * 
     * @param listUserPoolClientsRequest
     *        Represents the request to list the user pool clients.
     * @return Result of the ListUserPoolClients operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPoolClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPoolClients"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserPoolClients(request);
    }

    @SdkInternalApi
    final ListUserPoolClientsResult executeListUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserPoolClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolClientsRequest> request = null;
        Response<ListUserPoolClientsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolClientsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserPoolClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserPoolClients");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserPoolClientsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserPoolClientsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the user pools associated with an AWS account.
     * </p>
     * 
     * @param listUserPoolsRequest
     *        Represents the request to list user pools.
     * @return Result of the ListUserPools operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPools" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserPools(request);
    }

    @SdkInternalApi
    final ListUserPoolsResult executeListUserPools(ListUserPoolsRequest listUserPoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolsRequest> request = null;
        Response<ListUserPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserPools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserPoolsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserPoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     * 
     * @param listUsersRequest
     *        Represents the request to list users.
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
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
     * Lists the users in the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listUsersInGroupRequest
     * @return Result of the ListUsersInGroup operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUsersInGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsersInGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListUsersInGroupResult listUsersInGroup(ListUsersInGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListUsersInGroup(request);
    }

    @SdkInternalApi
    final ListUsersInGroupResult executeListUsersInGroup(ListUsersInGroupRequest listUsersInGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersInGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersInGroupRequest> request = null;
        Response<ListUsersInGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersInGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersInGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsersInGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersInGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersInGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @return Result of the ResendConfirmationCode operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ResendConfirmationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResendConfirmationCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest request) {
        request = beforeClientExecution(request);
        return executeResendConfirmationCode(request);
    }

    @SdkInternalApi
    final ResendConfirmationCodeResult executeResendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(resendConfirmationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendConfirmationCodeRequest> request = null;
        Response<ResendConfirmationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendConfirmationCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resendConfirmationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResendConfirmationCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResendConfirmationCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResendConfirmationCodeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * 
     * @param respondToAuthChallengeRequest
     *        The request to respond to an authentication challenge.
     * @return Result of the RespondToAuthChallenge operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws MFAMethodNotFoundException
     *         This exception is thrown when Amazon Cognito cannot find a multi-factor authentication (MFA) method.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token TOTP multi-factor authentication (MFA) is not enabled
     *         for the user pool.
     * @sample AWSCognitoIdentityProvider.RespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RespondToAuthChallengeResult respondToAuthChallenge(RespondToAuthChallengeRequest request) {
        request = beforeClientExecution(request);
        return executeRespondToAuthChallenge(request);
    }

    @SdkInternalApi
    final RespondToAuthChallengeResult executeRespondToAuthChallenge(RespondToAuthChallengeRequest respondToAuthChallengeRequest) {

        ExecutionContext executionContext = createExecutionContext(respondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondToAuthChallengeRequest> request = null;
        Response<RespondToAuthChallengeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondToAuthChallengeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(respondToAuthChallengeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RespondToAuthChallenge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RespondToAuthChallengeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RespondToAuthChallengeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures actions on detected risks. To delete the risk configuration for <code>UserPoolId</code> or
     * <code>ClientId</code>, pass null values for all four configuration types.
     * </p>
     * <p>
     * To enable Amazon Cognito advanced security features, update the user pool to include the
     * <code>UserPoolAddOns</code> key<code>AdvancedSecurityMode</code>.
     * </p>
     * <p>
     * See .
     * </p>
     * 
     * @param setRiskConfigurationRequest
     * @return Result of the SetRiskConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons are not enabled.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetRiskConfigurationResult setRiskConfiguration(SetRiskConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeSetRiskConfiguration(request);
    }

    @SdkInternalApi
    final SetRiskConfigurationResult executeSetRiskConfiguration(SetRiskConfigurationRequest setRiskConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(setRiskConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetRiskConfigurationRequest> request = null;
        Response<SetRiskConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetRiskConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setRiskConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetRiskConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetRiskConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetRiskConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the UI customization information for a user pool's built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a specific <code>clientId</code>) or for
     * all clients (by setting the <code>clientId</code> to <code>ALL</code>). If you specify <code>ALL</code>, the
     * default configuration will be used for every client that has no UI customization set previously. If you specify
     * UI customization settings for a particular client, it will no longer fall back to the <code>ALL</code>
     * configuration.
     * </p>
     * <note>
     * <p>
     * To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
     * app's pages, and the service will throw an error.
     * </p>
     * </note>
     * 
     * @param setUICustomizationRequest
     * @return Result of the SetUICustomization operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetUICustomizationResult setUICustomization(SetUICustomizationRequest request) {
        request = beforeClientExecution(request);
        return executeSetUICustomization(request);
    }

    @SdkInternalApi
    final SetUICustomizationResult executeSetUICustomization(SetUICustomizationRequest setUICustomizationRequest) {

        ExecutionContext executionContext = createExecutionContext(setUICustomizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUICustomizationRequest> request = null;
        Response<SetUICustomizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUICustomizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setUICustomizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetUICustomization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetUICustomizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetUICustomizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the user's multi-factor authentication (MFA) method preference.
     * </p>
     * 
     * @param setUserMFAPreferenceRequest
     * @return Result of the SetUserMFAPreference operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetUserMFAPreferenceResult setUserMFAPreference(SetUserMFAPreferenceRequest request) {
        request = beforeClientExecution(request);
        return executeSetUserMFAPreference(request);
    }

    @SdkInternalApi
    final SetUserMFAPreferenceResult executeSetUserMFAPreference(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(setUserMFAPreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserMFAPreferenceRequest> request = null;
        Response<SetUserMFAPreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserMFAPreferenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setUserMFAPreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetUserMFAPreference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetUserMFAPreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetUserMFAPreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the user pool MFA configuration.
     * </p>
     * 
     * @param setUserPoolMfaConfigRequest
     * @return Result of the SetUserPoolMfaConfig operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetUserPoolMfaConfigResult setUserPoolMfaConfig(SetUserPoolMfaConfigRequest request) {
        request = beforeClientExecution(request);
        return executeSetUserPoolMfaConfig(request);
    }

    @SdkInternalApi
    final SetUserPoolMfaConfigResult executeSetUserPoolMfaConfig(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(setUserPoolMfaConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserPoolMfaConfigRequest> request = null;
        Response<SetUserPoolMfaConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserPoolMfaConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setUserPoolMfaConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetUserPoolMfaConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetUserPoolMfaConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetUserPoolMfaConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute
     * pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
     * </p>
     * 
     * @param setUserSettingsRequest
     *        Represents the request to set user settings.
     * @return Result of the SetUserSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeSetUserSettings(request);
    }

    @SdkInternalApi
    final SetUserSettingsResult executeSetUserSettings(SetUserSettingsRequest setUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(setUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserSettingsRequest> request = null;
        Response<SetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetUserSettingsResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name, password, and user attributes.
     * </p>
     * 
     * @param signUpRequest
     *        Represents the request to register a user.
     * @return Result of the SignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @sample AWSCognitoIdentityProvider.SignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SignUp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SignUpResult signUp(SignUpRequest request) {
        request = beforeClientExecution(request);
        return executeSignUp(request);
    }

    @SdkInternalApi
    final SignUpResult executeSignUp(SignUpRequest signUpRequest) {

        ExecutionContext executionContext = createExecutionContext(signUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignUpRequest> request = null;
        Response<SignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignUpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(signUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SignUp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SignUpResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SignUpResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest
     *        Represents the request to start the user import job.
     * @return Result of the StartUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.StartUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StartUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartUserImportJobResult startUserImportJob(StartUserImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartUserImportJob(request);
    }

    @SdkInternalApi
    final StartUserImportJobResult executeStartUserImportJob(StartUserImportJobRequest startUserImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartUserImportJobRequest> request = null;
        Response<StartUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartUserImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartUserImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartUserImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartUserImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest
     *        Represents the request to stop the user import job.
     * @return Result of the StopUserImportJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.StopUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StopUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopUserImportJobResult stopUserImportJob(StopUserImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopUserImportJob(request);
    }

    @SdkInternalApi
    final StopUserImportJobResult executeStopUserImportJob(StopUserImportJobRequest stopUserImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopUserImportJobRequest> request = null;
        Response<StopUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopUserImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopUserImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopUserImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopUserImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of a user pool, one for testing and another for production, you
     * might assign an <code>Environment</code> tag key to both user pools. The value of this key might be
     * <code>Test</code> for one user pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM
     * policy, you can constrain permissions for user pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
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
     * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
     * per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
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
     * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used
     * for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param updateAuthEventFeedbackRequest
     * @return Result of the UpdateAuthEventFeedback operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserPoolAddOnNotEnabledException
     *         This exception is thrown when user pool add-ons are not enabled.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAuthEventFeedbackResult updateAuthEventFeedback(UpdateAuthEventFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAuthEventFeedback(request);
    }

    @SdkInternalApi
    final UpdateAuthEventFeedbackResult executeUpdateAuthEventFeedback(UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAuthEventFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuthEventFeedbackRequest> request = null;
        Response<UpdateAuthEventFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuthEventFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAuthEventFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAuthEventFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAuthEventFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAuthEventFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest
     *        Represents the request to update the device status.
     * @return Result of the UpdateDeviceStatus operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateDeviceStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceStatusResult updateDeviceStatus(UpdateDeviceStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeviceStatus(request);
    }

    @SdkInternalApi
    final UpdateDeviceStatusResult executeUpdateDeviceStatus(UpdateDeviceStatusRequest updateDeviceStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceStatusRequest> request = null;
        Response<UpdateDeviceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeviceStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified group with the specified attributes.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroup(request);
    }

    @SdkInternalApi
    final UpdateGroupResult executeUpdateGroup(UpdateGroupRequest updateGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates identity provider information for a user pool.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return Result of the UpdateIdentityProvider operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnsupportedIdentityProviderException
     *         This exception is thrown when the specified identifier is not supported.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdentityProviderResult updateIdentityProvider(UpdateIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentityProvider(request);
    }

    @SdkInternalApi
    final UpdateIdentityProviderResult executeUpdateIdentityProvider(UpdateIdentityProviderRequest updateIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityProviderRequest> request = null;
        Response<UpdateIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are read-only.
     * </p>
     * 
     * @param updateResourceServerRequest
     * @return Result of the UpdateResourceServer operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourceServerResult updateResourceServer(UpdateResourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceServer(request);
    }

    @SdkInternalApi
    final UpdateResourceServerResult executeUpdateResourceServer(UpdateResourceServerRequest updateResourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceServerRequest> request = null;
        Response<UpdateResourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * 
     * @param updateUserAttributesRequest
     *        Represents the request to update user attributes.
     * @return Result of the UpdateUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS
     *         Lambda service.
     * @throws UserLambdaValidationException
     *         This exception is thrown when the Amazon Cognito service encounters a user validation exception with the
     *         AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @throws CodeDeliveryFailureException
     *         This exception is thrown when a verification code fails to deliver successfully.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserAttributes(request);
    }

    @SdkInternalApi
    final UpdateUserAttributesResult executeUpdateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAttributesRequest> request = null;
        Response<UpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserAttributesResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it
     * will be set to the default value. You can get a list of the current user pool settings with .
     * </p>
     * 
     * @param updateUserPoolRequest
     *        Represents the request to update the user pool.
     * @return Result of the UpdateUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you are trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws InvalidSmsRoleAccessPolicyException
     *         This exception is returned when the role provided for SMS configuration does not have permission to
     *         publish using Amazon SNS.
     * @throws InvalidSmsRoleTrustRelationshipException
     *         This exception is thrown when the trust relationship is invalid for the role provided for SMS
     *         configuration. This can happen if you do not trust <b>cognito-idp.amazonaws.com</b> or the external ID
     *         provided in the role does not match what is provided in the SMS configuration for the user pool.
     * @throws UserPoolTaggingException
     *         This exception is thrown when a user pool tag cannot be set or updated.
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @sample AWSCognitoIdentityProvider.UpdateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserPool(request);
    }

    @SdkInternalApi
    final UpdateUserPoolResult executeUpdateUserPool(UpdateUserPoolRequest updateUserPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolRequest> request = null;
        Response<UpdateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an
     * attribute, it will be set to the default value. You can get a list of the current user pool app client settings
     * with .
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return Result of the UpdateUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are happening concurrently.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws ScopeDoesNotExistException
     *         This exception is thrown when the specified scope does not exist.
     * @throws InvalidOAuthFlowException
     *         This exception is thrown when the specified OAuth flow is invalid.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserPoolClient(request);
    }

    @SdkInternalApi
    final UpdateUserPoolClientResult executeUpdateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolClientRequest> request = null;
        Response<UpdateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserPoolClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPoolClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserPoolClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.
     * </p>
     * <p>
     * You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You
     * cannot use it to change the domain for a user pool.
     * </p>
     * <p>
     * A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your
     * application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate
     * Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your
     * custom domain.
     * </p>
     * <p>
     * Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing
     * certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new
     * certificate automatically.
     * </p>
     * <p>
     * However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To
     * apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito.
     * </p>
     * <p>
     * When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region.
     * </p>
     * <p>
     * After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your
     * custom domain.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param updateUserPoolDomainRequest
     *        The UpdateUserPoolDomain request input.
     * @return Result of the UpdateUserPoolDomain operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserPoolDomainResult updateUserPoolDomain(UpdateUserPoolDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserPoolDomain(request);
    }

    @SdkInternalApi
    final UpdateUserPoolDomainResult executeUpdateUserPoolDomain(UpdateUserPoolDomainRequest updateUserPoolDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserPoolDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolDomainRequest> request = null;
        Response<UpdateUserPoolDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPoolDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserPoolDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPoolDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserPoolDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified"
     * if successful. The request takes an access token or a session string, but not both.
     * </p>
     * 
     * @param verifySoftwareTokenRequest
     * @return Result of the VerifySoftwareToken operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws EnableSoftwareTokenMFAException
     *         This exception is thrown when there is a code mismatch and the service fails to configure the software
     *         token TOTP multi-factor authentication (MFA).
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws SoftwareTokenMFANotFoundException
     *         This exception is thrown when the software token TOTP multi-factor authentication (MFA) is not enabled
     *         for the user pool.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @sample AWSCognitoIdentityProvider.VerifySoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public VerifySoftwareTokenResult verifySoftwareToken(VerifySoftwareTokenRequest request) {
        request = beforeClientExecution(request);
        return executeVerifySoftwareToken(request);
    }

    @SdkInternalApi
    final VerifySoftwareTokenResult executeVerifySoftwareToken(VerifySoftwareTokenRequest verifySoftwareTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(verifySoftwareTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifySoftwareTokenRequest> request = null;
        Response<VerifySoftwareTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifySoftwareTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifySoftwareTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifySoftwareToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifySoftwareTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new VerifySoftwareTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * 
     * @param verifyUserAttributeRequest
     *        Represents the request to verify user attributes.
     * @return Result of the VerifyUserAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception is thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception is thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.VerifyUserAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifyUserAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyUserAttribute(request);
    }

    @SdkInternalApi
    final VerifyUserAttributeResult executeVerifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyUserAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyUserAttributeRequest> request = null;
        Response<VerifyUserAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyUserAttributeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyUserAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity Provider");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyUserAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifyUserAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new VerifyUserAttributeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

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
