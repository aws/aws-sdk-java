/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Displays summary information about a monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/MonitorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the monitor.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The state of the monitor.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>.
     * </p>
     */
    private Long aggregationPeriod;
    /**
     * <p>
     * The list of key-value pairs assigned to the monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The ARN of the monitor.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The ARN of the monitor.
     * </p>
     * 
     * @return The ARN of the monitor.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The ARN of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The ARN of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The state of the monitor.
     * </p>
     * 
     * @param state
     *        The state of the monitor.
     * @see MonitorState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the monitor.
     * </p>
     * 
     * @return The state of the monitor.
     * @see MonitorState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the monitor.
     * </p>
     * 
     * @param state
     *        The state of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorState
     */

    public MonitorSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the monitor.
     * </p>
     * 
     * @param state
     *        The state of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorState
     */

    public MonitorSummary withState(MonitorState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @param aggregationPeriod
     *        The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     *        <code>30</code> or <code>60</code>.
     */

    public void setAggregationPeriod(Long aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @return The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     *         <code>30</code> or <code>60</code>.
     */

    public Long getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @param aggregationPeriod
     *        The time, in seconds, that metrics are collected and sent to Amazon CloudWatch. Valid values are either
     *        <code>30</code> or <code>60</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withAggregationPeriod(Long aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs assigned to the monitor.
     * </p>
     * 
     * @return The list of key-value pairs assigned to the monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs assigned to the monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs assigned to the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see MonitorSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary addTagsEntry(String key, String value) {
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

    public MonitorSummary clearTagsEntries() {
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
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

        if (obj instanceof MonitorSummary == false)
            return false;
        MonitorSummary other = (MonitorSummary) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
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

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MonitorSummary clone() {
        try {
            return (MonitorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmonitor.model.transform.MonitorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
