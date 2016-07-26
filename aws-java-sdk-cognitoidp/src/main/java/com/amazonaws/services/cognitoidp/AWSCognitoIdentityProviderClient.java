/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
 * Client for accessing Amazon Cognito Identity Provider. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * You can create a user pool in Amazon Cognito Identity to manage directories
 * and users. You can authenticate a user to obtain tokens related to user
 * identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito
 * Identity, which is a new capability that is available as a beta.
 * </p>
 */
@ThreadSafe
public class AWSCognitoIdentityProviderClient extends AmazonWebServiceClient
        implements AWSCognitoIdentityProvider {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AWSCognitoIdentityProvider.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-idp";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode(
                                            "ConcurrentModificationException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode(
                                            "InvalidLambdaResponseException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.InvalidLambdaResponseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("UnexpectedLambdaException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidParameterException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode(
                                            "UserLambdaValidationException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.UserLambdaValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode(
                                            "TooManyFailedAttemptsException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.TooManyFailedAttemptsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("UsernameExistsException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.UsernameExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("ExpiredCodeException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.ExpiredCodeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InternalErrorException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("LimitExceededException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidPasswordException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.InvalidPasswordException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("ResourceNotFoundException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("AliasExistsException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.AliasExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("NotAuthorizedException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("TooManyRequestsException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("CodeMismatchException")
                                    .withModeledClass(
                                            com.amazonaws.services.cognitoidp.model.CodeMismatchException.class))
                    .withBaseServiceExceptionClass(
                            com.amazonaws.services.cognitoidp.model.AWSCognitoIdentityProviderException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCognitoIdentityProviderClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Cognito Identity Provider (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCognitoIdentityProviderClient(
            ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSCognitoIdentityProviderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Cognito Identity Provider (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSCognitoIdentityProviderClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSCognitoIdentityProviderClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Cognito Identity Provider (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSCognitoIdentityProviderClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Cognito Identity Provider (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCognitoIdentityProviderClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity Provider using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
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
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cognitoidp/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cognitoidp/request.handler2s"));
    }

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest
     *        Represents the request to add custom attributes.
     * @return Result of the AddCustomAttributes operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AddCustomAttributes
     */
    @Override
    public AddCustomAttributesResult addCustomAttributes(
            AddCustomAttributesRequest addCustomAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(addCustomAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomAttributesRequest> request = null;
        Response<AddCustomAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomAttributesRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(addCustomAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddCustomAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AddCustomAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code.
     * Works on any user.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @return Result of the AdminConfirmSignUp operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed
     *         attempts for a given action (e.g., sign in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminConfirmSignUp
     */
    @Override
    public AdminConfirmSignUpResult adminConfirmSignUp(
            AdminConfirmSignUpRequest adminConfirmSignUpRequest) {
        ExecutionContext executionContext = createExecutionContext(adminConfirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminConfirmSignUpRequest> request = null;
        Response<AdminConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminConfirmSignUpRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(adminConfirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminConfirmSignUpResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminConfirmSignUpResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUser
     */
    @Override
    public AdminDeleteUserResult adminDeleteUser(
            AdminDeleteUserRequest adminDeleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserRequest> request = null;
        Response<AdminDeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(adminDeleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDeleteUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminDeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on
     * any user.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an
     *        administrator.
     * @return Result of the AdminDeleteUserAttributes operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminDeleteUserAttributes
     */
    @Override
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserAttributesRequest> request = null;
        Response<AdminDeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserAttributesRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(adminDeleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDeleteUserAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminDisableUser
     */
    @Override
    public AdminDisableUserResult adminDisableUser(
            AdminDisableUserRequest adminDisableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDisableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDisableUserRequest> request = null;
        Response<AdminDisableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDisableUserRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(adminDisableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminDisableUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminDisableUserResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminEnableUser
     */
    @Override
    public AdminEnableUserResult adminEnableUser(
            AdminEnableUserRequest adminEnableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminEnableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminEnableUserRequest> request = null;
        Response<AdminEnableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminEnableUserRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(adminEnableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminEnableUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminEnableUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator.
     * Works on any user.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an
     *        administrator.
     * @return Result of the AdminGetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminGetUser
     */
    @Override
    public AdminGetUserResult adminGetUser(
            AdminGetUserRequest adminGetUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminGetUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetUserRequest> request = null;
        Response<AdminGetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetUserRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(adminGetUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminGetUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminGetUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator.
     * Works on any user.
     * </p>
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an
     *        administrator.
     * @return Result of the AdminResetUserPassword operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminResetUserPassword
     */
    @Override
    public AdminResetUserPasswordResult adminResetUserPassword(
            AdminResetUserPasswordRequest adminResetUserPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(adminResetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminResetUserPasswordRequest> request = null;
        Response<AdminResetUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminResetUserPasswordRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(adminResetUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminResetUserPasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminResetUserPasswordResultJsonUnmarshaller());
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
     * @return Result of the AdminSetUserSettings operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.AdminSetUserSettings
     */
    @Override
    public AdminSetUserSettingsResult adminSetUserSettings(
            AdminSetUserSettingsRequest adminSetUserSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(adminSetUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserSettingsRequest> request = null;
        Response<AdminSetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserSettingsRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(adminSetUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminSetUserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new AdminSetUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes,
     * as an administrator. Works on any user.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an
     *        administrator.
     * @return Result of the AdminUpdateUserAttributes operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account
     *         with an email or phone number that has already been supplied as
     *         an alias from a different account. This exception tells user that
     *         an account with this email or phone already exists.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.AdminUpdateUserAttributes
     */
    @Override
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminUpdateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateUserAttributesRequest> request = null;
        Response<AdminUpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateUserAttributesRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(adminUpdateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdminUpdateUserAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            new AdminUpdateUserAttributesResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ChangePassword
     */
    @Override
    public ChangePasswordResult changePassword(
            ChangePasswordRequest changePasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangePasswordRequest> request = null;
        Response<ChangePasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(changePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChangePasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ChangePasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a user to enter a code provided when they reset their password to
     * update their password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return Result of the ConfirmForgotPassword operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid password.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what
     *         the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed
     *         attempts for a given action (e.g., sign in).
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmForgotPassword
     */
    @Override
    public ConfirmForgotPasswordResult confirmForgotPassword(
            ConfirmForgotPasswordRequest confirmForgotPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmForgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmForgotPasswordRequest> request = null;
        Response<ConfirmForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmForgotPasswordRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(confirmForgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmForgotPasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ConfirmForgotPasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a
     * previous user.
     * </p>
     * 
     * @param confirmSignUpRequest
     *        Represents the request to confirm registration of a user.
     * @return Result of the ConfirmSignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyFailedAttemptsException
     *         This exception gets thrown when the user has made too many failed
     *         attempts for a given action (e.g., sign in).
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what
     *         the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account
     *         with an email or phone number that has already been supplied as
     *         an alias from a different account. This exception tells user that
     *         an account with this email or phone already exists.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ConfirmSignUp
     */
    @Override
    public ConfirmSignUpResult confirmSignUp(
            ConfirmSignUpRequest confirmSignUpRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSignUpRequest> request = null;
        Response<ConfirmSignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmSignUpRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(confirmSignUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmSignUpResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ConfirmSignUpResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for
     * the pool.
     * </p>
     * 
     * @param createUserPoolRequest
     *        Represents the request to create a user pool.
     * @return Result of the CreateUserPool operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @sample AWSCognitoIdentityProvider.CreateUserPool
     */
    @Override
    public CreateUserPoolResult createUserPool(
            CreateUserPoolRequest createUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolRequest> request = null;
        Response<CreateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(createUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CreateUserPoolResultJsonUnmarshaller());
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
     * @return Result of the CreateUserPoolClient operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.CreateUserPoolClient
     */
    @Override
    public CreateUserPoolClientResult createUserPoolClient(
            CreateUserPoolClientRequest createUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolClientRequest> request = null;
        Response<CreateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolClientRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(createUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserPoolClientResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CreateUserPoolClientResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUser
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteUserResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     * @return Result of the DeleteUserAttributes operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserAttributes
     */
    @Override
    public DeleteUserAttributesResult deleteUserAttributes(
            DeleteUserAttributesRequest deleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAttributesRequest> request = null;
        Response<DeleteUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAttributesRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteUserAttributesResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPool
     */
    @Override
    public DeleteUserPoolResult deleteUserPool(
            DeleteUserPoolRequest deleteUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolRequest> request = null;
        Response<DeleteUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(deleteUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteUserPoolResultJsonUnmarshaller());
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
     * @return Result of the DeleteUserPoolClient operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DeleteUserPoolClient
     */
    @Override
    public DeleteUserPoolClientResult deleteUserPoolClient(
            DeleteUserPoolClientRequest deleteUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolClientRequest> request = null;
        Response<DeleteUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolClientRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserPoolClientResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteUserPoolClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user
     * pool.
     * </p>
     * 
     * @param describeUserPoolRequest
     *        Represents the request to describe the user pool.
     * @return Result of the DescribeUserPool operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPool
     */
    @Override
    public DescribeUserPoolResult describeUserPool(
            DescribeUserPoolRequest describeUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolRequest> request = null;
        Response<DescribeUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(describeUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DescribeUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Client method for returning the configuration information and metadata of
     * the specified user pool client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @return Result of the DescribeUserPoolClient operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.DescribeUserPoolClient
     */
    @Override
    public DescribeUserPoolClientResult describeUserPoolClient(
            DescribeUserPoolClientRequest describeUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolClientRequest> request = null;
        Response<DescribeUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolClientRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(describeUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserPoolClientResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DescribeUserPoolClientResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ForgotPassword
     */
    @Override
    public ForgotPasswordResult forgotPassword(
            ForgotPasswordRequest forgotPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(forgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgotPasswordRequest> request = null;
        Response<ForgotPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgotPasswordRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(forgotPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ForgotPasswordResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ForgotPasswordResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.GetUser
     */
    @Override
    public GetUserResult getUser(GetUserRequest getUserRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new GetUserResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute
     * name.
     * </p>
     * 
     * @param getUserAttributeVerificationCodeRequest
     *        Represents the request to get user attribute verification.
     * @return Result of the GetUserAttributeVerificationCode operation returned
     *         by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.GetUserAttributeVerificationCode
     */
    @Override
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserAttributeVerificationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAttributeVerificationCodeRequest> request = null;
        Response<GetUserAttributeVerificationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAttributeVerificationCodeRequestMarshaller(
                        protocolFactory)
                        .marshall(super
                                .beforeMarshalling(getUserAttributeVerificationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserAttributeVerificationCodeResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            new GetUserAttributeVerificationCodeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     * @return Result of the ListUserPoolClients operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPoolClients
     */
    @Override
    public ListUserPoolClientsResult listUserPoolClients(
            ListUserPoolClientsRequest listUserPoolClientsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolClientsRequest> request = null;
        Response<ListUserPoolClientsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolClientsRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(listUserPoolClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserPoolClientsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListUserPoolClientsResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ListUserPools
     */
    @Override
    public ListUserPoolsResult listUserPools(
            ListUserPoolsRequest listUserPoolsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolsRequest> request = null;
        Response<ListUserPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolsRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(listUserPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserPoolsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListUserPoolsResultJsonUnmarshaller());
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
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ListUsers
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific
     * user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @return Result of the ResendConfirmationCode operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws LimitExceededException
     *         This exception is thrown when a user exceeds the limit for a
     *         requested AWS resource.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.ResendConfirmationCode
     */
    @Override
    public ResendConfirmationCodeResult resendConfirmationCode(
            ResendConfirmationCodeRequest resendConfirmationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(resendConfirmationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendConfirmationCodeRequest> request = null;
        Response<ResendConfirmationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendConfirmationCodeRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(resendConfirmationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResendConfirmationCodeResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ResendConfirmationCodeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA is
     * to be removed for a particular attribute pass the attribute with code
     * delivery as null. If null list is passed, all MFA options are removed.
     * </p>
     * 
     * @param setUserSettingsRequest
     *        Represents the request to set user settings.
     * @return Result of the SetUserSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @sample AWSCognitoIdentityProvider.SetUserSettings
     */
    @Override
    public SetUserSettingsResult setUserSettings(
            SetUserSettingsRequest setUserSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(setUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserSettingsRequest> request = null;
        Response<SetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserSettingsRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(setUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetUserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new SetUserSettingsResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name,
     * password, and user attributes.
     * </p>
     * 
     * @param signUpRequest
     *        Represents the request to register a user.
     * @return Result of the SignUp operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws InvalidPasswordException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid password.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws UsernameExistsException
     *         This exception is thrown when Amazon Cognito encounters a user
     *         name that already exists in the user pool.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.SignUp
     */
    @Override
    public SignUpResult signUp(SignUpRequest signUpRequest) {
        ExecutionContext executionContext = createExecutionContext(signUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignUpRequest> request = null;
        Response<SignUpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignUpRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(signUpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SignUpResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new SignUpResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     * @return Result of the UpdateUserAttributes operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what
     *         the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws UnexpectedLambdaException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters an unexpected exception with the AWS Lambda service.
     * @throws UserLambdaValidationException
     *         This exception gets thrown when the Amazon Cognito service
     *         encounters a user validation exception with the AWS Lambda
     *         service.
     * @throws InvalidLambdaResponseException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid AWS Lambda response.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws AliasExistsException
     *         This exception is thrown when a user tries to confirm the account
     *         with an email or phone number that has already been supplied as
     *         an alias from a different account. This exception tells user that
     *         an account with this email or phone already exists.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserAttributes
     */
    @Override
    public UpdateUserAttributesResult updateUserAttributes(
            UpdateUserAttributesRequest updateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAttributesRequest> request = null;
        Response<UpdateUserAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAttributesRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(updateUserAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new UpdateUserAttributesResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

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
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws ConcurrentModificationException
     *         This exception is thrown if two or more modifications are
     *         happening concurrently.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPool
     */
    @Override
    public UpdateUserPoolResult updateUserPool(
            UpdateUserPoolRequest updateUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolRequest> request = null;
        Response<UpdateUserPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(updateUserPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new UpdateUserPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the developer to update the specified user pool client and
     * password policy.
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return Result of the UpdateUserPoolClient operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.UpdateUserPoolClient
     */
    @Override
    public UpdateUserPoolClientResult updateUserPoolClient(
            UpdateUserPoolClientRequest updateUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolClientRequest> request = null;
        Response<UpdateUserPoolClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolClientRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(updateUserPoolClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPoolClientResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new UpdateUserPoolClientResultJsonUnmarshaller());
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
     * @return Result of the VerifyUserAttribute operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the Amazon Cognito service cannot
     *         find the requested resource.
     * @throws InvalidParameterException
     *         This exception is thrown when the Amazon Cognito service
     *         encounters an invalid parameter.
     * @throws CodeMismatchException
     *         This exception is thrown if the provided code does not match what
     *         the server was expecting.
     * @throws ExpiredCodeException
     *         This exception is thrown if a code has expired.
     * @throws NotAuthorizedException
     *         This exception gets thrown when a user is not authorized.
     * @throws TooManyRequestsException
     *         This exception gets thrown when the user has made too many
     *         requests for a given operation.
     * @throws InternalErrorException
     *         This exception is thrown when Amazon Cognito encounters an
     *         internal error.
     * @sample AWSCognitoIdentityProvider.VerifyUserAttribute
     */
    @Override
    public VerifyUserAttributeResult verifyUserAttribute(
            VerifyUserAttributeRequest verifyUserAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyUserAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyUserAttributeRequest> request = null;
        Response<VerifyUserAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyUserAttributeRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(verifyUserAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifyUserAttributeResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new VerifyUserAttributeResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler,
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils
                .getCredentialsProvider(request.getOriginalRequest(),
                        awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any
     * credentials set on the client or request will be ignored for this
     * operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack
     * thereof) have been configured in the ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
