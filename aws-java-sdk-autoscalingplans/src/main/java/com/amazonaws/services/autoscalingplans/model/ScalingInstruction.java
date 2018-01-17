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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingInstruction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingInstruction implements Serializable, Cloneable, StructuredPojo {

    private String serviceNamespace;

    private String resourceId;

    private String scalableDimension;

    private Integer minCapacity;

    private Integer maxCapacity;

    private java.util.List<TargetTrackingConfiguration> targetTrackingConfigurations;

    /**
     * @param serviceNamespace
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * @return
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * @param serviceNamespace
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingInstruction withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * @param serviceNamespace
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingInstruction withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * @param resourceId
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * @param scalableDimension
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * @return
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * @param scalableDimension
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingInstruction withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * @param scalableDimension
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingInstruction withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * @param minCapacity
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * @return
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * @param minCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * @param maxCapacity
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * @param maxCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<TargetTrackingConfiguration> getTargetTrackingConfigurations() {
        return targetTrackingConfigurations;
    }

    /**
     * @param targetTrackingConfigurations
     */

    public void setTargetTrackingConfigurations(java.util.Collection<TargetTrackingConfiguration> targetTrackingConfigurations) {
        if (targetTrackingConfigurations == null) {
            this.targetTrackingConfigurations = null;
            return;
        }

        this.targetTrackingConfigurations = new java.util.ArrayList<TargetTrackingConfiguration>(targetTrackingConfigurations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTrackingConfigurations(java.util.Collection)} or
     * {@link #withTargetTrackingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetTrackingConfigurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withTargetTrackingConfigurations(TargetTrackingConfiguration... targetTrackingConfigurations) {
        if (this.targetTrackingConfigurations == null) {
            setTargetTrackingConfigurations(new java.util.ArrayList<TargetTrackingConfiguration>(targetTrackingConfigurations.length));
        }
        for (TargetTrackingConfiguration ele : targetTrackingConfigurations) {
            this.targetTrackingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * @param targetTrackingConfigurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withTargetTrackingConfigurations(java.util.Collection<TargetTrackingConfiguration> targetTrackingConfigurations) {
        setTargetTrackingConfigurations(targetTrackingConfigurations);
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: ").append(getScalableDimension()).append(",");
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getTargetTrackingConfigurations() != null)
            sb.append("TargetTrackingConfigurations: ").append(getTargetTrackingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingInstruction == false)
            return false;
        ScalingInstruction other = (ScalingInstruction) obj;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getTargetTrackingConfigurations() == null ^ this.getTargetTrackingConfigurations() == null)
            return false;
        if (other.getTargetTrackingConfigurations() != null && other.getTargetTrackingConfigurations().equals(this.getTargetTrackingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfigurations() == null) ? 0 : getTargetTrackingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ScalingInstruction clone() {
        try {
            return (ScalingInstruction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingInstructionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
