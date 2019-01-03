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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>UserPhoneConfig</code> object that contains information about the user phone configuration settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserPhoneConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPhoneConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone type selected for the user, either Soft phone or Desk phone.
     * </p>
     */
    private String phoneType;
    /**
     * <p>
     * The Auto accept setting for the user, Yes or No.
     * </p>
     */
    private Boolean autoAccept;
    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds, for the user.
     * </p>
     */
    private Integer afterContactWorkTimeLimit;
    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     */
    private String deskPhoneNumber;

    /**
     * <p>
     * The phone type selected for the user, either Soft phone or Desk phone.
     * </p>
     * 
     * @param phoneType
     *        The phone type selected for the user, either Soft phone or Desk phone.
     * @see PhoneType
     */

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * <p>
     * The phone type selected for the user, either Soft phone or Desk phone.
     * </p>
     * 
     * @return The phone type selected for the user, either Soft phone or Desk phone.
     * @see PhoneType
     */

    public String getPhoneType() {
        return this.phoneType;
    }

    /**
     * <p>
     * The phone type selected for the user, either Soft phone or Desk phone.
     * </p>
     * 
     * @param phoneType
     *        The phone type selected for the user, either Soft phone or Desk phone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneType
     */

    public UserPhoneConfig withPhoneType(String phoneType) {
        setPhoneType(phoneType);
        return this;
    }

    /**
     * <p>
     * The phone type selected for the user, either Soft phone or Desk phone.
     * </p>
     * 
     * @param phoneType
     *        The phone type selected for the user, either Soft phone or Desk phone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneType
     */

    public UserPhoneConfig withPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType.toString();
        return this;
    }

    /**
     * <p>
     * The Auto accept setting for the user, Yes or No.
     * </p>
     * 
     * @param autoAccept
     *        The Auto accept setting for the user, Yes or No.
     */

    public void setAutoAccept(Boolean autoAccept) {
        this.autoAccept = autoAccept;
    }

    /**
     * <p>
     * The Auto accept setting for the user, Yes or No.
     * </p>
     * 
     * @return The Auto accept setting for the user, Yes or No.
     */

    public Boolean getAutoAccept() {
        return this.autoAccept;
    }

    /**
     * <p>
     * The Auto accept setting for the user, Yes or No.
     * </p>
     * 
     * @param autoAccept
     *        The Auto accept setting for the user, Yes or No.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPhoneConfig withAutoAccept(Boolean autoAccept) {
        setAutoAccept(autoAccept);
        return this;
    }

    /**
     * <p>
     * The Auto accept setting for the user, Yes or No.
     * </p>
     * 
     * @return The Auto accept setting for the user, Yes or No.
     */

    public Boolean isAutoAccept() {
        return this.autoAccept;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds, for the user.
     * </p>
     * 
     * @param afterContactWorkTimeLimit
     *        The After Call Work (ACW) timeout setting, in seconds, for the user.
     */

    public void setAfterContactWorkTimeLimit(Integer afterContactWorkTimeLimit) {
        this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds, for the user.
     * </p>
     * 
     * @return The After Call Work (ACW) timeout setting, in seconds, for the user.
     */

    public Integer getAfterContactWorkTimeLimit() {
        return this.afterContactWorkTimeLimit;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds, for the user.
     * </p>
     * 
     * @param afterContactWorkTimeLimit
     *        The After Call Work (ACW) timeout setting, in seconds, for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPhoneConfig withAfterContactWorkTimeLimit(Integer afterContactWorkTimeLimit) {
        setAfterContactWorkTimeLimit(afterContactWorkTimeLimit);
        return this;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     * 
     * @param deskPhoneNumber
     *        The phone number for the user's desk phone.
     */

    public void setDeskPhoneNumber(String deskPhoneNumber) {
        this.deskPhoneNumber = deskPhoneNumber;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     * 
     * @return The phone number for the user's desk phone.
     */

    public String getDeskPhoneNumber() {
        return this.deskPhoneNumber;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     * 
     * @param deskPhoneNumber
     *        The phone number for the user's desk phone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPhoneConfig withDeskPhoneNumber(String deskPhoneNumber) {
        setDeskPhoneNumber(deskPhoneNumber);
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
        if (getPhoneType() != null)
            sb.append("PhoneType: ").append(getPhoneType()).append(",");
        if (getAutoAccept() != null)
            sb.append("AutoAccept: ").append(getAutoAccept()).append(",");
        if (getAfterContactWorkTimeLimit() != null)
            sb.append("AfterContactWorkTimeLimit: ").append(getAfterContactWorkTimeLimit()).append(",");
        if (getDeskPhoneNumber() != null)
            sb.append("DeskPhoneNumber: ").append(getDeskPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPhoneConfig == false)
            return false;
        UserPhoneConfig other = (UserPhoneConfig) obj;
        if (other.getPhoneType() == null ^ this.getPhoneType() == null)
            return false;
        if (other.getPhoneType() != null && other.getPhoneType().equals(this.getPhoneType()) == false)
            return false;
        if (other.getAutoAccept() == null ^ this.getAutoAccept() == null)
            return false;
        if (other.getAutoAccept() != null && other.getAutoAccept().equals(this.getAutoAccept()) == false)
            return false;
        if (other.getAfterContactWorkTimeLimit() == null ^ this.getAfterContactWorkTimeLimit() == null)
            return false;
        if (other.getAfterContactWorkTimeLimit() != null && other.getAfterContactWorkTimeLimit().equals(this.getAfterContactWorkTimeLimit()) == false)
            return false;
        if (other.getDeskPhoneNumber() == null ^ this.getDeskPhoneNumber() == null)
            return false;
        if (other.getDeskPhoneNumber() != null && other.getDeskPhoneNumber().equals(this.getDeskPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneType() == null) ? 0 : getPhoneType().hashCode());
        hashCode = prime * hashCode + ((getAutoAccept() == null) ? 0 : getAutoAccept().hashCode());
        hashCode = prime * hashCode + ((getAfterContactWorkTimeLimit() == null) ? 0 : getAfterContactWorkTimeLimit().hashCode());
        hashCode = prime * hashCode + ((getDeskPhoneNumber() == null) ? 0 : getDeskPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public UserPhoneConfig clone() {
        try {
            return (UserPhoneConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserPhoneConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
