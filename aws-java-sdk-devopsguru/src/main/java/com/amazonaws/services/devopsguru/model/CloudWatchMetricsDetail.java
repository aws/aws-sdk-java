/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CloudWatchMetricsDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchMetricsDetail implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<CloudWatchMetricsDimension> dimensions;

    private String metricName;

    private String namespace;

    private Integer period;

    private String stat;

    private String unit;

    /**
     * @return
     */

    public java.util.List<CloudWatchMetricsDimension> getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions
     */

    public void setDimensions(java.util.Collection<CloudWatchMetricsDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<CloudWatchMetricsDimension>(dimensions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withDimensions(CloudWatchMetricsDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<CloudWatchMetricsDimension>(dimensions.length));
        }
        for (CloudWatchMetricsDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * @param dimensions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withDimensions(java.util.Collection<CloudWatchMetricsDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * @param metricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * @return
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @param metricName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * @param namespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * @return
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @param namespace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * @param period
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * @return
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @param period
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * @param stat
     * @see CloudWatchMetricsStat
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * @return
     * @see CloudWatchMetricsStat
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * @param stat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchMetricsStat
     */

    public CloudWatchMetricsDetail withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * @param stat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchMetricsStat
     */

    public CloudWatchMetricsDetail withStat(CloudWatchMetricsStat stat) {
        this.stat = stat.toString();
        return this;
    }

    /**
     * @param unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * @param unit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDetail withUnit(String unit) {
        setUnit(unit);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStat() != null)
            sb.append("Stat: ").append(getStat()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchMetricsDetail == false)
            return false;
        CloudWatchMetricsDetail other = (CloudWatchMetricsDetail) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStat() == null ^ this.getStat() == null)
            return false;
        if (other.getStat() != null && other.getStat().equals(this.getStat()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStat() == null) ? 0 : getStat().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchMetricsDetail clone() {
        try {
            return (CloudWatchMetricsDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CloudWatchMetricsDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
