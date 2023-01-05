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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetBandwidthRateLimitSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBandwidthRateLimitScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals
     * have been scheduled, the array is empty.
     * </p>
     */
    private java.util.List<BandwidthRateLimitInterval> bandwidthRateLimitIntervals;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     */
    private String gatewayArn;

    /**
     * <p>
     * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals
     * have been scheduled, the array is empty.
     * </p>
     * 
     * @return An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit
     *         intervals have been scheduled, the array is empty.
     */

    public java.util.List<BandwidthRateLimitInterval> getBandwidthRateLimitIntervals() {
        return bandwidthRateLimitIntervals;
    }

    /**
     * <p>
     * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals
     * have been scheduled, the array is empty.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit
     *        intervals have been scheduled, the array is empty.
     */

    public void setBandwidthRateLimitIntervals(java.util.Collection<BandwidthRateLimitInterval> bandwidthRateLimitIntervals) {
        if (bandwidthRateLimitIntervals == null) {
            this.bandwidthRateLimitIntervals = null;
            return;
        }

        this.bandwidthRateLimitIntervals = new java.util.ArrayList<BandwidthRateLimitInterval>(bandwidthRateLimitIntervals);
    }

    /**
     * <p>
     * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals
     * have been scheduled, the array is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBandwidthRateLimitIntervals(java.util.Collection)} or
     * {@link #withBandwidthRateLimitIntervals(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit
     *        intervals have been scheduled, the array is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBandwidthRateLimitScheduleResult withBandwidthRateLimitIntervals(BandwidthRateLimitInterval... bandwidthRateLimitIntervals) {
        if (this.bandwidthRateLimitIntervals == null) {
            setBandwidthRateLimitIntervals(new java.util.ArrayList<BandwidthRateLimitInterval>(bandwidthRateLimitIntervals.length));
        }
        for (BandwidthRateLimitInterval ele : bandwidthRateLimitIntervals) {
            this.bandwidthRateLimitIntervals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals
     * have been scheduled, the array is empty.
     * </p>
     * 
     * @param bandwidthRateLimitIntervals
     *        An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit
     *        intervals have been scheduled, the array is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBandwidthRateLimitScheduleResult withBandwidthRateLimitIntervals(java.util.Collection<BandwidthRateLimitInterval> bandwidthRateLimitIntervals) {
        setBandwidthRateLimitIntervals(bandwidthRateLimitIntervals);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *        <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *        Services Region.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *         <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *         Services Region.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *        <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBandwidthRateLimitScheduleResult withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
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
        if (getBandwidthRateLimitIntervals() != null)
            sb.append("BandwidthRateLimitIntervals: ").append(getBandwidthRateLimitIntervals()).append(",");
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBandwidthRateLimitScheduleResult == false)
            return false;
        GetBandwidthRateLimitScheduleResult other = (GetBandwidthRateLimitScheduleResult) obj;
        if (other.getBandwidthRateLimitIntervals() == null ^ this.getBandwidthRateLimitIntervals() == null)
            return false;
        if (other.getBandwidthRateLimitIntervals() != null && other.getBandwidthRateLimitIntervals().equals(this.getBandwidthRateLimitIntervals()) == false)
            return false;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidthRateLimitIntervals() == null) ? 0 : getBandwidthRateLimitIntervals().hashCode());
        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        return hashCode;
    }

    @Override
    public GetBandwidthRateLimitScheduleResult clone() {
        try {
            return (GetBandwidthRateLimitScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
