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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListRuleGroupsNamespaces operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleGroupsNamespacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Pagination token to use when requesting the next page in this list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of the selected rule groups namespaces.
     * </p>
     */
    private java.util.List<RuleGroupsNamespaceSummary> ruleGroupsNamespaces;

    /**
     * <p>
     * Pagination token to use when requesting the next page in this list.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to use when requesting the next page in this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to use when requesting the next page in this list.
     * </p>
     * 
     * @return Pagination token to use when requesting the next page in this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to use when requesting the next page in this list.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to use when requesting the next page in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of the selected rule groups namespaces.
     * </p>
     * 
     * @return The list of the selected rule groups namespaces.
     */

    public java.util.List<RuleGroupsNamespaceSummary> getRuleGroupsNamespaces() {
        return ruleGroupsNamespaces;
    }

    /**
     * <p>
     * The list of the selected rule groups namespaces.
     * </p>
     * 
     * @param ruleGroupsNamespaces
     *        The list of the selected rule groups namespaces.
     */

    public void setRuleGroupsNamespaces(java.util.Collection<RuleGroupsNamespaceSummary> ruleGroupsNamespaces) {
        if (ruleGroupsNamespaces == null) {
            this.ruleGroupsNamespaces = null;
            return;
        }

        this.ruleGroupsNamespaces = new java.util.ArrayList<RuleGroupsNamespaceSummary>(ruleGroupsNamespaces);
    }

    /**
     * <p>
     * The list of the selected rule groups namespaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleGroupsNamespaces(java.util.Collection)} or {@link #withRuleGroupsNamespaces(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ruleGroupsNamespaces
     *        The list of the selected rule groups namespaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesResult withRuleGroupsNamespaces(RuleGroupsNamespaceSummary... ruleGroupsNamespaces) {
        if (this.ruleGroupsNamespaces == null) {
            setRuleGroupsNamespaces(new java.util.ArrayList<RuleGroupsNamespaceSummary>(ruleGroupsNamespaces.length));
        }
        for (RuleGroupsNamespaceSummary ele : ruleGroupsNamespaces) {
            this.ruleGroupsNamespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the selected rule groups namespaces.
     * </p>
     * 
     * @param ruleGroupsNamespaces
     *        The list of the selected rule groups namespaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesResult withRuleGroupsNamespaces(java.util.Collection<RuleGroupsNamespaceSummary> ruleGroupsNamespaces) {
        setRuleGroupsNamespaces(ruleGroupsNamespaces);
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
        if (getRuleGroupsNamespaces() != null)
            sb.append("RuleGroupsNamespaces: ").append(getRuleGroupsNamespaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleGroupsNamespacesResult == false)
            return false;
        ListRuleGroupsNamespacesResult other = (ListRuleGroupsNamespacesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRuleGroupsNamespaces() == null ^ this.getRuleGroupsNamespaces() == null)
            return false;
        if (other.getRuleGroupsNamespaces() != null && other.getRuleGroupsNamespaces().equals(this.getRuleGroupsNamespaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupsNamespaces() == null) ? 0 : getRuleGroupsNamespaces().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleGroupsNamespacesResult clone() {
        try {
            return (ListRuleGroupsNamespacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
