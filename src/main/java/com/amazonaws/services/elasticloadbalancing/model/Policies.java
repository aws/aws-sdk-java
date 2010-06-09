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
 * Policies
 */
public class Policies {

    private java.util.List<AppCookieStickinessPolicy> appCookieStickinessPolicies;

    private java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPolicies;

    /**
     * Returns the value of the AppCookieStickinessPolicies property for this
     * object.
     *
     * @return The value of the AppCookieStickinessPolicies property for this object.
     */
    public java.util.List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        if (appCookieStickinessPolicies == null) {
            appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>();
        }
        return appCookieStickinessPolicies;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
     */
    public void setAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        java.util.List<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new java.util.ArrayList<AppCookieStickinessPolicy>();
        if (appCookieStickinessPolicies != null) {
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
        }
        this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withAppCookieStickinessPolicies(AppCookieStickinessPolicy... appCookieStickinessPolicies) {
        for (AppCookieStickinessPolicy value : appCookieStickinessPolicies) {
            getAppCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AppCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appCookieStickinessPolicies The new value for the AppCookieStickinessPolicies property for this
     *         object.
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
     * Returns the value of the LBCookieStickinessPolicies property for this
     * object.
     *
     * @return The value of the LBCookieStickinessPolicies property for this object.
     */
    public java.util.List<LBCookieStickinessPolicy> getLBCookieStickinessPolicies() {
        if (lBCookieStickinessPolicies == null) {
            lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>();
        }
        return lBCookieStickinessPolicies;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
     */
    public void setLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new java.util.ArrayList<LBCookieStickinessPolicy>();
        if (lBCookieStickinessPolicies != null) {
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
        }
        this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Policies withLBCookieStickinessPolicies(LBCookieStickinessPolicy... lBCookieStickinessPolicies) {
        for (LBCookieStickinessPolicy value : lBCookieStickinessPolicies) {
            getLBCookieStickinessPolicies().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the LBCookieStickinessPolicies property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lBCookieStickinessPolicies The new value for the LBCookieStickinessPolicies property for this
     *         object.
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
        sb.append("}");
        return sb.toString();
    }
    
}
    