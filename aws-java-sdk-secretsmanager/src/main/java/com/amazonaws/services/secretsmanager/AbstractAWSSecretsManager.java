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
package com.amazonaws.services.secretsmanager;

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSecretsManager}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSecretsManager implements AWSSecretsManager {

    protected AbstractAWSSecretsManager() {
    }

    @Override
    public CancelRotateSecretResult cancelRotateSecret(CancelRotateSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSecretResult createSecret(CreateSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSecretResult deleteSecret(DeleteSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSecretResult describeSecret(DescribeSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRandomPasswordResult getRandomPassword(GetRandomPasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSecretValueResult getSecretValue(GetSecretValueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSecretVersionIdsResult listSecretVersionIds(ListSecretVersionIdsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSecretsResult listSecrets(ListSecretsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutSecretValueResult putSecretValue(PutSecretValueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreSecretResult restoreSecret(RestoreSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RotateSecretResult rotateSecret(RotateSecretRequest request) {
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
    public UpdateSecretResult updateSecret(UpdateSecretRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSecretVersionStageResult updateSecretVersionStage(UpdateSecretVersionStageRequest request) {
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
