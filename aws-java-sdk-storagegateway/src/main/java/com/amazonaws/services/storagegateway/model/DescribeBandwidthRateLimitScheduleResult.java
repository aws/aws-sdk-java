/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeBandwidthRateLimitSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBandwidthRateLimitScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BandwidthRateLimitInterval> bandwidthRateLimitIntervals;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBandwidthRateLimitScheduleResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * </p>
     * 
     * @return An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     */

    public java.util.List<BandwidthRateLimitInterval> getBandwidthRateLimitIntervals() {
        if (bandwidthRateLimitIntervals == null) {
            bandwidthRateLimitIntervals = new com.amazonaws.internal.SdkInternalList<BandwidthRateLimitInterval>();
        }
        return bandwidthRateLimitIntervals;
    }

    /**
     * <p>
     * An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     */

    public void setBandwidthRateLimitIntervals(java.util.Collection<BandwidthRateLimitInterval> bandwidthRateLimitIntervals) {
        if (bandwidthRateLimitIntervals == null) {
            this.bandwidthRateLimitIntervals = null;
            return;
        }

        this.bandwidthRateLimitIntervals = new com.amazonaws.internal.SdkInternalList<BandwidthRateLimitInterval>(bandwidthRateLimitIntervals);
    }

    /**
     * <p>
     * An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBandwidthRateLimitIntervals(java.util.Collection)} or
     * {@link #withBandwidthRateLimitIntervals(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBandwidthRateLimitScheduleResult withBandwidthRateLimitIntervals(BandwidthRateLimitInterval... bandwidthRateLimitIntervals) {
        if (this.bandwidthRateLimitIntervals == null) {
            setBandwidthRateLimitIntervals(new com.amazonaws.internal.SdkInternalList<BandwidthRateLimitInterval>(bandwidthRateLimitIntervals.length));
        }
        for (BandwidthRateLimitInterval ele : bandwidthRateLimitIntervals) {
            this.bandwidthRateLimitIntervals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array that contains the bandwidth rate limit intervals for a tape or volume gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBandwidthRateLimitScheduleResult withBandwidthRateLimitIntervals(java.util.Collection<BandwidthRateLimitInterval> bandwidthRateLimitIntervals) {
        setBandwidthRateLimitIntervals(bandwidthRateLimitIntervals);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getBandwidthRateLimitIntervals() != null)
            sb.append("BandwidthRateLimitIntervals: ").append(getBandwidthRateLimitIntervals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBandwidthRateLimitScheduleResult == false)
            return false;
        DescribeBandwidthRateLimitScheduleResult other = (DescribeBandwidthRateLimitScheduleResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getBandwidthRateLimitIntervals() == null ^ this.getBandwidthRateLimitIntervals() == null)
            return false;
        if (other.getBandwidthRateLimitIntervals() != null && other.getBandwidthRateLimitIntervals().equals(this.getBandwidthRateLimitIntervals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getBandwidthRateLimitIntervals() == null) ? 0 : getBandwidthRateLimitIntervals().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBandwidthRateLimitScheduleResult clone() {
        try {
            return (DescribeBandwidthRateLimitScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
