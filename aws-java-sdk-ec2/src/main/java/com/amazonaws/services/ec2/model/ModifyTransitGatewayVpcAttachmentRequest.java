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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyTransitGatewayVpcAttachmentRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayVpcAttachmentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyTransitGatewayVpcAttachmentRequest> {

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addSubnetIds;
    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeSubnetIds;
    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     */
    private ModifyTransitGatewayVpcAttachmentRequestOptions options;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * </p>
     * 
     * @return The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     */

    public java.util.List<String> getAddSubnetIds() {
        if (addSubnetIds == null) {
            addSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addSubnetIds;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * </p>
     * 
     * @param addSubnetIds
     *        The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     */

    public void setAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        if (addSubnetIds == null) {
            this.addSubnetIds = null;
            return;
        }

        this.addSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(addSubnetIds);
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSubnetIds(java.util.Collection)} or {@link #withAddSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addSubnetIds
     *        The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withAddSubnetIds(String... addSubnetIds) {
        if (this.addSubnetIds == null) {
            setAddSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(addSubnetIds.length));
        }
        for (String ele : addSubnetIds) {
            this.addSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * </p>
     * 
     * @param addSubnetIds
     *        The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        setAddSubnetIds(addSubnetIds);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * 
     * @return The IDs of one or more subnets to remove.
     */

    public java.util.List<String> getRemoveSubnetIds() {
        if (removeSubnetIds == null) {
            removeSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeSubnetIds;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * 
     * @param removeSubnetIds
     *        The IDs of one or more subnets to remove.
     */

    public void setRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        if (removeSubnetIds == null) {
            this.removeSubnetIds = null;
            return;
        }

        this.removeSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(removeSubnetIds);
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSubnetIds(java.util.Collection)} or {@link #withRemoveSubnetIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeSubnetIds
     *        The IDs of one or more subnets to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withRemoveSubnetIds(String... removeSubnetIds) {
        if (this.removeSubnetIds == null) {
            setRemoveSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(removeSubnetIds.length));
        }
        for (String ele : removeSubnetIds) {
            this.removeSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * 
     * @param removeSubnetIds
     *        The IDs of one or more subnets to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        setRemoveSubnetIds(removeSubnetIds);
        return this;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * 
     * @param options
     *        The new VPC attachment options.
     */

    public void setOptions(ModifyTransitGatewayVpcAttachmentRequestOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * 
     * @return The new VPC attachment options.
     */

    public ModifyTransitGatewayVpcAttachmentRequestOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * 
     * @param options
     *        The new VPC attachment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayVpcAttachmentRequest withOptions(ModifyTransitGatewayVpcAttachmentRequestOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyTransitGatewayVpcAttachmentRequest> getDryRunRequest() {
        Request<ModifyTransitGatewayVpcAttachmentRequest> request = new ModifyTransitGatewayVpcAttachmentRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getAddSubnetIds() != null)
            sb.append("AddSubnetIds: ").append(getAddSubnetIds()).append(",");
        if (getRemoveSubnetIds() != null)
            sb.append("RemoveSubnetIds: ").append(getRemoveSubnetIds()).append(",");
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

        if (obj instanceof ModifyTransitGatewayVpcAttachmentRequest == false)
            return false;
        ModifyTransitGatewayVpcAttachmentRequest other = (ModifyTransitGatewayVpcAttachmentRequest) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getAddSubnetIds() == null ^ this.getAddSubnetIds() == null)
            return false;
        if (other.getAddSubnetIds() != null && other.getAddSubnetIds().equals(this.getAddSubnetIds()) == false)
            return false;
        if (other.getRemoveSubnetIds() == null ^ this.getRemoveSubnetIds() == null)
            return false;
        if (other.getRemoveSubnetIds() != null && other.getRemoveSubnetIds().equals(this.getRemoveSubnetIds()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getAddSubnetIds() == null) ? 0 : getAddSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveSubnetIds() == null) ? 0 : getRemoveSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTransitGatewayVpcAttachmentRequest clone() {
        return (ModifyTransitGatewayVpcAttachmentRequest) super.clone();
    }
}
