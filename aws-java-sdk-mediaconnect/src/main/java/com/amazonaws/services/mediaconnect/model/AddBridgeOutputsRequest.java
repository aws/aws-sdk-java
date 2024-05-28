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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to add outputs to the specified bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeOutputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddBridgeOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the bridge that you want to update. */
    private String bridgeArn;
    /** The outputs that you want to add to this bridge. */
    private java.util.List<AddBridgeOutputRequest> outputs;

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @return The ARN of the bridge that you want to update.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeOutputsRequest withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @return The outputs that you want to add to this bridge.
     */

    public java.util.List<AddBridgeOutputRequest> getOutputs() {
        return outputs;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     */

    public void setOutputs(java.util.Collection<AddBridgeOutputRequest> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AddBridgeOutputRequest>(outputs);
    }

    /**
     * The outputs that you want to add to this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeOutputsRequest withOutputs(AddBridgeOutputRequest... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AddBridgeOutputRequest>(outputs.length));
        }
        for (AddBridgeOutputRequest ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeOutputsRequest withOutputs(java.util.Collection<AddBridgeOutputRequest> outputs) {
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
        if (getBridgeArn() != null)
            sb.append("BridgeArn: ").append(getBridgeArn()).append(",");
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

        if (obj instanceof AddBridgeOutputsRequest == false)
            return false;
        AddBridgeOutputsRequest other = (AddBridgeOutputsRequest) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
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

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public AddBridgeOutputsRequest clone() {
        return (AddBridgeOutputsRequest) super.clone();
    }

}
