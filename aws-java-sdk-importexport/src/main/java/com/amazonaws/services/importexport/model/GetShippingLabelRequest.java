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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShippingLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<String> jobIds;

    private String name;

    private String company;

    private String phoneNumber;

    private String country;

    private String stateOrProvince;

    private String city;

    private String postalCode;

    private String street1;

    private String street2;

    private String street3;

    private String aPIVersion;

    /**
     * @return
     */

    public java.util.List<String> getJobIds() {
        if (jobIds == null) {
            jobIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobIds;
    }

    /**
     * @param jobIds
     */

    public void setJobIds(java.util.Collection<String> jobIds) {
        if (jobIds == null) {
            this.jobIds = null;
            return;
        }

        this.jobIds = new com.amazonaws.internal.SdkInternalList<String>(jobIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobIds(java.util.Collection)} or {@link #withJobIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withJobIds(String... jobIds) {
        if (this.jobIds == null) {
            setJobIds(new com.amazonaws.internal.SdkInternalList<String>(jobIds.length));
        }
        for (String ele : jobIds) {
            this.jobIds.add(ele);
        }
        return this;
    }

    /**
     * @param jobIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withJobIds(java.util.Collection<String> jobIds) {
        setJobIds(jobIds);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param company
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * @param company
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * @param phoneNumber
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @param phoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * @param country
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * @param stateOrProvince
     */

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * @return
     */

    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * @param stateOrProvince
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withStateOrProvince(String stateOrProvince) {
        setStateOrProvince(stateOrProvince);
        return this;
    }

    /**
     * @param city
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return
     */

    public String getCity() {
        return this.city;
    }

    /**
     * @param city
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * @param postalCode
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * @param postalCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * @param street1
     */

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * @return
     */

    public String getStreet1() {
        return this.street1;
    }

    /**
     * @param street1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withStreet1(String street1) {
        setStreet1(street1);
        return this;
    }

    /**
     * @param street2
     */

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * @return
     */

    public String getStreet2() {
        return this.street2;
    }

    /**
     * @param street2
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withStreet2(String street2) {
        setStreet2(street2);
        return this;
    }

    /**
     * @param street3
     */

    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * @return
     */

    public String getStreet3() {
        return this.street3;
    }

    /**
     * @param street3
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withStreet3(String street3) {
        setStreet3(street3);
        return this;
    }

    /**
     * @param aPIVersion
     */

    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * @return
     */

    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * @param aPIVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
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
        if (getJobIds() != null)
            sb.append("JobIds: ").append(getJobIds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCompany() != null)
            sb.append("Company: ").append(getCompany()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: ").append(getStateOrProvince()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append(getPostalCode()).append(",");
        if (getStreet1() != null)
            sb.append("Street1: ").append(getStreet1()).append(",");
        if (getStreet2() != null)
            sb.append("Street2: ").append(getStreet2()).append(",");
        if (getStreet3() != null)
            sb.append("Street3: ").append(getStreet3()).append(",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: ").append(getAPIVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShippingLabelRequest == false)
            return false;
        GetShippingLabelRequest other = (GetShippingLabelRequest) obj;
        if (other.getJobIds() == null ^ this.getJobIds() == null)
            return false;
        if (other.getJobIds() != null && other.getJobIds().equals(this.getJobIds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getStateOrProvince() == null ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getStreet1() == null ^ this.getStreet1() == null)
            return false;
        if (other.getStreet1() != null && other.getStreet1().equals(this.getStreet1()) == false)
            return false;
        if (other.getStreet2() == null ^ this.getStreet2() == null)
            return false;
        if (other.getStreet2() != null && other.getStreet2().equals(this.getStreet2()) == false)
            return false;
        if (other.getStreet3() == null ^ this.getStreet3() == null)
            return false;
        if (other.getStreet3() != null && other.getStreet3().equals(this.getStreet3()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getStateOrProvince() == null) ? 0 : getStateOrProvince().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        hashCode = prime * hashCode + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetShippingLabelRequest clone() {
        return (GetShippingLabelRequest) super.clone();
    }

}
