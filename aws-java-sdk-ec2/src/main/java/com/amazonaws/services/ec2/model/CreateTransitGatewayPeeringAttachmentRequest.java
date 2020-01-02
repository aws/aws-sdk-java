/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayPeeringAttachmentRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayPeeringAttachmentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayPeeringAttachmentRequest> {

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering attachment.
     * </p>
     */
    private String peerTransitGatewayId;
    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     */
    private String peerAccountId;
    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     */
    private String peerRegion;
    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
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

    public CreateTransitGatewayPeeringAttachmentRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering attachment.
     * </p>
     * 
     * @param peerTransitGatewayId
     *        The ID of the peer transit gateway with which to create the peering attachment.
     */

    public void setPeerTransitGatewayId(String peerTransitGatewayId) {
        this.peerTransitGatewayId = peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering attachment.
     * </p>
     * 
     * @return The ID of the peer transit gateway with which to create the peering attachment.
     */

    public String getPeerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering attachment.
     * </p>
     * 
     * @param peerTransitGatewayId
     *        The ID of the peer transit gateway with which to create the peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPeeringAttachmentRequest withPeerTransitGatewayId(String peerTransitGatewayId) {
        setPeerTransitGatewayId(peerTransitGatewayId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     * 
     * @param peerAccountId
     *        The AWS account ID of the owner of the peer transit gateway.
     */

    public void setPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     * 
     * @return The AWS account ID of the owner of the peer transit gateway.
     */

    public String getPeerAccountId() {
        return this.peerAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     * 
     * @param peerAccountId
     *        The AWS account ID of the owner of the peer transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPeeringAttachmentRequest withPeerAccountId(String peerAccountId) {
        setPeerAccountId(peerAccountId);
        return this;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     * 
     * @param peerRegion
     *        The Region where the peer transit gateway is located.
     */

    public void setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     * 
     * @return The Region where the peer transit gateway is located.
     */

    public String getPeerRegion() {
        return this.peerRegion;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     * 
     * @param peerRegion
     *        The Region where the peer transit gateway is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPeeringAttachmentRequest withPeerRegion(String peerRegion) {
        setPeerRegion(peerRegion);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * 
     * @return The tags to apply to the transit gateway peering attachment.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway peering attachment.
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
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPeeringAttachmentRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPeeringAttachmentRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayPeeringAttachmentRequest> getDryRunRequest() {
        Request<CreateTransitGatewayPeeringAttachmentRequest> request = new CreateTransitGatewayPeeringAttachmentRequestMarshaller().marshall(this);
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
        if (getPeerTransitGatewayId() != null)
            sb.append("PeerTransitGatewayId: ").append(getPeerTransitGatewayId()).append(",");
        if (getPeerAccountId() != null)
            sb.append("PeerAccountId: ").append(getPeerAccountId()).append(",");
        if (getPeerRegion() != null)
            sb.append("PeerRegion: ").append(getPeerRegion()).append(",");
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

        if (obj instanceof CreateTransitGatewayPeeringAttachmentRequest == false)
            return false;
        CreateTransitGatewayPeeringAttachmentRequest other = (CreateTransitGatewayPeeringAttachmentRequest) obj;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getPeerTransitGatewayId() == null ^ this.getPeerTransitGatewayId() == null)
            return false;
        if (other.getPeerTransitGatewayId() != null && other.getPeerTransitGatewayId().equals(this.getPeerTransitGatewayId()) == false)
            return false;
        if (other.getPeerAccountId() == null ^ this.getPeerAccountId() == null)
            return false;
        if (other.getPeerAccountId() != null && other.getPeerAccountId().equals(this.getPeerAccountId()) == false)
            return false;
        if (other.getPeerRegion() == null ^ this.getPeerRegion() == null)
            return false;
        if (other.getPeerRegion() != null && other.getPeerRegion().equals(this.getPeerRegion()) == false)
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
        hashCode = prime * hashCode + ((getPeerTransitGatewayId() == null) ? 0 : getPeerTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getPeerAccountId() == null) ? 0 : getPeerAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerRegion() == null) ? 0 : getPeerRegion().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayPeeringAttachmentRequest clone() {
        return (CreateTransitGatewayPeeringAttachmentRequest) super.clone();
    }
}
