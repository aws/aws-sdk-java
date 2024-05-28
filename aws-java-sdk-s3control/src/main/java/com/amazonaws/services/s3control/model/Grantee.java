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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you have
 * added your corporate directory to Amazon Web Services IAM Identity Center and associated your Identity Center
 * instance with your S3 Access Grants instance, the grantee can also be a corporate directory user or group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Grantee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grantee implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     */
    private String granteeType;
    /**
     * <p>
     * The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     */
    private String granteeIdentifier;

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @see GranteeType
     */

    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IAM</code> - An IAM user or role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *         your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *         with your S3 Access Grants instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *         your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *         with your S3 Access Grants instance.
     *         </p>
     *         </li>
     * @see GranteeType
     */

    public String getGranteeType() {
        return this.granteeType;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GranteeType
     */

    public Grantee withGranteeType(String granteeType) {
        setGranteeType(granteeType);
        return this;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GranteeType
     */

    public Grantee withGranteeType(GranteeType granteeType) {
        this.granteeType = granteeType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @param granteeIdentifier
     *        The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier
     *        is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or
     *        group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *        <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *        IAM Identity Center instance.
     */

    public void setGranteeIdentifier(String granteeIdentifier) {
        this.granteeIdentifier = granteeIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @return The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the
     *         identifier is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory
     *         user or group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *         <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *         IAM Identity Center instance.
     */

    public String getGranteeIdentifier() {
        return this.granteeIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @param granteeIdentifier
     *        The unique identifier of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier
     *        is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or
     *        group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *        <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *        IAM Identity Center instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grantee withGranteeIdentifier(String granteeIdentifier) {
        setGranteeIdentifier(granteeIdentifier);
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
        if (getGranteeType() != null)
            sb.append("GranteeType: ").append(getGranteeType()).append(",");
        if (getGranteeIdentifier() != null)
            sb.append("GranteeIdentifier: ").append(getGranteeIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grantee == false)
            return false;
        Grantee other = (Grantee) obj;
        if (other.getGranteeType() == null ^ this.getGranteeType() == null)
            return false;
        if (other.getGranteeType() != null && other.getGranteeType().equals(this.getGranteeType()) == false)
            return false;
        if (other.getGranteeIdentifier() == null ^ this.getGranteeIdentifier() == null)
            return false;
        if (other.getGranteeIdentifier() != null && other.getGranteeIdentifier().equals(this.getGranteeIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGranteeType() == null) ? 0 : getGranteeType().hashCode());
        hashCode = prime * hashCode + ((getGranteeIdentifier() == null) ? 0 : getGranteeIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public Grantee clone() {
        try {
            return (Grantee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
