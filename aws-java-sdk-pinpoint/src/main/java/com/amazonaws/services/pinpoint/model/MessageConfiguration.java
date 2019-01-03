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
 * Message configuration for a campaign.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MessageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The message that the campaign delivers to ADM channels. Overrides the default message. */
    private Message aDMMessage;
    /** The message that the campaign delivers to APNS channels. Overrides the default message. */
    private Message aPNSMessage;
    /** The message that the campaign delivers to Baidu channels. Overrides the default message. */
    private Message baiduMessage;
    /** The default message for all channels. */
    private Message defaultMessage;
    /** The email message configuration. */
    private CampaignEmailMessage emailMessage;
    /** The message that the campaign delivers to GCM channels. Overrides the default message. */
    private Message gCMMessage;
    /** The SMS message configuration. */
    private CampaignSmsMessage sMSMessage;

    /**
     * The message that the campaign delivers to ADM channels. Overrides the default message.
     * 
     * @param aDMMessage
     *        The message that the campaign delivers to ADM channels. Overrides the default message.
     */

    public void setADMMessage(Message aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * The message that the campaign delivers to ADM channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to ADM channels. Overrides the default message.
     */

    public Message getADMMessage() {
        return this.aDMMessage;
    }

    /**
     * The message that the campaign delivers to ADM channels. Overrides the default message.
     * 
     * @param aDMMessage
     *        The message that the campaign delivers to ADM channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withADMMessage(Message aDMMessage) {
        setADMMessage(aDMMessage);
        return this;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @param aPNSMessage
     *        The message that the campaign delivers to APNS channels. Overrides the default message.
     */

    public void setAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to APNS channels. Overrides the default message.
     */

    public Message getAPNSMessage() {
        return this.aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @param aPNSMessage
     *        The message that the campaign delivers to APNS channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withAPNSMessage(Message aPNSMessage) {
        setAPNSMessage(aPNSMessage);
        return this;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the default message.
     * 
     * @param baiduMessage
     *        The message that the campaign delivers to Baidu channels. Overrides the default message.
     */

    public void setBaiduMessage(Message baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to Baidu channels. Overrides the default message.
     */

    public Message getBaiduMessage() {
        return this.baiduMessage;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the default message.
     * 
     * @param baiduMessage
     *        The message that the campaign delivers to Baidu channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withBaiduMessage(Message baiduMessage) {
        setBaiduMessage(baiduMessage);
        return this;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     */

    public void setDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @return The default message for all channels.
     */

    public Message getDefaultMessage() {
        return this.defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withDefaultMessage(Message defaultMessage) {
        setDefaultMessage(defaultMessage);
        return this;
    }

    /**
     * The email message configuration.
     * 
     * @param emailMessage
     *        The email message configuration.
     */

    public void setEmailMessage(CampaignEmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * The email message configuration.
     * 
     * @return The email message configuration.
     */

    public CampaignEmailMessage getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * The email message configuration.
     * 
     * @param emailMessage
     *        The email message configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withEmailMessage(CampaignEmailMessage emailMessage) {
        setEmailMessage(emailMessage);
        return this;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @param gCMMessage
     *        The message that the campaign delivers to GCM channels. Overrides the default message.
     */

    public void setGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to GCM channels. Overrides the default message.
     */

    public Message getGCMMessage() {
        return this.gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @param gCMMessage
     *        The message that the campaign delivers to GCM channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withGCMMessage(Message gCMMessage) {
        setGCMMessage(gCMMessage);
        return this;
    }

    /**
     * The SMS message configuration.
     * 
     * @param sMSMessage
     *        The SMS message configuration.
     */

    public void setSMSMessage(CampaignSmsMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * The SMS message configuration.
     * 
     * @return The SMS message configuration.
     */

    public CampaignSmsMessage getSMSMessage() {
        return this.sMSMessage;
    }

    /**
     * The SMS message configuration.
     * 
     * @param sMSMessage
     *        The SMS message configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withSMSMessage(CampaignSmsMessage sMSMessage) {
        setSMSMessage(sMSMessage);
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
        if (getADMMessage() != null)
            sb.append("ADMMessage: ").append(getADMMessage()).append(",");
        if (getAPNSMessage() != null)
            sb.append("APNSMessage: ").append(getAPNSMessage()).append(",");
        if (getBaiduMessage() != null)
            sb.append("BaiduMessage: ").append(getBaiduMessage()).append(",");
        if (getDefaultMessage() != null)
            sb.append("DefaultMessage: ").append(getDefaultMessage()).append(",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: ").append(getEmailMessage()).append(",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: ").append(getGCMMessage()).append(",");
        if (getSMSMessage() != null)
            sb.append("SMSMessage: ").append(getSMSMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageConfiguration == false)
            return false;
        MessageConfiguration other = (MessageConfiguration) obj;
        if (other.getADMMessage() == null ^ this.getADMMessage() == null)
            return false;
        if (other.getADMMessage() != null && other.getADMMessage().equals(this.getADMMessage()) == false)
            return false;
        if (other.getAPNSMessage() == null ^ this.getAPNSMessage() == null)
            return false;
        if (other.getAPNSMessage() != null && other.getAPNSMessage().equals(this.getAPNSMessage()) == false)
            return false;
        if (other.getBaiduMessage() == null ^ this.getBaiduMessage() == null)
            return false;
        if (other.getBaiduMessage() != null && other.getBaiduMessage().equals(this.getBaiduMessage()) == false)
            return false;
        if (other.getDefaultMessage() == null ^ this.getDefaultMessage() == null)
            return false;
        if (other.getDefaultMessage() != null && other.getDefaultMessage().equals(this.getDefaultMessage()) == false)
            return false;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        if (other.getGCMMessage() == null ^ this.getGCMMessage() == null)
            return false;
        if (other.getGCMMessage() != null && other.getGCMMessage().equals(this.getGCMMessage()) == false)
            return false;
        if (other.getSMSMessage() == null ^ this.getSMSMessage() == null)
            return false;
        if (other.getSMSMessage() != null && other.getSMSMessage().equals(this.getSMSMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADMMessage() == null) ? 0 : getADMMessage().hashCode());
        hashCode = prime * hashCode + ((getAPNSMessage() == null) ? 0 : getAPNSMessage().hashCode());
        hashCode = prime * hashCode + ((getBaiduMessage() == null) ? 0 : getBaiduMessage().hashCode());
        hashCode = prime * hashCode + ((getDefaultMessage() == null) ? 0 : getDefaultMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        return hashCode;
    }

    @Override
    public MessageConfiguration clone() {
        try {
            return (MessageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
