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
 * Specifies the steps in the workflow, as well as the steps to execute in case of any errors during workflow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ExecutionResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     */
    private java.util.List<ExecutionStepResult> steps;
    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     */
    private java.util.List<ExecutionStepResult> onExceptionSteps;

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * 
     * @return Specifies the details for the steps that are in the specified workflow.
     */

    public java.util.List<ExecutionStepResult> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.
     */

    public void setSteps(java.util.Collection<ExecutionStepResult> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<ExecutionStepResult>(steps);
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResults withSteps(ExecutionStepResult... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<ExecutionStepResult>(steps.length));
        }
        for (ExecutionStepResult ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the details for the steps that are in the specified workflow.
     * </p>
     * 
     * @param steps
     *        Specifies the details for the steps that are in the specified workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResults withSteps(java.util.Collection<ExecutionStepResult> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * 
     * @return Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     */

    public java.util.List<ExecutionStepResult> getOnExceptionSteps() {
        return onExceptionSteps;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     */

    public void setOnExceptionSteps(java.util.Collection<ExecutionStepResult> onExceptionSteps) {
        if (onExceptionSteps == null) {
            this.onExceptionSteps = null;
            return;
        }

        this.onExceptionSteps = new java.util.ArrayList<ExecutionStepResult>(onExceptionSteps);
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnExceptionSteps(java.util.Collection)} or {@link #withOnExceptionSteps(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResults withOnExceptionSteps(ExecutionStepResult... onExceptionSteps) {
        if (this.onExceptionSteps == null) {
            setOnExceptionSteps(new java.util.ArrayList<ExecutionStepResult>(onExceptionSteps.length));
        }
        for (ExecutionStepResult ele : onExceptionSteps) {
            this.onExceptionSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * </p>
     * 
     * @param onExceptionSteps
     *        Specifies the steps (actions) to take if errors are encountered during execution of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResults withOnExceptionSteps(java.util.Collection<ExecutionStepResult> onExceptionSteps) {
        setOnExceptionSteps(onExceptionSteps);
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
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getOnExceptionSteps() != null)
            sb.append("OnExceptionSteps: ").append(getOnExceptionSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionResults == false)
            return false;
        ExecutionResults other = (ExecutionResults) obj;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getOnExceptionSteps() == null ^ this.getOnExceptionSteps() == null)
            return false;
        if (other.getOnExceptionSteps() != null && other.getOnExceptionSteps().equals(this.getOnExceptionSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getOnExceptionSteps() == null) ? 0 : getOnExceptionSteps().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionResults clone() {
        try {
            return (ExecutionResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ExecutionResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
