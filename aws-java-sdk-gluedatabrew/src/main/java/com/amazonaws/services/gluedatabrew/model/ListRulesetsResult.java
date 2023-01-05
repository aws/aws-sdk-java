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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRulesets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * </p>
     */
    private java.util.List<RulesetItem> rulesets;
    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * </p>
     * 
     * @return A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     */

    public java.util.List<RulesetItem> getRulesets() {
        return rulesets;
    }

    /**
     * <p>
     * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * </p>
     * 
     * @param rulesets
     *        A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     */

    public void setRulesets(java.util.Collection<RulesetItem> rulesets) {
        if (rulesets == null) {
            this.rulesets = null;
            return;
        }

        this.rulesets = new java.util.ArrayList<RulesetItem>(rulesets);
    }

    /**
     * <p>
     * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesets(java.util.Collection)} or {@link #withRulesets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rulesets
     *        A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesetsResult withRulesets(RulesetItem... rulesets) {
        if (this.rulesets == null) {
            setRulesets(new java.util.ArrayList<RulesetItem>(rulesets.length));
        }
        for (RulesetItem ele : rulesets) {
            this.rulesets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * </p>
     * 
     * @param rulesets
     *        A list of RulesetItem. RulesetItem contains meta data of a ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesetsResult withRulesets(java.util.Collection<RulesetItem> rulesets) {
        setRulesets(rulesets);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesetsResult withNextToken(String nextToken) {
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
        if (getRulesets() != null)
            sb.append("Rulesets: ").append(getRulesets()).append(",");
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

        if (obj instanceof ListRulesetsResult == false)
            return false;
        ListRulesetsResult other = (ListRulesetsResult) obj;
        if (other.getRulesets() == null ^ this.getRulesets() == null)
            return false;
        if (other.getRulesets() != null && other.getRulesets().equals(this.getRulesets()) == false)
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

        hashCode = prime * hashCode + ((getRulesets() == null) ? 0 : getRulesets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesetsResult clone() {
        try {
            return (ListRulesetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
