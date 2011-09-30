/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The policies data type.
 * </p>
 */
public class Policies {

    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     */
    private java.util.List<AppCookieStickinessPolicy> appCookieStickinessPolicies;

    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     */
    private java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPolicies;

    /**
     * A list of policy names other than the stickiness policies.
     */
    private java.util.List<String> otherPolicies;

    /**
     * Default constructor for a new Policies object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Policies() {}
    
    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A list of the <a>AppCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     */
    public java.util.List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        
        if (appCookieStickinessPolicies == null) {
            appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>();
        }
        return appCookieStickinessPolicies;
    }
    
    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @param appCookieStickinessPolicies A list of the <a>AppCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     */
    public void setAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        java.util.List<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new java.util.ArrayList<AppCookieStickinessPolicy>();
        if (appCookieStickinessPolicies != null) {
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
        }
        this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;
    }
    
    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies A list of the <a>AppCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withAppCookieStickinessPolicies(AppCookieStickinessPolicy... appCookieStickinessPolicies) {
        if (getAppCookieStickinessPolicies() == null) setAppCookieStickinessPolicies(new java.util.ArrayList<AppCookieStickinessPolicy>());
        for (AppCookieStickinessPolicy value : appCookieStickinessPolicies) {
            getAppCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies A list of the <a>AppCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        java.util.List<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new java.util.ArrayList<AppCookieStickinessPolicy>();
        if (appCookieStickinessPolicies != null) {
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
        }
        this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;

        return this;
    }
    
    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A list of <a>LBCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     */
    public java.util.List<LBCookieStickinessPolicy> getLBCookieStickinessPolicies() {
        
        if (lBCookieStickinessPolicies == null) {
            lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>();
        }
        return lBCookieStickinessPolicies;
    }
    
    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @param lBCookieStickinessPolicies A list of <a>LBCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     */
    public void setLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new java.util.ArrayList<LBCookieStickinessPolicy>();
        if (lBCookieStickinessPolicies != null) {
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
        }
        this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;
    }
    
    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies A list of <a>LBCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withLBCookieStickinessPolicies(LBCookieStickinessPolicy... lBCookieStickinessPolicies) {
        if (getLBCookieStickinessPolicies() == null) setLBCookieStickinessPolicies(new java.util.ArrayList<LBCookieStickinessPolicy>());
        for (LBCookieStickinessPolicy value : lBCookieStickinessPolicies) {
            getLBCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies A list of <a>LBCookieStickinessPolicy</a> objects created with
     *         <a>CreateAppCookieStickinessPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new java.util.ArrayList<LBCookieStickinessPolicy>();
        if (lBCookieStickinessPolicies != null) {
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
        }
        this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;

        return this;
    }
    
    /**
     * A list of policy names other than the stickiness policies.
     *
     * @return A list of policy names other than the stickiness policies.
     */
    public java.util.List<String> getOtherPolicies() {
        
        if (otherPolicies == null) {
            otherPolicies = new java.util.ArrayList<String>();
        }
        return otherPolicies;
    }
    
    /**
     * A list of policy names other than the stickiness policies.
     *
     * @param otherPolicies A list of policy names other than the stickiness policies.
     */
    public void setOtherPolicies(java.util.Collection<String> otherPolicies) {
        java.util.List<String> otherPoliciesCopy = new java.util.ArrayList<String>();
        if (otherPolicies != null) {
            otherPoliciesCopy.addAll(otherPolicies);
        }
        this.otherPolicies = otherPoliciesCopy;
    }
    
    /**
     * A list of policy names other than the stickiness policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param otherPolicies A list of policy names other than the stickiness policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withOtherPolicies(String... otherPolicies) {
        if (getOtherPolicies() == null) setOtherPolicies(new java.util.ArrayList<String>());
        for (String value : otherPolicies) {
            getOtherPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of policy names other than the stickiness policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param otherPolicies A list of policy names other than the stickiness policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withOtherPolicies(java.util.Collection<String> otherPolicies) {
        java.util.List<String> otherPoliciesCopy = new java.util.ArrayList<String>();
        if (otherPolicies != null) {
            otherPoliciesCopy.addAll(otherPolicies);
        }
        this.otherPolicies = otherPoliciesCopy;

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
        sb.append("AppCookieStickinessPolicies: " + appCookieStickinessPolicies + ", ");
        sb.append("LBCookieStickinessPolicies: " + lBCookieStickinessPolicies + ", ");
        sb.append("OtherPolicies: " + otherPolicies + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    