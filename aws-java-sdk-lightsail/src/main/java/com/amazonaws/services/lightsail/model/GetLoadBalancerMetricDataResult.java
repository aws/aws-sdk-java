/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoadBalancerMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metric about which you are receiving information. Valid values are listed below.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * An array of metric datapoint objects.
     * </p>
     */
    private java.util.List<MetricDatapoint> metricData;

    /**
     * <p>
     * The metric about which you are receiving information. Valid values are listed below.
     * </p>
     * 
     * @param metricName
     *        The metric about which you are receiving information. Valid values are listed below.
     * @see LoadBalancerMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric about which you are receiving information. Valid values are listed below.
     * </p>
     * 
     * @return The metric about which you are receiving information. Valid values are listed below.
     * @see LoadBalancerMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric about which you are receiving information. Valid values are listed below.
     * </p>
     * 
     * @param metricName
     *        The metric about which you are receiving information. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerMetricName
     */

    public GetLoadBalancerMetricDataResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric about which you are receiving information. Valid values are listed below.
     * </p>
     * 
     * @param metricName
     *        The metric about which you are receiving information. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerMetricName
     */

    public GetLoadBalancerMetricDataResult withMetricName(LoadBalancerMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * An array of metric datapoint objects.
     * </p>
     * 
     * @return An array of metric datapoint objects.
     */

    public java.util.List<MetricDatapoint> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * An array of metric datapoint objects.
     * </p>
     * 
     * @param metricData
     *        An array of metric datapoint objects.
     */

    public void setMetricData(java.util.Collection<MetricDatapoint> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData);
    }

    /**
     * <p>
     * An array of metric datapoint objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        An array of metric datapoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerMetricDataResult withMetricData(MetricDatapoint... metricData) {
        if (this.metricData == null) {
            setMetricData(new java.util.ArrayList<MetricDatapoint>(metricData.length));
        }
        for (MetricDatapoint ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of metric datapoint objects.
     * </p>
     * 
     * @param metricData
     *        An array of metric datapoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerMetricDataResult withMetricData(java.util.Collection<MetricDatapoint> metricData) {
        setMetricData(metricData);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancerMetricDataResult == false)
            return false;
        GetLoadBalancerMetricDataResult other = (GetLoadBalancerMetricDataResult) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public GetLoadBalancerMetricDataResult clone() {
        try {
            return (GetLoadBalancerMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
