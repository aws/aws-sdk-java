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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an action that Batch will take after the job has remained at the head of the queue in the specified state
 * for longer than the specified time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobStateTimeLimitAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobStateTimeLimitAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason to log for the action being taken.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The approximate amount of time, in seconds, that must pass with the job in the specified state before the action
     * is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     * </p>
     */
    private Integer maxTimeSeconds;
    /**
     * <p>
     * The action to take when a job is at the head of the job queue in the specified state for the specified period of
     * time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The reason to log for the action being taken.
     * </p>
     * 
     * @param reason
     *        The reason to log for the action being taken.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason to log for the action being taken.
     * </p>
     * 
     * @return The reason to log for the action being taken.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason to log for the action being taken.
     * </p>
     * 
     * @param reason
     *        The reason to log for the action being taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStateTimeLimitAction withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * </p>
     * 
     * @param state
     *        The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * @see JobStateTimeLimitActionsState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * </p>
     * 
     * @return The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * @see JobStateTimeLimitActionsState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * </p>
     * 
     * @param state
     *        The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStateTimeLimitActionsState
     */

    public JobStateTimeLimitAction withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * </p>
     * 
     * @param state
     *        The state of the job needed to trigger the action. The only supported value is <code>RUNNABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStateTimeLimitActionsState
     */

    public JobStateTimeLimitAction withState(JobStateTimeLimitActionsState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, that must pass with the job in the specified state before the action
     * is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     * </p>
     * 
     * @param maxTimeSeconds
     *        The approximate amount of time, in seconds, that must pass with the job in the specified state before the
     *        action is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     */

    public void setMaxTimeSeconds(Integer maxTimeSeconds) {
        this.maxTimeSeconds = maxTimeSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, that must pass with the job in the specified state before the action
     * is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     * </p>
     * 
     * @return The approximate amount of time, in seconds, that must pass with the job in the specified state before the
     *         action is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     */

    public Integer getMaxTimeSeconds() {
        return this.maxTimeSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, that must pass with the job in the specified state before the action
     * is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     * </p>
     * 
     * @param maxTimeSeconds
     *        The approximate amount of time, in seconds, that must pass with the job in the specified state before the
     *        action is taken. The minimum value is 600 (10 minutes) and the maximum value is 86,400 (24 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStateTimeLimitAction withMaxTimeSeconds(Integer maxTimeSeconds) {
        setMaxTimeSeconds(maxTimeSeconds);
        return this;
    }

    /**
     * <p>
     * The action to take when a job is at the head of the job queue in the specified state for the specified period of
     * time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * </p>
     * 
     * @param action
     *        The action to take when a job is at the head of the job queue in the specified state for the specified
     *        period of time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * @see JobStateTimeLimitActionsAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take when a job is at the head of the job queue in the specified state for the specified period of
     * time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * </p>
     * 
     * @return The action to take when a job is at the head of the job queue in the specified state for the specified
     *         period of time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * @see JobStateTimeLimitActionsAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take when a job is at the head of the job queue in the specified state for the specified period of
     * time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * </p>
     * 
     * @param action
     *        The action to take when a job is at the head of the job queue in the specified state for the specified
     *        period of time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStateTimeLimitActionsAction
     */

    public JobStateTimeLimitAction withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to take when a job is at the head of the job queue in the specified state for the specified period of
     * time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * </p>
     * 
     * @param action
     *        The action to take when a job is at the head of the job queue in the specified state for the specified
     *        period of time. The only supported value is <code>CANCEL</code>, which will cancel the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStateTimeLimitActionsAction
     */

    public JobStateTimeLimitAction withAction(JobStateTimeLimitActionsAction action) {
        this.action = action.toString();
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getMaxTimeSeconds() != null)
            sb.append("MaxTimeSeconds: ").append(getMaxTimeSeconds()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobStateTimeLimitAction == false)
            return false;
        JobStateTimeLimitAction other = (JobStateTimeLimitAction) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMaxTimeSeconds() == null ^ this.getMaxTimeSeconds() == null)
            return false;
        if (other.getMaxTimeSeconds() != null && other.getMaxTimeSeconds().equals(this.getMaxTimeSeconds()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMaxTimeSeconds() == null) ? 0 : getMaxTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public JobStateTimeLimitAction clone() {
        try {
            return (JobStateTimeLimitAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobStateTimeLimitActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
