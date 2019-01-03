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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the user context data captured at the time of an event request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/EventContextDataType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventContextDataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user's IP address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The user's device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The user's time zone.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The user's city.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The user's country.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The user's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The user's IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The user's IP address.
     * </p>
     * 
     * @return The user's IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The user's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The user's IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventContextDataType withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     * 
     * @param deviceName
     *        The user's device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     * 
     * @return The user's device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     * 
     * @param deviceName
     *        The user's device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventContextDataType withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     * 
     * @param timezone
     *        The user's time zone.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     * 
     * @return The user's time zone.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     * 
     * @param timezone
     *        The user's time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventContextDataType withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     * 
     * @param city
     *        The user's city.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     * 
     * @return The user's city.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     * 
     * @param city
     *        The user's city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventContextDataType withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     * 
     * @param country
     *        The user's country.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     * 
     * @return The user's country.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     * 
     * @param country
     *        The user's country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventContextDataType withCountry(String country) {
        setCountry(country);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventContextDataType == false)
            return false;
        EventContextDataType other = (EventContextDataType) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return hashCode;
    }

    @Override
    public EventContextDataType clone() {
        try {
            return (EventContextDataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.EventContextDataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
