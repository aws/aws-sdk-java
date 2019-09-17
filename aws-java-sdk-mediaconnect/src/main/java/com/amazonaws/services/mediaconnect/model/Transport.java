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
 * Attributes related to the transport stream that are used in a source or output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Transport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transport implements Serializable, Cloneable, StructuredPojo {

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */
    private java.util.List<String> cidrAllowList;
    /** The smoothing max bitrate for RIST, RTP, and RTP-FEC streams. */
    private Integer maxBitrate;
    /** The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams. */
    private Integer maxLatency;
    /** The protocol that is used by the source or output. */
    private String protocol;
    /** The remote ID for the Zixi-pull stream. */
    private String remoteId;
    /** The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams. */
    private Integer smoothingLatency;
    /** The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams. */
    private String streamId;

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *         addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *         10.0.0.0/16.
     */

    public java.util.List<String> getCidrAllowList() {
        return cidrAllowList;
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     */

    public void setCidrAllowList(java.util.Collection<String> cidrAllowList) {
        if (cidrAllowList == null) {
            this.cidrAllowList = null;
            return;
        }

        this.cidrAllowList = new java.util.ArrayList<String>(cidrAllowList);
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrAllowList(java.util.Collection)} or {@link #withCidrAllowList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withCidrAllowList(String... cidrAllowList) {
        if (this.cidrAllowList == null) {
            setCidrAllowList(new java.util.ArrayList<String>(cidrAllowList.length));
        }
        for (String ele : cidrAllowList) {
            this.cidrAllowList.add(ele);
        }
        return this;
    }

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses
     * should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrAllowList
     *        The range of IP addresses that should be allowed to initiate output requests to this flow. These IP
     *        addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     *        10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withCidrAllowList(java.util.Collection<String> cidrAllowList) {
        setCidrAllowList(cidrAllowList);
        return this;
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     * @param maxBitrate
     *        The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     * @return The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     * @param maxBitrate
     *        The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     */

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     * @return The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     */

    public Integer getMaxLatency() {
        return this.maxLatency;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     * @param maxLatency
     *        The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withMaxLatency(Integer maxLatency) {
        setMaxLatency(maxLatency);
        return this;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     * @param protocol
     *        The protocol that is used by the source or output.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     * @return The protocol that is used by the source or output.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     * @param protocol
     *        The protocol that is used by the source or output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Transport withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     * @param protocol
     *        The protocol that is used by the source or output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Transport withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @param remoteId
     *        The remote ID for the Zixi-pull stream.
     */

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @return The remote ID for the Zixi-pull stream.
     */

    public String getRemoteId() {
        return this.remoteId;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     * @param remoteId
     *        The remote ID for the Zixi-pull stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withRemoteId(String remoteId) {
        setRemoteId(remoteId);
        return this;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     */

    public void setSmoothingLatency(Integer smoothingLatency) {
        this.smoothingLatency = smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @return The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     */

    public Integer getSmoothingLatency() {
        return this.smoothingLatency;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     * @param smoothingLatency
     *        The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transport withSmoothingLatency(Integer smoothingLatency) {
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

    public Transport withStreamId(String streamId) {
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
        if (getCidrAllowList() != null)
            sb.append("CidrAllowList: ").append(getCidrAllowList()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMaxLatency() != null)
            sb.append("MaxLatency: ").append(getMaxLatency()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRemoteId() != null)
            sb.append("RemoteId: ").append(getRemoteId()).append(",");
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

        if (obj instanceof Transport == false)
            return false;
        Transport other = (Transport) obj;
        if (other.getCidrAllowList() == null ^ this.getCidrAllowList() == null)
            return false;
        if (other.getCidrAllowList() != null && other.getCidrAllowList().equals(this.getCidrAllowList()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMaxLatency() == null ^ this.getMaxLatency() == null)
            return false;
        if (other.getMaxLatency() != null && other.getMaxLatency().equals(this.getMaxLatency()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRemoteId() == null ^ this.getRemoteId() == null)
            return false;
        if (other.getRemoteId() != null && other.getRemoteId().equals(this.getRemoteId()) == false)
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

        hashCode = prime * hashCode + ((getCidrAllowList() == null) ? 0 : getCidrAllowList().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRemoteId() == null) ? 0 : getRemoteId().hashCode());
        hashCode = prime * hashCode + ((getSmoothingLatency() == null) ? 0 : getSmoothingLatency().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public Transport clone() {
        try {
            return (Transport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.TransportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
