/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A RUM app monitor collects telemetry data from your application and sends that data to RUM. The data includes
 * performance and reliability information such as page load time, client-side errors, and user behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/AppMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppMonitor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor.
     * </p>
     */
    private AppMonitorConfiguration appMonitorConfiguration;
    /**
     * <p>
     * The date and time that this app monitor was created.
     * </p>
     */
    private String created;
    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     */
    private CustomEvents customEvents;
    /**
     * <p>
     * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM
     * collects using CloudWatch Logs.
     * </p>
     */
    private DataStorage dataStorage;
    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     */
    private String lastModified;
    /**
     * <p>
     * The name of the app monitor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current state of the app monitor.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The list of tag keys and values associated with this app monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor.
     */

    public void setAppMonitorConfiguration(AppMonitorConfiguration appMonitorConfiguration) {
        this.appMonitorConfiguration = appMonitorConfiguration;
    }

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor.
     * </p>
     * 
     * @return A structure that contains much of the configuration data for the app monitor.
     */

    public AppMonitorConfiguration getAppMonitorConfiguration() {
        return this.appMonitorConfiguration;
    }

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withAppMonitorConfiguration(AppMonitorConfiguration appMonitorConfiguration) {
        setAppMonitorConfiguration(appMonitorConfiguration);
        return this;
    }

    /**
     * <p>
     * The date and time that this app monitor was created.
     * </p>
     * 
     * @param created
     *        The date and time that this app monitor was created.
     */

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time that this app monitor was created.
     * </p>
     * 
     * @return The date and time that this app monitor was created.
     */

    public String getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time that this app monitor was created.
     * </p>
     * 
     * @param created
     *        The date and time that this app monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withCreated(String created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events.</p>
     *        <p>
     *        For more information about custom events, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *        >Send custom events</a>.
     */

    public void setCustomEvents(CustomEvents customEvents) {
        this.customEvents = customEvents;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @return Specifies whether this app monitor allows the web client to define and send custom events.</p>
     *         <p>
     *         For more information about custom events, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *         >Send custom events</a>.
     */

    public CustomEvents getCustomEvents() {
        return this.customEvents;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events.</p>
     *        <p>
     *        For more information about custom events, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *        >Send custom events</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withCustomEvents(CustomEvents customEvents) {
        setCustomEvents(customEvents);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM
     * collects using CloudWatch Logs.
     * </p>
     * 
     * @param dataStorage
     *        A structure that contains information about whether this app monitor stores a copy of the telemetry data
     *        that RUM collects using CloudWatch Logs.
     */

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    /**
     * <p>
     * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM
     * collects using CloudWatch Logs.
     * </p>
     * 
     * @return A structure that contains information about whether this app monitor stores a copy of the telemetry data
     *         that RUM collects using CloudWatch Logs.
     */

    public DataStorage getDataStorage() {
        return this.dataStorage;
    }

    /**
     * <p>
     * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM
     * collects using CloudWatch Logs.
     * </p>
     * 
     * @param dataStorage
     *        A structure that contains information about whether this app monitor stores a copy of the telemetry data
     *        that RUM collects using CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withDataStorage(DataStorage dataStorage) {
        setDataStorage(dataStorage);
        return this;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @param domain
     *        The top-level internet domain name for which your application has administrative authority.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @return The top-level internet domain name for which your application has administrative authority.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @param domain
     *        The top-level internet domain name for which your application has administrative authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @param id
     *        The unique ID of this app monitor.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @return The unique ID of this app monitor.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @param id
     *        The unique ID of this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @param lastModified
     *        The date and time of the most recent changes to this app monitor's configuration.
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @return The date and time of the most recent changes to this app monitor's configuration.
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @param lastModified
     *        The date and time of the most recent changes to this app monitor's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withLastModified(String lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The name of the app monitor.
     * </p>
     * 
     * @param name
     *        The name of the app monitor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app monitor.
     * </p>
     * 
     * @return The name of the app monitor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app monitor.
     * </p>
     * 
     * @param name
     *        The name of the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state of the app monitor.
     * </p>
     * 
     * @param state
     *        The current state of the app monitor.
     * @see StateEnum
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the app monitor.
     * </p>
     * 
     * @return The current state of the app monitor.
     * @see StateEnum
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the app monitor.
     * </p>
     * 
     * @param state
     *        The current state of the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateEnum
     */

    public AppMonitor withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the app monitor.
     * </p>
     * 
     * @param state
     *        The current state of the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateEnum
     */

    public AppMonitor withState(StateEnum state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this app monitor.
     * </p>
     * 
     * @return The list of tag keys and values associated with this app monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this app monitor.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this app monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values associated with this app monitor.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values associated with this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AppMonitor#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitor addTagsEntry(String key, String value) {
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

    public AppMonitor clearTagsEntries() {
        this.tags = null;
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
        if (getAppMonitorConfiguration() != null)
            sb.append("AppMonitorConfiguration: ").append(getAppMonitorConfiguration()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getCustomEvents() != null)
            sb.append("CustomEvents: ").append(getCustomEvents()).append(",");
        if (getDataStorage() != null)
            sb.append("DataStorage: ").append(getDataStorage()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppMonitor == false)
            return false;
        AppMonitor other = (AppMonitor) obj;
        if (other.getAppMonitorConfiguration() == null ^ this.getAppMonitorConfiguration() == null)
            return false;
        if (other.getAppMonitorConfiguration() != null && other.getAppMonitorConfiguration().equals(this.getAppMonitorConfiguration()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getCustomEvents() == null ^ this.getCustomEvents() == null)
            return false;
        if (other.getCustomEvents() != null && other.getCustomEvents().equals(this.getCustomEvents()) == false)
            return false;
        if (other.getDataStorage() == null ^ this.getDataStorage() == null)
            return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorConfiguration() == null) ? 0 : getAppMonitorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getCustomEvents() == null) ? 0 : getCustomEvents().hashCode());
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AppMonitor clone() {
        try {
            return (AppMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.AppMonitorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
