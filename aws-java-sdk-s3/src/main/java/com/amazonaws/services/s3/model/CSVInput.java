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
     *
     * This was originally a Character, so the getter ({@link #getComments()}) returns the first character of the string.
     * The full string is retrieved with {@link #getCommentsAsString()}. To prevent issues in the string-to-character
     * conversion, the empty string is prohibited by {@link #setComments(String)}.
     */
    private String comments;

    /**
     * Single character used for escaping the quote character inside an already escaped value.
     *
     * This was originally a Character, so the getter ({@link #getQuoteEscapeCharacter()}) returns the first character of the string.
     * The full string is retrieved with {@link #getQuoteEscapeCharacterAsString()}. To prevent issues in the string-to-character
     * conversion, the empty string is prohibited by {@link #setQuoteEscapeCharacter(String)}.
     */
    private String quoteEscapeCharacter;

    /**
     * Value used to separate individual records.
     *
     * This was originally a Character, so the getter ({@link #getRecordDelimiter()}) returns the first character of the string.
     * The full string is retrieved with {@link #getRecordDelimiterAsString()}. To prevent issues in the string-to-character
     * conversion, the empty string is prohibited by {@link #setRecordDelimiter(String)}.
     */
    private String recordDelimiter;

    /**
     * Value used to separate individual fields in a record.
     *
     * This was originally a Character, so the getter ({@link #getFieldDelimiter()}) returns the first character of the string.
     * The full string is retrieved with {@link #getFieldDelimiterAsString()}. To prevent issues in the string-to-character
     * conversion, the empty string is prohibited by {@link #setFieldDelimiter(String)}.
     */
    private String fieldDelimiter;

    /**
     * Value used for escaping where the field delimiter is part of the value.
     *
     * This was originally a Character, so the getter ({@link #getQuoteCharacter()}) returns the first character of the string.
     * The full string is retrieved with {@link #getQuoteCharacterAsString()}. To prevent issues in the string-to-character
     * conversion, the empty string is prohibited by {@link #setQuoteCharacter(String)}.
     */
    private String quoteCharacter;

    /**
     * Value used to allow quoted record delimiters to occur within the input.
     */
    private Boolean allowQuotedRecordDelimiter;

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
     * Sets the first line of input. Valid values: None, Ignore, Use.
     *
     * @param fileHeaderInfo New file header info value
     */
    public void setFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo == null ? null : fileHeaderInfo.toString());
    }

    /**
     * Sets the fileHeaderInfo
     *
     * @param fileHeaderInfo The new fileHeaderInfo value.
     * @return This object for method chaining.
     */
    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo);
        return this;
    }

    /**
     * @return Character used to indicate a row should be ignored when present at the start of a row.  If it was set with
     * {@link #setComments(String)}, this will return the first character in the string.
     * @see #getCommentsAsString() to retrieve the full value.
     */
    public Character getComments() {
        return stringToChar(comments);
    }

    /**
     * @return Character used to indicate a row should be ignored when present at the start of a row.
     */
    public String getCommentsAsString() {
        return comments;
    }

    /**
     * Sets the character used to indicate a row should be ignored when present at the start of a row.
     *
     * @param comments New comments value
     */
    public void setComments(String comments) {
        validateNotEmpty(comments, "comments");
        this.comments = comments;
    }

    /**
     * Sets the character used to indicate a row should be ignored when present at the start of a row.
     *
     * @param comments The new comments value.
     * @return This object for method chaining.
     */
    public CSVInput withComments(String comments) {
        setComments(comments);
        return this;
    }

    /**
     * Sets the character used to indicate a row should be ignored when present at the start of a row.
     *
     * @param comments New comments value
     */
    public void setComments(Character comments) {
        setComments(charToString(comments));
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
     * @return Character used for escaping the quote character inside an already escaped value.  If it was set with
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
     * @param quoteEscapeCharacter The new quoteEscapeCharacter value.
     * @return This object for method chaining.
     */
    public CSVInput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
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
     * Sets the character used for escaping the quote character inside an already escaped value.
     *
     * @param quoteEscapeCharacter The new quoteEscapeCharacter value.
     * @return This object for method chaining.
     */
    public CSVInput withQuoteEscapeCharacter(Character quoteEscapeCharacter) {
        setQuoteEscapeCharacter(quoteEscapeCharacter);
        return this;
    }

    /**
     * @return The value used to separate individual records as a character. If it was set with {@link #setRecordDelimiter(String)},
     * this will return the first character in the string.
     * @see #getRecordDelimiterAsString() to retrieve the value.
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
     * @param recordDelimiter The new recordDelimiter value.
     * @return This object for method chaining.
     */
    public CSVInput withRecordDelimiter(String recordDelimiter) {
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
    public CSVInput withRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * @return The value used to separate individual fields in a record. If it was set with {@link #setFieldDelimiter(String)},
     * this will return the first character in the string.
     * @see #getFieldDelimiterAsString() to retrieve the value.
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
     * @param fieldDelimiter New fieldDelimiter value
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
    public CSVInput withFieldDelimiter(String fieldDelimiter) {
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
    public CSVInput withFieldDelimiter(Character fieldDelimiter) {
        setFieldDelimiter(fieldDelimiter);
        return this;
    }

    /**
     * @return The value used for escaping where the field delimiter is part of the value. If it was set with
     * {@link #setQuoteCharacter(String)}, this will return the first character in the string.
     * @see #getQuoteCharacterAsString() to retrieve the value.
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
     * @param quoteCharacter The new quoteCharacter value.
     * @return This object for method chaining.
     */
    public CSVInput withQuoteCharacter(String quoteCharacter) {
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
    public CSVInput withQuoteCharacter(Character quoteCharacter) {
        setQuoteCharacter(quoteCharacter);
        return this;
    }

    /**
     * @return The value used to allow quoted record delimiters to occur within the input.
     */
    public Boolean getAllowQuotedRecordDelimiter() {
        return allowQuotedRecordDelimiter;
    }

    /**
     * Sets the value used to allow quoted record delimiters to occur within the input.
     *
     * @param allowQuotedRecordDelimiter New allowQuotedRecordDelimiter value.
     */
    public void setAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
        this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
    }

    /**
     * Sets the value used to allow quoted record delimiters to occur within the input.
     *
     * @param allowQuotedRecordDelimiter New allowQuotedRecordDelimiter value.
     * @return This object for method chaining.
     */
    public CSVInput withAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
        setAllowQuotedRecordDelimiter(allowQuotedRecordDelimiter);
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
        if (other.getQuoteEscapeCharacterAsString() == null ^ this.getQuoteEscapeCharacterAsString() == null)
            return false;
        if (other.getQuoteEscapeCharacterAsString() != null && !other.getQuoteEscapeCharacterAsString().equals(this.getQuoteEscapeCharacterAsString()))
            return false;
        if (other.getCommentsAsString() == null ^ this.getCommentsAsString() == null)
            return false;
        if (other.getCommentsAsString() != null && !other.getCommentsAsString().equals(this.getCommentsAsString()))
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
        if (other.getAllowQuotedRecordDelimiter() != null && !other.getAllowQuotedRecordDelimiter().equals(this.getAllowQuotedRecordDelimiter()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileHeaderInfo() == null) ? 0 : getFileHeaderInfo().hashCode());
        hashCode = prime * hashCode + ((getCommentsAsString() == null) ? 0 : getCommentsAsString().hashCode());
        hashCode = prime * hashCode + ((getQuoteEscapeCharacterAsString() == null) ? 0 : getQuoteEscapeCharacterAsString().hashCode());
        hashCode = prime * hashCode + ((getRecordDelimiterAsString() == null) ? 0 : getRecordDelimiterAsString().hashCode());
        hashCode = prime * hashCode + ((getFieldDelimiterAsString() == null) ? 0 : getFieldDelimiterAsString().hashCode());
        hashCode = prime * hashCode + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0);
        hashCode = prime * hashCode + ((getAllowQuotedRecordDelimiter() == null) ? 0 : getAllowQuotedRecordDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFileHeaderInfo() != null)
            sb.append("FileHeaderInfo: ").append(getFileHeaderInfo()).append(",");
        if (getCommentsAsString() != null)
            sb.append("Comments: ").append(getCommentsAsString()).append(",");
        if (getQuoteEscapeCharacterAsString() != null)
            sb.append("QuoteEscapeCharacter: ").append(getQuoteEscapeCharacterAsString()).append(",");
        if (getRecordDelimiterAsString() != null)
            sb.append("RecordDelimiter: ").append(getRecordDelimiterAsString()).append(",");
        if (getFieldDelimiterAsString() != null)
            sb.append("FieldDelimiter: ").append(getFieldDelimiterAsString()).append(",");
        if (getQuoteCharacterAsString() != null)
            sb.append("QuoteCharacter: ").append(getQuoteCharacterAsString());
        if (getAllowQuotedRecordDelimiter() != null)
            sb.append("AllowQuotedRecordDelimiter: ").append(getAllowQuotedRecordDelimiter());
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
