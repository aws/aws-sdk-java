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
 * Update the flow source of the bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeFlowSourceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeFlowSourceRequest implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the cloud flow to use as a source of this bridge. */
    private String flowArn;
    /** The name of the VPC interface attachment to use for this source. */
    private VpcInterfaceAttachment flowVpcInterfaceAttachment;

    /**
     * The ARN of the cloud flow to use as a source of this bridge.
     * 
     * @param flowArn
     *        The ARN of the cloud flow to use as a source of this bridge.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the cloud flow to use as a source of this bridge.
     * 
     * @return The ARN of the cloud flow to use as a source of this bridge.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the cloud flow to use as a source of this bridge.
     * 
     * @param flowArn
     *        The ARN of the cloud flow to use as a source of this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeFlowSourceRequest withFlowArn(String flowArn) {
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

    public UpdateBridgeFlowSourceRequest withFlowVpcInterfaceAttachment(VpcInterfaceAttachment flowVpcInterfaceAttachment) {
        setFlowVpcInterfaceAttachment(flowVpcInterfaceAttachment);
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
            sb.append("FlowVpcInterfaceAttachment: ").append(getFlowVpcInterfaceAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeFlowSourceRequest == false)
            return false;
        UpdateBridgeFlowSourceRequest other = (UpdateBridgeFlowSourceRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getFlowVpcInterfaceAttachment() == null ^ this.getFlowVpcInterfaceAttachment() == null)
            return false;
        if (other.getFlowVpcInterfaceAttachment() != null && other.getFlowVpcInterfaceAttachment().equals(this.getFlowVpcInterfaceAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getFlowVpcInterfaceAttachment() == null) ? 0 : getFlowVpcInterfaceAttachment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeFlowSourceRequest clone() {
        try {
            return (UpdateBridgeFlowSourceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.UpdateBridgeFlowSourceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
