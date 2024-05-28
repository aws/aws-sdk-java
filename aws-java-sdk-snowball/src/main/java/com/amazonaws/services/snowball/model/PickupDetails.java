/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information identifying the person picking up the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/PickupDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PickupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the person picking up the device.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The phone number of the person picking up the device.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The email address of the person picking up the device.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The number on the credential identifying the person picking up the device.
     * </p>
     */
    private String identificationNumber;
    /**
     * <p>
     * Expiration date of the credential identifying the person picking up the device.
     * </p>
     */
    private java.util.Date identificationExpirationDate;
    /**
     * <p>
     * Organization that issued the credential identifying the person picking up the device.
     * </p>
     */
    private String identificationIssuingOrg;
    /**
     * <p>
     * The unique ID for a device that will be picked up.
     * </p>
     */
    private String devicePickupId;

    /**
     * <p>
     * The name of the person picking up the device.
     * </p>
     * 
     * @param name
     *        The name of the person picking up the device.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the person picking up the device.
     * </p>
     * 
     * @return The name of the person picking up the device.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the person picking up the device.
     * </p>
     * 
     * @param name
     *        The name of the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The phone number of the person picking up the device.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the person picking up the device.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the person picking up the device.
     * </p>
     * 
     * @return The phone number of the person picking up the device.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the person picking up the device.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The email address of the person picking up the device.
     * </p>
     * 
     * @param email
     *        The email address of the person picking up the device.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the person picking up the device.
     * </p>
     * 
     * @return The email address of the person picking up the device.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the person picking up the device.
     * </p>
     * 
     * @param email
     *        The email address of the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The number on the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationNumber
     *        The number on the credential identifying the person picking up the device.
     */

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    /**
     * <p>
     * The number on the credential identifying the person picking up the device.
     * </p>
     * 
     * @return The number on the credential identifying the person picking up the device.
     */

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    /**
     * <p>
     * The number on the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationNumber
     *        The number on the credential identifying the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withIdentificationNumber(String identificationNumber) {
        setIdentificationNumber(identificationNumber);
        return this;
    }

    /**
     * <p>
     * Expiration date of the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationExpirationDate
     *        Expiration date of the credential identifying the person picking up the device.
     */

    public void setIdentificationExpirationDate(java.util.Date identificationExpirationDate) {
        this.identificationExpirationDate = identificationExpirationDate;
    }

    /**
     * <p>
     * Expiration date of the credential identifying the person picking up the device.
     * </p>
     * 
     * @return Expiration date of the credential identifying the person picking up the device.
     */

    public java.util.Date getIdentificationExpirationDate() {
        return this.identificationExpirationDate;
    }

    /**
     * <p>
     * Expiration date of the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationExpirationDate
     *        Expiration date of the credential identifying the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withIdentificationExpirationDate(java.util.Date identificationExpirationDate) {
        setIdentificationExpirationDate(identificationExpirationDate);
        return this;
    }

    /**
     * <p>
     * Organization that issued the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationIssuingOrg
     *        Organization that issued the credential identifying the person picking up the device.
     */

    public void setIdentificationIssuingOrg(String identificationIssuingOrg) {
        this.identificationIssuingOrg = identificationIssuingOrg;
    }

    /**
     * <p>
     * Organization that issued the credential identifying the person picking up the device.
     * </p>
     * 
     * @return Organization that issued the credential identifying the person picking up the device.
     */

    public String getIdentificationIssuingOrg() {
        return this.identificationIssuingOrg;
    }

    /**
     * <p>
     * Organization that issued the credential identifying the person picking up the device.
     * </p>
     * 
     * @param identificationIssuingOrg
     *        Organization that issued the credential identifying the person picking up the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withIdentificationIssuingOrg(String identificationIssuingOrg) {
        setIdentificationIssuingOrg(identificationIssuingOrg);
        return this;
    }

    /**
     * <p>
     * The unique ID for a device that will be picked up.
     * </p>
     * 
     * @param devicePickupId
     *        The unique ID for a device that will be picked up.
     */

    public void setDevicePickupId(String devicePickupId) {
        this.devicePickupId = devicePickupId;
    }

    /**
     * <p>
     * The unique ID for a device that will be picked up.
     * </p>
     * 
     * @return The unique ID for a device that will be picked up.
     */

    public String getDevicePickupId() {
        return this.devicePickupId;
    }

    /**
     * <p>
     * The unique ID for a device that will be picked up.
     * </p>
     * 
     * @param devicePickupId
     *        The unique ID for a device that will be picked up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PickupDetails withDevicePickupId(String devicePickupId) {
        setDevicePickupId(devicePickupId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentificationNumber() != null)
            sb.append("IdentificationNumber: ").append(getIdentificationNumber()).append(",");
        if (getIdentificationExpirationDate() != null)
            sb.append("IdentificationExpirationDate: ").append(getIdentificationExpirationDate()).append(",");
        if (getIdentificationIssuingOrg() != null)
            sb.append("IdentificationIssuingOrg: ").append(getIdentificationIssuingOrg()).append(",");
        if (getDevicePickupId() != null)
            sb.append("DevicePickupId: ").append(getDevicePickupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PickupDetails == false)
            return false;
        PickupDetails other = (PickupDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getIdentificationNumber() == null ^ this.getIdentificationNumber() == null)
            return false;
        if (other.getIdentificationNumber() != null && other.getIdentificationNumber().equals(this.getIdentificationNumber()) == false)
            return false;
        if (other.getIdentificationExpirationDate() == null ^ this.getIdentificationExpirationDate() == null)
            return false;
        if (other.getIdentificationExpirationDate() != null && other.getIdentificationExpirationDate().equals(this.getIdentificationExpirationDate()) == false)
            return false;
        if (other.getIdentificationIssuingOrg() == null ^ this.getIdentificationIssuingOrg() == null)
            return false;
        if (other.getIdentificationIssuingOrg() != null && other.getIdentificationIssuingOrg().equals(this.getIdentificationIssuingOrg()) == false)
            return false;
        if (other.getDevicePickupId() == null ^ this.getDevicePickupId() == null)
            return false;
        if (other.getDevicePickupId() != null && other.getDevicePickupId().equals(this.getDevicePickupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getIdentificationNumber() == null) ? 0 : getIdentificationNumber().hashCode());
        hashCode = prime * hashCode + ((getIdentificationExpirationDate() == null) ? 0 : getIdentificationExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getIdentificationIssuingOrg() == null) ? 0 : getIdentificationIssuingOrg().hashCode());
        hashCode = prime * hashCode + ((getDevicePickupId() == null) ? 0 : getDevicePickupId().hashCode());
        return hashCode;
    }

    @Override
    public PickupDetails clone() {
        try {
            return (PickupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.PickupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
