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
 * A gateway is an Backup Gateway appliance that runs on the customer's network to provide seamless connectivity to
 * backup storage in the Amazon Web Services Cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/Gateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Gateway implements Serializable, Cloneable, StructuredPojo {

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
     * The type of the gateway.
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
     * The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     * </p>
     */
    private java.util.Date lastSeenTime;

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

    public Gateway withGatewayArn(String gatewayArn) {
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

    public Gateway withGatewayDisplayName(String gatewayDisplayName) {
        setGatewayDisplayName(gatewayDisplayName);
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     * @see GatewayType
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @return The type of the gateway.
     * @see GatewayType
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public Gateway withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public Gateway withGatewayType(GatewayType gatewayType) {
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

    public Gateway withHypervisorId(String hypervisorId) {
        setHypervisorId(hypervisorId);
        return this;
    }

    /**
     * <p>
     * The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     * </p>
     * 
     * @param lastSeenTime
     *        The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     */

    public void setLastSeenTime(java.util.Date lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
    }

    /**
     * <p>
     * The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     * </p>
     * 
     * @return The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     */

    public java.util.Date getLastSeenTime() {
        return this.lastSeenTime;
    }

    /**
     * <p>
     * The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     * </p>
     * 
     * @param lastSeenTime
     *        The last time Backup gateway communicated with the gateway, in Unix format and UTC time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withLastSeenTime(java.util.Date lastSeenTime) {
        setLastSeenTime(lastSeenTime);
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
            sb.append("LastSeenTime: ").append(getLastSeenTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Gateway == false)
            return false;
        Gateway other = (Gateway) obj;
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
        return hashCode;
    }

    @Override
    public Gateway clone() {
        try {
            return (Gateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.GatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
