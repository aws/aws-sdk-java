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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings associated with an Amazon Chime user, including inbound and outbound calling and text messaging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UserSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The telephony settings associated with the user.
     * </p>
     */
    private TelephonySettings telephony;

    /**
     * <p>
     * The telephony settings associated with the user.
     * </p>
     * 
     * @param telephony
     *        The telephony settings associated with the user.
     */

    public void setTelephony(TelephonySettings telephony) {
        this.telephony = telephony;
    }

    /**
     * <p>
     * The telephony settings associated with the user.
     * </p>
     * 
     * @return The telephony settings associated with the user.
     */

    public TelephonySettings getTelephony() {
        return this.telephony;
    }

    /**
     * <p>
     * The telephony settings associated with the user.
     * </p>
     * 
     * @param telephony
     *        The telephony settings associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withTelephony(TelephonySettings telephony) {
        setTelephony(telephony);
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
        if (getTelephony() != null)
            sb.append("Telephony: ").append(getTelephony());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSettings == false)
            return false;
        UserSettings other = (UserSettings) obj;
        if (other.getTelephony() == null ^ this.getTelephony() == null)
            return false;
        if (other.getTelephony() != null && other.getTelephony().equals(this.getTelephony()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelephony() == null) ? 0 : getTelephony().hashCode());
        return hashCode;
    }

    @Override
    public UserSettings clone() {
        try {
            return (UserSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.UserSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
