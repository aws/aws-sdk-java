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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * 
 */
public class CancelStepsInfo implements Serializable, Cloneable {

    private String stepId;

    private String status;

    private String reason;

    /**
     * @param stepId
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * @return
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * @param stepId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsInfo withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * @param status
     * @see CancelStepsRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see CancelStepsRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancelStepsRequestStatus
     */

    public CancelStepsInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @see CancelStepsRequestStatus
     */

    public void setStatus(CancelStepsRequestStatus status) {
        this.status = status.toString();
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancelStepsRequestStatus
     */

    public CancelStepsInfo withStatus(CancelStepsRequestStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * @param reason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsInfo withReason(String reason) {
        setReason(reason);
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
        if (getStepId() != null)
            sb.append("StepId: " + getStepId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getReason() != null)
            sb.append("Reason: " + getReason());
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
}
