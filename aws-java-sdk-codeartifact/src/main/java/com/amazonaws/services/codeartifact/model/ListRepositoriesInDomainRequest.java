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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositoriesInDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoriesInDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the returned list of repositories.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * Filter the list of repositories to only include those that are managed by the AWS account ID.
     * </p>
     */
    private String administratorAccount;
    /**
     * <p>
     * A prefix used to filter returned repositories. Only repositories with names that start with
     * <code>repositoryPrefix</code> are returned.
     * </p>
     */
    private String repositoryPrefix;
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
     * The name of the domain that contains the returned list of repositories.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the returned list of repositories.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the returned list of repositories.
     * </p>
     * 
     * @return The name of the domain that contains the returned list of repositories.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the returned list of repositories.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the returned list of repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesInDomainRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesInDomainRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * Filter the list of repositories to only include those that are managed by the AWS account ID.
     * </p>
     * 
     * @param administratorAccount
     *        Filter the list of repositories to only include those that are managed by the AWS account ID.
     */

    public void setAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
    }

    /**
     * <p>
     * Filter the list of repositories to only include those that are managed by the AWS account ID.
     * </p>
     * 
     * @return Filter the list of repositories to only include those that are managed by the AWS account ID.
     */

    public String getAdministratorAccount() {
        return this.administratorAccount;
    }

    /**
     * <p>
     * Filter the list of repositories to only include those that are managed by the AWS account ID.
     * </p>
     * 
     * @param administratorAccount
     *        Filter the list of repositories to only include those that are managed by the AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesInDomainRequest withAdministratorAccount(String administratorAccount) {
        setAdministratorAccount(administratorAccount);
        return this;
    }

    /**
     * <p>
     * A prefix used to filter returned repositories. Only repositories with names that start with
     * <code>repositoryPrefix</code> are returned.
     * </p>
     * 
     * @param repositoryPrefix
     *        A prefix used to filter returned repositories. Only repositories with names that start with
     *        <code>repositoryPrefix</code> are returned.
     */

    public void setRepositoryPrefix(String repositoryPrefix) {
        this.repositoryPrefix = repositoryPrefix;
    }

    /**
     * <p>
     * A prefix used to filter returned repositories. Only repositories with names that start with
     * <code>repositoryPrefix</code> are returned.
     * </p>
     * 
     * @return A prefix used to filter returned repositories. Only repositories with names that start with
     *         <code>repositoryPrefix</code> are returned.
     */

    public String getRepositoryPrefix() {
        return this.repositoryPrefix;
    }

    /**
     * <p>
     * A prefix used to filter returned repositories. Only repositories with names that start with
     * <code>repositoryPrefix</code> are returned.
     * </p>
     * 
     * @param repositoryPrefix
     *        A prefix used to filter returned repositories. Only repositories with names that start with
     *        <code>repositoryPrefix</code> are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesInDomainRequest withRepositoryPrefix(String repositoryPrefix) {
        setRepositoryPrefix(repositoryPrefix);
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

    public ListRepositoriesInDomainRequest withMaxResults(Integer maxResults) {
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

    public ListRepositoriesInDomainRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAdministratorAccount() != null)
            sb.append("AdministratorAccount: ").append(getAdministratorAccount()).append(",");
        if (getRepositoryPrefix() != null)
            sb.append("RepositoryPrefix: ").append(getRepositoryPrefix()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesInDomainRequest == false)
            return false;
        ListRepositoriesInDomainRequest other = (ListRepositoriesInDomainRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getAdministratorAccount() == null ^ this.getAdministratorAccount() == null)
            return false;
        if (other.getAdministratorAccount() != null && other.getAdministratorAccount().equals(this.getAdministratorAccount()) == false)
            return false;
        if (other.getRepositoryPrefix() == null ^ this.getRepositoryPrefix() == null)
            return false;
        if (other.getRepositoryPrefix() != null && other.getRepositoryPrefix().equals(this.getRepositoryPrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getAdministratorAccount() == null) ? 0 : getAdministratorAccount().hashCode());
        hashCode = prime * hashCode + ((getRepositoryPrefix() == null) ? 0 : getRepositoryPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoriesInDomainRequest clone() {
        return (ListRepositoriesInDomainRequest) super.clone();
    }

}
