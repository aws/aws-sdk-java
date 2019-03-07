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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a target tracking scaling policy configuration to use with Amazon EC2 Auto Scaling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TargetTrackingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private PredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private CustomizedMetricSpecification customizedMetricSpecification;
    /**
     * <p>
     * The target value for the metric.
     * </p>
     */
    private Double targetValue;
    /**
     * <p>
     * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the
     * target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target
     * tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * </p>
     */
    private Boolean disableScaleIn;

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public void setPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return this.predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        setPredefinedMetricSpecification(predefinedMetricSpecification);
        return this;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public void setCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return this.customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        setCustomizedMetricSpecification(customizedMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     * 
     * @return The target value for the metric.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The target value for the metric.
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
        return this;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the
     * target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target
     * tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled,
     *        the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the
     *        target tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the
     * target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target
     * tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * </p>
     * 
     * @return Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is
     *         disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group.
     *         Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The
     *         default is disabled.
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the
     * target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target
     * tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled,
     *        the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the
     *        target tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the
     * target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target
     * tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
     * </p>
     * 
     * @return Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is
     *         disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group.
     *         Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The
     *         default is disabled.
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
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
        if (getPredefinedMetricSpecification() != null)
            sb.append("PredefinedMetricSpecification: ").append(getPredefinedMetricSpecification()).append(",");
        if (getCustomizedMetricSpecification() != null)
            sb.append("CustomizedMetricSpecification: ").append(getCustomizedMetricSpecification()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue()).append(",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: ").append(getDisableScaleIn());
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
        if (other.getPredefinedMetricSpecification() == null ^ this.getPredefinedMetricSpecification() == null)
            return false;
        if (other.getPredefinedMetricSpecification() != null
                && other.getPredefinedMetricSpecification().equals(this.getPredefinedMetricSpecification()) == false)
            return false;
        if (other.getCustomizedMetricSpecification() == null ^ this.getCustomizedMetricSpecification() == null)
            return false;
        if (other.getCustomizedMetricSpecification() != null
                && other.getCustomizedMetricSpecification().equals(this.getCustomizedMetricSpecification()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedMetricSpecification() == null) ? 0 : getPredefinedMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getCustomizedMetricSpecification() == null) ? 0 : getCustomizedMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
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

}
