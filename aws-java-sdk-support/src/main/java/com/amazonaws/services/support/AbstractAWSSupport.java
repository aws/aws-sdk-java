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
package com.amazonaws.services.support;

import javax.annotation.Generated;

import com.amazonaws.services.support.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSupport}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSupport implements AWSSupport {

    protected AbstractAWSSupport() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddAttachmentsToSetResult addAttachmentsToSet(AddAttachmentsToSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddCommunicationToCaseResult addCommunicationToCase(AddCommunicationToCaseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCaseResult createCase(CreateCaseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAttachmentResult describeAttachment(DescribeAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCasesResult describeCases(DescribeCasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCasesResult describeCases() {
        return describeCases(new DescribeCasesRequest());
    }

    @Override
    public DescribeCommunicationsResult describeCommunications(DescribeCommunicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServicesResult describeServices(DescribeServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServicesResult describeServices() {
        return describeServices(new DescribeServicesRequest());
    }

    @Override
    public DescribeSeverityLevelsResult describeSeverityLevels(DescribeSeverityLevelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSeverityLevelsResult describeSeverityLevels() {
        return describeSeverityLevels(new DescribeSeverityLevelsRequest());
    }

    @Override
    public DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResolveCaseResult resolveCase(ResolveCaseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResolveCaseResult resolveCase() {
        return resolveCase(new ResolveCaseRequest());
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
