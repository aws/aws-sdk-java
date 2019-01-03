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
 * Contains the parameters for SetLoadBalancePoliciesOfListener.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesOfListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLoadBalancerPoliciesOfListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     */
    private Integer loadBalancerPort;
    /**
     * <p>
     * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     * currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;

    /**
     * Default constructor for SetLoadBalancerPoliciesOfListenerRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public SetLoadBalancerPoliciesOfListenerRequest() {
    }

    /**
     * Constructs a new SetLoadBalancerPoliciesOfListenerRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @param loadBalancerPort
     *        The external port of the load balancer.
     * @param policyNames
     *        The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     *        currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     */
    public SetLoadBalancerPoliciesOfListenerRequest(String loadBalancerName, Integer loadBalancerPort, java.util.List<String> policyNames) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setPolicyNames(policyNames);
    }

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

    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     * 
     * @param loadBalancerPort
     *        The external port of the load balancer.
     */

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     * 
     * @return The external port of the load balancer.
     */

    public Integer getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     * 
     * @param loadBalancerPort
     *        The external port of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerPort(Integer loadBalancerPort) {
        setLoadBalancerPort(loadBalancerPort);
        return this;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     * currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * </p>
     * 
     * @return The names of the policies. This list must include all policies to be enabled. If you omit a policy that
     *         is currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     * currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     *        currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(policyNames);
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     * currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     *        currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     * currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. This list must include all policies to be enabled. If you omit a policy that is
     *        currently enabled, it is disabled. If the list is empty, all current policies are disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: ").append(getLoadBalancerPort()).append(",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: ").append(getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBalancerPoliciesOfListenerRequest == false)
            return false;
        SetLoadBalancerPoliciesOfListenerRequest other = (SetLoadBalancerPoliciesOfListenerRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public SetLoadBalancerPoliciesOfListenerRequest clone() {
        return (SetLoadBalancerPoliciesOfListenerRequest) super.clone();
    }

}
