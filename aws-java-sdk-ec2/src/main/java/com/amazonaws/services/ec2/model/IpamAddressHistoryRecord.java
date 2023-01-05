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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The historical record of a CIDR within an IPAM scope. For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/ipam/view-history-cidr-ipam.html">View the history of IP addresses</a>
 * in the <i>Amazon VPC IPAM User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamAddressHistoryRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamAddressHistoryRecord implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource owner.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The type of the resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The CIDR of the resource.
     * </p>
     */
    private String resourceCidr;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The compliance status of a resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private String resourceComplianceStatus;
    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private String resourceOverlapStatus;
    /**
     * <p>
     * The VPC ID of the resource.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the start time may have occurred before this specific time.
     * </p>
     */
    private java.util.Date sampledStartTime;
    /**
     * <p>
     * Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the end time may have occurred before this specific time.
     * </p>
     */
    private java.util.Date sampledEndTime;

    /**
     * <p>
     * The ID of the resource owner.
     * </p>
     * 
     * @param resourceOwnerId
     *        The ID of the resource owner.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * The ID of the resource owner.
     * </p>
     * 
     * @return The ID of the resource owner.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * The ID of the resource owner.
     * </p>
     * 
     * @param resourceOwnerId
     *        The ID of the resource owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @return The Amazon Web Services Region of the resource.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @see IpamAddressHistoryResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     * @see IpamAddressHistoryResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamAddressHistoryResourceType
     */

    public IpamAddressHistoryRecord withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamAddressHistoryResourceType
     */

    public IpamAddressHistoryRecord withResourceType(IpamAddressHistoryResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The CIDR of the resource.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR of the resource.
     */

    public void setResourceCidr(String resourceCidr) {
        this.resourceCidr = resourceCidr;
    }

    /**
     * <p>
     * The CIDR of the resource.
     * </p>
     * 
     * @return The CIDR of the resource.
     */

    public String getResourceCidr() {
        return this.resourceCidr;
    }

    /**
     * <p>
     * The CIDR of the resource.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withResourceCidr(String resourceCidr) {
        setResourceCidr(resourceCidr);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The compliance status of a resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceComplianceStatus
     *        The compliance status of a resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamComplianceStatus
     */

    public void setResourceComplianceStatus(String resourceComplianceStatus) {
        this.resourceComplianceStatus = resourceComplianceStatus;
    }

    /**
     * <p>
     * The compliance status of a resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return The compliance status of a resource. For more information on compliance statuses, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage
     *         by resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamComplianceStatus
     */

    public String getResourceComplianceStatus() {
        return this.resourceComplianceStatus;
    }

    /**
     * <p>
     * The compliance status of a resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceComplianceStatus
     *        The compliance status of a resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamComplianceStatus
     */

    public IpamAddressHistoryRecord withResourceComplianceStatus(String resourceComplianceStatus) {
        setResourceComplianceStatus(resourceComplianceStatus);
        return this;
    }

    /**
     * <p>
     * The compliance status of a resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceComplianceStatus
     *        The compliance status of a resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamComplianceStatus
     */

    public IpamAddressHistoryRecord withResourceComplianceStatus(IpamComplianceStatus resourceComplianceStatus) {
        this.resourceComplianceStatus = resourceComplianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceOverlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamOverlapStatus
     */

    public void setResourceOverlapStatus(String resourceOverlapStatus) {
        this.resourceOverlapStatus = resourceOverlapStatus;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *         with another CIDR in the scope. For more information on overlap statuses, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage
     *         by resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamOverlapStatus
     */

    public String getResourceOverlapStatus() {
        return this.resourceOverlapStatus;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceOverlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamOverlapStatus
     */

    public IpamAddressHistoryRecord withResourceOverlapStatus(String resourceOverlapStatus) {
        setResourceOverlapStatus(resourceOverlapStatus);
        return this;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param resourceOverlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamOverlapStatus
     */

    public IpamAddressHistoryRecord withResourceOverlapStatus(IpamOverlapStatus resourceOverlapStatus) {
        this.resourceOverlapStatus = resourceOverlapStatus.toString();
        return this;
    }

    /**
     * <p>
     * The VPC ID of the resource.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the resource.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the resource.
     * </p>
     * 
     * @return The VPC ID of the resource.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the resource.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the start time may have occurred before this specific time.
     * </p>
     * 
     * @param sampledStartTime
     *        Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *        periodic snapshots, so the start time may have occurred before this specific time.
     */

    public void setSampledStartTime(java.util.Date sampledStartTime) {
        this.sampledStartTime = sampledStartTime;
    }

    /**
     * <p>
     * Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the start time may have occurred before this specific time.
     * </p>
     * 
     * @return Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *         periodic snapshots, so the start time may have occurred before this specific time.
     */

    public java.util.Date getSampledStartTime() {
        return this.sampledStartTime;
    }

    /**
     * <p>
     * Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the start time may have occurred before this specific time.
     * </p>
     * 
     * @param sampledStartTime
     *        Sampled start time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *        periodic snapshots, so the start time may have occurred before this specific time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withSampledStartTime(java.util.Date sampledStartTime) {
        setSampledStartTime(sampledStartTime);
        return this;
    }

    /**
     * <p>
     * Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the end time may have occurred before this specific time.
     * </p>
     * 
     * @param sampledEndTime
     *        Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *        periodic snapshots, so the end time may have occurred before this specific time.
     */

    public void setSampledEndTime(java.util.Date sampledEndTime) {
        this.sampledEndTime = sampledEndTime;
    }

    /**
     * <p>
     * Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the end time may have occurred before this specific time.
     * </p>
     * 
     * @return Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *         periodic snapshots, so the end time may have occurred before this specific time.
     */

    public java.util.Date getSampledEndTime() {
        return this.sampledEndTime;
    }

    /**
     * <p>
     * Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in periodic
     * snapshots, so the end time may have occurred before this specific time.
     * </p>
     * 
     * @param sampledEndTime
     *        Sampled end time of the resource-to-CIDR association within the IPAM scope. Changes are picked up in
     *        periodic snapshots, so the end time may have occurred before this specific time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamAddressHistoryRecord withSampledEndTime(java.util.Date sampledEndTime) {
        setSampledEndTime(sampledEndTime);
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
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceCidr() != null)
            sb.append("ResourceCidr: ").append(getResourceCidr()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceComplianceStatus() != null)
            sb.append("ResourceComplianceStatus: ").append(getResourceComplianceStatus()).append(",");
        if (getResourceOverlapStatus() != null)
            sb.append("ResourceOverlapStatus: ").append(getResourceOverlapStatus()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSampledStartTime() != null)
            sb.append("SampledStartTime: ").append(getSampledStartTime()).append(",");
        if (getSampledEndTime() != null)
            sb.append("SampledEndTime: ").append(getSampledEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamAddressHistoryRecord == false)
            return false;
        IpamAddressHistoryRecord other = (IpamAddressHistoryRecord) obj;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceCidr() == null ^ this.getResourceCidr() == null)
            return false;
        if (other.getResourceCidr() != null && other.getResourceCidr().equals(this.getResourceCidr()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceComplianceStatus() == null ^ this.getResourceComplianceStatus() == null)
            return false;
        if (other.getResourceComplianceStatus() != null && other.getResourceComplianceStatus().equals(this.getResourceComplianceStatus()) == false)
            return false;
        if (other.getResourceOverlapStatus() == null ^ this.getResourceOverlapStatus() == null)
            return false;
        if (other.getResourceOverlapStatus() != null && other.getResourceOverlapStatus().equals(this.getResourceOverlapStatus()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSampledStartTime() == null ^ this.getSampledStartTime() == null)
            return false;
        if (other.getSampledStartTime() != null && other.getSampledStartTime().equals(this.getSampledStartTime()) == false)
            return false;
        if (other.getSampledEndTime() == null ^ this.getSampledEndTime() == null)
            return false;
        if (other.getSampledEndTime() != null && other.getSampledEndTime().equals(this.getSampledEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceCidr() == null) ? 0 : getResourceCidr().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceComplianceStatus() == null) ? 0 : getResourceComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceOverlapStatus() == null) ? 0 : getResourceOverlapStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSampledStartTime() == null) ? 0 : getSampledStartTime().hashCode());
        hashCode = prime * hashCode + ((getSampledEndTime() == null) ? 0 : getSampledEndTime().hashCode());
        return hashCode;
    }

    @Override
    public IpamAddressHistoryRecord clone() {
        try {
            return (IpamAddressHistoryRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
