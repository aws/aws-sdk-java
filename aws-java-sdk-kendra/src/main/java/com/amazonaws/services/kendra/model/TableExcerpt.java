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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An excerpt from a table within a document. The table excerpt displays up to five columns and three rows, depending on
 * how many table cells are relevant to the query and how many columns are available in the original table. The top most
 * relevant cell is displayed in the table excerpt, along with the next most relevant cells.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TableExcerpt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableExcerpt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of rows in the table excerpt.
     * </p>
     */
    private java.util.List<TableRow> rows;
    /**
     * <p>
     * A count of the number of rows in the original table within the document.
     * </p>
     */
    private Integer totalNumberOfRows;

    /**
     * <p>
     * A list of rows in the table excerpt.
     * </p>
     * 
     * @return A list of rows in the table excerpt.
     */

    public java.util.List<TableRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * A list of rows in the table excerpt.
     * </p>
     * 
     * @param rows
     *        A list of rows in the table excerpt.
     */

    public void setRows(java.util.Collection<TableRow> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<TableRow>(rows);
    }

    /**
     * <p>
     * A list of rows in the table excerpt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        A list of rows in the table excerpt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableExcerpt withRows(TableRow... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<TableRow>(rows.length));
        }
        for (TableRow ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of rows in the table excerpt.
     * </p>
     * 
     * @param rows
     *        A list of rows in the table excerpt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableExcerpt withRows(java.util.Collection<TableRow> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * A count of the number of rows in the original table within the document.
     * </p>
     * 
     * @param totalNumberOfRows
     *        A count of the number of rows in the original table within the document.
     */

    public void setTotalNumberOfRows(Integer totalNumberOfRows) {
        this.totalNumberOfRows = totalNumberOfRows;
    }

    /**
     * <p>
     * A count of the number of rows in the original table within the document.
     * </p>
     * 
     * @return A count of the number of rows in the original table within the document.
     */

    public Integer getTotalNumberOfRows() {
        return this.totalNumberOfRows;
    }

    /**
     * <p>
     * A count of the number of rows in the original table within the document.
     * </p>
     * 
     * @param totalNumberOfRows
     *        A count of the number of rows in the original table within the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableExcerpt withTotalNumberOfRows(Integer totalNumberOfRows) {
        setTotalNumberOfRows(totalNumberOfRows);
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
        if (getTotalNumberOfRows() != null)
            sb.append("TotalNumberOfRows: ").append(getTotalNumberOfRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableExcerpt == false)
            return false;
        TableExcerpt other = (TableExcerpt) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getTotalNumberOfRows() == null ^ this.getTotalNumberOfRows() == null)
            return false;
        if (other.getTotalNumberOfRows() != null && other.getTotalNumberOfRows().equals(this.getTotalNumberOfRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfRows() == null) ? 0 : getTotalNumberOfRows().hashCode());
        return hashCode;
    }

    @Override
    public TableExcerpt clone() {
        try {
            return (TableExcerpt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.TableExcerptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
