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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MetricV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     */
    private String name;
    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     */
    private java.util.List<ThresholdV2> threshold;
    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     */
    private java.util.List<MetricFilterV2> metricFilters;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     * 
     * @param name
     *        The name of the metric.</p> <important>
     *        <p>
     *        This parameter is required. The following Required = No is incorrect.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     * 
     * @return The name of the metric.</p> <important>
     *         <p>
     *         This parameter is required. The following Required = No is incorrect.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <important>
     * <p>
     * This parameter is required. The following Required = No is incorrect.
     * </p>
     * </important>
     * 
     * @param name
     *        The name of the metric.</p> <important>
     *        <p>
     *        This parameter is required. The following Required = No is incorrect.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricV2 withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * 
     * @return Contains information about the threshold for service level metrics.
     */

    public java.util.List<ThresholdV2> getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * 
     * @param threshold
     *        Contains information about the threshold for service level metrics.
     */

    public void setThreshold(java.util.Collection<ThresholdV2> threshold) {
        if (threshold == null) {
            this.threshold = null;
            return;
        }

        this.threshold = new java.util.ArrayList<ThresholdV2>(threshold);
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreshold(java.util.Collection)} or {@link #withThreshold(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param threshold
     *        Contains information about the threshold for service level metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricV2 withThreshold(ThresholdV2... threshold) {
        if (this.threshold == null) {
            setThreshold(new java.util.ArrayList<ThresholdV2>(threshold.length));
        }
        for (ThresholdV2 ele : threshold) {
            this.threshold.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the threshold for service level metrics.
     * </p>
     * 
     * @param threshold
     *        Contains information about the threshold for service level metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricV2 withThreshold(java.util.Collection<ThresholdV2> threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * 
     * @return Contains the filters to be used when returning data.
     */

    public java.util.List<MetricFilterV2> getMetricFilters() {
        return metricFilters;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * 
     * @param metricFilters
     *        Contains the filters to be used when returning data.
     */

    public void setMetricFilters(java.util.Collection<MetricFilterV2> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
            return;
        }

        this.metricFilters = new java.util.ArrayList<MetricFilterV2>(metricFilters);
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricFilters(java.util.Collection)} or {@link #withMetricFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricFilters
     *        Contains the filters to be used when returning data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricV2 withMetricFilters(MetricFilterV2... metricFilters) {
        if (this.metricFilters == null) {
            setMetricFilters(new java.util.ArrayList<MetricFilterV2>(metricFilters.length));
        }
        for (MetricFilterV2 ele : metricFilters) {
            this.metricFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the filters to be used when returning data.
     * </p>
     * 
     * @param metricFilters
     *        Contains the filters to be used when returning data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricV2 withMetricFilters(java.util.Collection<MetricFilterV2> metricFilters) {
        setMetricFilters(metricFilters);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getMetricFilters() != null)
            sb.append("MetricFilters: ").append(getMetricFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricV2 == false)
            return false;
        MetricV2 other = (MetricV2) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getMetricFilters() == null ^ this.getMetricFilters() == null)
            return false;
        if (other.getMetricFilters() != null && other.getMetricFilters().equals(this.getMetricFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getMetricFilters() == null) ? 0 : getMetricFilters().hashCode());
        return hashCode;
    }

    @Override
    public MetricV2 clone() {
        try {
            return (MetricV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MetricV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
