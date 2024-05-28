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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Schema specifies the expected data model of the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Schema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A non-empty list of partition keys defining the attributes used to partition the table data. The order of the
     * list determines the partition hierarchy. The name and type of each partition key as well as the partition key
     * order cannot be changed after the table is created. However, the enforcement level of each partition key can be
     * changed.
     * </p>
     */
    private java.util.List<PartitionKey> compositePartitionKey;

    /**
     * <p>
     * A non-empty list of partition keys defining the attributes used to partition the table data. The order of the
     * list determines the partition hierarchy. The name and type of each partition key as well as the partition key
     * order cannot be changed after the table is created. However, the enforcement level of each partition key can be
     * changed.
     * </p>
     * 
     * @return A non-empty list of partition keys defining the attributes used to partition the table data. The order of
     *         the list determines the partition hierarchy. The name and type of each partition key as well as the
     *         partition key order cannot be changed after the table is created. However, the enforcement level of each
     *         partition key can be changed.
     */

    public java.util.List<PartitionKey> getCompositePartitionKey() {
        return compositePartitionKey;
    }

    /**
     * <p>
     * A non-empty list of partition keys defining the attributes used to partition the table data. The order of the
     * list determines the partition hierarchy. The name and type of each partition key as well as the partition key
     * order cannot be changed after the table is created. However, the enforcement level of each partition key can be
     * changed.
     * </p>
     * 
     * @param compositePartitionKey
     *        A non-empty list of partition keys defining the attributes used to partition the table data. The order of
     *        the list determines the partition hierarchy. The name and type of each partition key as well as the
     *        partition key order cannot be changed after the table is created. However, the enforcement level of each
     *        partition key can be changed.
     */

    public void setCompositePartitionKey(java.util.Collection<PartitionKey> compositePartitionKey) {
        if (compositePartitionKey == null) {
            this.compositePartitionKey = null;
            return;
        }

        this.compositePartitionKey = new java.util.ArrayList<PartitionKey>(compositePartitionKey);
    }

    /**
     * <p>
     * A non-empty list of partition keys defining the attributes used to partition the table data. The order of the
     * list determines the partition hierarchy. The name and type of each partition key as well as the partition key
     * order cannot be changed after the table is created. However, the enforcement level of each partition key can be
     * changed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompositePartitionKey(java.util.Collection)} or
     * {@link #withCompositePartitionKey(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compositePartitionKey
     *        A non-empty list of partition keys defining the attributes used to partition the table data. The order of
     *        the list determines the partition hierarchy. The name and type of each partition key as well as the
     *        partition key order cannot be changed after the table is created. However, the enforcement level of each
     *        partition key can be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCompositePartitionKey(PartitionKey... compositePartitionKey) {
        if (this.compositePartitionKey == null) {
            setCompositePartitionKey(new java.util.ArrayList<PartitionKey>(compositePartitionKey.length));
        }
        for (PartitionKey ele : compositePartitionKey) {
            this.compositePartitionKey.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A non-empty list of partition keys defining the attributes used to partition the table data. The order of the
     * list determines the partition hierarchy. The name and type of each partition key as well as the partition key
     * order cannot be changed after the table is created. However, the enforcement level of each partition key can be
     * changed.
     * </p>
     * 
     * @param compositePartitionKey
     *        A non-empty list of partition keys defining the attributes used to partition the table data. The order of
     *        the list determines the partition hierarchy. The name and type of each partition key as well as the
     *        partition key order cannot be changed after the table is created. However, the enforcement level of each
     *        partition key can be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCompositePartitionKey(java.util.Collection<PartitionKey> compositePartitionKey) {
        setCompositePartitionKey(compositePartitionKey);
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
        if (getCompositePartitionKey() != null)
            sb.append("CompositePartitionKey: ").append(getCompositePartitionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schema == false)
            return false;
        Schema other = (Schema) obj;
        if (other.getCompositePartitionKey() == null ^ this.getCompositePartitionKey() == null)
            return false;
        if (other.getCompositePartitionKey() != null && other.getCompositePartitionKey().equals(this.getCompositePartitionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompositePartitionKey() == null) ? 0 : getCompositePartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public Schema clone() {
        try {
            return (Schema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.SchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
