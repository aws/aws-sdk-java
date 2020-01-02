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
 * A transform operation that renames a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RenameColumnOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenameColumnOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The new name for the column.
     * </p>
     */
    private String newColumnName;

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * 
     * @param columnName
     *        The name of the column to be renamed.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * 
     * @return The name of the column to be renamed.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the column to be renamed.
     * </p>
     * 
     * @param columnName
     *        The name of the column to be renamed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameColumnOperation withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * 
     * @param newColumnName
     *        The new name for the column.
     */

    public void setNewColumnName(String newColumnName) {
        this.newColumnName = newColumnName;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * 
     * @return The new name for the column.
     */

    public String getNewColumnName() {
        return this.newColumnName;
    }

    /**
     * <p>
     * The new name for the column.
     * </p>
     * 
     * @param newColumnName
     *        The new name for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameColumnOperation withNewColumnName(String newColumnName) {
        setNewColumnName(newColumnName);
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
        if (getNewColumnName() != null)
            sb.append("NewColumnName: ").append(getNewColumnName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenameColumnOperation == false)
            return false;
        RenameColumnOperation other = (RenameColumnOperation) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getNewColumnName() == null ^ this.getNewColumnName() == null)
            return false;
        if (other.getNewColumnName() != null && other.getNewColumnName().equals(this.getNewColumnName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getNewColumnName() == null) ? 0 : getNewColumnName().hashCode());
        return hashCode;
    }

    @Override
    public RenameColumnOperation clone() {
        try {
            return (RenameColumnOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RenameColumnOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
