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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ValidateE911Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateE911AddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The address street number, such as <code>200</code> or <code>2121</code>.
     * </p>
     */
    private String streetNumber;
    /**
     * <p>
     * The address street information, such as <code>8th Avenue</code>.
     * </p>
     */
    private String streetInfo;
    /**
     * <p>
     * The address city, such as <code>Portland</code>.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The address state, such as <code>ME</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The address country, such as <code>US</code>.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The address postal code, such as <code>04352</code>.
     * </p>
     */
    private String postalCode;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The address street number, such as <code>200</code> or <code>2121</code>.
     * </p>
     * 
     * @param streetNumber
     *        The address street number, such as <code>200</code> or <code>2121</code>.
     */

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * <p>
     * The address street number, such as <code>200</code> or <code>2121</code>.
     * </p>
     * 
     * @return The address street number, such as <code>200</code> or <code>2121</code>.
     */

    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * <p>
     * The address street number, such as <code>200</code> or <code>2121</code>.
     * </p>
     * 
     * @param streetNumber
     *        The address street number, such as <code>200</code> or <code>2121</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withStreetNumber(String streetNumber) {
        setStreetNumber(streetNumber);
        return this;
    }

    /**
     * <p>
     * The address street information, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @param streetInfo
     *        The address street information, such as <code>8th Avenue</code>.
     */

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    /**
     * <p>
     * The address street information, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @return The address street information, such as <code>8th Avenue</code>.
     */

    public String getStreetInfo() {
        return this.streetInfo;
    }

    /**
     * <p>
     * The address street information, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @param streetInfo
     *        The address street information, such as <code>8th Avenue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withStreetInfo(String streetInfo) {
        setStreetInfo(streetInfo);
        return this;
    }

    /**
     * <p>
     * The address city, such as <code>Portland</code>.
     * </p>
     * 
     * @param city
     *        The address city, such as <code>Portland</code>.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The address city, such as <code>Portland</code>.
     * </p>
     * 
     * @return The address city, such as <code>Portland</code>.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The address city, such as <code>Portland</code>.
     * </p>
     * 
     * @param city
     *        The address city, such as <code>Portland</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The address state, such as <code>ME</code>.
     * </p>
     * 
     * @param state
     *        The address state, such as <code>ME</code>.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The address state, such as <code>ME</code>.
     * </p>
     * 
     * @return The address state, such as <code>ME</code>.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The address state, such as <code>ME</code>.
     * </p>
     * 
     * @param state
     *        The address state, such as <code>ME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The address country, such as <code>US</code>.
     * </p>
     * 
     * @param country
     *        The address country, such as <code>US</code>.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The address country, such as <code>US</code>.
     * </p>
     * 
     * @return The address country, such as <code>US</code>.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The address country, such as <code>US</code>.
     * </p>
     * 
     * @param country
     *        The address country, such as <code>US</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The address postal code, such as <code>04352</code>.
     * </p>
     * 
     * @param postalCode
     *        The address postal code, such as <code>04352</code>.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The address postal code, such as <code>04352</code>.
     * </p>
     * 
     * @return The address postal code, such as <code>04352</code>.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The address postal code, such as <code>04352</code>.
     * </p>
     * 
     * @param postalCode
     *        The address postal code, such as <code>04352</code>.
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
