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
 * A package associated with a package group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/AssociatedPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedPackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A format that specifies the type of the associated package.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The namespace of the associated package. The package component that specifies its namespace depends on its type.
     * For example:
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
     * The name of the associated package.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match can be thought of
     * as an exact match, and a weak match can be thought of as a variation match, for example, the package name matches
     * a variation of the package group pattern. For more information about package group pattern matching, including
     * strong and weak matches, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     */
    private String associationType;

    /**
     * <p>
     * A format that specifies the type of the associated package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the associated package.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the associated package.
     * </p>
     * 
     * @return A format that specifies the type of the associated package.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the associated package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the associated package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public AssociatedPackage withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the associated package.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the associated package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public AssociatedPackage withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the associated package. The package component that specifies its namespace depends on its type.
     * For example:
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
     *        The namespace of the associated package. The package component that specifies its namespace depends on its
     *        type. For example:</p>
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
     * The namespace of the associated package. The package component that specifies its namespace depends on its type.
     * For example:
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
     * @return The namespace of the associated package. The package component that specifies its namespace depends on
     *         its type. For example:</p>
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
     * The namespace of the associated package. The package component that specifies its namespace depends on its type.
     * For example:
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
     *        The namespace of the associated package. The package component that specifies its namespace depends on its
     *        type. For example:</p>
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

    public AssociatedPackage withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * 
     * @param packageValue
     *        The name of the associated package.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * 
     * @return The name of the associated package.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * 
     * @param packageValue
     *        The name of the associated package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPackage withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match can be thought of
     * as an exact match, and a weak match can be thought of as a variation match, for example, the package name matches
     * a variation of the package group pattern. For more information about package group pattern matching, including
     * strong and weak matches, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match can be
     *        thought of as an exact match, and a weak match can be thought of as a variation match, for example, the
     *        package name matches a variation of the package group pattern. For more information about package group
     *        pattern matching, including strong and weak matches, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     *        >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * @see PackageGroupAssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match can be thought of
     * as an exact match, and a weak match can be thought of as a variation match, for example, the package name matches
     * a variation of the package group pattern. For more information about package group pattern matching, including
     * strong and weak matches, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @return Describes the strength of the association between the package and package group. A strong match can be
     *         thought of as an exact match, and a weak match can be thought of as a variation match, for example, the
     *         package name matches a variation of the package group pattern. For more information about package group
     *         pattern matching, including strong and weak matches, see <a href=
     *         "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     *         >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * @see PackageGroupAssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match can be thought of
     * as an exact match, and a weak match can be thought of as a variation match, for example, the package name matches
     * a variation of the package group pattern. For more information about package group pattern matching, including
     * strong and weak matches, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match can be
     *        thought of as an exact match, and a weak match can be thought of as a variation match, for example, the
     *        package name matches a variation of the package group pattern. For more information about package group
     *        pattern matching, including strong and weak matches, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     *        >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupAssociationType
     */

    public AssociatedPackage withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * Describes the strength of the association between the package and package group. A strong match can be thought of
     * as an exact match, and a weak match can be thought of as a variation match, for example, the package name matches
     * a variation of the package group pattern. For more information about package group pattern matching, including
     * strong and weak matches, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param associationType
     *        Describes the strength of the association between the package and package group. A strong match can be
     *        thought of as an exact match, and a weak match can be thought of as a variation match, for example, the
     *        package name matches a variation of the package group pattern. For more information about package group
     *        pattern matching, including strong and weak matches, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     *        >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupAssociationType
     */

    public AssociatedPackage withAssociationType(PackageGroupAssociationType associationType) {
        this.associationType = associationType.toString();
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
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedPackage == false)
            return false;
        AssociatedPackage other = (AssociatedPackage) obj;
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
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
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
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedPackage clone() {
        try {
            return (AssociatedPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.AssociatedPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
