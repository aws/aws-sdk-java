/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about an the execution state of an Automation step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StepExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this execution step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The action this step performs. The action determines the behavior of the step.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     */
    private Long timeoutSeconds;
    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     */
    private String onFailure;
    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default value is 1.
     * </p>
     */
    private Integer maxAttempts;
    /**
     * <p>
     * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this
     * field is not populated.
     * </p>
     */
    private java.util.Date executionStartTime;
    /**
     * <p>
     * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded,
     * this field is not populated.
     * </p>
     */
    private java.util.Date executionEndTime;
    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     */
    private String stepStatus;
    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     */
    private String responseCode;
    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     */
    private java.util.Map<String, String> inputs;
    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;
    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     */
    private String response;
    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     */
    private FailureDetails failureDetails;
    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * A user-specified list of parameters to override when executing a step.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> overriddenParameters;

    /**
     * <p>
     * The name of this execution step.
     * </p>
     * 
     * @param stepName
     *        The name of this execution step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of this execution step.
     * </p>
     * 
     * @return The name of this execution step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of this execution step.
     * </p>
     * 
     * @param stepName
     *        The name of this execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the step.
     * </p>
     * 
     * @param action
     *        The action this step performs. The action determines the behavior of the step.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the step.
     * </p>
     * 
     * @return The action this step performs. The action determines the behavior of the step.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the step.
     * </p>
     * 
     * @param action
     *        The action this step performs. The action determines the behavior of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     * 
     * @param timeoutSeconds
     *        The timeout seconds of the step.
     */

    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     * 
     * @return The timeout seconds of the step.
     */

    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     * 
     * @param timeoutSeconds
     *        The timeout seconds of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withTimeoutSeconds(Long timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     * 
     * @param onFailure
     *        The action to take if the step fails. The default value is Abort.
     */

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     * 
     * @return The action to take if the step fails. The default value is Abort.
     */

    public String getOnFailure() {
        return this.onFailure;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     * 
     * @param onFailure
     *        The action to take if the step fails. The default value is Abort.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withOnFailure(String onFailure) {
        setOnFailure(onFailure);
        return this;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default value is 1.
     * </p>
     * 
     * @param maxAttempts
     *        The maximum number of tries to run the action of the step. The default value is 1.
     */

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default value is 1.
     * </p>
     * 
     * @return The maximum number of tries to run the action of the step. The default value is 1.
     */

    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default value is 1.
     * </p>
     * 
     * @param maxAttempts
     *        The maximum number of tries to run the action of the step. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withMaxAttempts(Integer maxAttempts) {
        setMaxAttempts(maxAttempts);
        return this;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this
     * field is not populated.
     * </p>
     * 
     * @param executionStartTime
     *        If a step has begun execution, this contains the time the step started. If the step is in Pending status,
     *        this field is not populated.
     */

    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this
     * field is not populated.
     * </p>
     * 
     * @return If a step has begun execution, this contains the time the step started. If the step is in Pending status,
     *         this field is not populated.
     */

    public java.util.Date getExecutionStartTime() {
        return this.executionStartTime;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this
     * field is not populated.
     * </p>
     * 
     * @param executionStartTime
     *        If a step has begun execution, this contains the time the step started. If the step is in Pending status,
     *        this field is not populated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withExecutionStartTime(java.util.Date executionStartTime) {
        setExecutionStartTime(executionStartTime);
        return this;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded,
     * this field is not populated.
     * </p>
     * 
     * @param executionEndTime
     *        If a step has finished execution, this contains the time the execution ended. If the step has not yet
     *        concluded, this field is not populated.
     */

    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded,
     * this field is not populated.
     * </p>
     * 
     * @return If a step has finished execution, this contains the time the execution ended. If the step has not yet
     *         concluded, this field is not populated.
     */

    public java.util.Date getExecutionEndTime() {
        return this.executionEndTime;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded,
     * this field is not populated.
     * </p>
     * 
     * @param executionEndTime
     *        If a step has finished execution, this contains the time the execution ended. If the step has not yet
     *        concluded, this field is not populated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withExecutionEndTime(java.util.Date executionEndTime) {
        setExecutionEndTime(executionEndTime);
        return this;
    }

    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     * 
     * @param stepStatus
     *        The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed,
     *        and TimedOut.
     * @see AutomationExecutionStatus
     */

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     * 
     * @return The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled,
     *         Failed, and TimedOut.
     * @see AutomationExecutionStatus
     */

    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     * 
     * @param stepStatus
     *        The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed,
     *        and TimedOut.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public StepExecution withStepStatus(String stepStatus) {
        setStepStatus(stepStatus);
        return this;
    }

    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     * 
     * @param stepStatus
     *        The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed,
     *        and TimedOut.
     * @see AutomationExecutionStatus
     */

    public void setStepStatus(AutomationExecutionStatus stepStatus) {
        withStepStatus(stepStatus);
    }

    /**
     * <p>
     * The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed, and
     * TimedOut.
     * </p>
     * 
     * @param stepStatus
     *        The execution status for this step. Valid values include: Pending, InProgress, Success, Cancelled, Failed,
     *        and TimedOut.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public StepExecution withStepStatus(AutomationExecutionStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
        return this;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     * 
     * @param responseCode
     *        The response code returned by the execution of the step.
     */

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     * 
     * @return The response code returned by the execution of the step.
     */

    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     * 
     * @param responseCode
     *        The response code returned by the execution of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withResponseCode(String responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     * 
     * @return Fully-resolved values passed into the step before execution.
     */

    public java.util.Map<String, String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     * 
     * @param inputs
     *        Fully-resolved values passed into the step before execution.
     */

    public void setInputs(java.util.Map<String, String> inputs) {
        this.inputs = inputs;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     * 
     * @param inputs
     *        Fully-resolved values passed into the step before execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withInputs(java.util.Map<String, String> inputs) {
        setInputs(inputs);
        return this;
    }

    public StepExecution addInputsEntry(String key, String value) {
        if (null == this.inputs) {
            this.inputs = new java.util.HashMap<String, String>();
        }
        if (this.inputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Inputs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution clearInputsEntries() {
        this.inputs = null;
        return this;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     * 
     * @return Returned values from the execution of the step.
     */

    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     * 
     * @param outputs
     *        Returned values from the execution of the step.
     */

    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     * 
     * @param outputs
     *        Returned values from the execution of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        setOutputs(outputs);
        return this;
    }

    public StepExecution addOutputsEntry(String key, java.util.List<String> value) {
        if (null == this.outputs) {
            this.outputs = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.outputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Outputs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     * 
     * @param response
     *        A message associated with the response code for an execution.
     */

    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     * 
     * @return A message associated with the response code for an execution.
     */

    public String getResponse() {
        return this.response;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     * 
     * @param response
     *        A message associated with the response code for an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withResponse(String response) {
        setResponse(response);
        return this;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     * 
     * @param failureMessage
     *        If a step failed, this message explains why the execution failed.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     * 
     * @return If a step failed, this message explains why the execution failed.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     * 
     * @param failureMessage
     *        If a step failed, this message explains why the execution failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     * 
     * @param failureDetails
     *        Information about the Automation failure.
     */

    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     * 
     * @return Information about the Automation failure.
     */

    public FailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     * 
     * @param failureDetails
     *        Information about the Automation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withFailureDetails(FailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique ID of a step execution.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @return The unique ID of a step execution.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * 
     * @param stepExecutionId
     *        The unique ID of a step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when executing a step.
     * </p>
     * 
     * @return A user-specified list of parameters to override when executing a step.
     */

    public java.util.Map<String, java.util.List<String>> getOverriddenParameters() {
        return overriddenParameters;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when executing a step.
     * </p>
     * 
     * @param overriddenParameters
     *        A user-specified list of parameters to override when executing a step.
     */

    public void setOverriddenParameters(java.util.Map<String, java.util.List<String>> overriddenParameters) {
        this.overriddenParameters = overriddenParameters;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when executing a step.
     * </p>
     * 
     * @param overriddenParameters
     *        A user-specified list of parameters to override when executing a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution withOverriddenParameters(java.util.Map<String, java.util.List<String>> overriddenParameters) {
        setOverriddenParameters(overriddenParameters);
        return this;
    }

    public StepExecution addOverriddenParametersEntry(String key, java.util.List<String> value) {
        if (null == this.overriddenParameters) {
            this.overriddenParameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.overriddenParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.overriddenParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OverriddenParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecution clearOverriddenParametersEntries() {
        this.overriddenParameters = null;
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
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds()).append(",");
        if (getOnFailure() != null)
            sb.append("OnFailure: ").append(getOnFailure()).append(",");
        if (getMaxAttempts() != null)
            sb.append("MaxAttempts: ").append(getMaxAttempts()).append(",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: ").append(getExecutionStartTime()).append(",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: ").append(getExecutionEndTime()).append(",");
        if (getStepStatus() != null)
            sb.append("StepStatus: ").append(getStepStatus()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getResponse() != null)
            sb.append("Response: ").append(getResponse()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId()).append(",");
        if (getOverriddenParameters() != null)
            sb.append("OverriddenParameters: ").append(getOverriddenParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepExecution == false)
            return false;
        StepExecution other = (StepExecution) obj;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
            return false;
        if (other.getExecutionStartTime() == null ^ this.getExecutionStartTime() == null)
            return false;
        if (other.getExecutionStartTime() != null && other.getExecutionStartTime().equals(this.getExecutionStartTime()) == false)
            return false;
        if (other.getExecutionEndTime() == null ^ this.getExecutionEndTime() == null)
            return false;
        if (other.getExecutionEndTime() != null && other.getExecutionEndTime().equals(this.getExecutionEndTime()) == false)
            return false;
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getOverriddenParameters() == null ^ this.getOverriddenParameters() == null)
            return false;
        if (other.getOverriddenParameters() != null && other.getOverriddenParameters().equals(this.getOverriddenParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        hashCode = prime * hashCode + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getOverriddenParameters() == null) ? 0 : getOverriddenParameters().hashCode());
        return hashCode;
    }

    @Override
    public StepExecution clone() {
        try {
            return (StepExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.StepExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
