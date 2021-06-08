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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the IP address of the device that an entity used to perform an action on an affected
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/IpAddressDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the device.
     * </p>
     */
    private String ipAddressV4;
    /**
     * <p>
     * The city that the IP address originated from.
     * </p>
     */
    private IpCity ipCity;
    /**
     * <p>
     * The country that the IP address originated from.
     * </p>
     */
    private IpCountry ipCountry;
    /**
     * <p>
     * The geographic coordinates of the location that the IP address originated from.
     * </p>
     */
    private IpGeoLocation ipGeoLocation;
    /**
     * <p>
     * The registered owner of the IP address.
     * </p>
     */
    private IpOwner ipOwner;

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the device.
     * </p>
     * 
     * @param ipAddressV4
     *        The Internet Protocol version 4 (IPv4) address of the device.
     */

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the device.
     * </p>
     * 
     * @return The Internet Protocol version 4 (IPv4) address of the device.
     */

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    /**
     * <p>
     * The Internet Protocol version 4 (IPv4) address of the device.
     * </p>
     * 
     * @param ipAddressV4
     *        The Internet Protocol version 4 (IPv4) address of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpAddressV4(String ipAddressV4) {
        setIpAddressV4(ipAddressV4);
        return this;
    }

    /**
     * <p>
     * The city that the IP address originated from.
     * </p>
     * 
     * @param ipCity
     *        The city that the IP address originated from.
     */

    public void setIpCity(IpCity ipCity) {
        this.ipCity = ipCity;
    }

    /**
     * <p>
     * The city that the IP address originated from.
     * </p>
     * 
     * @return The city that the IP address originated from.
     */

    public IpCity getIpCity() {
        return this.ipCity;
    }

    /**
     * <p>
     * The city that the IP address originated from.
     * </p>
     * 
     * @param ipCity
     *        The city that the IP address originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpCity(IpCity ipCity) {
        setIpCity(ipCity);
        return this;
    }

    /**
     * <p>
     * The country that the IP address originated from.
     * </p>
     * 
     * @param ipCountry
     *        The country that the IP address originated from.
     */

    public void setIpCountry(IpCountry ipCountry) {
        this.ipCountry = ipCountry;
    }

    /**
     * <p>
     * The country that the IP address originated from.
     * </p>
     * 
     * @return The country that the IP address originated from.
     */

    public IpCountry getIpCountry() {
        return this.ipCountry;
    }

    /**
     * <p>
     * The country that the IP address originated from.
     * </p>
     * 
     * @param ipCountry
     *        The country that the IP address originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpCountry(IpCountry ipCountry) {
        setIpCountry(ipCountry);
        return this;
    }

    /**
     * <p>
     * The geographic coordinates of the location that the IP address originated from.
     * </p>
     * 
     * @param ipGeoLocation
     *        The geographic coordinates of the location that the IP address originated from.
     */

    public void setIpGeoLocation(IpGeoLocation ipGeoLocation) {
        this.ipGeoLocation = ipGeoLocation;
    }

    /**
     * <p>
     * The geographic coordinates of the location that the IP address originated from.
     * </p>
     * 
     * @return The geographic coordinates of the location that the IP address originated from.
     */

    public IpGeoLocation getIpGeoLocation() {
        return this.ipGeoLocation;
    }

    /**
     * <p>
     * The geographic coordinates of the location that the IP address originated from.
     * </p>
     * 
     * @param ipGeoLocation
     *        The geographic coordinates of the location that the IP address originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpGeoLocation(IpGeoLocation ipGeoLocation) {
        setIpGeoLocation(ipGeoLocation);
        return this;
    }

    /**
     * <p>
     * The registered owner of the IP address.
     * </p>
     * 
     * @param ipOwner
     *        The registered owner of the IP address.
     */

    public void setIpOwner(IpOwner ipOwner) {
        this.ipOwner = ipOwner;
    }

    /**
     * <p>
     * The registered owner of the IP address.
     * </p>
     * 
     * @return The registered owner of the IP address.
     */

    public IpOwner getIpOwner() {
        return this.ipOwner;
    }

    /**
     * <p>
     * The registered owner of the IP address.
     * </p>
     * 
     * @param ipOwner
     *        The registered owner of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpOwner(IpOwner ipOwner) {
        setIpOwner(ipOwner);
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
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: ").append(getIpAddressV4()).append(",");
        if (getIpCity() != null)
            sb.append("IpCity: ").append(getIpCity()).append(",");
        if (getIpCountry() != null)
            sb.append("IpCountry: ").append(getIpCountry()).append(",");
        if (getIpGeoLocation() != null)
            sb.append("IpGeoLocation: ").append(getIpGeoLocation()).append(",");
        if (getIpOwner() != null)
            sb.append("IpOwner: ").append(getIpOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressDetails == false)
            return false;
        IpAddressDetails other = (IpAddressDetails) obj;
        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        if (other.getIpCity() == null ^ this.getIpCity() == null)
            return false;
        if (other.getIpCity() != null && other.getIpCity().equals(this.getIpCity()) == false)
            return false;
        if (other.getIpCountry() == null ^ this.getIpCountry() == null)
            return false;
        if (other.getIpCountry() != null && other.getIpCountry().equals(this.getIpCountry()) == false)
            return false;
        if (other.getIpGeoLocation() == null ^ this.getIpGeoLocation() == null)
            return false;
        if (other.getIpGeoLocation() != null && other.getIpGeoLocation().equals(this.getIpGeoLocation()) == false)
            return false;
        if (other.getIpOwner() == null ^ this.getIpOwner() == null)
            return false;
        if (other.getIpOwner() != null && other.getIpOwner().equals(this.getIpOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        hashCode = prime * hashCode + ((getIpCity() == null) ? 0 : getIpCity().hashCode());
        hashCode = prime * hashCode + ((getIpCountry() == null) ? 0 : getIpCountry().hashCode());
        hashCode = prime * hashCode + ((getIpGeoLocation() == null) ? 0 : getIpGeoLocation().hashCode());
        hashCode = prime * hashCode + ((getIpOwner() == null) ? 0 : getIpOwner().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressDetails clone() {
        try {
            return (IpAddressDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IpAddressDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
