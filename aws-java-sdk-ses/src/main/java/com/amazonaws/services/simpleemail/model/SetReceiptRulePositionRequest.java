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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setReceiptRulePosition(SetReceiptRulePositionRequest) SetReceiptRulePosition operation}.
 * <p>
 * Sets the position of the specified receipt rule in the receipt rule
 * set.
 * </p>
 * <p>
 * For information about managing receipt rules, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setReceiptRulePosition(SetReceiptRulePositionRequest)
 */
public class SetReceiptRulePositionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the receipt rule set that contains the receipt rule to
     * reposition.
     */
    private String ruleSetName;

    /**
     * The name of the receipt rule to reposition.
     */
    private String ruleName;

    /**
     * The name of the receipt rule after which to place the specified
     * receipt rule.
     */
    private String after;

    /**
     * The name of the receipt rule set that contains the receipt rule to
     * reposition.
     *
     * @return The name of the receipt rule set that contains the receipt rule to
     *         reposition.
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    
    /**
     * The name of the receipt rule set that contains the receipt rule to
     * reposition.
     *
     * @param ruleSetName The name of the receipt rule set that contains the receipt rule to
     *         reposition.
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    
    /**
     * The name of the receipt rule set that contains the receipt rule to
     * reposition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSetName The name of the receipt rule set that contains the receipt rule to
     *         reposition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetReceiptRulePositionRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * The name of the receipt rule to reposition.
     *
     * @return The name of the receipt rule to reposition.
     */
    public String getRuleName() {
        return ruleName;
    }
    
    /**
     * The name of the receipt rule to reposition.
     *
     * @param ruleName The name of the receipt rule to reposition.
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    
    /**
     * The name of the receipt rule to reposition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleName The name of the receipt rule to reposition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetReceiptRulePositionRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * The name of the receipt rule after which to place the specified
     * receipt rule.
     *
     * @return The name of the receipt rule after which to place the specified
     *         receipt rule.
     */
    public String getAfter() {
        return after;
    }
    
    /**
     * The name of the receipt rule after which to place the specified
     * receipt rule.
     *
     * @param after The name of the receipt rule after which to place the specified
     *         receipt rule.
     */
    public void setAfter(String after) {
        this.after = after;
    }
    
    /**
     * The name of the receipt rule after which to place the specified
     * receipt rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param after The name of the receipt rule after which to place the specified
     *         receipt rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetReceiptRulePositionRequest withAfter(String after) {
        this.after = after;
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
        if (getRuleName() != null) sb.append("RuleName: " + getRuleName() + ",");
        if (getAfter() != null) sb.append("After: " + getAfter() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode()); 
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getAfter() == null) ? 0 : getAfter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetReceiptRulePositionRequest == false) return false;
        SetReceiptRulePositionRequest other = (SetReceiptRulePositionRequest)obj;
        
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null) return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false) return false; 
        if (other.getRuleName() == null ^ this.getRuleName() == null) return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false) return false; 
        if (other.getAfter() == null ^ this.getAfter() == null) return false;
        if (other.getAfter() != null && other.getAfter().equals(this.getAfter()) == false) return false; 
        return true;
    }
    
    @Override
    public SetReceiptRulePositionRequest clone() {
        
            return (SetReceiptRulePositionRequest) super.clone();
    }

}
    