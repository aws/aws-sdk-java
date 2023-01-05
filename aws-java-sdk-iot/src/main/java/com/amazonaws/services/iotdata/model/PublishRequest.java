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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the Publish operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/Publish" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The Quality of Service (QoS) level. The default QoS level is 0.
     * </p>
     */
    private Integer qos;
    /**
     * <p>
     * A Boolean value that determines whether to set the RETAIN flag when the message is published.
     * </p>
     * <p>
     * Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default value: <code>false</code>
     * </p>
     */
    private Boolean retain;
    /**
     * <p>
     * The message body. MQTT accepts text, binary, and empty (null) message payloads.
     * </p>
     * <p>
     * Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message identified
     * by <b>topic</b> from Amazon Web Services IoT Core.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you must
     * encode the JSON string to base64 format before adding it to the HTTP header. <code>userProperties</code> is an
     * HTTP header value in the API.
     * </p>
     * <p>
     * The following example <code>userProperties</code> parameter is a JSON string which represents two User
     * Properties. Note that it needs to be base64-encoded:
     * </p>
     * <p>
     * <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     * </p>
     */
    private String userProperties;
    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     * <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * </p>
     */
    private String payloadFormatIndicator;
    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing message.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     * describe the topic which the receiver should publish to as part of the request-response flow. The topic must not
     * contain wildcard characters.
     * </p>
     */
    private String responseTopic;
    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message to identify which request the response
     * message is for when it's received. <code>correlationData</code> is an HTTP header value in the API.
     * </p>
     */
    private String correlationData;
    /**
     * <p>
     * A user-defined integer value that represents the message expiry interval in seconds. If absent, the message
     * doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web Services IoT
     * Core message broker and protocol limits and quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     */
    private Long messageExpiry;

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @return The name of the MQTT topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level. The default QoS level is 0.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level. The default QoS level is 0.
     */

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level. The default QoS level is 0.
     * </p>
     * 
     * @return The Quality of Service (QoS) level. The default QoS level is 0.
     */

    public Integer getQos() {
        return this.qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level. The default QoS level is 0.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level. The default QoS level is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withQos(Integer qos) {
        setQos(qos);
        return this;
    }

    /**
     * <p>
     * A Boolean value that determines whether to set the RETAIN flag when the message is published.
     * </p>
     * <p>
     * Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default value: <code>false</code>
     * </p>
     * 
     * @param retain
     *        A Boolean value that determines whether to set the RETAIN flag when the message is published.</p>
     *        <p>
     *        Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default value: <code>false</code>
     */

    public void setRetain(Boolean retain) {
        this.retain = retain;
    }

    /**
     * <p>
     * A Boolean value that determines whether to set the RETAIN flag when the message is published.
     * </p>
     * <p>
     * Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default value: <code>false</code>
     * </p>
     * 
     * @return A Boolean value that determines whether to set the RETAIN flag when the message is published.</p>
     *         <p>
     *         Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default value: <code>false</code>
     */

    public Boolean getRetain() {
        return this.retain;
    }

    /**
     * <p>
     * A Boolean value that determines whether to set the RETAIN flag when the message is published.
     * </p>
     * <p>
     * Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default value: <code>false</code>
     * </p>
     * 
     * @param retain
     *        A Boolean value that determines whether to set the RETAIN flag when the message is published.</p>
     *        <p>
     *        Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default value: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withRetain(Boolean retain) {
        setRetain(retain);
        return this;
    }

    /**
     * <p>
     * A Boolean value that determines whether to set the RETAIN flag when the message is published.
     * </p>
     * <p>
     * Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default value: <code>false</code>
     * </p>
     * 
     * @return A Boolean value that determines whether to set the RETAIN flag when the message is published.</p>
     *         <p>
     *         Setting the RETAIN flag causes the message to be retained and sent to new subscribers to the topic.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default value: <code>false</code>
     */

    public Boolean isRetain() {
        return this.retain;
    }

    /**
     * <p>
     * The message body. MQTT accepts text, binary, and empty (null) message payloads.
     * </p>
     * <p>
     * Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message identified
     * by <b>topic</b> from Amazon Web Services IoT Core.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        The message body. MQTT accepts text, binary, and empty (null) message payloads.</p>
     *        <p>
     *        Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message
     *        identified by <b>topic</b> from Amazon Web Services IoT Core.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The message body. MQTT accepts text, binary, and empty (null) message payloads.
     * </p>
     * <p>
     * Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message identified
     * by <b>topic</b> from Amazon Web Services IoT Core.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The message body. MQTT accepts text, binary, and empty (null) message payloads.</p>
     *         <p>
     *         Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message
     *         identified by <b>topic</b> from Amazon Web Services IoT Core.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The message body. MQTT accepts text, binary, and empty (null) message payloads.
     * </p>
     * <p>
     * Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message identified
     * by <b>topic</b> from Amazon Web Services IoT Core.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        The message body. MQTT accepts text, binary, and empty (null) message payloads.</p>
     *        <p>
     *        Publishing an empty (null) payload with <b>retain</b> = <code>true</code> deletes the retained message
     *        identified by <b>topic</b> from Amazon Web Services IoT Core.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you must
     * encode the JSON string to base64 format before adding it to the HTTP header. <code>userProperties</code> is an
     * HTTP header value in the API.
     * </p>
     * <p>
     * The following example <code>userProperties</code> parameter is a JSON string which represents two User
     * Properties. Note that it needs to be base64-encoded:
     * </p>
     * <p>
     * <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param userProperties
     *        A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you
     *        must encode the JSON string to base64 format before adding it to the HTTP header.
     *        <code>userProperties</code> is an HTTP header value in the API.</p>
     *        <p>
     *        The following example <code>userProperties</code> parameter is a JSON string which represents two User
     *        Properties. Note that it needs to be base64-encoded:
     *        </p>
     *        <p>
     *        <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     */

    public void setUserProperties(String userProperties) {
        this.userProperties = userProperties;
    }

    /**
     * <p>
     * A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you must
     * encode the JSON string to base64 format before adding it to the HTTP header. <code>userProperties</code> is an
     * HTTP header value in the API.
     * </p>
     * <p>
     * The following example <code>userProperties</code> parameter is a JSON string which represents two User
     * Properties. Note that it needs to be base64-encoded:
     * </p>
     * <p>
     * <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI,
     *         you must encode the JSON string to base64 format before adding it to the HTTP header.
     *         <code>userProperties</code> is an HTTP header value in the API.</p>
     *         <p>
     *         The following example <code>userProperties</code> parameter is a JSON string which represents two User
     *         Properties. Note that it needs to be base64-encoded:
     *         </p>
     *         <p>
     *         <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     */

    public String getUserProperties() {
        return this.userProperties;
    }

    /**
     * <p>
     * A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you must
     * encode the JSON string to base64 format before adding it to the HTTP header. <code>userProperties</code> is an
     * HTTP header value in the API.
     * </p>
     * <p>
     * The following example <code>userProperties</code> parameter is a JSON string which represents two User
     * Properties. Note that it needs to be base64-encoded:
     * </p>
     * <p>
     * <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param userProperties
     *        A JSON string that contains an array of JSON objects. If you don’t use Amazon Web Services SDK or CLI, you
     *        must encode the JSON string to base64 format before adding it to the HTTP header.
     *        <code>userProperties</code> is an HTTP header value in the API.</p>
     *        <p>
     *        The following example <code>userProperties</code> parameter is a JSON string which represents two User
     *        Properties. Note that it needs to be base64-encoded:
     *        </p>
     *        <p>
     *        <code>[{"deviceName": "alpha"}, {"deviceCnt": "45"}]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withUserProperties(String userProperties) {
        setUserProperties(userProperties);
        return this;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     * <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * </p>
     * 
     * @param payloadFormatIndicator
     *        An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     *        <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * @see PayloadFormatIndicator
     */

    public void setPayloadFormatIndicator(String payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     * <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * </p>
     * 
     * @return An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     *         <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * @see PayloadFormatIndicator
     */

    public String getPayloadFormatIndicator() {
        return this.payloadFormatIndicator;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     * <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * </p>
     * 
     * @param payloadFormatIndicator
     *        An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     *        <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadFormatIndicator
     */

    public PublishRequest withPayloadFormatIndicator(String payloadFormatIndicator) {
        setPayloadFormatIndicator(payloadFormatIndicator);
        return this;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     * <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * </p>
     * 
     * @param payloadFormatIndicator
     *        An <code>Enum</code> string value that indicates whether the payload is formatted as UTF-8.
     *        <code>payloadFormatIndicator</code> is an HTTP header value in the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadFormatIndicator
     */

    public PublishRequest withPayloadFormatIndicator(PayloadFormatIndicator payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator.toString();
        return this;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing message.
     * </p>
     * 
     * @param contentType
     *        A UTF-8 encoded string that describes the content of the publishing message.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing message.
     * </p>
     * 
     * @return A UTF-8 encoded string that describes the content of the publishing message.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing message.
     * </p>
     * 
     * @param contentType
     *        A UTF-8 encoded string that describes the content of the publishing message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     * describe the topic which the receiver should publish to as part of the request-response flow. The topic must not
     * contain wildcard characters.
     * </p>
     * 
     * @param responseTopic
     *        A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     *        describe the topic which the receiver should publish to as part of the request-response flow. The topic
     *        must not contain wildcard characters.
     */

    public void setResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     * describe the topic which the receiver should publish to as part of the request-response flow. The topic must not
     * contain wildcard characters.
     * </p>
     * 
     * @return A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used
     *         to describe the topic which the receiver should publish to as part of the request-response flow. The
     *         topic must not contain wildcard characters.
     */

    public String getResponseTopic() {
        return this.responseTopic;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     * describe the topic which the receiver should publish to as part of the request-response flow. The topic must not
     * contain wildcard characters.
     * </p>
     * 
     * @param responseTopic
     *        A UTF-8 encoded string that's used as the topic name for a response message. The response topic is used to
     *        describe the topic which the receiver should publish to as part of the request-response flow. The topic
     *        must not contain wildcard characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withResponseTopic(String responseTopic) {
        setResponseTopic(responseTopic);
        return this;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message to identify which request the response
     * message is for when it's received. <code>correlationData</code> is an HTTP header value in the API.
     * </p>
     * 
     * @param correlationData
     *        The base64-encoded binary data used by the sender of the request message to identify which request the
     *        response message is for when it's received. <code>correlationData</code> is an HTTP header value in the
     *        API.
     */

    public void setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message to identify which request the response
     * message is for when it's received. <code>correlationData</code> is an HTTP header value in the API.
     * </p>
     * 
     * @return The base64-encoded binary data used by the sender of the request message to identify which request the
     *         response message is for when it's received. <code>correlationData</code> is an HTTP header value in the
     *         API.
     */

    public String getCorrelationData() {
        return this.correlationData;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message to identify which request the response
     * message is for when it's received. <code>correlationData</code> is an HTTP header value in the API.
     * </p>
     * 
     * @param correlationData
     *        The base64-encoded binary data used by the sender of the request message to identify which request the
     *        response message is for when it's received. <code>correlationData</code> is an HTTP header value in the
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withCorrelationData(String correlationData) {
        setCorrelationData(correlationData);
        return this;
    }

    /**
     * <p>
     * A user-defined integer value that represents the message expiry interval in seconds. If absent, the message
     * doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web Services IoT
     * Core message broker and protocol limits and quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * 
     * @param messageExpiry
     *        A user-defined integer value that represents the message expiry interval in seconds. If absent, the
     *        message doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web
     *        Services IoT Core message broker and protocol limits and quotas </a> from the Amazon Web Services
     *        Reference Guide.
     */

    public void setMessageExpiry(Long messageExpiry) {
        this.messageExpiry = messageExpiry;
    }

    /**
     * <p>
     * A user-defined integer value that represents the message expiry interval in seconds. If absent, the message
     * doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web Services IoT
     * Core message broker and protocol limits and quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * 
     * @return A user-defined integer value that represents the message expiry interval in seconds. If absent, the
     *         message doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web
     *         Services IoT Core message broker and protocol limits and quotas </a> from the Amazon Web Services
     *         Reference Guide.
     */

    public Long getMessageExpiry() {
        return this.messageExpiry;
    }

    /**
     * <p>
     * A user-defined integer value that represents the message expiry interval in seconds. If absent, the message
     * doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web Services IoT
     * Core message broker and protocol limits and quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * 
     * @param messageExpiry
     *        A user-defined integer value that represents the message expiry interval in seconds. If absent, the
     *        message doesn't expire. For more information about the limits of <code>messageExpiry</code>, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot-core.html#message-broker-limits">Amazon Web
     *        Services IoT Core message broker and protocol limits and quotas </a> from the Amazon Web Services
     *        Reference Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withMessageExpiry(Long messageExpiry) {
        setMessageExpiry(messageExpiry);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getQos() != null)
            sb.append("Qos: ").append(getQos()).append(",");
        if (getRetain() != null)
            sb.append("Retain: ").append(getRetain()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getUserProperties() != null)
            sb.append("UserProperties: ").append(getUserProperties()).append(",");
        if (getPayloadFormatIndicator() != null)
            sb.append("PayloadFormatIndicator: ").append(getPayloadFormatIndicator()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getResponseTopic() != null)
            sb.append("ResponseTopic: ").append(getResponseTopic()).append(",");
        if (getCorrelationData() != null)
            sb.append("CorrelationData: ").append(getCorrelationData()).append(",");
        if (getMessageExpiry() != null)
            sb.append("MessageExpiry: ").append(getMessageExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
            return false;
        if (other.getRetain() == null ^ this.getRetain() == null)
            return false;
        if (other.getRetain() != null && other.getRetain().equals(this.getRetain()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getUserProperties() == null ^ this.getUserProperties() == null)
            return false;
        if (other.getUserProperties() != null && other.getUserProperties().equals(this.getUserProperties()) == false)
            return false;
        if (other.getPayloadFormatIndicator() == null ^ this.getPayloadFormatIndicator() == null)
            return false;
        if (other.getPayloadFormatIndicator() != null && other.getPayloadFormatIndicator().equals(this.getPayloadFormatIndicator()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getResponseTopic() == null ^ this.getResponseTopic() == null)
            return false;
        if (other.getResponseTopic() != null && other.getResponseTopic().equals(this.getResponseTopic()) == false)
            return false;
        if (other.getCorrelationData() == null ^ this.getCorrelationData() == null)
            return false;
        if (other.getCorrelationData() != null && other.getCorrelationData().equals(this.getCorrelationData()) == false)
            return false;
        if (other.getMessageExpiry() == null ^ this.getMessageExpiry() == null)
            return false;
        if (other.getMessageExpiry() != null && other.getMessageExpiry().equals(this.getMessageExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode + ((getRetain() == null) ? 0 : getRetain().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getUserProperties() == null) ? 0 : getUserProperties().hashCode());
        hashCode = prime * hashCode + ((getPayloadFormatIndicator() == null) ? 0 : getPayloadFormatIndicator().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getResponseTopic() == null) ? 0 : getResponseTopic().hashCode());
        hashCode = prime * hashCode + ((getCorrelationData() == null) ? 0 : getCorrelationData().hashCode());
        hashCode = prime * hashCode + ((getMessageExpiry() == null) ? 0 : getMessageExpiry().hashCode());
        return hashCode;
    }

    @Override
    public PublishRequest clone() {
        return (PublishRequest) super.clone();
    }

}
