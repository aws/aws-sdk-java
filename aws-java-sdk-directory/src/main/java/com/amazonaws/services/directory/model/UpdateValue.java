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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value for a given type of <code>UpdateSettings</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OS update related settings.
     * </p>
     */
    private OSUpdateSettings oSUpdateSettings;

    /**
     * <p>
     * The OS update related settings.
     * </p>
     * 
     * @param oSUpdateSettings
     *        The OS update related settings.
     */

    public void setOSUpdateSettings(OSUpdateSettings oSUpdateSettings) {
        this.oSUpdateSettings = oSUpdateSettings;
    }

    /**
     * <p>
     * The OS update related settings.
     * </p>
     * 
     * @return The OS update related settings.
     */

    public OSUpdateSettings getOSUpdateSettings() {
        return this.oSUpdateSettings;
    }

    /**
     * <p>
     * The OS update related settings.
     * </p>
     * 
     * @param oSUpdateSettings
     *        The OS update related settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateValue withOSUpdateSettings(OSUpdateSettings oSUpdateSettings) {
        setOSUpdateSettings(oSUpdateSettings);
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
        if (getOSUpdateSettings() != null)
            sb.append("OSUpdateSettings: ").append(getOSUpdateSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateValue == false)
            return false;
        UpdateValue other = (UpdateValue) obj;
        if (other.getOSUpdateSettings() == null ^ this.getOSUpdateSettings() == null)
            return false;
        if (other.getOSUpdateSettings() != null && other.getOSUpdateSettings().equals(this.getOSUpdateSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOSUpdateSettings() == null) ? 0 : getOSUpdateSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateValue clone() {
        try {
            return (UpdateValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.UpdateValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
