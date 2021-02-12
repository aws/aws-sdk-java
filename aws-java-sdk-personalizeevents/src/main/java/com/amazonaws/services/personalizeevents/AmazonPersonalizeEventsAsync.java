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
package com.amazonaws.services.personalizeevents;

import javax.annotation.Generated;

import com.amazonaws.services.personalizeevents.model.*;

/**
 * Interface for accessing Amazon Personalize Events asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalizeevents.AbstractAmazonPersonalizeEventsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Personalize can consume real-time user event data, such as <i>stream</i> or <i>click</i> data, and use it for
 * model training either alone or combined with historical data. For more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalizeEventsAsync extends AmazonPersonalizeEvents {

    /**
     * <p>
     * Records user interaction event data. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
     * </p>
     * 
     * @param putEventsRequest
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonPersonalizeEventsAsync.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Records user interaction event data. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
     * </p>
     * 
     * @param putEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonPersonalizeEventsAsyncHandler.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler);

    /**
     * <p>
     * Adds one or more items to an Items dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html">Importing Items Incrementally</a>.
     * </p>
     * 
     * @param putItemsRequest
     * @return A Java Future containing the result of the PutItems operation returned by the service.
     * @sample AmazonPersonalizeEventsAsync.PutItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutItemsResult> putItemsAsync(PutItemsRequest putItemsRequest);

    /**
     * <p>
     * Adds one or more items to an Items dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html">Importing Items Incrementally</a>.
     * </p>
     * 
     * @param putItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutItems operation returned by the service.
     * @sample AmazonPersonalizeEventsAsyncHandler.PutItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutItemsResult> putItemsAsync(PutItemsRequest putItemsRequest,
            com.amazonaws.handlers.AsyncHandler<PutItemsRequest, PutItemsResult> asyncHandler);

    /**
     * <p>
     * Adds one or more users to a Users dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-users.html">Importing Users Incrementally</a>.
     * </p>
     * 
     * @param putUsersRequest
     * @return A Java Future containing the result of the PutUsers operation returned by the service.
     * @sample AmazonPersonalizeEventsAsync.PutUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutUsers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutUsersResult> putUsersAsync(PutUsersRequest putUsersRequest);

    /**
     * <p>
     * Adds one or more users to a Users dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-users.html">Importing Users Incrementally</a>.
     * </p>
     * 
     * @param putUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutUsers operation returned by the service.
     * @sample AmazonPersonalizeEventsAsyncHandler.PutUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutUsers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutUsersResult> putUsersAsync(PutUsersRequest putUsersRequest,
            com.amazonaws.handlers.AsyncHandler<PutUsersRequest, PutUsersResult> asyncHandler);

}
