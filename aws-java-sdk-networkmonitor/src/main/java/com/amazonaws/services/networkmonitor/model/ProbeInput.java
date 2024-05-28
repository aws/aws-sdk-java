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
 * Defines a probe when creating a probe or monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ProbeInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProbeInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The port associated with the <code>destination</code>. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The protocol used for the network traffic between the <code>source</code> and <code>destination</code>. This must
     * be either <code>TCP</code> or <code>ICMP</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The size of the packets sent between the source and destination. This must be a number between <code>56</code>
     * and <code>8500</code>.
     * </p>
     */
    private Integer packetSize;
    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the subnet.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @return The ARN of the subnet.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param destination
     *        The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @return The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * 
     * @param destination
     *        The destination IP address. This must be either <code>IPV4</code> or <code>IPV6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The port associated with the <code>destination</code>. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The port associated with the <code>destination</code>. This is required only if the <code>protocol</code>
     *        is <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The port associated with the <code>destination</code>. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @return The port associated with the <code>destination</code>. This is required only if the <code>protocol</code>
     *         is <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The port associated with the <code>destination</code>. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The port associated with the <code>destination</code>. This is required only if the <code>protocol</code>
     *        is <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network traffic between the <code>source</code> and <code>destination</code>. This must
     * be either <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network traffic between the <code>source</code> and <code>destination</code>.
     *        This must be either <code>TCP</code> or <code>ICMP</code>.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the network traffic between the <code>source</code> and <code>destination</code>. This must
     * be either <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * 
     * @return The protocol used for the network traffic between the <code>source</code> and <code>destination</code>.
     *         This must be either <code>TCP</code> or <code>ICMP</code>.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the network traffic between the <code>source</code> and <code>destination</code>. This must
     * be either <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network traffic between the <code>source</code> and <code>destination</code>.
     *        This must be either <code>TCP</code> or <code>ICMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public ProbeInput withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network traffic between the <code>source</code> and <code>destination</code>. This must
     * be either <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network traffic between the <code>source</code> and <code>destination</code>.
     *        This must be either <code>TCP</code> or <code>ICMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public ProbeInput withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The size of the packets sent between the source and destination. This must be a number between <code>56</code>
     * and <code>8500</code>.
     * </p>
     * 
     * @param packetSize
     *        The size of the packets sent between the source and destination. This must be a number between
     *        <code>56</code> and <code>8500</code>.
     */

    public void setPacketSize(Integer packetSize) {
        this.packetSize = packetSize;
    }

    /**
     * <p>
     * The size of the packets sent between the source and destination. This must be a number between <code>56</code>
     * and <code>8500</code>.
     * </p>
     * 
     * @return The size of the packets sent between the source and destination. This must be a number between
     *         <code>56</code> and <code>8500</code>.
     */

    public Integer getPacketSize() {
        return this.packetSize;
    }

    /**
     * <p>
     * The size of the packets sent between the source and destination. This must be a number between <code>56</code>
     * and <code>8500</code>.
     * </p>
     * 
     * @param packetSize
     *        The size of the packets sent between the source and destination. This must be a number between
     *        <code>56</code> and <code>8500</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput withPacketSize(Integer packetSize) {
        setPacketSize(packetSize);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @return The list of key-value pairs created and assigned to the monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs created and assigned to the monitor.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs created and assigned to the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ProbeInput#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProbeInput addTagsEntry(String key, String value) {
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

    public ProbeInput clearTagsEntries() {
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

        if (obj instanceof ProbeInput == false)
            return false;
        ProbeInput other = (ProbeInput) obj;
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

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPacketSize() == null) ? 0 : getPacketSize().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ProbeInput clone() {
        try {
            return (ProbeInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmonitor.model.transform.ProbeInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
