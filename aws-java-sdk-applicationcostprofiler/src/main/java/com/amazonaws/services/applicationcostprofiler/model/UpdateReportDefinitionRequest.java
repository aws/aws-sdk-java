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
package com.amazonaws.services.applicationcostprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/UpdateReportDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Required. ID of the report to update.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * Required. Description of the report.
     * </p>
     */
    private String reportDescription;
    /**
     * <p>
     * Required. The cadence to generate the report.
     * </p>
     */
    private String reportFrequency;
    /**
     * <p>
     * Required. The format to use for the generated report.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the report.
     * </p>
     */
    private S3Location destinationS3Location;

    /**
     * <p>
     * Required. ID of the report to update.
     * </p>
     * 
     * @param reportId
     *        Required. ID of the report to update.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * Required. ID of the report to update.
     * </p>
     * 
     * @return Required. ID of the report to update.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * Required. ID of the report to update.
     * </p>
     * 
     * @param reportId
     *        Required. ID of the report to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportDefinitionRequest withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * Required. Description of the report.
     * </p>
     * 
     * @param reportDescription
     *        Required. Description of the report.
     */

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    /**
     * <p>
     * Required. Description of the report.
     * </p>
     * 
     * @return Required. Description of the report.
     */

    public String getReportDescription() {
        return this.reportDescription;
    }

    /**
     * <p>
     * Required. Description of the report.
     * </p>
     * 
     * @param reportDescription
     *        Required. Description of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportDefinitionRequest withReportDescription(String reportDescription) {
        setReportDescription(reportDescription);
        return this;
    }

    /**
     * <p>
     * Required. The cadence to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Required. The cadence to generate the report.
     * @see ReportFrequency
     */

    public void setReportFrequency(String reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    /**
     * <p>
     * Required. The cadence to generate the report.
     * </p>
     * 
     * @return Required. The cadence to generate the report.
     * @see ReportFrequency
     */

    public String getReportFrequency() {
        return this.reportFrequency;
    }

    /**
     * <p>
     * Required. The cadence to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Required. The cadence to generate the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public UpdateReportDefinitionRequest withReportFrequency(String reportFrequency) {
        setReportFrequency(reportFrequency);
        return this;
    }

    /**
     * <p>
     * Required. The cadence to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Required. The cadence to generate the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public UpdateReportDefinitionRequest withReportFrequency(ReportFrequency reportFrequency) {
        this.reportFrequency = reportFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Required. The format to use for the generated report.
     * </p>
     * 
     * @param format
     *        Required. The format to use for the generated report.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Required. The format to use for the generated report.
     * </p>
     * 
     * @return Required. The format to use for the generated report.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Required. The format to use for the generated report.
     * </p>
     * 
     * @param format
     *        Required. The format to use for the generated report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public UpdateReportDefinitionRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Required. The format to use for the generated report.
     * </p>
     * 
     * @param format
     *        Required. The format to use for the generated report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public UpdateReportDefinitionRequest withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the report.
     * </p>
     * 
     * @param destinationS3Location
     *        Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the
     *        report.
     */

    public void setDestinationS3Location(S3Location destinationS3Location) {
        this.destinationS3Location = destinationS3Location;
    }

    /**
     * <p>
     * Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the report.
     * </p>
     * 
     * @return Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the
     *         report.
     */

    public S3Location getDestinationS3Location() {
        return this.destinationS3Location;
    }

    /**
     * <p>
     * Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the report.
     * </p>
     * 
     * @param destinationS3Location
     *        Required. Amazon Simple Storage Service (Amazon S3) location where Application Cost Profiler uploads the
     *        report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportDefinitionRequest withDestinationS3Location(S3Location destinationS3Location) {
        setDestinationS3Location(destinationS3Location);
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
        if (getReportId() != null)
            sb.append("ReportId: ").append(getReportId()).append(",");
        if (getReportDescription() != null)
            sb.append("ReportDescription: ").append(getReportDescription()).append(",");
        if (getReportFrequency() != null)
            sb.append("ReportFrequency: ").append(getReportFrequency()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getDestinationS3Location() != null)
            sb.append("DestinationS3Location: ").append(getDestinationS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportDefinitionRequest == false)
            return false;
        UpdateReportDefinitionRequest other = (UpdateReportDefinitionRequest) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        if (other.getReportDescription() == null ^ this.getReportDescription() == null)
            return false;
        if (other.getReportDescription() != null && other.getReportDescription().equals(this.getReportDescription()) == false)
            return false;
        if (other.getReportFrequency() == null ^ this.getReportFrequency() == null)
            return false;
        if (other.getReportFrequency() != null && other.getReportFrequency().equals(this.getReportFrequency()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getDestinationS3Location() == null ^ this.getDestinationS3Location() == null)
            return false;
        if (other.getDestinationS3Location() != null && other.getDestinationS3Location().equals(this.getDestinationS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        hashCode = prime * hashCode + ((getReportDescription() == null) ? 0 : getReportDescription().hashCode());
        hashCode = prime * hashCode + ((getReportFrequency() == null) ? 0 : getReportFrequency().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Location() == null) ? 0 : getDestinationS3Location().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReportDefinitionRequest clone() {
        return (UpdateReportDefinitionRequest) super.clone();
    }

}
