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

import com.amazonaws.services.connectcontactlens.model.*;

/**
 * Interface for accessing Amazon Connect Contact Lens asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcontactlens.AbstractAmazonConnectContactLensAsync} instead.
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
public interface AmazonConnectContactLensAsync extends AmazonConnectContactLens {

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsRequest
     * @return A Java Future containing the result of the ListRealtimeContactAnalysisSegments operation returned by the
     *         service.
     * @sample AmazonConnectContactLensAsync.ListRealtimeContactAnalysisSegments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/ListRealtimeContactAnalysisSegments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            ListRealtimeContactAnalysisSegmentsRequest listRealtimeContactAnalysisSegmentsRequest);

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRealtimeContactAnalysisSegments operation returned by the
     *         service.
     * @sample AmazonConnectContactLensAsyncHandler.ListRealtimeContactAnalysisSegments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/ListRealtimeContactAnalysisSegments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            ListRealtimeContactAnalysisSegmentsRequest listRealtimeContactAnalysisSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRealtimeContactAnalysisSegmentsRequest, ListRealtimeContactAnalysisSegmentsResult> asyncHandler);

}
