/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest) CreateLBCookieStickinessPolicy operation}.
 * <p>
 * Generates a stickiness policy with sticky session lifetimes
 * controlled by the lifetime of the browser (user-agent) or a specified
 * expiration period. This policy can only be associated only with HTTP
 * listeners.
 * </p>
 * <p>
 * When a load balancer implements this policy, the load balancer uses a
 * special cookie to track the backend server instance for each request.
 * When the load balancer receives a request, it first checks to see if
 * this cookie is present in the request. If so, the load balancer sends
 * the request to the application server specified in the cookie. If not,
 * the load balancer sends the request to a server that is chosen based
 * on the existing load balancing algorithm.
 * </p>
 * <p>
 * A cookie is inserted into the response for binding subsequent
 * requests from the same user to that server. The validity of the cookie
 * is based on the cookie expiration time, which is specified in the
 * policy configuration.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest)
 */
public class CreateLBCookieStickinessPolicyRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this Load Balancer.
     */
    private String policyName;

    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the sticky session
     * will last for the duration of the browser session.
     */
    private Long cookieExpirationPeriod;

    /**
     * Default constructor for a new CreateLBCookieStickinessPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateLBCookieStickinessPolicyRequest() {}
    
    /**
     * Constructs a new CreateLBCookieStickinessPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param policyName The name of the policy being created. The name must
     * be unique within the set of policies for this Load Balancer.
     */
    public CreateLBCookieStickinessPolicyRequest(String loadBalancerName, String policyName) {
        this.loadBalancerName = loadBalancerName;
        this.policyName = policyName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLBCookieStickinessPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this Load Balancer.
     *
     * @return The name of the policy being created. The name must be unique within
     *         the set of policies for this Load Balancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this Load Balancer.
     *
     * @param policyName The name of the policy being created. The name must be unique within
     *         the set of policies for this Load Balancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this Load Balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name of the policy being created. The name must be unique within
     *         the set of policies for this Load Balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLBCookieStickinessPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the sticky session
     * will last for the duration of the browser session.
     *
     * @return The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the sticky session
     *         will last for the duration of the browser session.
     */
    public Long getCookieExpirationPeriod() {
        return cookieExpirationPeriod;
    }
    
    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the sticky session
     * will last for the duration of the browser session.
     *
     * @param cookieExpirationPeriod The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the sticky session
     *         will last for the duration of the browser session.
     */
    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }
    
    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the sticky session
     * will last for the duration of the browser session.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cookieExpirationPeriod The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the sticky session
     *         will last for the duration of the browser session.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLBCookieStickinessPolicyRequest withCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("CookieExpirationPeriod: " + cookieExpirationPeriod + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    