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
package com.amazonaws.services.mobile;

import javax.annotation.Generated;

import com.amazonaws.services.mobile.model.*;

/**
 * Abstract implementation of {@code AWSMobileAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMobileAsync extends AbstractAWSMobile implements AWSMobileAsync {

    protected AbstractAWSMobileAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleResult> describeBundleAsync(DescribeBundleRequest request) {

        return describeBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleResult> describeBundleAsync(DescribeBundleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBundleRequest, DescribeBundleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportBundleResult> exportBundleAsync(ExportBundleRequest request) {

        return exportBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportBundleResult> exportBundleAsync(ExportBundleRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportBundleRequest, ExportBundleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportProjectResult> exportProjectAsync(ExportProjectRequest request) {

        return exportProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportProjectResult> exportProjectAsync(ExportProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportProjectRequest, ExportProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBundlesResult> listBundlesAsync(ListBundlesRequest request) {

        return listBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBundlesResult> listBundlesAsync(ListBundlesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBundlesRequest, ListBundlesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
