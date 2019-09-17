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
 * Key Provider Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/KeyProviderSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyProviderSettings implements Serializable, Cloneable, StructuredPojo {

    private StaticKeySettings staticKeySettings;

    /**
     * @param staticKeySettings
     */

    public void setStaticKeySettings(StaticKeySettings staticKeySettings) {
        this.staticKeySettings = staticKeySettings;
    }

    /**
     * @return
     */

    public StaticKeySettings getStaticKeySettings() {
        return this.staticKeySettings;
    }

    /**
     * @param staticKeySettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyProviderSettings withStaticKeySettings(StaticKeySettings staticKeySettings) {
        setStaticKeySettings(staticKeySettings);
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
        if (getStaticKeySettings() != null)
            sb.append("StaticKeySettings: ").append(getStaticKeySettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyProviderSettings == false)
            return false;
        KeyProviderSettings other = (KeyProviderSettings) obj;
        if (other.getStaticKeySettings() == null ^ this.getStaticKeySettings() == null)
            return false;
        if (other.getStaticKeySettings() != null && other.getStaticKeySettings().equals(this.getStaticKeySettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticKeySettings() == null) ? 0 : getStaticKeySettings().hashCode());
        return hashCode;
    }

    @Override
    public KeyProviderSettings clone() {
        try {
            return (KeyProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.KeyProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
