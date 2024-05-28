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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of step dependency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StepDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step dependency status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The step ID.
     * </p>
     */
    private String stepId;

    /**
     * <p>
     * The step dependency status.
     * </p>
     * 
     * @param status
     *        The step dependency status.
     * @see DependencyConsumerResolutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The step dependency status.
     * </p>
     * 
     * @return The step dependency status.
     * @see DependencyConsumerResolutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The step dependency status.
     * </p>
     * 
     * @param status
     *        The step dependency status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DependencyConsumerResolutionStatus
     */

    public StepDependency withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The step dependency status.
     * </p>
     * 
     * @param status
     *        The step dependency status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DependencyConsumerResolutionStatus
     */

    public StepDependency withStatus(DependencyConsumerResolutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @return The step ID.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepDependency withStepId(String stepId) {
        setStepId(stepId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepDependency == false)
            return false;
        StepDependency other = (StepDependency) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        return hashCode;
    }

    @Override
    public StepDependency clone() {
        try {
            return (StepDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StepDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
