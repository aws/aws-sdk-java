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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to add outputs to the specified flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowOutputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFlowOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The flow that you want to add outputs to. */
    private String flowArn;
    /** A list of outputs that you want to add. */
    private java.util.List<AddOutputRequest> outputs;

    /**
     * The flow that you want to add outputs to.
     * 
     * @param flowArn
     *        The flow that you want to add outputs to.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to add outputs to.
     * 
     * @return The flow that you want to add outputs to.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to add outputs to.
     * 
     * @param flowArn
     *        The flow that you want to add outputs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowOutputsRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * A list of outputs that you want to add.
     * 
     * @return A list of outputs that you want to add.
     */

    public java.util.List<AddOutputRequest> getOutputs() {
        return outputs;
    }

    /**
     * A list of outputs that you want to add.
     * 
     * @param outputs
     *        A list of outputs that you want to add.
     */

    public void setOutputs(java.util.Collection<AddOutputRequest> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AddOutputRequest>(outputs);
    }

    /**
     * A list of outputs that you want to add.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        A list of outputs that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowOutputsRequest withOutputs(AddOutputRequest... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AddOutputRequest>(outputs.length));
        }
        for (AddOutputRequest ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * A list of outputs that you want to add.
     * 
     * @param outputs
     *        A list of outputs that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowOutputsRequest withOutputs(java.util.Collection<AddOutputRequest> outputs) {
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
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

        if (obj instanceof AddFlowOutputsRequest == false)
            return false;
        AddFlowOutputsRequest other = (AddFlowOutputsRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
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

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public AddFlowOutputsRequest clone() {
        return (AddFlowOutputsRequest) super.clone();
    }

}
