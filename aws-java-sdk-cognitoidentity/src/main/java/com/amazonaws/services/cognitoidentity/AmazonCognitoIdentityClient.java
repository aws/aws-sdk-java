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
package com.amazonaws.services.cognitoidentity;

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

import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.services.cognitoidentity.model.transform.*;

/**
 * Client for accessing Amazon Cognito Identity. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>Amazon Cognito Federated Identities</fullname>
 * <p>
 * Amazon Cognito Federated Identities is a web service that delivers scoped temporary credentials to mobile devices and
 * other untrusted environments. It uniquely identifies a device and supplies the user with a consistent identity over
 * the lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito Federated Identities, you can enable authentication with one or more third-party identity
 * providers (Facebook, Google, or Login with Amazon) or an Amazon Cognito user pool, and you can also choose to support
 * unauthenticated access from your app. Cognito delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary, limited-privilege AWS credentials.
 * </p>
 * <p>
 * For a description of the authentication flow from the Amazon Cognito Developer Guide see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html">Authentication Flow</a>.
 * </p>
 * <p>
 * For more information see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html">Amazon Cognito Federated
 * Identities</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCognitoIdentityClient extends AmazonWebServiceClient implements AmazonCognitoIdentity {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCognitoIdentity.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-identity";

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
                                    com.amazonaws.services.cognitoidentity.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeveloperUserAlreadyRegisteredException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.ResourceConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExternalServiceException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.ExternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidIdentityPoolConfigurationException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.InvalidIdentityPoolConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.cognitoidentity.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cognitoidentity.model.AmazonCognitoIdentityException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCognitoIdentityClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCognitoIdentityClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCognitoIdentityClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoIdentityClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCognitoIdentityClientBuilder builder() {
        return AmazonCognitoIdentityClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCognitoIdentityClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Identity using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCognitoIdentityClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://cognito-identity.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cognitoidentity/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cognitoidentity/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your
     * AWS account. The limit on identity pools is 60 per account. The keys for <code>SupportedLoginProviders</code> are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param createIdentityPoolRequest
     *        Input to the CreateIdentityPool action.
     * @return Result of the CreateIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @sample AmazonCognitoIdentity.CreateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/CreateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIdentityPoolResult createIdentityPool(CreateIdentityPoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdentityPool(request);
    }

    @SdkInternalApi
    final CreateIdentityPoolResult executeCreateIdentityPool(CreateIdentityPoolRequest createIdentityPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentityPoolRequest> request = null;
        Response<CreateIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentityPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdentityPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdentityPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIdentityPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete.
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
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DeleteIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdentitiesResult deleteIdentities(DeleteIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentities(request);
    }

    @SdkInternalApi
    final DeleteIdentitiesResult executeDeleteIdentities(DeleteIdentitiesRequest deleteIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentitiesRequest> request = null;
        Response<DeleteIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentityPoolRequest
     *        Input to the DeleteIdentityPool action.
     * @return Result of the DeleteIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DeleteIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdentityPoolResult deleteIdentityPool(DeleteIdentityPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentityPool(request);
    }

    @SdkInternalApi
    final DeleteIdentityPoolResult executeDeleteIdentityPool(DeleteIdentityPoolRequest deleteIdentityPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPoolRequest> request = null;
        Response<DeleteIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentityPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdentityPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIdentityPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata related to the given identity, including when the identity was created and any associated linked
     * logins.
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
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DescribeIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityResult describeIdentity(DescribeIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentity(request);
    }

    @SdkInternalApi
    final DescribeIdentityResult executeDescribeIdentity(DescribeIdentityRequest describeIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityRequest> request = null;
        Response<DescribeIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and
     * current number of users.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityPoolRequest
     *        Input to the DescribeIdentityPool action.
     * @return Result of the DescribeIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.DescribeIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityPoolResult describeIdentityPool(DescribeIdentityPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentityPool(request);
    }

    @SdkInternalApi
    final DescribeIdentityPoolResult executeDescribeIdentityPool(DescribeIdentityPoolRequest describeIdentityPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolRequest> request = null;
        Response<DescribeIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentityPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIdentityPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login
     * providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token
     * Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest
     *        Input to the <code>GetCredentialsForIdentity</code> action.
     * @return Result of the GetCredentialsForIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InvalidIdentityPoolConfigurationException
     *         Thrown if the identity pool has no role associated for the given auth type (auth/unauth) or if the
     *         AssumeRole fails.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetCredentialsForIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetCredentialsForIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCredentialsForIdentityResult getCredentialsForIdentity(GetCredentialsForIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeGetCredentialsForIdentity(request);
    }

    @SdkInternalApi
    final GetCredentialsForIdentityResult executeGetCredentialsForIdentity(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(getCredentialsForIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialsForIdentityRequest> request = null;
        Response<GetCredentialsForIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialsForIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCredentialsForIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCredentialsForIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCredentialsForIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCredentialsForIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account.
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
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetId" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIdResult getId(GetIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetId(request);
    }

    @SdkInternalApi
    final GetIdResult executeGetId(GetIdRequest getIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdRequest> request = null;
        Response<GetIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdResultJsonUnmarshaller());
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
     * @return Result of the GetIdentityPoolRoles operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.GetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityPoolRolesResult getIdentityPoolRoles(GetIdentityPoolRolesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityPoolRoles(request);
    }

    @SdkInternalApi
    final GetIdentityPoolRolesResult executeGetIdentityPoolRoles(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolRolesRequest> request = null;
        Response<GetIdentityPoolRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolRolesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdentityPoolRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityPoolRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdentityPoolRolesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdentityPoolRolesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by <a>GetId</a>. You can
     * optionally add additional logins for the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 10 minutes.
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
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.GetOpenIdToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOpenIdTokenResult getOpenIdToken(GetOpenIdTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetOpenIdToken(request);
    }

    @SdkInternalApi
    final GetOpenIdTokenResult executeGetOpenIdToken(GetOpenIdTokenRequest getOpenIdTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenRequest> request = null;
        Response<GetOpenIdTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOpenIdTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOpenIdToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOpenIdTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOpenIdTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID Connect token for a user authenticated
     * by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can
     * only specify one developer provider as part of the <code>Logins</code> map, which is linked to the identity pool.
     * The developer provider is the "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a new identity and to link new logins (that
     * is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to
     * create a new identity, the <code>IdentityId</code> should be null. When you want to associate a new login with an
     * existing authenticated/unauthenticated identity, you can do so by providing the existing <code>IdentityId</code>.
     * This API will create the identity in the specified <code>IdentityPoolId</code>.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenForDeveloperIdentityRequest
     *        Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
     * @return Result of the GetOpenIdTokenForDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws DeveloperUserAlreadyRegisteredException
     *         The provided developer user identifier is already registered with Cognito under a different identity ID.
     * @sample AmazonCognitoIdentity.GetOpenIdTokenForDeveloperIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdTokenForDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeGetOpenIdTokenForDeveloperIdentity(request);
    }

    @SdkInternalApi
    final GetOpenIdTokenForDeveloperIdentityResult executeGetOpenIdTokenForDeveloperIdentity(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenForDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenForDeveloperIdentityRequest> request = null;
        Response<GetOpenIdTokenForDeveloperIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenForDeveloperIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOpenIdTokenForDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOpenIdTokenForDeveloperIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOpenIdTokenForDeveloperIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the identities in an identity pool.
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
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentities(request);
    }

    @SdkInternalApi
    final ListIdentitiesResult executeListIdentities(ListIdentitiesRequest listIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIdentitiesResultJsonUnmarshaller());
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
     * @return Result of the ListIdentityPools operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListIdentityPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentityPools"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdentityPoolsResult listIdentityPools(ListIdentityPoolsRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentityPools(request);
    }

    @SdkInternalApi
    final ListIdentityPoolsResult executeListIdentityPools(ListIdentityPoolsRequest listIdentityPoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentityPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolsRequest> request = null;
        Response<ListIdentityPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentityPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentityPools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentityPoolsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIdentityPoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito identity pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
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
     * Retrieves the <code>IdentityID</code> associated with a <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> values associated with an <code>IdentityId</code> for an existing identity.
     * Either <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not be null. If you supply only one
     * of these values, the other value will be searched in the database and returned as a part of the response. If you
     * supply both, <code>DeveloperUserIdentifier</code> will be matched against <code>IdentityID</code>. If the values
     * are verified against the database, the response returns both values and is the same as the request. Otherwise a
     * <code>ResourceConflictException</code> is thrown.
     * </p>
     * <p>
     * <code>LookupDeveloperIdentity</code> is intended for low-throughput control plane operations: for example, to
     * enable customer service to locate an identity ID by username. If you are using it for higher-volume operations
     * such as user authentication, your requests are likely to be throttled. <a>GetOpenIdTokenForDeveloperIdentity</a>
     * is a better option for higher-volume operations for user authentication.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param lookupDeveloperIdentityRequest
     *        Input to the <code>LookupDeveloperIdentityInput</code> action.
     * @return Result of the LookupDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.LookupDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public LookupDeveloperIdentityResult lookupDeveloperIdentity(LookupDeveloperIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeLookupDeveloperIdentity(request);
    }

    @SdkInternalApi
    final LookupDeveloperIdentityResult executeLookupDeveloperIdentity(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(lookupDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupDeveloperIdentityRequest> request = null;
        Response<LookupDeveloperIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupDeveloperIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(lookupDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LookupDeveloperIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LookupDeveloperIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new LookupDeveloperIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two users having different <code>IdentityId</code>s, existing in the same identity pool, and identified by
     * the same developer provider. You can use this action to request that discrete users be merged and identified as a
     * single user in the Cognito environment. Cognito associates the given source user (
     * <code>SourceUserIdentifier</code>) with the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>
     * . Only developer-authenticated users can be merged. If the users to be merged are associated with the same public
     * provider, but as two different users, an exception will be thrown.
     * </p>
     * <p>
     * The number of linked logins is limited to 20. So, the number of linked logins for the source user,
     * <code>SourceUserIdentifier</code>, and the destination user, <code>DestinationUserIdentifier</code>, together
     * should not be larger than 20. Otherwise, an exception will be thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param mergeDeveloperIdentitiesRequest
     *        Input to the <code>MergeDeveloperIdentities</code> action.
     * @return Result of the MergeDeveloperIdentities operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.MergeDeveloperIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MergeDeveloperIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergeDeveloperIdentitiesResult mergeDeveloperIdentities(MergeDeveloperIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeMergeDeveloperIdentities(request);
    }

    @SdkInternalApi
    final MergeDeveloperIdentitiesResult executeMergeDeveloperIdentities(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(mergeDeveloperIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeDeveloperIdentitiesRequest> request = null;
        Response<MergeDeveloperIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeDeveloperIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergeDeveloperIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergeDeveloperIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergeDeveloperIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergeDeveloperIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the roles for an identity pool. These roles are used when making calls to <a>GetCredentialsForIdentity</a>
     * action.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param setIdentityPoolRolesRequest
     *        Input to the <code>SetIdentityPoolRoles</code> action.
     * @return Result of the SetIdentityPoolRoles operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoIdentity.SetIdentityPoolRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetIdentityPoolRoles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityPoolRolesResult setIdentityPoolRoles(SetIdentityPoolRolesRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityPoolRoles(request);
    }

    @SdkInternalApi
    final SetIdentityPoolRolesResult executeSetIdentityPoolRoles(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolRolesRequest> request = null;
        Response<SetIdentityPoolRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolRolesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setIdentityPoolRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityPoolRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetIdentityPoolRolesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetIdentityPoolRolesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and
     * manage identity pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of an identity pool, one for testing and another for production,
     * you might assign an <code>Environment</code> tag key to both identity pools. The value of this key might be
     * <code>Test</code> for one identity pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM
     * policy, you can constrain permissions for identity pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
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
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity. Unlinked developer users will be
     * considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated
     * identities as well as the developer user identifier, the Cognito identity becomes inaccessible.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param unlinkDeveloperIdentityRequest
     *        Input to the <code>UnlinkDeveloperIdentity</code> action.
     * @return Result of the UnlinkDeveloperIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.UnlinkDeveloperIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkDeveloperIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UnlinkDeveloperIdentityResult unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeUnlinkDeveloperIdentity(request);
    }

    @SdkInternalApi
    final UnlinkDeveloperIdentityResult executeUnlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(unlinkDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkDeveloperIdentityRequest> request = null;
        Response<UnlinkDeveloperIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkDeveloperIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(unlinkDeveloperIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnlinkDeveloperIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnlinkDeveloperIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UnlinkDeveloperIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next
     * time they are seen. Removing the last linked login will make this identity inaccessible.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param unlinkIdentityRequest
     *        Input to the UnlinkIdentity action.
     * @return Result of the UnlinkIdentity operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ExternalServiceException
     *         An exception thrown when a dependent service such as Facebook or Twitter is not responding
     * @sample AmazonCognitoIdentity.UnlinkIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UnlinkIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UnlinkIdentityResult unlinkIdentity(UnlinkIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeUnlinkIdentity(request);
    }

    @SdkInternalApi
    final UnlinkIdentityResult executeUnlinkIdentity(UnlinkIdentityRequest unlinkIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(unlinkIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkIdentityRequest> request = null;
        Response<UnlinkIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkIdentityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unlinkIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnlinkIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnlinkIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnlinkIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per
     * second, per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @sample AmazonCognitoIdentity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
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
     * Updates an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param updateIdentityPoolRequest
     *        An object representing an Amazon Cognito identity pool.
     * @return Result of the UpdateIdentityPool operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown for missing or bad input parameter(s).
     * @throws ResourceNotFoundException
     *         Thrown when the requested resource (for example, a dataset or record) does not exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceConflictException
     *         Thrown when a user tries to use a login which is already linked to another account.
     * @throws TooManyRequestsException
     *         Thrown when a request is throttled.
     * @throws InternalErrorException
     *         Thrown when the service encounters an error during processing the request.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @throws LimitExceededException
     *         Thrown when the total number of user pools has exceeded a preset limit.
     * @sample AmazonCognitoIdentity.UpdateIdentityPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/UpdateIdentityPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdentityPoolResult updateIdentityPool(UpdateIdentityPoolRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentityPool(request);
    }

    @SdkInternalApi
    final UpdateIdentityPoolResult executeUpdateIdentityPool(UpdateIdentityPoolRequest updateIdentityPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityPoolRequest> request = null;
        Response<UpdateIdentityPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIdentityPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentityPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentityPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIdentityPoolResultJsonUnmarshaller());
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
