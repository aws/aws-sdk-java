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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the software on the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/SoftwareInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SoftwareInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the software that is installed or that is being installed on the device.
     * </p>
     */
    private String installState;
    /**
     * <p>
     * The version of the software currently installed on the device.
     * </p>
     */
    private String installedVersion;
    /**
     * <p>
     * The version of the software being installed on the device.
     * </p>
     */
    private String installingVersion;

    /**
     * <p>
     * The state of the software that is installed or that is being installed on the device.
     * </p>
     * 
     * @param installState
     *        The state of the software that is installed or that is being installed on the device.
     */

    public void setInstallState(String installState) {
        this.installState = installState;
    }

    /**
     * <p>
     * The state of the software that is installed or that is being installed on the device.
     * </p>
     * 
     * @return The state of the software that is installed or that is being installed on the device.
     */

    public String getInstallState() {
        return this.installState;
    }

    /**
     * <p>
     * The state of the software that is installed or that is being installed on the device.
     * </p>
     * 
     * @param installState
     *        The state of the software that is installed or that is being installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareInformation withInstallState(String installState) {
        setInstallState(installState);
        return this;
    }

    /**
     * <p>
     * The version of the software currently installed on the device.
     * </p>
     * 
     * @param installedVersion
     *        The version of the software currently installed on the device.
     */

    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    /**
     * <p>
     * The version of the software currently installed on the device.
     * </p>
     * 
     * @return The version of the software currently installed on the device.
     */

    public String getInstalledVersion() {
        return this.installedVersion;
    }

    /**
     * <p>
     * The version of the software currently installed on the device.
     * </p>
     * 
     * @param installedVersion
     *        The version of the software currently installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareInformation withInstalledVersion(String installedVersion) {
        setInstalledVersion(installedVersion);
        return this;
    }

    /**
     * <p>
     * The version of the software being installed on the device.
     * </p>
     * 
     * @param installingVersion
     *        The version of the software being installed on the device.
     */

    public void setInstallingVersion(String installingVersion) {
        this.installingVersion = installingVersion;
    }

    /**
     * <p>
     * The version of the software being installed on the device.
     * </p>
     * 
     * @return The version of the software being installed on the device.
     */

    public String getInstallingVersion() {
        return this.installingVersion;
    }

    /**
     * <p>
     * The version of the software being installed on the device.
     * </p>
     * 
     * @param installingVersion
     *        The version of the software being installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareInformation withInstallingVersion(String installingVersion) {
        setInstallingVersion(installingVersion);
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
        if (getInstallState() != null)
            sb.append("InstallState: ").append(getInstallState()).append(",");
        if (getInstalledVersion() != null)
            sb.append("InstalledVersion: ").append(getInstalledVersion()).append(",");
        if (getInstallingVersion() != null)
            sb.append("InstallingVersion: ").append(getInstallingVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SoftwareInformation == false)
            return false;
        SoftwareInformation other = (SoftwareInformation) obj;
        if (other.getInstallState() == null ^ this.getInstallState() == null)
            return false;
        if (other.getInstallState() != null && other.getInstallState().equals(this.getInstallState()) == false)
            return false;
        if (other.getInstalledVersion() == null ^ this.getInstalledVersion() == null)
            return false;
        if (other.getInstalledVersion() != null && other.getInstalledVersion().equals(this.getInstalledVersion()) == false)
            return false;
        if (other.getInstallingVersion() == null ^ this.getInstallingVersion() == null)
            return false;
        if (other.getInstallingVersion() != null && other.getInstallingVersion().equals(this.getInstallingVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstallState() == null) ? 0 : getInstallState().hashCode());
        hashCode = prime * hashCode + ((getInstalledVersion() == null) ? 0 : getInstalledVersion().hashCode());
        hashCode = prime * hashCode + ((getInstallingVersion() == null) ? 0 : getInstallingVersion().hashCode());
        return hashCode;
    }

    @Override
    public SoftwareInformation clone() {
        try {
            return (SoftwareInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.SoftwareInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
