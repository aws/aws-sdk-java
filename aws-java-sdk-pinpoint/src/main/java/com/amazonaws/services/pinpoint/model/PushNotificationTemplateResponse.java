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
 * Provides information about the content and settings for a message template that can be used in messages that are sent
 * through a push notification channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PushNotificationTemplateResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationTemplateResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides
     * the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate aDM;
    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private APNSPushNotificationTemplate aPNS;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate baidu;
    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     */
    private DefaultPushNotificationTemplate defaultValue;
    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     */
    private String defaultSubstitutions;
    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to send notifications through the Firebase
     * Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate gCM;
    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The unique identifier for the recommender model that's used by the message template.
     * </p>
     */
    private String recommenderId;
    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The custom description of the message template.
     * </p>
     */
    private String templateDescription;
    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The type of channel that the message template is designed for. For a push notification template, this value is
     * PUSH.
     * </p>
     */
    private String templateType;
    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides
     * the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aDM
     *        The message template that's used for the ADM (Amazon Device Messaging) channel. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setADM(AndroidPushNotificationTemplate aDM) {
        this.aDM = aDM;
    }

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides
     * the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template that's used for the ADM (Amazon Device Messaging) channel. This message template
     *         overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getADM() {
        return this.aDM;
    }

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides
     * the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aDM
     *        The message template that's used for the ADM (Amazon Device Messaging) channel. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withADM(AndroidPushNotificationTemplate aDM) {
        setADM(aDM);
        return this;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aPNS
     *        The message template that's used for the APNs (Apple Push Notification service) channel. This message
     *        template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setAPNS(APNSPushNotificationTemplate aPNS) {
        this.aPNS = aPNS;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template that's used for the APNs (Apple Push Notification service) channel. This message
     *         template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public APNSPushNotificationTemplate getAPNS() {
        return this.aPNS;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification service) channel. This message template
     * overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param aPNS
     *        The message template that's used for the APNs (Apple Push Notification service) channel. This message
     *        template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withAPNS(APNSPushNotificationTemplate aPNS) {
        setAPNS(aPNS);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the message template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param baidu
     *        The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides
     *        the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template
     *         overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getBaidu() {
        return this.baidu;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param baidu
     *        The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides
     *        the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withBaidu(AndroidPushNotificationTemplate baidu) {
        setBaidu(baidu);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the message template was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the message template was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the message template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     * 
     * @param defaultValue
     *        The default message template that's used for push notification channels.
     */

    public void setDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     * 
     * @return The default message template that's used for push notification channels.
     */

    public DefaultPushNotificationTemplate getDefault() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     * 
     * @param defaultValue
     *        The default message template that's used for push notification channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withDefault(DefaultPushNotificationTemplate defaultValue) {
        setDefault(defaultValue);
        return this;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @param defaultSubstitutions
     *        The JSON object that specifies the default values that are used for message variables in the message
     *        template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *        The corresponding value defines the default value for that variable.
     */

    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @return The JSON object that specifies the default values that are used for message variables in the message
     *         template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *         The corresponding value defines the default value for that variable.
     */

    public String getDefaultSubstitutions() {
        return this.defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @param defaultSubstitutions
     *        The JSON object that specifies the default values that are used for message variables in the message
     *        template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *        The corresponding value defines the default value for that variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withDefaultSubstitutions(String defaultSubstitutions) {
        setDefaultSubstitutions(defaultSubstitutions);
        return this;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to send notifications through the Firebase
     * Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param gCM
     *        The message template that's used for the GCM channel, which is used to send notifications through the
     *        Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public void setGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to send notifications through the Firebase
     * Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @return The message template that's used for the GCM channel, which is used to send notifications through the
     *         Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template
     *         overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     */

    public AndroidPushNotificationTemplate getGCM() {
        return this.gCM;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to send notifications through the Firebase
     * Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * 
     * @param gCM
     *        The message template that's used for the GCM channel, which is used to send notifications through the
     *        Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template
     *        overrides the default template for push notification channels (DefaultPushNotificationTemplate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withGCM(AndroidPushNotificationTemplate gCM) {
        setGCM(gCM);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the message template was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the message template was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the message template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the message template.
     * </p>
     * 
     * @param recommenderId
     *        The unique identifier for the recommender model that's used by the message template.
     */

    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the message template.
     * </p>
     * 
     * @return The unique identifier for the recommender model that's used by the message template.
     */

    public String getRecommenderId() {
        return this.recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the message template.
     * </p>
     * 
     * @param recommenderId
     *        The unique identifier for the recommender model that's used by the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withRecommenderId(String recommenderId) {
        setRecommenderId(recommenderId);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *         template. Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PushNotificationTemplateResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse addTagsEntry(String key, String value) {
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

    public PushNotificationTemplateResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @param templateDescription
     *        The custom description of the message template.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @return The custom description of the message template.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @param templateDescription
     *        The custom description of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @return The name of the message template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push notification template, this value is
     * PUSH.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a push notification template, this
     *        value is PUSH.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push notification template, this value is
     * PUSH.
     * </p>
     * 
     * @return The type of channel that the message template is designed for. For a push notification template, this
     *         value is PUSH.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push notification template, this value is
     * PUSH.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a push notification template, this
     *        value is PUSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public PushNotificationTemplateResponse withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push notification template, this value is
     * PUSH.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a push notification template, this
     *        value is PUSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public PushNotificationTemplateResponse withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @param version
     *        The unique identifier, as an integer, for the active version of the message template, or the version of
     *        the template that you specified by using the version parameter in your request.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @return The unique identifier, as an integer, for the active version of the message template, or the version of
     *         the template that you specified by using the version parameter in your request.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @param version
     *        The unique identifier, as an integer, for the active version of the message template, or the version of
     *        the template that you specified by using the version parameter in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationTemplateResponse withVersion(String version) {
        setVersion(version);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBaidu() != null)
            sb.append("Baidu: ").append(getBaidu()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDefault() != null)
            sb.append("Default: ").append(getDefault()).append(",");
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: ").append(getDefaultSubstitutions()).append(",");
        if (getGCM() != null)
            sb.append("GCM: ").append(getGCM()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getRecommenderId() != null)
            sb.append("RecommenderId: ").append(getRecommenderId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: ").append(getTemplateDescription()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationTemplateResponse == false)
            return false;
        PushNotificationTemplateResponse other = (PushNotificationTemplateResponse) obj;
        if (other.getADM() == null ^ this.getADM() == null)
            return false;
        if (other.getADM() != null && other.getADM().equals(this.getADM()) == false)
            return false;
        if (other.getAPNS() == null ^ this.getAPNS() == null)
            return false;
        if (other.getAPNS() != null && other.getAPNS().equals(this.getAPNS()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBaidu() == null ^ this.getBaidu() == null)
            return false;
        if (other.getBaidu() != null && other.getBaidu().equals(this.getBaidu()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefault() == null ^ this.getDefault() == null)
            return false;
        if (other.getDefault() != null && other.getDefault().equals(this.getDefault()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getGCM() == null ^ this.getGCM() == null)
            return false;
        if (other.getGCM() != null && other.getGCM().equals(this.getGCM()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADM() == null) ? 0 : getADM().hashCode());
        hashCode = prime * hashCode + ((getAPNS() == null) ? 0 : getAPNS().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefault() == null) ? 0 : getDefault().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getGCM() == null) ? 0 : getGCM().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public PushNotificationTemplateResponse clone() {
        try {
            return (PushNotificationTemplateResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.PushNotificationTemplateResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
