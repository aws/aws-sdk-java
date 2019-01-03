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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains details about a workflow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionDetail extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the workflow execution.
     * </p>
     */
    private WorkflowExecutionInfo executionInfo;
    /**
     * <p>
     * The configuration settings for this workflow execution including timeout values, tasklist etc.
     * </p>
     */
    private WorkflowExecutionConfiguration executionConfiguration;
    /**
     * <p>
     * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     * </p>
     */
    private WorkflowExecutionOpenCounts openCounts;
    /**
     * <p>
     * The time when the last activity task was scheduled for this workflow execution. You can use this information to
     * determine if the workflow has not made progress for an unusually long period of time and might require a
     * corrective action.
     * </p>
     */
    private java.util.Date latestActivityTaskTimestamp;
    /**
     * <p>
     * The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     * executionContext (a free-form string) when closing a decision task using <a>RespondDecisionTaskCompleted</a>.
     * </p>
     */
    private String latestExecutionContext;

    /**
     * <p>
     * Information about the workflow execution.
     * </p>
     * 
     * @param executionInfo
     *        Information about the workflow execution.
     */

    public void setExecutionInfo(WorkflowExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }

    /**
     * <p>
     * Information about the workflow execution.
     * </p>
     * 
     * @return Information about the workflow execution.
     */

    public WorkflowExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * <p>
     * Information about the workflow execution.
     * </p>
     * 
     * @param executionInfo
     *        Information about the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionDetail withExecutionInfo(WorkflowExecutionInfo executionInfo) {
        setExecutionInfo(executionInfo);
        return this;
    }

    /**
     * <p>
     * The configuration settings for this workflow execution including timeout values, tasklist etc.
     * </p>
     * 
     * @param executionConfiguration
     *        The configuration settings for this workflow execution including timeout values, tasklist etc.
     */

    public void setExecutionConfiguration(WorkflowExecutionConfiguration executionConfiguration) {
        this.executionConfiguration = executionConfiguration;
    }

    /**
     * <p>
     * The configuration settings for this workflow execution including timeout values, tasklist etc.
     * </p>
     * 
     * @return The configuration settings for this workflow execution including timeout values, tasklist etc.
     */

    public WorkflowExecutionConfiguration getExecutionConfiguration() {
        return this.executionConfiguration;
    }

    /**
     * <p>
     * The configuration settings for this workflow execution including timeout values, tasklist etc.
     * </p>
     * 
     * @param executionConfiguration
     *        The configuration settings for this workflow execution including timeout values, tasklist etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionDetail withExecutionConfiguration(WorkflowExecutionConfiguration executionConfiguration) {
        setExecutionConfiguration(executionConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     * </p>
     * 
     * @param openCounts
     *        The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     */

    public void setOpenCounts(WorkflowExecutionOpenCounts openCounts) {
        this.openCounts = openCounts;
    }

    /**
     * <p>
     * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     * </p>
     * 
     * @return The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     */

    public WorkflowExecutionOpenCounts getOpenCounts() {
        return this.openCounts;
    }

    /**
     * <p>
     * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     * </p>
     * 
     * @param openCounts
     *        The number of tasks for this workflow execution. This includes open and closed tasks of all types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionDetail withOpenCounts(WorkflowExecutionOpenCounts openCounts) {
        setOpenCounts(openCounts);
        return this;
    }

    /**
     * <p>
     * The time when the last activity task was scheduled for this workflow execution. You can use this information to
     * determine if the workflow has not made progress for an unusually long period of time and might require a
     * corrective action.
     * </p>
     * 
     * @param latestActivityTaskTimestamp
     *        The time when the last activity task was scheduled for this workflow execution. You can use this
     *        information to determine if the workflow has not made progress for an unusually long period of time and
     *        might require a corrective action.
     */

    public void setLatestActivityTaskTimestamp(java.util.Date latestActivityTaskTimestamp) {
        this.latestActivityTaskTimestamp = latestActivityTaskTimestamp;
    }

    /**
     * <p>
     * The time when the last activity task was scheduled for this workflow execution. You can use this information to
     * determine if the workflow has not made progress for an unusually long period of time and might require a
     * corrective action.
     * </p>
     * 
     * @return The time when the last activity task was scheduled for this workflow execution. You can use this
     *         information to determine if the workflow has not made progress for an unusually long period of time and
     *         might require a corrective action.
     */

    public java.util.Date getLatestActivityTaskTimestamp() {
        return this.latestActivityTaskTimestamp;
    }

    /**
     * <p>
     * The time when the last activity task was scheduled for this workflow execution. You can use this information to
     * determine if the workflow has not made progress for an unusually long period of time and might require a
     * corrective action.
     * </p>
     * 
     * @param latestActivityTaskTimestamp
     *        The time when the last activity task was scheduled for this workflow execution. You can use this
     *        information to determine if the workflow has not made progress for an unusually long period of time and
     *        might require a corrective action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionDetail withLatestActivityTaskTimestamp(java.util.Date latestActivityTaskTimestamp) {
        setLatestActivityTaskTimestamp(latestActivityTaskTimestamp);
        return this;
    }

    /**
     * <p>
     * The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     * executionContext (a free-form string) when closing a decision task using <a>RespondDecisionTaskCompleted</a>.
     * </p>
     * 
     * @param latestExecutionContext
     *        The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     *        executionContext (a free-form string) when closing a decision task using
     *        <a>RespondDecisionTaskCompleted</a>.
     */

    public void setLatestExecutionContext(String latestExecutionContext) {
        this.latestExecutionContext = latestExecutionContext;
    }

    /**
     * <p>
     * The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     * executionContext (a free-form string) when closing a decision task using <a>RespondDecisionTaskCompleted</a>.
     * </p>
     * 
     * @return The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     *         executionContext (a free-form string) when closing a decision task using
     *         <a>RespondDecisionTaskCompleted</a>.
     */

    public String getLatestExecutionContext() {
        return this.latestExecutionContext;
    }

    /**
     * <p>
     * The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     * executionContext (a free-form string) when closing a decision task using <a>RespondDecisionTaskCompleted</a>.
     * </p>
     * 
     * @param latestExecutionContext
     *        The latest executionContext provided by the decider for this workflow execution. A decider can provide an
     *        executionContext (a free-form string) when closing a decision task using
     *        <a>RespondDecisionTaskCompleted</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionDetail withLatestExecutionContext(String latestExecutionContext) {
        setLatestExecutionContext(latestExecutionContext);
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
        if (getExecutionInfo() != null)
            sb.append("ExecutionInfo: ").append(getExecutionInfo()).append(",");
        if (getExecutionConfiguration() != null)
            sb.append("ExecutionConfiguration: ").append(getExecutionConfiguration()).append(",");
        if (getOpenCounts() != null)
            sb.append("OpenCounts: ").append(getOpenCounts()).append(",");
        if (getLatestActivityTaskTimestamp() != null)
            sb.append("LatestActivityTaskTimestamp: ").append(getLatestActivityTaskTimestamp()).append(",");
        if (getLatestExecutionContext() != null)
            sb.append("LatestExecutionContext: ").append(getLatestExecutionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionDetail == false)
            return false;
        WorkflowExecutionDetail other = (WorkflowExecutionDetail) obj;
        if (other.getExecutionInfo() == null ^ this.getExecutionInfo() == null)
            return false;
        if (other.getExecutionInfo() != null && other.getExecutionInfo().equals(this.getExecutionInfo()) == false)
            return false;
        if (other.getExecutionConfiguration() == null ^ this.getExecutionConfiguration() == null)
            return false;
        if (other.getExecutionConfiguration() != null && other.getExecutionConfiguration().equals(this.getExecutionConfiguration()) == false)
            return false;
        if (other.getOpenCounts() == null ^ this.getOpenCounts() == null)
            return false;
        if (other.getOpenCounts() != null && other.getOpenCounts().equals(this.getOpenCounts()) == false)
            return false;
        if (other.getLatestActivityTaskTimestamp() == null ^ this.getLatestActivityTaskTimestamp() == null)
            return false;
        if (other.getLatestActivityTaskTimestamp() != null && other.getLatestActivityTaskTimestamp().equals(this.getLatestActivityTaskTimestamp()) == false)
            return false;
        if (other.getLatestExecutionContext() == null ^ this.getLatestExecutionContext() == null)
            return false;
        if (other.getLatestExecutionContext() != null && other.getLatestExecutionContext().equals(this.getLatestExecutionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionInfo() == null) ? 0 : getExecutionInfo().hashCode());
        hashCode = prime * hashCode + ((getExecutionConfiguration() == null) ? 0 : getExecutionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOpenCounts() == null) ? 0 : getOpenCounts().hashCode());
        hashCode = prime * hashCode + ((getLatestActivityTaskTimestamp() == null) ? 0 : getLatestActivityTaskTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestExecutionContext() == null) ? 0 : getLatestExecutionContext().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionDetail clone() {
        try {
            return (WorkflowExecutionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
