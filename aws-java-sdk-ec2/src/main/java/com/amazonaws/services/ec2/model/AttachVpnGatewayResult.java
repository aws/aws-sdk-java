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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of AttachVpnGateway.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachVpnGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the attachment.
     * </p>
     */
    private VpcAttachment vpcAttachment;

    /**
     * <p>
     * Information about the attachment.
     * </p>
     * 
     * @param vpcAttachment
     *        Information about the attachment.
     */

    public void setVpcAttachment(VpcAttachment vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
    }

    /**
     * <p>
     * Information about the attachment.
     * </p>
     * 
     * @return Information about the attachment.
     */

    public VpcAttachment getVpcAttachment() {
        return this.vpcAttachment;
    }

    /**
     * <p>
     * Information about the attachment.
     * </p>
     * 
     * @param vpcAttachment
     *        Information about the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachVpnGatewayResult withVpcAttachment(VpcAttachment vpcAttachment) {
        setVpcAttachment(vpcAttachment);
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
        if (getVpcAttachment() != null)
            sb.append("VpcAttachment: ").append(getVpcAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachVpnGatewayResult == false)
            return false;
        AttachVpnGatewayResult other = (AttachVpnGatewayResult) obj;
        if (other.getVpcAttachment() == null ^ this.getVpcAttachment() == null)
            return false;
        if (other.getVpcAttachment() != null && other.getVpcAttachment().equals(this.getVpcAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcAttachment() == null) ? 0 : getVpcAttachment().hashCode());
        return hashCode;
    }

    @Override
    public AttachVpnGatewayResult clone() {
        try {
            return (AttachVpnGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
