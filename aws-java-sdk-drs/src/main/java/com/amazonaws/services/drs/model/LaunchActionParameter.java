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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch action parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LaunchActionParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchActionParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @see LaunchActionParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @return Type.
     * @see LaunchActionParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionParameterType
     */

    public LaunchActionParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionParameterType
     */

    public LaunchActionParameter withType(LaunchActionParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Value.
     * </p>
     * 
     * @param value
     *        Value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Value.
     * </p>
     * 
     * @return Value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Value.
     * </p>
     * 
     * @param value
     *        Value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionParameter withValue(String value) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof LaunchActionParameter == false)
            return false;
        LaunchActionParameter other = (LaunchActionParameter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public LaunchActionParameter clone() {
        try {
            return (LaunchActionParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LaunchActionParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
