/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about an attached permissions boundary.
 * </p>
 * <p>
 * An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions
 * boundary.
 * </p>
 * <p>
 * For more information about permissions boundaries, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions Boundaries for
 * IAM Identities </a> in the <i>IAM User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AttachedPermissionsBoundary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachedPermissionsBoundary implements Serializable, Cloneable {

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary
     * for an entity. This data type can only have a value of <code>Policy</code>.
     * </p>
     */
    private String permissionsBoundaryType;
    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user or role.
     * </p>
     */
    private String permissionsBoundaryArn;

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary
     * for an entity. This data type can only have a value of <code>Policy</code>.
     * </p>
     * 
     * @param permissionsBoundaryType
     *        The permissions boundary usage type that indicates what type of IAM resource is used as the permissions
     *        boundary for an entity. This data type can only have a value of <code>Policy</code>.
     * @see PermissionsBoundaryAttachmentType
     */

    public void setPermissionsBoundaryType(String permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary
     * for an entity. This data type can only have a value of <code>Policy</code>.
     * </p>
     * 
     * @return The permissions boundary usage type that indicates what type of IAM resource is used as the permissions
     *         boundary for an entity. This data type can only have a value of <code>Policy</code>.
     * @see PermissionsBoundaryAttachmentType
     */

    public String getPermissionsBoundaryType() {
        return this.permissionsBoundaryType;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary
     * for an entity. This data type can only have a value of <code>Policy</code>.
     * </p>
     * 
     * @param permissionsBoundaryType
     *        The permissions boundary usage type that indicates what type of IAM resource is used as the permissions
     *        boundary for an entity. This data type can only have a value of <code>Policy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsBoundaryAttachmentType
     */

    public AttachedPermissionsBoundary withPermissionsBoundaryType(String permissionsBoundaryType) {
        setPermissionsBoundaryType(permissionsBoundaryType);
        return this;
    }

    /**
     * <p>
     * The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary
     * for an entity. This data type can only have a value of <code>Policy</code>.
     * </p>
     * 
     * @param permissionsBoundaryType
     *        The permissions boundary usage type that indicates what type of IAM resource is used as the permissions
     *        boundary for an entity. This data type can only have a value of <code>Policy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsBoundaryAttachmentType
     */

    public AttachedPermissionsBoundary withPermissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user or role.
     * </p>
     * 
     * @param permissionsBoundaryArn
     *        The ARN of the policy used to set the permissions boundary for the user or role.
     */

    public void setPermissionsBoundaryArn(String permissionsBoundaryArn) {
        this.permissionsBoundaryArn = permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user or role.
     * </p>
     * 
     * @return The ARN of the policy used to set the permissions boundary for the user or role.
     */

    public String getPermissionsBoundaryArn() {
        return this.permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user or role.
     * </p>
     * 
     * @param permissionsBoundaryArn
     *        The ARN of the policy used to set the permissions boundary for the user or role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedPermissionsBoundary withPermissionsBoundaryArn(String permissionsBoundaryArn) {
        setPermissionsBoundaryArn(permissionsBoundaryArn);
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
        if (getPermissionsBoundaryType() != null)
            sb.append("PermissionsBoundaryType: ").append(getPermissionsBoundaryType()).append(",");
        if (getPermissionsBoundaryArn() != null)
            sb.append("PermissionsBoundaryArn: ").append(getPermissionsBoundaryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedPermissionsBoundary == false)
            return false;
        AttachedPermissionsBoundary other = (AttachedPermissionsBoundary) obj;
        if (other.getPermissionsBoundaryType() == null ^ this.getPermissionsBoundaryType() == null)
            return false;
        if (other.getPermissionsBoundaryType() != null && other.getPermissionsBoundaryType().equals(this.getPermissionsBoundaryType()) == false)
            return false;
        if (other.getPermissionsBoundaryArn() == null ^ this.getPermissionsBoundaryArn() == null)
            return false;
        if (other.getPermissionsBoundaryArn() != null && other.getPermissionsBoundaryArn().equals(this.getPermissionsBoundaryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionsBoundaryType() == null) ? 0 : getPermissionsBoundaryType().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundaryArn() == null) ? 0 : getPermissionsBoundaryArn().hashCode());
        return hashCode;
    }

    @Override
    public AttachedPermissionsBoundary clone() {
        try {
            return (AttachedPermissionsBoundary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
