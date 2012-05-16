/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest) DeleteBandwidthRateLimit operation}.
 * <p>
 * This operation deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate limit, or you can delete
 * both. If you delete only one of the limits, the other limit remains unchanged. To specify which gateway to work with, use the Amazon Resource Name
 * (ARN) of the gateway in your request.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest)
 */
public class DeleteBandwidthRateLimitRequest extends AmazonWebServiceRequest {

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
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     */
    private String bandwidthType;

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
    public DeleteBandwidthRateLimitRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     *
     * @return One of the <a>BandwidthType</a> values that indicates the gateway
     *         bandwidth rate limit to delete. <p><i>Valid Values</i>:
     *         <code>Upload</code>, <code>Download</code>, <code>All</code>
     *
     * @see BandwidthType
     */
    public String getBandwidthType() {
        return bandwidthType;
    }
    
    /**
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     *
     * @param bandwidthType One of the <a>BandwidthType</a> values that indicates the gateway
     *         bandwidth rate limit to delete. <p><i>Valid Values</i>:
     *         <code>Upload</code>, <code>Download</code>, <code>All</code>
     *
     * @see BandwidthType
     */
    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }
    
    /**
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     *
     * @param bandwidthType One of the <a>BandwidthType</a> values that indicates the gateway
     *         bandwidth rate limit to delete. <p><i>Valid Values</i>:
     *         <code>Upload</code>, <code>Download</code>, <code>All</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see BandwidthType
     */
    public DeleteBandwidthRateLimitRequest withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    
    
    /**
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     *
     * @param bandwidthType One of the <a>BandwidthType</a> values that indicates the gateway
     *         bandwidth rate limit to delete. <p><i>Valid Values</i>:
     *         <code>Upload</code>, <code>Download</code>, <code>All</code>
     *
     * @see BandwidthType
     */
    public void setBandwidthType(BandwidthType bandwidthType) {
        this.bandwidthType = bandwidthType.toString();
    }
    
    /**
     * One of the <a>BandwidthType</a> values that indicates the gateway
     * bandwidth rate limit to delete. <p><i>Valid Values</i>:
     * <code>Upload</code>, <code>Download</code>, <code>All</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPLOAD, DOWNLOAD, ALL
     *
     * @param bandwidthType One of the <a>BandwidthType</a> values that indicates the gateway
     *         bandwidth rate limit to delete. <p><i>Valid Values</i>:
     *         <code>Upload</code>, <code>Download</code>, <code>All</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see BandwidthType
     */
    public DeleteBandwidthRateLimitRequest withBandwidthType(BandwidthType bandwidthType) {
        this.bandwidthType = bandwidthType.toString();
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
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (bandwidthType != null) sb.append("BandwidthType: " + bandwidthType + ", ");
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteBandwidthRateLimitRequest == false) return false;
        DeleteBandwidthRateLimitRequest other = (DeleteBandwidthRateLimitRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getBandwidthType() == null ^ this.getBandwidthType() == null) return false;
        if (other.getBandwidthType() != null && other.getBandwidthType().equals(this.getBandwidthType()) == false) return false; 
        return true;
    }
    
}
    