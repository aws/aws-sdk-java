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

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connect.AbstractAmazonConnectAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Connect API Reference provides descriptions, syntax, and usage examples for each of the Amazon Connect
 * actions, data types, parameters, and errors. Amazon Connect is a cloud-based contact center solution that makes it
 * easy to set up and manage a customer contact center and provide reliable customer engagement at any scale.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectAsync extends AmazonConnect {

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
     * @return A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service.
     * @sample AmazonConnectAsync.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest,
            com.amazonaws.handlers.AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler);

    /**
     * <p>
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permissions to the <code>connect:StopContact</code> operation.
     * </p>
     * 
     * @param stopContactRequest
     * @return A Java Future containing the result of the StopContact operation returned by the service.
     * @sample AmazonConnectAsync.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest);

    /**
     * <p>
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permissions to the <code>connect:StopContact</code> operation.
     * </p>
     * 
     * @param stopContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopContact operation returned by the service.
     * @sample AmazonConnectAsyncHandler.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest,
            com.amazonaws.handlers.AsyncHandler<StopContactRequest, StopContactResult> asyncHandler);

}
