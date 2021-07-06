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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the location of an occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Cell" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cell implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the cell, as an absolute cell reference, that contains the sensitive data, for example Sheet2!C5
     * for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     * </p>
     */
    private String cellReference;
    /**
     * <p>
     * The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this value
     * correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2 for column B,
     * and so on.
     * </p>
     */
    private Long column;
    /**
     * <p>
     * The name of the column that contains the sensitive data, if available.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The row number of the row that contains the sensitive data.
     * </p>
     */
    private Long row;

    /**
     * <p>
     * The location of the cell, as an absolute cell reference, that contains the sensitive data, for example Sheet2!C5
     * for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     * </p>
     * 
     * @param cellReference
     *        The location of the cell, as an absolute cell reference, that contains the sensitive data, for example
     *        Sheet2!C5 for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     */

    public void setCellReference(String cellReference) {
        this.cellReference = cellReference;
    }

    /**
     * <p>
     * The location of the cell, as an absolute cell reference, that contains the sensitive data, for example Sheet2!C5
     * for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     * </p>
     * 
     * @return The location of the cell, as an absolute cell reference, that contains the sensitive data, for example
     *         Sheet2!C5 for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     */

    public String getCellReference() {
        return this.cellReference;
    }

    /**
     * <p>
     * The location of the cell, as an absolute cell reference, that contains the sensitive data, for example Sheet2!C5
     * for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     * </p>
     * 
     * @param cellReference
     *        The location of the cell, as an absolute cell reference, that contains the sensitive data, for example
     *        Sheet2!C5 for cell C5 on Sheet2 in a Microsoft Excel workbook. This value is null for CSV and TSV files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withCellReference(String cellReference) {
        setCellReference(cellReference);
        return this;
    }

    /**
     * <p>
     * The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this value
     * correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2 for column B,
     * and so on.
     * </p>
     * 
     * @param column
     *        The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this
     *        value correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2
     *        for column B, and so on.
     */

    public void setColumn(Long column) {
        this.column = column;
    }

    /**
     * <p>
     * The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this value
     * correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2 for column B,
     * and so on.
     * </p>
     * 
     * @return The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this
     *         value correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2
     *         for column B, and so on.
     */

    public Long getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this value
     * correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2 for column B,
     * and so on.
     * </p>
     * 
     * @param column
     *        The column number of the column that contains the sensitive data. For a Microsoft Excel workbook, this
     *        value correlates to the alphabetical character(s) for a column identifier, for example: 1 for column A, 2
     *        for column B, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withColumn(Long column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The name of the column that contains the sensitive data, if available.
     * </p>
     * 
     * @param columnName
     *        The name of the column that contains the sensitive data, if available.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column that contains the sensitive data, if available.
     * </p>
     * 
     * @return The name of the column that contains the sensitive data, if available.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the column that contains the sensitive data, if available.
     * </p>
     * 
     * @param columnName
     *        The name of the column that contains the sensitive data, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The row number of the row that contains the sensitive data.
     * </p>
     * 
     * @param row
     *        The row number of the row that contains the sensitive data.
     */

    public void setRow(Long row) {
        this.row = row;
    }

    /**
     * <p>
     * The row number of the row that contains the sensitive data.
     * </p>
     * 
     * @return The row number of the row that contains the sensitive data.
     */

    public Long getRow() {
        return this.row;
    }

    /**
     * <p>
     * The row number of the row that contains the sensitive data.
     * </p>
     * 
     * @param row
     *        The row number of the row that contains the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withRow(Long row) {
        setRow(row);
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
        if (getCellReference() != null)
            sb.append("CellReference: ").append(getCellReference()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getRow() != null)
            sb.append("Row: ").append(getRow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cell == false)
            return false;
        Cell other = (Cell) obj;
        if (other.getCellReference() == null ^ this.getCellReference() == null)
            return false;
        if (other.getCellReference() != null && other.getCellReference().equals(this.getCellReference()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getRow() == null ^ this.getRow() == null)
            return false;
        if (other.getRow() != null && other.getRow().equals(this.getRow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCellReference() == null) ? 0 : getCellReference().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getRow() == null) ? 0 : getRow().hashCode());
        return hashCode;
    }

    @Override
    public Cell clone() {
        try {
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.CellMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
