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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contact information that the DRT can use to contact you during a suspected attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EmergencyContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmergencyContact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An email address that the DRT can use to contact you during a suspected attack.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * An email address that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param emailAddress
     *        An email address that the DRT can use to contact you during a suspected attack.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * An email address that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @return An email address that the DRT can use to contact you during a suspected attack.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * An email address that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param emailAddress
     *        An email address that the DRT can use to contact you during a suspected attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyContact withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmergencyContact == false)
            return false;
        EmergencyContact other = (EmergencyContact) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public EmergencyContact clone() {
        try {
            return (EmergencyContact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.EmergencyContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
