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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a set of options that define how DataBrew will interpret a Microsoft Excel file when creating a dataset
 * from that file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ExcelOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExcelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more named sheets in the Excel file that will be included in the dataset.
     * </p>
     */
    private java.util.List<String> sheetNames;
    /**
     * <p>
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     * </p>
     */
    private java.util.List<Integer> sheetIndexes;
    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     */
    private Boolean headerRow;

    /**
     * <p>
     * One or more named sheets in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @return One or more named sheets in the Excel file that will be included in the dataset.
     */

    public java.util.List<String> getSheetNames() {
        return sheetNames;
    }

    /**
     * <p>
     * One or more named sheets in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @param sheetNames
     *        One or more named sheets in the Excel file that will be included in the dataset.
     */

    public void setSheetNames(java.util.Collection<String> sheetNames) {
        if (sheetNames == null) {
            this.sheetNames = null;
            return;
        }

        this.sheetNames = new java.util.ArrayList<String>(sheetNames);
    }

    /**
     * <p>
     * One or more named sheets in the Excel file that will be included in the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheetNames(java.util.Collection)} or {@link #withSheetNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sheetNames
     *        One or more named sheets in the Excel file that will be included in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcelOptions withSheetNames(String... sheetNames) {
        if (this.sheetNames == null) {
            setSheetNames(new java.util.ArrayList<String>(sheetNames.length));
        }
        for (String ele : sheetNames) {
            this.sheetNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more named sheets in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @param sheetNames
     *        One or more named sheets in the Excel file that will be included in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcelOptions withSheetNames(java.util.Collection<String> sheetNames) {
        setSheetNames(sheetNames);
        return this;
    }

    /**
     * <p>
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @return One or more sheet numbers in the Excel file that will be included in the dataset.
     */

    public java.util.List<Integer> getSheetIndexes() {
        return sheetIndexes;
    }

    /**
     * <p>
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @param sheetIndexes
     *        One or more sheet numbers in the Excel file that will be included in the dataset.
     */

    public void setSheetIndexes(java.util.Collection<Integer> sheetIndexes) {
        if (sheetIndexes == null) {
            this.sheetIndexes = null;
            return;
        }

        this.sheetIndexes = new java.util.ArrayList<Integer>(sheetIndexes);
    }

    /**
     * <p>
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheetIndexes(java.util.Collection)} or {@link #withSheetIndexes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sheetIndexes
     *        One or more sheet numbers in the Excel file that will be included in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcelOptions withSheetIndexes(Integer... sheetIndexes) {
        if (this.sheetIndexes == null) {
            setSheetIndexes(new java.util.ArrayList<Integer>(sheetIndexes.length));
        }
        for (Integer ele : sheetIndexes) {
            this.sheetIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     * </p>
     * 
     * @param sheetIndexes
     *        One or more sheet numbers in the Excel file that will be included in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcelOptions withSheetIndexes(java.util.Collection<Integer> sheetIndexes) {
        setSheetIndexes(sheetIndexes);
        return this;
    }

    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     * 
     * @param headerRow
     *        A variable that specifies whether the first row in the file is parsed as the header. If this value is
     *        false, column names are auto-generated.
     */

    public void setHeaderRow(Boolean headerRow) {
        this.headerRow = headerRow;
    }

    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     * 
     * @return A variable that specifies whether the first row in the file is parsed as the header. If this value is
     *         false, column names are auto-generated.
     */

    public Boolean getHeaderRow() {
        return this.headerRow;
    }

    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     * 
     * @param headerRow
     *        A variable that specifies whether the first row in the file is parsed as the header. If this value is
     *        false, column names are auto-generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcelOptions withHeaderRow(Boolean headerRow) {
        setHeaderRow(headerRow);
        return this;
    }

    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     * 
     * @return A variable that specifies whether the first row in the file is parsed as the header. If this value is
     *         false, column names are auto-generated.
     */

    public Boolean isHeaderRow() {
        return this.headerRow;
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
        if (getSheetNames() != null)
            sb.append("SheetNames: ").append(getSheetNames()).append(",");
        if (getSheetIndexes() != null)
            sb.append("SheetIndexes: ").append(getSheetIndexes()).append(",");
        if (getHeaderRow() != null)
            sb.append("HeaderRow: ").append(getHeaderRow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExcelOptions == false)
            return false;
        ExcelOptions other = (ExcelOptions) obj;
        if (other.getSheetNames() == null ^ this.getSheetNames() == null)
            return false;
        if (other.getSheetNames() != null && other.getSheetNames().equals(this.getSheetNames()) == false)
            return false;
        if (other.getSheetIndexes() == null ^ this.getSheetIndexes() == null)
            return false;
        if (other.getSheetIndexes() != null && other.getSheetIndexes().equals(this.getSheetIndexes()) == false)
            return false;
        if (other.getHeaderRow() == null ^ this.getHeaderRow() == null)
            return false;
        if (other.getHeaderRow() != null && other.getHeaderRow().equals(this.getHeaderRow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetNames() == null) ? 0 : getSheetNames().hashCode());
        hashCode = prime * hashCode + ((getSheetIndexes() == null) ? 0 : getSheetIndexes().hashCode());
        hashCode = prime * hashCode + ((getHeaderRow() == null) ? 0 : getHeaderRow().hashCode());
        return hashCode;
    }

    @Override
    public ExcelOptions clone() {
        try {
            return (ExcelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ExcelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
