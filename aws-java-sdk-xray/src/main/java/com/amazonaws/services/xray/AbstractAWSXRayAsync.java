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
package com.amazonaws.services.xray;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;

/**
 * Abstract implementation of {@code AWSXRayAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSXRayAsync extends AbstractAWSXRay implements AWSXRayAsync {

    protected AbstractAWSXRayAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest request) {

        return batchGetTracesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetTracesRequest, BatchGetTracesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(CreateSamplingRuleRequest request) {

        return createSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(CreateSamplingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSamplingRuleRequest, CreateSamplingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(DeleteSamplingRuleRequest request) {

        return deleteSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(DeleteSamplingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSamplingRuleRequest, DeleteSamplingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(GetEncryptionConfigRequest request) {

        return getEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(GetEncryptionConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEncryptionConfigRequest, GetEncryptionConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(GetGroupsRequest request) {

        return getGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(GetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupsRequest, GetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(GetSamplingRulesRequest request) {

        return getSamplingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(GetSamplingRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSamplingRulesRequest, GetSamplingRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(GetSamplingStatisticSummariesRequest request) {

        return getSamplingStatisticSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(GetSamplingStatisticSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSamplingStatisticSummariesRequest, GetSamplingStatisticSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(GetSamplingTargetsRequest request) {

        return getSamplingTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(GetSamplingTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSamplingTargetsRequest, GetSamplingTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest request) {

        return getServiceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceGraphRequest, GetServiceGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest request) {

        return getTraceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTraceGraphRequest, GetTraceGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest request) {

        return getTraceSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTraceSummariesRequest, GetTraceSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(PutEncryptionConfigRequest request) {

        return putEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(PutEncryptionConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEncryptionConfigRequest, PutEncryptionConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest request) {

        return putTelemetryRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTelemetryRecordsRequest, PutTelemetryRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest request) {

        return putTraceSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTraceSegmentsRequest, PutTraceSegmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(UpdateSamplingRuleRequest request) {

        return updateSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(UpdateSamplingRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSamplingRuleRequest, UpdateSamplingRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
