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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a report job. A report job compiles a report based on a report plan and publishes
 * it to Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. Report job IDs cannot be edited.
     * </p>
     */
    private String reportJobId;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String reportPlanArn;
    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     */
    private String reportTemplate;
    /**
     * <p>
     * The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The status of a report job. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * <p>
     * <code>COMPLETED</code> means that the report is available for your review at your designated destination. If the
     * status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message explaining the status of the report job.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     * </p>
     */
    private ReportDestination reportDestination;

    /**
     * <p>
     * The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. Report job IDs cannot be edited.
     * </p>
     * 
     * @param reportJobId
     *        The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *        most 1,024 bytes long. Report job IDs cannot be edited.
     */

    public void setReportJobId(String reportJobId) {
        this.reportJobId = reportJobId;
    }

    /**
     * <p>
     * The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. Report job IDs cannot be edited.
     * </p>
     * 
     * @return The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *         most 1,024 bytes long. Report job IDs cannot be edited.
     */

    public String getReportJobId() {
        return this.reportJobId;
    }

    /**
     * <p>
     * The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. Report job IDs cannot be edited.
     * </p>
     * 
     * @param reportJobId
     *        The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *        most 1,024 bytes long. Report job IDs cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withReportJobId(String reportJobId) {
        setReportJobId(reportJobId);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param reportPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setReportPlanArn(String reportPlanArn) {
        this.reportPlanArn = reportPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getReportPlanArn() {
        return this.reportPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param reportPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withReportPlanArn(String reportPlanArn) {
        setReportPlanArn(reportPlanArn);
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
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are: </p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @return Identifies the report template for the report. Reports are built using a report template. The report
     *         templates are: </p>
     *         <p>
     *         <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public String getReportTemplate() {
        return this.reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are: </p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withReportTemplate(String reportTemplate) {
        setReportTemplate(reportTemplate);
        return this;
    }

    /**
     * <p>
     * The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionTime
     *        The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC).
     *         The value of <code>CompletionTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionTime
     *        The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CompletionTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The status of a report job. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * <p>
     * <code>COMPLETED</code> means that the report is available for your review at your designated destination. If the
     * status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     * </p>
     * 
     * @param status
     *        The status of a report job. The statuses are:</p>
     *        <p>
     *        <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     *        </p>
     *        <p>
     *        <code>COMPLETED</code> means that the report is available for your review at your designated destination.
     *        If the status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a report job. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * <p>
     * <code>COMPLETED</code> means that the report is available for your review at your designated destination. If the
     * status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     * </p>
     * 
     * @return The status of a report job. The statuses are:</p>
     *         <p>
     *         <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     *         </p>
     *         <p>
     *         <code>COMPLETED</code> means that the report is available for your review at your designated destination.
     *         If the status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a report job. The statuses are:
     * </p>
     * <p>
     * <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     * </p>
     * <p>
     * <code>COMPLETED</code> means that the report is available for your review at your designated destination. If the
     * status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     * </p>
     * 
     * @param status
     *        The status of a report job. The statuses are:</p>
     *        <p>
     *        <code>CREATED | RUNNING | COMPLETED | FAILED</code>
     *        </p>
     *        <p>
     *        <code>COMPLETED</code> means that the report is available for your review at your designated destination.
     *        If the status is <code>FAILED</code>, review the <code>StatusMessage</code> for the reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A message explaining the status of the report job.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the status of the report job.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of the report job.
     * </p>
     * 
     * @return A message explaining the status of the report job.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of the report job.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the status of the report job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     * </p>
     * 
     * @param reportDestination
     *        The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     */

    public void setReportDestination(ReportDestination reportDestination) {
        this.reportDestination = reportDestination;
    }

    /**
     * <p>
     * The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     * </p>
     * 
     * @return The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     */

    public ReportDestination getReportDestination() {
        return this.reportDestination;
    }

    /**
     * <p>
     * The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     * </p>
     * 
     * @param reportDestination
     *        The S3 bucket name and S3 keys for the destination where the report job publishes the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportJob withReportDestination(ReportDestination reportDestination) {
        setReportDestination(reportDestination);
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
        if (getReportJobId() != null)
            sb.append("ReportJobId: ").append(getReportJobId()).append(",");
        if (getReportPlanArn() != null)
            sb.append("ReportPlanArn: ").append(getReportPlanArn()).append(",");
        if (getReportTemplate() != null)
            sb.append("ReportTemplate: ").append(getReportTemplate()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getReportDestination() != null)
            sb.append("ReportDestination: ").append(getReportDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportJob == false)
            return false;
        ReportJob other = (ReportJob) obj;
        if (other.getReportJobId() == null ^ this.getReportJobId() == null)
            return false;
        if (other.getReportJobId() != null && other.getReportJobId().equals(this.getReportJobId()) == false)
            return false;
        if (other.getReportPlanArn() == null ^ this.getReportPlanArn() == null)
            return false;
        if (other.getReportPlanArn() != null && other.getReportPlanArn().equals(this.getReportPlanArn()) == false)
            return false;
        if (other.getReportTemplate() == null ^ this.getReportTemplate() == null)
            return false;
        if (other.getReportTemplate() != null && other.getReportTemplate().equals(this.getReportTemplate()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getReportDestination() == null ^ this.getReportDestination() == null)
            return false;
        if (other.getReportDestination() != null && other.getReportDestination().equals(this.getReportDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportJobId() == null) ? 0 : getReportJobId().hashCode());
        hashCode = prime * hashCode + ((getReportPlanArn() == null) ? 0 : getReportPlanArn().hashCode());
        hashCode = prime * hashCode + ((getReportTemplate() == null) ? 0 : getReportTemplate().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getReportDestination() == null) ? 0 : getReportDestination().hashCode());
        return hashCode;
    }

    @Override
    public ReportJob clone() {
        try {
            return (ReportJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
