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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a room profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The valid address for the room.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     */
    private String temperatureUnit;
    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     */
    private String wakeWord;
    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     */
    private Boolean setupModeDisabled;
    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     */
    private Integer maxVolumeLimit;
    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     */
    private Boolean pSTNEnabled;

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

    public CreateProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * 
     * @param timezone
     *        The time zone used by a room profile.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * 
     * @return The time zone used by a room profile.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * 
     * @param timezone
     *        The time zone used by a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * 
     * @param address
     *        The valid address for the room.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * 
     * @return The valid address for the room.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * 
     * @param address
     *        The valid address for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit to be used by devices in the profile.
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * 
     * @return The distance unit to be used by devices in the profile.
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit to be used by devices in the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CreateProfileRequest withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * 
     * @param distanceUnit
     *        The distance unit to be used by devices in the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CreateProfileRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit to be used by devices in the profile.
     * @see TemperatureUnit
     */

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * 
     * @return The temperature unit to be used by devices in the profile.
     * @see TemperatureUnit
     */

    public String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit to be used by devices in the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public CreateProfileRequest withTemperatureUnit(String temperatureUnit) {
        setTemperatureUnit(temperatureUnit);
        return this;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The temperature unit to be used by devices in the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public CreateProfileRequest withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * 
     * @param wakeWord
     *        A wake word for Alexa, Echo, Amazon, or a computer.
     * @see WakeWord
     */

    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * 
     * @return A wake word for Alexa, Echo, Amazon, or a computer.
     * @see WakeWord
     */

    public String getWakeWord() {
        return this.wakeWord;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * 
     * @param wakeWord
     *        A wake word for Alexa, Echo, Amazon, or a computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public CreateProfileRequest withWakeWord(String wakeWord) {
        setWakeWord(wakeWord);
        return this;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * 
     * @param wakeWord
     *        A wake word for Alexa, Echo, Amazon, or a computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public CreateProfileRequest withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
        return this;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * 
     * @param clientRequestToken
     *        The user-specified token that is used during the creation of a profile.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * 
     * @return The user-specified token that is used during the creation of a profile.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * 
     * @param clientRequestToken
     *        The user-specified token that is used during the creation of a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     * 
     * @param setupModeDisabled
     *        Whether room profile setup is enabled.
     */

    public void setSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     * 
     * @return Whether room profile setup is enabled.
     */

    public Boolean getSetupModeDisabled() {
        return this.setupModeDisabled;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     * 
     * @param setupModeDisabled
     *        Whether room profile setup is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withSetupModeDisabled(Boolean setupModeDisabled) {
        setSetupModeDisabled(setupModeDisabled);
        return this;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     * 
     * @return Whether room profile setup is enabled.
     */

    public Boolean isSetupModeDisabled() {
        return this.setupModeDisabled;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     * 
     * @param maxVolumeLimit
     *        The maximum volume limit for a room profile.
     */

    public void setMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     * 
     * @return The maximum volume limit for a room profile.
     */

    public Integer getMaxVolumeLimit() {
        return this.maxVolumeLimit;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     * 
     * @param maxVolumeLimit
     *        The maximum volume limit for a room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withMaxVolumeLimit(Integer maxVolumeLimit) {
        setMaxVolumeLimit(maxVolumeLimit);
        return this;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     * 
     * @param pSTNEnabled
     *        Whether PSTN calling is enabled.
     */

    public void setPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     * 
     * @return Whether PSTN calling is enabled.
     */

    public Boolean getPSTNEnabled() {
        return this.pSTNEnabled;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     * 
     * @param pSTNEnabled
     *        Whether PSTN calling is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withPSTNEnabled(Boolean pSTNEnabled) {
        setPSTNEnabled(pSTNEnabled);
        return this;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     * 
     * @return Whether PSTN calling is enabled.
     */

    public Boolean isPSTNEnabled() {
        return this.pSTNEnabled;
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getTemperatureUnit() != null)
            sb.append("TemperatureUnit: ").append(getTemperatureUnit()).append(",");
        if (getWakeWord() != null)
            sb.append("WakeWord: ").append(getWakeWord()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getSetupModeDisabled() != null)
            sb.append("SetupModeDisabled: ").append(getSetupModeDisabled()).append(",");
        if (getMaxVolumeLimit() != null)
            sb.append("MaxVolumeLimit: ").append(getMaxVolumeLimit()).append(",");
        if (getPSTNEnabled() != null)
            sb.append("PSTNEnabled: ").append(getPSTNEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getSetupModeDisabled() == null ^ this.getSetupModeDisabled() == null)
            return false;
        if (other.getSetupModeDisabled() != null && other.getSetupModeDisabled().equals(this.getSetupModeDisabled()) == false)
            return false;
        if (other.getMaxVolumeLimit() == null ^ this.getMaxVolumeLimit() == null)
            return false;
        if (other.getMaxVolumeLimit() != null && other.getMaxVolumeLimit().equals(this.getMaxVolumeLimit()) == false)
            return false;
        if (other.getPSTNEnabled() == null ^ this.getPSTNEnabled() == null)
            return false;
        if (other.getPSTNEnabled() != null && other.getPSTNEnabled().equals(this.getPSTNEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getTemperatureUnit() == null) ? 0 : getTemperatureUnit().hashCode());
        hashCode = prime * hashCode + ((getWakeWord() == null) ? 0 : getWakeWord().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSetupModeDisabled() == null) ? 0 : getSetupModeDisabled().hashCode());
        hashCode = prime * hashCode + ((getMaxVolumeLimit() == null) ? 0 : getMaxVolumeLimit().hashCode());
        hashCode = prime * hashCode + ((getPSTNEnabled() == null) ? 0 : getPSTNEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
