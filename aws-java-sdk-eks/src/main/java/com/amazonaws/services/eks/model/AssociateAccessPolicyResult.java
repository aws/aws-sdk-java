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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateAccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAccessPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     * </p>
     */
    private AssociatedAccessPolicy associatedAccessPolicy;

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

    public AssociateAccessPolicyResult withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @return The ARN of the IAM principal for the <code>AccessEntry</code>.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyResult withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     * </p>
     * 
     * @param associatedAccessPolicy
     *        The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     */

    public void setAssociatedAccessPolicy(AssociatedAccessPolicy associatedAccessPolicy) {
        this.associatedAccessPolicy = associatedAccessPolicy;
    }

    /**
     * <p>
     * The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     * </p>
     * 
     * @return The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     */

    public AssociatedAccessPolicy getAssociatedAccessPolicy() {
        return this.associatedAccessPolicy;
    }

    /**
     * <p>
     * The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     * </p>
     * 
     * @param associatedAccessPolicy
     *        The <code>AccessPolicy</code> and scope associated to the <code>AccessEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessPolicyResult withAssociatedAccessPolicy(AssociatedAccessPolicy associatedAccessPolicy) {
        setAssociatedAccessPolicy(associatedAccessPolicy);
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
        if (getAssociatedAccessPolicy() != null)
            sb.append("AssociatedAccessPolicy: ").append(getAssociatedAccessPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAccessPolicyResult == false)
            return false;
        AssociateAccessPolicyResult other = (AssociateAccessPolicyResult) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getAssociatedAccessPolicy() == null ^ this.getAssociatedAccessPolicy() == null)
            return false;
        if (other.getAssociatedAccessPolicy() != null && other.getAssociatedAccessPolicy().equals(this.getAssociatedAccessPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getAssociatedAccessPolicy() == null) ? 0 : getAssociatedAccessPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAccessPolicyResult clone() {
        try {
            return (AssociateAccessPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
