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

/**
 * <p>
 * The LBCookieStickinessPolicy data type.
 * </p>
 */
public class LBCookieStickinessPolicy {

    /**
     * The name name for the policy being created. The name must be unique
     * within the set of policies for this LoadBalancer.
     */
    private String policyName;

    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the sticky session
     * will last for the duration of the browser session.
     */
    private Long cookieExpirationPeriod;

    /**
     * Default constructor for a new LBCookieStickinessPolicy object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LBCookieStickinessPolicy() {}
    
    /**
     * Constructs a new LBCookieStickinessPolicy object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param policyName The name name for the policy being created. The name
     * must be unique within the set of policies for this LoadBalancer.
     * @param cookieExpirationPeriod The time period in seconds after which
     * the cookie should be considered stale. Not specifying this parameter
     * indicates that the sticky session will last for the duration of the
     * browser session.
     */
    public LBCookieStickinessPolicy(String policyName, Long cookieExpirationPeriod) {
        this.policyName = policyName;
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }
    
    /**
     * The name name for the policy being created. The name must be unique
     * within the set of policies for this LoadBalancer.
     *
     * @return The name name for the policy being created. The name must be unique
     *         within the set of policies for this LoadBalancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name name for the policy being created. The name must be unique
     * within the set of policies for this LoadBalancer.
     *
     * @param policyName The name name for the policy being created. The name must be unique
     *         within the set of policies for this LoadBalancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name name for the policy being created. The name must be unique
     * within the set of policies for this LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name name for the policy being created. The name must be unique
     *         within the set of policies for this LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LBCookieStickinessPolicy withPolicyName(String policyName) {
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
    public LBCookieStickinessPolicy withCookieExpirationPeriod(Long cookieExpirationPeriod) {
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
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("CookieExpirationPeriod: " + cookieExpirationPeriod + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    