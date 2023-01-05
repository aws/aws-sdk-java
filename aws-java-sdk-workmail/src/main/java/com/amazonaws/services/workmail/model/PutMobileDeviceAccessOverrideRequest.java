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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMobileDeviceAccessOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMobileDeviceAccessOverrideRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the WorkMail organization for which you create the override.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The WorkMail user for which you create the override. Accepts the following types of user identities:
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
     * The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * A description of the override.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Identifies the WorkMail organization for which you create the override.
     * </p>
     * 
     * @param organizationId
     *        Identifies the WorkMail organization for which you create the override.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * Identifies the WorkMail organization for which you create the override.
     * </p>
     * 
     * @return Identifies the WorkMail organization for which you create the override.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * Identifies the WorkMail organization for which you create the override.
     * </p>
     * 
     * @param organizationId
     *        Identifies the WorkMail organization for which you create the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMobileDeviceAccessOverrideRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The WorkMail user for which you create the override. Accepts the following types of user identities:
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
     *        The WorkMail user for which you create the override. Accepts the following types of user identities:</p>
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
     * The WorkMail user for which you create the override. Accepts the following types of user identities:
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
     * @return The WorkMail user for which you create the override. Accepts the following types of user identities:</p>
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
     * The WorkMail user for which you create the override. Accepts the following types of user identities:
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
     *        The WorkMail user for which you create the override. Accepts the following types of user identities:</p>
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

    public PutMobileDeviceAccessOverrideRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @param deviceId
     *        The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @return The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     * </p>
     * 
     * @param deviceId
     *        The mobile device for which you create the override. <code>DeviceId</code> is case insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMobileDeviceAccessOverrideRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * @see MobileDeviceAccessRuleEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @return The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * @see MobileDeviceAccessRuleEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public PutMobileDeviceAccessOverrideRequest withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the override, <code>ALLOW</code> or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public PutMobileDeviceAccessOverrideRequest withEffect(MobileDeviceAccessRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * A description of the override.
     * </p>
     * 
     * @param description
     *        A description of the override.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the override.
     * </p>
     * 
     * @return A description of the override.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the override.
     * </p>
     * 
     * @param description
     *        A description of the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMobileDeviceAccessOverrideRequest withDescription(String description) {
        setDescription(description);
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
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMobileDeviceAccessOverrideRequest == false)
            return false;
        PutMobileDeviceAccessOverrideRequest other = (PutMobileDeviceAccessOverrideRequest) obj;
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
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PutMobileDeviceAccessOverrideRequest clone() {
        return (PutMobileDeviceAccessOverrideRequest) super.clone();
    }

}
