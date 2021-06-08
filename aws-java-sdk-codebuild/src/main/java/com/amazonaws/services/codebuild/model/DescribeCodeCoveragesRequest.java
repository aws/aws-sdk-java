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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeCodeCoverages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCodeCoveragesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     */
    private String reportArn;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     * specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies if the results are sorted in ascending or descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * Specifies how the results are sorted. Possible values are:
     * </p>
     * <dl>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * The results are sorted by file path.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE_PERCENTAGE</dt>
     * <dd>
     * <p>
     * The results are sorted by the percentage of lines that are covered.
     * </p>
     * </dd>
     * </dl>
     */
    private String sortBy;
    /**
     * <p>
     * The minimum line coverage percentage to report.
     * </p>
     */
    private Double minLineCoveragePercentage;
    /**
     * <p>
     * The maximum line coverage percentage to report.
     * </p>
     */
    private Double maxLineCoveragePercentage;

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report for which test cases are returned.
     */

    public void setReportArn(String reportArn) {
        this.reportArn = reportArn;
    }

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @return The ARN of the report for which test cases are returned.
     */

    public String getReportArn() {
        return this.reportArn;
    }

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report for which test cases are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesRequest withReportArn(String reportArn) {
        setReportArn(reportArn);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     * specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     *        specifies the next item to return. To return the beginning of the list, exclude this parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     * specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>.
     *         This specifies the next item to return. To return the beginning of the list, exclude this parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     * specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous call to <code>DescribeCodeCoverages</code>. This
     *        specifies the next item to return. To return the beginning of the list, exclude this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies if the results are sorted in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Specifies if the results are sorted in ascending or descending order.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies if the results are sorted in ascending or descending order.
     * </p>
     * 
     * @return Specifies if the results are sorted in ascending or descending order.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Specifies if the results are sorted in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Specifies if the results are sorted in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public DescribeCodeCoveragesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Specifies if the results are sorted in ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Specifies if the results are sorted in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public DescribeCodeCoveragesRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how the results are sorted. Possible values are:
     * </p>
     * <dl>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * The results are sorted by file path.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE_PERCENTAGE</dt>
     * <dd>
     * <p>
     * The results are sorted by the percentage of lines that are covered.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param sortBy
     *        Specifies how the results are sorted. Possible values are:</p>
     *        <dl>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by file path.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE_PERCENTAGE</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by the percentage of lines that are covered.
     *        </p>
     *        </dd>
     * @see ReportCodeCoverageSortByType
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies how the results are sorted. Possible values are:
     * </p>
     * <dl>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * The results are sorted by file path.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE_PERCENTAGE</dt>
     * <dd>
     * <p>
     * The results are sorted by the percentage of lines that are covered.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies how the results are sorted. Possible values are:</p>
     *         <dl>
     *         <dt>FILE_PATH</dt>
     *         <dd>
     *         <p>
     *         The results are sorted by file path.
     *         </p>
     *         </dd>
     *         <dt>LINE_COVERAGE_PERCENTAGE</dt>
     *         <dd>
     *         <p>
     *         The results are sorted by the percentage of lines that are covered.
     *         </p>
     *         </dd>
     * @see ReportCodeCoverageSortByType
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies how the results are sorted. Possible values are:
     * </p>
     * <dl>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * The results are sorted by file path.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE_PERCENTAGE</dt>
     * <dd>
     * <p>
     * The results are sorted by the percentage of lines that are covered.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param sortBy
     *        Specifies how the results are sorted. Possible values are:</p>
     *        <dl>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by file path.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE_PERCENTAGE</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by the percentage of lines that are covered.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportCodeCoverageSortByType
     */

    public DescribeCodeCoveragesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Specifies how the results are sorted. Possible values are:
     * </p>
     * <dl>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * The results are sorted by file path.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE_PERCENTAGE</dt>
     * <dd>
     * <p>
     * The results are sorted by the percentage of lines that are covered.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param sortBy
     *        Specifies how the results are sorted. Possible values are:</p>
     *        <dl>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by file path.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE_PERCENTAGE</dt>
     *        <dd>
     *        <p>
     *        The results are sorted by the percentage of lines that are covered.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportCodeCoverageSortByType
     */

    public DescribeCodeCoveragesRequest withSortBy(ReportCodeCoverageSortByType sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The minimum line coverage percentage to report.
     * </p>
     * 
     * @param minLineCoveragePercentage
     *        The minimum line coverage percentage to report.
     */

    public void setMinLineCoveragePercentage(Double minLineCoveragePercentage) {
        this.minLineCoveragePercentage = minLineCoveragePercentage;
    }

    /**
     * <p>
     * The minimum line coverage percentage to report.
     * </p>
     * 
     * @return The minimum line coverage percentage to report.
     */

    public Double getMinLineCoveragePercentage() {
        return this.minLineCoveragePercentage;
    }

    /**
     * <p>
     * The minimum line coverage percentage to report.
     * </p>
     * 
     * @param minLineCoveragePercentage
     *        The minimum line coverage percentage to report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesRequest withMinLineCoveragePercentage(Double minLineCoveragePercentage) {
        setMinLineCoveragePercentage(minLineCoveragePercentage);
        return this;
    }

    /**
     * <p>
     * The maximum line coverage percentage to report.
     * </p>
     * 
     * @param maxLineCoveragePercentage
     *        The maximum line coverage percentage to report.
     */

    public void setMaxLineCoveragePercentage(Double maxLineCoveragePercentage) {
        this.maxLineCoveragePercentage = maxLineCoveragePercentage;
    }

    /**
     * <p>
     * The maximum line coverage percentage to report.
     * </p>
     * 
     * @return The maximum line coverage percentage to report.
     */

    public Double getMaxLineCoveragePercentage() {
        return this.maxLineCoveragePercentage;
    }

    /**
     * <p>
     * The maximum line coverage percentage to report.
     * </p>
     * 
     * @param maxLineCoveragePercentage
     *        The maximum line coverage percentage to report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeCoveragesRequest withMaxLineCoveragePercentage(Double maxLineCoveragePercentage) {
        setMaxLineCoveragePercentage(maxLineCoveragePercentage);
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
        if (getReportArn() != null)
            sb.append("ReportArn: ").append(getReportArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMinLineCoveragePercentage() != null)
            sb.append("MinLineCoveragePercentage: ").append(getMinLineCoveragePercentage()).append(",");
        if (getMaxLineCoveragePercentage() != null)
            sb.append("MaxLineCoveragePercentage: ").append(getMaxLineCoveragePercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCodeCoveragesRequest == false)
            return false;
        DescribeCodeCoveragesRequest other = (DescribeCodeCoveragesRequest) obj;
        if (other.getReportArn() == null ^ this.getReportArn() == null)
            return false;
        if (other.getReportArn() != null && other.getReportArn().equals(this.getReportArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMinLineCoveragePercentage() == null ^ this.getMinLineCoveragePercentage() == null)
            return false;
        if (other.getMinLineCoveragePercentage() != null && other.getMinLineCoveragePercentage().equals(this.getMinLineCoveragePercentage()) == false)
            return false;
        if (other.getMaxLineCoveragePercentage() == null ^ this.getMaxLineCoveragePercentage() == null)
            return false;
        if (other.getMaxLineCoveragePercentage() != null && other.getMaxLineCoveragePercentage().equals(this.getMaxLineCoveragePercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArn() == null) ? 0 : getReportArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMinLineCoveragePercentage() == null) ? 0 : getMinLineCoveragePercentage().hashCode());
        hashCode = prime * hashCode + ((getMaxLineCoveragePercentage() == null) ? 0 : getMaxLineCoveragePercentage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCodeCoveragesRequest clone() {
        return (DescribeCodeCoveragesRequest) super.clone();
    }

}
