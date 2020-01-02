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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize
 * data from AWS Organizations or, if an AWS Organization is not present, from multiple AWS Regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceDataSyncAwsOrganizationsSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncAwsOrganizationsSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     * <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of
     * organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization.
     * </p>
     */
    private String organizationSourceType;
    /**
     * <p>
     * The AWS Organizations organization units included in the sync.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceDataSyncOrganizationalUnit> organizationalUnits;

    /**
     * <p>
     * If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     * <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of
     * organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization.
     * </p>
     * 
     * @param organizationSourceType
     *        If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     *        <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set
     *        of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS
     *        Organization.
     */

    public void setOrganizationSourceType(String organizationSourceType) {
        this.organizationSourceType = organizationSourceType;
    }

    /**
     * <p>
     * If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     * <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of
     * organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization.
     * </p>
     * 
     * @return If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     *         <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set
     *         of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS
     *         Organization.
     */

    public String getOrganizationSourceType() {
        return this.organizationSourceType;
    }

    /**
     * <p>
     * If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     * <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set of
     * organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS Organization.
     * </p>
     * 
     * @param organizationSourceType
     *        If an AWS Organization is present, this is either <code>OrganizationalUnits</code> or
     *        <code>EntireOrganization</code>. For <code>OrganizationalUnits</code>, the data is aggregated from a set
     *        of organization units. For <code>EntireOrganization</code>, the data is aggregated from the entire AWS
     *        Organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncAwsOrganizationsSource withOrganizationSourceType(String organizationSourceType) {
        setOrganizationSourceType(organizationSourceType);
        return this;
    }

    /**
     * <p>
     * The AWS Organizations organization units included in the sync.
     * </p>
     * 
     * @return The AWS Organizations organization units included in the sync.
     */

    public java.util.List<ResourceDataSyncOrganizationalUnit> getOrganizationalUnits() {
        if (organizationalUnits == null) {
            organizationalUnits = new com.amazonaws.internal.SdkInternalList<ResourceDataSyncOrganizationalUnit>();
        }
        return organizationalUnits;
    }

    /**
     * <p>
     * The AWS Organizations organization units included in the sync.
     * </p>
     * 
     * @param organizationalUnits
     *        The AWS Organizations organization units included in the sync.
     */

    public void setOrganizationalUnits(java.util.Collection<ResourceDataSyncOrganizationalUnit> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new com.amazonaws.internal.SdkInternalList<ResourceDataSyncOrganizationalUnit>(organizationalUnits);
    }

    /**
     * <p>
     * The AWS Organizations organization units included in the sync.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnits(java.util.Collection)} or {@link #withOrganizationalUnits(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnits
     *        The AWS Organizations organization units included in the sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncAwsOrganizationsSource withOrganizationalUnits(ResourceDataSyncOrganizationalUnit... organizationalUnits) {
        if (this.organizationalUnits == null) {
            setOrganizationalUnits(new com.amazonaws.internal.SdkInternalList<ResourceDataSyncOrganizationalUnit>(organizationalUnits.length));
        }
        for (ResourceDataSyncOrganizationalUnit ele : organizationalUnits) {
            this.organizationalUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Organizations organization units included in the sync.
     * </p>
     * 
     * @param organizationalUnits
     *        The AWS Organizations organization units included in the sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncAwsOrganizationsSource withOrganizationalUnits(java.util.Collection<ResourceDataSyncOrganizationalUnit> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
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
        if (getOrganizationSourceType() != null)
            sb.append("OrganizationSourceType: ").append(getOrganizationSourceType()).append(",");
        if (getOrganizationalUnits() != null)
            sb.append("OrganizationalUnits: ").append(getOrganizationalUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncAwsOrganizationsSource == false)
            return false;
        ResourceDataSyncAwsOrganizationsSource other = (ResourceDataSyncAwsOrganizationsSource) obj;
        if (other.getOrganizationSourceType() == null ^ this.getOrganizationSourceType() == null)
            return false;
        if (other.getOrganizationSourceType() != null && other.getOrganizationSourceType().equals(this.getOrganizationSourceType()) == false)
            return false;
        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null)
            return false;
        if (other.getOrganizationalUnits() != null && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationSourceType() == null) ? 0 : getOrganizationSourceType().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataSyncAwsOrganizationsSource clone() {
        try {
            return (ResourceDataSyncAwsOrganizationsSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceDataSyncAwsOrganizationsSourceMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
