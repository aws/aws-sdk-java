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
 * Contains summary configuration for a Multiplex event.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexSettingsSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /** Transport stream bit rate. */
    private Integer transportStreamBitrate;

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

    public MultiplexSettingsSummary withTransportStreamBitrate(Integer transportStreamBitrate) {
        setTransportStreamBitrate(transportStreamBitrate);
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
        if (getTransportStreamBitrate() != null)
            sb.append("TransportStreamBitrate: ").append(getTransportStreamBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexSettingsSummary == false)
            return false;
        MultiplexSettingsSummary other = (MultiplexSettingsSummary) obj;
        if (other.getTransportStreamBitrate() == null ^ this.getTransportStreamBitrate() == null)
            return false;
        if (other.getTransportStreamBitrate() != null && other.getTransportStreamBitrate().equals(this.getTransportStreamBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransportStreamBitrate() == null) ? 0 : getTransportStreamBitrate().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexSettingsSummary clone() {
        try {
            return (MultiplexSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
