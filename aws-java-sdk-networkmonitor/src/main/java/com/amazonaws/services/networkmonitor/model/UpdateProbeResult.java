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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateProbe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProbeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated ID of the probe.
     * </p>
     */
    private String probeId;
    /**
     * <p>
     * The updated ARN of the probe.
     * </p>
     */
    private String probeArn;
    /**
     * <p>
     * The updated ARN of the source subnet.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The updated destination IP address for the probe.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The updated protocol for the probe.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The updated packet size for the probe.
     * </p>
     */
    private Integer packetSize;
    /**
     * <p>
     * The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The updated ID of the source VPC subnet ID.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The state of the updated probe.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time and date that the probe was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time and date that the probe was last updated.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * Update tags for a probe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The updated ID of the probe.
     * </p>
     * 
     * @param probeId
     *        The updated ID of the probe.
     */

    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    /**
     * <p>
     * The updated ID of the probe.
     * </p>
     * 
     * @return The updated ID of the probe.
     */

    public String getProbeId() {
        return this.probeId;
    }

    /**
     * <p>
     * The updated ID of the probe.
     * </p>
     * 
     * @param probeId
     *        The updated ID of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withProbeId(String probeId) {
        setProbeId(probeId);
        return this;
    }

    /**
     * <p>
     * The updated ARN of the probe.
     * </p>
     * 
     * @param probeArn
     *        The updated ARN of the probe.
     */

    public void setProbeArn(String probeArn) {
        this.probeArn = probeArn;
    }

    /**
     * <p>
     * The updated ARN of the probe.
     * </p>
     * 
     * @return The updated ARN of the probe.
     */

    public String getProbeArn() {
        return this.probeArn;
    }

    /**
     * <p>
     * The updated ARN of the probe.
     * </p>
     * 
     * @param probeArn
     *        The updated ARN of the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withProbeArn(String probeArn) {
        setProbeArn(probeArn);
        return this;
    }

    /**
     * <p>
     * The updated ARN of the source subnet.
     * </p>
     * 
     * @param sourceArn
     *        The updated ARN of the source subnet.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The updated ARN of the source subnet.
     * </p>
     * 
     * @return The updated ARN of the source subnet.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The updated ARN of the source subnet.
     * </p>
     * 
     * @param sourceArn
     *        The updated ARN of the source subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The updated destination IP address for the probe.
     * </p>
     * 
     * @param destination
     *        The updated destination IP address for the probe.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The updated destination IP address for the probe.
     * </p>
     * 
     * @return The updated destination IP address for the probe.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The updated destination IP address for the probe.
     * </p>
     * 
     * @param destination
     *        The updated destination IP address for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @return The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The updated destination port. This must be a number between <code>1</code> and <code>65536</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The updated protocol for the probe.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the probe.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The updated protocol for the probe.
     * </p>
     * 
     * @return The updated protocol for the probe.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The updated protocol for the probe.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateProbeResult withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The updated protocol for the probe.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateProbeResult withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The updated packet size for the probe.
     * </p>
     * 
     * @param packetSize
     *        The updated packet size for the probe.
     */

    public void setPacketSize(Integer packetSize) {
        this.packetSize = packetSize;
    }

    /**
     * <p>
     * The updated packet size for the probe.
     * </p>
     * 
     * @return The updated packet size for the probe.
     */

    public Integer getPacketSize() {
        return this.packetSize;
    }

    /**
     * <p>
     * The updated packet size for the probe.
     * </p>
     * 
     * @param packetSize
     *        The updated packet size for the probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withPacketSize(Integer packetSize) {
        setPacketSize(packetSize);
        return this;
    }

    /**
     * <p>
     * The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param addressFamily
     *        The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @return The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param addressFamily
     *        The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public UpdateProbeResult withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param addressFamily
     *        The updated IP address family. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public UpdateProbeResult withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The updated ID of the source VPC subnet ID.
     * </p>
     * 
     * @param vpcId
     *        The updated ID of the source VPC subnet ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The updated ID of the source VPC subnet ID.
     * </p>
     * 
     * @return The updated ID of the source VPC subnet ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The updated ID of the source VPC subnet ID.
     * </p>
     * 
     * @param vpcId
     *        The updated ID of the source VPC subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The state of the updated probe.
     * </p>
     * 
     * @param state
     *        The state of the updated probe.
     * @see ProbeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the updated probe.
     * </p>
     * 
     * @return The state of the updated probe.
     * @see ProbeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the updated probe.
     * </p>
     * 
     * @param state
     *        The state of the updated probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public UpdateProbeResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the updated probe.
     * </p>
     * 
     * @param state
     *        The state of the updated probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public UpdateProbeResult withState(ProbeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time and date that the probe was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date that the probe was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time and date that the probe was created.
     * </p>
     * 
     * @return The time and date that the probe was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time and date that the probe was created.
     * </p>
     * 
     * @param createdAt
     *        The time and date that the probe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time and date that the probe was last updated.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date that the probe was last updated.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time and date that the probe was last updated.
     * </p>
     * 
     * @return The time and date that the probe was last updated.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time and date that the probe was last updated.
     * </p>
     * 
     * @param modifiedAt
     *        The time and date that the probe was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * Update tags for a probe.
     * </p>
     * 
     * @return Update tags for a probe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Update tags for a probe.
     * </p>
     * 
     * @param tags
     *        Update tags for a probe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Update tags for a probe.
     * </p>
     * 
     * @param tags
     *        Update tags for a probe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateProbeResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeResult addTagsEntry(String key, String value) {
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

    public UpdateProbeResult clearTagsEntries() {
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

        if (obj instanceof UpdateProbeResult == false)
            return false;
        UpdateProbeResult other = (UpdateProbeResult) obj;
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
    public UpdateProbeResult clone() {
        try {
            return (UpdateProbeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
