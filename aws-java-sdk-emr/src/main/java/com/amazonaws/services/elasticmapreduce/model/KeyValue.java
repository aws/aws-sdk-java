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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A key value pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/KeyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a key value pair.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value part of the identified key.
     * </p>
     */
    private String value;

    /**
     * Default constructor for KeyValue object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public KeyValue() {
    }

    /**
     * Constructs a new KeyValue object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param key
     *        The unique identifier of a key value pair.
     * @param value
     *        The value part of the identified key.
     */
    public KeyValue(String key, String value) {
        setKey(key);
        setValue(value);
    }

    /**
     * <p>
     * The unique identifier of a key value pair.
     * </p>
     * 
     * @param key
     *        The unique identifier of a key value pair.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The unique identifier of a key value pair.
     * </p>
     * 
     * @return The unique identifier of a key value pair.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The unique identifier of a key value pair.
     * </p>
     * 
     * @param key
     *        The unique identifier of a key value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValue withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value part of the identified key.
     * </p>
     * 
     * @param value
     *        The value part of the identified key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value part of the identified key.
     * </p>
     * 
     * @return The value part of the identified key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value part of the identified key.
     * </p>
     * 
     * @param value
     *        The value part of the identified key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValue withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyValue == false)
            return false;
        KeyValue other = (KeyValue) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public KeyValue clone() {
        try {
            return (KeyValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.KeyValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
