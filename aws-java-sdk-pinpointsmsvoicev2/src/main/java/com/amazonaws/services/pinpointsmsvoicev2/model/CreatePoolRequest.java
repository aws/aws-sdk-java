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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreatePool" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the
     * <a>UpdatePool</a> action.
     * </p>
     */
    private Boolean deletionProtectionEnabled;
    /**
     * <p>
     * An array of tags (key and value pairs) associated with the pool.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @return The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *         use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *         <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     * </p>
     * 
     * @param isoCountryCode
     *        The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     * </p>
     * 
     * @return The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     * </p>
     * 
     * @param isoCountryCode
     *        The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
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

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CreatePoolRequest withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     * PROMOTIONAL for messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and
     *        PROMOTIONAL for messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CreatePoolRequest withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the
     * <a>UpdatePool</a> action.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the pool can't be deleted. You can change this value
     *        using the <a>UpdatePool</a> action.
     */

    public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the
     * <a>UpdatePool</a> action.
     * </p>
     * 
     * @return By default this is set to false. When set to true the pool can't be deleted. You can change this value
     *         using the <a>UpdatePool</a> action.
     */

    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the
     * <a>UpdatePool</a> action.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the pool can't be deleted. You can change this value
     *        using the <a>UpdatePool</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        setDeletionProtectionEnabled(deletionProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the
     * <a>UpdatePool</a> action.
     * </p>
     * 
     * @return By default this is set to false. When set to true the pool can't be deleted. You can change this value
     *         using the <a>UpdatePool</a> action.
     */

    public Boolean isDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associated with the pool.
     * </p>
     * 
     * @return An array of tags (key and value pairs) associated with the pool.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associated with the pool.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the pool.
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
     * An array of tags (key and value pairs) associated with the pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withTags(Tag... tags) {
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
     * An array of tags (key and value pairs) associated with the pool.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *         specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePoolRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getDeletionProtectionEnabled() != null)
            sb.append("DeletionProtectionEnabled: ").append(getDeletionProtectionEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePoolRequest == false)
            return false;
        CreatePoolRequest other = (CreatePoolRequest) obj;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getDeletionProtectionEnabled() == null ^ this.getDeletionProtectionEnabled() == null)
            return false;
        if (other.getDeletionProtectionEnabled() != null && other.getDeletionProtectionEnabled().equals(this.getDeletionProtectionEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePoolRequest clone() {
        return (CreatePoolRequest) super.clone();
    }

}
