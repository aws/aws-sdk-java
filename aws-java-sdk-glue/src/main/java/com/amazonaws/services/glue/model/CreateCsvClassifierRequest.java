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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a custom CSV classifier for <code>CreateClassifier</code> to create.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCsvClassifierRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCsvClassifierRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. Must be different from the column
     * delimiter.
     * </p>
     */
    private String quoteSymbol;
    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     */
    private String containsHeader;
    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     */
    private java.util.List<String> header;
    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is true.
     * </p>
     */
    private Boolean disableValueTrimming;
    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     */
    private Boolean allowSingleColumn;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @return The name of the classifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @param delimiter
     *        A custom symbol to denote what separates each column entry in the row.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @return A custom symbol to denote what separates each column entry in the row.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @param delimiter
     *        A custom symbol to denote what separates each column entry in the row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. Must be different from the column
     * delimiter.
     * </p>
     * 
     * @param quoteSymbol
     *        A custom symbol to denote what combines content into a single column value. Must be different from the
     *        column delimiter.
     */

    public void setQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. Must be different from the column
     * delimiter.
     * </p>
     * 
     * @return A custom symbol to denote what combines content into a single column value. Must be different from the
     *         column delimiter.
     */

    public String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. Must be different from the column
     * delimiter.
     * </p>
     * 
     * @param quoteSymbol
     *        A custom symbol to denote what combines content into a single column value. Must be different from the
     *        column delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withQuoteSymbol(String quoteSymbol) {
        setQuoteSymbol(quoteSymbol);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @see CsvHeaderOption
     */

    public void setContainsHeader(String containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @return Indicates whether the CSV file contains a header.
     * @see CsvHeaderOption
     */

    public String getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CsvHeaderOption
     */

    public CreateCsvClassifierRequest withContainsHeader(String containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CsvHeaderOption
     */

    public CreateCsvClassifierRequest withContainsHeader(CsvHeaderOption containsHeader) {
        this.containsHeader = containsHeader.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @return A list of strings representing column names.
     */

    public java.util.List<String> getHeader() {
        return header;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     */

    public void setHeader(java.util.Collection<String> header) {
        if (header == null) {
            this.header = null;
            return;
        }

        this.header = new java.util.ArrayList<String>(header);
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeader(java.util.Collection)} or {@link #withHeader(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withHeader(String... header) {
        if (this.header == null) {
            setHeader(new java.util.ArrayList<String>(header.length));
        }
        for (String ele : header) {
            this.header.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withHeader(java.util.Collection<String> header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is true.
     * </p>
     * 
     * @param disableValueTrimming
     *        Specifies not to trim values before identifying the type of column values. The default value is true.
     */

    public void setDisableValueTrimming(Boolean disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is true.
     * </p>
     * 
     * @return Specifies not to trim values before identifying the type of column values. The default value is true.
     */

    public Boolean getDisableValueTrimming() {
        return this.disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is true.
     * </p>
     * 
     * @param disableValueTrimming
     *        Specifies not to trim values before identifying the type of column values. The default value is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withDisableValueTrimming(Boolean disableValueTrimming) {
        setDisableValueTrimming(disableValueTrimming);
        return this;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is true.
     * </p>
     * 
     * @return Specifies not to trim values before identifying the type of column values. The default value is true.
     */

    public Boolean isDisableValueTrimming() {
        return this.disableValueTrimming;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @param allowSingleColumn
     *        Enables the processing of files that contain only one column.
     */

    public void setAllowSingleColumn(Boolean allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @return Enables the processing of files that contain only one column.
     */

    public Boolean getAllowSingleColumn() {
        return this.allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @param allowSingleColumn
     *        Enables the processing of files that contain only one column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCsvClassifierRequest withAllowSingleColumn(Boolean allowSingleColumn) {
        setAllowSingleColumn(allowSingleColumn);
        return this;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @return Enables the processing of files that contain only one column.
     */

    public Boolean isAllowSingleColumn() {
        return this.allowSingleColumn;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getQuoteSymbol() != null)
            sb.append("QuoteSymbol: ").append(getQuoteSymbol()).append(",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: ").append(getContainsHeader()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getDisableValueTrimming() != null)
            sb.append("DisableValueTrimming: ").append(getDisableValueTrimming()).append(",");
        if (getAllowSingleColumn() != null)
            sb.append("AllowSingleColumn: ").append(getAllowSingleColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCsvClassifierRequest == false)
            return false;
        CreateCsvClassifierRequest other = (CreateCsvClassifierRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getQuoteSymbol() == null ^ this.getQuoteSymbol() == null)
            return false;
        if (other.getQuoteSymbol() != null && other.getQuoteSymbol().equals(this.getQuoteSymbol()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getDisableValueTrimming() == null ^ this.getDisableValueTrimming() == null)
            return false;
        if (other.getDisableValueTrimming() != null && other.getDisableValueTrimming().equals(this.getDisableValueTrimming()) == false)
            return false;
        if (other.getAllowSingleColumn() == null ^ this.getAllowSingleColumn() == null)
            return false;
        if (other.getAllowSingleColumn() != null && other.getAllowSingleColumn().equals(this.getAllowSingleColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getQuoteSymbol() == null) ? 0 : getQuoteSymbol().hashCode());
        hashCode = prime * hashCode + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getDisableValueTrimming() == null) ? 0 : getDisableValueTrimming().hashCode());
        hashCode = prime * hashCode + ((getAllowSingleColumn() == null) ? 0 : getAllowSingleColumn().hashCode());
        return hashCode;
    }

    @Override
    public CreateCsvClassifierRequest clone() {
        try {
            return (CreateCsvClassifierRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CreateCsvClassifierRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
