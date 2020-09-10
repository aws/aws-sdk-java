/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The assignment that indicates a principal's limited access to a specified AWS account with a specified permission
 * set.
 * </p>
 * <note>
 * <p>
 * The term <i>principal</i> here refers to a user or group that is defined in AWS SSO.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AccountAssignment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAssignment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the AWS account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the permission set. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * The identifier of the principal.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The identifier of the AWS account.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account.
     * </p>
     * 
     * @return The identifier of the AWS account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignment withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the permission set. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the permission set. For more information about ARNs, see <a
     *         href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *         Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignment withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @return The entity type for which the assignment will be created.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AccountAssignment withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AccountAssignment withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the principal.
     * </p>
     * 
     * @param principalId
     *        The identifier of the principal.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The identifier of the principal.
     * </p>
     * 
     * @return The identifier of the principal.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The identifier of the principal.
     * </p>
     * 
     * @param principalId
     *        The identifier of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignment withPrincipalId(String principalId) {
        setPrincipalId(principalId);
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
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAssignment == false)
            return false;
        AccountAssignment other = (AccountAssignment) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public AccountAssignment clone() {
        try {
            return (AccountAssignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AccountAssignmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
