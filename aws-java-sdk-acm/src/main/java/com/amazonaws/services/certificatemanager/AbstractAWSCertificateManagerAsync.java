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
package com.amazonaws.services.certificatemanager;

import javax.annotation.Generated;

import com.amazonaws.services.certificatemanager.model.*;

/**
 * Abstract implementation of {@code AWSCertificateManagerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCertificateManagerAsync extends AbstractAWSCertificateManager implements AWSCertificateManagerAsync {

    protected AbstractAWSCertificateManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest request) {

        return addTagsToCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToCertificateRequest, AddTagsToCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportCertificateResult> exportCertificateAsync(ExportCertificateRequest request) {

        return exportCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportCertificateResult> exportCertificateAsync(ExportCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportCertificateRequest, ExportCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest request) {

        return getCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest request) {

        return importCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest request) {

        return listTagsForCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForCertificateRequest, ListTagsForCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(RemoveTagsFromCertificateRequest request) {

        return removeTagsFromCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(RemoveTagsFromCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromCertificateRequest, RemoveTagsFromCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RenewCertificateResult> renewCertificateAsync(RenewCertificateRequest request) {

        return renewCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewCertificateResult> renewCertificateAsync(RenewCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<RenewCertificateRequest, RenewCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest request) {

        return requestCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestCertificateRequest, RequestCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest request) {

        return resendValidationEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest request,
            com.amazonaws.handlers.AsyncHandler<ResendValidationEmailRequest, ResendValidationEmailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateOptionsResult> updateCertificateOptionsAsync(UpdateCertificateOptionsRequest request) {

        return updateCertificateOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateOptionsResult> updateCertificateOptionsAsync(UpdateCertificateOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateOptionsRequest, UpdateCertificateOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
