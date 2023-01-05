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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A node interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NodeInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The node interface's inputs.
     * </p>
     */
    private java.util.List<NodeInputPort> inputs;
    /**
     * <p>
     * The node interface's outputs.
     * </p>
     */
    private java.util.List<NodeOutputPort> outputs;

    /**
     * <p>
     * The node interface's inputs.
     * </p>
     * 
     * @return The node interface's inputs.
     */

    public java.util.List<NodeInputPort> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The node interface's inputs.
     * </p>
     * 
     * @param inputs
     *        The node interface's inputs.
     */

    public void setInputs(java.util.Collection<NodeInputPort> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<NodeInputPort>(inputs);
    }

    /**
     * <p>
     * The node interface's inputs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The node interface's inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInterface withInputs(NodeInputPort... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<NodeInputPort>(inputs.length));
        }
        for (NodeInputPort ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node interface's inputs.
     * </p>
     * 
     * @param inputs
     *        The node interface's inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInterface withInputs(java.util.Collection<NodeInputPort> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The node interface's outputs.
     * </p>
     * 
     * @return The node interface's outputs.
     */

    public java.util.List<NodeOutputPort> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The node interface's outputs.
     * </p>
     * 
     * @param outputs
     *        The node interface's outputs.
     */

    public void setOutputs(java.util.Collection<NodeOutputPort> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<NodeOutputPort>(outputs);
    }

    /**
     * <p>
     * The node interface's outputs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The node interface's outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInterface withOutputs(NodeOutputPort... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<NodeOutputPort>(outputs.length));
        }
        for (NodeOutputPort ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node interface's outputs.
     * </p>
     * 
     * @param outputs
     *        The node interface's outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInterface withOutputs(java.util.Collection<NodeOutputPort> outputs) {
        setOutputs(outputs);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
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

        if (obj instanceof NodeInterface == false)
            return false;
        NodeInterface other = (NodeInterface) obj;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
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

        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public NodeInterface clone() {
        try {
            return (NodeInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NodeInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
