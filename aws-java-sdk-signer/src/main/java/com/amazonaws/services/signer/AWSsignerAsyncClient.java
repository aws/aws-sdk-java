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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing signer asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * You can use Code Signing for Amazon FreeRTOS (AWS Signer) to sign code that you created for any of the IoT devices
 * that Amazon Web Services supports. AWS Signer is integrated with Amazon FreeRTOS, AWS Certificate Manager, and AWS
 * CloudTrail. Amazon FreeRTOS customers can use AWS Signer to sign code images before making them available for
 * microcontrollers. You can use ACM to import third-party certificates to be used by AWS Signer. For general
 * information about using AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">Code Signing for Amazon FreeRTOS
 * Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSsignerAsyncClient extends AWSsignerClient implements AWSsignerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSsignerAsyncClientBuilder asyncBuilder() {
        return AWSsignerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on signer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSsignerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest request) {

        return cancelSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(final CancelSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSigningProfileRequest, CancelSigningProfileResult> asyncHandler) {
        final CancelSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSigningProfileResult>() {
            @Override
            public CancelSigningProfileResult call() throws Exception {
                CancelSigningProfileResult result = null;

                try {
                    result = executeCancelSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest request) {

        return describeSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(final DescribeSigningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSigningJobRequest, DescribeSigningJobResult> asyncHandler) {
        final DescribeSigningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSigningJobResult>() {
            @Override
            public DescribeSigningJobResult call() throws Exception {
                DescribeSigningJobResult result = null;

                try {
                    result = executeDescribeSigningJob(finalRequest);
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
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest request) {

        return getSigningPlatformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(final GetSigningPlatformRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSigningPlatformRequest, GetSigningPlatformResult> asyncHandler) {
        final GetSigningPlatformRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSigningPlatformResult>() {
            @Override
            public GetSigningPlatformResult call() throws Exception {
                GetSigningPlatformResult result = null;

                try {
                    result = executeGetSigningPlatform(finalRequest);
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
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest request) {

        return getSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(final GetSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSigningProfileRequest, GetSigningProfileResult> asyncHandler) {
        final GetSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSigningProfileResult>() {
            @Override
            public GetSigningProfileResult call() throws Exception {
                GetSigningProfileResult result = null;

                try {
                    result = executeGetSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest request) {

        return listSigningJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(final ListSigningJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningJobsRequest, ListSigningJobsResult> asyncHandler) {
        final ListSigningJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningJobsResult>() {
            @Override
            public ListSigningJobsResult call() throws Exception {
                ListSigningJobsResult result = null;

                try {
                    result = executeListSigningJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest request) {

        return listSigningPlatformsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(final ListSigningPlatformsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningPlatformsRequest, ListSigningPlatformsResult> asyncHandler) {
        final ListSigningPlatformsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningPlatformsResult>() {
            @Override
            public ListSigningPlatformsResult call() throws Exception {
                ListSigningPlatformsResult result = null;

                try {
                    result = executeListSigningPlatforms(finalRequest);
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
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest request) {

        return listSigningProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(final ListSigningProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningProfilesRequest, ListSigningProfilesResult> asyncHandler) {
        final ListSigningProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSigningProfilesResult>() {
            @Override
            public ListSigningProfilesResult call() throws Exception {
                ListSigningProfilesResult result = null;

                try {
                    result = executeListSigningProfiles(finalRequest);
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
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest request) {

        return putSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(final PutSigningProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSigningProfileRequest, PutSigningProfileResult> asyncHandler) {
        final PutSigningProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSigningProfileResult>() {
            @Override
            public PutSigningProfileResult call() throws Exception {
                PutSigningProfileResult result = null;

                try {
                    result = executePutSigningProfile(finalRequest);
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
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest request) {

        return startSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(final StartSigningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSigningJobRequest, StartSigningJobResult> asyncHandler) {
        final StartSigningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSigningJobResult>() {
            @Override
            public StartSigningJobResult call() throws Exception {
                StartSigningJobResult result = null;

                try {
                    result = executeStartSigningJob(finalRequest);
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
