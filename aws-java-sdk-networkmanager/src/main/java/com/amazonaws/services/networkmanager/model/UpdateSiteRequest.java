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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of your site.
     * </p>
     */
    private String siteId;
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
     * The site location:
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

    public UpdateSiteRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of your site.
     * </p>
     * 
     * @param siteId
     *        The ID of your site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID of your site.
     * </p>
     * 
     * @return The ID of your site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID of your site.
     * </p>
     * 
     * @param siteId
     *        The ID of your site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRequest withSiteId(String siteId) {
        setSiteId(siteId);
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

    public UpdateSiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The site location:
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
     *        The site location:</p>
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
     * The site location:
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
     * @return The site location:</p>
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
     * The site location:
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
     *        The site location:</p>
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

    public UpdateSiteRequest withLocation(Location location) {
        setLocation(location);
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
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSiteRequest == false)
            return false;
        UpdateSiteRequest other = (UpdateSiteRequest) obj;
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
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSiteRequest clone() {
        return (UpdateSiteRequest) super.clone();
    }

}
