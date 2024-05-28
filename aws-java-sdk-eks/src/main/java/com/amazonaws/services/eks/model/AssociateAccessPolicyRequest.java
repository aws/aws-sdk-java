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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateAccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAccessPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're associating
     * the access policy to.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to specific
     * Kubernetes namespaces.
     * </p>
     */
    private AccessScope accessScope;

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @return The name of your cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're associating
     * the access policy to.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're
     *        associating the access policy to.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're associating
     * the access policy to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're
     *         associating the access policy to.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're associating
     * the access policy to.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the IAM user or role for the <code>AccessEntry</code> that you're
     *        associating the access policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @param policyArn
     *        The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     *        <code>ListAccessPolicies</code>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @return The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     *         <code>ListAccessPolicies</code>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @param policyArn
     *        The ARN of the <code>AccessPolicy</code> that you're associating. For a list of ARNs, use
     *        <code>ListAccessPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to specific
     * Kubernetes namespaces.
     * </p>
     * 
     * @param accessScope
     *        The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to
     *        specific Kubernetes namespaces.
     */

    public void setAccessScope(AccessScope accessScope) {
        this.accessScope = accessScope;
    }

    /**
     * <p>
     * The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to specific
     * Kubernetes namespaces.
     * </p>
     * 
     * @return The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to
     *         specific Kubernetes namespaces.
     */

    public AccessScope getAccessScope() {
        return this.accessScope;
    }

    /**
     * <p>
     * The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to specific
     * Kubernetes namespaces.
     * </p>
     * 
     * @param accessScope
     *        The scope for the <code>AccessPolicy</code>. You can scope access policies to an entire cluster or to
     *        specific Kubernetes namespaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyRequest withAccessScope(AccessScope accessScope) {
        setAccessScope(accessScope);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getAccessScope() != null)
            sb.append("AccessScope: ").append(getAccessScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAccessPolicyRequest == false)
            return false;
        AssociateAccessPolicyRequest other = (AssociateAccessPolicyRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getAccessScope() == null ^ this.getAccessScope() == null)
            return false;
        if (other.getAccessScope() != null && other.getAccessScope().equals(this.getAccessScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getAccessScope() == null) ? 0 : getAccessScope().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAccessPolicyRequest clone() {
        return (AssociateAccessPolicyRequest) super.clone();
    }

}
