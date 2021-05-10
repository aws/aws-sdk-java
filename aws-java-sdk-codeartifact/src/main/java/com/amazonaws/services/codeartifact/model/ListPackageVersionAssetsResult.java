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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionAssets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionAssetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the package that contains the returned package version assets.
     * </p>
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
     * The name of the package that contains the returned package version assets.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The version of the package associated with the returned assets.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     */
    private String versionRevision;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects.
     * </p>
     */
    private java.util.List<AssetSummary> assets;

    /**
     * <p>
     * The format of the package that contains the returned package version assets.
     * </p>
     * 
     * @param format
     *        The format of the package that contains the returned package version assets.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the package that contains the returned package version assets.
     * </p>
     * 
     * @return The format of the package that contains the returned package version assets.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the package that contains the returned package version assets.
     * </p>
     * 
     * @param format
     *        The format of the package that contains the returned package version assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionAssetsResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package that contains the returned package version assets.
     * </p>
     * 
     * @param format
     *        The format of the package that contains the returned package version assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackageVersionAssetsResult withFormat(PackageFormat format) {
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

    public ListPackageVersionAssetsResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that contains the returned package version assets.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned package version assets.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned package version assets.
     * </p>
     * 
     * @return The name of the package that contains the returned package version assets.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned package version assets.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned package version assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionAssetsResult withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The version of the package associated with the returned assets.
     * </p>
     * 
     * @param version
     *        The version of the package associated with the returned assets.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package associated with the returned assets.
     * </p>
     * 
     * @return The version of the package associated with the returned assets.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the package associated with the returned assets.
     * </p>
     * 
     * @param version
     *        The version of the package associated with the returned assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionAssetsResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @param versionRevision
     *        The current revision associated with the package version.
     */

    public void setVersionRevision(String versionRevision) {
        this.versionRevision = versionRevision;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @return The current revision associated with the package version.
     */

    public String getVersionRevision() {
        return this.versionRevision;
    }

    /**
     * <p>
     * The current revision associated with the package version.
     * </p>
     * 
     * @param versionRevision
     *        The current revision associated with the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionAssetsResult withVersionRevision(String versionRevision) {
        setVersionRevision(versionRevision);
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

    public ListPackageVersionAssetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects.
     * </p>
     * 
     * @return The returned list of <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html"
     *         >AssetSummary</a> objects.
     */

    public java.util.List<AssetSummary> getAssets() {
        return assets;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects.
     * </p>
     * 
     * @param assets
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     *        objects.
     */

    public void setAssets(java.util.Collection<AssetSummary> assets) {
        if (assets == null) {
            this.assets = null;
            return;
        }

        this.assets = new java.util.ArrayList<AssetSummary>(assets);
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssets(java.util.Collection)} or {@link #withAssets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param assets
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionAssetsResult withAssets(AssetSummary... assets) {
        if (this.assets == null) {
            setAssets(new java.util.ArrayList<AssetSummary>(assets.length));
        }
        for (AssetSummary ele : assets) {
            this.assets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects.
     * </p>
     * 
     * @param assets
     *        The returned list of <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionAssetsResult withAssets(java.util.Collection<AssetSummary> assets) {
        setAssets(assets);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionRevision() != null)
            sb.append("VersionRevision: ").append(getVersionRevision()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAssets() != null)
            sb.append("Assets: ").append(getAssets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackageVersionAssetsResult == false)
            return false;
        ListPackageVersionAssetsResult other = (ListPackageVersionAssetsResult) obj;
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionRevision() == null ^ this.getVersionRevision() == null)
            return false;
        if (other.getVersionRevision() != null && other.getVersionRevision().equals(this.getVersionRevision()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionRevision() == null) ? 0 : getVersionRevision().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        return hashCode;
    }

    @Override
    public ListPackageVersionAssetsResult clone() {
        try {
            return (ListPackageVersionAssetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
