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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     */
    private String temperatureUnit;
    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     */
    private String wakeWord;
    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     */
    private Boolean setupModeDisabled;
    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     */
    private Integer maxVolumeLimit;
    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     */
    private Boolean pSTNEnabled;

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * 
     * @param profileArn
     *        The ARN of the room profile to update. Required.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * 
     * @return The ARN of the room profile to update. Required.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * 
     * @param profileArn
     *        The ARN of the room profile to update. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * 
     * @param profileName
     *        The updated name for the room profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * 
     * @return The updated name for the room profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * 
     * @param profileName
     *        The updated name for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * </p>
     * 
     * @param isDefault
     *        Sets the profile as default if selected. If this is missing, no update is done to the default status.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * </p>
     * 
     * @return Sets the profile as default if selected. If this is missing, no update is done to the default status.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * </p>
     * 
     * @param isDefault
     *        Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is done to the default status.
     * </p>
     * 
     * @return Sets the profile as default if selected. If this is missing, no update is done to the default status.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * 
     * @param timezone
     *        The updated timezone for the room profile.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * 
     * @return The updated timezone for the room profile.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * 
     * @param timezone
     *        The updated timezone for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * 
     * @param address
     *        The updated address for the room profile.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * 
     * @return The updated address for the room profile.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * 
     * @param address
     *        The updated address for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The updated distance unit for the room profile.
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * 
     * @return The updated distance unit for the room profile.
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The updated distance unit for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public UpdateProfileRequest withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * 
     * @param distanceUnit
     *        The updated distance unit for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public UpdateProfileRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The updated temperature unit for the room profile.
     * @see TemperatureUnit
     */

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * 
     * @return The updated temperature unit for the room profile.
     * @see TemperatureUnit
     */

    public String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The updated temperature unit for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public UpdateProfileRequest withTemperatureUnit(String temperatureUnit) {
        setTemperatureUnit(temperatureUnit);
        return this;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * 
     * @param temperatureUnit
     *        The updated temperature unit for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemperatureUnit
     */

    public UpdateProfileRequest withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * 
     * @param wakeWord
     *        The updated wake word for the room profile.
     * @see WakeWord
     */

    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * 
     * @return The updated wake word for the room profile.
     * @see WakeWord
     */

    public String getWakeWord() {
        return this.wakeWord;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * 
     * @param wakeWord
     *        The updated wake word for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public UpdateProfileRequest withWakeWord(String wakeWord) {
        setWakeWord(wakeWord);
        return this;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * 
     * @param wakeWord
     *        The updated wake word for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WakeWord
     */

    public UpdateProfileRequest withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
        return this;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     * 
     * @param setupModeDisabled
     *        Whether the setup mode of the profile is enabled.
     */

    public void setSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     * 
     * @return Whether the setup mode of the profile is enabled.
     */

    public Boolean getSetupModeDisabled() {
        return this.setupModeDisabled;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     * 
     * @param setupModeDisabled
     *        Whether the setup mode of the profile is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withSetupModeDisabled(Boolean setupModeDisabled) {
        setSetupModeDisabled(setupModeDisabled);
        return this;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     * 
     * @return Whether the setup mode of the profile is enabled.
     */

    public Boolean isSetupModeDisabled() {
        return this.setupModeDisabled;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     * 
     * @param maxVolumeLimit
     *        The updated maximum volume limit for the room profile.
     */

    public void setMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     * 
     * @return The updated maximum volume limit for the room profile.
     */

    public Integer getMaxVolumeLimit() {
        return this.maxVolumeLimit;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     * 
     * @param maxVolumeLimit
     *        The updated maximum volume limit for the room profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withMaxVolumeLimit(Integer maxVolumeLimit) {
        setMaxVolumeLimit(maxVolumeLimit);
        return this;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     * 
     * @param pSTNEnabled
     *        Whether the PSTN setting of the room profile is enabled.
     */

    public void setPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     * 
     * @return Whether the PSTN setting of the room profile is enabled.
     */

    public Boolean getPSTNEnabled() {
        return this.pSTNEnabled;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     * 
     * @param pSTNEnabled
     *        Whether the PSTN setting of the room profile is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withPSTNEnabled(Boolean pSTNEnabled) {
        setPSTNEnabled(pSTNEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     * 
     * @return Whether the PSTN setting of the room profile is enabled.
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
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
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

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;
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

        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getTemperatureUnit() == null) ? 0 : getTemperatureUnit().hashCode());
        hashCode = prime * hashCode + ((getWakeWord() == null) ? 0 : getWakeWord().hashCode());
        hashCode = prime * hashCode + ((getSetupModeDisabled() == null) ? 0 : getSetupModeDisabled().hashCode());
        hashCode = prime * hashCode + ((getMaxVolumeLimit() == null) ? 0 : getMaxVolumeLimit().hashCode());
        hashCode = prime * hashCode + ((getPSTNEnabled() == null) ? 0 : getPSTNEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileRequest clone() {
        return (UpdateProfileRequest) super.clone();
    }

}
