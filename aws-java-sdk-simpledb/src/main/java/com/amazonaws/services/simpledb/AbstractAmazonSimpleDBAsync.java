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
package com.amazonaws.services.simpledb;

import javax.annotation.Generated;

import com.amazonaws.services.simpledb.model.*;

/**
 * Abstract implementation of {@code AmazonSimpleDBAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSimpleDBAsync extends AbstractAmazonSimpleDB implements AmazonSimpleDBAsync {

    protected AbstractAmazonSimpleDBAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(BatchDeleteAttributesRequest request) {

        return batchDeleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(BatchDeleteAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteAttributesRequest, BatchDeleteAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(BatchPutAttributesRequest request) {

        return batchPutAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(BatchPutAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchPutAttributesRequest, BatchPutAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request) {

        return deleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAttributesRequest, DeleteAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest request) {

        return domainMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<DomainMetadataRequest, DomainMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest request) {

        return getAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAttributesRequest, GetAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomainsAsync(ListDomainsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync() {

        return listDomainsAsync(new ListDomainsRequest());
    }

    /**
     * Simplified method form for invoking the ListDomains operation with an AsyncHandler.
     *
     * @see #listDomainsAsync(ListDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        return listDomainsAsync(new ListDomainsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request) {

        return putAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAttributesRequest, PutAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SelectResult> selectAsync(SelectRequest request) {

        return selectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SelectResult> selectAsync(SelectRequest request,
            com.amazonaws.handlers.AsyncHandler<SelectRequest, SelectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
