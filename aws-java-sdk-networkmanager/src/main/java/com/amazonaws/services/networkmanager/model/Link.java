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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a link.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Link" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Link implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the link.
     * </p>
     */
    private String linkId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the link.
     * </p>
     */
    private String linkArn;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the site.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The description of the link.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the link.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The bandwidth for the link.
     * </p>
     */
    private Bandwidth bandwidth;
    /**
     * <p>
     * The provider of the link.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The date and time that the link was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The state of the link.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags for the link.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @param linkId
     *        The ID of the link.
     */

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @return The ID of the link.
     */

    public String getLinkId() {
        return this.linkId;
    }

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @param linkId
     *        The ID of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the link.
     * </p>
     * 
     * @param linkArn
     *        The Amazon Resource Name (ARN) of the link.
     */

    public void setLinkArn(String linkArn) {
        this.linkArn = linkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the link.
     */

    public String getLinkArn() {
        return this.linkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the link.
     * </p>
     * 
     * @param linkArn
     *        The Amazon Resource Name (ARN) of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withLinkArn(String linkArn) {
        setLinkArn(linkArn);
        return this;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @param siteId
     *        The ID of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @return The ID of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @param siteId
     *        The ID of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The description of the link.
     * </p>
     * 
     * @param description
     *        The description of the link.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the link.
     * </p>
     * 
     * @return The description of the link.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the link.
     * </p>
     * 
     * @param description
     *        The description of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * 
     * @param type
     *        The type of the link.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * 
     * @return The type of the link.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * 
     * @param type
     *        The type of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The bandwidth for the link.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth for the link.
     */

    public void setBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth for the link.
     * </p>
     * 
     * @return The bandwidth for the link.
     */

    public Bandwidth getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The bandwidth for the link.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth for the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withBandwidth(Bandwidth bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * 
     * @param provider
     *        The provider of the link.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * 
     * @return The provider of the link.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * 
     * @param provider
     *        The provider of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The date and time that the link was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the link was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the link was created.
     * </p>
     * 
     * @return The date and time that the link was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the link was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the link was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The state of the link.
     * </p>
     * 
     * @param state
     *        The state of the link.
     * @see LinkState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the link.
     * </p>
     * 
     * @return The state of the link.
     * @see LinkState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the link.
     * </p>
     * 
     * @param state
     *        The state of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinkState
     */

    public Link withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the link.
     * </p>
     * 
     * @param state
     *        The state of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinkState
     */

    public Link withState(LinkState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the link.
     * </p>
     * 
     * @return The tags for the link.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the link.
     * </p>
     * 
     * @param tags
     *        The tags for the link.
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
     * The tags for the link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withTags(Tag... tags) {
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
     * The tags for the link.
     * </p>
     * 
     * @param tags
     *        The tags for the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Link withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId()).append(",");
        if (getLinkArn() != null)
            sb.append("LinkArn: ").append(getLinkArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Link == false)
            return false;
        Link other = (Link) obj;
        if (other.getLinkId() == null ^ this.getLinkId() == null)
            return false;
        if (other.getLinkId() != null && other.getLinkId().equals(this.getLinkId()) == false)
            return false;
        if (other.getLinkArn() == null ^ this.getLinkArn() == null)
            return false;
        if (other.getLinkArn() != null && other.getLinkArn().equals(this.getLinkArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getLinkArn() == null) ? 0 : getLinkArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Link clone() {
        try {
            return (Link) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.LinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
