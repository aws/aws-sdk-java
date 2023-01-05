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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a custom null value such as a zeros or other value being used as a null placeholder unique to the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/NullValueField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NullValueField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the null placeholder.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The datatype of the value.
     * </p>
     */
    private Datatype datatype;

    /**
     * <p>
     * The value of the null placeholder.
     * </p>
     * 
     * @param value
     *        The value of the null placeholder.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the null placeholder.
     * </p>
     * 
     * @return The value of the null placeholder.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the null placeholder.
     * </p>
     * 
     * @param value
     *        The value of the null placeholder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullValueField withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @param datatype
     *        The datatype of the value.
     */

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @return The datatype of the value.
     */

    public Datatype getDatatype() {
        return this.datatype;
    }

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @param datatype
     *        The datatype of the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NullValueField withDatatype(Datatype datatype) {
        setDatatype(datatype);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDatatype() != null)
            sb.append("Datatype: ").append(getDatatype());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NullValueField == false)
            return false;
        NullValueField other = (NullValueField) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDatatype() == null ^ this.getDatatype() == null)
            return false;
        if (other.getDatatype() != null && other.getDatatype().equals(this.getDatatype()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDatatype() == null) ? 0 : getDatatype().hashCode());
        return hashCode;
    }

    @Override
    public NullValueField clone() {
        try {
            return (NullValueField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.NullValueFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
