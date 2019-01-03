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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The findings (results) of the audit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     */
    private String checkName;
    /**
     * <p>
     * The time the audit started.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     */
    private java.util.Date findingTime;
    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     */
    private NonCompliantResource nonCompliantResource;
    /**
     * <p>
     * The list of related resources.
     * </p>
     */
    private java.util.List<RelatedResource> relatedResources;
    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     */
    private String reasonForNonCompliance;
    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     */
    private String reasonForNonComplianceCode;

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * 
     * @param taskId
     *        The ID of the audit that generated this result (finding)
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * 
     * @return The ID of the audit that generated this result (finding)
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * 
     * @param taskId
     *        The ID of the audit that generated this result (finding)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     * 
     * @param checkName
     *        The audit check that generated this result.
     */

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     * 
     * @return The audit check that generated this result.
     */

    public String getCheckName() {
        return this.checkName;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     * 
     * @param checkName
     *        The audit check that generated this result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withCheckName(String checkName) {
        setCheckName(checkName);
        return this;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the audit started.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @return The time the audit started.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the audit started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     * 
     * @param findingTime
     *        The time the result (finding) was discovered.
     */

    public void setFindingTime(java.util.Date findingTime) {
        this.findingTime = findingTime;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     * 
     * @return The time the result (finding) was discovered.
     */

    public java.util.Date getFindingTime() {
        return this.findingTime;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     * 
     * @param findingTime
     *        The time the result (finding) was discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withFindingTime(java.util.Date findingTime) {
        setFindingTime(findingTime);
        return this;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * 
     * @param severity
     *        The severity of the result (finding).
     * @see AuditFindingSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * 
     * @return The severity of the result (finding).
     * @see AuditFindingSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * 
     * @param severity
     *        The severity of the result (finding).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFindingSeverity
     */

    public AuditFinding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * 
     * @param severity
     *        The severity of the result (finding).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFindingSeverity
     */

    public AuditFinding withSeverity(AuditFindingSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     * 
     * @param nonCompliantResource
     *        The resource that was found to be non-compliant with the audit check.
     */

    public void setNonCompliantResource(NonCompliantResource nonCompliantResource) {
        this.nonCompliantResource = nonCompliantResource;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     * 
     * @return The resource that was found to be non-compliant with the audit check.
     */

    public NonCompliantResource getNonCompliantResource() {
        return this.nonCompliantResource;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     * 
     * @param nonCompliantResource
     *        The resource that was found to be non-compliant with the audit check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withNonCompliantResource(NonCompliantResource nonCompliantResource) {
        setNonCompliantResource(nonCompliantResource);
        return this;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * 
     * @return The list of related resources.
     */

    public java.util.List<RelatedResource> getRelatedResources() {
        return relatedResources;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * 
     * @param relatedResources
     *        The list of related resources.
     */

    public void setRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        if (relatedResources == null) {
            this.relatedResources = null;
            return;
        }

        this.relatedResources = new java.util.ArrayList<RelatedResource>(relatedResources);
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedResources(java.util.Collection)} or {@link #withRelatedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedResources
     *        The list of related resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withRelatedResources(RelatedResource... relatedResources) {
        if (this.relatedResources == null) {
            setRelatedResources(new java.util.ArrayList<RelatedResource>(relatedResources.length));
        }
        for (RelatedResource ele : relatedResources) {
            this.relatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * 
     * @param relatedResources
     *        The list of related resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        setRelatedResources(relatedResources);
        return this;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     * 
     * @param reasonForNonCompliance
     *        The reason the resource was non-compliant.
     */

    public void setReasonForNonCompliance(String reasonForNonCompliance) {
        this.reasonForNonCompliance = reasonForNonCompliance;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     * 
     * @return The reason the resource was non-compliant.
     */

    public String getReasonForNonCompliance() {
        return this.reasonForNonCompliance;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     * 
     * @param reasonForNonCompliance
     *        The reason the resource was non-compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withReasonForNonCompliance(String reasonForNonCompliance) {
        setReasonForNonCompliance(reasonForNonCompliance);
        return this;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     * 
     * @param reasonForNonComplianceCode
     *        A code which indicates the reason that the resource was non-compliant.
     */

    public void setReasonForNonComplianceCode(String reasonForNonComplianceCode) {
        this.reasonForNonComplianceCode = reasonForNonComplianceCode;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     * 
     * @return A code which indicates the reason that the resource was non-compliant.
     */

    public String getReasonForNonComplianceCode() {
        return this.reasonForNonComplianceCode;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     * 
     * @param reasonForNonComplianceCode
     *        A code which indicates the reason that the resource was non-compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditFinding withReasonForNonComplianceCode(String reasonForNonComplianceCode) {
        setReasonForNonComplianceCode(reasonForNonComplianceCode);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getCheckName() != null)
            sb.append("CheckName: ").append(getCheckName()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getFindingTime() != null)
            sb.append("FindingTime: ").append(getFindingTime()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getNonCompliantResource() != null)
            sb.append("NonCompliantResource: ").append(getNonCompliantResource()).append(",");
        if (getRelatedResources() != null)
            sb.append("RelatedResources: ").append(getRelatedResources()).append(",");
        if (getReasonForNonCompliance() != null)
            sb.append("ReasonForNonCompliance: ").append(getReasonForNonCompliance()).append(",");
        if (getReasonForNonComplianceCode() != null)
            sb.append("ReasonForNonComplianceCode: ").append(getReasonForNonComplianceCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditFinding == false)
            return false;
        AuditFinding other = (AuditFinding) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getFindingTime() == null ^ this.getFindingTime() == null)
            return false;
        if (other.getFindingTime() != null && other.getFindingTime().equals(this.getFindingTime()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getNonCompliantResource() == null ^ this.getNonCompliantResource() == null)
            return false;
        if (other.getNonCompliantResource() != null && other.getNonCompliantResource().equals(this.getNonCompliantResource()) == false)
            return false;
        if (other.getRelatedResources() == null ^ this.getRelatedResources() == null)
            return false;
        if (other.getRelatedResources() != null && other.getRelatedResources().equals(this.getRelatedResources()) == false)
            return false;
        if (other.getReasonForNonCompliance() == null ^ this.getReasonForNonCompliance() == null)
            return false;
        if (other.getReasonForNonCompliance() != null && other.getReasonForNonCompliance().equals(this.getReasonForNonCompliance()) == false)
            return false;
        if (other.getReasonForNonComplianceCode() == null ^ this.getReasonForNonComplianceCode() == null)
            return false;
        if (other.getReasonForNonComplianceCode() != null && other.getReasonForNonComplianceCode().equals(this.getReasonForNonComplianceCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getFindingTime() == null) ? 0 : getFindingTime().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantResource() == null) ? 0 : getNonCompliantResource().hashCode());
        hashCode = prime * hashCode + ((getRelatedResources() == null) ? 0 : getRelatedResources().hashCode());
        hashCode = prime * hashCode + ((getReasonForNonCompliance() == null) ? 0 : getReasonForNonCompliance().hashCode());
        hashCode = prime * hashCode + ((getReasonForNonComplianceCode() == null) ? 0 : getReasonForNonComplianceCode().hashCode());
        return hashCode;
    }

    @Override
    public AuditFinding clone() {
        try {
            return (AuditFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
