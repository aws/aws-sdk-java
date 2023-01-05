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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the following details for the step: error (if any), outputs (if any), and the step type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ExecutionStepResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStepResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One of the available step types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     */
    private String stepType;
    /**
     * <p>
     * The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     * <code>TAG</code>.
     * </p>
     */
    private String outputs;
    /**
     * <p>
     * Specifies the details for an error, if it occurred during execution of the specified workflow step.
     * </p>
     */
    private ExecutionError error;

    /**
     * <p>
     * One of the available step types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stepType
     *        One of the available step types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @see WorkflowStepType
     */

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    /**
     * <p>
     * One of the available step types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the available step types.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>COPY</i>: Copy the file to another location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DELETE</i>: Delete the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TAG</i>: Add a tag to the file.
     *         </p>
     *         </li>
     * @see WorkflowStepType
     */

    public String getStepType() {
        return this.stepType;
    }

    /**
     * <p>
     * One of the available step types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stepType
     *        One of the available step types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepType
     */

    public ExecutionStepResult withStepType(String stepType) {
        setStepType(stepType);
        return this;
    }

    /**
     * <p>
     * One of the available step types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>COPY</i>: Copy the file to another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETE</i>: Delete the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TAG</i>: Add a tag to the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stepType
     *        One of the available step types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>COPY</i>: Copy the file to another location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CUSTOM</i>: Perform a custom step with an Lambda function target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETE</i>: Delete the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TAG</i>: Add a tag to the file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepType
     */

    public ExecutionStepResult withStepType(WorkflowStepType stepType) {
        this.stepType = stepType.toString();
        return this;
    }

    /**
     * <p>
     * The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     * <code>TAG</code>.
     * </p>
     * 
     * @param outputs
     *        The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     *        <code>TAG</code>.
     */

    public void setOutputs(String outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     * <code>TAG</code>.
     * </p>
     * 
     * @return The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     *         <code>TAG</code>.
     */

    public String getOutputs() {
        return this.outputs;
    }

    /**
     * <p>
     * The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     * <code>TAG</code>.
     * </p>
     * 
     * @param outputs
     *        The values for the key/value pair applied as a tag to the file. Only applicable if the step type is
     *        <code>TAG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStepResult withOutputs(String outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * Specifies the details for an error, if it occurred during execution of the specified workflow step.
     * </p>
     * 
     * @param error
     *        Specifies the details for an error, if it occurred during execution of the specified workflow step.
     */

    public void setError(ExecutionError error) {
        this.error = error;
    }

    /**
     * <p>
     * Specifies the details for an error, if it occurred during execution of the specified workflow step.
     * </p>
     * 
     * @return Specifies the details for an error, if it occurred during execution of the specified workflow step.
     */

    public ExecutionError getError() {
        return this.error;
    }

    /**
     * <p>
     * Specifies the details for an error, if it occurred during execution of the specified workflow step.
     * </p>
     * 
     * @param error
     *        Specifies the details for an error, if it occurred during execution of the specified workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStepResult withError(ExecutionError error) {
        setError(error);
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
        if (getStepType() != null)
            sb.append("StepType: ").append(getStepType()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionStepResult == false)
            return false;
        ExecutionStepResult other = (ExecutionStepResult) obj;
        if (other.getStepType() == null ^ this.getStepType() == null)
            return false;
        if (other.getStepType() != null && other.getStepType().equals(this.getStepType()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepType() == null) ? 0 : getStepType().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionStepResult clone() {
        try {
            return (ExecutionStepResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ExecutionStepResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
