/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.trustedadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.trustedadvisor.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSTrustedAdvisor}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSTrustedAdvisor implements AWSTrustedAdvisor {

    protected AbstractAWSTrustedAdvisor() {
    }

    @Override
    public BatchUpdateRecommendationResourceExclusionResult batchUpdateRecommendationResourceExclusion(BatchUpdateRecommendationResourceExclusionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOrganizationRecommendationResult getOrganizationRecommendation(GetOrganizationRecommendationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRecommendationResult getRecommendation(GetRecommendationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListChecksResult listChecks(ListChecksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOrganizationRecommendationAccountsResult listOrganizationRecommendationAccounts(ListOrganizationRecommendationAccountsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOrganizationRecommendationResourcesResult listOrganizationRecommendationResources(ListOrganizationRecommendationResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOrganizationRecommendationsResult listOrganizationRecommendations(ListOrganizationRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecommendationResourcesResult listRecommendationResources(ListRecommendationResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecommendationsResult listRecommendations(ListRecommendationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateOrganizationRecommendationLifecycleResult updateOrganizationRecommendationLifecycle(UpdateOrganizationRecommendationLifecycleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRecommendationLifecycleResult updateRecommendationLifecycle(UpdateRecommendationLifecycleRequest request) {
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

}
