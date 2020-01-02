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
package com.amazonaws.services.qldb;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;

/**
 * Abstract implementation of {@code AmazonQLDBAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonQLDBAsync extends AbstractAmazonQLDB implements AmazonQLDBAsync {

    protected AbstractAmazonQLDBAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(CreateLedgerRequest request) {

        return createLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(CreateLedgerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLedgerRequest, CreateLedgerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(DeleteLedgerRequest request) {

        return deleteLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(DeleteLedgerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLedgerRequest, DeleteLedgerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(DescribeJournalS3ExportRequest request) {

        return describeJournalS3ExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(DescribeJournalS3ExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJournalS3ExportRequest, DescribeJournalS3ExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(DescribeLedgerRequest request) {

        return describeLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(DescribeLedgerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLedgerRequest, DescribeLedgerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(ExportJournalToS3Request request) {

        return exportJournalToS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(ExportJournalToS3Request request,
            com.amazonaws.handlers.AsyncHandler<ExportJournalToS3Request, ExportJournalToS3Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBlockResult> getBlockAsync(GetBlockRequest request) {

        return getBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlockResult> getBlockAsync(GetBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBlockRequest, GetBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDigestResult> getDigestAsync(GetDigestRequest request) {

        return getDigestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDigestResult> getDigestAsync(GetDigestRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDigestRequest, GetDigestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request) {

        return getRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(ListJournalS3ExportsRequest request) {

        return listJournalS3ExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(ListJournalS3ExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsRequest, ListJournalS3ExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(ListJournalS3ExportsForLedgerRequest request) {

        return listJournalS3ExportsForLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(ListJournalS3ExportsForLedgerRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsForLedgerRequest, ListJournalS3ExportsForLedgerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(ListLedgersRequest request) {

        return listLedgersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(ListLedgersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLedgersRequest, ListLedgersResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(UpdateLedgerRequest request) {

        return updateLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(UpdateLedgerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLedgerRequest, UpdateLedgerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
