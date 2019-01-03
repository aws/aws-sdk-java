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
 * APNS Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     */
    private String action;
    /**
     * Include this key when you want the system to modify the badge of your app icon. If this key is not included in
     * the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     */
    private Integer badge;
    /** The message body of the notification. */
    private String body;
    /**
     * Provide this key with a string value that represents the notification's type. This value corresponds to the value
     * in the identifier property of one of your app's registered categories.
     */
    private String category;
    /**
     * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     * notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint
     * uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     */
    private String collapseId;
    /**
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     */
    private java.util.Map<String, String> data;
    /** A URL that refers to the location of an image or video that you want to display in the push notification. */
    private String mediaUrl;
    /** The preferred authentication method, either "CERTIFICATE" or "TOKEN" */
    private String preferredAuthenticationMethod;
    /**
     * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the
     * message to APNs. Accepts the following values:
     * 
     * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge
     * on the receiving device.
     * 
     * The default value is "10".
     * 
     * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for
     * APNs messages and converts them.
     * 
     * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote
     * Notification Programming Guide.
     */
    private String priority;
    /** The Raw JSON formatted string to be used as the payload. This value overrides the message. */
    private String rawContent;
    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     */
    private Boolean silentPush;
    /**
     * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in
     * your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be
     * found, or if you specify defaultfor the value, the system plays the default alert sound.
     */
    private String sound;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If
     * you provide a Notification Content app extension, you can use this value to group your notifications together.
     */
    private String threadId;
    /**
     * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs
     * does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the
     * apns-expiration request header when it sends the message to APNs.
     */
    private Integer timeToLive;
    /** The message title that displays above the message on the user's device. */
    private String title;
    /** The URL to open in the user's mobile browser. Used if the value for Action is URL. */
    private String url;

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a
     *        designated user interface within the app. URL - The default mobile browser on the user's device launches
     *        and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * 
     * @return The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your
     *         app launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *         action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a
     *         designated user interface within the app. URL - The default mobile browser on the user's device launches
     *         and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a
     *        designated user interface within the app. URL - The default mobile browser on the user's device launches
     *        and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public APNSMessage withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a
     *        designated user interface within the app. URL - The default mobile browser on the user's device launches
     *        and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * @see Action
     */

    public void setAction(Action action) {
        withAction(action);
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a
     *        designated user interface within the app. URL - The default mobile browser on the user's device launches
     *        and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public APNSMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * Include this key when you want the system to modify the badge of your app icon. If this key is not included in
     * the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     * 
     * @param badge
     *        Include this key when you want the system to modify the badge of your app icon. If this key is not
     *        included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     */

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * Include this key when you want the system to modify the badge of your app icon. If this key is not included in
     * the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     * 
     * @return Include this key when you want the system to modify the badge of your app icon. If this key is not
     *         included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to
     *         0.
     */

    public Integer getBadge() {
        return this.badge;
    }

    /**
     * Include this key when you want the system to modify the badge of your app icon. If this key is not included in
     * the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     * 
     * @param badge
     *        Include this key when you want the system to modify the badge of your app icon. If this key is not
     *        included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withBadge(Integer badge) {
        setBadge(badge);
        return this;
    }

    /**
     * The message body of the notification.
     * 
     * @param body
     *        The message body of the notification.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification.
     * 
     * @return The message body of the notification.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The message body of the notification.
     * 
     * @param body
     *        The message body of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * Provide this key with a string value that represents the notification's type. This value corresponds to the value
     * in the identifier property of one of your app's registered categories.
     * 
     * @param category
     *        Provide this key with a string value that represents the notification's type. This value corresponds to
     *        the value in the identifier property of one of your app's registered categories.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Provide this key with a string value that represents the notification's type. This value corresponds to the value
     * in the identifier property of one of your app's registered categories.
     * 
     * @return Provide this key with a string value that represents the notification's type. This value corresponds to
     *         the value in the identifier property of one of your app's registered categories.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * Provide this key with a string value that represents the notification's type. This value corresponds to the value
     * in the identifier property of one of your app's registered categories.
     * 
     * @param category
     *        Provide this key with a string value that represents the notification's type. This value corresponds to
     *        the value in the identifier property of one of your app's registered categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     * notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint
     * uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     * 
     * @param collapseId
     *        An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     *        notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon
     *        Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     */

    public void setCollapseId(String collapseId) {
        this.collapseId = collapseId;
    }

    /**
     * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     * notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint
     * uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     * 
     * @return An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     *         notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon
     *         Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     */

    public String getCollapseId() {
        return this.collapseId;
    }

    /**
     * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     * notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint
     * uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     * 
     * @param collapseId
     *        An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push
     *        notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon
     *        Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withCollapseId(String collapseId) {
        setCollapseId(collapseId);
        return this;
    }

    /**
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     * 
     * @return The data payload used for a silent push. This payload is added to the notifications'
     *         data.pinpoint.jsonBody' object
     */

    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     * 
     * @param data
     *        The data payload used for a silent push. This payload is added to the notifications'
     *        data.pinpoint.jsonBody' object
     */

    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     * 
     * @param data
     *        The data payload used for a silent push. This payload is added to the notifications'
     *        data.pinpoint.jsonBody' object
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
     * A URL that refers to the location of an image or video that you want to display in the push notification.
     * 
     * @param mediaUrl
     *        A URL that refers to the location of an image or video that you want to display in the push notification.
     */

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * A URL that refers to the location of an image or video that you want to display in the push notification.
     * 
     * @return A URL that refers to the location of an image or video that you want to display in the push notification.
     */

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    /**
     * A URL that refers to the location of an image or video that you want to display in the push notification.
     * 
     * @param mediaUrl
     *        A URL that refers to the location of an image or video that you want to display in the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withMediaUrl(String mediaUrl) {
        setMediaUrl(mediaUrl);
        return this;
    }

    /**
     * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     * 
     * @param preferredAuthenticationMethod
     *        The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     */

    public void setPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        this.preferredAuthenticationMethod = preferredAuthenticationMethod;
    }

    /**
     * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     * 
     * @return The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     */

    public String getPreferredAuthenticationMethod() {
        return this.preferredAuthenticationMethod;
    }

    /**
     * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     * 
     * @param preferredAuthenticationMethod
     *        The preferred authentication method, either "CERTIFICATE" or "TOKEN"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        setPreferredAuthenticationMethod(preferredAuthenticationMethod);
        return this;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the
     * message to APNs. Accepts the following values:
     * 
     * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge
     * on the receiving device.
     * 
     * The default value is "10".
     * 
     * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for
     * APNs messages and converts them.
     * 
     * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote
     * Notification Programming Guide.
     * 
     * @param priority
     *        The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it
     *        sends the message to APNs. Accepts the following values:
     * 
     *        "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     *        "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or
     *        badge on the receiving device.
     * 
     *        The default value is "10".
     * 
     *        The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these
     *        values for APNs messages and converts them.
     * 
     *        For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and
     *        Remote Notification Programming Guide.
     */

    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the
     * message to APNs. Accepts the following values:
     * 
     * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge
     * on the receiving device.
     * 
     * The default value is "10".
     * 
     * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for
     * APNs messages and converts them.
     * 
     * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote
     * Notification Programming Guide.
     * 
     * @return The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it
     *         sends the message to APNs. Accepts the following values:
     * 
     *         "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     *         "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound,
     *         or badge on the receiving device.
     * 
     *         The default value is "10".
     * 
     *         The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these
     *         values for APNs messages and converts them.
     * 
     *         For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and
     *         Remote Notification Programming Guide.
     */

    public String getPriority() {
        return this.priority;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the
     * message to APNs. Accepts the following values:
     * 
     * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge
     * on the receiving device.
     * 
     * The default value is "10".
     * 
     * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for
     * APNs messages and converts them.
     * 
     * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote
     * Notification Programming Guide.
     * 
     * @param priority
     *        The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it
     *        sends the message to APNs. Accepts the following values:
     * 
     *        "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
     * 
     *        "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or
     *        badge on the receiving device.
     * 
     *        The default value is "10".
     * 
     *        The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these
     *        values for APNs messages and converts them.
     * 
     *        For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and
     *        Remote Notification Programming Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withPriority(String priority) {
        setPriority(priority);
        return this;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @param rawContent
     *        The Raw JSON formatted string to be used as the payload. This value overrides the message.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @return The Raw JSON formatted string to be used as the payload. This value overrides the message.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * 
     * @param rawContent
     *        The Raw JSON formatted string to be used as the payload. This value overrides the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     * 
     * @param silentPush
     *        Indicates if the message should display on the users device. Silent pushes can be used for Remote
     *        Configuration and Phone Home use cases.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     * 
     * @return Indicates if the message should display on the users device. Silent pushes can be used for Remote
     *         Configuration and Phone Home use cases.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     * 
     * @param silentPush
     *        Indicates if the message should display on the users device. Silent pushes can be used for Remote
     *        Configuration and Phone Home use cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     * 
     * @return Indicates if the message should display on the users device. Silent pushes can be used for Remote
     *         Configuration and Phone Home use cases.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
    }

    /**
     * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in
     * your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be
     * found, or if you specify defaultfor the value, the system plays the default alert sound.
     * 
     * @param sound
     *        Include this key when you want the system to play a sound. The value of this key is the name of a sound
     *        file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound
     *        file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
     */

    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in
     * your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be
     * found, or if you specify defaultfor the value, the system plays the default alert sound.
     * 
     * @return Include this key when you want the system to play a sound. The value of this key is the name of a sound
     *         file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound
     *         file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
     */

    public String getSound() {
        return this.sound;
    }

    /**
     * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in
     * your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be
     * found, or if you specify defaultfor the value, the system plays the default alert sound.
     * 
     * @param sound
     *        Include this key when you want the system to play a sound. The value of this key is the name of a sound
     *        file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound
     *        file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withSound(String sound) {
        setSound(sound);
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @return Default message substitutions. Can be overridden by individual address substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
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
     * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If
     * you provide a Notification Content app extension, you can use this value to group your notifications together.
     * 
     * @param threadId
     *        Provide this key with a string value that represents the app-specific identifier for grouping
     *        notifications. If you provide a Notification Content app extension, you can use this value to group your
     *        notifications together.
     */

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If
     * you provide a Notification Content app extension, you can use this value to group your notifications together.
     * 
     * @return Provide this key with a string value that represents the app-specific identifier for grouping
     *         notifications. If you provide a Notification Content app extension, you can use this value to group your
     *         notifications together.
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If
     * you provide a Notification Content app extension, you can use this value to group your notifications together.
     * 
     * @param threadId
     *        Provide this key with a string value that represents the app-specific identifier for grouping
     *        notifications. If you provide a Notification Content app extension, you can use this value to group your
     *        notifications together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withThreadId(String threadId) {
        setThreadId(threadId);
        return this;
    }

    /**
     * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs
     * does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the
     * apns-expiration request header when it sends the message to APNs.
     * 
     * @param timeToLive
     *        The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0,
     *        APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value
     *        to set the apns-expiration request header when it sends the message to APNs.
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs
     * does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the
     * apns-expiration request header when it sends the message to APNs.
     * 
     * @return The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0,
     *         APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value
     *         to set the apns-expiration request header when it sends the message to APNs.
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs
     * does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the
     * apns-expiration request header when it sends the message to APNs.
     * 
     * @param timeToLive
     *        The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0,
     *        APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value
     *        to set the apns-expiration request header when it sends the message to APNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withTimeToLive(Integer timeToLive) {
        setTimeToLive(timeToLive);
        return this;
    }

    /**
     * The message title that displays above the message on the user's device.
     * 
     * @param title
     *        The message title that displays above the message on the user's device.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The message title that displays above the message on the user's device.
     * 
     * @return The message title that displays above the message on the user's device.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * The message title that displays above the message on the user's device.
     * 
     * @param title
     *        The message title that displays above the message on the user's device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSMessage withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for Action is URL.
     * 
     * @param url
     *        The URL to open in the user's mobile browser. Used if the value for Action is URL.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for Action is URL.
     * 
     * @return The URL to open in the user's mobile browser. Used if the value for Action is URL.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for Action is URL.
     * 
     * @param url
     *        The URL to open in the user's mobile browser. Used if the value for Action is URL.
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
