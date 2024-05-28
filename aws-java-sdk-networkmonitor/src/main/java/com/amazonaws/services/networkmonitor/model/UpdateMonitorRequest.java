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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor to update.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     * </p>
     */
    private Long aggregationPeriod;

    /**
     * <p>
     * The name of the monitor to update.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to update.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor to update.
     * </p>
     * 
     * @return The name of the monitor to update.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor to update.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     */

    public void setAggregationPeriod(Long aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @return The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     */

    public Long getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation time, in seconds, to change to. This must be either <code>30</code> or <code>60</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withAggregationPeriod(Long aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
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
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMonitorRequest == false)
            return false;
        UpdateMonitorRequest other = (UpdateMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMonitorRequest clone() {
        return (UpdateMonitorRequest) super.clone();
    }

}
