/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a layer's load-based auto scaling configuration.
 * </p>
 */
public class LoadBasedAutoScalingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The layer ID.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * Whether load-based auto scaling is enabled for the layer.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how and
     * when AWS OpsWorks increases the number of instances.
     * </p>
     */
    private AutoScalingThresholds upScaling;
    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines how and
     * when AWS OpsWorks reduces the number of instances.
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

    public LoadBasedAutoScalingConfiguration withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * Whether load-based auto scaling is enabled for the layer.
     * </p>
     * 
     * @param enable
     *        Whether load-based auto scaling is enabled for the layer.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Whether load-based auto scaling is enabled for the layer.
     * </p>
     * 
     * @return Whether load-based auto scaling is enabled for the layer.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Whether load-based auto scaling is enabled for the layer.
     * </p>
     * 
     * @param enable
     *        Whether load-based auto scaling is enabled for the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBasedAutoScalingConfiguration withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * Whether load-based auto scaling is enabled for the layer.
     * </p>
     * 
     * @return Whether load-based auto scaling is enabled for the layer.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how and
     * when AWS OpsWorks increases the number of instances.
     * </p>
     * 
     * @param upScaling
     *        An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how
     *        and when AWS OpsWorks increases the number of instances.
     */

    public void setUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how and
     * when AWS OpsWorks increases the number of instances.
     * </p>
     * 
     * @return An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines
     *         how and when AWS OpsWorks increases the number of instances.
     */

    public AutoScalingThresholds getUpScaling() {
        return this.upScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how and
     * when AWS OpsWorks increases the number of instances.
     * </p>
     * 
     * @param upScaling
     *        An <code>AutoScalingThresholds</code> object that describes the upscaling configuration, which defines how
     *        and when AWS OpsWorks increases the number of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBasedAutoScalingConfiguration withUpScaling(AutoScalingThresholds upScaling) {
        setUpScaling(upScaling);
        return this;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines how and
     * when AWS OpsWorks reduces the number of instances.
     * </p>
     * 
     * @param downScaling
     *        An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines
     *        how and when AWS OpsWorks reduces the number of instances.
     */

    public void setDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines how and
     * when AWS OpsWorks reduces the number of instances.
     * </p>
     * 
     * @return An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines
     *         how and when AWS OpsWorks reduces the number of instances.
     */

    public AutoScalingThresholds getDownScaling() {
        return this.downScaling;
    }

    /**
     * <p>
     * An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines how and
     * when AWS OpsWorks reduces the number of instances.
     * </p>
     * 
     * @param downScaling
     *        An <code>AutoScalingThresholds</code> object that describes the downscaling configuration, which defines
     *        how and when AWS OpsWorks reduces the number of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBasedAutoScalingConfiguration withDownScaling(AutoScalingThresholds downScaling) {
        setDownScaling(downScaling);
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
        if (getLayerId() != null)
            sb.append("LayerId: " + getLayerId() + ",");
        if (getEnable() != null)
            sb.append("Enable: " + getEnable() + ",");
        if (getUpScaling() != null)
            sb.append("UpScaling: " + getUpScaling() + ",");
        if (getDownScaling() != null)
            sb.append("DownScaling: " + getDownScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBasedAutoScalingConfiguration == false)
            return false;
        LoadBasedAutoScalingConfiguration other = (LoadBasedAutoScalingConfiguration) obj;
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
    public LoadBasedAutoScalingConfiguration clone() {
        try {
            return (LoadBasedAutoScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
