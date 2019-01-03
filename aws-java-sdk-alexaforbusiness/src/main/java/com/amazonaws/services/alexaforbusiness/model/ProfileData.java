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
 * The data of a room profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ProfileData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The name of a room profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * Retrieves if the profile data is default or not.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The address of a room profile.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The timezone of a room profile.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     */
    private String temperatureUnit;
    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     */
    private String wakeWord;

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     * 
     * @param profileArn
     *        The ARN of a room profile.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     * 
     * @return The ARN of a room profile.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     * 
     * @param profileArn
     *        The ARN of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileData withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The name of a room profile.
     * </p>
     * 
     * @param profileName
     *        The name of a room profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of a room profile.
     * </p>
     * 
     * @return The name of a room profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of a room profile.
     * </p>
     * 
     * @param profileName
     *        The name of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileData withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * Retrieves if the profile data is default or not.
     * </p>
     * 
     * @param isDefault
     *        Retrieves if the profile data is default or not.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Retrieves if the profile data is default or not.
     * </p>
     * 
     * @return Retrieves if the profile data is default or not.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Retrieves if the profile data is default or not.
     * </p>
     * 
     * @param isDefault
     *        Retrieves if the profile data is default or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileData withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Retrieves if the profile data is default or not.
     * </p>
     * 
     * @return Retrieves if the profile data is default or not.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * 
     * @param address
     *        The address of a room profile.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * 
     * @return The address of a room profile.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * 
     * @param address
     *        The address of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileData withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The timezone of a room profile.
     * </p>
     * 
     * @param timezone
     *        The timezone of a room profile.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone of a room profile.
     * </p>
     * 
     * @return The timezone of a room profile.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone of a room profile.
     * </p>
     * 
     * @param timezone
     *        The timezone of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileData withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit of a room profile.
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * 
     * @return The distance unit of a room profile.
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public ProfileData withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public ProfileData withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit of a room profile.
     * @see TemperatureUnit
     */

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * 
     * @return The temperature unit of a room profile.
     * @see TemperatureUnit
     */

    public String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public ProfileData withTemperatureUnit(String temperatureUnit) {
        setTemperatureUnit(temperatureUnit);
        return this;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public ProfileData withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * 
     * @param wakeWord
     *        The wake word of a room profile.
     * @see WakeWord
     */

    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * 
     * @return The wake word of a room profile.
     * @see WakeWord
     */

    public String getWakeWord() {
        return this.wakeWord;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * 
     * @param wakeWord
     *        The wake word of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public ProfileData withWakeWord(String wakeWord) {
        setWakeWord(wakeWord);
        return this;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * 
     * @param wakeWord
     *        The wake word of a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public ProfileData withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
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
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getTemperatureUnit() != null)
            sb.append("TemperatureUnit: ").append(getTemperatureUnit()).append(",");
        if (getWakeWord() != null)
            sb.append("WakeWord: ").append(getWakeWord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileData == false)
            return false;
        ProfileData other = (ProfileData) obj;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getTemperatureUnit() == null ^ this.getTemperatureUnit() == null)
            return false;
        if (other.getTemperatureUnit() != null && other.getTemperatureUnit().equals(this.getTemperatureUnit()) == false)
            return false;
        if (other.getWakeWord() == null ^ this.getWakeWord() == null)
            return false;
        if (other.getWakeWord() != null && other.getWakeWord().equals(this.getWakeWord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getTemperatureUnit() == null) ? 0 : getTemperatureUnit().hashCode());
        hashCode = prime * hashCode + ((getWakeWord() == null) ? 0 : getWakeWord().hashCode());
        return hashCode;
    }

    @Override
    public ProfileData clone() {
        try {
            return (ProfileData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.ProfileDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
