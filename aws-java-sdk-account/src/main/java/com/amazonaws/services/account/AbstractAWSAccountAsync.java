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
package com.amazonaws.services.account;

import javax.annotation.Generated;

import com.amazonaws.services.account.model.*;

/**
 * Abstract implementation of {@code AWSAccountAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAccountAsync extends AbstractAWSAccount implements AWSAccountAsync {

    protected AbstractAWSAccountAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(DeleteAlternateContactRequest request) {

        return deleteAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(DeleteAlternateContactRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAlternateContactRequest, DeleteAlternateContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableRegionResult> disableRegionAsync(DisableRegionRequest request) {

        return disableRegionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRegionResult> disableRegionAsync(DisableRegionRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableRegionRequest, DisableRegionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableRegionResult> enableRegionAsync(EnableRegionRequest request) {

        return enableRegionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRegionResult> enableRegionAsync(EnableRegionRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableRegionRequest, EnableRegionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(GetAlternateContactRequest request) {

        return getAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(GetAlternateContactRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAlternateContactRequest, GetAlternateContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(GetContactInformationRequest request) {

        return getContactInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(GetContactInformationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContactInformationRequest, GetContactInformationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRegionOptStatusResult> getRegionOptStatusAsync(GetRegionOptStatusRequest request) {

        return getRegionOptStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegionOptStatusResult> getRegionOptStatusAsync(GetRegionOptStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRegionOptStatusRequest, GetRegionOptStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResult> listRegionsAsync(ListRegionsRequest request) {

        return listRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResult> listRegionsAsync(ListRegionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRegionsRequest, ListRegionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(PutAlternateContactRequest request) {

        return putAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(PutAlternateContactRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAlternateContactRequest, PutAlternateContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(PutContactInformationRequest request) {

        return putContactInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(PutContactInformationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutContactInformationRequest, PutContactInformationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
