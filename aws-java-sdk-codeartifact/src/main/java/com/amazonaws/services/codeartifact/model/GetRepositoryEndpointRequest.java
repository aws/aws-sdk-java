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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositoryEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     */
    private String format;

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @return The name of the domain that contains the repository.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryEndpointRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *        not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *         not include dashes or spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *        not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryEndpointRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repository
     *        The name of the repository.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repository
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryEndpointRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>
     *         </p>
     *         </li>
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public GetRepositoryEndpointRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        Returns which endpoint of a repository to return. A repository has one endpoint for each package format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public GetRepositoryEndpointRequest withFormat(PackageFormat format) {
        this.format = format.toString();
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
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryEndpointRequest == false)
            return false;
        GetRepositoryEndpointRequest other = (GetRepositoryEndpointRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositoryEndpointRequest clone() {
        return (GetRepositoryEndpointRequest) super.clone();
    }

}
