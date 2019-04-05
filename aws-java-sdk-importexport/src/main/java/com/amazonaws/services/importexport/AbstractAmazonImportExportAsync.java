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
package com.amazonaws.services.importexport;

import javax.annotation.Generated;

import com.amazonaws.services.importexport.model.*;

/**
 * Abstract implementation of {@code AmazonImportExportAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonImportExportAsync extends AbstractAmazonImportExport implements AmazonImportExportAsync {

    protected AbstractAmazonImportExportAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(GetShippingLabelRequest request) {

        return getShippingLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(GetShippingLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetShippingLabelRequest, GetShippingLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStatusResult> getStatusAsync(GetStatusRequest request) {

        return getStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStatusResult> getStatusAsync(GetStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStatusRequest, GetStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListJobs operation.
     *
     * @see #listJobsAsync(ListJobsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync() {

        return listJobsAsync(new ListJobsRequest());
    }

    /**
     * Simplified method form for invoking the ListJobs operation with an AsyncHandler.
     *
     * @see #listJobsAsync(ListJobsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return listJobsAsync(new ListJobsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest request) {

        return updateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
