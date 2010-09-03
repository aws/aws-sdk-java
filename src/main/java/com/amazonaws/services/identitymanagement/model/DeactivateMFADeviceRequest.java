/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deactivateMFADevice(DeactivateMFADeviceRequest) DeactivateMFADevice operation}.
 * <p>
 * Deactivates the specified MFA device and removes it from association
 * with the user for which it was originally enabled.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deactivateMFADevice(DeactivateMFADeviceRequest)
 */
public class DeactivateMFADeviceRequest extends AmazonWebServiceRequest {

    /**
     * Name of the user whose MFA device you want to deactivate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String serialNumber;

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
     * The serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The serial number that uniquely identifies the MFA device.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device.
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
        sb.append("UserName: " + userName + ", ");
        sb.append("SerialNumber: " + serialNumber + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    