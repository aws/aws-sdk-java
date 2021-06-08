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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/GetReportGroupTrend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReportGroupTrendRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the report group that contains the reports to analyze.
     * </p>
     */
    private String reportGroupArn;
    /**
     * <p>
     * The number of reports to analyze. This operation always retrieves the most recent reports.
     * </p>
     * <p>
     * If this parameter is omitted, the most recent 100 reports are analyzed.
     * </p>
     */
    private Integer numOfReports;
    /**
     * <p>
     * The test report value to accumulate. This must be one of the following values:
     * </p>
     * <dl>
     * <dt>Test reports:</dt>
     * <dd>
     * <dl>
     * <dt>DURATION</dt>
     * <dd>
     * <p>
     * Accumulate the test run times for the specified reports.
     * </p>
     * </dd>
     * <dt>PASS_RATE</dt>
     * <dd>
     * <p>
     * Accumulate the percentage of tests that passed for the specified test reports.
     * </p>
     * </dd>
     * <dt>TOTAL</dt>
     * <dd>
     * <p>
     * Accumulate the total number of tests for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * <dl>
     * <dt>Code coverage reports:</dt>
     * <dd>
     * <dl>
     * <dt>BRANCH_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the branch coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the branches covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the branches missed values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the line coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the lines covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the lines not covered values for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     */
    private String trendField;

    /**
     * <p>
     * The ARN of the report group that contains the reports to analyze.
     * </p>
     * 
     * @param reportGroupArn
     *        The ARN of the report group that contains the reports to analyze.
     */

    public void setReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group that contains the reports to analyze.
     * </p>
     * 
     * @return The ARN of the report group that contains the reports to analyze.
     */

    public String getReportGroupArn() {
        return this.reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group that contains the reports to analyze.
     * </p>
     * 
     * @param reportGroupArn
     *        The ARN of the report group that contains the reports to analyze.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendRequest withReportGroupArn(String reportGroupArn) {
        setReportGroupArn(reportGroupArn);
        return this;
    }

    /**
     * <p>
     * The number of reports to analyze. This operation always retrieves the most recent reports.
     * </p>
     * <p>
     * If this parameter is omitted, the most recent 100 reports are analyzed.
     * </p>
     * 
     * @param numOfReports
     *        The number of reports to analyze. This operation always retrieves the most recent reports.</p>
     *        <p>
     *        If this parameter is omitted, the most recent 100 reports are analyzed.
     */

    public void setNumOfReports(Integer numOfReports) {
        this.numOfReports = numOfReports;
    }

    /**
     * <p>
     * The number of reports to analyze. This operation always retrieves the most recent reports.
     * </p>
     * <p>
     * If this parameter is omitted, the most recent 100 reports are analyzed.
     * </p>
     * 
     * @return The number of reports to analyze. This operation always retrieves the most recent reports.</p>
     *         <p>
     *         If this parameter is omitted, the most recent 100 reports are analyzed.
     */

    public Integer getNumOfReports() {
        return this.numOfReports;
    }

    /**
     * <p>
     * The number of reports to analyze. This operation always retrieves the most recent reports.
     * </p>
     * <p>
     * If this parameter is omitted, the most recent 100 reports are analyzed.
     * </p>
     * 
     * @param numOfReports
     *        The number of reports to analyze. This operation always retrieves the most recent reports.</p>
     *        <p>
     *        If this parameter is omitted, the most recent 100 reports are analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendRequest withNumOfReports(Integer numOfReports) {
        setNumOfReports(numOfReports);
        return this;
    }

    /**
     * <p>
     * The test report value to accumulate. This must be one of the following values:
     * </p>
     * <dl>
     * <dt>Test reports:</dt>
     * <dd>
     * <dl>
     * <dt>DURATION</dt>
     * <dd>
     * <p>
     * Accumulate the test run times for the specified reports.
     * </p>
     * </dd>
     * <dt>PASS_RATE</dt>
     * <dd>
     * <p>
     * Accumulate the percentage of tests that passed for the specified test reports.
     * </p>
     * </dd>
     * <dt>TOTAL</dt>
     * <dd>
     * <p>
     * Accumulate the total number of tests for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * <dl>
     * <dt>Code coverage reports:</dt>
     * <dd>
     * <dl>
     * <dt>BRANCH_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the branch coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the branches covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the branches missed values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the line coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the lines covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the lines not covered values for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param trendField
     *        The test report value to accumulate. This must be one of the following values:</p>
     *        <dl>
     *        <dt>Test reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>DURATION</dt>
     *        <dd>
     *        <p>
     *        Accumulate the test run times for the specified reports.
     *        </p>
     *        </dd>
     *        <dt>PASS_RATE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the percentage of tests that passed for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>TOTAL</dt>
     *        <dd>
     *        <p>
     *        Accumulate the total number of tests for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        </dl>
     *        <dl>
     *        <dt>Code coverage reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>BRANCH_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branch coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches missed values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the line coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines not covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     * @see ReportGroupTrendFieldType
     */

    public void setTrendField(String trendField) {
        this.trendField = trendField;
    }

    /**
     * <p>
     * The test report value to accumulate. This must be one of the following values:
     * </p>
     * <dl>
     * <dt>Test reports:</dt>
     * <dd>
     * <dl>
     * <dt>DURATION</dt>
     * <dd>
     * <p>
     * Accumulate the test run times for the specified reports.
     * </p>
     * </dd>
     * <dt>PASS_RATE</dt>
     * <dd>
     * <p>
     * Accumulate the percentage of tests that passed for the specified test reports.
     * </p>
     * </dd>
     * <dt>TOTAL</dt>
     * <dd>
     * <p>
     * Accumulate the total number of tests for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * <dl>
     * <dt>Code coverage reports:</dt>
     * <dd>
     * <dl>
     * <dt>BRANCH_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the branch coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the branches covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the branches missed values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the line coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the lines covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the lines not covered values for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @return The test report value to accumulate. This must be one of the following values:</p>
     *         <dl>
     *         <dt>Test reports:</dt>
     *         <dd>
     *         <dl>
     *         <dt>DURATION</dt>
     *         <dd>
     *         <p>
     *         Accumulate the test run times for the specified reports.
     *         </p>
     *         </dd>
     *         <dt>PASS_RATE</dt>
     *         <dd>
     *         <p>
     *         Accumulate the percentage of tests that passed for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>TOTAL</dt>
     *         <dd>
     *         <p>
     *         Accumulate the total number of tests for the specified test reports.
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     *         </dl>
     *         <dl>
     *         <dt>Code coverage reports:</dt>
     *         <dd>
     *         <dl>
     *         <dt>BRANCH_COVERAGE</dt>
     *         <dd>
     *         <p>
     *         Accumulate the branch coverage percentages for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>BRANCHES_COVERED</dt>
     *         <dd>
     *         <p>
     *         Accumulate the branches covered values for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>BRANCHES_MISSED</dt>
     *         <dd>
     *         <p>
     *         Accumulate the branches missed values for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>LINE_COVERAGE</dt>
     *         <dd>
     *         <p>
     *         Accumulate the line coverage percentages for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>LINES_COVERED</dt>
     *         <dd>
     *         <p>
     *         Accumulate the lines covered values for the specified test reports.
     *         </p>
     *         </dd>
     *         <dt>LINES_MISSED</dt>
     *         <dd>
     *         <p>
     *         Accumulate the lines not covered values for the specified test reports.
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     * @see ReportGroupTrendFieldType
     */

    public String getTrendField() {
        return this.trendField;
    }

    /**
     * <p>
     * The test report value to accumulate. This must be one of the following values:
     * </p>
     * <dl>
     * <dt>Test reports:</dt>
     * <dd>
     * <dl>
     * <dt>DURATION</dt>
     * <dd>
     * <p>
     * Accumulate the test run times for the specified reports.
     * </p>
     * </dd>
     * <dt>PASS_RATE</dt>
     * <dd>
     * <p>
     * Accumulate the percentage of tests that passed for the specified test reports.
     * </p>
     * </dd>
     * <dt>TOTAL</dt>
     * <dd>
     * <p>
     * Accumulate the total number of tests for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * <dl>
     * <dt>Code coverage reports:</dt>
     * <dd>
     * <dl>
     * <dt>BRANCH_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the branch coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the branches covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the branches missed values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the line coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the lines covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the lines not covered values for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param trendField
     *        The test report value to accumulate. This must be one of the following values:</p>
     *        <dl>
     *        <dt>Test reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>DURATION</dt>
     *        <dd>
     *        <p>
     *        Accumulate the test run times for the specified reports.
     *        </p>
     *        </dd>
     *        <dt>PASS_RATE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the percentage of tests that passed for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>TOTAL</dt>
     *        <dd>
     *        <p>
     *        Accumulate the total number of tests for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        </dl>
     *        <dl>
     *        <dt>Code coverage reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>BRANCH_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branch coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches missed values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the line coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines not covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupTrendFieldType
     */

    public GetReportGroupTrendRequest withTrendField(String trendField) {
        setTrendField(trendField);
        return this;
    }

    /**
     * <p>
     * The test report value to accumulate. This must be one of the following values:
     * </p>
     * <dl>
     * <dt>Test reports:</dt>
     * <dd>
     * <dl>
     * <dt>DURATION</dt>
     * <dd>
     * <p>
     * Accumulate the test run times for the specified reports.
     * </p>
     * </dd>
     * <dt>PASS_RATE</dt>
     * <dd>
     * <p>
     * Accumulate the percentage of tests that passed for the specified test reports.
     * </p>
     * </dd>
     * <dt>TOTAL</dt>
     * <dd>
     * <p>
     * Accumulate the total number of tests for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * <dl>
     * <dt>Code coverage reports:</dt>
     * <dd>
     * <dl>
     * <dt>BRANCH_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the branch coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the branches covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>BRANCHES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the branches missed values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINE_COVERAGE</dt>
     * <dd>
     * <p>
     * Accumulate the line coverage percentages for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_COVERED</dt>
     * <dd>
     * <p>
     * Accumulate the lines covered values for the specified test reports.
     * </p>
     * </dd>
     * <dt>LINES_MISSED</dt>
     * <dd>
     * <p>
     * Accumulate the lines not covered values for the specified test reports.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param trendField
     *        The test report value to accumulate. This must be one of the following values:</p>
     *        <dl>
     *        <dt>Test reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>DURATION</dt>
     *        <dd>
     *        <p>
     *        Accumulate the test run times for the specified reports.
     *        </p>
     *        </dd>
     *        <dt>PASS_RATE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the percentage of tests that passed for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>TOTAL</dt>
     *        <dd>
     *        <p>
     *        Accumulate the total number of tests for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        </dl>
     *        <dl>
     *        <dt>Code coverage reports:</dt>
     *        <dd>
     *        <dl>
     *        <dt>BRANCH_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branch coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>BRANCHES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the branches missed values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINE_COVERAGE</dt>
     *        <dd>
     *        <p>
     *        Accumulate the line coverage percentages for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_COVERED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        <dt>LINES_MISSED</dt>
     *        <dd>
     *        <p>
     *        Accumulate the lines not covered values for the specified test reports.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupTrendFieldType
     */

    public GetReportGroupTrendRequest withTrendField(ReportGroupTrendFieldType trendField) {
        this.trendField = trendField.toString();
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
        if (getReportGroupArn() != null)
            sb.append("ReportGroupArn: ").append(getReportGroupArn()).append(",");
        if (getNumOfReports() != null)
            sb.append("NumOfReports: ").append(getNumOfReports()).append(",");
        if (getTrendField() != null)
            sb.append("TrendField: ").append(getTrendField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReportGroupTrendRequest == false)
            return false;
        GetReportGroupTrendRequest other = (GetReportGroupTrendRequest) obj;
        if (other.getReportGroupArn() == null ^ this.getReportGroupArn() == null)
            return false;
        if (other.getReportGroupArn() != null && other.getReportGroupArn().equals(this.getReportGroupArn()) == false)
            return false;
        if (other.getNumOfReports() == null ^ this.getNumOfReports() == null)
            return false;
        if (other.getNumOfReports() != null && other.getNumOfReports().equals(this.getNumOfReports()) == false)
            return false;
        if (other.getTrendField() == null ^ this.getTrendField() == null)
            return false;
        if (other.getTrendField() != null && other.getTrendField().equals(this.getTrendField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportGroupArn() == null) ? 0 : getReportGroupArn().hashCode());
        hashCode = prime * hashCode + ((getNumOfReports() == null) ? 0 : getNumOfReports().hashCode());
        hashCode = prime * hashCode + ((getTrendField() == null) ? 0 : getTrendField().hashCode());
        return hashCode;
    }

    @Override
    public GetReportGroupTrendRequest clone() {
        return (GetReportGroupTrendRequest) super.clone();
    }

}
