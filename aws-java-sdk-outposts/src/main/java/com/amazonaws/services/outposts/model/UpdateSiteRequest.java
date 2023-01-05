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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     */
    private String siteId;

    private String name;

    private String description;
    /**
     * <p>
     * Notes about a site.
     * </p>
     */
    private String notes;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRequest withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Notes about a site.
     * </p>
     * 
     * @param notes
     *        Notes about a site.
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * Notes about a site.
     * </p>
     * 
     * @return Notes about a site.
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * <p>
     * Notes about a site.
     * </p>
     * 
     * @param notes
     *        Notes about a site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRequest withNotes(String notes) {
        setNotes(notes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes());
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
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSiteRequest clone() {
        return (UpdateSiteRequest) super.clone();
    }

}
