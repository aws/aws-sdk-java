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
package com.amazonaws.services.pinpointsmsvoice;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpointsmsvoice.model.*;

/**
 * Interface for accessing Pinpoint SMS Voice.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpointsmsvoice.AbstractAmazonPinpointSMSVoice} instead.
 * </p>
 * <p>
 * Pinpoint SMS and Voice Messaging public facing APIs
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpointSMSVoice {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sms-voice.pinpoint";

    /**
     * Create a new configuration set. After you create the configuration set, you can add one or more event
     * destinations to it.
     * 
     * @param createConfigurationSetRequest
     *        A request to create a new configuration set.
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws LimitExceededException
     *         LimitExceededException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @throws AlreadyExistsException
     *         AlreadyExistsException
     * @sample AmazonPinpointSMSVoice.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * Create a new event destination in a configuration set.
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        Create a new event destination in a configuration set.
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException
     * @throws LimitExceededException
     *         LimitExceededException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws AlreadyExistsException
     *         AlreadyExistsException
     * @sample AmazonPinpointSMSVoice.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

    /**
     * Deletes an existing configuration set.
     * 
     * @param deleteConfigurationSetRequest
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * Deletes an event destination in a configuration set.
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name
     * (ARN) of the destination, and the name of the event destination.
     * 
     * @param getConfigurationSetEventDestinationsRequest
     * @return Result of the GetConfigurationSetEventDestinations operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationSetEventDestinationsResult getConfigurationSetEventDestinations(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest);

    /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
     * 
     * @param listConfigurationSetsRequest
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * Create a new voice message and send it to a recipient's phone number.
     * 
     * @param sendVoiceMessageRequest
     *        SendVoiceMessageRequest
     * @return Result of the SendVoiceMessage operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/SendVoiceMessage"
     *      target="_top">AWS API Documentation</a>
     */
    SendVoiceMessageResult sendVoiceMessage(SendVoiceMessageRequest sendVoiceMessageRequest);

    /**
     * Update an event destination in a configuration set. An event destination is a location that you publish
     * information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when
     * a call fails.
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        UpdateConfigurationSetEventDestinationRequest
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

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
