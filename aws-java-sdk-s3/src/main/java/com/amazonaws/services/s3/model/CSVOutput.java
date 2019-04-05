/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes how CSV-formatted results are formatted.
 */
public class CSVOutput implements Serializable, Cloneable {

    /**
     * Indicates whether or not all output fields should be quoted.
     */
    private String quoteFields;

    /**
     * Single character used for escaping the quote character inside an already escaped value.
     */
    private String quoteEscapeCharacter;

    /**
     * Value used to separate individual records.
     */
    private String recordDelimiter;

    /**
     * Value used to separate individual fields in a record.
     */
    private String fieldDelimiter;

    /**
     * Value used for escaping where the field delimiter is part of the value.
     */
    private String quoteCharacter;

    /**
     * @return The fields that indicates whether or not all output fields should be quoted.
     */
    public String getQuoteFields() {
        return quoteFields;
    }

    /**
     * Sets the quoted fields.
     *
     * @param quoteFields The new quoteFields value.
     */
    public void setQuoteFields(String quoteFields) {
        this.quoteFields = quoteFields;
    }

    /**
     * Sets the quoted fields.
     *
     * @param quoteFields The new quoteFields value.
     * @return This object for method chaining.
     */
    public CSVOutput withQuoteFields(String quoteFields) {
        setQuoteFields(quoteFields);
        return this;
    }

