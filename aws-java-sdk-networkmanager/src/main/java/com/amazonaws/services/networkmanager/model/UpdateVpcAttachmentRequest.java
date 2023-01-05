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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateVpcAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * Adds a subnet ARN to the VPC attachment.
     * </p>
     */
    private java.util.List<String> addSubnetArns;
    /**
     * <p>
     * Removes a subnet ARN from the attachment.
     * </p>
     */
    private java.util.List<String> removeSubnetArns;
    /**
     * <p>
     * Additional options for updating the VPC attachment.
     * </p>
     */
    private VpcOptions options;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * Adds a subnet ARN to the VPC attachment.
     * </p>
     * 
     * @return Adds a subnet ARN to the VPC attachment.
     */

    public java.util.List<String> getAddSubnetArns() {
        return addSubnetArns;
    }

    /**
     * <p>
     * Adds a subnet ARN to the VPC attachment.
     * </p>
     * 
     * @param addSubnetArns
     *        Adds a subnet ARN to the VPC attachment.
     */

    public void setAddSubnetArns(java.util.Collection<String> addSubnetArns) {
        if (addSubnetArns == null) {
            this.addSubnetArns = null;
            return;
        }

        this.addSubnetArns = new java.util.ArrayList<String>(addSubnetArns);
    }

    /**
     * <p>
     * Adds a subnet ARN to the VPC attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSubnetArns(java.util.Collection)} or {@link #withAddSubnetArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addSubnetArns
     *        Adds a subnet ARN to the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withAddSubnetArns(String... addSubnetArns) {
        if (this.addSubnetArns == null) {
            setAddSubnetArns(new java.util.ArrayList<String>(addSubnetArns.length));
        }
        for (String ele : addSubnetArns) {
            this.addSubnetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds a subnet ARN to the VPC attachment.
     * </p>
     * 
     * @param addSubnetArns
     *        Adds a subnet ARN to the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withAddSubnetArns(java.util.Collection<String> addSubnetArns) {
        setAddSubnetArns(addSubnetArns);
        return this;
    }

    /**
     * <p>
     * Removes a subnet ARN from the attachment.
     * </p>
     * 
     * @return Removes a subnet ARN from the attachment.
     */

    public java.util.List<String> getRemoveSubnetArns() {
        return removeSubnetArns;
    }

    /**
     * <p>
     * Removes a subnet ARN from the attachment.
     * </p>
     * 
     * @param removeSubnetArns
     *        Removes a subnet ARN from the attachment.
     */

    public void setRemoveSubnetArns(java.util.Collection<String> removeSubnetArns) {
        if (removeSubnetArns == null) {
            this.removeSubnetArns = null;
            return;
        }

        this.removeSubnetArns = new java.util.ArrayList<String>(removeSubnetArns);
    }

    /**
     * <p>
     * Removes a subnet ARN from the attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSubnetArns(java.util.Collection)} or {@link #withRemoveSubnetArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeSubnetArns
     *        Removes a subnet ARN from the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withRemoveSubnetArns(String... removeSubnetArns) {
        if (this.removeSubnetArns == null) {
            setRemoveSubnetArns(new java.util.ArrayList<String>(removeSubnetArns.length));
        }
        for (String ele : removeSubnetArns) {
            this.removeSubnetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Removes a subnet ARN from the attachment.
     * </p>
     * 
     * @param removeSubnetArns
     *        Removes a subnet ARN from the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withRemoveSubnetArns(java.util.Collection<String> removeSubnetArns) {
        setRemoveSubnetArns(removeSubnetArns);
        return this;
    }

    /**
     * <p>
     * Additional options for updating the VPC attachment.
     * </p>
     * 
     * @param options
     *        Additional options for updating the VPC attachment.
     */

    public void setOptions(VpcOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Additional options for updating the VPC attachment.
     * </p>
     * 
     * @return Additional options for updating the VPC attachment.
     */

    public VpcOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Additional options for updating the VPC attachment.
     * </p>
     * 
     * @param options
     *        Additional options for updating the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcAttachmentRequest withOptions(VpcOptions options) {
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getAddSubnetArns() != null)
            sb.append("AddSubnetArns: ").append(getAddSubnetArns()).append(",");
        if (getRemoveSubnetArns() != null)
            sb.append("RemoveSubnetArns: ").append(getRemoveSubnetArns()).append(",");
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

        if (obj instanceof UpdateVpcAttachmentRequest == false)
            return false;
        UpdateVpcAttachmentRequest other = (UpdateVpcAttachmentRequest) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getAddSubnetArns() == null ^ this.getAddSubnetArns() == null)
            return false;
        if (other.getAddSubnetArns() != null && other.getAddSubnetArns().equals(this.getAddSubnetArns()) == false)
            return false;
        if (other.getRemoveSubnetArns() == null ^ this.getRemoveSubnetArns() == null)
            return false;
        if (other.getRemoveSubnetArns() != null && other.getRemoveSubnetArns().equals(this.getRemoveSubnetArns()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getAddSubnetArns() == null) ? 0 : getAddSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getRemoveSubnetArns() == null) ? 0 : getRemoveSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcAttachmentRequest clone() {
        return (UpdateVpcAttachmentRequest) super.clone();
    }

}
