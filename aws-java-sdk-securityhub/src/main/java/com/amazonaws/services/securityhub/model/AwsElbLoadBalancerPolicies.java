/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the policies for a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerPolicies implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * </p>
     */
    private java.util.List<AwsElbAppCookieStickinessPolicy> appCookieStickinessPolicies;
    /**
     * <p>
     * The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * </p>
     */
    private java.util.List<AwsElbLbCookieStickinessPolicy> lbCookieStickinessPolicies;
    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     */
    private java.util.List<String> otherPolicies;

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * </p>
     * 
     * @return The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     */

    public java.util.List<AwsElbAppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        return appCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     */

    public void setAppCookieStickinessPolicies(java.util.Collection<AwsElbAppCookieStickinessPolicy> appCookieStickinessPolicies) {
        if (appCookieStickinessPolicies == null) {
            this.appCookieStickinessPolicies = null;
            return;
        }

        this.appCookieStickinessPolicies = new java.util.ArrayList<AwsElbAppCookieStickinessPolicy>(appCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppCookieStickinessPolicies(java.util.Collection)} or
     * {@link #withAppCookieStickinessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerPolicies withAppCookieStickinessPolicies(AwsElbAppCookieStickinessPolicy... appCookieStickinessPolicies) {
        if (this.appCookieStickinessPolicies == null) {
            setAppCookieStickinessPolicies(new java.util.ArrayList<AwsElbAppCookieStickinessPolicy>(appCookieStickinessPolicies.length));
        }
        for (AwsElbAppCookieStickinessPolicy ele : appCookieStickinessPolicies) {
            this.appCookieStickinessPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * </p>
     * 
     * @param appCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateAppCookieStickinessPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerPolicies withAppCookieStickinessPolicies(java.util.Collection<AwsElbAppCookieStickinessPolicy> appCookieStickinessPolicies) {
        setAppCookieStickinessPolicies(appCookieStickinessPolicies);
        return this;
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * </p>
     * 
     * @return The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     */

    public java.util.List<AwsElbLbCookieStickinessPolicy> getLbCookieStickinessPolicies() {
        return lbCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * </p>
     * 
     * @param lbCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     */

    public void setLbCookieStickinessPolicies(java.util.Collection<AwsElbLbCookieStickinessPolicy> lbCookieStickinessPolicies) {
        if (lbCookieStickinessPolicies == null) {
            this.lbCookieStickinessPolicies = null;
            return;
        }

        this.lbCookieStickinessPolicies = new java.util.ArrayList<AwsElbLbCookieStickinessPolicy>(lbCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLbCookieStickinessPolicies(java.util.Collection)} or
     * {@link #withLbCookieStickinessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lbCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerPolicies withLbCookieStickinessPolicies(AwsElbLbCookieStickinessPolicy... lbCookieStickinessPolicies) {
        if (this.lbCookieStickinessPolicies == null) {
            setLbCookieStickinessPolicies(new java.util.ArrayList<AwsElbLbCookieStickinessPolicy>(lbCookieStickinessPolicies.length));
        }
        for (AwsElbLbCookieStickinessPolicy ele : lbCookieStickinessPolicies) {
            this.lbCookieStickinessPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * </p>
     * 
     * @param lbCookieStickinessPolicies
     *        The stickiness policies that are created using <code>CreateLBCookieStickinessPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerPolicies withLbCookieStickinessPolicies(java.util.Collection<AwsElbLbCookieStickinessPolicy> lbCookieStickinessPolicies) {
        setLbCookieStickinessPolicies(lbCookieStickinessPolicies);
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

        this.otherPolicies = new java.util.ArrayList<String>(otherPolicies);
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

    public AwsElbLoadBalancerPolicies withOtherPolicies(String... otherPolicies) {
        if (this.otherPolicies == null) {
            setOtherPolicies(new java.util.ArrayList<String>(otherPolicies.length));
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

    public AwsElbLoadBalancerPolicies withOtherPolicies(java.util.Collection<String> otherPolicies) {
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
        if (getLbCookieStickinessPolicies() != null)
            sb.append("LbCookieStickinessPolicies: ").append(getLbCookieStickinessPolicies()).append(",");
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

        if (obj instanceof AwsElbLoadBalancerPolicies == false)
            return false;
        AwsElbLoadBalancerPolicies other = (AwsElbLoadBalancerPolicies) obj;
        if (other.getAppCookieStickinessPolicies() == null ^ this.getAppCookieStickinessPolicies() == null)
            return false;
        if (other.getAppCookieStickinessPolicies() != null && other.getAppCookieStickinessPolicies().equals(this.getAppCookieStickinessPolicies()) == false)
            return false;
        if (other.getLbCookieStickinessPolicies() == null ^ this.getLbCookieStickinessPolicies() == null)
            return false;
        if (other.getLbCookieStickinessPolicies() != null && other.getLbCookieStickinessPolicies().equals(this.getLbCookieStickinessPolicies()) == false)
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
        hashCode = prime * hashCode + ((getLbCookieStickinessPolicies() == null) ? 0 : getLbCookieStickinessPolicies().hashCode());
        hashCode = prime * hashCode + ((getOtherPolicies() == null) ? 0 : getOtherPolicies().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerPolicies clone() {
        try {
            return (AwsElbLoadBalancerPolicies) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerPoliciesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
