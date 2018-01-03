/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about an IAM role. This structure is returned as a response element in several APIs that
 * interact with roles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/Role" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Role implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String roleId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     */
    private String assumeRolePolicyDocument;
    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @param roleName
     *        The friendly name that identifies the role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @return The friendly name that identifies the role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * 
     * @param roleName
     *        The friendly name that identifies the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the role. For more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param roleId
     *        The stable and unique string identifying the role. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withRoleId(String roleId) {
        setRoleId(roleId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     *        policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *        Identifiers</a> in the <i>IAM User Guide</i> guide.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them
     *         in policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>IAM User Guide</i> guide.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in
     *        policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *        Identifiers</a> in the <i>IAM User Guide</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        role was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         role was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the role was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        role was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The policy that grants an entity permission to assume the role.
     */

    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @return The policy that grants an entity permission to assume the role.
     */

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The policy that grants an entity permission to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * 
     * @param description
     *        A description of the role that you provide.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * 
     * @return A description of the role that you provide.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * 
     * @param description
     *        A description of the role that you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Role withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getRoleId() != null)
            sb.append("RoleId: ").append(getRoleId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Role == false)
            return false;
        Role other = (Role) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Role clone() {
        try {
            return (Role) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
