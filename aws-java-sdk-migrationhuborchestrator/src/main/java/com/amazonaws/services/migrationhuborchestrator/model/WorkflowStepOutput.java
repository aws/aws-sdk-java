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
 * The output of a step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/WorkflowStepOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the output.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Determine if an output is required from a step.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The value of the output.
     * </p>
     */
    private WorkflowStepOutputUnion value;

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

    public WorkflowStepOutput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the output.
     * </p>
     * 
     * @param dataType
     *        The data type of the output.
     * @see DataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the output.
     * </p>
     * 
     * @return The data type of the output.
     * @see DataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the output.
     * </p>
     * 
     * @param dataType
     *        The data type of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public WorkflowStepOutput withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the output.
     * </p>
     * 
     * @param dataType
     *        The data type of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public WorkflowStepOutput withDataType(DataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * Determine if an output is required from a step.
     * </p>
     * 
     * @param required
     *        Determine if an output is required from a step.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Determine if an output is required from a step.
     * </p>
     * 
     * @return Determine if an output is required from a step.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Determine if an output is required from a step.
     * </p>
     * 
     * @param required
     *        Determine if an output is required from a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutput withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Determine if an output is required from a step.
     * </p>
     * 
     * @return Determine if an output is required from a step.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The value of the output.
     * </p>
     * 
     * @param value
     *        The value of the output.
     */

    public void setValue(WorkflowStepOutputUnion value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the output.
     * </p>
     * 
     * @return The value of the output.
     */

    public WorkflowStepOutputUnion getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the output.
     * </p>
     * 
     * @param value
     *        The value of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutput withValue(WorkflowStepOutputUnion value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStepOutput == false)
            return false;
        WorkflowStepOutput other = (WorkflowStepOutput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStepOutput clone() {
        try {
            return (WorkflowStepOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.WorkflowStepOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
