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
package com.amazonaws.services.sns;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon SNS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled
 * applications. Applications can use Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this product see <a
 * href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. For detailed information about Amazon SNS features
 * and their associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain
 * functionality that automatically takes care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available SDKs, go to <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSNSAsyncClient extends AmazonSNSClient implements AmazonSNSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSNSAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSNSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSNSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSNSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonSNSAsyncClientBuilder asyncBuilder() {
        return AmazonSNSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SNS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSNSAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(final AddPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {
        final AddPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddPermissionResult>() {
            @Override
            public AddPermissionResult call() throws Exception {
                AddPermissionResult result = null;

                try {
                    result = executeAddPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames) {

        return addPermissionAsync(new AddPermissionRequest().withTopicArn(topicArn).withLabel(label).withAWSAccountIds(aWSAccountIds)
                .withActionNames(actionNames));
    }

    /**
     * Simplified method form for invoking the AddPermission operation with an AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames, com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        return addPermissionAsync(
                new AddPermissionRequest().withTopicArn(topicArn).withLabel(label).withAWSAccountIds(aWSAccountIds).withActionNames(actionNames), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(CheckIfPhoneNumberIsOptedOutRequest request) {

        return checkIfPhoneNumberIsOptedOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(final CheckIfPhoneNumberIsOptedOutRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckIfPhoneNumberIsOptedOutRequest, CheckIfPhoneNumberIsOptedOutResult> asyncHandler) {
        final CheckIfPhoneNumberIsOptedOutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckIfPhoneNumberIsOptedOutResult>() {
            @Override
            public CheckIfPhoneNumberIsOptedOutResult call() throws Exception {
                CheckIfPhoneNumberIsOptedOutResult result = null;

                try {
                    result = executeCheckIfPhoneNumberIsOptedOut(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(ConfirmSubscriptionRequest request) {

        return confirmSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(final ConfirmSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {
        final ConfirmSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmSubscriptionResult>() {
            @Override
            public ConfirmSubscriptionResult call() throws Exception {
                ConfirmSubscriptionResult result = null;

                try {
                    result = executeConfirmSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(
                new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token).withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(CreatePlatformApplicationRequest request) {

        return createPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(final CreatePlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler) {
        final CreatePlatformApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlatformApplicationResult>() {
            @Override
            public CreatePlatformApplicationResult call() throws Exception {
                CreatePlatformApplicationResult result = null;

                try {
                    result = executeCreatePlatformApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(CreatePlatformEndpointRequest request) {

        return createPlatformEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(final CreatePlatformEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler) {
        final CreatePlatformEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlatformEndpointResult>() {
            @Override
            public CreatePlatformEndpointResult call() throws Exception {
                CreatePlatformEndpointResult result = null;

                try {
                    result = executeCreatePlatformEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest request) {

        return createTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(final CreateTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {
        final CreateTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTopicResult>() {
            @Override
            public CreateTopicResult call() throws Exception {
                CreateTopicResult result = null;

                try {
                    result = executeCreateTopic(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the CreateTopic operation.
     *
     * @see #createTopicAsync(CreateTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name) {

        return createTopicAsync(new CreateTopicRequest().withName(name));
    }

    /**
     * Simplified method form for invoking the CreateTopic operation with an AsyncHandler.
     *
     * @see #createTopicAsync(CreateTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {

        return createTopicAsync(new CreateTopicRequest().withName(name), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(DeletePlatformApplicationRequest request) {

        return deletePlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(final DeletePlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlatformApplicationRequest, DeletePlatformApplicationResult> asyncHandler) {
        final DeletePlatformApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlatformApplicationResult>() {
            @Override
            public DeletePlatformApplicationResult call() throws Exception {
                DeletePlatformApplicationResult result = null;

                try {
                    result = executeDeletePlatformApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest request) {

        return deleteTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(final DeleteTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler) {
        final DeleteTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTopicResult>() {
            @Override
            public DeleteTopicResult call() throws Exception {
                DeleteTopicResult result = null;

                try {
                    result = executeDeleteTopic(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DeleteTopic operation.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn) {

        return deleteTopicAsync(new DeleteTopicRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the DeleteTopic operation with an AsyncHandler.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler) {

        return deleteTopicAsync(new DeleteTopicRequest().withTopicArn(topicArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(GetEndpointAttributesRequest request) {

        return getEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(final GetEndpointAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler) {
        final GetEndpointAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEndpointAttributesResult>() {
            @Override
            public GetEndpointAttributesResult call() throws Exception {
                GetEndpointAttributesResult result = null;

                try {
                    result = executeGetEndpointAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest request) {

        return getPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            final GetPlatformApplicationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler) {
        final GetPlatformApplicationAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlatformApplicationAttributesResult>() {
            @Override
            public GetPlatformApplicationAttributesResult call() throws Exception {
                GetPlatformApplicationAttributesResult result = null;

                try {
                    result = executeGetPlatformApplicationAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(GetSMSAttributesRequest request) {

        return getSMSAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(final GetSMSAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSMSAttributesRequest, GetSMSAttributesResult> asyncHandler) {
        final GetSMSAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSMSAttributesResult>() {
            @Override
            public GetSMSAttributesResult call() throws Exception {
                GetSMSAttributesResult result = null;

                try {
                    result = executeGetSMSAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest request) {

        return getSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(final GetSubscriptionAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {
        final GetSubscriptionAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionAttributesResult>() {
            @Override
            public GetSubscriptionAttributesResult call() throws Exception {
                GetSubscriptionAttributesResult result = null;

                try {
                    result = executeGetSubscriptionAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn) {

        return getSubscriptionAttributesAsync(new GetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {

        return getSubscriptionAttributesAsync(new GetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(GetTopicAttributesRequest request) {

        return getTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(final GetTopicAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {
        final GetTopicAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTopicAttributesResult>() {
            @Override
            public GetTopicAttributesResult call() throws Exception {
                GetTopicAttributesResult result = null;

                try {
                    result = executeGetTopicAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetTopicAttributes operation.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn) {

        return getTopicAttributesAsync(new GetTopicAttributesRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the GetTopicAttributes operation with an AsyncHandler.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {

        return getTopicAttributesAsync(new GetTopicAttributesRequest().withTopicArn(topicArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest request) {

        return listEndpointsByPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            final ListEndpointsByPlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler) {
        final ListEndpointsByPlatformApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointsByPlatformApplicationResult>() {
            @Override
            public ListEndpointsByPlatformApplicationResult call() throws Exception {
                ListEndpointsByPlatformApplicationResult result = null;

                try {
                    result = executeListEndpointsByPlatformApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(ListPhoneNumbersOptedOutRequest request) {

        return listPhoneNumbersOptedOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(final ListPhoneNumbersOptedOutRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersOptedOutRequest, ListPhoneNumbersOptedOutResult> asyncHandler) {
        final ListPhoneNumbersOptedOutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersOptedOutResult>() {
            @Override
            public ListPhoneNumbersOptedOutResult call() throws Exception {
                ListPhoneNumbersOptedOutResult result = null;

                try {
                    result = executeListPhoneNumbersOptedOut(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(ListPlatformApplicationsRequest request) {

        return listPlatformApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(final ListPlatformApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {
        final ListPlatformApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlatformApplicationsResult>() {
            @Override
            public ListPlatformApplicationsResult call() throws Exception {
                ListPlatformApplicationsResult result = null;

                try {
                    result = executeListPlatformApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListPlatformApplications operation.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync() {

        return listPlatformApplicationsAsync(new ListPlatformApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListPlatformApplications operation with an AsyncHandler.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {

        return listPlatformApplicationsAsync(new ListPlatformApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest request) {

        return listSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(final ListSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {
        final ListSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionsResult>() {
            @Override
            public ListSubscriptionsResult call() throws Exception {
                ListSubscriptionsResult result = null;

                try {
                    result = executeListSubscriptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync() {

        return listSubscriptionsAsync(new ListSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest().withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest().withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest request) {

        return listSubscriptionsByTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(final ListSubscriptionsByTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {
        final ListSubscriptionsByTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionsByTopicResult>() {
            @Override
            public ListSubscriptionsByTopicResult call() throws Exception {
                ListSubscriptionsByTopicResult result = null;

                try {
                    result = executeListSubscriptionsByTopic(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn).withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn).withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest request) {

        return listTopicsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(final ListTopicsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {
        final ListTopicsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTopicsResult>() {
            @Override
            public ListTopicsResult call() throws Exception {
                ListTopicsResult result = null;

                try {
                    result = executeListTopics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync() {

        return listTopicsAsync(new ListTopicsRequest());
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(new ListTopicsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken) {

        return listTopicsAsync(new ListTopicsRequest().withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(new ListTopicsRequest().withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(OptInPhoneNumberRequest request) {

        return optInPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(final OptInPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<OptInPhoneNumberRequest, OptInPhoneNumberResult> asyncHandler) {
        final OptInPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<OptInPhoneNumberResult>() {
            @Override
            public OptInPhoneNumberResult call() throws Exception {
                OptInPhoneNumberResult result = null;

                try {
                    result = executeOptInPhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest request) {

        return publishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(final PublishRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {
        final PublishRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishResult>() {
            @Override
            public PublishResult call() throws Exception {
                PublishResult result = null;

                try {
                    result = executePublish(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message));
    }

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message).withSubject(subject));
    }

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message).withSubject(subject), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {
        final RemovePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemovePermissionResult>() {
            @Override
            public RemovePermissionResult call() throws Exception {
                RemovePermissionResult result = null;

                try {
                    result = executeRemovePermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label) {

        return removePermissionAsync(new RemovePermissionRequest().withTopicArn(topicArn).withLabel(label));
    }

    /**
     * Simplified method form for invoking the RemovePermission operation with an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        return removePermissionAsync(new RemovePermissionRequest().withTopicArn(topicArn).withLabel(label), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(SetEndpointAttributesRequest request) {

        return setEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(final SetEndpointAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetEndpointAttributesRequest, SetEndpointAttributesResult> asyncHandler) {
        final SetEndpointAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetEndpointAttributesResult>() {
            @Override
            public SetEndpointAttributesResult call() throws Exception {
                SetEndpointAttributesResult result = null;

                try {
                    result = executeSetEndpointAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest request) {

        return setPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            final SetPlatformApplicationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetPlatformApplicationAttributesRequest, SetPlatformApplicationAttributesResult> asyncHandler) {
        final SetPlatformApplicationAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetPlatformApplicationAttributesResult>() {
            @Override
            public SetPlatformApplicationAttributesResult call() throws Exception {
                SetPlatformApplicationAttributesResult result = null;

                try {
                    result = executeSetPlatformApplicationAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(SetSMSAttributesRequest request) {

        return setSMSAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(final SetSMSAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSMSAttributesRequest, SetSMSAttributesResult> asyncHandler) {
        final SetSMSAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetSMSAttributesResult>() {
            @Override
            public SetSMSAttributesResult call() throws Exception {
                SetSMSAttributesResult result = null;

                try {
                    result = executeSetSMSAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest request) {

        return setSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(final SetSubscriptionAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler) {
        final SetSubscriptionAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetSubscriptionAttributesResult>() {
            @Override
            public SetSubscriptionAttributesResult call() throws Exception {
                SetSubscriptionAttributesResult result = null;

                try {
                    result = executeSetSubscriptionAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue) {

        return setSubscriptionAttributesAsync(new SetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue, com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler) {

        return setSubscriptionAttributesAsync(new SetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(SetTopicAttributesRequest request) {

        return setTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(final SetTopicAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler) {
        final SetTopicAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTopicAttributesResult>() {
            @Override
            public SetTopicAttributesResult call() throws Exception {
                SetTopicAttributesResult result = null;

                try {
                    result = executeSetTopicAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the SetTopicAttributes operation.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue) {

        return setTopicAttributesAsync(new SetTopicAttributesRequest().withTopicArn(topicArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetTopicAttributes operation with an AsyncHandler.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler) {

        return setTopicAttributesAsync(
                new SetTopicAttributesRequest().withTopicArn(topicArn).withAttributeName(attributeName).withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest request) {

        return subscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(final SubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {
        final SubscribeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubscribeResult>() {
            @Override
            public SubscribeResult call() throws Exception {
                SubscribeResult result = null;

                try {
                    result = executeSubscribe(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the Subscribe operation.
     *
     * @see #subscribeAsync(SubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn).withProtocol(protocol).withEndpoint(endpoint));
    }

    /**
     * Simplified method form for invoking the Subscribe operation with an AsyncHandler.
     *
     * @see #subscribeAsync(SubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn).withProtocol(protocol).withEndpoint(endpoint), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request) {

        return unsubscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(final UnsubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {
        final UnsubscribeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnsubscribeResult>() {
            @Override
            public UnsubscribeResult call() throws Exception {
                UnsubscribeResult result = null;

                try {
                    result = executeUnsubscribe(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the Unsubscribe operation.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn) {

        return unsubscribeAsync(new UnsubscribeRequest().withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the Unsubscribe operation with an AsyncHandler.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {

        return unsubscribeAsync(new UnsubscribeRequest().withSubscriptionArn(subscriptionArn), asyncHandler);
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
