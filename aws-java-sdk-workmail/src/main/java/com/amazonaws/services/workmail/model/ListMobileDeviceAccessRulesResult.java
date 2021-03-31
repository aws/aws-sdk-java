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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMobileDeviceAccessRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * </p>
     */
    private java.util.List<MobileDeviceAccessRule> rules;

    /**
     * <p>
     * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * </p>
     * 
     * @return The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     */

    public java.util.List<MobileDeviceAccessRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param rules
     *        The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     */

    public void setRules(java.util.Collection<MobileDeviceAccessRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<MobileDeviceAccessRule>(rules);
    }

    /**
     * <p>
     * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessRulesResult withRules(MobileDeviceAccessRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<MobileDeviceAccessRule>(rules.length));
        }
        for (MobileDeviceAccessRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * </p>
     * 
     * @param rules
     *        The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessRulesResult withRules(java.util.Collection<MobileDeviceAccessRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMobileDeviceAccessRulesResult == false)
            return false;
        ListMobileDeviceAccessRulesResult other = (ListMobileDeviceAccessRulesResult) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ListMobileDeviceAccessRulesResult clone() {
        try {
            return (ListMobileDeviceAccessRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
