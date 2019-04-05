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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the comma-separated value (CSV) file to select from.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CSVInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.
     * </p>
     */
    private String fileHeaderInfo;
    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the character is present at the start of
     * that row.
     * </p>
     */
    private String comments;
    /**
     * <p>
     * A single character used for escaping the quotation-mark character inside an already escaped value.
     * </p>
     */
    private String quoteEscapeCharacter;
    /**
     * <p>
     * A value used to separate individual records from each other.
     * </p>
     */
    private String recordDelimiter;
    /**
     * <p>
     * A value used to separate individual fields from each other within a record.
     * </p>
     */
    private String fieldDelimiter;
    /**
     * <p>
     * A value used as an escape character where the field delimiter is part of the value.
     * </p>
     */
    private String quoteCharacter;

    /**
     * <p>
     * Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.
     * </p>
     * 
     * @param fileHeaderInfo
     *        Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and
     *        <code>Use</code>.
     * @see FileHeaderInfo
     */

    public void setFileHeaderInfo(String fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.
     * </p>
     * 
     * @return Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and
     *         <code>Use</code>.
     * @see FileHeaderInfo
     */

    public String getFileHeaderInfo() {
        return this.fileHeaderInfo;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.
     * </p>
     * 
     * @param fileHeaderInfo
     *        Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and
     *        <code>Use</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileHeaderInfo
     */

    public CSVInput withFileHeaderInfo(String fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo);
        return this;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.
     * </p>
     * 
     * @param fileHeaderInfo
     *        Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and
     *        <code>Use</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileHeaderInfo
     */

    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo.toString();
        return this;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the character is present at the start of
     * that row.
     * </p>
     * 
     * @param comments
     *        A single character used to indicate that a row should be ignored when the character is present at the
     *        start of that row.
     */

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the character is present at the start of
     * that row.
     * </p>
     * 
     * @return A single character used to indicate that a row should be ignored when the character is present at the
     *         start of that row.
     */

    public String getComments() {
        return this.comments;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the character is present at the start of
     * that row.
     * </p>
     * 
     * @param comments
     *        A single character used to indicate that a row should be ignored when the character is present at the
     *        start of that row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVInput withComments(String comments) {
        setComments(comments);
        return this;
    }

    /**
     * <p>
     * A single character used for escaping the quotation-mark character inside an already escaped value.
     * </p>
     * 
     * @param quoteEscapeCharacter
     *        A single character used for escaping the quotation-mark character inside an already escaped value.
     */

    public void setQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used for escaping the quotation-mark character inside an already escaped value.
     * </p>
     * 
     * @return A single character used for escaping the quotation-mark character inside an already escaped value.
     */

    public String getQuoteEscapeCharacter() {
        return this.quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used for escaping the quotation-mark character inside an already escaped value.
     * </p>
     * 
     * @param quoteEscapeCharacter
     *        A single character used for escaping the quotation-mark character inside an already escaped value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVInput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
        setQuoteEscapeCharacter(quoteEscapeCharacter);
        return this;
    }

    /**
     * <p>
     * A value used to separate individual records from each other.
     * </p>
     * 
     * @param recordDelimiter
     *        A value used to separate individual records from each other.
     */

    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * <p>
     * A value used to separate individual records from each other.
     * </p>
     * 
     * @return A value used to separate individual records from each other.
     */

    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

    /**
     * <p>
     * A value used to separate individual records from each other.
     * </p>
     * 
     * @param recordDelimiter
     *        A value used to separate individual records from each other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVInput withRecordDelimiter(String recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * <p>
     * A value used to separate individual fields from each other within a record.
     * </p>
     * 
     * @param fieldDelimiter
     *        A value used to separate individual fields from each other within a record.
     */

    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * <p>
     * A value used to separate individual fields from each other within a record.
     * </p>
     * 
     * @return A value used to separate individual fields from each other within a record.
     */

    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * <p>
     * A value used to separate individual fields from each other within a record.
     * </p>
     * 
     * @param fieldDelimiter
     *        A value used to separate individual fields from each other within a record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVInput withFieldDelimiter(String fieldDelimiter) {
        setFieldDelimiter(fieldDelimiter);
        return this;
    }

    /**
     * <p>
     * A value used as an escape character where the field delimiter is part of the value.
     * </p>
     * 
     * @param quoteCharacter
     *        A value used as an escape character where the field delimiter is part of the value.
     */

    public void setQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
    }

    /**
     * <p>
     * A value used as an escape character where the field delimiter is part of the value.
     * </p>
     * 
     * @return A value used as an escape character where the field delimiter is part of the value.
     */

    public String getQuoteCharacter() {
        return this.quoteCharacter;
    }

    /**
     * <p>
     * A value used as an escape character where the field delimiter is part of the value.
     * </p>
     * 
     * @param quoteCharacter
     *        A value used as an escape character where the field delimiter is part of the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVInput withQuoteCharacter(String quoteCharacter) {
        setQuoteCharacter(quoteCharacter);
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
        if (getFileHeaderInfo() != null)
            sb.append("FileHeaderInfo: ").append(getFileHeaderInfo()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments()).append(",");
        if (getQuoteEscapeCharacter() != null)
            sb.append("QuoteEscapeCharacter: ").append(getQuoteEscapeCharacter()).append(",");
        if (getRecordDelimiter() != null)
            sb.append("RecordDelimiter: ").append(getRecordDelimiter()).append(",");
        if (getFieldDelimiter() != null)
            sb.append("FieldDelimiter: ").append(getFieldDelimiter()).append(",");
        if (getQuoteCharacter() != null)
            sb.append("QuoteCharacter: ").append(getQuoteCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CSVInput == false)
            return false;
        CSVInput other = (CSVInput) obj;
        if (other.getFileHeaderInfo() == null ^ this.getFileHeaderInfo() == null)
            return false;
        if (other.getFileHeaderInfo() != null && other.getFileHeaderInfo().equals(this.getFileHeaderInfo()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        if (other.getQuoteEscapeCharacter() == null ^ this.getQuoteEscapeCharacter() == null)
            return false;
        if (other.getQuoteEscapeCharacter() != null && other.getQuoteEscapeCharacter().equals(this.getQuoteEscapeCharacter()) == false)
            return false;
        if (other.getRecordDelimiter() == null ^ this.getRecordDelimiter() == null)
            return false;
        if (other.getRecordDelimiter() != null && other.getRecordDelimiter().equals(this.getRecordDelimiter()) == false)
            return false;
        if (other.getFieldDelimiter() == null ^ this.getFieldDelimiter() == null)
            return false;
        if (other.getFieldDelimiter() != null && other.getFieldDelimiter().equals(this.getFieldDelimiter()) == false)
            return false;
        if (other.getQuoteCharacter() == null ^ this.getQuoteCharacter() == null)
            return false;
        if (other.getQuoteCharacter() != null && other.getQuoteCharacter().equals(this.getQuoteCharacter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileHeaderInfo() == null) ? 0 : getFileHeaderInfo().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode + ((getQuoteEscapeCharacter() == null) ? 0 : getQuoteEscapeCharacter().hashCode());
        hashCode = prime * hashCode + ((getRecordDelimiter() == null) ? 0 : getRecordDelimiter().hashCode());
        hashCode = prime * hashCode + ((getFieldDelimiter() == null) ? 0 : getFieldDelimiter().hashCode());
        hashCode = prime * hashCode + ((getQuoteCharacter() == null) ? 0 : getQuoteCharacter().hashCode());
        return hashCode;
    }

    @Override
    public CSVInput clone() {
        try {
            return (CSVInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.CSVInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
