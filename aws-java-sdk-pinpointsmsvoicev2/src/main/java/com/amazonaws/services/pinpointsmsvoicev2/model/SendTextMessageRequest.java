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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendTextMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendTextMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The body of the text message.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     * messages that aren't critical or time-sensitive.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * When you register a short code in the US, you must specify a program name. If you don’t have a US short code,
     * omit this attribute.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each text message part. A text message can contain
     * multiple parts.
     * </p>
     */
    private String maxPrice;
    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     */
    private Integer timeToLive;
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
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The destination phone number in E.164 format.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @return The destination phone number in E.164 format.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The destination phone number in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
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

    public SendTextMessageRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The body of the text message.
     * </p>
     * 
     * @param messageBody
     *        The body of the text message.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The body of the text message.
     * </p>
     * 
     * @return The body of the text message.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The body of the text message.
     * </p>
     * 
     * @param messageBody
     *        The body of the text message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     * messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     *        messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     * messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @return The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL
     *         for messages that aren't critical or time-sensitive.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     * messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     *        messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SendTextMessageRequest withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     * messages that aren't critical or time-sensitive.
     * </p>
     * 
     * @param messageType
     *        The type of message. Valid values are for messages that are critical or time-sensitive and PROMOTIONAL for
     *        messages that aren't critical or time-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SendTextMessageRequest withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * When you register a short code in the US, you must specify a program name. If you don’t have a US short code,
     * omit this attribute.
     * </p>
     * 
     * @param keyword
     *        When you register a short code in the US, you must specify a program name. If you don’t have a US short
     *        code, omit this attribute.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * When you register a short code in the US, you must specify a program name. If you don’t have a US short code,
     * omit this attribute.
     * </p>
     * 
     * @return When you register a short code in the US, you must specify a program name. If you don’t have a US short
     *         code, omit this attribute.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * When you register a short code in the US, you must specify a program name. If you don’t have a US short code,
     * omit this attribute.
     * </p>
     * 
     * @param keyword
     *        When you register a short code in the US, you must specify a program name. If you don’t have a US short
     *        code, omit this attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withKeyword(String keyword) {
        setKeyword(keyword);
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

    public SendTextMessageRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each text message part. A text message can contain
     * multiple parts.
     * </p>
     * 
     * @param maxPrice
     *        The maximum amount that you want to spend, in US dollars, per each text message part. A text message can
     *        contain multiple parts.
     */

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each text message part. A text message can contain
     * multiple parts.
     * </p>
     * 
     * @return The maximum amount that you want to spend, in US dollars, per each text message part. A text message can
     *         contain multiple parts.
     */

    public String getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each text message part. A text message can contain
     * multiple parts.
     * </p>
     * 
     * @param maxPrice
     *        The maximum amount that you want to spend, in US dollars, per each text message part. A text message can
     *        contain multiple parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withMaxPrice(String maxPrice) {
        setMaxPrice(maxPrice);
        return this;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the text message is valid for. By default this is 72 hours.
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @return How long the text message is valid for. By default this is 72 hours.
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the text message is valid for. By default this is 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withTimeToLive(Integer timeToLive) {
        setTimeToLive(timeToLive);
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

    public SendTextMessageRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see SendTextMessageRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest addContextEntry(String key, String value) {
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

    public SendTextMessageRequest clearContextEntries() {
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

    public SendTextMessageRequest withDestinationCountryParameters(java.util.Map<String, String> destinationCountryParameters) {
        setDestinationCountryParameters(destinationCountryParameters);
        return this;
    }

    /**
     * Add a single DestinationCountryParameters entry
     *
     * @see SendTextMessageRequest#withDestinationCountryParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest addDestinationCountryParametersEntry(String key, String value) {
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

    public SendTextMessageRequest clearDestinationCountryParametersEntries() {
        this.destinationCountryParameters = null;
        return this;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @param dryRun
     *        When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @return When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @param dryRun
     *        When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @return When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     */

    public void setProtectConfigurationId(String protectConfigurationId) {
        this.protectConfigurationId = protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @return The unique identifier for the protect configuration.
     */

    public String getProtectConfigurationId() {
        return this.protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTextMessageRequest withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
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
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getMessageBody() != null)
            sb.append("MessageBody: ").append(getMessageBody()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getMaxPrice() != null)
            sb.append("MaxPrice: ").append(getMaxPrice()).append(",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getDestinationCountryParameters() != null)
            sb.append("DestinationCountryParameters: ").append(getDestinationCountryParameters()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendTextMessageRequest == false)
            return false;
        SendTextMessageRequest other = (SendTextMessageRequest) obj;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getMaxPrice() == null ^ this.getMaxPrice() == null)
            return false;
        if (other.getMaxPrice() != null && other.getMaxPrice().equals(this.getMaxPrice()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getDestinationCountryParameters() == null ^ this.getDestinationCountryParameters() == null)
            return false;
        if (other.getDestinationCountryParameters() != null && other.getDestinationCountryParameters().equals(this.getDestinationCountryParameters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getDestinationCountryParameters() == null) ? 0 : getDestinationCountryParameters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public SendTextMessageRequest clone() {
        return (SendTextMessageRequest) super.clone();
    }

}
