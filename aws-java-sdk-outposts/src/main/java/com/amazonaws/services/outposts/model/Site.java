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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a site.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/Site" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Site implements Serializable, Cloneable, StructuredPojo {

    private String siteId;

    private String accountId;

    private String name;

    private String description;
    /**
     * <p>
     * The site tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    private String siteArn;

    /**
     * @param siteId
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @param siteId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withAccountId(String accountId) {
        setAccountId(accountId);
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

    public Site withName(String name) {
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

    public Site withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The site tags.
     * </p>
     * 
     * @return The site tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The site tags.
     * </p>
     * 
     * @param tags
     *        The site tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The site tags.
     * </p>
     * 
     * @param tags
     *        The site tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Site#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Site addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * @param siteArn
     */

    public void setSiteArn(String siteArn) {
        this.siteArn = siteArn;
    }

    /**
     * @return
     */

    public String getSiteArn() {
        return this.siteArn;
    }

    /**
     * @param siteArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withSiteArn(String siteArn) {
        setSiteArn(siteArn);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSiteArn() != null)
            sb.append("SiteArn: ").append(getSiteArn());
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
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSiteArn() == null ^ this.getSiteArn() == null)
            return false;
        if (other.getSiteArn() != null && other.getSiteArn().equals(this.getSiteArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSiteArn() == null) ? 0 : getSiteArn().hashCode());
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
        com.amazonaws.services.outposts.model.transform.SiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
