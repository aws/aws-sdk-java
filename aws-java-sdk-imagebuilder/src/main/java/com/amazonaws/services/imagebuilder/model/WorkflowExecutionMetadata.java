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
 * Metadata that includes details and status from this runtime instance of the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowExecutionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     * </p>
     */
    private String workflowBuildVersionArn;
    /**
     * <p>
     * Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a workflow.
     * </p>
     */
    private String workflowExecutionId;
    /**
     * <p>
     * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The current runtime status for this workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The runtime output message from the workflow, if applicable.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The total number of steps in the workflow. This should equal the sum of the step counts for steps that succeeded,
     * were skipped, and failed.
     * </p>
     */
    private Integer totalStepCount;
    /**
     * <p>
     * A runtime count for the number of steps in the workflow that ran successfully.
     * </p>
     */
    private Integer totalStepsSucceeded;
    /**
     * <p>
     * A runtime count for the number of steps in the workflow that failed.
     * </p>
     */
    private Integer totalStepsFailed;
    /**
     * <p>
     * A runtime count for the number of steps in the workflow that were skipped.
     * </p>
     */
    private Integer totalStepsSkipped;
    /**
     * <p>
     * The timestamp when the runtime instance of this workflow started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The timestamp when this runtime instance of the workflow finished.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The name of the test group that included the test workflow resource at runtime.
     * </p>
     */
    private String parallelGroup;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     */

    public void setWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        this.workflowBuildVersionArn = workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     */

    public String getWorkflowBuildVersionArn() {
        return this.workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the workflow resource build version that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        setWorkflowBuildVersionArn(workflowBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a
     *        workflow.
     */

    public void setWorkflowExecutionId(String workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
    }

    /**
     * <p>
     * Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a workflow.
     * </p>
     * 
     * @return Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a
     *         workflow.
     */

    public String getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    /**
     * <p>
     * Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withWorkflowExecutionId(String workflowExecutionId) {
        setWorkflowExecutionId(workflowExecutionId);
        return this;
    }

    /**
     * <p>
     * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * </p>
     * 
     * @return Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowExecutionMetadata withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowExecutionMetadata withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current runtime status for this workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for this workflow.
     * @see WorkflowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current runtime status for this workflow.
     * </p>
     * 
     * @return The current runtime status for this workflow.
     * @see WorkflowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current runtime status for this workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for this workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionStatus
     */

    public WorkflowExecutionMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current runtime status for this workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for this workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionStatus
     */

    public WorkflowExecutionMetadata withStatus(WorkflowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The runtime output message from the workflow, if applicable.
     * </p>
     * 
     * @param message
     *        The runtime output message from the workflow, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The runtime output message from the workflow, if applicable.
     * </p>
     * 
     * @return The runtime output message from the workflow, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The runtime output message from the workflow, if applicable.
     * </p>
     * 
     * @param message
     *        The runtime output message from the workflow, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The total number of steps in the workflow. This should equal the sum of the step counts for steps that succeeded,
     * were skipped, and failed.
     * </p>
     * 
     * @param totalStepCount
     *        The total number of steps in the workflow. This should equal the sum of the step counts for steps that
     *        succeeded, were skipped, and failed.
     */

    public void setTotalStepCount(Integer totalStepCount) {
        this.totalStepCount = totalStepCount;
    }

    /**
     * <p>
     * The total number of steps in the workflow. This should equal the sum of the step counts for steps that succeeded,
     * were skipped, and failed.
     * </p>
     * 
     * @return The total number of steps in the workflow. This should equal the sum of the step counts for steps that
     *         succeeded, were skipped, and failed.
     */

    public Integer getTotalStepCount() {
        return this.totalStepCount;
    }

    /**
     * <p>
     * The total number of steps in the workflow. This should equal the sum of the step counts for steps that succeeded,
     * were skipped, and failed.
     * </p>
     * 
     * @param totalStepCount
     *        The total number of steps in the workflow. This should equal the sum of the step counts for steps that
     *        succeeded, were skipped, and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withTotalStepCount(Integer totalStepCount) {
        setTotalStepCount(totalStepCount);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that ran successfully.
     * </p>
     * 
     * @param totalStepsSucceeded
     *        A runtime count for the number of steps in the workflow that ran successfully.
     */

    public void setTotalStepsSucceeded(Integer totalStepsSucceeded) {
        this.totalStepsSucceeded = totalStepsSucceeded;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that ran successfully.
     * </p>
     * 
     * @return A runtime count for the number of steps in the workflow that ran successfully.
     */

    public Integer getTotalStepsSucceeded() {
        return this.totalStepsSucceeded;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that ran successfully.
     * </p>
     * 
     * @param totalStepsSucceeded
     *        A runtime count for the number of steps in the workflow that ran successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withTotalStepsSucceeded(Integer totalStepsSucceeded) {
        setTotalStepsSucceeded(totalStepsSucceeded);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that failed.
     * </p>
     * 
     * @param totalStepsFailed
     *        A runtime count for the number of steps in the workflow that failed.
     */

    public void setTotalStepsFailed(Integer totalStepsFailed) {
        this.totalStepsFailed = totalStepsFailed;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that failed.
     * </p>
     * 
     * @return A runtime count for the number of steps in the workflow that failed.
     */

    public Integer getTotalStepsFailed() {
        return this.totalStepsFailed;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that failed.
     * </p>
     * 
     * @param totalStepsFailed
     *        A runtime count for the number of steps in the workflow that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withTotalStepsFailed(Integer totalStepsFailed) {
        setTotalStepsFailed(totalStepsFailed);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that were skipped.
     * </p>
     * 
     * @param totalStepsSkipped
     *        A runtime count for the number of steps in the workflow that were skipped.
     */

    public void setTotalStepsSkipped(Integer totalStepsSkipped) {
        this.totalStepsSkipped = totalStepsSkipped;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that were skipped.
     * </p>
     * 
     * @return A runtime count for the number of steps in the workflow that were skipped.
     */

    public Integer getTotalStepsSkipped() {
        return this.totalStepsSkipped;
    }

    /**
     * <p>
     * A runtime count for the number of steps in the workflow that were skipped.
     * </p>
     * 
     * @param totalStepsSkipped
     *        A runtime count for the number of steps in the workflow that were skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withTotalStepsSkipped(Integer totalStepsSkipped) {
        setTotalStepsSkipped(totalStepsSkipped);
        return this;
    }

    /**
     * <p>
     * The timestamp when the runtime instance of this workflow started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the runtime instance of this workflow started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the runtime instance of this workflow started.
     * </p>
     * 
     * @return The timestamp when the runtime instance of this workflow started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the runtime instance of this workflow started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the runtime instance of this workflow started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when this runtime instance of the workflow finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when this runtime instance of the workflow finished.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when this runtime instance of the workflow finished.
     * </p>
     * 
     * @return The timestamp when this runtime instance of the workflow finished.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when this runtime instance of the workflow finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when this runtime instance of the workflow finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of the test group that included the test workflow resource at runtime.
     * </p>
     * 
     * @param parallelGroup
     *        The name of the test group that included the test workflow resource at runtime.
     */

    public void setParallelGroup(String parallelGroup) {
        this.parallelGroup = parallelGroup;
    }

    /**
     * <p>
     * The name of the test group that included the test workflow resource at runtime.
     * </p>
     * 
     * @return The name of the test group that included the test workflow resource at runtime.
     */

    public String getParallelGroup() {
        return this.parallelGroup;
    }

    /**
     * <p>
     * The name of the test group that included the test workflow resource at runtime.
     * </p>
     * 
     * @param parallelGroup
     *        The name of the test group that included the test workflow resource at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionMetadata withParallelGroup(String parallelGroup) {
        setParallelGroup(parallelGroup);
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
        if (getWorkflowBuildVersionArn() != null)
            sb.append("WorkflowBuildVersionArn: ").append(getWorkflowBuildVersionArn()).append(",");
        if (getWorkflowExecutionId() != null)
            sb.append("WorkflowExecutionId: ").append(getWorkflowExecutionId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getTotalStepCount() != null)
            sb.append("TotalStepCount: ").append(getTotalStepCount()).append(",");
        if (getTotalStepsSucceeded() != null)
            sb.append("TotalStepsSucceeded: ").append(getTotalStepsSucceeded()).append(",");
        if (getTotalStepsFailed() != null)
            sb.append("TotalStepsFailed: ").append(getTotalStepsFailed()).append(",");
        if (getTotalStepsSkipped() != null)
            sb.append("TotalStepsSkipped: ").append(getTotalStepsSkipped()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getParallelGroup() != null)
            sb.append("ParallelGroup: ").append(getParallelGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionMetadata == false)
            return false;
        WorkflowExecutionMetadata other = (WorkflowExecutionMetadata) obj;
        if (other.getWorkflowBuildVersionArn() == null ^ this.getWorkflowBuildVersionArn() == null)
            return false;
        if (other.getWorkflowBuildVersionArn() != null && other.getWorkflowBuildVersionArn().equals(this.getWorkflowBuildVersionArn()) == false)
            return false;
        if (other.getWorkflowExecutionId() == null ^ this.getWorkflowExecutionId() == null)
            return false;
        if (other.getWorkflowExecutionId() != null && other.getWorkflowExecutionId().equals(this.getWorkflowExecutionId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTotalStepCount() == null ^ this.getTotalStepCount() == null)
            return false;
        if (other.getTotalStepCount() != null && other.getTotalStepCount().equals(this.getTotalStepCount()) == false)
            return false;
        if (other.getTotalStepsSucceeded() == null ^ this.getTotalStepsSucceeded() == null)
            return false;
        if (other.getTotalStepsSucceeded() != null && other.getTotalStepsSucceeded().equals(this.getTotalStepsSucceeded()) == false)
            return false;
        if (other.getTotalStepsFailed() == null ^ this.getTotalStepsFailed() == null)
            return false;
        if (other.getTotalStepsFailed() != null && other.getTotalStepsFailed().equals(this.getTotalStepsFailed()) == false)
            return false;
        if (other.getTotalStepsSkipped() == null ^ this.getTotalStepsSkipped() == null)
            return false;
        if (other.getTotalStepsSkipped() != null && other.getTotalStepsSkipped().equals(this.getTotalStepsSkipped()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getParallelGroup() == null ^ this.getParallelGroup() == null)
            return false;
        if (other.getParallelGroup() != null && other.getParallelGroup().equals(this.getParallelGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowBuildVersionArn() == null) ? 0 : getWorkflowBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionId() == null) ? 0 : getWorkflowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTotalStepCount() == null) ? 0 : getTotalStepCount().hashCode());
        hashCode = prime * hashCode + ((getTotalStepsSucceeded() == null) ? 0 : getTotalStepsSucceeded().hashCode());
        hashCode = prime * hashCode + ((getTotalStepsFailed() == null) ? 0 : getTotalStepsFailed().hashCode());
        hashCode = prime * hashCode + ((getTotalStepsSkipped() == null) ? 0 : getTotalStepsSkipped().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getParallelGroup() == null) ? 0 : getParallelGroup().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionMetadata clone() {
        try {
            return (WorkflowExecutionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowExecutionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
