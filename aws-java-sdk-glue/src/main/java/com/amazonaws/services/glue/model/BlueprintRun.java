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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a blueprint run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BlueprintRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueprintRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The run ID for this blueprint run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has an
     * error, there will not be a workflow created.
     * </p>
     */
    private String workflowName;
    /**
     * <p>
     * The state of the blueprint run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running — The blueprint run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded — The blueprint run completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint run failed and rollback is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rolling Back — The blueprint run failed and rollback is in progress.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The date and time that the blueprint run started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The date and time that the blueprint run completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * Indicates any errors that are seen while running the blueprint.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * If there are any errors while creating the entities of a workflow, we try to roll back the created entities until
     * that point and delete them. This attribute indicates the errors seen while trying to delete the entities that are
     * created.
     * </p>
     */
    private String rollbackErrorMessage;
    /**
     * <p>
     * The blueprint parameters as a string. You will have to provide a value for each key that is required from the
     * parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and other
     * entities of a workflow.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     */

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The run ID for this blueprint run.
     * </p>
     * 
     * @param runId
     *        The run ID for this blueprint run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The run ID for this blueprint run.
     * </p>
     * 
     * @return The run ID for this blueprint run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The run ID for this blueprint run.
     * </p>
     * 
     * @param runId
     *        The run ID for this blueprint run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has an
     * error, there will not be a workflow created.
     * </p>
     * 
     * @param workflowName
     *        The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has
     *        an error, there will not be a workflow created.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has an
     * error, there will not be a workflow created.
     * </p>
     * 
     * @return The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has
     *         an error, there will not be a workflow created.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has an
     * error, there will not be a workflow created.
     * </p>
     * 
     * @param workflowName
     *        The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has
     *        an error, there will not be a workflow created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
        return this;
    }

    /**
     * <p>
     * The state of the blueprint run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running — The blueprint run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded — The blueprint run completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint run failed and rollback is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rolling Back — The blueprint run failed and rollback is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the blueprint run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running — The blueprint run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded — The blueprint run completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint run failed and rollback is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rolling Back — The blueprint run failed and rollback is in progress.
     *        </p>
     *        </li>
     * @see BlueprintRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the blueprint run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running — The blueprint run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded — The blueprint run completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint run failed and rollback is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rolling Back — The blueprint run failed and rollback is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the blueprint run. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running — The blueprint run is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded — The blueprint run completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed — The blueprint run failed and rollback is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rolling Back — The blueprint run failed and rollback is in progress.
     *         </p>
     *         </li>
     * @see BlueprintRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the blueprint run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running — The blueprint run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded — The blueprint run completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint run failed and rollback is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rolling Back — The blueprint run failed and rollback is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the blueprint run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running — The blueprint run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded — The blueprint run completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint run failed and rollback is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rolling Back — The blueprint run failed and rollback is in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintRunState
     */

    public BlueprintRun withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the blueprint run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running — The blueprint run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded — The blueprint run completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint run failed and rollback is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rolling Back — The blueprint run failed and rollback is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the blueprint run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running — The blueprint run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded — The blueprint run completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint run failed and rollback is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rolling Back — The blueprint run failed and rollback is in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintRunState
     */

    public BlueprintRun withState(BlueprintRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the blueprint run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time that the blueprint run started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time that the blueprint run started.
     * </p>
     * 
     * @return The date and time that the blueprint run started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time that the blueprint run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time that the blueprint run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The date and time that the blueprint run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time that the blueprint run completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time that the blueprint run completed.
     * </p>
     * 
     * @return The date and time that the blueprint run completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time that the blueprint run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time that the blueprint run completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * Indicates any errors that are seen while running the blueprint.
     * </p>
     * 
     * @param errorMessage
     *        Indicates any errors that are seen while running the blueprint.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Indicates any errors that are seen while running the blueprint.
     * </p>
     * 
     * @return Indicates any errors that are seen while running the blueprint.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Indicates any errors that are seen while running the blueprint.
     * </p>
     * 
     * @param errorMessage
     *        Indicates any errors that are seen while running the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * If there are any errors while creating the entities of a workflow, we try to roll back the created entities until
     * that point and delete them. This attribute indicates the errors seen while trying to delete the entities that are
     * created.
     * </p>
     * 
     * @param rollbackErrorMessage
     *        If there are any errors while creating the entities of a workflow, we try to roll back the created
     *        entities until that point and delete them. This attribute indicates the errors seen while trying to delete
     *        the entities that are created.
     */

    public void setRollbackErrorMessage(String rollbackErrorMessage) {
        this.rollbackErrorMessage = rollbackErrorMessage;
    }

    /**
     * <p>
     * If there are any errors while creating the entities of a workflow, we try to roll back the created entities until
     * that point and delete them. This attribute indicates the errors seen while trying to delete the entities that are
     * created.
     * </p>
     * 
     * @return If there are any errors while creating the entities of a workflow, we try to roll back the created
     *         entities until that point and delete them. This attribute indicates the errors seen while trying to
     *         delete the entities that are created.
     */

    public String getRollbackErrorMessage() {
        return this.rollbackErrorMessage;
    }

    /**
     * <p>
     * If there are any errors while creating the entities of a workflow, we try to roll back the created entities until
     * that point and delete them. This attribute indicates the errors seen while trying to delete the entities that are
     * created.
     * </p>
     * 
     * @param rollbackErrorMessage
     *        If there are any errors while creating the entities of a workflow, we try to roll back the created
     *        entities until that point and delete them. This attribute indicates the errors seen while trying to delete
     *        the entities that are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withRollbackErrorMessage(String rollbackErrorMessage) {
        setRollbackErrorMessage(rollbackErrorMessage);
        return this;
    }

    /**
     * <p>
     * The blueprint parameters as a string. You will have to provide a value for each key that is required from the
     * parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     * </p>
     * 
     * @param parameters
     *        The blueprint parameters as a string. You will have to provide a value for each key that is required from
     *        the parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The blueprint parameters as a string. You will have to provide a value for each key that is required from the
     * parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     * </p>
     * 
     * @return The blueprint parameters as a string. You will have to provide a value for each key that is required from
     *         the parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The blueprint parameters as a string. You will have to provide a value for each key that is required from the
     * parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     * </p>
     * 
     * @param parameters
     *        The blueprint parameters as a string. You will have to provide a value for each key that is required from
     *        the parameter spec that is defined in the <code>Blueprint$ParameterSpec</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and other
     * entities of a workflow.
     * </p>
     * 
     * @param roleArn
     *        The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and
     *        other entities of a workflow.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and other
     * entities of a workflow.
     * </p>
     * 
     * @return The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and
     *         other entities of a workflow.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and other
     * entities of a workflow.
     * </p>
     * 
     * @param roleArn
     *        The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and
     *        other entities of a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueprintRun withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getBlueprintName() != null)
            sb.append("BlueprintName: ").append(getBlueprintName()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getRollbackErrorMessage() != null)
            sb.append("RollbackErrorMessage: ").append(getRollbackErrorMessage()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueprintRun == false)
            return false;
        BlueprintRun other = (BlueprintRun) obj;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getRollbackErrorMessage() == null ^ this.getRollbackErrorMessage() == null)
            return false;
        if (other.getRollbackErrorMessage() != null && other.getRollbackErrorMessage().equals(this.getRollbackErrorMessage()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getRollbackErrorMessage() == null) ? 0 : getRollbackErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public BlueprintRun clone() {
        try {
            return (BlueprintRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BlueprintRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
