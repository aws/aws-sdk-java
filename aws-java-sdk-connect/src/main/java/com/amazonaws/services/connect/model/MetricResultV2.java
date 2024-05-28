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
 * Contains information about the metric results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MetricResultV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricResultV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     */
    private java.util.Map<String, String> dimensions;
    /**
     * <p>
     * The interval period with the start and end time for the metrics.
     * </p>
     */
    private MetricInterval metricInterval;
    /**
     * <p>
     * The set of metrics.
     * </p>
     */
    private java.util.List<MetricDataV2> collections;

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     * 
     * @return The dimension for the metrics.
     */

    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     * 
     * @param dimensions
     *        The dimension for the metrics.
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     * 
     * @param dimensions
     *        The dimension for the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Add a single Dimensions entry
     *
     * @see MetricResultV2#withDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The interval period with the start and end time for the metrics.
     * </p>
     * 
     * @param metricInterval
     *        The interval period with the start and end time for the metrics.
     */

    public void setMetricInterval(MetricInterval metricInterval) {
        this.metricInterval = metricInterval;
    }

    /**
     * <p>
     * The interval period with the start and end time for the metrics.
     * </p>
     * 
     * @return The interval period with the start and end time for the metrics.
     */

    public MetricInterval getMetricInterval() {
        return this.metricInterval;
    }

    /**
     * <p>
     * The interval period with the start and end time for the metrics.
     * </p>
     * 
     * @param metricInterval
     *        The interval period with the start and end time for the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 withMetricInterval(MetricInterval metricInterval) {
        setMetricInterval(metricInterval);
        return this;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * 
     * @return The set of metrics.
     */

    public java.util.List<MetricDataV2> getCollections() {
        return collections;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * 
     * @param collections
     *        The set of metrics.
     */

    public void setCollections(java.util.Collection<MetricDataV2> collections) {
        if (collections == null) {
            this.collections = null;
            return;
        }

        this.collections = new java.util.ArrayList<MetricDataV2>(collections);
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollections(java.util.Collection)} or {@link #withCollections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param collections
     *        The set of metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 withCollections(MetricDataV2... collections) {
        if (this.collections == null) {
            setCollections(new java.util.ArrayList<MetricDataV2>(collections.length));
        }
        for (MetricDataV2 ele : collections) {
            this.collections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * 
     * @param collections
     *        The set of metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricResultV2 withCollections(java.util.Collection<MetricDataV2> collections) {
        setCollections(collections);
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
        if (getMetricInterval() != null)
            sb.append("MetricInterval: ").append(getMetricInterval()).append(",");
        if (getCollections() != null)
            sb.append("Collections: ").append(getCollections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricResultV2 == false)
            return false;
        MetricResultV2 other = (MetricResultV2) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMetricInterval() == null ^ this.getMetricInterval() == null)
            return false;
        if (other.getMetricInterval() != null && other.getMetricInterval().equals(this.getMetricInterval()) == false)
            return false;
        if (other.getCollections() == null ^ this.getCollections() == null)
            return false;
        if (other.getCollections() != null && other.getCollections().equals(this.getCollections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMetricInterval() == null) ? 0 : getMetricInterval().hashCode());
        hashCode = prime * hashCode + ((getCollections() == null) ? 0 : getCollections().hashCode());
        return hashCode;
    }

    @Override
    public MetricResultV2 clone() {
        try {
            return (MetricResultV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MetricResultV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
