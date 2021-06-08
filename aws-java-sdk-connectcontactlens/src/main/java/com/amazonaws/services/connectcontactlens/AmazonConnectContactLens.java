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
package com.amazonaws.services.connectcontactlens;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connectcontactlens.model.*;

/**
 * Interface for accessing Amazon Connect Contact Lens.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcontactlens.AbstractAmazonConnectContactLens} instead.
 * </p>
 * <p>
 * <p>
 * Contact Lens for Amazon Connect enables you to analyze conversations between customer and agents, by using speech
 * transcription, natural language processing, and intelligent search capabilities. It performs sentiment analysis,
 * detects issues, and enables you to automatically categorize contacts.
 * </p>
 * <p>
 * Contact Lens for Amazon Connect provides both real-time and post-call analytics of customer-agent conversations. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/analyze-conversations.html">Analyze conversations using
 * Contact Lens</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectContactLens {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "contact-lens";

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsRequest
     * @return Result of the ListRealtimeContactAnalysisSegments operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnectContactLens.ListRealtimeContactAnalysisSegments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/ListRealtimeContactAnalysisSegments"
     *      target="_top">AWS API Documentation</a>
     */
    ListRealtimeContactAnalysisSegmentsResult listRealtimeContactAnalysisSegments(
            ListRealtimeContactAnalysisSegmentsRequest listRealtimeContactAnalysisSegmentsRequest);

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
