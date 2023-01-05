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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GatewayDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The display name of the gateway.
     * </p>
     */
    private String gatewayDisplayName;
    /**
     * <p>
     * The type of the gateway type.
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * The hypervisor ID of the gateway.
     * </p>
     */
    private String hypervisorId;
    /**
     * <p>
     * Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     * </p>
     */
    private java.util.Date lastSeenTime;
    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone. Can be weekly or monthly.
     * </p>
     */
    private MaintenanceStartTime maintenanceStartTime;
    /**
     * <p>
     * Details showing the next update availability time of the gateway.
     * </p>
     */
    private java.util.Date nextUpdateAvailabilityTime;
    /**
     * <p>
     * The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for backup
     * gateway.
     * </p>
     */
    private String vpcEndpoint;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and Amazon Web Services Region.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *         list of gateways for your account and Amazon Web Services Region.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The display name of the gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The display name of the gateway.
     */

    public void setGatewayDisplayName(String gatewayDisplayName) {
        this.gatewayDisplayName = gatewayDisplayName;
    }

    /**
     * <p>
     * The display name of the gateway.
     * </p>
     * 
     * @return The display name of the gateway.
     */

    public String getGatewayDisplayName() {
        return this.gatewayDisplayName;
    }

    /**
     * <p>
     * The display name of the gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The display name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withGatewayDisplayName(String gatewayDisplayName) {
        setGatewayDisplayName(gatewayDisplayName);
        return this;
    }

    /**
     * <p>
     * The type of the gateway type.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway type.
     * @see GatewayType
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway type.
     * </p>
     * 
     * @return The type of the gateway type.
     * @see GatewayType
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * The type of the gateway type.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public GatewayDetails withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The type of the gateway type.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public GatewayDetails withGatewayType(GatewayType gatewayType) {
        this.gatewayType = gatewayType.toString();
        return this;
    }

    /**
     * <p>
     * The hypervisor ID of the gateway.
     * </p>
     * 
     * @param hypervisorId
     *        The hypervisor ID of the gateway.
     */

    public void setHypervisorId(String hypervisorId) {
        this.hypervisorId = hypervisorId;
    }

    /**
     * <p>
     * The hypervisor ID of the gateway.
     * </p>
     * 
     * @return The hypervisor ID of the gateway.
     */

    public String getHypervisorId() {
        return this.hypervisorId;
    }

    /**
     * <p>
     * The hypervisor ID of the gateway.
     * </p>
     * 
     * @param hypervisorId
     *        The hypervisor ID of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withHypervisorId(String hypervisorId) {
        setHypervisorId(hypervisorId);
        return this;
    }

    /**
     * <p>
     * Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     * </p>
     * 
     * @param lastSeenTime
     *        Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     */

    public void setLastSeenTime(java.util.Date lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
    }

    /**
     * <p>
     * Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     * </p>
     * 
     * @return Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     */

    public java.util.Date getLastSeenTime() {
        return this.lastSeenTime;
    }

    /**
     * <p>
     * Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     * </p>
     * 
     * @param lastSeenTime
     *        Details showing the last time Backup gateway communicated with the cloud, in Unix format and UTC time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withLastSeenTime(java.util.Date lastSeenTime) {
        setLastSeenTime(lastSeenTime);
        return this;
    }

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone. Can be weekly or monthly.
     * </p>
     * 
     * @param maintenanceStartTime
     *        Returns your gateway's weekly maintenance start time including the day and time of the week. Note that
     *        values are in terms of the gateway's time zone. Can be weekly or monthly.
     */

    public void setMaintenanceStartTime(MaintenanceStartTime maintenanceStartTime) {
        this.maintenanceStartTime = maintenanceStartTime;
    }

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone. Can be weekly or monthly.
     * </p>
     * 
     * @return Returns your gateway's weekly maintenance start time including the day and time of the week. Note that
     *         values are in terms of the gateway's time zone. Can be weekly or monthly.
     */

    public MaintenanceStartTime getMaintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone. Can be weekly or monthly.
     * </p>
     * 
     * @param maintenanceStartTime
     *        Returns your gateway's weekly maintenance start time including the day and time of the week. Note that
     *        values are in terms of the gateway's time zone. Can be weekly or monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withMaintenanceStartTime(MaintenanceStartTime maintenanceStartTime) {
        setMaintenanceStartTime(maintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * Details showing the next update availability time of the gateway.
     * </p>
     * 
     * @param nextUpdateAvailabilityTime
     *        Details showing the next update availability time of the gateway.
     */

    public void setNextUpdateAvailabilityTime(java.util.Date nextUpdateAvailabilityTime) {
        this.nextUpdateAvailabilityTime = nextUpdateAvailabilityTime;
    }

    /**
     * <p>
     * Details showing the next update availability time of the gateway.
     * </p>
     * 
     * @return Details showing the next update availability time of the gateway.
     */

    public java.util.Date getNextUpdateAvailabilityTime() {
        return this.nextUpdateAvailabilityTime;
    }

    /**
     * <p>
     * Details showing the next update availability time of the gateway.
     * </p>
     * 
     * @param nextUpdateAvailabilityTime
     *        Details showing the next update availability time of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withNextUpdateAvailabilityTime(java.util.Date nextUpdateAvailabilityTime) {
        setNextUpdateAvailabilityTime(nextUpdateAvailabilityTime);
        return this;
    }

    /**
     * <p>
     * The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for backup
     * gateway.
     * </p>
     * 
     * @param vpcEndpoint
     *        The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for
     *        backup gateway.
     */

    public void setVpcEndpoint(String vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
    }

    /**
     * <p>
     * The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for backup
     * gateway.
     * </p>
     * 
     * @return The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for
     *         backup gateway.
     */

    public String getVpcEndpoint() {
        return this.vpcEndpoint;
    }

    /**
     * <p>
     * The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for backup
     * gateway.
     * </p>
     * 
     * @param vpcEndpoint
     *        The DNS name for the virtual private cloud (VPC) endpoint the gateway uses to connect to the cloud for
     *        backup gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayDetails withVpcEndpoint(String vpcEndpoint) {
        setVpcEndpoint(vpcEndpoint);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getGatewayDisplayName() != null)
            sb.append("GatewayDisplayName: ").append(getGatewayDisplayName()).append(",");
        if (getGatewayType() != null)
            sb.append("GatewayType: ").append(getGatewayType()).append(",");
        if (getHypervisorId() != null)
            sb.append("HypervisorId: ").append(getHypervisorId()).append(",");
        if (getLastSeenTime() != null)
            sb.append("LastSeenTime: ").append(getLastSeenTime()).append(",");
        if (getMaintenanceStartTime() != null)
            sb.append("MaintenanceStartTime: ").append(getMaintenanceStartTime()).append(",");
        if (getNextUpdateAvailabilityTime() != null)
            sb.append("NextUpdateAvailabilityTime: ").append(getNextUpdateAvailabilityTime()).append(",");
        if (getVpcEndpoint() != null)
            sb.append("VpcEndpoint: ").append(getVpcEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayDetails == false)
            return false;
        GatewayDetails other = (GatewayDetails) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getGatewayDisplayName() == null ^ this.getGatewayDisplayName() == null)
            return false;
        if (other.getGatewayDisplayName() != null && other.getGatewayDisplayName().equals(this.getGatewayDisplayName()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getHypervisorId() == null ^ this.getHypervisorId() == null)
            return false;
        if (other.getHypervisorId() != null && other.getHypervisorId().equals(this.getHypervisorId()) == false)
            return false;
        if (other.getLastSeenTime() == null ^ this.getLastSeenTime() == null)
            return false;
        if (other.getLastSeenTime() != null && other.getLastSeenTime().equals(this.getLastSeenTime()) == false)
            return false;
        if (other.getMaintenanceStartTime() == null ^ this.getMaintenanceStartTime() == null)
            return false;
        if (other.getMaintenanceStartTime() != null && other.getMaintenanceStartTime().equals(this.getMaintenanceStartTime()) == false)
            return false;
        if (other.getNextUpdateAvailabilityTime() == null ^ this.getNextUpdateAvailabilityTime() == null)
            return false;
        if (other.getNextUpdateAvailabilityTime() != null && other.getNextUpdateAvailabilityTime().equals(this.getNextUpdateAvailabilityTime()) == false)
            return false;
        if (other.getVpcEndpoint() == null ^ this.getVpcEndpoint() == null)
            return false;
        if (other.getVpcEndpoint() != null && other.getVpcEndpoint().equals(this.getVpcEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getGatewayDisplayName() == null) ? 0 : getGatewayDisplayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode + ((getHypervisorId() == null) ? 0 : getHypervisorId().hashCode());
        hashCode = prime * hashCode + ((getLastSeenTime() == null) ? 0 : getLastSeenTime().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceStartTime() == null) ? 0 : getMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getNextUpdateAvailabilityTime() == null) ? 0 : getNextUpdateAvailabilityTime().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoint() == null) ? 0 : getVpcEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public GatewayDetails clone() {
        try {
            return (GatewayDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.GatewayDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
