/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connect.AbstractAmazonConnect} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Connect API Reference provides descriptions, syntax, and usage examples for each of the Amazon Connect
 * actions, data types, parameters, and errors. Amazon Connect is a cloud-based contact center solution that makes it
 * easy to set up and manage a customer contact center and provide reliable customer engagement at any scale.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "connect";

    /**
     * <p>
     * The <code>StartOutboundVoiceContact</code> operation initiates a contact flow to place an outbound call to a
     * customer.
     * </p>
     * <p>
     * There is a throttling limit placed on usage of the API that includes a <code>RateLimit</code> of 2 per second,
     * and a <code>BurstLimit</code> of 5 per second.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permissions to the <code>connect:StartOutboundVoiceContact</code>
     * action.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return Result of the StartOutboundVoiceContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws LimitExceededException
     *         The limit exceeded the maximum allowed active calls in a queue.
     * @throws DestinationNotAllowedException
     *         Outbound calls to the destination number are not allowed for your instance. You can request that the
     *         country be included in the allowed countries for your instance by submitting a <a
     *         href="https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase">Service
     *         Limit Increase</a>.
     * @throws OutboundContactNotPermittedException
     *         The contact is not permitted because outbound calling is not enabled for the instance.
     * @sample AmazonConnect.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    StartOutboundVoiceContactResult startOutboundVoiceContact(StartOutboundVoiceContactRequest startOutboundVoiceContactRequest);

    /**
     * <p>
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permissions to the <code>connect:StopContact</code> operation.
     * </p>
     * 
     * @param stopContactRequest
     * @return Result of the StopContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ContactNotFoundException
     *         The contact with the specified ID is not active or does not exist.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    StopContactResult stopContact(StopContactRequest stopContactRequest);

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
