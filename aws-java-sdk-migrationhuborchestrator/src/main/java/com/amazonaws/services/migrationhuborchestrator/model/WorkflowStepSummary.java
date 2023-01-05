/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the step in a migration workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/WorkflowStepSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the step.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     */
    private String stepActionType;
    /**
     * <p>
     * The owner of the step.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The previous step.
     * </p>
     */
    private java.util.List<String> previous;
    /**
     * <p>
     * The next step.
     * </p>
     */
    private java.util.List<String> next;
    /**
     * <p>
     * The status of the step.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The number of servers that have been migrated.
     * </p>
     */
    private Integer noOfSrvCompleted;
    /**
     * <p>
     * The number of servers that have failed to migrate.
     * </p>
     */
    private Integer noOfSrvFailed;
    /**
     * <p>
     * The total number of servers that have been migrated.
     * </p>
     */
    private Integer totalNoOfSrv;
    /**
     * <p>
     * The description of the step.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The location of the script.
     * </p>
     */
    private String scriptLocation;

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @param stepId
     *        The ID of the step.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @return The ID of the step.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @param stepId
     *        The ID of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return The name of the step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @see StepActionType
     */

    public void setStepActionType(String stepActionType) {
        this.stepActionType = stepActionType;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @return The action type of the step. You must run and update the status of a manual step for the workflow to
     *         continue after the completion of the step.
     * @see StepActionType
     */

    public String getStepActionType() {
        return this.stepActionType;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepActionType
     */

    public WorkflowStepSummary withStepActionType(String stepActionType) {
        setStepActionType(stepActionType);
        return this;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepActionType
     */

    public WorkflowStepSummary withStepActionType(StepActionType stepActionType) {
        this.stepActionType = stepActionType.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @see Owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @return The owner of the step.
     * @see Owner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public WorkflowStepSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public WorkflowStepSummary withOwner(Owner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @return The previous step.
     */

    public java.util.List<String> getPrevious() {
        return previous;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @param previous
     *        The previous step.
     */

    public void setPrevious(java.util.Collection<String> previous) {
        if (previous == null) {
            this.previous = null;
            return;
        }

        this.previous = new java.util.ArrayList<String>(previous);
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrevious(java.util.Collection)} or {@link #withPrevious(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param previous
     *        The previous step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withPrevious(String... previous) {
        if (this.previous == null) {
            setPrevious(new java.util.ArrayList<String>(previous.length));
        }
        for (String ele : previous) {
            this.previous.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @param previous
     *        The previous step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withPrevious(java.util.Collection<String> previous) {
        setPrevious(previous);
        return this;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @return The next step.
     */

    public java.util.List<String> getNext() {
        return next;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @param next
     *        The next step.
     */

    public void setNext(java.util.Collection<String> next) {
        if (next == null) {
            this.next = null;
            return;
        }

        this.next = new java.util.ArrayList<String>(next);
    }

    /**
     * <p>
     * The next step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNext(java.util.Collection)} or {@link #withNext(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param next
     *        The next step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withNext(String... next) {
        if (this.next == null) {
            setNext(new java.util.ArrayList<String>(next.length));
        }
        for (String ele : next) {
            this.next.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @param next
     *        The next step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withNext(java.util.Collection<String> next) {
        setNext(next);
        return this;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @see StepStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @return The status of the step.
     * @see StepStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public WorkflowStepSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public WorkflowStepSummary withStatus(StepStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @return The status message of the migration workflow.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The number of servers that have been migrated.
     * </p>
     * 
     * @param noOfSrvCompleted
     *        The number of servers that have been migrated.
     */

    public void setNoOfSrvCompleted(Integer noOfSrvCompleted) {
        this.noOfSrvCompleted = noOfSrvCompleted;
    }

    /**
     * <p>
     * The number of servers that have been migrated.
     * </p>
     * 
     * @return The number of servers that have been migrated.
     */

    public Integer getNoOfSrvCompleted() {
        return this.noOfSrvCompleted;
    }

    /**
     * <p>
     * The number of servers that have been migrated.
     * </p>
     * 
     * @param noOfSrvCompleted
     *        The number of servers that have been migrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withNoOfSrvCompleted(Integer noOfSrvCompleted) {
        setNoOfSrvCompleted(noOfSrvCompleted);
        return this;
    }

    /**
     * <p>
     * The number of servers that have failed to migrate.
     * </p>
     * 
     * @param noOfSrvFailed
     *        The number of servers that have failed to migrate.
     */

    public void setNoOfSrvFailed(Integer noOfSrvFailed) {
        this.noOfSrvFailed = noOfSrvFailed;
    }

    /**
     * <p>
     * The number of servers that have failed to migrate.
     * </p>
     * 
     * @return The number of servers that have failed to migrate.
     */

    public Integer getNoOfSrvFailed() {
        return this.noOfSrvFailed;
    }

    /**
     * <p>
     * The number of servers that have failed to migrate.
     * </p>
     * 
     * @param noOfSrvFailed
     *        The number of servers that have failed to migrate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withNoOfSrvFailed(Integer noOfSrvFailed) {
        setNoOfSrvFailed(noOfSrvFailed);
        return this;
    }

    /**
     * <p>
     * The total number of servers that have been migrated.
     * </p>
     * 
     * @param totalNoOfSrv
     *        The total number of servers that have been migrated.
     */

    public void setTotalNoOfSrv(Integer totalNoOfSrv) {
        this.totalNoOfSrv = totalNoOfSrv;
    }

    /**
     * <p>
     * The total number of servers that have been migrated.
     * </p>
     * 
     * @return The total number of servers that have been migrated.
     */

    public Integer getTotalNoOfSrv() {
        return this.totalNoOfSrv;
    }

    /**
     * <p>
     * The total number of servers that have been migrated.
     * </p>
     * 
     * @param totalNoOfSrv
     *        The total number of servers that have been migrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withTotalNoOfSrv(Integer totalNoOfSrv) {
        setTotalNoOfSrv(totalNoOfSrv);
        return this;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @return The description of the step.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The location of the script.
     * </p>
     * 
     * @param scriptLocation
     *        The location of the script.
     */

    public void setScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    /**
     * <p>
     * The location of the script.
     * </p>
     * 
     * @return The location of the script.
     */

    public String getScriptLocation() {
        return this.scriptLocation;
    }

    /**
     * <p>
     * The location of the script.
     * </p>
     * 
     * @param scriptLocation
     *        The location of the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepSummary withScriptLocation(String scriptLocation) {
        setScriptLocation(scriptLocation);
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
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStepActionType() != null)
            sb.append("StepActionType: ").append(getStepActionType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getNoOfSrvCompleted() != null)
            sb.append("NoOfSrvCompleted: ").append(getNoOfSrvCompleted()).append(",");
        if (getNoOfSrvFailed() != null)
            sb.append("NoOfSrvFailed: ").append(getNoOfSrvFailed()).append(",");
        if (getTotalNoOfSrv() != null)
            sb.append("TotalNoOfSrv: ").append(getTotalNoOfSrv()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScriptLocation() != null)
            sb.append("ScriptLocation: ").append(getScriptLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStepSummary == false)
            return false;
        WorkflowStepSummary other = (WorkflowStepSummary) obj;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStepActionType() == null ^ this.getStepActionType() == null)
            return false;
        if (other.getStepActionType() != null && other.getStepActionType().equals(this.getStepActionType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getNoOfSrvCompleted() == null ^ this.getNoOfSrvCompleted() == null)
            return false;
        if (other.getNoOfSrvCompleted() != null && other.getNoOfSrvCompleted().equals(this.getNoOfSrvCompleted()) == false)
            return false;
        if (other.getNoOfSrvFailed() == null ^ this.getNoOfSrvFailed() == null)
            return false;
        if (other.getNoOfSrvFailed() != null && other.getNoOfSrvFailed().equals(this.getNoOfSrvFailed()) == false)
            return false;
        if (other.getTotalNoOfSrv() == null ^ this.getTotalNoOfSrv() == null)
            return false;
        if (other.getTotalNoOfSrv() != null && other.getTotalNoOfSrv().equals(this.getTotalNoOfSrv()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScriptLocation() == null ^ this.getScriptLocation() == null)
            return false;
        if (other.getScriptLocation() != null && other.getScriptLocation().equals(this.getScriptLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStepActionType() == null) ? 0 : getStepActionType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getNoOfSrvCompleted() == null) ? 0 : getNoOfSrvCompleted().hashCode());
        hashCode = prime * hashCode + ((getNoOfSrvFailed() == null) ? 0 : getNoOfSrvFailed().hashCode());
        hashCode = prime * hashCode + ((getTotalNoOfSrv() == null) ? 0 : getTotalNoOfSrv().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScriptLocation() == null) ? 0 : getScriptLocation().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStepSummary clone() {
        try {
            return (WorkflowStepSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.WorkflowStepSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
