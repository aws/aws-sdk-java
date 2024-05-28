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
package com.amazonaws.services.paymentcryptography;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;

/**
 * Abstract implementation of {@code AWSPaymentCryptographyAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSPaymentCryptographyAsync extends AbstractAWSPaymentCryptography implements AWSPaymentCryptographyAsync {

    protected AbstractAWSPaymentCryptographyAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest request) {

        return createKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request) {

        return deleteKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(ExportKeyRequest request) {

        return exportKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(ExportKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportKeyRequest, ExportKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request) {

        return getAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request) {

        return getKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(GetParametersForExportRequest request) {

        return getParametersForExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(GetParametersForExportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetParametersForExportRequest, GetParametersForExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest request) {

        return getParametersForImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(GetPublicKeyCertificateRequest request) {

        return getPublicKeyCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(GetPublicKeyCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPublicKeyCertificateRequest, GetPublicKeyCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportKeyResult> importKeyAsync(ImportKeyRequest request) {

        return importKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyResult> importKeyAsync(ImportKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportKeyRequest, ImportKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

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
    public java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(RestoreKeyRequest request) {

        return restoreKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(RestoreKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreKeyRequest, RestoreKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(StartKeyUsageRequest request) {

        return startKeyUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(StartKeyUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<StartKeyUsageRequest, StartKeyUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(StopKeyUsageRequest request) {

        return stopKeyUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(StopKeyUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<StopKeyUsageRequest, StopKeyUsageResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
