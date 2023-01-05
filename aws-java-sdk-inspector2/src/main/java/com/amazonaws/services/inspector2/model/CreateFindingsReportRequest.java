/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFindingsReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFindingsReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filter criteria to apply to the results of the finding report.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * The format to generate the report in.
     * </p>
     */
    private String reportFormat;
    /**
     * <p>
     * The Amazon S3 export destination for the report.
     * </p>
     */
    private Destination s3Destination;

    /**
     * <p>
     * The filter criteria to apply to the results of the finding report.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria to apply to the results of the finding report.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The filter criteria to apply to the results of the finding report.
     * </p>
     * 
     * @return The filter criteria to apply to the results of the finding report.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The filter criteria to apply to the results of the finding report.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria to apply to the results of the finding report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFindingsReportRequest withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The format to generate the report in.
     * </p>
     * 
     * @param reportFormat
     *        The format to generate the report in.
     * @see ReportFormat
     */

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * <p>
     * The format to generate the report in.
     * </p>
     * 
     * @return The format to generate the report in.
     * @see ReportFormat
     */

    public String getReportFormat() {
        return this.reportFormat;
    }

    /**
     * <p>
     * The format to generate the report in.
     * </p>
     * 
     * @param reportFormat
     *        The format to generate the report in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public CreateFindingsReportRequest withReportFormat(String reportFormat) {
        setReportFormat(reportFormat);
        return this;
    }

    /**
     * <p>
     * The format to generate the report in.
     * </p>
     * 
     * @param reportFormat
     *        The format to generate the report in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public CreateFindingsReportRequest withReportFormat(ReportFormat reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 export destination for the report.
     * </p>
     * 
     * @param s3Destination
     *        The Amazon S3 export destination for the report.
     */

    public void setS3Destination(Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * The Amazon S3 export destination for the report.
     * </p>
     * 
     * @return The Amazon S3 export destination for the report.
     */

    public Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * The Amazon S3 export destination for the report.
     * </p>
     * 
     * @param s3Destination
     *        The Amazon S3 export destination for the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFindingsReportRequest withS3Destination(Destination s3Destination) {
        setS3Destination(s3Destination);
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
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getReportFormat() != null)
            sb.append("ReportFormat: ").append(getReportFormat()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFindingsReportRequest == false)
            return false;
        CreateFindingsReportRequest other = (CreateFindingsReportRequest) obj;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getReportFormat() == null ^ this.getReportFormat() == null)
            return false;
        if (other.getReportFormat() != null && other.getReportFormat().equals(this.getReportFormat()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getReportFormat() == null) ? 0 : getReportFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public CreateFindingsReportRequest clone() {
        return (CreateFindingsReportRequest) super.clone();
    }

}
