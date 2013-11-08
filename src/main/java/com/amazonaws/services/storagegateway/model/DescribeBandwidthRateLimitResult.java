/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeBandwidthRateLimitResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * The average upload bandwidth rate limit in bits per second. This field
     * does not appear in the response if the upload rate limit is not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     */
    private Long averageUploadRateLimitInBitsPerSec;

    /**
     * The average download bandwidth rate limit in bits per second. This
     * field does not appear in the response if the download rate limit is
     * not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     */
    private Long averageDownloadRateLimitInBitsPerSec;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeBandwidthRateLimitResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * The average upload bandwidth rate limit in bits per second. This field
     * does not appear in the response if the upload rate limit is not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @return The average upload bandwidth rate limit in bits per second. This field
     *         does not appear in the response if the upload rate limit is not set.
     */
    public Long getAverageUploadRateLimitInBitsPerSec() {
        return averageUploadRateLimitInBitsPerSec;
    }
    
    /**
     * The average upload bandwidth rate limit in bits per second. This field
     * does not appear in the response if the upload rate limit is not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @param averageUploadRateLimitInBitsPerSec The average upload bandwidth rate limit in bits per second. This field
     *         does not appear in the response if the upload rate limit is not set.
     */
    public void setAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
    }
    
    /**
     * The average upload bandwidth rate limit in bits per second. This field
     * does not appear in the response if the upload rate limit is not set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51200 - <br/>
     *
     * @param averageUploadRateLimitInBitsPerSec The average upload bandwidth rate limit in bits per second. This field
     *         does not appear in the response if the upload rate limit is not set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeBandwidthRateLimitResult withAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
        return this;
    }

    /**
     * The average download bandwidth rate limit in bits per second. This
     * field does not appear in the response if the download rate limit is
     * not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @return The average download bandwidth rate limit in bits per second. This
     *         field does not appear in the response if the download rate limit is
     *         not set.
     */
    public Long getAverageDownloadRateLimitInBitsPerSec() {
        return averageDownloadRateLimitInBitsPerSec;
    }
    
    /**
     * The average download bandwidth rate limit in bits per second. This
     * field does not appear in the response if the download rate limit is
     * not set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @param averageDownloadRateLimitInBitsPerSec The average download bandwidth rate limit in bits per second. This
     *         field does not appear in the response if the download rate limit is
     *         not set.
     */
    public void setAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
    }
    
    /**
     * The average download bandwidth rate limit in bits per second. This
     * field does not appear in the response if the download rate limit is
     * not set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>102400 - <br/>
     *
     * @param averageDownloadRateLimitInBitsPerSec The average download bandwidth rate limit in bits per second. This
     *         field does not appear in the response if the download rate limit is
     *         not set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeBandwidthRateLimitResult withAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getAverageUploadRateLimitInBitsPerSec() != null) sb.append("AverageUploadRateLimitInBitsPerSec: " + getAverageUploadRateLimitInBitsPerSec() + ",");
        if (getAverageDownloadRateLimitInBitsPerSec() != null) sb.append("AverageDownloadRateLimitInBitsPerSec: " + getAverageDownloadRateLimitInBitsPerSec() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeBandwidthRateLimitResult == false) return false;
        DescribeBandwidthRateLimitResult other = (DescribeBandwidthRateLimitResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getAverageUploadRateLimitInBitsPerSec() == null ^ this.getAverageUploadRateLimitInBitsPerSec() == null) return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() != null && other.getAverageUploadRateLimitInBitsPerSec().equals(this.getAverageUploadRateLimitInBitsPerSec()) == false) return false; 
        if (other.getAverageDownloadRateLimitInBitsPerSec() == null ^ this.getAverageDownloadRateLimitInBitsPerSec() == null) return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() != null && other.getAverageDownloadRateLimitInBitsPerSec().equals(this.getAverageDownloadRateLimitInBitsPerSec()) == false) return false; 
        return true;
    }
    
}
    