/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMobileDeviceAccessOverrideRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization to which you want to apply the override.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * Identifies the WorkMail user for the override. Accepts the following types of user identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     * </p>
     */
    private String deviceId;

    /**
     * <p>
     * The WorkMail organization to which you want to apply the override.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization to which you want to apply the override.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization to which you want to apply the override.
     * </p>
     * 
     * @return The WorkMail organization to which you want to apply the override.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization to which you want to apply the override.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization to which you want to apply the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessOverrideRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * Identifies the WorkMail user for the override. Accepts the following types of user identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        Identifies the WorkMail user for the override. Accepts the following types of user identities: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * Identifies the WorkMail user for the override. Accepts the following types of user identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the WorkMail user for the override. Accepts the following types of user identities: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *         <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: <code>user@domain.tld</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         User name: <code>user</code>
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * Identifies the WorkMail user for the override. Accepts the following types of user identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        Identifies the WorkMail user for the override. Accepts the following types of user identities: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessOverrideRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @param deviceId
     *        The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @return The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @param deviceId
     *        The mobile device to which the override applies. <code>DeviceId</code> is case insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessOverrideRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMobileDeviceAccessOverrideRequest == false)
            return false;
        GetMobileDeviceAccessOverrideRequest other = (GetMobileDeviceAccessOverrideRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public GetMobileDeviceAccessOverrideRequest clone() {
        return (GetMobileDeviceAccessOverrideRequest) super.clone();
    }

}
