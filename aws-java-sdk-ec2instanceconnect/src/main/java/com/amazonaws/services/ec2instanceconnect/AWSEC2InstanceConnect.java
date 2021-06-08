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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ec2instanceconnect.model.*;

/**
 * Interface for accessing EC2 Instance Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnect} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EC2 Instance Connect enables system administrators to publish one-time use SSH public keys to EC2, providing
 * users a simple and secure way to connect to their instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEC2InstanceConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ec2-instance-connect";

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60
     * seconds. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Connect-using-EC2-Instance-Connect.html">Connect to
     * your Linux instance using EC2 Instance Connect</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSSHPublicKeyRequest
     * @return Result of the SendSSHPublicKey operation returned by the service.
     * @throws AuthException
     *         Either your AWS credentials are not valid or you do not have access to the EC2 instance.
     * @throws InvalidArgsException
     *         One of the parameters is not valid.
     * @throws ServiceException
     *         The service encountered an error. Follow the instructions in the error message and try again.
     * @throws ThrottlingException
     *         The requests were made too frequently and have been throttled. Wait a while and try again. To increase
     *         the limit on your request frequency, contact AWS Support.
     * @throws EC2InstanceNotFoundException
     *         The specified instance was not found.
     * @sample AWSEC2InstanceConnect.SendSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    SendSSHPublicKeyResult sendSSHPublicKey(SendSSHPublicKeyRequest sendSSHPublicKeyRequest);

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60
     * seconds to establish a serial console connection to the instance using SSH. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-serial-console.html">EC2 Serial Console</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSerialConsoleSSHPublicKeyRequest
     * @return Result of the SendSerialConsoleSSHPublicKey operation returned by the service.
     * @throws AuthException
     *         Either your AWS credentials are not valid or you do not have access to the EC2 instance.
     * @throws SerialConsoleAccessDisabledException
     *         Your account is not authorized to use the EC2 Serial Console. To authorize your account, run the
     *         EnableSerialConsoleAccess API. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableSerialConsoleAccess.html"
     *         >EnableSerialConsoleAccess</a> in the <i>Amazon EC2 API Reference</i>.
     * @throws InvalidArgsException
     *         One of the parameters is not valid.
     * @throws ServiceException
     *         The service encountered an error. Follow the instructions in the error message and try again.
     * @throws ThrottlingException
     *         The requests were made too frequently and have been throttled. Wait a while and try again. To increase
     *         the limit on your request frequency, contact AWS Support.
     * @throws EC2InstanceNotFoundException
     *         The specified instance was not found.
     * @throws EC2InstanceTypeInvalidException
     *         The instance type is not supported for connecting via the serial console. Only Nitro instance types are
     *         currently supported.
     * @throws SerialConsoleSessionLimitExceededException
     *         The instance currently has 1 active serial console session. Only 1 session is supported at a time.
     * @throws SerialConsoleSessionUnavailableException
     *         Unable to start a serial console session. Please try again.
     * @sample AWSEC2InstanceConnect.SendSerialConsoleSSHPublicKey
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    SendSerialConsoleSSHPublicKeyResult sendSerialConsoleSSHPublicKey(SendSerialConsoleSSHPublicKeyRequest sendSerialConsoleSSHPublicKeyRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
