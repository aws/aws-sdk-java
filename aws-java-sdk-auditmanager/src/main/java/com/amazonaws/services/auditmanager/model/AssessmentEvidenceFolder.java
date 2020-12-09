/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The folder in which AWS Audit Manager stores evidence for an assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentEvidenceFolder"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentEvidenceFolder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the specified evidence folder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date when the first evidence was added to the evidence folder.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The identifier for the control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The AWS service from which the evidence was collected.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The name of the user who created the evidence folder.
     * </p>
     */
    private String author;
    /**
     * <p>
     * The total amount of evidence in the evidence folder.
     * </p>
     */
    private Integer totalEvidence;
    /**
     * <p>
     * The total count of evidence included in the assessment report.
     * </p>
     */
    private Integer assessmentReportSelectionCount;
    /**
     * <p>
     * The name of the control.
     * </p>
     */
    private String controlName;
    /**
     * <p>
     * The amount of evidence included in the evidence folder.
     * </p>
     */
    private Integer evidenceResourcesIncludedCount;
    /**
     * <p>
     * The number of evidence that falls under the configuration data category. This evidence is collected from
     * configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     * </p>
     */
    private Integer evidenceByTypeConfigurationDataCount;
    /**
     * <p>
     * The number of evidence that falls under the manual category. This evidence is imported manually.
     * </p>
     */
    private Integer evidenceByTypeManualCount;
    /**
     * <p>
     * The number of evidence that falls under the compliance check category. This evidence is collected from AWS Config
     * or AWS Security Hub.
     * </p>
     */
    private Integer evidenceByTypeComplianceCheckCount;
    /**
     * <p>
     * The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     * </p>
     */
    private Integer evidenceByTypeComplianceCheckIssuesCount;
    /**
     * <p>
     * The number of evidence that falls under the user activity category. This evidence is collected from AWS
     * CloudTrail logs.
     * </p>
     */
    private Integer evidenceByTypeUserActivityCount;
    /**
     * <p>
     * The total number of AWS resources assessed to generate the evidence.
     * </p>
     */
    private Integer evidenceAwsServiceSourceCount;

    /**
     * <p>
     * The name of the specified evidence folder.
     * </p>
     * 
     * @param name
     *        The name of the specified evidence folder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified evidence folder.
     * </p>
     * 
     * @return The name of the specified evidence folder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified evidence folder.
     * </p>
     * 
     * @param name
     *        The name of the specified evidence folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date when the first evidence was added to the evidence folder.
     * </p>
     * 
     * @param date
     *        The date when the first evidence was added to the evidence folder.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date when the first evidence was added to the evidence folder.
     * </p>
     * 
     * @return The date when the first evidence was added to the evidence folder.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date when the first evidence was added to the evidence folder.
     * </p>
     * 
     * @param date
     *        The date when the first evidence was added to the evidence folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The identifier for the control set.
     * </p>
     * 
     * @return The identifier for the control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The unique identifier for the specified control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @return The unique identifier for the specified control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The unique identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @param id
     *        The identifier for the folder in which evidence is stored.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @return The identifier for the folder in which evidence is stored.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @param id
     *        The identifier for the folder in which evidence is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The AWS service from which the evidence was collected.
     * </p>
     * 
     * @param dataSource
     *        The AWS service from which the evidence was collected.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The AWS service from which the evidence was collected.
     * </p>
     * 
     * @return The AWS service from which the evidence was collected.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The AWS service from which the evidence was collected.
     * </p>
     * 
     * @param dataSource
     *        The AWS service from which the evidence was collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The name of the user who created the evidence folder.
     * </p>
     * 
     * @param author
     *        The name of the user who created the evidence folder.
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * The name of the user who created the evidence folder.
     * </p>
     * 
     * @return The name of the user who created the evidence folder.
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * The name of the user who created the evidence folder.
     * </p>
     * 
     * @param author
     *        The name of the user who created the evidence folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * The total amount of evidence in the evidence folder.
     * </p>
     * 
     * @param totalEvidence
     *        The total amount of evidence in the evidence folder.
     */

    public void setTotalEvidence(Integer totalEvidence) {
        this.totalEvidence = totalEvidence;
    }

    /**
     * <p>
     * The total amount of evidence in the evidence folder.
     * </p>
     * 
     * @return The total amount of evidence in the evidence folder.
     */

    public Integer getTotalEvidence() {
        return this.totalEvidence;
    }

    /**
     * <p>
     * The total amount of evidence in the evidence folder.
     * </p>
     * 
     * @param totalEvidence
     *        The total amount of evidence in the evidence folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withTotalEvidence(Integer totalEvidence) {
        setTotalEvidence(totalEvidence);
        return this;
    }

    /**
     * <p>
     * The total count of evidence included in the assessment report.
     * </p>
     * 
     * @param assessmentReportSelectionCount
     *        The total count of evidence included in the assessment report.
     */

    public void setAssessmentReportSelectionCount(Integer assessmentReportSelectionCount) {
        this.assessmentReportSelectionCount = assessmentReportSelectionCount;
    }

    /**
     * <p>
     * The total count of evidence included in the assessment report.
     * </p>
     * 
     * @return The total count of evidence included in the assessment report.
     */

    public Integer getAssessmentReportSelectionCount() {
        return this.assessmentReportSelectionCount;
    }

    /**
     * <p>
     * The total count of evidence included in the assessment report.
     * </p>
     * 
     * @param assessmentReportSelectionCount
     *        The total count of evidence included in the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withAssessmentReportSelectionCount(Integer assessmentReportSelectionCount) {
        setAssessmentReportSelectionCount(assessmentReportSelectionCount);
        return this;
    }

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @param controlName
     *        The name of the control.
     */

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @return The name of the control.
     */

    public String getControlName() {
        return this.controlName;
    }

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @param controlName
     *        The name of the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withControlName(String controlName) {
        setControlName(controlName);
        return this;
    }

    /**
     * <p>
     * The amount of evidence included in the evidence folder.
     * </p>
     * 
     * @param evidenceResourcesIncludedCount
     *        The amount of evidence included in the evidence folder.
     */

    public void setEvidenceResourcesIncludedCount(Integer evidenceResourcesIncludedCount) {
        this.evidenceResourcesIncludedCount = evidenceResourcesIncludedCount;
    }

    /**
     * <p>
     * The amount of evidence included in the evidence folder.
     * </p>
     * 
     * @return The amount of evidence included in the evidence folder.
     */

    public Integer getEvidenceResourcesIncludedCount() {
        return this.evidenceResourcesIncludedCount;
    }

    /**
     * <p>
     * The amount of evidence included in the evidence folder.
     * </p>
     * 
     * @param evidenceResourcesIncludedCount
     *        The amount of evidence included in the evidence folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceResourcesIncludedCount(Integer evidenceResourcesIncludedCount) {
        setEvidenceResourcesIncludedCount(evidenceResourcesIncludedCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence that falls under the configuration data category. This evidence is collected from
     * configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     * </p>
     * 
     * @param evidenceByTypeConfigurationDataCount
     *        The number of evidence that falls under the configuration data category. This evidence is collected from
     *        configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     */

    public void setEvidenceByTypeConfigurationDataCount(Integer evidenceByTypeConfigurationDataCount) {
        this.evidenceByTypeConfigurationDataCount = evidenceByTypeConfigurationDataCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the configuration data category. This evidence is collected from
     * configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     * </p>
     * 
     * @return The number of evidence that falls under the configuration data category. This evidence is collected from
     *         configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     */

    public Integer getEvidenceByTypeConfigurationDataCount() {
        return this.evidenceByTypeConfigurationDataCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the configuration data category. This evidence is collected from
     * configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     * </p>
     * 
     * @param evidenceByTypeConfigurationDataCount
     *        The number of evidence that falls under the configuration data category. This evidence is collected from
     *        configuration snapshots of other AWS services such as Amazon EC2, Amazon S3, or IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceByTypeConfigurationDataCount(Integer evidenceByTypeConfigurationDataCount) {
        setEvidenceByTypeConfigurationDataCount(evidenceByTypeConfigurationDataCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence that falls under the manual category. This evidence is imported manually.
     * </p>
     * 
     * @param evidenceByTypeManualCount
     *        The number of evidence that falls under the manual category. This evidence is imported manually.
     */

    public void setEvidenceByTypeManualCount(Integer evidenceByTypeManualCount) {
        this.evidenceByTypeManualCount = evidenceByTypeManualCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the manual category. This evidence is imported manually.
     * </p>
     * 
     * @return The number of evidence that falls under the manual category. This evidence is imported manually.
     */

    public Integer getEvidenceByTypeManualCount() {
        return this.evidenceByTypeManualCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the manual category. This evidence is imported manually.
     * </p>
     * 
     * @param evidenceByTypeManualCount
     *        The number of evidence that falls under the manual category. This evidence is imported manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceByTypeManualCount(Integer evidenceByTypeManualCount) {
        setEvidenceByTypeManualCount(evidenceByTypeManualCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence that falls under the compliance check category. This evidence is collected from AWS Config
     * or AWS Security Hub.
     * </p>
     * 
     * @param evidenceByTypeComplianceCheckCount
     *        The number of evidence that falls under the compliance check category. This evidence is collected from AWS
     *        Config or AWS Security Hub.
     */

    public void setEvidenceByTypeComplianceCheckCount(Integer evidenceByTypeComplianceCheckCount) {
        this.evidenceByTypeComplianceCheckCount = evidenceByTypeComplianceCheckCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the compliance check category. This evidence is collected from AWS Config
     * or AWS Security Hub.
     * </p>
     * 
     * @return The number of evidence that falls under the compliance check category. This evidence is collected from
     *         AWS Config or AWS Security Hub.
     */

    public Integer getEvidenceByTypeComplianceCheckCount() {
        return this.evidenceByTypeComplianceCheckCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the compliance check category. This evidence is collected from AWS Config
     * or AWS Security Hub.
     * </p>
     * 
     * @param evidenceByTypeComplianceCheckCount
     *        The number of evidence that falls under the compliance check category. This evidence is collected from AWS
     *        Config or AWS Security Hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceByTypeComplianceCheckCount(Integer evidenceByTypeComplianceCheckCount) {
        setEvidenceByTypeComplianceCheckCount(evidenceByTypeComplianceCheckCount);
        return this;
    }

    /**
     * <p>
     * The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     * </p>
     * 
     * @param evidenceByTypeComplianceCheckIssuesCount
     *        The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     */

    public void setEvidenceByTypeComplianceCheckIssuesCount(Integer evidenceByTypeComplianceCheckIssuesCount) {
        this.evidenceByTypeComplianceCheckIssuesCount = evidenceByTypeComplianceCheckIssuesCount;
    }

    /**
     * <p>
     * The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     * </p>
     * 
     * @return The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     */

    public Integer getEvidenceByTypeComplianceCheckIssuesCount() {
        return this.evidenceByTypeComplianceCheckIssuesCount;
    }

    /**
     * <p>
     * The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     * </p>
     * 
     * @param evidenceByTypeComplianceCheckIssuesCount
     *        The total number of issues that were reported directly from AWS Security Hub, AWS Config, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceByTypeComplianceCheckIssuesCount(Integer evidenceByTypeComplianceCheckIssuesCount) {
        setEvidenceByTypeComplianceCheckIssuesCount(evidenceByTypeComplianceCheckIssuesCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence that falls under the user activity category. This evidence is collected from AWS
     * CloudTrail logs.
     * </p>
     * 
     * @param evidenceByTypeUserActivityCount
     *        The number of evidence that falls under the user activity category. This evidence is collected from AWS
     *        CloudTrail logs.
     */

    public void setEvidenceByTypeUserActivityCount(Integer evidenceByTypeUserActivityCount) {
        this.evidenceByTypeUserActivityCount = evidenceByTypeUserActivityCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the user activity category. This evidence is collected from AWS
     * CloudTrail logs.
     * </p>
     * 
     * @return The number of evidence that falls under the user activity category. This evidence is collected from AWS
     *         CloudTrail logs.
     */

    public Integer getEvidenceByTypeUserActivityCount() {
        return this.evidenceByTypeUserActivityCount;
    }

    /**
     * <p>
     * The number of evidence that falls under the user activity category. This evidence is collected from AWS
     * CloudTrail logs.
     * </p>
     * 
     * @param evidenceByTypeUserActivityCount
     *        The number of evidence that falls under the user activity category. This evidence is collected from AWS
     *        CloudTrail logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceByTypeUserActivityCount(Integer evidenceByTypeUserActivityCount) {
        setEvidenceByTypeUserActivityCount(evidenceByTypeUserActivityCount);
        return this;
    }

    /**
     * <p>
     * The total number of AWS resources assessed to generate the evidence.
     * </p>
     * 
     * @param evidenceAwsServiceSourceCount
     *        The total number of AWS resources assessed to generate the evidence.
     */

    public void setEvidenceAwsServiceSourceCount(Integer evidenceAwsServiceSourceCount) {
        this.evidenceAwsServiceSourceCount = evidenceAwsServiceSourceCount;
    }

    /**
     * <p>
     * The total number of AWS resources assessed to generate the evidence.
     * </p>
     * 
     * @return The total number of AWS resources assessed to generate the evidence.
     */

    public Integer getEvidenceAwsServiceSourceCount() {
        return this.evidenceAwsServiceSourceCount;
    }

    /**
     * <p>
     * The total number of AWS resources assessed to generate the evidence.
     * </p>
     * 
     * @param evidenceAwsServiceSourceCount
     *        The total number of AWS resources assessed to generate the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentEvidenceFolder withEvidenceAwsServiceSourceCount(Integer evidenceAwsServiceSourceCount) {
        setEvidenceAwsServiceSourceCount(evidenceAwsServiceSourceCount);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getTotalEvidence() != null)
            sb.append("TotalEvidence: ").append(getTotalEvidence()).append(",");
        if (getAssessmentReportSelectionCount() != null)
            sb.append("AssessmentReportSelectionCount: ").append(getAssessmentReportSelectionCount()).append(",");
        if (getControlName() != null)
            sb.append("ControlName: ").append(getControlName()).append(",");
        if (getEvidenceResourcesIncludedCount() != null)
            sb.append("EvidenceResourcesIncludedCount: ").append(getEvidenceResourcesIncludedCount()).append(",");
        if (getEvidenceByTypeConfigurationDataCount() != null)
            sb.append("EvidenceByTypeConfigurationDataCount: ").append(getEvidenceByTypeConfigurationDataCount()).append(",");
        if (getEvidenceByTypeManualCount() != null)
            sb.append("EvidenceByTypeManualCount: ").append(getEvidenceByTypeManualCount()).append(",");
        if (getEvidenceByTypeComplianceCheckCount() != null)
            sb.append("EvidenceByTypeComplianceCheckCount: ").append(getEvidenceByTypeComplianceCheckCount()).append(",");
        if (getEvidenceByTypeComplianceCheckIssuesCount() != null)
            sb.append("EvidenceByTypeComplianceCheckIssuesCount: ").append(getEvidenceByTypeComplianceCheckIssuesCount()).append(",");
        if (getEvidenceByTypeUserActivityCount() != null)
            sb.append("EvidenceByTypeUserActivityCount: ").append(getEvidenceByTypeUserActivityCount()).append(",");
        if (getEvidenceAwsServiceSourceCount() != null)
            sb.append("EvidenceAwsServiceSourceCount: ").append(getEvidenceAwsServiceSourceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentEvidenceFolder == false)
            return false;
        AssessmentEvidenceFolder other = (AssessmentEvidenceFolder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getTotalEvidence() == null ^ this.getTotalEvidence() == null)
            return false;
        if (other.getTotalEvidence() != null && other.getTotalEvidence().equals(this.getTotalEvidence()) == false)
            return false;
        if (other.getAssessmentReportSelectionCount() == null ^ this.getAssessmentReportSelectionCount() == null)
            return false;
        if (other.getAssessmentReportSelectionCount() != null
                && other.getAssessmentReportSelectionCount().equals(this.getAssessmentReportSelectionCount()) == false)
            return false;
        if (other.getControlName() == null ^ this.getControlName() == null)
            return false;
        if (other.getControlName() != null && other.getControlName().equals(this.getControlName()) == false)
            return false;
        if (other.getEvidenceResourcesIncludedCount() == null ^ this.getEvidenceResourcesIncludedCount() == null)
            return false;
        if (other.getEvidenceResourcesIncludedCount() != null
                && other.getEvidenceResourcesIncludedCount().equals(this.getEvidenceResourcesIncludedCount()) == false)
            return false;
        if (other.getEvidenceByTypeConfigurationDataCount() == null ^ this.getEvidenceByTypeConfigurationDataCount() == null)
            return false;
        if (other.getEvidenceByTypeConfigurationDataCount() != null
                && other.getEvidenceByTypeConfigurationDataCount().equals(this.getEvidenceByTypeConfigurationDataCount()) == false)
            return false;
        if (other.getEvidenceByTypeManualCount() == null ^ this.getEvidenceByTypeManualCount() == null)
            return false;
        if (other.getEvidenceByTypeManualCount() != null && other.getEvidenceByTypeManualCount().equals(this.getEvidenceByTypeManualCount()) == false)
            return false;
        if (other.getEvidenceByTypeComplianceCheckCount() == null ^ this.getEvidenceByTypeComplianceCheckCount() == null)
            return false;
        if (other.getEvidenceByTypeComplianceCheckCount() != null
                && other.getEvidenceByTypeComplianceCheckCount().equals(this.getEvidenceByTypeComplianceCheckCount()) == false)
            return false;
        if (other.getEvidenceByTypeComplianceCheckIssuesCount() == null ^ this.getEvidenceByTypeComplianceCheckIssuesCount() == null)
            return false;
        if (other.getEvidenceByTypeComplianceCheckIssuesCount() != null
                && other.getEvidenceByTypeComplianceCheckIssuesCount().equals(this.getEvidenceByTypeComplianceCheckIssuesCount()) == false)
            return false;
        if (other.getEvidenceByTypeUserActivityCount() == null ^ this.getEvidenceByTypeUserActivityCount() == null)
            return false;
        if (other.getEvidenceByTypeUserActivityCount() != null
                && other.getEvidenceByTypeUserActivityCount().equals(this.getEvidenceByTypeUserActivityCount()) == false)
            return false;
        if (other.getEvidenceAwsServiceSourceCount() == null ^ this.getEvidenceAwsServiceSourceCount() == null)
            return false;
        if (other.getEvidenceAwsServiceSourceCount() != null
                && other.getEvidenceAwsServiceSourceCount().equals(this.getEvidenceAwsServiceSourceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getTotalEvidence() == null) ? 0 : getTotalEvidence().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportSelectionCount() == null) ? 0 : getAssessmentReportSelectionCount().hashCode());
        hashCode = prime * hashCode + ((getControlName() == null) ? 0 : getControlName().hashCode());
        hashCode = prime * hashCode + ((getEvidenceResourcesIncludedCount() == null) ? 0 : getEvidenceResourcesIncludedCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByTypeConfigurationDataCount() == null) ? 0 : getEvidenceByTypeConfigurationDataCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByTypeManualCount() == null) ? 0 : getEvidenceByTypeManualCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByTypeComplianceCheckCount() == null) ? 0 : getEvidenceByTypeComplianceCheckCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByTypeComplianceCheckIssuesCount() == null) ? 0 : getEvidenceByTypeComplianceCheckIssuesCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByTypeUserActivityCount() == null) ? 0 : getEvidenceByTypeUserActivityCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceAwsServiceSourceCount() == null) ? 0 : getEvidenceAwsServiceSourceCount().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentEvidenceFolder clone() {
        try {
            return (AssessmentEvidenceFolder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentEvidenceFolderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
