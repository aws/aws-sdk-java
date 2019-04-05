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
 * Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive
 * email with Amazon SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloneReceiptRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloneReceiptRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String ruleSetName;
    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     */
    private String originalRuleSetName;

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ruleSetName
     *        The name of the rule set to create. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the rule set to create. The name must:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start and end with a letter or number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ruleSetName
     *        The name of the rule set to create. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @param originalRuleSetName
     *        The name of the rule set to clone.
     */

    public void setOriginalRuleSetName(String originalRuleSetName) {
        this.originalRuleSetName = originalRuleSetName;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @return The name of the rule set to clone.
     */

    public String getOriginalRuleSetName() {
        return this.originalRuleSetName;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @param originalRuleSetName
     *        The name of the rule set to clone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneReceiptRuleSetRequest withOriginalRuleSetName(String originalRuleSetName) {
        setOriginalRuleSetName(originalRuleSetName);
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
        if (getOriginalRuleSetName() != null)
            sb.append("OriginalRuleSetName: ").append(getOriginalRuleSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloneReceiptRuleSetRequest == false)
            return false;
        CloneReceiptRuleSetRequest other = (CloneReceiptRuleSetRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getOriginalRuleSetName() == null ^ this.getOriginalRuleSetName() == null)
            return false;
        if (other.getOriginalRuleSetName() != null && other.getOriginalRuleSetName().equals(this.getOriginalRuleSetName()) == false)
            return false;
        return true;
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
    public CloneReceiptRuleSetRequest clone() {
        return (CloneReceiptRuleSetRequest) super.clone();
    }

}
