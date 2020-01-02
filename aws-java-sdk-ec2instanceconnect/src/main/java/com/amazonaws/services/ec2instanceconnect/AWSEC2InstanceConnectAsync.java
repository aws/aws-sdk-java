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
 * Interface for accessing EC2 Instance Connect asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnectAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
 * instances in order to establish connections to their instances without leaving a permanent authentication option.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEC2InstanceConnectAsync extends AWSEC2InstanceConnect {

    /**
     * <p>
     * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
     * </p>
     * 
     * @param sendSSHPublicKeyRequest
     * @return A Java Future containing the result of the SendSSHPublicKey operation returned by the service.
     * @sample AWSEC2InstanceConnectAsync.SendSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(SendSSHPublicKeyRequest sendSSHPublicKeyRequest);

    /**
     * <p>
     * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
     * </p>
     * 
     * @param sendSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendSSHPublicKey operation returned by the service.
     * @sample AWSEC2InstanceConnectAsyncHandler.SendSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendSSHPublicKeyResult> sendSSHPublicKeyAsync(SendSSHPublicKeyRequest sendSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<SendSSHPublicKeyRequest, SendSSHPublicKeyResult> asyncHandler);

}
