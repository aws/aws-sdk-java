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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional parameter included in the body. You can include up to 100 additional body parameters per request. An event
 * payload cannot exceed 64 KB.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ConnectionBodyParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionBodyParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the parameter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value associated with the key.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Specified whether the value is secret.
     * </p>
     */
    private Boolean isValueSecret;

    /**
     * <p>
     * The key for the parameter.
     * </p>
     * 
     * @param key
     *        The key for the parameter.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the parameter.
     * </p>
     * 
     * @return The key for the parameter.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the parameter.
     * </p>
     * 
     * @param key
     *        The key for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionBodyParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value associated with the key.
     * </p>
     * 
     * @param value
     *        The value associated with the key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value associated with the key.
     * </p>
     * 
     * @return The value associated with the key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value associated with the key.
     * </p>
     * 
     * @param value
     *        The value associated with the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionBodyParameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specified whether the value is secret.
     * </p>
     * 
     * @param isValueSecret
     *        Specified whether the value is secret.
     */

    public void setIsValueSecret(Boolean isValueSecret) {
        this.isValueSecret = isValueSecret;
    }

    /**
     * <p>
     * Specified whether the value is secret.
     * </p>
     * 
     * @return Specified whether the value is secret.
     */

    public Boolean getIsValueSecret() {
        return this.isValueSecret;
    }

    /**
     * <p>
     * Specified whether the value is secret.
     * </p>
     * 
     * @param isValueSecret
     *        Specified whether the value is secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionBodyParameter withIsValueSecret(Boolean isValueSecret) {
        setIsValueSecret(isValueSecret);
        return this;
    }

    /**
     * <p>
     * Specified whether the value is secret.
     * </p>
     * 
     * @return Specified whether the value is secret.
     */

    public Boolean isValueSecret() {
        return this.isValueSecret;
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getIsValueSecret() != null)
            sb.append("IsValueSecret: ").append(getIsValueSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionBodyParameter == false)
            return false;
        ConnectionBodyParameter other = (ConnectionBodyParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getIsValueSecret() == null ^ this.getIsValueSecret() == null)
            return false;
        if (other.getIsValueSecret() != null && other.getIsValueSecret().equals(this.getIsValueSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getIsValueSecret() == null) ? 0 : getIsValueSecret().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionBodyParameter clone() {
        try {
            return (ConnectionBodyParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.ConnectionBodyParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
