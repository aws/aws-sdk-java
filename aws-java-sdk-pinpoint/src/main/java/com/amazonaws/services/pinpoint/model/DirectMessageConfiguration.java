/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the settings and content for the default message and any default messages that you tailored for specific
 * channels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DirectMessageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectMessageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private ADMMessage aDMMessage;
    /**
     * <p>
     * The default push notification message for the APNs (Apple Push Notification service) channel. This message
     * overrides the default push notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private APNSMessage aPNSMessage;
    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private BaiduMessage baiduMessage;
    /**
     * <p>
     * The default message for all channels.
     * </p>
     */
    private DefaultMessage defaultMessage;
    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     */
    private DefaultPushNotificationMessage defaultPushNotificationMessage;
    /**
     * <p>
     * The default message for the email channel. This message overrides the default message (DefaultMessage).
     * </p>
     */
    private EmailMessage emailMessage;
    /**
     * <p>
     * The default push notification message for the GCM channel, which is used to send notifications through the
     * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private GCMMessage gCMMessage;
    /**
     * <p>
     * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     * </p>
     */
    private SMSMessage sMSMessage;
    /**
     * <p>
     * The default message for the voice channel. This message overrides the default message (DefaultMessage).
     * </p>
     */
    private VoiceMessage voiceMessage;

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param aDMMessage
     *        The default push notification message for the ADM (Amazon Device Messaging) channel. This message
     *        overrides the default push notification message (DefaultPushNotificationMessage).
     */

    public void setADMMessage(ADMMessage aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @return The default push notification message for the ADM (Amazon Device Messaging) channel. This message
     *         overrides the default push notification message (DefaultPushNotificationMessage).
     */

    public ADMMessage getADMMessage() {
        return this.aDMMessage;
    }

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param aDMMessage
     *        The default push notification message for the ADM (Amazon Device Messaging) channel. This message
     *        overrides the default push notification message (DefaultPushNotificationMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withADMMessage(ADMMessage aDMMessage) {
        setADMMessage(aDMMessage);
        return this;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push Notification service) channel. This message
     * overrides the default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param aPNSMessage
     *        The default push notification message for the APNs (Apple Push Notification service) channel. This message
     *        overrides the default push notification message (DefaultPushNotificationMessage).
     */

    public void setAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push Notification service) channel. This message
     * overrides the default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @return The default push notification message for the APNs (Apple Push Notification service) channel. This
     *         message overrides the default push notification message (DefaultPushNotificationMessage).
     */

    public APNSMessage getAPNSMessage() {
        return this.aPNSMessage;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push Notification service) channel. This message
     * overrides the default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param aPNSMessage
     *        The default push notification message for the APNs (Apple Push Notification service) channel. This message
     *        overrides the default push notification message (DefaultPushNotificationMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withAPNSMessage(APNSMessage aPNSMessage) {
        setAPNSMessage(aPNSMessage);
        return this;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param baiduMessage
     *        The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     *        default push notification message (DefaultPushNotificationMessage).
     */

    public void setBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @return The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides
     *         the default push notification message (DefaultPushNotificationMessage).
     */

    public BaiduMessage getBaiduMessage() {
        return this.baiduMessage;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param baiduMessage
     *        The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the
     *        default push notification message (DefaultPushNotificationMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withBaiduMessage(BaiduMessage baiduMessage) {
        setBaiduMessage(baiduMessage);
        return this;
    }

    /**
     * <p>
     * The default message for all channels.
     * </p>
     * 
     * @param defaultMessage
     *        The default message for all channels.
     */

    public void setDefaultMessage(DefaultMessage defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * <p>
     * The default message for all channels.
     * </p>
     * 
     * @return The default message for all channels.
     */

    public DefaultMessage getDefaultMessage() {
        return this.defaultMessage;
    }

    /**
     * <p>
     * The default message for all channels.
     * </p>
     * 
     * @param defaultMessage
     *        The default message for all channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withDefaultMessage(DefaultMessage defaultMessage) {
        setDefaultMessage(defaultMessage);
        return this;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     * 
     * @param defaultPushNotificationMessage
     *        The default push notification message for all push notification channels.
     */

    public void setDefaultPushNotificationMessage(DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     * 
     * @return The default push notification message for all push notification channels.
     */

    public DefaultPushNotificationMessage getDefaultPushNotificationMessage() {
        return this.defaultPushNotificationMessage;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     * 
     * @param defaultPushNotificationMessage
     *        The default push notification message for all push notification channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withDefaultPushNotificationMessage(DefaultPushNotificationMessage defaultPushNotificationMessage) {
        setDefaultPushNotificationMessage(defaultPushNotificationMessage);
        return this;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param emailMessage
     *        The default message for the email channel. This message overrides the default message (DefaultMessage).
     */

    public void setEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @return The default message for the email channel. This message overrides the default message (DefaultMessage).
     */

    public EmailMessage getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param emailMessage
     *        The default message for the email channel. This message overrides the default message (DefaultMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withEmailMessage(EmailMessage emailMessage) {
        setEmailMessage(emailMessage);
        return this;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used to send notifications through the
     * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param gCMMessage
     *        The default push notification message for the GCM channel, which is used to send notifications through the
     *        Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     *        default push notification message (DefaultPushNotificationMessage).
     */

    public void setGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used to send notifications through the
     * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @return The default push notification message for the GCM channel, which is used to send notifications through
     *         the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message
     *         overrides the default push notification message (DefaultPushNotificationMessage).
     */

    public GCMMessage getGCMMessage() {
        return this.gCMMessage;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used to send notifications through the
     * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     * default push notification message (DefaultPushNotificationMessage).
     * </p>
     * 
     * @param gCMMessage
     *        The default push notification message for the GCM channel, which is used to send notifications through the
     *        Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the
     *        default push notification message (DefaultPushNotificationMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withGCMMessage(GCMMessage gCMMessage) {
        setGCMMessage(gCMMessage);
        return this;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param sMSMessage
     *        The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     */

    public void setSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @return The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     */

    public SMSMessage getSMSMessage() {
        return this.sMSMessage;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param sMSMessage
     *        The default message for the SMS channel. This message overrides the default message (DefaultMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withSMSMessage(SMSMessage sMSMessage) {
        setSMSMessage(sMSMessage);
        return this;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param voiceMessage
     *        The default message for the voice channel. This message overrides the default message (DefaultMessage).
     */

    public void setVoiceMessage(VoiceMessage voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @return The default message for the voice channel. This message overrides the default message (DefaultMessage).
     */

    public VoiceMessage getVoiceMessage() {
        return this.voiceMessage;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the default message (DefaultMessage).
     * </p>
     * 
     * @param voiceMessage
     *        The default message for the voice channel. This message overrides the default message (DefaultMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withVoiceMessage(VoiceMessage voiceMessage) {
        setVoiceMessage(voiceMessage);
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
        if (getDefaultPushNotificationMessage() != null)
            sb.append("DefaultPushNotificationMessage: ").append(getDefaultPushNotificationMessage()).append(",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: ").append(getEmailMessage()).append(",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: ").append(getGCMMessage()).append(",");
        if (getSMSMessage() != null)
            sb.append("SMSMessage: ").append(getSMSMessage()).append(",");
        if (getVoiceMessage() != null)
            sb.append("VoiceMessage: ").append(getVoiceMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectMessageConfiguration == false)
            return false;
        DirectMessageConfiguration other = (DirectMessageConfiguration) obj;
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
        if (other.getDefaultPushNotificationMessage() == null ^ this.getDefaultPushNotificationMessage() == null)
            return false;
        if (other.getDefaultPushNotificationMessage() != null
                && other.getDefaultPushNotificationMessage().equals(this.getDefaultPushNotificationMessage()) == false)
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
        if (other.getVoiceMessage() == null ^ this.getVoiceMessage() == null)
            return false;
        if (other.getVoiceMessage() != null && other.getVoiceMessage().equals(this.getVoiceMessage()) == false)
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
        hashCode = prime * hashCode + ((getDefaultPushNotificationMessage() == null) ? 0 : getDefaultPushNotificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        hashCode = prime * hashCode + ((getVoiceMessage() == null) ? 0 : getVoiceMessage().hashCode());
        return hashCode;
    }

    @Override
    public DirectMessageConfiguration clone() {
        try {
            return (DirectMessageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DirectMessageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
