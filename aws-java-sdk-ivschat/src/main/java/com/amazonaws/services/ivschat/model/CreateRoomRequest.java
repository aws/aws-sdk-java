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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Array of logging-configuration identifiers attached to the room.
     * </p>
     */
    private java.util.List<String> loggingConfigurationIdentifiers;
    /**
     * <p>
     * Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
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
     * Configuration information for optional review of messages.
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
     * Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no
     * constraints beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateRoomRequest withLoggingConfigurationIdentifiers(String... loggingConfigurationIdentifiers) {
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

    public CreateRoomRequest withLoggingConfigurationIdentifiers(java.util.Collection<String> loggingConfigurationIdentifiers) {
        setLoggingConfigurationIdentifiers(loggingConfigurationIdentifiers);
        return this;
    }

    /**
     * <p>
     * Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @param maximumMessageLength
     *        Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     *        applies specifically to rune/code-point count, not number of bytes. Default: 500.
     */

    public void setMaximumMessageLength(Integer maximumMessageLength) {
        this.maximumMessageLength = maximumMessageLength;
    }

    /**
     * <p>
     * Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @return Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this
     *         limit applies specifically to rune/code-point count, not number of bytes. Default: 500.
     */

    public Integer getMaximumMessageLength() {
        return this.maximumMessageLength;
    }

    /**
     * <p>
     * Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     * applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * </p>
     * 
     * @param maximumMessageLength
     *        Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit
     *        applies specifically to rune/code-point count, not number of bytes. Default: 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withMaximumMessageLength(Integer maximumMessageLength) {
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

    public CreateRoomRequest withMaximumMessageRatePerSecond(Integer maximumMessageRatePerSecond) {
        setMaximumMessageRatePerSecond(maximumMessageRatePerSecond);
        return this;
    }

    /**
     * <p>
     * Configuration information for optional review of messages.
     * </p>
     * 
     * @param messageReviewHandler
     *        Configuration information for optional review of messages.
     */

    public void setMessageReviewHandler(MessageReviewHandler messageReviewHandler) {
        this.messageReviewHandler = messageReviewHandler;
    }

    /**
     * <p>
     * Configuration information for optional review of messages.
     * </p>
     * 
     * @return Configuration information for optional review of messages.
     */

    public MessageReviewHandler getMessageReviewHandler() {
        return this.messageReviewHandler;
    }

    /**
     * <p>
     * Configuration information for optional review of messages.
     * </p>
     * 
     * @param messageReviewHandler
     *        Configuration information for optional review of messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withMessageReviewHandler(MessageReviewHandler messageReviewHandler) {
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

    public CreateRoomRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no
     * constraints beyond what is documented there.
     * </p>
     * 
     * @return Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS Chat has no constraints beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no
     * constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *        See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        Chat has no constraints beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no
     * constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags to attach to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *        See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        Chat has no constraints beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRoomRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest clearTagsEntries() {
        this.tags = null;
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
        if (getLoggingConfigurationIdentifiers() != null)
            sb.append("LoggingConfigurationIdentifiers: ").append(getLoggingConfigurationIdentifiers()).append(",");
        if (getMaximumMessageLength() != null)
            sb.append("MaximumMessageLength: ").append(getMaximumMessageLength()).append(",");
        if (getMaximumMessageRatePerSecond() != null)
            sb.append("MaximumMessageRatePerSecond: ").append(getMaximumMessageRatePerSecond()).append(",");
        if (getMessageReviewHandler() != null)
            sb.append("MessageReviewHandler: ").append(getMessageReviewHandler()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoomRequest == false)
            return false;
        CreateRoomRequest other = (CreateRoomRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingConfigurationIdentifiers() == null) ? 0 : getLoggingConfigurationIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getMaximumMessageLength() == null) ? 0 : getMaximumMessageLength().hashCode());
        hashCode = prime * hashCode + ((getMaximumMessageRatePerSecond() == null) ? 0 : getMaximumMessageRatePerSecond().hashCode());
        hashCode = prime * hashCode + ((getMessageReviewHandler() == null) ? 0 : getMessageReviewHandler().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoomRequest clone() {
        return (CreateRoomRequest) super.clone();
    }

}
