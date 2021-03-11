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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Archive Cdn Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ArchiveCdnSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveCdnSettings implements Serializable, Cloneable, StructuredPojo {

    private ArchiveS3Settings archiveS3Settings;

    /**
     * @param archiveS3Settings
     */

    public void setArchiveS3Settings(ArchiveS3Settings archiveS3Settings) {
        this.archiveS3Settings = archiveS3Settings;
    }

    /**
     * @return
     */

    public ArchiveS3Settings getArchiveS3Settings() {
        return this.archiveS3Settings;
    }

    /**
     * @param archiveS3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveCdnSettings withArchiveS3Settings(ArchiveS3Settings archiveS3Settings) {
        setArchiveS3Settings(archiveS3Settings);
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
        if (getArchiveS3Settings() != null)
            sb.append("ArchiveS3Settings: ").append(getArchiveS3Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveCdnSettings == false)
            return false;
        ArchiveCdnSettings other = (ArchiveCdnSettings) obj;
        if (other.getArchiveS3Settings() == null ^ this.getArchiveS3Settings() == null)
            return false;
        if (other.getArchiveS3Settings() != null && other.getArchiveS3Settings().equals(this.getArchiveS3Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveS3Settings() == null) ? 0 : getArchiveS3Settings().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveCdnSettings clone() {
        try {
            return (ArchiveCdnSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ArchiveCdnSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
