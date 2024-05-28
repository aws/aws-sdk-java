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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflowStepExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The unique identifier for the runtime version of the workflow step that you specified in the request.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines this
     * workflow step.
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
     * workflow step creates.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The name of the specified runtime instance of the workflow step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the specified workflow step.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the action that the specified step performs.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The current status for the specified runtime version of the workflow step.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * </p>
     */
    private String rollbackStatus;
    /**
     * <p>
     * The output message from the specified runtime instance of the workflow step, if applicable.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     * </p>
     */
    private String inputs;
    /**
     * <p>
     * The file names that the specified runtime version of the workflow step created as output.
     * </p>
     */
    private String outputs;
    /**
     * <p>
     * The timestamp when the specified runtime version of the workflow step started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow step finished.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The action to perform if the workflow step fails.
     * </p>
     */
    private String onFailure;
    /**
     * <p>
     * The maximum duration in seconds for this step to complete its action.
     * </p>
     */
    private Integer timeoutSeconds;

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

    public GetWorkflowStepExecutionResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the runtime version of the workflow step that you specified in the request.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique identifier for the runtime version of the workflow step that you specified in the request.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * The unique identifier for the runtime version of the workflow step that you specified in the request.
     * </p>
     * 
     * @return The unique identifier for the runtime version of the workflow step that you specified in the request.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * The unique identifier for the runtime version of the workflow step that you specified in the request.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique identifier for the runtime version of the workflow step that you specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines this
     * workflow step.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *        this workflow step.
     */

    public void setWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        this.workflowBuildVersionArn = workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines this
     * workflow step.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *         this workflow step.
     */

    public String getWorkflowBuildVersionArn() {
        return this.workflowBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines this
     * workflow step.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines
     *        this workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withWorkflowBuildVersionArn(String workflowBuildVersionArn) {
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

    public GetWorkflowStepExecutionResult withWorkflowExecutionId(String workflowExecutionId) {
        setWorkflowExecutionId(workflowExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow step creates.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *        the workflow step creates.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow step creates.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *         the workflow step creates.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the
     * workflow step creates.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of
     *        the workflow step creates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The name of the specified runtime instance of the workflow step.
     * </p>
     * 
     * @param name
     *        The name of the specified runtime instance of the workflow step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified runtime instance of the workflow step.
     * </p>
     * 
     * @return The name of the specified runtime instance of the workflow step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified runtime instance of the workflow step.
     * </p>
     * 
     * @param name
     *        The name of the specified runtime instance of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the specified workflow step.
     * </p>
     * 
     * @param description
     *        Describes the specified workflow step.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the specified workflow step.
     * </p>
     * 
     * @return Describes the specified workflow step.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the specified workflow step.
     * </p>
     * 
     * @param description
     *        Describes the specified workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the action that the specified step performs.
     * </p>
     * 
     * @param action
     *        The name of the action that the specified step performs.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the action that the specified step performs.
     * </p>
     * 
     * @return The name of the action that the specified step performs.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the action that the specified step performs.
     * </p>
     * 
     * @param action
     *        The name of the action that the specified step performs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The current status for the specified runtime version of the workflow step.
     * </p>
     * 
     * @param status
     *        The current status for the specified runtime version of the workflow step.
     * @see WorkflowStepExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the specified runtime version of the workflow step.
     * </p>
     * 
     * @return The current status for the specified runtime version of the workflow step.
     * @see WorkflowStepExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status for the specified runtime version of the workflow step.
     * </p>
     * 
     * @param status
     *        The current status for the specified runtime version of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionStatus
     */

    public GetWorkflowStepExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status for the specified runtime version of the workflow step.
     * </p>
     * 
     * @param status
     *        The current status for the specified runtime version of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionStatus
     */

    public GetWorkflowStepExecutionResult withStatus(WorkflowStepExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public void setRollbackStatus(String rollbackStatus) {
        this.rollbackStatus = rollbackStatus;
    }

    /**
     * <p>
     * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * </p>
     * 
     * @return Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public String getRollbackStatus() {
        return this.rollbackStatus;
    }

    /**
     * <p>
     * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public GetWorkflowStepExecutionResult withRollbackStatus(String rollbackStatus) {
        setRollbackStatus(rollbackStatus);
        return this;
    }

    /**
     * <p>
     * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public GetWorkflowStepExecutionResult withRollbackStatus(WorkflowStepExecutionRollbackStatus rollbackStatus) {
        this.rollbackStatus = rollbackStatus.toString();
        return this;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow step, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the specified runtime instance of the workflow step, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow step, if applicable.
     * </p>
     * 
     * @return The output message from the specified runtime instance of the workflow step, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The output message from the specified runtime instance of the workflow step, if applicable.
     * </p>
     * 
     * @param message
     *        The output message from the specified runtime instance of the workflow step, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     * </p>
     * 
     * @param inputs
     *        Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     */

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    /**
     * <p>
     * Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     * </p>
     * 
     * @return Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     */

    public String getInputs() {
        return this.inputs;
    }

    /**
     * <p>
     * Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     * </p>
     * 
     * @param inputs
     *        Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withInputs(String inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The file names that the specified runtime version of the workflow step created as output.
     * </p>
     * 
     * @param outputs
     *        The file names that the specified runtime version of the workflow step created as output.
     */

    public void setOutputs(String outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The file names that the specified runtime version of the workflow step created as output.
     * </p>
     * 
     * @return The file names that the specified runtime version of the workflow step created as output.
     */

    public String getOutputs() {
        return this.outputs;
    }

    /**
     * <p>
     * The file names that the specified runtime version of the workflow step created as output.
     * </p>
     * 
     * @param outputs
     *        The file names that the specified runtime version of the workflow step created as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withOutputs(String outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The timestamp when the specified runtime version of the workflow step started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the specified runtime version of the workflow step started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime version of the workflow step started.
     * </p>
     * 
     * @return The timestamp when the specified runtime version of the workflow step started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime version of the workflow step started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the specified runtime version of the workflow step started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow step finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the specified runtime instance of the workflow step finished.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow step finished.
     * </p>
     * 
     * @return The timestamp when the specified runtime instance of the workflow step finished.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when the specified runtime instance of the workflow step finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the specified runtime instance of the workflow step finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The action to perform if the workflow step fails.
     * </p>
     * 
     * @param onFailure
     *        The action to perform if the workflow step fails.
     */

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * The action to perform if the workflow step fails.
     * </p>
     * 
     * @return The action to perform if the workflow step fails.
     */

    public String getOnFailure() {
        return this.onFailure;
    }

    /**
     * <p>
     * The action to perform if the workflow step fails.
     * </p>
     * 
     * @param onFailure
     *        The action to perform if the workflow step fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withOnFailure(String onFailure) {
        setOnFailure(onFailure);
        return this;
    }

    /**
     * <p>
     * The maximum duration in seconds for this step to complete its action.
     * </p>
     * 
     * @param timeoutSeconds
     *        The maximum duration in seconds for this step to complete its action.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * The maximum duration in seconds for this step to complete its action.
     * </p>
     * 
     * @return The maximum duration in seconds for this step to complete its action.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * The maximum duration in seconds for this step to complete its action.
     * </p>
     * 
     * @param timeoutSeconds
     *        The maximum duration in seconds for this step to complete its action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepExecutionResult withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
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
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId()).append(",");
        if (getWorkflowBuildVersionArn() != null)
            sb.append("WorkflowBuildVersionArn: ").append(getWorkflowBuildVersionArn()).append(",");
        if (getWorkflowExecutionId() != null)
            sb.append("WorkflowExecutionId: ").append(getWorkflowExecutionId()).append(",");
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRollbackStatus() != null)
            sb.append("RollbackStatus: ").append(getRollbackStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOnFailure() != null)
            sb.append("OnFailure: ").append(getOnFailure()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowStepExecutionResult == false)
            return false;
        GetWorkflowStepExecutionResult other = (GetWorkflowStepExecutionResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRollbackStatus() == null ^ this.getRollbackStatus() == null)
            return false;
        if (other.getRollbackStatus() != null && other.getRollbackStatus().equals(this.getRollbackStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowBuildVersionArn() == null) ? 0 : getWorkflowBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionId() == null) ? 0 : getWorkflowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRollbackStatus() == null) ? 0 : getRollbackStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowStepExecutionResult clone() {
        try {
            return (GetWorkflowStepExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
