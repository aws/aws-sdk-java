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
 * Specifies channel-specific content and settings for a message template that can be used in push notifications that
 * are sent through the APNs (Apple Push Notification service) channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSPushNotificationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSPushNotificationTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based on the message template. Valid values
     * are:
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
     * The message body to use in push notifications that are based on the message template.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The URL of an image or video to display in push notifications that are based on the message template.
     * </p>
     */
    private String mediaUrl;
    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     * template. If specified, this value overrides all other content for the message template.
     * </p>
     */
    private String rawContent;
    /**
     * <p>
     * The key for the sound to play when the recipient receives a push notification that's based on the message
     * template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds
     * folder in your app's data container. If the sound file can't be found or you specify default for the value, the
     * system plays the default alert sound.
     * </p>
     */
    private String sound;
    /**
     * <p>
     * The title to use in push notifications that are based on the message template. This title appears above the
     * notification message on a recipient's device.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based
     * on the message template and the value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based on the message template. Valid values
     * are:
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
     *        The action to occur if a recipient taps a push notification that's based on the message template. Valid
     *        values are:</p>
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
     * The action to occur if a recipient taps a push notification that's based on the message template. Valid values
     * are:
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
     * @return The action to occur if a recipient taps a push notification that's based on the message template. Valid
     *         values are:</p>
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
     * The action to occur if a recipient taps a push notification that's based on the message template. Valid values
     * are:
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
     *        The action to occur if a recipient taps a push notification that's based on the message template. Valid
     *        values are:</p>
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

    public APNSPushNotificationTemplate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based on the message template. Valid values
     * are:
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
     *        The action to occur if a recipient taps a push notification that's based on the message template. Valid
     *        values are:</p>
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

    public APNSPushNotificationTemplate withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the message template.
     * </p>
     * 
     * @param body
     *        The message body to use in push notifications that are based on the message template.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the message template.
     * </p>
     * 
     * @return The message body to use in push notifications that are based on the message template.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the message template.
     * </p>
     * 
     * @param body
     *        The message body to use in push notifications that are based on the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are based on the message template.
     * </p>
     * 
     * @param mediaUrl
     *        The URL of an image or video to display in push notifications that are based on the message template.
     */

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are based on the message template.
     * </p>
     * 
     * @return The URL of an image or video to display in push notifications that are based on the message template.
     */

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are based on the message template.
     * </p>
     * 
     * @param mediaUrl
     *        The URL of an image or video to display in push notifications that are based on the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withMediaUrl(String mediaUrl) {
        setMediaUrl(mediaUrl);
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     * template. If specified, this value overrides all other content for the message template.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     *        template. If specified, this value overrides all other content for the message template.
     */

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     * template. If specified, this value overrides all other content for the message template.
     * </p>
     * 
     * @return The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     *         template. If specified, this value overrides all other content for the message template.
     */

    public String getRawContent() {
        return this.rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     * template. If specified, this value overrides all other content for the message template.
     * </p>
     * 
     * @param rawContent
     *        The raw, JSON-formatted string to use as the payload for push notifications that are based on the message
     *        template. If specified, this value overrides all other content for the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withRawContent(String rawContent) {
        setRawContent(rawContent);
        return this;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push notification that's based on the message
     * template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds
     * folder in your app's data container. If the sound file can't be found or you specify default for the value, the
     * system plays the default alert sound.
     * </p>
     * 
     * @param sound
     *        The key for the sound to play when the recipient receives a push notification that's based on the message
     *        template. The value for this key is the name of a sound file in your app's main bundle or the
     *        Library/Sounds folder in your app's data container. If the sound file can't be found or you specify
     *        default for the value, the system plays the default alert sound.
     */

    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push notification that's based on the message
     * template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds
     * folder in your app's data container. If the sound file can't be found or you specify default for the value, the
     * system plays the default alert sound.
     * </p>
     * 
     * @return The key for the sound to play when the recipient receives a push notification that's based on the message
     *         template. The value for this key is the name of a sound file in your app's main bundle or the
     *         Library/Sounds folder in your app's data container. If the sound file can't be found or you specify
     *         default for the value, the system plays the default alert sound.
     */

    public String getSound() {
        return this.sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push notification that's based on the message
     * template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds
     * folder in your app's data container. If the sound file can't be found or you specify default for the value, the
     * system plays the default alert sound.
     * </p>
     * 
     * @param sound
     *        The key for the sound to play when the recipient receives a push notification that's based on the message
     *        template. The value for this key is the name of a sound file in your app's main bundle or the
     *        Library/Sounds folder in your app's data container. If the sound file can't be found or you specify
     *        default for the value, the system plays the default alert sound.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withSound(String sound) {
        setSound(sound);
        return this;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message template. This title appears above the
     * notification message on a recipient's device.
     * </p>
     * 
     * @param title
     *        The title to use in push notifications that are based on the message template. This title appears above
     *        the notification message on a recipient's device.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message template. This title appears above the
     * notification message on a recipient's device.
     * </p>
     * 
     * @return The title to use in push notifications that are based on the message template. This title appears above
     *         the notification message on a recipient's device.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message template. This title appears above the
     * notification message on a recipient's device.
     * </p>
     * 
     * @param title
     *        The title to use in push notifications that are based on the message template. This title appears above
     *        the notification message on a recipient's device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based
     * on the message template and the value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's
     *        based on the message template and the value of the Action property is URL.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based
     * on the message template and the value of the Action property is URL.
     * </p>
     * 
     * @return The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's
     *         based on the message template and the value of the Action property is URL.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based
     * on the message template and the value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's
     *        based on the message template and the value of the Action property is URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSPushNotificationTemplate withUrl(String url) {
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
        if (getMediaUrl() != null)
            sb.append("MediaUrl: ").append(getMediaUrl()).append(",");
        if (getRawContent() != null)
            sb.append("RawContent: ").append(getRawContent()).append(",");
        if (getSound() != null)
            sb.append("Sound: ").append(getSound()).append(",");
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

        if (obj instanceof APNSPushNotificationTemplate == false)
            return false;
        APNSPushNotificationTemplate other = (APNSPushNotificationTemplate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSound() == null ^ this.getSound() == null)
            return false;
        if (other.getSound() != null && other.getSound().equals(this.getSound()) == false)
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
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public APNSPushNotificationTemplate clone() {
        try {
            return (APNSPushNotificationTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSPushNotificationTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
