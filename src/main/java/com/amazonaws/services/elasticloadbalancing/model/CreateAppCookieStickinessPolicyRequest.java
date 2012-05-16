/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest) CreateAppCookieStickinessPolicy operation}.
 * <p>
 * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie. This policy can be associated only
 * with HTTP/HTTPS listeners.
 * </p>
 * <p>
 * This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime of the special Elastic Load Balancing cookie
 * follows the lifetime of the application-generated cookie specified in the policy configuration. The LoadBalancer only inserts a new stickiness cookie
 * when the application response includes a new application cookie.
 * </p>
 * <p>
 * If the application cookie is explicitly removed or expires, the session stops being sticky until a new application cookie is issued.
 * </p>
 * <p>
 * <b>NOTE:</b> An application client must receive and send two cookies: the application-generated cookie and the special Elastic Load Balancing cookie
 * named AWSELB. This is the default behavior for many common web browsers.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest)
 */
public class CreateAppCookieStickinessPolicyRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this LoadBalancer.
     */
    private String policyName;

    /**
     * Name of the application cookie used for stickiness.
     */
    private String cookieName;

    /**
     * Default constructor for a new CreateAppCookieStickinessPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateAppCookieStickinessPolicyRequest() {}
    
    /**
     * Constructs a new CreateAppCookieStickinessPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param policyName The name of the policy being created. The name must
     * be unique within the set of policies for this LoadBalancer.
     * @param cookieName Name of the application cookie used for stickiness.
     */
    public CreateAppCookieStickinessPolicyRequest(String loadBalancerName, String policyName, String cookieName) {
        this.loadBalancerName = loadBalancerName;
        this.policyName = policyName;
        this.cookieName = cookieName;
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
    public CreateAppCookieStickinessPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this LoadBalancer.
     *
     * @return The name of the policy being created. The name must be unique within
     *         the set of policies for this LoadBalancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this LoadBalancer.
     *
     * @param policyName The name of the policy being created. The name must be unique within
     *         the set of policies for this LoadBalancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy being created. The name must be unique within
     * the set of policies for this LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name of the policy being created. The name must be unique within
     *         the set of policies for this LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAppCookieStickinessPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * Name of the application cookie used for stickiness.
     *
     * @return Name of the application cookie used for stickiness.
     */
    public String getCookieName() {
        return cookieName;
    }
    
    /**
     * Name of the application cookie used for stickiness.
     *
     * @param cookieName Name of the application cookie used for stickiness.
     */
    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }
    
    /**
     * Name of the application cookie used for stickiness.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cookieName Name of the application cookie used for stickiness.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAppCookieStickinessPolicyRequest withCookieName(String cookieName) {
        this.cookieName = cookieName;
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
        if (loadBalancerName != null) sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        if (policyName != null) sb.append("PolicyName: " + policyName + ", ");
        if (cookieName != null) sb.append("CookieName: " + cookieName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getCookieName() == null) ? 0 : getCookieName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateAppCookieStickinessPolicyRequest == false) return false;
        CreateAppCookieStickinessPolicyRequest other = (CreateAppCookieStickinessPolicyRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getCookieName() == null ^ this.getCookieName() == null) return false;
        if (other.getCookieName() != null && other.getCookieName().equals(this.getCookieName()) == false) return false; 
        return true;
    }
    
}
    