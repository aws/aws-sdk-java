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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateRoleCustomPermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoleCustomPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom permission that you want to update the role with.
     * </p>
     */
    private String customPermissionsName;
    /**
     * <p>
     * The name of role tht you want to update.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace that contains the role that you want to update.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the custom permission that you want to update the role with.
     * </p>
     * 
     * @param customPermissionsName
     *        The name of the custom permission that you want to update the role with.
     */

    public void setCustomPermissionsName(String customPermissionsName) {
        this.customPermissionsName = customPermissionsName;
    }

    /**
     * <p>
     * The name of the custom permission that you want to update the role with.
     * </p>
     * 
     * @return The name of the custom permission that you want to update the role with.
     */

    public String getCustomPermissionsName() {
        return this.customPermissionsName;
    }

    /**
     * <p>
     * The name of the custom permission that you want to update the role with.
     * </p>
     * 
     * @param customPermissionsName
     *        The name of the custom permission that you want to update the role with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleCustomPermissionRequest withCustomPermissionsName(String customPermissionsName) {
        setCustomPermissionsName(customPermissionsName);
        return this;
    }

    /**
     * <p>
     * The name of role tht you want to update.
     * </p>
     * 
     * @param role
     *        The name of role tht you want to update.
     * @see Role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name of role tht you want to update.
     * </p>
     * 
     * @return The name of role tht you want to update.
     * @see Role
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name of role tht you want to update.
     * </p>
     * 
     * @param role
     *        The name of role tht you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public UpdateRoleCustomPermissionRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The name of role tht you want to update.
     * </p>
     * 
     * @param role
     *        The name of role tht you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public UpdateRoleCustomPermissionRequest withRole(Role role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *        account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *        QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *         account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *         QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *        account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *        QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleCustomPermissionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace that contains the role that you want to update.
     * </p>
     * 
     * @param namespace
     *        The namespace that contains the role that you want to update.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that contains the role that you want to update.
     * </p>
     * 
     * @return The namespace that contains the role that you want to update.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace that contains the role that you want to update.
     * </p>
     * 
     * @param namespace
     *        The namespace that contains the role that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleCustomPermissionRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getCustomPermissionsName() != null)
            sb.append("CustomPermissionsName: ").append(getCustomPermissionsName()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoleCustomPermissionRequest == false)
            return false;
        UpdateRoleCustomPermissionRequest other = (UpdateRoleCustomPermissionRequest) obj;
        if (other.getCustomPermissionsName() == null ^ this.getCustomPermissionsName() == null)
            return false;
        if (other.getCustomPermissionsName() != null && other.getCustomPermissionsName().equals(this.getCustomPermissionsName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomPermissionsName() == null) ? 0 : getCustomPermissionsName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoleCustomPermissionRequest clone() {
        return (UpdateRoleCustomPermissionRequest) super.clone();
    }

}
