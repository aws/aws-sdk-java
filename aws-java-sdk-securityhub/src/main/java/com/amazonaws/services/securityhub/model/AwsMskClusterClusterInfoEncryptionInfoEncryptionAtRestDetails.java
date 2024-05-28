/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data-volume encryption details. You can't update encryption at rest settings for existing clusters.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key, MSK
     * creates one for you and uses it.
     * </p>
     */
    private String dataVolumeKMSKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key, MSK
     * creates one for you and uses it.
     * </p>
     * 
     * @param dataVolumeKMSKeyId
     *        The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key,
     *        MSK creates one for you and uses it.
     */

    public void setDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key, MSK
     * creates one for you and uses it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS
     *         key, MSK creates one for you and uses it.
     */

    public String getDataVolumeKMSKeyId() {
        return this.dataVolumeKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key, MSK
     * creates one for you and uses it.
     * </p>
     * 
     * @param dataVolumeKMSKeyId
     *        The Amazon Resource Name (ARN) of the KMS key for encrypting data at rest. If you don't specify a KMS key,
     *        MSK creates one for you and uses it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails withDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
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

        if (obj instanceof AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails == false)
            return false;
        AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails other = (AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails) obj;
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
    public AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails clone() {
        try {
            return (AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMskClusterClusterInfoEncryptionInfoEncryptionAtRestDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
