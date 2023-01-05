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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayRouteTableAnnouncementRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayRouteTableAnnouncementRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayRouteTableAnnouncementRequest> {

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     */
    private String peeringAttachmentId;
    /**
     * <p>
     * The tags specifications applied to the transit gateway route table announcement.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @return The ID of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRouteTableAnnouncementRequest withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringAttachmentId
     *        The ID of the peering attachment.
     */

    public void setPeeringAttachmentId(String peeringAttachmentId) {
        this.peeringAttachmentId = peeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @return The ID of the peering attachment.
     */

    public String getPeeringAttachmentId() {
        return this.peeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringAttachmentId
     *        The ID of the peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRouteTableAnnouncementRequest withPeeringAttachmentId(String peeringAttachmentId) {
        setPeeringAttachmentId(peeringAttachmentId);
        return this;
    }

    /**
     * <p>
     * The tags specifications applied to the transit gateway route table announcement.
     * </p>
     * 
     * @return The tags specifications applied to the transit gateway route table announcement.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags specifications applied to the transit gateway route table announcement.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specifications applied to the transit gateway route table announcement.
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
     * The tags specifications applied to the transit gateway route table announcement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specifications applied to the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRouteTableAnnouncementRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags specifications applied to the transit gateway route table announcement.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specifications applied to the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRouteTableAnnouncementRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayRouteTableAnnouncementRequest> getDryRunRequest() {
        Request<CreateTransitGatewayRouteTableAnnouncementRequest> request = new CreateTransitGatewayRouteTableAnnouncementRequestMarshaller().marshall(this);
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getPeeringAttachmentId() != null)
            sb.append("PeeringAttachmentId: ").append(getPeeringAttachmentId()).append(",");
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

        if (obj instanceof CreateTransitGatewayRouteTableAnnouncementRequest == false)
            return false;
        CreateTransitGatewayRouteTableAnnouncementRequest other = (CreateTransitGatewayRouteTableAnnouncementRequest) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getPeeringAttachmentId() == null ^ this.getPeeringAttachmentId() == null)
            return false;
        if (other.getPeeringAttachmentId() != null && other.getPeeringAttachmentId().equals(this.getPeeringAttachmentId()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getPeeringAttachmentId() == null) ? 0 : getPeeringAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayRouteTableAnnouncementRequest clone() {
        return (CreateTransitGatewayRouteTableAnnouncementRequest) super.clone();
    }
}
