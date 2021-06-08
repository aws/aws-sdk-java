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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachManagedPolicyFromPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachManagedPolicyFromPermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The IAM managed policy ARN to be attached to a permission set.
     * </p>
     */
    private String managedPolicyArn;

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

    public DetachManagedPolicyFromPermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     * </p>
     * 
     * @return The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <a>PermissionSet</a> from which the policy should be detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachManagedPolicyFromPermissionSetRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The IAM managed policy ARN to be attached to a permission set.
     * </p>
     * 
     * @param managedPolicyArn
     *        The IAM managed policy ARN to be attached to a permission set.
     */

    public void setManagedPolicyArn(String managedPolicyArn) {
        this.managedPolicyArn = managedPolicyArn;
    }

    /**
     * <p>
     * The IAM managed policy ARN to be attached to a permission set.
     * </p>
     * 
     * @return The IAM managed policy ARN to be attached to a permission set.
     */

    public String getManagedPolicyArn() {
        return this.managedPolicyArn;
    }

    /**
     * <p>
     * The IAM managed policy ARN to be attached to a permission set.
     * </p>
     * 
     * @param managedPolicyArn
     *        The IAM managed policy ARN to be attached to a permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachManagedPolicyFromPermissionSetRequest withManagedPolicyArn(String managedPolicyArn) {
        setManagedPolicyArn(managedPolicyArn);
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
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getManagedPolicyArn() != null)
            sb.append("ManagedPolicyArn: ").append(getManagedPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachManagedPolicyFromPermissionSetRequest == false)
            return false;
        DetachManagedPolicyFromPermissionSetRequest other = (DetachManagedPolicyFromPermissionSetRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getManagedPolicyArn() == null ^ this.getManagedPolicyArn() == null)
            return false;
        if (other.getManagedPolicyArn() != null && other.getManagedPolicyArn().equals(this.getManagedPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getManagedPolicyArn() == null) ? 0 : getManagedPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public DetachManagedPolicyFromPermissionSetRequest clone() {
        return (DetachManagedPolicyFromPermissionSetRequest) super.clone();
    }

}
