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
package com.amazonaws.services.cloud9;

import javax.annotation.Generated;

import com.amazonaws.services.cloud9.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCloud9}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloud9 implements AWSCloud9 {

    protected AbstractAWSCloud9() {
    }

    @Override
    public CreateEnvironmentEC2Result createEnvironmentEC2(CreateEnvironmentEC2Request request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEnvironmentMembershipResult createEnvironmentMembership(CreateEnvironmentMembershipRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEnvironmentMembershipResult deleteEnvironmentMembership(DeleteEnvironmentMembershipRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEnvironmentMembershipsResult describeEnvironmentMemberships(DescribeEnvironmentMembershipsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEnvironmentStatusResult describeEnvironmentStatus(DescribeEnvironmentStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEnvironmentMembershipResult updateEnvironmentMembership(UpdateEnvironmentMembershipRequest request) {
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
