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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specification of the status of a CancelSteps request. Available only in Amazon EMR version 4.8.0 and later, excluding
 * version 5.0.0.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelStepsInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelStepsInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     * 
     * @param stepId
     *        The encrypted StepId of a step.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     * 
     * @return The encrypted StepId of a step.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     * 
     * @param stepId
     *        The encrypted StepId of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsInfo withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     * 
     * @param status
     *        The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * @see CancelStepsRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     * 
     * @return The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * @see CancelStepsRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     * 
     * @param status
     *        The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancelStepsRequestStatus
     */

    public CancelStepsInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     * 
     * @param status
     *        The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * @see CancelStepsRequestStatus
     */

    public void setStatus(CancelStepsRequestStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * </p>
     * 
     * @param status
     *        The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancelStepsRequestStatus
     */

    public CancelStepsInfo withStatus(CancelStepsRequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     * 
     * @param reason
     *        The reason for the failure if the CancelSteps request fails.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     * 
     * @return The reason for the failure if the CancelSteps request fails.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     * 
     * @param reason
     *        The reason for the failure if the CancelSteps request fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsInfo withReason(String reason) {
        setReason(reason);
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
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStepsInfo == false)
            return false;
        CancelStepsInfo other = (CancelStepsInfo) obj;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public CancelStepsInfo clone() {
        try {
            return (CancelStepsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.CancelStepsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
