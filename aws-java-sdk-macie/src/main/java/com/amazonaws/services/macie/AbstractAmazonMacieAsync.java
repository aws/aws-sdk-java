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
package com.amazonaws.services.macie;

import javax.annotation.Generated;

import com.amazonaws.services.macie.model.*;

/**
 * Abstract implementation of {@code AmazonMacieAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMacieAsync extends AbstractAmazonMacie implements AmazonMacieAsync {

    protected AbstractAmazonMacieAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(AssociateMemberAccountRequest request) {

        return associateMemberAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(AssociateMemberAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberAccountRequest, AssociateMemberAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(AssociateS3ResourcesRequest request) {

        return associateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(AssociateS3ResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateS3ResourcesRequest, AssociateS3ResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(DisassociateMemberAccountRequest request) {

        return disassociateMemberAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(DisassociateMemberAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberAccountRequest, DisassociateMemberAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(DisassociateS3ResourcesRequest request) {

        return disassociateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(DisassociateS3ResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateS3ResourcesRequest, DisassociateS3ResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request) {

        return listMemberAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(ListS3ResourcesRequest request) {

        return listS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(ListS3ResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListS3ResourcesRequest, ListS3ResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(UpdateS3ResourcesRequest request) {

        return updateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(UpdateS3ResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateS3ResourcesRequest, UpdateS3ResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
