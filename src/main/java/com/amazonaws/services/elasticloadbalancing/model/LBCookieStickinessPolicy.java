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
 * L B Cookie Stickiness Policy
 */
public class LBCookieStickinessPolicy {

    private String policyName;

    private Long cookieExpirationPeriod;

    /**
     * Returns the value of the PolicyName property for this object.
     *
     * @return The value of the PolicyName property for this object.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * Sets the value of the PolicyName property for this object.
     *
     * @param policyName The new value for the PolicyName property for this object.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * Sets the value of the PolicyName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The new value for the PolicyName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LBCookieStickinessPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * Returns the value of the CookieExpirationPeriod property for this
     * object.
     *
     * @return The value of the CookieExpirationPeriod property for this object.
     */
    public Long getCookieExpirationPeriod() {
        return cookieExpirationPeriod;
    }
    
    /**
     * Sets the value of the CookieExpirationPeriod property for this object.
     *
     * @param cookieExpirationPeriod The new value for the CookieExpirationPeriod property for this object.
     */
    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }
    
    /**
     * Sets the value of the CookieExpirationPeriod property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cookieExpirationPeriod The new value for the CookieExpirationPeriod property for this object.
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
    