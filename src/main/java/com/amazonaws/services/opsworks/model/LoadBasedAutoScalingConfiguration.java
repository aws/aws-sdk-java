/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a layer's load-based auto scaling configuration.
 * </p>
 */
public class LoadBasedAutoScalingConfiguration implements Serializable {

    /**
     * The layer ID.
     */
    private String layerId;

    /**
     * Whether load-based auto scaling is enabled for the layer.
     */
    private Boolean enable;

    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the upscaling configuration, which defines how and when AWS OpsWorks
     * increases the number of instances.
     */
    private AutoScalingThresholds upScaling;

    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the downscaling configuration, which defines how and when AWS OpsWorks
     * reduces the number of instances.
     */
    private AutoScalingThresholds downScaling;

    /**
     * The layer ID.
     *
     * @return The layer ID.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * The layer ID.
     *
     * @param layerId The layer ID.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * The layer ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId The layer ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBasedAutoScalingConfiguration withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * Whether load-based auto scaling is enabled for the layer.
     *
     * @return Whether load-based auto scaling is enabled for the layer.
     */
    public Boolean isEnable() {
        return enable;
    }
    
    /**
     * Whether load-based auto scaling is enabled for the layer.
     *
     * @param enable Whether load-based auto scaling is enabled for the layer.
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
    
    /**
     * Whether load-based auto scaling is enabled for the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enable Whether load-based auto scaling is enabled for the layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBasedAutoScalingConfiguration withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Whether load-based auto scaling is enabled for the layer.
     *
     * @return Whether load-based auto scaling is enabled for the layer.
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the upscaling configuration, which defines how and when AWS OpsWorks
     * increases the number of instances.
     *
     * @return A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the upscaling configuration, which defines how and when AWS OpsWorks
     *         increases the number of instances.
     */
    public AutoScalingThresholds getUpScaling() {
        return upScaling;
    }
    
    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the upscaling configuration, which defines how and when AWS OpsWorks
     * increases the number of instances.
     *
     * @param upScaling A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the upscaling configuration, which defines how and when AWS OpsWorks
     *         increases the number of instances.
     */
    public void setUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
    }
    
    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the upscaling configuration, which defines how and when AWS OpsWorks
     * increases the number of instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param upScaling A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the upscaling configuration, which defines how and when AWS OpsWorks
     *         increases the number of instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBasedAutoScalingConfiguration withUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
        return this;
    }

    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the downscaling configuration, which defines how and when AWS OpsWorks
     * reduces the number of instances.
     *
     * @return A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the downscaling configuration, which defines how and when AWS OpsWorks
     *         reduces the number of instances.
     */
    public AutoScalingThresholds getDownScaling() {
        return downScaling;
    }
    
    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the downscaling configuration, which defines how and when AWS OpsWorks
     * reduces the number of instances.
     *
     * @param downScaling A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the downscaling configuration, which defines how and when AWS OpsWorks
     *         reduces the number of instances.
     */
    public void setDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
    }
    
    /**
     * A <code>LoadBasedAutoscalingInstruction</code> object that describes
     * the downscaling configuration, which defines how and when AWS OpsWorks
     * reduces the number of instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param downScaling A <code>LoadBasedAutoscalingInstruction</code> object that describes
     *         the downscaling configuration, which defines how and when AWS OpsWorks
     *         reduces the number of instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBasedAutoScalingConfiguration withDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ",");
        if (isEnable() != null) sb.append("Enable: " + isEnable() + ",");
        if (getUpScaling() != null) sb.append("UpScaling: " + getUpScaling() + ",");
        if (getDownScaling() != null) sb.append("DownScaling: " + getDownScaling() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        hashCode = prime * hashCode + ((isEnable() == null) ? 0 : isEnable().hashCode()); 
        hashCode = prime * hashCode + ((getUpScaling() == null) ? 0 : getUpScaling().hashCode()); 
        hashCode = prime * hashCode + ((getDownScaling() == null) ? 0 : getDownScaling().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoadBasedAutoScalingConfiguration == false) return false;
        LoadBasedAutoScalingConfiguration other = (LoadBasedAutoScalingConfiguration)obj;
        
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.isEnable() == null ^ this.isEnable() == null) return false;
        if (other.isEnable() != null && other.isEnable().equals(this.isEnable()) == false) return false; 
        if (other.getUpScaling() == null ^ this.getUpScaling() == null) return false;
        if (other.getUpScaling() != null && other.getUpScaling().equals(this.getUpScaling()) == false) return false; 
        if (other.getDownScaling() == null ^ this.getDownScaling() == null) return false;
        if (other.getDownScaling() != null && other.getDownScaling().equals(this.getDownScaling()) == false) return false; 
        return true;
    }
    
}
    