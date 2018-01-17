/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/TargetTrackingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingConfiguration implements Serializable, Cloneable, StructuredPojo {

    private PredefinedScalingMetricSpecification predefinedScalingMetricSpecification;

    private CustomizedScalingMetricSpecification customizedScalingMetricSpecification;

    private Double targetValue;

    private Boolean disableScaleIn;

    private Integer scaleOutCooldown;

    private Integer scaleInCooldown;

    private Integer estimatedInstanceWarmup;

    /**
     * @param predefinedScalingMetricSpecification
     */

    public void setPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
    }

    /**
     * @return
     */

    public PredefinedScalingMetricSpecification getPredefinedScalingMetricSpecification() {
        return this.predefinedScalingMetricSpecification;
    }

    /**
     * @param predefinedScalingMetricSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        setPredefinedScalingMetricSpecification(predefinedScalingMetricSpecification);
        return this;
    }

    /**
     * @param customizedScalingMetricSpecification
     */

    public void setCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
    }

    /**
     * @return
     */

    public CustomizedScalingMetricSpecification getCustomizedScalingMetricSpecification() {
        return this.customizedScalingMetricSpecification;
    }

    /**
     * @param customizedScalingMetricSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
        setCustomizedScalingMetricSpecification(customizedScalingMetricSpecification);
        return this;
    }

    /**
     * @param targetValue
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * @return
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * @param targetValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
        return this;
    }

    /**
     * @param disableScaleIn
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * @return
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * @param disableScaleIn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * @return
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * @param scaleOutCooldown
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * @return
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * @param scaleOutCooldown
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * @param scaleInCooldown
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * @return
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * @param scaleInCooldown
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * @param estimatedInstanceWarmup
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * @return
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * @param estimatedInstanceWarmup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPredefinedScalingMetricSpecification() != null)
            sb.append("PredefinedScalingMetricSpecification: ").append(getPredefinedScalingMetricSpecification()).append(",");
        if (getCustomizedScalingMetricSpecification() != null)
            sb.append("CustomizedScalingMetricSpecification: ").append(getCustomizedScalingMetricSpecification()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue()).append(",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: ").append(getDisableScaleIn()).append(",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: ").append(getScaleOutCooldown()).append(",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: ").append(getScaleInCooldown()).append(",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: ").append(getEstimatedInstanceWarmup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingConfiguration == false)
            return false;
        TargetTrackingConfiguration other = (TargetTrackingConfiguration) obj;
        if (other.getPredefinedScalingMetricSpecification() == null ^ this.getPredefinedScalingMetricSpecification() == null)
            return false;
        if (other.getPredefinedScalingMetricSpecification() != null
                && other.getPredefinedScalingMetricSpecification().equals(this.getPredefinedScalingMetricSpecification()) == false)
            return false;
        if (other.getCustomizedScalingMetricSpecification() == null ^ this.getCustomizedScalingMetricSpecification() == null)
            return false;
        if (other.getCustomizedScalingMetricSpecification() != null
                && other.getCustomizedScalingMetricSpecification().equals(this.getCustomizedScalingMetricSpecification()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedScalingMetricSpecification() == null) ? 0 : getPredefinedScalingMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getCustomizedScalingMetricSpecification() == null) ? 0 : getCustomizedScalingMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingConfiguration clone() {
        try {
            return (TargetTrackingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.TargetTrackingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
