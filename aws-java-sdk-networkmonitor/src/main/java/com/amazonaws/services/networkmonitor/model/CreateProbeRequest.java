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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateProbe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProbeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor to associated with the probe.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * Describes the details of an individual probe for a monitor.
     * </p>
     */
    private ProbeInput probe;
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the monitor to associated with the probe.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to associated with the probe.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor to associated with the probe.
     * </p>
     * 
     * @return The name of the monitor to associated with the probe.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor to associated with the probe.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to associated with the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProbeRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * Describes the details of an individual probe for a monitor.
     * </p>
     * 
     * @param probe
     *        Describes the details of an individual probe for a monitor.
     */

    public void setProbe(ProbeInput probe) {
        this.probe = probe;
    }

    /**
     * <p>
     * Describes the details of an individual probe for a monitor.
     * </p>
     * 
     * @return Describes the details of an individual probe for a monitor.
     */

    public ProbeInput getProbe() {
        return this.probe;
    }

    /**
     * <p>
     * Describes the details of an individual probe for a monitor.
     * </p>
     * 
     * @param probe
     *        Describes the details of an individual probe for a monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProbeRequest withProbe(ProbeInput probe) {
        setProbe(probe);
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

    public CreateProbeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @return The list of key-value pairs created and assigned to the probe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the probe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProbeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProbeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProbeRequest addTagsEntry(String key, String value) {
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

    public CreateProbeRequest clearTagsEntries() {
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
        if (getProbe() != null)
            sb.append("Probe: ").append(getProbe()).append(",");
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

        if (obj instanceof CreateProbeRequest == false)
            return false;
        CreateProbeRequest other = (CreateProbeRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getProbe() == null ^ this.getProbe() == null)
            return false;
        if (other.getProbe() != null && other.getProbe().equals(this.getProbe()) == false)
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
        hashCode = prime * hashCode + ((getProbe() == null) ? 0 : getProbe().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProbeRequest clone() {
        return (CreateProbeRequest) super.clone();
    }

}
