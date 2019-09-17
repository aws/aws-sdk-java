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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for public switched telephone network (PSTN) conferencing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PSTNDialIn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PSTNDialIn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zip code.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     */
    private String oneClickIdDelay;
    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     */
    private String oneClickPinDelay;

    /**
     * <p>
     * The zip code.
     * </p>
     * 
     * @param countryCode
     *        The zip code.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The zip code.
     * </p>
     * 
     * @return The zip code.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The zip code.
     * </p>
     * 
     * @param countryCode
     *        The zip code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PSTNDialIn withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to call to join the conference.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * 
     * @return The phone number to call to join the conference.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to call to join the conference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PSTNDialIn withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @param oneClickIdDelay
     *        The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each
     *        number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     */

    public void setOneClickIdDelay(String oneClickIdDelay) {
        this.oneClickIdDelay = oneClickIdDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @return The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each
     *         number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     */

    public String getOneClickIdDelay() {
        return this.oneClickIdDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @param oneClickIdDelay
     *        The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each
     *        number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PSTNDialIn withOneClickIdDelay(String oneClickIdDelay) {
        setOneClickIdDelay(oneClickIdDelay);
        return this;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @param oneClickPinDelay
     *        The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each
     *        number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     */

    public void setOneClickPinDelay(String oneClickPinDelay) {
        this.oneClickPinDelay = oneClickPinDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @return The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each
     *         number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     */

    public String getOneClickPinDelay() {
        return this.oneClickPinDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on
     * the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * </p>
     * 
     * @param oneClickPinDelay
     *        The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each
     *        number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PSTNDialIn withOneClickPinDelay(String oneClickPinDelay) {
        setOneClickPinDelay(oneClickPinDelay);
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
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getOneClickIdDelay() != null)
            sb.append("OneClickIdDelay: ").append(getOneClickIdDelay()).append(",");
        if (getOneClickPinDelay() != null)
            sb.append("OneClickPinDelay: ").append(getOneClickPinDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PSTNDialIn == false)
            return false;
        PSTNDialIn other = (PSTNDialIn) obj;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getOneClickIdDelay() == null ^ this.getOneClickIdDelay() == null)
            return false;
        if (other.getOneClickIdDelay() != null && other.getOneClickIdDelay().equals(this.getOneClickIdDelay()) == false)
            return false;
        if (other.getOneClickPinDelay() == null ^ this.getOneClickPinDelay() == null)
            return false;
        if (other.getOneClickPinDelay() != null && other.getOneClickPinDelay().equals(this.getOneClickPinDelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getOneClickIdDelay() == null) ? 0 : getOneClickIdDelay().hashCode());
        hashCode = prime * hashCode + ((getOneClickPinDelay() == null) ? 0 : getOneClickPinDelay().hashCode());
        return hashCode;
    }

    @Override
    public PSTNDialIn clone() {
        try {
            return (PSTNDialIn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.PSTNDialInMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
