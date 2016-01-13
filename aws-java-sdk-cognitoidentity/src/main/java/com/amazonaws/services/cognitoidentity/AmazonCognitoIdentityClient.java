/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity;

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
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.services.cognitoidentity.model.transform.*;

/**
 * Client for accessing Amazon Cognito Identity. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Cognito</fullname>
 * <p>
 * Amazon Cognito is a web service that delivers scoped temporary credentials to
 * mobile devices and other untrusted environments. Amazon Cognito uniquely
 * identifies a device and supplies the user with a consistent identity over the
 * lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito, you can enable authentication with one or more
 * third-party identity providers (Facebook, Google, or Login with Amazon), and
 * you can also choose to support unauthenticated access from your app. Cognito
 * delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary,
 * limited-privilege AWS credentials.
 * </p>
 * <p>
 * To provide end-user credentials, first make an unsigned call to <a>GetId</a>.
 * If the end user is authenticated with one of the supported identity
 * providers, set the <code>Logins</code> map with the identity provider token.
 * <code>GetId</code> returns a unique identifier for the user.
 * </p>
 * <p>
 * Next, make an unsigned call to <a>GetCredentialsForIdentity</a>. This call
 * expects the same <code>Logins</code> map as the <code>GetId</code> call, as
 * well as the <code>IdentityID</code> originally returned by <code>GetId</code>
 * . Assuming your identity pool has been configured via the
 * <a>SetIdentityPoolRoles</a> operation, <code>GetCredentialsForIdentity</code>
 * will return AWS credentials for your use. If your pool has not been
 * configured with <code>SetIdentityPoolRoles</code>, or if you want to follow
 * legacy flow, make an unsigned call to <a>GetOpenIdToken</a>, which returns
 * the OpenID token necessary to call STS and retrieve AWS credentials. This
 * call expects the same <code>Logins</code> map as the <code>GetId</code> call,
 * as well as the <code>IdentityID</code> originally returned by
 * <code>GetId</code>. The token returned by <code>GetOpenIdToken</code> can be
 * passed to the STS operation <a href=
 * "http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithWebIdentity.html"
 * >AssumeRoleWithWebIdentity</a> to retrieve AWS credentials.
 * </p>
 * <p>
 * If you want to use Amazon Cognito in an Android, iOS, or Unity application,
 * you will probably want to make API calls via the AWS Mobile SDK. To learn
 * more, see the <a href="http://docs.aws.amazon.com/mobile/index.html">AWS
 * Mobile SDK Developer Guide</a>.
 * </p>
 */
