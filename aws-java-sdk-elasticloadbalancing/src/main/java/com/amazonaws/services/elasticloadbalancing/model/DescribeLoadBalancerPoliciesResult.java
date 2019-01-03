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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of DescribeLoadBalancerPolicies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancerPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyDescription> policyDescriptions;

    /**
     * <p>
     * Information about the policies.
     * </p>
     * 
     * @return Information about the policies.
     */

    public java.util.List<PolicyDescription> getPolicyDescriptions() {
        if (policyDescriptions == null) {
            policyDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyDescription>();
        }
        return policyDescriptions;
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     * 
     * @param policyDescriptions
     *        Information about the policies.
     */

    public void setPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        if (policyDescriptions == null) {
            this.policyDescriptions = null;
            return;
        }

        this.policyDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyDescription>(policyDescriptions);
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyDescriptions(java.util.Collection)} or {@link #withPolicyDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param policyDescriptions
     *        Information about the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(PolicyDescription... policyDescriptions) {
        if (this.policyDescriptions == null) {
            setPolicyDescriptions(new com.amazonaws.internal.SdkInternalList<PolicyDescription>(policyDescriptions.length));
        }
        for (PolicyDescription ele : policyDescriptions) {
            this.policyDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     * 
     * @param policyDescriptions
     *        Information about the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        setPolicyDescriptions(policyDescriptions);
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
        if (getPolicyDescriptions() != null)
            sb.append("PolicyDescriptions: ").append(getPolicyDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerPoliciesResult == false)
            return false;
        DescribeLoadBalancerPoliciesResult other = (DescribeLoadBalancerPoliciesResult) obj;
        if (other.getPolicyDescriptions() == null ^ this.getPolicyDescriptions() == null)
            return false;
        if (other.getPolicyDescriptions() != null && other.getPolicyDescriptions().equals(this.getPolicyDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyDescriptions() == null) ? 0 : getPolicyDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBalancerPoliciesResult clone() {
        try {
            return (DescribeLoadBalancerPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
