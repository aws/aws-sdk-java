/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the details of a receipt rule.
 * </p>
 */
public class DescribeReceiptRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status,
     * scan status, and Transport Layer Security (TLS) policy.
     * </p>
     */
    private ReceiptRule rule;

    /**
     * <p>
     * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status,
     * scan status, and Transport Layer Security (TLS) policy.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled
     *        status, scan status, and Transport Layer Security (TLS) policy.
     */

    public void setRule(ReceiptRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status,
     * scan status, and Transport Layer Security (TLS) policy.
     * </p>
     * 
     * @return A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled
     *         status, scan status, and Transport Layer Security (TLS) policy.
     */

    public ReceiptRule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status,
     * scan status, and Transport Layer Security (TLS) policy.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled
     *        status, scan status, and Transport Layer Security (TLS) policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReceiptRuleResult withRule(ReceiptRule rule) {
        setRule(rule);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReceiptRuleResult == false)
            return false;
        DescribeReceiptRuleResult other = (DescribeReceiptRuleResult) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReceiptRuleResult clone() {
        try {
            return (DescribeReceiptRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
