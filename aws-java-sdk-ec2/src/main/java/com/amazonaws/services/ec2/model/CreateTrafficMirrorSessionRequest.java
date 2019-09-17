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
import com.amazonaws.services.ec2.model.transform.CreateTrafficMirrorSessionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorSessionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTrafficMirrorSessionRequest> {

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     */
    private String networkInterfaceId;
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
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     * parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in
     * bytes) that you want to mirror. For example, if you set this value to 1network0, then the first 100 bytes that
     * meet the filter criteria are copied to the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the number
     * of bytes in each packet to mirror.
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
     * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     * href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a <code>VirtualNetworkId</code>,
     * an account-wide unique id is chosen at random.
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
     * The tags to assign to a Traffic Mirror session.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the source network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     * 
     * @return The ID of the source network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the source network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
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

    public CreateTrafficMirrorSessionRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
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

    public CreateTrafficMirrorSessionRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     * parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in
     * bytes) that you want to mirror. For example, if you set this value to 1network0, then the first 100 bytes that
     * meet the filter criteria are copied to the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the number
     * of bytes in each packet to mirror.
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     *        parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the
     *        length (in bytes) that you want to mirror. For example, if you set this value to 1network0, then the first
     *        100 bytes that meet the filter criteria are copied to the target.</p>
     *        <p>
     *        If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the
     *        number of bytes in each packet to mirror.
     */

    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     * parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in
     * bytes) that you want to mirror. For example, if you set this value to 1network0, then the first 100 bytes that
     * meet the filter criteria are copied to the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the number
     * of bytes in each packet to mirror.
     * </p>
     * 
     * @return The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     *         parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the
     *         length (in bytes) that you want to mirror. For example, if you set this value to 1network0, then the
     *         first 100 bytes that meet the filter criteria are copied to the target.</p>
     *         <p>
     *         If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify
     *         the number of bytes in each packet to mirror.
     */

    public Integer getPacketLength() {
        return this.packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     * parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in
     * bytes) that you want to mirror. For example, if you set this value to 1network0, then the first 100 bytes that
     * meet the filter criteria are copied to the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the number
     * of bytes in each packet to mirror.
     * </p>
     * 
     * @param packetLength
     *        The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this
     *        parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the
     *        length (in bytes) that you want to mirror. For example, if you set this value to 1network0, then the first
     *        100 bytes that meet the filter criteria are copied to the target.</p>
     *        <p>
     *        If you do not want to mirror the entire packet, use the <code>PacketLength</code> parameter to specify the
     *        number of bytes in each packet to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withPacketLength(Integer packetLength) {
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

    public CreateTrafficMirrorSessionRequest withSessionNumber(Integer sessionNumber) {
        setSessionNumber(sessionNumber);
        return this;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     * href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a <code>VirtualNetworkId</code>,
     * an account-wide unique id is chosen at random.
     * </p>
     * 
     * @param virtualNetworkId
     *        The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     *        href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a
     *        <code>VirtualNetworkId</code>, an account-wide unique id is chosen at random.
     */

    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     * href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a <code>VirtualNetworkId</code>,
     * an account-wide unique id is chosen at random.
     * </p>
     * 
     * @return The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     *         href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a
     *         <code>VirtualNetworkId</code>, an account-wide unique id is chosen at random.
     */

    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     * href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a <code>VirtualNetworkId</code>,
     * an account-wide unique id is chosen at random.
     * </p>
     * 
     * @param virtualNetworkId
     *        The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see <a
     *        href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you do not specify a
     *        <code>VirtualNetworkId</code>, an account-wide unique id is chosen at random.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withVirtualNetworkId(Integer virtualNetworkId) {
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

    public CreateTrafficMirrorSessionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * 
     * @return The tags to assign to a Traffic Mirror session.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to a Traffic Mirror session.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to a Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to a Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorSessionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTrafficMirrorSessionRequest> getDryRunRequest() {
        Request<CreateTrafficMirrorSessionRequest> request = new CreateTrafficMirrorSessionRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
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
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficMirrorSessionRequest == false)
            return false;
        CreateTrafficMirrorSessionRequest other = (CreateTrafficMirrorSessionRequest) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficMirrorSessionRequest clone() {
        return (CreateTrafficMirrorSessionRequest) super.clone();
    }
}
