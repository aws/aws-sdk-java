/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An interconnect is a connection that can host other connections.
 * </p>
 * <p>
 * Like a standard AWS Direct Connect connection, an interconnect represents the physical connection between an AWS
 * Direct Connect partner's network and a specific Direct Connect location. An AWS Direct Connect partner who owns an
 * interconnect can provision hosted connections on the interconnect for their end customers, thereby providing the end
 * customers with connectivity to AWS services.
 * </p>
 * <p>
 * The resources of the interconnect, including bandwidth and VLAN numbers, are shared by all of the hosted connections
 * on the interconnect, and the owner of the interconnect determines how these resources are assigned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/Interconnect" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Interconnect implements Serializable, Cloneable, StructuredPojo {

    private String interconnectId;

    private String interconnectName;

    private String interconnectState;

    private String region;

    private String location;

    private String bandwidth;
    /**
     * <p>
     * The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     * </p>
     */
    private java.util.Date loaIssueTime;

    private String lagId;
    /**
     * <p>
     * The Direct Connection endpoint which the physical connection terminates on.
     * </p>
     */
    private String awsDevice;

    /**
     * @param interconnectId
     */

    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * @return
     */

    public String getInterconnectId() {
        return this.interconnectId;
    }

    /**
     * @param interconnectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withInterconnectId(String interconnectId) {
        setInterconnectId(interconnectId);
        return this;
    }

    /**
     * @param interconnectName
     */

    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }

    /**
     * @return
     */

    public String getInterconnectName() {
        return this.interconnectName;
    }

    /**
     * @param interconnectName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withInterconnectName(String interconnectName) {
        setInterconnectName(interconnectName);
        return this;
    }

    /**
     * @param interconnectState
     * @see InterconnectState
     */

    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }

    /**
     * @return
     * @see InterconnectState
     */

    public String getInterconnectState() {
        return this.interconnectState;
    }

    /**
     * @param interconnectState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public Interconnect withInterconnectState(String interconnectState) {
        setInterconnectState(interconnectState);
        return this;
    }

    /**
     * @param interconnectState
     * @see InterconnectState
     */

    public void setInterconnectState(InterconnectState interconnectState) {
        withInterconnectState(interconnectState);
    }

    /**
     * @param interconnectState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public Interconnect withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
        return this;
    }

    /**
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param bandwidth
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * @return
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @param bandwidth
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     */

    public void setLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     * </p>
     * 
     * @return The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     */

    public java.util.Date getLoaIssueTime() {
        return this.loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to DescribeInterconnectLoa for this Interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withLoaIssueTime(java.util.Date loaIssueTime) {
        setLoaIssueTime(loaIssueTime);
        return this;
    }

    /**
     * @param lagId
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * @return
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * @param lagId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The Direct Connection endpoint which the physical connection terminates on.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connection endpoint which the physical connection terminates on.
     */

    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The Direct Connection endpoint which the physical connection terminates on.
     * </p>
     * 
     * @return The Direct Connection endpoint which the physical connection terminates on.
     */

    public String getAwsDevice() {
        return this.awsDevice;
    }

    /**
     * <p>
     * The Direct Connection endpoint which the physical connection terminates on.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connection endpoint which the physical connection terminates on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interconnect withAwsDevice(String awsDevice) {
        setAwsDevice(awsDevice);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInterconnectId() != null)
            sb.append("InterconnectId: ").append(getInterconnectId()).append(",");
        if (getInterconnectName() != null)
            sb.append("InterconnectName: ").append(getInterconnectName()).append(",");
        if (getInterconnectState() != null)
            sb.append("InterconnectState: ").append(getInterconnectState()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getLoaIssueTime() != null)
            sb.append("LoaIssueTime: ").append(getLoaIssueTime()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getAwsDevice() != null)
            sb.append("AwsDevice: ").append(getAwsDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Interconnect == false)
            return false;
        Interconnect other = (Interconnect) obj;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null)
            return false;
        if (other.getInterconnectName() != null && other.getInterconnectName().equals(this.getInterconnectName()) == false)
            return false;
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null)
            return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getLoaIssueTime() == null ^ this.getLoaIssueTime() == null)
            return false;
        if (other.getLoaIssueTime() != null && other.getLoaIssueTime().equals(this.getLoaIssueTime()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode());
        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLoaIssueTime() == null) ? 0 : getLoaIssueTime().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        return hashCode;
    }

    @Override
    public Interconnect clone() {
        try {
            return (Interconnect) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.InterconnectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
