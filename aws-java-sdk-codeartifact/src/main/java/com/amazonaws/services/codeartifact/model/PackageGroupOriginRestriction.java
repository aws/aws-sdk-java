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
 * Contains information about the configured restrictions of the origin controls of a package group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageGroupOriginRestriction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageGroupOriginRestriction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value is <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the
     * value of <code>mode</code> of the first parent group which does not have a value of <code>INHERIT</code>.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The effective package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value of <code>mode</code> is <code>INHERIT</code>, then the value of
     * <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not have a
     * value of <code>INHERIT</code>.
     * </p>
     */
    private String effectiveMode;
    /**
     * <p>
     * The parent package group that the package group origin restrictions are inherited from.
     * </p>
     */
    private PackageGroupReference inheritedFrom;
    /**
     * <p>
     * The number of repositories in the allowed repository list.
     * </p>
     */
    private Long repositoriesCount;

    /**
     * <p>
     * The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value is <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the
     * value of <code>mode</code> of the first parent group which does not have a value of <code>INHERIT</code>.
     * </p>
     * 
     * @param mode
     *        The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     *        <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value is <code>INHERIT</code>, then the value
     *        of <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not
     *        have a value of <code>INHERIT</code>.
     * @see PackageGroupOriginRestrictionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value is <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the
     * value of <code>mode</code> of the first parent group which does not have a value of <code>INHERIT</code>.
     * </p>
     * 
     * @return The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     *         <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *         <code>effectiveMode</code> is the same. Otherwise, when the value is <code>INHERIT</code>, then the value
     *         of <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not
     *         have a value of <code>INHERIT</code>.
     * @see PackageGroupOriginRestrictionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value is <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the
     * value of <code>mode</code> of the first parent group which does not have a value of <code>INHERIT</code>.
     * </p>
     * 
     * @param mode
     *        The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     *        <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value is <code>INHERIT</code>, then the value
     *        of <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not
     *        have a value of <code>INHERIT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionMode
     */

    public PackageGroupOriginRestriction withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value is <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the
     * value of <code>mode</code> of the first parent group which does not have a value of <code>INHERIT</code>.
     * </p>
     * 
     * @param mode
     *        The package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     *        <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value is <code>INHERIT</code>, then the value
     *        of <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not
     *        have a value of <code>INHERIT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionMode
     */

    public PackageGroupOriginRestriction withMode(PackageGroupOriginRestrictionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The effective package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value of <code>mode</code> is <code>INHERIT</code>, then the value of
     * <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not have a
     * value of <code>INHERIT</code>.
     * </p>
     * 
     * @param effectiveMode
     *        The effective package group origin restriction setting. If the value of <code>mode</code> is
     *        <code>ALLOW</code>, <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value of <code>mode</code> is
     *        <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the value of <code>mode</code> of
     *        the first parent group which does not have a value of <code>INHERIT</code>.
     * @see PackageGroupOriginRestrictionMode
     */

    public void setEffectiveMode(String effectiveMode) {
        this.effectiveMode = effectiveMode;
    }

    /**
     * <p>
     * The effective package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value of <code>mode</code> is <code>INHERIT</code>, then the value of
     * <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not have a
     * value of <code>INHERIT</code>.
     * </p>
     * 
     * @return The effective package group origin restriction setting. If the value of <code>mode</code> is
     *         <code>ALLOW</code>, <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *         <code>effectiveMode</code> is the same. Otherwise, when the value of <code>mode</code> is
     *         <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the value of <code>mode</code> of
     *         the first parent group which does not have a value of <code>INHERIT</code>.
     * @see PackageGroupOriginRestrictionMode
     */

    public String getEffectiveMode() {
        return this.effectiveMode;
    }

    /**
     * <p>
     * The effective package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value of <code>mode</code> is <code>INHERIT</code>, then the value of
     * <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not have a
     * value of <code>INHERIT</code>.
     * </p>
     * 
     * @param effectiveMode
     *        The effective package group origin restriction setting. If the value of <code>mode</code> is
     *        <code>ALLOW</code>, <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value of <code>mode</code> is
     *        <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the value of <code>mode</code> of
     *        the first parent group which does not have a value of <code>INHERIT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionMode
     */

    public PackageGroupOriginRestriction withEffectiveMode(String effectiveMode) {
        setEffectiveMode(effectiveMode);
        return this;
    }

    /**
     * <p>
     * The effective package group origin restriction setting. If the value of <code>mode</code> is <code>ALLOW</code>,
     * <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of <code>effectiveMode</code> is
     * the same. Otherwise, when the value of <code>mode</code> is <code>INHERIT</code>, then the value of
     * <code>effectiveMode</code> is the value of <code>mode</code> of the first parent group which does not have a
     * value of <code>INHERIT</code>.
     * </p>
     * 
     * @param effectiveMode
     *        The effective package group origin restriction setting. If the value of <code>mode</code> is
     *        <code>ALLOW</code>, <code>ALLOW_SPECIFIC_REPOSITORIES</code>, or <code>BLOCK</code>, then the value of
     *        <code>effectiveMode</code> is the same. Otherwise, when the value of <code>mode</code> is
     *        <code>INHERIT</code>, then the value of <code>effectiveMode</code> is the value of <code>mode</code> of
     *        the first parent group which does not have a value of <code>INHERIT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionMode
     */

    public PackageGroupOriginRestriction withEffectiveMode(PackageGroupOriginRestrictionMode effectiveMode) {
        this.effectiveMode = effectiveMode.toString();
        return this;
    }

    /**
     * <p>
     * The parent package group that the package group origin restrictions are inherited from.
     * </p>
     * 
     * @param inheritedFrom
     *        The parent package group that the package group origin restrictions are inherited from.
     */

    public void setInheritedFrom(PackageGroupReference inheritedFrom) {
        this.inheritedFrom = inheritedFrom;
    }

    /**
     * <p>
     * The parent package group that the package group origin restrictions are inherited from.
     * </p>
     * 
     * @return The parent package group that the package group origin restrictions are inherited from.
     */

    public PackageGroupReference getInheritedFrom() {
        return this.inheritedFrom;
    }

    /**
     * <p>
     * The parent package group that the package group origin restrictions are inherited from.
     * </p>
     * 
     * @param inheritedFrom
     *        The parent package group that the package group origin restrictions are inherited from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupOriginRestriction withInheritedFrom(PackageGroupReference inheritedFrom) {
        setInheritedFrom(inheritedFrom);
        return this;
    }

    /**
     * <p>
     * The number of repositories in the allowed repository list.
     * </p>
     * 
     * @param repositoriesCount
     *        The number of repositories in the allowed repository list.
     */

    public void setRepositoriesCount(Long repositoriesCount) {
        this.repositoriesCount = repositoriesCount;
    }

    /**
     * <p>
     * The number of repositories in the allowed repository list.
     * </p>
     * 
     * @return The number of repositories in the allowed repository list.
     */

    public Long getRepositoriesCount() {
        return this.repositoriesCount;
    }

    /**
     * <p>
     * The number of repositories in the allowed repository list.
     * </p>
     * 
     * @param repositoriesCount
     *        The number of repositories in the allowed repository list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupOriginRestriction withRepositoriesCount(Long repositoriesCount) {
        setRepositoriesCount(repositoriesCount);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getEffectiveMode() != null)
            sb.append("EffectiveMode: ").append(getEffectiveMode()).append(",");
        if (getInheritedFrom() != null)
            sb.append("InheritedFrom: ").append(getInheritedFrom()).append(",");
        if (getRepositoriesCount() != null)
            sb.append("RepositoriesCount: ").append(getRepositoriesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageGroupOriginRestriction == false)
            return false;
        PackageGroupOriginRestriction other = (PackageGroupOriginRestriction) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getEffectiveMode() == null ^ this.getEffectiveMode() == null)
            return false;
        if (other.getEffectiveMode() != null && other.getEffectiveMode().equals(this.getEffectiveMode()) == false)
            return false;
        if (other.getInheritedFrom() == null ^ this.getInheritedFrom() == null)
            return false;
        if (other.getInheritedFrom() != null && other.getInheritedFrom().equals(this.getInheritedFrom()) == false)
            return false;
        if (other.getRepositoriesCount() == null ^ this.getRepositoriesCount() == null)
            return false;
        if (other.getRepositoriesCount() != null && other.getRepositoriesCount().equals(this.getRepositoriesCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getEffectiveMode() == null) ? 0 : getEffectiveMode().hashCode());
        hashCode = prime * hashCode + ((getInheritedFrom() == null) ? 0 : getInheritedFrom().hashCode());
        hashCode = prime * hashCode + ((getRepositoriesCount() == null) ? 0 : getRepositoriesCount().hashCode());
        return hashCode;
    }

    @Override
    public PackageGroupOriginRestriction clone() {
        try {
            return (PackageGroupOriginRestriction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageGroupOriginRestrictionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
