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
 * Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive
 * email with Amazon SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReorderReceiptRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReorderReceiptRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ruleNames;

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to reorder.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     * 
     * @return The name of the receipt rule set to reorder.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to reorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReorderReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * </p>
     * 
     * @return A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     */

    public java.util.List<String> getRuleNames() {
        if (ruleNames == null) {
            ruleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ruleNames;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * </p>
     * 
     * @param ruleNames
     *        A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     */

    public void setRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
            return;
        }

        this.ruleNames = new com.amazonaws.internal.SdkInternalList<String>(ruleNames);
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleNames(java.util.Collection)} or {@link #withRuleNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleNames
     *        A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReorderReceiptRuleSetRequest withRuleNames(String... ruleNames) {
        if (this.ruleNames == null) {
            setRuleNames(new com.amazonaws.internal.SdkInternalList<String>(ruleNames.length));
        }
        for (String ele : ruleNames) {
            this.ruleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * </p>
     * 
     * @param ruleNames
     *        A list of the specified receipt rule set's receipt rules in the order that you want to put them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReorderReceiptRuleSetRequest withRuleNames(java.util.Collection<String> ruleNames) {
        setRuleNames(ruleNames);
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
        if (getRuleNames() != null)
            sb.append("RuleNames: ").append(getRuleNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReorderReceiptRuleSetRequest == false)
            return false;
        ReorderReceiptRuleSetRequest other = (ReorderReceiptRuleSetRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRuleNames() == null ^ this.getRuleNames() == null)
            return false;
        if (other.getRuleNames() != null && other.getRuleNames().equals(this.getRuleNames()) == false)
            return false;
        return true;
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
    public ReorderReceiptRuleSetRequest clone() {
        return (ReorderReceiptRuleSetRequest) super.clone();
    }

}
