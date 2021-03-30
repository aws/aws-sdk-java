/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Abstract implementation of {@code AmazonFraudDetectorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonFraudDetectorAsync extends AbstractAmazonFraudDetector implements AmazonFraudDetectorAsync {

    protected AbstractAmazonFraudDetectorAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(BatchCreateVariableRequest request) {

        return batchCreateVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(BatchCreateVariableRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchCreateVariableRequest, BatchCreateVariableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(BatchGetVariableRequest request) {

        return batchGetVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(BatchGetVariableRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetVariableRequest, BatchGetVariableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelBatchPredictionJobResult> cancelBatchPredictionJobAsync(CancelBatchPredictionJobRequest request) {

        return cancelBatchPredictionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelBatchPredictionJobResult> cancelBatchPredictionJobAsync(CancelBatchPredictionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelBatchPredictionJobRequest, CancelBatchPredictionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBatchPredictionJobResult> createBatchPredictionJobAsync(CreateBatchPredictionJobRequest request) {

        return createBatchPredictionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchPredictionJobResult> createBatchPredictionJobAsync(CreateBatchPredictionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBatchPredictionJobRequest, CreateBatchPredictionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(CreateDetectorVersionRequest request) {

        return createDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(CreateDetectorVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorVersionRequest, CreateDetectorVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(CreateModelVersionRequest request) {

        return createModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(CreateModelVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVariableResult> createVariableAsync(CreateVariableRequest request) {

        return createVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVariableResult> createVariableAsync(CreateVariableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVariableRequest, CreateVariableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchPredictionJobResult> deleteBatchPredictionJobAsync(DeleteBatchPredictionJobRequest request) {

        return deleteBatchPredictionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchPredictionJobResult> deleteBatchPredictionJobAsync(DeleteBatchPredictionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBatchPredictionJobRequest, DeleteBatchPredictionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest request) {

        return deleteDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(DeleteDetectorVersionRequest request) {

        return deleteDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(DeleteDetectorVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorVersionRequest, DeleteDetectorVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityTypeResult> deleteEntityTypeAsync(DeleteEntityTypeRequest request) {

        return deleteEntityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityTypeResult> deleteEntityTypeAsync(DeleteEntityTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEntityTypeRequest, DeleteEntityTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(DeleteEventRequest request) {

        return deleteEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(DeleteEventRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventRequest, DeleteEventResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventTypeResult> deleteEventTypeAsync(DeleteEventTypeRequest request) {

        return deleteEventTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventTypeResult> deleteEventTypeAsync(DeleteEventTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventTypeRequest, DeleteEventTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalModelResult> deleteExternalModelAsync(DeleteExternalModelRequest request) {

        return deleteExternalModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalModelResult> deleteExternalModelAsync(DeleteExternalModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteExternalModelRequest, DeleteExternalModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest request) {

        return deleteLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLabelRequest, DeleteLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteModelVersionResult> deleteModelVersionAsync(DeleteModelVersionRequest request) {

        return deleteModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelVersionResult> deleteModelVersionAsync(DeleteModelVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteOutcomeResult> deleteOutcomeAsync(DeleteOutcomeRequest request) {

        return deleteOutcomeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutcomeResult> deleteOutcomeAsync(DeleteOutcomeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteOutcomeRequest, DeleteOutcomeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVariableResult> deleteVariableAsync(DeleteVariableRequest request) {

        return deleteVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVariableResult> deleteVariableAsync(DeleteVariableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVariableRequest, DeleteVariableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request) {

        return describeDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(DescribeModelVersionsRequest request) {

        return describeModelVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(DescribeModelVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeModelVersionsRequest, DescribeModelVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBatchPredictionJobsResult> getBatchPredictionJobsAsync(GetBatchPredictionJobsRequest request) {

        return getBatchPredictionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBatchPredictionJobsResult> getBatchPredictionJobsAsync(GetBatchPredictionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBatchPredictionJobsRequest, GetBatchPredictionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(GetDetectorVersionRequest request) {

        return getDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(GetDetectorVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDetectorVersionRequest, GetDetectorVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(GetDetectorsRequest request) {

        return getDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(GetDetectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDetectorsRequest, GetDetectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(GetEntityTypesRequest request) {

        return getEntityTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(GetEntityTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEntityTypesRequest, GetEntityTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(GetEventPredictionRequest request) {

        return getEventPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(GetEventPredictionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventPredictionRequest, GetEventPredictionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(GetEventTypesRequest request) {

        return getEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(GetEventTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventTypesRequest, GetEventTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(GetExternalModelsRequest request) {

        return getExternalModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(GetExternalModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExternalModelsRequest, GetExternalModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(GetKMSEncryptionKeyRequest request) {

        return getKMSEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(GetKMSEncryptionKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKMSEncryptionKeyRequest, GetKMSEncryptionKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(GetLabelsRequest request) {

        return getLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(GetLabelsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLabelsRequest, GetLabelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(GetModelVersionRequest request) {

        return getModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(GetModelVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelVersionRequest, GetModelVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(GetOutcomesRequest request) {

        return getOutcomesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(GetOutcomesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOutcomesRequest, GetOutcomesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRulesResult> getRulesAsync(GetRulesRequest request) {

        return getRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRulesResult> getRulesAsync(GetRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRulesRequest, GetRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(GetVariablesRequest request) {

        return getVariablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(GetVariablesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVariablesRequest, GetVariablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(PutDetectorRequest request) {

        return putDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(PutDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDetectorRequest, PutDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(PutEntityTypeRequest request) {

        return putEntityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(PutEntityTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEntityTypeRequest, PutEntityTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(PutEventTypeRequest request) {

        return putEventTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(PutEventTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEventTypeRequest, PutEventTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(PutExternalModelRequest request) {

        return putExternalModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(PutExternalModelRequest request,
            com.amazonaws.handlers.AsyncHandler<PutExternalModelRequest, PutExternalModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(PutKMSEncryptionKeyRequest request) {

        return putKMSEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(PutKMSEncryptionKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutKMSEncryptionKeyRequest, PutKMSEncryptionKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLabelResult> putLabelAsync(PutLabelRequest request) {

        return putLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLabelResult> putLabelAsync(PutLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLabelRequest, PutLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(PutOutcomeRequest request) {

        return putOutcomeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(PutOutcomeRequest request,
            com.amazonaws.handlers.AsyncHandler<PutOutcomeRequest, PutOutcomeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(UpdateDetectorVersionRequest request) {

        return updateDetectorVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(UpdateDetectorVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionRequest, UpdateDetectorVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(UpdateDetectorVersionMetadataRequest request) {

        return updateDetectorVersionMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(UpdateDetectorVersionMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionMetadataRequest, UpdateDetectorVersionMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(UpdateDetectorVersionStatusRequest request) {

        return updateDetectorVersionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(UpdateDetectorVersionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionStatusRequest, UpdateDetectorVersionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(UpdateModelVersionRequest request) {

        return updateModelVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(UpdateModelVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(UpdateModelVersionStatusRequest request) {

        return updateModelVersionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(UpdateModelVersionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateModelVersionStatusRequest, UpdateModelVersionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(UpdateRuleMetadataRequest request) {

        return updateRuleMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(UpdateRuleMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleMetadataRequest, UpdateRuleMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(UpdateRuleVersionRequest request) {

        return updateRuleVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(UpdateRuleVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleVersionRequest, UpdateRuleVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(UpdateVariableRequest request) {

        return updateVariableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(UpdateVariableRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVariableRequest, UpdateVariableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
