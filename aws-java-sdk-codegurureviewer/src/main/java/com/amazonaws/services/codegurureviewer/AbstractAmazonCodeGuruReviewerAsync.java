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
package com.amazonaws.services.codegurureviewer;

import javax.annotation.Generated;

import com.amazonaws.services.codegurureviewer.model.*;

/**
 * Abstract implementation of {@code AmazonCodeGuruReviewerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeGuruReviewerAsync extends AbstractAmazonCodeGuruReviewer implements AmazonCodeGuruReviewerAsync {

    protected AbstractAmazonCodeGuruReviewerAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest request) {

        return associateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateRepositoryRequest, AssociateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(DescribeRepositoryAssociationRequest request) {

        return describeRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(DescribeRepositoryAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoryAssociationRequest, DescribeRepositoryAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest request) {

        return disassociateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateRepositoryRequest, DisassociateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(ListRepositoryAssociationsRequest request) {

        return listRepositoryAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(ListRepositoryAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoryAssociationsRequest, ListRepositoryAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
