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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteBandwidthRateLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBandwidthRateLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     * </p>
     */
    private String bandwidthType;

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

    public DeleteBandwidthRateLimitRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     * </p>
     * 
     * @param bandwidthType
     *        One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.</p>
     *        <p>
     *        Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     */

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     * </p>
     * 
     * @return One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.</p>
     *         <p>
     *         Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     */

    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * <p>
     * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.
     * </p>
     * <p>
     * Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     * </p>
     * 
     * @param bandwidthType
     *        One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete.</p>
     *        <p>
     *        Valid Values: <code>Upload</code>, <code>Download</code>, <code>All</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBandwidthRateLimitRequest withBandwidthType(String bandwidthType) {
        setBandwidthType(bandwidthType);
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
        if (getBandwidthType() != null)
            sb.append("BandwidthType: ").append(getBandwidthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBandwidthRateLimitRequest == false)
            return false;
        DeleteBandwidthRateLimitRequest other = (DeleteBandwidthRateLimitRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getBandwidthType() == null ^ this.getBandwidthType() == null)
            return false;
        if (other.getBandwidthType() != null && other.getBandwidthType().equals(this.getBandwidthType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getBandwidthType() == null) ? 0 : getBandwidthType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBandwidthRateLimitRequest clone() {
        return (DeleteBandwidthRateLimitRequest) super.clone();
    }

}
