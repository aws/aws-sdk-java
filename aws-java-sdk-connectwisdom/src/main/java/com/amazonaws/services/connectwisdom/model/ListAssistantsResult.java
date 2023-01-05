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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssistantsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the assistants.
     * </p>
     */
    private java.util.List<AssistantSummary> assistantSummaries;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the assistants.
     * </p>
     * 
     * @return Information about the assistants.
     */

    public java.util.List<AssistantSummary> getAssistantSummaries() {
        return assistantSummaries;
    }

    /**
     * <p>
     * Information about the assistants.
     * </p>
     * 
     * @param assistantSummaries
     *        Information about the assistants.
     */

    public void setAssistantSummaries(java.util.Collection<AssistantSummary> assistantSummaries) {
        if (assistantSummaries == null) {
            this.assistantSummaries = null;
            return;
        }

        this.assistantSummaries = new java.util.ArrayList<AssistantSummary>(assistantSummaries);
    }

    /**
     * <p>
     * Information about the assistants.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssistantSummaries(java.util.Collection)} or {@link #withAssistantSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assistantSummaries
     *        Information about the assistants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssistantsResult withAssistantSummaries(AssistantSummary... assistantSummaries) {
        if (this.assistantSummaries == null) {
            setAssistantSummaries(new java.util.ArrayList<AssistantSummary>(assistantSummaries.length));
        }
        for (AssistantSummary ele : assistantSummaries) {
            this.assistantSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the assistants.
     * </p>
     * 
     * @param assistantSummaries
     *        Information about the assistants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssistantsResult withAssistantSummaries(java.util.Collection<AssistantSummary> assistantSummaries) {
        setAssistantSummaries(assistantSummaries);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssistantsResult withNextToken(String nextToken) {
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
        if (getAssistantSummaries() != null)
            sb.append("AssistantSummaries: ").append(getAssistantSummaries()).append(",");
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

        if (obj instanceof ListAssistantsResult == false)
            return false;
        ListAssistantsResult other = (ListAssistantsResult) obj;
        if (other.getAssistantSummaries() == null ^ this.getAssistantSummaries() == null)
            return false;
        if (other.getAssistantSummaries() != null && other.getAssistantSummaries().equals(this.getAssistantSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssistantSummaries() == null) ? 0 : getAssistantSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssistantsResult clone() {
        try {
            return (ListAssistantsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
