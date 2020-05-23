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
package com.amazonaws.services.applicationinsights;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonApplicationInsights}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonApplicationInsights implements AmazonApplicationInsights {

    protected AbstractAmazonApplicationInsights() {
    }

    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateComponentResult createComponent(CreateComponentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLogPatternResult createLogPattern(CreateLogPatternRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteComponentResult deleteComponent(DeleteComponentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComponentResult describeComponent(DescribeComponentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComponentConfigurationResult describeComponentConfiguration(DescribeComponentConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComponentConfigurationRecommendationResult describeComponentConfigurationRecommendation(
            DescribeComponentConfigurationRecommendationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeObservationResult describeObservation(DescribeObservationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeProblemResult describeProblem(DescribeProblemRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeProblemObservationsResult describeProblemObservations(DescribeProblemObservationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListConfigurationHistoryResult listConfigurationHistory(ListConfigurationHistoryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListLogPatternSetsResult listLogPatternSets(ListLogPatternSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListLogPatternsResult listLogPatterns(ListLogPatternsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListProblemsResult listProblems(ListProblemsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateComponentResult updateComponent(UpdateComponentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateComponentConfigurationResult updateComponentConfiguration(UpdateComponentConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateLogPatternResult updateLogPattern(UpdateLogPatternRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
