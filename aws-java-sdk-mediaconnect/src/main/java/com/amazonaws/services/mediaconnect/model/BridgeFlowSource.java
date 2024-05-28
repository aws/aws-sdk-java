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
 * The source of the bridge. A flow source originates in MediaConnect as an existing cloud flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/BridgeFlowSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BridgeFlowSource implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the cloud flow used as a source of this bridge. */
    private String flowArn;
    /** The name of the VPC interface attachment to use for this source. */
    private VpcInterfaceAttachment flowVpcInterfaceAttachment;
    /** The name of the flow source. */
    private String name;
    /** The Amazon Resource Number (ARN) of the output. */
    private String outputArn;

    /**
     * The ARN of the cloud flow used as a source of this bridge.
     * 
     * @param flowArn
     *        The ARN of the cloud flow used as a source of this bridge.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the cloud flow used as a source of this bridge.
     * 
     * @return The ARN of the cloud flow used as a source of this bridge.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the cloud flow used as a source of this bridge.
     * 
     * @param flowArn
     *        The ARN of the cloud flow used as a source of this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowSource withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The name of the VPC interface attachment to use for this source.
     * 
     * @param flowVpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this source.
     */

    public void setFlowVpcInterfaceAttachment(VpcInterfaceAttachment flowVpcInterfaceAttachment) {
        this.flowVpcInterfaceAttachment = flowVpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this source.
     * 
     * @return The name of the VPC interface attachment to use for this source.
     */

    public VpcInterfaceAttachment getFlowVpcInterfaceAttachment() {
        return this.flowVpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this source.
     * 
     * @param flowVpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowSource withFlowVpcInterfaceAttachment(VpcInterfaceAttachment flowVpcInterfaceAttachment) {
        setFlowVpcInterfaceAttachment(flowVpcInterfaceAttachment);
        return this;
    }

    /**
     * The name of the flow source.
     * 
     * @param name
     *        The name of the flow source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the flow source.
     * 
     * @return The name of the flow source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the flow source.
     * 
     * @param name
     *        The name of the flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The Amazon Resource Number (ARN) of the output.
     * 
     * @param outputArn
     *        The Amazon Resource Number (ARN) of the output.
     */

    public void setOutputArn(String outputArn) {
        this.outputArn = outputArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the output.
     * 
     * @return The Amazon Resource Number (ARN) of the output.
     */

    public String getOutputArn() {
        return this.outputArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the output.
     * 
     * @param outputArn
     *        The Amazon Resource Number (ARN) of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeFlowSource withOutputArn(String outputArn) {
        setOutputArn(outputArn);
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
        if (getFlowVpcInterfaceAttachment() != null)
            sb.append("FlowVpcInterfaceAttachment: ").append(getFlowVpcInterfaceAttachment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputArn() != null)
            sb.append("OutputArn: ").append(getOutputArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BridgeFlowSource == false)
            return false;
        BridgeFlowSource other = (BridgeFlowSource) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getFlowVpcInterfaceAttachment() == null ^ this.getFlowVpcInterfaceAttachment() == null)
            return false;
        if (other.getFlowVpcInterfaceAttachment() != null && other.getFlowVpcInterfaceAttachment().equals(this.getFlowVpcInterfaceAttachment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputArn() == null ^ this.getOutputArn() == null)
            return false;
        if (other.getOutputArn() != null && other.getOutputArn().equals(this.getOutputArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getFlowVpcInterfaceAttachment() == null) ? 0 : getFlowVpcInterfaceAttachment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputArn() == null) ? 0 : getOutputArn().hashCode());
        return hashCode;
    }

    @Override
    public BridgeFlowSource clone() {
        try {
            return (BridgeFlowSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.BridgeFlowSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
