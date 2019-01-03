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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata and rows that comprise a query result set. The metadata describes the column structure and data types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rows in the table.
     * </p>
     */
    private java.util.List<Row> rows;
    /**
     * <p>
     * The metadata that describes the column structure and data types of a table of query results.
     * </p>
     */
    private ResultSetMetadata resultSetMetadata;

    /**
     * <p>
     * The rows in the table.
     * </p>
     * 
     * @return The rows in the table.
     */

    public java.util.List<Row> getRows() {
        return rows;
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     * 
     * @param rows
     *        The rows in the table.
     */

    public void setRows(java.util.Collection<Row> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<Row>(rows);
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        The rows in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withRows(Row... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<Row>(rows.length));
        }
        for (Row ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rows in the table.
     * </p>
     * 
     * @param rows
     *        The rows in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withRows(java.util.Collection<Row> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a table of query results.
     * </p>
     * 
     * @param resultSetMetadata
     *        The metadata that describes the column structure and data types of a table of query results.
     */

    public void setResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        this.resultSetMetadata = resultSetMetadata;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a table of query results.
     * </p>
     * 
     * @return The metadata that describes the column structure and data types of a table of query results.
     */

    public ResultSetMetadata getResultSetMetadata() {
        return this.resultSetMetadata;
    }

    /**
     * <p>
     * The metadata that describes the column structure and data types of a table of query results.
     * </p>
     * 
     * @param resultSetMetadata
     *        The metadata that describes the column structure and data types of a table of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        setResultSetMetadata(resultSetMetadata);
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
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getResultSetMetadata() != null)
            sb.append("ResultSetMetadata: ").append(getResultSetMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSet == false)
            return false;
        ResultSet other = (ResultSet) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getResultSetMetadata() == null ^ this.getResultSetMetadata() == null)
            return false;
        if (other.getResultSetMetadata() != null && other.getResultSetMetadata().equals(this.getResultSetMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getResultSetMetadata() == null) ? 0 : getResultSetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ResultSet clone() {
        try {
            return (ResultSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
