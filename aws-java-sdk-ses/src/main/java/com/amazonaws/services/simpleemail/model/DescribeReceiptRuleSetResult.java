/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * Describe Receipt Rule Set Result
 */
public class DescribeReceiptRuleSetResult implements Serializable, Cloneable {

    /**
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     */
    private ReceiptRuleSetMetadata metadata;

    /**
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule> rules;

    /**
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     *
     * @return The metadata for the receipt rule set, which consists of the rule set
     *         name and the timestamp of when the rule set was created.
     */
    public ReceiptRuleSetMetadata getMetadata() {
        return metadata;
    }
    
    /**
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     *
     * @param metadata The metadata for the receipt rule set, which consists of the rule set
     *         name and the timestamp of when the rule set was created.
     */
    public void setMetadata(ReceiptRuleSetMetadata metadata) {
        this.metadata = metadata;
    }
    
    /**
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata The metadata for the receipt rule set, which consists of the rule set
     *         name and the timestamp of when the rule set was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleSetResult withMetadata(ReceiptRuleSetMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     *
     * @return A list of the receipt rules that belong to the specified receipt rule
     *         set.
     */
    public java.util.List<ReceiptRule> getRules() {
        if (rules == null) {
              rules = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule>();
              rules.setAutoConstruct(true);
        }
        return rules;
    }
    
    /**
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     *
     * @param rules A list of the receipt rules that belong to the specified receipt rule
     *         set.
     */
    public void setRules(java.util.Collection<ReceiptRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule>(rules.size());
        rulesCopy.addAll(rules);
        this.rules = rulesCopy;
    }
    
    /**
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRules(java.util.Collection)} or {@link
     * #withRules(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules A list of the receipt rules that belong to the specified receipt rule
     *         set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleSetResult withRules(ReceiptRule... rules) {
        if (getRules() == null) setRules(new java.util.ArrayList<ReceiptRule>(rules.length));
        for (ReceiptRule value : rules) {
            getRules().add(value);
        }
        return this;
    }
    
    /**
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules A list of the receipt rules that belong to the specified receipt rule
     *         set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleSetResult withRules(java.util.Collection<ReceiptRule> rules) {
        if (rules == null) {
            this.rules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRule>(rules.size());
            rulesCopy.addAll(rules);
            this.rules = rulesCopy;
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
        if (getMetadata() != null) sb.append("Metadata: " + getMetadata() + ",");
        if (getRules() != null) sb.append("Rules: " + getRules() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReceiptRuleSetResult == false) return false;
        DescribeReceiptRuleSetResult other = (DescribeReceiptRuleSetResult)obj;
        
        if (other.getMetadata() == null ^ this.getMetadata() == null) return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false) return false; 
        if (other.getRules() == null ^ this.getRules() == null) return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeReceiptRuleSetResult clone() {
        try {
            return (DescribeReceiptRuleSetResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    