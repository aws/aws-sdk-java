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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Output details listed for an action execution, such as the action execution result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionExecutionOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details of output artifacts of the action that correspond to the action execution.
     * </p>
     */
    private java.util.List<ArtifactDetail> outputArtifacts;
    /**
     * <p>
     * Execution result information listed in the output details for an action execution.
     * </p>
     */
    private ActionExecutionResult executionResult;

    /**
     * <p>
     * Details of output artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @return Details of output artifacts of the action that correspond to the action execution.
     */

    public java.util.List<ArtifactDetail> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * Details of output artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @param outputArtifacts
     *        Details of output artifacts of the action that correspond to the action execution.
     */

    public void setOutputArtifacts(java.util.Collection<ArtifactDetail> outputArtifacts) {
        if (outputArtifacts == null) {
            this.outputArtifacts = null;
            return;
        }

        this.outputArtifacts = new java.util.ArrayList<ArtifactDetail>(outputArtifacts);
    }

    /**
     * <p>
     * Details of output artifacts of the action that correspond to the action execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputArtifacts(java.util.Collection)} or {@link #withOutputArtifacts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputArtifacts
     *        Details of output artifacts of the action that correspond to the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionOutput withOutputArtifacts(ArtifactDetail... outputArtifacts) {
        if (this.outputArtifacts == null) {
            setOutputArtifacts(new java.util.ArrayList<ArtifactDetail>(outputArtifacts.length));
        }
        for (ArtifactDetail ele : outputArtifacts) {
            this.outputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of output artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @param outputArtifacts
     *        Details of output artifacts of the action that correspond to the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionOutput withOutputArtifacts(java.util.Collection<ArtifactDetail> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * <p>
     * Execution result information listed in the output details for an action execution.
     * </p>
     * 
     * @param executionResult
     *        Execution result information listed in the output details for an action execution.
     */

    public void setExecutionResult(ActionExecutionResult executionResult) {
        this.executionResult = executionResult;
    }

    /**
     * <p>
     * Execution result information listed in the output details for an action execution.
     * </p>
     * 
     * @return Execution result information listed in the output details for an action execution.
     */

    public ActionExecutionResult getExecutionResult() {
        return this.executionResult;
    }

    /**
     * <p>
     * Execution result information listed in the output details for an action execution.
     * </p>
     * 
     * @param executionResult
     *        Execution result information listed in the output details for an action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionOutput withExecutionResult(ActionExecutionResult executionResult) {
        setExecutionResult(executionResult);
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
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getExecutionResult() != null)
            sb.append("ExecutionResult: ").append(getExecutionResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionExecutionOutput == false)
            return false;
        ActionExecutionOutput other = (ActionExecutionOutput) obj;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getExecutionResult() == null ^ this.getExecutionResult() == null)
            return false;
        if (other.getExecutionResult() != null && other.getExecutionResult().equals(this.getExecutionResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getExecutionResult() == null) ? 0 : getExecutionResult().hashCode());
        return hashCode;
    }

    @Override
    public ActionExecutionOutput clone() {
        try {
            return (ActionExecutionOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionExecutionOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
