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
 * Contains the parameters for CreateLBCookieStickinessPolicy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLBCookieStickinessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLBCookieStickinessPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This
     * name must be unique within the set of policies for this load balancer.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     * parameter, the default value is 0, which indicates that the sticky session should last for the duration of the
     * browser session.
     * </p>
     */
    private Long cookieExpirationPeriod;

    /**
     * Default constructor for CreateLBCookieStickinessPolicyRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public CreateLBCookieStickinessPolicyRequest() {
    }

    /**
     * Constructs a new CreateLBCookieStickinessPolicyRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @param policyName
     *        The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-).
     *        This name must be unique within the set of policies for this load balancer.
     */
    public CreateLBCookieStickinessPolicyRequest(String loadBalancerName, String policyName) {
        setLoadBalancerName(loadBalancerName);
        setPolicyName(policyName);
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

    public CreateLBCookieStickinessPolicyRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This
     * name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-).
     *        This name must be unique within the set of policies for this load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This
     * name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @return The name of the policy being created. Policy names must consist of alphanumeric characters and dashes
     *         (-). This name must be unique within the set of policies for this load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This
     * name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-).
     *        This name must be unique within the set of policies for this load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLBCookieStickinessPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     * parameter, the default value is 0, which indicates that the sticky session should last for the duration of the
     * browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     *        parameter, the default value is 0, which indicates that the sticky session should last for the duration of
     *        the browser session.
     */

    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     * parameter, the default value is 0, which indicates that the sticky session should last for the duration of the
     * browser session.
     * </p>
     * 
     * @return The time period, in seconds, after which the cookie should be considered stale. If you do not specify
     *         this parameter, the default value is 0, which indicates that the sticky session should last for the
     *         duration of the browser session.
     */

    public Long getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     * parameter, the default value is 0, which indicates that the sticky session should last for the duration of the
     * browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The time period, in seconds, after which the cookie should be considered stale. If you do not specify this
     *        parameter, the default value is 0, which indicates that the sticky session should last for the duration of
     *        the browser session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLBCookieStickinessPolicyRequest withCookieExpirationPeriod(Long cookieExpirationPeriod) {
        setCookieExpirationPeriod(cookieExpirationPeriod);
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
        if (getCookieExpirationPeriod() != null)
            sb.append("CookieExpirationPeriod: ").append(getCookieExpirationPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLBCookieStickinessPolicyRequest == false)
            return false;
        CreateLBCookieStickinessPolicyRequest other = (CreateLBCookieStickinessPolicyRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getCookieExpirationPeriod() == null ^ this.getCookieExpirationPeriod() == null)
            return false;
        if (other.getCookieExpirationPeriod() != null && other.getCookieExpirationPeriod().equals(this.getCookieExpirationPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getCookieExpirationPeriod() == null) ? 0 : getCookieExpirationPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CreateLBCookieStickinessPolicyRequest clone() {
        return (CreateLBCookieStickinessPolicyRequest) super.clone();
    }

}
