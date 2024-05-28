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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicyAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationPolicyAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value is
     * <code>SELF_MANAGED_SECURITY_HUB</code>.
     * </p>
     */
    private String configurationPolicyId;
    /**
     * <p>
     * The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization root.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * Indicates whether the association between the specified target and the configuration was directly applied by the
     * Security Hub delegated administrator or inherited from a parent.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current status of the association between the specified target and the configuration.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     * </p>
     */
    private String associationStatusMessage;

    /**
     * <p>
     * The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value is
     * <code>SELF_MANAGED_SECURITY_HUB</code>.
     * </p>
     * 
     * @param configurationPolicyId
     *        The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value
     *        is <code>SELF_MANAGED_SECURITY_HUB</code>.
     */

    public void setConfigurationPolicyId(String configurationPolicyId) {
        this.configurationPolicyId = configurationPolicyId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value is
     * <code>SELF_MANAGED_SECURITY_HUB</code>.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value
     *         is <code>SELF_MANAGED_SECURITY_HUB</code>.
     */

    public String getConfigurationPolicyId() {
        return this.configurationPolicyId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value is
     * <code>SELF_MANAGED_SECURITY_HUB</code>.
     * </p>
     * 
     * @param configurationPolicyId
     *        The universally unique identifier (UUID) of a configuration policy. For self-managed behavior, the value
     *        is <code>SELF_MANAGED_SECURITY_HUB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyAssociationResult withConfigurationPolicyId(String configurationPolicyId) {
        setConfigurationPolicyId(configurationPolicyId);
        return this;
    }

    /**
     * <p>
     * The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     * </p>
     * 
     * @param targetId
     *        The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     * </p>
     * 
     * @return The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     * </p>
     * 
     * @param targetId
     *        The target account ID, organizational unit ID, or the root ID for which the association is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyAssociationResult withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization root.
     * </p>
     * 
     * @param targetType
     *        Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization
     *        root.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization root.
     * </p>
     * 
     * @return Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization
     *         root.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization root.
     * </p>
     * 
     * @param targetType
     *        Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization
     *        root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public GetConfigurationPolicyAssociationResult withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization root.
     * </p>
     * 
     * @param targetType
     *        Specifies whether the target is an Amazon Web Services account, organizational unit, or the organization
     *        root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public GetConfigurationPolicyAssociationResult withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the association between the specified target and the configuration was directly applied by the
     * Security Hub delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between the specified target and the configuration was directly applied
     *        by the Security Hub delegated administrator or inherited from a parent.
     * @see AssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * Indicates whether the association between the specified target and the configuration was directly applied by the
     * Security Hub delegated administrator or inherited from a parent.
     * </p>
     * 
     * @return Indicates whether the association between the specified target and the configuration was directly applied
     *         by the Security Hub delegated administrator or inherited from a parent.
     * @see AssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * Indicates whether the association between the specified target and the configuration was directly applied by the
     * Security Hub delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between the specified target and the configuration was directly applied
     *        by the Security Hub delegated administrator or inherited from a parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public GetConfigurationPolicyAssociationResult withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the association between the specified target and the configuration was directly applied by the
     * Security Hub delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between the specified target and the configuration was directly applied
     *        by the Security Hub delegated administrator or inherited from a parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public GetConfigurationPolicyAssociationResult withAssociationType(AssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     * </p>
     * 
     * @return The date and time, in UTC and ISO 8601 format, that the configuration policy association was last
     *         updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyAssociationResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the association between the specified target and the configuration.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between the specified target and the configuration.
     * @see ConfigurationPolicyAssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The current status of the association between the specified target and the configuration.
     * </p>
     * 
     * @return The current status of the association between the specified target and the configuration.
     * @see ConfigurationPolicyAssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The current status of the association between the specified target and the configuration.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between the specified target and the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationPolicyAssociationStatus
     */

    public GetConfigurationPolicyAssociationResult withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the association between the specified target and the configuration.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between the specified target and the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationPolicyAssociationStatus
     */

    public GetConfigurationPolicyAssociationResult withAssociationStatus(ConfigurationPolicyAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     * </p>
     * 
     * @param associationStatusMessage
     *        The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     */

    public void setAssociationStatusMessage(String associationStatusMessage) {
        this.associationStatusMessage = associationStatusMessage;
    }

    /**
     * <p>
     * The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     * </p>
     * 
     * @return The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     */

    public String getAssociationStatusMessage() {
        return this.associationStatusMessage;
    }

    /**
     * <p>
     * The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     * </p>
     * 
     * @param associationStatusMessage
     *        The explanation for a <code>FAILED</code> value for <code>AssociationStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyAssociationResult withAssociationStatusMessage(String associationStatusMessage) {
        setAssociationStatusMessage(associationStatusMessage);
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
        if (getConfigurationPolicyId() != null)
            sb.append("ConfigurationPolicyId: ").append(getConfigurationPolicyId()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getAssociationStatusMessage() != null)
            sb.append("AssociationStatusMessage: ").append(getAssociationStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationPolicyAssociationResult == false)
            return false;
        GetConfigurationPolicyAssociationResult other = (GetConfigurationPolicyAssociationResult) obj;
        if (other.getConfigurationPolicyId() == null ^ this.getConfigurationPolicyId() == null)
            return false;
        if (other.getConfigurationPolicyId() != null && other.getConfigurationPolicyId().equals(this.getConfigurationPolicyId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getAssociationStatusMessage() == null ^ this.getAssociationStatusMessage() == null)
            return false;
        if (other.getAssociationStatusMessage() != null && other.getAssociationStatusMessage().equals(this.getAssociationStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationPolicyId() == null) ? 0 : getConfigurationPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatusMessage() == null) ? 0 : getAssociationStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationPolicyAssociationResult clone() {
        try {
            return (GetConfigurationPolicyAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
