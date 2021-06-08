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
 * ResultSet contains the results of the request for a single block or list defined on the screen.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ResultSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of headers for all the data cells in the block. The header identifies the name and default format of the
     * data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are
     * not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and assigned person might have headers [ { "name":
     * "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in
     * the result will have the task name as the first item, due date as the second item and assigned person as the
     * third item. If a particular task does not have a due date, that row will still have a blank value in the second
     * element and the assigned person will still be in the third element.
     * </p>
     */
    private java.util.List<ColumnMetadata> headers;
    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells
     * will be present in the same order as they are defined in the header.
     * </p>
     */
    private java.util.List<ResultRow> rows;

    /**
     * <p>
     * List of headers for all the data cells in the block. The header identifies the name and default format of the
     * data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are
     * not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and assigned person might have headers [ { "name":
     * "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in
     * the result will have the task name as the first item, due date as the second item and assigned person as the
     * third item. If a particular task does not have a due date, that row will still have a blank value in the second
     * element and the assigned person will still be in the third element.
     * </p>
     * 
     * @return List of headers for all the data cells in the block. The header identifies the name and default format of
     *         the data cell. Data cells appear in the same order in all rows as defined in the header. The names and
     *         formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank
     *         value is used. </p>
     *         <p>
     *         For example, a task list that displays the task name, due date and assigned person might have headers [ {
     *         "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     *         ]. Every row in the result will have the task name as the first item, due date as the second item and
     *         assigned person as the third item. If a particular task does not have a due date, that row will still
     *         have a blank value in the second element and the assigned person will still be in the third element.
     */

    public java.util.List<ColumnMetadata> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header identifies the name and default format of the
     * data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are
     * not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and assigned person might have headers [ { "name":
     * "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in
     * the result will have the task name as the first item, due date as the second item and assigned person as the
     * third item. If a particular task does not have a due date, that row will still have a blank value in the second
     * element and the assigned person will still be in the third element.
     * </p>
     * 
     * @param headers
     *        List of headers for all the data cells in the block. The header identifies the name and default format of
     *        the data cell. Data cells appear in the same order in all rows as defined in the header. The names and
     *        formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank
     *        value is used. </p>
     *        <p>
     *        For example, a task list that displays the task name, due date and assigned person might have headers [ {
     *        "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ].
     *        Every row in the result will have the task name as the first item, due date as the second item and
     *        assigned person as the third item. If a particular task does not have a due date, that row will still have
     *        a blank value in the second element and the assigned person will still be in the third element.
     */

    public void setHeaders(java.util.Collection<ColumnMetadata> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<ColumnMetadata>(headers);
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header identifies the name and default format of the
     * data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are
     * not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and assigned person might have headers [ { "name":
     * "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in
     * the result will have the task name as the first item, due date as the second item and assigned person as the
     * third item. If a particular task does not have a due date, that row will still have a blank value in the second
     * element and the assigned person will still be in the third element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        List of headers for all the data cells in the block. The header identifies the name and default format of
     *        the data cell. Data cells appear in the same order in all rows as defined in the header. The names and
     *        formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank
     *        value is used. </p>
     *        <p>
     *        For example, a task list that displays the task name, due date and assigned person might have headers [ {
     *        "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ].
     *        Every row in the result will have the task name as the first item, due date as the second item and
     *        assigned person as the third item. If a particular task does not have a due date, that row will still have
     *        a blank value in the second element and the assigned person will still be in the third element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withHeaders(ColumnMetadata... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<ColumnMetadata>(headers.length));
        }
        for (ColumnMetadata ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header identifies the name and default format of the
     * data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are
     * not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and assigned person might have headers [ { "name":
     * "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in
     * the result will have the task name as the first item, due date as the second item and assigned person as the
     * third item. If a particular task does not have a due date, that row will still have a blank value in the second
     * element and the assigned person will still be in the third element.
     * </p>
     * 
     * @param headers
     *        List of headers for all the data cells in the block. The header identifies the name and default format of
     *        the data cell. Data cells appear in the same order in all rows as defined in the header. The names and
     *        formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank
     *        value is used. </p>
     *        <p>
     *        For example, a task list that displays the task name, due date and assigned person might have headers [ {
     *        "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ].
     *        Every row in the result will have the task name as the first item, due date as the second item and
     *        assigned person as the third item. If a particular task does not have a due date, that row will still have
     *        a blank value in the second element and the assigned person will still be in the third element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withHeaders(java.util.Collection<ColumnMetadata> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells
     * will be present in the same order as they are defined in the header.
     * </p>
     * 
     * @return List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The
     *         data cells will be present in the same order as they are defined in the header.
     */

    public java.util.List<ResultRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells
     * will be present in the same order as they are defined in the header.
     * </p>
     * 
     * @param rows
     *        List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data
     *        cells will be present in the same order as they are defined in the header.
     */

    public void setRows(java.util.Collection<ResultRow> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<ResultRow>(rows);
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells
     * will be present in the same order as they are defined in the header.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data
     *        cells will be present in the same order as they are defined in the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withRows(ResultRow... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<ResultRow>(rows.length));
        }
        for (ResultRow ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells
     * will be present in the same order as they are defined in the header.
     * </p>
     * 
     * @param rows
     *        List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data
     *        cells will be present in the same order as they are defined in the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSet withRows(java.util.Collection<ResultRow> rows) {
        setRows(rows);
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
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getRows() != null)
            sb.append("Rows: ").append(getRows());
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
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
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
        com.amazonaws.services.honeycode.model.transform.ResultSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
