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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about how a source CSV data file should be analyzed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CsvFormatDescriptor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvFormatDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     */
    private String fileCompression;
    /**
     * <p>
     * The character set in which the source CSV file is written.
     * </p>
     */
    private String charset;
    /**
     * <p>
     * Whether or not the source CSV file contains a header.
     * </p>
     */
    private Boolean containsHeader;
    /**
     * <p>
     * The character used to delimit the source CSV file.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * A list of the source CSV file's headers, if any.
     * </p>
     */
    private java.util.List<String> headerList;
    /**
     * <p>
     * The character used as a quote character.
     * </p>
     */
    private String quoteSymbol;

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @see CSVFileCompression
     */

    public void setFileCompression(String fileCompression) {
        this.fileCompression = fileCompression;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @return The level of compression of the source CSV file.
     * @see CSVFileCompression
     */

    public String getFileCompression() {
        return this.fileCompression;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CSVFileCompression
     */

    public CsvFormatDescriptor withFileCompression(String fileCompression) {
        setFileCompression(fileCompression);
        return this;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CSVFileCompression
     */

    public CsvFormatDescriptor withFileCompression(CSVFileCompression fileCompression) {
        this.fileCompression = fileCompression.toString();
        return this;
    }

    /**
     * <p>
     * The character set in which the source CSV file is written.
     * </p>
     * 
     * @param charset
     *        The character set in which the source CSV file is written.
     */

    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The character set in which the source CSV file is written.
     * </p>
     * 
     * @return The character set in which the source CSV file is written.
     */

    public String getCharset() {
        return this.charset;
    }

    /**
     * <p>
     * The character set in which the source CSV file is written.
     * </p>
     * 
     * @param charset
     *        The character set in which the source CSV file is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withCharset(String charset) {
        setCharset(charset);
        return this;
    }

    /**
     * <p>
     * Whether or not the source CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Whether or not the source CSV file contains a header.
     */

    public void setContainsHeader(Boolean containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Whether or not the source CSV file contains a header.
     * </p>
     * 
     * @return Whether or not the source CSV file contains a header.
     */

    public Boolean getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Whether or not the source CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Whether or not the source CSV file contains a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withContainsHeader(Boolean containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * <p>
     * Whether or not the source CSV file contains a header.
     * </p>
     * 
     * @return Whether or not the source CSV file contains a header.
     */

    public Boolean isContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * The character used to delimit the source CSV file.
     * </p>
     * 
     * @param delimiter
     *        The character used to delimit the source CSV file.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The character used to delimit the source CSV file.
     * </p>
     * 
     * @return The character used to delimit the source CSV file.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The character used to delimit the source CSV file.
     * </p>
     * 
     * @param delimiter
     *        The character used to delimit the source CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * A list of the source CSV file's headers, if any.
     * </p>
     * 
     * @return A list of the source CSV file's headers, if any.
     */

    public java.util.List<String> getHeaderList() {
        return headerList;
    }

    /**
     * <p>
     * A list of the source CSV file's headers, if any.
     * </p>
     * 
     * @param headerList
     *        A list of the source CSV file's headers, if any.
     */

    public void setHeaderList(java.util.Collection<String> headerList) {
        if (headerList == null) {
            this.headerList = null;
            return;
        }

        this.headerList = new java.util.ArrayList<String>(headerList);
    }

    /**
     * <p>
     * A list of the source CSV file's headers, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderList(java.util.Collection)} or {@link #withHeaderList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param headerList
     *        A list of the source CSV file's headers, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withHeaderList(String... headerList) {
        if (this.headerList == null) {
            setHeaderList(new java.util.ArrayList<String>(headerList.length));
        }
        for (String ele : headerList) {
            this.headerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the source CSV file's headers, if any.
     * </p>
     * 
     * @param headerList
     *        A list of the source CSV file's headers, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withHeaderList(java.util.Collection<String> headerList) {
        setHeaderList(headerList);
        return this;
    }

    /**
     * <p>
     * The character used as a quote character.
     * </p>
     * 
     * @param quoteSymbol
     *        The character used as a quote character.
     */

    public void setQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    /**
     * <p>
     * The character used as a quote character.
     * </p>
     * 
     * @return The character used as a quote character.
     */

    public String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /**
     * <p>
     * The character used as a quote character.
     * </p>
     * 
     * @param quoteSymbol
     *        The character used as a quote character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvFormatDescriptor withQuoteSymbol(String quoteSymbol) {
        setQuoteSymbol(quoteSymbol);
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
        if (getFileCompression() != null)
            sb.append("FileCompression: ").append(getFileCompression()).append(",");
        if (getCharset() != null)
            sb.append("Charset: ").append(getCharset()).append(",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: ").append(getContainsHeader()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getHeaderList() != null)
            sb.append("HeaderList: ").append(getHeaderList()).append(",");
        if (getQuoteSymbol() != null)
            sb.append("QuoteSymbol: ").append(getQuoteSymbol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsvFormatDescriptor == false)
            return false;
        CsvFormatDescriptor other = (CsvFormatDescriptor) obj;
        if (other.getFileCompression() == null ^ this.getFileCompression() == null)
            return false;
        if (other.getFileCompression() != null && other.getFileCompression().equals(this.getFileCompression()) == false)
            return false;
        if (other.getCharset() == null ^ this.getCharset() == null)
            return false;
        if (other.getCharset() != null && other.getCharset().equals(this.getCharset()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getHeaderList() == null ^ this.getHeaderList() == null)
            return false;
        if (other.getHeaderList() != null && other.getHeaderList().equals(this.getHeaderList()) == false)
            return false;
        if (other.getQuoteSymbol() == null ^ this.getQuoteSymbol() == null)
            return false;
        if (other.getQuoteSymbol() != null && other.getQuoteSymbol().equals(this.getQuoteSymbol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileCompression() == null) ? 0 : getFileCompression().hashCode());
        hashCode = prime * hashCode + ((getCharset() == null) ? 0 : getCharset().hashCode());
        hashCode = prime * hashCode + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getHeaderList() == null) ? 0 : getHeaderList().hashCode());
        hashCode = prime * hashCode + ((getQuoteSymbol() == null) ? 0 : getQuoteSymbol().hashCode());
        return hashCode;
    }

    @Override
    public CsvFormatDescriptor clone() {
        try {
            return (CsvFormatDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.CsvFormatDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
