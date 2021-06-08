/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon EC2 Instance Connect enables system administrators to publish one-time use SSH public keys to EC2, providing
 * users a simple and secure way to connect to their instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEC2InstanceConnectAsync extends AWSEC2InstanceConnect {

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60
     * seconds. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Connect-using-EC2-Instance-Connect.html">Connect to
     * your Linux instance using EC2 Instance Connect</a> in the <i>Amazon EC2 User Guide</i>.
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
     * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60
     * seconds. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Connect-using-EC2-Instance-Connect.html">Connect to
     * your Linux instance using EC2 Instance Connect</a> in the <i>Amazon EC2 User Guide</i>.
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

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60
     * seconds to establish a serial console connection to the instance using SSH. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-serial-console.html">EC2 Serial Console</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSerialConsoleSSHPublicKeyRequest
     * @return A Java Future containing the result of the SendSerialConsoleSSHPublicKey operation returned by the
     *         service.
     * @sample AWSEC2InstanceConnectAsync.SendSerialConsoleSSHPublicKey
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendSerialConsoleSSHPublicKeyResult> sendSerialConsoleSSHPublicKeyAsync(
            SendSerialConsoleSSHPublicKeyRequest sendSerialConsoleSSHPublicKeyRequest);

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60
     * seconds to establish a serial console connection to the instance using SSH. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-serial-console.html">EC2 Serial Console</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSerialConsoleSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendSerialConsoleSSHPublicKey operation returned by the
     *         service.
     * @sample AWSEC2InstanceConnectAsyncHandler.SendSerialConsoleSSHPublicKey
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendSerialConsoleSSHPublicKeyResult> sendSerialConsoleSSHPublicKeyAsync(
            SendSerialConsoleSSHPublicKeyRequest sendSerialConsoleSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<SendSerialConsoleSSHPublicKeyRequest, SendSerialConsoleSSHPublicKeyResult> asyncHandler);

}
