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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A .csv file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Csv" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Csv implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     */
    private java.util.List<String> columnNames;

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     * 
     * @return The column names specified in the .csv file.
     * @see ColumnName
     */

    public java.util.List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     * 
     * @param columnNames
     *        The column names specified in the .csv file.
     * @see ColumnName
     */

    public void setColumnNames(java.util.Collection<String> columnNames) {
        if (columnNames == null) {
            this.columnNames = null;
            return;
        }

        this.columnNames = new java.util.ArrayList<String>(columnNames);
    }

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNames(java.util.Collection)} or {@link #withColumnNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnNames
     *        The column names specified in the .csv file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnName
     */

    public Csv withColumnNames(String... columnNames) {
        if (this.columnNames == null) {
            setColumnNames(new java.util.ArrayList<String>(columnNames.length));
        }
        for (String ele : columnNames) {
            this.columnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     * 
     * @param columnNames
     *        The column names specified in the .csv file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnName
     */

    public Csv withColumnNames(java.util.Collection<String> columnNames) {
        setColumnNames(columnNames);
        return this;
    }

    /**
     * <p>
     * The column names specified in the .csv file.
     * </p>
     * 
     * @param columnNames
     *        The column names specified in the .csv file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnName
     */

    public Csv withColumnNames(ColumnName... columnNames) {
        java.util.ArrayList<String> columnNamesCopy = new java.util.ArrayList<String>(columnNames.length);
        for (ColumnName value : columnNames) {
            columnNamesCopy.add(value.toString());
        }
        if (getColumnNames() == null) {
            setColumnNames(columnNamesCopy);
        } else {
            getColumnNames().addAll(columnNamesCopy);
        }
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
        if (getColumnNames() != null)
            sb.append("ColumnNames: ").append(getColumnNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Csv == false)
            return false;
        Csv other = (Csv) obj;
        if (other.getColumnNames() == null ^ this.getColumnNames() == null)
            return false;
        if (other.getColumnNames() != null && other.getColumnNames().equals(this.getColumnNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnNames() == null) ? 0 : getColumnNames().hashCode());
        return hashCode;
    }

    @Override
    public Csv clone() {
        try {
            return (Csv) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.CsvMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
