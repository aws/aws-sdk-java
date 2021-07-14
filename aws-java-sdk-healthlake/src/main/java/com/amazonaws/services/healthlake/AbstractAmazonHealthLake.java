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
package com.amazonaws.services.healthlake;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonHealthLake}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonHealthLake implements AmazonHealthLake {

    protected AbstractAmazonHealthLake() {
    }

    @Override
    public CreateFHIRDatastoreResult createFHIRDatastore(CreateFHIRDatastoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFHIRDatastoreResult deleteFHIRDatastore(DeleteFHIRDatastoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFHIRDatastoreResult describeFHIRDatastore(DescribeFHIRDatastoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFHIRExportJobResult describeFHIRExportJob(DescribeFHIRExportJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFHIRImportJobResult describeFHIRImportJob(DescribeFHIRImportJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFHIRDatastoresResult listFHIRDatastores(ListFHIRDatastoresRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFHIRExportJobsResult listFHIRExportJobs(ListFHIRExportJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFHIRImportJobsResult listFHIRImportJobs(ListFHIRImportJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFHIRExportJobResult startFHIRExportJob(StartFHIRExportJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFHIRImportJobResult startFHIRImportJob(StartFHIRImportJobRequest request) {
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
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
