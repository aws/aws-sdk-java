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
package com.amazonaws.services.migrationhubstrategyrecommendations;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Migration Hub Strategy Recommendations asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Migration Hub Strategy Recommendations</fullname>
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;This API reference provides descriptions, syntax, and other details about each of the actions and data types for Migration Hub Strategy Recommendations (Strategy Recommendations). The topic for each action shows the API request parameters and the response. Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or platform that you're using. For more information, see &lt;a href=&quot;http://aws.amazon.com/tools/#SDKs&quot;&gt;AWS SDKs&lt;/a&gt;.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubStrategyRecommendationsAsyncClient extends AWSMigrationHubStrategyRecommendationsClient implements
        AWSMigrationHubStrategyRecommendationsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMigrationHubStrategyRecommendationsAsyncClientBuilder asyncBuilder() {
        return AWSMigrationHubStrategyRecommendationsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Migration Hub Strategy Recommendations using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubStrategyRecommendationsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Migration Hub Strategy Recommendations using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMigrationHubStrategyRecommendationsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetApplicationComponentDetailsResult> getApplicationComponentDetailsAsync(GetApplicationComponentDetailsRequest request) {

        return getApplicationComponentDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationComponentDetailsResult> getApplicationComponentDetailsAsync(
            final GetApplicationComponentDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationComponentDetailsRequest, GetApplicationComponentDetailsResult> asyncHandler) {
        final GetApplicationComponentDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationComponentDetailsResult>() {
            @Override
            public GetApplicationComponentDetailsResult call() throws Exception {
                GetApplicationComponentDetailsResult result = null;

                try {
                    result = executeGetApplicationComponentDetails(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationComponentStrategiesResult> getApplicationComponentStrategiesAsync(
            GetApplicationComponentStrategiesRequest request) {

        return getApplicationComponentStrategiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationComponentStrategiesResult> getApplicationComponentStrategiesAsync(
            final GetApplicationComponentStrategiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationComponentStrategiesRequest, GetApplicationComponentStrategiesResult> asyncHandler) {
        final GetApplicationComponentStrategiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationComponentStrategiesResult>() {
            @Override
            public GetApplicationComponentStrategiesResult call() throws Exception {
                GetApplicationComponentStrategiesResult result = null;

                try {
                    result = executeGetApplicationComponentStrategies(finalRequest);
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
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest request) {

        return getAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(final GetAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentRequest, GetAssessmentResult> asyncHandler) {
        final GetAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssessmentResult>() {
            @Override
            public GetAssessmentResult call() throws Exception {
                GetAssessmentResult result = null;

                try {
                    result = executeGetAssessment(finalRequest);
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
    public java.util.concurrent.Future<GetImportFileTaskResult> getImportFileTaskAsync(GetImportFileTaskRequest request) {

        return getImportFileTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportFileTaskResult> getImportFileTaskAsync(final GetImportFileTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportFileTaskRequest, GetImportFileTaskResult> asyncHandler) {
        final GetImportFileTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportFileTaskResult>() {
            @Override
            public GetImportFileTaskResult call() throws Exception {
                GetImportFileTaskResult result = null;

                try {
                    result = executeGetImportFileTask(finalRequest);
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
    public java.util.concurrent.Future<GetLatestAssessmentIdResult> getLatestAssessmentIdAsync(GetLatestAssessmentIdRequest request) {

        return getLatestAssessmentIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLatestAssessmentIdResult> getLatestAssessmentIdAsync(final GetLatestAssessmentIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLatestAssessmentIdRequest, GetLatestAssessmentIdResult> asyncHandler) {
        final GetLatestAssessmentIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLatestAssessmentIdResult>() {
            @Override
            public GetLatestAssessmentIdResult call() throws Exception {
                GetLatestAssessmentIdResult result = null;

                try {
                    result = executeGetLatestAssessmentId(finalRequest);
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
    public java.util.concurrent.Future<GetPortfolioPreferencesResult> getPortfolioPreferencesAsync(GetPortfolioPreferencesRequest request) {

        return getPortfolioPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPortfolioPreferencesResult> getPortfolioPreferencesAsync(final GetPortfolioPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPortfolioPreferencesRequest, GetPortfolioPreferencesResult> asyncHandler) {
        final GetPortfolioPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPortfolioPreferencesResult>() {
            @Override
            public GetPortfolioPreferencesResult call() throws Exception {
                GetPortfolioPreferencesResult result = null;

                try {
                    result = executeGetPortfolioPreferences(finalRequest);
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
    public java.util.concurrent.Future<GetPortfolioSummaryResult> getPortfolioSummaryAsync(GetPortfolioSummaryRequest request) {

        return getPortfolioSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPortfolioSummaryResult> getPortfolioSummaryAsync(final GetPortfolioSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPortfolioSummaryRequest, GetPortfolioSummaryResult> asyncHandler) {
        final GetPortfolioSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPortfolioSummaryResult>() {
            @Override
            public GetPortfolioSummaryResult call() throws Exception {
                GetPortfolioSummaryResult result = null;

                try {
                    result = executeGetPortfolioSummary(finalRequest);
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
    public java.util.concurrent.Future<GetRecommendationReportDetailsResult> getRecommendationReportDetailsAsync(GetRecommendationReportDetailsRequest request) {

        return getRecommendationReportDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationReportDetailsResult> getRecommendationReportDetailsAsync(
            final GetRecommendationReportDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationReportDetailsRequest, GetRecommendationReportDetailsResult> asyncHandler) {
        final GetRecommendationReportDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationReportDetailsResult>() {
            @Override
            public GetRecommendationReportDetailsResult call() throws Exception {
                GetRecommendationReportDetailsResult result = null;

                try {
                    result = executeGetRecommendationReportDetails(finalRequest);
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
    public java.util.concurrent.Future<GetServerDetailsResult> getServerDetailsAsync(GetServerDetailsRequest request) {

        return getServerDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServerDetailsResult> getServerDetailsAsync(final GetServerDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServerDetailsRequest, GetServerDetailsResult> asyncHandler) {
        final GetServerDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServerDetailsResult>() {
            @Override
            public GetServerDetailsResult call() throws Exception {
                GetServerDetailsResult result = null;

                try {
                    result = executeGetServerDetails(finalRequest);
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
    public java.util.concurrent.Future<GetServerStrategiesResult> getServerStrategiesAsync(GetServerStrategiesRequest request) {

        return getServerStrategiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServerStrategiesResult> getServerStrategiesAsync(final GetServerStrategiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServerStrategiesRequest, GetServerStrategiesResult> asyncHandler) {
        final GetServerStrategiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServerStrategiesResult>() {
            @Override
            public GetServerStrategiesResult call() throws Exception {
                GetServerStrategiesResult result = null;

                try {
                    result = executeGetServerStrategies(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationComponentsResult> listApplicationComponentsAsync(ListApplicationComponentsRequest request) {

        return listApplicationComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationComponentsResult> listApplicationComponentsAsync(final ListApplicationComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationComponentsRequest, ListApplicationComponentsResult> asyncHandler) {
        final ListApplicationComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationComponentsResult>() {
            @Override
            public ListApplicationComponentsResult call() throws Exception {
                ListApplicationComponentsResult result = null;

                try {
                    result = executeListApplicationComponents(finalRequest);
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
    public java.util.concurrent.Future<ListCollectorsResult> listCollectorsAsync(ListCollectorsRequest request) {

        return listCollectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollectorsResult> listCollectorsAsync(final ListCollectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCollectorsRequest, ListCollectorsResult> asyncHandler) {
        final ListCollectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCollectorsResult>() {
            @Override
            public ListCollectorsResult call() throws Exception {
                ListCollectorsResult result = null;

                try {
                    result = executeListCollectors(finalRequest);
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
    public java.util.concurrent.Future<ListImportFileTaskResult> listImportFileTaskAsync(ListImportFileTaskRequest request) {

        return listImportFileTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportFileTaskResult> listImportFileTaskAsync(final ListImportFileTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImportFileTaskRequest, ListImportFileTaskResult> asyncHandler) {
        final ListImportFileTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImportFileTaskResult>() {
            @Override
            public ListImportFileTaskResult call() throws Exception {
                ListImportFileTaskResult result = null;

                try {
                    result = executeListImportFileTask(finalRequest);
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
    public java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest request) {

        return listServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServersResult> listServersAsync(final ListServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServersRequest, ListServersResult> asyncHandler) {
        final ListServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServersResult>() {
            @Override
            public ListServersResult call() throws Exception {
                ListServersResult result = null;

                try {
                    result = executeListServers(finalRequest);
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
    public java.util.concurrent.Future<PutPortfolioPreferencesResult> putPortfolioPreferencesAsync(PutPortfolioPreferencesRequest request) {

        return putPortfolioPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPortfolioPreferencesResult> putPortfolioPreferencesAsync(final PutPortfolioPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPortfolioPreferencesRequest, PutPortfolioPreferencesResult> asyncHandler) {
        final PutPortfolioPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPortfolioPreferencesResult>() {
            @Override
            public PutPortfolioPreferencesResult call() throws Exception {
                PutPortfolioPreferencesResult result = null;

                try {
                    result = executePutPortfolioPreferences(finalRequest);
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
    public java.util.concurrent.Future<StartAssessmentResult> startAssessmentAsync(StartAssessmentRequest request) {

        return startAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentResult> startAssessmentAsync(final StartAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAssessmentRequest, StartAssessmentResult> asyncHandler) {
        final StartAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAssessmentResult>() {
            @Override
            public StartAssessmentResult call() throws Exception {
                StartAssessmentResult result = null;

                try {
                    result = executeStartAssessment(finalRequest);
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
    public java.util.concurrent.Future<StartImportFileTaskResult> startImportFileTaskAsync(StartImportFileTaskRequest request) {

        return startImportFileTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportFileTaskResult> startImportFileTaskAsync(final StartImportFileTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImportFileTaskRequest, StartImportFileTaskResult> asyncHandler) {
        final StartImportFileTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImportFileTaskResult>() {
            @Override
            public StartImportFileTaskResult call() throws Exception {
                StartImportFileTaskResult result = null;

                try {
                    result = executeStartImportFileTask(finalRequest);
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
    public java.util.concurrent.Future<StartRecommendationReportGenerationResult> startRecommendationReportGenerationAsync(
            StartRecommendationReportGenerationRequest request) {

        return startRecommendationReportGenerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRecommendationReportGenerationResult> startRecommendationReportGenerationAsync(
            final StartRecommendationReportGenerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRecommendationReportGenerationRequest, StartRecommendationReportGenerationResult> asyncHandler) {
        final StartRecommendationReportGenerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRecommendationReportGenerationResult>() {
            @Override
            public StartRecommendationReportGenerationResult call() throws Exception {
                StartRecommendationReportGenerationResult result = null;

                try {
                    result = executeStartRecommendationReportGeneration(finalRequest);
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
    public java.util.concurrent.Future<StopAssessmentResult> stopAssessmentAsync(StopAssessmentRequest request) {

        return stopAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAssessmentResult> stopAssessmentAsync(final StopAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAssessmentRequest, StopAssessmentResult> asyncHandler) {
        final StopAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAssessmentResult>() {
            @Override
            public StopAssessmentResult call() throws Exception {
                StopAssessmentResult result = null;

                try {
                    result = executeStopAssessment(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationComponentConfigResult> updateApplicationComponentConfigAsync(
            UpdateApplicationComponentConfigRequest request) {

        return updateApplicationComponentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationComponentConfigResult> updateApplicationComponentConfigAsync(
            final UpdateApplicationComponentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationComponentConfigRequest, UpdateApplicationComponentConfigResult> asyncHandler) {
        final UpdateApplicationComponentConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationComponentConfigResult>() {
            @Override
            public UpdateApplicationComponentConfigResult call() throws Exception {
                UpdateApplicationComponentConfigResult result = null;

                try {
                    result = executeUpdateApplicationComponentConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateServerConfigResult> updateServerConfigAsync(UpdateServerConfigRequest request) {

        return updateServerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerConfigResult> updateServerConfigAsync(final UpdateServerConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServerConfigRequest, UpdateServerConfigResult> asyncHandler) {
        final UpdateServerConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServerConfigResult>() {
            @Override
            public UpdateServerConfigResult call() throws Exception {
                UpdateServerConfigResult result = null;

                try {
                    result = executeUpdateServerConfig(finalRequest);
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
