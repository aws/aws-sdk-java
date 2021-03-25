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
 * Details about a measure affected by an anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/MetricLevelImpact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricLevelImpact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the measure.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The number of anomalous metrics for the measure.
     * </p>
     */
    private Integer numTimeSeries;
    /**
     * <p>
     * Details about the dimensions that contributed to the anomaly.
     * </p>
     */
    private ContributionMatrix contributionMatrix;

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

    public MetricLevelImpact withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The number of anomalous metrics for the measure.
     * </p>
     * 
     * @param numTimeSeries
     *        The number of anomalous metrics for the measure.
     */

    public void setNumTimeSeries(Integer numTimeSeries) {
        this.numTimeSeries = numTimeSeries;
    }

    /**
     * <p>
     * The number of anomalous metrics for the measure.
     * </p>
     * 
     * @return The number of anomalous metrics for the measure.
     */

    public Integer getNumTimeSeries() {
        return this.numTimeSeries;
    }

    /**
     * <p>
     * The number of anomalous metrics for the measure.
     * </p>
     * 
     * @param numTimeSeries
     *        The number of anomalous metrics for the measure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricLevelImpact withNumTimeSeries(Integer numTimeSeries) {
        setNumTimeSeries(numTimeSeries);
        return this;
    }

    /**
     * <p>
     * Details about the dimensions that contributed to the anomaly.
     * </p>
     * 
     * @param contributionMatrix
     *        Details about the dimensions that contributed to the anomaly.
     */

    public void setContributionMatrix(ContributionMatrix contributionMatrix) {
        this.contributionMatrix = contributionMatrix;
    }

    /**
     * <p>
     * Details about the dimensions that contributed to the anomaly.
     * </p>
     * 
     * @return Details about the dimensions that contributed to the anomaly.
     */

    public ContributionMatrix getContributionMatrix() {
        return this.contributionMatrix;
    }

    /**
     * <p>
     * Details about the dimensions that contributed to the anomaly.
     * </p>
     * 
     * @param contributionMatrix
     *        Details about the dimensions that contributed to the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricLevelImpact withContributionMatrix(ContributionMatrix contributionMatrix) {
        setContributionMatrix(contributionMatrix);
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
        if (getNumTimeSeries() != null)
            sb.append("NumTimeSeries: ").append(getNumTimeSeries()).append(",");
        if (getContributionMatrix() != null)
            sb.append("ContributionMatrix: ").append(getContributionMatrix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricLevelImpact == false)
            return false;
        MetricLevelImpact other = (MetricLevelImpact) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNumTimeSeries() == null ^ this.getNumTimeSeries() == null)
            return false;
        if (other.getNumTimeSeries() != null && other.getNumTimeSeries().equals(this.getNumTimeSeries()) == false)
            return false;
        if (other.getContributionMatrix() == null ^ this.getContributionMatrix() == null)
            return false;
        if (other.getContributionMatrix() != null && other.getContributionMatrix().equals(this.getContributionMatrix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNumTimeSeries() == null) ? 0 : getNumTimeSeries().hashCode());
        hashCode = prime * hashCode + ((getContributionMatrix() == null) ? 0 : getContributionMatrix().hashCode());
        return hashCode;
    }

    @Override
    public MetricLevelImpact clone() {
        try {
            return (MetricLevelImpact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.MetricLevelImpactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
