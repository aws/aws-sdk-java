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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionAsset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionAssetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version with the requested asset.
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
     * The repository that contains the package version with the requested asset.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file. The valid values are:
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
     * The name of the package that contains the requested asset.
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
     * The name of the requested asset.
     * </p>
     */
    private String asset;
    /**
     * <p>
     * The name of the package version revision that contains the requested asset.
     * </p>
     */
    private String packageVersionRevision;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version with the requested asset.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package version with the requested
     *        asset.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version with the requested asset.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the package version with the requested
     *         asset.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version with the requested asset.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package version with the requested
     *        asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetRequest withDomain(String domain) {
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

    public GetPackageVersionAssetRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The repository that contains the package version with the requested asset.
     * </p>
     * 
     * @param repository
     *        The repository that contains the package version with the requested asset.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository that contains the package version with the requested asset.
     * </p>
     * 
     * @return The repository that contains the package version with the requested asset.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository that contains the package version with the requested asset.
     * </p>
     * 
     * @param repository
     *        The repository that contains the package version with the requested asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file. The valid values are:
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
     *        A format that specifies the type of the package version with the requested asset file. The valid values
     *        are: </p>
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
     * A format that specifies the type of the package version with the requested asset file. The valid values are:
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
     * @return A format that specifies the type of the package version with the requested asset file. The valid values
     *         are: </p>
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
     * A format that specifies the type of the package version with the requested asset file. The valid values are:
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
     *        A format that specifies the type of the package version with the requested asset file. The valid values
     *        are: </p>
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

    public GetPackageVersionAssetRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file. The valid values are:
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
     *        A format that specifies the type of the package version with the requested asset file. The valid values
     *        are: </p>
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

    public GetPackageVersionAssetRequest withFormat(PackageFormat format) {
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

    public GetPackageVersionAssetRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that contains the requested asset.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the requested asset.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the requested asset.
     * </p>
     * 
     * @return The name of the package that contains the requested asset.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the requested asset.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the requested asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetRequest withPackage(String packageValue) {
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

    public GetPackageVersionAssetRequest withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The name of the requested asset.
     * </p>
     * 
     * @param asset
     *        The name of the requested asset.
     */

    public void setAsset(String asset) {
        this.asset = asset;
    }

    /**
     * <p>
     * The name of the requested asset.
     * </p>
     * 
     * @return The name of the requested asset.
     */

    public String getAsset() {
        return this.asset;
    }

    /**
     * <p>
     * The name of the requested asset.
     * </p>
     * 
     * @param asset
     *        The name of the requested asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetRequest withAsset(String asset) {
        setAsset(asset);
        return this;
    }

    /**
     * <p>
     * The name of the package version revision that contains the requested asset.
     * </p>
     * 
     * @param packageVersionRevision
     *        The name of the package version revision that contains the requested asset.
     */

    public void setPackageVersionRevision(String packageVersionRevision) {
        this.packageVersionRevision = packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the requested asset.
     * </p>
     * 
     * @return The name of the package version revision that contains the requested asset.
     */

    public String getPackageVersionRevision() {
        return this.packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the requested asset.
     * </p>
     * 
     * @param packageVersionRevision
     *        The name of the package version revision that contains the requested asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetRequest withPackageVersionRevision(String packageVersionRevision) {
        setPackageVersionRevision(packageVersionRevision);
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
        if (getAsset() != null)
            sb.append("Asset: ").append(getAsset()).append(",");
        if (getPackageVersionRevision() != null)
            sb.append("PackageVersionRevision: ").append(getPackageVersionRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageVersionAssetRequest == false)
            return false;
        GetPackageVersionAssetRequest other = (GetPackageVersionAssetRequest) obj;
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
        if (other.getAsset() == null ^ this.getAsset() == null)
            return false;
        if (other.getAsset() != null && other.getAsset().equals(this.getAsset()) == false)
            return false;
        if (other.getPackageVersionRevision() == null ^ this.getPackageVersionRevision() == null)
            return false;
        if (other.getPackageVersionRevision() != null && other.getPackageVersionRevision().equals(this.getPackageVersionRevision()) == false)
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
        hashCode = prime * hashCode + ((getAsset() == null) ? 0 : getAsset().hashCode());
        hashCode = prime * hashCode + ((getPackageVersionRevision() == null) ? 0 : getPackageVersionRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionAssetRequest clone() {
        return (GetPackageVersionAssetRequest) super.clone();
    }

}
