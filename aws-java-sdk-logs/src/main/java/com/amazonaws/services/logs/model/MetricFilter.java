/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Metric filters can be used to express how CloudWatch Logs would extract metric observations from ingested log events
 * and transform them to metric data in a CloudWatch metric.
 * </p>
 */
public class MetricFilter implements Serializable, Cloneable {

    private String filterName;

    private String filterPattern;

    private com.amazonaws.internal.SdkInternalList<MetricTransformation> metricTransformations;

    private Long creationTime;

    /**
     * @param filterName
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * @return
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * @param filterName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * @param filterPattern
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * @return
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @param filterPattern
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<MetricTransformation> getMetricTransformations() {
        if (metricTransformations == null) {
            metricTransformations = new com.amazonaws.internal.SdkInternalList<MetricTransformation>();
        }
        return metricTransformations;
    }

    /**
     * @param metricTransformations
     */

    public void setMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        if (metricTransformations == null) {
            this.metricTransformations = null;
            return;
        }

        this.metricTransformations = new com.amazonaws.internal.SdkInternalList<MetricTransformation>(metricTransformations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricTransformations(java.util.Collection)} or
     * {@link #withMetricTransformations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metricTransformations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withMetricTransformations(MetricTransformation... metricTransformations) {
        if (this.metricTransformations == null) {
            setMetricTransformations(new com.amazonaws.internal.SdkInternalList<MetricTransformation>(metricTransformations.length));
        }
        for (MetricTransformation ele : metricTransformations) {
            this.metricTransformations.add(ele);
        }
        return this;
    }

    /**
     * @param metricTransformations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        setMetricTransformations(metricTransformations);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
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
        if (getFilterName() != null)
            sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getMetricTransformations() != null)
            sb.append("MetricTransformations: " + getMetricTransformations() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricFilter == false)
            return false;
        MetricFilter other = (MetricFilter) obj;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getMetricTransformations() == null ^ this.getMetricTransformations() == null)
            return false;
        if (other.getMetricTransformations() != null && other.getMetricTransformations().equals(this.getMetricTransformations()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getMetricTransformations() == null) ? 0 : getMetricTransformations().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public MetricFilter clone() {
        try {
            return (MetricFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
