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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings associated with S3 destination
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/S3DestinationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /** Settings for how your job outputs are encrypted as they are uploaded to Amazon S3. */
    private S3EncryptionSettings encryption;

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     * 
     * @param encryption
     *        Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     */

    public void setEncryption(S3EncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     * 
     * @return Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     */

    public S3EncryptionSettings getEncryption() {
        return this.encryption;
    }

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     * 
     * @param encryption
     *        Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationSettings withEncryption(S3EncryptionSettings encryption) {
        setEncryption(encryption);
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationSettings == false)
            return false;
        S3DestinationSettings other = (S3DestinationSettings) obj;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationSettings clone() {
        try {
            return (S3DestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.S3DestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
