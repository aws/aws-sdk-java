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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * A description of the link.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The upload speed and download speed in Mbps.
     * </p>
     */
    private Bandwidth bandwidth;
    /**
     * <p>
     * The provider of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The ID of the site.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateLinkRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * A description of the link.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the link.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the link.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @return A description of the link.</p>
     *         <p>
     *         Length Constraints: Maximum length of 256 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the link.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the link.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param type
     *        The type of the link.</p>
     *        <p>
     *        Constraints: Cannot include the following characters: | \ ^
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @return The type of the link.</p>
     *         <p>
     *         Constraints: Cannot include the following characters: | \ ^
     *         </p>
     *         <p>
     *         Length Constraints: Maximum length of 128 characters.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param type
     *        The type of the link.</p>
     *        <p>
     *        Constraints: Cannot include the following characters: | \ ^
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The upload speed and download speed in Mbps.
     * </p>
     * 
     * @param bandwidth
     *        The upload speed and download speed in Mbps.
     */

    public void setBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The upload speed and download speed in Mbps.
     * </p>
     * 
     * @return The upload speed and download speed in Mbps.
     */

    public Bandwidth getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The upload speed and download speed in Mbps.
     * </p>
     * 
     * @param bandwidth
     *        The upload speed and download speed in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withBandwidth(Bandwidth bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param provider
     *        The provider of the link.</p>
     *        <p>
     *        Constraints: Cannot include the following characters: | \ ^
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @return The provider of the link.</p>
     *         <p>
     *         Constraints: Cannot include the following characters: | \ ^
     *         </p>
     *         <p>
     *         Length Constraints: Maximum length of 128 characters.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the link.
     * </p>
     * <p>
     * Constraints: Cannot include the following characters: | \ ^
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param provider
     *        The provider of the link.</p>
     *        <p>
     *        Constraints: Cannot include the following characters: | \ ^
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withProvider(String provider) {
        setProvider(provider);
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

    public CreateLinkRequest withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @return The tags to apply to the resource during creation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
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
     * The tags to apply to the resource during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withTags(Tag... tags) {
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
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
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

        if (obj instanceof CreateLinkRequest == false)
            return false;
        CreateLinkRequest other = (CreateLinkRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
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
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLinkRequest clone() {
        return (CreateLinkRequest) super.clone();
    }

}
