/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Progressive Dialer config
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ProgressiveDialerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProgressiveDialerConfig implements Serializable, Cloneable, StructuredPojo {

    private Double bandwidthAllocation;

    /**
     * @param bandwidthAllocation
     */

    public void setBandwidthAllocation(Double bandwidthAllocation) {
        this.bandwidthAllocation = bandwidthAllocation;
    }

    /**
     * @return
     */

    public Double getBandwidthAllocation() {
        return this.bandwidthAllocation;
    }

    /**
     * @param bandwidthAllocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressiveDialerConfig withBandwidthAllocation(Double bandwidthAllocation) {
        setBandwidthAllocation(bandwidthAllocation);
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
        if (getBandwidthAllocation() != null)
            sb.append("BandwidthAllocation: ").append(getBandwidthAllocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProgressiveDialerConfig == false)
            return false;
        ProgressiveDialerConfig other = (ProgressiveDialerConfig) obj;
        if (other.getBandwidthAllocation() == null ^ this.getBandwidthAllocation() == null)
            return false;
        if (other.getBandwidthAllocation() != null && other.getBandwidthAllocation().equals(this.getBandwidthAllocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidthAllocation() == null) ? 0 : getBandwidthAllocation().hashCode());
        return hashCode;
    }

    @Override
    public ProgressiveDialerConfig clone() {
        try {
            return (ProgressiveDialerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.ProgressiveDialerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
