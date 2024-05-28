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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListAssociatedPackages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedPackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the package group from which to list associated packages.
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
     * The pattern of the package group from which to list associated packages.
     * </p>
     */
    private String packageGroup;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would be
     * associated with a package group, even if it does not exist.
     * </p>
     */
    private Boolean preview;

    /**
     * <p>
     * The name of the domain that contains the package group from which to list associated packages.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the package group from which to list associated packages.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the package group from which to list associated packages.
     * </p>
     * 
     * @return The name of the domain that contains the package group from which to list associated packages.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the package group from which to list associated packages.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the package group from which to list associated packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedPackagesRequest withDomain(String domain) {
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

    public ListAssociatedPackagesRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The pattern of the package group from which to list associated packages.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group from which to list associated packages.
     */

    public void setPackageGroup(String packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group from which to list associated packages.
     * </p>
     * 
     * @return The pattern of the package group from which to list associated packages.
     */

    public String getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * The pattern of the package group from which to list associated packages.
     * </p>
     * 
     * @param packageGroup
     *        The pattern of the package group from which to list associated packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedPackagesRequest withPackageGroup(String packageGroup) {
        setPackageGroup(packageGroup);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedPackagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedPackagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would be
     * associated with a package group, even if it does not exist.
     * </p>
     * 
     * @param preview
     *        When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would
     *        be associated with a package group, even if it does not exist.
     */

    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    /**
     * <p>
     * When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would be
     * associated with a package group, even if it does not exist.
     * </p>
     * 
     * @return When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would
     *         be associated with a package group, even if it does not exist.
     */

    public Boolean getPreview() {
        return this.preview;
    }

    /**
     * <p>
     * When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would be
     * associated with a package group, even if it does not exist.
     * </p>
     * 
     * @param preview
     *        When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would
     *        be associated with a package group, even if it does not exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedPackagesRequest withPreview(Boolean preview) {
        setPreview(preview);
        return this;
    }

    /**
     * <p>
     * When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would be
     * associated with a package group, even if it does not exist.
     * </p>
     * 
     * @return When this flag is included, <code>ListAssociatedPackages</code> will return a list of packages that would
     *         be associated with a package group, even if it does not exist.
     */

    public Boolean isPreview() {
        return this.preview;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPreview() != null)
            sb.append("Preview: ").append(getPreview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociatedPackagesRequest == false)
            return false;
        ListAssociatedPackagesRequest other = (ListAssociatedPackagesRequest) obj;
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPreview() == null ^ this.getPreview() == null)
            return false;
        if (other.getPreview() != null && other.getPreview().equals(this.getPreview()) == false)
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPreview() == null) ? 0 : getPreview().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedPackagesRequest clone() {
        return (ListAssociatedPackagesRequest) super.clone();
    }

}
