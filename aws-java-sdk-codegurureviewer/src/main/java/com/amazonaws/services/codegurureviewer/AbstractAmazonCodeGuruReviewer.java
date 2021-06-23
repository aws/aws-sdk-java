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
import com.amazonaws.*;
import com.amazonaws.services.codegurureviewer.waiters.AmazonCodeGuruReviewerWaiters;

/**
 * Abstract implementation of {@code AmazonCodeGuruReviewer}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeGuruReviewer implements AmazonCodeGuruReviewer {

    protected AbstractAmazonCodeGuruReviewer() {
    }

    @Override
    public AssociateRepositoryResult associateRepository(AssociateRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCodeReviewResult createCodeReview(CreateCodeReviewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCodeReviewResult describeCodeReview(DescribeCodeReviewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRecommendationFeedbackResult describeRecommendationFeedback(DescribeRecommendationFeedbackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRepositoryAssociationResult describeRepositoryAssociation(DescribeRepositoryAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateRepositoryResult disassociateRepository(DisassociateRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCodeReviewsResult listCodeReviews(ListCodeReviewsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecommendationFeedbackResult listRecommendationFeedback(ListRecommendationFeedbackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecommendationsResult listRecommendations(ListRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRepositoryAssociationsResult listRepositoryAssociations(ListRepositoryAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRecommendationFeedbackResult putRecommendationFeedback(PutRecommendationFeedbackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonCodeGuruReviewerWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
