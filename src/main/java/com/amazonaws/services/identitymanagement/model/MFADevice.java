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

/**
 * <p>
 * The MFADevice data type contains information about an MFA Device.
 * </p>
 * <p>
 * This data type is used as a response element in the action
 * ListMFADevices.
 * </p>
 */
public class MFADevice {

    /**
     * The user with whom the MFA device is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Serial number which uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String serialNumber;

    /**
     * The user with whom the MFA device is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The user with whom the MFA device is associated.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The user with whom the MFA device is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The user with whom the MFA device is associated.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The user with whom the MFA device is associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The user with whom the MFA device is associated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public MFADevice withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * Serial number which uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return Serial number which uniquely identifies the MFA device.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * Serial number which uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber Serial number which uniquely identifies the MFA device.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * Serial number which uniquely identifies the MFA device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber Serial number which uniquely identifies the MFA device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public MFADevice withSerialNumber(String serialNumber) {
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
    