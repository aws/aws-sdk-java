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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackSetSummary> summaries;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListStackInstances</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * </p>
     * 
     * @return A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     */

    public java.util.List<StackSetSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<StackSetSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     */

    public void setSummaries(java.util.Collection<StackSetSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<StackSetSummary>(summaries);
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetsResult withSummaries(StackSetSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<StackSetSummary>(summaries.length));
        }
        for (StackSetSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * </p>
     * 
     * @param summaries
     *        A list of <code>StackSetSummary</code> structures that contain information about the user's stack sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetsResult withSummaries(java.util.Collection<StackSetSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListStackInstances</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListStackInstances</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListStackInstances</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListStackInstances</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If the request returns all results,
     *         <code>NextToken</code> is set to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListStackInstances</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListStackInstances</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetsResult withNextToken(String nextToken) {
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
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

        if (obj instanceof ListStackSetsResult == false)
            return false;
        ListStackSetsResult other = (ListStackSetsResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStackSetsResult clone() {
        try {
            return (ListStackSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
