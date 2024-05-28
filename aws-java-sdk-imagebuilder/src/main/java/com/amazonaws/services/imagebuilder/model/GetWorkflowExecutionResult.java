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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflowExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines the
     * specified runtime instance of the workflow.
     * </p>
     */
    private String workflowBuildVersionArn;
    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     */
    private String workflowExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow created.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The current runtime status for the specified runtime instance of the workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The output message from the specified runtime instance of the workflow, if applicable.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The total number of steps in the specified runtime instance of the workflow that ran. This number should equal
     * the sum of the step counts for steps that succeeded, were skipped, and failed.
     * </p>
     */
    private Integer totalStepCount;
    /**
     * <p>
     * A runtime count for the number of steps that ran successfully in the specified runtime instance of the workflow.
     * </p>
     */
    private Integer totalStepsSucceeded;
    /**
     * <p>
     * A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     * </p>
     */
    private Integer totalStepsFailed;
    /**
     * <p>
     * A runtime count for the number of steps that were skipped in the specified runtime instance of the workflow.
     * </p>
     */
    private Integer totalStepsSkipped;
    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow finished.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * Test workflows are defined within named runtime groups. The parallel group is a named group that contains one or
     * more test workflows.
     * </p>
     */
    private String parallelGroup;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines the
     * specified runtime instance of the workflow.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *        the specified runtime instance of the workflow.
     */

    public void setWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        this.workflowBuildVersionArn = workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines the
     * specified runtime instance of the workflow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *         the specified runtime instance of the workflow.
     */

    public String getWorkflowBuildVersionArn() {
        return this.workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines the
     * specified runtime instance of the workflow.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *        the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        setWorkflowBuildVersionArn(workflowBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *        workflow.
     */

    public void setWorkflowExecutionId(String workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @return The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *         workflow.
     */

    public String getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    /**
     * <p>
     * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
     * </p>
     * 
     * @param workflowExecutionId
     *        The unique identifier that Image Builder assigned to keep track of runtime details when it ran the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withWorkflowExecutionId(String workflowExecutionId) {
        setWorkflowExecutionId(workflowExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow created.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *        the workflow created.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *         the workflow created.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow created.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *        the workflow created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * </p>
     * 
     * @return The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowExecutionResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param type
     *        The type of workflow that Image Builder ran for the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public GetWorkflowExecutionResult withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current runtime status for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for the specified runtime instance of the workflow.
     * @see WorkflowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current runtime status for the specified runtime instance of the workflow.
     * </p>
     * 
     * @return The current runtime status for the specified runtime instance of the workflow.
     * @see WorkflowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current runtime status for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionStatus
     */

    public GetWorkflowExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current runtime status for the specified runtime instance of the workflow.
     * </p>
     * 
     * @param status
     *        The current runtime status for the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionStatus
     */

    public GetWorkflowExecutionResult withStatus(WorkflowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the specified runtime instance of the workflow, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow, if applicable.
     * </p>
     * 
     * @return The output message from the specified runtime instance of the workflow, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the specified runtime instance of the workflow, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The total number of steps in the specified runtime instance of the workflow that ran. This number should equal
     * the sum of the step counts for steps that succeeded, were skipped, and failed.
     * </p>
     * 
     * @param totalStepCount
     *        The total number of steps in the specified runtime instance of the workflow that ran. This number should
     *        equal the sum of the step counts for steps that succeeded, were skipped, and failed.
     */

    public void setTotalStepCount(Integer totalStepCount) {
        this.totalStepCount = totalStepCount;
    }

    /**
     * <p>
     * The total number of steps in the specified runtime instance of the workflow that ran. This number should equal
     * the sum of the step counts for steps that succeeded, were skipped, and failed.
     * </p>
     * 
     * @return The total number of steps in the specified runtime instance of the workflow that ran. This number should
     *         equal the sum of the step counts for steps that succeeded, were skipped, and failed.
     */

    public Integer getTotalStepCount() {
        return this.totalStepCount;
    }

    /**
     * <p>
     * The total number of steps in the specified runtime instance of the workflow that ran. This number should equal
     * the sum of the step counts for steps that succeeded, were skipped, and failed.
     * </p>
     * 
     * @param totalStepCount
     *        The total number of steps in the specified runtime instance of the workflow that ran. This number should
     *        equal the sum of the step counts for steps that succeeded, were skipped, and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withTotalStepCount(Integer totalStepCount) {
        setTotalStepCount(totalStepCount);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps that ran successfully in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsSucceeded
     *        A runtime count for the number of steps that ran successfully in the specified runtime instance of the
     *        workflow.
     */

    public void setTotalStepsSucceeded(Integer totalStepsSucceeded) {
        this.totalStepsSucceeded = totalStepsSucceeded;
    }

    /**
     * <p>
     * A runtime count for the number of steps that ran successfully in the specified runtime instance of the workflow.
     * </p>
     * 
     * @return A runtime count for the number of steps that ran successfully in the specified runtime instance of the
     *         workflow.
     */

    public Integer getTotalStepsSucceeded() {
        return this.totalStepsSucceeded;
    }

    /**
     * <p>
     * A runtime count for the number of steps that ran successfully in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsSucceeded
     *        A runtime count for the number of steps that ran successfully in the specified runtime instance of the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withTotalStepsSucceeded(Integer totalStepsSucceeded) {
        setTotalStepsSucceeded(totalStepsSucceeded);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsFailed
     *        A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     */

    public void setTotalStepsFailed(Integer totalStepsFailed) {
        this.totalStepsFailed = totalStepsFailed;
    }

    /**
     * <p>
     * A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     * </p>
     * 
     * @return A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     */

    public Integer getTotalStepsFailed() {
        return this.totalStepsFailed;
    }

    /**
     * <p>
     * A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsFailed
     *        A runtime count for the number of steps that failed in the specified runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withTotalStepsFailed(Integer totalStepsFailed) {
        setTotalStepsFailed(totalStepsFailed);
        return this;
    }

    /**
     * <p>
     * A runtime count for the number of steps that were skipped in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsSkipped
     *        A runtime count for the number of steps that were skipped in the specified runtime instance of the
     *        workflow.
     */

    public void setTotalStepsSkipped(Integer totalStepsSkipped) {
        this.totalStepsSkipped = totalStepsSkipped;
    }

    /**
     * <p>
     * A runtime count for the number of steps that were skipped in the specified runtime instance of the workflow.
     * </p>
     * 
     * @return A runtime count for the number of steps that were skipped in the specified runtime instance of the
     *         workflow.
     */

    public Integer getTotalStepsSkipped() {
        return this.totalStepsSkipped;
    }

    /**
     * <p>
     * A runtime count for the number of steps that were skipped in the specified runtime instance of the workflow.
     * </p>
     * 
     * @param totalStepsSkipped
     *        A runtime count for the number of steps that were skipped in the specified runtime instance of the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withTotalStepsSkipped(Integer totalStepsSkipped) {
        setTotalStepsSkipped(totalStepsSkipped);
        return this;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the specified runtime instance of the workflow started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow started.
     * </p>
     * 
     * @return The timestamp when the specified runtime instance of the workflow started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the specified runtime instance of the workflow started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the specified runtime instance of the workflow finished.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow finished.
     * </p>
     * 
     * @return The timestamp when the specified runtime instance of the workflow finished.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the specified runtime instance of the workflow finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups. The parallel group is a named group that contains one or
     * more test workflows.
     * </p>
     * 
     * @param parallelGroup
     *        Test workflows are defined within named runtime groups. The parallel group is a named group that contains
     *        one or more test workflows.
     */

    public void setParallelGroup(String parallelGroup) {
        this.parallelGroup = parallelGroup;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups. The parallel group is a named group that contains one or
     * more test workflows.
     * </p>
     * 
     * @return Test workflows are defined within named runtime groups. The parallel group is a named group that contains
     *         one or more test workflows.
     */

    public String getParallelGroup() {
        return this.parallelGroup;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups. The parallel group is a named group that contains one or
     * more test workflows.
     * </p>
     * 
     * @param parallelGroup
     *        Test workflows are defined within named runtime groups. The parallel group is a named group that contains
     *        one or more test workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowExecutionResult withParallelGroup(String parallelGroup) {
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getWorkflowBuildVersionArn() != null)
            sb.append("WorkflowBuildVersionArn: ").append(getWorkflowBuildVersionArn()).append(",");
        if (getWorkflowExecutionId() != null)
            sb.append("WorkflowExecutionId: ").append(getWorkflowExecutionId()).append(",");
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
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

        if (obj instanceof GetWorkflowExecutionResult == false)
            return false;
        GetWorkflowExecutionResult other = (GetWorkflowExecutionResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getWorkflowBuildVersionArn() == null ^ this.getWorkflowBuildVersionArn() == null)
            return false;
        if (other.getWorkflowBuildVersionArn() != null && other.getWorkflowBuildVersionArn().equals(this.getWorkflowBuildVersionArn()) == false)
            return false;
        if (other.getWorkflowExecutionId() == null ^ this.getWorkflowExecutionId() == null)
            return false;
        if (other.getWorkflowExecutionId() != null && other.getWorkflowExecutionId().equals(this.getWorkflowExecutionId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
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

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowBuildVersionArn() == null) ? 0 : getWorkflowBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionId() == null) ? 0 : getWorkflowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
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
    public GetWorkflowExecutionResult clone() {
        try {
            return (GetWorkflowExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
