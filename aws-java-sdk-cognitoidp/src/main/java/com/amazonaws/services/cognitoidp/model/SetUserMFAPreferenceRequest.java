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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserMFAPreference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetUserMFAPreferenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SMS text message multi-factor authentication (MFA) settings.
     * </p>
     */
    private SMSMfaSettingsType sMSMfaSettings;
    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     */
    private SoftwareTokenMfaSettingsType softwareTokenMfaSettings;
    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * The SMS text message multi-factor authentication (MFA) settings.
     * </p>
     * 
     * @param sMSMfaSettings
     *        The SMS text message multi-factor authentication (MFA) settings.
     */

    public void setSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        this.sMSMfaSettings = sMSMfaSettings;
    }

    /**
     * <p>
     * The SMS text message multi-factor authentication (MFA) settings.
     * </p>
     * 
     * @return The SMS text message multi-factor authentication (MFA) settings.
     */

    public SMSMfaSettingsType getSMSMfaSettings() {
        return this.sMSMfaSettings;
    }

    /**
     * <p>
     * The SMS text message multi-factor authentication (MFA) settings.
     * </p>
     * 
     * @param sMSMfaSettings
     *        The SMS text message multi-factor authentication (MFA) settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserMFAPreferenceRequest withSMSMfaSettings(SMSMfaSettingsType sMSMfaSettings) {
        setSMSMfaSettings(sMSMfaSettings);
        return this;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     * 
     * @param softwareTokenMfaSettings
     *        The time-based one-time password software token MFA settings.
     */

    public void setSoftwareTokenMfaSettings(SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        this.softwareTokenMfaSettings = softwareTokenMfaSettings;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     * 
     * @return The time-based one-time password software token MFA settings.
     */

    public SoftwareTokenMfaSettingsType getSoftwareTokenMfaSettings() {
        return this.softwareTokenMfaSettings;
    }

    /**
     * <p>
     * The time-based one-time password software token MFA settings.
     * </p>
     * 
     * @param softwareTokenMfaSettings
     *        The time-based one-time password software token MFA settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserMFAPreferenceRequest withSoftwareTokenMfaSettings(SoftwareTokenMfaSettingsType softwareTokenMfaSettings) {
        setSoftwareTokenMfaSettings(softwareTokenMfaSettings);
        return this;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @return The access token.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserMFAPreferenceRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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
        if (getSMSMfaSettings() != null)
            sb.append("SMSMfaSettings: ").append(getSMSMfaSettings()).append(",");
        if (getSoftwareTokenMfaSettings() != null)
            sb.append("SoftwareTokenMfaSettings: ").append(getSoftwareTokenMfaSettings()).append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUserMFAPreferenceRequest == false)
            return false;
        SetUserMFAPreferenceRequest other = (SetUserMFAPreferenceRequest) obj;
        if (other.getSMSMfaSettings() == null ^ this.getSMSMfaSettings() == null)
            return false;
        if (other.getSMSMfaSettings() != null && other.getSMSMfaSettings().equals(this.getSMSMfaSettings()) == false)
            return false;
        if (other.getSoftwareTokenMfaSettings() == null ^ this.getSoftwareTokenMfaSettings() == null)
            return false;
        if (other.getSoftwareTokenMfaSettings() != null && other.getSoftwareTokenMfaSettings().equals(this.getSoftwareTokenMfaSettings()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSMSMfaSettings() == null) ? 0 : getSMSMfaSettings().hashCode());
        hashCode = prime * hashCode + ((getSoftwareTokenMfaSettings() == null) ? 0 : getSoftwareTokenMfaSettings().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public SetUserMFAPreferenceRequest clone() {
        return (SetUserMFAPreferenceRequest) super.clone();
    }

}
