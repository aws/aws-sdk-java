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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the details of the specified receipt rule set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReceiptRuleSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set
     * was created.
     * </p>
     */
    private ReceiptRuleSetMetadata metadata;
    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReceiptRule> rules;

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set
     * was created.
     * </p>
     * 
     * @param metadata
     *        The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the
     *        rule set was created.
     */

    public void setMetadata(ReceiptRuleSetMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set
     * was created.
     * </p>
     * 
     * @return The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the
     *         rule set was created.
     */

    public ReceiptRuleSetMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set
     * was created.
     * </p>
     * 
     * @param metadata
     *        The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the
     *        rule set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReceiptRuleSetResult withMetadata(ReceiptRuleSetMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule set.
     * </p>
     * 
     * @return A list of the receipt rules that belong to the specified receipt rule set.
     */

    public java.util.List<ReceiptRule> getRules() {
        if (rules == null) {
            rules = new com.amazonaws.internal.SdkInternalList<ReceiptRule>();
        }
        return rules;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule set.
     * </p>
     * 
     * @param rules
     *        A list of the receipt rules that belong to the specified receipt rule set.
     */

    public void setRules(java.util.Collection<ReceiptRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new com.amazonaws.internal.SdkInternalList<ReceiptRule>(rules);
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A list of the receipt rules that belong to the specified receipt rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReceiptRuleSetResult withRules(ReceiptRule... rules) {
        if (this.rules == null) {
            setRules(new com.amazonaws.internal.SdkInternalList<ReceiptRule>(rules.length));
        }
        for (ReceiptRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule set.
     * </p>
     * 
     * @param rules
     *        A list of the receipt rules that belong to the specified receipt rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReceiptRuleSetResult withRules(java.util.Collection<ReceiptRule> rules) {
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
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

        if (obj instanceof DescribeReceiptRuleSetResult == false)
            return false;
        DescribeReceiptRuleSetResult other = (DescribeReceiptRuleSetResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReceiptRuleSetResult clone() {
        try {
            return (DescribeReceiptRuleSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
