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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListQuickResponses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuickResponsesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Summary information about the quick responses.
     * </p>
     */
    private java.util.List<QuickResponseSummary> quickResponseSummaries;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuickResponsesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Summary information about the quick responses.
     * </p>
     * 
     * @return Summary information about the quick responses.
     */

    public java.util.List<QuickResponseSummary> getQuickResponseSummaries() {
        return quickResponseSummaries;
    }

    /**
     * <p>
     * Summary information about the quick responses.
     * </p>
     * 
     * @param quickResponseSummaries
     *        Summary information about the quick responses.
     */

    public void setQuickResponseSummaries(java.util.Collection<QuickResponseSummary> quickResponseSummaries) {
        if (quickResponseSummaries == null) {
            this.quickResponseSummaries = null;
            return;
        }

        this.quickResponseSummaries = new java.util.ArrayList<QuickResponseSummary>(quickResponseSummaries);
    }

    /**
     * <p>
     * Summary information about the quick responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuickResponseSummaries(java.util.Collection)} or
     * {@link #withQuickResponseSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param quickResponseSummaries
     *        Summary information about the quick responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuickResponsesResult withQuickResponseSummaries(QuickResponseSummary... quickResponseSummaries) {
        if (this.quickResponseSummaries == null) {
            setQuickResponseSummaries(new java.util.ArrayList<QuickResponseSummary>(quickResponseSummaries.length));
        }
        for (QuickResponseSummary ele : quickResponseSummaries) {
            this.quickResponseSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the quick responses.
     * </p>
     * 
     * @param quickResponseSummaries
     *        Summary information about the quick responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuickResponsesResult withQuickResponseSummaries(java.util.Collection<QuickResponseSummary> quickResponseSummaries) {
        setQuickResponseSummaries(quickResponseSummaries);
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
        if (getQuickResponseSummaries() != null)
            sb.append("QuickResponseSummaries: ").append(getQuickResponseSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQuickResponsesResult == false)
            return false;
        ListQuickResponsesResult other = (ListQuickResponsesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQuickResponseSummaries() == null ^ this.getQuickResponseSummaries() == null)
            return false;
        if (other.getQuickResponseSummaries() != null && other.getQuickResponseSummaries().equals(this.getQuickResponseSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQuickResponseSummaries() == null) ? 0 : getQuickResponseSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListQuickResponsesResult clone() {
        try {
            return (ListQuickResponsesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
