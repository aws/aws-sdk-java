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
package com.amazonaws.services.polly;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Polly asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
 * Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
 * for your application domain.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPollyAsyncClient extends AmazonPollyClient implements AmazonPollyAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly. A credentials provider chain will
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
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonPollyAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPollyAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the provided AWS account
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
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPollyAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPollyAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPollyAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonPollyAsyncClientBuilder asyncBuilder() {
        return AmazonPollyAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Polly using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPollyAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(DeleteLexiconRequest request) {

        return deleteLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(final DeleteLexiconRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLexiconRequest, DeleteLexiconResult> asyncHandler) {
        final DeleteLexiconRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLexiconResult>() {
            @Override
            public DeleteLexiconResult call() throws Exception {
                DeleteLexiconResult result = null;

                try {
                    result = executeDeleteLexicon(finalRequest);
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
    public java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(DescribeVoicesRequest request) {

        return describeVoicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(final DescribeVoicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVoicesRequest, DescribeVoicesResult> asyncHandler) {
        final DescribeVoicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVoicesResult>() {
            @Override
            public DescribeVoicesResult call() throws Exception {
                DescribeVoicesResult result = null;

                try {
                    result = executeDescribeVoices(finalRequest);
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
    public java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest request) {

        return getLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(final GetLexiconRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLexiconRequest, GetLexiconResult> asyncHandler) {
        final GetLexiconRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLexiconResult>() {
            @Override
            public GetLexiconResult call() throws Exception {
                GetLexiconResult result = null;

                try {
                    result = executeGetLexicon(finalRequest);
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
    public java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(GetSpeechSynthesisTaskRequest request) {

        return getSpeechSynthesisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(final GetSpeechSynthesisTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSpeechSynthesisTaskRequest, GetSpeechSynthesisTaskResult> asyncHandler) {
        final GetSpeechSynthesisTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSpeechSynthesisTaskResult>() {
            @Override
            public GetSpeechSynthesisTaskResult call() throws Exception {
                GetSpeechSynthesisTaskResult result = null;

                try {
                    result = executeGetSpeechSynthesisTask(finalRequest);
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
    public java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest request) {

        return listLexiconsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(final ListLexiconsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLexiconsRequest, ListLexiconsResult> asyncHandler) {
        final ListLexiconsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLexiconsResult>() {
            @Override
            public ListLexiconsResult call() throws Exception {
                ListLexiconsResult result = null;

                try {
                    result = executeListLexicons(finalRequest);
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
    public java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(ListSpeechSynthesisTasksRequest request) {

        return listSpeechSynthesisTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(final ListSpeechSynthesisTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSpeechSynthesisTasksRequest, ListSpeechSynthesisTasksResult> asyncHandler) {
        final ListSpeechSynthesisTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSpeechSynthesisTasksResult>() {
            @Override
            public ListSpeechSynthesisTasksResult call() throws Exception {
                ListSpeechSynthesisTasksResult result = null;

                try {
                    result = executeListSpeechSynthesisTasks(finalRequest);
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
    public java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest request) {

        return putLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(final PutLexiconRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLexiconRequest, PutLexiconResult> asyncHandler) {
        final PutLexiconRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLexiconResult>() {
            @Override
            public PutLexiconResult call() throws Exception {
                PutLexiconResult result = null;

                try {
                    result = executePutLexicon(finalRequest);
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
    public java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(StartSpeechSynthesisTaskRequest request) {

        return startSpeechSynthesisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(final StartSpeechSynthesisTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSpeechSynthesisTaskRequest, StartSpeechSynthesisTaskResult> asyncHandler) {
        final StartSpeechSynthesisTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSpeechSynthesisTaskResult>() {
            @Override
            public StartSpeechSynthesisTaskResult call() throws Exception {
                StartSpeechSynthesisTaskResult result = null;

                try {
                    result = executeStartSpeechSynthesisTask(finalRequest);
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
    public java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest request) {

        return synthesizeSpeechAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(final SynthesizeSpeechRequest request,
            final com.amazonaws.handlers.AsyncHandler<SynthesizeSpeechRequest, SynthesizeSpeechResult> asyncHandler) {
        final SynthesizeSpeechRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SynthesizeSpeechResult>() {
            @Override
            public SynthesizeSpeechResult call() throws Exception {
                SynthesizeSpeechResult result = null;

                try {
                    result = executeSynthesizeSpeech(finalRequest);
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
