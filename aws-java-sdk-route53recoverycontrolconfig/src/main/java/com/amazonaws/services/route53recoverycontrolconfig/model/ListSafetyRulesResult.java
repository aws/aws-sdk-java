/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListSafetyRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSafetyRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of safety rules in a control panel.
     * </p>
     */
    private java.util.List<Rule> safetyRules;

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSafetyRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of safety rules in a control panel.
     * </p>
     * 
     * @return The list of safety rules in a control panel.
     */

    public java.util.List<Rule> getSafetyRules() {
        return safetyRules;
    }

    /**
     * <p>
     * The list of safety rules in a control panel.
     * </p>
     * 
     * @param safetyRules
     *        The list of safety rules in a control panel.
     */

    public void setSafetyRules(java.util.Collection<Rule> safetyRules) {
        if (safetyRules == null) {
            this.safetyRules = null;
            return;
        }

        this.safetyRules = new java.util.ArrayList<Rule>(safetyRules);
    }

    /**
     * <p>
     * The list of safety rules in a control panel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSafetyRules(java.util.Collection)} or {@link #withSafetyRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param safetyRules
     *        The list of safety rules in a control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSafetyRulesResult withSafetyRules(Rule... safetyRules) {
        if (this.safetyRules == null) {
            setSafetyRules(new java.util.ArrayList<Rule>(safetyRules.length));
        }
        for (Rule ele : safetyRules) {
            this.safetyRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of safety rules in a control panel.
     * </p>
     * 
     * @param safetyRules
     *        The list of safety rules in a control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSafetyRulesResult withSafetyRules(java.util.Collection<Rule> safetyRules) {
        setSafetyRules(safetyRules);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSafetyRules() != null)
            sb.append("SafetyRules: ").append(getSafetyRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSafetyRulesResult == false)
            return false;
        ListSafetyRulesResult other = (ListSafetyRulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSafetyRules() == null ^ this.getSafetyRules() == null)
            return false;
        if (other.getSafetyRules() != null && other.getSafetyRules().equals(this.getSafetyRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSafetyRules() == null) ? 0 : getSafetyRules().hashCode());
        return hashCode;
    }

    @Override
    public ListSafetyRulesResult clone() {
        try {
            return (ListSafetyRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
