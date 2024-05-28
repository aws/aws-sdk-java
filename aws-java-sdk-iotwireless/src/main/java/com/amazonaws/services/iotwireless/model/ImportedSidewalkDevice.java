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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Sidewalk device that has been added to an import task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ImportedSidewalkDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportedSidewalkDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     * </p>
     */
    private String sidewalkManufacturingSn;
    /**
     * <p>
     * The onboarding status of the Sidewalk device in the import task.
     * </p>
     */
    private String onboardingStatus;
    /**
     * <p>
     * The reason for the onboarding status information for the Sidewalk device.
     * </p>
     */
    private String onboardingStatusReason;
    /**
     * <p>
     * The time at which the status information was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     * </p>
     * 
     * @param sidewalkManufacturingSn
     *        The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     */

    public void setSidewalkManufacturingSn(String sidewalkManufacturingSn) {
        this.sidewalkManufacturingSn = sidewalkManufacturingSn;
    }

    /**
     * <p>
     * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     * </p>
     * 
     * @return The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     */

    public String getSidewalkManufacturingSn() {
        return this.sidewalkManufacturingSn;
    }

    /**
     * <p>
     * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     * </p>
     * 
     * @param sidewalkManufacturingSn
     *        The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportedSidewalkDevice withSidewalkManufacturingSn(String sidewalkManufacturingSn) {
        setSidewalkManufacturingSn(sidewalkManufacturingSn);
        return this;
    }

    /**
     * <p>
     * The onboarding status of the Sidewalk device in the import task.
     * </p>
     * 
     * @param onboardingStatus
     *        The onboarding status of the Sidewalk device in the import task.
     * @see OnboardStatus
     */

    public void setOnboardingStatus(String onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
    }

    /**
     * <p>
     * The onboarding status of the Sidewalk device in the import task.
     * </p>
     * 
     * @return The onboarding status of the Sidewalk device in the import task.
     * @see OnboardStatus
     */

    public String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    /**
     * <p>
     * The onboarding status of the Sidewalk device in the import task.
     * </p>
     * 
     * @param onboardingStatus
     *        The onboarding status of the Sidewalk device in the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardStatus
     */

    public ImportedSidewalkDevice withOnboardingStatus(String onboardingStatus) {
        setOnboardingStatus(onboardingStatus);
        return this;
    }

    /**
     * <p>
     * The onboarding status of the Sidewalk device in the import task.
     * </p>
     * 
     * @param onboardingStatus
     *        The onboarding status of the Sidewalk device in the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardStatus
     */

    public ImportedSidewalkDevice withOnboardingStatus(OnboardStatus onboardingStatus) {
        this.onboardingStatus = onboardingStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the onboarding status information for the Sidewalk device.
     * </p>
     * 
     * @param onboardingStatusReason
     *        The reason for the onboarding status information for the Sidewalk device.
     */

    public void setOnboardingStatusReason(String onboardingStatusReason) {
        this.onboardingStatusReason = onboardingStatusReason;
    }

    /**
     * <p>
     * The reason for the onboarding status information for the Sidewalk device.
     * </p>
     * 
     * @return The reason for the onboarding status information for the Sidewalk device.
     */

    public String getOnboardingStatusReason() {
        return this.onboardingStatusReason;
    }

    /**
     * <p>
     * The reason for the onboarding status information for the Sidewalk device.
     * </p>
     * 
     * @param onboardingStatusReason
     *        The reason for the onboarding status information for the Sidewalk device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportedSidewalkDevice withOnboardingStatusReason(String onboardingStatusReason) {
        setOnboardingStatusReason(onboardingStatusReason);
        return this;
    }

    /**
     * <p>
     * The time at which the status information was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time at which the status information was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time at which the status information was last updated.
     * </p>
     * 
     * @return The time at which the status information was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time at which the status information was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time at which the status information was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportedSidewalkDevice withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getSidewalkManufacturingSn() != null)
            sb.append("SidewalkManufacturingSn: ").append(getSidewalkManufacturingSn()).append(",");
        if (getOnboardingStatus() != null)
            sb.append("OnboardingStatus: ").append(getOnboardingStatus()).append(",");
        if (getOnboardingStatusReason() != null)
            sb.append("OnboardingStatusReason: ").append(getOnboardingStatusReason()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportedSidewalkDevice == false)
            return false;
        ImportedSidewalkDevice other = (ImportedSidewalkDevice) obj;
        if (other.getSidewalkManufacturingSn() == null ^ this.getSidewalkManufacturingSn() == null)
            return false;
        if (other.getSidewalkManufacturingSn() != null && other.getSidewalkManufacturingSn().equals(this.getSidewalkManufacturingSn()) == false)
            return false;
        if (other.getOnboardingStatus() == null ^ this.getOnboardingStatus() == null)
            return false;
        if (other.getOnboardingStatus() != null && other.getOnboardingStatus().equals(this.getOnboardingStatus()) == false)
            return false;
        if (other.getOnboardingStatusReason() == null ^ this.getOnboardingStatusReason() == null)
            return false;
        if (other.getOnboardingStatusReason() != null && other.getOnboardingStatusReason().equals(this.getOnboardingStatusReason()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalkManufacturingSn() == null) ? 0 : getSidewalkManufacturingSn().hashCode());
        hashCode = prime * hashCode + ((getOnboardingStatus() == null) ? 0 : getOnboardingStatus().hashCode());
        hashCode = prime * hashCode + ((getOnboardingStatusReason() == null) ? 0 : getOnboardingStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ImportedSidewalkDevice clone() {
        try {
            return (ImportedSidewalkDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.ImportedSidewalkDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
