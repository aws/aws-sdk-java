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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackageVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePackageVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the package to delete.
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
     * The name of the repository that contains the package versions to delete.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The format of the package versions to delete. The valid values are:
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
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package with the versions to delete.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * An array of strings that specify the versions of the package to delete.
     * </p>
     */
    private java.util.List<String> versions;
    /**
     * <p>
     * The expected status of the package version to delete. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     */
    private String expectedStatus;

    /**
     * <p>
     * The name of the domain that contains the package to delete.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the package to delete.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the package to delete.
     * </p>
     * 
     * @return The name of the domain that contains the package to delete.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the package to delete.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the package to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withDomain(String domain) {
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

    public DeletePackageVersionsRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to delete.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the package versions to delete.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to delete.
     * </p>
     * 
     * @return The name of the repository that contains the package versions to delete.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to delete.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the package versions to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The format of the package versions to delete. The valid values are:
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
     *        The format of the package versions to delete. The valid values are: </p>
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
     * The format of the package versions to delete. The valid values are:
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
     * @return The format of the package versions to delete. The valid values are: </p>
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
     * The format of the package versions to delete. The valid values are:
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
     *        The format of the package versions to delete. The valid values are: </p>
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

    public DeletePackageVersionsRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package versions to delete. The valid values are:
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
     *        The format of the package versions to delete. The valid values are: </p>
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

    public DeletePackageVersionsRequest withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace of the package. The package component that specifies its namespace depends on its type. For
     *         example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm package is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *         </p>
     *         </li>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package with the versions to delete.
     * </p>
     * 
     * @param packageValue
     *        The name of the package with the versions to delete.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package with the versions to delete.
     * </p>
     * 
     * @return The name of the package with the versions to delete.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package with the versions to delete.
     * </p>
     * 
     * @param packageValue
     *        The name of the package with the versions to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package to delete.
     * </p>
     * 
     * @return An array of strings that specify the versions of the package to delete.
     */

    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package to delete.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package to delete.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package to delete.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The expected status of the package version to delete. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param expectedStatus
     *        The expected status of the package version to delete. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @see PackageVersionStatus
     */

    public void setExpectedStatus(String expectedStatus) {
        this.expectedStatus = expectedStatus;
    }

    /**
     * <p>
     * The expected status of the package version to delete. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The expected status of the package version to delete. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Published</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unfinished</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unlisted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Disposed</code>
     *         </p>
     *         </li>
     * @see PackageVersionStatus
     */

    public String getExpectedStatus() {
        return this.expectedStatus;
    }

    /**
     * <p>
     * The expected status of the package version to delete. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param expectedStatus
     *        The expected status of the package version to delete. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public DeletePackageVersionsRequest withExpectedStatus(String expectedStatus) {
        setExpectedStatus(expectedStatus);
        return this;
    }

    /**
     * <p>
     * The expected status of the package version to delete. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param expectedStatus
     *        The expected status of the package version to delete. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public DeletePackageVersionsRequest withExpectedStatus(PackageVersionStatus expectedStatus) {
        this.expectedStatus = expectedStatus.toString();
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
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getExpectedStatus() != null)
            sb.append("ExpectedStatus: ").append(getExpectedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePackageVersionsRequest == false)
            return false;
        DeletePackageVersionsRequest other = (DeletePackageVersionsRequest) obj;
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
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getExpectedStatus() == null ^ this.getExpectedStatus() == null)
            return false;
        if (other.getExpectedStatus() != null && other.getExpectedStatus().equals(this.getExpectedStatus()) == false)
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
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getExpectedStatus() == null) ? 0 : getExpectedStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeletePackageVersionsRequest clone() {
        return (DeletePackageVersionsRequest) super.clone();
    }

}
