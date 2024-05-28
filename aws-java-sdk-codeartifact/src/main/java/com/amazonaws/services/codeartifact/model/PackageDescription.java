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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A format that specifies the type of the package.
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
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
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
    private String name;
    /**
     * <p>
     * The package origin configuration for the package.
     * </p>
     */
    private PackageOriginConfiguration originConfiguration;

    /**
     * <p>
     * A format that specifies the type of the package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the package.
     * </p>
     * 
     * @return A format that specifies the type of the package.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PackageDescription withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PackageDescription withFormat(PackageFormat format) {
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
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package version is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm or Swift package version is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of a generic package is its <code>namespace</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *        those formats do not have a namespace.
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
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace of the package. The package component that specifies its namespace depends on its type. For
     *         example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package version is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm or Swift package version is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of a generic package is its <code>namespace</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *         those formats do not have a namespace.
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
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package version is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm or Swift package version is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of a generic package is its <code>namespace</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *        those formats do not have a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDescription withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param name
     *        The name of the package.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @return The name of the package.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param name
     *        The name of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The package origin configuration for the package.
     * </p>
     * 
     * @param originConfiguration
     *        The package origin configuration for the package.
     */

    public void setOriginConfiguration(PackageOriginConfiguration originConfiguration) {
        this.originConfiguration = originConfiguration;
    }

    /**
     * <p>
     * The package origin configuration for the package.
     * </p>
     * 
     * @return The package origin configuration for the package.
     */

    public PackageOriginConfiguration getOriginConfiguration() {
        return this.originConfiguration;
    }

    /**
     * <p>
     * The package origin configuration for the package.
     * </p>
     * 
     * @param originConfiguration
     *        The package origin configuration for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDescription withOriginConfiguration(PackageOriginConfiguration originConfiguration) {
        setOriginConfiguration(originConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOriginConfiguration() != null)
            sb.append("OriginConfiguration: ").append(getOriginConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageDescription == false)
            return false;
        PackageDescription other = (PackageDescription) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOriginConfiguration() == null ^ this.getOriginConfiguration() == null)
            return false;
        if (other.getOriginConfiguration() != null && other.getOriginConfiguration().equals(this.getOriginConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOriginConfiguration() == null) ? 0 : getOriginConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PackageDescription clone() {
        try {
            return (PackageDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
