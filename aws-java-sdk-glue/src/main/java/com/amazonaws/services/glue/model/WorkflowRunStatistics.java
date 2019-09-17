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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Workflow run statistics provides statistics about the workflow run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/WorkflowRunStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowRunStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     */
    private Integer totalActions;
    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     */
    private Integer timeoutActions;
    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     */
    private Integer failedActions;
    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     */
    private Integer stoppedActions;
    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     */
    private Integer succeededActions;
    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     */
    private Integer runningActions;

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     * 
     * @param totalActions
     *        Total number of Actions in the workflow run.
     */

    public void setTotalActions(Integer totalActions) {
        this.totalActions = totalActions;
    }

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     * 
     * @return Total number of Actions in the workflow run.
     */

    public Integer getTotalActions() {
        return this.totalActions;
    }

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     * 
     * @param totalActions
     *        Total number of Actions in the workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withTotalActions(Integer totalActions) {
        setTotalActions(totalActions);
        return this;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     * 
     * @param timeoutActions
     *        Total number of Actions which timed out.
     */

    public void setTimeoutActions(Integer timeoutActions) {
        this.timeoutActions = timeoutActions;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     * 
     * @return Total number of Actions which timed out.
     */

    public Integer getTimeoutActions() {
        return this.timeoutActions;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     * 
     * @param timeoutActions
     *        Total number of Actions which timed out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withTimeoutActions(Integer timeoutActions) {
        setTimeoutActions(timeoutActions);
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     * 
     * @param failedActions
     *        Total number of Actions which have failed.
     */

    public void setFailedActions(Integer failedActions) {
        this.failedActions = failedActions;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     * 
     * @return Total number of Actions which have failed.
     */

    public Integer getFailedActions() {
        return this.failedActions;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     * 
     * @param failedActions
     *        Total number of Actions which have failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withFailedActions(Integer failedActions) {
        setFailedActions(failedActions);
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     * 
     * @param stoppedActions
     *        Total number of Actions which have stopped.
     */

    public void setStoppedActions(Integer stoppedActions) {
        this.stoppedActions = stoppedActions;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     * 
     * @return Total number of Actions which have stopped.
     */

    public Integer getStoppedActions() {
        return this.stoppedActions;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     * 
     * @param stoppedActions
     *        Total number of Actions which have stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withStoppedActions(Integer stoppedActions) {
        setStoppedActions(stoppedActions);
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     * 
     * @param succeededActions
     *        Total number of Actions which have succeeded.
     */

    public void setSucceededActions(Integer succeededActions) {
        this.succeededActions = succeededActions;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     * 
     * @return Total number of Actions which have succeeded.
     */

    public Integer getSucceededActions() {
        return this.succeededActions;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     * 
     * @param succeededActions
     *        Total number of Actions which have succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withSucceededActions(Integer succeededActions) {
        setSucceededActions(succeededActions);
        return this;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     * 
     * @param runningActions
     *        Total number Actions in running state.
     */

    public void setRunningActions(Integer runningActions) {
        this.runningActions = runningActions;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     * 
     * @return Total number Actions in running state.
     */

    public Integer getRunningActions() {
        return this.runningActions;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     * 
     * @param runningActions
     *        Total number Actions in running state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRunStatistics withRunningActions(Integer runningActions) {
        setRunningActions(runningActions);
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
        if (getTotalActions() != null)
            sb.append("TotalActions: ").append(getTotalActions()).append(",");
        if (getTimeoutActions() != null)
            sb.append("TimeoutActions: ").append(getTimeoutActions()).append(",");
        if (getFailedActions() != null)
            sb.append("FailedActions: ").append(getFailedActions()).append(",");
        if (getStoppedActions() != null)
            sb.append("StoppedActions: ").append(getStoppedActions()).append(",");
        if (getSucceededActions() != null)
            sb.append("SucceededActions: ").append(getSucceededActions()).append(",");
        if (getRunningActions() != null)
            sb.append("RunningActions: ").append(getRunningActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowRunStatistics == false)
            return false;
        WorkflowRunStatistics other = (WorkflowRunStatistics) obj;
        if (other.getTotalActions() == null ^ this.getTotalActions() == null)
            return false;
        if (other.getTotalActions() != null && other.getTotalActions().equals(this.getTotalActions()) == false)
            return false;
        if (other.getTimeoutActions() == null ^ this.getTimeoutActions() == null)
            return false;
        if (other.getTimeoutActions() != null && other.getTimeoutActions().equals(this.getTimeoutActions()) == false)
            return false;
        if (other.getFailedActions() == null ^ this.getFailedActions() == null)
            return false;
        if (other.getFailedActions() != null && other.getFailedActions().equals(this.getFailedActions()) == false)
            return false;
        if (other.getStoppedActions() == null ^ this.getStoppedActions() == null)
            return false;
        if (other.getStoppedActions() != null && other.getStoppedActions().equals(this.getStoppedActions()) == false)
            return false;
        if (other.getSucceededActions() == null ^ this.getSucceededActions() == null)
            return false;
        if (other.getSucceededActions() != null && other.getSucceededActions().equals(this.getSucceededActions()) == false)
            return false;
        if (other.getRunningActions() == null ^ this.getRunningActions() == null)
            return false;
        if (other.getRunningActions() != null && other.getRunningActions().equals(this.getRunningActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalActions() == null) ? 0 : getTotalActions().hashCode());
        hashCode = prime * hashCode + ((getTimeoutActions() == null) ? 0 : getTimeoutActions().hashCode());
        hashCode = prime * hashCode + ((getFailedActions() == null) ? 0 : getFailedActions().hashCode());
        hashCode = prime * hashCode + ((getStoppedActions() == null) ? 0 : getStoppedActions().hashCode());
        hashCode = prime * hashCode + ((getSucceededActions() == null) ? 0 : getSucceededActions().hashCode());
        hashCode = prime * hashCode + ((getRunningActions() == null) ? 0 : getRunningActions().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowRunStatistics clone() {
        try {
            return (WorkflowRunStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.WorkflowRunStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
