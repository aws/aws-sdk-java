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
package com.amazonaws.services.mediastore;

import javax.annotation.Generated;

import com.amazonaws.services.mediastore.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSMediaStore}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaStore implements AWSMediaStore {

    protected AbstractAWSMediaStore() {
    }

    @Override
    public CreateContainerResult createContainer(CreateContainerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteContainerResult deleteContainer(DeleteContainerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteContainerPolicyResult deleteContainerPolicy(DeleteContainerPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCorsPolicyResult deleteCorsPolicy(DeleteCorsPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeContainerResult describeContainer(DescribeContainerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContainerPolicyResult getContainerPolicy(GetContainerPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCorsPolicyResult getCorsPolicy(GetCorsPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListContainersResult listContainers(ListContainersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutContainerPolicyResult putContainerPolicy(PutContainerPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutCorsPolicyResult putCorsPolicy(PutCorsPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartAccessLoggingResult startAccessLogging(StartAccessLoggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopAccessLoggingResult stopAccessLogging(StopAccessLoggingRequest request) {
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
