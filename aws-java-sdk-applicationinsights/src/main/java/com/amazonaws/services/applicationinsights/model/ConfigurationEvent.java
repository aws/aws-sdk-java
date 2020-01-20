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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ConfigurationEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource monitored by Application Insights.
     * </p>
     */
    private String monitoredResourceARN;
    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     */
    private String eventStatus;
    /**
     * <p>
     * The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * </p>
     */
    private String eventResourceType;
    /**
     * <p>
     * The timestamp of the event.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The details of the event in plain text.
     * </p>
     */
    private String eventDetail;
    /**
     * <p>
     * The name of the resource Application Insights attempted to configure.
     * </p>
     */
    private String eventResourceName;

    /**
     * <p>
     * The resource monitored by Application Insights.
     * </p>
     * 
     * @param monitoredResourceARN
     *        The resource monitored by Application Insights.
     */

    public void setMonitoredResourceARN(String monitoredResourceARN) {
        this.monitoredResourceARN = monitoredResourceARN;
    }

    /**
     * <p>
     * The resource monitored by Application Insights.
     * </p>
     * 
     * @return The resource monitored by Application Insights.
     */

    public String getMonitoredResourceARN() {
        return this.monitoredResourceARN;
    }

    /**
     * <p>
     * The resource monitored by Application Insights.
     * </p>
     * 
     * @param monitoredResourceARN
     *        The resource monitored by Application Insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationEvent withMonitoredResourceARN(String monitoredResourceARN) {
        setMonitoredResourceARN(monitoredResourceARN);
        return this;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @see ConfigurationEventStatus
     */

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @return The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @see ConfigurationEventStatus
     */

    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventStatus
     */

    public ConfigurationEvent withEventStatus(String eventStatus) {
        setEventStatus(eventStatus);
        return this;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventStatus
     */

    public ConfigurationEvent withEventStatus(ConfigurationEventStatus eventStatus) {
        this.eventStatus = eventStatus.toString();
        return this;
    }

    /**
     * <p>
     * The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * </p>
     * 
     * @param eventResourceType
     *        The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * @see ConfigurationEventResourceType
     */

    public void setEventResourceType(String eventResourceType) {
        this.eventResourceType = eventResourceType;
    }

    /**
     * <p>
     * The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * </p>
     * 
     * @return The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * @see ConfigurationEventResourceType
     */

    public String getEventResourceType() {
        return this.eventResourceType;
    }

    /**
     * <p>
     * The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * </p>
     * 
     * @param eventResourceType
     *        The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventResourceType
     */

    public ConfigurationEvent withEventResourceType(String eventResourceType) {
        setEventResourceType(eventResourceType);
        return this;
    }

    /**
     * <p>
     * The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * </p>
     * 
     * @param eventResourceType
     *        The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventResourceType
     */

    public ConfigurationEvent withEventResourceType(ConfigurationEventResourceType eventResourceType) {
        this.eventResourceType = eventResourceType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param eventTime
     *        The timestamp of the event.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @return The timestamp of the event.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param eventTime
     *        The timestamp of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationEvent withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The details of the event in plain text.
     * </p>
     * 
     * @param eventDetail
     *        The details of the event in plain text.
     */

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    /**
     * <p>
     * The details of the event in plain text.
     * </p>
     * 
     * @return The details of the event in plain text.
     */

    public String getEventDetail() {
        return this.eventDetail;
    }

    /**
     * <p>
     * The details of the event in plain text.
     * </p>
     * 
     * @param eventDetail
     *        The details of the event in plain text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationEvent withEventDetail(String eventDetail) {
        setEventDetail(eventDetail);
        return this;
    }

    /**
     * <p>
     * The name of the resource Application Insights attempted to configure.
     * </p>
     * 
     * @param eventResourceName
     *        The name of the resource Application Insights attempted to configure.
     */

    public void setEventResourceName(String eventResourceName) {
        this.eventResourceName = eventResourceName;
    }

    /**
     * <p>
     * The name of the resource Application Insights attempted to configure.
     * </p>
     * 
     * @return The name of the resource Application Insights attempted to configure.
     */

    public String getEventResourceName() {
        return this.eventResourceName;
    }

    /**
     * <p>
     * The name of the resource Application Insights attempted to configure.
     * </p>
     * 
     * @param eventResourceName
     *        The name of the resource Application Insights attempted to configure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationEvent withEventResourceName(String eventResourceName) {
        setEventResourceName(eventResourceName);
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
        if (getMonitoredResourceARN() != null)
            sb.append("MonitoredResourceARN: ").append(getMonitoredResourceARN()).append(",");
        if (getEventStatus() != null)
            sb.append("EventStatus: ").append(getEventStatus()).append(",");
        if (getEventResourceType() != null)
            sb.append("EventResourceType: ").append(getEventResourceType()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getEventDetail() != null)
            sb.append("EventDetail: ").append(getEventDetail()).append(",");
        if (getEventResourceName() != null)
            sb.append("EventResourceName: ").append(getEventResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationEvent == false)
            return false;
        ConfigurationEvent other = (ConfigurationEvent) obj;
        if (other.getMonitoredResourceARN() == null ^ this.getMonitoredResourceARN() == null)
            return false;
        if (other.getMonitoredResourceARN() != null && other.getMonitoredResourceARN().equals(this.getMonitoredResourceARN()) == false)
            return false;
        if (other.getEventStatus() == null ^ this.getEventStatus() == null)
            return false;
        if (other.getEventStatus() != null && other.getEventStatus().equals(this.getEventStatus()) == false)
            return false;
        if (other.getEventResourceType() == null ^ this.getEventResourceType() == null)
            return false;
        if (other.getEventResourceType() != null && other.getEventResourceType().equals(this.getEventResourceType()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getEventDetail() == null ^ this.getEventDetail() == null)
            return false;
        if (other.getEventDetail() != null && other.getEventDetail().equals(this.getEventDetail()) == false)
            return false;
        if (other.getEventResourceName() == null ^ this.getEventResourceName() == null)
            return false;
        if (other.getEventResourceName() != null && other.getEventResourceName().equals(this.getEventResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoredResourceARN() == null) ? 0 : getMonitoredResourceARN().hashCode());
        hashCode = prime * hashCode + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        hashCode = prime * hashCode + ((getEventResourceType() == null) ? 0 : getEventResourceType().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getEventDetail() == null) ? 0 : getEventDetail().hashCode());
        hashCode = prime * hashCode + ((getEventResourceName() == null) ? 0 : getEventResourceName().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationEvent clone() {
        try {
            return (ConfigurationEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ConfigurationEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
