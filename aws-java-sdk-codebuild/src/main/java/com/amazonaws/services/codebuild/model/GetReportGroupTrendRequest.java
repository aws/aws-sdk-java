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

    private String reportGroupArn;

    private Integer numOfReports;

    private String trendField;

    /**
     * @param reportGroupArn
     */

    public void setReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
    }

    /**
     * @return
     */

    public String getReportGroupArn() {
        return this.reportGroupArn;
    }

    /**
     * @param reportGroupArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendRequest withReportGroupArn(String reportGroupArn) {
        setReportGroupArn(reportGroupArn);
        return this;
    }

    /**
     * @param numOfReports
     */

    public void setNumOfReports(Integer numOfReports) {
        this.numOfReports = numOfReports;
    }

    /**
     * @return
     */

    public Integer getNumOfReports() {
        return this.numOfReports;
    }

    /**
     * @param numOfReports
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportGroupTrendRequest withNumOfReports(Integer numOfReports) {
        setNumOfReports(numOfReports);
        return this;
    }

    /**
     * @param trendField
     * @see ReportGroupTrendFieldType
     */

    public void setTrendField(String trendField) {
        this.trendField = trendField;
    }

    /**
     * @return
     * @see ReportGroupTrendFieldType
     */

    public String getTrendField() {
        return this.trendField;
    }

    /**
     * @param trendField
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportGroupTrendFieldType
     */

    public GetReportGroupTrendRequest withTrendField(String trendField) {
        setTrendField(trendField);
        return this;
    }

    /**
     * @param trendField
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
