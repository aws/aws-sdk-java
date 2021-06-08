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
 * An object that contains the options relating to parsing delimited text as part of an import request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DelimitedTextImportOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelimitedTextImportOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delimiter to use for separating columns in a single row of the input.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * Indicates whether the input file has a header row at the top containing the column names.
     * </p>
     */
    private Boolean hasHeaderRow;
    /**
     * <p>
     * A parameter to indicate whether empty rows should be ignored or be included in the import.
     * </p>
     */
    private Boolean ignoreEmptyRows;
    /**
     * <p>
     * The encoding of the data in the input file.
     * </p>
     */
    private String dataCharacterEncoding;

    /**
     * <p>
     * The delimiter to use for separating columns in a single row of the input.
     * </p>
     * 
     * @param delimiter
     *        The delimiter to use for separating columns in a single row of the input.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter to use for separating columns in a single row of the input.
     * </p>
     * 
     * @return The delimiter to use for separating columns in a single row of the input.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The delimiter to use for separating columns in a single row of the input.
     * </p>
     * 
     * @param delimiter
     *        The delimiter to use for separating columns in a single row of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelimitedTextImportOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * Indicates whether the input file has a header row at the top containing the column names.
     * </p>
     * 
     * @param hasHeaderRow
     *        Indicates whether the input file has a header row at the top containing the column names.
     */

    public void setHasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
    }

    /**
     * <p>
     * Indicates whether the input file has a header row at the top containing the column names.
     * </p>
     * 
     * @return Indicates whether the input file has a header row at the top containing the column names.
     */

    public Boolean getHasHeaderRow() {
        return this.hasHeaderRow;
    }

    /**
     * <p>
     * Indicates whether the input file has a header row at the top containing the column names.
     * </p>
     * 
     * @param hasHeaderRow
     *        Indicates whether the input file has a header row at the top containing the column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelimitedTextImportOptions withHasHeaderRow(Boolean hasHeaderRow) {
        setHasHeaderRow(hasHeaderRow);
        return this;
    }

    /**
     * <p>
     * Indicates whether the input file has a header row at the top containing the column names.
     * </p>
     * 
     * @return Indicates whether the input file has a header row at the top containing the column names.
     */

    public Boolean isHasHeaderRow() {
        return this.hasHeaderRow;
    }

    /**
     * <p>
     * A parameter to indicate whether empty rows should be ignored or be included in the import.
     * </p>
     * 
     * @param ignoreEmptyRows
     *        A parameter to indicate whether empty rows should be ignored or be included in the import.
     */

    public void setIgnoreEmptyRows(Boolean ignoreEmptyRows) {
        this.ignoreEmptyRows = ignoreEmptyRows;
    }

    /**
     * <p>
     * A parameter to indicate whether empty rows should be ignored or be included in the import.
     * </p>
     * 
     * @return A parameter to indicate whether empty rows should be ignored or be included in the import.
     */

    public Boolean getIgnoreEmptyRows() {
        return this.ignoreEmptyRows;
    }

    /**
     * <p>
     * A parameter to indicate whether empty rows should be ignored or be included in the import.
     * </p>
     * 
     * @param ignoreEmptyRows
     *        A parameter to indicate whether empty rows should be ignored or be included in the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelimitedTextImportOptions withIgnoreEmptyRows(Boolean ignoreEmptyRows) {
        setIgnoreEmptyRows(ignoreEmptyRows);
        return this;
    }

    /**
     * <p>
     * A parameter to indicate whether empty rows should be ignored or be included in the import.
     * </p>
     * 
     * @return A parameter to indicate whether empty rows should be ignored or be included in the import.
     */

    public Boolean isIgnoreEmptyRows() {
        return this.ignoreEmptyRows;
    }

    /**
     * <p>
     * The encoding of the data in the input file.
     * </p>
     * 
     * @param dataCharacterEncoding
     *        The encoding of the data in the input file.
     * @see ImportDataCharacterEncoding
     */

    public void setDataCharacterEncoding(String dataCharacterEncoding) {
        this.dataCharacterEncoding = dataCharacterEncoding;
    }

    /**
     * <p>
     * The encoding of the data in the input file.
     * </p>
     * 
     * @return The encoding of the data in the input file.
     * @see ImportDataCharacterEncoding
     */

    public String getDataCharacterEncoding() {
        return this.dataCharacterEncoding;
    }

    /**
     * <p>
     * The encoding of the data in the input file.
     * </p>
     * 
     * @param dataCharacterEncoding
     *        The encoding of the data in the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportDataCharacterEncoding
     */

    public DelimitedTextImportOptions withDataCharacterEncoding(String dataCharacterEncoding) {
        setDataCharacterEncoding(dataCharacterEncoding);
        return this;
    }

    /**
     * <p>
     * The encoding of the data in the input file.
     * </p>
     * 
     * @param dataCharacterEncoding
     *        The encoding of the data in the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportDataCharacterEncoding
     */

    public DelimitedTextImportOptions withDataCharacterEncoding(ImportDataCharacterEncoding dataCharacterEncoding) {
        this.dataCharacterEncoding = dataCharacterEncoding.toString();
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getHasHeaderRow() != null)
            sb.append("HasHeaderRow: ").append(getHasHeaderRow()).append(",");
        if (getIgnoreEmptyRows() != null)
            sb.append("IgnoreEmptyRows: ").append(getIgnoreEmptyRows()).append(",");
        if (getDataCharacterEncoding() != null)
            sb.append("DataCharacterEncoding: ").append(getDataCharacterEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelimitedTextImportOptions == false)
            return false;
        DelimitedTextImportOptions other = (DelimitedTextImportOptions) obj;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getHasHeaderRow() == null ^ this.getHasHeaderRow() == null)
            return false;
        if (other.getHasHeaderRow() != null && other.getHasHeaderRow().equals(this.getHasHeaderRow()) == false)
            return false;
        if (other.getIgnoreEmptyRows() == null ^ this.getIgnoreEmptyRows() == null)
            return false;
        if (other.getIgnoreEmptyRows() != null && other.getIgnoreEmptyRows().equals(this.getIgnoreEmptyRows()) == false)
            return false;
        if (other.getDataCharacterEncoding() == null ^ this.getDataCharacterEncoding() == null)
            return false;
        if (other.getDataCharacterEncoding() != null && other.getDataCharacterEncoding().equals(this.getDataCharacterEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getHasHeaderRow() == null) ? 0 : getHasHeaderRow().hashCode());
        hashCode = prime * hashCode + ((getIgnoreEmptyRows() == null) ? 0 : getIgnoreEmptyRows().hashCode());
        hashCode = prime * hashCode + ((getDataCharacterEncoding() == null) ? 0 : getDataCharacterEncoding().hashCode());
        return hashCode;
    }

    @Override
    public DelimitedTextImportOptions clone() {
        try {
            return (DelimitedTextImportOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.DelimitedTextImportOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
