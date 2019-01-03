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
package com.amazonaws.services.kinesisanalyticsv2;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kinesis Analytics V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Documentation for Kinesis Data Analytics API v2
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisAnalyticsV2AsyncClient extends AmazonKinesisAnalyticsV2Client implements AmazonKinesisAnalyticsV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKinesisAnalyticsV2AsyncClientBuilder asyncBuilder() {
        return AmazonKinesisAnalyticsV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics V2 using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            AddApplicationCloudWatchLoggingOptionRequest request) {

        return addApplicationCloudWatchLoggingOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            final AddApplicationCloudWatchLoggingOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationCloudWatchLoggingOptionRequest, AddApplicationCloudWatchLoggingOptionResult> asyncHandler) {
        final AddApplicationCloudWatchLoggingOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationCloudWatchLoggingOptionResult>() {
            @Override
            public AddApplicationCloudWatchLoggingOptionResult call() throws Exception {
                AddApplicationCloudWatchLoggingOptionResult result = null;

                try {
                    result = executeAddApplicationCloudWatchLoggingOption(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(AddApplicationInputRequest request) {

        return addApplicationInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(final AddApplicationInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationInputRequest, AddApplicationInputResult> asyncHandler) {
        final AddApplicationInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationInputResult>() {
            @Override
            public AddApplicationInputResult call() throws Exception {
                AddApplicationInputResult result = null;

                try {
                    result = executeAddApplicationInput(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            AddApplicationInputProcessingConfigurationRequest request) {

        return addApplicationInputProcessingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            final AddApplicationInputProcessingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationInputProcessingConfigurationRequest, AddApplicationInputProcessingConfigurationResult> asyncHandler) {
        final AddApplicationInputProcessingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationInputProcessingConfigurationResult>() {
            @Override
            public AddApplicationInputProcessingConfigurationResult call() throws Exception {
                AddApplicationInputProcessingConfigurationResult result = null;

                try {
                    result = executeAddApplicationInputProcessingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(AddApplicationOutputRequest request) {

        return addApplicationOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(final AddApplicationOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationOutputRequest, AddApplicationOutputResult> asyncHandler) {
        final AddApplicationOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationOutputResult>() {
            @Override
            public AddApplicationOutputResult call() throws Exception {
                AddApplicationOutputResult result = null;

                try {
                    result = executeAddApplicationOutput(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest request) {

        return addApplicationReferenceDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            final AddApplicationReferenceDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationReferenceDataSourceRequest, AddApplicationReferenceDataSourceResult> asyncHandler) {
        final AddApplicationReferenceDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationReferenceDataSourceResult>() {
            @Override
            public AddApplicationReferenceDataSourceResult call() throws Exception {
                AddApplicationReferenceDataSourceResult result = null;

                try {
                    result = executeAddApplicationReferenceDataSource(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationSnapshotResult> createApplicationSnapshotAsync(CreateApplicationSnapshotRequest request) {

        return createApplicationSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationSnapshotResult> createApplicationSnapshotAsync(final CreateApplicationSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationSnapshotRequest, CreateApplicationSnapshotResult> asyncHandler) {
        final CreateApplicationSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationSnapshotResult>() {
            @Override
            public CreateApplicationSnapshotResult call() throws Exception {
                CreateApplicationSnapshotResult result = null;

                try {
                    result = executeCreateApplicationSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            DeleteApplicationCloudWatchLoggingOptionRequest request) {

        return deleteApplicationCloudWatchLoggingOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            final DeleteApplicationCloudWatchLoggingOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationCloudWatchLoggingOptionRequest, DeleteApplicationCloudWatchLoggingOptionResult> asyncHandler) {
        final DeleteApplicationCloudWatchLoggingOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationCloudWatchLoggingOptionResult>() {
            @Override
            public DeleteApplicationCloudWatchLoggingOptionResult call() throws Exception {
                DeleteApplicationCloudWatchLoggingOptionResult result = null;

                try {
                    result = executeDeleteApplicationCloudWatchLoggingOption(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            DeleteApplicationInputProcessingConfigurationRequest request) {

        return deleteApplicationInputProcessingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            final DeleteApplicationInputProcessingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationInputProcessingConfigurationRequest, DeleteApplicationInputProcessingConfigurationResult> asyncHandler) {
        final DeleteApplicationInputProcessingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationInputProcessingConfigurationResult>() {
            @Override
            public DeleteApplicationInputProcessingConfigurationResult call() throws Exception {
                DeleteApplicationInputProcessingConfigurationResult result = null;

                try {
                    result = executeDeleteApplicationInputProcessingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(DeleteApplicationOutputRequest request) {

        return deleteApplicationOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(final DeleteApplicationOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationOutputRequest, DeleteApplicationOutputResult> asyncHandler) {
        final DeleteApplicationOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationOutputResult>() {
            @Override
            public DeleteApplicationOutputResult call() throws Exception {
                DeleteApplicationOutputResult result = null;

                try {
                    result = executeDeleteApplicationOutput(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest request) {

        return deleteApplicationReferenceDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            final DeleteApplicationReferenceDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationReferenceDataSourceRequest, DeleteApplicationReferenceDataSourceResult> asyncHandler) {
        final DeleteApplicationReferenceDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationReferenceDataSourceResult>() {
            @Override
            public DeleteApplicationReferenceDataSourceResult call() throws Exception {
                DeleteApplicationReferenceDataSourceResult result = null;

                try {
                    result = executeDeleteApplicationReferenceDataSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationSnapshotResult> deleteApplicationSnapshotAsync(DeleteApplicationSnapshotRequest request) {

        return deleteApplicationSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationSnapshotResult> deleteApplicationSnapshotAsync(final DeleteApplicationSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationSnapshotRequest, DeleteApplicationSnapshotResult> asyncHandler) {
        final DeleteApplicationSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationSnapshotResult>() {
            @Override
            public DeleteApplicationSnapshotResult call() throws Exception {
                DeleteApplicationSnapshotResult result = null;

                try {
                    result = executeDeleteApplicationSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(final DescribeApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {
        final DescribeApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationResult>() {
            @Override
            public DescribeApplicationResult call() throws Exception {
                DescribeApplicationResult result = null;

                try {
                    result = executeDescribeApplication(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationSnapshotResult> describeApplicationSnapshotAsync(DescribeApplicationSnapshotRequest request) {

        return describeApplicationSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationSnapshotResult> describeApplicationSnapshotAsync(final DescribeApplicationSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationSnapshotRequest, DescribeApplicationSnapshotResult> asyncHandler) {
        final DescribeApplicationSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationSnapshotResult>() {
            @Override
            public DescribeApplicationSnapshotResult call() throws Exception {
                DescribeApplicationSnapshotResult result = null;

                try {
                    result = executeDescribeApplicationSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(DiscoverInputSchemaRequest request) {

        return discoverInputSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(final DiscoverInputSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DiscoverInputSchemaRequest, DiscoverInputSchemaResult> asyncHandler) {
        final DiscoverInputSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DiscoverInputSchemaResult>() {
            @Override
            public DiscoverInputSchemaResult call() throws Exception {
                DiscoverInputSchemaResult result = null;

                try {
                    result = executeDiscoverInputSchema(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationSnapshotsResult> listApplicationSnapshotsAsync(ListApplicationSnapshotsRequest request) {

        return listApplicationSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationSnapshotsResult> listApplicationSnapshotsAsync(final ListApplicationSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationSnapshotsRequest, ListApplicationSnapshotsResult> asyncHandler) {
        final ListApplicationSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationSnapshotsResult>() {
            @Override
            public ListApplicationSnapshotsResult call() throws Exception {
                ListApplicationSnapshotsResult result = null;

                try {
                    result = executeListApplicationSnapshots(finalRequest);
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
