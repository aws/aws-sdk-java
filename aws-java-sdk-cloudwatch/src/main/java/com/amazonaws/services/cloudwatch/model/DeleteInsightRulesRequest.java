/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteInsightRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInsightRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of the rule names to delete. If you need to find out the names of your rules, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     * >DescribeInsightRules</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ruleNames;

    /**
     * <p>
     * An array of the rule names to delete. If you need to find out the names of your rules, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     * >DescribeInsightRules</a>.
     * </p>
     * 
     * @return An array of the rule names to delete. If you need to find out the names of your rules, use <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     *         >DescribeInsightRules</a>.
     */

    public java.util.List<String> getRuleNames() {
        if (ruleNames == null) {
            ruleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ruleNames;
    }

    /**
     * <p>
     * An array of the rule names to delete. If you need to find out the names of your rules, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     * >DescribeInsightRules</a>.
     * </p>
     * 
     * @param ruleNames
     *        An array of the rule names to delete. If you need to find out the names of your rules, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     *        >DescribeInsightRules</a>.
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
     * An array of the rule names to delete. If you need to find out the names of your rules, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     * >DescribeInsightRules</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleNames(java.util.Collection)} or {@link #withRuleNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleNames
     *        An array of the rule names to delete. If you need to find out the names of your rules, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     *        >DescribeInsightRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInsightRulesRequest withRuleNames(String... ruleNames) {
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
     * An array of the rule names to delete. If you need to find out the names of your rules, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     * >DescribeInsightRules</a>.
     * </p>
     * 
     * @param ruleNames
     *        An array of the rule names to delete. If you need to find out the names of your rules, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeInsightRules.html"
     *        >DescribeInsightRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInsightRulesRequest withRuleNames(java.util.Collection<String> ruleNames) {
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

        if (obj instanceof DeleteInsightRulesRequest == false)
            return false;
        DeleteInsightRulesRequest other = (DeleteInsightRulesRequest) obj;
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

        hashCode = prime * hashCode + ((getRuleNames() == null) ? 0 : getRuleNames().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInsightRulesRequest clone() {
        return (DeleteInsightRulesRequest) super.clone();
    }

}
