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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options for filtering the <code>ListConfigurationPolicyAssociations</code> response. You can filter by the Amazon
 * Resource Name (ARN) or universally unique identifier (UUID) of a configuration policy, <code>AssociationType</code>,
 * or <code>AssociationStatus</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AssociationFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN or UUID of the configuration policy.
     * </p>
     */
    private String configurationPolicyId;
    /**
     * <p>
     * Indicates whether the association between a target and a configuration was directly applied by the Security Hub
     * delegated administrator or inherited from a parent.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The current status of the association between a target and a configuration policy.
     * </p>
     */
    private String associationStatus;

    /**
     * <p>
     * The ARN or UUID of the configuration policy.
     * </p>
     * 
     * @param configurationPolicyId
     *        The ARN or UUID of the configuration policy.
     */

    public void setConfigurationPolicyId(String configurationPolicyId) {
        this.configurationPolicyId = configurationPolicyId;
    }

    /**
     * <p>
     * The ARN or UUID of the configuration policy.
     * </p>
     * 
     * @return The ARN or UUID of the configuration policy.
     */

    public String getConfigurationPolicyId() {
        return this.configurationPolicyId;
    }

    /**
     * <p>
     * The ARN or UUID of the configuration policy.
     * </p>
     * 
     * @param configurationPolicyId
     *        The ARN or UUID of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationFilters withConfigurationPolicyId(String configurationPolicyId) {
        setConfigurationPolicyId(configurationPolicyId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the association between a target and a configuration was directly applied by the Security Hub
     * delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between a target and a configuration was directly applied by the
     *        Security Hub delegated administrator or inherited from a parent.
     * @see AssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * Indicates whether the association between a target and a configuration was directly applied by the Security Hub
     * delegated administrator or inherited from a parent.
     * </p>
     * 
     * @return Indicates whether the association between a target and a configuration was directly applied by the
     *         Security Hub delegated administrator or inherited from a parent.
     * @see AssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * Indicates whether the association between a target and a configuration was directly applied by the Security Hub
     * delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between a target and a configuration was directly applied by the
     *        Security Hub delegated administrator or inherited from a parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public AssociationFilters withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the association between a target and a configuration was directly applied by the Security Hub
     * delegated administrator or inherited from a parent.
     * </p>
     * 
     * @param associationType
     *        Indicates whether the association between a target and a configuration was directly applied by the
     *        Security Hub delegated administrator or inherited from a parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public AssociationFilters withAssociationType(AssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the association between a target and a configuration policy.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between a target and a configuration policy.
     * @see ConfigurationPolicyAssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The current status of the association between a target and a configuration policy.
     * </p>
     * 
     * @return The current status of the association between a target and a configuration policy.
     * @see ConfigurationPolicyAssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The current status of the association between a target and a configuration policy.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between a target and a configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationPolicyAssociationStatus
     */

    public AssociationFilters withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the association between a target and a configuration policy.
     * </p>
     * 
     * @param associationStatus
     *        The current status of the association between a target and a configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationPolicyAssociationStatus
     */

    public AssociationFilters withAssociationStatus(ConfigurationPolicyAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
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
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationFilters == false)
            return false;
        AssociationFilters other = (AssociationFilters) obj;
        if (other.getConfigurationPolicyId() == null ^ this.getConfigurationPolicyId() == null)
            return false;
        if (other.getConfigurationPolicyId() != null && other.getConfigurationPolicyId().equals(this.getConfigurationPolicyId()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationPolicyId() == null) ? 0 : getConfigurationPolicyId().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        return hashCode;
    }

    @Override
    public AssociationFilters clone() {
        try {
            return (AssociationFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AssociationFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
