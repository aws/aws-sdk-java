/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Lake Formation data permission asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/LakeFormationDataPermissionAsset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationDataPermissionAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the AWS Lake Formation data permission.
     * </p>
     */
    private LakeFormationDataPermissionDetails lakeFormationDataPermissionDetails;
    /**
     * <p>
     * The data permission type.
     * </p>
     */
    private String lakeFormationDataPermissionType;
    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Details about the AWS Lake Formation data permission.
     * </p>
     * 
     * @param lakeFormationDataPermissionDetails
     *        Details about the AWS Lake Formation data permission.
     */

    public void setLakeFormationDataPermissionDetails(LakeFormationDataPermissionDetails lakeFormationDataPermissionDetails) {
        this.lakeFormationDataPermissionDetails = lakeFormationDataPermissionDetails;
    }

    /**
     * <p>
     * Details about the AWS Lake Formation data permission.
     * </p>
     * 
     * @return Details about the AWS Lake Formation data permission.
     */

    public LakeFormationDataPermissionDetails getLakeFormationDataPermissionDetails() {
        return this.lakeFormationDataPermissionDetails;
    }

    /**
     * <p>
     * Details about the AWS Lake Formation data permission.
     * </p>
     * 
     * @param lakeFormationDataPermissionDetails
     *        Details about the AWS Lake Formation data permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationDataPermissionAsset withLakeFormationDataPermissionDetails(LakeFormationDataPermissionDetails lakeFormationDataPermissionDetails) {
        setLakeFormationDataPermissionDetails(lakeFormationDataPermissionDetails);
        return this;
    }

    /**
     * <p>
     * The data permission type.
     * </p>
     * 
     * @param lakeFormationDataPermissionType
     *        The data permission type.
     * @see LakeFormationDataPermissionType
     */

    public void setLakeFormationDataPermissionType(String lakeFormationDataPermissionType) {
        this.lakeFormationDataPermissionType = lakeFormationDataPermissionType;
    }

    /**
     * <p>
     * The data permission type.
     * </p>
     * 
     * @return The data permission type.
     * @see LakeFormationDataPermissionType
     */

    public String getLakeFormationDataPermissionType() {
        return this.lakeFormationDataPermissionType;
    }

    /**
     * <p>
     * The data permission type.
     * </p>
     * 
     * @param lakeFormationDataPermissionType
     *        The data permission type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LakeFormationDataPermissionType
     */

    public LakeFormationDataPermissionAsset withLakeFormationDataPermissionType(String lakeFormationDataPermissionType) {
        setLakeFormationDataPermissionType(lakeFormationDataPermissionType);
        return this;
    }

    /**
     * <p>
     * The data permission type.
     * </p>
     * 
     * @param lakeFormationDataPermissionType
     *        The data permission type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LakeFormationDataPermissionType
     */

    public LakeFormationDataPermissionAsset withLakeFormationDataPermissionType(LakeFormationDataPermissionType lakeFormationDataPermissionType) {
        this.lakeFormationDataPermissionType = lakeFormationDataPermissionType.toString();
        return this;
    }

    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     * 
     * @return The permissions granted to the subscribers on the resource.
     * @see LFPermission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the subscribers on the resource.
     * @see LFPermission
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the subscribers on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LFPermission
     */

    public LakeFormationDataPermissionAsset withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the subscribers on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LFPermission
     */

    public LakeFormationDataPermissionAsset withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The permissions granted to the subscribers on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the subscribers on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LFPermission
     */

    public LakeFormationDataPermissionAsset withPermissions(LFPermission... permissions) {
        java.util.ArrayList<String> permissionsCopy = new java.util.ArrayList<String>(permissions.length);
        for (LFPermission value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @param roleArn
     *        The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *        AWS Lake Formation data permissions.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @return The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *         AWS Lake Formation data permissions.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @param roleArn
     *        The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *        AWS Lake Formation data permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationDataPermissionAsset withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getLakeFormationDataPermissionDetails() != null)
            sb.append("LakeFormationDataPermissionDetails: ").append(getLakeFormationDataPermissionDetails()).append(",");
        if (getLakeFormationDataPermissionType() != null)
            sb.append("LakeFormationDataPermissionType: ").append(getLakeFormationDataPermissionType()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationDataPermissionAsset == false)
            return false;
        LakeFormationDataPermissionAsset other = (LakeFormationDataPermissionAsset) obj;
        if (other.getLakeFormationDataPermissionDetails() == null ^ this.getLakeFormationDataPermissionDetails() == null)
            return false;
        if (other.getLakeFormationDataPermissionDetails() != null
                && other.getLakeFormationDataPermissionDetails().equals(this.getLakeFormationDataPermissionDetails()) == false)
            return false;
        if (other.getLakeFormationDataPermissionType() == null ^ this.getLakeFormationDataPermissionType() == null)
            return false;
        if (other.getLakeFormationDataPermissionType() != null
                && other.getLakeFormationDataPermissionType().equals(this.getLakeFormationDataPermissionType()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLakeFormationDataPermissionDetails() == null) ? 0 : getLakeFormationDataPermissionDetails().hashCode());
        hashCode = prime * hashCode + ((getLakeFormationDataPermissionType() == null) ? 0 : getLakeFormationDataPermissionType().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationDataPermissionAsset clone() {
        try {
            return (LakeFormationDataPermissionAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.LakeFormationDataPermissionAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
