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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPlan implements Serializable, Cloneable, StructuredPojo {

    private String scalingPlanName;

    private Long scalingPlanVersion;

    private ApplicationSource applicationSource;

    private java.util.List<ScalingInstruction> scalingInstructions;

    private String statusCode;

    private String statusMessage;

    private java.util.Date creationTime;

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

    public ScalingPlan withScalingPlanName(String scalingPlanName) {
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

    public ScalingPlan withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

    /**
     * @param applicationSource
     */

    public void setApplicationSource(ApplicationSource applicationSource) {
        this.applicationSource = applicationSource;
    }

    /**
     * @return
     */

    public ApplicationSource getApplicationSource() {
        return this.applicationSource;
    }

    /**
     * @param applicationSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withApplicationSource(ApplicationSource applicationSource) {
        setApplicationSource(applicationSource);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ScalingInstruction> getScalingInstructions() {
        return scalingInstructions;
    }

    /**
     * @param scalingInstructions
     */

    public void setScalingInstructions(java.util.Collection<ScalingInstruction> scalingInstructions) {
        if (scalingInstructions == null) {
            this.scalingInstructions = null;
            return;
        }

        this.scalingInstructions = new java.util.ArrayList<ScalingInstruction>(scalingInstructions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingInstructions(java.util.Collection)} or {@link #withScalingInstructions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scalingInstructions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingInstructions(ScalingInstruction... scalingInstructions) {
        if (this.scalingInstructions == null) {
            setScalingInstructions(new java.util.ArrayList<ScalingInstruction>(scalingInstructions.length));
        }
        for (ScalingInstruction ele : scalingInstructions) {
            this.scalingInstructions.add(ele);
        }
        return this;
    }

    /**
     * @param scalingInstructions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingInstructions(java.util.Collection<ScalingInstruction> scalingInstructions) {
        setScalingInstructions(scalingInstructions);
        return this;
    }

    /**
     * @param statusCode
     * @see ScalingPlanStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return
     * @see ScalingPlanStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @param statusCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPlanStatusCode
     */

    public ScalingPlan withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * @param statusCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPlanStatusCode
     */

    public ScalingPlan withStatusCode(ScalingPlanStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * @param statusMessage
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * @return
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @param statusMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getApplicationSource() != null)
            sb.append("ApplicationSource: ").append(getApplicationSource()).append(",");
        if (getScalingInstructions() != null)
            sb.append("ScalingInstructions: ").append(getScalingInstructions()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPlan == false)
            return false;
        ScalingPlan other = (ScalingPlan) obj;
        if (other.getScalingPlanName() == null ^ this.getScalingPlanName() == null)
            return false;
        if (other.getScalingPlanName() != null && other.getScalingPlanName().equals(this.getScalingPlanName()) == false)
            return false;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
        if (other.getApplicationSource() == null ^ this.getApplicationSource() == null)
            return false;
        if (other.getApplicationSource() != null && other.getApplicationSource().equals(this.getApplicationSource()) == false)
            return false;
        if (other.getScalingInstructions() == null ^ this.getScalingInstructions() == null)
            return false;
        if (other.getScalingInstructions() != null && other.getScalingInstructions().equals(this.getScalingInstructions()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingPlanName() == null) ? 0 : getScalingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        hashCode = prime * hashCode + ((getApplicationSource() == null) ? 0 : getApplicationSource().hashCode());
        hashCode = prime * hashCode + ((getScalingInstructions() == null) ? 0 : getScalingInstructions().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPlan clone() {
        try {
            return (ScalingPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
