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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListDataQualityRulesets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataQualityRulesetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A paginated list of rulesets for the specified list of Glue tables.
     * </p>
     */
    private java.util.List<DataQualityRulesetListDetails> rulesets;
    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A paginated list of rulesets for the specified list of Glue tables.
     * </p>
     * 
     * @return A paginated list of rulesets for the specified list of Glue tables.
     */

    public java.util.List<DataQualityRulesetListDetails> getRulesets() {
        return rulesets;
    }

    /**
     * <p>
     * A paginated list of rulesets for the specified list of Glue tables.
     * </p>
     * 
     * @param rulesets
     *        A paginated list of rulesets for the specified list of Glue tables.
     */

    public void setRulesets(java.util.Collection<DataQualityRulesetListDetails> rulesets) {
        if (rulesets == null) {
            this.rulesets = null;
            return;
        }

        this.rulesets = new java.util.ArrayList<DataQualityRulesetListDetails>(rulesets);
    }

    /**
     * <p>
     * A paginated list of rulesets for the specified list of Glue tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesets(java.util.Collection)} or {@link #withRulesets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rulesets
     *        A paginated list of rulesets for the specified list of Glue tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityRulesetsResult withRulesets(DataQualityRulesetListDetails... rulesets) {
        if (this.rulesets == null) {
            setRulesets(new java.util.ArrayList<DataQualityRulesetListDetails>(rulesets.length));
        }
        for (DataQualityRulesetListDetails ele : rulesets) {
            this.rulesets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A paginated list of rulesets for the specified list of Glue tables.
     * </p>
     * 
     * @param rulesets
     *        A paginated list of rulesets for the specified list of Glue tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityRulesetsResult withRulesets(java.util.Collection<DataQualityRulesetListDetails> rulesets) {
        setRulesets(rulesets);
        return this;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @return A pagination token, if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityRulesetsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListDataQualityRulesetsResult == false)
            return false;
        ListDataQualityRulesetsResult other = (ListDataQualityRulesetsResult) obj;
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
    public ListDataQualityRulesetsResult clone() {
        try {
            return (ListDataQualityRulesetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
