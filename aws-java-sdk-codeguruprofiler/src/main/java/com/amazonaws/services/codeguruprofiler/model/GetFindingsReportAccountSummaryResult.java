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
 * The structure representing the GetFindingsReportAccountSummaryResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetFindingsReportAccountSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsReportAccountSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code> request.
     * When the results of a <code>GetFindingsReportAccountSummary</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The return list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all profiling
     * groups in your AWS account.
     * </p>
     */
    private java.util.List<FindingsReportSummary> reportSummaries;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code> request.
     * When the results of a <code>GetFindingsReportAccountSummary</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code>
     *        request. When the results of a <code>GetFindingsReportAccountSummary</code> request exceed
     *        <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code> request.
     * When the results of a <code>GetFindingsReportAccountSummary</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code>
     *         request. When the results of a <code>GetFindingsReportAccountSummary</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code> request.
     * When the results of a <code>GetFindingsReportAccountSummary</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>GetFindingsReportAccountSummary</code>
     *        request. When the results of a <code>GetFindingsReportAccountSummary</code> request exceed
     *        <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The return list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all profiling
     * groups in your AWS account.
     * </p>
     * 
     * @return The return list of <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     *         <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all
     *         profiling groups in your AWS account.
     */

    public java.util.List<FindingsReportSummary> getReportSummaries() {
        return reportSummaries;
    }

    /**
     * <p>
     * The return list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all profiling
     * groups in your AWS account.
     * </p>
     * 
     * @param reportSummaries
     *        The return list of <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     *        <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all
     *        profiling groups in your AWS account.
     */

    public void setReportSummaries(java.util.Collection<FindingsReportSummary> reportSummaries) {
        if (reportSummaries == null) {
            this.reportSummaries = null;
            return;
        }

        this.reportSummaries = new java.util.ArrayList<FindingsReportSummary>(reportSummaries);
    }

    /**
     * <p>
     * The return list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all profiling
     * groups in your AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportSummaries(java.util.Collection)} or {@link #withReportSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reportSummaries
     *        The return list of <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     *        <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all
     *        profiling groups in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryResult withReportSummaries(FindingsReportSummary... reportSummaries) {
        if (this.reportSummaries == null) {
            setReportSummaries(new java.util.ArrayList<FindingsReportSummary>(reportSummaries.length));
        }
        for (FindingsReportSummary ele : reportSummaries) {
            this.reportSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The return list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all profiling
     * groups in your AWS account.
     * </p>
     * 
     * @param reportSummaries
     *        The return list of <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     *        <code>FindingsReportSummary</code> </a> objects taht contain summaries of analysis results for all
     *        profiling groups in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryResult withReportSummaries(java.util.Collection<FindingsReportSummary> reportSummaries) {
        setReportSummaries(reportSummaries);
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
        if (getReportSummaries() != null)
            sb.append("ReportSummaries: ").append(getReportSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsReportAccountSummaryResult == false)
            return false;
        GetFindingsReportAccountSummaryResult other = (GetFindingsReportAccountSummaryResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReportSummaries() == null ^ this.getReportSummaries() == null)
            return false;
        if (other.getReportSummaries() != null && other.getReportSummaries().equals(this.getReportSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReportSummaries() == null) ? 0 : getReportSummaries().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsReportAccountSummaryResult clone() {
        try {
            return (GetFindingsReportAccountSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
