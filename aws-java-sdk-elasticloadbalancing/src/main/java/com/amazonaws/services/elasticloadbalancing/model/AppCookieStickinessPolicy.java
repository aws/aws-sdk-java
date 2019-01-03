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
 * Information about a policy for application-controlled session stickiness.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AppCookieStickinessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppCookieStickinessPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load
     * balancer.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     */
    private String cookieName;

    /**
     * Default constructor for AppCookieStickinessPolicy object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public AppCookieStickinessPolicy() {
    }

    /**
     * Constructs a new AppCookieStickinessPolicy object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param policyName
     *        The mnemonic name for the policy being created. The name must be unique within a set of policies for this
     *        load balancer.
     * @param cookieName
     *        The name of the application cookie used for stickiness.
     */
    public AppCookieStickinessPolicy(String policyName, String cookieName) {
        setPolicyName(policyName);
        setCookieName(cookieName);
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load
     * balancer.
     * </p>
     * 
     * @param policyName
     *        The mnemonic name for the policy being created. The name must be unique within a set of policies for this
     *        load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load
     * balancer.
     * </p>
     * 
     * @return The mnemonic name for the policy being created. The name must be unique within a set of policies for this
     *         load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load
     * balancer.
     * </p>
     * 
     * @param policyName
     *        The mnemonic name for the policy being created. The name must be unique within a set of policies for this
     *        load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppCookieStickinessPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @param cookieName
     *        The name of the application cookie used for stickiness.
     */

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @return The name of the application cookie used for stickiness.
     */

    public String getCookieName() {
        return this.cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * 
     * @param cookieName
     *        The name of the application cookie used for stickiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppCookieStickinessPolicy withCookieName(String cookieName) {
        setCookieName(cookieName);
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
        if (getCookieName() != null)
            sb.append("CookieName: ").append(getCookieName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppCookieStickinessPolicy == false)
            return false;
        AppCookieStickinessPolicy other = (AppCookieStickinessPolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getCookieName() == null ^ this.getCookieName() == null)
            return false;
        if (other.getCookieName() != null && other.getCookieName().equals(this.getCookieName()) == false)
            return false;
        return true;
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
    public AppCookieStickinessPolicy clone() {
        try {
            return (AppCookieStickinessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
