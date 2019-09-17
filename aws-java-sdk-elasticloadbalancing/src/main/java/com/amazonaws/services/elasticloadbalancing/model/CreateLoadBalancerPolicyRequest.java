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
 * Contains the parameters for CreateLoadBalancerPolicy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be unique within the set of policies for this
     * load balancer.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     */
    private String policyTypeName;
    /**
     * <p>
     * The policy attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyAttribute> policyAttributes;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be unique within the set of policies for this
     * load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the load balancer policy to be created. This name must be unique within the set of policies
     *        for this load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be unique within the set of policies for this
     * load balancer.
     * </p>
     * 
     * @return The name of the load balancer policy to be created. This name must be unique within the set of policies
     *         for this load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be unique within the set of policies for this
     * load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the load balancer policy to be created. This name must be unique within the set of policies
     *        for this load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the base policy type. To get the list of policy types, use
     *        <a>DescribeLoadBalancerPolicyTypes</a>.
     */

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     * 
     * @return The name of the base policy type. To get the list of policy types, use
     *         <a>DescribeLoadBalancerPolicyTypes</a>.
     */

    public String getPolicyTypeName() {
        return this.policyTypeName;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the base policy type. To get the list of policy types, use
     *        <a>DescribeLoadBalancerPolicyTypes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerPolicyRequest withPolicyTypeName(String policyTypeName) {
        setPolicyTypeName(policyTypeName);
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @return The policy attributes.
     */

    public java.util.List<PolicyAttribute> getPolicyAttributes() {
        if (policyAttributes == null) {
            policyAttributes = new com.amazonaws.internal.SdkInternalList<PolicyAttribute>();
        }
        return policyAttributes;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @param policyAttributes
     *        The policy attributes.
     */

    public void setPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        if (policyAttributes == null) {
            this.policyAttributes = null;
            return;
        }

        this.policyAttributes = new com.amazonaws.internal.SdkInternalList<PolicyAttribute>(policyAttributes);
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyAttributes(java.util.Collection)} or {@link #withPolicyAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyAttributes
     *        The policy attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerPolicyRequest withPolicyAttributes(PolicyAttribute... policyAttributes) {
        if (this.policyAttributes == null) {
            setPolicyAttributes(new com.amazonaws.internal.SdkInternalList<PolicyAttribute>(policyAttributes.length));
        }
        for (PolicyAttribute ele : policyAttributes) {
            this.policyAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * 
     * @param policyAttributes
     *        The policy attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerPolicyRequest withPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        setPolicyAttributes(policyAttributes);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyTypeName() != null)
            sb.append("PolicyTypeName: ").append(getPolicyTypeName()).append(",");
        if (getPolicyAttributes() != null)
            sb.append("PolicyAttributes: ").append(getPolicyAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoadBalancerPolicyRequest == false)
            return false;
        CreateLoadBalancerPolicyRequest other = (CreateLoadBalancerPolicyRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null)
            return false;
        if (other.getPolicyTypeName() != null && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false)
            return false;
        if (other.getPolicyAttributes() == null ^ this.getPolicyAttributes() == null)
            return false;
        if (other.getPolicyAttributes() != null && other.getPolicyAttributes().equals(this.getPolicyAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode());
        hashCode = prime * hashCode + ((getPolicyAttributes() == null) ? 0 : getPolicyAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerPolicyRequest clone() {
        return (CreateLoadBalancerPolicyRequest) super.clone();
    }

}
