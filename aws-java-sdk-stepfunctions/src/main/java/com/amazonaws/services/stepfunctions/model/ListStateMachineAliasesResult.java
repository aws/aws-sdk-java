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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListStateMachineAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStateMachineAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Aliases for the state machine.
     * </p>
     */
    private java.util.List<StateMachineAliasListItem> stateMachineAliases;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Aliases for the state machine.
     * </p>
     * 
     * @return Aliases for the state machine.
     */

    public java.util.List<StateMachineAliasListItem> getStateMachineAliases() {
        return stateMachineAliases;
    }

    /**
     * <p>
     * Aliases for the state machine.
     * </p>
     * 
     * @param stateMachineAliases
     *        Aliases for the state machine.
     */

    public void setStateMachineAliases(java.util.Collection<StateMachineAliasListItem> stateMachineAliases) {
        if (stateMachineAliases == null) {
            this.stateMachineAliases = null;
            return;
        }

        this.stateMachineAliases = new java.util.ArrayList<StateMachineAliasListItem>(stateMachineAliases);
    }

    /**
     * <p>
     * Aliases for the state machine.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStateMachineAliases(java.util.Collection)} or {@link #withStateMachineAliases(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param stateMachineAliases
     *        Aliases for the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStateMachineAliasesResult withStateMachineAliases(StateMachineAliasListItem... stateMachineAliases) {
        if (this.stateMachineAliases == null) {
            setStateMachineAliases(new java.util.ArrayList<StateMachineAliasListItem>(stateMachineAliases.length));
        }
        for (StateMachineAliasListItem ele : stateMachineAliases) {
            this.stateMachineAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Aliases for the state machine.
     * </p>
     * 
     * @param stateMachineAliases
     *        Aliases for the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStateMachineAliasesResult withStateMachineAliases(java.util.Collection<StateMachineAliasListItem> stateMachineAliases) {
        setStateMachineAliases(stateMachineAliases);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStateMachineAliasesResult withNextToken(String nextToken) {
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
        if (getStateMachineAliases() != null)
            sb.append("StateMachineAliases: ").append(getStateMachineAliases()).append(",");
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

        if (obj instanceof ListStateMachineAliasesResult == false)
            return false;
        ListStateMachineAliasesResult other = (ListStateMachineAliasesResult) obj;
        if (other.getStateMachineAliases() == null ^ this.getStateMachineAliases() == null)
            return false;
        if (other.getStateMachineAliases() != null && other.getStateMachineAliases().equals(this.getStateMachineAliases()) == false)
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

        hashCode = prime * hashCode + ((getStateMachineAliases() == null) ? 0 : getStateMachineAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStateMachineAliasesResult clone() {
        try {
            return (ListStateMachineAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
