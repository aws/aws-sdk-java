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
 * The source configuration for cloud flows receiving a stream from a bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GatewayBridgeSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayBridgeSource implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the bridge feeding this flow. */
    private String bridgeArn;
    /** The name of the VPC interface attachment to use for this bridge source. */
    private VpcInterfaceAttachment vpcInterfaceAttachment;

    /**
     * The ARN of the bridge feeding this flow.
     * 
     * @param bridgeArn
     *        The ARN of the bridge feeding this flow.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The ARN of the bridge feeding this flow.
     * 
     * @return The ARN of the bridge feeding this flow.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The ARN of the bridge feeding this flow.
     * 
     * @param bridgeArn
     *        The ARN of the bridge feeding this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayBridgeSource withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * The name of the VPC interface attachment to use for this bridge source.
     * 
     * @param vpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this bridge source.
     */

    public void setVpcInterfaceAttachment(VpcInterfaceAttachment vpcInterfaceAttachment) {
        this.vpcInterfaceAttachment = vpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this bridge source.
     * 
     * @return The name of the VPC interface attachment to use for this bridge source.
     */

    public VpcInterfaceAttachment getVpcInterfaceAttachment() {
        return this.vpcInterfaceAttachment;
    }

    /**
     * The name of the VPC interface attachment to use for this bridge source.
     * 
     * @param vpcInterfaceAttachment
     *        The name of the VPC interface attachment to use for this bridge source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayBridgeSource withVpcInterfaceAttachment(VpcInterfaceAttachment vpcInterfaceAttachment) {
        setVpcInterfaceAttachment(vpcInterfaceAttachment);
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
        if (getVpcInterfaceAttachment() != null)
            sb.append("VpcInterfaceAttachment: ").append(getVpcInterfaceAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayBridgeSource == false)
            return false;
        GatewayBridgeSource other = (GatewayBridgeSource) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getVpcInterfaceAttachment() == null ^ this.getVpcInterfaceAttachment() == null)
            return false;
        if (other.getVpcInterfaceAttachment() != null && other.getVpcInterfaceAttachment().equals(this.getVpcInterfaceAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaceAttachment() == null) ? 0 : getVpcInterfaceAttachment().hashCode());
        return hashCode;
    }

    @Override
    public GatewayBridgeSource clone() {
        try {
            return (GatewayBridgeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.GatewayBridgeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
