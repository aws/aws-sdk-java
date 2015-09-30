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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#reorderReceiptRuleSet(ReorderReceiptRuleSetRequest) ReorderReceiptRuleSet operation}.
 * <p>
 * Reorders the receipt rules within a receipt rule set.
 * </p>
 * <p>
 * <b>NOTE:</b>All of the rules in the rule set must be represented in
 * this request. That is, this API will return an error if the reorder
 * request doesn???t explicitly position all of the rules.
 * </p>
 * <p>
 * For information about managing receipt rule sets, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#reorderReceiptRuleSet(ReorderReceiptRuleSetRequest)
 */
public class ReorderReceiptRuleSetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the receipt rule set to reorder.
     */
    private String ruleSetName;

    /**
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ruleNames;

    /**
     * The name of the receipt rule set to reorder.
     *
     * @return The name of the receipt rule set to reorder.
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to reorder.
     *
     * @param ruleSetName The name of the receipt rule set to reorder.
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to reorder.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSetName The name of the receipt rule set to reorder.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReorderReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     *
     * @return A list of the specified receipt rule set's receipt rules in the order
     *         that you want to put them.
     */
    public java.util.List<String> getRuleNames() {
        if (ruleNames == null) {
              ruleNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ruleNames.setAutoConstruct(true);
        }
        return ruleNames;
    }
    
    /**
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     *
     * @param ruleNames A list of the specified receipt rule set's receipt rules in the order
     *         that you want to put them.
     */
    public void setRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ruleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ruleNames.size());
        ruleNamesCopy.addAll(ruleNames);
        this.ruleNames = ruleNamesCopy;
    }
    
    /**
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRuleNames(java.util.Collection)} or {@link
     * #withRuleNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNames A list of the specified receipt rule set's receipt rules in the order
     *         that you want to put them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReorderReceiptRuleSetRequest withRuleNames(String... ruleNames) {
        if (getRuleNames() == null) setRuleNames(new java.util.ArrayList<String>(ruleNames.length));
        for (String value : ruleNames) {
            getRuleNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNames A list of the specified receipt rule set's receipt rules in the order
     *         that you want to put them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReorderReceiptRuleSetRequest withRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ruleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ruleNames.size());
            ruleNamesCopy.addAll(ruleNames);
            this.ruleNames = ruleNamesCopy;
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
        if (getRuleSetName() != null) sb.append("RuleSetName: " + getRuleSetName() + ",");
        if (getRuleNames() != null) sb.append("RuleNames: " + getRuleNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode()); 
        hashCode = prime * hashCode + ((getRuleNames() == null) ? 0 : getRuleNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReorderReceiptRuleSetRequest == false) return false;
        ReorderReceiptRuleSetRequest other = (ReorderReceiptRuleSetRequest)obj;
        
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null) return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false) return false; 
        if (other.getRuleNames() == null ^ this.getRuleNames() == null) return false;
        if (other.getRuleNames() != null && other.getRuleNames().equals(this.getRuleNames()) == false) return false; 
        return true;
    }
    
    @Override
    public ReorderReceiptRuleSetRequest clone() {
        
            return (ReorderReceiptRuleSetRequest) super.clone();
    }

}
    