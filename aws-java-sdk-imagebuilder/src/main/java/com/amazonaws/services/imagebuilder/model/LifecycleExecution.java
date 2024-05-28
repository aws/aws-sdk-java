/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata from a runtime instance of a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecycleExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the lifecycle policy runtime instance.
     * </p>
     */
    private String lifecycleExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     * </p>
     */
    private String lifecyclePolicyArn;
    /**
     * <p>
     * Contains information about associated resources that are identified for action by the runtime instance of the
     * lifecycle policy.
     * </p>
     */
    private LifecycleExecutionResourcesImpactedSummary resourcesImpactedSummary;
    /**
     * <p>
     * Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     * </p>
     */
    private LifecycleExecutionState state;
    /**
     * <p>
     * The timestamp when the lifecycle runtime instance started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp when the lifecycle runtime instance completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Identifies the lifecycle policy runtime instance.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Identifies the lifecycle policy runtime instance.
     */

    public void setLifecycleExecutionId(String lifecycleExecutionId) {
        this.lifecycleExecutionId = lifecycleExecutionId;
    }

    /**
     * <p>
     * Identifies the lifecycle policy runtime instance.
     * </p>
     * 
     * @return Identifies the lifecycle policy runtime instance.
     */

    public String getLifecycleExecutionId() {
        return this.lifecycleExecutionId;
    }

    /**
     * <p>
     * Identifies the lifecycle policy runtime instance.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Identifies the lifecycle policy runtime instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withLifecycleExecutionId(String lifecycleExecutionId) {
        setLifecycleExecutionId(lifecycleExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     */

    public void setLifecyclePolicyArn(String lifecyclePolicyArn) {
        this.lifecyclePolicyArn = lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     */

    public String getLifecyclePolicyArn() {
        return this.lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withLifecyclePolicyArn(String lifecyclePolicyArn) {
        setLifecyclePolicyArn(lifecyclePolicyArn);
        return this;
    }

    /**
     * <p>
     * Contains information about associated resources that are identified for action by the runtime instance of the
     * lifecycle policy.
     * </p>
     * 
     * @param resourcesImpactedSummary
     *        Contains information about associated resources that are identified for action by the runtime instance of
     *        the lifecycle policy.
     */

    public void setResourcesImpactedSummary(LifecycleExecutionResourcesImpactedSummary resourcesImpactedSummary) {
        this.resourcesImpactedSummary = resourcesImpactedSummary;
    }

    /**
     * <p>
     * Contains information about associated resources that are identified for action by the runtime instance of the
     * lifecycle policy.
     * </p>
     * 
     * @return Contains information about associated resources that are identified for action by the runtime instance of
     *         the lifecycle policy.
     */

    public LifecycleExecutionResourcesImpactedSummary getResourcesImpactedSummary() {
        return this.resourcesImpactedSummary;
    }

    /**
     * <p>
     * Contains information about associated resources that are identified for action by the runtime instance of the
     * lifecycle policy.
     * </p>
     * 
     * @param resourcesImpactedSummary
     *        Contains information about associated resources that are identified for action by the runtime instance of
     *        the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withResourcesImpactedSummary(LifecycleExecutionResourcesImpactedSummary resourcesImpactedSummary) {
        setResourcesImpactedSummary(resourcesImpactedSummary);
        return this;
    }

    /**
     * <p>
     * Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     * </p>
     * 
     * @param state
     *        Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     */

    public void setState(LifecycleExecutionState state) {
        this.state = state;
    }

    /**
     * <p>
     * Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     * </p>
     * 
     * @return Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     */

    public LifecycleExecutionState getState() {
        return this.state;
    }

    /**
     * <p>
     * Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     * </p>
     * 
     * @param state
     *        Runtime state that reports if the policy action ran successfully, failed, or was skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withState(LifecycleExecutionState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the lifecycle runtime instance started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance started.
     * </p>
     * 
     * @return The timestamp when the lifecycle runtime instance started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the lifecycle runtime instance started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance completed.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the lifecycle runtime instance completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance completed.
     * </p>
     * 
     * @return The timestamp when the lifecycle runtime instance completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when the lifecycle runtime instance completed.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the lifecycle runtime instance completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecution withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getLifecycleExecutionId() != null)
            sb.append("LifecycleExecutionId: ").append(getLifecycleExecutionId()).append(",");
        if (getLifecyclePolicyArn() != null)
            sb.append("LifecyclePolicyArn: ").append(getLifecyclePolicyArn()).append(",");
        if (getResourcesImpactedSummary() != null)
            sb.append("ResourcesImpactedSummary: ").append(getResourcesImpactedSummary()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleExecution == false)
            return false;
        LifecycleExecution other = (LifecycleExecution) obj;
        if (other.getLifecycleExecutionId() == null ^ this.getLifecycleExecutionId() == null)
            return false;
        if (other.getLifecycleExecutionId() != null && other.getLifecycleExecutionId().equals(this.getLifecycleExecutionId()) == false)
            return false;
        if (other.getLifecyclePolicyArn() == null ^ this.getLifecyclePolicyArn() == null)
            return false;
        if (other.getLifecyclePolicyArn() != null && other.getLifecyclePolicyArn().equals(this.getLifecyclePolicyArn()) == false)
            return false;
        if (other.getResourcesImpactedSummary() == null ^ this.getResourcesImpactedSummary() == null)
            return false;
        if (other.getResourcesImpactedSummary() != null && other.getResourcesImpactedSummary().equals(this.getResourcesImpactedSummary()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleExecutionId() == null) ? 0 : getLifecycleExecutionId().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyArn() == null) ? 0 : getLifecyclePolicyArn().hashCode());
        hashCode = prime * hashCode + ((getResourcesImpactedSummary() == null) ? 0 : getResourcesImpactedSummary().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleExecution clone() {
        try {
            return (LifecycleExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecycleExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
