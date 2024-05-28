/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of group access control entries that allow or deny Active Directory groups based on their security
 * identifiers (SIDs) from enrolling and/or autofenrolling with the template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/AccessControlEntrySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlEntrySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a template.
     * </p>
     */
    private AccessRights accessRights;
    /**
     * <p>
     * The date and time that the Access Control Entry was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     * </p>
     */
    private String groupDisplayName;
    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     */
    private String groupSecurityIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The date and time that the Access Control Entry was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a template.
     * </p>
     * 
     * @param accessRights
     *        Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a
     *        template.
     */

    public void setAccessRights(AccessRights accessRights) {
        this.accessRights = accessRights;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a template.
     * </p>
     * 
     * @return Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a
     *         template.
     */

    public AccessRights getAccessRights() {
        return this.accessRights;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a template.
     * </p>
     * 
     * @param accessRights
     *        Allow or deny an Active Directory group from enrolling and autoenrolling certificates issued against a
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withAccessRights(AccessRights accessRights) {
        setAccessRights(accessRights);
        return this;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Access Control Entry was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was created.
     * </p>
     * 
     * @return The date and time that the Access Control Entry was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Access Control Entry was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     * </p>
     * 
     * @param groupDisplayName
     *        Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     */

    public void setGroupDisplayName(String groupDisplayName) {
        this.groupDisplayName = groupDisplayName;
    }

    /**
     * <p>
     * Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     * </p>
     * 
     * @return Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     */

    public String getGroupDisplayName() {
        return this.groupDisplayName;
    }

    /**
     * <p>
     * Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     * </p>
     * 
     * @param groupDisplayName
     *        Name of the Active Directory group. This name does not need to match the group name in Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withGroupDisplayName(String groupDisplayName) {
        setGroupDisplayName(groupDisplayName);
        return this;
    }

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @param groupSecurityIdentifier
     *        Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     */

    public void setGroupSecurityIdentifier(String groupSecurityIdentifier) {
        this.groupSecurityIdentifier = groupSecurityIdentifier;
    }

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @return Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     */

    public String getGroupSecurityIdentifier() {
        return this.groupSecurityIdentifier;
    }

    /**
     * <p>
     * Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * </p>
     * 
     * @param groupSecurityIdentifier
     *        Security identifier (SID) of the group object from Active Directory. The SID starts with "S-".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withGroupSecurityIdentifier(String groupSecurityIdentifier) {
        setGroupSecurityIdentifier(groupSecurityIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *         >CreateTemplate</a>.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the Access Control Entry was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was updated.
     * </p>
     * 
     * @return The date and time that the Access Control Entry was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the Access Control Entry was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the Access Control Entry was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlEntrySummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccessRights() != null)
            sb.append("AccessRights: ").append(getAccessRights()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getGroupDisplayName() != null)
            sb.append("GroupDisplayName: ").append(getGroupDisplayName()).append(",");
        if (getGroupSecurityIdentifier() != null)
            sb.append("GroupSecurityIdentifier: ").append(getGroupSecurityIdentifier()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlEntrySummary == false)
            return false;
        AccessControlEntrySummary other = (AccessControlEntrySummary) obj;
        if (other.getAccessRights() == null ^ this.getAccessRights() == null)
            return false;
        if (other.getAccessRights() != null && other.getAccessRights().equals(this.getAccessRights()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getGroupDisplayName() == null ^ this.getGroupDisplayName() == null)
            return false;
        if (other.getGroupDisplayName() != null && other.getGroupDisplayName().equals(this.getGroupDisplayName()) == false)
            return false;
        if (other.getGroupSecurityIdentifier() == null ^ this.getGroupSecurityIdentifier() == null)
            return false;
        if (other.getGroupSecurityIdentifier() != null && other.getGroupSecurityIdentifier().equals(this.getGroupSecurityIdentifier()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessRights() == null) ? 0 : getAccessRights().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getGroupDisplayName() == null) ? 0 : getGroupDisplayName().hashCode());
        hashCode = prime * hashCode + ((getGroupSecurityIdentifier() == null) ? 0 : getGroupSecurityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlEntrySummary clone() {
        try {
            return (AccessControlEntrySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.AccessControlEntrySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
