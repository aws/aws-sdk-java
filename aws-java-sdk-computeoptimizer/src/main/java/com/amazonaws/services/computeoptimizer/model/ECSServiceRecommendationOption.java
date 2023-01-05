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
 * Describes the recommendation options for an Amazon ECS service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSServiceRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The memory size of the ECS service recommendation option.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The CPU size of the ECS service recommendation option.
     * </p>
     */
    private Integer cpu;

    private SavingsOpportunity savingsOpportunity;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the ECS service recommendation option.
     * </p>
     */
    private java.util.List<ECSServiceProjectedUtilizationMetric> projectedUtilizationMetrics;
    /**
     * <p>
     * The CPU and memory size recommendations for the containers within the task of your ECS service.
     * </p>
     */
    private java.util.List<ContainerRecommendation> containerRecommendations;

    /**
     * <p>
     * The memory size of the ECS service recommendation option.
     * </p>
     * 
     * @param memory
     *        The memory size of the ECS service recommendation option.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The memory size of the ECS service recommendation option.
     * </p>
     * 
     * @return The memory size of the ECS service recommendation option.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The memory size of the ECS service recommendation option.
     * </p>
     * 
     * @param memory
     *        The memory size of the ECS service recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The CPU size of the ECS service recommendation option.
     * </p>
     * 
     * @param cpu
     *        The CPU size of the ECS service recommendation option.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The CPU size of the ECS service recommendation option.
     * </p>
     * 
     * @return The CPU size of the ECS service recommendation option.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The CPU size of the ECS service recommendation option.
     * </p>
     * 
     * @param cpu
     *        The CPU size of the ECS service recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * @param savingsOpportunity
     */

    public void setSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        this.savingsOpportunity = savingsOpportunity;
    }

    /**
     * @return
     */

    public SavingsOpportunity getSavingsOpportunity() {
        return this.savingsOpportunity;
    }

    /**
     * @param savingsOpportunity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        setSavingsOpportunity(savingsOpportunity);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the ECS service recommendation option.
     * </p>
     * 
     * @return An array of objects that describe the projected utilization metrics of the ECS service recommendation
     *         option.
     */

    public java.util.List<ECSServiceProjectedUtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the ECS service recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the ECS service recommendation
     *        option.
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<ECSServiceProjectedUtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<ECSServiceProjectedUtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the ECS service recommendation option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the ECS service recommendation
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withProjectedUtilizationMetrics(ECSServiceProjectedUtilizationMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<ECSServiceProjectedUtilizationMetric>(projectedUtilizationMetrics.length));
        }
        for (ECSServiceProjectedUtilizationMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the ECS service recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the ECS service recommendation
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<ECSServiceProjectedUtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The CPU and memory size recommendations for the containers within the task of your ECS service.
     * </p>
     * 
     * @return The CPU and memory size recommendations for the containers within the task of your ECS service.
     */

    public java.util.List<ContainerRecommendation> getContainerRecommendations() {
        return containerRecommendations;
    }

    /**
     * <p>
     * The CPU and memory size recommendations for the containers within the task of your ECS service.
     * </p>
     * 
     * @param containerRecommendations
     *        The CPU and memory size recommendations for the containers within the task of your ECS service.
     */

    public void setContainerRecommendations(java.util.Collection<ContainerRecommendation> containerRecommendations) {
        if (containerRecommendations == null) {
            this.containerRecommendations = null;
            return;
        }

        this.containerRecommendations = new java.util.ArrayList<ContainerRecommendation>(containerRecommendations);
    }

    /**
     * <p>
     * The CPU and memory size recommendations for the containers within the task of your ECS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerRecommendations(java.util.Collection)} or
     * {@link #withContainerRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerRecommendations
     *        The CPU and memory size recommendations for the containers within the task of your ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withContainerRecommendations(ContainerRecommendation... containerRecommendations) {
        if (this.containerRecommendations == null) {
            setContainerRecommendations(new java.util.ArrayList<ContainerRecommendation>(containerRecommendations.length));
        }
        for (ContainerRecommendation ele : containerRecommendations) {
            this.containerRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CPU and memory size recommendations for the containers within the task of your ECS service.
     * </p>
     * 
     * @param containerRecommendations
     *        The CPU and memory size recommendations for the containers within the task of your ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendationOption withContainerRecommendations(java.util.Collection<ContainerRecommendation> containerRecommendations) {
        setContainerRecommendations(containerRecommendations);
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
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getSavingsOpportunity() != null)
            sb.append("SavingsOpportunity: ").append(getSavingsOpportunity()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics()).append(",");
        if (getContainerRecommendations() != null)
            sb.append("ContainerRecommendations: ").append(getContainerRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSServiceRecommendationOption == false)
            return false;
        ECSServiceRecommendationOption other = (ECSServiceRecommendationOption) obj;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getSavingsOpportunity() == null ^ this.getSavingsOpportunity() == null)
            return false;
        if (other.getSavingsOpportunity() != null && other.getSavingsOpportunity().equals(this.getSavingsOpportunity()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        if (other.getContainerRecommendations() == null ^ this.getContainerRecommendations() == null)
            return false;
        if (other.getContainerRecommendations() != null && other.getContainerRecommendations().equals(this.getContainerRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunity() == null) ? 0 : getSavingsOpportunity().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getContainerRecommendations() == null) ? 0 : getContainerRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public ECSServiceRecommendationOption clone() {
        try {
            return (ECSServiceRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSServiceRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
