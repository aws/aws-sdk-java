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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data type of the column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ColumnType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The allowed data types that the column has as it's value.
     * </p>
     */
    private String scalarType;

    /**
     * <p>
     * The allowed data types that the column has as it's value.
     * </p>
     * 
     * @param scalarType
     *        The allowed data types that the column has as it's value.
     * @see ScalarType
     */

    public void setScalarType(String scalarType) {
        this.scalarType = scalarType;
    }

    /**
     * <p>
     * The allowed data types that the column has as it's value.
     * </p>
     * 
     * @return The allowed data types that the column has as it's value.
     * @see ScalarType
     */

    public String getScalarType() {
        return this.scalarType;
    }

    /**
     * <p>
     * The allowed data types that the column has as it's value.
     * </p>
     * 
     * @param scalarType
     *        The allowed data types that the column has as it's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarType
     */

    public ColumnType withScalarType(String scalarType) {
        setScalarType(scalarType);
        return this;
    }

    /**
     * <p>
     * The allowed data types that the column has as it's value.
     * </p>
     * 
     * @param scalarType
     *        The allowed data types that the column has as it's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarType
     */

    public ColumnType withScalarType(ScalarType scalarType) {
        this.scalarType = scalarType.toString();
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
        if (getScalarType() != null)
            sb.append("ScalarType: ").append(getScalarType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnType == false)
            return false;
        ColumnType other = (ColumnType) obj;
        if (other.getScalarType() == null ^ this.getScalarType() == null)
            return false;
        if (other.getScalarType() != null && other.getScalarType().equals(this.getScalarType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalarType() == null) ? 0 : getScalarType().hashCode());
        return hashCode;
    }

    @Override
    public ColumnType clone() {
        try {
            return (ColumnType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ColumnTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
