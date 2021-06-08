/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the ListFindingsReportsResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListFindingsReports"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingsReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of analysis results summaries.
     * </p>
     */
    private java.util.List<FindingsReportSummary> findingsReportSummaries;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     * results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of analysis results summaries.
     * </p>
     * 
     * @return The list of analysis results summaries.
     */

    public java.util.List<FindingsReportSummary> getFindingsReportSummaries() {
        return findingsReportSummaries;
    }

    /**
     * <p>
     * The list of analysis results summaries.
     * </p>
     * 
     * @param findingsReportSummaries
     *        The list of analysis results summaries.
     */

    public void setFindingsReportSummaries(java.util.Collection<FindingsReportSummary> findingsReportSummaries) {
        if (findingsReportSummaries == null) {
            this.findingsReportSummaries = null;
            return;
        }

        this.findingsReportSummaries = new java.util.ArrayList<FindingsReportSummary>(findingsReportSummaries);
    }

    /**
     * <p>
     * The list of analysis results summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingsReportSummaries(java.util.Collection)} or
     * {@link #withFindingsReportSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param findingsReportSummaries
     *        The list of analysis results summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsReportsResult withFindingsReportSummaries(FindingsReportSummary... findingsReportSummaries) {
        if (this.findingsReportSummaries == null) {
            setFindingsReportSummaries(new java.util.ArrayList<FindingsReportSummary>(findingsReportSummaries.length));
        }
        for (FindingsReportSummary ele : findingsReportSummaries) {
            this.findingsReportSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of analysis results summaries.
     * </p>
     * 
     * @param findingsReportSummaries
     *        The list of analysis results summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsReportsResult withFindingsReportSummaries(java.util.Collection<FindingsReportSummary> findingsReportSummaries) {
        setFindingsReportSummaries(findingsReportSummaries);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     * results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     *        results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     * results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When
     *         the results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can
     *         be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     * results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListFindingsReports</code> request. When the
     *        results of a <code>ListFindingsReports</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsReportsResult withNextToken(String nextToken) {
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
        if (getFindingsReportSummaries() != null)
            sb.append("FindingsReportSummaries: ").append(getFindingsReportSummaries()).append(",");
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

        if (obj instanceof ListFindingsReportsResult == false)
            return false;
        ListFindingsReportsResult other = (ListFindingsReportsResult) obj;
        if (other.getFindingsReportSummaries() == null ^ this.getFindingsReportSummaries() == null)
            return false;
        if (other.getFindingsReportSummaries() != null && other.getFindingsReportSummaries().equals(this.getFindingsReportSummaries()) == false)
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

        hashCode = prime * hashCode + ((getFindingsReportSummaries() == null) ? 0 : getFindingsReportSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingsReportsResult clone() {
        try {
            return (ListFindingsReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
