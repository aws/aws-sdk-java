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
package com.amazonaws.services.codegurusecurity;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCodeGuruSecurity}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeGuruSecurity implements AmazonCodeGuruSecurity {

    protected AbstractAmazonCodeGuruSecurity() {
    }

    @Override
    public BatchGetFindingsResult batchGetFindings(BatchGetFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateScanResult createScan(CreateScanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUploadUrlResult createUploadUrl(CreateUploadUrlRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountConfigurationResult getAccountConfiguration(GetAccountConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetFindingsResult getFindings(GetFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMetricsSummaryResult getMetricsSummary(GetMetricsSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetScanResult getScan(GetScanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFindingsMetricsResult listFindingsMetrics(ListFindingsMetricsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListScansResult listScans(ListScansRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
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
    public UpdateAccountConfigurationResult updateAccountConfiguration(UpdateAccountConfigurationRequest request) {
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