    /**
     * Sets the quoted fields.
     *
     * @param quoteFields The new quoteFields value.
     */
    public void setQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields == null ? null : quoteFields.toString());
    }

    /**
     * Sets the quoted fields.
     *
     * @param quoteFields The new quoteFields value.
     * @return This object for method chaining.
     */
    public CSVOutput withQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields);
        return this;
    }

    /**
     * @return Character used for escaping the quote character inside an already escaped value. If it was set with
     * {@link #setQuoteEscapeCharacter(String)}, this will return the first character in the string.
     * @see #getQuoteEscapeCharacterAsString() to retrieve the full value.
     */
    public Character getQuoteEscapeCharacter() {
        return stringToChar(quoteEscapeCharacter);
    }

    /**
     * @return Character used for escaping the quote character inside an already escaped value.
     */
    public String getQuoteEscapeCharacterAsString() {
        return quoteEscapeCharacter;
    }

    /**
     * Sets the character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter New quoteEscapeCharacter value
     */
    public void setQuoteEscapeCharacter(String quoteEscapeCharacter) {
        validateNotEmpty(quoteEscapeCharacter, "quoteEscapeCharacter");
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * Sets the character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter New quoteEscapeCharacter value
     */
    public CSVOutput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
        setQuoteEscapeCharacter(quoteEscapeCharacter);
        return this;
    }

    /**
     * Sets the character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter New quoteEscapeCharacter value
     */
    public void setQuoteEscapeCharacter(Character quoteEscapeCharacter) {
        setQuoteEscapeCharacter(charToString(quoteEscapeCharacter));
    }

    /**
     * Sets the single character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter The new quoteEscapeCharacter value.
     * @return This object for method chaining.
     */
    public CSVOutput withQuoteEscapeCharacter(Character quoteEscapeCharacter) {
        setQuoteEscapeCharacter(quoteEscapeCharacter);
        return this;
    }

    /**
     * @return The value used to separate individual records. If it was set with
     * {@link #setRecordDelimiter(String)}, this will return the first character in the string.
     * @see #getRecordDelimiterAsString() to retrieve the full value.
     */
    public Character getRecordDelimiter() {
        return stringToChar(recordDelimiter);
    }

    /**
     * @return The value used to separate individual records.
     */
    public String getRecordDelimiterAsString() {
        return recordDelimiter;
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter New recordDelimiter value
     */
    public void setRecordDelimiter(String recordDelimiter) {
        validateNotEmpty(recordDelimiter, "recordDelimiter");
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter New recordDelimiter value
     */
    public CSVOutput withRecordDelimiter(String recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter New recordDelimiter value
     */
    public void setRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(charToString(recordDelimiter));
    }

    /**
     * Sets the value used to separate individual records.
     *
     * @param recordDelimiter The new recordDelimiter value.
     * @return This object for method chaining.
     */
    public CSVOutput withRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * @return The value used to separate individual fields in a record. If it was set with
     * {@link #setFieldDelimiter(String)}, this will return the first character in the string.
     * @see #getFieldDelimiterAsString() to retrieve the full value.
     */
    public Character getFieldDelimiter() {
        return stringToChar(fieldDelimiter);
    }

    /**
     * @return The value used to separate individual fields in a record.
     */
    public String getFieldDelimiterAsString() {
        return fieldDelimiter;
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter The new fieldDelimiter value.
     */
    public void setFieldDelimiter(String fieldDelimiter) {
        validateNotEmpty(fieldDelimiter, "fieldDelimiter");
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter The new fieldDelimiter value.
     * @return This object for method chaining.
     */
    public CSVOutput withFieldDelimiter(String fieldDelimiter) {
        setFieldDelimiter(fieldDelimiter);
        return this;
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter New fieldDelimiter value
     */
    public void setFieldDelimiter(Character fieldDelimiter) {
        setFieldDelimiter(charToString(fieldDelimiter));
    }

    /**
     * Sets the value used to separate individual fields in a record.
     *
     * @param fieldDelimiter The new fieldDelimiter value.
     * @return This object for method chaining.
     */
    public CSVOutput withFieldDelimiter(Character fieldDelimiter) {
        setFieldDelimiter(fieldDelimiter);
        return this;
    }

    /**
     * @return The value used for escaping where the field delimiter is part of the value. If it was set with
     * {@link #setQuoteCharacter(String)}, this will return the first character in the string.
     * @see #getQuoteCharacterAsString() to retrieve the full value.
     */
    public Character getQuoteCharacter() {
        return stringToChar(quoteCharacter);
    }

    /**
     * @return The value used for escaping where the field delimiter is part of the value.
     */
    public String getQuoteCharacterAsString() {
        return quoteCharacter;
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter New quoteCharacter value
     */
    public void setQuoteCharacter(String quoteCharacter) {
        validateNotEmpty(quoteCharacter, "quoteCharacter");
        this.quoteCharacter = quoteCharacter;
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter New quoteCharacter value
     */
    public CSVOutput withQuoteCharacter(String quoteCharacter) {
        setQuoteCharacter(quoteCharacter);
        return this;
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter New quoteCharacter value
     */
    public void setQuoteCharacter(Character quoteCharacter) {
        setQuoteCharacter(charToString(quoteCharacter));
    }

    /**
     * Sets the value used for escaping where the field delimiter is part of the value.
     *
     * @param quoteCharacter The new quoteCharacter value.
     * @return This object for method chaining.
     */
    public CSVOutput withQuoteCharacter(Character quoteCharacter) {
        setQuoteCharacter(quoteCharacter);
        return this;
    }

    private String charToString(Character character) {
        return character == null ? null : character.toString();
    }

    private Character stringToChar(String string) {
        // Should not be empty string (setters should call validateNotEmpty)
        return string == null ? null : string.charAt(0);
    }

    private void validateNotEmpty(String value, String valueName) {
        if ("".equals(value)) {
            // Prevent the empty string from being used. We convert the recordDelimiter to a Character in getRecordDelimiter,
            // and the empty string doesn't have a valid Character representation. It's never a valid input anyway.
            throw new IllegalArgumentException(valueName + " must not be empty-string.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQuoteFields() != null)
            sb.append("QuoteFields: ").append(getQuoteFields()).append(",");
        if (getQuoteEscapeCharacter() != null)
            sb.append("QuoteEscapeCharacter: ").append(getQuoteEscapeCharacterAsString()).append(",");
        if (getRecordDelimiter() != null)
            sb.append("RecordDelimiter: ").append(getRecordDelimiterAsString()).append(",");
        if (getFieldDelimiter() != null)
            sb.append("FieldDelimiter: ").append(getFieldDelimiterAsString()).append(",");
        if (getQuoteCharacter() != null)
            sb.append("QuoteCharacter: ").append(getQuoteCharacterAsString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof CSVOutput)) {
            return false;
        }

        final CSVOutput other = (CSVOutput) obj;

        if (other.getQuoteEscapeCharacterAsString() == null ^ this.getQuoteEscapeCharacterAsString() == null)
            return false;
        if (other.getQuoteEscapeCharacterAsString() != null && !other.getQuoteEscapeCharacterAsString().equals(this.getQuoteEscapeCharacterAsString()))
            return false;
        if (other.getQuoteFields() == null ^ this.getQuoteFields() == null)
            return false;
        if (other.getQuoteFields() != null && !other.getQuoteFields().equals(this.getQuoteFields()))
            return false;
        if (other.getRecordDelimiterAsString() == null ^ this.getRecordDelimiterAsString() == null)
            return false;
        if (other.getRecordDelimiterAsString() != null && !other.getRecordDelimiterAsString().equals(this.getRecordDelimiterAsString()))
            return false;
        if (other.getFieldDelimiterAsString() == null ^ this.getFieldDelimiterAsString() == null)
            return false;
        if (other.getFieldDelimiterAsString() != null && !other.getFieldDelimiterAsString().equals(this.getFieldDelimiterAsString()))
            return false;
        if (other.getQuoteCharacterAsString() == null ^ this.getQuoteCharacterAsString() == null)
            return false;
        if (other.getQuoteCharacterAsString() != null && !other.getQuoteCharacterAsString().equals(this.getQuoteCharacterAsString()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuoteFields() == null) ? 0 : getQuoteFields().hashCode());
        hashCode = prime * hashCode + ((getQuoteEscapeCharacterAsString() == null) ? 0 : getQuoteEscapeCharacterAsString().hashCode());
        hashCode = prime * hashCode + ((getRecordDelimiterAsString() == null) ? 0 : getRecordDelimiterAsString().hashCode());
        hashCode = prime * hashCode + ((getFieldDelimiterAsString() == null) ? 0 : getFieldDelimiterAsString().hashCode());
        hashCode = prime * hashCode + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0);
        return hashCode;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
