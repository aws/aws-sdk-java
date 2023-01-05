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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistantAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssistantAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about assistant associations.
     * </p>
     */
    private java.util.List<AssistantAssociationSummary> assistantAssociationSummaries;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about assistant associations.
     * </p>
     * 
     * @return Summary information about assistant associations.
     */

    public java.util.List<AssistantAssociationSummary> getAssistantAssociationSummaries() {
        return assistantAssociationSummaries;
    }

    /**
     * <p>
     * Summary information about assistant associations.
     * </p>
     * 
     * @param assistantAssociationSummaries
     *        Summary information about assistant associations.
     */

    public void setAssistantAssociationSummaries(java.util.Collection<AssistantAssociationSummary> assistantAssociationSummaries) {
        if (assistantAssociationSummaries == null) {
            this.assistantAssociationSummaries = null;
            return;
        }

        this.assistantAssociationSummaries = new java.util.ArrayList<AssistantAssociationSummary>(assistantAssociationSummaries);
    }

    /**
     * <p>
     * Summary information about assistant associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssistantAssociationSummaries(java.util.Collection)} or
     * {@link #withAssistantAssociationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assistantAssociationSummaries
     *        Summary information about assistant associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssistantAssociationsResult withAssistantAssociationSummaries(AssistantAssociationSummary... assistantAssociationSummaries) {
        if (this.assistantAssociationSummaries == null) {
            setAssistantAssociationSummaries(new java.util.ArrayList<AssistantAssociationSummary>(assistantAssociationSummaries.length));
        }
        for (AssistantAssociationSummary ele : assistantAssociationSummaries) {
            this.assistantAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about assistant associations.
     * </p>
     * 
     * @param assistantAssociationSummaries
     *        Summary information about assistant associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssistantAssociationsResult withAssistantAssociationSummaries(java.util.Collection<AssistantAssociationSummary> assistantAssociationSummaries) {
        setAssistantAssociationSummaries(assistantAssociationSummaries);
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

    public ListAssistantAssociationsResult withNextToken(String nextToken) {
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
        if (getAssistantAssociationSummaries() != null)
            sb.append("AssistantAssociationSummaries: ").append(getAssistantAssociationSummaries()).append(",");
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

        if (obj instanceof ListAssistantAssociationsResult == false)
            return false;
        ListAssistantAssociationsResult other = (ListAssistantAssociationsResult) obj;
        if (other.getAssistantAssociationSummaries() == null ^ this.getAssistantAssociationSummaries() == null)
            return false;
        if (other.getAssistantAssociationSummaries() != null
                && other.getAssistantAssociationSummaries().equals(this.getAssistantAssociationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssistantAssociationSummaries() == null) ? 0 : getAssistantAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssistantAssociationsResult clone() {
        try {
            return (ListAssistantAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
