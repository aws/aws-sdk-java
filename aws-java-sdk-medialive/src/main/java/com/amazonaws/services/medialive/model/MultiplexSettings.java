/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains configuration for a Multiplex event
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexSettings implements Serializable, Cloneable, StructuredPojo {

    /** Maximum video buffer delay in milliseconds. */
    private Integer maximumVideoBufferDelayMilliseconds;
    /** Transport stream bit rate. */
    private Integer transportStreamBitrate;
    /** Transport stream ID. */
    private Integer transportStreamId;
    /** Transport stream reserved bit rate. */
    private Integer transportStreamReservedBitrate;

    /**
     * Maximum video buffer delay in milliseconds.
     * 
     * @param maximumVideoBufferDelayMilliseconds
     *        Maximum video buffer delay in milliseconds.
     */

    public void setMaximumVideoBufferDelayMilliseconds(Integer maximumVideoBufferDelayMilliseconds) {
        this.maximumVideoBufferDelayMilliseconds = maximumVideoBufferDelayMilliseconds;
    }

    /**
     * Maximum video buffer delay in milliseconds.
     * 
     * @return Maximum video buffer delay in milliseconds.
     */

    public Integer getMaximumVideoBufferDelayMilliseconds() {
        return this.maximumVideoBufferDelayMilliseconds;
    }

    /**
     * Maximum video buffer delay in milliseconds.
     * 
     * @param maximumVideoBufferDelayMilliseconds
     *        Maximum video buffer delay in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexSettings withMaximumVideoBufferDelayMilliseconds(Integer maximumVideoBufferDelayMilliseconds) {
        setMaximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds);
        return this;
    }

    /**
     * Transport stream bit rate.
     * 
     * @param transportStreamBitrate
     *        Transport stream bit rate.
     */

    public void setTransportStreamBitrate(Integer transportStreamBitrate) {
        this.transportStreamBitrate = transportStreamBitrate;
    }

    /**
     * Transport stream bit rate.
     * 
     * @return Transport stream bit rate.
     */

    public Integer getTransportStreamBitrate() {
        return this.transportStreamBitrate;
    }

    /**
     * Transport stream bit rate.
     * 
     * @param transportStreamBitrate
     *        Transport stream bit rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexSettings withTransportStreamBitrate(Integer transportStreamBitrate) {
        setTransportStreamBitrate(transportStreamBitrate);
        return this;
    }

    /**
     * Transport stream ID.
     * 
     * @param transportStreamId
     *        Transport stream ID.
     */

    public void setTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    /**
     * Transport stream ID.
     * 
     * @return Transport stream ID.
     */

    public Integer getTransportStreamId() {
        return this.transportStreamId;
    }

    /**
     * Transport stream ID.
     * 
     * @param transportStreamId
     *        Transport stream ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexSettings withTransportStreamId(Integer transportStreamId) {
        setTransportStreamId(transportStreamId);
        return this;
    }

    /**
     * Transport stream reserved bit rate.
     * 
     * @param transportStreamReservedBitrate
     *        Transport stream reserved bit rate.
     */

    public void setTransportStreamReservedBitrate(Integer transportStreamReservedBitrate) {
        this.transportStreamReservedBitrate = transportStreamReservedBitrate;
    }

    /**
     * Transport stream reserved bit rate.
     * 
     * @return Transport stream reserved bit rate.
     */

    public Integer getTransportStreamReservedBitrate() {
        return this.transportStreamReservedBitrate;
    }

    /**
     * Transport stream reserved bit rate.
     * 
     * @param transportStreamReservedBitrate
     *        Transport stream reserved bit rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexSettings withTransportStreamReservedBitrate(Integer transportStreamReservedBitrate) {
        setTransportStreamReservedBitrate(transportStreamReservedBitrate);
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
        if (getMaximumVideoBufferDelayMilliseconds() != null)
            sb.append("MaximumVideoBufferDelayMilliseconds: ").append(getMaximumVideoBufferDelayMilliseconds()).append(",");
        if (getTransportStreamBitrate() != null)
            sb.append("TransportStreamBitrate: ").append(getTransportStreamBitrate()).append(",");
        if (getTransportStreamId() != null)
            sb.append("TransportStreamId: ").append(getTransportStreamId()).append(",");
        if (getTransportStreamReservedBitrate() != null)
            sb.append("TransportStreamReservedBitrate: ").append(getTransportStreamReservedBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexSettings == false)
            return false;
        MultiplexSettings other = (MultiplexSettings) obj;
        if (other.getMaximumVideoBufferDelayMilliseconds() == null ^ this.getMaximumVideoBufferDelayMilliseconds() == null)
            return false;
        if (other.getMaximumVideoBufferDelayMilliseconds() != null
                && other.getMaximumVideoBufferDelayMilliseconds().equals(this.getMaximumVideoBufferDelayMilliseconds()) == false)
            return false;
        if (other.getTransportStreamBitrate() == null ^ this.getTransportStreamBitrate() == null)
            return false;
        if (other.getTransportStreamBitrate() != null && other.getTransportStreamBitrate().equals(this.getTransportStreamBitrate()) == false)
            return false;
        if (other.getTransportStreamId() == null ^ this.getTransportStreamId() == null)
            return false;
        if (other.getTransportStreamId() != null && other.getTransportStreamId().equals(this.getTransportStreamId()) == false)
            return false;
        if (other.getTransportStreamReservedBitrate() == null ^ this.getTransportStreamReservedBitrate() == null)
            return false;
        if (other.getTransportStreamReservedBitrate() != null
                && other.getTransportStreamReservedBitrate().equals(this.getTransportStreamReservedBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumVideoBufferDelayMilliseconds() == null) ? 0 : getMaximumVideoBufferDelayMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getTransportStreamBitrate() == null) ? 0 : getTransportStreamBitrate().hashCode());
        hashCode = prime * hashCode + ((getTransportStreamId() == null) ? 0 : getTransportStreamId().hashCode());
        hashCode = prime * hashCode + ((getTransportStreamReservedBitrate() == null) ? 0 : getTransportStreamReservedBitrate().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexSettings clone() {
        try {
            return (MultiplexSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
