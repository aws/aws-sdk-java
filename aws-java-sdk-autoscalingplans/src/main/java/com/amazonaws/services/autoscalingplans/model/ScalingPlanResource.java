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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingPlanResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPlanResource implements Serializable, Cloneable, StructuredPojo {

    private String scalingPlanName;

    private Long scalingPlanVersion;

    private String serviceNamespace;

    private String resourceId;

    private String scalableDimension;

    private java.util.List<ScalingPolicy> scalingPolicies;

    private String scalingStatusCode;

    private String scalingStatusMessage;

    /**
     * @param scalingPlanName
     */

    public void setScalingPlanName(String scalingPlanName) {
        this.scalingPlanName = scalingPlanName;
    }

    /**
     * @return
     */

    public String getScalingPlanName() {
        return this.scalingPlanName;
    }

    /**
     * @param scalingPlanName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPlanName(String scalingPlanName) {
        setScalingPlanName(scalingPlanName);
        return this;
    }

    /**
     * @param scalingPlanVersion
     */

    public void setScalingPlanVersion(Long scalingPlanVersion) {
        this.scalingPlanVersion = scalingPlanVersion;
    }

    /**
     * @return
     */

    public Long getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     * @param scalingPlanVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

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

    public ScalingPlanResource withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * @param serviceNamespace
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingPlanResource withServiceNamespace(ServiceNamespace serviceNamespace) {
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

    public ScalingPlanResource withResourceId(String resourceId) {
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

    public ScalingPlanResource withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * @param scalableDimension
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingPlanResource withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return scalingPolicies;
    }

    /**
     * @param scalingPolicies
     */

    public void setScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new java.util.ArrayList<ScalingPolicy>(scalingPolicies);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPolicies(java.util.Collection)} or {@link #withScalingPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPolicies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPolicies(ScalingPolicy... scalingPolicies) {
        if (this.scalingPolicies == null) {
            setScalingPolicies(new java.util.ArrayList<ScalingPolicy>(scalingPolicies.length));
        }
        for (ScalingPolicy ele : scalingPolicies) {
            this.scalingPolicies.add(ele);
        }
        return this;
    }

    /**
     * @param scalingPolicies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
        return this;
    }

    /**
     * @param scalingStatusCode
     * @see ScalingStatusCode
     */

    public void setScalingStatusCode(String scalingStatusCode) {
        this.scalingStatusCode = scalingStatusCode;
    }

    /**
     * @return
     * @see ScalingStatusCode
     */

    public String getScalingStatusCode() {
        return this.scalingStatusCode;
    }

    /**
     * @param scalingStatusCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusCode
     */

    public ScalingPlanResource withScalingStatusCode(String scalingStatusCode) {
        setScalingStatusCode(scalingStatusCode);
        return this;
    }

    /**
     * @param scalingStatusCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusCode
     */

    public ScalingPlanResource withScalingStatusCode(ScalingStatusCode scalingStatusCode) {
        this.scalingStatusCode = scalingStatusCode.toString();
        return this;
    }

    /**
     * @param scalingStatusMessage
     */

    public void setScalingStatusMessage(String scalingStatusMessage) {
        this.scalingStatusMessage = scalingStatusMessage;
    }

    /**
     * @return
     */

    public String getScalingStatusMessage() {
        return this.scalingStatusMessage;
    }

    /**
     * @param scalingStatusMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingStatusMessage(String scalingStatusMessage) {
        setScalingStatusMessage(scalingStatusMessage);
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
        if (getScalingPlanName() != null)
            sb.append("ScalingPlanName: ").append(getScalingPlanName()).append(",");
        if (getScalingPlanVersion() != null)
            sb.append("ScalingPlanVersion: ").append(getScalingPlanVersion()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: ").append(getScalableDimension()).append(",");
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: ").append(getScalingPolicies()).append(",");
        if (getScalingStatusCode() != null)
            sb.append("ScalingStatusCode: ").append(getScalingStatusCode()).append(",");
        if (getScalingStatusMessage() != null)
            sb.append("ScalingStatusMessage: ").append(getScalingStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPlanResource == false)
            return false;
        ScalingPlanResource other = (ScalingPlanResource) obj;
        if (other.getScalingPlanName() == null ^ this.getScalingPlanName() == null)
            return false;
        if (other.getScalingPlanName() != null && other.getScalingPlanName().equals(this.getScalingPlanName()) == false)
            return false;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
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
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
            return false;
        if (other.getScalingStatusCode() == null ^ this.getScalingStatusCode() == null)
            return false;
        if (other.getScalingStatusCode() != null && other.getScalingStatusCode().equals(this.getScalingStatusCode()) == false)
            return false;
        if (other.getScalingStatusMessage() == null ^ this.getScalingStatusMessage() == null)
            return false;
        if (other.getScalingStatusMessage() != null && other.getScalingStatusMessage().equals(this.getScalingStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingPlanName() == null) ? 0 : getScalingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        hashCode = prime * hashCode + ((getScalingStatusCode() == null) ? 0 : getScalingStatusCode().hashCode());
        hashCode = prime * hashCode + ((getScalingStatusMessage() == null) ? 0 : getScalingStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPlanResource clone() {
        try {
            return (ScalingPlanResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingPlanResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
