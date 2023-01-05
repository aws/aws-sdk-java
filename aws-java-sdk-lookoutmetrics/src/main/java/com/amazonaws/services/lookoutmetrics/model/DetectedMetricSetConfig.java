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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An inferred dataset configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectedMetricSetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedMetricSetConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dataset's offset.
     * </p>
     */
    private DetectedField offset;
    /**
     * <p>
     * The dataset's interval.
     * </p>
     */
    private DetectedField metricSetFrequency;
    /**
     * <p>
     * The dataset's data source.
     * </p>
     */
    private DetectedMetricSource metricSource;

    /**
     * <p>
     * The dataset's offset.
     * </p>
     * 
     * @param offset
     *        The dataset's offset.
     */

    public void setOffset(DetectedField offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The dataset's offset.
     * </p>
     * 
     * @return The dataset's offset.
     */

    public DetectedField getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The dataset's offset.
     * </p>
     * 
     * @param offset
     *        The dataset's offset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedMetricSetConfig withOffset(DetectedField offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @param metricSetFrequency
     *        The dataset's interval.
     */

    public void setMetricSetFrequency(DetectedField metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @return The dataset's interval.
     */

    public DetectedField getMetricSetFrequency() {
        return this.metricSetFrequency;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @param metricSetFrequency
     *        The dataset's interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedMetricSetConfig withMetricSetFrequency(DetectedField metricSetFrequency) {
        setMetricSetFrequency(metricSetFrequency);
        return this;
    }

    /**
     * <p>
     * The dataset's data source.
     * </p>
     * 
     * @param metricSource
     *        The dataset's data source.
     */

    public void setMetricSource(DetectedMetricSource metricSource) {
        this.metricSource = metricSource;
    }

    /**
     * <p>
     * The dataset's data source.
     * </p>
     * 
     * @return The dataset's data source.
     */

    public DetectedMetricSource getMetricSource() {
        return this.metricSource;
    }

    /**
     * <p>
     * The dataset's data source.
     * </p>
     * 
     * @param metricSource
     *        The dataset's data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedMetricSetConfig withMetricSource(DetectedMetricSource metricSource) {
        setMetricSource(metricSource);
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
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getMetricSetFrequency() != null)
            sb.append("MetricSetFrequency: ").append(getMetricSetFrequency()).append(",");
        if (getMetricSource() != null)
            sb.append("MetricSource: ").append(getMetricSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectedMetricSetConfig == false)
            return false;
        DetectedMetricSetConfig other = (DetectedMetricSetConfig) obj;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getMetricSetFrequency() == null ^ this.getMetricSetFrequency() == null)
            return false;
        if (other.getMetricSetFrequency() != null && other.getMetricSetFrequency().equals(this.getMetricSetFrequency()) == false)
            return false;
        if (other.getMetricSource() == null ^ this.getMetricSource() == null)
            return false;
        if (other.getMetricSource() != null && other.getMetricSource().equals(this.getMetricSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getMetricSetFrequency() == null) ? 0 : getMetricSetFrequency().hashCode());
        hashCode = prime * hashCode + ((getMetricSource() == null) ? 0 : getMetricSource().hashCode());
        return hashCode;
    }

    @Override
    public DetectedMetricSetConfig clone() {
        try {
            return (DetectedMetricSetConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DetectedMetricSetConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
