/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless;

import javax.annotation.Generated;

import com.amazonaws.services.emrserverless.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing EMR Serverless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EMR Serverless is a new deployment option for Amazon EMR. EMR Serverless provides a serverless runtime
 * environment that simplifies running analytics applications using the latest open source frameworks such as Apache
 * Spark and Apache Hive. With EMR Serverless, you don’t have to configure, optimize, secure, or operate clusters to run
 * applications with these frameworks.
 * </p>
 * <p>
 * The API reference to Amazon EMR Serverless is <code>emr-serverless</code>. The <code>emr-serverless</code> prefix is
 * used in the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR Serverless. For example,
 * <code>aws emr-serverless start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR Serverless. For example,
 * <code>"Action": ["emr-serverless:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR Serverless</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR Serverless service endpoints. For example,
 * <code>emr-serverless.us-east-2.amazonaws.com</code>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEMRServerlessAsyncClient extends AWSEMRServerlessClient implements AWSEMRServerlessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSEMRServerlessAsyncClientBuilder asyncBuilder() {
        return AWSEMRServerlessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EMR Serverless using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSEMRServerlessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EMR Serverless using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSEMRServerlessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request) {

        return cancelJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(final CancelJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler) {
        final CancelJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelJobRunResult>() {
            @Override
            public CancelJobRunResult call() throws Exception {
                CancelJobRunResult result = null;

                try {
                    result = executeCancelJobRun(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
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
    public java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(GetDashboardForJobRunRequest request) {

        return getDashboardForJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(final GetDashboardForJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDashboardForJobRunRequest, GetDashboardForJobRunResult> asyncHandler) {
        final GetDashboardForJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDashboardForJobRunResult>() {
            @Override
            public GetDashboardForJobRunResult call() throws Exception {
                GetDashboardForJobRunResult result = null;

                try {
                    result = executeGetDashboardForJobRun(finalRequest);
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
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest request) {

        return getJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(final GetJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRunRequest, GetJobRunResult> asyncHandler) {
        final GetJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobRunResult>() {
            @Override
            public GetJobRunResult call() throws Exception {
                GetJobRunResult result = null;

                try {
                    result = executeGetJobRun(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request) {

        return listJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(final ListJobRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler) {
        final ListJobRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobRunsResult>() {
            @Override
            public ListJobRunsResult call() throws Exception {
                ListJobRunsResult result = null;

                try {
                    result = executeListJobRuns(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest request) {

        return startApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(final StartApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler) {
        final StartApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartApplicationResult>() {
            @Override
            public StartApplicationResult call() throws Exception {
                StartApplicationResult result = null;

                try {
                    result = executeStartApplication(finalRequest);
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
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(final StartJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {
        final StartJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobRunResult>() {
            @Override
            public StartJobRunResult call() throws Exception {
                StartJobRunResult result = null;

                try {
                    result = executeStartJobRun(finalRequest);
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
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest request) {

        return stopApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(final StopApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler) {
        final StopApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopApplicationResult>() {
            @Override
            public StopApplicationResult call() throws Exception {
                StopApplicationResult result = null;

                try {
                    result = executeStopApplication(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
