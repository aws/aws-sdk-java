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
 * The AppCookieStickinessPolicy data type.
 * </p>
 */
public class AppCookieStickinessPolicy {

    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within the set of policies for this LoadBalancer.
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
     * name must be unique within the set of policies for this LoadBalancer.
     * @param cookieName The name of the application cookie used for
     * stickiness.
     */
    public AppCookieStickinessPolicy(String policyName, String cookieName) {
        this.policyName = policyName;
        this.cookieName = cookieName;
    }
    
    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within the set of policies for this LoadBalancer.
     *
     * @return The mnemonic name for the policy being created. The name must be
     *         unique within the set of policies for this LoadBalancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within the set of policies for this LoadBalancer.
     *
     * @param policyName The mnemonic name for the policy being created. The name must be
     *         unique within the set of policies for this LoadBalancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The mnemonic name for the policy being created. The name must be
     * unique within the set of policies for this LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The mnemonic name for the policy being created. The name must be
     *         unique within the set of policies for this LoadBalancer.
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
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("CookieName: " + cookieName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    