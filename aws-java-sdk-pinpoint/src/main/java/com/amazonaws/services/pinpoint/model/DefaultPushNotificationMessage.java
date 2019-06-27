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
 * Specifies the default settings and content for a push notification that's sent directly to an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DefaultPushNotificationMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultPushNotificationMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     * The default body of the notification message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The JSON data payload to use for the default push notification, if the notification is a silent push
     * notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     */
    private java.util.Map<String, String> data;
    /**
     * <p>
     * Specifies whether the default notification is a silent push notification, which is a push notification that
     * doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an
     * app's configuration or delivering messages to an in-app notification center.
     * </p>
     */
    private Boolean silentPush;
    /**
     * <p>
     * The default message variables to use in the notification message. You can override the default variables with
     * individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * <p>
     * The default title to display above the notification message on a recipient's device.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and
     * the value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     *        The default action to occur if a recipient taps the push notification. Valid values are:</p>
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
     *        deep-linking features of the iOS and Android platforms.
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
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     * @return The default action to occur if a recipient taps the push notification. Valid values are:</p>
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
     *         deep-linking features of the iOS and Android platforms.
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
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     *        The default action to occur if a recipient taps the push notification. Valid values are:</p>
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
     *        deep-linking features of the iOS and Android platforms.
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

    public DefaultPushNotificationMessage withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     *        The default action to occur if a recipient taps the push notification. Valid values are:</p>
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
     *        deep-linking features of the iOS and Android platforms.
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
     * The default action to occur if a recipient taps the push notification. Valid values are:
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
     * deep-linking features of the iOS and Android platforms.
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
     *        The default action to occur if a recipient taps the push notification. Valid values are:</p>
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
     *        deep-linking features of the iOS and Android platforms.
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

    public DefaultPushNotificationMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The default body of the notification message.
     * </p>
     * 
     * @param body
     *        The default body of the notification message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The default body of the notification message.
     * </p>
     * 
     * @return The default body of the notification message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The default body of the notification message.
     * </p>
     * 
     * @param body
     *        The default body of the notification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The JSON data payload to use for the default push notification, if the notification is a silent push
     * notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @return The JSON data payload to use for the default push notification, if the notification is a silent push
     *         notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     */

    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * The JSON data payload to use for the default push notification, if the notification is a silent push
     * notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON data payload to use for the default push notification, if the notification is a silent push
     *        notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     */

    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * The JSON data payload to use for the default push notification, if the notification is a silent push
     * notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * 
     * @param data
     *        The JSON data payload to use for the default push notification, if the notification is a silent push
     *        notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

    public DefaultPushNotificationMessage addDataEntry(String key, String value) {
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

    public DefaultPushNotificationMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the default notification is a silent push notification, which is a push notification that
     * doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an
     * app's configuration or delivering messages to an in-app notification center.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the default notification is a silent push notification, which is a push notification
     *        that doesn't display on a recipient's device. Silent push notifications can be used for cases such as
     *        updating an app's configuration or delivering messages to an in-app notification center.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the default notification is a silent push notification, which is a push notification that
     * doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an
     * app's configuration or delivering messages to an in-app notification center.
     * </p>
     * 
     * @return Specifies whether the default notification is a silent push notification, which is a push notification
     *         that doesn't display on a recipient's device. Silent push notifications can be used for cases such as
     *         updating an app's configuration or delivering messages to an in-app notification center.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * <p>
     * Specifies whether the default notification is a silent push notification, which is a push notification that
     * doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an
     * app's configuration or delivering messages to an in-app notification center.
     * </p>
     * 
     * @param silentPush
     *        Specifies whether the default notification is a silent push notification, which is a push notification
     *        that doesn't display on a recipient's device. Silent push notifications can be used for cases such as
     *        updating an app's configuration or delivering messages to an in-app notification center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * <p>
     * Specifies whether the default notification is a silent push notification, which is a push notification that
     * doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an
     * app's configuration or delivering messages to an in-app notification center.
     * </p>
     * 
     * @return Specifies whether the default notification is a silent push notification, which is a push notification
     *         that doesn't display on a recipient's device. Silent push notifications can be used for cases such as
     *         updating an app's configuration or delivering messages to an in-app notification center.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
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

    public DefaultPushNotificationMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    public DefaultPushNotificationMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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

    public DefaultPushNotificationMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The default title to display above the notification message on a recipient's device.
     * </p>
     * 
     * @param title
     *        The default title to display above the notification message on a recipient's device.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The default title to display above the notification message on a recipient's device.
     * </p>
     * 
     * @return The default title to display above the notification message on a recipient's device.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The default title to display above the notification message on a recipient's device.
     * </p>
     * 
     * @param title
     *        The default title to display above the notification message on a recipient's device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and
     * the value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification
     *        and the value of the Action property is URL.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and
     * the value of the Action property is URL.
     * </p>
     * 
     * @return The default URL to open in a recipient's default mobile browser, if a recipient taps the push
     *         notification and the value of the Action property is URL.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and
     * the value of the Action property is URL.
     * </p>
     * 
     * @param url
     *        The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification
     *        and the value of the Action property is URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withUrl(String url) {
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getSilentPush() != null)
            sb.append("SilentPush: ").append(getSilentPush()).append(",");
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

        if (obj instanceof DefaultPushNotificationMessage == false)
            return false;
        DefaultPushNotificationMessage other = (DefaultPushNotificationMessage) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null && other.getSilentPush().equals(this.getSilentPush()) == false)
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
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public DefaultPushNotificationMessage clone() {
        try {
            return (DefaultPushNotificationMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DefaultPushNotificationMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
