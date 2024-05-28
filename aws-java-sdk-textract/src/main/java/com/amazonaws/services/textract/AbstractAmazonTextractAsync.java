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
package com.amazonaws.services.textract;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;

/**
 * Abstract implementation of {@code AmazonTextractAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTextractAsync extends AbstractAmazonTextract implements AmazonTextractAsync {

    protected AbstractAmazonTextractAsync() {
    }

    @Override
    public java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(AnalyzeDocumentRequest request) {

        return analyzeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(AnalyzeDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<AnalyzeDocumentRequest, AnalyzeDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(AnalyzeExpenseRequest request) {

        return analyzeExpenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(AnalyzeExpenseRequest request,
            com.amazonaws.handlers.AsyncHandler<AnalyzeExpenseRequest, AnalyzeExpenseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(AnalyzeIDRequest request) {

        return analyzeIDAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(AnalyzeIDRequest request,
            com.amazonaws.handlers.AsyncHandler<AnalyzeIDRequest, AnalyzeIDResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterResult> createAdapterAsync(CreateAdapterRequest request) {

        return createAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterResult> createAdapterAsync(CreateAdapterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAdapterRequest, CreateAdapterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterVersionResult> createAdapterVersionAsync(CreateAdapterVersionRequest request) {

        return createAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterVersionResult> createAdapterVersionAsync(CreateAdapterVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAdapterVersionRequest, CreateAdapterVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterResult> deleteAdapterAsync(DeleteAdapterRequest request) {

        return deleteAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterResult> deleteAdapterAsync(DeleteAdapterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAdapterRequest, DeleteAdapterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterVersionResult> deleteAdapterVersionAsync(DeleteAdapterVersionRequest request) {

        return deleteAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterVersionResult> deleteAdapterVersionAsync(DeleteAdapterVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAdapterVersionRequest, DeleteAdapterVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(DetectDocumentTextRequest request) {

        return detectDocumentTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(DetectDocumentTextRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectDocumentTextRequest, DetectDocumentTextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAdapterResult> getAdapterAsync(GetAdapterRequest request) {

        return getAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdapterResult> getAdapterAsync(GetAdapterRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAdapterRequest, GetAdapterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAdapterVersionResult> getAdapterVersionAsync(GetAdapterVersionRequest request) {

        return getAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdapterVersionResult> getAdapterVersionAsync(GetAdapterVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAdapterVersionRequest, GetAdapterVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(GetDocumentAnalysisRequest request) {

        return getDocumentAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(GetDocumentAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDocumentAnalysisRequest, GetDocumentAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(GetDocumentTextDetectionRequest request) {

        return getDocumentTextDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(GetDocumentTextDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDocumentTextDetectionRequest, GetDocumentTextDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(GetExpenseAnalysisRequest request) {

        return getExpenseAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(GetExpenseAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExpenseAnalysisRequest, GetExpenseAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(GetLendingAnalysisRequest request) {

        return getLendingAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(GetLendingAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisRequest, GetLendingAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(GetLendingAnalysisSummaryRequest request) {

        return getLendingAnalysisSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(GetLendingAnalysisSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisSummaryRequest, GetLendingAnalysisSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAdapterVersionsResult> listAdapterVersionsAsync(ListAdapterVersionsRequest request) {

        return listAdapterVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAdapterVersionsResult> listAdapterVersionsAsync(ListAdapterVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAdapterVersionsRequest, ListAdapterVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAdaptersResult> listAdaptersAsync(ListAdaptersRequest request) {

        return listAdaptersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAdaptersResult> listAdaptersAsync(ListAdaptersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAdaptersRequest, ListAdaptersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(StartDocumentAnalysisRequest request) {

        return startDocumentAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(StartDocumentAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDocumentAnalysisRequest, StartDocumentAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(StartDocumentTextDetectionRequest request) {

        return startDocumentTextDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(StartDocumentTextDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDocumentTextDetectionRequest, StartDocumentTextDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(StartExpenseAnalysisRequest request) {

        return startExpenseAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(StartExpenseAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<StartExpenseAnalysisRequest, StartExpenseAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(StartLendingAnalysisRequest request) {

        return startLendingAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(StartLendingAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<StartLendingAnalysisRequest, StartLendingAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAdapterResult> updateAdapterAsync(UpdateAdapterRequest request) {

        return updateAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAdapterResult> updateAdapterAsync(UpdateAdapterRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAdapterRequest, UpdateAdapterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
