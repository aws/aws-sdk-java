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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a VPC attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/VpcAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     */
    private Attachment attachment;
    /**
     * <p>
     * The subnet ARNs.
     * </p>
     */
    private java.util.List<String> subnetArns;
    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     */
    private VpcOptions options;

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @param attachment
     *        Provides details about the VPC attachment.
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @return Provides details about the VPC attachment.
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @param attachment
     *        Provides details about the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachment withAttachment(Attachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The subnet ARNs.
     * </p>
     * 
     * @return The subnet ARNs.
     */

    public java.util.List<String> getSubnetArns() {
        return subnetArns;
    }

    /**
     * <p>
     * The subnet ARNs.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARNs.
     */

    public void setSubnetArns(java.util.Collection<String> subnetArns) {
        if (subnetArns == null) {
            this.subnetArns = null;
            return;
        }

        this.subnetArns = new java.util.ArrayList<String>(subnetArns);
    }

    /**
     * <p>
     * The subnet ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetArns(java.util.Collection)} or {@link #withSubnetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachment withSubnetArns(String... subnetArns) {
        if (this.subnetArns == null) {
            setSubnetArns(new java.util.ArrayList<String>(subnetArns.length));
        }
        for (String ele : subnetArns) {
            this.subnetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet ARNs.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachment withSubnetArns(java.util.Collection<String> subnetArns) {
        setSubnetArns(subnetArns);
        return this;
    }

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @param options
     *        Provides details about the VPC attachment.
     */

    public void setOptions(VpcOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @return Provides details about the VPC attachment.
     */

    public VpcOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Provides details about the VPC attachment.
     * </p>
     * 
     * @param options
     *        Provides details about the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachment withOptions(VpcOptions options) {
        setOptions(options);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getSubnetArns() != null)
            sb.append("SubnetArns: ").append(getSubnetArns()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcAttachment == false)
            return false;
        VpcAttachment other = (VpcAttachment) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getSubnetArns() == null ^ this.getSubnetArns() == null)
            return false;
        if (other.getSubnetArns() != null && other.getSubnetArns().equals(this.getSubnetArns()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getSubnetArns() == null) ? 0 : getSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpcAttachment clone() {
        try {
            return (VpcAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.VpcAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
