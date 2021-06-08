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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates associated with the address properties of a customer profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first line of a customer address.
     * </p>
     */
    private String address1;
    /**
     * <p>
     * The second line of a customer address.
     * </p>
     */
    private String address2;
    /**
     * <p>
     * The third line of a customer address.
     * </p>
     */
    private String address3;
    /**
     * <p>
     * The fourth line of a customer address.
     * </p>
     */
    private String address4;
    /**
     * <p>
     * The city in which a customer lives.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The county in which a customer lives.
     * </p>
     */
    private String county;
    /**
     * <p>
     * The state in which a customer lives.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The province in which a customer lives.
     * </p>
     */
    private String province;
    /**
     * <p>
     * The country in which a customer lives.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The postal code of a customer address.
     * </p>
     */
    private String postalCode;

    /**
     * <p>
     * The first line of a customer address.
     * </p>
     * 
     * @param address1
     *        The first line of a customer address.
     */

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * <p>
     * The first line of a customer address.
     * </p>
     * 
     * @return The first line of a customer address.
     */

    public String getAddress1() {
        return this.address1;
    }

    /**
     * <p>
     * The first line of a customer address.
     * </p>
     * 
     * @param address1
     *        The first line of a customer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withAddress1(String address1) {
        setAddress1(address1);
        return this;
    }

    /**
     * <p>
     * The second line of a customer address.
     * </p>
     * 
     * @param address2
     *        The second line of a customer address.
     */

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * <p>
     * The second line of a customer address.
     * </p>
     * 
     * @return The second line of a customer address.
     */

    public String getAddress2() {
        return this.address2;
    }

    /**
     * <p>
     * The second line of a customer address.
     * </p>
     * 
     * @param address2
     *        The second line of a customer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withAddress2(String address2) {
        setAddress2(address2);
        return this;
    }

    /**
     * <p>
     * The third line of a customer address.
     * </p>
     * 
     * @param address3
     *        The third line of a customer address.
     */

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * <p>
     * The third line of a customer address.
     * </p>
     * 
     * @return The third line of a customer address.
     */

    public String getAddress3() {
        return this.address3;
    }

    /**
     * <p>
     * The third line of a customer address.
     * </p>
     * 
     * @param address3
     *        The third line of a customer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withAddress3(String address3) {
        setAddress3(address3);
        return this;
    }

    /**
     * <p>
     * The fourth line of a customer address.
     * </p>
     * 
     * @param address4
     *        The fourth line of a customer address.
     */

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    /**
     * <p>
     * The fourth line of a customer address.
     * </p>
     * 
     * @return The fourth line of a customer address.
     */

    public String getAddress4() {
        return this.address4;
    }

    /**
     * <p>
     * The fourth line of a customer address.
     * </p>
     * 
     * @param address4
     *        The fourth line of a customer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withAddress4(String address4) {
        setAddress4(address4);
        return this;
    }

    /**
     * <p>
     * The city in which a customer lives.
     * </p>
     * 
     * @param city
     *        The city in which a customer lives.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city in which a customer lives.
     * </p>
     * 
     * @return The city in which a customer lives.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city in which a customer lives.
     * </p>
     * 
     * @param city
     *        The city in which a customer lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The county in which a customer lives.
     * </p>
     * 
     * @param county
     *        The county in which a customer lives.
     */

    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * <p>
     * The county in which a customer lives.
     * </p>
     * 
     * @return The county in which a customer lives.
     */

    public String getCounty() {
        return this.county;
    }

    /**
     * <p>
     * The county in which a customer lives.
     * </p>
     * 
     * @param county
     *        The county in which a customer lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withCounty(String county) {
        setCounty(county);
        return this;
    }

    /**
     * <p>
     * The state in which a customer lives.
     * </p>
     * 
     * @param state
     *        The state in which a customer lives.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state in which a customer lives.
     * </p>
     * 
     * @return The state in which a customer lives.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state in which a customer lives.
     * </p>
     * 
     * @param state
     *        The state in which a customer lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The province in which a customer lives.
     * </p>
     * 
     * @param province
     *        The province in which a customer lives.
     */

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * <p>
     * The province in which a customer lives.
     * </p>
     * 
     * @return The province in which a customer lives.
     */

    public String getProvince() {
        return this.province;
    }

    /**
     * <p>
     * The province in which a customer lives.
     * </p>
     * 
     * @param province
     *        The province in which a customer lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withProvince(String province) {
        setProvince(province);
        return this;
    }

    /**
     * <p>
     * The country in which a customer lives.
     * </p>
     * 
     * @param country
     *        The country in which a customer lives.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country in which a customer lives.
     * </p>
     * 
     * @return The country in which a customer lives.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country in which a customer lives.
     * </p>
     * 
     * @param country
     *        The country in which a customer lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The postal code of a customer address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of a customer address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code of a customer address.
     * </p>
     * 
     * @return The postal code of a customer address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code of a customer address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of a customer address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAddress withPostalCode(String postalCode) {
        setPostalCode(postalCode);
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
        if (getAddress1() != null)
            sb.append("Address1: ").append(getAddress1()).append(",");
        if (getAddress2() != null)
            sb.append("Address2: ").append(getAddress2()).append(",");
        if (getAddress3() != null)
            sb.append("Address3: ").append(getAddress3()).append(",");
        if (getAddress4() != null)
            sb.append("Address4: ").append(getAddress4()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCounty() != null)
            sb.append("County: ").append(getCounty()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getProvince() != null)
            sb.append("Province: ").append(getProvince()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append(getPostalCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAddress == false)
            return false;
        UpdateAddress other = (UpdateAddress) obj;
        if (other.getAddress1() == null ^ this.getAddress1() == null)
            return false;
        if (other.getAddress1() != null && other.getAddress1().equals(this.getAddress1()) == false)
            return false;
        if (other.getAddress2() == null ^ this.getAddress2() == null)
            return false;
        if (other.getAddress2() != null && other.getAddress2().equals(this.getAddress2()) == false)
            return false;
        if (other.getAddress3() == null ^ this.getAddress3() == null)
            return false;
        if (other.getAddress3() != null && other.getAddress3().equals(this.getAddress3()) == false)
            return false;
        if (other.getAddress4() == null ^ this.getAddress4() == null)
            return false;
        if (other.getAddress4() != null && other.getAddress4().equals(this.getAddress4()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCounty() == null ^ this.getCounty() == null)
            return false;
        if (other.getCounty() != null && other.getCounty().equals(this.getCounty()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProvince() == null ^ this.getProvince() == null)
            return false;
        if (other.getProvince() != null && other.getProvince().equals(this.getProvince()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        hashCode = prime * hashCode + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        hashCode = prime * hashCode + ((getAddress3() == null) ? 0 : getAddress3().hashCode());
        hashCode = prime * hashCode + ((getAddress4() == null) ? 0 : getAddress4().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCounty() == null) ? 0 : getCounty().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProvince() == null) ? 0 : getProvince().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAddress clone() {
        try {
            return (UpdateAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.UpdateAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
