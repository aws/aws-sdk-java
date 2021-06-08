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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing a key value pair for metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MetadataKeyValuePair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataKeyValuePair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A metadata key.
     * </p>
     */
    private String metadataKey;
    /**
     * <p>
     * A metadata key’s corresponding value.
     * </p>
     */
    private String metadataValue;

    /**
     * <p>
     * A metadata key.
     * </p>
     * 
     * @param metadataKey
     *        A metadata key.
     */

    public void setMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
    }

    /**
     * <p>
     * A metadata key.
     * </p>
     * 
     * @return A metadata key.
     */

    public String getMetadataKey() {
        return this.metadataKey;
    }

    /**
     * <p>
     * A metadata key.
     * </p>
     * 
     * @param metadataKey
     *        A metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataKeyValuePair withMetadataKey(String metadataKey) {
        setMetadataKey(metadataKey);
        return this;
    }

    /**
     * <p>
     * A metadata key’s corresponding value.
     * </p>
     * 
     * @param metadataValue
     *        A metadata key’s corresponding value.
     */

    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue;
    }

    /**
     * <p>
     * A metadata key’s corresponding value.
     * </p>
     * 
     * @return A metadata key’s corresponding value.
     */

    public String getMetadataValue() {
        return this.metadataValue;
    }

    /**
     * <p>
     * A metadata key’s corresponding value.
     * </p>
     * 
     * @param metadataValue
     *        A metadata key’s corresponding value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataKeyValuePair withMetadataValue(String metadataValue) {
        setMetadataValue(metadataValue);
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
        if (getMetadataKey() != null)
            sb.append("MetadataKey: ").append(getMetadataKey()).append(",");
        if (getMetadataValue() != null)
            sb.append("MetadataValue: ").append(getMetadataValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataKeyValuePair == false)
            return false;
        MetadataKeyValuePair other = (MetadataKeyValuePair) obj;
        if (other.getMetadataKey() == null ^ this.getMetadataKey() == null)
            return false;
        if (other.getMetadataKey() != null && other.getMetadataKey().equals(this.getMetadataKey()) == false)
            return false;
        if (other.getMetadataValue() == null ^ this.getMetadataValue() == null)
            return false;
        if (other.getMetadataValue() != null && other.getMetadataValue().equals(this.getMetadataValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataKey() == null) ? 0 : getMetadataKey().hashCode());
        hashCode = prime * hashCode + ((getMetadataValue() == null) ? 0 : getMetadataValue().hashCode());
        return hashCode;
    }

    @Override
    public MetadataKeyValuePair clone() {
        try {
            return (MetadataKeyValuePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MetadataKeyValuePairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
