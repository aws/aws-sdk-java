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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for all SenderIds in an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SenderIdInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SenderIdInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the SenderId.
     * </p>
     */
    private String senderIdArn;
    /**
     * <p>
     * The alphanumeric sender ID in a specific country that you'd like to describe.
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
     * The monthly leasing price, in US dollars.
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
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;

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

    public SenderIdInformation withSenderIdArn(String senderIdArn) {
        setSenderIdArn(senderIdArn);
        return this;
    }

    /**
     * <p>
     * The alphanumeric sender ID in a specific country that you'd like to describe.
     * </p>
     * 
     * @param senderId
     *        The alphanumeric sender ID in a specific country that you'd like to describe.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The alphanumeric sender ID in a specific country that you'd like to describe.
     * </p>
     * 
     * @return The alphanumeric sender ID in a specific country that you'd like to describe.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The alphanumeric sender ID in a specific country that you'd like to describe.
     * </p>
     * 
     * @param senderId
     *        The alphanumeric sender ID in a specific country that you'd like to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SenderIdInformation withSenderId(String senderId) {
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

    public SenderIdInformation withIsoCountryCode(String isoCountryCode) {
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

    public SenderIdInformation withMessageTypes(String... messageTypes) {
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

    public SenderIdInformation withMessageTypes(java.util.Collection<String> messageTypes) {
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

    public SenderIdInformation withMessageTypes(MessageType... messageTypes) {
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
     * The monthly leasing price, in US dollars.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly leasing price, in US dollars.
     */

    public void setMonthlyLeasingPrice(String monthlyLeasingPrice) {
        this.monthlyLeasingPrice = monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly leasing price, in US dollars.
     * </p>
     * 
     * @return The monthly leasing price, in US dollars.
     */

    public String getMonthlyLeasingPrice() {
        return this.monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly leasing price, in US dollars.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly leasing price, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SenderIdInformation withMonthlyLeasingPrice(String monthlyLeasingPrice) {
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

    public SenderIdInformation withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
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

    public SenderIdInformation withRegistered(Boolean registered) {
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
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SenderIdInformation withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
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
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SenderIdInformation == false)
            return false;
        SenderIdInformation other = (SenderIdInformation) obj;
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
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
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
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        return hashCode;
    }

    @Override
    public SenderIdInformation clone() {
        try {
            return (SenderIdInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SenderIdInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
