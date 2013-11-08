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
 * List Volumes Result
 */
public class ListVolumesResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    private String marker;

    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo> volumeInfos;

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
    public ListVolumesResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * Returns the value of the Marker property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns the value of the VolumeInfos property for this object.
     *
     * @return The value of the VolumeInfos property for this object.
     */
    public java.util.List<VolumeInfo> getVolumeInfos() {
        if (volumeInfos == null) {
              volumeInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo>();
              volumeInfos.setAutoConstruct(true);
        }
        return volumeInfos;
    }
    
    /**
     * Sets the value of the VolumeInfos property for this object.
     *
     * @param volumeInfos The new value for the VolumeInfos property for this object.
     */
    public void setVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        if (volumeInfos == null) {
            this.volumeInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo> volumeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo>(volumeInfos.size());
        volumeInfosCopy.addAll(volumeInfos);
        this.volumeInfos = volumeInfosCopy;
    }
    
    /**
     * Sets the value of the VolumeInfos property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeInfos The new value for the VolumeInfos property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumesResult withVolumeInfos(VolumeInfo... volumeInfos) {
        if (getVolumeInfos() == null) setVolumeInfos(new java.util.ArrayList<VolumeInfo>(volumeInfos.length));
        for (VolumeInfo value : volumeInfos) {
            getVolumeInfos().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VolumeInfos property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeInfos The new value for the VolumeInfos property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumesResult withVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        if (volumeInfos == null) {
            this.volumeInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo> volumeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeInfo>(volumeInfos.size());
            volumeInfosCopy.addAll(volumeInfos);
            this.volumeInfos = volumeInfosCopy;
        }

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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getVolumeInfos() != null) sb.append("VolumeInfos: " + getVolumeInfos() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeInfos() == null) ? 0 : getVolumeInfos().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListVolumesResult == false) return false;
        ListVolumesResult other = (ListVolumesResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getVolumeInfos() == null ^ this.getVolumeInfos() == null) return false;
        if (other.getVolumeInfos() != null && other.getVolumeInfos().equals(this.getVolumeInfos()) == false) return false; 
        return true;
    }
    
}
    