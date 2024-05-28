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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListAliases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * </p>
     */
    private java.util.List<Alias> aliases;
    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * </p>
     * 
     * @return The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     */

    public java.util.List<Alias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * </p>
     * 
     * @param aliases
     *        The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     */

    public void setAliases(java.util.Collection<Alias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<Alias>(aliases);
    }

    /**
     * <p>
     * The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(Alias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<Alias>(aliases.length));
        }
        for (Alias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * </p>
     * 
     * @param aliases
     *        The list of aliases. Each alias describes the <code>KeyArn</code> contained within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withAliases(java.util.Collection<Alias> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or an empty or null value if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or an empty or null value if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or an empty or null value if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesResult withNextToken(String nextToken) {
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
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
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

        if (obj instanceof ListAliasesResult == false)
            return false;
        ListAliasesResult other = (ListAliasesResult) obj;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
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

        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesResult clone() {
        try {
            return (ListAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
