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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input variables to the app to be used by the InvokeScreenAutomation action request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/VariableValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariableValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Raw value of the variable.
     * </p>
     */
    private String rawValue;

    /**
     * <p>
     * Raw value of the variable.
     * </p>
     * 
     * @param rawValue
     *        Raw value of the variable.
     */

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    /**
     * <p>
     * Raw value of the variable.
     * </p>
     * 
     * @return Raw value of the variable.
     */

    public String getRawValue() {
        return this.rawValue;
    }

    /**
     * <p>
     * Raw value of the variable.
     * </p>
     * 
     * @param rawValue
     *        Raw value of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withRawValue(String rawValue) {
        setRawValue(rawValue);
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
        if (getRawValue() != null)
            sb.append("RawValue: ").append(getRawValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableValue == false)
            return false;
        VariableValue other = (VariableValue) obj;
        if (other.getRawValue() == null ^ this.getRawValue() == null)
            return false;
        if (other.getRawValue() != null && other.getRawValue().equals(this.getRawValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRawValue() == null) ? 0 : getRawValue().hashCode());
        return hashCode;
    }

    @Override
    public VariableValue clone() {
        try {
            return (VariableValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.VariableValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
