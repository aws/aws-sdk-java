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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describe the details of a report generator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ReportGenerator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportGenerator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the report generator.
     * </p>
     */
    private String reportGeneratorName;
    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     */
    private java.util.List<String> reportType;
    /**
     * <p>
     * License configuration type this generator reports on.
     * </p>
     */
    private ReportContext reportContext;
    /**
     * <p>
     * Details on how frequently reports are generated.
     * </p>
     */
    private ReportFrequency reportFrequency;
    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator.
     * </p>
     */
    private String licenseManagerReportGeneratorArn;
    /**
     * <p>
     * Status of the last report generation attempt.
     * </p>
     */
    private String lastRunStatus;
    /**
     * <p>
     * Failure message for the last report generation attempt.
     * </p>
     */
    private String lastRunFailureReason;
    /**
     * <p>
     * Time the last report was generated at.
     * </p>
     */
    private String lastReportGenerationTime;
    /**
     * <p>
     * The AWS account ID used to create the report generator.
     * </p>
     */
    private String reportCreatorAccount;
    /**
     * <p>
     * Description of the report generator.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Details of the S3 bucket that report generator reports are published to.
     * </p>
     */
    private S3Location s3Location;
    /**
     * <p>
     * Time the report was created.
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * Tags associated with the report generator.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @param reportGeneratorName
     *        Name of the report generator.
     */

    public void setReportGeneratorName(String reportGeneratorName) {
        this.reportGeneratorName = reportGeneratorName;
    }

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @return Name of the report generator.
     */

    public String getReportGeneratorName() {
        return this.reportGeneratorName;
    }

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @param reportGeneratorName
     *        Name of the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withReportGeneratorName(String reportGeneratorName) {
        setReportGeneratorName(reportGeneratorName);
        return this;
    }

    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     * 
     * @return Type of reports that are generated.
     * @see ReportType
     */

    public java.util.List<String> getReportType() {
        return reportType;
    }

    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     * 
     * @param reportType
     *        Type of reports that are generated.
     * @see ReportType
     */

    public void setReportType(java.util.Collection<String> reportType) {
        if (reportType == null) {
            this.reportType = null;
            return;
        }

        this.reportType = new java.util.ArrayList<String>(reportType);
    }

    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportType(java.util.Collection)} or {@link #withReportType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportType
     *        Type of reports that are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ReportGenerator withReportType(String... reportType) {
        if (this.reportType == null) {
            setReportType(new java.util.ArrayList<String>(reportType.length));
        }
        for (String ele : reportType) {
            this.reportType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     * 
     * @param reportType
     *        Type of reports that are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ReportGenerator withReportType(java.util.Collection<String> reportType) {
        setReportType(reportType);
        return this;
    }

    /**
     * <p>
     * Type of reports that are generated.
     * </p>
     * 
     * @param reportType
     *        Type of reports that are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ReportGenerator withReportType(ReportType... reportType) {
        java.util.ArrayList<String> reportTypeCopy = new java.util.ArrayList<String>(reportType.length);
        for (ReportType value : reportType) {
            reportTypeCopy.add(value.toString());
        }
        if (getReportType() == null) {
            setReportType(reportTypeCopy);
        } else {
            getReportType().addAll(reportTypeCopy);
        }
        return this;
    }

    /**
     * <p>
     * License configuration type this generator reports on.
     * </p>
     * 
     * @param reportContext
     *        License configuration type this generator reports on.
     */

    public void setReportContext(ReportContext reportContext) {
        this.reportContext = reportContext;
    }

    /**
     * <p>
     * License configuration type this generator reports on.
     * </p>
     * 
     * @return License configuration type this generator reports on.
     */

    public ReportContext getReportContext() {
        return this.reportContext;
    }

    /**
     * <p>
     * License configuration type this generator reports on.
     * </p>
     * 
     * @param reportContext
     *        License configuration type this generator reports on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withReportContext(ReportContext reportContext) {
        setReportContext(reportContext);
        return this;
    }

    /**
     * <p>
     * Details on how frequently reports are generated.
     * </p>
     * 
     * @param reportFrequency
     *        Details on how frequently reports are generated.
     */

    public void setReportFrequency(ReportFrequency reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    /**
     * <p>
     * Details on how frequently reports are generated.
     * </p>
     * 
     * @return Details on how frequently reports are generated.
     */

    public ReportFrequency getReportFrequency() {
        return this.reportFrequency;
    }

    /**
     * <p>
     * Details on how frequently reports are generated.
     * </p>
     * 
     * @param reportFrequency
     *        Details on how frequently reports are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withReportFrequency(ReportFrequency reportFrequency) {
        setReportFrequency(reportFrequency);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        Amazon Resource Number (ARN) of the report generator.
     */

    public void setLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        this.licenseManagerReportGeneratorArn = licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator.
     * </p>
     * 
     * @return Amazon Resource Number (ARN) of the report generator.
     */

    public String getLicenseManagerReportGeneratorArn() {
        return this.licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        Amazon Resource Number (ARN) of the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        setLicenseManagerReportGeneratorArn(licenseManagerReportGeneratorArn);
        return this;
    }

    /**
     * <p>
     * Status of the last report generation attempt.
     * </p>
     * 
     * @param lastRunStatus
     *        Status of the last report generation attempt.
     */

    public void setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }

    /**
     * <p>
     * Status of the last report generation attempt.
     * </p>
     * 
     * @return Status of the last report generation attempt.
     */

    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * <p>
     * Status of the last report generation attempt.
     * </p>
     * 
     * @param lastRunStatus
     *        Status of the last report generation attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withLastRunStatus(String lastRunStatus) {
        setLastRunStatus(lastRunStatus);
        return this;
    }

    /**
     * <p>
     * Failure message for the last report generation attempt.
     * </p>
     * 
     * @param lastRunFailureReason
     *        Failure message for the last report generation attempt.
     */

    public void setLastRunFailureReason(String lastRunFailureReason) {
        this.lastRunFailureReason = lastRunFailureReason;
    }

    /**
     * <p>
     * Failure message for the last report generation attempt.
     * </p>
     * 
     * @return Failure message for the last report generation attempt.
     */

    public String getLastRunFailureReason() {
        return this.lastRunFailureReason;
    }

    /**
     * <p>
     * Failure message for the last report generation attempt.
     * </p>
     * 
     * @param lastRunFailureReason
     *        Failure message for the last report generation attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withLastRunFailureReason(String lastRunFailureReason) {
        setLastRunFailureReason(lastRunFailureReason);
        return this;
    }

    /**
     * <p>
     * Time the last report was generated at.
     * </p>
     * 
     * @param lastReportGenerationTime
     *        Time the last report was generated at.
     */

    public void setLastReportGenerationTime(String lastReportGenerationTime) {
        this.lastReportGenerationTime = lastReportGenerationTime;
    }

    /**
     * <p>
     * Time the last report was generated at.
     * </p>
     * 
     * @return Time the last report was generated at.
     */

    public String getLastReportGenerationTime() {
        return this.lastReportGenerationTime;
    }

    /**
     * <p>
     * Time the last report was generated at.
     * </p>
     * 
     * @param lastReportGenerationTime
     *        Time the last report was generated at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withLastReportGenerationTime(String lastReportGenerationTime) {
        setLastReportGenerationTime(lastReportGenerationTime);
        return this;
    }

    /**
     * <p>
     * The AWS account ID used to create the report generator.
     * </p>
     * 
     * @param reportCreatorAccount
     *        The AWS account ID used to create the report generator.
     */

    public void setReportCreatorAccount(String reportCreatorAccount) {
        this.reportCreatorAccount = reportCreatorAccount;
    }

    /**
     * <p>
     * The AWS account ID used to create the report generator.
     * </p>
     * 
     * @return The AWS account ID used to create the report generator.
     */

    public String getReportCreatorAccount() {
        return this.reportCreatorAccount;
    }

    /**
     * <p>
     * The AWS account ID used to create the report generator.
     * </p>
     * 
     * @param reportCreatorAccount
     *        The AWS account ID used to create the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withReportCreatorAccount(String reportCreatorAccount) {
        setReportCreatorAccount(reportCreatorAccount);
        return this;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @param description
     *        Description of the report generator.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @return Description of the report generator.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @param description
     *        Description of the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Details of the S3 bucket that report generator reports are published to.
     * </p>
     * 
     * @param s3Location
     *        Details of the S3 bucket that report generator reports are published to.
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * Details of the S3 bucket that report generator reports are published to.
     * </p>
     * 
     * @return Details of the S3 bucket that report generator reports are published to.
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * Details of the S3 bucket that report generator reports are published to.
     * </p>
     * 
     * @param s3Location
     *        Details of the S3 bucket that report generator reports are published to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withS3Location(S3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * Time the report was created.
     * </p>
     * 
     * @param createTime
     *        Time the report was created.
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Time the report was created.
     * </p>
     * 
     * @return Time the report was created.
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Time the report was created.
     * </p>
     * 
     * @param createTime
     *        Time the report was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Tags associated with the report generator.
     * </p>
     * 
     * @return Tags associated with the report generator.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the report generator.
     * </p>
     * 
     * @param tags
     *        Tags associated with the report generator.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with the report generator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with the report generator.
     * </p>
     * 
     * @param tags
     *        Tags associated with the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportGenerator withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReportGeneratorName() != null)
            sb.append("ReportGeneratorName: ").append(getReportGeneratorName()).append(",");
        if (getReportType() != null)
            sb.append("ReportType: ").append(getReportType()).append(",");
        if (getReportContext() != null)
            sb.append("ReportContext: ").append(getReportContext()).append(",");
        if (getReportFrequency() != null)
            sb.append("ReportFrequency: ").append(getReportFrequency()).append(",");
        if (getLicenseManagerReportGeneratorArn() != null)
            sb.append("LicenseManagerReportGeneratorArn: ").append(getLicenseManagerReportGeneratorArn()).append(",");
        if (getLastRunStatus() != null)
            sb.append("LastRunStatus: ").append(getLastRunStatus()).append(",");
        if (getLastRunFailureReason() != null)
            sb.append("LastRunFailureReason: ").append(getLastRunFailureReason()).append(",");
        if (getLastReportGenerationTime() != null)
            sb.append("LastReportGenerationTime: ").append(getLastReportGenerationTime()).append(",");
        if (getReportCreatorAccount() != null)
            sb.append("ReportCreatorAccount: ").append(getReportCreatorAccount()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportGenerator == false)
            return false;
        ReportGenerator other = (ReportGenerator) obj;
        if (other.getReportGeneratorName() == null ^ this.getReportGeneratorName() == null)
            return false;
        if (other.getReportGeneratorName() != null && other.getReportGeneratorName().equals(this.getReportGeneratorName()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null && other.getReportType().equals(this.getReportType()) == false)
            return false;
        if (other.getReportContext() == null ^ this.getReportContext() == null)
            return false;
        if (other.getReportContext() != null && other.getReportContext().equals(this.getReportContext()) == false)
            return false;
        if (other.getReportFrequency() == null ^ this.getReportFrequency() == null)
            return false;
        if (other.getReportFrequency() != null && other.getReportFrequency().equals(this.getReportFrequency()) == false)
            return false;
        if (other.getLicenseManagerReportGeneratorArn() == null ^ this.getLicenseManagerReportGeneratorArn() == null)
            return false;
        if (other.getLicenseManagerReportGeneratorArn() != null
                && other.getLicenseManagerReportGeneratorArn().equals(this.getLicenseManagerReportGeneratorArn()) == false)
            return false;
        if (other.getLastRunStatus() == null ^ this.getLastRunStatus() == null)
            return false;
        if (other.getLastRunStatus() != null && other.getLastRunStatus().equals(this.getLastRunStatus()) == false)
            return false;
        if (other.getLastRunFailureReason() == null ^ this.getLastRunFailureReason() == null)
            return false;
        if (other.getLastRunFailureReason() != null && other.getLastRunFailureReason().equals(this.getLastRunFailureReason()) == false)
            return false;
        if (other.getLastReportGenerationTime() == null ^ this.getLastReportGenerationTime() == null)
            return false;
        if (other.getLastReportGenerationTime() != null && other.getLastReportGenerationTime().equals(this.getLastReportGenerationTime()) == false)
            return false;
        if (other.getReportCreatorAccount() == null ^ this.getReportCreatorAccount() == null)
            return false;
        if (other.getReportCreatorAccount() != null && other.getReportCreatorAccount().equals(this.getReportCreatorAccount()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportGeneratorName() == null) ? 0 : getReportGeneratorName().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
        hashCode = prime * hashCode + ((getReportContext() == null) ? 0 : getReportContext().hashCode());
        hashCode = prime * hashCode + ((getReportFrequency() == null) ? 0 : getReportFrequency().hashCode());
        hashCode = prime * hashCode + ((getLicenseManagerReportGeneratorArn() == null) ? 0 : getLicenseManagerReportGeneratorArn().hashCode());
        hashCode = prime * hashCode + ((getLastRunStatus() == null) ? 0 : getLastRunStatus().hashCode());
        hashCode = prime * hashCode + ((getLastRunFailureReason() == null) ? 0 : getLastRunFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLastReportGenerationTime() == null) ? 0 : getLastReportGenerationTime().hashCode());
        hashCode = prime * hashCode + ((getReportCreatorAccount() == null) ? 0 : getReportCreatorAccount().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ReportGenerator clone() {
        try {
            return (ReportGenerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ReportGeneratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
