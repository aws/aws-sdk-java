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
package com.amazonaws.services.rekognition;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Rekognition asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRekognitionAsyncClient extends AmazonRekognitionClient implements AmazonRekognitionAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Rekognition (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the provided AWS
     * account credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRekognitionAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRekognitionAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRekognitionAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonRekognitionAsyncClientBuilder asyncBuilder() {
        return AmazonRekognitionAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Rekognition using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRekognitionAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest request) {

        return compareFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(final CompareFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompareFacesRequest, CompareFacesResult> asyncHandler) {
        final CompareFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CompareFacesResult>() {
            @Override
            public CompareFacesResult call() throws Exception {
                CompareFacesResult result = null;

                try {
                    result = executeCompareFaces(finalRequest);
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
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest request) {

        return createCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(final CreateCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler) {
        final CreateCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCollectionResult>() {
            @Override
            public CreateCollectionResult call() throws Exception {
                CreateCollectionResult result = null;

                try {
                    result = executeCreateCollection(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(CreateStreamProcessorRequest request) {

        return createStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(final CreateStreamProcessorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamProcessorRequest, CreateStreamProcessorResult> asyncHandler) {
        final CreateStreamProcessorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamProcessorResult>() {
            @Override
            public CreateStreamProcessorResult call() throws Exception {
                CreateStreamProcessorResult result = null;

                try {
                    result = executeCreateStreamProcessor(finalRequest);
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
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest request) {

        return deleteCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(final DeleteCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler) {
        final DeleteCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCollectionResult>() {
            @Override
            public DeleteCollectionResult call() throws Exception {
                DeleteCollectionResult result = null;

                try {
                    result = executeDeleteCollection(finalRequest);
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
    public java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest request) {

        return deleteFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(final DeleteFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFacesRequest, DeleteFacesResult> asyncHandler) {
        final DeleteFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFacesResult>() {
            @Override
            public DeleteFacesResult call() throws Exception {
                DeleteFacesResult result = null;

                try {
                    result = executeDeleteFaces(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(DeleteStreamProcessorRequest request) {

        return deleteStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(final DeleteStreamProcessorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamProcessorRequest, DeleteStreamProcessorResult> asyncHandler) {
        final DeleteStreamProcessorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamProcessorResult>() {
            @Override
            public DeleteStreamProcessorResult call() throws Exception {
                DeleteStreamProcessorResult result = null;

                try {
                    result = executeDeleteStreamProcessor(finalRequest);
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
    public java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(DescribeCollectionRequest request) {

        return describeCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(final DescribeCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCollectionRequest, DescribeCollectionResult> asyncHandler) {
        final DescribeCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCollectionResult>() {
            @Override
            public DescribeCollectionResult call() throws Exception {
                DescribeCollectionResult result = null;

                try {
                    result = executeDescribeCollection(finalRequest);
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
    public java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(DescribeStreamProcessorRequest request) {

        return describeStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(final DescribeStreamProcessorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamProcessorRequest, DescribeStreamProcessorResult> asyncHandler) {
        final DescribeStreamProcessorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamProcessorResult>() {
            @Override
            public DescribeStreamProcessorResult call() throws Exception {
                DescribeStreamProcessorResult result = null;

                try {
                    result = executeDescribeStreamProcessor(finalRequest);
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
    public java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest request) {

        return detectFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(final DetectFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectFacesRequest, DetectFacesResult> asyncHandler) {
        final DetectFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectFacesResult>() {
            @Override
            public DetectFacesResult call() throws Exception {
                DetectFacesResult result = null;

                try {
                    result = executeDetectFaces(finalRequest);
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
    public java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest request) {

        return detectLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(final DetectLabelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectLabelsRequest, DetectLabelsResult> asyncHandler) {
        final DetectLabelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectLabelsResult>() {
            @Override
            public DetectLabelsResult call() throws Exception {
                DetectLabelsResult result = null;

                try {
                    result = executeDetectLabels(finalRequest);
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
    public java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest request) {

        return detectModerationLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(final DetectModerationLabelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectModerationLabelsRequest, DetectModerationLabelsResult> asyncHandler) {
        final DetectModerationLabelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectModerationLabelsResult>() {
            @Override
            public DetectModerationLabelsResult call() throws Exception {
                DetectModerationLabelsResult result = null;

                try {
                    result = executeDetectModerationLabels(finalRequest);
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
    public java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest request) {

        return detectTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectTextResult> detectTextAsync(final DetectTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectTextRequest, DetectTextResult> asyncHandler) {
        final DetectTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectTextResult>() {
            @Override
            public DetectTextResult call() throws Exception {
                DetectTextResult result = null;

                try {
                    result = executeDetectText(finalRequest);
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
    public java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest request) {

        return getCelebrityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(final GetCelebrityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCelebrityInfoRequest, GetCelebrityInfoResult> asyncHandler) {
        final GetCelebrityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCelebrityInfoResult>() {
            @Override
            public GetCelebrityInfoResult call() throws Exception {
                GetCelebrityInfoResult result = null;

                try {
                    result = executeGetCelebrityInfo(finalRequest);
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
    public java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(GetCelebrityRecognitionRequest request) {

        return getCelebrityRecognitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(final GetCelebrityRecognitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCelebrityRecognitionRequest, GetCelebrityRecognitionResult> asyncHandler) {
        final GetCelebrityRecognitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCelebrityRecognitionResult>() {
            @Override
            public GetCelebrityRecognitionResult call() throws Exception {
                GetCelebrityRecognitionResult result = null;

                try {
                    result = executeGetCelebrityRecognition(finalRequest);
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
    public java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(GetContentModerationRequest request) {

        return getContentModerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(final GetContentModerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContentModerationRequest, GetContentModerationResult> asyncHandler) {
        final GetContentModerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContentModerationResult>() {
            @Override
            public GetContentModerationResult call() throws Exception {
                GetContentModerationResult result = null;

                try {
                    result = executeGetContentModeration(finalRequest);
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
    public java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(GetFaceDetectionRequest request) {

        return getFaceDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(final GetFaceDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFaceDetectionRequest, GetFaceDetectionResult> asyncHandler) {
        final GetFaceDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFaceDetectionResult>() {
            @Override
            public GetFaceDetectionResult call() throws Exception {
                GetFaceDetectionResult result = null;

                try {
                    result = executeGetFaceDetection(finalRequest);
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
    public java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(GetFaceSearchRequest request) {

        return getFaceSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(final GetFaceSearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFaceSearchRequest, GetFaceSearchResult> asyncHandler) {
        final GetFaceSearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFaceSearchResult>() {
            @Override
            public GetFaceSearchResult call() throws Exception {
                GetFaceSearchResult result = null;

                try {
                    result = executeGetFaceSearch(finalRequest);
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
    public java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(GetLabelDetectionRequest request) {

        return getLabelDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(final GetLabelDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLabelDetectionRequest, GetLabelDetectionResult> asyncHandler) {
        final GetLabelDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLabelDetectionResult>() {
            @Override
            public GetLabelDetectionResult call() throws Exception {
                GetLabelDetectionResult result = null;

                try {
                    result = executeGetLabelDetection(finalRequest);
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
    public java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(GetPersonTrackingRequest request) {

        return getPersonTrackingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(final GetPersonTrackingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPersonTrackingRequest, GetPersonTrackingResult> asyncHandler) {
        final GetPersonTrackingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPersonTrackingResult>() {
            @Override
            public GetPersonTrackingResult call() throws Exception {
                GetPersonTrackingResult result = null;

                try {
                    result = executeGetPersonTracking(finalRequest);
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
    public java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest request) {

        return indexFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(final IndexFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<IndexFacesRequest, IndexFacesResult> asyncHandler) {
        final IndexFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IndexFacesResult>() {
            @Override
            public IndexFacesResult call() throws Exception {
                IndexFacesResult result = null;

                try {
                    result = executeIndexFaces(finalRequest);
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
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest request) {

        return listCollectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(final ListCollectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler) {
        final ListCollectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCollectionsResult>() {
            @Override
            public ListCollectionsResult call() throws Exception {
                ListCollectionsResult result = null;

                try {
                    result = executeListCollections(finalRequest);
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
    public java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest request) {

        return listFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacesResult> listFacesAsync(final ListFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFacesRequest, ListFacesResult> asyncHandler) {
        final ListFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFacesResult>() {
            @Override
            public ListFacesResult call() throws Exception {
                ListFacesResult result = null;

                try {
                    result = executeListFaces(finalRequest);
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
    public java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(ListStreamProcessorsRequest request) {

        return listStreamProcessorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(final ListStreamProcessorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamProcessorsRequest, ListStreamProcessorsResult> asyncHandler) {
        final ListStreamProcessorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamProcessorsResult>() {
            @Override
            public ListStreamProcessorsResult call() throws Exception {
                ListStreamProcessorsResult result = null;

                try {
                    result = executeListStreamProcessors(finalRequest);
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
    public java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest request) {

        return recognizeCelebritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(final RecognizeCelebritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RecognizeCelebritiesRequest, RecognizeCelebritiesResult> asyncHandler) {
        final RecognizeCelebritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RecognizeCelebritiesResult>() {
            @Override
            public RecognizeCelebritiesResult call() throws Exception {
                RecognizeCelebritiesResult result = null;

                try {
                    result = executeRecognizeCelebrities(finalRequest);
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
    public java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest request) {

        return searchFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(final SearchFacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchFacesRequest, SearchFacesResult> asyncHandler) {
        final SearchFacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchFacesResult>() {
            @Override
            public SearchFacesResult call() throws Exception {
                SearchFacesResult result = null;

                try {
                    result = executeSearchFaces(finalRequest);
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
    public java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest request) {

        return searchFacesByImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(final SearchFacesByImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchFacesByImageRequest, SearchFacesByImageResult> asyncHandler) {
        final SearchFacesByImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchFacesByImageResult>() {
            @Override
            public SearchFacesByImageResult call() throws Exception {
                SearchFacesByImageResult result = null;

                try {
                    result = executeSearchFacesByImage(finalRequest);
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
    public java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(StartCelebrityRecognitionRequest request) {

        return startCelebrityRecognitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(final StartCelebrityRecognitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCelebrityRecognitionRequest, StartCelebrityRecognitionResult> asyncHandler) {
        final StartCelebrityRecognitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCelebrityRecognitionResult>() {
            @Override
            public StartCelebrityRecognitionResult call() throws Exception {
                StartCelebrityRecognitionResult result = null;

                try {
                    result = executeStartCelebrityRecognition(finalRequest);
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
    public java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(StartContentModerationRequest request) {

        return startContentModerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(final StartContentModerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContentModerationRequest, StartContentModerationResult> asyncHandler) {
        final StartContentModerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContentModerationResult>() {
            @Override
            public StartContentModerationResult call() throws Exception {
                StartContentModerationResult result = null;

                try {
                    result = executeStartContentModeration(finalRequest);
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
    public java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(StartFaceDetectionRequest request) {

        return startFaceDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(final StartFaceDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFaceDetectionRequest, StartFaceDetectionResult> asyncHandler) {
        final StartFaceDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFaceDetectionResult>() {
            @Override
            public StartFaceDetectionResult call() throws Exception {
                StartFaceDetectionResult result = null;

                try {
                    result = executeStartFaceDetection(finalRequest);
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
    public java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(StartFaceSearchRequest request) {

        return startFaceSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(final StartFaceSearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFaceSearchRequest, StartFaceSearchResult> asyncHandler) {
        final StartFaceSearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFaceSearchResult>() {
            @Override
            public StartFaceSearchResult call() throws Exception {
                StartFaceSearchResult result = null;

                try {
                    result = executeStartFaceSearch(finalRequest);
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
    public java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(StartLabelDetectionRequest request) {

        return startLabelDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(final StartLabelDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartLabelDetectionRequest, StartLabelDetectionResult> asyncHandler) {
        final StartLabelDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartLabelDetectionResult>() {
            @Override
            public StartLabelDetectionResult call() throws Exception {
                StartLabelDetectionResult result = null;

                try {
                    result = executeStartLabelDetection(finalRequest);
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
    public java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(StartPersonTrackingRequest request) {

        return startPersonTrackingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(final StartPersonTrackingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPersonTrackingRequest, StartPersonTrackingResult> asyncHandler) {
        final StartPersonTrackingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPersonTrackingResult>() {
            @Override
            public StartPersonTrackingResult call() throws Exception {
                StartPersonTrackingResult result = null;

                try {
                    result = executeStartPersonTracking(finalRequest);
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
    public java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(StartStreamProcessorRequest request) {

        return startStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(final StartStreamProcessorRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStreamProcessorRequest, StartStreamProcessorResult> asyncHandler) {
        final StartStreamProcessorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartStreamProcessorResult>() {
            @Override
            public StartStreamProcessorResult call() throws Exception {
                StartStreamProcessorResult result = null;

                try {
                    result = executeStartStreamProcessor(finalRequest);
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
    public java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(StopStreamProcessorRequest request) {

        return stopStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(final StopStreamProcessorRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopStreamProcessorRequest, StopStreamProcessorResult> asyncHandler) {
        final StopStreamProcessorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopStreamProcessorResult>() {
            @Override
            public StopStreamProcessorResult call() throws Exception {
                StopStreamProcessorResult result = null;

                try {
                    result = executeStopStreamProcessor(finalRequest);
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
