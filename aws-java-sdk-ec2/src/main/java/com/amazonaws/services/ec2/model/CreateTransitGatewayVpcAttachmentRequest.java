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
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayVpcAttachmentRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayVpcAttachmentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayVpcAttachmentRequest> {

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least
     * one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one
     * IP address from each specified subnet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The VPC attachment options.
     * </p>
     */
    private CreateTransitGatewayVpcAttachmentRequestOptions options;
    /**
     * <p>
     * The tags to apply to the VPC attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least
     * one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one
     * IP address from each specified subnet.
     * </p>
     * 
     * @return The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify
     *         at least one subnet, but we recommend that you specify two subnets for better availability. The transit
     *         gateway uses one IP address from each specified subnet.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least
     * one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one
     * IP address from each specified subnet.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at
     *        least one subnet, but we recommend that you specify two subnets for better availability. The transit
     *        gateway uses one IP address from each specified subnet.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least
     * one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one
     * IP address from each specified subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at
     *        least one subnet, but we recommend that you specify two subnets for better availability. The transit
     *        gateway uses one IP address from each specified subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least
     * one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one
     * IP address from each specified subnet.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at
     *        least one subnet, but we recommend that you specify two subnets for better availability. The transit
     *        gateway uses one IP address from each specified subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @param options
     *        The VPC attachment options.
     */

    public void setOptions(CreateTransitGatewayVpcAttachmentRequestOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @return The VPC attachment options.
     */

    public CreateTransitGatewayVpcAttachmentRequestOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @param options
     *        The VPC attachment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withOptions(CreateTransitGatewayVpcAttachmentRequestOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the VPC attachment.
     * </p>
     * 
     * @return The tags to apply to the VPC attachment.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the VPC attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the VPC attachment.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the VPC attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the VPC attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayVpcAttachmentRequest> getDryRunRequest() {
        Request<CreateTransitGatewayVpcAttachmentRequest> request = new CreateTransitGatewayVpcAttachmentRequestMarshaller().marshall(this);
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayVpcAttachmentRequest == false)
            return false;
        CreateTransitGatewayVpcAttachmentRequest other = (CreateTransitGatewayVpcAttachmentRequest) obj;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayVpcAttachmentRequest clone() {
        return (CreateTransitGatewayVpcAttachmentRequest) super.clone();
    }
}
