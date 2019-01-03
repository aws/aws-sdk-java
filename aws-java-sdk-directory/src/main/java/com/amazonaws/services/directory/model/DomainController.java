/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the domain controllers for a specified directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DomainController" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainController implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the directory where the domain controller resides.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Identifies a specific domain controller in the directory.
     * </p>
     */
    private String domainControllerId;
    /**
     * <p>
     * The IP address of the domain controller.
     * </p>
     */
    private String dnsIpAddr;
    /**
     * <p>
     * The identifier of the VPC that contains the domain controller.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Identifier of the subnet in the VPC that contains the domain controller.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The Availability Zone where the domain controller is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The status of the domain controller.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the domain controller state.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Specifies when the domain controller was created.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * The date and time that the status was last updated.
     * </p>
     */
    private java.util.Date statusLastUpdatedDateTime;

    /**
     * <p>
     * Identifier of the directory where the domain controller resides.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory where the domain controller resides.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the directory where the domain controller resides.
     * </p>
     * 
     * @return Identifier of the directory where the domain controller resides.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the directory where the domain controller resides.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory where the domain controller resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Identifies a specific domain controller in the directory.
     * </p>
     * 
     * @param domainControllerId
     *        Identifies a specific domain controller in the directory.
     */

    public void setDomainControllerId(String domainControllerId) {
        this.domainControllerId = domainControllerId;
    }

    /**
     * <p>
     * Identifies a specific domain controller in the directory.
     * </p>
     * 
     * @return Identifies a specific domain controller in the directory.
     */

    public String getDomainControllerId() {
        return this.domainControllerId;
    }

    /**
     * <p>
     * Identifies a specific domain controller in the directory.
     * </p>
     * 
     * @param domainControllerId
     *        Identifies a specific domain controller in the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withDomainControllerId(String domainControllerId) {
        setDomainControllerId(domainControllerId);
        return this;
    }

    /**
     * <p>
     * The IP address of the domain controller.
     * </p>
     * 
     * @param dnsIpAddr
     *        The IP address of the domain controller.
     */

    public void setDnsIpAddr(String dnsIpAddr) {
        this.dnsIpAddr = dnsIpAddr;
    }

    /**
     * <p>
     * The IP address of the domain controller.
     * </p>
     * 
     * @return The IP address of the domain controller.
     */

    public String getDnsIpAddr() {
        return this.dnsIpAddr;
    }

    /**
     * <p>
     * The IP address of the domain controller.
     * </p>
     * 
     * @param dnsIpAddr
     *        The IP address of the domain controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withDnsIpAddr(String dnsIpAddr) {
        setDnsIpAddr(dnsIpAddr);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the domain controller.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that contains the domain controller.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the domain controller.
     * </p>
     * 
     * @return The identifier of the VPC that contains the domain controller.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the domain controller.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that contains the domain controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Identifier of the subnet in the VPC that contains the domain controller.
     * </p>
     * 
     * @param subnetId
     *        Identifier of the subnet in the VPC that contains the domain controller.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * Identifier of the subnet in the VPC that contains the domain controller.
     * </p>
     * 
     * @return Identifier of the subnet in the VPC that contains the domain controller.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * Identifier of the subnet in the VPC that contains the domain controller.
     * </p>
     * 
     * @param subnetId
     *        Identifier of the subnet in the VPC that contains the domain controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the domain controller is located.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the domain controller is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the domain controller is located.
     * </p>
     * 
     * @return The Availability Zone where the domain controller is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the domain controller is located.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the domain controller is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The status of the domain controller.
     * </p>
     * 
     * @param status
     *        The status of the domain controller.
     * @see DomainControllerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the domain controller.
     * </p>
     * 
     * @return The status of the domain controller.
     * @see DomainControllerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the domain controller.
     * </p>
     * 
     * @param status
     *        The status of the domain controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainControllerStatus
     */

    public DomainController withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the domain controller.
     * </p>
     * 
     * @param status
     *        The status of the domain controller.
     * @see DomainControllerStatus
     */

    public void setStatus(DomainControllerStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the domain controller.
     * </p>
     * 
     * @param status
     *        The status of the domain controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainControllerStatus
     */

    public DomainController withStatus(DomainControllerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the domain controller state.
     * </p>
     * 
     * @param statusReason
     *        A description of the domain controller state.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A description of the domain controller state.
     * </p>
     * 
     * @return A description of the domain controller state.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A description of the domain controller state.
     * </p>
     * 
     * @param statusReason
     *        A description of the domain controller state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Specifies when the domain controller was created.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the domain controller was created.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * Specifies when the domain controller was created.
     * </p>
     * 
     * @return Specifies when the domain controller was created.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * Specifies when the domain controller was created.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the domain controller was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the status was last updated.
     * </p>
     * 
     * @param statusLastUpdatedDateTime
     *        The date and time that the status was last updated.
     */

    public void setStatusLastUpdatedDateTime(java.util.Date statusLastUpdatedDateTime) {
        this.statusLastUpdatedDateTime = statusLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the status was last updated.
     * </p>
     * 
     * @return The date and time that the status was last updated.
     */

    public java.util.Date getStatusLastUpdatedDateTime() {
        return this.statusLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the status was last updated.
     * </p>
     * 
     * @param statusLastUpdatedDateTime
     *        The date and time that the status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainController withStatusLastUpdatedDateTime(java.util.Date statusLastUpdatedDateTime) {
        setStatusLastUpdatedDateTime(statusLastUpdatedDateTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getDomainControllerId() != null)
            sb.append("DomainControllerId: ").append(getDomainControllerId()).append(",");
        if (getDnsIpAddr() != null)
            sb.append("DnsIpAddr: ").append(getDnsIpAddr()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
        if (getStatusLastUpdatedDateTime() != null)
            sb.append("StatusLastUpdatedDateTime: ").append(getStatusLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainController == false)
            return false;
        DomainController other = (DomainController) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDomainControllerId() == null ^ this.getDomainControllerId() == null)
            return false;
        if (other.getDomainControllerId() != null && other.getDomainControllerId().equals(this.getDomainControllerId()) == false)
            return false;
        if (other.getDnsIpAddr() == null ^ this.getDnsIpAddr() == null)
            return false;
        if (other.getDnsIpAddr() != null && other.getDnsIpAddr().equals(this.getDnsIpAddr()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getStatusLastUpdatedDateTime() == null ^ this.getStatusLastUpdatedDateTime() == null)
            return false;
        if (other.getStatusLastUpdatedDateTime() != null && other.getStatusLastUpdatedDateTime().equals(this.getStatusLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getDomainControllerId() == null) ? 0 : getDomainControllerId().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddr() == null) ? 0 : getDnsIpAddr().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getStatusLastUpdatedDateTime() == null) ? 0 : getStatusLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DomainController clone() {
        try {
            return (DomainController) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.DomainControllerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
