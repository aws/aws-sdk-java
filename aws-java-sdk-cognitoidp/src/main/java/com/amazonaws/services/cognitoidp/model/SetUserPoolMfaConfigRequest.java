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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserPoolMfaConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetUserPoolMfaConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     */
    private SmsMfaConfigType smsMfaConfiguration;
    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     */
    private SoftwareTokenMfaConfigType softwareTokenMfaConfiguration;
    /**
     * <p>
     * The MFA configuration.
     * </p>
     */
    private String mfaConfiguration;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserPoolMfaConfigRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     * 
     * @param smsMfaConfiguration
     *        The SMS text message MFA configuration.
     */

    public void setSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        this.smsMfaConfiguration = smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     * 
     * @return The SMS text message MFA configuration.
     */

    public SmsMfaConfigType getSmsMfaConfiguration() {
        return this.smsMfaConfiguration;
    }

    /**
     * <p>
     * The SMS text message MFA configuration.
     * </p>
     * 
     * @param smsMfaConfiguration
     *        The SMS text message MFA configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserPoolMfaConfigRequest withSmsMfaConfiguration(SmsMfaConfigType smsMfaConfiguration) {
        setSmsMfaConfiguration(smsMfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     * 
     * @param softwareTokenMfaConfiguration
     *        The software token MFA configuration.
     */

    public void setSoftwareTokenMfaConfiguration(SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     * 
     * @return The software token MFA configuration.
     */

    public SoftwareTokenMfaConfigType getSoftwareTokenMfaConfiguration() {
        return this.softwareTokenMfaConfiguration;
    }

    /**
     * <p>
     * The software token MFA configuration.
     * </p>
     * 
     * @param softwareTokenMfaConfiguration
     *        The software token MFA configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserPoolMfaConfigRequest withSoftwareTokenMfaConfiguration(SoftwareTokenMfaConfigType softwareTokenMfaConfiguration) {
        setSoftwareTokenMfaConfiguration(softwareTokenMfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The MFA configuration.
     * </p>
     * 
     * @param mfaConfiguration
     *        The MFA configuration.
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * The MFA configuration.
     * </p>
     * 
     * @return The MFA configuration.
     * @see UserPoolMfaType
     */

    public String getMfaConfiguration() {
        return this.mfaConfiguration;
    }

    /**
     * <p>
     * The MFA configuration.
     * </p>
     * 
     * @param mfaConfiguration
     *        The MFA configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public SetUserPoolMfaConfigRequest withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * The MFA configuration.
     * </p>
     * 
     * @param mfaConfiguration
     *        The MFA configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public SetUserPoolMfaConfigRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getSmsMfaConfiguration() != null)
            sb.append("SmsMfaConfiguration: ").append(getSmsMfaConfiguration()).append(",");
        if (getSoftwareTokenMfaConfiguration() != null)
            sb.append("SoftwareTokenMfaConfiguration: ").append(getSoftwareTokenMfaConfiguration()).append(",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: ").append(getMfaConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUserPoolMfaConfigRequest == false)
            return false;
        SetUserPoolMfaConfigRequest other = (SetUserPoolMfaConfigRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getSmsMfaConfiguration() == null ^ this.getSmsMfaConfiguration() == null)
            return false;
        if (other.getSmsMfaConfiguration() != null && other.getSmsMfaConfiguration().equals(this.getSmsMfaConfiguration()) == false)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() == null ^ this.getSoftwareTokenMfaConfiguration() == null)
            return false;
        if (other.getSoftwareTokenMfaConfiguration() != null
                && other.getSoftwareTokenMfaConfiguration().equals(this.getSoftwareTokenMfaConfiguration()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getSmsMfaConfiguration() == null) ? 0 : getSmsMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSoftwareTokenMfaConfiguration() == null) ? 0 : getSoftwareTokenMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SetUserPoolMfaConfigRequest clone() {
        return (SetUserPoolMfaConfigRequest) super.clone();
    }

}
