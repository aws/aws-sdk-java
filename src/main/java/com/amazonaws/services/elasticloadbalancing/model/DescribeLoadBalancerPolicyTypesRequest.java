/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest) DescribeLoadBalancerPolicyTypes operation}.
 * <p>
 * Returns meta-information on the specified LoadBalancer policies
 * defined by the Elastic Load Balancing service. The policy types that
 * are returned from this action can be used in a
 * CreateLoadBalancerPolicy action to instantiate specific policy
 * configurations that will be applied to an Elastic LoadBalancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest)
 */
public class DescribeLoadBalancerPolicyTypesRequest extends AmazonWebServiceRequest {

    /**
     * Specifies the name of the policy types. If no names are specified,
     * returns the description of all the policy types defined by Elastic
     * Load Balancing service.
     */
    private java.util.List<String> policyTypeNames;

    /**
     * Specifies the name of the policy types. If no names are specified,
     * returns the description of all the policy types defined by Elastic
     * Load Balancing service.
     *
     * @return Specifies the name of the policy types. If no names are specified,
     *         returns the description of all the policy types defined by Elastic
     *         Load Balancing service.
     */
    public java.util.List<String> getPolicyTypeNames() {
        
        if (policyTypeNames == null) {
            policyTypeNames = new java.util.ArrayList<String>();
        }
        return policyTypeNames;
    }
    
    /**
     * Specifies the name of the policy types. If no names are specified,
     * returns the description of all the policy types defined by Elastic
     * Load Balancing service.
     *
     * @param policyTypeNames Specifies the name of the policy types. If no names are specified,
     *         returns the description of all the policy types defined by Elastic
     *         Load Balancing service.
     */
    public void setPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        java.util.List<String> policyTypeNamesCopy = new java.util.ArrayList<String>();
        if (policyTypeNames != null) {
            policyTypeNamesCopy.addAll(policyTypeNames);
        }
        this.policyTypeNames = policyTypeNamesCopy;
    }
    
    /**
     * Specifies the name of the policy types. If no names are specified,
     * returns the description of all the policy types defined by Elastic
     * Load Balancing service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames Specifies the name of the policy types. If no names are specified,
     *         returns the description of all the policy types defined by Elastic
     *         Load Balancing service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(String... policyTypeNames) {
        if (getPolicyTypeNames() == null) setPolicyTypeNames(new java.util.ArrayList<String>());
        for (String value : policyTypeNames) {
            getPolicyTypeNames().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the name of the policy types. If no names are specified,
     * returns the description of all the policy types defined by Elastic
     * Load Balancing service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames Specifies the name of the policy types. If no names are specified,
     *         returns the description of all the policy types defined by Elastic
     *         Load Balancing service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        java.util.List<String> policyTypeNamesCopy = new java.util.ArrayList<String>();
        if (policyTypeNames != null) {
            policyTypeNamesCopy.addAll(policyTypeNames);
        }
        this.policyTypeNames = policyTypeNamesCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("PolicyTypeNames: " + policyTypeNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    