/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteAccountAssignment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccountAssignmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The ARN of the permission set that will be used to remove access.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API Reference</a>.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *         see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS
     *         Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAssignmentRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @param targetId
     *        TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @return TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @param targetId
     *        TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAssignmentRequest withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be deleted.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @return The entity type for which the assignment will be deleted.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public DeleteAccountAssignmentRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public DeleteAccountAssignmentRequest withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the permission set that will be used to remove access.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set that will be used to remove access.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set that will be used to remove access.
     * </p>
     * 
     * @return The ARN of the permission set that will be used to remove access.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set that will be used to remove access.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set that will be used to remove access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAssignmentRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be deleted.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @return The entity type for which the assignment will be deleted.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public DeleteAccountAssignmentRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be deleted.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public DeleteAccountAssignmentRequest withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API Reference</a>.
     * </p>
     * 
     * @param principalId
     *        An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     *        f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     *        href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API
     *        Reference</a>.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API Reference</a>.
     * </p>
     * 
     * @return An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     *         f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     *         href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API
     *         Reference</a>.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API Reference</a>.
     * </p>
     * 
     * @param principalId
     *        An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example,
     *        f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the <a
     *        href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">AWS SSO Identity Store API
     *        Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAssignmentRequest withPrincipalId(String principalId) {
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
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

        if (obj instanceof DeleteAccountAssignmentRequest == false)
            return false;
        DeleteAccountAssignmentRequest other = (DeleteAccountAssignmentRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
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

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccountAssignmentRequest clone() {
        return (DeleteAccountAssignmentRequest) super.clone();
    }

}
