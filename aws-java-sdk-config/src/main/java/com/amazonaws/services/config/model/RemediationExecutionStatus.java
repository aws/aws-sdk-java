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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of the current status of the invoked remediation action for that resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RemediationExecutionStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationExecutionStatus implements Serializable, Cloneable, StructuredPojo {

    private ResourceKey resourceKey;
    /**
     * <p>
     * ENUM of the values.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Details of every step.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationExecutionStep> stepDetails;
    /**
     * <p>
     * Start time when the remediation was executed.
     * </p>
     */
    private java.util.Date invocationTime;
    /**
     * <p>
     * The time when the remediation execution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * @param resourceKey
     */

    public void setResourceKey(ResourceKey resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * @return
     */

    public ResourceKey getResourceKey() {
        return this.resourceKey;
    }

    /**
     * @param resourceKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStatus withResourceKey(ResourceKey resourceKey) {
        setResourceKey(resourceKey);
        return this;
    }

    /**
     * <p>
     * ENUM of the values.
     * </p>
     * 
     * @param state
     *        ENUM of the values.
     * @see RemediationExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * ENUM of the values.
     * </p>
     * 
     * @return ENUM of the values.
     * @see RemediationExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * ENUM of the values.
     * </p>
     * 
     * @param state
     *        ENUM of the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationExecutionState
     */

    public RemediationExecutionStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * ENUM of the values.
     * </p>
     * 
     * @param state
     *        ENUM of the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationExecutionState
     */

    public RemediationExecutionStatus withState(RemediationExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Details of every step.
     * </p>
     * 
     * @return Details of every step.
     */

    public java.util.List<RemediationExecutionStep> getStepDetails() {
        if (stepDetails == null) {
            stepDetails = new com.amazonaws.internal.SdkInternalList<RemediationExecutionStep>();
        }
        return stepDetails;
    }

    /**
     * <p>
     * Details of every step.
     * </p>
     * 
     * @param stepDetails
     *        Details of every step.
     */

    public void setStepDetails(java.util.Collection<RemediationExecutionStep> stepDetails) {
        if (stepDetails == null) {
            this.stepDetails = null;
            return;
        }

        this.stepDetails = new com.amazonaws.internal.SdkInternalList<RemediationExecutionStep>(stepDetails);
    }

    /**
     * <p>
     * Details of every step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepDetails(java.util.Collection)} or {@link #withStepDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepDetails
     *        Details of every step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStatus withStepDetails(RemediationExecutionStep... stepDetails) {
        if (this.stepDetails == null) {
            setStepDetails(new com.amazonaws.internal.SdkInternalList<RemediationExecutionStep>(stepDetails.length));
        }
        for (RemediationExecutionStep ele : stepDetails) {
            this.stepDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of every step.
     * </p>
     * 
     * @param stepDetails
     *        Details of every step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStatus withStepDetails(java.util.Collection<RemediationExecutionStep> stepDetails) {
        setStepDetails(stepDetails);
        return this;
    }

    /**
     * <p>
     * Start time when the remediation was executed.
     * </p>
     * 
     * @param invocationTime
     *        Start time when the remediation was executed.
     */

    public void setInvocationTime(java.util.Date invocationTime) {
        this.invocationTime = invocationTime;
    }

    /**
     * <p>
     * Start time when the remediation was executed.
     * </p>
     * 
     * @return Start time when the remediation was executed.
     */

    public java.util.Date getInvocationTime() {
        return this.invocationTime;
    }

    /**
     * <p>
     * Start time when the remediation was executed.
     * </p>
     * 
     * @param invocationTime
     *        Start time when the remediation was executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStatus withInvocationTime(java.util.Date invocationTime) {
        setInvocationTime(invocationTime);
        return this;
    }

    /**
     * <p>
     * The time when the remediation execution was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the remediation execution was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the remediation execution was last updated.
     * </p>
     * 
     * @return The time when the remediation execution was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the remediation execution was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the remediation execution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationExecutionStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getResourceKey() != null)
            sb.append("ResourceKey: ").append(getResourceKey()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStepDetails() != null)
            sb.append("StepDetails: ").append(getStepDetails()).append(",");
        if (getInvocationTime() != null)
            sb.append("InvocationTime: ").append(getInvocationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationExecutionStatus == false)
            return false;
        RemediationExecutionStatus other = (RemediationExecutionStatus) obj;
        if (other.getResourceKey() == null ^ this.getResourceKey() == null)
            return false;
        if (other.getResourceKey() != null && other.getResourceKey().equals(this.getResourceKey()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStepDetails() == null ^ this.getStepDetails() == null)
            return false;
        if (other.getStepDetails() != null && other.getStepDetails().equals(this.getStepDetails()) == false)
            return false;
        if (other.getInvocationTime() == null ^ this.getInvocationTime() == null)
            return false;
        if (other.getInvocationTime() != null && other.getInvocationTime().equals(this.getInvocationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceKey() == null) ? 0 : getResourceKey().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStepDetails() == null) ? 0 : getStepDetails().hashCode());
        hashCode = prime * hashCode + ((getInvocationTime() == null) ? 0 : getInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public RemediationExecutionStatus clone() {
        try {
            return (RemediationExecutionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RemediationExecutionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
