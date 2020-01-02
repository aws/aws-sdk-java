/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains general information about the LDAPS settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/LDAPSSettingInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LDAPSSettingInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the LDAPS settings.
     * </p>
     */
    private String lDAPSStatus;
    /**
     * <p>
     * Describes a state change for LDAPS.
     * </p>
     */
    private String lDAPSStatusReason;
    /**
     * <p>
     * The date and time when the LDAPS settings were last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The state of the LDAPS settings.
     * </p>
     * 
     * @param lDAPSStatus
     *        The state of the LDAPS settings.
     * @see LDAPSStatus
     */

    public void setLDAPSStatus(String lDAPSStatus) {
        this.lDAPSStatus = lDAPSStatus;
    }

    /**
     * <p>
     * The state of the LDAPS settings.
     * </p>
     * 
     * @return The state of the LDAPS settings.
     * @see LDAPSStatus
     */

    public String getLDAPSStatus() {
        return this.lDAPSStatus;
    }

    /**
     * <p>
     * The state of the LDAPS settings.
     * </p>
     * 
     * @param lDAPSStatus
     *        The state of the LDAPS settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LDAPSStatus
     */

    public LDAPSSettingInfo withLDAPSStatus(String lDAPSStatus) {
        setLDAPSStatus(lDAPSStatus);
        return this;
    }

    /**
     * <p>
     * The state of the LDAPS settings.
     * </p>
     * 
     * @param lDAPSStatus
     *        The state of the LDAPS settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LDAPSStatus
     */

    public LDAPSSettingInfo withLDAPSStatus(LDAPSStatus lDAPSStatus) {
        this.lDAPSStatus = lDAPSStatus.toString();
        return this;
    }

    /**
     * <p>
     * Describes a state change for LDAPS.
     * </p>
     * 
     * @param lDAPSStatusReason
     *        Describes a state change for LDAPS.
     */

    public void setLDAPSStatusReason(String lDAPSStatusReason) {
        this.lDAPSStatusReason = lDAPSStatusReason;
    }

    /**
     * <p>
     * Describes a state change for LDAPS.
     * </p>
     * 
     * @return Describes a state change for LDAPS.
     */

    public String getLDAPSStatusReason() {
        return this.lDAPSStatusReason;
    }

    /**
     * <p>
     * Describes a state change for LDAPS.
     * </p>
     * 
     * @param lDAPSStatusReason
     *        Describes a state change for LDAPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LDAPSSettingInfo withLDAPSStatusReason(String lDAPSStatusReason) {
        setLDAPSStatusReason(lDAPSStatusReason);
        return this;
    }

    /**
     * <p>
     * The date and time when the LDAPS settings were last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the LDAPS settings were last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the LDAPS settings were last updated.
     * </p>
     * 
     * @return The date and time when the LDAPS settings were last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the LDAPS settings were last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the LDAPS settings were last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LDAPSSettingInfo withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getLDAPSStatus() != null)
            sb.append("LDAPSStatus: ").append(getLDAPSStatus()).append(",");
        if (getLDAPSStatusReason() != null)
            sb.append("LDAPSStatusReason: ").append(getLDAPSStatusReason()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LDAPSSettingInfo == false)
            return false;
        LDAPSSettingInfo other = (LDAPSSettingInfo) obj;
        if (other.getLDAPSStatus() == null ^ this.getLDAPSStatus() == null)
            return false;
        if (other.getLDAPSStatus() != null && other.getLDAPSStatus().equals(this.getLDAPSStatus()) == false)
            return false;
        if (other.getLDAPSStatusReason() == null ^ this.getLDAPSStatusReason() == null)
            return false;
        if (other.getLDAPSStatusReason() != null && other.getLDAPSStatusReason().equals(this.getLDAPSStatusReason()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLDAPSStatus() == null) ? 0 : getLDAPSStatus().hashCode());
        hashCode = prime * hashCode + ((getLDAPSStatusReason() == null) ? 0 : getLDAPSStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LDAPSSettingInfo clone() {
        try {
            return (LDAPSSettingInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.LDAPSSettingInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
