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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes allowed or specified with a parameter object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ParameterAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field identifier.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * The field identifier.
     * </p>
     * 
     * @param key
     *        The field identifier.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The field identifier.
     * </p>
     * 
     * @return The field identifier.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The field identifier.
     * </p>
     * 
     * @param key
     *        The field identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @param stringValue
     *        The field value, expressed as a String.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @return The field value, expressed as a String.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The field value, expressed as a String.
     * </p>
     * 
     * @param stringValue
     *        The field value, expressed as a String.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterAttribute withStringValue(String stringValue) {
        setStringValue(stringValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterAttribute == false)
            return false;
        ParameterAttribute other = (ParameterAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterAttribute clone() {
        try {
            return (ParameterAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.ParameterAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
