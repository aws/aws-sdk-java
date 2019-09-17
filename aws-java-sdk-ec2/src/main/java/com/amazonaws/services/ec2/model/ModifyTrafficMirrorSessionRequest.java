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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyTrafficMirrorSessionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorSessionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyTrafficMirrorSessionRequest> {

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     */
    private String trafficMirrorSessionId;
    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection
     * with the source.
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
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet.
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
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     */
    private Integer virtualNetworkId;
    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeFields;

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID of the Traffic Mirror session.
     */

    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     * 
     * @return The ID of the Traffic Mirror session.
     */

    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID of the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorSessionRequest withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        setTrafficMirrorSessionId(trafficMirrorSessionId);
        return this;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection
     * with the source.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering
     *        connection with the source.
     */

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection
     * with the source.
     * </p>
     * 
     * @return The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering
     *         connection with the source.
     */

    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering connection
     * with the source.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The Traffic Mirror target. The target must be in the same VPC as the source, or have a VPC peering
     *        connection with the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorSessionRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
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

    public ModifyTrafficMirrorSessionRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet.
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset,
     *        set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100
     *        bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want
     *        to mirror the entire packet.
     */

    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet.
     * </p>
     * 
     * @return The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset,
     *         set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first
     *         100 bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you
     *         want to mirror the entire packet.
     */

    public Integer getPacketLength() {
        return this.packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset, set
     * this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100 bytes that
     * meet the filter criteria are copied to the target. Do not specify this parameter when you want to mirror the
     * entire packet.
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are bytes after the VXLAN header. To mirror a subset,
     *        set this to the length (in bytes) to mirror. For example, if you set this value to 100, then the first 100
     *        bytes that meet the filter criteria are copied to the target. Do not specify this parameter when you want
     *        to mirror the entire packet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorSessionRequest withPacketLength(Integer packetLength) {
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

    public ModifyTrafficMirrorSessionRequest withSessionNumber(Integer sessionNumber) {
        setSessionNumber(sessionNumber);
        return this;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     * 
     * @param virtualNetworkId
     *        The virtual network ID of the Traffic Mirror session.
     */

    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     * 
     * @return The virtual network ID of the Traffic Mirror session.
     */

    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     * 
     * @param virtualNetworkId
     *        The virtual network ID of the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorSessionRequest withVirtualNetworkId(Integer virtualNetworkId) {
        setVirtualNetworkId(virtualNetworkId);
        return this;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     * 
     * @param description
     *        The description to assign to the Traffic Mirror session.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     * 
     * @return The description to assign to the Traffic Mirror session.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     * 
     * @param description
     *        The description to assign to the Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorSessionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     * 
     * @return The properties that you want to remove from the Traffic Mirror session.</p>
     *         <p>
     *         When you remove a property from a Traffic Mirror session, the property is set to the default.
     * @see TrafficMirrorSessionField
     */

    public java.util.List<String> getRemoveFields() {
        if (removeFields == null) {
            removeFields = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeFields;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror session.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror session, the property is set to the default.
     * @see TrafficMirrorSessionField
     */

    public void setRemoveFields(java.util.Collection<String> removeFields) {
        if (removeFields == null) {
            this.removeFields = null;
            return;
        }

        this.removeFields = new com.amazonaws.internal.SdkInternalList<String>(removeFields);
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveFields(java.util.Collection)} or {@link #withRemoveFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror session.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror session, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorSessionField
     */

    public ModifyTrafficMirrorSessionRequest withRemoveFields(String... removeFields) {
        if (this.removeFields == null) {
            setRemoveFields(new com.amazonaws.internal.SdkInternalList<String>(removeFields.length));
        }
        for (String ele : removeFields) {
            this.removeFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror session.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror session, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorSessionField
     */

    public ModifyTrafficMirrorSessionRequest withRemoveFields(java.util.Collection<String> removeFields) {
        setRemoveFields(removeFields);
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror session.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror session, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorSessionField
     */

    public ModifyTrafficMirrorSessionRequest withRemoveFields(TrafficMirrorSessionField... removeFields) {
        com.amazonaws.internal.SdkInternalList<String> removeFieldsCopy = new com.amazonaws.internal.SdkInternalList<String>(removeFields.length);
        for (TrafficMirrorSessionField value : removeFields) {
            removeFieldsCopy.add(value.toString());
        }
        if (getRemoveFields() == null) {
            setRemoveFields(removeFieldsCopy);
        } else {
            getRemoveFields().addAll(removeFieldsCopy);
        }
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyTrafficMirrorSessionRequest> getDryRunRequest() {
        Request<ModifyTrafficMirrorSessionRequest> request = new ModifyTrafficMirrorSessionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPacketLength() != null)
            sb.append("PacketLength: ").append(getPacketLength()).append(",");
        if (getSessionNumber() != null)
            sb.append("SessionNumber: ").append(getSessionNumber()).append(",");
        if (getVirtualNetworkId() != null)
            sb.append("VirtualNetworkId: ").append(getVirtualNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemoveFields() != null)
            sb.append("RemoveFields: ").append(getRemoveFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorSessionRequest == false)
            return false;
        ModifyTrafficMirrorSessionRequest other = (ModifyTrafficMirrorSessionRequest) obj;
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
        if (other.getRemoveFields() == null ^ this.getRemoveFields() == null)
            return false;
        if (other.getRemoveFields() != null && other.getRemoveFields().equals(this.getRemoveFields()) == false)
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
        hashCode = prime * hashCode + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemoveFields() == null) ? 0 : getRemoveFields().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTrafficMirrorSessionRequest clone() {
        return (ModifyTrafficMirrorSessionRequest) super.clone();
    }
}
