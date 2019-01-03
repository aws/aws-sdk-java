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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data volume encryption details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/EncryptionAtRest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionAtRest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS KMS key used for data encryption.
     * </p>
     */
    private String dataVolumeKMSKeyId;

    /**
     * <p>
     * The AWS KMS key used for data encryption.
     * </p>
     * 
     * @param dataVolumeKMSKeyId
     *        The AWS KMS key used for data encryption.
     */

    public void setDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key used for data encryption.
     * </p>
     * 
     * @return The AWS KMS key used for data encryption.
     */

    public String getDataVolumeKMSKeyId() {
        return this.dataVolumeKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key used for data encryption.
     * </p>
     * 
     * @param dataVolumeKMSKeyId
     *        The AWS KMS key used for data encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionAtRest withDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
        setDataVolumeKMSKeyId(dataVolumeKMSKeyId);
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
        if (getDataVolumeKMSKeyId() != null)
            sb.append("DataVolumeKMSKeyId: ").append(getDataVolumeKMSKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAtRest == false)
            return false;
        EncryptionAtRest other = (EncryptionAtRest) obj;
        if (other.getDataVolumeKMSKeyId() == null ^ this.getDataVolumeKMSKeyId() == null)
            return false;
        if (other.getDataVolumeKMSKeyId() != null && other.getDataVolumeKMSKeyId().equals(this.getDataVolumeKMSKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataVolumeKMSKeyId() == null) ? 0 : getDataVolumeKMSKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionAtRest clone() {
        try {
            return (EncryptionAtRest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.EncryptionAtRestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
