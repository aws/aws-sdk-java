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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionDependencies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionDependenciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested package version dependencies.
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
     * The name of the repository that contains the requested package version.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The format of the package with the requested dependencies. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
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
     * The name of the package versions' package.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested package version dependencies.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the requested package version
     *        dependencies.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested package version dependencies.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the requested package version
     *         dependencies.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested package version dependencies.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the requested package version
     *        dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesRequest withDomain(String domain) {
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

    public ListPackageVersionDependenciesRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the requested package version.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the requested package version.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository that contains the requested package version.
     * </p>
     * 
     * @return The name of the repository that contains the requested package version.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository that contains the requested package version.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the requested package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The format of the package with the requested dependencies. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package with the requested dependencies. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the package with the requested dependencies. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the package with the requested dependencies. The valid package types are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>: A Node Package Manager (npm) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>: A Python Package Index (PyPI) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *         file.
     *         </p>
     *         </li>
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the package with the requested dependencies. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package with the requested dependencies. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionDependenciesRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package with the requested dependencies. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package with the requested dependencies. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionDependenciesRequest withFormat(PackageFormat format) {
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

    public ListPackageVersionDependenciesRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package versions' package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package versions' package.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package versions' package.
     * </p>
     * 
     * @return The name of the package versions' package.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package versions' package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package versions' package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        A string that contains the package version (for example, <code>3.5.2</code>).
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @return A string that contains the package version (for example, <code>3.5.2</code>).
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        A string that contains the package version (for example, <code>3.5.2</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionDependenciesRequest withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
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

    public ListPackageVersionDependenciesRequest withNextToken(String nextToken) {
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
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
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

        if (obj instanceof ListPackageVersionDependenciesRequest == false)
            return false;
        ListPackageVersionDependenciesRequest other = (ListPackageVersionDependenciesRequest) obj;
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
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
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
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPackageVersionDependenciesRequest clone() {
        return (ListPackageVersionDependenciesRequest) super.clone();
    }

}
