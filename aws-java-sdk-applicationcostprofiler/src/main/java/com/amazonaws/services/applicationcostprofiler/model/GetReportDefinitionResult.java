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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/GetReportDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReportDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the report retrieved.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * Description of the report.
     * </p>
     */
    private String reportDescription;
    /**
     * <p>
     * Cadence used to generate the report.
     * </p>
     */
    private String reportFrequency;
    /**
     * <p>
     * Format of the generated report.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
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
    private java.util.Date lastUpdated;

    /**
     * <p>
     * ID of the report retrieved.
     * </p>
     * 
     * @param reportId
     *        ID of the report retrieved.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * ID of the report retrieved.
     * </p>
     * 
     * @return ID of the report retrieved.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * ID of the report retrieved.
     * </p>
     * 
     * @param reportId
     *        ID of the report retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportDefinitionResult withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * Description of the report.
     * </p>
     * 
     * @param reportDescription
     *        Description of the report.
     */

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    /**
     * <p>
     * Description of the report.
     * </p>
     * 
     * @return Description of the report.
     */

    public String getReportDescription() {
        return this.reportDescription;
    }

    /**
     * <p>
     * Description of the report.
     * </p>
     * 
     * @param reportDescription
     *        Description of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportDefinitionResult withReportDescription(String reportDescription) {
        setReportDescription(reportDescription);
        return this;
    }

    /**
     * <p>
     * Cadence used to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Cadence used to generate the report.
     * @see ReportFrequency
     */

    public void setReportFrequency(String reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    /**
     * <p>
     * Cadence used to generate the report.
     * </p>
     * 
     * @return Cadence used to generate the report.
     * @see ReportFrequency
     */

    public String getReportFrequency() {
        return this.reportFrequency;
    }

    /**
     * <p>
     * Cadence used to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Cadence used to generate the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public GetReportDefinitionResult withReportFrequency(String reportFrequency) {
        setReportFrequency(reportFrequency);
        return this;
    }

    /**
     * <p>
     * Cadence used to generate the report.
     * </p>
     * 
     * @param reportFrequency
     *        Cadence used to generate the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequency
     */

    public GetReportDefinitionResult withReportFrequency(ReportFrequency reportFrequency) {
        this.reportFrequency = reportFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Format of the generated report.
     * </p>
     * 
     * @param format
     *        Format of the generated report.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Format of the generated report.
     * </p>
     * 
     * @return Format of the generated report.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Format of the generated report.
     * </p>
     * 
     * @param format
     *        Format of the generated report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public GetReportDefinitionResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Format of the generated report.
     * </p>
     * 
     * @param format
     *        Format of the generated report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public GetReportDefinitionResult withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     * </p>
     * 
     * @param destinationS3Location
     *        Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     */

    public void setDestinationS3Location(S3Location destinationS3Location) {
        this.destinationS3Location = destinationS3Location;
    }

    /**
     * <p>
     * Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     * </p>
     * 
     * @return Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     */

    public S3Location getDestinationS3Location() {
        return this.destinationS3Location;
    }

    /**
     * <p>
     * Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     * </p>
     * 
     * @param destinationS3Location
     *        Amazon Simple Storage Service (Amazon S3) location where the report is uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportDefinitionResult withDestinationS3Location(S3Location destinationS3Location) {
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

    public GetReportDefinitionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Timestamp (milliseconds) when this report definition was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @return Timestamp (milliseconds) when this report definition was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Timestamp (milliseconds) when this report definition was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Timestamp (milliseconds) when this report definition was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportDefinitionResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReportDefinitionResult == false)
            return false;
        GetReportDefinitionResult other = (GetReportDefinitionResult) obj;
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
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public GetReportDefinitionResult clone() {
        try {
            return (GetReportDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
