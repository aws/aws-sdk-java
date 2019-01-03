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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetLoadBasedAutoScaling" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLoadBasedAutoScalingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The layer ID.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * Enables load-based auto scaling for the layer.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load exceeds
     * these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
     * </p>
     */
    private AutoScalingThresholds upScaling;
    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load falls
     * below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
     * </p>
     */
    private AutoScalingThresholds downScaling;

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @return The layer ID.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBasedAutoScalingRequest withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * Enables load-based auto scaling for the layer.
     * </p>
     * 
     * @param enable
     *        Enables load-based auto scaling for the layer.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Enables load-based auto scaling for the layer.
     * </p>
     * 
     * @return Enables load-based auto scaling for the layer.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Enables load-based auto scaling for the layer.
     * </p>
     * 
     * @param enable
     *        Enables load-based auto scaling for the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBasedAutoScalingRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * Enables load-based auto scaling for the layer.
     * </p>
     * 
     * @return Enables load-based auto scaling for the layer.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load exceeds
     * these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
     * </p>
     * 
     * @param upScaling
     *        An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load
     *        exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of
     *        instances.
     */

    public void setUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load exceeds
     * these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
     * </p>
     * 
     * @return An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load
     *         exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of
     *         instances.
     */

    public AutoScalingThresholds getUpScaling() {
        return this.upScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load exceeds
     * these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
     * </p>
     * 
     * @param upScaling
     *        An <code>AutoScalingThresholds</code> object with the upscaling threshold configuration. If the load
     *        exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBasedAutoScalingRequest withUpScaling(AutoScalingThresholds upScaling) {
        setUpScaling(upScaling);
        return this;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load falls
     * below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
     * </p>
     * 
     * @param downScaling
     *        An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load
     *        falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number
     *        of instances.
     */

    public void setDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load falls
     * below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
     * </p>
     * 
     * @return An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load
     *         falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number
     *         of instances.
     */

    public AutoScalingThresholds getDownScaling() {
        return this.downScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load falls
     * below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
     * </p>
     * 
     * @param downScaling
     *        An <code>AutoScalingThresholds</code> object with the downscaling threshold configuration. If the load
     *        falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number
     *        of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBasedAutoScalingRequest withDownScaling(AutoScalingThresholds downScaling) {
        setDownScaling(downScaling);
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
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId()).append(",");
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getUpScaling() != null)
            sb.append("UpScaling: ").append(getUpScaling()).append(",");
        if (getDownScaling() != null)
            sb.append("DownScaling: ").append(getDownScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBasedAutoScalingRequest == false)
            return false;
        SetLoadBasedAutoScalingRequest other = (SetLoadBasedAutoScalingRequest) obj;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getUpScaling() == null ^ this.getUpScaling() == null)
            return false;
        if (other.getUpScaling() != null && other.getUpScaling().equals(this.getUpScaling()) == false)
            return false;
        if (other.getDownScaling() == null ^ this.getDownScaling() == null)
            return false;
        if (other.getDownScaling() != null && other.getDownScaling().equals(this.getDownScaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getUpScaling() == null) ? 0 : getUpScaling().hashCode());
        hashCode = prime * hashCode + ((getDownScaling() == null) ? 0 : getDownScaling().hashCode());
        return hashCode;
    }

    @Override
    public SetLoadBasedAutoScalingRequest clone() {
        return (SetLoadBasedAutoScalingRequest) super.clone();
    }

}
