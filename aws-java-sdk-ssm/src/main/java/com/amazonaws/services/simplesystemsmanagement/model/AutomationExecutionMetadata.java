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
 * Details about a specific Automation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AutomationExecutionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecutionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution ID.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The document version used during the execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     */
    private String automationExecutionStatus;
    /**
     * <p>
     * The time the execution started.&gt;
     * </p>
     */
    private java.util.Date executionStartTime;
    /**
     * <p>
     * The time the execution finished. This is not populated if the execution is still in progress.
     * </p>
     */
    private java.util.Date executionEndTime;
    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     */
    private String executedBy;
    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     */
    private String logFile;
    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;
    /**
     * <p>
     * The Automation execution mode.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     */
    private String parentAutomationExecutionId;
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
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private String targetParameterName;
    /**
     * <p>
     * The targets defined by the user when starting the Automation.
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
     * A list of targets that resolved during the execution.
     * </p>
     */
    private ResolvedTargets resolvedTargets;
    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the Automation.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private String target;
    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String automationType;

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

    public AutomationExecutionMetadata withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * 
     * @return The name of the Automation document used during execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * 
     * @param documentVersion
     *        The document version used during the execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * 
     * @return The document version used during the execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * 
     * @param documentVersion
     *        The document version used during the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
    }

    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     * 
     * @return The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * @see AutomationExecutionStatus
     */

    public String getAutomationExecutionStatus() {
        return this.automationExecutionStatus;
    }

    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecutionMetadata withAutomationExecutionStatus(String automationExecutionStatus) {
        setAutomationExecutionStatus(automationExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        withAutomationExecutionStatus(automationExecutionStatus);
    }

    /**
     * <p>
     * The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The status of the execution. Valid values include: Running, Succeeded, Failed, Timed out, or Cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecutionMetadata withAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time the execution started.&gt;
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.&gt;
     */

    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.&gt;
     * </p>
     * 
     * @return The time the execution started.&gt;
     */

    public java.util.Date getExecutionStartTime() {
        return this.executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.&gt;
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withExecutionStartTime(java.util.Date executionStartTime) {
        setExecutionStartTime(executionStartTime);
        return this;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution is still in progress.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished. This is not populated if the execution is still in progress.
     */

    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution is still in progress.
     * </p>
     * 
     * @return The time the execution finished. This is not populated if the execution is still in progress.
     */

    public java.util.Date getExecutionEndTime() {
        return this.executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution is still in progress.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished. This is not populated if the execution is still in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withExecutionEndTime(java.util.Date executionEndTime) {
        setExecutionEndTime(executionEndTime);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     * 
     * @param executedBy
     *        The IAM role ARN of the user who ran the Automation.
     */

    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     * 
     * @return The IAM role ARN of the user who ran the Automation.
     */

    public String getExecutedBy() {
        return this.executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     * 
     * @param executedBy
     *        The IAM role ARN of the user who ran the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withExecutedBy(String executedBy) {
        setExecutedBy(executedBy);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     * 
     * @param logFile
     *        An Amazon S3 bucket where execution information is stored.
     */

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     * 
     * @return An Amazon S3 bucket where execution information is stored.
     */

    public String getLogFile() {
        return this.logFile;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     * 
     * @param logFile
     *        An Amazon S3 bucket where execution information is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withLogFile(String logFile) {
        setLogFile(logFile);
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the Automation document.
     */

    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the Automation document.
     */

    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the Automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        setOutputs(outputs);
        return this;
    }

    public AutomationExecutionMetadata addOutputsEntry(String key, java.util.List<String> value) {
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

    public AutomationExecutionMetadata clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * 
     * @param mode
     *        The Automation execution mode.
     * @see ExecutionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * 
     * @return The Automation execution mode.
     * @see ExecutionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * 
     * @param mode
     *        The Automation execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public AutomationExecutionMetadata withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * 
     * @param mode
     *        The Automation execution mode.
     * @see ExecutionMode
     */

    public void setMode(ExecutionMode mode) {
        withMode(mode);
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * 
     * @param mode
     *        The Automation execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public AutomationExecutionMetadata withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * 
     * @param parentAutomationExecutionId
     *        The ExecutionId of the parent Automation.
     */

    public void setParentAutomationExecutionId(String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * 
     * @return The ExecutionId of the parent Automation.
     */

    public String getParentAutomationExecutionId() {
        return this.parentAutomationExecutionId;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * 
     * @param parentAutomationExecutionId
     *        The ExecutionId of the parent Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withParentAutomationExecutionId(String parentAutomationExecutionId) {
        setParentAutomationExecutionId(parentAutomationExecutionId);
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

    public AutomationExecutionMetadata withCurrentStepName(String currentStepName) {
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

    public AutomationExecutionMetadata withCurrentAction(String currentAction) {
        setCurrentAction(currentAction);
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param failureMessage
     *        The list of execution outputs as defined in the Automation document.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the Automation document.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param failureMessage
     *        The list of execution outputs as defined in the Automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param targetParameterName
     *        The list of execution outputs as defined in the Automation document.
     */

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the Automation document.
     */

    public String getTargetParameterName() {
        return this.targetParameterName;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param targetParameterName
     *        The list of execution outputs as defined in the Automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withTargetParameterName(String targetParameterName) {
        setTargetParameterName(targetParameterName);
        return this;
    }

    /**
     * <p>
     * The targets defined by the user when starting the Automation.
     * </p>
     * 
     * @return The targets defined by the user when starting the Automation.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets defined by the user when starting the Automation.
     * </p>
     * 
     * @param targets
     *        The targets defined by the user when starting the Automation.
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
     * The targets defined by the user when starting the Automation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets defined by the user when starting the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withTargets(Target... targets) {
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
     * The targets defined by the user when starting the Automation.
     * </p>
     * 
     * @param targets
     *        The targets defined by the user when starting the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withTargets(java.util.Collection<Target> targets) {
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

    public AutomationExecutionMetadata withTargetMaps(java.util.Map<String, java.util.List<String>>... targetMaps) {
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

    public AutomationExecutionMetadata withTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     * 
     * @param resolvedTargets
     *        A list of targets that resolved during the execution.
     */

    public void setResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     * 
     * @return A list of targets that resolved during the execution.
     */

    public ResolvedTargets getResolvedTargets() {
        return this.resolvedTargets;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     * 
     * @param resolvedTargets
     *        A list of targets that resolved during the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withResolvedTargets(ResolvedTargets resolvedTargets) {
        setResolvedTargets(resolvedTargets);
        return this;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the Automation.
     * </p>
     * 
     * @param maxConcurrency
     *        The MaxConcurrency value specified by the user when starting the Automation.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the Automation.
     * </p>
     * 
     * @return The MaxConcurrency value specified by the user when starting the Automation.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the Automation.
     * </p>
     * 
     * @param maxConcurrency
     *        The MaxConcurrency value specified by the user when starting the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * 
     * @param maxErrors
     *        The MaxErrors value specified by the user when starting the Automation.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * 
     * @return The MaxErrors value specified by the user when starting the Automation.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * 
     * @param maxErrors
     *        The MaxErrors value specified by the user when starting the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param target
     *        The list of execution outputs as defined in the Automation document.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the Automation document.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * 
     * @param target
     *        The list of execution outputs as defined in the Automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionMetadata withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param automationType
     *        Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount.
     *        CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @see AutomationType
     */

    public void setAutomationType(String automationType) {
        this.automationType = automationType;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount.
     *         CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *         >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     * @see AutomationType
     */

    public String getAutomationType() {
        return this.automationType;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param automationType
     *        Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount.
     *        CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationType
     */

    public AutomationExecutionMetadata withAutomationType(String automationType) {
        setAutomationType(automationType);
        return this;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param automationType
     *        Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount.
     *        CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @see AutomationType
     */

    public void setAutomationType(AutomationType automationType) {
        withAutomationType(automationType);
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount. CrossAccount is
     * an Automation that runs in multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param automationType
     *        Use this filter with <a>DescribeAutomationExecutions</a>. Specify either Local or CrossAccount.
     *        CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationType
     */

    public AutomationExecutionMetadata withAutomationType(AutomationType automationType) {
        this.automationType = automationType.toString();
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
        if (getAutomationExecutionStatus() != null)
            sb.append("AutomationExecutionStatus: ").append(getAutomationExecutionStatus()).append(",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: ").append(getExecutionStartTime()).append(",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: ").append(getExecutionEndTime()).append(",");
        if (getExecutedBy() != null)
            sb.append("ExecutedBy: ").append(getExecutedBy()).append(",");
        if (getLogFile() != null)
            sb.append("LogFile: ").append(getLogFile()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getParentAutomationExecutionId() != null)
            sb.append("ParentAutomationExecutionId: ").append(getParentAutomationExecutionId()).append(",");
        if (getCurrentStepName() != null)
            sb.append("CurrentStepName: ").append(getCurrentStepName()).append(",");
        if (getCurrentAction() != null)
            sb.append("CurrentAction: ").append(getCurrentAction()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
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
        if (getAutomationType() != null)
            sb.append("AutomationType: ").append(getAutomationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecutionMetadata == false)
            return false;
        AutomationExecutionMetadata other = (AutomationExecutionMetadata) obj;
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
        if (other.getAutomationExecutionStatus() == null ^ this.getAutomationExecutionStatus() == null)
            return false;
        if (other.getAutomationExecutionStatus() != null && other.getAutomationExecutionStatus().equals(this.getAutomationExecutionStatus()) == false)
            return false;
        if (other.getExecutionStartTime() == null ^ this.getExecutionStartTime() == null)
            return false;
        if (other.getExecutionStartTime() != null && other.getExecutionStartTime().equals(this.getExecutionStartTime()) == false)
            return false;
        if (other.getExecutionEndTime() == null ^ this.getExecutionEndTime() == null)
            return false;
        if (other.getExecutionEndTime() != null && other.getExecutionEndTime().equals(this.getExecutionEndTime()) == false)
            return false;
        if (other.getExecutedBy() == null ^ this.getExecutedBy() == null)
            return false;
        if (other.getExecutedBy() != null && other.getExecutedBy().equals(this.getExecutedBy()) == false)
            return false;
        if (other.getLogFile() == null ^ this.getLogFile() == null)
            return false;
        if (other.getLogFile() != null && other.getLogFile().equals(this.getLogFile()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getParentAutomationExecutionId() == null ^ this.getParentAutomationExecutionId() == null)
            return false;
        if (other.getParentAutomationExecutionId() != null && other.getParentAutomationExecutionId().equals(this.getParentAutomationExecutionId()) == false)
            return false;
        if (other.getCurrentStepName() == null ^ this.getCurrentStepName() == null)
            return false;
        if (other.getCurrentStepName() != null && other.getCurrentStepName().equals(this.getCurrentStepName()) == false)
            return false;
        if (other.getCurrentAction() == null ^ this.getCurrentAction() == null)
            return false;
        if (other.getCurrentAction() != null && other.getCurrentAction().equals(this.getCurrentAction()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
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
        if (other.getAutomationType() == null ^ this.getAutomationType() == null)
            return false;
        if (other.getAutomationType() != null && other.getAutomationType().equals(this.getAutomationType()) == false)
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
        hashCode = prime * hashCode + ((getAutomationExecutionStatus() == null) ? 0 : getAutomationExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getExecutedBy() == null) ? 0 : getExecutedBy().hashCode());
        hashCode = prime * hashCode + ((getLogFile() == null) ? 0 : getLogFile().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getParentAutomationExecutionId() == null) ? 0 : getParentAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getCurrentStepName() == null) ? 0 : getCurrentStepName().hashCode());
        hashCode = prime * hashCode + ((getCurrentAction() == null) ? 0 : getCurrentAction().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        hashCode = prime * hashCode + ((getResolvedTargets() == null) ? 0 : getResolvedTargets().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getAutomationType() == null) ? 0 : getAutomationType().hashCode());
        return hashCode;
    }

    @Override
    public AutomationExecutionMetadata clone() {
        try {
            return (AutomationExecutionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AutomationExecutionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
