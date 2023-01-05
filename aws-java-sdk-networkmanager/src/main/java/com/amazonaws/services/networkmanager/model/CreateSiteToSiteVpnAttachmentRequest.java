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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSiteToSiteVpnAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN identifying the VPN attachment.
     * </p>
     */
    private String vpnConnectionArn;
    /**
     * <p>
     * The tags associated with the request.
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
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network where you're creating a site-to-site VPN attachment.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     * </p>
     * 
     * @return The ID of a core network where you're creating a site-to-site VPN attachment.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network where you're creating a site-to-site VPN attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteToSiteVpnAttachmentRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN identifying the VPN attachment.
     * </p>
     * 
     * @param vpnConnectionArn
     *        The ARN identifying the VPN attachment.
     */

    public void setVpnConnectionArn(String vpnConnectionArn) {
        this.vpnConnectionArn = vpnConnectionArn;
    }

    /**
     * <p>
     * The ARN identifying the VPN attachment.
     * </p>
     * 
     * @return The ARN identifying the VPN attachment.
     */

    public String getVpnConnectionArn() {
        return this.vpnConnectionArn;
    }

    /**
     * <p>
     * The ARN identifying the VPN attachment.
     * </p>
     * 
     * @param vpnConnectionArn
     *        The ARN identifying the VPN attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteToSiteVpnAttachmentRequest withVpnConnectionArn(String vpnConnectionArn) {
        setVpnConnectionArn(vpnConnectionArn);
        return this;
    }

    /**
     * <p>
     * The tags associated with the request.
     * </p>
     * 
     * @return The tags associated with the request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The tags associated with the request.
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
     * The tags associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteToSiteVpnAttachmentRequest withTags(Tag... tags) {
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
     * The tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteToSiteVpnAttachmentRequest withTags(java.util.Collection<Tag> tags) {
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

    public CreateSiteToSiteVpnAttachmentRequest withClientToken(String clientToken) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getVpnConnectionArn() != null)
            sb.append("VpnConnectionArn: ").append(getVpnConnectionArn()).append(",");
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

        if (obj instanceof CreateSiteToSiteVpnAttachmentRequest == false)
            return false;
        CreateSiteToSiteVpnAttachmentRequest other = (CreateSiteToSiteVpnAttachmentRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getVpnConnectionArn() == null ^ this.getVpnConnectionArn() == null)
            return false;
        if (other.getVpnConnectionArn() != null && other.getVpnConnectionArn().equals(this.getVpnConnectionArn()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionArn() == null) ? 0 : getVpnConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateSiteToSiteVpnAttachmentRequest clone() {
        return (CreateSiteToSiteVpnAttachmentRequest) super.clone();
    }

}
