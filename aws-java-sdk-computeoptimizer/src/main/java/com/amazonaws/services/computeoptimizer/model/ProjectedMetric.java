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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a projected utilization metric of a recommendation option, such as an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ProjectedMetric" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectedMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <note>
     * <p>
     * Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling
     * Memory Utilization with the CloudWatch Agent</a>.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * The time stamps of the projected utilization metric.
     * </p>
     */
    private java.util.List<java.util.Date> timestamps;
    /**
     * <p>
     * The values of the projected utilization metrics.
     * </p>
     */
    private java.util.List<Double> values;

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <note>
     * <p>
     * Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling
     * Memory Utilization with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the projected utilization metric.</p> <note>
     *        <p>
     *        Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html"
     *        >Enabling Memory Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @see MetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <note>
     * <p>
     * Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling
     * Memory Utilization with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @return The name of the projected utilization metric.</p> <note>
     *         <p>
     *         Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html"
     *         >Enabling Memory Utilization with the CloudWatch Agent</a>.
     *         </p>
     * @see MetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <note>
     * <p>
     * Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling
     * Memory Utilization with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the projected utilization metric.</p> <note>
     *        <p>
     *        Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html"
     *        >Enabling Memory Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public ProjectedMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <note>
     * <p>
     * Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling
     * Memory Utilization with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the projected utilization metric.</p> <note>
     *        <p>
     *        Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html"
     *        >Enabling Memory Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public ProjectedMetric withName(MetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The time stamps of the projected utilization metric.
     * </p>
     * 
     * @return The time stamps of the projected utilization metric.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * The time stamps of the projected utilization metric.
     * </p>
     * 
     * @param timestamps
     *        The time stamps of the projected utilization metric.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The time stamps of the projected utilization metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The time stamps of the projected utilization metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectedMetric withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time stamps of the projected utilization metric.
     * </p>
     * 
     * @param timestamps
     *        The time stamps of the projected utilization metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectedMetric withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * The values of the projected utilization metrics.
     * </p>
     * 
     * @return The values of the projected utilization metrics.
     */

    public java.util.List<Double> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the projected utilization metrics.
     * </p>
     * 
     * @param values
     *        The values of the projected utilization metrics.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Double>(values);
    }

    /**
     * <p>
     * The values of the projected utilization metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the projected utilization metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectedMetric withValues(Double... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the projected utilization metrics.
     * </p>
     * 
     * @param values
     *        The values of the projected utilization metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectedMetric withValues(java.util.Collection<Double> values) {
        setValues(values);
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
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectedMetric == false)
            return false;
        ProjectedMetric other = (ProjectedMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ProjectedMetric clone() {
        try {
            return (ProjectedMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ProjectedMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
