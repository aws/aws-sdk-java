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
package com.amazonaws.services.transfer;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSTransfer}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSTransfer implements AWSTransfer {

    protected AbstractAWSTransfer() {
    }

    @Override
    public CreateServerResult createServer(CreateServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServerResult deleteServer(DeleteServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSshPublicKeyResult deleteSshPublicKey(DeleteSshPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServerResult describeServer(DescribeServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServersResult listServers(ListServersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartServerResult startServer(StartServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopServerResult stopServer(StopServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestIdentityProviderResult testIdentityProvider(TestIdentityProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServerResult updateServer(UpdateServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
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
