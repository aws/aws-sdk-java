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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This data type contains key-value pairs that identify various Amazon resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/Scope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the scope.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The resource identifier for the specified scope type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param key
     *        The type of the scope.
     * @see ScopeType
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @return The type of the scope.
     * @see ScopeType
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param key
     *        The type of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeType
     */

    public Scope withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param key
     *        The type of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeType
     */

    public Scope withKey(ScopeType key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The resource identifier for the specified scope type.
     * </p>
     * 
     * @param value
     *        The resource identifier for the specified scope type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The resource identifier for the specified scope type.
     * </p>
     * 
     * @return The resource identifier for the specified scope type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The resource identifier for the specified scope type.
     * </p>
     * 
     * @param value
     *        The resource identifier for the specified scope type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withValue(String value) {
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

        if (obj instanceof Scope == false)
            return false;
        Scope other = (Scope) obj;
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
    public Scope clone() {
        try {
            return (Scope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.ScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
