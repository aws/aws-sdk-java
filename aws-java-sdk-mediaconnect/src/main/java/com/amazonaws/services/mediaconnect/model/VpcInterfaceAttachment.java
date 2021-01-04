/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The settings for attaching a VPC interface to an output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/VpcInterfaceAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcInterfaceAttachment implements Serializable, Cloneable, StructuredPojo {

    /** The name of the VPC interface to use for this output. */
    private String vpcInterfaceName;

    /**
     * The name of the VPC interface to use for this output.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface to use for this output.
     */

    public void setVpcInterfaceName(String vpcInterfaceName) {
        this.vpcInterfaceName = vpcInterfaceName;
    }

    /**
     * The name of the VPC interface to use for this output.
     * 
     * @return The name of the VPC interface to use for this output.
     */

    public String getVpcInterfaceName() {
        return this.vpcInterfaceName;
    }

    /**
     * The name of the VPC interface to use for this output.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface to use for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInterfaceAttachment withVpcInterfaceName(String vpcInterfaceName) {
        setVpcInterfaceName(vpcInterfaceName);
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
        if (getVpcInterfaceName() != null)
            sb.append("VpcInterfaceName: ").append(getVpcInterfaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcInterfaceAttachment == false)
            return false;
        VpcInterfaceAttachment other = (VpcInterfaceAttachment) obj;
        if (other.getVpcInterfaceName() == null ^ this.getVpcInterfaceName() == null)
            return false;
        if (other.getVpcInterfaceName() != null && other.getVpcInterfaceName().equals(this.getVpcInterfaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcInterfaceName() == null) ? 0 : getVpcInterfaceName().hashCode());
        return hashCode;
    }

    @Override
    public VpcInterfaceAttachment clone() {
        try {
            return (VpcInterfaceAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.VpcInterfaceAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
