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

/**
 * <p>
 * A list of receipt rule sets that exist under your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReceiptRuleSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     * timestamp of when the rule set was created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReceiptRuleSetMetadata> ruleSets;
    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     * successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     * timestamp of when the rule set was created.
     * </p>
     * 
     * @return The metadata for the currently active receipt rule set. The metadata consists of the rule set name and
     *         the timestamp of when the rule set was created.
     */

    public java.util.List<ReceiptRuleSetMetadata> getRuleSets() {
        if (ruleSets == null) {
            ruleSets = new com.amazonaws.internal.SdkInternalList<ReceiptRuleSetMetadata>();
        }
        return ruleSets;
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     * timestamp of when the rule set was created.
     * </p>
     * 
     * @param ruleSets
     *        The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     *        timestamp of when the rule set was created.
     */

    public void setRuleSets(java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        if (ruleSets == null) {
            this.ruleSets = null;
            return;
        }

        this.ruleSets = new com.amazonaws.internal.SdkInternalList<ReceiptRuleSetMetadata>(ruleSets);
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     * timestamp of when the rule set was created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleSets(java.util.Collection)} or {@link #withRuleSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ruleSets
     *        The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     *        timestamp of when the rule set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptRuleSetsResult withRuleSets(ReceiptRuleSetMetadata... ruleSets) {
        if (this.ruleSets == null) {
            setRuleSets(new com.amazonaws.internal.SdkInternalList<ReceiptRuleSetMetadata>(ruleSets.length));
        }
        for (ReceiptRuleSetMetadata ele : ruleSets) {
            this.ruleSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     * timestamp of when the rule set was created.
     * </p>
     * 
     * @param ruleSets
     *        The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the
     *        timestamp of when the rule set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptRuleSetsResult withRuleSets(java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        setRuleSets(ruleSets);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     * successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     *        successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     * successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     * </p>
     * 
     * @return A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     *         successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     * successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional receipt rule sets available to be listed. Pass this token to
     *        successive calls of <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptRuleSetsResult withNextToken(String nextToken) {
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
        if (getRuleSets() != null)
            sb.append("RuleSets: ").append(getRuleSets()).append(",");
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

        if (obj instanceof ListReceiptRuleSetsResult == false)
            return false;
        ListReceiptRuleSetsResult other = (ListReceiptRuleSetsResult) obj;
        if (other.getRuleSets() == null ^ this.getRuleSets() == null)
            return false;
        if (other.getRuleSets() != null && other.getRuleSets().equals(this.getRuleSets()) == false)
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

        hashCode = prime * hashCode + ((getRuleSets() == null) ? 0 : getRuleSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReceiptRuleSetsResult clone() {
        try {
            return (ListReceiptRuleSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
