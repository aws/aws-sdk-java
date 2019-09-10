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
package com.amazonaws.services.qldb;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonQLDB}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonQLDB implements AmazonQLDB {

    protected AbstractAmazonQLDB() {
    }

    @Override
    public CreateLedgerResult createLedger(CreateLedgerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLedgerResult deleteLedger(DeleteLedgerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJournalS3ExportResult describeJournalS3Export(DescribeJournalS3ExportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLedgerResult describeLedger(DescribeLedgerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportJournalToS3Result exportJournalToS3(ExportJournalToS3Request request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBlockResult getBlock(GetBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDigestResult getDigest(GetDigestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRevisionResult getRevision(GetRevisionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJournalS3ExportsResult listJournalS3Exports(ListJournalS3ExportsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(ListJournalS3ExportsForLedgerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLedgersResult listLedgers(ListLedgersRequest request) {
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
    public UpdateLedgerResult updateLedger(UpdateLedgerRequest request) {
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
