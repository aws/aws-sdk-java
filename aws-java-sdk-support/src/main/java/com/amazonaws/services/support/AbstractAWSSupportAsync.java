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

/**
 * Abstract implementation of {@code AWSSupportAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSupportAsync extends AbstractAWSSupport implements AWSSupportAsync {

    protected AbstractAWSSupportAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest request) {

        return addAttachmentsToSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest request,
            com.amazonaws.handlers.AsyncHandler<AddAttachmentsToSetRequest, AddAttachmentsToSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest request) {

        return addCommunicationToCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest request,
            com.amazonaws.handlers.AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest request) {

        return createCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest request) {

        return describeAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAttachmentRequest, DescribeAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest request) {

        return describeCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCases operation.
     *
     * @see #describeCasesAsync(DescribeCasesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync() {

        return describeCasesAsync(new DescribeCasesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCases operation with an AsyncHandler.
     *
     * @see #describeCasesAsync(DescribeCasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler) {

        return describeCasesAsync(new DescribeCasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest request) {

        return describeCommunicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeServices operation.
     *
     * @see #describeServicesAsync(DescribeServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync() {

        return describeServicesAsync(new DescribeServicesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeServices operation with an AsyncHandler.
     *
     * @see #describeServicesAsync(DescribeServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        return describeServicesAsync(new DescribeServicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest request) {

        return describeSeverityLevelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync() {

        return describeSeverityLevelsAsync(new DescribeSeverityLevelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation with an AsyncHandler.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler) {

        return describeSeverityLevelsAsync(new DescribeSeverityLevelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest request) {

        return describeTrustedAdvisorCheckRefreshStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest request) {

        return describeTrustedAdvisorCheckResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest request) {

        return describeTrustedAdvisorCheckSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(DescribeTrustedAdvisorChecksRequest request) {

        return describeTrustedAdvisorChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(DescribeTrustedAdvisorChecksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(RefreshTrustedAdvisorCheckRequest request) {

        return refreshTrustedAdvisorCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(RefreshTrustedAdvisorCheckRequest request,
            com.amazonaws.handlers.AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest request) {

        return resolveCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest request,
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ResolveCase operation.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest)
     */
    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync() {

        return resolveCaseAsync(new ResolveCaseRequest());
    }

    /**
     * Simplified method form for invoking the ResolveCase operation with an AsyncHandler.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler) {

        return resolveCaseAsync(new ResolveCaseRequest(), asyncHandler);
    }

}
