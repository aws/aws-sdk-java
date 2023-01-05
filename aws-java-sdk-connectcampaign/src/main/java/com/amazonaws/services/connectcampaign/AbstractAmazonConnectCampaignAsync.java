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
package com.amazonaws.services.connectcampaign;

import javax.annotation.Generated;

import com.amazonaws.services.connectcampaign.model.*;

/**
 * Abstract implementation of {@code AmazonConnectCampaignAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonConnectCampaignAsync extends AbstractAmazonConnectCampaign implements AmazonConnectCampaignAsync {

    protected AbstractAmazonConnectCampaignAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(DeleteConnectInstanceConfigRequest request) {

        return deleteConnectInstanceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(DeleteConnectInstanceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectInstanceConfigRequest, DeleteConnectInstanceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(DeleteInstanceOnboardingJobRequest request) {

        return deleteInstanceOnboardingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(DeleteInstanceOnboardingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceOnboardingJobRequest, DeleteInstanceOnboardingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request) {

        return describeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(GetCampaignStateRequest request) {

        return getCampaignStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(GetCampaignStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCampaignStateRequest, GetCampaignStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(GetCampaignStateBatchRequest request) {

        return getCampaignStateBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(GetCampaignStateBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCampaignStateBatchRequest, GetCampaignStateBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(GetConnectInstanceConfigRequest request) {

        return getConnectInstanceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(GetConnectInstanceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConnectInstanceConfigRequest, GetConnectInstanceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(GetInstanceOnboardingJobStatusRequest request) {

        return getInstanceOnboardingJobStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(GetInstanceOnboardingJobStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceOnboardingJobStatusRequest, GetInstanceOnboardingJobStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request) {

        return listCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(PauseCampaignRequest request) {

        return pauseCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(PauseCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<PauseCampaignRequest, PauseCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(PutDialRequestBatchRequest request) {

        return putDialRequestBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(PutDialRequestBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDialRequestBatchRequest, PutDialRequestBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(ResumeCampaignRequest request) {

        return resumeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(ResumeCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<ResumeCampaignRequest, ResumeCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(StartCampaignRequest request) {

        return startCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(StartCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCampaignRequest, StartCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(StartInstanceOnboardingJobRequest request) {

        return startInstanceOnboardingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(StartInstanceOnboardingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartInstanceOnboardingJobRequest, StartInstanceOnboardingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(StopCampaignRequest request) {

        return stopCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(StopCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<StopCampaignRequest, StopCampaignResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(UpdateCampaignDialerConfigRequest request) {

        return updateCampaignDialerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(UpdateCampaignDialerConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignDialerConfigRequest, UpdateCampaignDialerConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(UpdateCampaignNameRequest request) {

        return updateCampaignNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(UpdateCampaignNameRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignNameRequest, UpdateCampaignNameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            UpdateCampaignOutboundCallConfigRequest request) {

        return updateCampaignOutboundCallConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            UpdateCampaignOutboundCallConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignOutboundCallConfigRequest, UpdateCampaignOutboundCallConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
