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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
 * resources, and running an assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PermissionModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     * querying purposes while importing resources and assessing your application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * These ARNs are required only when your resources are in other accounts and you have different role name in these
     * accounts. Else, the invoker role name will be used in the other accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in the
     * primary account.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.List<String> crossAccountRoleArns;
    /**
     * <p>
     * Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed by
     * Resilience Hub Service Principle to obtain a read-only access to your application resources while running an
     * assessment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have <code>iam:passRole</code> permission for this role while creating or updating the application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String invokerRoleName;
    /**
     * <p>
     * Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing role in
     * your Amazon Web Services account, or by using the credentials of the current IAM user.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     * querying purposes while importing resources and assessing your application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * These ARNs are required only when your resources are in other accounts and you have different role name in these
     * accounts. Else, the invoker role name will be used in the other accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in the
     * primary account.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     *         querying purposes while importing resources and assessing your application.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         These ARNs are required only when your resources are in other accounts and you have different role name
     *         in these accounts. Else, the invoker role name will be used in the other accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in
     *         the primary account.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.List<String> getCrossAccountRoleArns() {
        return crossAccountRoleArns;
    }

    /**
     * <p>
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     * querying purposes while importing resources and assessing your application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * These ARNs are required only when your resources are in other accounts and you have different role name in these
     * accounts. Else, the invoker role name will be used in the other accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in the
     * primary account.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param crossAccountRoleArns
     *        Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     *        querying purposes while importing resources and assessing your application.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        These ARNs are required only when your resources are in other accounts and you have different role name in
     *        these accounts. Else, the invoker role name will be used in the other accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in
     *        the primary account.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setCrossAccountRoleArns(java.util.Collection<String> crossAccountRoleArns) {
        if (crossAccountRoleArns == null) {
            this.crossAccountRoleArns = null;
            return;
        }

        this.crossAccountRoleArns = new java.util.ArrayList<String>(crossAccountRoleArns);
    }

    /**
     * <p>
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     * querying purposes while importing resources and assessing your application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * These ARNs are required only when your resources are in other accounts and you have different role name in these
     * accounts. Else, the invoker role name will be used in the other accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in the
     * primary account.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossAccountRoleArns(java.util.Collection)} or {@link #withCrossAccountRoleArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param crossAccountRoleArns
     *        Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     *        querying purposes while importing resources and assessing your application.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        These ARNs are required only when your resources are in other accounts and you have different role name in
     *        these accounts. Else, the invoker role name will be used in the other accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in
     *        the primary account.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionModel withCrossAccountRoleArns(String... crossAccountRoleArns) {
        if (this.crossAccountRoleArns == null) {
            setCrossAccountRoleArns(new java.util.ArrayList<String>(crossAccountRoleArns.length));
        }
        for (String ele : crossAccountRoleArns) {
            this.crossAccountRoleArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     * querying purposes while importing resources and assessing your application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * These ARNs are required only when your resources are in other accounts and you have different role name in these
     * accounts. Else, the invoker role name will be used in the other accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in the
     * primary account.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param crossAccountRoleArns
     *        Defines a list of role Amazon Resource Names (ARNs) to be used in other accounts. These ARNs are used for
     *        querying purposes while importing resources and assessing your application.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        These ARNs are required only when your resources are in other accounts and you have different role name in
     *        these accounts. Else, the invoker role name will be used in the other accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        These roles must have a trust policy with <code>iam:AssumeRole</code> permission to the invoker role in
     *        the primary account.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionModel withCrossAccountRoleArns(java.util.Collection<String> crossAccountRoleArns) {
        setCrossAccountRoleArns(crossAccountRoleArns);
        return this;
    }

    /**
     * <p>
     * Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed by
     * Resilience Hub Service Principle to obtain a read-only access to your application resources while running an
     * assessment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have <code>iam:passRole</code> permission for this role while creating or updating the application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param invokerRoleName
     *        Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed
     *        by Resilience Hub Service Principle to obtain a read-only access to your application resources while
     *        running an assessment.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        You must have <code>iam:passRole</code> permission for this role while creating or updating the
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setInvokerRoleName(String invokerRoleName) {
        this.invokerRoleName = invokerRoleName;
    }

    /**
     * <p>
     * Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed by
     * Resilience Hub Service Principle to obtain a read-only access to your application resources while running an
     * assessment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have <code>iam:passRole</code> permission for this role while creating or updating the application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be
     *         assumed by Resilience Hub Service Principle to obtain a read-only access to your application resources
     *         while running an assessment.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         You must have <code>iam:passRole</code> permission for this role while creating or updating the
     *         application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getInvokerRoleName() {
        return this.invokerRoleName;
    }

    /**
     * <p>
     * Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed by
     * Resilience Hub Service Principle to obtain a read-only access to your application resources while running an
     * assessment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have <code>iam:passRole</code> permission for this role while creating or updating the application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param invokerRoleName
     *        Existing Amazon Web Services IAM role name in the primary Amazon Web Services account that will be assumed
     *        by Resilience Hub Service Principle to obtain a read-only access to your application resources while
     *        running an assessment.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        You must have <code>iam:passRole</code> permission for this role while creating or updating the
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Currently, <code>invokerRoleName</code> accepts only <code>[A-Za-z0-9_+=,.@-]</code> characters.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionModel withInvokerRoleName(String invokerRoleName) {
        setInvokerRoleName(invokerRoleName);
        return this;
    }

    /**
     * <p>
     * Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing role in
     * your Amazon Web Services account, or by using the credentials of the current IAM user.
     * </p>
     * 
     * @param type
     *        Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing
     *        role in your Amazon Web Services account, or by using the credentials of the current IAM user.
     * @see PermissionModelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing role in
     * your Amazon Web Services account, or by using the credentials of the current IAM user.
     * </p>
     * 
     * @return Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing
     *         role in your Amazon Web Services account, or by using the credentials of the current IAM user.
     * @see PermissionModelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing role in
     * your Amazon Web Services account, or by using the credentials of the current IAM user.
     * </p>
     * 
     * @param type
     *        Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing
     *        role in your Amazon Web Services account, or by using the credentials of the current IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModelType
     */

    public PermissionModel withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing role in
     * your Amazon Web Services account, or by using the credentials of the current IAM user.
     * </p>
     * 
     * @param type
     *        Defines how Resilience Hub scans your resources. It can scan for the resources by using a pre-existing
     *        role in your Amazon Web Services account, or by using the credentials of the current IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModelType
     */

    public PermissionModel withType(PermissionModelType type) {
        this.type = type.toString();
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
        if (getCrossAccountRoleArns() != null)
            sb.append("CrossAccountRoleArns: ").append(getCrossAccountRoleArns()).append(",");
        if (getInvokerRoleName() != null)
            sb.append("InvokerRoleName: ").append(getInvokerRoleName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionModel == false)
            return false;
        PermissionModel other = (PermissionModel) obj;
        if (other.getCrossAccountRoleArns() == null ^ this.getCrossAccountRoleArns() == null)
            return false;
        if (other.getCrossAccountRoleArns() != null && other.getCrossAccountRoleArns().equals(this.getCrossAccountRoleArns()) == false)
            return false;
        if (other.getInvokerRoleName() == null ^ this.getInvokerRoleName() == null)
            return false;
        if (other.getInvokerRoleName() != null && other.getInvokerRoleName().equals(this.getInvokerRoleName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossAccountRoleArns() == null) ? 0 : getCrossAccountRoleArns().hashCode());
        hashCode = prime * hashCode + ((getInvokerRoleName() == null) ? 0 : getInvokerRoleName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PermissionModel clone() {
        try {
            return (PermissionModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.PermissionModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
