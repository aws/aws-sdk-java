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
 * DescribeVTLDevicesOutput
 * </p>
 */
public class DescribeVTLDevicesResult implements Serializable {

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
     * An array of VTL device objects composed of the Amazon Resource
     * Name(ARN) of the VTL devices.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice> vTLDevices;

    /**
     * An opaque string that indicates the position at which the VTL devices
     * that were fetched for description ended. Use the marker in your next
     * request to fetch the next set of VTL devices in the list. If there are
     * no more VTL devices to describe, this field does not appear in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

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
    public DescribeVTLDevicesResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * An array of VTL device objects composed of the Amazon Resource
     * Name(ARN) of the VTL devices.
     *
     * @return An array of VTL device objects composed of the Amazon Resource
     *         Name(ARN) of the VTL devices.
     */
    public java.util.List<VTLDevice> getVTLDevices() {
        if (vTLDevices == null) {
              vTLDevices = new com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice>();
              vTLDevices.setAutoConstruct(true);
        }
        return vTLDevices;
    }
    
    /**
     * An array of VTL device objects composed of the Amazon Resource
     * Name(ARN) of the VTL devices.
     *
     * @param vTLDevices An array of VTL device objects composed of the Amazon Resource
     *         Name(ARN) of the VTL devices.
     */
    public void setVTLDevices(java.util.Collection<VTLDevice> vTLDevices) {
        if (vTLDevices == null) {
            this.vTLDevices = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice> vTLDevicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice>(vTLDevices.size());
        vTLDevicesCopy.addAll(vTLDevices);
        this.vTLDevices = vTLDevicesCopy;
    }
    
    /**
     * An array of VTL device objects composed of the Amazon Resource
     * Name(ARN) of the VTL devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDevices An array of VTL device objects composed of the Amazon Resource
     *         Name(ARN) of the VTL devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesResult withVTLDevices(VTLDevice... vTLDevices) {
        if (getVTLDevices() == null) setVTLDevices(new java.util.ArrayList<VTLDevice>(vTLDevices.length));
        for (VTLDevice value : vTLDevices) {
            getVTLDevices().add(value);
        }
        return this;
    }
    
    /**
     * An array of VTL device objects composed of the Amazon Resource
     * Name(ARN) of the VTL devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDevices An array of VTL device objects composed of the Amazon Resource
     *         Name(ARN) of the VTL devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesResult withVTLDevices(java.util.Collection<VTLDevice> vTLDevices) {
        if (vTLDevices == null) {
            this.vTLDevices = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice> vTLDevicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VTLDevice>(vTLDevices.size());
            vTLDevicesCopy.addAll(vTLDevices);
            this.vTLDevices = vTLDevicesCopy;
        }

        return this;
    }

    /**
     * An opaque string that indicates the position at which the VTL devices
     * that were fetched for description ended. Use the marker in your next
     * request to fetch the next set of VTL devices in the list. If there are
     * no more VTL devices to describe, this field does not appear in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return An opaque string that indicates the position at which the VTL devices
     *         that were fetched for description ended. Use the marker in your next
     *         request to fetch the next set of VTL devices in the list. If there are
     *         no more VTL devices to describe, this field does not appear in the
     *         response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that indicates the position at which the VTL devices
     * that were fetched for description ended. Use the marker in your next
     * request to fetch the next set of VTL devices in the list. If there are
     * no more VTL devices to describe, this field does not appear in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which the VTL devices
     *         that were fetched for description ended. Use the marker in your next
     *         request to fetch the next set of VTL devices in the list. If there are
     *         no more VTL devices to describe, this field does not appear in the
     *         response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that indicates the position at which the VTL devices
     * that were fetched for description ended. Use the marker in your next
     * request to fetch the next set of VTL devices in the list. If there are
     * no more VTL devices to describe, this field does not appear in the
     * response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which the VTL devices
     *         that were fetched for description ended. Use the marker in your next
     *         request to fetch the next set of VTL devices in the list. If there are
     *         no more VTL devices to describe, this field does not appear in the
     *         response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVTLDevicesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getVTLDevices() != null) sb.append("VTLDevices: " + getVTLDevices() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDevices() == null) ? 0 : getVTLDevices().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVTLDevicesResult == false) return false;
        DescribeVTLDevicesResult other = (DescribeVTLDevicesResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getVTLDevices() == null ^ this.getVTLDevices() == null) return false;
        if (other.getVTLDevices() != null && other.getVTLDevices().equals(this.getVTLDevices()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    