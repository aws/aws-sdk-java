/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The available dimension information for a metric type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/MetricDimensionGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDimensionGroups implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type to which the dimension information belongs.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The available dimension groups for a metric type.
     * </p>
     */
    private java.util.List<DimensionGroupDetail> groups;

    /**
     * <p>
     * The metric type to which the dimension information belongs.
     * </p>
     * 
     * @param metric
     *        The metric type to which the dimension information belongs.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric type to which the dimension information belongs.
     * </p>
     * 
     * @return The metric type to which the dimension information belongs.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric type to which the dimension information belongs.
     * </p>
     * 
     * @param metric
     *        The metric type to which the dimension information belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimensionGroups withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The available dimension groups for a metric type.
     * </p>
     * 
     * @return The available dimension groups for a metric type.
     */

    public java.util.List<DimensionGroupDetail> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The available dimension groups for a metric type.
     * </p>
     * 
     * @param groups
     *        The available dimension groups for a metric type.
     */

    public void setGroups(java.util.Collection<DimensionGroupDetail> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<DimensionGroupDetail>(groups);
    }

    /**
     * <p>
     * The available dimension groups for a metric type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The available dimension groups for a metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimensionGroups withGroups(DimensionGroupDetail... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<DimensionGroupDetail>(groups.length));
        }
        for (DimensionGroupDetail ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available dimension groups for a metric type.
     * </p>
     * 
     * @param groups
     *        The available dimension groups for a metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimensionGroups withGroups(java.util.Collection<DimensionGroupDetail> groups) {
        setGroups(groups);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDimensionGroups == false)
            return false;
        MetricDimensionGroups other = (MetricDimensionGroups) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public MetricDimensionGroups clone() {
        try {
            return (MetricDimensionGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.MetricDimensionGroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