public class AmazonCognitoIdentityClient extends AmazonWebServiceClient
        implements AmazonCognitoIdentity {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonCognitoIdentity.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-identity";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "cognito-identity";

    /**
     * List of exception unmarshallers for all Amazon Cognito Identity
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AmazonCognitoIdentityClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *        connects to Amazon Cognito Identity (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCognitoIdentityClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity using the specified AWS account credentials and client
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
     *        connects to Amazon Cognito Identity (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonCognitoIdentityClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity using the specified AWS account credentials provider and client
     * configuration options.
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
     *        connects to Amazon Cognito Identity (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonCognitoIdentityClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito
     * Identity using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
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
     *        connects to Amazon Cognito Identity (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonCognitoIdentityClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.ConcurrentModificationException.class,
                        "ConcurrentModificationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.NotAuthorizedException.class,
                        "NotAuthorizedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.InvalidIdentityPoolConfigurationException.class,
                        "InvalidIdentityPoolConfigurationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.ResourceConflictException.class,
                        "ResourceConflictException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.ExternalServiceException.class,
                        "ExternalServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.InvalidParameterException.class,
                        "InvalidParameterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException.class,
                        "DeveloperUserAlreadyRegisteredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.TooManyRequestsException.class,
                        "TooManyRequestsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cognitoidentity.model.InternalErrorException.class,
                        "InternalErrorException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://cognito-identity.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cognitoidentity/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account. The limit on
     * identity pools is 60 per account. The keys for
     * <code>SupportedLoginProviders</code> are as follows:
     * <ul>
     * <li>Facebook: <code>graph.facebook.com</code></li>
     * <li>Google: <code>accounts.google.com</code></li>
     * <li>Amazon: <code>www.amazon.com</code></li>
     * <li>Twitter: <code>api.twitter.com</code></li>
     * <li>Digits: <code>www.digits.com</code></li>
     * </ul>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param createIdentityPoolRequest
     *        Input to the CreateIdentityPool action.
     * @return Result of the CreateIdentityPool operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset
     *         limit.
     * @sample AmazonCognitoIdentity.CreateIdentityPool
     */
    @Override
    public CreateIdentityPoolResult createIdentityPool(
            CreateIdentityPoolRequest createIdentityPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(createIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentityPoolRequest> request = null;
        Response<CreateIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentityPoolRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateIdentityPoolResult> responseHandler = new JsonResponseHandler<CreateIdentityPoolResult>(
                    new CreateIdentityPoolResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes identities from an identity pool. You can specify a list of 1-60
     * identities that you want to delete.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentitiesRequest
     *        Input to the <code>DeleteIdentities</code> action.
     * @return Result of the DeleteIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.DeleteIdentities
     */
    @Override
    public DeleteIdentitiesResult deleteIdentities(
            DeleteIdentitiesRequest deleteIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentitiesRequest> request = null;
        Response<DeleteIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentitiesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteIdentitiesResult> responseHandler = new JsonResponseHandler<DeleteIdentitiesResult>(
                    new DeleteIdentitiesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user pool. Once a pool is deleted, users will not be able to
     * authenticate with the pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentityPoolRequest
     *        Input to the DeleteIdentityPool action.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.DeleteIdentityPool
     */
    @Override
    public void deleteIdentityPool(
            DeleteIdentityPoolRequest deleteIdentityPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPoolRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPoolRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata related to the given identity, including when the
     * identity was created and any associated linked logins.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityRequest
     *        Input to the <code>DescribeIdentity</code> action.
     * @return Result of the DescribeIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.DescribeIdentity
     */
    @Override
    public DescribeIdentityResult describeIdentity(
            DescribeIdentityRequest describeIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityRequest> request = null;
        Response<DescribeIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeIdentityResult> responseHandler = new JsonResponseHandler<DescribeIdentityResult>(
                    new DescribeIdentityResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a particular identity pool, including the pool name,
     * ID description, creation date, and current number of users.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityPoolRequest
     *        Input to the DescribeIdentityPool action.
     * @return Result of the DescribeIdentityPool operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.DescribeIdentityPool
     */
    @Override
    public DescribeIdentityPoolResult describeIdentityPool(
            DescribeIdentityPoolRequest describeIdentityPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolRequest> request = null;
        Response<DescribeIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeIdentityPoolResult> responseHandler = new JsonResponseHandler<DescribeIdentityPoolResult>(
                    new DescribeIdentityPoolResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns credentials for the provided identity ID. Any provided logins
     * will be validated against supported login providers. If the token is for
     * cognito-identity.amazonaws.com, it will be passed through to AWS Security
     * Token Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest
     *        Input to the <code>GetCredentialsForIdentity</code> action.
     * @return Result of the GetCredentialsForIdentity operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InvalidIdentityPoolConfigurationException
     *         Thrown if the identity pool has no role associated for the given
     *         auth type (auth/unauth) or if the AssumeRole fails.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or
     *         Twitter is not responding
     * @sample AmazonCognitoIdentity.GetCredentialsForIdentity
     */
    @Override
    public GetCredentialsForIdentityResult getCredentialsForIdentity(
            GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(getCredentialsForIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialsForIdentityRequest> request = null;
        Response<GetCredentialsForIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialsForIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getCredentialsForIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetCredentialsForIdentityResult> responseHandler = new JsonResponseHandler<GetCredentialsForIdentityResult>(
                    new GetCredentialsForIdentityResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
     * create an implicit linked account.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getIdRequest
     *        Input to the GetId action.
     * @return Result of the GetId operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset
     *         limit.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or
     *         Twitter is not responding
     * @sample AmazonCognitoIdentity.GetId
     */
    @Override
    public GetIdResult getId(GetIdRequest getIdRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdRequest> request = null;
        Response<GetIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdRequestMarshaller().marshall(super
                        .beforeMarshalling(getIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetIdResult> responseHandler = new JsonResponseHandler<GetIdResult>(
                    new GetIdResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the roles for an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getIdentityPoolRolesRequest
     *        Input to the <code>GetIdentityPoolRoles</code> action.
     * @return Result of the GetIdentityPoolRoles operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.GetIdentityPoolRoles
     */
    @Override
    public GetIdentityPoolRolesResult getIdentityPoolRoles(
            GetIdentityPoolRolesRequest getIdentityPoolRolesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolRolesRequest> request = null;
        Response<GetIdentityPoolRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolRolesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIdentityPoolRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetIdentityPoolRolesResult> responseHandler = new JsonResponseHandler<GetIdentityPoolRolesResult>(
                    new GetIdentityPoolRolesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is
     * returned by <a>GetId</a>. You can optionally add additional logins for
     * the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 15 minutes.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenRequest
     *        Input to the GetOpenIdToken action.
     * @return Result of the GetOpenIdToken operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or
     *         Twitter is not responding
     * @sample AmazonCognitoIdentity.GetOpenIdToken
     */
    @Override
    public GetOpenIdTokenResult getOpenIdToken(
            GetOpenIdTokenRequest getOpenIdTokenRequest) {
        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenRequest> request = null;
        Response<GetOpenIdTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenRequestMarshaller().marshall(super
                        .beforeMarshalling(getOpenIdTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetOpenIdTokenResult> responseHandler = new JsonResponseHandler<GetOpenIdTokenResult>(
                    new GetOpenIdTokenResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID
     * Connect token for a user authenticated by your backend authentication
     * process. Supplying multiple logins will create an implicit linked
     * account. You can only specify one developer provider as part of the
     * <code>Logins</code> map, which is linked to the identity pool. The
     * developer provider is the "domain" by which Cognito will refer to your
     * users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a
     * new identity and to link new logins (that is, user credentials issued by
     * a public provider or developer provider) to an existing identity. When
     * you want to create a new identity, the <code>IdentityId</code> should be
     * null. When you want to associate a new login with an existing
     * authenticated/unauthenticated identity, you can do so by providing the
     * existing <code>IdentityId</code>. This API will create the identity in
     * the specified <code>IdentityPoolId</code>.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenForDeveloperIdentityRequest
     *        Input to the <code>GetOpenIdTokenForDeveloperIdentity</code>
     *        action.
     * @return Result of the GetOpenIdTokenForDeveloperIdentity operation
     *         returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws DeveloperUserAlreadyRegisteredException
     *         The provided developer user identifier is already registered with
     *         Cognito under a different identity ID.
     * @sample AmazonCognitoIdentity.GetOpenIdTokenForDeveloperIdentity
     */
    @Override
    public GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenForDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenForDeveloperIdentityRequest> request = null;
        Response<GetOpenIdTokenForDeveloperIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenForDeveloperIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getOpenIdTokenForDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetOpenIdTokenForDeveloperIdentityResult> responseHandler = new JsonResponseHandler<GetOpenIdTokenForDeveloperIdentityResult>(
                    new GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the identities in a pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Input to the ListIdentities action.
     * @return Result of the ListIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.ListIdentities
     */
    @Override
    public ListIdentitiesResult listIdentities(
            ListIdentitiesRequest listIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestMarshaller().marshall(super
                        .beforeMarshalling(listIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListIdentitiesResult> responseHandler = new JsonResponseHandler<ListIdentitiesResult>(
                    new ListIdentitiesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentityPoolsRequest
     *        Input to the ListIdentityPools action.
     * @return Result of the ListIdentityPools operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.ListIdentityPools
     */
    @Override
    public ListIdentityPoolsResult listIdentityPools(
            ListIdentityPoolsRequest listIdentityPoolsRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolsRequest> request = null;
        Response<ListIdentityPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listIdentityPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListIdentityPoolsResult> responseHandler = new JsonResponseHandler<ListIdentityPoolsResult>(
                    new ListIdentityPoolsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>IdentityID</code> associated with a
     * <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code>s associated with an
     * <code>IdentityId</code> for an existing identity. Either
     * <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not
     * be null. If you supply only one of these values, the other value will be
     * searched in the database and returned as a part of the response. If you
     * supply both, <code>DeveloperUserIdentifier</code> will be matched against
     * <code>IdentityID</code>. If the values are verified against the database,
     * the response returns both values and is the same as the request.
     * Otherwise a <code>ResourceConflictException</code> is thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param lookupDeveloperIdentityRequest
     *        Input to the <code>LookupDeveloperIdentityInput</code> action.
     * @return Result of the LookupDeveloperIdentity operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.LookupDeveloperIdentity
     */
    @Override
    public LookupDeveloperIdentityResult lookupDeveloperIdentity(
            LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(lookupDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupDeveloperIdentityRequest> request = null;
        Response<LookupDeveloperIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupDeveloperIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(lookupDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<LookupDeveloperIdentityResult> responseHandler = new JsonResponseHandler<LookupDeveloperIdentityResult>(
                    new LookupDeveloperIdentityResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two users having different <code>IdentityId</code>s, existing in
     * the same identity pool, and identified by the same developer provider.
     * You can use this action to request that discrete users be merged and
     * identified as a single user in the Cognito environment. Cognito
     * associates the given source user (<code>SourceUserIdentifier</code>) with
     * the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>
     * . Only developer-authenticated users can be merged. If the users to be
     * merged are associated with the same public provider, but as two different
     * users, an exception will be thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param mergeDeveloperIdentitiesRequest
     *        Input to the <code>MergeDeveloperIdentities</code> action.
     * @return Result of the MergeDeveloperIdentities operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.MergeDeveloperIdentities
     */
    @Override
    public MergeDeveloperIdentitiesResult mergeDeveloperIdentities(
            MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(mergeDeveloperIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeDeveloperIdentitiesRequest> request = null;
        Response<MergeDeveloperIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeDeveloperIdentitiesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(mergeDeveloperIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<MergeDeveloperIdentitiesResult> responseHandler = new JsonResponseHandler<MergeDeveloperIdentitiesResult>(
                    new MergeDeveloperIdentitiesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the roles for an identity pool. These roles are used when making
     * calls to <code>GetCredentialsForIdentity</code> action.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param setIdentityPoolRolesRequest
     *        Input to the <code>SetIdentityPoolRoles</code> action.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoIdentity.SetIdentityPoolRoles
     */
    @Override
    public void setIdentityPoolRoles(
            SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolRolesRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolRolesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setIdentityPoolRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity.
     * Unlinked developer users will be considered new identities next time they
     * are seen. If, for a given Cognito identity, you remove all federated
     * identities as well as the developer user identifier, the Cognito identity
     * becomes inaccessible.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param unlinkDeveloperIdentityRequest
     *        Input to the <code>UnlinkDeveloperIdentity</code> action.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @sample AmazonCognitoIdentity.UnlinkDeveloperIdentity
     */
    @Override
    public void unlinkDeveloperIdentity(
            UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(unlinkDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkDeveloperIdentityRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkDeveloperIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(unlinkDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked logins
     * will be considered new identities next time they are seen. Removing the
     * last linked login will make this identity inaccessible.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param unlinkIdentityRequest
     *        Input to the UnlinkIdentity action.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or
     *         Twitter is not responding
     * @sample AmazonCognitoIdentity.UnlinkIdentity
     */
    @Override
    public void unlinkIdentity(UnlinkIdentityRequest unlinkIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(unlinkIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkIdentityRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkIdentityRequestMarshaller().marshall(super
                        .beforeMarshalling(unlinkIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a user pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param updateIdentityPoolRequest
     *        An object representing a Cognito identity pool.
     * @return Result of the UpdateIdentityPool operation returned by the
     *         service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or
     *         record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested
     *         resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked
     *         to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the
     *         request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoIdentity.UpdateIdentityPool
     */
    @Override
    public UpdateIdentityPoolResult updateIdentityPool(
            UpdateIdentityPoolRequest updateIdentityPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(updateIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityPoolRequest> request = null;
        Response<UpdateIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityPoolRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateIdentityPoolResult> responseHandler = new JsonResponseHandler<UpdateIdentityPoolResult>(
                    new UpdateIdentityPoolResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
