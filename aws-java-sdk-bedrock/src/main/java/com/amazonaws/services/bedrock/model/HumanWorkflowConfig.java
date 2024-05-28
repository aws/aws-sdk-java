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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains <code>SageMakerFlowDefinition</code> object. The object is used to specify the prompt dataset, task type,
 * rating method and metric names.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/HumanWorkflowConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanWorkflowConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the flow definition
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * Instructions for the flow definition
     * </p>
     */
    private String instructions;

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the flow definition
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Number (ARN) for the flow definition
     */

    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the flow definition
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) for the flow definition
     */

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the flow definition
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Number (ARN) for the flow definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanWorkflowConfig withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * Instructions for the flow definition
     * </p>
     * 
     * @param instructions
     *        Instructions for the flow definition
     */

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * <p>
     * Instructions for the flow definition
     * </p>
     * 
     * @return Instructions for the flow definition
     */

    public String getInstructions() {
        return this.instructions;
    }

    /**
     * <p>
     * Instructions for the flow definition
     * </p>
     * 
     * @param instructions
     *        Instructions for the flow definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanWorkflowConfig withInstructions(String instructions) {
        setInstructions(instructions);
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
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getInstructions() != null)
            sb.append("Instructions: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanWorkflowConfig == false)
            return false;
        HumanWorkflowConfig other = (HumanWorkflowConfig) obj;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getInstructions() == null ^ this.getInstructions() == null)
            return false;
        if (other.getInstructions() != null && other.getInstructions().equals(this.getInstructions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        return hashCode;
    }

    @Override
    public HumanWorkflowConfig clone() {
        try {
            return (HumanWorkflowConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.HumanWorkflowConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
