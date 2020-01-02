/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a phone number.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/NumberValidateResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberValidateResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The carrier or service provider that the phone number is currently registered with. In some countries and
     * regions, this value may be the carrier or service provider that the phone number was originally registered with.
     * </p>
     */
    private String carrier;
    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
     * </p>
     */
    private String cleansedPhoneNumberE164;
    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone number was originally registered.
     * </p>
     */
    private String cleansedPhoneNumberNational;
    /**
     * <p>
     * The name of the country or region where the phone number was originally registered.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     */
    private String countryCodeIso2;
    /**
     * <p>
     * The numeric code for the country or region where the phone number was originally registered.
     * </p>
     */
    private String countryCodeNumeric;
    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     */
    private String county;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     * </p>
     */
    private String originalCountryCodeIso2;
    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     */
    private String originalPhoneNumber;
    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     */
    private String phoneType;
    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4
     * (other), and 5 (prepaid).
     * </p>
     */
    private Integer phoneTypeCode;
    /**
     * <p>
     * The time zone for the location where the phone number was originally registered.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was originally registered.
     * </p>
     */
    private String zipCode;

    /**
     * <p>
     * The carrier or service provider that the phone number is currently registered with. In some countries and
     * regions, this value may be the carrier or service provider that the phone number was originally registered with.
     * </p>
     * 
     * @param carrier
     *        The carrier or service provider that the phone number is currently registered with. In some countries and
     *        regions, this value may be the carrier or service provider that the phone number was originally registered
     *        with.
     */

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * <p>
     * The carrier or service provider that the phone number is currently registered with. In some countries and
     * regions, this value may be the carrier or service provider that the phone number was originally registered with.
     * </p>
     * 
     * @return The carrier or service provider that the phone number is currently registered with. In some countries and
     *         regions, this value may be the carrier or service provider that the phone number was originally
     *         registered with.
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     * <p>
     * The carrier or service provider that the phone number is currently registered with. In some countries and
     * regions, this value may be the carrier or service provider that the phone number was originally registered with.
     * </p>
     * 
     * @param carrier
     *        The carrier or service provider that the phone number is currently registered with. In some countries and
     *        regions, this value may be the carrier or service provider that the phone number was originally registered
     *        with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCarrier(String carrier) {
        setCarrier(carrier);
        return this;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     * 
     * @param city
     *        The name of the city where the phone number was originally registered.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     * 
     * @return The name of the city where the phone number was originally registered.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     * 
     * @param city
     *        The name of the city where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
     * </p>
     * 
     * @param cleansedPhoneNumberE164
     *        The cleansed phone number, in E.164 format, for the location where the phone number was originally
     *        registered.
     */

    public void setCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        this.cleansedPhoneNumberE164 = cleansedPhoneNumberE164;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
     * </p>
     * 
     * @return The cleansed phone number, in E.164 format, for the location where the phone number was originally
     *         registered.
     */

    public String getCleansedPhoneNumberE164() {
        return this.cleansedPhoneNumberE164;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
     * </p>
     * 
     * @param cleansedPhoneNumberE164
     *        The cleansed phone number, in E.164 format, for the location where the phone number was originally
     *        registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        setCleansedPhoneNumberE164(cleansedPhoneNumberE164);
        return this;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone number was originally registered.
     * </p>
     * 
     * @param cleansedPhoneNumberNational
     *        The cleansed phone number, in the format for the location where the phone number was originally
     *        registered.
     */

    public void setCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        this.cleansedPhoneNumberNational = cleansedPhoneNumberNational;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone number was originally registered.
     * </p>
     * 
     * @return The cleansed phone number, in the format for the location where the phone number was originally
     *         registered.
     */

    public String getCleansedPhoneNumberNational() {
        return this.cleansedPhoneNumberNational;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone number was originally registered.
     * </p>
     * 
     * @param cleansedPhoneNumberNational
     *        The cleansed phone number, in the format for the location where the phone number was originally
     *        registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        setCleansedPhoneNumberNational(cleansedPhoneNumberNational);
        return this;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally registered.
     * </p>
     * 
     * @param country
     *        The name of the country or region where the phone number was originally registered.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally registered.
     * </p>
     * 
     * @return The name of the country or region where the phone number was originally registered.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally registered.
     * </p>
     * 
     * @param country
     *        The name of the country or region where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @param countryCodeIso2
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     *        originally registered.
     */

    public void setCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number
     *         was originally registered.
     */

    public String getCountryCodeIso2() {
        return this.countryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @param countryCodeIso2
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     *        originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCountryCodeIso2(String countryCodeIso2) {
        setCountryCodeIso2(countryCodeIso2);
        return this;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was originally registered.
     * </p>
     * 
     * @param countryCodeNumeric
     *        The numeric code for the country or region where the phone number was originally registered.
     */

    public void setCountryCodeNumeric(String countryCodeNumeric) {
        this.countryCodeNumeric = countryCodeNumeric;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was originally registered.
     * </p>
     * 
     * @return The numeric code for the country or region where the phone number was originally registered.
     */

    public String getCountryCodeNumeric() {
        return this.countryCodeNumeric;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was originally registered.
     * </p>
     * 
     * @param countryCodeNumeric
     *        The numeric code for the country or region where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCountryCodeNumeric(String countryCodeNumeric) {
        setCountryCodeNumeric(countryCodeNumeric);
        return this;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     * 
     * @param county
     *        The name of the county where the phone number was originally registered.
     */

    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     * 
     * @return The name of the county where the phone number was originally registered.
     */

    public String getCounty() {
        return this.county;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     * 
     * @param county
     *        The name of the county where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withCounty(String county) {
        setCounty(county);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     * </p>
     * 
     * @param originalCountryCodeIso2
     *        The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     */

    public void setOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        this.originalCountryCodeIso2 = originalCountryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     */

    public String getOriginalCountryCodeIso2() {
        return this.originalCountryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     * </p>
     * 
     * @param originalCountryCodeIso2
     *        The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        setOriginalCountryCodeIso2(originalCountryCodeIso2);
        return this;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     * 
     * @param originalPhoneNumber
     *        The phone number that was sent in the request body.
     */

    public void setOriginalPhoneNumber(String originalPhoneNumber) {
        this.originalPhoneNumber = originalPhoneNumber;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     * 
     * @return The phone number that was sent in the request body.
     */

    public String getOriginalPhoneNumber() {
        return this.originalPhoneNumber;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     * 
     * @param originalPhoneNumber
     *        The phone number that was sent in the request body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withOriginalPhoneNumber(String originalPhoneNumber) {
        setOriginalPhoneNumber(originalPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     * 
     * @param phoneType
     *        The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     */

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     * 
     * @return The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     */

    public String getPhoneType() {
        return this.phoneType;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     * 
     * @param phoneType
     *        The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withPhoneType(String phoneType) {
        setPhoneType(phoneType);
        return this;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4
     * (other), and 5 (prepaid).
     * </p>
     * 
     * @param phoneTypeCode
     *        The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3
     *        (invalid), 4 (other), and 5 (prepaid).
     */

    public void setPhoneTypeCode(Integer phoneTypeCode) {
        this.phoneTypeCode = phoneTypeCode;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4
     * (other), and 5 (prepaid).
     * </p>
     * 
     * @return The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3
     *         (invalid), 4 (other), and 5 (prepaid).
     */

    public Integer getPhoneTypeCode() {
        return this.phoneTypeCode;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4
     * (other), and 5 (prepaid).
     * </p>
     * 
     * @param phoneTypeCode
     *        The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3
     *        (invalid), 4 (other), and 5 (prepaid).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withPhoneTypeCode(Integer phoneTypeCode) {
        setPhoneTypeCode(phoneTypeCode);
        return this;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally registered.
     * </p>
     * 
     * @param timezone
     *        The time zone for the location where the phone number was originally registered.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally registered.
     * </p>
     * 
     * @return The time zone for the location where the phone number was originally registered.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally registered.
     * </p>
     * 
     * @param timezone
     *        The time zone for the location where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was originally registered.
     * </p>
     * 
     * @param zipCode
     *        The postal or ZIP code for the location where the phone number was originally registered.
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was originally registered.
     * </p>
     * 
     * @return The postal or ZIP code for the location where the phone number was originally registered.
     */

    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was originally registered.
     * </p>
     * 
     * @param zipCode
     *        The postal or ZIP code for the location where the phone number was originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateResponse withZipCode(String zipCode) {
        setZipCode(zipCode);
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
        if (getCarrier() != null)
            sb.append("Carrier: ").append(getCarrier()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCleansedPhoneNumberE164() != null)
            sb.append("CleansedPhoneNumberE164: ").append(getCleansedPhoneNumberE164()).append(",");
        if (getCleansedPhoneNumberNational() != null)
            sb.append("CleansedPhoneNumberNational: ").append(getCleansedPhoneNumberNational()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getCountryCodeIso2() != null)
            sb.append("CountryCodeIso2: ").append(getCountryCodeIso2()).append(",");
        if (getCountryCodeNumeric() != null)
            sb.append("CountryCodeNumeric: ").append(getCountryCodeNumeric()).append(",");
        if (getCounty() != null)
            sb.append("County: ").append(getCounty()).append(",");
        if (getOriginalCountryCodeIso2() != null)
            sb.append("OriginalCountryCodeIso2: ").append(getOriginalCountryCodeIso2()).append(",");
        if (getOriginalPhoneNumber() != null)
            sb.append("OriginalPhoneNumber: ").append(getOriginalPhoneNumber()).append(",");
        if (getPhoneType() != null)
            sb.append("PhoneType: ").append(getPhoneType()).append(",");
        if (getPhoneTypeCode() != null)
            sb.append("PhoneTypeCode: ").append(getPhoneTypeCode()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getZipCode() != null)
            sb.append("ZipCode: ").append(getZipCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberValidateResponse == false)
            return false;
        NumberValidateResponse other = (NumberValidateResponse) obj;
        if (other.getCarrier() == null ^ this.getCarrier() == null)
            return false;
        if (other.getCarrier() != null && other.getCarrier().equals(this.getCarrier()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCleansedPhoneNumberE164() == null ^ this.getCleansedPhoneNumberE164() == null)
            return false;
        if (other.getCleansedPhoneNumberE164() != null && other.getCleansedPhoneNumberE164().equals(this.getCleansedPhoneNumberE164()) == false)
            return false;
        if (other.getCleansedPhoneNumberNational() == null ^ this.getCleansedPhoneNumberNational() == null)
            return false;
        if (other.getCleansedPhoneNumberNational() != null && other.getCleansedPhoneNumberNational().equals(this.getCleansedPhoneNumberNational()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getCountryCodeIso2() == null ^ this.getCountryCodeIso2() == null)
            return false;
        if (other.getCountryCodeIso2() != null && other.getCountryCodeIso2().equals(this.getCountryCodeIso2()) == false)
            return false;
        if (other.getCountryCodeNumeric() == null ^ this.getCountryCodeNumeric() == null)
            return false;
        if (other.getCountryCodeNumeric() != null && other.getCountryCodeNumeric().equals(this.getCountryCodeNumeric()) == false)
            return false;
        if (other.getCounty() == null ^ this.getCounty() == null)
            return false;
        if (other.getCounty() != null && other.getCounty().equals(this.getCounty()) == false)
            return false;
        if (other.getOriginalCountryCodeIso2() == null ^ this.getOriginalCountryCodeIso2() == null)
            return false;
        if (other.getOriginalCountryCodeIso2() != null && other.getOriginalCountryCodeIso2().equals(this.getOriginalCountryCodeIso2()) == false)
            return false;
        if (other.getOriginalPhoneNumber() == null ^ this.getOriginalPhoneNumber() == null)
            return false;
        if (other.getOriginalPhoneNumber() != null && other.getOriginalPhoneNumber().equals(this.getOriginalPhoneNumber()) == false)
            return false;
        if (other.getPhoneType() == null ^ this.getPhoneType() == null)
            return false;
        if (other.getPhoneType() != null && other.getPhoneType().equals(this.getPhoneType()) == false)
            return false;
        if (other.getPhoneTypeCode() == null ^ this.getPhoneTypeCode() == null)
            return false;
        if (other.getPhoneTypeCode() != null && other.getPhoneTypeCode().equals(this.getPhoneTypeCode()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCleansedPhoneNumberE164() == null) ? 0 : getCleansedPhoneNumberE164().hashCode());
        hashCode = prime * hashCode + ((getCleansedPhoneNumberNational() == null) ? 0 : getCleansedPhoneNumberNational().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getCountryCodeIso2() == null) ? 0 : getCountryCodeIso2().hashCode());
        hashCode = prime * hashCode + ((getCountryCodeNumeric() == null) ? 0 : getCountryCodeNumeric().hashCode());
        hashCode = prime * hashCode + ((getCounty() == null) ? 0 : getCounty().hashCode());
        hashCode = prime * hashCode + ((getOriginalCountryCodeIso2() == null) ? 0 : getOriginalCountryCodeIso2().hashCode());
        hashCode = prime * hashCode + ((getOriginalPhoneNumber() == null) ? 0 : getOriginalPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneType() == null) ? 0 : getPhoneType().hashCode());
        hashCode = prime * hashCode + ((getPhoneTypeCode() == null) ? 0 : getPhoneTypeCode().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        return hashCode;
    }

    @Override
    public NumberValidateResponse clone() {
        try {
            return (NumberValidateResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.NumberValidateResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
