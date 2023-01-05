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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the room to be updated. Currently this must be an ARN.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     */
    private java.util.List<String> loggingConfigurationIdentifiers;
    /**
     * <p>
     * The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     */
    private Integer maximumMessageLength;
    /**
     * <p>
     * Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     * </p>
     */
    private Integer maximumMessageRatePerSecond;
    /**
     * <p>
     * Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     * disassociate a message review handler from the specified room.
     * </p>
     */
    private MessageReviewHandler messageReviewHandler;
    /**
     * <p>
     * Room name. The value does not need to be unique.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Identifier of the room to be updated. Currently this must be an ARN.
     * </p>
     * 
     * @param identifier
     *        Identifier of the room to be updated. Currently this must be an ARN.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifier of the room to be updated. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room to be updated. Currently this must be an ARN.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifier of the room to be updated. Currently this must be an ARN.
     * </p>
     * 
     * @param identifier
     *        Identifier of the room to be updated. Currently this must be an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     * 
     * @return Array of logging-configuration identifiers attached to the room.
     */

    public java.util.List<String> getLoggingConfigurationIdentifiers() {
        return loggingConfigurationIdentifiers;
    }

    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     * 
     * @param loggingConfigurationIdentifiers
     *        Array of logging-configuration identifiers attached to the room.
     */

    public void setLoggingConfigurationIdentifiers(java.util.Collection<String> loggingConfigurationIdentifiers) {
        if (loggingConfigurationIdentifiers == null) {
            this.loggingConfigurationIdentifiers = null;
            return;
        }

        this.loggingConfigurationIdentifiers = new java.util.ArrayList<String>(loggingConfigurationIdentifiers);
    }

    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggingConfigurationIdentifiers(java.util.Collection)} or
     * {@link #withLoggingConfigurationIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loggingConfigurationIdentifiers
     *        Array of logging-configuration identifiers attached to the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withLoggingConfigurationIdentifiers(String... loggingConfigurationIdentifiers) {
        if (this.loggingConfigurationIdentifiers == null) {
            setLoggingConfigurationIdentifiers(new java.util.ArrayList<String>(loggingConfigurationIdentifiers.length));
        }
        for (String ele : loggingConfigurationIdentifiers) {
            this.loggingConfigurationIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     * 
     * @param loggingConfigurationIdentifiers
     *        Array of logging-configuration identifiers attached to the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withLoggingConfigurationIdentifiers(java.util.Collection<String> loggingConfigurationIdentifiers) {
        setLoggingConfigurationIdentifiers(loggingConfigurationIdentifiers);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @param maximumMessageLength
     *        The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this
     *        limit applies specifically to rune/code-point count, not number of bytes. Default: 500.
     */

    public void setMaximumMessageLength(Integer maximumMessageLength) {
        this.maximumMessageLength = maximumMessageLength;
    }

    /**
     * <p>
     * The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @return The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this
     *         limit applies specifically to rune/code-point count, not number of bytes. Default: 500.
     */

    public Integer getMaximumMessageLength() {
        return this.maximumMessageLength;
    }

    /**
     * <p>
     * The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @param maximumMessageLength
     *        The maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this
     *        limit applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withMaximumMessageLength(Integer maximumMessageLength) {
        setMaximumMessageLength(maximumMessageLength);
        return this;
    }

    /**
     * <p>
     * Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     * </p>
     * 
     * @param maximumMessageRatePerSecond
     *        Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     */

    public void setMaximumMessageRatePerSecond(Integer maximumMessageRatePerSecond) {
        this.maximumMessageRatePerSecond = maximumMessageRatePerSecond;
    }

    /**
     * <p>
     * Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     * </p>
     * 
     * @return Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     */

    public Integer getMaximumMessageRatePerSecond() {
        return this.maximumMessageRatePerSecond;
    }

    /**
     * <p>
     * Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     * </p>
     * 
     * @param maximumMessageRatePerSecond
     *        Maximum number of messages per second that can be sent to the room (by all clients). Default: 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withMaximumMessageRatePerSecond(Integer maximumMessageRatePerSecond) {
        setMaximumMessageRatePerSecond(maximumMessageRatePerSecond);
        return this;
    }

    /**
     * <p>
     * Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     * disassociate a message review handler from the specified room.
     * </p>
     * 
     * @param messageReviewHandler
     *        Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     *        disassociate a message review handler from the specified room.
     */

    public void setMessageReviewHandler(MessageReviewHandler messageReviewHandler) {
        this.messageReviewHandler = messageReviewHandler;
    }

    /**
     * <p>
     * Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     * disassociate a message review handler from the specified room.
     * </p>
     * 
     * @return Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     *         disassociate a message review handler from the specified room.
     */

    public MessageReviewHandler getMessageReviewHandler() {
        return this.messageReviewHandler;
    }

    /**
     * <p>
     * Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     * disassociate a message review handler from the specified room.
     * </p>
     * 
     * @param messageReviewHandler
     *        Configuration information for optional review of messages. Specify an empty <code>uri</code> string to
     *        disassociate a message review handler from the specified room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withMessageReviewHandler(MessageReviewHandler messageReviewHandler) {
        setMessageReviewHandler(messageReviewHandler);
        return this;
    }

    /**
     * <p>
     * Room name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Room name. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Room name. The value does not need to be unique.
     * </p>
     * 
     * @return Room name. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Room name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Room name. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withName(String name) {
        setName(name);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLoggingConfigurationIdentifiers() != null)
            sb.append("LoggingConfigurationIdentifiers: ").append(getLoggingConfigurationIdentifiers()).append(",");
        if (getMaximumMessageLength() != null)
            sb.append("MaximumMessageLength: ").append(getMaximumMessageLength()).append(",");
        if (getMaximumMessageRatePerSecond() != null)
            sb.append("MaximumMessageRatePerSecond: ").append(getMaximumMessageRatePerSecond()).append(",");
        if (getMessageReviewHandler() != null)
            sb.append("MessageReviewHandler: ").append(getMessageReviewHandler()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoomRequest == false)
            return false;
        UpdateRoomRequest other = (UpdateRoomRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLoggingConfigurationIdentifiers() == null ^ this.getLoggingConfigurationIdentifiers() == null)
            return false;
        if (other.getLoggingConfigurationIdentifiers() != null
                && other.getLoggingConfigurationIdentifiers().equals(this.getLoggingConfigurationIdentifiers()) == false)
            return false;
        if (other.getMaximumMessageLength() == null ^ this.getMaximumMessageLength() == null)
            return false;
        if (other.getMaximumMessageLength() != null && other.getMaximumMessageLength().equals(this.getMaximumMessageLength()) == false)
            return false;
        if (other.getMaximumMessageRatePerSecond() == null ^ this.getMaximumMessageRatePerSecond() == null)
            return false;
        if (other.getMaximumMessageRatePerSecond() != null && other.getMaximumMessageRatePerSecond().equals(this.getMaximumMessageRatePerSecond()) == false)
            return false;
        if (other.getMessageReviewHandler() == null ^ this.getMessageReviewHandler() == null)
            return false;
        if (other.getMessageReviewHandler() != null && other.getMessageReviewHandler().equals(this.getMessageReviewHandler()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfigurationIdentifiers() == null) ? 0 : getLoggingConfigurationIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getMaximumMessageLength() == null) ? 0 : getMaximumMessageLength().hashCode());
        hashCode = prime * hashCode + ((getMaximumMessageRatePerSecond() == null) ? 0 : getMaximumMessageRatePerSecond().hashCode());
        hashCode = prime * hashCode + ((getMessageReviewHandler() == null) ? 0 : getMessageReviewHandler().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoomRequest clone() {
        return (UpdateRoomRequest) super.clone();
    }

}
