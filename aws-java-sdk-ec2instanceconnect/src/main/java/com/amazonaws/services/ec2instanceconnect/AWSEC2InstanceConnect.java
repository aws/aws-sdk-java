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
 * AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
 * instances in order to establish connections to their instances without leaving a permanent authentication option.
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
     * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
     * </p>
     * 
     * @param sendSSHPublicKeyRequest
     * @return Result of the SendSSHPublicKey operation returned by the service.
     * @throws AuthException
     *         Indicates that either your AWS credentials are invalid or you do not have access to the EC2 instance.
     * @throws InvalidArgsException
     *         Indicates that you provided bad input. Ensure you have a valid instance ID, the correct zone, and a valid
     *         SSH public key.
     * @throws ServiceException
     *         Indicates that the service encountered an error. Follow the message's instructions and try again.
     * @throws ThrottlingException
     *         Indicates you have been making requests too frequently and have been throttled. Wait for a while and try
     *         again. If higher call volume is warranted contact AWS Support.
     * @throws EC2InstanceNotFoundException
     *         Indicates that the instance requested was not found in the given zone. Check that you have provided a
     *         valid instance ID and the correct zone.
     * @sample AWSEC2InstanceConnect.SendSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    SendSSHPublicKeyResult sendSSHPublicKey(SendSSHPublicKeyRequest sendSSHPublicKeyRequest);

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
