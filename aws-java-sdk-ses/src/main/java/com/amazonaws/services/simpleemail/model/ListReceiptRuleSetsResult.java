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
 * List Receipt Rule Sets Result
 */
public class ListReceiptRuleSetsResult implements Serializable, Cloneable {

    /**
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set
     * was created.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata> ruleSets;

    /**
     * A token indicating that there are additional receipt rule sets
     * available to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     * sets at a time.
     */
    private String nextToken;

    /**
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set
     * was created.
     *
     * @return The metadata for the currently active receipt rule set. The metadata
     *         consists of the rule set name and the timestamp of when the rule set
     *         was created.
     */
    public java.util.List<ReceiptRuleSetMetadata> getRuleSets() {
        if (ruleSets == null) {
              ruleSets = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata>();
              ruleSets.setAutoConstruct(true);
        }
        return ruleSets;
    }
    
    /**
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set
     * was created.
     *
     * @param ruleSets The metadata for the currently active receipt rule set. The metadata
     *         consists of the rule set name and the timestamp of when the rule set
     *         was created.
     */
    public void setRuleSets(java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        if (ruleSets == null) {
            this.ruleSets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata> ruleSetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata>(ruleSets.size());
        ruleSetsCopy.addAll(ruleSets);
        this.ruleSets = ruleSetsCopy;
    }
    
    /**
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set
     * was created.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRuleSets(java.util.Collection)} or {@link
     * #withRuleSets(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSets The metadata for the currently active receipt rule set. The metadata
     *         consists of the rule set name and the timestamp of when the rule set
     *         was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListReceiptRuleSetsResult withRuleSets(ReceiptRuleSetMetadata... ruleSets) {
        if (getRuleSets() == null) setRuleSets(new java.util.ArrayList<ReceiptRuleSetMetadata>(ruleSets.length));
        for (ReceiptRuleSetMetadata value : ruleSets) {
            getRuleSets().add(value);
        }
        return this;
    }
    
    /**
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set
     * was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSets The metadata for the currently active receipt rule set. The metadata
     *         consists of the rule set name and the timestamp of when the rule set
     *         was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListReceiptRuleSetsResult withRuleSets(java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        if (ruleSets == null) {
            this.ruleSets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata> ruleSetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReceiptRuleSetMetadata>(ruleSets.size());
            ruleSetsCopy.addAll(ruleSets);
            this.ruleSets = ruleSetsCopy;
        }

        return this;
    }

    /**
     * A token indicating that there are additional receipt rule sets
     * available to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     * sets at a time.
     *
     * @return A token indicating that there are additional receipt rule sets
     *         available to be listed. Pass this token to successive calls of
     *         <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     *         sets at a time.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A token indicating that there are additional receipt rule sets
     * available to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     * sets at a time.
     *
     * @param nextToken A token indicating that there are additional receipt rule sets
     *         available to be listed. Pass this token to successive calls of
     *         <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     *         sets at a time.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A token indicating that there are additional receipt rule sets
     * available to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     * sets at a time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token indicating that there are additional receipt rule sets
     *         available to be listed. Pass this token to successive calls of
     *         <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule
     *         sets at a time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListReceiptRuleSetsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRuleSets() != null) sb.append("RuleSets: " + getRuleSets() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSets() == null) ? 0 : getRuleSets().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListReceiptRuleSetsResult == false) return false;
        ListReceiptRuleSetsResult other = (ListReceiptRuleSetsResult)obj;
        
        if (other.getRuleSets() == null ^ this.getRuleSets() == null) return false;
        if (other.getRuleSets() != null && other.getRuleSets().equals(this.getRuleSets()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListReceiptRuleSetsResult clone() {
        try {
            return (ListReceiptRuleSetsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    