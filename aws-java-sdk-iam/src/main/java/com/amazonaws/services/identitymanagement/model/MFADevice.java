/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about an MFA device.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>ListMFADevices</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/MFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MFADevice implements Serializable, Cloneable {

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the
     * device ARN.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     */
    private java.util.Date enableDate;

    /**
     * Default constructor for MFADevice object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public MFADevice() {
    }

    /**
     * Constructs a new MFADevice object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param userName
     *        The user with whom the MFA device is associated.
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is
     *        the device ARN.
     * @param enableDate
     *        The date when the MFA device was enabled for the user.
     */
    public MFADevice(String userName, String serialNumber, java.util.Date enableDate) {
        setUserName(userName);
        setSerialNumber(serialNumber);
        setEnableDate(enableDate);
    }

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * 
     * @param userName
     *        The user with whom the MFA device is associated.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * 
     * @return The user with whom the MFA device is associated.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * 
     * @param userName
     *        The user with whom the MFA device is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MFADevice withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the
     * device ARN.
     * </p>
     * 
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is
     *        the device ARN.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the
     * device ARN.
     * </p>
     * 
     * @return The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is
     *         the device ARN.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the
     * device ARN.
     * </p>
     * 
     * @param serialNumber
     *        The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is
     *        the device ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MFADevice withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     * 
     * @param enableDate
     *        The date when the MFA device was enabled for the user.
     */

    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     * 
     * @return The date when the MFA device was enabled for the user.
     */

    public java.util.Date getEnableDate() {
        return this.enableDate;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     * 
     * @param enableDate
     *        The date when the MFA device was enabled for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MFADevice withEnableDate(java.util.Date enableDate) {
        setEnableDate(enableDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getEnableDate() != null)
            sb.append("EnableDate: ").append(getEnableDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MFADevice == false)
            return false;
        MFADevice other = (MFADevice) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getEnableDate() == null ^ this.getEnableDate() == null)
            return false;
        if (other.getEnableDate() != null && other.getEnableDate().equals(this.getEnableDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getEnableDate() == null) ? 0 : getEnableDate().hashCode());
        return hashCode;
    }

    @Override
    public MFADevice clone() {
        try {
            return (MFADevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
