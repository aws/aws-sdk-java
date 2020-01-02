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
package com.amazonaws.services.accessanalyzer;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;

/**
 * Abstract implementation of {@code AWSAccessAnalyzerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAccessAnalyzerAsync extends AbstractAWSAccessAnalyzer implements AWSAccessAnalyzerAsync {

    protected AbstractAWSAccessAnalyzerAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(CreateAnalyzerRequest request) {

        return createAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(CreateAnalyzerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAnalyzerRequest, CreateAnalyzerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(CreateArchiveRuleRequest request) {

        return createArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(CreateArchiveRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateArchiveRuleRequest, CreateArchiveRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(DeleteAnalyzerRequest request) {

        return deleteAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(DeleteAnalyzerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAnalyzerRequest, DeleteAnalyzerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(DeleteArchiveRuleRequest request) {

        return deleteArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(DeleteArchiveRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRuleRequest, DeleteArchiveRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(GetAnalyzedResourceRequest request) {

        return getAnalyzedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(GetAnalyzedResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnalyzedResourceRequest, GetAnalyzedResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(GetAnalyzerRequest request) {

        return getAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(GetAnalyzerRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnalyzerRequest, GetAnalyzerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(GetArchiveRuleRequest request) {

        return getArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(GetArchiveRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetArchiveRuleRequest, GetArchiveRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingResult> getFindingAsync(GetFindingRequest request) {

        return getFindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingResult> getFindingAsync(GetFindingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingRequest, GetFindingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(ListAnalyzedResourcesRequest request) {

        return listAnalyzedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(ListAnalyzedResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnalyzedResourcesRequest, ListAnalyzedResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(ListAnalyzersRequest request) {

        return listAnalyzersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(ListAnalyzersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnalyzersRequest, ListAnalyzersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(ListArchiveRulesRequest request) {

        return listArchiveRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(ListArchiveRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListArchiveRulesRequest, ListArchiveRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(StartResourceScanRequest request) {

        return startResourceScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(StartResourceScanRequest request,
            com.amazonaws.handlers.AsyncHandler<StartResourceScanRequest, StartResourceScanResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(UpdateArchiveRuleRequest request) {

        return updateArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(UpdateArchiveRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateArchiveRuleRequest, UpdateArchiveRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest request) {

        return updateFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
