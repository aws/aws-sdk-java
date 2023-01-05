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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the key value pairs for the JSON.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/JsonFormatRef" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonFormatRef implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specified key for the JSON.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The specified value for the JSON.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The specified key for the JSON.
     * </p>
     * 
     * @param key
     *        The specified key for the JSON.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The specified key for the JSON.
     * </p>
     * 
     * @return The specified key for the JSON.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The specified key for the JSON.
     * </p>
     * 
     * @param key
     *        The specified key for the JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonFormatRef withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The specified value for the JSON.
     * </p>
     * 
     * @param value
     *        The specified value for the JSON.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The specified value for the JSON.
     * </p>
     * 
     * @return The specified value for the JSON.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The specified value for the JSON.
     * </p>
     * 
     * @param value
     *        The specified value for the JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonFormatRef withValue(String value) {
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

        if (obj instanceof JsonFormatRef == false)
            return false;
        JsonFormatRef other = (JsonFormatRef) obj;
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
    public JsonFormatRef clone() {
        try {
            return (JsonFormatRef) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.JsonFormatRefMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
