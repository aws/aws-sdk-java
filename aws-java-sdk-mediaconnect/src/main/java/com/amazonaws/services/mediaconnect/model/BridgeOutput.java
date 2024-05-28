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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The output of the bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/BridgeOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BridgeOutput implements Serializable, Cloneable, StructuredPojo {

    private BridgeFlowOutput flowOutput;

    private BridgeNetworkOutput networkOutput;

    /**
     * @param flowOutput
     */

    public void setFlowOutput(BridgeFlowOutput flowOutput) {
        this.flowOutput = flowOutput;
    }

    /**
     * @return
     */

    public BridgeFlowOutput getFlowOutput() {
        return this.flowOutput;
    }

    /**
     * @param flowOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeOutput withFlowOutput(BridgeFlowOutput flowOutput) {
        setFlowOutput(flowOutput);
        return this;
    }

    /**
     * @param networkOutput
     */

    public void setNetworkOutput(BridgeNetworkOutput networkOutput) {
        this.networkOutput = networkOutput;
    }

    /**
     * @return
     */

    public BridgeNetworkOutput getNetworkOutput() {
        return this.networkOutput;
    }

    /**
     * @param networkOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeOutput withNetworkOutput(BridgeNetworkOutput networkOutput) {
        setNetworkOutput(networkOutput);
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
        if (getFlowOutput() != null)
            sb.append("FlowOutput: ").append(getFlowOutput()).append(",");
        if (getNetworkOutput() != null)
            sb.append("NetworkOutput: ").append(getNetworkOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BridgeOutput == false)
            return false;
        BridgeOutput other = (BridgeOutput) obj;
        if (other.getFlowOutput() == null ^ this.getFlowOutput() == null)
            return false;
        if (other.getFlowOutput() != null && other.getFlowOutput().equals(this.getFlowOutput()) == false)
            return false;
        if (other.getNetworkOutput() == null ^ this.getNetworkOutput() == null)
            return false;
        if (other.getNetworkOutput() != null && other.getNetworkOutput().equals(this.getNetworkOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowOutput() == null) ? 0 : getFlowOutput().hashCode());
        hashCode = prime * hashCode + ((getNetworkOutput() == null) ? 0 : getNetworkOutput().hashCode());
        return hashCode;
    }

    @Override
    public BridgeOutput clone() {
        try {
            return (BridgeOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.BridgeOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
