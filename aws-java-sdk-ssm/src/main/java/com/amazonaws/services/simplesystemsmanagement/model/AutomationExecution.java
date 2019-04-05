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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the current state of an individual Automation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution ID.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date executionStartTime;
    /**
     * <p>
     * The time the execution finished.
     * </p>
     */
    private java.util.Date executionEndTime;
    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     */
    private String automationExecutionStatus;
    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are run in order.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepExecution> stepExecutions;
    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of the Automation step executions. If true,
     * use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * </p>
     */
    private Boolean stepExecutionsTruncated;
    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;
    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The automation execution mode.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     */
    private String parentAutomationExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     */
    private String executedBy;
    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     */
    private String currentStepName;
    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     */
    private String currentAction;
    /**
     * <p>
     * The parameter name.
     * </p>
     */
    private String targetParameterName;
    /**
     * <p>
     * The specified targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The specified key-value mapping of document parameters to target resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>> targetMaps;
    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     */
    private ResolvedTargets resolvedTargets;
    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution started.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The target of the execution.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetLocation> targetLocations;
    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     * Automation execution.
     * </p>
     */
    private ProgressCounters progressCounters;

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @return The execution ID.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during the execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @return The name of the Automation document used during the execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document to use during execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @return The version of the document to use during execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document to use during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.
     */

    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @return The time the execution started.
     */

    public java.util.Date getExecutionStartTime() {
        return this.executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withExecutionStartTime(java.util.Date executionStartTime) {
        setExecutionStartTime(executionStartTime);
        return this;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished.
     */

    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @return The time the execution finished.
     */

    public java.util.Date getExecutionEndTime() {
        return this.executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withExecutionEndTime(java.util.Date executionEndTime) {
        setExecutionEndTime(executionEndTime);
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @return The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public String getAutomationExecutionStatus() {
        return this.automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecution withAutomationExecutionStatus(String automationExecutionStatus) {
        setAutomationExecutionStatus(automationExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        withAutomationExecutionStatus(automationExecutionStatus);
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecution withAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are run in order.
     * </p>
     * 
     * @return A list of details about the current state of all steps that comprise an execution. An Automation document
     *         contains a list of steps that are run in order.
     */

    public java.util.List<StepExecution> getStepExecutions() {
        if (stepExecutions == null) {
            stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>();
        }
        return stepExecutions;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are run in order.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are run in order.
     */

    public void setStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        if (stepExecutions == null) {
            this.stepExecutions = null;
            return;
        }

        this.stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions);
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are run in order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepExecutions(java.util.Collection)} or {@link #withStepExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are run in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withStepExecutions(StepExecution... stepExecutions) {
        if (this.stepExecutions == null) {
            setStepExecutions(new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions.length));
        }
        for (StepExecution ele : stepExecutions) {
            this.stepExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are run in order.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are run in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        setStepExecutions(stepExecutions);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of the Automation step executions. If true,
     * use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * </p>
     * 
     * @param stepExecutionsTruncated
     *        A boolean value that indicates if the response contains the full list of the Automation step executions.
     *        If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     */

    public void setStepExecutionsTruncated(Boolean stepExecutionsTruncated) {
        this.stepExecutionsTruncated = stepExecutionsTruncated;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of the Automation step executions. If true,
     * use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * </p>
     * 
     * @return A boolean value that indicates if the response contains the full list of the Automation step executions.
     *         If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     */

    public Boolean getStepExecutionsTruncated() {
        return this.stepExecutionsTruncated;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of the Automation step executions. If true,
     * use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * </p>
     * 
     * @param stepExecutionsTruncated
     *        A boolean value that indicates if the response contains the full list of the Automation step executions.
     *        If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withStepExecutionsTruncated(Boolean stepExecutionsTruncated) {
        setStepExecutionsTruncated(stepExecutionsTruncated);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of the Automation step executions. If true,
     * use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     * </p>
     * 
     * @return A boolean value that indicates if the response contains the full list of the Automation step executions.
     *         If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
     */

    public Boolean isStepExecutionsTruncated() {
        return this.stepExecutionsTruncated;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     * </p>
     * 
     * @return The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public AutomationExecution addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the automation document.
     */

    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the automation document.
     */

    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        setOutputs(outputs);
        return this;
    }

    public AutomationExecution addOutputsEntry(String key, java.util.List<String> value) {
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

    public AutomationExecution clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @param failureMessage
     *        A message describing why an execution has failed, if the status is set to Failed.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @return A message describing why an execution has failed, if the status is set to Failed.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @param failureMessage
     *        A message describing why an execution has failed, if the status is set to Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * 
     * @param mode
     *        The automation execution mode.
     * @see ExecutionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * 
     * @return The automation execution mode.
     * @see ExecutionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * 
     * @param mode
     *        The automation execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public AutomationExecution withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * 
     * @param mode
     *        The automation execution mode.
     * @see ExecutionMode
     */

    public void setMode(ExecutionMode mode) {
        withMode(mode);
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * 
     * @param mode
     *        The automation execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public AutomationExecution withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * 
     * @param parentAutomationExecutionId
     *        The AutomationExecutionId of the parent automation.
     */

    public void setParentAutomationExecutionId(String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * 
     * @return The AutomationExecutionId of the parent automation.
     */

    public String getParentAutomationExecutionId() {
        return this.parentAutomationExecutionId;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * 
     * @param parentAutomationExecutionId
     *        The AutomationExecutionId of the parent automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withParentAutomationExecutionId(String parentAutomationExecutionId) {
        setParentAutomationExecutionId(parentAutomationExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     * 
     * @param executedBy
     *        The Amazon Resource Name (ARN) of the user who ran the automation.
     */

    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who ran the automation.
     */

    public String getExecutedBy() {
        return this.executedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     * 
     * @param executedBy
     *        The Amazon Resource Name (ARN) of the user who ran the automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withExecutedBy(String executedBy) {
        setExecutedBy(executedBy);
        return this;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     * 
     * @param currentStepName
     *        The name of the step that is currently running.
     */

    public void setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     * 
     * @return The name of the step that is currently running.
     */

    public String getCurrentStepName() {
        return this.currentStepName;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     * 
     * @param currentStepName
     *        The name of the step that is currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withCurrentStepName(String currentStepName) {
        setCurrentStepName(currentStepName);
        return this;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     * 
     * @param currentAction
     *        The action of the step that is currently running.
     */

    public void setCurrentAction(String currentAction) {
        this.currentAction = currentAction;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     * 
     * @return The action of the step that is currently running.
     */

    public String getCurrentAction() {
        return this.currentAction;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     * 
     * @param currentAction
     *        The action of the step that is currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withCurrentAction(String currentAction) {
        setCurrentAction(currentAction);
        return this;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * 
     * @param targetParameterName
     *        The parameter name.
     */

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * 
     * @return The parameter name.
     */

    public String getTargetParameterName() {
        return this.targetParameterName;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * 
     * @param targetParameterName
     *        The parameter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargetParameterName(String targetParameterName) {
        setTargetParameterName(targetParameterName);
        return this;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * 
     * @return The specified targets.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * 
     * @param targets
     *        The specified targets.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The specified targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * 
     * @param targets
     *        The specified targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target resources.
     * </p>
     * 
     * @return The specified key-value mapping of document parameters to target resources.
     */

    public java.util.List<java.util.Map<String, java.util.List<String>>> getTargetMaps() {
        if (targetMaps == null) {
            targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>();
        }
        return targetMaps;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target resources.
     * </p>
     * 
     * @param targetMaps
     *        The specified key-value mapping of document parameters to target resources.
     */

    public void setTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        if (targetMaps == null) {
            this.targetMaps = null;
            return;
        }

        this.targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps);
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetMaps(java.util.Collection)} or {@link #withTargetMaps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetMaps
     *        The specified key-value mapping of document parameters to target resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargetMaps(java.util.Map<String, java.util.List<String>>... targetMaps) {
        if (this.targetMaps == null) {
            setTargetMaps(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps.length));
        }
        for (java.util.Map<String, java.util.List<String>> ele : targetMaps) {
            this.targetMaps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target resources.
     * </p>
     * 
     * @param targetMaps
     *        The specified key-value mapping of document parameters to target resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     * 
     * @param resolvedTargets
     *        A list of resolved targets in the rate control execution.
     */

    public void setResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     * 
     * @return A list of resolved targets in the rate control execution.
     */

    public ResolvedTargets getResolvedTargets() {
        return this.resolvedTargets;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     * 
     * @param resolvedTargets
     *        A list of resolved targets in the rate control execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withResolvedTargets(ResolvedTargets resolvedTargets) {
        setResolvedTargets(resolvedTargets);
        return this;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution started.
     * </p>
     * 
     * @param maxConcurrency
     *        The MaxConcurrency value specified by the user when the execution started.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution started.
     * </p>
     * 
     * @return The MaxConcurrency value specified by the user when the execution started.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution started.
     * </p>
     * 
     * @param maxConcurrency
     *        The MaxConcurrency value specified by the user when the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * 
     * @param maxErrors
     *        The MaxErrors value specified by the user when the execution started.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * 
     * @return The MaxErrors value specified by the user when the execution started.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * 
     * @param maxErrors
     *        The MaxErrors value specified by the user when the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     * 
     * @param target
     *        The target of the execution.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     * 
     * @return The target of the execution.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     * 
     * @param target
     *        The target of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * </p>
     * 
     * @return The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     */

    public java.util.List<TargetLocation> getTargetLocations() {
        if (targetLocations == null) {
            targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>();
        }
        return targetLocations;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * </p>
     * 
     * @param targetLocations
     *        The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     */

    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLocations(java.util.Collection)} or {@link #withTargetLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetLocations
     *        The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargetLocations(TargetLocation... targetLocations) {
        if (this.targetLocations == null) {
            setTargetLocations(new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations.length));
        }
        for (TargetLocation ele : targetLocations) {
            this.targetLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * </p>
     * 
     * @param targetLocations
     *        The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
        return this;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     * Automation execution.
     * </p>
     * 
     * @param progressCounters
     *        An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     *        Automation execution.
     */

    public void setProgressCounters(ProgressCounters progressCounters) {
        this.progressCounters = progressCounters;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     * Automation execution.
     * </p>
     * 
     * @return An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     *         Automation execution.
     */

    public ProgressCounters getProgressCounters() {
        return this.progressCounters;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     * Automation execution.
     * </p>
     * 
     * @param progressCounters
     *        An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account
     *        Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withProgressCounters(ProgressCounters progressCounters) {
        setProgressCounters(progressCounters);
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: ").append(getExecutionStartTime()).append(",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: ").append(getExecutionEndTime()).append(",");
        if (getAutomationExecutionStatus() != null)
            sb.append("AutomationExecutionStatus: ").append(getAutomationExecutionStatus()).append(",");
        if (getStepExecutions() != null)
            sb.append("StepExecutions: ").append(getStepExecutions()).append(",");
        if (getStepExecutionsTruncated() != null)
            sb.append("StepExecutionsTruncated: ").append(getStepExecutionsTruncated()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getParentAutomationExecutionId() != null)
            sb.append("ParentAutomationExecutionId: ").append(getParentAutomationExecutionId()).append(",");
        if (getExecutedBy() != null)
            sb.append("ExecutedBy: ").append(getExecutedBy()).append(",");
        if (getCurrentStepName() != null)
            sb.append("CurrentStepName: ").append(getCurrentStepName()).append(",");
        if (getCurrentAction() != null)
            sb.append("CurrentAction: ").append(getCurrentAction()).append(",");
        if (getTargetParameterName() != null)
            sb.append("TargetParameterName: ").append(getTargetParameterName()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTargetMaps() != null)
            sb.append("TargetMaps: ").append(getTargetMaps()).append(",");
        if (getResolvedTargets() != null)
            sb.append("ResolvedTargets: ").append(getResolvedTargets()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: ").append(getTargetLocations()).append(",");
        if (getProgressCounters() != null)
            sb.append("ProgressCounters: ").append(getProgressCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecution == false)
            return false;
        AutomationExecution other = (AutomationExecution) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getExecutionStartTime() == null ^ this.getExecutionStartTime() == null)
            return false;
        if (other.getExecutionStartTime() != null && other.getExecutionStartTime().equals(this.getExecutionStartTime()) == false)
            return false;
        if (other.getExecutionEndTime() == null ^ this.getExecutionEndTime() == null)
            return false;
        if (other.getExecutionEndTime() != null && other.getExecutionEndTime().equals(this.getExecutionEndTime()) == false)
            return false;
        if (other.getAutomationExecutionStatus() == null ^ this.getAutomationExecutionStatus() == null)
            return false;
        if (other.getAutomationExecutionStatus() != null && other.getAutomationExecutionStatus().equals(this.getAutomationExecutionStatus()) == false)
            return false;
        if (other.getStepExecutions() == null ^ this.getStepExecutions() == null)
            return false;
        if (other.getStepExecutions() != null && other.getStepExecutions().equals(this.getStepExecutions()) == false)
            return false;
        if (other.getStepExecutionsTruncated() == null ^ this.getStepExecutionsTruncated() == null)
            return false;
        if (other.getStepExecutionsTruncated() != null && other.getStepExecutionsTruncated().equals(this.getStepExecutionsTruncated()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getParentAutomationExecutionId() == null ^ this.getParentAutomationExecutionId() == null)
            return false;
        if (other.getParentAutomationExecutionId() != null && other.getParentAutomationExecutionId().equals(this.getParentAutomationExecutionId()) == false)
            return false;
        if (other.getExecutedBy() == null ^ this.getExecutedBy() == null)
            return false;
        if (other.getExecutedBy() != null && other.getExecutedBy().equals(this.getExecutedBy()) == false)
            return false;
        if (other.getCurrentStepName() == null ^ this.getCurrentStepName() == null)
            return false;
        if (other.getCurrentStepName() != null && other.getCurrentStepName().equals(this.getCurrentStepName()) == false)
            return false;
        if (other.getCurrentAction() == null ^ this.getCurrentAction() == null)
            return false;
        if (other.getCurrentAction() != null && other.getCurrentAction().equals(this.getCurrentAction()) == false)
            return false;
        if (other.getTargetParameterName() == null ^ this.getTargetParameterName() == null)
            return false;
        if (other.getTargetParameterName() != null && other.getTargetParameterName().equals(this.getTargetParameterName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetMaps() == null ^ this.getTargetMaps() == null)
            return false;
        if (other.getTargetMaps() != null && other.getTargetMaps().equals(this.getTargetMaps()) == false)
            return false;
        if (other.getResolvedTargets() == null ^ this.getResolvedTargets() == null)
            return false;
        if (other.getResolvedTargets() != null && other.getResolvedTargets().equals(this.getResolvedTargets()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        if (other.getProgressCounters() == null ^ this.getProgressCounters() == null)
            return false;
        if (other.getProgressCounters() != null && other.getProgressCounters().equals(this.getProgressCounters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getAutomationExecutionStatus() == null) ? 0 : getAutomationExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getStepExecutions() == null) ? 0 : getStepExecutions().hashCode());
        hashCode = prime * hashCode + ((getStepExecutionsTruncated() == null) ? 0 : getStepExecutionsTruncated().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getParentAutomationExecutionId() == null) ? 0 : getParentAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutedBy() == null) ? 0 : getExecutedBy().hashCode());
        hashCode = prime * hashCode + ((getCurrentStepName() == null) ? 0 : getCurrentStepName().hashCode());
        hashCode = prime * hashCode + ((getCurrentAction() == null) ? 0 : getCurrentAction().hashCode());
        hashCode = prime * hashCode + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        hashCode = prime * hashCode + ((getResolvedTargets() == null) ? 0 : getResolvedTargets().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        hashCode = prime * hashCode + ((getProgressCounters() == null) ? 0 : getProgressCounters().hashCode());
        return hashCode;
    }

    @Override
    public AutomationExecution clone() {
        try {
            return (AutomationExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AutomationExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
