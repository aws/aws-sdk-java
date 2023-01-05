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
 * OS version that the directory needs to be updated to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/OSUpdateSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OSUpdateSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * OS version that the directory needs to be updated to.
     * </p>
     */
    private String oSVersion;

    /**
     * <p>
     * OS version that the directory needs to be updated to.
     * </p>
     * 
     * @param oSVersion
     *        OS version that the directory needs to be updated to.
     * @see OSVersion
     */

    public void setOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
    }

    /**
     * <p>
     * OS version that the directory needs to be updated to.
     * </p>
     * 
     * @return OS version that the directory needs to be updated to.
     * @see OSVersion
     */

    public String getOSVersion() {
        return this.oSVersion;
    }

    /**
     * <p>
     * OS version that the directory needs to be updated to.
     * </p>
     * 
     * @param oSVersion
     *        OS version that the directory needs to be updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSVersion
     */

    public OSUpdateSettings withOSVersion(String oSVersion) {
        setOSVersion(oSVersion);
        return this;
    }

    /**
     * <p>
     * OS version that the directory needs to be updated to.
     * </p>
     * 
     * @param oSVersion
     *        OS version that the directory needs to be updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSVersion
     */

    public OSUpdateSettings withOSVersion(OSVersion oSVersion) {
        this.oSVersion = oSVersion.toString();
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
        if (getOSVersion() != null)
            sb.append("OSVersion: ").append(getOSVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OSUpdateSettings == false)
            return false;
        OSUpdateSettings other = (OSUpdateSettings) obj;
        if (other.getOSVersion() == null ^ this.getOSVersion() == null)
            return false;
        if (other.getOSVersion() != null && other.getOSVersion().equals(this.getOSVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOSVersion() == null) ? 0 : getOSVersion().hashCode());
        return hashCode;
    }

    @Override
    public OSUpdateSettings clone() {
        try {
            return (OSUpdateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.OSUpdateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
