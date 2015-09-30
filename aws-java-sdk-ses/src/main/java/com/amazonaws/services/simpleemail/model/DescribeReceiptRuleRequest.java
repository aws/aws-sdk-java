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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#describeReceiptRule(DescribeReceiptRuleRequest) DescribeReceiptRule operation}.
 * <p>
 * Returns the details of the specified receipt rule.
 * </p>
 * <p>
 * For information about setting up receipt rules, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#describeReceiptRule(DescribeReceiptRuleRequest)
 */
public class DescribeReceiptRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the receipt rule set to which the receipt rule belongs.
     */
    private String ruleSetName;

    /**
     * The name of the receipt rule.
     */
    private String ruleName;

    /**
     * The name of the receipt rule set to which the receipt rule belongs.
     *
     * @return The name of the receipt rule set to which the receipt rule belongs.
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to which the receipt rule belongs.
     *
     * @param ruleSetName The name of the receipt rule set to which the receipt rule belongs.
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to which the receipt rule belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSetName The name of the receipt rule set to which the receipt rule belongs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * The name of the receipt rule.
     *
     * @return The name of the receipt rule.
     */
    public String getRuleName() {
        return ruleName;
    }
    
    /**
     * The name of the receipt rule.
     *
     * @param ruleName The name of the receipt rule.
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    
    /**
     * The name of the receipt rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleName The name of the receipt rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
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
        if (getRuleName() != null) sb.append("RuleName: " + getRuleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode()); 
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReceiptRuleRequest == false) return false;
        DescribeReceiptRuleRequest other = (DescribeReceiptRuleRequest)obj;
        
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null) return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false) return false; 
        if (other.getRuleName() == null ^ this.getRuleName() == null) return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeReceiptRuleRequest clone() {
        
            return (DescribeReceiptRuleRequest) super.clone();
    }

}
    