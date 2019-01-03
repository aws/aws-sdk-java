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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DescribeLoadBalancerPolicyTypes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicyTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancerPolicyTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load
     * Balancing.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyTypeNames;

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load
     * Balancing.
     * </p>
     * 
     * @return The names of the policy types. If no names are specified, describes all policy types defined by Elastic
     *         Load Balancing.
     */

    public java.util.List<String> getPolicyTypeNames() {
        if (policyTypeNames == null) {
            policyTypeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyTypeNames;
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load
     * Balancing.
     * </p>
     * 
     * @param policyTypeNames
     *        The names of the policy types. If no names are specified, describes all policy types defined by Elastic
     *        Load Balancing.
     */

    public void setPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        if (policyTypeNames == null) {
            this.policyTypeNames = null;
            return;
        }

        this.policyTypeNames = new com.amazonaws.internal.SdkInternalList<String>(policyTypeNames);
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load
     * Balancing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyTypeNames(java.util.Collection)} or {@link #withPolicyTypeNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyTypeNames
     *        The names of the policy types. If no names are specified, describes all policy types defined by Elastic
     *        Load Balancing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(String... policyTypeNames) {
        if (this.policyTypeNames == null) {
            setPolicyTypeNames(new com.amazonaws.internal.SdkInternalList<String>(policyTypeNames.length));
        }
        for (String ele : policyTypeNames) {
            this.policyTypeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load
     * Balancing.
     * </p>
     * 
     * @param policyTypeNames
     *        The names of the policy types. If no names are specified, describes all policy types defined by Elastic
     *        Load Balancing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        setPolicyTypeNames(policyTypeNames);
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
        if (getPolicyTypeNames() != null)
            sb.append("PolicyTypeNames: ").append(getPolicyTypeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerPolicyTypesRequest == false)
            return false;
        DescribeLoadBalancerPolicyTypesRequest other = (DescribeLoadBalancerPolicyTypesRequest) obj;
        if (other.getPolicyTypeNames() == null ^ this.getPolicyTypeNames() == null)
            return false;
        if (other.getPolicyTypeNames() != null && other.getPolicyTypeNames().equals(this.getPolicyTypeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyTypeNames() == null) ? 0 : getPolicyTypeNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBalancerPolicyTypesRequest clone() {
        return (DescribeLoadBalancerPolicyTypesRequest) super.clone();
    }

}
