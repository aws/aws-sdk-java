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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateProbe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProbeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor that the probe was updated for.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The ID of the probe to update.
     * </p>
     */
    private String probeId;
    /**
     * <p>
     * The state of the probe update.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The updated port for the probe destination. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     * the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * he updated packets size for network traffic between the source and destination. This must be a number between
     * <code>56</code> and <code>8500</code>.
     * </p>
     */
    private Integer packetSize;

    /**
     * <p>
     * The name of the monitor that the probe was updated for.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor that the probe was updated for.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor that the probe was updated for.
     * </p>
     * 
     * @return The name of the monitor that the probe was updated for.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor that the probe was updated for.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor that the probe was updated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The ID of the probe to update.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe to update.
     */

    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    /**
     * <p>
     * The ID of the probe to update.
     * </p>
     * 
     * @return The ID of the probe to update.
     */

    public String getProbeId() {
        return this.probeId;
    }

    /**
     * <p>
     * The ID of the probe to update.
     * </p>
     * 
     * @param probeId
     *        The ID of the probe to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeRequest withProbeId(String probeId) {
        setProbeId(probeId);
        return this;
    }

    /**
     * <p>
     * The state of the probe update.
     * </p>
     * 
     * @param state
     *        The state of the probe update.
     * @see ProbeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the probe update.
     * </p>
     * 
     * @return The state of the probe update.
     * @see ProbeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the probe update.
     * </p>
     * 
     * @param state
     *        The state of the probe update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public UpdateProbeRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the probe update.
     * </p>
     * 
     * @param state
     *        The state of the probe update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProbeState
     */

    public UpdateProbeRequest withState(ProbeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     * </p>
     * 
     * @param destination
     *        The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     * </p>
     * 
     * @return The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     * </p>
     * 
     * @param destination
     *        The updated IP address for the probe destination. This must be either an IPv4 or IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The updated port for the probe destination. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The updated port for the probe destination. This is required only if the <code>protocol</code> is
     *        <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The updated port for the probe destination. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @return The updated port for the probe destination. This is required only if the <code>protocol</code> is
     *         <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The updated port for the probe destination. This is required only if the <code>protocol</code> is
     * <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * </p>
     * 
     * @param destinationPort
     *        The updated port for the probe destination. This is required only if the <code>protocol</code> is
     *        <code>TCP</code> and must be a number between <code>1</code> and <code>65536</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeRequest withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     * the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>
     *        . If the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     * the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @return The updated network protocol for the destination. This can be either <code>TCP</code> or
     *         <code>ICMP</code>. If the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     * the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>
     *        . If the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateProbeRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>. If
     * the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * </p>
     * 
     * @param protocol
     *        The updated network protocol for the destination. This can be either <code>TCP</code> or <code>ICMP</code>
     *        . If the protocol is <code>TCP</code>, then <code>port</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateProbeRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * he updated packets size for network traffic between the source and destination. This must be a number between
     * <code>56</code> and <code>8500</code>.
     * </p>
     * 
     * @param packetSize
     *        he updated packets size for network traffic between the source and destination. This must be a number
     *        between <code>56</code> and <code>8500</code>.
     */

    public void setPacketSize(Integer packetSize) {
        this.packetSize = packetSize;
    }

    /**
     * <p>
     * he updated packets size for network traffic between the source and destination. This must be a number between
     * <code>56</code> and <code>8500</code>.
     * </p>
     * 
     * @return he updated packets size for network traffic between the source and destination. This must be a number
     *         between <code>56</code> and <code>8500</code>.
     */

    public Integer getPacketSize() {
        return this.packetSize;
    }

    /**
     * <p>
     * he updated packets size for network traffic between the source and destination. This must be a number between
     * <code>56</code> and <code>8500</code>.
     * </p>
     * 
     * @param packetSize
     *        he updated packets size for network traffic between the source and destination. This must be a number
     *        between <code>56</code> and <code>8500</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProbeRequest withPacketSize(Integer packetSize) {
        setPacketSize(packetSize);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getProbeId() != null)
            sb.append("ProbeId: ").append(getProbeId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPacketSize() != null)
            sb.append("PacketSize: ").append(getPacketSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProbeRequest == false)
            return false;
        UpdateProbeRequest other = (UpdateProbeRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getProbeId() == null ^ this.getProbeId() == null)
            return false;
        if (other.getProbeId() != null && other.getProbeId().equals(this.getProbeId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getProbeId() == null) ? 0 : getProbeId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPacketSize() == null) ? 0 : getPacketSize().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProbeRequest clone() {
        return (UpdateProbeRequest) super.clone();
    }

}
