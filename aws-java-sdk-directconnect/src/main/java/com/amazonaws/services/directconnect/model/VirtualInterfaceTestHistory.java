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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the virtual interface failover test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/VirtualInterfaceTestHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualInterfaceTestHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     */
    private String testId;
    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bgpPeers;
    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     */
    private Integer testDurationInMinutes;
    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @param testId
     *        The ID of the virtual interface failover test.
     */

    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @return The ID of the virtual interface failover test.
     */

    public String getTestId() {
        return this.testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @param testId
     *        The ID of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withTestId(String testId) {
        setTestId(testId);
        return this;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the tested virtual interface.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @return The ID of the tested virtual interface.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the tested virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * </p>
     * 
     * @return The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     */

    public java.util.List<String> getBgpPeers() {
        if (bgpPeers == null) {
            bgpPeers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     */

    public void setBgpPeers(java.util.Collection<String> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new com.amazonaws.internal.SdkInternalList<String>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpPeers(java.util.Collection)} or {@link #withBgpPeers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withBgpPeers(String... bgpPeers) {
        if (this.bgpPeers == null) {
            setBgpPeers(new com.amazonaws.internal.SdkInternalList<String>(bgpPeers.length));
        }
        for (String ele : bgpPeers) {
            this.bgpPeers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @param status
     *        The status of the virtual interface failover test.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @return The status of the virtual interface failover test.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @param status
     *        The status of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The owner ID of the tested virtual interface.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     * 
     * @return The owner ID of the tested virtual interface.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The owner ID of the tested virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     * 
     * @param testDurationInMinutes
     *        The time that the virtual interface failover test ran in minutes.
     */

    public void setTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     * 
     * @return The time that the virtual interface failover test ran in minutes.
     */

    public Integer getTestDurationInMinutes() {
        return this.testDurationInMinutes;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     * 
     * @param testDurationInMinutes
     *        The time that the virtual interface failover test ran in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withTestDurationInMinutes(Integer testDurationInMinutes) {
        setTestDurationInMinutes(testDurationInMinutes);
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     * 
     * @param startTime
     *        The time that the virtual interface moves to the DOWN state.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     * 
     * @return The time that the virtual interface moves to the DOWN state.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     * 
     * @param startTime
     *        The time that the virtual interface moves to the DOWN state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     * 
     * @param endTime
     *        The time that the virtual interface moves out of the DOWN state.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     * 
     * @return The time that the virtual interface moves out of the DOWN state.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     * 
     * @param endTime
     *        The time that the virtual interface moves out of the DOWN state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualInterfaceTestHistory withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getTestId() != null)
            sb.append("TestId: ").append(getTestId()).append(",");
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getBgpPeers() != null)
            sb.append("BgpPeers: ").append(getBgpPeers()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getTestDurationInMinutes() != null)
            sb.append("TestDurationInMinutes: ").append(getTestDurationInMinutes()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualInterfaceTestHistory == false)
            return false;
        VirtualInterfaceTestHistory other = (VirtualInterfaceTestHistory) obj;
        if (other.getTestId() == null ^ this.getTestId() == null)
            return false;
        if (other.getTestId() != null && other.getTestId().equals(this.getTestId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTestDurationInMinutes() == null ^ this.getTestDurationInMinutes() == null)
            return false;
        if (other.getTestDurationInMinutes() != null && other.getTestDurationInMinutes().equals(this.getTestDurationInMinutes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestId() == null) ? 0 : getTestId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getTestDurationInMinutes() == null) ? 0 : getTestDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public VirtualInterfaceTestHistory clone() {
        try {
            return (VirtualInterfaceTestHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.VirtualInterfaceTestHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
