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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more
 * information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateReceiptRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReceiptRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     */
    private ReceiptRule rule;

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set that the receipt rule belongs to.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     * 
     * @return The name of the receipt rule set that the receipt rule belongs to.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set that the receipt rule belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReceiptRuleRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the updated receipt rule information.
     */

    public void setRule(ReceiptRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     * 
     * @return A data structure that contains the updated receipt rule information.
     */

    public ReceiptRule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the updated receipt rule information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReceiptRuleRequest withRule(ReceiptRule rule) {
        setRule(rule);
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
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
        if (getRule() != null)
            sb.append("Rule: ").append(getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReceiptRuleRequest == false)
            return false;
        UpdateReceiptRuleRequest other = (UpdateReceiptRuleRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReceiptRuleRequest clone() {
        return (UpdateReceiptRuleRequest) super.clone();
    }

}
