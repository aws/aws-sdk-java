/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Fraud Detector asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers who need detailed information about
 * Amazon Fraud Detector API actions, data types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon Fraud Detector User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFraudDetectorAsyncClient extends AmazonFraudDetectorClient implements AmazonFraudDetectorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonFraudDetectorAsyncClientBuilder asyncBuilder() {
        return AmazonFraudDetectorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Fraud Detector using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonFraudDetectorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Fraud Detector using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonFraudDetectorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(BatchCreateVariableRequest request) {

        return batchCreateVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(final BatchCreateVariableRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateVariableRequest, BatchCreateVariableResult> asyncHandler) {
        final BatchCreateVariableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateVariableResult>() {
            @Override
            public BatchCreateVariableResult call() throws Exception {
                BatchCreateVariableResult result = null;

                try {
                    result = executeBatchCreateVariable(finalRequest);
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
    public java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(BatchGetVariableRequest request) {

        return batchGetVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(final BatchGetVariableRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetVariableRequest, BatchGetVariableResult> asyncHandler) {
        final BatchGetVariableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetVariableResult>() {
            @Override
            public BatchGetVariableResult call() throws Exception {
                BatchGetVariableResult result = null;

                try {
                    result = executeBatchGetVariable(finalRequest);
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
    public java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(CreateDetectorVersionRequest request) {

        return createDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(final CreateDetectorVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDetectorVersionRequest, CreateDetectorVersionResult> asyncHandler) {
        final CreateDetectorVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDetectorVersionResult>() {
            @Override
            public CreateDetectorVersionResult call() throws Exception {
                CreateDetectorVersionResult result = null;

                try {
                    result = executeCreateDetectorVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
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
    public java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(CreateModelVersionRequest request) {

        return createModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(final CreateModelVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResult> asyncHandler) {
        final CreateModelVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelVersionResult>() {
            @Override
            public CreateModelVersionResult call() throws Exception {
                CreateModelVersionResult result = null;

                try {
                    result = executeCreateModelVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {
        final CreateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;

                try {
                    result = executeCreateRule(finalRequest);
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
    public java.util.concurrent.Future<CreateVariableResult> createVariableAsync(CreateVariableRequest request) {

        return createVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVariableResult> createVariableAsync(final CreateVariableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVariableRequest, CreateVariableResult> asyncHandler) {
        final CreateVariableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVariableResult>() {
            @Override
            public CreateVariableResult call() throws Exception {
                CreateVariableResult result = null;

                try {
                    result = executeCreateVariable(finalRequest);
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
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest request) {

        return deleteDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(final DeleteDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler) {
        final DeleteDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDetectorResult>() {
            @Override
            public DeleteDetectorResult call() throws Exception {
                DeleteDetectorResult result = null;

                try {
                    result = executeDeleteDetector(finalRequest);
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
    public java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(DeleteDetectorVersionRequest request) {

        return deleteDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(final DeleteDetectorVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDetectorVersionRequest, DeleteDetectorVersionResult> asyncHandler) {
        final DeleteDetectorVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDetectorVersionResult>() {
            @Override
            public DeleteDetectorVersionResult call() throws Exception {
                DeleteDetectorVersionResult result = null;

                try {
                    result = executeDeleteDetectorVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(DeleteEventRequest request) {

        return deleteEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(final DeleteEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventRequest, DeleteEventResult> asyncHandler) {
        final DeleteEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventResult>() {
            @Override
            public DeleteEventResult call() throws Exception {
                DeleteEventResult result = null;

                try {
                    result = executeDeleteEvent(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
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
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request) {

        return describeDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(final DescribeDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler) {
        final DescribeDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDetectorResult>() {
            @Override
            public DescribeDetectorResult call() throws Exception {
                DescribeDetectorResult result = null;

                try {
                    result = executeDescribeDetector(finalRequest);
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
    public java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(DescribeModelVersionsRequest request) {

        return describeModelVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(final DescribeModelVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelVersionsRequest, DescribeModelVersionsResult> asyncHandler) {
        final DescribeModelVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelVersionsResult>() {
            @Override
            public DescribeModelVersionsResult call() throws Exception {
                DescribeModelVersionsResult result = null;

                try {
                    result = executeDescribeModelVersions(finalRequest);
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
    public java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(GetDetectorVersionRequest request) {

        return getDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(final GetDetectorVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDetectorVersionRequest, GetDetectorVersionResult> asyncHandler) {
        final GetDetectorVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDetectorVersionResult>() {
            @Override
            public GetDetectorVersionResult call() throws Exception {
                GetDetectorVersionResult result = null;

                try {
                    result = executeGetDetectorVersion(finalRequest);
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
    public java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(GetDetectorsRequest request) {

        return getDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(final GetDetectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDetectorsRequest, GetDetectorsResult> asyncHandler) {
        final GetDetectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDetectorsResult>() {
            @Override
            public GetDetectorsResult call() throws Exception {
                GetDetectorsResult result = null;

                try {
                    result = executeGetDetectors(finalRequest);
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
    public java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(GetEntityTypesRequest request) {

        return getEntityTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(final GetEntityTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEntityTypesRequest, GetEntityTypesResult> asyncHandler) {
        final GetEntityTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEntityTypesResult>() {
            @Override
            public GetEntityTypesResult call() throws Exception {
                GetEntityTypesResult result = null;

                try {
                    result = executeGetEntityTypes(finalRequest);
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
    public java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(GetEventPredictionRequest request) {

        return getEventPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(final GetEventPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventPredictionRequest, GetEventPredictionResult> asyncHandler) {
        final GetEventPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventPredictionResult>() {
            @Override
            public GetEventPredictionResult call() throws Exception {
                GetEventPredictionResult result = null;

                try {
                    result = executeGetEventPrediction(finalRequest);
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
    public java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(GetEventTypesRequest request) {

        return getEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(final GetEventTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventTypesRequest, GetEventTypesResult> asyncHandler) {
        final GetEventTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventTypesResult>() {
            @Override
            public GetEventTypesResult call() throws Exception {
                GetEventTypesResult result = null;

                try {
                    result = executeGetEventTypes(finalRequest);
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
    public java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(GetExternalModelsRequest request) {

        return getExternalModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(final GetExternalModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExternalModelsRequest, GetExternalModelsResult> asyncHandler) {
        final GetExternalModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExternalModelsResult>() {
            @Override
            public GetExternalModelsResult call() throws Exception {
                GetExternalModelsResult result = null;

                try {
                    result = executeGetExternalModels(finalRequest);
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
    public java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(GetKMSEncryptionKeyRequest request) {

        return getKMSEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(final GetKMSEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKMSEncryptionKeyRequest, GetKMSEncryptionKeyResult> asyncHandler) {
        final GetKMSEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKMSEncryptionKeyResult>() {
            @Override
            public GetKMSEncryptionKeyResult call() throws Exception {
                GetKMSEncryptionKeyResult result = null;

                try {
                    result = executeGetKMSEncryptionKey(finalRequest);
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
    public java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(GetLabelsRequest request) {

        return getLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(final GetLabelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLabelsRequest, GetLabelsResult> asyncHandler) {
        final GetLabelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLabelsResult>() {
            @Override
            public GetLabelsResult call() throws Exception {
                GetLabelsResult result = null;

                try {
                    result = executeGetLabels(finalRequest);
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
    public java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(GetModelVersionRequest request) {

        return getModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(final GetModelVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelVersionRequest, GetModelVersionResult> asyncHandler) {
        final GetModelVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelVersionResult>() {
            @Override
            public GetModelVersionResult call() throws Exception {
                GetModelVersionResult result = null;

                try {
                    result = executeGetModelVersion(finalRequest);
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
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(final GetModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {
        final GetModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelsResult>() {
            @Override
            public GetModelsResult call() throws Exception {
                GetModelsResult result = null;

                try {
                    result = executeGetModels(finalRequest);
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
    public java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(GetOutcomesRequest request) {

        return getOutcomesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(final GetOutcomesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOutcomesRequest, GetOutcomesResult> asyncHandler) {
        final GetOutcomesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOutcomesResult>() {
            @Override
            public GetOutcomesResult call() throws Exception {
                GetOutcomesResult result = null;

                try {
                    result = executeGetOutcomes(finalRequest);
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
    public java.util.concurrent.Future<GetPredictionResult> getPredictionAsync(GetPredictionRequest request) {

        return getPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPredictionResult> getPredictionAsync(final GetPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPredictionRequest, GetPredictionResult> asyncHandler) {
        final GetPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPredictionResult>() {
            @Override
            public GetPredictionResult call() throws Exception {
                GetPredictionResult result = null;

                try {
                    result = executeGetPrediction(finalRequest);
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
    public java.util.concurrent.Future<GetRulesResult> getRulesAsync(GetRulesRequest request) {

        return getRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRulesResult> getRulesAsync(final GetRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRulesRequest, GetRulesResult> asyncHandler) {
        final GetRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRulesResult>() {
            @Override
            public GetRulesResult call() throws Exception {
                GetRulesResult result = null;

                try {
                    result = executeGetRules(finalRequest);
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
    public java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(GetVariablesRequest request) {

        return getVariablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(final GetVariablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVariablesRequest, GetVariablesResult> asyncHandler) {
        final GetVariablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVariablesResult>() {
            @Override
            public GetVariablesResult call() throws Exception {
                GetVariablesResult result = null;

                try {
                    result = executeGetVariables(finalRequest);
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
    public java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(PutDetectorRequest request) {

        return putDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(final PutDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDetectorRequest, PutDetectorResult> asyncHandler) {
        final PutDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDetectorResult>() {
            @Override
            public PutDetectorResult call() throws Exception {
                PutDetectorResult result = null;

                try {
                    result = executePutDetector(finalRequest);
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
    public java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(PutEntityTypeRequest request) {

        return putEntityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(final PutEntityTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEntityTypeRequest, PutEntityTypeResult> asyncHandler) {
        final PutEntityTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEntityTypeResult>() {
            @Override
            public PutEntityTypeResult call() throws Exception {
                PutEntityTypeResult result = null;

                try {
                    result = executePutEntityType(finalRequest);
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
    public java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(PutEventTypeRequest request) {

        return putEventTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(final PutEventTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventTypeRequest, PutEventTypeResult> asyncHandler) {
        final PutEventTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventTypeResult>() {
            @Override
            public PutEventTypeResult call() throws Exception {
                PutEventTypeResult result = null;

                try {
                    result = executePutEventType(finalRequest);
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
    public java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(PutExternalModelRequest request) {

        return putExternalModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(final PutExternalModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutExternalModelRequest, PutExternalModelResult> asyncHandler) {
        final PutExternalModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutExternalModelResult>() {
            @Override
            public PutExternalModelResult call() throws Exception {
                PutExternalModelResult result = null;

                try {
                    result = executePutExternalModel(finalRequest);
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
    public java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(PutKMSEncryptionKeyRequest request) {

        return putKMSEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(final PutKMSEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKMSEncryptionKeyRequest, PutKMSEncryptionKeyResult> asyncHandler) {
        final PutKMSEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutKMSEncryptionKeyResult>() {
            @Override
            public PutKMSEncryptionKeyResult call() throws Exception {
                PutKMSEncryptionKeyResult result = null;

                try {
                    result = executePutKMSEncryptionKey(finalRequest);
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
    public java.util.concurrent.Future<PutLabelResult> putLabelAsync(PutLabelRequest request) {

        return putLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLabelResult> putLabelAsync(final PutLabelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLabelRequest, PutLabelResult> asyncHandler) {
        final PutLabelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLabelResult>() {
            @Override
            public PutLabelResult call() throws Exception {
                PutLabelResult result = null;

                try {
                    result = executePutLabel(finalRequest);
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
    public java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(PutOutcomeRequest request) {

        return putOutcomeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(final PutOutcomeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOutcomeRequest, PutOutcomeResult> asyncHandler) {
        final PutOutcomeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOutcomeResult>() {
            @Override
            public PutOutcomeResult call() throws Exception {
                PutOutcomeResult result = null;

                try {
                    result = executePutOutcome(finalRequest);
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
    public java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(UpdateDetectorVersionRequest request) {

        return updateDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(final UpdateDetectorVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionRequest, UpdateDetectorVersionResult> asyncHandler) {
        final UpdateDetectorVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDetectorVersionResult>() {
            @Override
            public UpdateDetectorVersionResult call() throws Exception {
                UpdateDetectorVersionResult result = null;

                try {
                    result = executeUpdateDetectorVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(UpdateDetectorVersionMetadataRequest request) {

        return updateDetectorVersionMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(
            final UpdateDetectorVersionMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionMetadataRequest, UpdateDetectorVersionMetadataResult> asyncHandler) {
        final UpdateDetectorVersionMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDetectorVersionMetadataResult>() {
            @Override
            public UpdateDetectorVersionMetadataResult call() throws Exception {
                UpdateDetectorVersionMetadataResult result = null;

                try {
                    result = executeUpdateDetectorVersionMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(UpdateDetectorVersionStatusRequest request) {

        return updateDetectorVersionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(final UpdateDetectorVersionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionStatusRequest, UpdateDetectorVersionStatusResult> asyncHandler) {
        final UpdateDetectorVersionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDetectorVersionStatusResult>() {
            @Override
            public UpdateDetectorVersionStatusResult call() throws Exception {
                UpdateDetectorVersionStatusResult result = null;

                try {
                    result = executeUpdateDetectorVersionStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(final UpdateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {
        final UpdateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelResult>() {
            @Override
            public UpdateModelResult call() throws Exception {
                UpdateModelResult result = null;

                try {
                    result = executeUpdateModel(finalRequest);
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
    public java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(UpdateModelVersionRequest request) {

        return updateModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(final UpdateModelVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResult> asyncHandler) {
        final UpdateModelVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelVersionResult>() {
            @Override
            public UpdateModelVersionResult call() throws Exception {
                UpdateModelVersionResult result = null;

                try {
                    result = executeUpdateModelVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(UpdateModelVersionStatusRequest request) {

        return updateModelVersionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(final UpdateModelVersionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelVersionStatusRequest, UpdateModelVersionStatusResult> asyncHandler) {
        final UpdateModelVersionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelVersionStatusResult>() {
            @Override
            public UpdateModelVersionStatusResult call() throws Exception {
                UpdateModelVersionStatusResult result = null;

                try {
                    result = executeUpdateModelVersionStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(UpdateRuleMetadataRequest request) {

        return updateRuleMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(final UpdateRuleMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleMetadataRequest, UpdateRuleMetadataResult> asyncHandler) {
        final UpdateRuleMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleMetadataResult>() {
            @Override
            public UpdateRuleMetadataResult call() throws Exception {
                UpdateRuleMetadataResult result = null;

                try {
                    result = executeUpdateRuleMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(UpdateRuleVersionRequest request) {

        return updateRuleVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(final UpdateRuleVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleVersionRequest, UpdateRuleVersionResult> asyncHandler) {
        final UpdateRuleVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleVersionResult>() {
            @Override
            public UpdateRuleVersionResult call() throws Exception {
                UpdateRuleVersionResult result = null;

                try {
                    result = executeUpdateRuleVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(UpdateVariableRequest request) {

        return updateVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(final UpdateVariableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVariableRequest, UpdateVariableResult> asyncHandler) {
        final UpdateVariableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVariableResult>() {
            @Override
            public UpdateVariableResult call() throws Exception {
                UpdateVariableResult result = null;

                try {
                    result = executeUpdateVariable(finalRequest);
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
