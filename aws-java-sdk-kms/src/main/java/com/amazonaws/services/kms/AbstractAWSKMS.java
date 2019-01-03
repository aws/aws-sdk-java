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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSKMS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKMS implements AWSKMS {

    protected AbstractAWSKMS() {
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
    public CancelKeyDeletionResult cancelKeyDeletion(CancelKeyDeletionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConnectCustomKeyStoreResult connectCustomKeyStore(ConnectCustomKeyStoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCustomKeyStoreResult createCustomKeyStore(CreateCustomKeyStoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGrantResult createGrant(CreateGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeyResult createKey(CreateKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeyResult createKey() {
        return createKey(new CreateKeyRequest());
    }

    @Override
    public DecryptResult decrypt(DecryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCustomKeyStoreResult deleteCustomKeyStore(DeleteCustomKeyStoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteImportedKeyMaterialResult deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCustomKeyStoresResult describeCustomKeyStores(DescribeCustomKeyStoresRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeKeyResult describeKey(DescribeKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableKeyResult disableKey(DisableKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableKeyRotationResult disableKeyRotation(DisableKeyRotationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisconnectCustomKeyStoreResult disconnectCustomKeyStore(DisconnectCustomKeyStoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableKeyResult enableKey(EnableKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableKeyRotationResult enableKeyRotation(EnableKeyRotationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EncryptResult encrypt(EncryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateRandomResult generateRandom(GenerateRandomRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateRandomResult generateRandom() {
        return generateRandom(new GenerateRandomRequest());
    }

    @Override
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetKeyRotationStatusResult getKeyRotationStatus(GetKeyRotationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetParametersForImportResult getParametersForImport(GetParametersForImportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportKeyMaterialResult importKeyMaterial(ImportKeyMaterialRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases() {
        return listAliases(new ListAliasesRequest());
    }

    @Override
    public ListGrantsResult listGrants(ListGrantsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeysResult listKeys(ListKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeysResult listKeys() {
        return listKeys(new ListKeysRequest());
    }

    @Override
    public ListResourceTagsResult listResourceTags(ListResourceTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRetirableGrantsResult listRetirableGrants(ListRetirableGrantsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutKeyPolicyResult putKeyPolicy(PutKeyPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReEncryptResult reEncrypt(ReEncryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RetireGrantResult retireGrant(RetireGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RetireGrantResult retireGrant() {
        return retireGrant(new RetireGrantRequest());
    }

    @Override
    public RevokeGrantResult revokeGrant(RevokeGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScheduleKeyDeletionResult scheduleKeyDeletion(ScheduleKeyDeletionRequest request) {
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
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateCustomKeyStoreResult updateCustomKeyStore(UpdateCustomKeyStoreRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateKeyDescriptionResult updateKeyDescription(UpdateKeyDescriptionRequest request) {
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
