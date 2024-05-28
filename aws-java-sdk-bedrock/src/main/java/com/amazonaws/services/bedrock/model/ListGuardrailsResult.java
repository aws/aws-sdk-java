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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListGuardrails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGuardrailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains details about a guardrail.
     * </p>
     */
    private java.util.List<GuardrailSummary> guardrails;
    /**
     * <p>
     * If there are more results than were returned in the response, the response returns a <code>nextToken</code> that
     * you can send in another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects, each of which contains details about a guardrail.
     * </p>
     * 
     * @return A list of objects, each of which contains details about a guardrail.
     */

    public java.util.List<GuardrailSummary> getGuardrails() {
        return guardrails;
    }

    /**
     * <p>
     * A list of objects, each of which contains details about a guardrail.
     * </p>
     * 
     * @param guardrails
     *        A list of objects, each of which contains details about a guardrail.
     */

    public void setGuardrails(java.util.Collection<GuardrailSummary> guardrails) {
        if (guardrails == null) {
            this.guardrails = null;
            return;
        }

        this.guardrails = new java.util.ArrayList<GuardrailSummary>(guardrails);
    }

    /**
     * <p>
     * A list of objects, each of which contains details about a guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGuardrails(java.util.Collection)} or {@link #withGuardrails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param guardrails
     *        A list of objects, each of which contains details about a guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGuardrailsResult withGuardrails(GuardrailSummary... guardrails) {
        if (this.guardrails == null) {
            setGuardrails(new java.util.ArrayList<GuardrailSummary>(guardrails.length));
        }
        for (GuardrailSummary ele : guardrails) {
            this.guardrails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains details about a guardrail.
     * </p>
     * 
     * @param guardrails
     *        A list of objects, each of which contains details about a guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGuardrailsResult withGuardrails(java.util.Collection<GuardrailSummary> guardrails) {
        setGuardrails(guardrails);
        return this;
    }

    /**
     * <p>
     * If there are more results than were returned in the response, the response returns a <code>nextToken</code> that
     * you can send in another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than were returned in the response, the response returns a
     *        <code>nextToken</code> that you can send in another <code>ListGuardrails</code> request to see the next
     *        batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more results than were returned in the response, the response returns a <code>nextToken</code> that
     * you can send in another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     * 
     * @return If there are more results than were returned in the response, the response returns a
     *         <code>nextToken</code> that you can send in another <code>ListGuardrails</code> request to see the next
     *         batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more results than were returned in the response, the response returns a <code>nextToken</code> that
     * you can send in another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than were returned in the response, the response returns a
     *        <code>nextToken</code> that you can send in another <code>ListGuardrails</code> request to see the next
     *        batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGuardrailsResult withNextToken(String nextToken) {
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
        if (getGuardrails() != null)
            sb.append("Guardrails: ").append(getGuardrails()).append(",");
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

        if (obj instanceof ListGuardrailsResult == false)
            return false;
        ListGuardrailsResult other = (ListGuardrailsResult) obj;
        if (other.getGuardrails() == null ^ this.getGuardrails() == null)
            return false;
        if (other.getGuardrails() != null && other.getGuardrails().equals(this.getGuardrails()) == false)
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

        hashCode = prime * hashCode + ((getGuardrails() == null) ? 0 : getGuardrails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGuardrailsResult clone() {
        try {
            return (ListGuardrailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
