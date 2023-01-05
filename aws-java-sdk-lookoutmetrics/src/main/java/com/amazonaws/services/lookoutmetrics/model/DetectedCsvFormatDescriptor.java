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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of an inferred CSV format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectedCsvFormatDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedCsvFormatDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format's file compression.
     * </p>
     */
    private DetectedField fileCompression;
    /**
     * <p>
     * The format's charset.
     * </p>
     */
    private DetectedField charset;
    /**
     * <p>
     * Whether the format includes a header.
     * </p>
     */
    private DetectedField containsHeader;
    /**
     * <p>
     * The format's delimiter.
     * </p>
     */
    private DetectedField delimiter;
    /**
     * <p>
     * The format's header list.
     * </p>
     */
    private DetectedField headerList;
    /**
     * <p>
     * The format's quote symbol.
     * </p>
     */
    private DetectedField quoteSymbol;

    /**
     * <p>
     * The format's file compression.
     * </p>
     * 
     * @param fileCompression
     *        The format's file compression.
     */

    public void setFileCompression(DetectedField fileCompression) {
        this.fileCompression = fileCompression;
    }

    /**
     * <p>
     * The format's file compression.
     * </p>
     * 
     * @return The format's file compression.
     */

    public DetectedField getFileCompression() {
        return this.fileCompression;
    }

    /**
     * <p>
     * The format's file compression.
     * </p>
     * 
     * @param fileCompression
     *        The format's file compression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withFileCompression(DetectedField fileCompression) {
        setFileCompression(fileCompression);
        return this;
    }

    /**
     * <p>
     * The format's charset.
     * </p>
     * 
     * @param charset
     *        The format's charset.
     */

    public void setCharset(DetectedField charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The format's charset.
     * </p>
     * 
     * @return The format's charset.
     */

    public DetectedField getCharset() {
        return this.charset;
    }

    /**
     * <p>
     * The format's charset.
     * </p>
     * 
     * @param charset
     *        The format's charset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withCharset(DetectedField charset) {
        setCharset(charset);
        return this;
    }

    /**
     * <p>
     * Whether the format includes a header.
     * </p>
     * 
     * @param containsHeader
     *        Whether the format includes a header.
     */

    public void setContainsHeader(DetectedField containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Whether the format includes a header.
     * </p>
     * 
     * @return Whether the format includes a header.
     */

    public DetectedField getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Whether the format includes a header.
     * </p>
     * 
     * @param containsHeader
     *        Whether the format includes a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withContainsHeader(DetectedField containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * <p>
     * The format's delimiter.
     * </p>
     * 
     * @param delimiter
     *        The format's delimiter.
     */

    public void setDelimiter(DetectedField delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The format's delimiter.
     * </p>
     * 
     * @return The format's delimiter.
     */

    public DetectedField getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The format's delimiter.
     * </p>
     * 
     * @param delimiter
     *        The format's delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withDelimiter(DetectedField delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * The format's header list.
     * </p>
     * 
     * @param headerList
     *        The format's header list.
     */

    public void setHeaderList(DetectedField headerList) {
        this.headerList = headerList;
    }

    /**
     * <p>
     * The format's header list.
     * </p>
     * 
     * @return The format's header list.
     */

    public DetectedField getHeaderList() {
        return this.headerList;
    }

    /**
     * <p>
     * The format's header list.
     * </p>
     * 
     * @param headerList
     *        The format's header list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withHeaderList(DetectedField headerList) {
        setHeaderList(headerList);
        return this;
    }

    /**
     * <p>
     * The format's quote symbol.
     * </p>
     * 
     * @param quoteSymbol
     *        The format's quote symbol.
     */

    public void setQuoteSymbol(DetectedField quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    /**
     * <p>
     * The format's quote symbol.
     * </p>
     * 
     * @return The format's quote symbol.
     */

    public DetectedField getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /**
     * <p>
     * The format's quote symbol.
     * </p>
     * 
     * @param quoteSymbol
     *        The format's quote symbol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedCsvFormatDescriptor withQuoteSymbol(DetectedField quoteSymbol) {
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

        if (obj instanceof DetectedCsvFormatDescriptor == false)
            return false;
        DetectedCsvFormatDescriptor other = (DetectedCsvFormatDescriptor) obj;
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
    public DetectedCsvFormatDescriptor clone() {
        try {
            return (DetectedCsvFormatDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DetectedCsvFormatDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
