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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetProbe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProbeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes and
     * probe IDs for the monitor.
     * </p>
     */
    private String probeId;

    /**
     * <p>
     * The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor
     *        names.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @return The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor
     *         names.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor associated with the probe. Run <code>ListMonitors</code> to get a list of monitor
     *        names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProbeRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes and
     * probe IDs for the monitor.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes
     *        and probe IDs for the monitor.
     */

    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    /**
     * <p>
     * The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes and
     * probe IDs for the monitor.
     * </p>
     * 
     * @return The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes
     *         and probe IDs for the monitor.
     */

    public String getProbeId() {
        return this.probeId;
    }

    /**
     * <p>
     * The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes and
     * probe IDs for the monitor.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe to get information about. Run <code>GetMonitor</code> action to get a list of probes
     *        and probe IDs for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProbeRequest withProbeId(String probeId) {
        setProbeId(probeId);
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
        if (getProbeId() != null)
            sb.append("ProbeId: ").append(getProbeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProbeRequest == false)
            return false;
        GetProbeRequest other = (GetProbeRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getProbeId() == null ^ this.getProbeId() == null)
            return false;
        if (other.getProbeId() != null && other.getProbeId().equals(this.getProbeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getProbeId() == null) ? 0 : getProbeId().hashCode());
        return hashCode;
    }

    @Override
    public GetProbeRequest clone() {
        return (GetProbeRequest) super.clone();
    }

}
