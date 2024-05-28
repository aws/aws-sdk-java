/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListAutomationRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAutomationRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     * <code>ENABLED</code> and <code>DISABLED</code>.
     * </p>
     */
    private java.util.List<AutomationRulesMetadata> automationRulesMetadata;
    /**
     * <p>
     * A pagination token for the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     * <code>ENABLED</code> and <code>DISABLED</code>.
     * </p>
     * 
     * @return Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     *         <code>ENABLED</code> and <code>DISABLED</code>.
     */

    public java.util.List<AutomationRulesMetadata> getAutomationRulesMetadata() {
        return automationRulesMetadata;
    }

    /**
     * <p>
     * Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     * <code>ENABLED</code> and <code>DISABLED</code>.
     * </p>
     * 
     * @param automationRulesMetadata
     *        Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     *        <code>ENABLED</code> and <code>DISABLED</code>.
     */

    public void setAutomationRulesMetadata(java.util.Collection<AutomationRulesMetadata> automationRulesMetadata) {
        if (automationRulesMetadata == null) {
            this.automationRulesMetadata = null;
            return;
        }

        this.automationRulesMetadata = new java.util.ArrayList<AutomationRulesMetadata>(automationRulesMetadata);
    }

    /**
     * <p>
     * Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     * <code>ENABLED</code> and <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomationRulesMetadata(java.util.Collection)} or
     * {@link #withAutomationRulesMetadata(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param automationRulesMetadata
     *        Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     *        <code>ENABLED</code> and <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutomationRulesResult withAutomationRulesMetadata(AutomationRulesMetadata... automationRulesMetadata) {
        if (this.automationRulesMetadata == null) {
            setAutomationRulesMetadata(new java.util.ArrayList<AutomationRulesMetadata>(automationRulesMetadata.length));
        }
        for (AutomationRulesMetadata ele : automationRulesMetadata) {
            this.automationRulesMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     * <code>ENABLED</code> and <code>DISABLED</code>.
     * </p>
     * 
     * @param automationRulesMetadata
     *        Metadata for rules in the calling account. The response includes rules with a <code>RuleStatus</code> of
     *        <code>ENABLED</code> and <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutomationRulesResult withAutomationRulesMetadata(java.util.Collection<AutomationRulesMetadata> automationRulesMetadata) {
        setAutomationRulesMetadata(automationRulesMetadata);
        return this;
    }

    /**
     * <p>
     * A pagination token for the response.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the response.
     * </p>
     * 
     * @return A pagination token for the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the response.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutomationRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAutomationRulesMetadata() != null)
            sb.append("AutomationRulesMetadata: ").append(getAutomationRulesMetadata()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutomationRulesResult == false)
            return false;
        ListAutomationRulesResult other = (ListAutomationRulesResult) obj;
        if (other.getAutomationRulesMetadata() == null ^ this.getAutomationRulesMetadata() == null)
            return false;
        if (other.getAutomationRulesMetadata() != null && other.getAutomationRulesMetadata().equals(this.getAutomationRulesMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationRulesMetadata() == null) ? 0 : getAutomationRulesMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAutomationRulesResult clone() {
        try {
            return (ListAutomationRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
