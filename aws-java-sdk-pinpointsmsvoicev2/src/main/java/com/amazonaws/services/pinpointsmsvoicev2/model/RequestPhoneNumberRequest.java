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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestPhoneNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
    private String messageType;
    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     */
    private java.util.List<String> numberCapabilities;
    /**
     * <p>
     * The type of phone number to request.
     * </p>
     */
    private String numberType;
    /**
     * <p>
     * The name of the OptOutList to associate with the phone number. You can use the OutOutListName or OptPutListArn.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * The pool to associated with the phone number. You can use the PoolId or PoolArn.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * Use this field to attach your phone number for an external registration process.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * By default this is set to false. When set to true the phone number can't be deleted.
     * </p>
     */
    private Boolean deletionProtectionEnabled;
    /**
     * <p>
     * An array of tags (key and value pairs) associate with the requested phone number.
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

    public RequestPhoneNumberRequest withIsoCountryCode(String isoCountryCode) {
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

    public RequestPhoneNumberRequest withMessageType(String messageType) {
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

    public RequestPhoneNumberRequest withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     * 
     * @return Indicates if the phone number will be used for text messages, voice messages, or both.
     * @see NumberCapability
     */

    public java.util.List<String> getNumberCapabilities() {
        return numberCapabilities;
    }

    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Indicates if the phone number will be used for text messages, voice messages, or both.
     * @see NumberCapability
     */

    public void setNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        if (numberCapabilities == null) {
            this.numberCapabilities = null;
            return;
        }

        this.numberCapabilities = new java.util.ArrayList<String>(numberCapabilities);
    }

    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNumberCapabilities(java.util.Collection)} or {@link #withNumberCapabilities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param numberCapabilities
     *        Indicates if the phone number will be used for text messages, voice messages, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public RequestPhoneNumberRequest withNumberCapabilities(String... numberCapabilities) {
        if (this.numberCapabilities == null) {
            setNumberCapabilities(new java.util.ArrayList<String>(numberCapabilities.length));
        }
        for (String ele : numberCapabilities) {
            this.numberCapabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Indicates if the phone number will be used for text messages, voice messages, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public RequestPhoneNumberRequest withNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        setNumberCapabilities(numberCapabilities);
        return this;
    }

    /**
     * <p>
     * Indicates if the phone number will be used for text messages, voice messages, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Indicates if the phone number will be used for text messages, voice messages, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public RequestPhoneNumberRequest withNumberCapabilities(NumberCapability... numberCapabilities) {
        java.util.ArrayList<String> numberCapabilitiesCopy = new java.util.ArrayList<String>(numberCapabilities.length);
        for (NumberCapability value : numberCapabilities) {
            numberCapabilitiesCopy.add(value.toString());
        }
        if (getNumberCapabilities() == null) {
            setNumberCapabilities(numberCapabilitiesCopy);
        } else {
            getNumberCapabilities().addAll(numberCapabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The type of phone number to request.
     * </p>
     * 
     * @param numberType
     *        The type of phone number to request.
     * @see RequestableNumberType
     */

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    /**
     * <p>
     * The type of phone number to request.
     * </p>
     * 
     * @return The type of phone number to request.
     * @see RequestableNumberType
     */

    public String getNumberType() {
        return this.numberType;
    }

    /**
     * <p>
     * The type of phone number to request.
     * </p>
     * 
     * @param numberType
     *        The type of phone number to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestableNumberType
     */

    public RequestPhoneNumberRequest withNumberType(String numberType) {
        setNumberType(numberType);
        return this;
    }

    /**
     * <p>
     * The type of phone number to request.
     * </p>
     * 
     * @param numberType
     *        The type of phone number to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestableNumberType
     */

    public RequestPhoneNumberRequest withNumberType(RequestableNumberType numberType) {
        this.numberType = numberType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the OptOutList to associate with the phone number. You can use the OutOutListName or OptPutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList to associate with the phone number. You can use the OutOutListName or
     *        OptPutListArn.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList to associate with the phone number. You can use the OutOutListName or OptPutListArn.
     * </p>
     * 
     * @return The name of the OptOutList to associate with the phone number. You can use the OutOutListName or
     *         OptPutListArn.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList to associate with the phone number. You can use the OutOutListName or OptPutListArn.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList to associate with the phone number. You can use the OutOutListName or
     *        OptPutListArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * The pool to associated with the phone number. You can use the PoolId or PoolArn.
     * </p>
     * 
     * @param poolId
     *        The pool to associated with the phone number. You can use the PoolId or PoolArn.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The pool to associated with the phone number. You can use the PoolId or PoolArn.
     * </p>
     * 
     * @return The pool to associated with the phone number. You can use the PoolId or PoolArn.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The pool to associated with the phone number. You can use the PoolId or PoolArn.
     * </p>
     * 
     * @param poolId
     *        The pool to associated with the phone number. You can use the PoolId or PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * Use this field to attach your phone number for an external registration process.
     * </p>
     * 
     * @param registrationId
     *        Use this field to attach your phone number for an external registration process.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * Use this field to attach your phone number for an external registration process.
     * </p>
     * 
     * @return Use this field to attach your phone number for an external registration process.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * Use this field to attach your phone number for an external registration process.
     * </p>
     * 
     * @param registrationId
     *        Use this field to attach your phone number for an external registration process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the phone number can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the phone number can't be deleted.
     */

    public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the phone number can't be deleted.
     * </p>
     * 
     * @return By default this is set to false. When set to true the phone number can't be deleted.
     */

    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the phone number can't be deleted.
     * </p>
     * 
     * @param deletionProtectionEnabled
     *        By default this is set to false. When set to true the phone number can't be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        setDeletionProtectionEnabled(deletionProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true the phone number can't be deleted.
     * </p>
     * 
     * @return By default this is set to false. When set to true the phone number can't be deleted.
     */

    public Boolean isDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associate with the requested phone number.
     * </p>
     * 
     * @return An array of tags (key and value pairs) associate with the requested phone number.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associate with the requested phone number.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associate with the requested phone number.
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
     * An array of tags (key and value pairs) associate with the requested phone number.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associate with the requested phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withTags(Tag... tags) {
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
     * An array of tags (key and value pairs) associate with the requested phone number.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associate with the requested phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestPhoneNumberRequest withTags(java.util.Collection<Tag> tags) {
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

    public RequestPhoneNumberRequest withClientToken(String clientToken) {
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
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getNumberCapabilities() != null)
            sb.append("NumberCapabilities: ").append(getNumberCapabilities()).append(",");
        if (getNumberType() != null)
            sb.append("NumberType: ").append(getNumberType()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
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

        if (obj instanceof RequestPhoneNumberRequest == false)
            return false;
        RequestPhoneNumberRequest other = (RequestPhoneNumberRequest) obj;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getNumberCapabilities() == null ^ this.getNumberCapabilities() == null)
            return false;
        if (other.getNumberCapabilities() != null && other.getNumberCapabilities().equals(this.getNumberCapabilities()) == false)
            return false;
        if (other.getNumberType() == null ^ this.getNumberType() == null)
            return false;
        if (other.getNumberType() != null && other.getNumberType().equals(this.getNumberType()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
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

        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getNumberCapabilities() == null) ? 0 : getNumberCapabilities().hashCode());
        hashCode = prime * hashCode + ((getNumberType() == null) ? 0 : getNumberType().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtectionEnabled() == null) ? 0 : getDeletionProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RequestPhoneNumberRequest clone() {
        return (RequestPhoneNumberRequest) super.clone();
    }

}
