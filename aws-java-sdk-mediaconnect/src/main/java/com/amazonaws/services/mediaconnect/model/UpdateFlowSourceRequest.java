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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to update the source of a flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The type of encryption used on the content ingested from this source. */
    private UpdateEncryption decryption;
    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     */
    private String description;
    /**
     * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     * originator, and the ARN is generated as part of the originator's flow.
     */
    private String entitlementArn;
    /** The flow that is associated with the source that you want to update. */
    private String flowArn;
    /** The port that the flow will be listening on for incoming content. */
    private Integer ingestPort;
    /** The smoothing max bitrate for RTP and RTP-FEC streams. */
    private Integer maxBitrate;
    /** The maximum latency in milliseconds for Zixi-based streams. */
    private Integer maxLatency;
    /** The protocol that is used by the source. */
    private String protocol;
    /** The ARN of the source that you want to update. */
    private String sourceArn;
    /** The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams. */
    private String streamId;
    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */
    private String whitelistCidr;

    /**
     * The type of encryption used on the content ingested from this source.
     * 
     * @param decryption
     *        The type of encryption used on the content ingested from this source.
     */

    public void setDecryption(UpdateEncryption decryption) {
        this.decryption = decryption;
    }

    /**
     * The type of encryption used on the content ingested from this source.
     * 
     * @return The type of encryption used on the content ingested from this source.
     */

    public UpdateEncryption getDecryption() {
        return this.decryption;
    }

    /**
     * The type of encryption used on the content ingested from this source.
     * 
     * @param decryption
     *        The type of encryption used on the content ingested from this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withDecryption(UpdateEncryption decryption) {
        setDecryption(decryption);
        return this;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description for the source. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @return A description for the source. This value is not used or seen outside of the current AWS Elemental
     *         MediaConnect account.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description for the source. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     * originator, and the ARN is generated as part of the originator's flow.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     *        originator, and the ARN is generated as part of the originator's flow.
     */

    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     * originator, and the ARN is generated as part of the originator's flow.
     * 
     * @return The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     *         originator, and the ARN is generated as part of the originator's flow.
     */

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     * originator, and the ARN is generated as part of the originator's flow.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow
     *        originator, and the ARN is generated as part of the originator's flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withEntitlementArn(String entitlementArn) {
        setEntitlementArn(entitlementArn);
        return this;
    }

    /**
     * The flow that is associated with the source that you want to update.
     * 
     * @param flowArn
     *        The flow that is associated with the source that you want to update.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that is associated with the source that you want to update.
     * 
     * @return The flow that is associated with the source that you want to update.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that is associated with the source that you want to update.
     * 
     * @param flowArn
     *        The flow that is associated with the source that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @param ingestPort
     *        The port that the flow will be listening on for incoming content.
     */

    public void setIngestPort(Integer ingestPort) {
        this.ingestPort = ingestPort;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @return The port that the flow will be listening on for incoming content.
     */

    public Integer getIngestPort() {
        return this.ingestPort;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @param ingestPort
     *        The port that the flow will be listening on for incoming content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withIngestPort(Integer ingestPort) {
        setIngestPort(ingestPort);
        return this;
    }

    /**
     * The smoothing max bitrate for RTP and RTP-FEC streams.
     * 
     * @param maxBitrate
     *        The smoothing max bitrate for RTP and RTP-FEC streams.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The smoothing max bitrate for RTP and RTP-FEC streams.
     * 
     * @return The smoothing max bitrate for RTP and RTP-FEC streams.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * The smoothing max bitrate for RTP and RTP-FEC streams.
     * 
     * @param maxBitrate
     *        The smoothing max bitrate for RTP and RTP-FEC streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
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

    public UpdateFlowSourceRequest withMaxLatency(Integer maxLatency) {
        setMaxLatency(maxLatency);
        return this;
    }

    /**
     * The protocol that is used by the source.
     * 
     * @param protocol
     *        The protocol that is used by the source.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * The protocol that is used by the source.
     * 
     * @return The protocol that is used by the source.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The protocol that is used by the source.
     * 
     * @param protocol
     *        The protocol that is used by the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateFlowSourceRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The protocol that is used by the source.
     * 
     * @param protocol
     *        The protocol that is used by the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateFlowSourceRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * The ARN of the source that you want to update.
     * 
     * @param sourceArn
     *        The ARN of the source that you want to update.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * The ARN of the source that you want to update.
     * 
     * @return The ARN of the source that you want to update.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * The ARN of the source that you want to update.
     * 
     * @param sourceArn
     *        The ARN of the source that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
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

    public UpdateFlowSourceRequest withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param whitelistCidr
     *        The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *        should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public void setWhitelistCidr(String whitelistCidr) {
        this.whitelistCidr = whitelistCidr;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *         should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public String getWhitelistCidr() {
        return this.whitelistCidr;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param whitelistCidr
     *        The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *        should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowSourceRequest withWhitelistCidr(String whitelistCidr) {
        setWhitelistCidr(whitelistCidr);
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
        if (getDecryption() != null)
            sb.append("Decryption: ").append(getDecryption()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: ").append(getEntitlementArn()).append(",");
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getIngestPort() != null)
            sb.append("IngestPort: ").append(getIngestPort()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMaxLatency() != null)
            sb.append("MaxLatency: ").append(getMaxLatency()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getWhitelistCidr() != null)
            sb.append("WhitelistCidr: ").append(getWhitelistCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowSourceRequest == false)
            return false;
        UpdateFlowSourceRequest other = (UpdateFlowSourceRequest) obj;
        if (other.getDecryption() == null ^ this.getDecryption() == null)
            return false;
        if (other.getDecryption() != null && other.getDecryption().equals(this.getDecryption()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
            return false;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getIngestPort() == null ^ this.getIngestPort() == null)
            return false;
        if (other.getIngestPort() != null && other.getIngestPort().equals(this.getIngestPort()) == false)
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
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getWhitelistCidr() == null ^ this.getWhitelistCidr() == null)
            return false;
        if (other.getWhitelistCidr() != null && other.getWhitelistCidr().equals(this.getWhitelistCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecryption() == null) ? 0 : getDecryption().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getIngestPort() == null) ? 0 : getIngestPort().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getWhitelistCidr() == null) ? 0 : getWhitelistCidr().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowSourceRequest clone() {
        return (UpdateFlowSourceRequest) super.clone();
    }

}
