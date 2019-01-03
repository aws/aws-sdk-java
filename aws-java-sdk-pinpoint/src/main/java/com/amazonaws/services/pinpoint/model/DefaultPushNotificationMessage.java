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
 * Default Push Notification Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DefaultPushNotificationMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultPushNotificationMessage implements Serializable, Cloneable, StructuredPojo {

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
     * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody'
     * object
     */
    private java.util.Map<String, String> data;
    /**
     * Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     * configuration or to deliver messages to in-app notification centers.
     */
    private Boolean silentPush;
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

    public DefaultPushNotificationMessage withAction(String action) {
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

    public DefaultPushNotificationMessage withAction(Action action) {
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

    public DefaultPushNotificationMessage withBody(String body) {
        setBody(body);
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
     * Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     * configuration or to deliver messages to in-app notification centers.
     * 
     * @param silentPush
     *        Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     *        configuration or to deliver messages to in-app notification centers.
     */

    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     * configuration or to deliver messages to in-app notification centers.
     * 
     * @return Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     *         configuration or to deliver messages to in-app notification centers.
     */

    public Boolean getSilentPush() {
        return this.silentPush;
    }

    /**
     * Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     * configuration or to deliver messages to in-app notification centers.
     * 
     * @param silentPush
     *        Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     *        configuration or to deliver messages to in-app notification centers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultPushNotificationMessage withSilentPush(Boolean silentPush) {
        setSilentPush(silentPush);
        return this;
    }

    /**
     * Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     * configuration or to deliver messages to in-app notification centers.
     * 
     * @return Indicates if the message should display on the recipient's device. You can use silent pushes for remote
     *         configuration or to deliver messages to in-app notification centers.
     */

    public Boolean isSilentPush() {
        return this.silentPush;
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

    public DefaultPushNotificationMessage withTitle(String title) {
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
