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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specific task, step, and parameters to include.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssignedTaskRunSessionActionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignedTaskRunSessionActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters to include.
     * </p>
     */
    private java.util.Map<String, TaskParameterValue> parameters;
    /**
     * <p>
     * The step ID.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The parameters to include.
     * </p>
     * 
     * @return The parameters to include.
     */

    public java.util.Map<String, TaskParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters to include.
     * </p>
     * 
     * @param parameters
     *        The parameters to include.
     */

    public void setParameters(java.util.Map<String, TaskParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters to include.
     * </p>
     * 
     * @param parameters
     *        The parameters to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedTaskRunSessionActionDefinition withParameters(java.util.Map<String, TaskParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see AssignedTaskRunSessionActionDefinition#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssignedTaskRunSessionActionDefinition addParametersEntry(String key, TaskParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TaskParameterValue>();
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

    public AssignedTaskRunSessionActionDefinition clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @return The step ID.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedTaskRunSessionActionDefinition withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedTaskRunSessionActionDefinition withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignedTaskRunSessionActionDefinition == false)
            return false;
        AssignedTaskRunSessionActionDefinition other = (AssignedTaskRunSessionActionDefinition) obj;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public AssignedTaskRunSessionActionDefinition clone() {
        try {
            return (AssignedTaskRunSessionActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.AssignedTaskRunSessionActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
