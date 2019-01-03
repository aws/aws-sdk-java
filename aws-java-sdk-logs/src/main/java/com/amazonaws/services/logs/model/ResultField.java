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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains one field from one log event returned by a CloudWatch Logs Insights query, along with the value of that
 * field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ResultField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log event field.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The value of this field.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The log event field.
     * </p>
     * 
     * @param field
     *        The log event field.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The log event field.
     * </p>
     * 
     * @return The log event field.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The log event field.
     * </p>
     * 
     * @param field
     *        The log event field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultField withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The value of this field.
     * </p>
     * 
     * @param value
     *        The value of this field.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of this field.
     * </p>
     * 
     * @return The value of this field.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of this field.
     * </p>
     * 
     * @param value
     *        The value of this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultField withValue(String value) {
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
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

        if (obj instanceof ResultField == false)
            return false;
        ResultField other = (ResultField) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
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

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ResultField clone() {
        try {
            return (ResultField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.ResultFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
