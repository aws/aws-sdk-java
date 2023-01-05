/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the settings defined for discovering Linux subscriptions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/LinuxSubscriptionsDiscoverySettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxSubscriptionsDiscoverySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details if you have enabled resource discovery across your accounts in Organizations.
     * </p>
     */
    private String organizationIntegration;
    /**
     * <p>
     * The Regions in which to discover data for Linux subscriptions.
     * </p>
     */
    private java.util.List<String> sourceRegions;

    /**
     * <p>
     * Details if you have enabled resource discovery across your accounts in Organizations.
     * </p>
     * 
     * @param organizationIntegration
     *        Details if you have enabled resource discovery across your accounts in Organizations.
     * @see OrganizationIntegration
     */

    public void setOrganizationIntegration(String organizationIntegration) {
        this.organizationIntegration = organizationIntegration;
    }

    /**
     * <p>
     * Details if you have enabled resource discovery across your accounts in Organizations.
     * </p>
     * 
     * @return Details if you have enabled resource discovery across your accounts in Organizations.
     * @see OrganizationIntegration
     */

    public String getOrganizationIntegration() {
        return this.organizationIntegration;
    }

    /**
     * <p>
     * Details if you have enabled resource discovery across your accounts in Organizations.
     * </p>
     * 
     * @param organizationIntegration
     *        Details if you have enabled resource discovery across your accounts in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationIntegration
     */

    public LinuxSubscriptionsDiscoverySettings withOrganizationIntegration(String organizationIntegration) {
        setOrganizationIntegration(organizationIntegration);
        return this;
    }

    /**
     * <p>
     * Details if you have enabled resource discovery across your accounts in Organizations.
     * </p>
     * 
     * @param organizationIntegration
     *        Details if you have enabled resource discovery across your accounts in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationIntegration
     */

    public LinuxSubscriptionsDiscoverySettings withOrganizationIntegration(OrganizationIntegration organizationIntegration) {
        this.organizationIntegration = organizationIntegration.toString();
        return this;
    }

    /**
     * <p>
     * The Regions in which to discover data for Linux subscriptions.
     * </p>
     * 
     * @return The Regions in which to discover data for Linux subscriptions.
     */

    public java.util.List<String> getSourceRegions() {
        return sourceRegions;
    }

    /**
     * <p>
     * The Regions in which to discover data for Linux subscriptions.
     * </p>
     * 
     * @param sourceRegions
     *        The Regions in which to discover data for Linux subscriptions.
     */

    public void setSourceRegions(java.util.Collection<String> sourceRegions) {
        if (sourceRegions == null) {
            this.sourceRegions = null;
            return;
        }

        this.sourceRegions = new java.util.ArrayList<String>(sourceRegions);
    }

    /**
     * <p>
     * The Regions in which to discover data for Linux subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceRegions(java.util.Collection)} or {@link #withSourceRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceRegions
     *        The Regions in which to discover data for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxSubscriptionsDiscoverySettings withSourceRegions(String... sourceRegions) {
        if (this.sourceRegions == null) {
            setSourceRegions(new java.util.ArrayList<String>(sourceRegions.length));
        }
        for (String ele : sourceRegions) {
            this.sourceRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions in which to discover data for Linux subscriptions.
     * </p>
     * 
     * @param sourceRegions
     *        The Regions in which to discover data for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxSubscriptionsDiscoverySettings withSourceRegions(java.util.Collection<String> sourceRegions) {
        setSourceRegions(sourceRegions);
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
        if (getOrganizationIntegration() != null)
            sb.append("OrganizationIntegration: ").append(getOrganizationIntegration()).append(",");
        if (getSourceRegions() != null)
            sb.append("SourceRegions: ").append(getSourceRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinuxSubscriptionsDiscoverySettings == false)
            return false;
        LinuxSubscriptionsDiscoverySettings other = (LinuxSubscriptionsDiscoverySettings) obj;
        if (other.getOrganizationIntegration() == null ^ this.getOrganizationIntegration() == null)
            return false;
        if (other.getOrganizationIntegration() != null && other.getOrganizationIntegration().equals(this.getOrganizationIntegration()) == false)
            return false;
        if (other.getSourceRegions() == null ^ this.getSourceRegions() == null)
            return false;
        if (other.getSourceRegions() != null && other.getSourceRegions().equals(this.getSourceRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationIntegration() == null) ? 0 : getOrganizationIntegration().hashCode());
        hashCode = prime * hashCode + ((getSourceRegions() == null) ? 0 : getSourceRegions().hashCode());
        return hashCode;
    }

    @Override
    public LinuxSubscriptionsDiscoverySettings clone() {
        try {
            return (LinuxSubscriptionsDiscoverySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform.LinuxSubscriptionsDiscoverySettingsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
