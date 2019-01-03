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
 * Represents the request to update the device status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateDeviceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The status of whether a device is remembered.
     * </p>
     */
    private String deviceRememberedStatus;

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

    public UpdateDeviceStatusRequest withAccessToken(String accessToken) {
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

    public UpdateDeviceStatusRequest withDeviceKey(String deviceKey) {
        setDeviceKey(deviceKey);
        return this;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status of whether a device is remembered.
     * @see DeviceRememberedStatusType
     */

    public void setDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * 
     * @return The status of whether a device is remembered.
     * @see DeviceRememberedStatusType
     */

    public String getDeviceRememberedStatus() {
        return this.deviceRememberedStatus;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status of whether a device is remembered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceRememberedStatusType
     */

    public UpdateDeviceStatusRequest withDeviceRememberedStatus(String deviceRememberedStatus) {
        setDeviceRememberedStatus(deviceRememberedStatus);
        return this;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status of whether a device is remembered.
     * @see DeviceRememberedStatusType
     */

    public void setDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
        withDeviceRememberedStatus(deviceRememberedStatus);
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status of whether a device is remembered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceRememberedStatusType
     */

    public UpdateDeviceStatusRequest withDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus.toString();
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
        if (getDeviceRememberedStatus() != null)
            sb.append("DeviceRememberedStatus: ").append(getDeviceRememberedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceStatusRequest == false)
            return false;
        UpdateDeviceStatusRequest other = (UpdateDeviceStatusRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceRememberedStatus() == null ^ this.getDeviceRememberedStatus() == null)
            return false;
        if (other.getDeviceRememberedStatus() != null && other.getDeviceRememberedStatus().equals(this.getDeviceRememberedStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode + ((getDeviceRememberedStatus() == null) ? 0 : getDeviceRememberedStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceStatusRequest clone() {
        return (UpdateDeviceStatusRequest) super.clone();
    }

}
