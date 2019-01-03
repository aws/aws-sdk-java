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
package com.amazonaws.services.kms;

import javax.annotation.Generated;

import com.amazonaws.services.kms.model.*;

/**
 * Abstract implementation of {@code AWSKMSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKMSAsync extends AbstractAWSKMS implements AWSKMSAsync {

    protected AbstractAWSKMSAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {

        return cancelKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConnectCustomKeyStoreResult> connectCustomKeyStoreAsync(ConnectCustomKeyStoreRequest request) {

        return connectCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectCustomKeyStoreResult> connectCustomKeyStoreAsync(ConnectCustomKeyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<ConnectCustomKeyStoreRequest, ConnectCustomKeyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<CreateCustomKeyStoreResult> createCustomKeyStoreAsync(CreateCustomKeyStoreRequest request) {

        return createCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomKeyStoreResult> createCustomKeyStoreAsync(CreateCustomKeyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomKeyStoreRequest, CreateCustomKeyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest request) {

        return createGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync() {

        return createKeyAsync(new CreateKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateKey operation with an AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        return createKeyAsync(new CreateKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(DecryptRequest request) {

        return decryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(DecryptRequest request,
            com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteCustomKeyStoreResult> deleteCustomKeyStoreAsync(DeleteCustomKeyStoreRequest request) {

        return deleteCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomKeyStoreResult> deleteCustomKeyStoreAsync(DeleteCustomKeyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomKeyStoreRequest, DeleteCustomKeyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request) {

        return deleteImportedKeyMaterialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomKeyStoresResult> describeCustomKeyStoresAsync(DescribeCustomKeyStoresRequest request) {

        return describeCustomKeyStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomKeyStoresResult> describeCustomKeyStoresAsync(DescribeCustomKeyStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomKeyStoresRequest, DescribeCustomKeyStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest request) {

        return describeKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest request) {

        return disableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, DisableKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest request) {

        return disableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectCustomKeyStoreResult> disconnectCustomKeyStoreAsync(DisconnectCustomKeyStoreRequest request) {

        return disconnectCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectCustomKeyStoreResult> disconnectCustomKeyStoreAsync(DisconnectCustomKeyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectCustomKeyStoreRequest, DisconnectCustomKeyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest request) {

        return enableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, EnableKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest request) {

        return enableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(EncryptRequest request) {

        return encryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(EncryptRequest request,
            com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest request) {

        return generateDataKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request) {

        return generateDataKeyWithoutPlaintextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest request) {

        return generateRandomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync() {

        return generateRandomAsync(new GenerateRandomRequest());
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation with an AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        return generateRandomAsync(new GenerateRandomRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest request) {

        return getKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest request) {

        return getKeyRotationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler) {

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
    public java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest request) {

        return importKeyMaterialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync() {

        return listAliasesAsync(new ListAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAliases operation with an AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return listAliasesAsync(new ListAliasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest request) {

        return listGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest request) {

        return listKeyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync() {

        return listKeysAsync(new ListKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListKeys operation with an AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        return listKeysAsync(new ListKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest request) {

        return listResourceTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourceTagsRequest, ListResourceTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {

        return listRetirableGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest request) {

        return putKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest request) {

        return reEncryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest request,
            com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest request) {

        return retireGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync() {

        return retireGrantAsync(new RetireGrantRequest());
    }

    /**
     * Simplified method form for invoking the RetireGrant operation with an AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler) {

        return retireGrantAsync(new RetireGrantRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest request) {

        return revokeGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, RevokeGrantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest request) {

        return scheduleKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest request,
            com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateCustomKeyStoreResult> updateCustomKeyStoreAsync(UpdateCustomKeyStoreRequest request) {

        return updateCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomKeyStoreResult> updateCustomKeyStoreAsync(UpdateCustomKeyStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomKeyStoreRequest, UpdateCustomKeyStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request) {

        return updateKeyDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
