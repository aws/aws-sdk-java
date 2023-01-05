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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The override object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/MobileDeviceAccessOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MobileDeviceAccessOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The WorkMail user to which the access override applies.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The device to which the override applies.
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
     * The date the override was first created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date the override was last modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * The WorkMail user to which the access override applies.
     * </p>
     * 
     * @param userId
     *        The WorkMail user to which the access override applies.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The WorkMail user to which the access override applies.
     * </p>
     * 
     * @return The WorkMail user to which the access override applies.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The WorkMail user to which the access override applies.
     * </p>
     * 
     * @param userId
     *        The WorkMail user to which the access override applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessOverride withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The device to which the override applies.
     * </p>
     * 
     * @param deviceId
     *        The device to which the override applies.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device to which the override applies.
     * </p>
     * 
     * @return The device to which the override applies.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device to which the override applies.
     * </p>
     * 
     * @param deviceId
     *        The device to which the override applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessOverride withDeviceId(String deviceId) {
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

    public MobileDeviceAccessOverride withEffect(String effect) {
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

    public MobileDeviceAccessOverride withEffect(MobileDeviceAccessRuleEffect effect) {
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

    public MobileDeviceAccessOverride withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date the override was first created.
     * </p>
     * 
     * @param dateCreated
     *        The date the override was first created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date the override was first created.
     * </p>
     * 
     * @return The date the override was first created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date the override was first created.
     * </p>
     * 
     * @param dateCreated
     *        The date the override was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessOverride withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date the override was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date the override was last modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The date the override was last modified.
     * </p>
     * 
     * @return The date the override was last modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The date the override was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date the override was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessOverride withDateModified(java.util.Date dateModified) {
        setDateModified(dateModified);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateModified() != null)
            sb.append("DateModified: ").append(getDateModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MobileDeviceAccessOverride == false)
            return false;
        MobileDeviceAccessOverride other = (MobileDeviceAccessOverride) obj;
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
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        return hashCode;
    }

    @Override
    public MobileDeviceAccessOverride clone() {
        try {
            return (MobileDeviceAccessOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.MobileDeviceAccessOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
