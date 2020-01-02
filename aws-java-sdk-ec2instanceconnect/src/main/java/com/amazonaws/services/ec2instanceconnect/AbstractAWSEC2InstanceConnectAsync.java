/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2instanceconnect;

import javax.annotation.Generated;

import com.amazonaws.services.ec2instanceconnect.model.*;

/**
 * Abstract implementation of {@code AWSEC2InstanceConnectAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSEC2InstanceConnectAsync extends AbstractAWSEC2InstanceConnect implements AWSEC2InstanceConnectAsync {

    protected AbstractAWSEC2InstanceConnectAsync() {
    }

    @Override
    public java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(SendSSHPublicKeyRequest request) {

        return sendSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(SendSSHPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<SendSSHPublicKeyRequest, SendSSHPublicKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
