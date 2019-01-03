/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform
 * them into metric data in a CloudWatch metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/MetricFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric filter.
     * </p>
     */
    private String filterName;

    private String filterPattern;
    /**
     * <p>
     * The metric transformations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricTransformation> metricTransformations;
    /**
     * <p>
     * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The name of the metric filter.
     * </p>
     * 
     * @param filterName
     *        The name of the metric filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the metric filter.
     * </p>
     * 
     * @return The name of the metric filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * The name of the metric filter.
     * </p>
     * 
     * @param filterName
     *        The name of the metric filter.
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
     * <p>
     * The metric transformations.
     * </p>
     * 
     * @return The metric transformations.
     */

    public java.util.List<MetricTransformation> getMetricTransformations() {
        if (metricTransformations == null) {
            metricTransformations = new com.amazonaws.internal.SdkInternalList<MetricTransformation>();
        }
        return metricTransformations;
    }

    /**
     * <p>
     * The metric transformations.
     * </p>
     * 
     * @param metricTransformations
     *        The metric transformations.
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
     * The metric transformations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricTransformations(java.util.Collection)} or
     * {@link #withMetricTransformations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metricTransformations
     *        The metric transformations.
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
     * <p>
     * The metric transformations.
     * </p>
     * 
     * @param metricTransformations
     *        The metric transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        setMetricTransformations(metricTransformations);
        return this;
    }

    /**
     * <p>
     * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970
     *         00:00:00 UTC.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilter withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getMetricTransformations() != null)
            sb.append("MetricTransformations: ").append(getMetricTransformations()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
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
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
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
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.MetricFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
