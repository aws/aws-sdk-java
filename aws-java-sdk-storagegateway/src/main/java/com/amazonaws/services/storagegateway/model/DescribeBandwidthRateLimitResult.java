/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeBandwidthRateLimitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the
     * upload rate limit is not set.
     * </p>
     */
    private Long averageUploadRateLimitInBitsPerSec;
    /**
     * <p>
     * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the
     * download rate limit is not set.
     * </p>
     */
    private Long averageDownloadRateLimitInBitsPerSec;

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

    public DescribeBandwidthRateLimitResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the
     * upload rate limit is not set.
     * </p>
     * 
     * @param averageUploadRateLimitInBitsPerSec
     *        The average upload bandwidth rate limit in bits per second. This field does not appear in the response if
     *        the upload rate limit is not set.
     */

    public void setAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the
     * upload rate limit is not set.
     * </p>
     * 
     * @return The average upload bandwidth rate limit in bits per second. This field does not appear in the response if
     *         the upload rate limit is not set.
     */

    public Long getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the
     * upload rate limit is not set.
     * </p>
     * 
     * @param averageUploadRateLimitInBitsPerSec
     *        The average upload bandwidth rate limit in bits per second. This field does not appear in the response if
     *        the upload rate limit is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBandwidthRateLimitResult withAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        setAverageUploadRateLimitInBitsPerSec(averageUploadRateLimitInBitsPerSec);
        return this;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the
     * download rate limit is not set.
     * </p>
     * 
     * @param averageDownloadRateLimitInBitsPerSec
     *        The average download bandwidth rate limit in bits per second. This field does not appear in the response
     *        if the download rate limit is not set.
     */

    public void setAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the
     * download rate limit is not set.
     * </p>
     * 
     * @return The average download bandwidth rate limit in bits per second. This field does not appear in the response
     *         if the download rate limit is not set.
     */

    public Long getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the
     * download rate limit is not set.
     * </p>
     * 
     * @param averageDownloadRateLimitInBitsPerSec
     *        The average download bandwidth rate limit in bits per second. This field does not appear in the response
     *        if the download rate limit is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBandwidthRateLimitResult withAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        setAverageDownloadRateLimitInBitsPerSec(averageDownloadRateLimitInBitsPerSec);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getAverageUploadRateLimitInBitsPerSec() != null)
            sb.append("AverageUploadRateLimitInBitsPerSec: " + getAverageUploadRateLimitInBitsPerSec() + ",");
        if (getAverageDownloadRateLimitInBitsPerSec() != null)
            sb.append("AverageDownloadRateLimitInBitsPerSec: " + getAverageDownloadRateLimitInBitsPerSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBandwidthRateLimitResult == false)
            return false;
        DescribeBandwidthRateLimitResult other = (DescribeBandwidthRateLimitResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() == null ^ this.getAverageUploadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() != null
                && other.getAverageUploadRateLimitInBitsPerSec().equals(this.getAverageUploadRateLimitInBitsPerSec()) == false)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() == null ^ this.getAverageDownloadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() != null
                && other.getAverageDownloadRateLimitInBitsPerSec().equals(this.getAverageDownloadRateLimitInBitsPerSec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getAverageUploadRateLimitInBitsPerSec() == null) ? 0 : getAverageUploadRateLimitInBitsPerSec().hashCode());
        hashCode = prime * hashCode + ((getAverageDownloadRateLimitInBitsPerSec() == null) ? 0 : getAverageDownloadRateLimitInBitsPerSec().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBandwidthRateLimitResult clone() {
        try {
            return (DescribeBandwidthRateLimitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
