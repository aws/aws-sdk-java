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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Static Key Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StaticKeySettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticKeySettings implements Serializable, Cloneable, StructuredPojo {

    /** The URL of the license server used for protecting content. */
    private InputLocation keyProviderServer;
    /** Static key value as a 32 character hexadecimal string. */
    private String staticKeyValue;

    /**
     * The URL of the license server used for protecting content.
     * 
     * @param keyProviderServer
     *        The URL of the license server used for protecting content.
     */

    public void setKeyProviderServer(InputLocation keyProviderServer) {
        this.keyProviderServer = keyProviderServer;
    }

    /**
     * The URL of the license server used for protecting content.
     * 
     * @return The URL of the license server used for protecting content.
     */

    public InputLocation getKeyProviderServer() {
        return this.keyProviderServer;
    }

    /**
     * The URL of the license server used for protecting content.
     * 
     * @param keyProviderServer
     *        The URL of the license server used for protecting content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeySettings withKeyProviderServer(InputLocation keyProviderServer) {
        setKeyProviderServer(keyProviderServer);
        return this;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * 
     * @param staticKeyValue
     *        Static key value as a 32 character hexadecimal string.
     */

    public void setStaticKeyValue(String staticKeyValue) {
        this.staticKeyValue = staticKeyValue;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * 
     * @return Static key value as a 32 character hexadecimal string.
     */

    public String getStaticKeyValue() {
        return this.staticKeyValue;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * 
     * @param staticKeyValue
     *        Static key value as a 32 character hexadecimal string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeySettings withStaticKeyValue(String staticKeyValue) {
        setStaticKeyValue(staticKeyValue);
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
        if (getKeyProviderServer() != null)
            sb.append("KeyProviderServer: ").append(getKeyProviderServer()).append(",");
        if (getStaticKeyValue() != null)
            sb.append("StaticKeyValue: ").append(getStaticKeyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticKeySettings == false)
            return false;
        StaticKeySettings other = (StaticKeySettings) obj;
        if (other.getKeyProviderServer() == null ^ this.getKeyProviderServer() == null)
            return false;
        if (other.getKeyProviderServer() != null && other.getKeyProviderServer().equals(this.getKeyProviderServer()) == false)
            return false;
        if (other.getStaticKeyValue() == null ^ this.getStaticKeyValue() == null)
            return false;
        if (other.getStaticKeyValue() != null && other.getStaticKeyValue().equals(this.getStaticKeyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyProviderServer() == null) ? 0 : getKeyProviderServer().hashCode());
        hashCode = prime * hashCode + ((getStaticKeyValue() == null) ? 0 : getStaticKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public StaticKeySettings clone() {
        try {
            return (StaticKeySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.StaticKeySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
