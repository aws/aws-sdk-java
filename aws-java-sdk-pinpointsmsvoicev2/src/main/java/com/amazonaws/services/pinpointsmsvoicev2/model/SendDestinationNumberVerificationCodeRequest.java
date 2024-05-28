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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendDestinationNumberVerificationCode"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDestinationNumberVerificationCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     */
    private String verifiedDestinationNumberId;
    /**
     * <p>
     * Choose to send the verification code as an SMS or voice message.
     * </p>
     */
    private String verificationChannel;
    /**
     * <p>
     * Choose the language to use for the message.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * This field is used for any country-specific registration requirements. Currently, this setting is only used when
     * you send messages to recipients in India using a sender ID. For more information see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     * requirements for sending SMS messages to recipients in India</a>.
     * </p>
     */
    private java.util.Map<String, String> destinationCountryParameters;

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberId
     *        The unique identifier for the verified destination phone number.
     */

    public void setVerifiedDestinationNumberId(String verifiedDestinationNumberId) {
        this.verifiedDestinationNumberId = verifiedDestinationNumberId;
    }

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @return The unique identifier for the verified destination phone number.
     */

    public String getVerifiedDestinationNumberId() {
        return this.verifiedDestinationNumberId;
    }

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberId
     *        The unique identifier for the verified destination phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest withVerifiedDestinationNumberId(String verifiedDestinationNumberId) {
        setVerifiedDestinationNumberId(verifiedDestinationNumberId);
        return this;
    }

    /**
     * <p>
     * Choose to send the verification code as an SMS or voice message.
     * </p>
     * 
     * @param verificationChannel
     *        Choose to send the verification code as an SMS or voice message.
     * @see VerificationChannel
     */

    public void setVerificationChannel(String verificationChannel) {
        this.verificationChannel = verificationChannel;
    }

    /**
     * <p>
     * Choose to send the verification code as an SMS or voice message.
     * </p>
     * 
     * @return Choose to send the verification code as an SMS or voice message.
     * @see VerificationChannel
     */

    public String getVerificationChannel() {
        return this.verificationChannel;
    }

    /**
     * <p>
     * Choose to send the verification code as an SMS or voice message.
     * </p>
     * 
     * @param verificationChannel
     *        Choose to send the verification code as an SMS or voice message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationChannel
     */

    public SendDestinationNumberVerificationCodeRequest withVerificationChannel(String verificationChannel) {
        setVerificationChannel(verificationChannel);
        return this;
    }

    /**
     * <p>
     * Choose to send the verification code as an SMS or voice message.
     * </p>
     * 
     * @param verificationChannel
     *        Choose to send the verification code as an SMS or voice message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationChannel
     */

    public SendDestinationNumberVerificationCodeRequest withVerificationChannel(VerificationChannel verificationChannel) {
        this.verificationChannel = verificationChannel.toString();
        return this;
    }

    /**
     * <p>
     * Choose the language to use for the message.
     * </p>
     * 
     * @param languageCode
     *        Choose the language to use for the message.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Choose the language to use for the message.
     * </p>
     * 
     * @return Choose the language to use for the message.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Choose the language to use for the message.
     * </p>
     * 
     * @param languageCode
     *        Choose the language to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public SendDestinationNumberVerificationCodeRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Choose the language to use for the message.
     * </p>
     * 
     * @param languageCode
     *        Choose the language to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public SendDestinationNumberVerificationCodeRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @return The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *         PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use. This can be either the ConfigurationSetName or
     *        ConfigurationSetArn.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @return The name of the configuration set to use. This can be either the ConfigurationSetName or
     *         ConfigurationSetArn.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use. This can be either the ConfigurationSetName or
     *        ConfigurationSetArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @return You can specify custom data in this field. If you do, that data is logged to the event destination.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @param context
     *        You can specify custom data in this field. If you do, that data is logged to the event destination.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @param context
     *        You can specify custom data in this field. If you do, that data is logged to the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see SendDestinationNumberVerificationCodeRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * This field is used for any country-specific registration requirements. Currently, this setting is only used when
     * you send messages to recipients in India using a sender ID. For more information see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     * requirements for sending SMS messages to recipients in India</a>.
     * </p>
     * 
     * @return This field is used for any country-specific registration requirements. Currently, this setting is only
     *         used when you send messages to recipients in India using a sender ID. For more information see <a
     *         href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     *         requirements for sending SMS messages to recipients in India</a>.
     */

    public java.util.Map<String, String> getDestinationCountryParameters() {
        return destinationCountryParameters;
    }

    /**
     * <p>
     * This field is used for any country-specific registration requirements. Currently, this setting is only used when
     * you send messages to recipients in India using a sender ID. For more information see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     * requirements for sending SMS messages to recipients in India</a>.
     * </p>
     * 
     * @param destinationCountryParameters
     *        This field is used for any country-specific registration requirements. Currently, this setting is only
     *        used when you send messages to recipients in India using a sender ID. For more information see <a
     *        href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     *        requirements for sending SMS messages to recipients in India</a>.
     */

    public void setDestinationCountryParameters(java.util.Map<String, String> destinationCountryParameters) {
        this.destinationCountryParameters = destinationCountryParameters;
    }

    /**
     * <p>
     * This field is used for any country-specific registration requirements. Currently, this setting is only used when
     * you send messages to recipients in India using a sender ID. For more information see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     * requirements for sending SMS messages to recipients in India</a>.
     * </p>
     * 
     * @param destinationCountryParameters
     *        This field is used for any country-specific registration requirements. Currently, this setting is only
     *        used when you send messages to recipients in India using a sender ID. For more information see <a
     *        href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-senderid-india.html">Special
     *        requirements for sending SMS messages to recipients in India</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest withDestinationCountryParameters(java.util.Map<String, String> destinationCountryParameters) {
        setDestinationCountryParameters(destinationCountryParameters);
        return this;
    }

    /**
     * Add a single DestinationCountryParameters entry
     *
     * @see SendDestinationNumberVerificationCodeRequest#withDestinationCountryParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest addDestinationCountryParametersEntry(String key, String value) {
        if (null == this.destinationCountryParameters) {
            this.destinationCountryParameters = new java.util.HashMap<String, String>();
        }
        if (this.destinationCountryParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.destinationCountryParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DestinationCountryParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDestinationNumberVerificationCodeRequest clearDestinationCountryParametersEntries() {
        this.destinationCountryParameters = null;
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
        if (getVerifiedDestinationNumberId() != null)
            sb.append("VerifiedDestinationNumberId: ").append(getVerifiedDestinationNumberId()).append(",");
        if (getVerificationChannel() != null)
            sb.append("VerificationChannel: ").append(getVerificationChannel()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getDestinationCountryParameters() != null)
            sb.append("DestinationCountryParameters: ").append(getDestinationCountryParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDestinationNumberVerificationCodeRequest == false)
            return false;
        SendDestinationNumberVerificationCodeRequest other = (SendDestinationNumberVerificationCodeRequest) obj;
        if (other.getVerifiedDestinationNumberId() == null ^ this.getVerifiedDestinationNumberId() == null)
            return false;
        if (other.getVerifiedDestinationNumberId() != null && other.getVerifiedDestinationNumberId().equals(this.getVerifiedDestinationNumberId()) == false)
            return false;
        if (other.getVerificationChannel() == null ^ this.getVerificationChannel() == null)
            return false;
        if (other.getVerificationChannel() != null && other.getVerificationChannel().equals(this.getVerificationChannel()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getDestinationCountryParameters() == null ^ this.getDestinationCountryParameters() == null)
            return false;
        if (other.getDestinationCountryParameters() != null && other.getDestinationCountryParameters().equals(this.getDestinationCountryParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedDestinationNumberId() == null) ? 0 : getVerifiedDestinationNumberId().hashCode());
        hashCode = prime * hashCode + ((getVerificationChannel() == null) ? 0 : getVerificationChannel().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getDestinationCountryParameters() == null) ? 0 : getDestinationCountryParameters().hashCode());
        return hashCode;
    }

    @Override
    public SendDestinationNumberVerificationCodeRequest clone() {
        return (SendDestinationNumberVerificationCodeRequest) super.clone();
    }

}
