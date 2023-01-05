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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnRowFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnRowFilter implements Serializable, Cloneable, StructuredPojo {

    private String columnName;

    private String rowFilterExpression;

    /**
     * @param columnName
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @param columnName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnRowFilter withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * @param rowFilterExpression
     */

    public void setRowFilterExpression(String rowFilterExpression) {
        this.rowFilterExpression = rowFilterExpression;
    }

    /**
     * @return
     */

    public String getRowFilterExpression() {
        return this.rowFilterExpression;
    }

    /**
     * @param rowFilterExpression
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnRowFilter withRowFilterExpression(String rowFilterExpression) {
        setRowFilterExpression(rowFilterExpression);
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getRowFilterExpression() != null)
            sb.append("RowFilterExpression: ").append(getRowFilterExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnRowFilter == false)
            return false;
        ColumnRowFilter other = (ColumnRowFilter) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getRowFilterExpression() == null ^ this.getRowFilterExpression() == null)
            return false;
        if (other.getRowFilterExpression() != null && other.getRowFilterExpression().equals(this.getRowFilterExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getRowFilterExpression() == null) ? 0 : getRowFilterExpression().hashCode());
        return hashCode;
    }

    @Override
    public ColumnRowFilter clone() {
        try {
            return (ColumnRowFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnRowFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
