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
 * The request to update the device status, as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateDeviceStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminUpdateDeviceStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The device key.
     * </p>
     */
    private String deviceKey;
    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     */
    private String deviceRememberedStatus;

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

    public AdminUpdateDeviceStatusRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @param username
     *        The user name.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @return The user name.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @param username
     *        The user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateDeviceStatusRequest withUsername(String username) {
        setUsername(username);
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

    public AdminUpdateDeviceStatusRequest withDeviceKey(String deviceKey) {
        setDeviceKey(deviceKey);
        return this;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status indicating whether a device has been remembered or not.
     * @see DeviceRememberedStatusType
     */

    public void setDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * 
     * @return The status indicating whether a device has been remembered or not.
     * @see DeviceRememberedStatusType
     */

    public String getDeviceRememberedStatus() {
        return this.deviceRememberedStatus;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status indicating whether a device has been remembered or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceRememberedStatusType
     */

    public AdminUpdateDeviceStatusRequest withDeviceRememberedStatus(String deviceRememberedStatus) {
        setDeviceRememberedStatus(deviceRememberedStatus);
        return this;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status indicating whether a device has been remembered or not.
     * @see DeviceRememberedStatusType
     */

    public void setDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
        withDeviceRememberedStatus(deviceRememberedStatus);
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * 
     * @param deviceRememberedStatus
     *        The status indicating whether a device has been remembered or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceRememberedStatusType
     */

    public AdminUpdateDeviceStatusRequest withDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof AdminUpdateDeviceStatusRequest == false)
            return false;
        AdminUpdateDeviceStatusRequest other = (AdminUpdateDeviceStatusRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
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

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode + ((getDeviceRememberedStatus() == null) ? 0 : getDeviceRememberedStatus().hashCode());
        return hashCode;
    }

    @Override
    public AdminUpdateDeviceStatusRequest clone() {
        return (AdminUpdateDeviceStatusRequest) super.clone();
    }

}
