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
 * Specifies the settings for a one-time message that's sent directly to an endpoint through the ADM (Amazon Device
 * Messaging) channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ADMMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ADMMessage implements Serializable, Cloneable, StructuredPojo {

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
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking
     * features of the Android platform.
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
     * The body of the notification message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device Messaging
     * (ADM) can drop previously enqueued messages in favor of this message.
     * </p>
     */
    private String consolidationKey;
    /**
     * <p>
     * The JSON data payload to use for the push notification, if the notification is a silent push notification. This
     * payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     */
    private java.util.Map<String, String> data;
    /**
     * <p>
     * The amount of time, in seconds, that ADM should store the message if the recipient's device is offline. Amazon
     * Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message to ADM.
     * </p>
     */
    private String expiresAfter;
    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     */
    private String iconReference;
    /**
     * <p>
     * The URL of the large icon image to display in the content view of the push notification.
     * </p>
     */
    private String imageIconUrl;
    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to verify
     * the integrity of the data.
     * </p>
     */
    private String mD5;
    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value
     * overrides all other content for the message.
     * </p>
     */
    private String rawContent;
    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     */
    private Boolean silentPush;
    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the content view of the push notification.
     * </p>
     */
    private String smallImageIconUrl;
    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside
     * in /res/raw/.
     * </p>
     */
    private String sound;
    /**
     * <p>
     * The default message variables to use in the notification message. You can override the default variables with
     * individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
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
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking
     * features of the Android platform.
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
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the
     *        deep-linking features of the Android platform.
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
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking
     * features of the Android platform.
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
     *         DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the
     *         deep-linking features of the Android platform.
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
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking
     * features of the Android platform.
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
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the
     *        deep-linking features of the Android platform.
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

    public ADMMessage withAction(String action) {
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
     * DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking
     * features of the Android platform.
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
     *        DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the
     *        deep-linking features of the Android platform.
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

    public ADMMessage withAction(Action action) {
        this.action = action.toString();
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

    public ADMMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device Messaging
     * (ADM) can drop previously enqueued messages in favor of this message.
     * </p>
     * 
     * @param consolidationKey
     *        An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device
     *        Messaging (ADM) can drop previously enqueued messages in favor of this message.
     */

    public void setConsolidationKey(String consolidationKey) {
        this.consolidationKey = consolidationKey;
    }

    /**
     * <p>
     * An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device Messaging
     * (ADM) can drop previously enqueued messages in favor of this message.
     * </p>
     * 
     * @return An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device
     *         Messaging (ADM) can drop previously enqueued messages in favor of this message.
     */

    public String getConsolidationKey() {
        return this.consolidationKey;
    }

    /**
     * <p>
     * An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device Messaging
     * (ADM) can drop previously enqueued messages in favor of this message.
     * </p>
     * 
     * @param consolidationKey
     *        An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device
     *        Messaging (ADM) can drop previously enqueued messages in favor of this message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withConsolidationKey(String consolidationKey) {
        setConsolidationKey(consolidationKey);
        return this;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the notification is a silent push notification. This
     * payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @return The JSON data payload to use for the push notification, if the notification is a silent push
     *         notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     */

    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the notification is a silent push notification. This
     * payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON data payload to use for the push notification, if the notification is a silent push notification.
     *        This payload is added to the data.pinpoint.jsonBody object of the notification.
     */

    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the notification is a silent push notification. This
     * payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON data payload to use for the push notification, if the notification is a silent push notification.
     *        This payload is added to the data.pinpoint.jsonBody object of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

    /**
     * Add a single Data entry
     *
     * @see ADMMessage#withData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage addDataEntry(String key, String value) {
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

    public ADMMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that ADM should store the message if the recipient's device is offline. Amazon
     * Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message to ADM.
     * </p>
     * 
     * @param expiresAfter
     *        The amount of time, in seconds, that ADM should store the message if the recipient's device is offline.
     *        Amazon Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message
     *        to ADM.
     */

    public void setExpiresAfter(String expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * <p>
     * The amount of time, in seconds, that ADM should store the message if the recipient's device is offline. Amazon
     * Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message to ADM.
     * </p>
     * 
     * @return The amount of time, in seconds, that ADM should store the message if the recipient's device is offline.
     *         Amazon Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message
     *         to ADM.
     */

    public String getExpiresAfter() {
        return this.expiresAfter;
    }

    /**
     * <p>
     * The amount of time, in seconds, that ADM should store the message if the recipient's device is offline. Amazon
     * Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message to ADM.
     * </p>
     * 
     * @param expiresAfter
     *        The amount of time, in seconds, that ADM should store the message if the recipient's device is offline.
     *        Amazon Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message
     *        to ADM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withExpiresAfter(String expiresAfter) {
        setExpiresAfter(expiresAfter);
        return this;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     * 
     * @param iconReference
     *        The icon image name of the asset saved in your app.
     */

    public void setIconReference(String iconReference) {
        this.iconReference = iconReference;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     * 
     * @return The icon image name of the asset saved in your app.
     */

    public String getIconReference() {
        return this.iconReference;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     * 
     * @param iconReference
     *        The icon image name of the asset saved in your app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withIconReference(String iconReference) {
        setIconReference(iconReference);
        return this;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the push notification.
     * </p>
     * 
     * @param imageIconUrl
     *        The URL of the large icon image to display in the content view of the push notification.
     */

    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the push notification.
     * </p>
     * 
     * @return The URL of the large icon image to display in the content view of the push notification.
     */

    public String getImageIconUrl() {
        return this.imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the push notification.
     * </p>
     * 
     * @param imageIconUrl
     *        The URL of the large icon image to display in the content view of the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withImageIconUrl(String imageIconUrl) {
        setImageIconUrl(imageIconUrl);
        return this;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image to display in the push notification.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     * 
     * @return The URL of an image to display in the push notification.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image to display in the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * <p>
     * The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to verify
     * the integrity of the data.
     * </p>
     * 
     * @param mD5
     *        The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to
     *        verify the integrity of the data.
     */

    public void setMD5(String mD5) {
        this.mD5 = mD5;
    }

    /**
     * <p>
     * The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to verify
     * the integrity of the data.
     * </p>
     * 
     * @return The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to
     *         verify the integrity of the data.
     */

    public String getMD5() {
        return this.mD5;
    }

    /**
     * <p>
     * The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to verify
     * the integrity of the data.
     * </p>
     * 
     * @param mD5
     *        The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to
     *        verify the integrity of the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withMD5(String mD5) {
        setMD5(mD5);
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value
     * overrides all other content for the message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the notification message. If specified, this
     *        value overrides all other content for the message.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value
     * overrides all other content for the message.
     * </p>
     * 
     * @return The raw, JSON-formatted string to use as the payload for the notification message. If specified, this
     *         value overrides all other content for the message.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value
     * overrides all other content for the message.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for the notification message. If specified, this
     *        value overrides all other content for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the notification is a silent push notification, which is a push notification that
     *        doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *        an app's configuration or supporting phone home functionality.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     * 
     * @return Specifies whether the notification is a silent push notification, which is a push notification that
     *         doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *         an app's configuration or supporting phone home functionality.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the notification is a silent push notification, which is a push notification that
     *        doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *        an app's configuration or supporting phone home functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which is a push notification that doesn't
     * display on a recipient's device. Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     * 
     * @return Specifies whether the notification is a silent push notification, which is a push notification that
     *         doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating
     *         an app's configuration or supporting phone home functionality.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the content view of the push notification.
     * </p>
     * 
     * @param smallImageIconUrl
     *        The URL of the small icon image to display in the status bar and the content view of the push
     *        notification.
     */

    public void setSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the content view of the push notification.
     * </p>
     * 
     * @return The URL of the small icon image to display in the status bar and the content view of the push
     *         notification.
     */

    public String getSmallImageIconUrl() {
        return this.smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the content view of the push notification.
     * </p>
     * 
     * @param smallImageIconUrl
     *        The URL of the small icon image to display in the status bar and the content view of the push
     *        notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSmallImageIconUrl(String smallImageIconUrl) {
        setSmallImageIconUrl(smallImageIconUrl);
        return this;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside
     * in /res/raw/.
     * </p>
     * 
     * @param sound
     *        The sound to play when the recipient receives the push notification. You can use the default stream or
     *        specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound
     *        file must reside in /res/raw/.
     */

    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside
     * in /res/raw/.
     * </p>
     * 
     * @return The sound to play when the recipient receives the push notification. You can use the default stream or
     *         specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound
     *         file must reside in /res/raw/.
     */

    public String getSound() {
        return this.sound;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside
     * in /res/raw/.
     * </p>
     * 
     * @param sound
     *        The sound to play when the recipient receives the push notification. You can use the default stream or
     *        specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound
     *        file must reside in /res/raw/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSound(String sound) {
        setSound(sound);
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override the default variables with
     * individual address variables.
     * </p>
     * 
     * @return The default message variables to use in the notification message. You can override the default variables
     *         with individual address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override the default variables with
     * individual address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the notification message. You can override the default variables
     *        with individual address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can override the default variables with
     * individual address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the notification message. You can override the default variables
     *        with individual address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see ADMMessage#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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

    public ADMMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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

    public ADMMessage withTitle(String title) {
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

    public ADMMessage withUrl(String url) {
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getConsolidationKey() != null)
            sb.append("ConsolidationKey: ").append(getConsolidationKey()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getExpiresAfter() != null)
            sb.append("ExpiresAfter: ").append(getExpiresAfter()).append(",");
        if (getIconReference() != null)
            sb.append("IconReference: ").append(getIconReference()).append(",");
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: ").append(getImageIconUrl()).append(",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getMD5() != null)
            sb.append("MD5: ").append(getMD5()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSilentPush() != null)
            sb.append("SilentPush: ").append(getSilentPush()).append(",");
        if (getSmallImageIconUrl() != null)
            sb.append("SmallImageIconUrl: ").append(getSmallImageIconUrl()).append(",");
        if (getSound() != null)
            sb.append("Sound: ").append(getSound()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
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

        if (obj instanceof ADMMessage == false)
            return false;
        ADMMessage other = (ADMMessage) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getConsolidationKey() == null ^ this.getConsolidationKey() == null)
            return false;
        if (other.getConsolidationKey() != null && other.getConsolidationKey().equals(this.getConsolidationKey()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getExpiresAfter() == null ^ this.getExpiresAfter() == null)
            return false;
        if (other.getExpiresAfter() != null && other.getExpiresAfter().equals(this.getExpiresAfter()) == false)
            return false;
        if (other.getIconReference() == null ^ this.getIconReference() == null)
            return false;
        if (other.getIconReference() != null && other.getIconReference().equals(this.getIconReference()) == false)
            return false;
        if (other.getImageIconUrl() == null ^ this.getImageIconUrl() == null)
            return false;
        if (other.getImageIconUrl() != null && other.getImageIconUrl().equals(this.getImageIconUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getMD5() == null ^ this.getMD5() == null)
            return false;
        if (other.getMD5() != null && other.getMD5().equals(this.getMD5()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null && other.getSilentPush().equals(this.getSilentPush()) == false)
            return false;
        if (other.getSmallImageIconUrl() == null ^ this.getSmallImageIconUrl() == null)
            return false;
        if (other.getSmallImageIconUrl() != null && other.getSmallImageIconUrl().equals(this.getSmallImageIconUrl()) == false)
            return false;
        if (other.getSound() == null ^ this.getSound() == null)
            return false;
        if (other.getSound() != null && other.getSound().equals(this.getSound()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
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
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getConsolidationKey() == null) ? 0 : getConsolidationKey().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getExpiresAfter() == null) ? 0 : getExpiresAfter().hashCode());
        hashCode = prime * hashCode + ((getIconReference() == null) ? 0 : getIconReference().hashCode());
        hashCode = prime * hashCode + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getMD5() == null) ? 0 : getMD5().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getSmallImageIconUrl() == null) ? 0 : getSmallImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ADMMessage clone() {
        try {
            return (ADMMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ADMMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
