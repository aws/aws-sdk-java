/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCodeCommit}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSCodeCommit implements AWSCodeCommit {

    protected AbstractAWSCodeCommit() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetRepositoriesResult batchGetRepositories(BatchGetRepositoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBranchResult createBranch(CreateBranchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBranchResult getBranch(GetBranchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCommitResult getCommit(GetCommitRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRepositoryResult getRepository(GetRepositoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRepositoryTriggersResult getRepositoryTriggers(GetRepositoryTriggersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBranchesResult listBranches(ListBranchesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRepositoryTriggersResult putRepositoryTriggers(PutRepositoryTriggersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestRepositoryTriggersResult testRepositoryTriggers(TestRepositoryTriggersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDefaultBranchResult updateDefaultBranch(UpdateDefaultBranchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRepositoryDescriptionResult updateRepositoryDescription(UpdateRepositoryDescriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRepositoryNameResult updateRepositoryName(UpdateRepositoryNameRequest request) {
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
