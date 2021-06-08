/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the context in which temporary security credentials were issued to an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SessionContextAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionContextAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * </p>
     */
    private Boolean mfaAuthenticated;

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     * </p>
     * 
     * @return The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in UTC and ISO 8601 format, when the credentials were issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionContextAttributes withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * </p>
     * 
     * @param mfaAuthenticated
     *        Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     */

    public void setMfaAuthenticated(Boolean mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * </p>
     * 
     * @return Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     */

    public Boolean getMfaAuthenticated() {
        return this.mfaAuthenticated;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * </p>
     * 
     * @param mfaAuthenticated
     *        Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionContextAttributes withMfaAuthenticated(Boolean mfaAuthenticated) {
        setMfaAuthenticated(mfaAuthenticated);
        return this;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     * </p>
     * 
     * @return Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
     */

    public Boolean isMfaAuthenticated() {
        return this.mfaAuthenticated;
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getMfaAuthenticated() != null)
            sb.append("MfaAuthenticated: ").append(getMfaAuthenticated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionContextAttributes == false)
            return false;
        SessionContextAttributes other = (SessionContextAttributes) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getMfaAuthenticated() == null ^ this.getMfaAuthenticated() == null)
            return false;
        if (other.getMfaAuthenticated() != null && other.getMfaAuthenticated().equals(this.getMfaAuthenticated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getMfaAuthenticated() == null) ? 0 : getMfaAuthenticated().hashCode());
        return hashCode;
    }

    @Override
    public SessionContextAttributes clone() {
        try {
            return (SessionContextAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SessionContextAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
