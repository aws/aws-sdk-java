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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#describeVTLDevices(DescribeVTLDevicesRequest) DescribeVTLDevices operation}.
 * <p>
 * Returns a description of Virtual Tape Library (VTL) devices for the gateway specified in the request. In the response, AWS Storage Gateway returns
 * Virtual Tape Library device information.
 * </p>
 * <p>
 * The list of Virtual Tape Library devices in the request must be from one gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#describeVTLDevices(DescribeVTLDevicesRequest)
 */
public class DescribeVTLDevicesRequest extends AmazonWebServiceRequest implements Serializable {

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
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     * Library(VTL) devices must be from the same gateway. If no VTL devices
     * are specified, the result will contain all devices on the specified
     * gateway.</note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vTLDeviceARNs;

    /**
     * An opaque string that indicates the position at which to begin
     * describing the VTL devices.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

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
    public DescribeVTLDevicesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     * Library(VTL) devices must be from the same gateway. If no VTL devices
     * are specified, the result will contain all devices on the specified
     * gateway.</note>
     *
     * @return An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     *         Library(VTL) devices must be from the same gateway. If no VTL devices
     *         are specified, the result will contain all devices on the specified
     *         gateway.</note>
     */
    public java.util.List<String> getVTLDeviceARNs() {
        if (vTLDeviceARNs == null) {
              vTLDeviceARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vTLDeviceARNs.setAutoConstruct(true);
        }
        return vTLDeviceARNs;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     * Library(VTL) devices must be from the same gateway. If no VTL devices
     * are specified, the result will contain all devices on the specified
     * gateway.</note>
     *
     * @param vTLDeviceARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     *         Library(VTL) devices must be from the same gateway. If no VTL devices
     *         are specified, the result will contain all devices on the specified
     *         gateway.</note>
     */
    public void setVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        if (vTLDeviceARNs == null) {
            this.vTLDeviceARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vTLDeviceARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vTLDeviceARNs.size());
        vTLDeviceARNsCopy.addAll(vTLDeviceARNs);
        this.vTLDeviceARNs = vTLDeviceARNsCopy;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     * Library(VTL) devices must be from the same gateway. If no VTL devices
     * are specified, the result will contain all devices on the specified
     * gateway.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDeviceARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     *         Library(VTL) devices must be from the same gateway. If no VTL devices
     *         are specified, the result will contain all devices on the specified
     *         gateway.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesRequest withVTLDeviceARNs(String... vTLDeviceARNs) {
        if (getVTLDeviceARNs() == null) setVTLDeviceARNs(new java.util.ArrayList<String>(vTLDeviceARNs.length));
        for (String value : vTLDeviceARNs) {
            getVTLDeviceARNs().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     * Library(VTL) devices must be from the same gateway. If no VTL devices
     * are specified, the result will contain all devices on the specified
     * gateway.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDeviceARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a VTL device. <note>All of the specified Virtual Tape
     *         Library(VTL) devices must be from the same gateway. If no VTL devices
     *         are specified, the result will contain all devices on the specified
     *         gateway.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesRequest withVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        if (vTLDeviceARNs == null) {
            this.vTLDeviceARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vTLDeviceARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vTLDeviceARNs.size());
            vTLDeviceARNsCopy.addAll(vTLDeviceARNs);
            this.vTLDeviceARNs = vTLDeviceARNsCopy;
        }

        return this;
    }

    /**
     * An opaque string that indicates the position at which to begin
     * describing the VTL devices.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return An opaque string that indicates the position at which to begin
     *         describing the VTL devices.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that indicates the position at which to begin
     * describing the VTL devices.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which to begin
     *         describing the VTL devices.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that indicates the position at which to begin
     * describing the VTL devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which to begin
     *         describing the VTL devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Specifies that the number of VTL devices described be limited to the
     *         specified number.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the number of VTL devices described be limited to the
     *         specified number.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies that the number of VTL devices described be limited to the
     * specified number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the number of VTL devices described be limited to the
     *         specified number.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getVTLDeviceARNs() != null) sb.append("VTLDeviceARNs: " + getVTLDeviceARNs() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDeviceARNs() == null) ? 0 : getVTLDeviceARNs().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVTLDevicesRequest == false) return false;
        DescribeVTLDevicesRequest other = (DescribeVTLDevicesRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getVTLDeviceARNs() == null ^ this.getVTLDeviceARNs() == null) return false;
        if (other.getVTLDeviceARNs() != null && other.getVTLDeviceARNs().equals(this.getVTLDeviceARNs()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    