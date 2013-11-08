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
 * The AppCookieStickinessPolicy data type.
 * </p>
 */
public class AppCookieStickinessPolicy implements Serializable {

    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within a set of policies for this load balancer.
     */
    private String policyName;

    /**
     * The name of the application cookie used for stickiness.
     */
    private String cookieName;

    /**
     * Default constructor for a new AppCookieStickinessPolicy object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AppCookieStickinessPolicy() {}
    
    /**
     * Constructs a new AppCookieStickinessPolicy object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param policyName The mnemonic name for the policy being created. The
     * name must be unique within a set of policies for this load balancer.
     * @param cookieName The name of the application cookie used for
     * stickiness.
     */
    public AppCookieStickinessPolicy(String policyName, String cookieName) {
        setPolicyName(policyName);
        setCookieName(cookieName);
    }

    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within a set of policies for this load balancer.
     *
     * @return The mnemonic name for the policy being created. The name must be
     *         unique within a set of policies for this load balancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within a set of policies for this load balancer.
     *
     * @param policyName The mnemonic name for the policy being created. The name must be
     *         unique within a set of policies for this load balancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within a set of policies for this load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The mnemonic name for the policy being created. The name must be
     *         unique within a set of policies for this load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AppCookieStickinessPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The name of the application cookie used for stickiness.
     *
     * @return The name of the application cookie used for stickiness.
     */
    public String getCookieName() {
        return cookieName;
    }
    
    /**
     * The name of the application cookie used for stickiness.
     *
     * @param cookieName The name of the application cookie used for stickiness.
     */
    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }
    
    /**
     * The name of the application cookie used for stickiness.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cookieName The name of the application cookie used for stickiness.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AppCookieStickinessPolicy withCookieName(String cookieName) {
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getCookieName() != null) sb.append("CookieName: " + getCookieName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getCookieName() == null) ? 0 : getCookieName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AppCookieStickinessPolicy == false) return false;
        AppCookieStickinessPolicy other = (AppCookieStickinessPolicy)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getCookieName() == null ^ this.getCookieName() == null) return false;
        if (other.getCookieName() != null && other.getCookieName().equals(this.getCookieName()) == false) return false; 
        return true;
    }
    
}
    