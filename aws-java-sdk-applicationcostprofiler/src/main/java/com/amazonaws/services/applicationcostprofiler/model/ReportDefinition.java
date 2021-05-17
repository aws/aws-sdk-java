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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a report in AWS Application Cost Profiler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ReportDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the report.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * Description of the report
     * </p>
     */
    private String reportDescription;
    /**
     * <p>
     * The cadence at which the report is generated.
     * </p>
     */
    private String reportFrequency;
    /**
     * <p>
     * The format used for the generated reports.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     * </p>
     */
    private S3Location destinationS3Location;
    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @param reportId
     *        The ID of the report.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @return The ID of the report.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @param reportId
     *        The ID of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * Description of the report
     * </p>
     * 
     * @param reportDescription
     *        Description of the report
     */

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    /**
     * <p>
     * Description of the report
     * </p>
     * 
     * @return Description of the report
     */

    public String getReportDescription() {
        return this.reportDescription;
    }

    /**
     * <p>
     * Description of the report
     * </p>
     * 
     * @param reportDescription
     *        Description of the report
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withReportDescription(String reportDescription) {
        setReportDescription(reportDescription);
        return this;
    }

    /**
     * <p>
     * The cadence at which the report is generated.
     * </p>
     * 
     * @param reportFrequency
     *        The cadence at which the report is generated.
     * @see ReportFrequency
     */

    public void setReportFrequency(String reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    /**
     * <p>
     * The cadence at which the report is generated.
     * </p>
     * 
     * @return The cadence at which the report is generated.
     * @see ReportFrequency
     */

    public String getReportFrequency() {
        return this.reportFrequency;
    }

    /**
     * <p>
     * The cadence at which the report is generated.
     * </p>
     * 
     * @param reportFrequency
     *        The cadence at which the report is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public ReportDefinition withReportFrequency(String reportFrequency) {
        setReportFrequency(reportFrequency);
        return this;
    }

    /**
     * <p>
     * The cadence at which the report is generated.
     * </p>
     * 
     * @param reportFrequency
     *        The cadence at which the report is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public ReportDefinition withReportFrequency(ReportFrequency reportFrequency) {
        this.reportFrequency = reportFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The format used for the generated reports.
     * </p>
     * 
     * @param format
     *        The format used for the generated reports.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format used for the generated reports.
     * </p>
     * 
     * @return The format used for the generated reports.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format used for the generated reports.
     * </p>
     * 
     * @param format
     *        The format used for the generated reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ReportDefinition withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format used for the generated reports.
     * </p>
     * 
     * @param format
     *        The format used for the generated reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ReportDefinition withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     * </p>
     * 
     * @param destinationS3Location
     *        The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     */

    public void setDestinationS3Location(S3Location destinationS3Location) {
        this.destinationS3Location = destinationS3Location;
    }

    /**
     * <p>
     * The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     * </p>
     * 
     * @return The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     */

    public S3Location getDestinationS3Location() {
        return this.destinationS3Location;
    }

    /**
     * <p>
     * The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     * </p>
     * 
     * @param destinationS3Location
     *        The location in Amazon Simple Storage Service (Amazon S3) the reports should be saved to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withDestinationS3Location(S3Location destinationS3Location) {
        setDestinationS3Location(destinationS3Location);
        return this;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was created.
     * </p>
     * 
     * @param createdAt
     *        Timestamp (milliseconds) when this report definition was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was created.
     * </p>
     * 
     * @return Timestamp (milliseconds) when this report definition was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was created.
     * </p>
     * 
     * @param createdAt
     *        Timestamp (milliseconds) when this report definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Timestamp (milliseconds) when this report definition was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @return Timestamp (milliseconds) when this report definition was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Timestamp (milliseconds) when this report definition was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
            sb.append("DestinationS3Location: ").append(getDestinationS3Location()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportDefinition == false)
            return false;
        ReportDefinition other = (ReportDefinition) obj;
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
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ReportDefinition clone() {
        try {
            return (ReportDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationcostprofiler.model.transform.ReportDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
