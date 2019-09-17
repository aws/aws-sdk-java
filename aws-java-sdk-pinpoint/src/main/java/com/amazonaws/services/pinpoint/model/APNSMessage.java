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
 * Specifies the settings for a one-time message that's sent directly to an endpoint through the APNs (Apple Push
 * Notification service) channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the
     * push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge,
     * set this value to 0.
     * </p>
     */
    private Integer badge;
    /**
     * <p>
     * The body of the notification message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The key that indicates the notification type for the push notification. This key is a value that's defined by the
     * identifier property of one of your app's registered categories.
     * </p>
     */
    private String category;
    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single
     * push notification instead of delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     * message to APNs.
     * </p>
     */
    private String collapseId;
    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody
     * object of the notification.
     * </p>
     */
    private java.util.Map<String, String> data;
    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     */
    private String mediaUrl;
    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push Notification
     * service (APNs), CERTIFICATE or TOKEN.
     * </p>
     */
    private String preferredAuthenticationMethod;
    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification
     * should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message
     * to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for
     * 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the
     * value to the corresponding APNs value.
     * </p>
     */
    private String priority;
    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the
     * message.
     * </p>
     */
    private String rawContent;
    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or supporting phone home functionality.
     * </p>
     */
    private Boolean silentPush;
    /**
     * <p>
     * The key for the sound to play when the recipient receives the push notification. The value of this key is the
     * name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the
     * sound file can't be found or you specify default for the value, the system plays the default alert sound.
     * </p>
     */
    private String sound;
    /**
     * <p>
     * The default message variables to use in the notification message. You can override these default variables with
     * individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * <p>
     * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification
     * Content app extension, you can use this value to group your notifications together.
     * </p>
     */
    private String threadId;
    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the
     * service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as
     * if it expires immediately and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message
     * to APNs.
     * </p>
     */
    private Integer timeToLive;
    /**
     * <p>
     * The title to display above the notification message on the recipient's device.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the
     * value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to occur if the recipient taps the push notification. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the
     *        default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     *        deep-linking features of the iOS platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     *        specify.
     *        </p>
     *        </li>
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action to occur if the recipient taps the push notification. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the
     *         default action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     *         deep-linking features of the iOS platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     *         specify.
     *         </p>
     *         </li>
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to occur if the recipient taps the push notification. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the
     *        default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     *        deep-linking features of the iOS platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     *        specify.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public APNSMessage withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to occur if the recipient taps the push notification. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the
     *        default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     *        deep-linking features of the iOS platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     *        specify.
     *        </p>
     *        </li>
     * @see Action
     */

    public void setAction(Action action) {
        withAction(action);
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     * deep-linking features of the iOS platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     * specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action to occur if the recipient taps the push notification. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the
     *        default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the
     *        deep-linking features of the iOS platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you
     *        specify.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public APNSMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the
     * push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge,
     * set this value to 0.
     * </p>
     * 
     * @param badge
     *        The key that indicates whether and how to modify the badge of your app's icon when the recipient receives
     *        the push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove
     *        the badge, set this value to 0.
     */

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the
     * push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge,
     * set this value to 0.
     * </p>
     * 
     * @return The key that indicates whether and how to modify the badge of your app's icon when the recipient receives
     *         the push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove
     *         the badge, set this value to 0.
     */

    public Integer getBadge() {
        return this.badge;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the
     * push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge,
     * set this value to 0.
     * </p>
     * 
     * @param badge
     *        The key that indicates whether and how to modify the badge of your app's icon when the recipient receives
     *        the push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove
     *        the badge, set this value to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withBadge(Integer badge) {
        setBadge(badge);
        return this;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     * 
     * @param body
     *        The body of the notification message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     * 
     * @return The body of the notification message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     * 
     * @param body
     *        The body of the notification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification. This key is a value that's defined by the
     * identifier property of one of your app's registered categories.
     * </p>
     * 
     * @param category
     *        The key that indicates the notification type for the push notification. This key is a value that's defined
     *        by the identifier property of one of your app's registered categories.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification. This key is a value that's defined by the
     * identifier property of one of your app's registered categories.
     * </p>
     * 
     * @return The key that indicates the notification type for the push notification. This key is a value that's
     *         defined by the identifier property of one of your app's registered categories.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification. This key is a value that's defined by the
     * identifier property of one of your app's registered categories.
     * </p>
     * 
     * @param category
     *        The key that indicates the notification type for the push notification. This key is a value that's defined
     *        by the identifier property of one of your app's registered categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single
     * push notification instead of delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     * message to APNs.
     * </p>
     * 
     * @param collapseId
     *        An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a
     *        single push notification instead of delivering each message individually. This value can't exceed 64
     *        bytes.</p>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     *        message to APNs.
     */

    public void setCollapseId(String collapseId) {
        this.collapseId = collapseId;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single
     * push notification instead of delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     * message to APNs.
     * </p>
     * 
     * @return An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a
     *         single push notification instead of delivering each message individually. This value can't exceed 64
     *         bytes.</p>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the
     *         notification message to APNs.
     */

    public String getCollapseId() {
        return this.collapseId;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single
     * push notification instead of delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     * message to APNs.
     * </p>
     * 
     * @param collapseId
     *        An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a
     *        single push notification instead of delivering each message individually. This value can't exceed 64
     *        bytes.</p>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification
     *        message to APNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withCollapseId(String collapseId) {
        setCollapseId(collapseId);
        return this;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody
     * object of the notification.
     * </p>
     * 
     * @return The JSON payload to use for a silent push notification. This payload is added to the
     *         data.pinpoint.jsonBody object of the notification.
     */

    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody
     * object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON payload to use for a silent push notification. This payload is added to the
     *        data.pinpoint.jsonBody object of the notification.
     */

    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody
     * object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON payload to use for a silent push notification. This payload is added to the
     *        data.pinpoint.jsonBody object of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

    public APNSMessage addDataEntry(String key, String value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, String>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     * 
     * @param mediaUrl
     *        The URL of an image or video to display in the push notification.
     */

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     * 
     * @return The URL of an image or video to display in the push notification.
     */

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     * 
     * @param mediaUrl
     *        The URL of an image or video to display in the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withMediaUrl(String mediaUrl) {
        setMediaUrl(mediaUrl);
        return this;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push Notification
     * service (APNs), CERTIFICATE or TOKEN.
     * </p>
     * 
     * @param preferredAuthenticationMethod
     *        The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push
     *        Notification service (APNs), CERTIFICATE or TOKEN.
     */

    public void setPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        this.preferredAuthenticationMethod = preferredAuthenticationMethod;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push Notification
     * service (APNs), CERTIFICATE or TOKEN.
     * </p>
     * 
     * @return The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push
     *         Notification service (APNs), CERTIFICATE or TOKEN.
     */

    public String getPreferredAuthenticationMethod() {
        return this.preferredAuthenticationMethod;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push Notification
     * service (APNs), CERTIFICATE or TOKEN.
     * </p>
     * 
     * @param preferredAuthenticationMethod
     *        The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push
     *        Notification service (APNs), CERTIFICATE or TOKEN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        setPreferredAuthenticationMethod(preferredAuthenticationMethod);
        return this;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification
     * should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message
     * to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for
     * 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the
     * value to the corresponding APNs value.
     * </p>
     * 
     * @param priority
     *        para>5 - Low priority, the notification might be delayed, delivered as part of a group, or
     *        throttled.</p>/listitem> <li>
     *        <p>
     *        10 - High priority, the notification is sent immediately. This is the default value. A high priority
     *        notification should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     *        </p>
     *        </li>/para>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification
     *        message to APNs.
     *        </p>
     *        <p>
     *        The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are
     *        normal, for 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts
     *        and converts the value to the corresponding APNs value.
     */

    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification
     * should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message
     * to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for
     * 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the
     * value to the corresponding APNs value.
     * </p>
     * 
     * @return para>5 - Low priority, the notification might be delayed, delivered as part of a group, or
     *         throttled.</p>/listitem> <li>
     *         <p>
     *         10 - High priority, the notification is sent immediately. This is the default value. A high priority
     *         notification should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     *         </p>
     *         </li>/para>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification
     *         message to APNs.
     *         </p>
     *         <p>
     *         The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are
     *         normal, for 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts
     *         and converts the value to the corresponding APNs value.
     */

    public String getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification
     * should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message
     * to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for
     * 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the
     * value to the corresponding APNs value.
     * </p>
     * 
     * @param priority
     *        para>5 - Low priority, the notification might be delayed, delivered as part of a group, or
     *        throttled.</p>/listitem> <li>
     *        <p>
     *        10 - High priority, the notification is sent immediately. This is the default value. A high priority
     *        notification should trigger an alert, play a sound, or badge your app's icon on the recipient's device.
     *        </p>
     *        </li>/para>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification
     *        message to APNs.
     *        </p>
     *        <p>
     *        The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are
     *        normal, for 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts
     *        and converts the value to the corresponding APNs value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withPriority(String priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the
     * message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the notification message. This value overrides
     *        the message.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the
     * message.
     * </p>
     * 
     * @return The raw, JSON-formatted string to use as the payload for the notification message. This value overrides
     *         the message.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the
     * message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the notification message. This value overrides
     *        the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or supporting phone home functionality.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the notification is a silent push notification, which is a push notification that
     *        doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *        an app's configuration, displaying messages in an in-app message center, or supporting phone home
     *        functionality.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or supporting phone home functionality.
     * </p>
     * 
     * @return Specifies whether the notification is a silent push notification, which is a push notification that
     *         doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *         an app's configuration, displaying messages in an in-app message center, or supporting phone home
     *         functionality.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or supporting phone home functionality.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the notification is a silent push notification, which is a push notification that
     *        doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *        an app's configuration, displaying messages in an in-app message center, or supporting phone home
     *        functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or supporting phone home functionality.
     * </p>
     * 
     * @return Specifies whether the notification is a silent push notification, which is a push notification that
     *         doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *         an app's configuration, displaying messages in an in-app message center, or supporting phone home
     *         functionality.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push notification. The value of this key is the
     * name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the
     * sound file can't be found or you specify default for the value, the system plays the default alert sound.
     * </p>
     * 
     * @param sound
     *        The key for the sound to play when the recipient receives the push notification. The value of this key is
     *        the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data
     *        container. If the sound file can't be found or you specify default for the value, the system plays the
     *        default alert sound.
     */

    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push notification. The value of this key is the
     * name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the
     * sound file can't be found or you specify default for the value, the system plays the default alert sound.
     * </p>
     * 
     * @return The key for the sound to play when the recipient receives the push notification. The value of this key is
     *         the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data
     *         container. If the sound file can't be found or you specify default for the value, the system plays the
     *         default alert sound.
     */

    public String getSound() {
        return this.sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push notification. The value of this key is the
     * name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the
     * sound file can't be found or you specify default for the value, the system plays the default alert sound.
     * </p>
     * 
     * @param sound
     *        The key for the sound to play when the recipient receives the push notification. The value of this key is
     *        the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data
     *        container. If the sound file can't be found or you specify default for the value, the system plays the
     *        default alert sound.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withSound(String sound) {
        setSound(sound);
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override these default variables with
     * individual address variables.
     * </p>
     * 
     * @return The default message variables to use in the notification message. You can override these default
     *         variables with individual address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override these default variables with
     * individual address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the notification message. You can override these default variables
     *        with individual address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override these default variables with
     * individual address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the notification message. You can override these default variables
     *        with individual address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public APNSMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification
     * Content app extension, you can use this value to group your notifications together.
     * </p>
     * 
     * @param threadId
     *        The key that represents your app-specific identifier for grouping notifications. If you provide a
     *        Notification Content app extension, you can use this value to group your notifications together.
     */

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification
     * Content app extension, you can use this value to group your notifications together.
     * </p>
     * 
     * @return The key that represents your app-specific identifier for grouping notifications. If you provide a
     *         Notification Content app extension, you can use this value to group your notifications together.
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification
     * Content app extension, you can use this value to group your notifications together.
     * </p>
     * 
     * @param threadId
     *        The key that represents your app-specific identifier for grouping notifications. If you provide a
     *        Notification Content app extension, you can use this value to group your notifications together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withThreadId(String threadId) {
        setThreadId(threadId);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the
     * service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as
     * if it expires immediately and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message
     * to APNs.
     * </p>
     * 
     * @param timeToLive
     *        The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if
     *        the service is unable to deliver the notification the first time. If this value is 0, APNs treats the
     *        notification as if it expires immediately and the service doesn't store or try to deliver the notification
     *        again.</p>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification
     *        message to APNs.
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the
     * service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as
     * if it expires immediately and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message
     * to APNs.
     * </p>
     * 
     * @return The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if
     *         the service is unable to deliver the notification the first time. If this value is 0, APNs treats the
     *         notification as if it expires immediately and the service doesn't store or try to deliver the
     *         notification again.</p>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification
     *         message to APNs.
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the
     * service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as
     * if it expires immediately and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message
     * to APNs.
     * </p>
     * 
     * @param timeToLive
     *        The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if
     *        the service is unable to deliver the notification the first time. If this value is 0, APNs treats the
     *        notification as if it expires immediately and the service doesn't store or try to deliver the notification
     *        again.</p>
     *        <p>
     *        Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification
     *        message to APNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withTimeToLive(Integer timeToLive) {
        setTimeToLive(timeToLive);
        return this;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's device.
     * </p>
     * 
     * @param title
     *        The title to display above the notification message on the recipient's device.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's device.
     * </p>
     * 
     * @return The title to display above the notification message on the recipient's device.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's device.
     * </p>
     * 
     * @param title
     *        The title to display above the notification message on the recipient's device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the
     * value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and
     *        the value of the Action property is URL.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the
     * value of the Action property is URL.
     * </p>
     * 
     * @return The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and
     *         the value of the Action property is URL.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the
     * value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and
     *        the value of the Action property is URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withUrl(String url) {
        setUrl(url);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getBadge() != null)
            sb.append("Badge: ").append(getBadge()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getCollapseId() != null)
            sb.append("CollapseId: ").append(getCollapseId()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: ").append(getMediaUrl()).append(",");
        if (getPreferredAuthenticationMethod() != null)
            sb.append("PreferredAuthenticationMethod: ").append(getPreferredAuthenticationMethod()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSilentPush() != null)
            sb.append("SilentPush: ").append(getSilentPush()).append(",");
        if (getSound() != null)
            sb.append("Sound: ").append(getSound()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getThreadId() != null)
            sb.append("ThreadId: ").append(getThreadId()).append(",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSMessage == false)
            return false;
        APNSMessage other = (APNSMessage) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBadge() == null ^ this.getBadge() == null)
            return false;
        if (other.getBadge() != null && other.getBadge().equals(this.getBadge()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCollapseId() == null ^ this.getCollapseId() == null)
            return false;
        if (other.getCollapseId() != null && other.getCollapseId().equals(this.getCollapseId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getPreferredAuthenticationMethod() == null ^ this.getPreferredAuthenticationMethod() == null)
            return false;
        if (other.getPreferredAuthenticationMethod() != null
                && other.getPreferredAuthenticationMethod().equals(this.getPreferredAuthenticationMethod()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null && other.getSilentPush().equals(this.getSilentPush()) == false)
            return false;
        if (other.getSound() == null ^ this.getSound() == null)
            return false;
        if (other.getSound() != null && other.getSound().equals(this.getSound()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getThreadId() == null ^ this.getThreadId() == null)
            return false;
        if (other.getThreadId() != null && other.getThreadId().equals(this.getThreadId()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getBadge() == null) ? 0 : getBadge().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCollapseId() == null) ? 0 : getCollapseId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getPreferredAuthenticationMethod() == null) ? 0 : getPreferredAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public APNSMessage clone() {
        try {
            return (APNSMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
