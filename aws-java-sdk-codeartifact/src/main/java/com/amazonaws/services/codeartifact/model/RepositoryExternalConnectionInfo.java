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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the external connection of a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/RepositoryExternalConnectionInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryExternalConnectionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     */
    private String externalConnectionName;
    /**
     * <p>
     * The package format associated with a repository's external connection. The valid package formats are:
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
    private String packageFormat;
    /**
     * <p>
     * The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * 
     * @param externalConnectionName
     *        The name of the external connection associated with a repository.
     */

    public void setExternalConnectionName(String externalConnectionName) {
        this.externalConnectionName = externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * 
     * @return The name of the external connection associated with a repository.
     */

    public String getExternalConnectionName() {
        return this.externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * 
     * @param externalConnectionName
     *        The name of the external connection associated with a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryExternalConnectionInfo withExternalConnectionName(String externalConnectionName) {
        setExternalConnectionName(externalConnectionName);
        return this;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection. The valid package formats are:
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
     * @param packageFormat
     *        The package format associated with a repository's external connection. The valid package formats are: </p>
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

    public void setPackageFormat(String packageFormat) {
        this.packageFormat = packageFormat;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection. The valid package formats are:
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
     * @return The package format associated with a repository's external connection. The valid package formats are:
     *         </p>
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

    public String getPackageFormat() {
        return this.packageFormat;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection. The valid package formats are:
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
     * @param packageFormat
     *        The package format associated with a repository's external connection. The valid package formats are: </p>
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

    public RepositoryExternalConnectionInfo withPackageFormat(String packageFormat) {
        setPackageFormat(packageFormat);
        return this;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection. The valid package formats are:
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
     * @param packageFormat
     *        The package format associated with a repository's external connection. The valid package formats are: </p>
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

    public RepositoryExternalConnectionInfo withPackageFormat(PackageFormat packageFormat) {
        this.packageFormat = packageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * </p>
     * 
     * @param status
     *        The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * @see ExternalConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * </p>
     * 
     * @return The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * @see ExternalConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * </p>
     * 
     * @param status
     *        The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalConnectionStatus
     */

    public RepositoryExternalConnectionInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * </p>
     * 
     * @param status
     *        The status of the external connection of a repository. There is one valid value, <code>Available</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalConnectionStatus
     */

    public RepositoryExternalConnectionInfo withStatus(ExternalConnectionStatus status) {
        this.status = status.toString();
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
        if (getExternalConnectionName() != null)
            sb.append("ExternalConnectionName: ").append(getExternalConnectionName()).append(",");
        if (getPackageFormat() != null)
            sb.append("PackageFormat: ").append(getPackageFormat()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryExternalConnectionInfo == false)
            return false;
        RepositoryExternalConnectionInfo other = (RepositoryExternalConnectionInfo) obj;
        if (other.getExternalConnectionName() == null ^ this.getExternalConnectionName() == null)
            return false;
        if (other.getExternalConnectionName() != null && other.getExternalConnectionName().equals(this.getExternalConnectionName()) == false)
            return false;
        if (other.getPackageFormat() == null ^ this.getPackageFormat() == null)
            return false;
        if (other.getPackageFormat() != null && other.getPackageFormat().equals(this.getPackageFormat()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalConnectionName() == null) ? 0 : getExternalConnectionName().hashCode());
        hashCode = prime * hashCode + ((getPackageFormat() == null) ? 0 : getPackageFormat().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryExternalConnectionInfo clone() {
        try {
            return (RepositoryExternalConnectionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.RepositoryExternalConnectionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
