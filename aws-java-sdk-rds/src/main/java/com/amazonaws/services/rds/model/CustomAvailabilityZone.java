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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A custom Availability Zone (AZ) is an on-premises AZ that is integrated with a VMware vSphere cluster.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User
 * Guide.</i> </a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CustomAvailabilityZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAvailabilityZone implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     */
    private String customAvailabilityZoneId;
    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     */
    private String customAvailabilityZoneName;
    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     */
    private String customAvailabilityZoneStatus;
    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
     * </p>
     */
    private VpnDetails vpnDetails;

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The identifier of the custom AZ.</p>
     *        <p>
     *        Amazon RDS generates a unique identifier when a custom AZ is created.
     */

    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     * 
     * @return The identifier of the custom AZ.</p>
     *         <p>
     *         Amazon RDS generates a unique identifier when a custom AZ is created.
     */

    public String getCustomAvailabilityZoneId() {
        return this.customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The identifier of the custom AZ.</p>
     *        <p>
     *        Amazon RDS generates a unique identifier when a custom AZ is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAvailabilityZone withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        setCustomAvailabilityZoneId(customAvailabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     * 
     * @param customAvailabilityZoneName
     *        The name of the custom AZ.
     */

    public void setCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     * 
     * @return The name of the custom AZ.
     */

    public String getCustomAvailabilityZoneName() {
        return this.customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     * 
     * @param customAvailabilityZoneName
     *        The name of the custom AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAvailabilityZone withCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        setCustomAvailabilityZoneName(customAvailabilityZoneName);
        return this;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     * 
     * @param customAvailabilityZoneStatus
     *        The status of the custom AZ.
     */

    public void setCustomAvailabilityZoneStatus(String customAvailabilityZoneStatus) {
        this.customAvailabilityZoneStatus = customAvailabilityZoneStatus;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     * 
     * @return The status of the custom AZ.
     */

    public String getCustomAvailabilityZoneStatus() {
        return this.customAvailabilityZoneStatus;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     * 
     * @param customAvailabilityZoneStatus
     *        The status of the custom AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAvailabilityZone withCustomAvailabilityZoneStatus(String customAvailabilityZoneStatus) {
        setCustomAvailabilityZoneStatus(customAvailabilityZoneStatus);
        return this;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
     * </p>
     * 
     * @param vpnDetails
     *        Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS
     *        website.
     */

    public void setVpnDetails(VpnDetails vpnDetails) {
        this.vpnDetails = vpnDetails;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
     * </p>
     * 
     * @return Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS
     *         website.
     */

    public VpnDetails getVpnDetails() {
        return this.vpnDetails;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
     * </p>
     * 
     * @param vpnDetails
     *        Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS
     *        website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAvailabilityZone withVpnDetails(VpnDetails vpnDetails) {
        setVpnDetails(vpnDetails);
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
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: ").append(getCustomAvailabilityZoneId()).append(",");
        if (getCustomAvailabilityZoneName() != null)
            sb.append("CustomAvailabilityZoneName: ").append(getCustomAvailabilityZoneName()).append(",");
        if (getCustomAvailabilityZoneStatus() != null)
            sb.append("CustomAvailabilityZoneStatus: ").append(getCustomAvailabilityZoneStatus()).append(",");
        if (getVpnDetails() != null)
            sb.append("VpnDetails: ").append(getVpnDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAvailabilityZone == false)
            return false;
        CustomAvailabilityZone other = (CustomAvailabilityZone) obj;
        if (other.getCustomAvailabilityZoneId() == null ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        if (other.getCustomAvailabilityZoneName() == null ^ this.getCustomAvailabilityZoneName() == null)
            return false;
        if (other.getCustomAvailabilityZoneName() != null && other.getCustomAvailabilityZoneName().equals(this.getCustomAvailabilityZoneName()) == false)
            return false;
        if (other.getCustomAvailabilityZoneStatus() == null ^ this.getCustomAvailabilityZoneStatus() == null)
            return false;
        if (other.getCustomAvailabilityZoneStatus() != null && other.getCustomAvailabilityZoneStatus().equals(this.getCustomAvailabilityZoneStatus()) == false)
            return false;
        if (other.getVpnDetails() == null ^ this.getVpnDetails() == null)
            return false;
        if (other.getVpnDetails() != null && other.getVpnDetails().equals(this.getVpnDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getCustomAvailabilityZoneName() == null) ? 0 : getCustomAvailabilityZoneName().hashCode());
        hashCode = prime * hashCode + ((getCustomAvailabilityZoneStatus() == null) ? 0 : getCustomAvailabilityZoneStatus().hashCode());
        hashCode = prime * hashCode + ((getVpnDetails() == null) ? 0 : getVpnDetails().hashCode());
        return hashCode;
    }

    @Override
    public CustomAvailabilityZone clone() {
        try {
            return (CustomAvailabilityZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
