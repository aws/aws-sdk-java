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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateE911AddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String awsAccountId;

    private String streetNumber;

    private String streetInfo;

    private String city;

    private String state;

    private String country;

    private String postalCode;

    /**
     * @param awsAccountId
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * @return
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * @param awsAccountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * @param streetNumber
     */

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * @return
     */

    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * @param streetNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withStreetNumber(String streetNumber) {
        setStreetNumber(streetNumber);
        return this;
    }

    /**
     * @param streetInfo
     */

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    /**
     * @return
     */

    public String getStreetInfo() {
        return this.streetInfo;
    }

    /**
     * @param streetInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withStreetInfo(String streetInfo) {
        setStreetInfo(streetInfo);
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

    public ValidateE911AddressRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * @param state
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withState(String state) {
        setState(state);
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

    public ValidateE911AddressRequest withCountry(String country) {
        setCountry(country);
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

    public ValidateE911AddressRequest withPostalCode(String postalCode) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getStreetNumber() != null)
            sb.append("StreetNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreetInfo() != null)
            sb.append("StreetInfo: ").append("***Sensitive Data Redacted***").append(",");
        if (getCity() != null)
            sb.append("City: ").append("***Sensitive Data Redacted***").append(",");
        if (getState() != null)
            sb.append("State: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountry() != null)
            sb.append("Country: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateE911AddressRequest == false)
            return false;
        ValidateE911AddressRequest other = (ValidateE911AddressRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getStreetNumber() == null ^ this.getStreetNumber() == null)
            return false;
        if (other.getStreetNumber() != null && other.getStreetNumber().equals(this.getStreetNumber()) == false)
            return false;
        if (other.getStreetInfo() == null ^ this.getStreetInfo() == null)
            return false;
        if (other.getStreetInfo() != null && other.getStreetInfo().equals(this.getStreetInfo()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getStreetNumber() == null) ? 0 : getStreetNumber().hashCode());
        hashCode = prime * hashCode + ((getStreetInfo() == null) ? 0 : getStreetInfo().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        return hashCode;
    }

    @Override
    public ValidateE911AddressRequest clone() {
        return (ValidateE911AddressRequest) super.clone();
    }

}
