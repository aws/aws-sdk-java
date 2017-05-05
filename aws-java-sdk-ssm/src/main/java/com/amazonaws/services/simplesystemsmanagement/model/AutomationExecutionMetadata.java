/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The IAM role ARN of the user who executed the Automation.
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
        this.automationExecutionStatus = automationExecutionStatus.toString();
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
        setAutomationExecutionStatus(automationExecutionStatus);
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
     * The IAM role ARN of the user who executed the Automation.
     * </p>
     * 
     * @param executedBy
     *        The IAM role ARN of the user who executed the Automation.
     */

    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who executed the Automation.
     * </p>
     * 
     * @return The IAM role ARN of the user who executed the Automation.
     */

    public String getExecutedBy() {
        return this.executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who executed the Automation.
     * </p>
     * 
     * @param executedBy
     *        The IAM role ARN of the user who executed the Automation.
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
            sb.append("Outputs: ").append(getOutputs());
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
