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
 * <p>
 * Specifies the message configuration settings for a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MessageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the
     * default message.
     * </p>
     */
    private Message aDMMessage;
    /**
     * <p>
     * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message
     * overrides the default message.
     * </p>
     */
    private Message aPNSMessage;
    /**
     * <p>
     * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default message.
     * </p>
     */
    private Message baiduMessage;
    /**
     * <p>
     * The default message that the campaign sends through all the channels that are configured for the campaign.
     * </p>
     */
    private Message defaultMessage;
    /**
     * <p>
     * The message that the campaign sends through the email channel.
     * </p>
     */
    private CampaignEmailMessage emailMessage;
    /**
     * <p>
     * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This
     * message overrides the default message.
     * </p>
     */
    private Message gCMMessage;
    /**
     * <p>
     * The message that the campaign sends through the SMS channel.
     * </p>
     */
    private CampaignSmsMessage sMSMessage;

    /**
     * <p>
     * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @param aDMMessage
     *        The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message
     *        overrides the default message.
     */

    public void setADMMessage(Message aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @return The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message
     *         overrides the default message.
     */

    public Message getADMMessage() {
        return this.aDMMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @param aDMMessage
     *        The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message
     *        overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withADMMessage(Message aDMMessage) {
        setADMMessage(aDMMessage);
        return this;
    }

    /**
     * <p>
     * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message
     * overrides the default message.
     * </p>
     * 
     * @param aPNSMessage
     *        The message that the campaign sends through the APNs (Apple Push Notification service) channel. This
     *        message overrides the default message.
     */

    public void setAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message
     * overrides the default message.
     * </p>
     * 
     * @return The message that the campaign sends through the APNs (Apple Push Notification service) channel. This
     *         message overrides the default message.
     */

    public Message getAPNSMessage() {
        return this.aPNSMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message
     * overrides the default message.
     * </p>
     * 
     * @param aPNSMessage
     *        The message that the campaign sends through the APNs (Apple Push Notification service) channel. This
     *        message overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withAPNSMessage(Message aPNSMessage) {
        setAPNSMessage(aPNSMessage);
        return this;
    }

    /**
     * <p>
     * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @param baiduMessage
     *        The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides
     *        the default message.
     */

    public void setBaiduMessage(Message baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @return The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides
     *         the default message.
     */

    public Message getBaiduMessage() {
        return this.baiduMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default message.
     * </p>
     * 
     * @param baiduMessage
     *        The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides
     *        the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withBaiduMessage(Message baiduMessage) {
        setBaiduMessage(baiduMessage);
        return this;
    }

    /**
     * <p>
     * The default message that the campaign sends through all the channels that are configured for the campaign.
     * </p>
     * 
     * @param defaultMessage
     *        The default message that the campaign sends through all the channels that are configured for the campaign.
     */

    public void setDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * <p>
     * The default message that the campaign sends through all the channels that are configured for the campaign.
     * </p>
     * 
     * @return The default message that the campaign sends through all the channels that are configured for the
     *         campaign.
     */

    public Message getDefaultMessage() {
        return this.defaultMessage;
    }

    /**
     * <p>
     * The default message that the campaign sends through all the channels that are configured for the campaign.
     * </p>
     * 
     * @param defaultMessage
     *        The default message that the campaign sends through all the channels that are configured for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withDefaultMessage(Message defaultMessage) {
        setDefaultMessage(defaultMessage);
        return this;
    }

    /**
     * <p>
     * The message that the campaign sends through the email channel.
     * </p>
     * 
     * @param emailMessage
     *        The message that the campaign sends through the email channel.
     */

    public void setEmailMessage(CampaignEmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the email channel.
     * </p>
     * 
     * @return The message that the campaign sends through the email channel.
     */

    public CampaignEmailMessage getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the email channel.
     * </p>
     * 
     * @param emailMessage
     *        The message that the campaign sends through the email channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withEmailMessage(CampaignEmailMessage emailMessage) {
        setEmailMessage(emailMessage);
        return this;
    }

    /**
     * <p>
     * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This
     * message overrides the default message.
     * </p>
     * 
     * @param gCMMessage
     *        The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     *        notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *        This message overrides the default message.
     */

    public void setGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This
     * message overrides the default message.
     * </p>
     * 
     * @return The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     *         notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *         This message overrides the default message.
     */

    public Message getGCMMessage() {
        return this.gCMMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This
     * message overrides the default message.
     * </p>
     * 
     * @param gCMMessage
     *        The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push
     *        notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *        This message overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withGCMMessage(Message gCMMessage) {
        setGCMMessage(gCMMessage);
        return this;
    }

    /**
     * <p>
     * The message that the campaign sends through the SMS channel.
     * </p>
     * 
     * @param sMSMessage
     *        The message that the campaign sends through the SMS channel.
     */

    public void setSMSMessage(CampaignSmsMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the SMS channel.
     * </p>
     * 
     * @return The message that the campaign sends through the SMS channel.
     */

    public CampaignSmsMessage getSMSMessage() {
        return this.sMSMessage;
    }

    /**
     * <p>
     * The message that the campaign sends through the SMS channel.
     * </p>
     * 
     * @param sMSMessage
     *        The message that the campaign sends through the SMS channel.
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
