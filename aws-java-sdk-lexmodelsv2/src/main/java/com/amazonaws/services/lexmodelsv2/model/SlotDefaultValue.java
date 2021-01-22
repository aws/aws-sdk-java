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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the default value to use when a user doesn't provide a value for a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotDefaultValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotDefaultValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default value to use when a user doesn't provide a value for a slot.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The default value to use when a user doesn't provide a value for a slot.
     * </p>
     * 
     * @param defaultValue
     *        The default value to use when a user doesn't provide a value for a slot.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value to use when a user doesn't provide a value for a slot.
     * </p>
     * 
     * @return The default value to use when a user doesn't provide a value for a slot.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value to use when a user doesn't provide a value for a slot.
     * </p>
     * 
     * @param defaultValue
     *        The default value to use when a user doesn't provide a value for a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValue withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotDefaultValue == false)
            return false;
        SlotDefaultValue other = (SlotDefaultValue) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public SlotDefaultValue clone() {
        try {
            return (SlotDefaultValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotDefaultValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
