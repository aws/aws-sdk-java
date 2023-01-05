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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateReportPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     */
    private String reportPlanName;
    /**
     * <p>
     * An optional description of the report plan with a maximum 1,024 characters.
     * </p>
     */
    private String reportPlanDescription;
    /**
     * <p>
     * A structure that contains information about where to deliver your reports, specifically your Amazon S3 bucket
     * name, S3 key prefix, and the formats of your reports.
     * </p>
     */
    private ReportDeliveryChannel reportDeliveryChannel;
    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * <p>
     * If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or <code>CONTROL_COMPLIANCE_REPORT</code>, this
     * API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
     * </p>
     */
    private ReportSetting reportSetting;
    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setReportPlanName(String reportPlanName) {
        this.reportPlanName = reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter,
     *         and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getReportPlanName() {
        return this.reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanRequest withReportPlanName(String reportPlanName) {
        setReportPlanName(reportPlanName);
        return this;
    }

    /**
     * <p>
     * An optional description of the report plan with a maximum 1,024 characters.
     * </p>
     * 
     * @param reportPlanDescription
     *        An optional description of the report plan with a maximum 1,024 characters.
     */

    public void setReportPlanDescription(String reportPlanDescription) {
        this.reportPlanDescription = reportPlanDescription;
    }

    /**
     * <p>
     * An optional description of the report plan with a maximum 1,024 characters.
     * </p>
     * 
     * @return An optional description of the report plan with a maximum 1,024 characters.
     */

    public String getReportPlanDescription() {
        return this.reportPlanDescription;
    }

    /**
     * <p>
     * An optional description of the report plan with a maximum 1,024 characters.
     * </p>
     * 
     * @param reportPlanDescription
     *        An optional description of the report plan with a maximum 1,024 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanRequest withReportPlanDescription(String reportPlanDescription) {
        setReportPlanDescription(reportPlanDescription);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about where to deliver your reports, specifically your Amazon S3 bucket
     * name, S3 key prefix, and the formats of your reports.
     * </p>
     * 
     * @param reportDeliveryChannel
     *        A structure that contains information about where to deliver your reports, specifically your Amazon S3
     *        bucket name, S3 key prefix, and the formats of your reports.
     */

    public void setReportDeliveryChannel(ReportDeliveryChannel reportDeliveryChannel) {
        this.reportDeliveryChannel = reportDeliveryChannel;
    }

    /**
     * <p>
     * A structure that contains information about where to deliver your reports, specifically your Amazon S3 bucket
     * name, S3 key prefix, and the formats of your reports.
     * </p>
     * 
     * @return A structure that contains information about where to deliver your reports, specifically your Amazon S3
     *         bucket name, S3 key prefix, and the formats of your reports.
     */

    public ReportDeliveryChannel getReportDeliveryChannel() {
        return this.reportDeliveryChannel;
    }

    /**
     * <p>
     * A structure that contains information about where to deliver your reports, specifically your Amazon S3 bucket
     * name, S3 key prefix, and the formats of your reports.
     * </p>
     * 
     * @param reportDeliveryChannel
     *        A structure that contains information about where to deliver your reports, specifically your Amazon S3
     *        bucket name, S3 key prefix, and the formats of your reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanRequest withReportDeliveryChannel(ReportDeliveryChannel reportDeliveryChannel) {
        setReportDeliveryChannel(reportDeliveryChannel);
        return this;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * <p>
     * If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or <code>CONTROL_COMPLIANCE_REPORT</code>, this
     * API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
     * </p>
     * 
     * @param reportSetting
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     *        </p>
     *        <p>
     *        If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or
     *        <code>CONTROL_COMPLIANCE_REPORT</code>, this API resource also describes the report coverage by Amazon Web
     *        Services Regions and frameworks.
     */

    public void setReportSetting(ReportSetting reportSetting) {
        this.reportSetting = reportSetting;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * <p>
     * If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or <code>CONTROL_COMPLIANCE_REPORT</code>, this
     * API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
     * </p>
     * 
     * @return Identifies the report template for the report. Reports are built using a report template. The report
     *         templates are:</p>
     *         <p>
     *         <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     *         </p>
     *         <p>
     *         If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or
     *         <code>CONTROL_COMPLIANCE_REPORT</code>, this API resource also describes the report coverage by Amazon
     *         Web Services Regions and frameworks.
     */

    public ReportSetting getReportSetting() {
        return this.reportSetting;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * <p>
     * If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or <code>CONTROL_COMPLIANCE_REPORT</code>, this
     * API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
     * </p>
     * 
     * @param reportSetting
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     *        </p>
     *        <p>
     *        If the report template is <code>RESOURCE_COMPLIANCE_REPORT</code> or
     *        <code>CONTROL_COMPLIANCE_REPORT</code>, this API resource also describes the report coverage by Amazon Web
     *        Services Regions and frameworks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanRequest withReportSetting(ReportSetting reportSetting) {
        setReportSetting(reportSetting);
        return this;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @return A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *         <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results
     *         in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>UpdateReportPlanInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getReportPlanName() != null)
            sb.append("ReportPlanName: ").append(getReportPlanName()).append(",");
        if (getReportPlanDescription() != null)
            sb.append("ReportPlanDescription: ").append(getReportPlanDescription()).append(",");
        if (getReportDeliveryChannel() != null)
            sb.append("ReportDeliveryChannel: ").append(getReportDeliveryChannel()).append(",");
        if (getReportSetting() != null)
            sb.append("ReportSetting: ").append(getReportSetting()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportPlanRequest == false)
            return false;
        UpdateReportPlanRequest other = (UpdateReportPlanRequest) obj;
        if (other.getReportPlanName() == null ^ this.getReportPlanName() == null)
            return false;
        if (other.getReportPlanName() != null && other.getReportPlanName().equals(this.getReportPlanName()) == false)
            return false;
        if (other.getReportPlanDescription() == null ^ this.getReportPlanDescription() == null)
            return false;
        if (other.getReportPlanDescription() != null && other.getReportPlanDescription().equals(this.getReportPlanDescription()) == false)
            return false;
        if (other.getReportDeliveryChannel() == null ^ this.getReportDeliveryChannel() == null)
            return false;
        if (other.getReportDeliveryChannel() != null && other.getReportDeliveryChannel().equals(this.getReportDeliveryChannel()) == false)
            return false;
        if (other.getReportSetting() == null ^ this.getReportSetting() == null)
            return false;
        if (other.getReportSetting() != null && other.getReportSetting().equals(this.getReportSetting()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportPlanName() == null) ? 0 : getReportPlanName().hashCode());
        hashCode = prime * hashCode + ((getReportPlanDescription() == null) ? 0 : getReportPlanDescription().hashCode());
        hashCode = prime * hashCode + ((getReportDeliveryChannel() == null) ? 0 : getReportDeliveryChannel().hashCode());
        hashCode = prime * hashCode + ((getReportSetting() == null) ? 0 : getReportSetting().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReportPlanRequest clone() {
        return (UpdateReportPlanRequest) super.clone();
    }

}
