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
 * Information about a compliance item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ComplianceItemEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceItemEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the
     * KB article.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low,
     * Informational, Unspecified.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     */
    private java.util.Map<String, String> details;

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the
     * KB article.
     * </p>
     * 
     * @param id
     *        The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number
     *        of the KB article.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the
     * KB article.
     * </p>
     * 
     * @return The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the
     *         number of the KB article.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the
     * KB article.
     * </p>
     * 
     * @param id
     *        The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number
     *        of the KB article.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItemEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @param title
     *        The title of the compliance item. For example, if the compliance item is a Windows patch, the title could
     *        be the title of the KB article for the patch; for example: Security Update for Active Directory Federation
     *        Services.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @return The title of the compliance item. For example, if the compliance item is a Windows patch, the title could
     *         be the title of the KB article for the patch; for example: Security Update for Active Directory
     *         Federation Services.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the
     * title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
     * </p>
     * 
     * @param title
     *        The title of the compliance item. For example, if the compliance item is a Windows patch, the title could
     *        be the title of the KB article for the patch; for example: Security Update for Active Directory Federation
     *        Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceItemEntry withTitle(String title) {
        setTitle(title);
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

    public ComplianceItemEntry withSeverity(String severity) {
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

    public ComplianceItemEntry withSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
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

    public ComplianceItemEntry withStatus(String status) {
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

    public ComplianceItemEntry withStatus(ComplianceStatus status) {
        this.status = status.toString();
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

    public ComplianceItemEntry withDetails(java.util.Map<String, String> details) {
        setDetails(details);
        return this;
    }

    public ComplianceItemEntry addDetailsEntry(String key, String value) {
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

    public ComplianceItemEntry clearDetailsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ComplianceItemEntry == false)
            return false;
        ComplianceItemEntry other = (ComplianceItemEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceItemEntry clone() {
        try {
            return (ComplianceItemEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ComplianceItemEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
