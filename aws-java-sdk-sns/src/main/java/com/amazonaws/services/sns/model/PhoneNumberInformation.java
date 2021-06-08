/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of phone numbers and their metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/PhoneNumberInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The phone number.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The status of the phone number.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     * </p>
     */
    private String iso2CountryCode;
    /**
     * <p>
     * The list of supported routes.
     * </p>
     */
    private String routeType;
    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> numberCapabilities;

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the phone number was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     * 
     * @return The date and time when the phone number was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the phone number was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberInformation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     * 
     * @return The phone number.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberInformation withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * 
     * @param status
     *        The status of the phone number.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * 
     * @return The status of the phone number.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * 
     * @param status
     *        The status of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberInformation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @param iso2CountryCode
     *        The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     */

    public void setIso2CountryCode(String iso2CountryCode) {
        this.iso2CountryCode = iso2CountryCode;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @return The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     */

    public String getIso2CountryCode() {
        return this.iso2CountryCode;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @param iso2CountryCode
     *        The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberInformation withIso2CountryCode(String iso2CountryCode) {
        setIso2CountryCode(iso2CountryCode);
        return this;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * 
     * @param routeType
     *        The list of supported routes.
     * @see RouteType
     */

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * 
     * @return The list of supported routes.
     * @see RouteType
     */

    public String getRouteType() {
        return this.routeType;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * 
     * @param routeType
     *        The list of supported routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public PhoneNumberInformation withRouteType(String routeType) {
        setRouteType(routeType);
        return this;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * 
     * @param routeType
     *        The list of supported routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public PhoneNumberInformation withRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
        return this;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * 
     * @return The capabilities of each phone number.
     * @see NumberCapability
     */

    public java.util.List<String> getNumberCapabilities() {
        if (numberCapabilities == null) {
            numberCapabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return numberCapabilities;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * 
     * @param numberCapabilities
     *        The capabilities of each phone number.
     * @see NumberCapability
     */

    public void setNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        if (numberCapabilities == null) {
            this.numberCapabilities = null;
            return;
        }

        this.numberCapabilities = new com.amazonaws.internal.SdkInternalList<String>(numberCapabilities);
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNumberCapabilities(java.util.Collection)} or {@link #withNumberCapabilities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param numberCapabilities
     *        The capabilities of each phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public PhoneNumberInformation withNumberCapabilities(String... numberCapabilities) {
        if (this.numberCapabilities == null) {
            setNumberCapabilities(new com.amazonaws.internal.SdkInternalList<String>(numberCapabilities.length));
        }
        for (String ele : numberCapabilities) {
            this.numberCapabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * 
     * @param numberCapabilities
     *        The capabilities of each phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public PhoneNumberInformation withNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        setNumberCapabilities(numberCapabilities);
        return this;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * 
     * @param numberCapabilities
     *        The capabilities of each phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public PhoneNumberInformation withNumberCapabilities(NumberCapability... numberCapabilities) {
        com.amazonaws.internal.SdkInternalList<String> numberCapabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(numberCapabilities.length);
        for (NumberCapability value : numberCapabilities) {
            numberCapabilitiesCopy.add(value.toString());
        }
        if (getNumberCapabilities() == null) {
            setNumberCapabilities(numberCapabilitiesCopy);
        } else {
            getNumberCapabilities().addAll(numberCapabilitiesCopy);
        }
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIso2CountryCode() != null)
            sb.append("Iso2CountryCode: ").append(getIso2CountryCode()).append(",");
        if (getRouteType() != null)
            sb.append("RouteType: ").append(getRouteType()).append(",");
        if (getNumberCapabilities() != null)
            sb.append("NumberCapabilities: ").append(getNumberCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberInformation == false)
            return false;
        PhoneNumberInformation other = (PhoneNumberInformation) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIso2CountryCode() == null ^ this.getIso2CountryCode() == null)
            return false;
        if (other.getIso2CountryCode() != null && other.getIso2CountryCode().equals(this.getIso2CountryCode()) == false)
            return false;
        if (other.getRouteType() == null ^ this.getRouteType() == null)
            return false;
        if (other.getRouteType() != null && other.getRouteType().equals(this.getRouteType()) == false)
            return false;
        if (other.getNumberCapabilities() == null ^ this.getNumberCapabilities() == null)
            return false;
        if (other.getNumberCapabilities() != null && other.getNumberCapabilities().equals(this.getNumberCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIso2CountryCode() == null) ? 0 : getIso2CountryCode().hashCode());
        hashCode = prime * hashCode + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        hashCode = prime * hashCode + ((getNumberCapabilities() == null) ? 0 : getNumberCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberInformation clone() {
        try {
            return (PhoneNumberInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
