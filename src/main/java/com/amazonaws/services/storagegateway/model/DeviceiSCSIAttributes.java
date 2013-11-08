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
 * Lists iSCSI information about a VTL device.
 * </p>
 */
public class DeviceiSCSIAttributes implements Serializable {

    /**
     * Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     * qualified name(iqn) of a tape drive or media changer target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * The network interface identifier of the VTL device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     */
    private String networkInterfaceId;

    /**
     * The port used to communicate with iSCSI VTL device targets.
     */
    private Integer networkInterfacePort;

    /**
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     */
    private Boolean chapEnabled;

    /**
     * Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     * qualified name(iqn) of a tape drive or media changer target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     *         qualified name(iqn) of a tape drive or media changer target.
     */
    public String getTargetARN() {
        return targetARN;
    }
    
    /**
     * Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     * qualified name(iqn) of a tape drive or media changer target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     *         qualified name(iqn) of a tape drive or media changer target.
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }
    
    /**
     * Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     * qualified name(iqn) of a tape drive or media changer target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN Specifies the unique Amazon Resource Name(ARN) that encodes the iSCSI
     *         qualified name(iqn) of a tape drive or media changer target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeviceiSCSIAttributes withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }

    /**
     * The network interface identifier of the VTL device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @return The network interface identifier of the VTL device.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The network interface identifier of the VTL device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface identifier of the VTL device.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The network interface identifier of the VTL device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface identifier of the VTL device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeviceiSCSIAttributes withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The port used to communicate with iSCSI VTL device targets.
     *
     * @return The port used to communicate with iSCSI VTL device targets.
     */
    public Integer getNetworkInterfacePort() {
        return networkInterfacePort;
    }
    
    /**
     * The port used to communicate with iSCSI VTL device targets.
     *
     * @param networkInterfacePort The port used to communicate with iSCSI VTL device targets.
     */
    public void setNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
    }
    
    /**
     * The port used to communicate with iSCSI VTL device targets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfacePort The port used to communicate with iSCSI VTL device targets.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeviceiSCSIAttributes withNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
        return this;
    }

    /**
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     *
     * @return Indicates whether mutual CHAP is enabled for the iSCSI target.
     */
    public Boolean isChapEnabled() {
        return chapEnabled;
    }
    
    /**
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     *
     * @param chapEnabled Indicates whether mutual CHAP is enabled for the iSCSI target.
     */
    public void setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
    }
    
    /**
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param chapEnabled Indicates whether mutual CHAP is enabled for the iSCSI target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeviceiSCSIAttributes withChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
        return this;
    }

    /**
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     *
     * @return Indicates whether mutual CHAP is enabled for the iSCSI target.
     */
    public Boolean getChapEnabled() {
        return chapEnabled;
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
        if (getTargetARN() != null) sb.append("TargetARN: " + getTargetARN() + ",");
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkInterfacePort() != null) sb.append("NetworkInterfacePort: " + getNetworkInterfacePort() + ",");
        if (isChapEnabled() != null) sb.append("ChapEnabled: " + isChapEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfacePort() == null) ? 0 : getNetworkInterfacePort().hashCode()); 
        hashCode = prime * hashCode + ((isChapEnabled() == null) ? 0 : isChapEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeviceiSCSIAttributes == false) return false;
        DeviceiSCSIAttributes other = (DeviceiSCSIAttributes)obj;
        
        if (other.getTargetARN() == null ^ this.getTargetARN() == null) return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getNetworkInterfacePort() == null ^ this.getNetworkInterfacePort() == null) return false;
        if (other.getNetworkInterfacePort() != null && other.getNetworkInterfacePort().equals(this.getNetworkInterfacePort()) == false) return false; 
        if (other.isChapEnabled() == null ^ this.isChapEnabled() == null) return false;
        if (other.isChapEnabled() != null && other.isChapEnabled().equals(this.isChapEnabled()) == false) return false; 
        return true;
    }
    
}
    