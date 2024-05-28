/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date expireTime;
    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     */
    private Boolean forceUpdate;
    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * </p>
     */
    private Boolean noExpiry;
    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     */
    private ApiKeyRestrictions restrictions;

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the API key resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * 
     * @return Updates the description for the API key resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param expireTime
     *        Updates the timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return Updates the timestamp for when the API key resource will expire in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param expireTime
     *        Updates the timestamp for when the API key resource will expire in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withExpireTime(java.util.Date expireTime) {
        setExpireTime(expireTime);
        return this;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     * 
     * @param forceUpdate
     *        The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code>
     *        details.</p>
     *        <p>
     *        Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     *        </p>
     *        <p>
     *        <code>False</code> if force update is not preferred
     *        </p>
     *        <p>
     *        Default value: <code>False</code>
     */

    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     * 
     * @return The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code>
     *         details.</p>
     *         <p>
     *         Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     *         </p>
     *         <p>
     *         <code>False</code> if force update is not preferred
     *         </p>
     *         <p>
     *         Default value: <code>False</code>
     */

    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     * 
     * @param forceUpdate
     *        The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code>
     *        details.</p>
     *        <p>
     *        Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     *        </p>
     *        <p>
     *        <code>False</code> if force update is not preferred
     *        </p>
     *        <p>
     *        Default value: <code>False</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withForceUpdate(Boolean forceUpdate) {
        setForceUpdate(forceUpdate);
        return this;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     * 
     * @return The boolean flag to be included for updating <code>ExpireTime</code> or <code>Restrictions</code>
     *         details.</p>
     *         <p>
     *         Must be set to <code>true</code> to update an API key resource that has been used in the past 7 days.
     *         </p>
     *         <p>
     *         <code>False</code> if force update is not preferred
     *         </p>
     *         <p>
     *         Default value: <code>False</code>
     */

    public Boolean isForceUpdate() {
        return this.forceUpdate;
    }

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * 
     * @param keyName
     *        The name of the API key resource to update.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * 
     * @return The name of the API key resource to update.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * 
     * @param keyName
     *        The name of the API key resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * </p>
     * 
     * @param noExpiry
     *        Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     */

    public void setNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * </p>
     * 
     * @return Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration
     *         time.
     */

    public Boolean getNoExpiry() {
        return this.noExpiry;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * </p>
     * 
     * @param noExpiry
     *        Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withNoExpiry(Boolean noExpiry) {
        setNoExpiry(noExpiry);
        return this;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration time.
     * </p>
     * 
     * @return Whether the API key should expire. Set to <code>true</code> to set the API key to have no expiration
     *         time.
     */

    public Boolean isNoExpiry() {
        return this.noExpiry;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     * 
     * @param restrictions
     *        Updates the API key restrictions for the API key resource.
     */

    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     * 
     * @return Updates the API key restrictions for the API key resource.
     */

    public ApiKeyRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     * 
     * @param restrictions
     *        Updates the API key restrictions for the API key resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRequest withRestrictions(ApiKeyRestrictions restrictions) {
        setRestrictions(restrictions);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: ").append(getExpireTime()).append(",");
        if (getForceUpdate() != null)
            sb.append("ForceUpdate: ").append(getForceUpdate()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getNoExpiry() != null)
            sb.append("NoExpiry: ").append(getNoExpiry()).append(",");
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyRequest == false)
            return false;
        UpdateKeyRequest other = (UpdateKeyRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getForceUpdate() == null ^ this.getForceUpdate() == null)
            return false;
        if (other.getForceUpdate() != null && other.getForceUpdate().equals(this.getForceUpdate()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getNoExpiry() == null ^ this.getNoExpiry() == null)
            return false;
        if (other.getNoExpiry() != null && other.getNoExpiry().equals(this.getNoExpiry()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getForceUpdate() == null) ? 0 : getForceUpdate().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getNoExpiry() == null) ? 0 : getNoExpiry().hashCode());
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeyRequest clone() {
        return (UpdateKeyRequest) super.clone();
    }

}
