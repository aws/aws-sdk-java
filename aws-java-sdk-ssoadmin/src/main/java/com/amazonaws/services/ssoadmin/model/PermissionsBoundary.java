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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of the AWS managed or customer managed policy that you want to set as a permissions
 * boundary. Specify either <code>CustomerManagedPolicyReference</code> to use the name and path of a customer managed
 * policy, or <code>ManagedPolicyArn</code> to use the ARN of an AWS managed policy. A permissions boundary represents
 * the maximum permissions that any policy can grant your role. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html">Permissions boundaries for
 * IAM entities</a> in the <i>IAM User Guide</i>.
 * </p>
 * <important>
 * <p>
 * Policies used as permissions boundaries don't provide permissions. You must also attach an IAM policy to the role. To
 * learn how the effective permissions for a role are evaluated, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html">IAM JSON policy
 * evaluation logic</a> in the <i>IAM User Guide</i>.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PermissionsBoundary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionsBoundary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and
     * path in each AWS account where you want to deploy your permission set.
     * </p>
     */
    private CustomerManagedPolicyReference customerManagedPolicyReference;
    /**
     * <p>
     * The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     * </p>
     */
    private String managedPolicyArn;

    /**
     * <p>
     * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and
     * path in each AWS account where you want to deploy your permission set.
     * </p>
     * 
     * @param customerManagedPolicyReference
     *        Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the
     *        name and path in each AWS account where you want to deploy your permission set.
     */

    public void setCustomerManagedPolicyReference(CustomerManagedPolicyReference customerManagedPolicyReference) {
        this.customerManagedPolicyReference = customerManagedPolicyReference;
    }

    /**
     * <p>
     * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and
     * path in each AWS account where you want to deploy your permission set.
     * </p>
     * 
     * @return Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the
     *         name and path in each AWS account where you want to deploy your permission set.
     */

    public CustomerManagedPolicyReference getCustomerManagedPolicyReference() {
        return this.customerManagedPolicyReference;
    }

    /**
     * <p>
     * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and
     * path in each AWS account where you want to deploy your permission set.
     * </p>
     * 
     * @param customerManagedPolicyReference
     *        Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the
     *        name and path in each AWS account where you want to deploy your permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionsBoundary withCustomerManagedPolicyReference(CustomerManagedPolicyReference customerManagedPolicyReference) {
        setCustomerManagedPolicyReference(customerManagedPolicyReference);
        return this;
    }

    /**
     * <p>
     * The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     * </p>
     * 
     * @param managedPolicyArn
     *        The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     */

    public void setManagedPolicyArn(String managedPolicyArn) {
        this.managedPolicyArn = managedPolicyArn;
    }

    /**
     * <p>
     * The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     * </p>
     * 
     * @return The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     */

    public String getManagedPolicyArn() {
        return this.managedPolicyArn;
    }

    /**
     * <p>
     * The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     * </p>
     * 
     * @param managedPolicyArn
     *        The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionsBoundary withManagedPolicyArn(String managedPolicyArn) {
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
        if (getCustomerManagedPolicyReference() != null)
            sb.append("CustomerManagedPolicyReference: ").append(getCustomerManagedPolicyReference()).append(",");
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

        if (obj instanceof PermissionsBoundary == false)
            return false;
        PermissionsBoundary other = (PermissionsBoundary) obj;
        if (other.getCustomerManagedPolicyReference() == null ^ this.getCustomerManagedPolicyReference() == null)
            return false;
        if (other.getCustomerManagedPolicyReference() != null
                && other.getCustomerManagedPolicyReference().equals(this.getCustomerManagedPolicyReference()) == false)
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

        hashCode = prime * hashCode + ((getCustomerManagedPolicyReference() == null) ? 0 : getCustomerManagedPolicyReference().hashCode());
        hashCode = prime * hashCode + ((getManagedPolicyArn() == null) ? 0 : getManagedPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public PermissionsBoundary clone() {
        try {
            return (PermissionsBoundary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.PermissionsBoundaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
