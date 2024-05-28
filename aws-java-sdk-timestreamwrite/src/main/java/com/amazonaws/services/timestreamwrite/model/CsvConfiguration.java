/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A delimited data format where the column separator can be a comma and the record separator is a newline character.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CsvConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     * </p>
     */
    private String columnSeparator;
    /**
     * <p>
     * Escape character can be one of
     * </p>
     */
    private String escapeChar;
    /**
     * <p>
     * Can be single quote (') or double quote (").
     * </p>
     */
    private String quoteChar;
    /**
     * <p>
     * Can be blank space (' ').
     * </p>
     */
    private String nullValue;
    /**
     * <p>
     * Specifies to trim leading and trailing white space.
     * </p>
     */
    private Boolean trimWhiteSpace;

    /**
     * <p>
     * Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     * </p>
     * 
     * @param columnSeparator
     *        Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     */

    public void setColumnSeparator(String columnSeparator) {
        this.columnSeparator = columnSeparator;
    }

    /**
     * <p>
     * Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     * </p>
     * 
     * @return Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     */

    public String getColumnSeparator() {
        return this.columnSeparator;
    }

    /**
     * <p>
     * Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     * </p>
     * 
     * @param columnSeparator
     *        Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' ').
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvConfiguration withColumnSeparator(String columnSeparator) {
        setColumnSeparator(columnSeparator);
        return this;
    }

    /**
     * <p>
     * Escape character can be one of
     * </p>
     * 
     * @param escapeChar
     *        Escape character can be one of
     */

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    /**
     * <p>
     * Escape character can be one of
     * </p>
     * 
     * @return Escape character can be one of
     */

    public String getEscapeChar() {
        return this.escapeChar;
    }

    /**
     * <p>
     * Escape character can be one of
     * </p>
     * 
     * @param escapeChar
     *        Escape character can be one of
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvConfiguration withEscapeChar(String escapeChar) {
        setEscapeChar(escapeChar);
        return this;
    }

    /**
     * <p>
     * Can be single quote (') or double quote (").
     * </p>
     * 
     * @param quoteChar
     *        Can be single quote (') or double quote (").
     */

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    /**
     * <p>
     * Can be single quote (') or double quote (").
     * </p>
     * 
     * @return Can be single quote (') or double quote (").
     */

    public String getQuoteChar() {
        return this.quoteChar;
    }

    /**
     * <p>
     * Can be single quote (') or double quote (").
     * </p>
     * 
     * @param quoteChar
     *        Can be single quote (') or double quote (").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvConfiguration withQuoteChar(String quoteChar) {
        setQuoteChar(quoteChar);
        return this;
    }

    /**
     * <p>
     * Can be blank space (' ').
     * </p>
     * 
     * @param nullValue
     *        Can be blank space (' ').
     */

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    /**
     * <p>
     * Can be blank space (' ').
     * </p>
     * 
     * @return Can be blank space (' ').
     */

    public String getNullValue() {
        return this.nullValue;
    }

    /**
     * <p>
     * Can be blank space (' ').
     * </p>
     * 
     * @param nullValue
     *        Can be blank space (' ').
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvConfiguration withNullValue(String nullValue) {
        setNullValue(nullValue);
        return this;
    }

    /**
     * <p>
     * Specifies to trim leading and trailing white space.
     * </p>
     * 
     * @param trimWhiteSpace
     *        Specifies to trim leading and trailing white space.
     */

    public void setTrimWhiteSpace(Boolean trimWhiteSpace) {
        this.trimWhiteSpace = trimWhiteSpace;
    }

    /**
     * <p>
     * Specifies to trim leading and trailing white space.
     * </p>
     * 
     * @return Specifies to trim leading and trailing white space.
     */

    public Boolean getTrimWhiteSpace() {
        return this.trimWhiteSpace;
    }

    /**
     * <p>
     * Specifies to trim leading and trailing white space.
     * </p>
     * 
     * @param trimWhiteSpace
     *        Specifies to trim leading and trailing white space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvConfiguration withTrimWhiteSpace(Boolean trimWhiteSpace) {
        setTrimWhiteSpace(trimWhiteSpace);
        return this;
    }

    /**
     * <p>
     * Specifies to trim leading and trailing white space.
     * </p>
     * 
     * @return Specifies to trim leading and trailing white space.
     */

    public Boolean isTrimWhiteSpace() {
        return this.trimWhiteSpace;
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
        if (getColumnSeparator() != null)
            sb.append("ColumnSeparator: ").append(getColumnSeparator()).append(",");
        if (getEscapeChar() != null)
            sb.append("EscapeChar: ").append(getEscapeChar()).append(",");
        if (getQuoteChar() != null)
            sb.append("QuoteChar: ").append(getQuoteChar()).append(",");
        if (getNullValue() != null)
            sb.append("NullValue: ").append(getNullValue()).append(",");
        if (getTrimWhiteSpace() != null)
            sb.append("TrimWhiteSpace: ").append(getTrimWhiteSpace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsvConfiguration == false)
            return false;
        CsvConfiguration other = (CsvConfiguration) obj;
        if (other.getColumnSeparator() == null ^ this.getColumnSeparator() == null)
            return false;
        if (other.getColumnSeparator() != null && other.getColumnSeparator().equals(this.getColumnSeparator()) == false)
            return false;
        if (other.getEscapeChar() == null ^ this.getEscapeChar() == null)
            return false;
        if (other.getEscapeChar() != null && other.getEscapeChar().equals(this.getEscapeChar()) == false)
            return false;
        if (other.getQuoteChar() == null ^ this.getQuoteChar() == null)
            return false;
        if (other.getQuoteChar() != null && other.getQuoteChar().equals(this.getQuoteChar()) == false)
            return false;
        if (other.getNullValue() == null ^ this.getNullValue() == null)
            return false;
        if (other.getNullValue() != null && other.getNullValue().equals(this.getNullValue()) == false)
            return false;
        if (other.getTrimWhiteSpace() == null ^ this.getTrimWhiteSpace() == null)
            return false;
        if (other.getTrimWhiteSpace() != null && other.getTrimWhiteSpace().equals(this.getTrimWhiteSpace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnSeparator() == null) ? 0 : getColumnSeparator().hashCode());
        hashCode = prime * hashCode + ((getEscapeChar() == null) ? 0 : getEscapeChar().hashCode());
        hashCode = prime * hashCode + ((getQuoteChar() == null) ? 0 : getQuoteChar().hashCode());
        hashCode = prime * hashCode + ((getNullValue() == null) ? 0 : getNullValue().hashCode());
        hashCode = prime * hashCode + ((getTrimWhiteSpace() == null) ? 0 : getTrimWhiteSpace().hashCode());
        return hashCode;
    }

    @Override
    public CsvConfiguration clone() {
        try {
            return (CsvConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.CsvConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
