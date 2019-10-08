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
 * Specifies the content and settings for a message template that can be used in messages that are sent through a push
 * notification channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PushNotificationTemplateRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationTemplateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate aDM;
    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private APNSPushNotificationTemplate aPNS;
    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate baidu;
    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     */
    private DefaultPushNotificationTemplate defaultValue;
    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud
     * Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate gCM;
    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aDM
     *        The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides
     *        the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setADM(AndroidPushNotificationTemplate aDM) {
        this.aDM = aDM;
    }

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template to use for the ADM (Amazon Device Messaging) channel. This message template
     *         overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getADM() {
        return this.aDM;
    }

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aDM
     *        The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides
     *        the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withADM(AndroidPushNotificationTemplate aDM) {
        setADM(aDM);
        return this;
    }

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aPNS
     *        The message template to use for the APNs (Apple Push Notification service) channel. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setAPNS(APNSPushNotificationTemplate aPNS) {
        this.aPNS = aPNS;
    }

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template to use for the APNs (Apple Push Notification service) channel. This message template
     *         overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public APNSPushNotificationTemplate getAPNS() {
        return this.aPNS;
    }

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aPNS
     *        The message template to use for the APNs (Apple Push Notification service) channel. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withAPNS(APNSPushNotificationTemplate aPNS) {
        setAPNS(aPNS);
        return this;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param baidu
     *        The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     *        default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     *         default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getBaidu() {
        return this.baidu;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param baidu
     *        The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     *        default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withBaidu(AndroidPushNotificationTemplate baidu) {
        setBaidu(baidu);
        return this;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     * 
     * @param defaultValue
     *        The default message template to use for push notification channels.
     */

    public void setDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     * 
     * @return The default message template to use for push notification channels.
     */

    public DefaultPushNotificationTemplate getDefault() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     * 
     * @param defaultValue
     *        The default message template to use for push notification channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withDefault(DefaultPushNotificationTemplate defaultValue) {
        setDefault(defaultValue);
        return this;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud
     * Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param gCM
     *        The message template to use for the GCM channel, which is used to send notifications through the Firebase
     *        Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     *        default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud
     * Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template to use for the GCM channel, which is used to send notifications through the Firebase
     *         Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides
     *         the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getGCM() {
        return this.gCM;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud
     * Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default
     * template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param gCM
     *        The message template to use for the GCM channel, which is used to send notifications through the Firebase
     *        Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     *        default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withGCM(AndroidPushNotificationTemplate gCM) {
        setGCM(gCM);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *         Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *        Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *        Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public PushNotificationTemplateRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateRequest clearTagsEntries() {
        this.tags = null;
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
        if (getADM() != null)
            sb.append("ADM: ").append(getADM()).append(",");
        if (getAPNS() != null)
            sb.append("APNS: ").append(getAPNS()).append(",");
        if (getBaidu() != null)
            sb.append("Baidu: ").append(getBaidu()).append(",");
        if (getDefault() != null)
            sb.append("Default: ").append(getDefault()).append(",");
        if (getGCM() != null)
            sb.append("GCM: ").append(getGCM()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationTemplateRequest == false)
            return false;
        PushNotificationTemplateRequest other = (PushNotificationTemplateRequest) obj;
        if (other.getADM() == null ^ this.getADM() == null)
            return false;
        if (other.getADM() != null && other.getADM().equals(this.getADM()) == false)
            return false;
        if (other.getAPNS() == null ^ this.getAPNS() == null)
            return false;
        if (other.getAPNS() != null && other.getAPNS().equals(this.getAPNS()) == false)
            return false;
        if (other.getBaidu() == null ^ this.getBaidu() == null)
            return false;
        if (other.getBaidu() != null && other.getBaidu().equals(this.getBaidu()) == false)
            return false;
        if (other.getDefault() == null ^ this.getDefault() == null)
            return false;
        if (other.getDefault() != null && other.getDefault().equals(this.getDefault()) == false)
            return false;
        if (other.getGCM() == null ^ this.getGCM() == null)
            return false;
        if (other.getGCM() != null && other.getGCM().equals(this.getGCM()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADM() == null) ? 0 : getADM().hashCode());
        hashCode = prime * hashCode + ((getAPNS() == null) ? 0 : getAPNS().hashCode());
        hashCode = prime * hashCode + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        hashCode = prime * hashCode + ((getDefault() == null) ? 0 : getDefault().hashCode());
        hashCode = prime * hashCode + ((getGCM() == null) ? 0 : getGCM().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PushNotificationTemplateRequest clone() {
        try {
            return (PushNotificationTemplateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.PushNotificationTemplateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
