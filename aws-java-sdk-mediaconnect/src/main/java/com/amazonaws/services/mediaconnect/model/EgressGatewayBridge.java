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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/EgressGatewayBridge" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EgressGatewayBridge implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the instance running this bridge. */
    private String instanceId;
    /** The maximum expected bitrate (in bps) of the egress bridge. */
    private Integer maxBitrate;

    /**
     * The ID of the instance running this bridge.
     * 
     * @param instanceId
     *        The ID of the instance running this bridge.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * The ID of the instance running this bridge.
     * 
     * @return The ID of the instance running this bridge.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The ID of the instance running this bridge.
     * 
     * @param instanceId
     *        The ID of the instance running this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressGatewayBridge withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * The maximum expected bitrate (in bps) of the egress bridge.
     * 
     * @param maxBitrate
     *        The maximum expected bitrate (in bps) of the egress bridge.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The maximum expected bitrate (in bps) of the egress bridge.
     * 
     * @return The maximum expected bitrate (in bps) of the egress bridge.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * The maximum expected bitrate (in bps) of the egress bridge.
     * 
     * @param maxBitrate
     *        The maximum expected bitrate (in bps) of the egress bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressGatewayBridge withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EgressGatewayBridge == false)
            return false;
        EgressGatewayBridge other = (EgressGatewayBridge) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        return hashCode;
    }

    @Override
    public EgressGatewayBridge clone() {
        try {
            return (EgressGatewayBridge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.EgressGatewayBridgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
