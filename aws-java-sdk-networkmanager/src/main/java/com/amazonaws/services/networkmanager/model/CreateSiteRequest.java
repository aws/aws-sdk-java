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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * A description of your site.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The site location. This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Address</code>: The physical address of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Latitude</code>: The latitude of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Longitude</code>: The longitude of the site.
     * </p>
     * </li>
     * </ul>
     */
    private Location location;
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

    public CreateSiteRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * A description of your site.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of your site.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of your site.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @return A description of your site.</p>
     *         <p>
     *         Length Constraints: Maximum length of 256 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of your site.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of your site.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The site location. This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Address</code>: The physical address of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Latitude</code>: The latitude of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Longitude</code>: The longitude of the site.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        The site location. This information is used for visualization in the Network Manager console. If you
     *        specify the address, the latitude and longitude are automatically calculated.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Address</code>: The physical address of the site.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Latitude</code>: The latitude of the site.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Longitude</code>: The longitude of the site.
     *        </p>
     *        </li>
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The site location. This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Address</code>: The physical address of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Latitude</code>: The latitude of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Longitude</code>: The longitude of the site.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The site location. This information is used for visualization in the Network Manager console. If you
     *         specify the address, the latitude and longitude are automatically calculated.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Address</code>: The physical address of the site.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Latitude</code>: The latitude of the site.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Longitude</code>: The longitude of the site.
     *         </p>
     *         </li>
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The site location. This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Address</code>: The physical address of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Latitude</code>: The latitude of the site.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Longitude</code>: The longitude of the site.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        The site location. This information is used for visualization in the Network Manager console. If you
     *        specify the address, the latitude and longitude are automatically calculated.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Address</code>: The physical address of the site.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Latitude</code>: The latitude of the site.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Longitude</code>: The longitude of the site.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withLocation(Location location) {
        setLocation(location);
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

    public CreateSiteRequest withTags(Tag... tags) {
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

    public CreateSiteRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
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

        if (obj instanceof CreateSiteRequest == false)
            return false;
        CreateSiteRequest other = (CreateSiteRequest) obj;
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
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSiteRequest clone() {
        return (CreateSiteRequest) super.clone();
    }

}
