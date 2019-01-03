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
 * Message to send
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     */
    private String action;
    /** The message body. Can include up to 140 characters. */
    private String body;
    /** The URL that points to the icon image for the push notification icon, for example, the app icon. */
    private String imageIconUrl;
    /** The URL that points to the small icon image for the push notification icon, for example, the app icon. */
    private String imageSmallIconUrl;
    /** The URL that points to an image used in the push notification. */
    private String imageUrl;
    /** The JSON payload used for a silent push. */
    private String jsonBody;
    /** A URL that refers to the location of an image or video that you want to display in the push notification. */
    private String mediaUrl;
    /** The Raw JSON formatted string to be used as the payload. This value overrides the message. */
    private String rawContent;
    /**
     * Indicates if the message should display on the users device.
     * 
     * Silent pushes can be used for Remote Configuration and Phone Home use cases.
     */
    private Boolean silentPush;
    /**
     * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the
     * notification the first time. If the value is 0, it treats the notification as if it expires immediately and does
     * not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent
     * to the service. It only applies to APNs and GCM
     */
    private Integer timeToLive;
    /** The message title that displays above the message on the user's device. */
    private String title;
    /** The URL to open in the user's mobile browser. Used if the value for Action is URL. */
    private String url;

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action.
     * 
     *        DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     *        interface within the app.
     * 
     *        URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     *        specify.
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     * 
     * @return The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your
     *         app launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *         action.
     * 
     *         DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     *         interface within the app.
     * 
     *         URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     *         specify.
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action.
     * 
     *        DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     *        interface within the app.
     * 
     *        URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public Message withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action.
     * 
     *        DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     *        interface within the app.
     * 
     *        URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     *        specify.
     * @see Action
     */

    public void setAction(Action action) {
        withAction(action);
    }

    /**
     * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     * launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
     * 
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     * interface within the app.
     * 
     * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
     * 
     * @param action
     *        The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app
     *        launches, or it becomes the foreground app if it has been sent to the background. This is the default
     *        action.
     * 
     *        DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user
     *        interface within the app.
     * 
     *        URL - The default mobile browser on the user's device launches and opens a web page at the URL you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public Message withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * The message body. Can include up to 140 characters.
     * 
     * @param body
     *        The message body. Can include up to 140 characters.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body. Can include up to 140 characters.
     * 
     * @return The message body. Can include up to 140 characters.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The message body. Can include up to 140 characters.
     * 
     * @param body
     *        The message body. Can include up to 140 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for example, the app icon.
     * 
     * @param imageIconUrl
     *        The URL that points to the icon image for the push notification icon, for example, the app icon.
     */

    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for example, the app icon.
     * 
     * @return The URL that points to the icon image for the push notification icon, for example, the app icon.
     */

    public String getImageIconUrl() {
        return this.imageIconUrl;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for example, the app icon.
     * 
     * @param imageIconUrl
     *        The URL that points to the icon image for the push notification icon, for example, the app icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withImageIconUrl(String imageIconUrl) {
        setImageIconUrl(imageIconUrl);
        return this;
    }

    /**
     * The URL that points to the small icon image for the push notification icon, for example, the app icon.
     * 
     * @param imageSmallIconUrl
     *        The URL that points to the small icon image for the push notification icon, for example, the app icon.
     */

    public void setImageSmallIconUrl(String imageSmallIconUrl) {
        this.imageSmallIconUrl = imageSmallIconUrl;
    }

    /**
     * The URL that points to the small icon image for the push notification icon, for example, the app icon.
     * 
     * @return The URL that points to the small icon image for the push notification icon, for example, the app icon.
     */

    public String getImageSmallIconUrl() {
        return this.imageSmallIconUrl;
    }

    /**
     * The URL that points to the small icon image for the push notification icon, for example, the app icon.
     * 
     * @param imageSmallIconUrl
     *        The URL that points to the small icon image for the push notification icon, for example, the app icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withImageSmallIconUrl(String imageSmallIconUrl) {
        setImageSmallIconUrl(imageSmallIconUrl);
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

    public Message withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * The JSON payload used for a silent push.
     * 
     * @param jsonBody
     *        The JSON payload used for a silent push.
     */

    public void setJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
    }

    /**
     * The JSON payload used for a silent push.
     * 
     * @return The JSON payload used for a silent push.
     */

    public String getJsonBody() {
        return this.jsonBody;
    }

    /**
     * The JSON payload used for a silent push.
     * 
     * @param jsonBody
     *        The JSON payload used for a silent push.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withJsonBody(String jsonBody) {
        setJsonBody(jsonBody);
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

    public Message withMediaUrl(String mediaUrl) {
        setMediaUrl(mediaUrl);
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

    public Message withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * Indicates if the message should display on the users device.
     * 
     * Silent pushes can be used for Remote Configuration and Phone Home use cases.
     * 
     * @param silentPush
     *        Indicates if the message should display on the users device.
     * 
     *        Silent pushes can be used for Remote Configuration and Phone Home use cases.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * Indicates if the message should display on the users device.
     * 
     * Silent pushes can be used for Remote Configuration and Phone Home use cases.
     * 
     * @return Indicates if the message should display on the users device.
     * 
     *         Silent pushes can be used for Remote Configuration and Phone Home use cases.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * Indicates if the message should display on the users device.
     * 
     * Silent pushes can be used for Remote Configuration and Phone Home use cases.
     * 
     * @param silentPush
     *        Indicates if the message should display on the users device.
     * 
     *        Silent pushes can be used for Remote Configuration and Phone Home use cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * Indicates if the message should display on the users device.
     * 
     * Silent pushes can be used for Remote Configuration and Phone Home use cases.
     * 
     * @return Indicates if the message should display on the users device.
     * 
     *         Silent pushes can be used for Remote Configuration and Phone Home use cases.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
    }

    /**
     * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the
     * notification the first time. If the value is 0, it treats the notification as if it expires immediately and does
     * not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent
     * to the service. It only applies to APNs and GCM
     * 
     * @param timeToLive
     *        This parameter specifies how long (in seconds) the message should be kept if the service is unable to
     *        deliver the notification the first time. If the value is 0, it treats the notification as if it expires
     *        immediately and does not store the notification or attempt to redeliver it. This value is converted to the
     *        expiration field when sent to the service. It only applies to APNs and GCM
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the
     * notification the first time. If the value is 0, it treats the notification as if it expires immediately and does
     * not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent
     * to the service. It only applies to APNs and GCM
     * 
     * @return This parameter specifies how long (in seconds) the message should be kept if the service is unable to
     *         deliver the notification the first time. If the value is 0, it treats the notification as if it expires
     *         immediately and does not store the notification or attempt to redeliver it. This value is converted to
     *         the expiration field when sent to the service. It only applies to APNs and GCM
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the
     * notification the first time. If the value is 0, it treats the notification as if it expires immediately and does
     * not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent
     * to the service. It only applies to APNs and GCM
     * 
     * @param timeToLive
     *        This parameter specifies how long (in seconds) the message should be kept if the service is unable to
     *        deliver the notification the first time. If the value is 0, it treats the notification as if it expires
     *        immediately and does not store the notification or attempt to redeliver it. This value is converted to the
     *        expiration field when sent to the service. It only applies to APNs and GCM
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withTimeToLive(Integer timeToLive) {
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

    public Message withTitle(String title) {
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

    public Message withUrl(String url) {
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
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: ").append(getImageIconUrl()).append(",");
        if (getImageSmallIconUrl() != null)
            sb.append("ImageSmallIconUrl: ").append(getImageSmallIconUrl()).append(",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getJsonBody() != null)
            sb.append("JsonBody: ").append(getJsonBody()).append(",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: ").append(getMediaUrl()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSilentPush() != null)
            sb.append("SilentPush: ").append(getSilentPush()).append(",");
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

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getImageIconUrl() == null ^ this.getImageIconUrl() == null)
            return false;
        if (other.getImageIconUrl() != null && other.getImageIconUrl().equals(this.getImageIconUrl()) == false)
            return false;
        if (other.getImageSmallIconUrl() == null ^ this.getImageSmallIconUrl() == null)
            return false;
        if (other.getImageSmallIconUrl() != null && other.getImageSmallIconUrl().equals(this.getImageSmallIconUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getJsonBody() == null ^ this.getJsonBody() == null)
            return false;
        if (other.getJsonBody() != null && other.getJsonBody().equals(this.getJsonBody()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null && other.getSilentPush().equals(this.getSilentPush()) == false)
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
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageSmallIconUrl() == null) ? 0 : getImageSmallIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getJsonBody() == null) ? 0 : getJsonBody().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
