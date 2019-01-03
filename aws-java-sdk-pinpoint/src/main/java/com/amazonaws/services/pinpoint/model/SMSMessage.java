/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * SMS Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SMSMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSMessage implements Serializable, Cloneable, StructuredPojo {

    /** The body of the SMS message. */
    private String body;
    /** The SMS program name that you provided to AWS Support when you requested your dedicated number. */
    private String keyword;
    /** Is this a transaction priority message or lower priority. */
    private String messageType;
    /**
     * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes
     * that you requested from AWS Support and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     */
    private String originationNumber;
    /**
     * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by
     * country or region.
     */
    private String senderId;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The body of the SMS message.
     * 
     * @param body
     *        The body of the SMS message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The body of the SMS message.
     * 
     * @return The body of the SMS message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The body of the SMS message.
     * 
     * @param body
     *        The body of the SMS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * 
     * @param keyword
     *        The SMS program name that you provided to AWS Support when you requested your dedicated number.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * 
     * @return The SMS program name that you provided to AWS Support when you requested your dedicated number.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * 
     * @param keyword
     *        The SMS program name that you provided to AWS Support when you requested your dedicated number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * 
     * @param messageType
     *        Is this a transaction priority message or lower priority.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * 
     * @return Is this a transaction priority message or lower priority.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * 
     * @param messageType
     *        Is this a transaction priority message or lower priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SMSMessage withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * Is this a transaction priority message or lower priority.
     * 
     * @param messageType
     *        Is this a transaction priority message or lower priority.
     * @see MessageType
     */

    public void setMessageType(MessageType messageType) {
        withMessageType(messageType);
    }

    /**
     * Is this a transaction priority message or lower priority.
     * 
     * @param messageType
     *        Is this a transaction priority message or lower priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SMSMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes
     * that you requested from AWS Support and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     * 
     * @param originationNumber
     *        The phone number that the SMS message originates from. Specify one of the dedicated long codes or short
     *        codes that you requested from AWS Support and that is assigned to your account. If this attribute is not
     *        specified, Amazon Pinpoint randomly assigns a long code.
     */

    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes
     * that you requested from AWS Support and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     * 
     * @return The phone number that the SMS message originates from. Specify one of the dedicated long codes or short
     *         codes that you requested from AWS Support and that is assigned to your account. If this attribute is not
     *         specified, Amazon Pinpoint randomly assigns a long code.
     */

    public String getOriginationNumber() {
        return this.originationNumber;
    }

    /**
     * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes
     * that you requested from AWS Support and that is assigned to your account. If this attribute is not specified,
     * Amazon Pinpoint randomly assigns a long code.
     * 
     * @param originationNumber
     *        The phone number that the SMS message originates from. Specify one of the dedicated long codes or short
     *        codes that you requested from AWS Support and that is assigned to your account. If this attribute is not
     *        specified, Amazon Pinpoint randomly assigns a long code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withOriginationNumber(String originationNumber) {
        setOriginationNumber(originationNumber);
        return this;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by
     * country or region.
     * 
     * @param senderId
     *        The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies
     *        by country or region.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by
     * country or region.
     * 
     * @return The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs
     *         varies by country or region.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by
     * country or region.
     * 
     * @param senderId
     *        The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies
     *        by country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @return Default message substitutions. Can be overridden by individual address substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public SMSMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getOriginationNumber() != null)
            sb.append("OriginationNumber: ").append(getOriginationNumber()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSMessage == false)
            return false;
        SMSMessage other = (SMSMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getOriginationNumber() == null ^ this.getOriginationNumber() == null)
            return false;
        if (other.getOriginationNumber() != null && other.getOriginationNumber().equals(this.getOriginationNumber()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getOriginationNumber() == null) ? 0 : getOriginationNumber().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public SMSMessage clone() {
        try {
            return (SMSMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SMSMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
