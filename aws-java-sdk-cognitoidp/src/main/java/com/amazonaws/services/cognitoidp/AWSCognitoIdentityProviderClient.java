/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.services.cognitoidp.model.transform.*;

/**
 * Client for accessing Amazon Cognito Identity Provider. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * Using the Amazon Cognito Your User Pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito Your User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
@ThreadSafe
public class AWSCognitoIdentityProviderClient extends AmazonWebServiceClient implements AWSCognitoIdentityProvider {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCognitoIdentityProvider.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-idp";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("PasswordResetRequiredException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.PasswordResetRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.ConcurrentModificationException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidLambdaResponseException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.InvalidLambdaResponseException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnexpectedLambdaException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("InvalidSmsRoleAccessPolicyException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.InvalidSmsRoleAccessPolicyException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UsernameExistsException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.UsernameExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("CodeDeliveryFailureException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.CodeDeliveryFailureException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UserImportInProgressException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.UserImportInProgressException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExpiredCodeException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.ExpiredCodeException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.InternalErrorException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidEmailRoleAccessPolicyException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.InvalidEmailRoleAccessPolicyException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.LimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("PreconditionNotMetException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.PreconditionNotMetException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("UserNotConfirmedException").withModeledClass(
                            com.amazonaws.services.cognitoidp.model.UserNotConfirmedException.class))
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
     */
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
     */
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
     */
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
     */
    public AWSCognitoIdentityProviderClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AWSCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you are trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AddCustomAttributes
     */
    @Override
    public AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(addCustomAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomAttributesRequest> request = null;
        Response<AddCustomAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomAttributesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addCustomAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed attempts for a given action (e.g., sign
     *         in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminConfirmSignUp
     */
    @Override
    public AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest) {
        ExecutionContext executionContext = createExecutionContext(adminConfirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminConfirmSignUpRequest> request = null;
        Response<AdminConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminConfirmSignUpRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminConfirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates a new user in the specified user pool and sends a welcome message via email or phone (SMS). This message
     * is based on a template that you configured in your call to CreateUserPool or UpdateUserPool. This template
     * includes your custom sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * <p>
     * Requires developer credentials.
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UnsupportedUserStateException
     *         The request failed because the user is in an unsupported state.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminCreateUser
     */
    @Override
    public AdminCreateUserResult adminCreateUser(AdminCreateUserRequest adminCreateUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminCreateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminCreateUserRequest> request = null;
        Response<AdminCreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminCreateUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminCreateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @return Result of the AdminDeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUser
     */
    @Override
    public AdminDeleteUserResult adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserRequest> request = null;
        Response<AdminDeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminDeleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @return Result of the AdminDeleteUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUserAttributes
     */
    @Override
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserAttributesRequest> request = null;
        Response<AdminDeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserAttributesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminDeleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Disables the specified user as an administrator. Works on any user.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableUser
     */
    @Override
    public AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDisableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDisableUserRequest> request = null;
        Response<AdminDisableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDisableUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminDisableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @return Result of the AdminEnableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminEnableUser
     */
    @Override
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminEnableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminEnableUserRequest> request = null;
        Response<AdminEnableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminEnableUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminEnableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminForgetDevice
     */
    @Override
    public AdminForgetDeviceResult adminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(adminForgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminForgetDeviceRequest> request = null;
        Response<AdminForgetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminForgetDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminForgetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.AdminGetDevice
     */
    @Override
    public AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(adminGetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetDeviceRequest> request = null;
        Response<AdminGetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminGetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @return Result of the AdminGetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminGetUser
     */
    @Override
    public AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminGetUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetUserRequest> request = null;
        Response<AdminGetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminGetUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @return Result of the AdminInitiateAuth operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
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
     */
    @Override
    public AdminInitiateAuthResult adminInitiateAuth(AdminInitiateAuthRequest adminInitiateAuthRequest) {
        ExecutionContext executionContext = createExecutionContext(adminInitiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminInitiateAuthRequest> request = null;
        Response<AdminInitiateAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminInitiateAuthRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminInitiateAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists devices, as an administrator.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.AdminListDevices
     */
    @Override
    public AdminListDevicesResult adminListDevices(AdminListDevicesRequest adminListDevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminListDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminListDevicesRequest> request = null;
        Response<AdminListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminListDevicesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminListDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @return Result of the AdminResetUserPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminResetUserPassword
     */
    @Override
    public AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(adminResetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminResetUserPasswordRequest> request = null;
        Response<AdminResetUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminResetUserPasswordRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminResetUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @return Result of the AdminRespondToAuthChallenge operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     * @sample AWSCognitoIdentityProvider.AdminRespondToAuthChallenge
     */
    @Override
    public AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest) {
        ExecutionContext executionContext = createExecutionContext(adminRespondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminRespondToAuthChallengeRequest> request = null;
        Response<AdminRespondToAuthChallengeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminRespondToAuthChallengeRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(adminRespondToAuthChallengeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Sets all the user settings for a specified user name. Works on any user.
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
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminSetUserSettings
     */
    @Override
    public AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(adminSetUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserSettingsRequest> request = null;
        Response<AdminSetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserSettingsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminSetUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Updates the device status as an administrator.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateDeviceStatus
     */
    @Override
    public AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(adminUpdateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateDeviceStatusRequest> request = null;
        Response<AdminUpdateDeviceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateDeviceStatusRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminUpdateDeviceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @return Result of the AdminUpdateUserAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account with an email or phone number that has
     *         already been supplied as an alias from a different account. This exception tells user that an account
     *         with this email or phone already exists.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateUserAttributes
     */
    @Override
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminUpdateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateUserAttributesRequest> request = null;
        Response<AdminUpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateUserAttributesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminUpdateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @return Result of the AdminUserGlobalSignOut operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.AdminUserGlobalSignOut
     */
    @Override
    public AdminUserGlobalSignOutResult adminUserGlobalSignOut(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest) {
        ExecutionContext executionContext = createExecutionContext(adminUserGlobalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUserGlobalSignOutRequest> request = null;
        Response<AdminUserGlobalSignOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUserGlobalSignOutRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(adminUserGlobalSignOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangePasswordRequest> request = null;
        Response<ChangePasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(changePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Confirms tracking of the device. This API call is the call that beings device tracking.
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
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmDevice
     */
    @Override
    public ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest confirmDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmDeviceRequest> request = null;
        Response<ConfirmDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Allows a user to enter a code provided when they reset their password to update their password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return Result of the ConfirmForgotPassword operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed attempts for a given action (e.g., sign
     *         in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmForgotPassword
     */
    @Override
    public ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmForgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmForgotPasswordRequest> request = null;
        Response<ConfirmForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmForgotPasswordRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmForgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed attempts for a given action (e.g., sign
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmSignUp
     */
    @Override
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSignUpRequest> request = null;
        Response<ConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmSignUpRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserImportJob
     */
    @Override
    public CreateUserImportJobResult createUserImportJob(CreateUserImportJobRequest createUserImportJobRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserImportJobRequest> request = null;
        Response<CreateUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserImportJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPool
     */
    @Override
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolRequest> request = null;
        Response<CreateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a requested AWS resource.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolClient
     */
    @Override
    public CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolClientRequest> request = null;
        Response<CreateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolClientRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Allows a user to delete one's self.
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUser
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserAttributes
     */
    @Override
    public DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAttributesRequest> request = null;
        Response<DeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAttributesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UserImportInProgressException
     *         This exception is thrown when you are trying to modify a user pool while a user import job is in progress
     *         for that pool.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPool
     */
    @Override
    public DeleteUserPoolResult deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolRequest> request = null;
        Response<DeleteUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolClient
     */
    @Override
    public DeleteUserPoolClientResult deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolClientRequest> request = null;
        Response<DeleteUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolClientRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserImportJob
     */
    @Override
    public DescribeUserImportJobResult describeUserImportJob(DescribeUserImportJobRequest describeUserImportJobRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserImportJobRequest> request = null;
        Response<DescribeUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserImportJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPool
     */
    @Override
    public DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolRequest> request = null;
        Response<DescribeUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Client method for returning the configuration information and metadata of the specified user pool client.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolClient
     */
    @Override
    public DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolClientRequest> request = null;
        Response<DescribeUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolClientRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public ForgetDeviceResult forgetDevice(ForgetDeviceRequest forgetDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(forgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetDeviceRequest> request = null;
        Response<ForgetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(forgetDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Retrieves the password for the specified client ID or username.
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(forgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgotPasswordRequest> request = null;
        Response<ForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgotPasswordRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(forgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetCSVHeader
     */
    @Override
    public GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest) {
        ExecutionContext executionContext = createExecutionContext(getCSVHeaderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCSVHeaderRequest> request = null;
        Response<GetCSVHeaderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCSVHeaderRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCSVHeaderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetDevice
     */
    @Override
    public GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GetUser
     */
    @Override
    public GetUserResult getUser(GetUserRequest getUserRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
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
     */
    @Override
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserAttributeVerificationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAttributeVerificationCodeRequest> request = null;
        Response<GetUserAttributeVerificationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAttributeVerificationCodeRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getUserAttributeVerificationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.GlobalSignOut
     */
    @Override
    public GlobalSignOutResult globalSignOut(GlobalSignOutRequest globalSignOutRequest) {
        ExecutionContext executionContext = createExecutionContext(globalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GlobalSignOutRequest> request = null;
        Response<GlobalSignOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GlobalSignOutRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(globalSignOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
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
     */
    @Override
    public InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest) {
        ExecutionContext executionContext = createExecutionContext(initiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateAuthRequest> request = null;
        Response<InitiateAuthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateAuthRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateAuthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListDevices
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserImportJobs
     */
    @Override
    public ListUserImportJobsResult listUserImportJobs(ListUserImportJobsRequest listUserImportJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserImportJobsRequest> request = null;
        Response<ListUserImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserImportJobsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPoolClients
     */
    @Override
    public ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolClientsRequest> request = null;
        Response<ListUserPoolClientsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolClientsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserPoolClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPools
     */
    @Override
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolsRequest> request = null;
        Response<ListUserPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.ListUsers
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(resendConfirmationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendConfirmationCodeRequest> request = null;
        Response<ResendConfirmationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendConfirmationCodeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(resendConfirmationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     * @sample AWSCognitoIdentityProvider.RespondToAuthChallenge
     */
    @Override
    public RespondToAuthChallengeResult respondToAuthChallenge(RespondToAuthChallengeRequest respondToAuthChallengeRequest) {
        ExecutionContext executionContext = createExecutionContext(respondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondToAuthChallengeRequest> request = null;
        Response<RespondToAuthChallengeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondToAuthChallengeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(respondToAuthChallengeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.SetUserSettings
     */
    @Override
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(setUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserSettingsRequest> request = null;
        Response<SetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserSettingsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(setUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user name that already exists in the user pool.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public SignUpResult signUp(SignUpRequest signUpRequest) {
        ExecutionContext executionContext = createExecutionContext(signUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignUpRequest> request = null;
        Response<SignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignUpRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(signUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.StartUserImportJob
     */
    @Override
    public StartUserImportJobResult startUserImportJob(StartUserImportJobRequest startUserImportJobRequest) {
        ExecutionContext executionContext = createExecutionContext(startUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartUserImportJobRequest> request = null;
        Response<StartUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartUserImportJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @throws PreconditionNotMetException
     *         This exception is thrown when a precondition is not met.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.StopUserImportJob
     */
    @Override
    public StopUserImportJobResult stopUserImportJob(StopUserImportJobRequest stopUserImportJobRequest) {
        ExecutionContext executionContext = createExecutionContext(stopUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopUserImportJobRequest> request = null;
        Response<StopUserImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopUserImportJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopUserImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidUserPoolConfigurationException
     *         This exception is thrown when the user pool configuration is invalid.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws PasswordResetRequiredException
     *         This exception is thrown when a password reset is required.
     * @throws UserNotFoundException
     *         This exception is thrown when a user is not found.
     * @throws UserNotConfirmedException
     *         This exception is thrown when a user is not confirmed successfully.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateDeviceStatus
     */
    @Override
    public UpdateDeviceStatusResult updateDeviceStatus(UpdateDeviceStatusRequest updateDeviceStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceStatusRequest> request = null;
        Response<UpdateDeviceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceStatusRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service encounters an unexpected exception with the
     *         AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service encounters a user validation exception with
     *         the AWS Lambda service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAttributesRequest> request = null;
        Response<UpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAttributesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Updates the specified user pool with the specified attributes.
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
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
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
     * @throws InvalidEmailRoleAccessPolicyException
     *         This exception is thrown when Amazon Cognito is not allowed to use your email identity. HTTP status code:
     *         400.
     * @sample AWSCognitoIdentityProvider.UpdateUserPool
     */
    @Override
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolRequest> request = null;
        Response<UpdateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Allows the developer to update the specified user pool client and password policy.
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return Result of the UpdateUserPoolClient operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolClient
     */
    @Override
    public UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolClientRequest> request = null;
        Response<UpdateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolClientRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many requests for a given operation.
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
     */
    @Override
    public VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyUserAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyUserAttributeRequest> request = null;
        Response<VerifyUserAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyUserAttributeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyUserAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
