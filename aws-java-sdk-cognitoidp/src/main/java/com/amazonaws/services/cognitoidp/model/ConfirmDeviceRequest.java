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
 * <p>
 * Confirms the device request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The device key.
     * </p>
     */
    private String deviceKey;
    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     */
    private DeviceSecretVerifierConfigType deviceSecretVerifierConfig;
    /**
     * <p>
     * The device name.
     * </p>
     */
    private String deviceName;

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

    public ConfirmDeviceRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @param deviceKey
     *        The device key.
     */

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @return The device key.
     */

    public String getDeviceKey() {
        return this.deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * 
     * @param deviceKey
     *        The device key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmDeviceRequest withDeviceKey(String deviceKey) {
        setDeviceKey(deviceKey);
        return this;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     * 
     * @param deviceSecretVerifierConfig
     *        The configuration of the device secret verifier.
     */

    public void setDeviceSecretVerifierConfig(DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        this.deviceSecretVerifierConfig = deviceSecretVerifierConfig;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     * 
     * @return The configuration of the device secret verifier.
     */

    public DeviceSecretVerifierConfigType getDeviceSecretVerifierConfig() {
        return this.deviceSecretVerifierConfig;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     * 
     * @param deviceSecretVerifierConfig
     *        The configuration of the device secret verifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmDeviceRequest withDeviceSecretVerifierConfig(DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        setDeviceSecretVerifierConfig(deviceSecretVerifierConfig);
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param deviceName
     *        The device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @return The device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param deviceName
     *        The device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmDeviceRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDeviceKey() != null)
            sb.append("DeviceKey: ").append(getDeviceKey()).append(",");
        if (getDeviceSecretVerifierConfig() != null)
            sb.append("DeviceSecretVerifierConfig: ").append(getDeviceSecretVerifierConfig()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmDeviceRequest == false)
            return false;
        ConfirmDeviceRequest other = (ConfirmDeviceRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceSecretVerifierConfig() == null ^ this.getDeviceSecretVerifierConfig() == null)
            return false;
        if (other.getDeviceSecretVerifierConfig() != null && other.getDeviceSecretVerifierConfig().equals(this.getDeviceSecretVerifierConfig()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode + ((getDeviceSecretVerifierConfig() == null) ? 0 : getDeviceSecretVerifierConfig().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmDeviceRequest clone() {
        return (ConfirmDeviceRequest) super.clone();
    }

}
