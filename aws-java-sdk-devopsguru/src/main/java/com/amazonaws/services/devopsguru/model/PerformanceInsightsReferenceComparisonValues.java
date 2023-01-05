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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reference scalar values and other metrics that DevOps Guru displays on a graph in its console along with the actual
 * metrics it analyzed. Compare these reference values to your actual metrics to help you understand anomalous behavior
 * that DevOps Guru detected.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PerformanceInsightsReferenceComparisonValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsReferenceComparisonValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference value
     * is used to determine if an actual metric value should be considered anomalous.
     * </p>
     */
    private PerformanceInsightsReferenceScalar referenceScalar;
    /**
     * <p>
     * A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if an
     * actual metric should be considered anomalous.
     * </p>
     */
    private PerformanceInsightsReferenceMetric referenceMetric;

    /**
     * <p>
     * A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference value
     * is used to determine if an actual metric value should be considered anomalous.
     * </p>
     * 
     * @param referenceScalar
     *        A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference
     *        value is used to determine if an actual metric value should be considered anomalous.
     */

    public void setReferenceScalar(PerformanceInsightsReferenceScalar referenceScalar) {
        this.referenceScalar = referenceScalar;
    }

    /**
     * <p>
     * A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference value
     * is used to determine if an actual metric value should be considered anomalous.
     * </p>
     * 
     * @return A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference
     *         value is used to determine if an actual metric value should be considered anomalous.
     */

    public PerformanceInsightsReferenceScalar getReferenceScalar() {
        return this.referenceScalar;
    }

    /**
     * <p>
     * A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference value
     * is used to determine if an actual metric value should be considered anomalous.
     * </p>
     * 
     * @param referenceScalar
     *        A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference
     *        value is used to determine if an actual metric value should be considered anomalous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsReferenceComparisonValues withReferenceScalar(PerformanceInsightsReferenceScalar referenceScalar) {
        setReferenceScalar(referenceScalar);
        return this;
    }

    /**
     * <p>
     * A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if an
     * actual metric should be considered anomalous.
     * </p>
     * 
     * @param referenceMetric
     *        A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if
     *        an actual metric should be considered anomalous.
     */

    public void setReferenceMetric(PerformanceInsightsReferenceMetric referenceMetric) {
        this.referenceMetric = referenceMetric;
    }

    /**
     * <p>
     * A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if an
     * actual metric should be considered anomalous.
     * </p>
     * 
     * @return A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if
     *         an actual metric should be considered anomalous.
     */

    public PerformanceInsightsReferenceMetric getReferenceMetric() {
        return this.referenceMetric;
    }

    /**
     * <p>
     * A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if an
     * actual metric should be considered anomalous.
     * </p>
     * 
     * @param referenceMetric
     *        A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if
     *        an actual metric should be considered anomalous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsReferenceComparisonValues withReferenceMetric(PerformanceInsightsReferenceMetric referenceMetric) {
        setReferenceMetric(referenceMetric);
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
        if (getReferenceScalar() != null)
            sb.append("ReferenceScalar: ").append(getReferenceScalar()).append(",");
        if (getReferenceMetric() != null)
            sb.append("ReferenceMetric: ").append(getReferenceMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceInsightsReferenceComparisonValues == false)
            return false;
        PerformanceInsightsReferenceComparisonValues other = (PerformanceInsightsReferenceComparisonValues) obj;
        if (other.getReferenceScalar() == null ^ this.getReferenceScalar() == null)
            return false;
        if (other.getReferenceScalar() != null && other.getReferenceScalar().equals(this.getReferenceScalar()) == false)
            return false;
        if (other.getReferenceMetric() == null ^ this.getReferenceMetric() == null)
            return false;
        if (other.getReferenceMetric() != null && other.getReferenceMetric().equals(this.getReferenceMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceScalar() == null) ? 0 : getReferenceScalar().hashCode());
        hashCode = prime * hashCode + ((getReferenceMetric() == null) ? 0 : getReferenceMetric().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceInsightsReferenceComparisonValues clone() {
        try {
            return (PerformanceInsightsReferenceComparisonValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.PerformanceInsightsReferenceComparisonValuesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
