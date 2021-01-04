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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A record that contains the information needed to demonstrate compliance with the requirements specified by a control.
 * Examples of evidence include change activity triggered by a user, or a system configuration snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Evidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evidence implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source from which the specified evidence was collected.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     */
    private String evidenceAwsAccountId;
    /**
     * <p>
     * The timestamp that represents when the evidence was collected.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The AWS service from which the evidence is collected.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The name of the specified evidence event.
     * </p>
     */
    private String eventName;
    /**
     * <p>
     * The type of automated evidence.
     * </p>
     */
    private String evidenceByType;
    /**
     * <p>
     * The list of resources assessed to generate the evidence.
     * </p>
     */
    private java.util.List<Resource> resourcesIncluded;
    /**
     * <p>
     * The names and values used by the evidence event, including an attribute name (such as
     * <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The unique identifier for the IAM user or role associated with the evidence.
     * </p>
     */
    private String iamId;
    /**
     * <p>
     * The evaluation status for evidence that falls under the compliance check category. For evidence collected from
     * AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS Config, a
     * <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     * </p>
     */
    private String complianceCheck;
    /**
     * <p>
     * The AWS account from which the evidence is collected, and its AWS organization path.
     * </p>
     */
    private String awsOrganization;
    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The identifier for the folder in which the evidence is stored.
     * </p>
     */
    private String evidenceFolderId;
    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the evidence is inclded in the assessment report.
     * </p>
     */
    private String assessmentReportSelection;

    /**
     * <p>
     * The data source from which the specified evidence was collected.
     * </p>
     * 
     * @param dataSource
     *        The data source from which the specified evidence was collected.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source from which the specified evidence was collected.
     * </p>
     * 
     * @return The data source from which the specified evidence was collected.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source from which the specified evidence was collected.
     * </p>
     * 
     * @param dataSource
     *        The data source from which the specified evidence was collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param evidenceAwsAccountId
     *        The identifier for the specified AWS account.
     */

    public void setEvidenceAwsAccountId(String evidenceAwsAccountId) {
        this.evidenceAwsAccountId = evidenceAwsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @return The identifier for the specified AWS account.
     */

    public String getEvidenceAwsAccountId() {
        return this.evidenceAwsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param evidenceAwsAccountId
     *        The identifier for the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEvidenceAwsAccountId(String evidenceAwsAccountId) {
        setEvidenceAwsAccountId(evidenceAwsAccountId);
        return this;
    }

    /**
     * <p>
     * The timestamp that represents when the evidence was collected.
     * </p>
     * 
     * @param time
     *        The timestamp that represents when the evidence was collected.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The timestamp that represents when the evidence was collected.
     * </p>
     * 
     * @return The timestamp that represents when the evidence was collected.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The timestamp that represents when the evidence was collected.
     * </p>
     * 
     * @param time
     *        The timestamp that represents when the evidence was collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The AWS service from which the evidence is collected.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the evidence is collected.
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The AWS service from which the evidence is collected.
     * </p>
     * 
     * @return The AWS service from which the evidence is collected.
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The AWS service from which the evidence is collected.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the evidence is collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The name of the specified evidence event.
     * </p>
     * 
     * @param eventName
     *        The name of the specified evidence event.
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the specified evidence event.
     * </p>
     * 
     * @return The name of the specified evidence event.
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * The name of the specified evidence event.
     * </p>
     * 
     * @param eventName
     *        The name of the specified evidence event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * The type of automated evidence.
     * </p>
     * 
     * @param evidenceByType
     *        The type of automated evidence.
     */

    public void setEvidenceByType(String evidenceByType) {
        this.evidenceByType = evidenceByType;
    }

    /**
     * <p>
     * The type of automated evidence.
     * </p>
     * 
     * @return The type of automated evidence.
     */

    public String getEvidenceByType() {
        return this.evidenceByType;
    }

    /**
     * <p>
     * The type of automated evidence.
     * </p>
     * 
     * @param evidenceByType
     *        The type of automated evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEvidenceByType(String evidenceByType) {
        setEvidenceByType(evidenceByType);
        return this;
    }

    /**
     * <p>
     * The list of resources assessed to generate the evidence.
     * </p>
     * 
     * @return The list of resources assessed to generate the evidence.
     */

    public java.util.List<Resource> getResourcesIncluded() {
        return resourcesIncluded;
    }

    /**
     * <p>
     * The list of resources assessed to generate the evidence.
     * </p>
     * 
     * @param resourcesIncluded
     *        The list of resources assessed to generate the evidence.
     */

    public void setResourcesIncluded(java.util.Collection<Resource> resourcesIncluded) {
        if (resourcesIncluded == null) {
            this.resourcesIncluded = null;
            return;
        }

        this.resourcesIncluded = new java.util.ArrayList<Resource>(resourcesIncluded);
    }

    /**
     * <p>
     * The list of resources assessed to generate the evidence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesIncluded(java.util.Collection)} or {@link #withResourcesIncluded(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourcesIncluded
     *        The list of resources assessed to generate the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withResourcesIncluded(Resource... resourcesIncluded) {
        if (this.resourcesIncluded == null) {
            setResourcesIncluded(new java.util.ArrayList<Resource>(resourcesIncluded.length));
        }
        for (Resource ele : resourcesIncluded) {
            this.resourcesIncluded.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources assessed to generate the evidence.
     * </p>
     * 
     * @param resourcesIncluded
     *        The list of resources assessed to generate the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withResourcesIncluded(java.util.Collection<Resource> resourcesIncluded) {
        setResourcesIncluded(resourcesIncluded);
        return this;
    }

    /**
     * <p>
     * The names and values used by the evidence event, including an attribute name (such as
     * <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     * </p>
     * 
     * @return The names and values used by the evidence event, including an attribute name (such as
     *         <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The names and values used by the evidence event, including an attribute name (such as
     * <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     * </p>
     * 
     * @param attributes
     *        The names and values used by the evidence event, including an attribute name (such as
     *        <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The names and values used by the evidence event, including an attribute name (such as
     * <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     * </p>
     * 
     * @param attributes
     *        The names and values used by the evidence event, including an attribute name (such as
     *        <code>allowUsersToChangePassword</code>) and value (such as <code>true</code> or <code>false</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see Evidence#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Evidence addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the IAM user or role associated with the evidence.
     * </p>
     * 
     * @param iamId
     *        The unique identifier for the IAM user or role associated with the evidence.
     */

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    /**
     * <p>
     * The unique identifier for the IAM user or role associated with the evidence.
     * </p>
     * 
     * @return The unique identifier for the IAM user or role associated with the evidence.
     */

    public String getIamId() {
        return this.iamId;
    }

    /**
     * <p>
     * The unique identifier for the IAM user or role associated with the evidence.
     * </p>
     * 
     * @param iamId
     *        The unique identifier for the IAM user or role associated with the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withIamId(String iamId) {
        setIamId(iamId);
        return this;
    }

    /**
     * <p>
     * The evaluation status for evidence that falls under the compliance check category. For evidence collected from
     * AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS Config, a
     * <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     * </p>
     * 
     * @param complianceCheck
     *        The evaluation status for evidence that falls under the compliance check category. For evidence collected
     *        from AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS
     *        Config, a <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     */

    public void setComplianceCheck(String complianceCheck) {
        this.complianceCheck = complianceCheck;
    }

    /**
     * <p>
     * The evaluation status for evidence that falls under the compliance check category. For evidence collected from
     * AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS Config, a
     * <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     * </p>
     * 
     * @return The evaluation status for evidence that falls under the compliance check category. For evidence collected
     *         from AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS
     *         Config, a <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     */

    public String getComplianceCheck() {
        return this.complianceCheck;
    }

    /**
     * <p>
     * The evaluation status for evidence that falls under the compliance check category. For evidence collected from
     * AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS Config, a
     * <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     * </p>
     * 
     * @param complianceCheck
     *        The evaluation status for evidence that falls under the compliance check category. For evidence collected
     *        from AWS Security Hub, a <i>Pass</i> or <i>Fail</i> result is shown. For evidence collected from AWS
     *        Config, a <i>Compliant</i> or <i>Noncompliant</i> result is shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withComplianceCheck(String complianceCheck) {
        setComplianceCheck(complianceCheck);
        return this;
    }

    /**
     * <p>
     * The AWS account from which the evidence is collected, and its AWS organization path.
     * </p>
     * 
     * @param awsOrganization
     *        The AWS account from which the evidence is collected, and its AWS organization path.
     */

    public void setAwsOrganization(String awsOrganization) {
        this.awsOrganization = awsOrganization;
    }

    /**
     * <p>
     * The AWS account from which the evidence is collected, and its AWS organization path.
     * </p>
     * 
     * @return The AWS account from which the evidence is collected, and its AWS organization path.
     */

    public String getAwsOrganization() {
        return this.awsOrganization;
    }

    /**
     * <p>
     * The AWS account from which the evidence is collected, and its AWS organization path.
     * </p>
     * 
     * @param awsOrganization
     *        The AWS account from which the evidence is collected, and its AWS organization path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withAwsOrganization(String awsOrganization) {
        setAwsOrganization(awsOrganization);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier for the specified AWS account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @return The identifier for the specified AWS account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier for the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The identifier for the folder in which the evidence is stored.
     * </p>
     * 
     * @param evidenceFolderId
     *        The identifier for the folder in which the evidence is stored.
     */

    public void setEvidenceFolderId(String evidenceFolderId) {
        this.evidenceFolderId = evidenceFolderId;
    }

    /**
     * <p>
     * The identifier for the folder in which the evidence is stored.
     * </p>
     * 
     * @return The identifier for the folder in which the evidence is stored.
     */

    public String getEvidenceFolderId() {
        return this.evidenceFolderId;
    }

    /**
     * <p>
     * The identifier for the folder in which the evidence is stored.
     * </p>
     * 
     * @param evidenceFolderId
     *        The identifier for the folder in which the evidence is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEvidenceFolderId(String evidenceFolderId) {
        setEvidenceFolderId(evidenceFolderId);
        return this;
    }

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     * 
     * @param id
     *        The identifier for the evidence.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     * 
     * @return The identifier for the evidence.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     * 
     * @param id
     *        The identifier for the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the evidence is inclded in the assessment report.
     * </p>
     * 
     * @param assessmentReportSelection
     *        Specifies whether the evidence is inclded in the assessment report.
     */

    public void setAssessmentReportSelection(String assessmentReportSelection) {
        this.assessmentReportSelection = assessmentReportSelection;
    }

    /**
     * <p>
     * Specifies whether the evidence is inclded in the assessment report.
     * </p>
     * 
     * @return Specifies whether the evidence is inclded in the assessment report.
     */

    public String getAssessmentReportSelection() {
        return this.assessmentReportSelection;
    }

    /**
     * <p>
     * Specifies whether the evidence is inclded in the assessment report.
     * </p>
     * 
     * @param assessmentReportSelection
     *        Specifies whether the evidence is inclded in the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withAssessmentReportSelection(String assessmentReportSelection) {
        setAssessmentReportSelection(assessmentReportSelection);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getEvidenceAwsAccountId() != null)
            sb.append("EvidenceAwsAccountId: ").append(getEvidenceAwsAccountId()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getEventName() != null)
            sb.append("EventName: ").append(getEventName()).append(",");
        if (getEvidenceByType() != null)
            sb.append("EvidenceByType: ").append(getEvidenceByType()).append(",");
        if (getResourcesIncluded() != null)
            sb.append("ResourcesIncluded: ").append(getResourcesIncluded()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getIamId() != null)
            sb.append("IamId: ").append(getIamId()).append(",");
        if (getComplianceCheck() != null)
            sb.append("ComplianceCheck: ").append(getComplianceCheck()).append(",");
        if (getAwsOrganization() != null)
            sb.append("AwsOrganization: ").append(getAwsOrganization()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getEvidenceFolderId() != null)
            sb.append("EvidenceFolderId: ").append(getEvidenceFolderId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAssessmentReportSelection() != null)
            sb.append("AssessmentReportSelection: ").append(getAssessmentReportSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evidence == false)
            return false;
        Evidence other = (Evidence) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getEvidenceAwsAccountId() == null ^ this.getEvidenceAwsAccountId() == null)
            return false;
        if (other.getEvidenceAwsAccountId() != null && other.getEvidenceAwsAccountId().equals(this.getEvidenceAwsAccountId()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getEvidenceByType() == null ^ this.getEvidenceByType() == null)
            return false;
        if (other.getEvidenceByType() != null && other.getEvidenceByType().equals(this.getEvidenceByType()) == false)
            return false;
        if (other.getResourcesIncluded() == null ^ this.getResourcesIncluded() == null)
            return false;
        if (other.getResourcesIncluded() != null && other.getResourcesIncluded().equals(this.getResourcesIncluded()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getIamId() == null ^ this.getIamId() == null)
            return false;
        if (other.getIamId() != null && other.getIamId().equals(this.getIamId()) == false)
            return false;
        if (other.getComplianceCheck() == null ^ this.getComplianceCheck() == null)
            return false;
        if (other.getComplianceCheck() != null && other.getComplianceCheck().equals(this.getComplianceCheck()) == false)
            return false;
        if (other.getAwsOrganization() == null ^ this.getAwsOrganization() == null)
            return false;
        if (other.getAwsOrganization() != null && other.getAwsOrganization().equals(this.getAwsOrganization()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getEvidenceFolderId() == null ^ this.getEvidenceFolderId() == null)
            return false;
        if (other.getEvidenceFolderId() != null && other.getEvidenceFolderId().equals(this.getEvidenceFolderId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAssessmentReportSelection() == null ^ this.getAssessmentReportSelection() == null)
            return false;
        if (other.getAssessmentReportSelection() != null && other.getAssessmentReportSelection().equals(this.getAssessmentReportSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getEvidenceAwsAccountId() == null) ? 0 : getEvidenceAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getEvidenceByType() == null) ? 0 : getEvidenceByType().hashCode());
        hashCode = prime * hashCode + ((getResourcesIncluded() == null) ? 0 : getResourcesIncluded().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getIamId() == null) ? 0 : getIamId().hashCode());
        hashCode = prime * hashCode + ((getComplianceCheck() == null) ? 0 : getComplianceCheck().hashCode());
        hashCode = prime * hashCode + ((getAwsOrganization() == null) ? 0 : getAwsOrganization().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getEvidenceFolderId() == null) ? 0 : getEvidenceFolderId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportSelection() == null) ? 0 : getAssessmentReportSelection().hashCode());
        return hashCode;
    }

    @Override
    public Evidence clone() {
        try {
            return (Evidence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.EvidenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
