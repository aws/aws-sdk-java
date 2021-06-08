/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalyMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Cost anomaly monitor Amazon Resource Names (ARNs).
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The new name for the cost anomaly monitor.
     * </p>
     */
    private String monitorName;

    /**
     * <p>
     * Cost anomaly monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param monitorArn
     *        Cost anomaly monitor Amazon Resource Names (ARNs).
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * Cost anomaly monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return Cost anomaly monitor Amazon Resource Names (ARNs).
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * Cost anomaly monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param monitorArn
     *        Cost anomaly monitor Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyMonitorRequest withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The new name for the cost anomaly monitor.
     * </p>
     * 
     * @param monitorName
     *        The new name for the cost anomaly monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The new name for the cost anomaly monitor.
     * </p>
     * 
     * @return The new name for the cost anomaly monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The new name for the cost anomaly monitor.
     * </p>
     * 
     * @param monitorName
     *        The new name for the cost anomaly monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
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
            sb.append("MonitorName: ").append(getMonitorName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnomalyMonitorRequest == false)
            return false;
        UpdateAnomalyMonitorRequest other = (UpdateAnomalyMonitorRequest) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnomalyMonitorRequest clone() {
        return (UpdateAnomalyMonitorRequest) super.clone();
    }

}
