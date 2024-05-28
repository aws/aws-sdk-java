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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be up to
     * 200 characters.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * Displays a list of all of the probes created for a monitor.
     * </p>
     */
    private java.util.List<CreateMonitorProbeInput> probes;
    /**
     * <p>
     * The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     * </p>
     */
    private Long aggregationPeriod;
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be up to
     * 200 characters.
     * </p>
     * 
     * @param monitorName
     *        The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be
     *        up to 200 characters.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be up to
     * 200 characters.
     * </p>
     * 
     * @return The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be
     *         up to 200 characters.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be up to
     * 200 characters.
     * </p>
     * 
     * @param monitorName
     *        The name identifying the monitor. It can contain only letters, underscores (_), or dashes (-), and can be
     *        up to 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * Displays a list of all of the probes created for a monitor.
     * </p>
     * 
     * @return Displays a list of all of the probes created for a monitor.
     */

    public java.util.List<CreateMonitorProbeInput> getProbes() {
        return probes;
    }

    /**
     * <p>
     * Displays a list of all of the probes created for a monitor.
     * </p>
     * 
     * @param probes
     *        Displays a list of all of the probes created for a monitor.
     */

    public void setProbes(java.util.Collection<CreateMonitorProbeInput> probes) {
        if (probes == null) {
            this.probes = null;
            return;
        }

        this.probes = new java.util.ArrayList<CreateMonitorProbeInput>(probes);
    }

    /**
     * <p>
     * Displays a list of all of the probes created for a monitor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProbes(java.util.Collection)} or {@link #withProbes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param probes
     *        Displays a list of all of the probes created for a monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withProbes(CreateMonitorProbeInput... probes) {
        if (this.probes == null) {
            setProbes(new java.util.ArrayList<CreateMonitorProbeInput>(probes.length));
        }
        for (CreateMonitorProbeInput ele : probes) {
            this.probes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Displays a list of all of the probes created for a monitor.
     * </p>
     * 
     * @param probes
     *        Displays a list of all of the probes created for a monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withProbes(java.util.Collection<CreateMonitorProbeInput> probes) {
        setProbes(probes);
        return this;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     * </p>
     * 
     * @param aggregationPeriod
     *        The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     *        <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     */

    public void setAggregationPeriod(Long aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     * </p>
     * 
     * @return The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     *         <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     */

    public Long getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     * <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     * </p>
     * 
     * @param aggregationPeriod
     *        The time, in seconds, that metrics are aggregated and sent to Amazon CloudWatch. Valid values are either
     *        <code>30</code> or <code>60</code>. <code>60</code> is the default if no period is chosen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withAggregationPeriod(Long aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *        token was provided in the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *         token was provided in the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *        token was provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @return The list of key-value pairs created and assigned to the monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMonitorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest addTagsEntry(String key, String value) {
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

    public CreateMonitorRequest clearTagsEntries() {
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getProbes() != null)
            sb.append("Probes: ").append(getProbes()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateMonitorRequest == false)
            return false;
        CreateMonitorRequest other = (CreateMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getProbes() == null ^ this.getProbes() == null)
            return false;
        if (other.getProbes() != null && other.getProbes().equals(this.getProbes()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getProbes() == null) ? 0 : getProbes().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitorRequest clone() {
        return (CreateMonitorRequest) super.clone();
    }

}
