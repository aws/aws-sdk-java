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
package com.amazonaws.services.applicationcostprofiler;

import javax.annotation.Generated;

import com.amazonaws.services.applicationcostprofiler.model.*;

/**
 * Abstract implementation of {@code AWSApplicationCostProfilerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSApplicationCostProfilerAsync extends AbstractAWSApplicationCostProfiler implements AWSApplicationCostProfilerAsync {

    protected AbstractAWSApplicationCostProfilerAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest request) {

        return deleteReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReportDefinitionRequest, DeleteReportDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(GetReportDefinitionRequest request) {

        return getReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(GetReportDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReportDefinitionRequest, GetReportDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(ImportApplicationUsageRequest request) {

        return importApplicationUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(ImportApplicationUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportApplicationUsageRequest, ImportApplicationUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(ListReportDefinitionsRequest request) {

        return listReportDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(ListReportDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReportDefinitionsRequest, ListReportDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest request) {

        return putReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutReportDefinitionRequest, PutReportDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(UpdateReportDefinitionRequest request) {

        return updateReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(UpdateReportDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReportDefinitionRequest, UpdateReportDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
