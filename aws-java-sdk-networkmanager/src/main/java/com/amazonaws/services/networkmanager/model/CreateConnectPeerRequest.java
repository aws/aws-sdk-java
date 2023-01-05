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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectPeer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection attachment.
     * </p>
     */
    private String connectAttachmentId;
    /**
     * <p>
     * A Connect peer core network address.
     * </p>
     */
    private String coreNetworkAddress;
    /**
     * <p>
     * The Connect peer address.
     * </p>
     */
    private String peerAddress;
    /**
     * <p>
     * The Connect peer BGP options.
     * </p>
     */
    private BgpOptions bgpOptions;
    /**
     * <p>
     * The inside IP addresses used for BGP peering.
     * </p>
     */
    private java.util.List<String> insideCidrBlocks;
    /**
     * <p>
     * The tags associated with the peer request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The client token associated with the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the connection attachment.
     * </p>
     * 
     * @param connectAttachmentId
     *        The ID of the connection attachment.
     */

    public void setConnectAttachmentId(String connectAttachmentId) {
        this.connectAttachmentId = connectAttachmentId;
    }

    /**
     * <p>
     * The ID of the connection attachment.
     * </p>
     * 
     * @return The ID of the connection attachment.
     */

    public String getConnectAttachmentId() {
        return this.connectAttachmentId;
    }

    /**
     * <p>
     * The ID of the connection attachment.
     * </p>
     * 
     * @param connectAttachmentId
     *        The ID of the connection attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withConnectAttachmentId(String connectAttachmentId) {
        setConnectAttachmentId(connectAttachmentId);
        return this;
    }

    /**
     * <p>
     * A Connect peer core network address.
     * </p>
     * 
     * @param coreNetworkAddress
     *        A Connect peer core network address.
     */

    public void setCoreNetworkAddress(String coreNetworkAddress) {
        this.coreNetworkAddress = coreNetworkAddress;
    }

    /**
     * <p>
     * A Connect peer core network address.
     * </p>
     * 
     * @return A Connect peer core network address.
     */

    public String getCoreNetworkAddress() {
        return this.coreNetworkAddress;
    }

    /**
     * <p>
     * A Connect peer core network address.
     * </p>
     * 
     * @param coreNetworkAddress
     *        A Connect peer core network address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withCoreNetworkAddress(String coreNetworkAddress) {
        setCoreNetworkAddress(coreNetworkAddress);
        return this;
    }

    /**
     * <p>
     * The Connect peer address.
     * </p>
     * 
     * @param peerAddress
     *        The Connect peer address.
     */

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    /**
     * <p>
     * The Connect peer address.
     * </p>
     * 
     * @return The Connect peer address.
     */

    public String getPeerAddress() {
        return this.peerAddress;
    }

    /**
     * <p>
     * The Connect peer address.
     * </p>
     * 
     * @param peerAddress
     *        The Connect peer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withPeerAddress(String peerAddress) {
        setPeerAddress(peerAddress);
        return this;
    }

    /**
     * <p>
     * The Connect peer BGP options.
     * </p>
     * 
     * @param bgpOptions
     *        The Connect peer BGP options.
     */

    public void setBgpOptions(BgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
    }

    /**
     * <p>
     * The Connect peer BGP options.
     * </p>
     * 
     * @return The Connect peer BGP options.
     */

    public BgpOptions getBgpOptions() {
        return this.bgpOptions;
    }

    /**
     * <p>
     * The Connect peer BGP options.
     * </p>
     * 
     * @param bgpOptions
     *        The Connect peer BGP options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withBgpOptions(BgpOptions bgpOptions) {
        setBgpOptions(bgpOptions);
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for BGP peering.
     * </p>
     * 
     * @return The inside IP addresses used for BGP peering.
     */

    public java.util.List<String> getInsideCidrBlocks() {
        return insideCidrBlocks;
    }

    /**
     * <p>
     * The inside IP addresses used for BGP peering.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for BGP peering.
     */

    public void setInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        if (insideCidrBlocks == null) {
            this.insideCidrBlocks = null;
            return;
        }

        this.insideCidrBlocks = new java.util.ArrayList<String>(insideCidrBlocks);
    }

    /**
     * <p>
     * The inside IP addresses used for BGP peering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsideCidrBlocks(java.util.Collection)} or {@link #withInsideCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for BGP peering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withInsideCidrBlocks(String... insideCidrBlocks) {
        if (this.insideCidrBlocks == null) {
            setInsideCidrBlocks(new java.util.ArrayList<String>(insideCidrBlocks.length));
        }
        for (String ele : insideCidrBlocks) {
            this.insideCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inside IP addresses used for BGP peering.
     * </p>
     * 
     * @param insideCidrBlocks
     *        The inside IP addresses used for BGP peering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withInsideCidrBlocks(java.util.Collection<String> insideCidrBlocks) {
        setInsideCidrBlocks(insideCidrBlocks);
        return this;
    }

    /**
     * <p>
     * The tags associated with the peer request.
     * </p>
     * 
     * @return The tags associated with the peer request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the peer request.
     * </p>
     * 
     * @param tags
     *        The tags associated with the peer request.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the peer request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the peer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the peer request.
     * </p>
     * 
     * @param tags
     *        The tags associated with the peer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @return The client token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectPeerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getConnectAttachmentId() != null)
            sb.append("ConnectAttachmentId: ").append(getConnectAttachmentId()).append(",");
        if (getCoreNetworkAddress() != null)
            sb.append("CoreNetworkAddress: ").append(getCoreNetworkAddress()).append(",");
        if (getPeerAddress() != null)
            sb.append("PeerAddress: ").append(getPeerAddress()).append(",");
        if (getBgpOptions() != null)
            sb.append("BgpOptions: ").append(getBgpOptions()).append(",");
        if (getInsideCidrBlocks() != null)
            sb.append("InsideCidrBlocks: ").append(getInsideCidrBlocks()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectPeerRequest == false)
            return false;
        CreateConnectPeerRequest other = (CreateConnectPeerRequest) obj;
        if (other.getConnectAttachmentId() == null ^ this.getConnectAttachmentId() == null)
            return false;
        if (other.getConnectAttachmentId() != null && other.getConnectAttachmentId().equals(this.getConnectAttachmentId()) == false)
            return false;
        if (other.getCoreNetworkAddress() == null ^ this.getCoreNetworkAddress() == null)
            return false;
        if (other.getCoreNetworkAddress() != null && other.getCoreNetworkAddress().equals(this.getCoreNetworkAddress()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectAttachmentId() == null) ? 0 : getConnectAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkAddress() == null) ? 0 : getCoreNetworkAddress().hashCode());
        hashCode = prime * hashCode + ((getPeerAddress() == null) ? 0 : getPeerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpOptions() == null) ? 0 : getBgpOptions().hashCode());
        hashCode = prime * hashCode + ((getInsideCidrBlocks() == null) ? 0 : getInsideCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectPeerRequest clone() {
        return (CreateConnectPeerRequest) super.clone();
    }

}
