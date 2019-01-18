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
 * Model for creating or updating events.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /** The package name associated with the app that's recording the event. */
    private String appPackageName;
    /** The title of the app that's recording the event. */
    private String appTitle;
    /** The version number of the app that's recording the event. */
    private String appVersionCode;
    /** Custom attributes that are associated with the event you're adding or updating. */
    private java.util.Map<String, String> attributes;
    /** The version of the SDK that's running on the client device. */
    private String clientSdkVersion;
    /** The name of the custom event that you're recording. */
    private String eventType;
    /** Custom metrics related to the event. */
    private java.util.Map<String, Double> metrics;
    /** The name of the SDK that's being used to record the event. */
    private String sdkName;
    /** Information about the session in which the event occurred. */
    private Session session;
    /** The date and time when the event occurred, in ISO 8601 format. */
    private String timestamp;

    /**
     * The package name associated with the app that's recording the event.
     * 
     * @param appPackageName
     *        The package name associated with the app that's recording the event.
     */

    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    /**
     * The package name associated with the app that's recording the event.
     * 
     * @return The package name associated with the app that's recording the event.
     */

    public String getAppPackageName() {
        return this.appPackageName;
    }

    /**
     * The package name associated with the app that's recording the event.
     * 
     * @param appPackageName
     *        The package name associated with the app that's recording the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withAppPackageName(String appPackageName) {
        setAppPackageName(appPackageName);
        return this;
    }

    /**
     * The title of the app that's recording the event.
     * 
     * @param appTitle
     *        The title of the app that's recording the event.
     */

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    /**
     * The title of the app that's recording the event.
     * 
     * @return The title of the app that's recording the event.
     */

    public String getAppTitle() {
        return this.appTitle;
    }

    /**
     * The title of the app that's recording the event.
     * 
     * @param appTitle
     *        The title of the app that's recording the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withAppTitle(String appTitle) {
        setAppTitle(appTitle);
        return this;
    }

    /**
     * The version number of the app that's recording the event.
     * 
     * @param appVersionCode
     *        The version number of the app that's recording the event.
     */

    public void setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    /**
     * The version number of the app that's recording the event.
     * 
     * @return The version number of the app that's recording the event.
     */

    public String getAppVersionCode() {
        return this.appVersionCode;
    }

    /**
     * The version number of the app that's recording the event.
     * 
     * @param appVersionCode
     *        The version number of the app that's recording the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withAppVersionCode(String appVersionCode) {
        setAppVersionCode(appVersionCode);
        return this;
    }

    /**
     * Custom attributes that are associated with the event you're adding or updating.
     * 
     * @return Custom attributes that are associated with the event you're adding or updating.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * Custom attributes that are associated with the event you're adding or updating.
     * 
     * @param attributes
     *        Custom attributes that are associated with the event you're adding or updating.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom attributes that are associated with the event you're adding or updating.
     * 
     * @param attributes
     *        Custom attributes that are associated with the event you're adding or updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public Event addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * The version of the SDK that's running on the client device.
     * 
     * @param clientSdkVersion
     *        The version of the SDK that's running on the client device.
     */

    public void setClientSdkVersion(String clientSdkVersion) {
        this.clientSdkVersion = clientSdkVersion;
    }

    /**
     * The version of the SDK that's running on the client device.
     * 
     * @return The version of the SDK that's running on the client device.
     */

    public String getClientSdkVersion() {
        return this.clientSdkVersion;
    }

    /**
     * The version of the SDK that's running on the client device.
     * 
     * @param clientSdkVersion
     *        The version of the SDK that's running on the client device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withClientSdkVersion(String clientSdkVersion) {
        setClientSdkVersion(clientSdkVersion);
        return this;
    }

    /**
     * The name of the custom event that you're recording.
     * 
     * @param eventType
     *        The name of the custom event that you're recording.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * The name of the custom event that you're recording.
     * 
     * @return The name of the custom event that you're recording.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * The name of the custom event that you're recording.
     * 
     * @param eventType
     *        The name of the custom event that you're recording.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * Custom metrics related to the event.
     * 
     * @return Custom metrics related to the event.
     */

    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * Custom metrics related to the event.
     * 
     * @param metrics
     *        Custom metrics related to the event.
     */

    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * Custom metrics related to the event.
     * 
     * @param metrics
     *        Custom metrics related to the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMetrics(java.util.Map<String, Double> metrics) {
        setMetrics(metrics);
        return this;
    }

    public Event addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * The name of the SDK that's being used to record the event.
     * 
     * @param sdkName
     *        The name of the SDK that's being used to record the event.
     */

    public void setSdkName(String sdkName) {
        this.sdkName = sdkName;
    }

    /**
     * The name of the SDK that's being used to record the event.
     * 
     * @return The name of the SDK that's being used to record the event.
     */

    public String getSdkName() {
        return this.sdkName;
    }

    /**
     * The name of the SDK that's being used to record the event.
     * 
     * @param sdkName
     *        The name of the SDK that's being used to record the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSdkName(String sdkName) {
        setSdkName(sdkName);
        return this;
    }

    /**
     * Information about the session in which the event occurred.
     * 
     * @param session
     *        Information about the session in which the event occurred.
     */

    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * Information about the session in which the event occurred.
     * 
     * @return Information about the session in which the event occurred.
     */

    public Session getSession() {
        return this.session;
    }

    /**
     * Information about the session in which the event occurred.
     * 
     * @param session
     *        Information about the session in which the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSession(Session session) {
        setSession(session);
        return this;
    }

    /**
     * The date and time when the event occurred, in ISO 8601 format.
     * 
     * @param timestamp
     *        The date and time when the event occurred, in ISO 8601 format.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The date and time when the event occurred, in ISO 8601 format.
     * 
     * @return The date and time when the event occurred, in ISO 8601 format.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * The date and time when the event occurred, in ISO 8601 format.
     * 
     * @param timestamp
     *        The date and time when the event occurred, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withTimestamp(String timestamp) {
        setTimestamp(timestamp);
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
        if (getAppPackageName() != null)
            sb.append("AppPackageName: ").append(getAppPackageName()).append(",");
        if (getAppTitle() != null)
            sb.append("AppTitle: ").append(getAppTitle()).append(",");
        if (getAppVersionCode() != null)
            sb.append("AppVersionCode: ").append(getAppVersionCode()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getClientSdkVersion() != null)
            sb.append("ClientSdkVersion: ").append(getClientSdkVersion()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getSdkName() != null)
            sb.append("SdkName: ").append(getSdkName()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getAppPackageName() == null ^ this.getAppPackageName() == null)
            return false;
        if (other.getAppPackageName() != null && other.getAppPackageName().equals(this.getAppPackageName()) == false)
            return false;
        if (other.getAppTitle() == null ^ this.getAppTitle() == null)
            return false;
        if (other.getAppTitle() != null && other.getAppTitle().equals(this.getAppTitle()) == false)
            return false;
        if (other.getAppVersionCode() == null ^ this.getAppVersionCode() == null)
            return false;
        if (other.getAppVersionCode() != null && other.getAppVersionCode().equals(this.getAppVersionCode()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClientSdkVersion() == null ^ this.getClientSdkVersion() == null)
            return false;
        if (other.getClientSdkVersion() != null && other.getClientSdkVersion().equals(this.getClientSdkVersion()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getSdkName() == null ^ this.getSdkName() == null)
            return false;
        if (other.getSdkName() != null && other.getSdkName().equals(this.getSdkName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppPackageName() == null) ? 0 : getAppPackageName().hashCode());
        hashCode = prime * hashCode + ((getAppTitle() == null) ? 0 : getAppTitle().hashCode());
        hashCode = prime * hashCode + ((getAppVersionCode() == null) ? 0 : getAppVersionCode().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getClientSdkVersion() == null) ? 0 : getClientSdkVersion().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getSdkName() == null) ? 0 : getSdkName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
