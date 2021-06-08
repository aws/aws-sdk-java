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
package com.amazonaws.services.codegurureviewer;

import javax.annotation.Generated;

import com.amazonaws.services.codegurureviewer.model.*;

/**
 * Abstract implementation of {@code AmazonCodeGuruReviewerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeGuruReviewerAsync extends AbstractAmazonCodeGuruReviewer implements AmazonCodeGuruReviewerAsync {

    protected AbstractAmazonCodeGuruReviewerAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest request) {

        return associateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateRepositoryRequest, AssociateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCodeReviewResult> createCodeReviewAsync(CreateCodeReviewRequest request) {

        return createCodeReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCodeReviewResult> createCodeReviewAsync(CreateCodeReviewRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCodeReviewRequest, CreateCodeReviewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(DescribeCodeReviewRequest request) {

        return describeCodeReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(DescribeCodeReviewRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCodeReviewRequest, DescribeCodeReviewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(DescribeRecommendationFeedbackRequest request) {

        return describeRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(DescribeRecommendationFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommendationFeedbackRequest, DescribeRecommendationFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(DescribeRepositoryAssociationRequest request) {

        return describeRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(DescribeRepositoryAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoryAssociationRequest, DescribeRepositoryAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest request) {

        return disassociateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateRepositoryRequest, DisassociateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(ListCodeReviewsRequest request) {

        return listCodeReviewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(ListCodeReviewsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCodeReviewsRequest, ListCodeReviewsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(ListRecommendationFeedbackRequest request) {

        return listRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(ListRecommendationFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationFeedbackRequest, ListRecommendationFeedbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request) {

        return listRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(ListRepositoryAssociationsRequest request) {

        return listRepositoryAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(ListRepositoryAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoryAssociationsRequest, ListRepositoryAssociationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(PutRecommendationFeedbackRequest request) {

        return putRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(PutRecommendationFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecommendationFeedbackRequest, PutRecommendationFeedbackResult> asyncHandler) {

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

}
