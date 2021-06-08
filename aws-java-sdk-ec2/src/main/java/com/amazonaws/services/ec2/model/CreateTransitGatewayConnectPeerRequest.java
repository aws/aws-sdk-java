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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayConnectPeerRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayConnectPeerRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayConnectPeerRequest> {

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     * specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available
     * IP address from the transit gateway CIDR block.
     * </p>
     */
    private String transitGatewayAddress;
    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The BGP options for the Connect peer.
     * </p>
     */
    private TransitGatewayConnectRequestBgpOptions bgpOptions;
    /**
     * <p>
     * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from
     * the <code>169.254.0.0/16</code> range. The first address from the range must be configured on the appliance as
     * the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the <code>fd00::/8</code>
     * range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insideCidrBlocks;
    /**
     * <p>
     * The tags to apply to the Connect peer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the Connect attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @return The ID of the Connect attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the Connect attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     * specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available
     * IP address from the transit gateway CIDR block.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     *        specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first
     *        available IP address from the transit gateway CIDR block.
     */

    public void setTransitGatewayAddress(String transitGatewayAddress) {
        this.transitGatewayAddress = transitGatewayAddress;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     * specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available
     * IP address from the transit gateway CIDR block.
     * </p>
     * 
     * @return The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     *         specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first
     *         available IP address from the transit gateway CIDR block.
     */

    public String getTransitGatewayAddress() {
        return this.transitGatewayAddress;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     * specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available
     * IP address from the transit gateway CIDR block.
     * </p>
     * 
     * @param transitGatewayAddress
     *        The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be
     *        specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first
     *        available IP address from the transit gateway CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withTransitGatewayAddress(String transitGatewayAddress) {
        setTransitGatewayAddress(transitGatewayAddress);
        return this;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     * </p>
     * 
     * @return The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     * </p>
     * 
     * @param peerAddress
     *        The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The BGP options for the Connect peer.
     * </p>
     * 
     * @param bgpOptions
     *        The BGP options for the Connect peer.
     */

    public void setBgpOptions(TransitGatewayConnectRequestBgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
    }

    /**
     * <p>
     * The BGP options for the Connect peer.
     * </p>
     * 
     * @return The BGP options for the Connect peer.
     */

    public TransitGatewayConnectRequestBgpOptions getBgpOptions() {
        return this.bgpOptions;
    }

    /**
     * <p>
     * The BGP options for the Connect peer.
     * </p>
     * 
     * @param bgpOptions
     *        The BGP options for the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withBgpOptions(TransitGatewayConnectRequestBgpOptions bgpOptions) {
        setBgpOptions(bgpOptions);
        return this;
    }

    /**
     * <p>
     * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from
     * the <code>169.254.0.0/16</code> range. The first address from the range must be configured on the appliance as
     * the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the <code>fd00::/8</code>
     * range.
     * </p>
     * 
     * @return The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR
     *         block from the <code>169.254.0.0/16</code> range. The first address from the range must be configured on
     *         the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the
     *         <code>fd00::/8</code> range.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        if (insideCidrBlocks == null) {
            insideCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from
     * the <code>169.254.0.0/16</code> range. The first address from the range must be configured on the appliance as
     * the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the <code>fd00::/8</code>
     * range.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR
     *        block from the <code>169.254.0.0/16</code> range. The first address from the range must be configured on
     *        the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the
     *        <code>fd00::/8</code> range.
     */

    public void setInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        if (insideCidrBlocks == null) {
            this.insideCidrBlocks = null;
            return;
        }

        this.insideCidrBlocks = new com.amazonaws.internal.SdkInternalList<String>(insideCidrBlocks);
    }

    /**
     * <p>
     * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from
     * the <code>169.254.0.0/16</code> range. The first address from the range must be configured on the appliance as
     * the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the <code>fd00::/8</code>
     * range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR
     *        block from the <code>169.254.0.0/16</code> range. The first address from the range must be configured on
     *        the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the
     *        <code>fd00::/8</code> range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withInsideCidrBlocks(String... insideCidrBlocks) {
        if (this.insideCidrBlocks == null) {
            setInsideCidrBlocks(new com.amazonaws.internal.SdkInternalList<String>(insideCidrBlocks.length));
        }
        for (String ele : insideCidrBlocks) {
            this.insideCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from
     * the <code>169.254.0.0/16</code> range. The first address from the range must be configured on the appliance as
     * the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the <code>fd00::/8</code>
     * range.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR
     *        block from the <code>169.254.0.0/16</code> range. The first address from the range must be configured on
     *        the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the
     *        <code>fd00::/8</code> range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Connect peer.
     * </p>
     * 
     * @return The tags to apply to the Connect peer.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Connect peer.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect peer.
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
     * The tags to apply to the Connect peer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the Connect peer.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectPeerRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayConnectPeerRequest> getDryRunRequest() {
        Request<CreateTransitGatewayConnectPeerRequest> request = new CreateTransitGatewayConnectPeerRequestMarshaller().marshall(this);
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
        if (getTransitGatewayAddress() != null)
            sb.append("TransitGatewayAddress: ").append(getTransitGatewayAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress()).append(",");
        if (getBgpOptions() != null)
            sb.append("BgpOptions: ").append(getBgpOptions()).append(",");
        if (getInsideCidrBlocks() != null)
            sb.append("InsideCidrBlocks: ").append(getInsideCidrBlocks()).append(",");
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

        if (obj instanceof CreateTransitGatewayConnectPeerRequest == false)
            return false;
        CreateTransitGatewayConnectPeerRequest other = (CreateTransitGatewayConnectPeerRequest) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayAddress() == null ^ this.getTransitGatewayAddress() == null)
            return false;
        if (other.getTransitGatewayAddress() != null && other.getTransitGatewayAddress().equals(this.getTransitGatewayAddress()) == false)
            return false;
        if (other.getPeerAddress() == null ^ this.getPeerAddress() == null)
            return false;
        if (other.getPeerAddress() != null && other.getPeerAddress().equals(this.getPeerAddress()) == false)
            return false;
        if (other.getBgpOptions() == null ^ this.getBgpOptions() == null)
            return false;
        if (other.getBgpOptions() != null && other.getBgpOptions().equals(this.getBgpOptions()) == false)
            return false;
        if (other.getInsideCidrBlocks() == null ^ this.getInsideCidrBlocks() == null)
            return false;
        if (other.getInsideCidrBlocks() != null && other.getInsideCidrBlocks().equals(this.getInsideCidrBlocks()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAddress() == null) ? 0 : getTransitGatewayAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpOptions() == null) ? 0 : getBgpOptions().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayConnectPeerRequest clone() {
        return (CreateTransitGatewayConnectPeerRequest) super.clone();
    }
}
