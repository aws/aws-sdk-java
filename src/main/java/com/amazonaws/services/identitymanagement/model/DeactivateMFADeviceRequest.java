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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deactivateMFADevice(DeactivateMFADeviceRequest) DeactivateMFADevice operation}.
 * <p>
 * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deactivateMFADevice(DeactivateMFADeviceRequest)
 */
public class DeactivateMFADeviceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user whose MFA device you want to deactivate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * Default constructor for a new DeactivateMFADeviceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeactivateMFADeviceRequest() {}
    
    /**
     * Constructs a new DeactivateMFADeviceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user whose MFA device you want to
     * deactivate.
     * @param serialNumber The serial number that uniquely identifies the MFA
     * device. For virtual MFA devices, the serial number is the device ARN.
     */
    public DeactivateMFADeviceRequest(String userName, String serialNumber) {
        setUserName(userName);
        setSerialNumber(serialNumber);
    }

    /**
     * Name of the user whose MFA device you want to deactivate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user whose MFA device you want to deactivate.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user whose MFA device you want to deactivate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA device you want to deactivate.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user whose MFA device you want to deactivate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA device you want to deactivate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeactivateMFADeviceRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the device ARN.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the device ARN.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the device ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeactivateMFADeviceRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeactivateMFADeviceRequest == false) return false;
        DeactivateMFADeviceRequest other = (DeactivateMFADeviceRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        return true;
    }
    
}
    