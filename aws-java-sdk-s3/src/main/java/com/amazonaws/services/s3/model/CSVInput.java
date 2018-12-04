/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Describes how a CSV-formatted input object is formatted.
 *
 *  @see InputSerialization
 */
public class CSVInput implements Serializable, Cloneable {

    /**
     * Describes the first line of input. Valid values: None, Ignore, Use.
     */
    private String fileHeaderInfo;

    /**
     * Single character used to indicate a row should be ignored when present at the start of a row.
     */
    private Character comments;

    /**
     * Single character used for escaping the quote character inside an already escaped value.
     */
    private Character quoteEscapeCharacter;

    /**
     * Value used to separate individual records.
     */
    private Character recordDelimiter;

    /**
     * Value used to separate individual fields in a record.
     */
    private Character fieldDelimiter;

    /**
     * Value used for escaping where the field delimiter is part of the value.
     */
    private Character quoteCharacter;

    /**
     * @return the first line of input. Valid values: None, Ignore, Use.
     */
    public String getFileHeaderInfo() {
        return fileHeaderInfo;
    }

    /**
     * Sets the first line of input. Valid values: None, Ignore, Use.
     *
     * @param fileHeaderInfo New file header info value
     */
    public void setFileHeaderInfo(String fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo;
    }

    /**
     * Sets the fileHeaderInfo
     *
     * @param fileHeaderInfo The new fileHeaderInfo value.
     * @return This object for method chaining.
     */
    public CSVInput withFileHeaderInfo(String fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo);
        return this;
    }

    /**
     * Sets the fileHeaderInfo
     *
     * @param fileHeaderInfo The new fileHeaderInfo value.
     * @return This object for method chaining.
     */
    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo == null? null : fileHeaderInfo.toString());
        return this;
    }

    /**
     * @return Single character used to indicate a row should be ignored when present at the start of a row.
     */
    public Character getComments() {
        return comments;
    }

    /**
     * Sets the Single character used to indicate a row should be ignored when present at the start of a row.
     *
     * @param comments New comments value
     */
    public void setComments(Character comments) {
        this.comments = comments;
    }

    /**
     * Sets the Single character used to indicate a row should be ignored when present at the start of a row.
     *
     * @param comments The new comments value.
     * @return This object for method chaining.
     */
    public CSVInput withComments(Character comments) {
        setComments(comments);
        return this;
    }

    /**
     * @return Single character used for escaping the quote character inside an already escaped value.
     */
    public Character getQuoteEscapeCharacter() {
        return quoteEscapeCharacter;
    }

    /**
     * Sets the single character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter New quoteEscapeCharacter value
     */
    public void setQuoteEscapeCharacter(Character quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * Sets the single character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter The new quoteEscapeCharacter value.
     * @return This object for method chaining.
     */
    public CSVInput withQuoteEscapeCharacter(Character quoteEscapeCharacter) {
        setQuoteEscapeCharacter(quoteEscapeCharacter);
        return this;
    }

    /**
     * @return The value used to separate individual records.
     */
    public Character getRecordDelimiter() {
        return recordDelimiter;
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter New recordDelimiter value
     */
    public void setRecordDelimiter(Character recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter The new recordDelimiter value.
     * @return This object for method chaining.
     */
    public CSVInput withRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * @return The value used to separate individual fields in a record.
     */
    public Character getFieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter New fieldDelimiter value
     */
    public void setFieldDelimiter(Character fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter The new fieldDelimiter value.
     * @return This object for method chaining.
     */
    public CSVInput withFieldDelimiter(Character fieldDelimiter) {
        setFieldDelimiter(fieldDelimiter);
        return this;
    }

    /**
     * @return The value used for escaping where the field delimiter is part of the value.
     */
    public Character getQuoteCharacter() {
        return quoteCharacter;
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter New quoteCharacter value
     */
    public void setQuoteCharacter(Character quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter The new quoteCharacter value.
     * @return This object for method chaining.
     */
    public CSVInput withQuoteCharacter(Character quoteCharacter) {
        setQuoteCharacter(quoteCharacter);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof CSVInput)) {
            return false;
        }

        final CSVInput other = (CSVInput) obj;

        if (other.getFileHeaderInfo() == null ^ this.getFileHeaderInfo() == null)
            return false;
        if (other.getFileHeaderInfo() != null && !other.getFileHeaderInfo().equals(this.getFileHeaderInfo()))
            return false;
        if (other.getQuoteEscapeCharacter() == null ^ this.getQuoteEscapeCharacter() == null)
            return false;
        if (other.getQuoteEscapeCharacter() != null && !other.getQuoteEscapeCharacter().equals(this.getQuoteEscapeCharacter()))
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && !other.getComments().equals(this.getComments()))
            return false;
        if (other.getRecordDelimiter() == null ^ this.getRecordDelimiter() == null)
            return false;
        if (other.getRecordDelimiter() != null && !other.getRecordDelimiter().equals(this.getRecordDelimiter()))
            return false;
        if (other.getFieldDelimiter() == null ^ this.getFieldDelimiter() == null)
            return false;
        if (other.getFieldDelimiter() != null && !other.getFieldDelimiter().equals(this.getFieldDelimiter()))
            return false;
        if (other.getQuoteCharacter() == null ^ this.getQuoteCharacter() == null)
            return false;
        if (other.getQuoteCharacter() != null && !other.getQuoteCharacter().equals(this.getQuoteCharacter()))
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
        hashCode = prime * hashCode + (getQuoteCharacter() != null ? getQuoteCharacter().hashCode() : 0);
        return hashCode;
    }

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
    public CSVInput clone() {
        try {
            return (CSVInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
