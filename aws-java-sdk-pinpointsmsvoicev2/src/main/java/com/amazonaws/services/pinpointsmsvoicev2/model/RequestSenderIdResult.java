/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestSenderId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSenderIdResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the SenderId.
     * </p>
     */
    private String senderIdArn;
    /**
     * <p>
     * The sender ID that was requested.
     * </p>
     */
    private String senderId;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     */
    private java.util.List<String> messageTypes;
    /**
     * <p>
     * The monthly price, in US dollars, to lease the sender ID.
     * </p>
     */
    private String monthlyLeasingPrice;
    /**
     * <p>
     * By default this is set to false. When set to true the sender ID can't be deleted.
     * </p>
     */
    private Boolean deletionProtectionEnabled;
    /**
     * <p>
     * True if the sender ID is registered.
     * </p>
     */
    private Boolean registered;
    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the sender ID.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the SenderId.
     * </p>
     * 
     * @param senderIdArn
     *        The Amazon Resource Name (ARN) associated with the SenderId.
     */

    public void setSenderIdArn(String senderIdArn) {
        this.senderIdArn = senderIdArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the SenderId.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the SenderId.
     */

    public String getSenderIdArn() {
        return this.senderIdArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the SenderId.
     * </p>
     * 
     * @param senderIdArn
     *        The Amazon Resource Name (ARN) associated with the SenderId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withSenderIdArn(String senderIdArn) {
        setSenderIdArn(senderIdArn);
        return this;
    }

    /**
     * <p>
     * The sender ID that was requested.
     * </p>
     * 
     * @param senderId
     *        The sender ID that was requested.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID that was requested.
     * </p>
     * 
     * @return The sender ID that was requested.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The sender ID that was requested.
     * </p>
     * 
     * @param senderId
     *        The sender ID that was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @return The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *         PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public java.util.List<String> getMessageTypes() {
        return messageTypes;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageTypes
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public void setMessageTypes(java.util.Collection<String> messageTypes) {
        if (messageTypes == null) {
            this.messageTypes = null;
            return;
        }

        this.messageTypes = new java.util.ArrayList<String>(messageTypes);
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageTypes(java.util.Collection)} or {@link #withMessageTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param messageTypes
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public RequestSenderIdResult withMessageTypes(String... messageTypes) {
        if (this.messageTypes == null) {
            setMessageTypes(new java.util.ArrayList<String>(messageTypes.length));
        }
        for (String ele : messageTypes) {
            this.messageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageTypes
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public RequestSenderIdResult withMessageTypes(java.util.Collection<String> messageTypes) {
        setMessageTypes(messageTypes);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageTypes
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public RequestSenderIdResult withMessageTypes(MessageType... messageTypes) {
        java.util.ArrayList<String> messageTypesCopy = new java.util.ArrayList<String>(messageTypes.length);
        for (MessageType value : messageTypes) {
            messageTypesCopy.add(value.toString());
        }
        if (getMessageTypes() == null) {
            setMessageTypes(messageTypesCopy);
        } else {
            getMessageTypes().addAll(messageTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The monthly price, in US dollars, to lease the sender ID.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly price, in US dollars, to lease the sender ID.
     */

    public void setMonthlyLeasingPrice(String monthlyLeasingPrice) {
        this.monthlyLeasingPrice = monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly price, in US dollars, to lease the sender ID.
     * </p>
     * 
     * @return The monthly price, in US dollars, to lease the sender ID.
     */

    public String getMonthlyLeasingPrice() {
        return this.monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly price, in US dollars, to lease the sender ID.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly price, in US dollars, to lease the sender ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withMonthlyLeasingPrice(String monthlyLeasingPrice) {
        setMonthlyLeasingPrice(monthlyLeasingPrice);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the sender ID can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the sender ID can't be deleted.
     */

    public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the sender ID can't be deleted.
     * </p>
     * 
     * @return By default this is set to false. When set to true the sender ID can't be deleted.
     */

    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the sender ID can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the sender ID can't be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        setDeletionProtectionEnabled(deletionProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the sender ID can't be deleted.
     * </p>
     * 
     * @return By default this is set to false. When set to true the sender ID can't be deleted.
     */

    public Boolean isDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * True if the sender ID is registered.
     * </p>
     * 
     * @param registered
     *        True if the sender ID is registered.
     */

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    /**
     * <p>
     * True if the sender ID is registered.
     * </p>
     * 
     * @return True if the sender ID is registered.
     */

    public Boolean getRegistered() {
        return this.registered;
    }

    /**
     * <p>
     * True if the sender ID is registered.
     * </p>
     * 
     * @param registered
     *        True if the sender ID is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withRegistered(Boolean registered) {
        setRegistered(registered);
        return this;
    }

    /**
     * <p>
     * True if the sender ID is registered.
     * </p>
     * 
     * @return True if the sender ID is registered.
     */

    public Boolean isRegistered() {
        return this.registered;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the sender ID.
     * </p>
     * 
     * @return An array of tags (key and value pairs) to associate with the sender ID.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the sender ID.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the sender ID.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the sender ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the sender ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the sender ID.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the sender ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSenderIdResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSenderIdArn() != null)
            sb.append("SenderIdArn: ").append(getSenderIdArn()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getMessageTypes() != null)
            sb.append("MessageTypes: ").append(getMessageTypes()).append(",");
        if (getMonthlyLeasingPrice() != null)
            sb.append("MonthlyLeasingPrice: ").append(getMonthlyLeasingPrice()).append(",");
        if (getDeletionProtectionEnabled() != null)
            sb.append("DeletionProtectionEnabled: ").append(getDeletionProtectionEnabled()).append(",");
        if (getRegistered() != null)
            sb.append("Registered: ").append(getRegistered()).append(",");
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

        if (obj instanceof RequestSenderIdResult == false)
            return false;
        RequestSenderIdResult other = (RequestSenderIdResult) obj;
        if (other.getSenderIdArn() == null ^ this.getSenderIdArn() == null)
            return false;
        if (other.getSenderIdArn() != null && other.getSenderIdArn().equals(this.getSenderIdArn()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getMessageTypes() == null ^ this.getMessageTypes() == null)
            return false;
        if (other.getMessageTypes() != null && other.getMessageTypes().equals(this.getMessageTypes()) == false)
            return false;
        if (other.getMonthlyLeasingPrice() == null ^ this.getMonthlyLeasingPrice() == null)
            return false;
        if (other.getMonthlyLeasingPrice() != null && other.getMonthlyLeasingPrice().equals(this.getMonthlyLeasingPrice()) == false)
            return false;
        if (other.getDeletionProtectionEnabled() == null ^ this.getDeletionProtectionEnabled() == null)
            return false;
        if (other.getDeletionProtectionEnabled() != null && other.getDeletionProtectionEnabled().equals(this.getDeletionProtectionEnabled()) == false)
            return false;
        if (other.getRegistered() == null ^ this.getRegistered() == null)
            return false;
        if (other.getRegistered() != null && other.getRegistered().equals(this.getRegistered()) == false)
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

        hashCode = prime * hashCode + ((getSenderIdArn() == null) ? 0 : getSenderIdArn().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getMessageTypes() == null) ? 0 : getMessageTypes().hashCode());
        hashCode = prime * hashCode + ((getMonthlyLeasingPrice() == null) ? 0 : getMonthlyLeasingPrice().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getRegistered() == null) ? 0 : getRegistered().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RequestSenderIdResult clone() {
        try {
            return (RequestSenderIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
