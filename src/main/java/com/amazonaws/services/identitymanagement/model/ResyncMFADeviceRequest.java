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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#resyncMFADevice(ResyncMFADeviceRequest) ResyncMFADevice operation}.
 * <p>
 * Synchronizes the specified MFA device with AWS servers.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#resyncMFADevice(ResyncMFADeviceRequest)
 */
public class ResyncMFADeviceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String authenticationCode1;

    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String authenticationCode2;

    /**
     * Default constructor for a new ResyncMFADeviceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResyncMFADeviceRequest() {}
    
    /**
     * Constructs a new ResyncMFADeviceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user whose MFA device you want to
     * resynchronize.
     * @param serialNumber Serial number that uniquely identifies the MFA
     * device.
     * @param authenticationCode1 An authentication code emitted by the
     * device.
     * @param authenticationCode2 A subsequent authentication code emitted by
     * the device.
     */
    public ResyncMFADeviceRequest(String userName, String serialNumber, String authenticationCode1, String authenticationCode2) {
        setUserName(userName);
        setSerialNumber(serialNumber);
        setAuthenticationCode1(authenticationCode1);
        setAuthenticationCode2(authenticationCode2);
    }

    /**
     * Name of the user whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user whose MFA device you want to resynchronize.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA device you want to resynchronize.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user whose MFA device you want to resynchronize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA device you want to resynchronize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResyncMFADeviceRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return Serial number that uniquely identifies the MFA device.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber Serial number that uniquely identifies the MFA device.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber Serial number that uniquely identifies the MFA device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResyncMFADeviceRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return An authentication code emitted by the device.
     */
    public String getAuthenticationCode1() {
        return authenticationCode1;
    }
    
    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode1 An authentication code emitted by the device.
     */
    public void setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
    }
    
    /**
     * An authentication code emitted by the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode1 An authentication code emitted by the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResyncMFADeviceRequest withAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
        return this;
    }

    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return A subsequent authentication code emitted by the device.
     */
    public String getAuthenticationCode2() {
        return authenticationCode2;
    }
    
    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode2 A subsequent authentication code emitted by the device.
     */
    public void setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
    }
    
    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode2 A subsequent authentication code emitted by the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResyncMFADeviceRequest withAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
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
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getAuthenticationCode1() != null) sb.append("AuthenticationCode1: " + getAuthenticationCode1() + ",");
        if (getAuthenticationCode2() != null) sb.append("AuthenticationCode2: " + getAuthenticationCode2() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode()); 
        hashCode = prime * hashCode + ((getAuthenticationCode1() == null) ? 0 : getAuthenticationCode1().hashCode()); 
        hashCode = prime * hashCode + ((getAuthenticationCode2() == null) ? 0 : getAuthenticationCode2().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResyncMFADeviceRequest == false) return false;
        ResyncMFADeviceRequest other = (ResyncMFADeviceRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        if (other.getAuthenticationCode1() == null ^ this.getAuthenticationCode1() == null) return false;
        if (other.getAuthenticationCode1() != null && other.getAuthenticationCode1().equals(this.getAuthenticationCode1()) == false) return false; 
        if (other.getAuthenticationCode2() == null ^ this.getAuthenticationCode2() == null) return false;
        if (other.getAuthenticationCode2() != null && other.getAuthenticationCode2().equals(this.getAuthenticationCode2()) == false) return false; 
        return true;
    }
    
}
    