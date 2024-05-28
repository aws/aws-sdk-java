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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageGroupOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageGroupOriginConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain which contains the package group for which to update the origin configuration.
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
     * The pattern of the package group for which to update the origin configuration.
     * </p>
     */
    private String packageGroup;
    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     */
    private java.util.Map<String, String> restrictions;
    /**
     * <p>
     * The repository name and restrictions to add to the allowed repository list of the specified package group.
     * </p>
     */
    private java.util.List<PackageGroupAllowedRepository> addAllowedRepositories;
    /**
     * <p>
     * The repository name and restrictions to remove from the allowed repository list of the specified package group.
     * </p>
     */
    private java.util.List<PackageGroupAllowedRepository> removeAllowedRepositories;

    /**
     * <p>
     * The name of the domain which contains the package group for which to update the origin configuration.
     * </p>
     * 
     * @param domain
     *        The name of the domain which contains the package group for which to update the origin configuration.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain which contains the package group for which to update the origin configuration.
     * </p>
     * 
     * @return The name of the domain which contains the package group for which to update the origin configuration.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain which contains the package group for which to update the origin configuration.
     * </p>
     * 
     * @param domain
     *        The name of the domain which contains the package group for which to update the origin configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withDomain(String domain) {
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

    public UpdatePackageGroupOriginConfigurationRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The pattern of the package group for which to update the origin configuration.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group for which to update the origin configuration.
     */

    public void setPackageGroup(String packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group for which to update the origin configuration.
     * </p>
     * 
     * @return The pattern of the package group for which to update the origin configuration.
     */

    public String getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group for which to update the origin configuration.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group for which to update the origin configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withPackageGroup(String packageGroup) {
        setPackageGroup(packageGroup);
        return this;
    }

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @return The origin configuration settings that determine how package versions can enter repositories.
     */

    public java.util.Map<String, String> getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @param restrictions
     *        The origin configuration settings that determine how package versions can enter repositories.
     */

    public void setRestrictions(java.util.Map<String, String> restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * The origin configuration settings that determine how package versions can enter repositories.
     * </p>
     * 
     * @param restrictions
     *        The origin configuration settings that determine how package versions can enter repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withRestrictions(java.util.Map<String, String> restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * Add a single Restrictions entry
     *
     * @see UpdatePackageGroupOriginConfigurationRequest#withRestrictions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest addRestrictionsEntry(String key, String value) {
        if (null == this.restrictions) {
            this.restrictions = new java.util.HashMap<String, String>();
        }
        if (this.restrictions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.restrictions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Restrictions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest clearRestrictionsEntries() {
        this.restrictions = null;
        return this;
    }

    /**
     * <p>
     * The repository name and restrictions to add to the allowed repository list of the specified package group.
     * </p>
     * 
     * @return The repository name and restrictions to add to the allowed repository list of the specified package
     *         group.
     */

    public java.util.List<PackageGroupAllowedRepository> getAddAllowedRepositories() {
        return addAllowedRepositories;
    }

    /**
     * <p>
     * The repository name and restrictions to add to the allowed repository list of the specified package group.
     * </p>
     * 
     * @param addAllowedRepositories
     *        The repository name and restrictions to add to the allowed repository list of the specified package group.
     */

    public void setAddAllowedRepositories(java.util.Collection<PackageGroupAllowedRepository> addAllowedRepositories) {
        if (addAllowedRepositories == null) {
            this.addAllowedRepositories = null;
            return;
        }

        this.addAllowedRepositories = new java.util.ArrayList<PackageGroupAllowedRepository>(addAllowedRepositories);
    }

    /**
     * <p>
     * The repository name and restrictions to add to the allowed repository list of the specified package group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddAllowedRepositories(java.util.Collection)} or
     * {@link #withAddAllowedRepositories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addAllowedRepositories
     *        The repository name and restrictions to add to the allowed repository list of the specified package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withAddAllowedRepositories(PackageGroupAllowedRepository... addAllowedRepositories) {
        if (this.addAllowedRepositories == null) {
            setAddAllowedRepositories(new java.util.ArrayList<PackageGroupAllowedRepository>(addAllowedRepositories.length));
        }
        for (PackageGroupAllowedRepository ele : addAllowedRepositories) {
            this.addAllowedRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The repository name and restrictions to add to the allowed repository list of the specified package group.
     * </p>
     * 
     * @param addAllowedRepositories
     *        The repository name and restrictions to add to the allowed repository list of the specified package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withAddAllowedRepositories(java.util.Collection<PackageGroupAllowedRepository> addAllowedRepositories) {
        setAddAllowedRepositories(addAllowedRepositories);
        return this;
    }

    /**
     * <p>
     * The repository name and restrictions to remove from the allowed repository list of the specified package group.
     * </p>
     * 
     * @return The repository name and restrictions to remove from the allowed repository list of the specified package
     *         group.
     */

    public java.util.List<PackageGroupAllowedRepository> getRemoveAllowedRepositories() {
        return removeAllowedRepositories;
    }

    /**
     * <p>
     * The repository name and restrictions to remove from the allowed repository list of the specified package group.
     * </p>
     * 
     * @param removeAllowedRepositories
     *        The repository name and restrictions to remove from the allowed repository list of the specified package
     *        group.
     */

    public void setRemoveAllowedRepositories(java.util.Collection<PackageGroupAllowedRepository> removeAllowedRepositories) {
        if (removeAllowedRepositories == null) {
            this.removeAllowedRepositories = null;
            return;
        }

        this.removeAllowedRepositories = new java.util.ArrayList<PackageGroupAllowedRepository>(removeAllowedRepositories);
    }

    /**
     * <p>
     * The repository name and restrictions to remove from the allowed repository list of the specified package group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveAllowedRepositories(java.util.Collection)} or
     * {@link #withRemoveAllowedRepositories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeAllowedRepositories
     *        The repository name and restrictions to remove from the allowed repository list of the specified package
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withRemoveAllowedRepositories(PackageGroupAllowedRepository... removeAllowedRepositories) {
        if (this.removeAllowedRepositories == null) {
            setRemoveAllowedRepositories(new java.util.ArrayList<PackageGroupAllowedRepository>(removeAllowedRepositories.length));
        }
        for (PackageGroupAllowedRepository ele : removeAllowedRepositories) {
            this.removeAllowedRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The repository name and restrictions to remove from the allowed repository list of the specified package group.
     * </p>
     * 
     * @param removeAllowedRepositories
     *        The repository name and restrictions to remove from the allowed repository list of the specified package
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationRequest withRemoveAllowedRepositories(
            java.util.Collection<PackageGroupAllowedRepository> removeAllowedRepositories) {
        setRemoveAllowedRepositories(removeAllowedRepositories);
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
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions()).append(",");
        if (getAddAllowedRepositories() != null)
            sb.append("AddAllowedRepositories: ").append(getAddAllowedRepositories()).append(",");
        if (getRemoveAllowedRepositories() != null)
            sb.append("RemoveAllowedRepositories: ").append(getRemoveAllowedRepositories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageGroupOriginConfigurationRequest == false)
            return false;
        UpdatePackageGroupOriginConfigurationRequest other = (UpdatePackageGroupOriginConfigurationRequest) obj;
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
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getAddAllowedRepositories() == null ^ this.getAddAllowedRepositories() == null)
            return false;
        if (other.getAddAllowedRepositories() != null && other.getAddAllowedRepositories().equals(this.getAddAllowedRepositories()) == false)
            return false;
        if (other.getRemoveAllowedRepositories() == null ^ this.getRemoveAllowedRepositories() == null)
            return false;
        if (other.getRemoveAllowedRepositories() != null && other.getRemoveAllowedRepositories().equals(this.getRemoveAllowedRepositories()) == false)
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
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getAddAllowedRepositories() == null) ? 0 : getAddAllowedRepositories().hashCode());
        hashCode = prime * hashCode + ((getRemoveAllowedRepositories() == null) ? 0 : getRemoveAllowedRepositories().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageGroupOriginConfigurationRequest clone() {
        return (UpdatePackageGroupOriginConfigurationRequest) super.clone();
    }

}
