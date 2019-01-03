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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * SendVoiceMessageRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/SendVoiceMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendVoiceMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The phone number that appears on recipients' devices when they receive the message. */
    private String callerId;
    /** The name of the configuration set that you want to use to send the message. */
    private String configurationSetName;

    private VoiceMessageContent content;
    /** The phone number that you want to send the voice message to. */
    private String destinationPhoneNumber;
    /**
     * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone
     * number that appears on recipients' devices when they receive the message, because you can specify a CallerId
     * parameter in the request.
     */
    private String originationPhoneNumber;

    /**
     * The phone number that appears on recipients' devices when they receive the message.
     * 
     * @param callerId
     *        The phone number that appears on recipients' devices when they receive the message.
     */

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    /**
     * The phone number that appears on recipients' devices when they receive the message.
     * 
     * @return The phone number that appears on recipients' devices when they receive the message.
     */

    public String getCallerId() {
        return this.callerId;
    }

    /**
     * The phone number that appears on recipients' devices when they receive the message.
     * 
     * @param callerId
     *        The phone number that appears on recipients' devices when they receive the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withCallerId(String callerId) {
        setCallerId(callerId);
        return this;
    }

    /**
     * The name of the configuration set that you want to use to send the message.
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to use to send the message.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * The name of the configuration set that you want to use to send the message.
     * 
     * @return The name of the configuration set that you want to use to send the message.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * The name of the configuration set that you want to use to send the message.
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to use to send the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * @param content
     */

    public void setContent(VoiceMessageContent content) {
        this.content = content;
    }

    /**
     * @return
     */

    public VoiceMessageContent getContent() {
        return this.content;
    }

    /**
     * @param content
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withContent(VoiceMessageContent content) {
        setContent(content);
        return this;
    }

    /**
     * The phone number that you want to send the voice message to.
     * 
     * @param destinationPhoneNumber
     *        The phone number that you want to send the voice message to.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * The phone number that you want to send the voice message to.
     * 
     * @return The phone number that you want to send the voice message to.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * The phone number that you want to send the voice message to.
     * 
     * @param destinationPhoneNumber
     *        The phone number that you want to send the voice message to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone
     * number that appears on recipients' devices when they receive the message, because you can specify a CallerId
     * parameter in the request.
     * 
     * @param originationPhoneNumber
     *        The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the
     *        phone number that appears on recipients' devices when they receive the message, because you can specify a
     *        CallerId parameter in the request.
     */

    public void setOriginationPhoneNumber(String originationPhoneNumber) {
        this.originationPhoneNumber = originationPhoneNumber;
    }

    /**
     * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone
     * number that appears on recipients' devices when they receive the message, because you can specify a CallerId
     * parameter in the request.
     * 
     * @return The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the
     *         phone number that appears on recipients' devices when they receive the message, because you can specify a
     *         CallerId parameter in the request.
     */

    public String getOriginationPhoneNumber() {
        return this.originationPhoneNumber;
    }

    /**
     * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone
     * number that appears on recipients' devices when they receive the message, because you can specify a CallerId
     * parameter in the request.
     * 
     * @param originationPhoneNumber
     *        The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the
     *        phone number that appears on recipients' devices when they receive the message, because you can specify a
     *        CallerId parameter in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendVoiceMessageRequest withOriginationPhoneNumber(String originationPhoneNumber) {
        setOriginationPhoneNumber(originationPhoneNumber);
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
        if (getCallerId() != null)
            sb.append("CallerId: ").append(getCallerId()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getOriginationPhoneNumber() != null)
            sb.append("OriginationPhoneNumber: ").append(getOriginationPhoneNumber());
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
        if (other.getCallerId() == null ^ this.getCallerId() == null)
            return false;
        if (other.getCallerId() != null && other.getCallerId().equals(this.getCallerId()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getOriginationPhoneNumber() == null ^ this.getOriginationPhoneNumber() == null)
            return false;
        if (other.getOriginationPhoneNumber() != null && other.getOriginationPhoneNumber().equals(this.getOriginationPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerId() == null) ? 0 : getCallerId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getOriginationPhoneNumber() == null) ? 0 : getOriginationPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public SendVoiceMessageRequest clone() {
        return (SendVoiceMessageRequest) super.clone();
    }

}
