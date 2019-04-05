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
 * Archive Container Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ArchiveContainerSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveContainerSettings implements Serializable, Cloneable, StructuredPojo {

    private M2tsSettings m2tsSettings;

    /**
     * @param m2tsSettings
     */

    public void setM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
    }

    /**
     * @return
     */

    public M2tsSettings getM2tsSettings() {
        return this.m2tsSettings;
    }

    /**
     * @param m2tsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveContainerSettings withM2tsSettings(M2tsSettings m2tsSettings) {
        setM2tsSettings(m2tsSettings);
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
        if (getM2tsSettings() != null)
            sb.append("M2tsSettings: ").append(getM2tsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveContainerSettings == false)
            return false;
        ArchiveContainerSettings other = (ArchiveContainerSettings) obj;
        if (other.getM2tsSettings() == null ^ this.getM2tsSettings() == null)
            return false;
        if (other.getM2tsSettings() != null && other.getM2tsSettings().equals(this.getM2tsSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getM2tsSettings() == null) ? 0 : getM2tsSettings().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveContainerSettings clone() {
        try {
            return (ArchiveContainerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ArchiveContainerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
