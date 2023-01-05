/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdata;

import javax.annotation.Generated;

import com.amazonaws.services.iotdata.model.*;

/**
 * Interface for accessing AWS IoT Data Plane asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotdata.AbstractAWSIotDataAsync} instead.
 * </p>
 * <p>
 * <fullname>IoT data</fullname>
 * <p>
 * IoT data enables secure, bi-directional communication between Internet-connected things (such as sensors, actuators,
 * embedded devices, or smart appliances) and the Amazon Web Services cloud. It implements a broker for applications and
 * things to publish messages over HTTP (Publish) and retrieve, update, and delete shadows. A shadow is a persistent
 * representation of your things and their state in the Amazon Web Services cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in IoT data by running this CLI command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Amazon Web
 * ServicesSignature Version 4</a> to sign requests is: <i>iotdevicegateway</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIotDataAsync extends AWSIotData {

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @return A Java Future containing the result of the DeleteThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.DeleteThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/DeleteThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest deleteThingShadowRequest);

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.DeleteThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/DeleteThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest deleteThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingShadowRequest, DeleteThingShadowResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a single retained message for the specified topic.
     * </p>
     * <p>
     * This action returns the message payload of the retained message, which can incur messaging costs. To list only
     * the topic names of the retained messages, call <a
     * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html">ListRetainedMessages</a>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >GetRetainedMessage</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param getRetainedMessageRequest
     *        The input for the GetRetainedMessage operation.
     * @return A Java Future containing the result of the GetRetainedMessage operation returned by the service.
     * @sample AWSIotDataAsync.GetRetainedMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetRetainedMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRetainedMessageResult> getRetainedMessageAsync(GetRetainedMessageRequest getRetainedMessageRequest);

    /**
     * <p>
     * Gets the details of a single retained message for the specified topic.
     * </p>
     * <p>
     * This action returns the message payload of the retained message, which can incur messaging costs. To list only
     * the topic names of the retained messages, call <a
     * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html">ListRetainedMessages</a>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >GetRetainedMessage</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param getRetainedMessageRequest
     *        The input for the GetRetainedMessage operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRetainedMessage operation returned by the service.
     * @sample AWSIotDataAsyncHandler.GetRetainedMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetRetainedMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRetainedMessageResult> getRetainedMessageAsync(GetRetainedMessageRequest getRetainedMessageRequest,
            com.amazonaws.handlers.AsyncHandler<GetRetainedMessageRequest, GetRetainedMessageResult> asyncHandler);

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the IoT
     * Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @return A Java Future containing the result of the GetThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.GetThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest getThingShadowRequest);

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the IoT
     * Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.GetThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest getThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<GetThingShadowRequest, GetThingShadowResult> asyncHandler);

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListNamedShadowsForThing</a> action.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @return A Java Future containing the result of the ListNamedShadowsForThing operation returned by the service.
     * @sample AWSIotDataAsync.ListNamedShadowsForThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListNamedShadowsForThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamedShadowsForThingResult> listNamedShadowsForThingAsync(ListNamedShadowsForThingRequest listNamedShadowsForThingRequest);

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListNamedShadowsForThing</a> action.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamedShadowsForThing operation returned by the service.
     * @sample AWSIotDataAsyncHandler.ListNamedShadowsForThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListNamedShadowsForThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamedShadowsForThingResult> listNamedShadowsForThingAsync(ListNamedShadowsForThingRequest listNamedShadowsForThingRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamedShadowsForThingRequest, ListNamedShadowsForThingResult> asyncHandler);

    /**
     * <p>
     * Lists summary information about the retained messages stored for the account.
     * </p>
     * <p>
     * This action returns only the topic names of the retained messages. It doesn't return any message payloads.
     * Although this action doesn't return a message payload, it can still incur messaging costs.
     * </p>
     * <p>
     * To get the message payload of a retained message, call <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
     * >GetRetainedMessage</a> with the topic name of the retained message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >ListRetainedMessages</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param listRetainedMessagesRequest
     * @return A Java Future containing the result of the ListRetainedMessages operation returned by the service.
     * @sample AWSIotDataAsync.ListRetainedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListRetainedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRetainedMessagesResult> listRetainedMessagesAsync(ListRetainedMessagesRequest listRetainedMessagesRequest);

    /**
     * <p>
     * Lists summary information about the retained messages stored for the account.
     * </p>
     * <p>
     * This action returns only the topic names of the retained messages. It doesn't return any message payloads.
     * Although this action doesn't return a message payload, it can still incur messaging costs.
     * </p>
     * <p>
     * To get the message payload of a retained message, call <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
     * >GetRetainedMessage</a> with the topic name of the retained message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >ListRetainedMessages</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param listRetainedMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRetainedMessages operation returned by the service.
     * @sample AWSIotDataAsyncHandler.ListRetainedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/ListRetainedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRetainedMessagesResult> listRetainedMessagesAsync(ListRetainedMessagesRequest listRetainedMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRetainedMessagesRequest, ListRetainedMessagesResult> asyncHandler);

    /**
     * <p>
     * Publishes an MQTT message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >Publish</a> action.
     * </p>
     * <p>
     * For more information about MQTT messages, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html">MQTT Protocol</a> in the IoT Developer
     * Guide.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AWSIotDataAsync.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest);

    /**
     * <p>
     * Publishes an MQTT message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >Publish</a> action.
     * </p>
     * <p>
     * For more information about MQTT messages, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html">MQTT Protocol</a> in the IoT Developer
     * Guide.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">Amazon Web Services IoT Core pricing - Messaging</a>.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AWSIotDataAsyncHandler.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler);

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @return A Java Future containing the result of the UpdateThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.UpdateThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/UpdateThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest updateThingShadowRequest);

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.UpdateThingShadow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/UpdateThingShadow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest updateThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingShadowRequest, UpdateThingShadowResult> asyncHandler);

}
