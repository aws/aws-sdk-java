/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreatePackageGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain in which you want to create a package group.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The pattern of the package group to create. The pattern is also the identifier of the package group.
     * </p>
     */
    private String packageGroup;
    /**
     * <p>
     * The contact information for the created package group.
     * </p>
     */
    private String contactInfo;
    /**
     * <p>
     * A description of the package group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * One or more tag key-value pairs for the package group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the domain in which you want to create a package group.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which you want to create a package group.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which you want to create a package group.
     * </p>
     * 
     * @return The name of the domain in which you want to create a package group.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which you want to create a package group.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which you want to create a package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *         dashes or spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The pattern of the package group to create. The pattern is also the identifier of the package group.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group to create. The pattern is also the identifier of the package group.
     */

    public void setPackageGroup(String packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group to create. The pattern is also the identifier of the package group.
     * </p>
     * 
     * @return The pattern of the package group to create. The pattern is also the identifier of the package group.
     */

    public String getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group to create. The pattern is also the identifier of the package group.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group to create. The pattern is also the identifier of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withPackageGroup(String packageGroup) {
        setPackageGroup(packageGroup);
        return this;
    }

    /**
     * <p>
     * The contact information for the created package group.
     * </p>
     * 
     * @param contactInfo
     *        The contact information for the created package group.
     */

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * <p>
     * The contact information for the created package group.
     * </p>
     * 
     * @return The contact information for the created package group.
     */

    public String getContactInfo() {
        return this.contactInfo;
    }

    /**
     * <p>
     * The contact information for the created package group.
     * </p>
     * 
     * @param contactInfo
     *        The contact information for the created package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withContactInfo(String contactInfo) {
        setContactInfo(contactInfo);
        return this;
    }

    /**
     * <p>
     * A description of the package group.
     * </p>
     * 
     * @param description
     *        A description of the package group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the package group.
     * </p>
     * 
     * @return A description of the package group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the package group.
     * </p>
     * 
     * @param description
     *        A description of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the package group.
     * </p>
     * 
     * @return One or more tag key-value pairs for the package group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the package group.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the package group.
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
     * One or more tag key-value pairs for the package group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withTags(Tag... tags) {
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
     * One or more tag key-value pairs for the package group.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getPackageGroup() != null)
            sb.append("PackageGroup: ").append(getPackageGroup()).append(",");
        if (getContactInfo() != null)
            sb.append("ContactInfo: ").append(getContactInfo()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreatePackageGroupRequest == false)
            return false;
        CreatePackageGroupRequest other = (CreatePackageGroupRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getPackageGroup() == null ^ this.getPackageGroup() == null)
            return false;
        if (other.getPackageGroup() != null && other.getPackageGroup().equals(this.getPackageGroup()) == false)
            return false;
        if (other.getContactInfo() == null ^ this.getContactInfo() == null)
            return false;
        if (other.getContactInfo() != null && other.getContactInfo().equals(this.getContactInfo()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getPackageGroup() == null) ? 0 : getPackageGroup().hashCode());
        hashCode = prime * hashCode + ((getContactInfo() == null) ? 0 : getContactInfo().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageGroupRequest clone() {
        return (CreatePackageGroupRequest) super.clone();
    }

}
