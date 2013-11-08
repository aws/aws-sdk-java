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
 * Represents a device object associated with a Gateway-Virtual Tape Library.
 * </p>
 */
public class VTLDevice implements Serializable {

    /**
     * Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     * Library device (tape drive or media changer).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDeviceARN;

    private String vTLDeviceType;

    private String vTLDeviceVendor;

    private String vTLDeviceProductIdentifier;

    /**
     * A list of iSCSI information about a VTL device.
     */
    private DeviceiSCSIAttributes deviceiSCSIAttributes;

    /**
     * Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     * Library device (tape drive or media changer).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     *         Library device (tape drive or media changer).
     */
    public String getVTLDeviceARN() {
        return vTLDeviceARN;
    }
    
    /**
     * Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     * Library device (tape drive or media changer).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     *         Library device (tape drive or media changer).
     */
    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }
    
    /**
     * Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     * Library device (tape drive or media changer).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN Specifies the unique Amazon Resource Name (ARN) of the Virtual Tape
     *         Library device (tape drive or media changer).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VTLDevice withVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
        return this;
    }

    /**
     * Returns the value of the VTLDeviceType property for this object.
     *
     * @return The value of the VTLDeviceType property for this object.
     */
    public String getVTLDeviceType() {
        return vTLDeviceType;
    }
    
    /**
     * Sets the value of the VTLDeviceType property for this object.
     *
     * @param vTLDeviceType The new value for the VTLDeviceType property for this object.
     */
    public void setVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
    }
    
    /**
     * Sets the value of the VTLDeviceType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDeviceType The new value for the VTLDeviceType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VTLDevice withVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
        return this;
    }

    /**
     * Returns the value of the VTLDeviceVendor property for this object.
     *
     * @return The value of the VTLDeviceVendor property for this object.
     */
    public String getVTLDeviceVendor() {
        return vTLDeviceVendor;
    }
    
    /**
     * Sets the value of the VTLDeviceVendor property for this object.
     *
     * @param vTLDeviceVendor The new value for the VTLDeviceVendor property for this object.
     */
    public void setVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
    }
    
    /**
     * Sets the value of the VTLDeviceVendor property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDeviceVendor The new value for the VTLDeviceVendor property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VTLDevice withVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
        return this;
    }

    /**
     * Returns the value of the VTLDeviceProductIdentifier property for this
     * object.
     *
     * @return The value of the VTLDeviceProductIdentifier property for this object.
     */
    public String getVTLDeviceProductIdentifier() {
        return vTLDeviceProductIdentifier;
    }
    
    /**
     * Sets the value of the VTLDeviceProductIdentifier property for this
     * object.
     *
     * @param vTLDeviceProductIdentifier The new value for the VTLDeviceProductIdentifier property for this
     *         object.
     */
    public void setVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
    }
    
    /**
     * Sets the value of the VTLDeviceProductIdentifier property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vTLDeviceProductIdentifier The new value for the VTLDeviceProductIdentifier property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VTLDevice withVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
        return this;
    }

    /**
     * A list of iSCSI information about a VTL device.
     *
     * @return A list of iSCSI information about a VTL device.
     */
    public DeviceiSCSIAttributes getDeviceiSCSIAttributes() {
        return deviceiSCSIAttributes;
    }
    
    /**
     * A list of iSCSI information about a VTL device.
     *
     * @param deviceiSCSIAttributes A list of iSCSI information about a VTL device.
     */
    public void setDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
    }
    
    /**
     * A list of iSCSI information about a VTL device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceiSCSIAttributes A list of iSCSI information about a VTL device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VTLDevice withDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
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
        if (getVTLDeviceARN() != null) sb.append("VTLDeviceARN: " + getVTLDeviceARN() + ",");
        if (getVTLDeviceType() != null) sb.append("VTLDeviceType: " + getVTLDeviceType() + ",");
        if (getVTLDeviceVendor() != null) sb.append("VTLDeviceVendor: " + getVTLDeviceVendor() + ",");
        if (getVTLDeviceProductIdentifier() != null) sb.append("VTLDeviceProductIdentifier: " + getVTLDeviceProductIdentifier() + ",");
        if (getDeviceiSCSIAttributes() != null) sb.append("DeviceiSCSIAttributes: " + getDeviceiSCSIAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDeviceType() == null) ? 0 : getVTLDeviceType().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDeviceVendor() == null) ? 0 : getVTLDeviceVendor().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDeviceProductIdentifier() == null) ? 0 : getVTLDeviceProductIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceiSCSIAttributes() == null) ? 0 : getDeviceiSCSIAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VTLDevice == false) return false;
        VTLDevice other = (VTLDevice)obj;
        
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null) return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false) return false; 
        if (other.getVTLDeviceType() == null ^ this.getVTLDeviceType() == null) return false;
        if (other.getVTLDeviceType() != null && other.getVTLDeviceType().equals(this.getVTLDeviceType()) == false) return false; 
        if (other.getVTLDeviceVendor() == null ^ this.getVTLDeviceVendor() == null) return false;
        if (other.getVTLDeviceVendor() != null && other.getVTLDeviceVendor().equals(this.getVTLDeviceVendor()) == false) return false; 
        if (other.getVTLDeviceProductIdentifier() == null ^ this.getVTLDeviceProductIdentifier() == null) return false;
        if (other.getVTLDeviceProductIdentifier() != null && other.getVTLDeviceProductIdentifier().equals(this.getVTLDeviceProductIdentifier()) == false) return false; 
        if (other.getDeviceiSCSIAttributes() == null ^ this.getDeviceiSCSIAttributes() == null) return false;
        if (other.getDeviceiSCSIAttributes() != null && other.getDeviceiSCSIAttributes().equals(this.getDeviceiSCSIAttributes()) == false) return false; 
        return true;
    }
    
}
    