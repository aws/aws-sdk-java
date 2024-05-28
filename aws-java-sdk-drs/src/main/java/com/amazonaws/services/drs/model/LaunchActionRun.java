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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch action run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LaunchActionRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchActionRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Action.
     * </p>
     */
    private LaunchAction action;
    /**
     * <p>
     * Failure reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Run Id.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * Run status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Action.
     * </p>
     * 
     * @param action
     *        Action.
     */

    public void setAction(LaunchAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Action.
     * </p>
     * 
     * @return Action.
     */

    public LaunchAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Action.
     * </p>
     * 
     * @param action
     *        Action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionRun withAction(LaunchAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Failure reason.
     * </p>
     * 
     * @param failureReason
     *        Failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Failure reason.
     * </p>
     * 
     * @return Failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Failure reason.
     * </p>
     * 
     * @param failureReason
     *        Failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionRun withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Run Id.
     * </p>
     * 
     * @param runId
     *        Run Id.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * Run Id.
     * </p>
     * 
     * @return Run Id.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * Run Id.
     * </p>
     * 
     * @param runId
     *        Run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionRun withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * Run status.
     * </p>
     * 
     * @param status
     *        Run status.
     * @see LaunchActionRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Run status.
     * </p>
     * 
     * @return Run status.
     * @see LaunchActionRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Run status.
     * </p>
     * 
     * @param status
     *        Run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionRunStatus
     */

    public LaunchActionRun withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Run status.
     * </p>
     * 
     * @param status
     *        Run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionRunStatus
     */

    public LaunchActionRun withStatus(LaunchActionRunStatus status) {
        this.status = status.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchActionRun == false)
            return false;
        LaunchActionRun other = (LaunchActionRun) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LaunchActionRun clone() {
        try {
            return (LaunchActionRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LaunchActionRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
