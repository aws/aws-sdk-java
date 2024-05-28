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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the selected monitor.
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
     * Lists the status of the <code>state</code> of each monitor.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The aggregation period for the specified monitor.
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
     * The details about each probe associated with that monitor.
     * </p>
     */
    private java.util.List<Probe> probes;
    /**
     * <p>
     * The time and date when the monitor was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time and date when the monitor was last modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * The ARN of the selected monitor.
     * </p>
     * 
     * @param monitorArn
     *        The ARN of the selected monitor.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The ARN of the selected monitor.
     * </p>
     * 
     * @return The ARN of the selected monitor.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The ARN of the selected monitor.
     * </p>
     * 
     * @param monitorArn
     *        The ARN of the selected monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withMonitorArn(String monitorArn) {
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

    public GetMonitorResult withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * Lists the status of the <code>state</code> of each monitor.
     * </p>
     * 
     * @param state
     *        Lists the status of the <code>state</code> of each monitor.
     * @see MonitorState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Lists the status of the <code>state</code> of each monitor.
     * </p>
     * 
     * @return Lists the status of the <code>state</code> of each monitor.
     * @see MonitorState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Lists the status of the <code>state</code> of each monitor.
     * </p>
     * 
     * @param state
     *        Lists the status of the <code>state</code> of each monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorState
     */

    public GetMonitorResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Lists the status of the <code>state</code> of each monitor.
     * </p>
     * 
     * @param state
     *        Lists the status of the <code>state</code> of each monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorState
     */

    public GetMonitorResult withState(MonitorState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation period for the specified monitor.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period for the specified monitor.
     */

    public void setAggregationPeriod(Long aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period for the specified monitor.
     * </p>
     * 
     * @return The aggregation period for the specified monitor.
     */

    public Long getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period for the specified monitor.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period for the specified monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withAggregationPeriod(Long aggregationPeriod) {
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

    public GetMonitorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetMonitorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult addTagsEntry(String key, String value) {
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

    public GetMonitorResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The details about each probe associated with that monitor.
     * </p>
     * 
     * @return The details about each probe associated with that monitor.
     */

    public java.util.List<Probe> getProbes() {
        return probes;
    }

    /**
     * <p>
     * The details about each probe associated with that monitor.
     * </p>
     * 
     * @param probes
     *        The details about each probe associated with that monitor.
     */

    public void setProbes(java.util.Collection<Probe> probes) {
        if (probes == null) {
            this.probes = null;
            return;
        }

        this.probes = new java.util.ArrayList<Probe>(probes);
    }

    /**
     * <p>
     * The details about each probe associated with that monitor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProbes(java.util.Collection)} or {@link #withProbes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param probes
     *        The details about each probe associated with that monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withProbes(Probe... probes) {
        if (this.probes == null) {
            setProbes(new java.util.ArrayList<Probe>(probes.length));
        }
        for (Probe ele : probes) {
            this.probes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about each probe associated with that monitor.
     * </p>
     * 
     * @param probes
     *        The details about each probe associated with that monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withProbes(java.util.Collection<Probe> probes) {
        setProbes(probes);
        return this;
    }

    /**
     * <p>
     * The time and date when the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date when the monitor was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time and date when the monitor was created.
     * </p>
     * 
     * @return The time and date when the monitor was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time and date when the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date when the monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time and date when the monitor was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date when the monitor was last modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time and date when the monitor was last modified.
     * </p>
     * 
     * @return The time and date when the monitor was last modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time and date when the monitor was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date when the monitor was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProbes() != null)
            sb.append("Probes: ").append(getProbes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMonitorResult == false)
            return false;
        GetMonitorResult other = (GetMonitorResult) obj;
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
        if (other.getProbes() == null ^ this.getProbes() == null)
            return false;
        if (other.getProbes() != null && other.getProbes().equals(this.getProbes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
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
        hashCode = prime * hashCode + ((getProbes() == null) ? 0 : getProbes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetMonitorResult clone() {
        try {
            return (GetMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
