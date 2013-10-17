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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest) SetLoadBasedAutoScaling operation}.
 * <p>
 * Specify the load-based auto scaling configuration for a specified layer. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances
 * </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the
 * instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest)
 */
public class SetLoadBasedAutoScalingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The layer ID.
     */
    private String layerId;

    /**
     * Enables load-based auto scaling for the layer.
     */
    private Boolean enable;

    /**
     * An <code>AutoScalingThresholds</code> object with the upscaling
     * threshold configuration. If the load exceeds these thresholds for a
     * specified amount of time, AWS OpsWorks starts a specified number of
     * instances.
     */
    private AutoScalingThresholds upScaling;

    /**
     * An <code>AutoScalingThresholds</code> object with the downscaling
     * threshold configuration. If the load falls below these thresholds for
     * a specified amount of time, AWS OpsWorks stops a specified number of
     * instances.
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
    public SetLoadBasedAutoScalingRequest withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * Enables load-based auto scaling for the layer.
     *
     * @return Enables load-based auto scaling for the layer.
     */
    public Boolean isEnable() {
        return enable;
    }
    
    /**
     * Enables load-based auto scaling for the layer.
     *
     * @param enable Enables load-based auto scaling for the layer.
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
    
    /**
     * Enables load-based auto scaling for the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enable Enables load-based auto scaling for the layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBasedAutoScalingRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Enables load-based auto scaling for the layer.
     *
     * @return Enables load-based auto scaling for the layer.
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * An <code>AutoScalingThresholds</code> object with the upscaling
     * threshold configuration. If the load exceeds these thresholds for a
     * specified amount of time, AWS OpsWorks starts a specified number of
     * instances.
     *
     * @return An <code>AutoScalingThresholds</code> object with the upscaling
     *         threshold configuration. If the load exceeds these thresholds for a
     *         specified amount of time, AWS OpsWorks starts a specified number of
     *         instances.
     */
    public AutoScalingThresholds getUpScaling() {
        return upScaling;
    }
    
    /**
     * An <code>AutoScalingThresholds</code> object with the upscaling
     * threshold configuration. If the load exceeds these thresholds for a
     * specified amount of time, AWS OpsWorks starts a specified number of
     * instances.
     *
     * @param upScaling An <code>AutoScalingThresholds</code> object with the upscaling
     *         threshold configuration. If the load exceeds these thresholds for a
     *         specified amount of time, AWS OpsWorks starts a specified number of
     *         instances.
     */
    public void setUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
    }
    
    /**
     * An <code>AutoScalingThresholds</code> object with the upscaling
     * threshold configuration. If the load exceeds these thresholds for a
     * specified amount of time, AWS OpsWorks starts a specified number of
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param upScaling An <code>AutoScalingThresholds</code> object with the upscaling
     *         threshold configuration. If the load exceeds these thresholds for a
     *         specified amount of time, AWS OpsWorks starts a specified number of
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBasedAutoScalingRequest withUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
        return this;
    }

    /**
     * An <code>AutoScalingThresholds</code> object with the downscaling
     * threshold configuration. If the load falls below these thresholds for
     * a specified amount of time, AWS OpsWorks stops a specified number of
     * instances.
     *
     * @return An <code>AutoScalingThresholds</code> object with the downscaling
     *         threshold configuration. If the load falls below these thresholds for
     *         a specified amount of time, AWS OpsWorks stops a specified number of
     *         instances.
     */
    public AutoScalingThresholds getDownScaling() {
        return downScaling;
    }
    
    /**
     * An <code>AutoScalingThresholds</code> object with the downscaling
     * threshold configuration. If the load falls below these thresholds for
     * a specified amount of time, AWS OpsWorks stops a specified number of
     * instances.
     *
     * @param downScaling An <code>AutoScalingThresholds</code> object with the downscaling
     *         threshold configuration. If the load falls below these thresholds for
     *         a specified amount of time, AWS OpsWorks stops a specified number of
     *         instances.
     */
    public void setDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
    }
    
    /**
     * An <code>AutoScalingThresholds</code> object with the downscaling
     * threshold configuration. If the load falls below these thresholds for
     * a specified amount of time, AWS OpsWorks stops a specified number of
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param downScaling An <code>AutoScalingThresholds</code> object with the downscaling
     *         threshold configuration. If the load falls below these thresholds for
     *         a specified amount of time, AWS OpsWorks stops a specified number of
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBasedAutoScalingRequest withDownScaling(AutoScalingThresholds downScaling) {
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

        if (obj instanceof SetLoadBasedAutoScalingRequest == false) return false;
        SetLoadBasedAutoScalingRequest other = (SetLoadBasedAutoScalingRequest)obj;
        
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
    