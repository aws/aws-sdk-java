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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the GetFindingsReportAccountSummaryRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetFindingsReportAccountSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsReportAccountSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     * <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>, analysis
     * data is returned from smaller time windows (for example, one hour).
     * </p>
     */
    private Boolean dailyReportsOnly;
    /**
     * <p>
     * The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated output. When
     * this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>GetFindingsReportAccountSummary</code> request with the returned
     * <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>GetFindingsReportAccountSummary</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     * <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>, analysis
     * data is returned from smaller time windows (for example, one hour).
     * </p>
     * 
     * @param dailyReportsOnly
     *        A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     *        <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>,
     *        analysis data is returned from smaller time windows (for example, one hour).
     */

    public void setDailyReportsOnly(Boolean dailyReportsOnly) {
        this.dailyReportsOnly = dailyReportsOnly;
    }

    /**
     * <p>
     * A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     * <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>, analysis
     * data is returned from smaller time windows (for example, one hour).
     * </p>
     * 
     * @return A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     *         <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>,
     *         analysis data is returned from smaller time windows (for example, one hour).
     */

    public Boolean getDailyReportsOnly() {
        return this.dailyReportsOnly;
    }

    /**
     * <p>
     * A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     * <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>, analysis
     * data is returned from smaller time windows (for example, one hour).
     * </p>
     * 
     * @param dailyReportsOnly
     *        A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     *        <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>,
     *        analysis data is returned from smaller time windows (for example, one hour).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryRequest withDailyReportsOnly(Boolean dailyReportsOnly) {
        setDailyReportsOnly(dailyReportsOnly);
        return this;
    }

    /**
     * <p>
     * A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     * <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>, analysis
     * data is returned from smaller time windows (for example, one hour).
     * </p>
     * 
     * @return A <code>Boolean</code> value indicating whether to only return reports from daily profiles. If set to
     *         <code>True</code>, only analysis data from daily profiles is returned. If set to <code>False</code>,
     *         analysis data is returned from smaller time windows (for example, one hour).
     */

    public Boolean isDailyReportsOnly() {
        return this.dailyReportsOnly;
    }

    /**
     * <p>
     * The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated output. When
     * this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>GetFindingsReportAccountSummary</code> request with the returned
     * <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated
     *        output. When this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>GetFindingsReportAccountSummary</code> request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated output. When
     * this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>GetFindingsReportAccountSummary</code> request with the returned
     * <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated
     *         output. When this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>GetFindingsReportAccountSummary</code> request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated output. When
     * this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns <code>maxResults</code> results
     * in a single page along with a <code>nextToken</code> response element. The remaining results of the initial
     * request can be seen by sending another <code>GetFindingsReportAccountSummary</code> request with the returned
     * <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code> GetFindingsReportAccountSummary</code> in paginated
     *        output. When this parameter is used, <code>GetFindingsReportAccountSummary</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>GetFindingsReportAccountSummary</code> request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>GetFindingsReportAccountSummary</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>GetFindingsReportAccountSummary</code> request where <code>maxResults</code> was used and the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *        that returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>GetFindingsReportAccountSummary</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>GetFindingsReportAccountSummary</code> request where <code>maxResults</code> was used and the
     *         results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *         that returned the <code>nextToken</code> value. </p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>GetFindingsReportAccountSummary</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>GetFindingsReportAccountSummary</code> request where <code>maxResults</code> was used and the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *        that returned the <code>nextToken</code> value. </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportAccountSummaryRequest withNextToken(String nextToken) {
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
        if (getDailyReportsOnly() != null)
            sb.append("DailyReportsOnly: ").append(getDailyReportsOnly()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetFindingsReportAccountSummaryRequest == false)
            return false;
        GetFindingsReportAccountSummaryRequest other = (GetFindingsReportAccountSummaryRequest) obj;
        if (other.getDailyReportsOnly() == null ^ this.getDailyReportsOnly() == null)
            return false;
        if (other.getDailyReportsOnly() != null && other.getDailyReportsOnly().equals(this.getDailyReportsOnly()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getDailyReportsOnly() == null) ? 0 : getDailyReportsOnly().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsReportAccountSummaryRequest clone() {
        return (GetFindingsReportAccountSummaryRequest) super.clone();
    }

}
