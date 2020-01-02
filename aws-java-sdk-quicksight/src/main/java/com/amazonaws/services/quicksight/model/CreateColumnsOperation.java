/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A transform operation that creates calculated columns. Columns created in one such operation form a lexical closure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateColumnsOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateColumnsOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     */
    private java.util.List<CalculatedColumn> columns;

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * 
     * @return Calculated columns to create.
     */

    public java.util.List<CalculatedColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * 
     * @param columns
     *        Calculated columns to create.
     */

    public void setColumns(java.util.Collection<CalculatedColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<CalculatedColumn>(columns);
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        Calculated columns to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateColumnsOperation withColumns(CalculatedColumn... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<CalculatedColumn>(columns.length));
        }
        for (CalculatedColumn ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Calculated columns to create.
     * </p>
     * 
     * @param columns
     *        Calculated columns to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateColumnsOperation withColumns(java.util.Collection<CalculatedColumn> columns) {
        setColumns(columns);
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
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateColumnsOperation == false)
            return false;
        CreateColumnsOperation other = (CreateColumnsOperation) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public CreateColumnsOperation clone() {
        try {
            return (CreateColumnsOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CreateColumnsOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
