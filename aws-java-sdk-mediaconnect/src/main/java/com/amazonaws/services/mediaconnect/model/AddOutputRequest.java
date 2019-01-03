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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The output that you want to add to this flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddOutputRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddOutputRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     */
    private String description;
    /** The IP address from which video will be sent to output destinations. */
    private String destination;
    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     */
    private Encryption encryption;
    /** The maximum latency in milliseconds for Zixi-based streams. */
    private Integer maxLatency;
    /** The name of the output. This value must be unique within the current flow. */
    private String name;
    /** The port to use when content is distributed to this output. */
    private Integer port;
    /** The protocol to use for the output. */
    private String protocol;
    /** The smoothing latency in milliseconds for RTP and RTP-FEC streams. */
    private Integer smoothingLatency;
    /** The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams. */
    private String streamId;

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @param description
     *        A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *        will not be seen by the end user.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @return A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *         will not be seen by the end user.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not
     * be seen by the end user.
     * 
     * @param description
     *        A description of the output. This description appears only on the AWS Elemental MediaConnect console and
     *        will not be seen by the end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @param destination
     *        The IP address from which video will be sent to output destinations.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @return The IP address from which video will be sent to output destinations.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * The IP address from which video will be sent to output destinations.
     * 
     * @param destination
     *        The IP address from which video will be sent to output destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @return The type of key used for the encryption. If no keyType is provided, the service will use the default
     *         setting (static-key).
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds for Zixi-based streams.
     */

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @return The maximum latency in milliseconds for Zixi-based streams.
     */

    public Integer getMaxLatency() {
        return this.maxLatency;
    }

    /**
     * The maximum latency in milliseconds for Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds for Zixi-based streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withMaxLatency(Integer maxLatency) {
        setMaxLatency(maxLatency);
        return this;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the output. This value must be unique within the current flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @return The name of the output. This value must be unique within the current flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the output. This value must be unique within the current flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @return The port to use when content is distributed to this output.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The protocol to use for the output.
     * 
     * @return The protocol to use for the output.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public AddOutputRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The protocol to use for the output.
     * 
     * @param protocol
     *        The protocol to use for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public AddOutputRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     */

    public void setSmoothingLatency(Integer smoothingLatency) {
        this.smoothingLatency = smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     * 
     * @return The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     */

    public Integer getSmoothingLatency() {
        return this.smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RTP and RTP-FEC streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withSmoothingLatency(Integer smoothingLatency) {
        setSmoothingLatency(smoothingLatency);
        return this;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @param streamId
     *        The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @return The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     * @param streamId
     *        The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOutputRequest withStreamId(String streamId) {
        setStreamId(streamId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getMaxLatency() != null)
            sb.append("MaxLatency: ").append(getMaxLatency()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSmoothingLatency() != null)
            sb.append("SmoothingLatency: ").append(getSmoothingLatency()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddOutputRequest == false)
            return false;
        AddOutputRequest other = (AddOutputRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getMaxLatency() == null ^ this.getMaxLatency() == null)
            return false;
        if (other.getMaxLatency() != null && other.getMaxLatency().equals(this.getMaxLatency()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSmoothingLatency() == null ^ this.getSmoothingLatency() == null)
            return false;
        if (other.getSmoothingLatency() != null && other.getSmoothingLatency().equals(this.getSmoothingLatency()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSmoothingLatency() == null) ? 0 : getSmoothingLatency().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public AddOutputRequest clone() {
        try {
            return (AddOutputRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.AddOutputRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
