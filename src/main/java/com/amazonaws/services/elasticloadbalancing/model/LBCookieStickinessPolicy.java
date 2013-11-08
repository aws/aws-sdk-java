/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * The LBCookieStickinessPolicy data type.
 * </p>
 */
public class LBCookieStickinessPolicy implements Serializable {

    /**
     * The name for the policy being created. The name must be unique within
     * the set of policies for this load balancer.
     */
    private String policyName;

    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the stickiness
     * session will last for the duration of the browser session.
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
     * @param policyName The name for the policy being created. The name must
     * be unique within the set of policies for this load balancer.
     * @param cookieExpirationPeriod The time period in seconds after which
     * the cookie should be considered stale. Not specifying this parameter
     * indicates that the stickiness session will last for the duration of
     * the browser session.
     */
    public LBCookieStickinessPolicy(String policyName, Long cookieExpirationPeriod) {
        setPolicyName(policyName);
        setCookieExpirationPeriod(cookieExpirationPeriod);
    }

    /**
     * The name for the policy being created. The name must be unique within
     * the set of policies for this load balancer.
     *
     * @return The name for the policy being created. The name must be unique within
     *         the set of policies for this load balancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name for the policy being created. The name must be unique within
     * the set of policies for this load balancer.
     *
     * @param policyName The name for the policy being created. The name must be unique within
     *         the set of policies for this load balancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name for the policy being created. The name must be unique within
     * the set of policies for this load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name for the policy being created. The name must be unique within
     *         the set of policies for this load balancer.
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
     * stale. Not specifying this parameter indicates that the stickiness
     * session will last for the duration of the browser session.
     *
     * @return The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the stickiness
     *         session will last for the duration of the browser session.
     */
    public Long getCookieExpirationPeriod() {
        return cookieExpirationPeriod;
    }
    
    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the stickiness
     * session will last for the duration of the browser session.
     *
     * @param cookieExpirationPeriod The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the stickiness
     *         session will last for the duration of the browser session.
     */
    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }
    
    /**
     * The time period in seconds after which the cookie should be considered
     * stale. Not specifying this parameter indicates that the stickiness
     * session will last for the duration of the browser session.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cookieExpirationPeriod The time period in seconds after which the cookie should be considered
     *         stale. Not specifying this parameter indicates that the stickiness
     *         session will last for the duration of the browser session.
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getCookieExpirationPeriod() != null) sb.append("CookieExpirationPeriod: " + getCookieExpirationPeriod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getCookieExpirationPeriod() == null) ? 0 : getCookieExpirationPeriod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LBCookieStickinessPolicy == false) return false;
        LBCookieStickinessPolicy other = (LBCookieStickinessPolicy)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getCookieExpirationPeriod() == null ^ this.getCookieExpirationPeriod() == null) return false;
        if (other.getCookieExpirationPeriod() != null && other.getCookieExpirationPeriod().equals(this.getCookieExpirationPeriod()) == false) return false; 
        return true;
    }
    
}
    