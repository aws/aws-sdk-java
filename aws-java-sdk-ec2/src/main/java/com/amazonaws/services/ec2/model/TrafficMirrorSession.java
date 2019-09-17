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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Traffic Mirror session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TrafficMirrorSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorSession implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     */
    private String trafficMirrorSessionId;
    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;
    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet
     * </p>
     */
    private Integer packetLength;
    /**
     * <p>
     * The session number determines the order in which sessions are evaluated when an interface is used by multiple
     * sessions. The first session with a matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     */
    private Integer sessionNumber;
    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     */
    private Integer virtualNetworkId;
    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID for the Traffic Mirror session.
     */

    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     * 
     * @return The ID for the Traffic Mirror session.
     */

    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID for the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        setTrafficMirrorSessionId(trafficMirrorSessionId);
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     */

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @return The ID of the Traffic Mirror target.
     */

    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        setTrafficMirrorTargetId(trafficMirrorTargetId);
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter.
     */

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @return The ID of the Traffic Mirror filter.
     */

    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the Traffic Mirror session's network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     * 
     * @return The ID of the Traffic Mirror session's network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the Traffic Mirror session's network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the Traffic Mirror session.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     * 
     * @return The ID of the account that owns the Traffic Mirror session.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a
     *        subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the
     *        first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when
     *        you want to mirror the entire packet
     */

    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet
     * </p>
     * 
     * @return The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a
     *         subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the
     *         first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter
     *         when you want to mirror the entire packet
     */

    public Integer getPacketLength() {
        return this.packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are the bytes after the VXLAN header. To mirror a
     *        subset, set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the
     *        first 100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when
     *        you want to mirror the entire packet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withPacketLength(Integer packetLength) {
        setPacketLength(packetLength);
        return this;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated when an interface is used by multiple
     * sessions. The first session with a matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     * 
     * @param sessionNumber
     *        The session number determines the order in which sessions are evaluated when an interface is used by
     *        multiple sessions. The first session with a matching filter is the one that mirrors the packets.</p>
     *        <p>
     *        Valid values are 1-32766.
     */

    public void setSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated when an interface is used by multiple
     * sessions. The first session with a matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     * 
     * @return The session number determines the order in which sessions are evaluated when an interface is used by
     *         multiple sessions. The first session with a matching filter is the one that mirrors the packets.</p>
     *         <p>
     *         Valid values are 1-32766.
     */

    public Integer getSessionNumber() {
        return this.sessionNumber;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated when an interface is used by multiple
     * sessions. The first session with a matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     * 
     * @param sessionNumber
     *        The session number determines the order in which sessions are evaluated when an interface is used by
     *        multiple sessions. The first session with a matching filter is the one that mirrors the packets.</p>
     *        <p>
     *        Valid values are 1-32766.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withSessionNumber(Integer sessionNumber) {
        setSessionNumber(sessionNumber);
        return this;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     * 
     * @param virtualNetworkId
     *        The virtual network ID associated with the Traffic Mirror session.
     */

    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     * 
     * @return The virtual network ID associated with the Traffic Mirror session.
     */

    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     * 
     * @param virtualNetworkId
     *        The virtual network ID associated with the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withVirtualNetworkId(Integer virtualNetworkId) {
        setVirtualNetworkId(virtualNetworkId);
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror session.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     * 
     * @return The description of the Traffic Mirror session.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * 
     * @return The tags assigned to the Traffic Mirror session.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror session.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorSession withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTrafficMirrorSessionId() != null)
            sb.append("TrafficMirrorSessionId: ").append(getTrafficMirrorSessionId()).append(",");
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: ").append(getTrafficMirrorTargetId()).append(",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getPacketLength() != null)
            sb.append("PacketLength: ").append(getPacketLength()).append(",");
        if (getSessionNumber() != null)
            sb.append("SessionNumber: ").append(getSessionNumber()).append(",");
        if (getVirtualNetworkId() != null)
            sb.append("VirtualNetworkId: ").append(getVirtualNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorSession == false)
            return false;
        TrafficMirrorSession other = (TrafficMirrorSession) obj;
        if (other.getTrafficMirrorSessionId() == null ^ this.getTrafficMirrorSessionId() == null)
            return false;
        if (other.getTrafficMirrorSessionId() != null && other.getTrafficMirrorSessionId().equals(this.getTrafficMirrorSessionId()) == false)
            return false;
        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPacketLength() == null ^ this.getPacketLength() == null)
            return false;
        if (other.getPacketLength() != null && other.getPacketLength().equals(this.getPacketLength()) == false)
            return false;
        if (other.getSessionNumber() == null ^ this.getSessionNumber() == null)
            return false;
        if (other.getSessionNumber() != null && other.getSessionNumber().equals(this.getSessionNumber()) == false)
            return false;
        if (other.getVirtualNetworkId() == null ^ this.getVirtualNetworkId() == null)
            return false;
        if (other.getVirtualNetworkId() != null && other.getVirtualNetworkId().equals(this.getVirtualNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorSessionId() == null) ? 0 : getTrafficMirrorSessionId().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TrafficMirrorSession clone() {
        try {
            return (TrafficMirrorSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
