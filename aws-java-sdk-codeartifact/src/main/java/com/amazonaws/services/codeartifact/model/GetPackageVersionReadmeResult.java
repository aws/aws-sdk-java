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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionReadme"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionReadmeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the package with the requested readme file. Valid format types are:
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
     * The name of the package that contains the returned readme file.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The version of the package with the requested readme file.
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
     * The text of the returned readme file.
     * </p>
     */
    private String readme;

    /**
     * <p>
     * The format of the package with the requested readme file. Valid format types are:
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
     *        The format of the package with the requested readme file. Valid format types are: </p>
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
     * The format of the package with the requested readme file. Valid format types are:
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
     * @return The format of the package with the requested readme file. Valid format types are: </p>
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
     * The format of the package with the requested readme file. Valid format types are:
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
     *        The format of the package with the requested readme file. Valid format types are: </p>
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

    public GetPackageVersionReadmeResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package with the requested readme file. Valid format types are:
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
     *        The format of the package with the requested readme file. Valid format types are: </p>
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

    public GetPackageVersionReadmeResult withFormat(PackageFormat format) {
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

    public GetPackageVersionReadmeResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that contains the returned readme file.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned readme file.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned readme file.
     * </p>
     * 
     * @return The name of the package that contains the returned readme file.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that contains the returned readme file.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that contains the returned readme file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionReadmeResult withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The version of the package with the requested readme file.
     * </p>
     * 
     * @param version
     *        The version of the package with the requested readme file.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package with the requested readme file.
     * </p>
     * 
     * @return The version of the package with the requested readme file.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the package with the requested readme file.
     * </p>
     * 
     * @param version
     *        The version of the package with the requested readme file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionReadmeResult withVersion(String version) {
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

    public GetPackageVersionReadmeResult withVersionRevision(String versionRevision) {
        setVersionRevision(versionRevision);
        return this;
    }

    /**
     * <p>
     * The text of the returned readme file.
     * </p>
     * 
     * @param readme
     *        The text of the returned readme file.
     */

    public void setReadme(String readme) {
        this.readme = readme;
    }

    /**
     * <p>
     * The text of the returned readme file.
     * </p>
     * 
     * @return The text of the returned readme file.
     */

    public String getReadme() {
        return this.readme;
    }

    /**
     * <p>
     * The text of the returned readme file.
     * </p>
     * 
     * @param readme
     *        The text of the returned readme file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionReadmeResult withReadme(String readme) {
        setReadme(readme);
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
        if (getReadme() != null)
            sb.append("Readme: ").append(getReadme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageVersionReadmeResult == false)
            return false;
        GetPackageVersionReadmeResult other = (GetPackageVersionReadmeResult) obj;
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
        if (other.getReadme() == null ^ this.getReadme() == null)
            return false;
        if (other.getReadme() != null && other.getReadme().equals(this.getReadme()) == false)
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
        hashCode = prime * hashCode + ((getReadme() == null) ? 0 : getReadme().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionReadmeResult clone() {
        try {
            return (GetPackageVersionReadmeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
