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
 * Details about a package dependency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageDependency implements Serializable, Cloneable, StructuredPojo {

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
     * The name of the package that this package depends on.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The type of a package dependency. The possible values depend on the package type. Example types are
     * <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>,
     * <code>prod</code>, and <code>optional</code> for npm packages.
     * </p>
     */
    private String dependencyType;
    /**
     * <p>
     * The required version, or version range, of the package that this package depends on. The version format is
     * specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     * </p>
     */
    private String versionRequirement;

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

    public PackageDependency withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that this package depends on.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that this package depends on.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that this package depends on.
     * </p>
     * 
     * @return The name of the package that this package depends on.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that this package depends on.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that this package depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDependency withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The type of a package dependency. The possible values depend on the package type. Example types are
     * <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>,
     * <code>prod</code>, and <code>optional</code> for npm packages.
     * </p>
     * 
     * @param dependencyType
     *        The type of a package dependency. The possible values depend on the package type. Example types are
     *        <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>
     *        , <code>prod</code>, and <code>optional</code> for npm packages.
     */

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    /**
     * <p>
     * The type of a package dependency. The possible values depend on the package type. Example types are
     * <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>,
     * <code>prod</code>, and <code>optional</code> for npm packages.
     * </p>
     * 
     * @return The type of a package dependency. The possible values depend on the package type. Example types are
     *         <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and
     *         <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages.
     */

    public String getDependencyType() {
        return this.dependencyType;
    }

    /**
     * <p>
     * The type of a package dependency. The possible values depend on the package type. Example types are
     * <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>,
     * <code>prod</code>, and <code>optional</code> for npm packages.
     * </p>
     * 
     * @param dependencyType
     *        The type of a package dependency. The possible values depend on the package type. Example types are
     *        <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>
     *        , <code>prod</code>, and <code>optional</code> for npm packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDependency withDependencyType(String dependencyType) {
        setDependencyType(dependencyType);
        return this;
    }

    /**
     * <p>
     * The required version, or version range, of the package that this package depends on. The version format is
     * specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     * </p>
     * 
     * @param versionRequirement
     *        The required version, or version range, of the package that this package depends on. The version format is
     *        specific to the package type. For example, the following are possible valid required versions:
     *        <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     */

    public void setVersionRequirement(String versionRequirement) {
        this.versionRequirement = versionRequirement;
    }

    /**
     * <p>
     * The required version, or version range, of the package that this package depends on. The version format is
     * specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     * </p>
     * 
     * @return The required version, or version range, of the package that this package depends on. The version format
     *         is specific to the package type. For example, the following are possible valid required versions:
     *         <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     */

    public String getVersionRequirement() {
        return this.versionRequirement;
    }

    /**
     * <p>
     * The required version, or version range, of the package that this package depends on. The version format is
     * specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     * </p>
     * 
     * @param versionRequirement
     *        The required version, or version range, of the package that this package depends on. The version format is
     *        specific to the package type. For example, the following are possible valid required versions:
     *        <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageDependency withVersionRequirement(String versionRequirement) {
        setVersionRequirement(versionRequirement);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getDependencyType() != null)
            sb.append("DependencyType: ").append(getDependencyType()).append(",");
        if (getVersionRequirement() != null)
            sb.append("VersionRequirement: ").append(getVersionRequirement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageDependency == false)
            return false;
        PackageDependency other = (PackageDependency) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        if (other.getDependencyType() == null ^ this.getDependencyType() == null)
            return false;
        if (other.getDependencyType() != null && other.getDependencyType().equals(this.getDependencyType()) == false)
            return false;
        if (other.getVersionRequirement() == null ^ this.getVersionRequirement() == null)
            return false;
        if (other.getVersionRequirement() != null && other.getVersionRequirement().equals(this.getVersionRequirement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getDependencyType() == null) ? 0 : getDependencyType().hashCode());
        hashCode = prime * hashCode + ((getVersionRequirement() == null) ? 0 : getVersionRequirement().hashCode());
        return hashCode;
    }

    @Override
    public PackageDependency clone() {
        try {
            return (PackageDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
