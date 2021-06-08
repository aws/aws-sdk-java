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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The default package version to display. This depends on the package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Maven and PyPI packages, it's the most recently published package version.
     * </p>
     * </li>
     * <li>
     * <p>
     * For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is
     * not set, it's the most recently published package version.
     * </p>
     * </li>
     * </ul>
     */
    private String defaultDisplayVersion;
    /**
     * <p>
     * A format of the package. Valid package format values are:
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
     * The name of the package.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects.
     * </p>
     */
    private java.util.List<PackageVersionSummary> versions;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The default package version to display. This depends on the package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Maven and PyPI packages, it's the most recently published package version.
     * </p>
     * </li>
     * <li>
     * <p>
     * For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is
     * not set, it's the most recently published package version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultDisplayVersion
     *        The default package version to display. This depends on the package format: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Maven and PyPI packages, it's the most recently published package version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code>
     *        tag is not set, it's the most recently published package version.
     *        </p>
     *        </li>
     */

    public void setDefaultDisplayVersion(String defaultDisplayVersion) {
        this.defaultDisplayVersion = defaultDisplayVersion;
    }

    /**
     * <p>
     * The default package version to display. This depends on the package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Maven and PyPI packages, it's the most recently published package version.
     * </p>
     * </li>
     * <li>
     * <p>
     * For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is
     * not set, it's the most recently published package version.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The default package version to display. This depends on the package format: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Maven and PyPI packages, it's the most recently published package version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code>
     *         tag is not set, it's the most recently published package version.
     *         </p>
     *         </li>
     */

    public String getDefaultDisplayVersion() {
        return this.defaultDisplayVersion;
    }

    /**
     * <p>
     * The default package version to display. This depends on the package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Maven and PyPI packages, it's the most recently published package version.
     * </p>
     * </li>
     * <li>
     * <p>
     * For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is
     * not set, it's the most recently published package version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultDisplayVersion
     *        The default package version to display. This depends on the package format: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Maven and PyPI packages, it's the most recently published package version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code>
     *        tag is not set, it's the most recently published package version.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withDefaultDisplayVersion(String defaultDisplayVersion) {
        setDefaultDisplayVersion(defaultDisplayVersion);
        return this;
    }

    /**
     * <p>
     * A format of the package. Valid package format values are:
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
     *        A format of the package. Valid package format values are: </p>
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
     * A format of the package. Valid package format values are:
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
     * @return A format of the package. Valid package format values are: </p>
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
     * A format of the package. Valid package format values are:
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
     *        A format of the package. Valid package format values are: </p>
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

    public ListPackageVersionsResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format of the package. Valid package format values are:
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
     *        A format of the package. Valid package format values are: </p>
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

    public ListPackageVersionsResult withFormat(PackageFormat format) {
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

    public ListPackageVersionsResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @return The name of the package.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects.
     * </p>
     * 
     * @return The returned list of <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     *         >PackageVersionSummary</a> objects.
     */

    public java.util.List<PackageVersionSummary> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects.
     * </p>
     * 
     * @param versions
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     *        >PackageVersionSummary</a> objects.
     */

    public void setVersions(java.util.Collection<PackageVersionSummary> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<PackageVersionSummary>(versions);
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     *        >PackageVersionSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withVersions(PackageVersionSummary... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<PackageVersionSummary>(versions.length));
        }
        for (PackageVersionSummary ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects.
     * </p>
     * 
     * @param versions
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     *        >PackageVersionSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withVersions(java.util.Collection<PackageVersionSummary> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withNextToken(String nextToken) {
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
        if (getDefaultDisplayVersion() != null)
            sb.append("DefaultDisplayVersion: ").append(getDefaultDisplayVersion()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
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

        if (obj instanceof ListPackageVersionsResult == false)
            return false;
        ListPackageVersionsResult other = (ListPackageVersionsResult) obj;
        if (other.getDefaultDisplayVersion() == null ^ this.getDefaultDisplayVersion() == null)
            return false;
        if (other.getDefaultDisplayVersion() != null && other.getDefaultDisplayVersion().equals(this.getDefaultDisplayVersion()) == false)
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

        hashCode = prime * hashCode + ((getDefaultDisplayVersion() == null) ? 0 : getDefaultDisplayVersion().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPackageVersionsResult clone() {
        try {
            return (ListPackageVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
