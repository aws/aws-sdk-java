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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListGeneratedTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeneratedTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of summaries of the generated templates.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TemplateSummary> summaries;
    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of summaries of the generated templates.
     * </p>
     * 
     * @return A list of summaries of the generated templates.
     */

    public java.util.List<TemplateSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<TemplateSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * A list of summaries of the generated templates.
     * </p>
     * 
     * @param summaries
     *        A list of summaries of the generated templates.
     */

    public void setSummaries(java.util.Collection<TemplateSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<TemplateSummary>(summaries);
    }

    /**
     * <p>
     * A list of summaries of the generated templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        A list of summaries of the generated templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeneratedTemplatesResult withSummaries(TemplateSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<TemplateSummary>(summaries.length));
        }
        for (TemplateSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summaries of the generated templates.
     * </p>
     * 
     * @param summaries
     *        A list of summaries of the generated templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeneratedTemplatesResult withSummaries(java.util.Collection<TemplateSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for
     *        the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        an empty string.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @return If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for
     *         the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set
     *         to an empty string.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListGeneratedTemplates</code> again and use that value for
     *        the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeneratedTemplatesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListGeneratedTemplatesResult == false)
            return false;
        ListGeneratedTemplatesResult other = (ListGeneratedTemplatesResult) obj;
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
    public ListGeneratedTemplatesResult clone() {
        try {
            return (ListGeneratedTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
