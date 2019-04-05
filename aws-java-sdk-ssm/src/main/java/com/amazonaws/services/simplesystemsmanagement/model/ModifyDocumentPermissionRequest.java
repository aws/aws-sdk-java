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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDocumentPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     */
    private String permissionType;
    /**
     * <p>
     * The AWS user accounts that should have access to the document. The account IDs can either be a group of account
     * IDs or <i>All</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIdsToAdd;
    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a
     * group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If you specify
     * an account ID to add and the same ID to remove, the system removes access to the document.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIdsToRemove;

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * 
     * @return The name of the document that you want to share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDocumentPermissionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @return The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentPermissionType
     */

    public ModifyDocumentPermissionRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public void setPermissionType(DocumentPermissionType permissionType) {
        withPermissionType(permissionType);
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentPermissionType
     */

    public ModifyDocumentPermissionRequest withPermissionType(DocumentPermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The account IDs can either be a group of account
     * IDs or <i>All</i>.
     * </p>
     * 
     * @return The AWS user accounts that should have access to the document. The account IDs can either be a group of
     *         account IDs or <i>All</i>.
     */

    public java.util.List<String> getAccountIdsToAdd() {
        if (accountIdsToAdd == null) {
            accountIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIdsToAdd;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The account IDs can either be a group of account
     * IDs or <i>All</i>.
     * </p>
     * 
     * @param accountIdsToAdd
     *        The AWS user accounts that should have access to the document. The account IDs can either be a group of
     *        account IDs or <i>All</i>.
     */

    public void setAccountIdsToAdd(java.util.Collection<String> accountIdsToAdd) {
        if (accountIdsToAdd == null) {
            this.accountIdsToAdd = null;
            return;
        }

        this.accountIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>(accountIdsToAdd);
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The account IDs can either be a group of account
     * IDs or <i>All</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdsToAdd(java.util.Collection)} or {@link #withAccountIdsToAdd(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accountIdsToAdd
     *        The AWS user accounts that should have access to the document. The account IDs can either be a group of
     *        account IDs or <i>All</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDocumentPermissionRequest withAccountIdsToAdd(String... accountIdsToAdd) {
        if (this.accountIdsToAdd == null) {
            setAccountIdsToAdd(new com.amazonaws.internal.SdkInternalList<String>(accountIdsToAdd.length));
        }
        for (String ele : accountIdsToAdd) {
            this.accountIdsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The account IDs can either be a group of account
     * IDs or <i>All</i>.
     * </p>
     * 
     * @param accountIdsToAdd
     *        The AWS user accounts that should have access to the document. The account IDs can either be a group of
     *        account IDs or <i>All</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDocumentPermissionRequest withAccountIdsToAdd(java.util.Collection<String> accountIdsToAdd) {
        setAccountIdsToAdd(accountIdsToAdd);
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a
     * group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If you specify
     * an account ID to add and the same ID to remove, the system removes access to the document.
     * </p>
     * 
     * @return The AWS user accounts that should no longer have access to the document. The AWS user account can either
     *         be a group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>.
     *         If you specify an account ID to add and the same ID to remove, the system removes access to the document.
     */

    public java.util.List<String> getAccountIdsToRemove() {
        if (accountIdsToRemove == null) {
            accountIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIdsToRemove;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a
     * group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If you specify
     * an account ID to add and the same ID to remove, the system removes access to the document.
     * </p>
     * 
     * @param accountIdsToRemove
     *        The AWS user accounts that should no longer have access to the document. The AWS user account can either
     *        be a group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If
     *        you specify an account ID to add and the same ID to remove, the system removes access to the document.
     */

    public void setAccountIdsToRemove(java.util.Collection<String> accountIdsToRemove) {
        if (accountIdsToRemove == null) {
            this.accountIdsToRemove = null;
            return;
        }

        this.accountIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>(accountIdsToRemove);
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a
     * group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If you specify
     * an account ID to add and the same ID to remove, the system removes access to the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdsToRemove(java.util.Collection)} or {@link #withAccountIdsToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountIdsToRemove
     *        The AWS user accounts that should no longer have access to the document. The AWS user account can either
     *        be a group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If
     *        you specify an account ID to add and the same ID to remove, the system removes access to the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDocumentPermissionRequest withAccountIdsToRemove(String... accountIdsToRemove) {
        if (this.accountIdsToRemove == null) {
            setAccountIdsToRemove(new com.amazonaws.internal.SdkInternalList<String>(accountIdsToRemove.length));
        }
        for (String ele : accountIdsToRemove) {
            this.accountIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a
     * group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If you specify
     * an account ID to add and the same ID to remove, the system removes access to the document.
     * </p>
     * 
     * @param accountIdsToRemove
     *        The AWS user accounts that should no longer have access to the document. The AWS user account can either
     *        be a group of account IDs or <i>All</i>. This action has a higher priority than <i>AccountIdsToAdd</i>. If
     *        you specify an account ID to add and the same ID to remove, the system removes access to the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDocumentPermissionRequest withAccountIdsToRemove(java.util.Collection<String> accountIdsToRemove) {
        setAccountIdsToRemove(accountIdsToRemove);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getAccountIdsToAdd() != null)
            sb.append("AccountIdsToAdd: ").append(getAccountIdsToAdd()).append(",");
        if (getAccountIdsToRemove() != null)
            sb.append("AccountIdsToRemove: ").append(getAccountIdsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDocumentPermissionRequest == false)
            return false;
        ModifyDocumentPermissionRequest other = (ModifyDocumentPermissionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getAccountIdsToAdd() == null ^ this.getAccountIdsToAdd() == null)
            return false;
        if (other.getAccountIdsToAdd() != null && other.getAccountIdsToAdd().equals(this.getAccountIdsToAdd()) == false)
            return false;
        if (other.getAccountIdsToRemove() == null ^ this.getAccountIdsToRemove() == null)
            return false;
        if (other.getAccountIdsToRemove() != null && other.getAccountIdsToRemove().equals(this.getAccountIdsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getAccountIdsToAdd() == null) ? 0 : getAccountIdsToAdd().hashCode());
        hashCode = prime * hashCode + ((getAccountIdsToRemove() == null) ? 0 : getAccountIdsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDocumentPermissionRequest clone() {
        return (ModifyDocumentPermissionRequest) super.clone();
    }

}
