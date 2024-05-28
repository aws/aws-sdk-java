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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes an assignment of an Amazon Web Services account to a principal and the permissions that
 * principal has in the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AccountAssignmentForPrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAssignmentForPrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID number of the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     * account.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The ID of the principal.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The type of the principal.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The account ID number of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The account ID number of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID number of the Amazon Web Services account.
     * </p>
     * 
     * @return The account ID number of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID number of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The account ID number of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignmentForPrincipal withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     * account.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     *        account.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     * account.
     * </p>
     * 
     * @return The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     *         account.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     * account.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the IAM Identity Center permission set assigned to this principal for this Amazon Web Services
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignmentForPrincipal withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @return The ID of the principal.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignmentForPrincipal withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The type of the principal.
     * </p>
     * 
     * @param principalType
     *        The type of the principal.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of the principal.
     * </p>
     * 
     * @return The type of the principal.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The type of the principal.
     * </p>
     * 
     * @param principalType
     *        The type of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AccountAssignmentForPrincipal withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The type of the principal.
     * </p>
     * 
     * @param principalType
     *        The type of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AccountAssignmentForPrincipal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAssignmentForPrincipal == false)
            return false;
        AccountAssignmentForPrincipal other = (AccountAssignmentForPrincipal) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public AccountAssignmentForPrincipal clone() {
        try {
            return (AccountAssignmentForPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AccountAssignmentForPrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
