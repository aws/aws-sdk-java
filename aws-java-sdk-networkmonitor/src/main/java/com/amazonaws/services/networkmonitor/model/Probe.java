/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes information about a network monitor probe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/Probe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Probe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the probe.
     * </p>
     */
    private String probeId;
    /**
     * <p>
     * The ARN of the probe.
     * </p>
     */
    private String probeArn;
    /**
     * <p>
     * The ARN of the probe source subnet.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code> and
     * must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     * protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must be a
     * number between <code>56</code> and
     * </p>
     */
    private Integer packetSize;
    /**
     * <p>
     * The IPv4 or IPv6 address for the probe.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The ID of the source VPC subnet.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The state of the probe.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time and date the probe was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time and date that the probe was last modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the probe.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe.
     */

    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    /**
     * <p>
     * The ID of the probe.
     * </p>
     * 
     * @return The ID of the probe.
     */

    public String getProbeId() {
        return this.probeId;
    }

    /**
     * <p>
     * The ID of the probe.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withProbeId(String probeId) {
        setProbeId(probeId);
        return this;
    }

    /**
     * <p>
     * The ARN of the probe.
     * </p>
     * 
     * @param probeArn
     *        The ARN of the probe.
     */

    public void setProbeArn(String probeArn) {
        this.probeArn = probeArn;
    }

    /**
     * <p>
     * The ARN of the probe.
     * </p>
     * 
     * @return The ARN of the probe.
     */

    public String getProbeArn() {
        return this.probeArn;
    }

    /**
     * <p>
     * The ARN of the probe.
     * </p>
     * 
     * @param probeArn
     *        The ARN of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withProbeArn(String probeArn) {
        setProbeArn(probeArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the probe source subnet.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the probe source subnet.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the probe source subnet.
     * </p>
     * 
     * @return The ARN of the probe source subnet.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the probe source subnet.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the probe source subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param destination
     *        The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @return The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param destination
     *        The destination for the probe. This should be either an <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code> and
     * must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code>
     *        and must be a number between <code>1</code> and <code>65536</code>.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code> and
     * must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @return The destination port for the probe. This is required only if the <code>protocol</code> is
     *         <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code> and
     * must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port for the probe. This is required only if the <code>protocol</code> is <code>TCP</code>
     *        and must be a number between <code>1</code> and <code>65536</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     * protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     *        protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     * protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @return The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     *         the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     * protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     *        protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Probe withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     * protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If the
     *        protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Probe withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must be a
     * number between <code>56</code> and
     * </p>
     * 
     * @param packetSize
     *        The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must
     *        be a number between <code>56</code> and
     */

    public void setPacketSize(Integer packetSize) {
        this.packetSize = packetSize;
    }

    /**
     * <p>
     * The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must be a
     * number between <code>56</code> and
     * </p>
     * 
     * @return The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must
     *         be a number between <code>56</code> and
     */

    public Integer getPacketSize() {
        return this.packetSize;
    }

    /**
     * <p>
     * The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must be a
     * number between <code>56</code> and
     * </p>
     * 
     * @param packetSize
     *        The size of the packets traveling between the <code>source</code> and <code>destination</code>. This must
     *        be a number between <code>56</code> and
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withPacketSize(Integer packetSize) {
        setPacketSize(packetSize);
        return this;
    }

    /**
     * <p>
     * The IPv4 or IPv6 address for the probe.
     * </p>
     * 
     * @param addressFamily
     *        The IPv4 or IPv6 address for the probe.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The IPv4 or IPv6 address for the probe.
     * </p>
     * 
     * @return The IPv4 or IPv6 address for the probe.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The IPv4 or IPv6 address for the probe.
     * </p>
     * 
     * @param addressFamily
     *        The IPv4 or IPv6 address for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public Probe withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The IPv4 or IPv6 address for the probe.
     * </p>
     * 
     * @param addressFamily
     *        The IPv4 or IPv6 address for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public Probe withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the source VPC subnet.
     * </p>
     * 
     * @param vpcId
     *        The ID of the source VPC subnet.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the source VPC subnet.
     * </p>
     * 
     * @return The ID of the source VPC subnet.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the source VPC subnet.
     * </p>
     * 
     * @param vpcId
     *        The ID of the source VPC subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The state of the probe.
     * </p>
     * 
     * @param state
     *        The state of the probe.
     * @see ProbeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the probe.
     * </p>
     * 
     * @return The state of the probe.
     * @see ProbeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the probe.
     * </p>
     * 
     * @param state
     *        The state of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public Probe withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the probe.
     * </p>
     * 
     * @param state
     *        The state of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public Probe withState(ProbeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time and date the probe was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date the probe was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time and date the probe was created.
     * </p>
     * 
     * @return The time and date the probe was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time and date the probe was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date the probe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time and date that the probe was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date that the probe was last modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time and date that the probe was last modified.
     * </p>
     * 
     * @return The time and date that the probe was last modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time and date that the probe was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date that the probe was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @return The list of key-value pairs created and assigned to the probe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the probe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the probe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Probe#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Probe addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Probe clearTagsEntries() {
        this.tags = null;
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
        if (getProbeId() != null)
            sb.append("ProbeId: ").append(getProbeId()).append(",");
        if (getProbeArn() != null)
            sb.append("ProbeArn: ").append(getProbeArn()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPacketSize() != null)
            sb.append("PacketSize: ").append(getPacketSize()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
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

        if (obj instanceof Probe == false)
            return false;
        Probe other = (Probe) obj;
        if (other.getProbeId() == null ^ this.getProbeId() == null)
            return false;
        if (other.getProbeId() != null && other.getProbeId().equals(this.getProbeId()) == false)
            return false;
        if (other.getProbeArn() == null ^ this.getProbeArn() == null)
            return false;
        if (other.getProbeArn() != null && other.getProbeArn().equals(this.getProbeArn()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPacketSize() == null ^ this.getPacketSize() == null)
            return false;
        if (other.getPacketSize() != null && other.getPacketSize().equals(this.getPacketSize()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
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

        hashCode = prime * hashCode + ((getProbeId() == null) ? 0 : getProbeId().hashCode());
        hashCode = prime * hashCode + ((getProbeArn() == null) ? 0 : getProbeArn().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPacketSize() == null) ? 0 : getPacketSize().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Probe clone() {
        try {
            return (Probe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmonitor.model.transform.ProbeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
