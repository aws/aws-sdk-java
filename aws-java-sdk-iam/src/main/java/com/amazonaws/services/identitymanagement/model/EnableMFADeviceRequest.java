/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class EnableMFADeviceRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the user for whom you want to enable the MFA device.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * An authentication code emitted by the device.
     * </p>
     */
    private String authenticationCode1;
    /**
     * <p>
     * A subsequent authentication code emitted by the device.
     * </p>
     */
    private String authenticationCode2;

    /**
     * Default constructor for EnableMFADeviceRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public EnableMFADeviceRequest() {
    }

    /**
     * Constructs a new EnableMFADeviceRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param userName
     *        The name of the user for whom you want to enable the MFA device.
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For
     *        virtual MFA devices, the serial number is the device ARN.
     * @param authenticationCode1
     *        An authentication code emitted by the device.
     * @param authenticationCode2
     *        A subsequent authentication code emitted by the device.
     */
    public EnableMFADeviceRequest(String userName, String serialNumber,
            String authenticationCode1, String authenticationCode2) {
        setUserName(userName);
        setSerialNumber(serialNumber);
        setAuthenticationCode1(authenticationCode1);
        setAuthenticationCode2(authenticationCode2);
    }

    /**
     * <p>
     * The name of the user for whom you want to enable the MFA device.
     * </p>
     * 
     * @param userName
     *        The name of the user for whom you want to enable the MFA device.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user for whom you want to enable the MFA device.
     * </p>
     * 
     * @return The name of the user for whom you want to enable the MFA device.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user for whom you want to enable the MFA device.
     * </p>
     * 
     * @param userName
     *        The name of the user for whom you want to enable the MFA device.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EnableMFADeviceRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * 
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For
     *        virtual MFA devices, the serial number is the device ARN.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * 
     * @return The serial number that uniquely identifies the MFA device. For
     *         virtual MFA devices, the serial number is the device ARN.
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * 
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For
     *        virtual MFA devices, the serial number is the device ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EnableMFADeviceRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * An authentication code emitted by the device.
     * </p>
     * 
     * @param authenticationCode1
     *        An authentication code emitted by the device.
     */
    public void setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
    }

    /**
     * <p>
     * An authentication code emitted by the device.
     * </p>
     * 
     * @return An authentication code emitted by the device.
     */
    public String getAuthenticationCode1() {
        return this.authenticationCode1;
    }

    /**
     * <p>
     * An authentication code emitted by the device.
     * </p>
     * 
     * @param authenticationCode1
     *        An authentication code emitted by the device.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EnableMFADeviceRequest withAuthenticationCode1(
            String authenticationCode1) {
        setAuthenticationCode1(authenticationCode1);
        return this;
    }

    /**
     * <p>
     * A subsequent authentication code emitted by the device.
     * </p>
     * 
     * @param authenticationCode2
     *        A subsequent authentication code emitted by the device.
     */
    public void setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
    }

    /**
     * <p>
     * A subsequent authentication code emitted by the device.
     * </p>
     * 
     * @return A subsequent authentication code emitted by the device.
     */
    public String getAuthenticationCode2() {
        return this.authenticationCode2;
    }

    /**
     * <p>
     * A subsequent authentication code emitted by the device.
     * </p>
     * 
     * @param authenticationCode2
     *        A subsequent authentication code emitted by the device.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EnableMFADeviceRequest withAuthenticationCode2(
            String authenticationCode2) {
        setAuthenticationCode2(authenticationCode2);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getAuthenticationCode1() != null)
            sb.append("AuthenticationCode1: " + getAuthenticationCode1() + ",");
        if (getAuthenticationCode2() != null)
            sb.append("AuthenticationCode2: " + getAuthenticationCode2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableMFADeviceRequest == false)
            return false;
        EnableMFADeviceRequest other = (EnableMFADeviceRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getAuthenticationCode1() == null
                ^ this.getAuthenticationCode1() == null)
            return false;
        if (other.getAuthenticationCode1() != null
                && other.getAuthenticationCode1().equals(
                        this.getAuthenticationCode1()) == false)
            return false;
        if (other.getAuthenticationCode2() == null
                ^ this.getAuthenticationCode2() == null)
            return false;
        if (other.getAuthenticationCode2() != null
                && other.getAuthenticationCode2().equals(
                        this.getAuthenticationCode2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthenticationCode1() == null) ? 0
                        : getAuthenticationCode1().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthenticationCode2() == null) ? 0
                        : getAuthenticationCode2().hashCode());
        return hashCode;
    }

    @Override
    public EnableMFADeviceRequest clone() {
        return (EnableMFADeviceRequest) super.clone();
    }
}