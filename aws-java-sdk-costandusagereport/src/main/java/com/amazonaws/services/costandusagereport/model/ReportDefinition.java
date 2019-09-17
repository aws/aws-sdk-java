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
package com.amazonaws.services.costandusagereport.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of AWS Cost and Usage Report. You can specify the report name, time unit, report format, compression
 * format, S3 bucket, additional artifacts, and schema elements in the definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ReportDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDefinition implements Serializable, Cloneable, StructuredPojo {

    private String reportName;

    private String timeUnit;

    private String format;

    private String compression;
    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     */
    private java.util.List<String> additionalSchemaElements;

    private String s3Bucket;

    private String s3Prefix;

    private String s3Region;
    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     */
    private java.util.List<String> additionalArtifacts;
    /**
     * <p>
     * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services
     * detects charges related to previous months. These charges can include refunds, credits, or support fees.
     * </p>
     */
    private Boolean refreshClosedReports;
    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     */
    private String reportVersioning;

    /**
     * @param reportName
     */

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * @return
     */

    public String getReportName() {
        return this.reportName;
    }

    /**
     * @param reportName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withReportName(String reportName) {
        setReportName(reportName);
        return this;
    }

    /**
     * @param timeUnit
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * @return
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @param timeUnit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public ReportDefinition withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * @param timeUnit
     * @see TimeUnit
     */

    public void setTimeUnit(TimeUnit timeUnit) {
        withTimeUnit(timeUnit);
    }

    /**
     * @param timeUnit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public ReportDefinition withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * @param format
     * @see ReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return
     * @see ReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * @param format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public ReportDefinition withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * @param format
     * @see ReportFormat
     */

    public void setFormat(ReportFormat format) {
        withFormat(format);
    }

    /**
     * @param format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public ReportDefinition withFormat(ReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * @param compression
     * @see CompressionFormat
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * @return
     * @see CompressionFormat
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * @param compression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ReportDefinition withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * @param compression
     * @see CompressionFormat
     */

    public void setCompression(CompressionFormat compression) {
        withCompression(compression);
    }

    /**
     * @param compression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ReportDefinition withCompression(CompressionFormat compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     * 
     * @return A list of strings that indicate additional content that Amazon Web Services includes in the report, such
     *         as individual resource IDs.
     * @see SchemaElement
     */

    public java.util.List<String> getAdditionalSchemaElements() {
        return additionalSchemaElements;
    }

    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     * 
     * @param additionalSchemaElements
     *        A list of strings that indicate additional content that Amazon Web Services includes in the report, such
     *        as individual resource IDs.
     * @see SchemaElement
     */

    public void setAdditionalSchemaElements(java.util.Collection<String> additionalSchemaElements) {
        if (additionalSchemaElements == null) {
            this.additionalSchemaElements = null;
            return;
        }

        this.additionalSchemaElements = new java.util.ArrayList<String>(additionalSchemaElements);
    }

    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalSchemaElements(java.util.Collection)} or
     * {@link #withAdditionalSchemaElements(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalSchemaElements
     *        A list of strings that indicate additional content that Amazon Web Services includes in the report, such
     *        as individual resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaElement
     */

    public ReportDefinition withAdditionalSchemaElements(String... additionalSchemaElements) {
        if (this.additionalSchemaElements == null) {
            setAdditionalSchemaElements(new java.util.ArrayList<String>(additionalSchemaElements.length));
        }
        for (String ele : additionalSchemaElements) {
            this.additionalSchemaElements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     * 
     * @param additionalSchemaElements
     *        A list of strings that indicate additional content that Amazon Web Services includes in the report, such
     *        as individual resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaElement
     */

    public ReportDefinition withAdditionalSchemaElements(java.util.Collection<String> additionalSchemaElements) {
        setAdditionalSchemaElements(additionalSchemaElements);
        return this;
    }

    /**
     * <p>
     * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as
     * individual resource IDs.
     * </p>
     * 
     * @param additionalSchemaElements
     *        A list of strings that indicate additional content that Amazon Web Services includes in the report, such
     *        as individual resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaElement
     */

    public ReportDefinition withAdditionalSchemaElements(SchemaElement... additionalSchemaElements) {
        java.util.ArrayList<String> additionalSchemaElementsCopy = new java.util.ArrayList<String>(additionalSchemaElements.length);
        for (SchemaElement value : additionalSchemaElements) {
            additionalSchemaElementsCopy.add(value.toString());
        }
        if (getAdditionalSchemaElements() == null) {
            setAdditionalSchemaElements(additionalSchemaElementsCopy);
        } else {
            getAdditionalSchemaElements().addAll(additionalSchemaElementsCopy);
        }
        return this;
    }

    /**
     * @param s3Bucket
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * @return
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * @param s3Bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * @param s3Prefix
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * @return
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * @param s3Prefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * @param s3Region
     * @see AWSRegion
     */

    public void setS3Region(String s3Region) {
        this.s3Region = s3Region;
    }

    /**
     * @return
     * @see AWSRegion
     */

    public String getS3Region() {
        return this.s3Region;
    }

    /**
     * @param s3Region
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AWSRegion
     */

    public ReportDefinition withS3Region(String s3Region) {
        setS3Region(s3Region);
        return this;
    }

    /**
     * @param s3Region
     * @see AWSRegion
     */

    public void setS3Region(AWSRegion s3Region) {
        withS3Region(s3Region);
    }

    /**
     * @param s3Region
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AWSRegion
     */

    public ReportDefinition withS3Region(AWSRegion s3Region) {
        this.s3Region = s3Region.toString();
        return this;
    }

    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     * 
     * @return A list of manifests that you want Amazon Web Services to create for this report.
     * @see AdditionalArtifact
     */

    public java.util.List<String> getAdditionalArtifacts() {
        return additionalArtifacts;
    }

    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     * 
     * @param additionalArtifacts
     *        A list of manifests that you want Amazon Web Services to create for this report.
     * @see AdditionalArtifact
     */

    public void setAdditionalArtifacts(java.util.Collection<String> additionalArtifacts) {
        if (additionalArtifacts == null) {
            this.additionalArtifacts = null;
            return;
        }

        this.additionalArtifacts = new java.util.ArrayList<String>(additionalArtifacts);
    }

    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalArtifacts(java.util.Collection)} or {@link #withAdditionalArtifacts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalArtifacts
     *        A list of manifests that you want Amazon Web Services to create for this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalArtifact
     */

    public ReportDefinition withAdditionalArtifacts(String... additionalArtifacts) {
        if (this.additionalArtifacts == null) {
            setAdditionalArtifacts(new java.util.ArrayList<String>(additionalArtifacts.length));
        }
        for (String ele : additionalArtifacts) {
            this.additionalArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     * 
     * @param additionalArtifacts
     *        A list of manifests that you want Amazon Web Services to create for this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalArtifact
     */

    public ReportDefinition withAdditionalArtifacts(java.util.Collection<String> additionalArtifacts) {
        setAdditionalArtifacts(additionalArtifacts);
        return this;
    }

    /**
     * <p>
     * A list of manifests that you want Amazon Web Services to create for this report.
     * </p>
     * 
     * @param additionalArtifacts
     *        A list of manifests that you want Amazon Web Services to create for this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalArtifact
     */

    public ReportDefinition withAdditionalArtifacts(AdditionalArtifact... additionalArtifacts) {
        java.util.ArrayList<String> additionalArtifactsCopy = new java.util.ArrayList<String>(additionalArtifacts.length);
        for (AdditionalArtifact value : additionalArtifacts) {
            additionalArtifactsCopy.add(value.toString());
        }
        if (getAdditionalArtifacts() == null) {
            setAdditionalArtifacts(additionalArtifactsCopy);
        } else {
            getAdditionalArtifacts().addAll(additionalArtifactsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services
     * detects charges related to previous months. These charges can include refunds, credits, or support fees.
     * </p>
     * 
     * @param refreshClosedReports
     *        Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web
     *        Services detects charges related to previous months. These charges can include refunds, credits, or
     *        support fees.
     */

    public void setRefreshClosedReports(Boolean refreshClosedReports) {
        this.refreshClosedReports = refreshClosedReports;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services
     * detects charges related to previous months. These charges can include refunds, credits, or support fees.
     * </p>
     * 
     * @return Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web
     *         Services detects charges related to previous months. These charges can include refunds, credits, or
     *         support fees.
     */

    public Boolean getRefreshClosedReports() {
        return this.refreshClosedReports;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services
     * detects charges related to previous months. These charges can include refunds, credits, or support fees.
     * </p>
     * 
     * @param refreshClosedReports
     *        Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web
     *        Services detects charges related to previous months. These charges can include refunds, credits, or
     *        support fees.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDefinition withRefreshClosedReports(Boolean refreshClosedReports) {
        setRefreshClosedReports(refreshClosedReports);
        return this;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services
     * detects charges related to previous months. These charges can include refunds, credits, or support fees.
     * </p>
     * 
     * @return Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web
     *         Services detects charges related to previous months. These charges can include refunds, credits, or
     *         support fees.
     */

    public Boolean isRefreshClosedReports() {
        return this.refreshClosedReports;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     * 
     * @param reportVersioning
     *        Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the
     *        report in addition to the previous versions.
     * @see ReportVersioning
     */

    public void setReportVersioning(String reportVersioning) {
        this.reportVersioning = reportVersioning;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     * 
     * @return Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the
     *         report in addition to the previous versions.
     * @see ReportVersioning
     */

    public String getReportVersioning() {
        return this.reportVersioning;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     * 
     * @param reportVersioning
     *        Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the
     *        report in addition to the previous versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportVersioning
     */

    public ReportDefinition withReportVersioning(String reportVersioning) {
        setReportVersioning(reportVersioning);
        return this;
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     * 
     * @param reportVersioning
     *        Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the
     *        report in addition to the previous versions.
     * @see ReportVersioning
     */

    public void setReportVersioning(ReportVersioning reportVersioning) {
        withReportVersioning(reportVersioning);
    }

    /**
     * <p>
     * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in
     * addition to the previous versions.
     * </p>
     * 
     * @param reportVersioning
     *        Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the
     *        report in addition to the previous versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportVersioning
     */

    public ReportDefinition withReportVersioning(ReportVersioning reportVersioning) {
        this.reportVersioning = reportVersioning.toString();
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
        if (getReportName() != null)
            sb.append("ReportName: ").append(getReportName()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getAdditionalSchemaElements() != null)
            sb.append("AdditionalSchemaElements: ").append(getAdditionalSchemaElements()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getS3Region() != null)
            sb.append("S3Region: ").append(getS3Region()).append(",");
        if (getAdditionalArtifacts() != null)
            sb.append("AdditionalArtifacts: ").append(getAdditionalArtifacts()).append(",");
        if (getRefreshClosedReports() != null)
            sb.append("RefreshClosedReports: ").append(getRefreshClosedReports()).append(",");
        if (getReportVersioning() != null)
            sb.append("ReportVersioning: ").append(getReportVersioning());
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
        if (other.getReportName() == null ^ this.getReportName() == null)
            return false;
        if (other.getReportName() != null && other.getReportName().equals(this.getReportName()) == false)
            return false;
        if (other.getTimeUnit() == null ^ this.getTimeUnit() == null)
            return false;
        if (other.getTimeUnit() != null && other.getTimeUnit().equals(this.getTimeUnit()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getAdditionalSchemaElements() == null ^ this.getAdditionalSchemaElements() == null)
            return false;
        if (other.getAdditionalSchemaElements() != null && other.getAdditionalSchemaElements().equals(this.getAdditionalSchemaElements()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3Region() == null ^ this.getS3Region() == null)
            return false;
        if (other.getS3Region() != null && other.getS3Region().equals(this.getS3Region()) == false)
            return false;
        if (other.getAdditionalArtifacts() == null ^ this.getAdditionalArtifacts() == null)
            return false;
        if (other.getAdditionalArtifacts() != null && other.getAdditionalArtifacts().equals(this.getAdditionalArtifacts()) == false)
            return false;
        if (other.getRefreshClosedReports() == null ^ this.getRefreshClosedReports() == null)
            return false;
        if (other.getRefreshClosedReports() != null && other.getRefreshClosedReports().equals(this.getRefreshClosedReports()) == false)
            return false;
        if (other.getReportVersioning() == null ^ this.getReportVersioning() == null)
            return false;
        if (other.getReportVersioning() != null && other.getReportVersioning().equals(this.getReportVersioning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportName() == null) ? 0 : getReportName().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getAdditionalSchemaElements() == null) ? 0 : getAdditionalSchemaElements().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3Region() == null) ? 0 : getS3Region().hashCode());
        hashCode = prime * hashCode + ((getAdditionalArtifacts() == null) ? 0 : getAdditionalArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRefreshClosedReports() == null) ? 0 : getRefreshClosedReports().hashCode());
        hashCode = prime * hashCode + ((getReportVersioning() == null) ? 0 : getReportVersioning().hashCode());
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
        com.amazonaws.services.costandusagereport.model.transform.ReportDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
