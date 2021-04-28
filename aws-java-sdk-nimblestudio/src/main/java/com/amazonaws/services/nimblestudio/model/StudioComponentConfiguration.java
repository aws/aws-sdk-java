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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the studio component, based on component type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StudioComponentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     * </p>
     */
    private ActiveDirectoryConfiguration activeDirectoryConfiguration;
    /**
     * <p>
     * The configuration for a render farm that is associated with a studio resource.
     * </p>
     */
    private ComputeFarmConfiguration computeFarmConfiguration;
    /**
     * <p>
     * The configuration for a license service that is associated with a studio resource.
     * </p>
     */
    private LicenseServiceConfiguration licenseServiceConfiguration;
    /**
     * <p>
     * The configuration for a shared file storage system that is associated with a studio resource.
     * </p>
     */
    private SharedFileSystemConfiguration sharedFileSystemConfiguration;

    /**
     * <p>
     * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     */

    public void setActiveDirectoryConfiguration(ActiveDirectoryConfiguration activeDirectoryConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     * </p>
     * 
     * @return The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     */

    public ActiveDirectoryConfiguration getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentConfiguration withActiveDirectoryConfiguration(ActiveDirectoryConfiguration activeDirectoryConfiguration) {
        setActiveDirectoryConfiguration(activeDirectoryConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for a render farm that is associated with a studio resource.
     * </p>
     * 
     * @param computeFarmConfiguration
     *        The configuration for a render farm that is associated with a studio resource.
     */

    public void setComputeFarmConfiguration(ComputeFarmConfiguration computeFarmConfiguration) {
        this.computeFarmConfiguration = computeFarmConfiguration;
    }

    /**
     * <p>
     * The configuration for a render farm that is associated with a studio resource.
     * </p>
     * 
     * @return The configuration for a render farm that is associated with a studio resource.
     */

    public ComputeFarmConfiguration getComputeFarmConfiguration() {
        return this.computeFarmConfiguration;
    }

    /**
     * <p>
     * The configuration for a render farm that is associated with a studio resource.
     * </p>
     * 
     * @param computeFarmConfiguration
     *        The configuration for a render farm that is associated with a studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentConfiguration withComputeFarmConfiguration(ComputeFarmConfiguration computeFarmConfiguration) {
        setComputeFarmConfiguration(computeFarmConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for a license service that is associated with a studio resource.
     * </p>
     * 
     * @param licenseServiceConfiguration
     *        The configuration for a license service that is associated with a studio resource.
     */

    public void setLicenseServiceConfiguration(LicenseServiceConfiguration licenseServiceConfiguration) {
        this.licenseServiceConfiguration = licenseServiceConfiguration;
    }

    /**
     * <p>
     * The configuration for a license service that is associated with a studio resource.
     * </p>
     * 
     * @return The configuration for a license service that is associated with a studio resource.
     */

    public LicenseServiceConfiguration getLicenseServiceConfiguration() {
        return this.licenseServiceConfiguration;
    }

    /**
     * <p>
     * The configuration for a license service that is associated with a studio resource.
     * </p>
     * 
     * @param licenseServiceConfiguration
     *        The configuration for a license service that is associated with a studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentConfiguration withLicenseServiceConfiguration(LicenseServiceConfiguration licenseServiceConfiguration) {
        setLicenseServiceConfiguration(licenseServiceConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for a shared file storage system that is associated with a studio resource.
     * </p>
     * 
     * @param sharedFileSystemConfiguration
     *        The configuration for a shared file storage system that is associated with a studio resource.
     */

    public void setSharedFileSystemConfiguration(SharedFileSystemConfiguration sharedFileSystemConfiguration) {
        this.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
    }

    /**
     * <p>
     * The configuration for a shared file storage system that is associated with a studio resource.
     * </p>
     * 
     * @return The configuration for a shared file storage system that is associated with a studio resource.
     */

    public SharedFileSystemConfiguration getSharedFileSystemConfiguration() {
        return this.sharedFileSystemConfiguration;
    }

    /**
     * <p>
     * The configuration for a shared file storage system that is associated with a studio resource.
     * </p>
     * 
     * @param sharedFileSystemConfiguration
     *        The configuration for a shared file storage system that is associated with a studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentConfiguration withSharedFileSystemConfiguration(SharedFileSystemConfiguration sharedFileSystemConfiguration) {
        setSharedFileSystemConfiguration(sharedFileSystemConfiguration);
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
        if (getActiveDirectoryConfiguration() != null)
            sb.append("ActiveDirectoryConfiguration: ").append(getActiveDirectoryConfiguration()).append(",");
        if (getComputeFarmConfiguration() != null)
            sb.append("ComputeFarmConfiguration: ").append(getComputeFarmConfiguration()).append(",");
        if (getLicenseServiceConfiguration() != null)
            sb.append("LicenseServiceConfiguration: ").append(getLicenseServiceConfiguration()).append(",");
        if (getSharedFileSystemConfiguration() != null)
            sb.append("SharedFileSystemConfiguration: ").append(getSharedFileSystemConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioComponentConfiguration == false)
            return false;
        StudioComponentConfiguration other = (StudioComponentConfiguration) obj;
        if (other.getActiveDirectoryConfiguration() == null ^ this.getActiveDirectoryConfiguration() == null)
            return false;
        if (other.getActiveDirectoryConfiguration() != null && other.getActiveDirectoryConfiguration().equals(this.getActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getComputeFarmConfiguration() == null ^ this.getComputeFarmConfiguration() == null)
            return false;
        if (other.getComputeFarmConfiguration() != null && other.getComputeFarmConfiguration().equals(this.getComputeFarmConfiguration()) == false)
            return false;
        if (other.getLicenseServiceConfiguration() == null ^ this.getLicenseServiceConfiguration() == null)
            return false;
        if (other.getLicenseServiceConfiguration() != null && other.getLicenseServiceConfiguration().equals(this.getLicenseServiceConfiguration()) == false)
            return false;
        if (other.getSharedFileSystemConfiguration() == null ^ this.getSharedFileSystemConfiguration() == null)
            return false;
        if (other.getSharedFileSystemConfiguration() != null
                && other.getSharedFileSystemConfiguration().equals(this.getSharedFileSystemConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryConfiguration() == null) ? 0 : getActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getComputeFarmConfiguration() == null) ? 0 : getComputeFarmConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLicenseServiceConfiguration() == null) ? 0 : getLicenseServiceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSharedFileSystemConfiguration() == null) ? 0 : getSharedFileSystemConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StudioComponentConfiguration clone() {
        try {
            return (StudioComponentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioComponentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
