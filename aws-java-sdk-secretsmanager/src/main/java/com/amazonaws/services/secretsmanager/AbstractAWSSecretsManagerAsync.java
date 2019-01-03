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

/**
 * Abstract implementation of {@code AWSSecretsManagerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSecretsManagerAsync extends AbstractAWSSecretsManager implements AWSSecretsManagerAsync {

    protected AbstractAWSSecretsManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest request) {

        return cancelRotateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelRotateSecretRequest, CancelRotateSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest request) {

        return createSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSecretRequest, CreateSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest request) {

        return deleteSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSecretRequest, DeleteSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest request) {

        return describeSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSecretRequest, DescribeSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest request) {

        return getRandomPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRandomPasswordRequest, GetRandomPasswordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest request) {

        return getSecretValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSecretValueRequest, GetSecretValueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest request) {

        return listSecretVersionIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSecretVersionIdsRequest, ListSecretVersionIdsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest request) {

        return listSecretsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSecretsRequest, ListSecretsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest request) {

        return putSecretValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSecretValueRequest, PutSecretValueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest request) {

        return restoreSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreSecretRequest, RestoreSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest request) {

        return rotateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<RotateSecretRequest, RotateSecretResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest request) {

        return updateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretRequest, UpdateSecretResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest request) {

        return updateSecretVersionStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSecretVersionStageRequest, UpdateSecretVersionStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
