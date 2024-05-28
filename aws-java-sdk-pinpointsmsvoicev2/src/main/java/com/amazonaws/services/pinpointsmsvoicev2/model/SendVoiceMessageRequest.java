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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendVoiceMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendVoiceMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * PoolId, or PoolArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The text to convert to a voice message.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * Specifies if the MessageBody field contains text or <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language (SSML)</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TEXT: This is the default value. When used the maximum character limit is 3000.
     * </p>
     * </li>
     * <li>
     * <p>
     * SSML: When used the maximum character limit is 6000 including SSML tagging.
     * </p>
     * </li>
     * </ul>
     */
    private String messageBodyTextType;
    /**
     * <p>
     * The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a> service to
     * use. By default this is set to "MATTHEW".
     * </p>
     */
    private String voiceId;
    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The maximum amount to spend per voice message, in US dollars.
     * </p>
     */
    private String maxPricePerMinute;
    /**
     * <p>
     * How long the voice message is valid for. By default this is 72 hours.
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

    public SendVoiceMessageRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, PoolId, or PoolArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * PoolId, or PoolArn.
     * </p>
     * 
     * @return The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId,
     *         PhoneNumberArn, PoolId, or PoolArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, PoolId, or PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The text to convert to a voice message.
     * </p>
     * 
     * @param messageBody
     *        The text to convert to a voice message.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The text to convert to a voice message.
     * </p>
     * 
     * @return The text to convert to a voice message.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The text to convert to a voice message.
     * </p>
     * 
     * @param messageBody
     *        The text to convert to a voice message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * Specifies if the MessageBody field contains text or <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language (SSML)</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TEXT: This is the default value. When used the maximum character limit is 3000.
     * </p>
     * </li>
     * <li>
     * <p>
     * SSML: When used the maximum character limit is 6000 including SSML tagging.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageBodyTextType
     *        Specifies if the MessageBody field contains text or <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language
     *        (SSML)</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TEXT: This is the default value. When used the maximum character limit is 3000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSML: When used the maximum character limit is 6000 including SSML tagging.
     *        </p>
     *        </li>
     * @see VoiceMessageBodyTextType
     */

    public void setMessageBodyTextType(String messageBodyTextType) {
        this.messageBodyTextType = messageBodyTextType;
    }

    /**
     * <p>
     * Specifies if the MessageBody field contains text or <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language (SSML)</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TEXT: This is the default value. When used the maximum character limit is 3000.
     * </p>
     * </li>
     * <li>
     * <p>
     * SSML: When used the maximum character limit is 6000 including SSML tagging.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies if the MessageBody field contains text or <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language
     *         (SSML)</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TEXT: This is the default value. When used the maximum character limit is 3000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSML: When used the maximum character limit is 6000 including SSML tagging.
     *         </p>
     *         </li>
     * @see VoiceMessageBodyTextType
     */

    public String getMessageBodyTextType() {
        return this.messageBodyTextType;
    }

    /**
     * <p>
     * Specifies if the MessageBody field contains text or <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language (SSML)</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TEXT: This is the default value. When used the maximum character limit is 3000.
     * </p>
     * </li>
     * <li>
     * <p>
     * SSML: When used the maximum character limit is 6000 including SSML tagging.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageBodyTextType
     *        Specifies if the MessageBody field contains text or <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language
     *        (SSML)</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TEXT: This is the default value. When used the maximum character limit is 3000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSML: When used the maximum character limit is 6000 including SSML tagging.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceMessageBodyTextType
     */

    public SendVoiceMessageRequest withMessageBodyTextType(String messageBodyTextType) {
        setMessageBodyTextType(messageBodyTextType);
        return this;
    }

    /**
     * <p>
     * Specifies if the MessageBody field contains text or <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language (SSML)</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * TEXT: This is the default value. When used the maximum character limit is 3000.
     * </p>
     * </li>
     * <li>
     * <p>
     * SSML: When used the maximum character limit is 6000 including SSML tagging.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageBodyTextType
     *        Specifies if the MessageBody field contains text or <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">speech synthesis markup language
     *        (SSML)</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TEXT: This is the default value. When used the maximum character limit is 3000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSML: When used the maximum character limit is 6000 including SSML tagging.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceMessageBodyTextType
     */

    public SendVoiceMessageRequest withMessageBodyTextType(VoiceMessageBodyTextType messageBodyTextType) {
        this.messageBodyTextType = messageBodyTextType.toString();
        return this;
    }

    /**
     * <p>
     * The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a> service to
     * use. By default this is set to "MATTHEW".
     * </p>
     * 
     * @param voiceId
     *        The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a>
     *        service to use. By default this is set to "MATTHEW".
     * @see VoiceId
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a> service to
     * use. By default this is set to "MATTHEW".
     * </p>
     * 
     * @return The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a>
     *         service to use. By default this is set to "MATTHEW".
     * @see VoiceId
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a> service to
     * use. By default this is set to "MATTHEW".
     * </p>
     * 
     * @param voiceId
     *        The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a>
     *        service to use. By default this is set to "MATTHEW".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public SendVoiceMessageRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * <p>
     * The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a> service to
     * use. By default this is set to "MATTHEW".
     * </p>
     * 
     * @param voiceId
     *        The voice for the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly</a>
     *        service to use. By default this is set to "MATTHEW".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public SendVoiceMessageRequest withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
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

    public SendVoiceMessageRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The maximum amount to spend per voice message, in US dollars.
     * </p>
     * 
     * @param maxPricePerMinute
     *        The maximum amount to spend per voice message, in US dollars.
     */

    public void setMaxPricePerMinute(String maxPricePerMinute) {
        this.maxPricePerMinute = maxPricePerMinute;
    }

    /**
     * <p>
     * The maximum amount to spend per voice message, in US dollars.
     * </p>
     * 
     * @return The maximum amount to spend per voice message, in US dollars.
     */

    public String getMaxPricePerMinute() {
        return this.maxPricePerMinute;
    }

    /**
     * <p>
     * The maximum amount to spend per voice message, in US dollars.
     * </p>
     * 
     * @param maxPricePerMinute
     *        The maximum amount to spend per voice message, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withMaxPricePerMinute(String maxPricePerMinute) {
        setMaxPricePerMinute(maxPricePerMinute);
        return this;
    }

    /**
     * <p>
     * How long the voice message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the voice message is valid for. By default this is 72 hours.
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * How long the voice message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @return How long the voice message is valid for. By default this is 72 hours.
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * How long the voice message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the voice message is valid for. By default this is 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withTimeToLive(Integer timeToLive) {
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

    public SendVoiceMessageRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see SendVoiceMessageRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest addContextEntry(String key, String value) {
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

    public SendVoiceMessageRequest clearContextEntries() {
        this.context = null;
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

    public SendVoiceMessageRequest withDryRun(Boolean dryRun) {
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

    public SendVoiceMessageRequest withProtectConfigurationId(String protectConfigurationId) {
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
        if (getMessageBodyTextType() != null)
            sb.append("MessageBodyTextType: ").append(getMessageBodyTextType()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getMaxPricePerMinute() != null)
            sb.append("MaxPricePerMinute: ").append(getMaxPricePerMinute()).append(",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
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

        if (obj instanceof SendVoiceMessageRequest == false)
            return false;
        SendVoiceMessageRequest other = (SendVoiceMessageRequest) obj;
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
        if (other.getMessageBodyTextType() == null ^ this.getMessageBodyTextType() == null)
            return false;
        if (other.getMessageBodyTextType() != null && other.getMessageBodyTextType().equals(this.getMessageBodyTextType()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getMaxPricePerMinute() == null ^ this.getMaxPricePerMinute() == null)
            return false;
        if (other.getMaxPricePerMinute() != null && other.getMaxPricePerMinute().equals(this.getMaxPricePerMinute()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
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
        hashCode = prime * hashCode + ((getMessageBodyTextType() == null) ? 0 : getMessageBodyTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getMaxPricePerMinute() == null) ? 0 : getMaxPricePerMinute().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public SendVoiceMessageRequest clone() {
        return (SendVoiceMessageRequest) super.clone();
    }

}
