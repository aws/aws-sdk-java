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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the projected metrics of an Amazon ECS service recommendation option.
 * </p>
 * <p>
 * To determine the performance difference between your current ECS service and the recommended option, compare the
 * metric data of your service against its projected metric data.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSServiceRecommendedOptionProjectedMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceRecommendedOptionProjectedMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended CPU size for the ECS service.
     * </p>
     */
    private Integer recommendedCpuUnits;
    /**
     * <p>
     * The recommended memory size for the ECS service.
     * </p>
     */
    private Integer recommendedMemorySize;
    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     */
    private java.util.List<ECSServiceProjectedMetric> projectedMetrics;

    /**
     * <p>
     * The recommended CPU size for the ECS service.
     * </p>
     * 
     * @param recommendedCpuUnits
     *        The recommended CPU size for the ECS service.
     */

    public void setRecommendedCpuUnits(Integer recommendedCpuUnits) {
        this.recommendedCpuUnits = recommendedCpuUnits;
    }

    /**
     * <p>
     * The recommended CPU size for the ECS service.
     * </p>
     * 
     * @return The recommended CPU size for the ECS service.
     */

    public Integer getRecommendedCpuUnits() {
        return this.recommendedCpuUnits;
    }

    /**
     * <p>
     * The recommended CPU size for the ECS service.
     * </p>
     * 
     * @param recommendedCpuUnits
     *        The recommended CPU size for the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendedOptionProjectedMetric withRecommendedCpuUnits(Integer recommendedCpuUnits) {
        setRecommendedCpuUnits(recommendedCpuUnits);
        return this;
    }

    /**
     * <p>
     * The recommended memory size for the ECS service.
     * </p>
     * 
     * @param recommendedMemorySize
     *        The recommended memory size for the ECS service.
     */

    public void setRecommendedMemorySize(Integer recommendedMemorySize) {
        this.recommendedMemorySize = recommendedMemorySize;
    }

    /**
     * <p>
     * The recommended memory size for the ECS service.
     * </p>
     * 
     * @return The recommended memory size for the ECS service.
     */

    public Integer getRecommendedMemorySize() {
        return this.recommendedMemorySize;
    }

    /**
     * <p>
     * The recommended memory size for the ECS service.
     * </p>
     * 
     * @param recommendedMemorySize
     *        The recommended memory size for the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendedOptionProjectedMetric withRecommendedMemorySize(Integer recommendedMemorySize) {
        setRecommendedMemorySize(recommendedMemorySize);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @return An array of objects that describe the projected metric.
     */

    public java.util.List<ECSServiceProjectedMetric> getProjectedMetrics() {
        return projectedMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     */

    public void setProjectedMetrics(java.util.Collection<ECSServiceProjectedMetric> projectedMetrics) {
        if (projectedMetrics == null) {
            this.projectedMetrics = null;
            return;
        }

        this.projectedMetrics = new java.util.ArrayList<ECSServiceProjectedMetric>(projectedMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedMetrics(java.util.Collection)} or {@link #withProjectedMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendedOptionProjectedMetric withProjectedMetrics(ECSServiceProjectedMetric... projectedMetrics) {
        if (this.projectedMetrics == null) {
            setProjectedMetrics(new java.util.ArrayList<ECSServiceProjectedMetric>(projectedMetrics.length));
        }
        for (ECSServiceProjectedMetric ele : projectedMetrics) {
            this.projectedMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendedOptionProjectedMetric withProjectedMetrics(java.util.Collection<ECSServiceProjectedMetric> projectedMetrics) {
        setProjectedMetrics(projectedMetrics);
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
        if (getRecommendedCpuUnits() != null)
            sb.append("RecommendedCpuUnits: ").append(getRecommendedCpuUnits()).append(",");
        if (getRecommendedMemorySize() != null)
            sb.append("RecommendedMemorySize: ").append(getRecommendedMemorySize()).append(",");
        if (getProjectedMetrics() != null)
            sb.append("ProjectedMetrics: ").append(getProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSServiceRecommendedOptionProjectedMetric == false)
            return false;
        ECSServiceRecommendedOptionProjectedMetric other = (ECSServiceRecommendedOptionProjectedMetric) obj;
        if (other.getRecommendedCpuUnits() == null ^ this.getRecommendedCpuUnits() == null)
            return false;
        if (other.getRecommendedCpuUnits() != null && other.getRecommendedCpuUnits().equals(this.getRecommendedCpuUnits()) == false)
            return false;
        if (other.getRecommendedMemorySize() == null ^ this.getRecommendedMemorySize() == null)
            return false;
        if (other.getRecommendedMemorySize() != null && other.getRecommendedMemorySize().equals(this.getRecommendedMemorySize()) == false)
            return false;
        if (other.getProjectedMetrics() == null ^ this.getProjectedMetrics() == null)
            return false;
        if (other.getProjectedMetrics() != null && other.getProjectedMetrics().equals(this.getProjectedMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedCpuUnits() == null) ? 0 : getRecommendedCpuUnits().hashCode());
        hashCode = prime * hashCode + ((getRecommendedMemorySize() == null) ? 0 : getRecommendedMemorySize().hashCode());
        hashCode = prime * hashCode + ((getProjectedMetrics() == null) ? 0 : getProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public ECSServiceRecommendedOptionProjectedMetric clone() {
        try {
            return (ECSServiceRecommendedOptionProjectedMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSServiceRecommendedOptionProjectedMetricMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
