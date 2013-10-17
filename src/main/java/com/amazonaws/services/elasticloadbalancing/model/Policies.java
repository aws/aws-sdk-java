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
 * The policies data type.
 * </p>
 */
public class Policies implements Serializable {

    /**
     * A list of the <a>AppCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy> appCookieStickinessPolicies;

    /**
     * A list of <a>LBCookieStickinessPolicy</a> objects created with
     * <a>CreateAppCookieStickinessPolicy</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy> lBCookieStickinessPolicies;

    /**
     * A list of policy names other than the stickiness policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> otherPolicies;

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
              appCookieStickinessPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy>();
              appCookieStickinessPolicies.setAutoConstruct(true);
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
        if (appCookieStickinessPolicies == null) {
            this.appCookieStickinessPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy>(appCookieStickinessPolicies.size());
        appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
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
        if (getAppCookieStickinessPolicies() == null) setAppCookieStickinessPolicies(new java.util.ArrayList<AppCookieStickinessPolicy>(appCookieStickinessPolicies.length));
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
        if (appCookieStickinessPolicies == null) {
            this.appCookieStickinessPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy> appCookieStickinessPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AppCookieStickinessPolicy>(appCookieStickinessPolicies.size());
            appCookieStickinessPoliciesCopy.addAll(appCookieStickinessPolicies);
            this.appCookieStickinessPolicies = appCookieStickinessPoliciesCopy;
        }

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
              lBCookieStickinessPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy>();
              lBCookieStickinessPolicies.setAutoConstruct(true);
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
        if (lBCookieStickinessPolicies == null) {
            this.lBCookieStickinessPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy>(lBCookieStickinessPolicies.size());
        lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
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
        if (getLBCookieStickinessPolicies() == null) setLBCookieStickinessPolicies(new java.util.ArrayList<LBCookieStickinessPolicy>(lBCookieStickinessPolicies.length));
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
        if (lBCookieStickinessPolicies == null) {
            this.lBCookieStickinessPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy> lBCookieStickinessPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LBCookieStickinessPolicy>(lBCookieStickinessPolicies.size());
            lBCookieStickinessPoliciesCopy.addAll(lBCookieStickinessPolicies);
            this.lBCookieStickinessPolicies = lBCookieStickinessPoliciesCopy;
        }

        return this;
    }

    /**
     * A list of policy names other than the stickiness policies.
     *
     * @return A list of policy names other than the stickiness policies.
     */
    public java.util.List<String> getOtherPolicies() {
        if (otherPolicies == null) {
              otherPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              otherPolicies.setAutoConstruct(true);
        }
        return otherPolicies;
    }
    
    /**
     * A list of policy names other than the stickiness policies.
     *
     * @param otherPolicies A list of policy names other than the stickiness policies.
     */
    public void setOtherPolicies(java.util.Collection<String> otherPolicies) {
        if (otherPolicies == null) {
            this.otherPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> otherPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(otherPolicies.size());
        otherPoliciesCopy.addAll(otherPolicies);
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
        if (getOtherPolicies() == null) setOtherPolicies(new java.util.ArrayList<String>(otherPolicies.length));
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
        if (otherPolicies == null) {
            this.otherPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> otherPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(otherPolicies.size());
            otherPoliciesCopy.addAll(otherPolicies);
            this.otherPolicies = otherPoliciesCopy;
        }

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
        if (getAppCookieStickinessPolicies() != null) sb.append("AppCookieStickinessPolicies: " + getAppCookieStickinessPolicies() + ",");
        if (getLBCookieStickinessPolicies() != null) sb.append("LBCookieStickinessPolicies: " + getLBCookieStickinessPolicies() + ",");
        if (getOtherPolicies() != null) sb.append("OtherPolicies: " + getOtherPolicies() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAppCookieStickinessPolicies() == null) ? 0 : getAppCookieStickinessPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getLBCookieStickinessPolicies() == null) ? 0 : getLBCookieStickinessPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getOtherPolicies() == null) ? 0 : getOtherPolicies().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Policies == false) return false;
        Policies other = (Policies)obj;
        
        if (other.getAppCookieStickinessPolicies() == null ^ this.getAppCookieStickinessPolicies() == null) return false;
        if (other.getAppCookieStickinessPolicies() != null && other.getAppCookieStickinessPolicies().equals(this.getAppCookieStickinessPolicies()) == false) return false; 
        if (other.getLBCookieStickinessPolicies() == null ^ this.getLBCookieStickinessPolicies() == null) return false;
        if (other.getLBCookieStickinessPolicies() != null && other.getLBCookieStickinessPolicies().equals(this.getLBCookieStickinessPolicies()) == false) return false; 
        if (other.getOtherPolicies() == null ^ this.getOtherPolicies() == null) return false;
        if (other.getOtherPolicies() != null && other.getOtherPolicies().equals(this.getOtherPolicies()) == false) return false; 
        return true;
    }
    
}
    