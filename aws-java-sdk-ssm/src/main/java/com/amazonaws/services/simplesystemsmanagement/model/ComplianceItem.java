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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the compliance as defined by the resource type. For example, for a patch resource type,
 * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ComplianceItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     * <code>string</code> are all valid compliance types.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * An ID for the resource. For a managed instance, this is the instance ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number
     * of the KB article; for example: KB4010320.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     * command), and the execution time.
     * </p>
     */
    private ComplianceExecutionSummary executionSummary;
    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     */
    private java.util.Map<String, String> details;

    /**
     * <p>
     * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     * <code>string</code> are all valid compliance types.
     * </p>
     * 
     * @param complianceType
     *        The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     *        <code>string</code> are all valid compliance types.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     * <code>string</code> are all valid compliance types.
     * </p>
     * 
     * @return The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     *         <code>string</code> are all valid compliance types.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     * <code>string</code> are all valid compliance types.
     * </p>
     * 
     * @param complianceType
     *        The compliance type. For example, Association (for a State Manager association), Patch, or Custom:
     *        <code>string</code> are all valid compliance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @return The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * An ID for the resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @param resourceId
     *        An ID for the resource. For a managed instance, this is the instance ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * An ID for the resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @return An ID for the resource. For a managed instance, this is the instance ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * An ID for the resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @param resourceId
     *        An ID for the resource. For a managed instance, this is the instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number
     * of the KB article; for example: KB4010320.
     * </p>
     * 
     * @param id
     *        An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the
     *        number of the KB article; for example: KB4010320.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number
     * of the KB article; for example: KB4010320.
     * </p>
     * 
     * @return An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be
     *         the number of the KB article; for example: KB4010320.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number
     * of the KB article; for example: KB4010320.
     * </p>
     * 
     * @param id
     *        An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the
     *        number of the KB article; for example: KB4010320.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @param title
     *        A title for the compliance item. For example, if the compliance item is a Windows patch, the title could
     *        be the title of the KB article for the patch; for example: Security Update for Active Directory Federation
     *        Services.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @return A title for the compliance item. For example, if the compliance item is a Windows patch, the title could
     *         be the title of the KB article for the patch; for example: Security Update for Active Directory
     *         Federation Services.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @param title
     *        A title for the compliance item. For example, if the compliance item is a Windows patch, the title could
     *        be the title of the KB article for the patch; for example: Security Update for Active Directory Federation
     *        Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     * 
     * @param status
     *        The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * @see ComplianceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     * 
     * @return The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * @see ComplianceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     * 
     * @param status
     *        The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public ComplianceItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     * 
     * @param status
     *        The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public ComplianceItem withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     * 
     * @param severity
     *        The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     *        Informational, Unspecified.
     * @see ComplianceSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     * 
     * @return The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     *         Informational, Unspecified.
     * @see ComplianceSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     * 
     * @param severity
     *        The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     *        Informational, Unspecified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceSeverity
     */

    public ComplianceItem withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     * 
     * @param severity
     *        The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     *        Informational, Unspecified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceSeverity
     */

    public ComplianceItem withSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     * command), and the execution time.
     * </p>
     * 
     * @param executionSummary
     *        A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     *        command), and the execution time.
     */

    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     * command), and the execution time.
     * </p>
     * 
     * @return A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     *         command), and the execution time.
     */

    public ComplianceExecutionSummary getExecutionSummary() {
        return this.executionSummary;
    }

    /**
     * <p>
     * A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     * command), and the execution time.
     * </p>
     * 
     * @param executionSummary
     *        A summary for the compliance item. The summary includes an execution ID, the execution type (for example,
     *        command), and the execution time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withExecutionSummary(ComplianceExecutionSummary executionSummary) {
        setExecutionSummary(executionSummary);
        return this;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     * 
     * @return A "Key": "Value" tag combination for the compliance item.
     */

    public java.util.Map<String, String> getDetails() {
        return details;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     * 
     * @param details
     *        A "Key": "Value" tag combination for the compliance item.
     */

    public void setDetails(java.util.Map<String, String> details) {
        this.details = details;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     * 
     * @param details
     *        A "Key": "Value" tag combination for the compliance item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem withDetails(java.util.Map<String, String> details) {
        setDetails(details);
        return this;
    }

    public ComplianceItem addDetailsEntry(String key, String value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, String>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItem clearDetailsEntries() {
        this.details = null;
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
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: ").append(getExecutionSummary()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceItem == false)
            return false;
        ComplianceItem other = (ComplianceItem) obj;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceItem clone() {
        try {
            return (ComplianceItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ComplianceItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
