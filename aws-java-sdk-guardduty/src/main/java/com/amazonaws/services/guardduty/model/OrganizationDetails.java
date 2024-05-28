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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about GuardDuty coverage statistics for members in your Amazon Web Services organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp at which the organization statistics was last updated. This is in UTC format.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     * </p>
     */
    private OrganizationStatistics organizationStatistics;

    /**
     * <p>
     * The timestamp at which the organization statistics was last updated. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the organization statistics was last updated. This is in UTC format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the organization statistics was last updated. This is in UTC format.
     * </p>
     * 
     * @return The timestamp at which the organization statistics was last updated. This is in UTC format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the organization statistics was last updated. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the organization statistics was last updated. This is in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationDetails withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     * </p>
     * 
     * @param organizationStatistics
     *        Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     */

    public void setOrganizationStatistics(OrganizationStatistics organizationStatistics) {
        this.organizationStatistics = organizationStatistics;
    }

    /**
     * <p>
     * Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     * </p>
     * 
     * @return Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     */

    public OrganizationStatistics getOrganizationStatistics() {
        return this.organizationStatistics;
    }

    /**
     * <p>
     * Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     * </p>
     * 
     * @param organizationStatistics
     *        Information about the GuardDuty coverage statistics for members in your Amazon Web Services organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationDetails withOrganizationStatistics(OrganizationStatistics organizationStatistics) {
        setOrganizationStatistics(organizationStatistics);
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
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getOrganizationStatistics() != null)
            sb.append("OrganizationStatistics: ").append(getOrganizationStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationDetails == false)
            return false;
        OrganizationDetails other = (OrganizationDetails) obj;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getOrganizationStatistics() == null ^ this.getOrganizationStatistics() == null)
            return false;
        if (other.getOrganizationStatistics() != null && other.getOrganizationStatistics().equals(this.getOrganizationStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getOrganizationStatistics() == null) ? 0 : getOrganizationStatistics().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationDetails clone() {
        try {
            return (OrganizationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
