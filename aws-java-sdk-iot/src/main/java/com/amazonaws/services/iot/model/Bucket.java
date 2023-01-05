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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A count of documents that meets a specific aggregation criteria.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bucket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     */
    private String keyValue;
    /**
     * <p>
     * The number of documents that have the value counted for the particular bucket.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     * 
     * @param keyValue
     *        The value counted for the particular bucket.
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     * 
     * @return The value counted for the particular bucket.
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     * 
     * @param keyValue
     *        The value counted for the particular bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withKeyValue(String keyValue) {
        setKeyValue(keyValue);
        return this;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular bucket.
     * </p>
     * 
     * @param count
     *        The number of documents that have the value counted for the particular bucket.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular bucket.
     * </p>
     * 
     * @return The number of documents that have the value counted for the particular bucket.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular bucket.
     * </p>
     * 
     * @param count
     *        The number of documents that have the value counted for the particular bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withCount(Integer count) {
        setCount(count);
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
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bucket == false)
            return false;
        Bucket other = (Bucket) obj;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public Bucket clone() {
        try {
            return (Bucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.BucketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
