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
 * Information about a policy for duration-based session stickiness.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/LBCookieStickinessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LBCookieStickinessPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of policies for this load balancer.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     */
    private Long cookieExpirationPeriod;

    /**
     * Default constructor for LBCookieStickinessPolicy object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public LBCookieStickinessPolicy() {
    }

    /**
     * Constructs a new LBCookieStickinessPolicy object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param policyName
     *        The name of the policy. This name must be unique within the set of policies for this load balancer.
     * @param cookieExpirationPeriod
     *        The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     *        specified, the stickiness session lasts for the duration of the browser session.
     */
    public LBCookieStickinessPolicy(String policyName, Long cookieExpirationPeriod) {
        setPolicyName(policyName);
        setCookieExpirationPeriod(cookieExpirationPeriod);
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy. This name must be unique within the set of policies for this load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @return The name of the policy. This name must be unique within the set of policies for this load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of policies for this load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy. This name must be unique within the set of policies for this load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LBCookieStickinessPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     *        specified, the stickiness session lasts for the duration of the browser session.
     */

    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @return The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     *         specified, the stickiness session lasts for the duration of the browser session.
     */

    public Long getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The time period, in seconds, after which the cookie should be considered stale. If this parameter is not
     *        specified, the stickiness session lasts for the duration of the browser session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LBCookieStickinessPolicy withCookieExpirationPeriod(Long cookieExpirationPeriod) {
        setCookieExpirationPeriod(cookieExpirationPeriod);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getCookieExpirationPeriod() != null)
            sb.append("CookieExpirationPeriod: ").append(getCookieExpirationPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LBCookieStickinessPolicy == false)
            return false;
        LBCookieStickinessPolicy other = (LBCookieStickinessPolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getCookieExpirationPeriod() == null ^ this.getCookieExpirationPeriod() == null)
            return false;
        if (other.getCookieExpirationPeriod() != null && other.getCookieExpirationPeriod().equals(this.getCookieExpirationPeriod()) == false)
            return false;
        return true;
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
    public LBCookieStickinessPolicy clone() {
        try {
            return (LBCookieStickinessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
