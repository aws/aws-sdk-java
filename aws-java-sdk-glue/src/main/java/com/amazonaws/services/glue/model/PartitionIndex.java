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
 * A structure for a partition index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PartitionIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartitionIndex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The keys for the partition index.
     * </p>
     */
    private java.util.List<String> keys;
    /**
     * <p>
     * The name of the partition index.
     * </p>
     */
    private String indexName;

    /**
     * <p>
     * The keys for the partition index.
     * </p>
     * 
     * @return The keys for the partition index.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys for the partition index.
     * </p>
     * 
     * @param keys
     *        The keys for the partition index.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * The keys for the partition index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The keys for the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndex withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keys for the partition index.
     * </p>
     * 
     * @param keys
     *        The keys for the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndex withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @return The name of the partition index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndex withIndexName(String indexName) {
        setIndexName(indexName);
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
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartitionIndex == false)
            return false;
        PartitionIndex other = (PartitionIndex) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        return hashCode;
    }

    @Override
    public PartitionIndex clone() {
        try {
            return (PartitionIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PartitionIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
