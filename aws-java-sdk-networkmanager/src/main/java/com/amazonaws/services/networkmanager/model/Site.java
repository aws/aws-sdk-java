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
 * Describes a site.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Site" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Site implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the site.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the site.
     * </p>
     */
    private String siteArn;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The description of the site.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The location of the site.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The state of the site.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags for the site.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public Site withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteArn
     *        The Amazon Resource Name (ARN) of the site.
     */

    public void setSiteArn(String siteArn) {
        this.siteArn = siteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the site.
     */

    public String getSiteArn() {
        return this.siteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteArn
     *        The Amazon Resource Name (ARN) of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withSiteArn(String siteArn) {
        setSiteArn(siteArn);
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

    public Site withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @param description
     *        The description of the site.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @return The description of the site.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @param description
     *        The description of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The location of the site.
     * </p>
     * 
     * @param location
     *        The location of the site.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the site.
     * </p>
     * 
     * @return The location of the site.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the site.
     * </p>
     * 
     * @param location
     *        The location of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the site was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @return The date and time that the site was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the site was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The state of the site.
     * </p>
     * 
     * @param state
     *        The state of the site.
     * @see SiteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the site.
     * </p>
     * 
     * @return The state of the site.
     * @see SiteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the site.
     * </p>
     * 
     * @param state
     *        The state of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SiteState
     */

    public Site withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the site.
     * </p>
     * 
     * @param state
     *        The state of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SiteState
     */

    public Site withState(SiteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the site.
     * </p>
     * 
     * @return The tags for the site.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the site.
     * </p>
     * 
     * @param tags
     *        The tags for the site.
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
     * The tags for the site.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withTags(Tag... tags) {
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
     * The tags for the site.
     * </p>
     * 
     * @param tags
     *        The tags for the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withTags(java.util.Collection<Tag> tags) {
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
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getSiteArn() != null)
            sb.append("SiteArn: ").append(getSiteArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
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

        if (obj instanceof Site == false)
            return false;
        Site other = (Site) obj;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getSiteArn() == null ^ this.getSiteArn() == null)
            return false;
        if (other.getSiteArn() != null && other.getSiteArn().equals(this.getSiteArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
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

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getSiteArn() == null) ? 0 : getSiteArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Site clone() {
        try {
            return (Site) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.SiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
