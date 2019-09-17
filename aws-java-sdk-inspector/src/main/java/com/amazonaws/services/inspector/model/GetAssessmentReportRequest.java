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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetAssessmentReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssessmentReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment run for which you want to generate a report.
     * </p>
     */
    private String assessmentRunArn;
    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     */
    private String reportFileFormat;
    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     */
    private String reportType;

    /**
     * <p>
     * The ARN that specifies the assessment run for which you want to generate a report.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN that specifies the assessment run for which you want to generate a report.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment run for which you want to generate a report.
     * </p>
     * 
     * @return The ARN that specifies the assessment run for which you want to generate a report.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment run for which you want to generate a report.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN that specifies the assessment run for which you want to generate a report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentReportRequest withAssessmentRunArn(String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
        return this;
    }

    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     * 
     * @param reportFileFormat
     *        Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * @see ReportFileFormat
     */

    public void setReportFileFormat(String reportFileFormat) {
        this.reportFileFormat = reportFileFormat;
    }

    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     * 
     * @return Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * @see ReportFileFormat
     */

    public String getReportFileFormat() {
        return this.reportFileFormat;
    }

    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     * 
     * @param reportFileFormat
     *        Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFileFormat
     */

    public GetAssessmentReportRequest withReportFileFormat(String reportFileFormat) {
        setReportFileFormat(reportFileFormat);
        return this;
    }

    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     * 
     * @param reportFileFormat
     *        Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * @see ReportFileFormat
     */

    public void setReportFileFormat(ReportFileFormat reportFileFormat) {
        withReportFileFormat(reportFileFormat);
    }

    /**
     * <p>
     * Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * </p>
     * 
     * @param reportFileFormat
     *        Specifies the file format (html or pdf) of the assessment report that you want to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFileFormat
     */

    public GetAssessmentReportRequest withReportFileFormat(ReportFileFormat reportFileFormat) {
        this.reportFileFormat = reportFileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     * 
     * @param reportType
     *        Specifies the type of the assessment report that you want to generate. There are two types of assessment
     *        reports: a finding report and a full report. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment
     *        Reports</a>.
     * @see ReportType
     */

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     * 
     * @return Specifies the type of the assessment report that you want to generate. There are two types of assessment
     *         reports: a finding report and a full report. For more information, see <a
     *         href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment
     *         Reports</a>.
     * @see ReportType
     */

    public String getReportType() {
        return this.reportType;
    }

    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     * 
     * @param reportType
     *        Specifies the type of the assessment report that you want to generate. There are two types of assessment
     *        reports: a finding report and a full report. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment
     *        Reports</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public GetAssessmentReportRequest withReportType(String reportType) {
        setReportType(reportType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     * 
     * @param reportType
     *        Specifies the type of the assessment report that you want to generate. There are two types of assessment
     *        reports: a finding report and a full report. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment
     *        Reports</a>.
     * @see ReportType
     */

    public void setReportType(ReportType reportType) {
        withReportType(reportType);
    }

    /**
     * <p>
     * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports:
     * a finding report and a full report. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment Reports</a>.
     * </p>
     * 
     * @param reportType
     *        Specifies the type of the assessment report that you want to generate. There are two types of assessment
     *        reports: a finding report and a full report. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_reports.html">Assessment
     *        Reports</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public GetAssessmentReportRequest withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
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
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: ").append(getAssessmentRunArn()).append(",");
        if (getReportFileFormat() != null)
            sb.append("ReportFileFormat: ").append(getReportFileFormat()).append(",");
        if (getReportType() != null)
            sb.append("ReportType: ").append(getReportType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentReportRequest == false)
            return false;
        GetAssessmentReportRequest other = (GetAssessmentReportRequest) obj;
        if (other.getAssessmentRunArn() == null ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null && other.getAssessmentRunArn().equals(this.getAssessmentRunArn()) == false)
            return false;
        if (other.getReportFileFormat() == null ^ this.getReportFileFormat() == null)
            return false;
        if (other.getReportFileFormat() != null && other.getReportFileFormat().equals(this.getReportFileFormat()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null && other.getReportType().equals(this.getReportType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn().hashCode());
        hashCode = prime * hashCode + ((getReportFileFormat() == null) ? 0 : getReportFileFormat().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentReportRequest clone() {
        return (GetAssessmentReportRequest) super.clone();
    }

}
