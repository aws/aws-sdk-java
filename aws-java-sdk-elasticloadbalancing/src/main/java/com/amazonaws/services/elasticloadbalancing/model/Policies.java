/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The policies for a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/Policies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policies implements Serializable, Cloneable {

    /**
     * <p>
     * The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AppCookieStickinessPolicy> appCookieStickinessPolicies;
    /**
     * <p>
     * The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LBCookieStickinessPolicy> lBCookieStickinessPolicies;
    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> otherPolicies;

    /**
     * <p>
     * The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * 
     * @return The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     */

    public java.util.List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        if (appCookieStickinessPolicies == null) {
            appCookieStickinessPolicies = new com.amazonaws.internal.SdkInternalList<AppCookieStickinessPolicy>();
        }
        return appCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     */

    public void setAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        if (appCookieStickinessPolicies == null) {
            this.appCookieStickinessPolicies = null;
            return;
        }

        this.appCookieStickinessPolicies = new com.amazonaws.internal.SdkInternalList<AppCookieStickinessPolicy>(appCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppCookieStickinessPolicies(java.util.Collection)} or
     * {@link #withAppCookieStickinessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withAppCookieStickinessPolicies(AppCookieStickinessPolicy... appCookieStickinessPolicies) {
        if (this.appCookieStickinessPolicies == null) {
            setAppCookieStickinessPolicies(new com.amazonaws.internal.SdkInternalList<AppCookieStickinessPolicy>(appCookieStickinessPolicies.length));
        }
        for (AppCookieStickinessPolicy ele : appCookieStickinessPolicies) {
            this.appCookieStickinessPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateAppCookieStickinessPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withAppCookieStickinessPolicies(java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        setAppCookieStickinessPolicies(appCookieStickinessPolicies);
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * 
     * @return The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     */

    public java.util.List<LBCookieStickinessPolicy> getLBCookieStickinessPolicies() {
        if (lBCookieStickinessPolicies == null) {
            lBCookieStickinessPolicies = new com.amazonaws.internal.SdkInternalList<LBCookieStickinessPolicy>();
        }
        return lBCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * 
     * @param lBCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     */

    public void setLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        if (lBCookieStickinessPolicies == null) {
            this.lBCookieStickinessPolicies = null;
            return;
        }

        this.lBCookieStickinessPolicies = new com.amazonaws.internal.SdkInternalList<LBCookieStickinessPolicy>(lBCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLBCookieStickinessPolicies(java.util.Collection)} or
     * {@link #withLBCookieStickinessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lBCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withLBCookieStickinessPolicies(LBCookieStickinessPolicy... lBCookieStickinessPolicies) {
        if (this.lBCookieStickinessPolicies == null) {
            setLBCookieStickinessPolicies(new com.amazonaws.internal.SdkInternalList<LBCookieStickinessPolicy>(lBCookieStickinessPolicies.length));
        }
        for (LBCookieStickinessPolicy ele : lBCookieStickinessPolicies) {
            this.lBCookieStickinessPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * 
     * @param lBCookieStickinessPolicies
     *        The stickiness policies created using <a>CreateLBCookieStickinessPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withLBCookieStickinessPolicies(java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        setLBCookieStickinessPolicies(lBCookieStickinessPolicies);
        return this;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * 
     * @return The policies other than the stickiness policies.
     */

    public java.util.List<String> getOtherPolicies() {
        if (otherPolicies == null) {
            otherPolicies = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return otherPolicies;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * 
     * @param otherPolicies
     *        The policies other than the stickiness policies.
     */

    public void setOtherPolicies(java.util.Collection<String> otherPolicies) {
        if (otherPolicies == null) {
            this.otherPolicies = null;
            return;
        }

        this.otherPolicies = new com.amazonaws.internal.SdkInternalList<String>(otherPolicies);
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOtherPolicies(java.util.Collection)} or {@link #withOtherPolicies(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param otherPolicies
     *        The policies other than the stickiness policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withOtherPolicies(String... otherPolicies) {
        if (this.otherPolicies == null) {
            setOtherPolicies(new com.amazonaws.internal.SdkInternalList<String>(otherPolicies.length));
        }
        for (String ele : otherPolicies) {
            this.otherPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * 
     * @param otherPolicies
     *        The policies other than the stickiness policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policies withOtherPolicies(java.util.Collection<String> otherPolicies) {
        setOtherPolicies(otherPolicies);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppCookieStickinessPolicies() != null)
            sb.append("AppCookieStickinessPolicies: ").append(getAppCookieStickinessPolicies()).append(",");
        if (getLBCookieStickinessPolicies() != null)
            sb.append("LBCookieStickinessPolicies: ").append(getLBCookieStickinessPolicies()).append(",");
        if (getOtherPolicies() != null)
            sb.append("OtherPolicies: ").append(getOtherPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policies == false)
            return false;
        Policies other = (Policies) obj;
        if (other.getAppCookieStickinessPolicies() == null ^ this.getAppCookieStickinessPolicies() == null)
            return false;
        if (other.getAppCookieStickinessPolicies() != null && other.getAppCookieStickinessPolicies().equals(this.getAppCookieStickinessPolicies()) == false)
            return false;
        if (other.getLBCookieStickinessPolicies() == null ^ this.getLBCookieStickinessPolicies() == null)
            return false;
        if (other.getLBCookieStickinessPolicies() != null && other.getLBCookieStickinessPolicies().equals(this.getLBCookieStickinessPolicies()) == false)
            return false;
        if (other.getOtherPolicies() == null ^ this.getOtherPolicies() == null)
            return false;
        if (other.getOtherPolicies() != null && other.getOtherPolicies().equals(this.getOtherPolicies()) == false)
            return false;
        return true;
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
    public Policies clone() {
        try {
            return (Policies) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
