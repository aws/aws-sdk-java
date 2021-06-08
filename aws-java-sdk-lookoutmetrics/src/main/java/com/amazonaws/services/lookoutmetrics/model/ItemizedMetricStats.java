/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Aggregated statistics about a measure affected by an anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ItemizedMetricStats" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemizedMetricStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the measure.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The number of times that the measure appears.
     * </p>
     */
    private Integer occurrenceCount;

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @param metricName
     *        The name of the measure.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @return The name of the measure.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @param metricName
     *        The name of the measure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemizedMetricStats withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The number of times that the measure appears.
     * </p>
     * 
     * @param occurrenceCount
     *        The number of times that the measure appears.
     */

    public void setOccurrenceCount(Integer occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
    }

    /**
     * <p>
     * The number of times that the measure appears.
     * </p>
     * 
     * @return The number of times that the measure appears.
     */

    public Integer getOccurrenceCount() {
        return this.occurrenceCount;
    }

    /**
     * <p>
     * The number of times that the measure appears.
     * </p>
     * 
     * @param occurrenceCount
     *        The number of times that the measure appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemizedMetricStats withOccurrenceCount(Integer occurrenceCount) {
        setOccurrenceCount(occurrenceCount);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getOccurrenceCount() != null)
            sb.append("OccurrenceCount: ").append(getOccurrenceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemizedMetricStats == false)
            return false;
        ItemizedMetricStats other = (ItemizedMetricStats) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getOccurrenceCount() == null ^ this.getOccurrenceCount() == null)
            return false;
        if (other.getOccurrenceCount() != null && other.getOccurrenceCount().equals(this.getOccurrenceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceCount() == null) ? 0 : getOccurrenceCount().hashCode());
        return hashCode;
    }

    @Override
    public ItemizedMetricStats clone() {
        try {
            return (ItemizedMetricStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.ItemizedMetricStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
