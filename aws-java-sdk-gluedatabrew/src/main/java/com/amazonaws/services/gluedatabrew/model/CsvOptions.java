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
 * Represents a set of options that define how DataBrew will read a comma-separated value (CSV) file when creating a
 * dataset from that file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CsvOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single character that specifies the delimiter being used in the CSV file.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * A variable that specifies whether the first row in the file is parsed as the header. If this value is false,
     * column names are auto-generated.
     * </p>
     */
    private Boolean headerRow;

    /**
     * <p>
     * A single character that specifies the delimiter being used in the CSV file.
     * </p>
     * 
     * @param delimiter
     *        A single character that specifies the delimiter being used in the CSV file.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A single character that specifies the delimiter being used in the CSV file.
     * </p>
     * 
     * @return A single character that specifies the delimiter being used in the CSV file.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * A single character that specifies the delimiter being used in the CSV file.
     * </p>
     * 
     * @param delimiter
     *        A single character that specifies the delimiter being used in the CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
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

    public CsvOptions withHeaderRow(Boolean headerRow) {
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
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

        if (obj instanceof CsvOptions == false)
            return false;
        CsvOptions other = (CsvOptions) obj;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
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

        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getHeaderRow() == null) ? 0 : getHeaderRow().hashCode());
        return hashCode;
    }

    @Override
    public CsvOptions clone() {
        try {
            return (CsvOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.CsvOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
