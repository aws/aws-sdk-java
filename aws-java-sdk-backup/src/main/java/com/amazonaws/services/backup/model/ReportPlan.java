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
 * Contains detailed information about a report plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportPlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String reportPlanArn;
    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
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
     * Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key
     * prefix, and the formats of your reports.
     * </p>
     */
    private ReportDeliveryChannel reportDeliveryChannel;
    /**
     * <p>
     * The deployment status of a report plan. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that a report job associated with this report plan last attempted to run, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastAttemptedExecutionTime;
    /**
     * <p>
     * The date and time that a report job associated with this report plan last successfully ran, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastSuccessfulExecutionTime;

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

    public ReportPlan withReportPlanArn(String reportPlanArn) {
        setReportPlanArn(reportPlanArn);
        return this;
    }

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setReportPlanName(String reportPlanName) {
        this.reportPlanName = reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     *         consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getReportPlanName() {
        return this.reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withReportPlanName(String reportPlanName) {
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

    public ReportPlan withReportPlanDescription(String reportPlanDescription) {
        setReportPlanDescription(reportPlanDescription);
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

    public ReportPlan withReportSetting(ReportSetting reportSetting) {
        setReportSetting(reportSetting);
        return this;
    }

    /**
     * <p>
     * Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key
     * prefix, and the formats of your reports.
     * </p>
     * 
     * @param reportDeliveryChannel
     *        Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name,
     *        S3 key prefix, and the formats of your reports.
     */

    public void setReportDeliveryChannel(ReportDeliveryChannel reportDeliveryChannel) {
        this.reportDeliveryChannel = reportDeliveryChannel;
    }

    /**
     * <p>
     * Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key
     * prefix, and the formats of your reports.
     * </p>
     * 
     * @return Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket
     *         name, S3 key prefix, and the formats of your reports.
     */

    public ReportDeliveryChannel getReportDeliveryChannel() {
        return this.reportDeliveryChannel;
    }

    /**
     * <p>
     * Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key
     * prefix, and the formats of your reports.
     * </p>
     * 
     * @param reportDeliveryChannel
     *        Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name,
     *        S3 key prefix, and the formats of your reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withReportDeliveryChannel(ReportDeliveryChannel reportDeliveryChannel) {
        setReportDeliveryChannel(reportDeliveryChannel);
        return this;
    }

    /**
     * <p>
     * The deployment status of a report plan. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     * </p>
     * 
     * @param deploymentStatus
     *        The deployment status of a report plan. The statuses are:</p>
     *        <p>
     *        <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The deployment status of a report plan. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     * </p>
     * 
     * @return The deployment status of a report plan. The statuses are:</p>
     *         <p>
     *         <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The deployment status of a report plan. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     * </p>
     * 
     * @param deploymentStatus
     *        The deployment status of a report plan. The statuses are:</p>
     *        <p>
     *        <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last attempted to run, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastAttemptedExecutionTime
     *        The date and time that a report job associated with this report plan last attempted to run, in Unix format
     *        and Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastAttemptedExecutionTime(java.util.Date lastAttemptedExecutionTime) {
        this.lastAttemptedExecutionTime = lastAttemptedExecutionTime;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last attempted to run, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report job associated with this report plan last attempted to run, in Unix
     *         format and Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is
     *         accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018
     *         12:11:30.087 AM.
     */

    public java.util.Date getLastAttemptedExecutionTime() {
        return this.lastAttemptedExecutionTime;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last attempted to run, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastAttemptedExecutionTime
     *        The date and time that a report job associated with this report plan last attempted to run, in Unix format
     *        and Coordinated Universal Time (UTC). The value of <code>LastAttemptedExecutionTime</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withLastAttemptedExecutionTime(java.util.Date lastAttemptedExecutionTime) {
        setLastAttemptedExecutionTime(lastAttemptedExecutionTime);
        return this;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last successfully ran, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastSuccessfulExecutionTime
     *        The date and time that a report job associated with this report plan last successfully ran, in Unix format
     *        and Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastSuccessfulExecutionTime(java.util.Date lastSuccessfulExecutionTime) {
        this.lastSuccessfulExecutionTime = lastSuccessfulExecutionTime;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last successfully ran, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report job associated with this report plan last successfully ran, in Unix
     *         format and Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is
     *         accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018
     *         12:11:30.087 AM.
     */

    public java.util.Date getLastSuccessfulExecutionTime() {
        return this.lastSuccessfulExecutionTime;
    }

    /**
     * <p>
     * The date and time that a report job associated with this report plan last successfully ran, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     * milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastSuccessfulExecutionTime
     *        The date and time that a report job associated with this report plan last successfully ran, in Unix format
     *        and Coordinated Universal Time (UTC). The value of <code>LastSuccessfulExecutionTime</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportPlan withLastSuccessfulExecutionTime(java.util.Date lastSuccessfulExecutionTime) {
        setLastSuccessfulExecutionTime(lastSuccessfulExecutionTime);
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
        if (getReportPlanArn() != null)
            sb.append("ReportPlanArn: ").append(getReportPlanArn()).append(",");
        if (getReportPlanName() != null)
            sb.append("ReportPlanName: ").append(getReportPlanName()).append(",");
        if (getReportPlanDescription() != null)
            sb.append("ReportPlanDescription: ").append(getReportPlanDescription()).append(",");
        if (getReportSetting() != null)
            sb.append("ReportSetting: ").append(getReportSetting()).append(",");
        if (getReportDeliveryChannel() != null)
            sb.append("ReportDeliveryChannel: ").append(getReportDeliveryChannel()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastAttemptedExecutionTime() != null)
            sb.append("LastAttemptedExecutionTime: ").append(getLastAttemptedExecutionTime()).append(",");
        if (getLastSuccessfulExecutionTime() != null)
            sb.append("LastSuccessfulExecutionTime: ").append(getLastSuccessfulExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportPlan == false)
            return false;
        ReportPlan other = (ReportPlan) obj;
        if (other.getReportPlanArn() == null ^ this.getReportPlanArn() == null)
            return false;
        if (other.getReportPlanArn() != null && other.getReportPlanArn().equals(this.getReportPlanArn()) == false)
            return false;
        if (other.getReportPlanName() == null ^ this.getReportPlanName() == null)
            return false;
        if (other.getReportPlanName() != null && other.getReportPlanName().equals(this.getReportPlanName()) == false)
            return false;
        if (other.getReportPlanDescription() == null ^ this.getReportPlanDescription() == null)
            return false;
        if (other.getReportPlanDescription() != null && other.getReportPlanDescription().equals(this.getReportPlanDescription()) == false)
            return false;
        if (other.getReportSetting() == null ^ this.getReportSetting() == null)
            return false;
        if (other.getReportSetting() != null && other.getReportSetting().equals(this.getReportSetting()) == false)
            return false;
        if (other.getReportDeliveryChannel() == null ^ this.getReportDeliveryChannel() == null)
            return false;
        if (other.getReportDeliveryChannel() != null && other.getReportDeliveryChannel().equals(this.getReportDeliveryChannel()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastAttemptedExecutionTime() == null ^ this.getLastAttemptedExecutionTime() == null)
            return false;
        if (other.getLastAttemptedExecutionTime() != null && other.getLastAttemptedExecutionTime().equals(this.getLastAttemptedExecutionTime()) == false)
            return false;
        if (other.getLastSuccessfulExecutionTime() == null ^ this.getLastSuccessfulExecutionTime() == null)
            return false;
        if (other.getLastSuccessfulExecutionTime() != null && other.getLastSuccessfulExecutionTime().equals(this.getLastSuccessfulExecutionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportPlanArn() == null) ? 0 : getReportPlanArn().hashCode());
        hashCode = prime * hashCode + ((getReportPlanName() == null) ? 0 : getReportPlanName().hashCode());
        hashCode = prime * hashCode + ((getReportPlanDescription() == null) ? 0 : getReportPlanDescription().hashCode());
        hashCode = prime * hashCode + ((getReportSetting() == null) ? 0 : getReportSetting().hashCode());
        hashCode = prime * hashCode + ((getReportDeliveryChannel() == null) ? 0 : getReportDeliveryChannel().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptedExecutionTime() == null) ? 0 : getLastAttemptedExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulExecutionTime() == null) ? 0 : getLastSuccessfulExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public ReportPlan clone() {
        try {
            return (ReportPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
