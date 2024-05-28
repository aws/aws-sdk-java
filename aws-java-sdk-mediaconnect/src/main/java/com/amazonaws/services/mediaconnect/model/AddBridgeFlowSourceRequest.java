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
 * Add a flow source to an existing bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeFlowSourceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddBridgeFlowSourceRequest implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge. */
    private String flowArn;
    /** The name of the VPC interface attachment to use for this source. */
    private VpcInterfaceAttachment flowVpcInterfaceAttachment;
    /**
     * The name of the flow source. This name is used to reference the source and must be unique among sources in this
     * bridge.
     */
    private String name;

    /**
     * The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     * 
     * @param flowArn
     *        The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     * 
     * @return The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     * 
     * @param flowArn
     *        The Amazon Resource Number (ARN) of the cloud flow to use as a source of this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeFlowSourceRequest withFlowArn(String flowArn) {
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

    public AddBridgeFlowSourceRequest withFlowVpcInterfaceAttachment(VpcInterfaceAttachment flowVpcInterfaceAttachment) {
        setFlowVpcInterfaceAttachment(flowVpcInterfaceAttachment);
        return this;
    }

    /**
     * The name of the flow source. This name is used to reference the source and must be unique among sources in this
     * bridge.
     * 
     * @param name
     *        The name of the flow source. This name is used to reference the source and must be unique among sources in
     *        this bridge.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the flow source. This name is used to reference the source and must be unique among sources in this
     * bridge.
     * 
     * @return The name of the flow source. This name is used to reference the source and must be unique among sources
     *         in this bridge.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the flow source. This name is used to reference the source and must be unique among sources in this
     * bridge.
     * 
     * @param name
     *        The name of the flow source. This name is used to reference the source and must be unique among sources in
     *        this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeFlowSourceRequest withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddBridgeFlowSourceRequest == false)
            return false;
        AddBridgeFlowSourceRequest other = (AddBridgeFlowSourceRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getFlowVpcInterfaceAttachment() == null) ? 0 : getFlowVpcInterfaceAttachment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AddBridgeFlowSourceRequest clone() {
        try {
            return (AddBridgeFlowSourceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.AddBridgeFlowSourceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
