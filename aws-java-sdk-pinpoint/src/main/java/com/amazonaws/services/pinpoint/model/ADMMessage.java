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
 * ADM Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ADMMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ADMMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface
     * within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     * specify. Possible values include: OPEN_APP | DEEP_LINK | URL
     */
    private String action;
    /** The message body of the notification. */
    private String body;
    /**
     * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to
     * drop previously enqueued messages in favor of this one.
     */
    private String consolidationKey;
    /**
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     */
    private java.util.Map<String, String> data;
    /** Optional. Number of seconds ADM should retain the message if the device is offline */
    private String expiresAfter;
    /** The icon image name of the asset saved in your application. */
    private String iconReference;
    /** The URL that points to an image used as the large icon to the notification content view. */
    private String imageIconUrl;
    /** The URL that points to an image used in the push notification. */
    private String imageUrl;
    /** Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity */
    private String mD5;
    /** The Raw JSON formatted string to be used as the payload. This value overrides the message. */
    private String rawContent;
    /**
     * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration
     * and Phone Home use cases.
     */
    private Boolean silentPush;
    /**
     * The URL that points to an image used as the small icon for the notification which will be used to represent the
     * notification in the status bar and content view
     */
    private String smallImageIconUrl;
    /**
     * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound
     * resource bundled in the app. Android sound files must reside in /res/raw/
     */
    private String sound;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;
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

    public ADMMessage withAction(String action) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public ADMMessage withAction(Action action) {
        this.action = action.toString();
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

    public ADMMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to
     * drop previously enqueued messages in favor of this one.
     * 
     * @param consolidationKey
     *        Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is
     *        allowed to drop previously enqueued messages in favor of this one.
     */

    public void setConsolidationKey(String consolidationKey) {
        this.consolidationKey = consolidationKey;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to
     * drop previously enqueued messages in favor of this one.
     * 
     * @return Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is
     *         allowed to drop previously enqueued messages in favor of this one.
     */

    public String getConsolidationKey() {
        return this.consolidationKey;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to
     * drop previously enqueued messages in favor of this one.
     * 
     * @param consolidationKey
     *        Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is
     *        allowed to drop previously enqueued messages in favor of this one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withConsolidationKey(String consolidationKey) {
        setConsolidationKey(consolidationKey);
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

    public ADMMessage withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

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
     * Optional. Number of seconds ADM should retain the message if the device is offline
     * 
     * @param expiresAfter
     *        Optional. Number of seconds ADM should retain the message if the device is offline
     */

    public void setExpiresAfter(String expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * Optional. Number of seconds ADM should retain the message if the device is offline
     * 
     * @return Optional. Number of seconds ADM should retain the message if the device is offline
     */

    public String getExpiresAfter() {
        return this.expiresAfter;
    }

    /**
     * Optional. Number of seconds ADM should retain the message if the device is offline
     * 
     * @param expiresAfter
     *        Optional. Number of seconds ADM should retain the message if the device is offline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withExpiresAfter(String expiresAfter) {
        setExpiresAfter(expiresAfter);
        return this;
    }

    /**
     * The icon image name of the asset saved in your application.
     * 
     * @param iconReference
     *        The icon image name of the asset saved in your application.
     */

    public void setIconReference(String iconReference) {
        this.iconReference = iconReference;
    }

    /**
     * The icon image name of the asset saved in your application.
     * 
     * @return The icon image name of the asset saved in your application.
     */

    public String getIconReference() {
        return this.iconReference;
    }

    /**
     * The icon image name of the asset saved in your application.
     * 
     * @param iconReference
     *        The icon image name of the asset saved in your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withIconReference(String iconReference) {
        setIconReference(iconReference);
        return this;
    }

    /**
     * The URL that points to an image used as the large icon to the notification content view.
     * 
     * @param imageIconUrl
     *        The URL that points to an image used as the large icon to the notification content view.
     */

    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * The URL that points to an image used as the large icon to the notification content view.
     * 
     * @return The URL that points to an image used as the large icon to the notification content view.
     */

    public String getImageIconUrl() {
        return this.imageIconUrl;
    }

    /**
     * The URL that points to an image used as the large icon to the notification content view.
     * 
     * @param imageIconUrl
     *        The URL that points to an image used as the large icon to the notification content view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withImageIconUrl(String imageIconUrl) {
        setImageIconUrl(imageIconUrl);
        return this;
    }

    /**
     * The URL that points to an image used in the push notification.
     * 
     * @param imageUrl
     *        The URL that points to an image used in the push notification.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * The URL that points to an image used in the push notification.
     * 
     * @return The URL that points to an image used in the push notification.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * The URL that points to an image used in the push notification.
     * 
     * @param imageUrl
     *        The URL that points to an image used in the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     * 
     * @param mD5
     *        Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     */

    public void setMD5(String mD5) {
        this.mD5 = mD5;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     * 
     * @return Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     */

    public String getMD5() {
        return this.mD5;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     * 
     * @param mD5
     *        Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withMD5(String mD5) {
        setMD5(mD5);
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

    public ADMMessage withRawContent(String rawContent) {
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

    public ADMMessage withSilentPush(Boolean silentPush) {
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
     * The URL that points to an image used as the small icon for the notification which will be used to represent the
     * notification in the status bar and content view
     * 
     * @param smallImageIconUrl
     *        The URL that points to an image used as the small icon for the notification which will be used to
     *        represent the notification in the status bar and content view
     */

    public void setSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    /**
     * The URL that points to an image used as the small icon for the notification which will be used to represent the
     * notification in the status bar and content view
     * 
     * @return The URL that points to an image used as the small icon for the notification which will be used to
     *         represent the notification in the status bar and content view
     */

    public String getSmallImageIconUrl() {
        return this.smallImageIconUrl;
    }

    /**
     * The URL that points to an image used as the small icon for the notification which will be used to represent the
     * notification in the status bar and content view
     * 
     * @param smallImageIconUrl
     *        The URL that points to an image used as the small icon for the notification which will be used to
     *        represent the notification in the status bar and content view
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSmallImageIconUrl(String smallImageIconUrl) {
        setSmallImageIconUrl(smallImageIconUrl);
        return this;
    }

    /**
     * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound
     * resource bundled in the app. Android sound files must reside in /res/raw/
     * 
     * @param sound
     *        Indicates a sound to play when the device receives the notification. Supports default, or the filename of
     *        a sound resource bundled in the app. Android sound files must reside in /res/raw/
     */

    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound
     * resource bundled in the app. Android sound files must reside in /res/raw/
     * 
     * @return Indicates a sound to play when the device receives the notification. Supports default, or the filename of
     *         a sound resource bundled in the app. Android sound files must reside in /res/raw/
     */

    public String getSound() {
        return this.sound;
    }

    /**
     * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound
     * resource bundled in the app. Android sound files must reside in /res/raw/
     * 
     * @param sound
     *        Indicates a sound to play when the device receives the notification. Supports default, or the filename of
     *        a sound resource bundled in the app. Android sound files must reside in /res/raw/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMMessage withSound(String sound) {
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

    public ADMMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

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

    public ADMMessage withTitle(String title) {
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
