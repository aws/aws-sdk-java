/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Response to a <code>RegisterDevice</code> request.
 * </p>
 */
public class RegisterDeviceResult implements Serializable {

    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String deviceId;

    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique ID generated for this device by Cognito.
     */
    public String getDeviceId() {
        return deviceId;
    }
    
    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The unique ID generated for this device by Cognito.
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The unique ID generated for this device by Cognito.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceResult withDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
        if (getDeviceId() != null) sb.append("DeviceId: " + getDeviceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterDeviceResult == false) return false;
        RegisterDeviceResult other = (RegisterDeviceResult)obj;
        
        if (other.getDeviceId() == null ^ this.getDeviceId() == null) return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false) return false; 
        return true;
    }
    
}
    