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
 * <p>
 * The output for the <a>ListChangeSets</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListChangeSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangeSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for the
     * specified stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ChangeSetSummary> summaries;
    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional
     * page, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for the
     * specified stack.
     * </p>
     * 
     * @return A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for
     *         the specified stack.
     */

    public java.util.List<ChangeSetSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<ChangeSetSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for the
     * specified stack.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for
     *        the specified stack.
     */

    public void setSummaries(java.util.Collection<ChangeSetSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<ChangeSetSummary>(summaries);
    }

    /**
     * <p>
     * A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for the
     * specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for
     *        the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withSummaries(ChangeSetSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<ChangeSetSummary>(summaries.length));
        }
        for (ChangeSetSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for the
     * specified stack.
     * </p>
     * 
     * @param summaries
     *        A list of <code>ChangeSetSummary</code> structures that provides the ID and status of each change set for
     *        the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withSummaries(java.util.Collection<ChangeSetSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional
     * page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no
     *        additional page, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional
     * page, this value is null.
     * </p>
     * 
     * @return If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no
     *         additional page, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional
     * page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no
     *        additional page, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListChangeSetsResult == false)
            return false;
        ListChangeSetsResult other = (ListChangeSetsResult) obj;
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
    public ListChangeSetsResult clone() {
        try {
            return (ListChangeSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
