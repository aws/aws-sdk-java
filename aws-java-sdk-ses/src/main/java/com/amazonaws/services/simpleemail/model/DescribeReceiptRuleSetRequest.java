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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#describeReceiptRuleSet(DescribeReceiptRuleSetRequest) DescribeReceiptRuleSet operation}.
 * <p>
 * Returns the details of the specified receipt rule set.
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
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#describeReceiptRuleSet(DescribeReceiptRuleSetRequest)
 */
public class DescribeReceiptRuleSetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the receipt rule set to describe.
     */
    private String ruleSetName;

    /**
     * The name of the receipt rule set to describe.
     *
     * @return The name of the receipt rule set to describe.
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to describe.
     *
     * @param ruleSetName The name of the receipt rule set to describe.
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    
    /**
     * The name of the receipt rule set to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSetName The name of the receipt rule set to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
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
        if (getRuleSetName() != null) sb.append("RuleSetName: " + getRuleSetName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReceiptRuleSetRequest == false) return false;
        DescribeReceiptRuleSetRequest other = (DescribeReceiptRuleSetRequest)obj;
        
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null) return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeReceiptRuleSetRequest clone() {
        
            return (DescribeReceiptRuleSetRequest) super.clone();
    }

}
    