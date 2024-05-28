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
package com.amazonaws.services.artifact;

import javax.annotation.Generated;

import com.amazonaws.services.artifact.model.*;

/**
 * Abstract implementation of {@code AWSArtifactAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSArtifactAsync extends AbstractAWSArtifact implements AWSArtifactAsync {

    protected AbstractAWSArtifactAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReportResult> getReportAsync(GetReportRequest request) {

        return getReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportResult> getReportAsync(GetReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReportRequest, GetReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(GetReportMetadataRequest request) {

        return getReportMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(GetReportMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReportMetadataRequest, GetReportMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(GetTermForReportRequest request) {

        return getTermForReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(GetTermForReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTermForReportRequest, GetTermForReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request) {

        return listReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(PutAccountSettingsRequest request) {

        return putAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(PutAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccountSettingsRequest, PutAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
