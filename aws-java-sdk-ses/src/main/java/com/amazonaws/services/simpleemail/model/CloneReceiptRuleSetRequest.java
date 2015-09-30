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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#cloneReceiptRuleSet(CloneReceiptRuleSetRequest) CloneReceiptRuleSet operation}.
 * <p>
 * Creates a receipt rule set by cloning an existing one. All receipt
 * rules and configurations are copied to the new receipt rule set and
 * are completely independent of the source rule set.
 * </p>
 * <p>
 * For information about setting up rule sets, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#cloneReceiptRuleSet(CloneReceiptRuleSetRequest)
 */
public class CloneReceiptRuleSetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the rule set to create. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    private String ruleSetName;

    /**
     * The name of the rule set to clone.
     */
    private String originalRuleSetName;

    /**
     * The name of the rule set to create. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @return The name of the rule set to create. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    
    /**
     * The name of the rule set to create. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @param ruleSetName The name of the rule set to create. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    
    /**
     * The name of the rule set to create. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleSetName The name of the rule set to create. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloneReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * The name of the rule set to clone.
     *
     * @return The name of the rule set to clone.
     */
    public String getOriginalRuleSetName() {
        return originalRuleSetName;
    }
    
    /**
     * The name of the rule set to clone.
     *
     * @param originalRuleSetName The name of the rule set to clone.
     */
    public void setOriginalRuleSetName(String originalRuleSetName) {
        this.originalRuleSetName = originalRuleSetName;
    }
    
    /**
     * The name of the rule set to clone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param originalRuleSetName The name of the rule set to clone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloneReceiptRuleSetRequest withOriginalRuleSetName(String originalRuleSetName) {
        this.originalRuleSetName = originalRuleSetName;
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
        if (getOriginalRuleSetName() != null) sb.append("OriginalRuleSetName: " + getOriginalRuleSetName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode()); 
        hashCode = prime * hashCode + ((getOriginalRuleSetName() == null) ? 0 : getOriginalRuleSetName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloneReceiptRuleSetRequest == false) return false;
        CloneReceiptRuleSetRequest other = (CloneReceiptRuleSetRequest)obj;
        
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null) return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false) return false; 
        if (other.getOriginalRuleSetName() == null ^ this.getOriginalRuleSetName() == null) return false;
        if (other.getOriginalRuleSetName() != null && other.getOriginalRuleSetName().equals(this.getOriginalRuleSetName()) == false) return false; 
        return true;
    }
    
    @Override
    public CloneReceiptRuleSetRequest clone() {
        
            return (CloneReceiptRuleSetRequest) super.clone();
    }

}
    