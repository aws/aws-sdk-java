/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The address associated with the specified user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The street of the address.
     * </p>
     */
    private String streetAddress;
    /**
     * <p>
     * A string of the address locality.
     * </p>
     */
    private String locality;
    /**
     * <p>
     * The region of the address.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The postal code of the address.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The country of the address.
     * </p>
     */
    private String country;
    /**
     * <p>
     * A string containing a formatted version of the address for display.
     * </p>
     */
    private String formatted;
    /**
     * <p>
     * A string representing the type of address. For example, "Home."
     * </p>
     */
    private String type;
    /**
     * <p>
     * A Boolean value representing whether this is the primary address for the associated resource.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * The street of the address.
     * </p>
     * 
     * @param streetAddress
     *        The street of the address.
     */

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * <p>
     * The street of the address.
     * </p>
     * 
     * @return The street of the address.
     */

    public String getStreetAddress() {
        return this.streetAddress;
    }

    /**
     * <p>
     * The street of the address.
     * </p>
     * 
     * @param streetAddress
     *        The street of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetAddress(String streetAddress) {
        setStreetAddress(streetAddress);
        return this;
    }

    /**
     * <p>
     * A string of the address locality.
     * </p>
     * 
     * @param locality
     *        A string of the address locality.
     */

    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * <p>
     * A string of the address locality.
     * </p>
     * 
     * @return A string of the address locality.
     */

    public String getLocality() {
        return this.locality;
    }

    /**
     * <p>
     * A string of the address locality.
     * </p>
     * 
     * @param locality
     *        A string of the address locality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withLocality(String locality) {
        setLocality(locality);
        return this;
    }

    /**
     * <p>
     * The region of the address.
     * </p>
     * 
     * @param region
     *        The region of the address.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region of the address.
     * </p>
     * 
     * @return The region of the address.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The region of the address.
     * </p>
     * 
     * @param region
     *        The region of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The postal code of the address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of the address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code of the address.
     * </p>
     * 
     * @return The postal code of the address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code of the address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The country of the address.
     * </p>
     * 
     * @param country
     *        The country of the address.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country of the address.
     * </p>
     * 
     * @return The country of the address.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country of the address.
     * </p>
     * 
     * @param country
     *        The country of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * A string containing a formatted version of the address for display.
     * </p>
     * 
     * @param formatted
     *        A string containing a formatted version of the address for display.
     */

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    /**
     * <p>
     * A string containing a formatted version of the address for display.
     * </p>
     * 
     * @return A string containing a formatted version of the address for display.
     */

    public String getFormatted() {
        return this.formatted;
    }

    /**
     * <p>
     * A string containing a formatted version of the address for display.
     * </p>
     * 
     * @param formatted
     *        A string containing a formatted version of the address for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withFormatted(String formatted) {
        setFormatted(formatted);
        return this;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Home."
     * </p>
     * 
     * @param type
     *        A string representing the type of address. For example, "Home."
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Home."
     * </p>
     * 
     * @return A string representing the type of address. For example, "Home."
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A string representing the type of address. For example, "Home."
     * </p>
     * 
     * @param type
     *        A string representing the type of address. For example, "Home."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary address for the associated resource.
     * </p>
     * 
     * @param primary
     *        A Boolean value representing whether this is the primary address for the associated resource.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary address for the associated resource.
     * </p>
     * 
     * @return A Boolean value representing whether this is the primary address for the associated resource.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary address for the associated resource.
     * </p>
     * 
     * @param primary
     *        A Boolean value representing whether this is the primary address for the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * A Boolean value representing whether this is the primary address for the associated resource.
     * </p>
     * 
     * @return A Boolean value representing whether this is the primary address for the associated resource.
     */

    public Boolean isPrimary() {
        return this.primary;
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
        if (getStreetAddress() != null)
            sb.append("StreetAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getLocality() != null)
            sb.append("Locality: ").append("***Sensitive Data Redacted***").append(",");
        if (getRegion() != null)
            sb.append("Region: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountry() != null)
            sb.append("Country: ").append("***Sensitive Data Redacted***").append(",");
        if (getFormatted() != null)
            sb.append("Formatted: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrimary() != null)
            sb.append("Primary: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;
        if (other.getStreetAddress() == null ^ this.getStreetAddress() == null)
            return false;
        if (other.getStreetAddress() != null && other.getStreetAddress().equals(this.getStreetAddress()) == false)
            return false;
        if (other.getLocality() == null ^ this.getLocality() == null)
            return false;
        if (other.getLocality() != null && other.getLocality().equals(this.getLocality()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getFormatted() == null ^ this.getFormatted() == null)
            return false;
        if (other.getFormatted() != null && other.getFormatted().equals(this.getFormatted()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreetAddress() == null) ? 0 : getStreetAddress().hashCode());
        hashCode = prime * hashCode + ((getLocality() == null) ? 0 : getLocality().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getFormatted() == null) ? 0 : getFormatted().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
