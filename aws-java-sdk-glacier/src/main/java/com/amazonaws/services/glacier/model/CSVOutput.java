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
 * Contains information about the comma-separated value (CSV) file that the job results are stored in.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CSVOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates whether all output fields should be contained within quotation marks.
     * </p>
     */
    private String quoteFields;
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
     * A value that indicates whether all output fields should be contained within quotation marks.
     * </p>
     * 
     * @param quoteFields
     *        A value that indicates whether all output fields should be contained within quotation marks.
     * @see QuoteFields
     */

    public void setQuoteFields(String quoteFields) {
        this.quoteFields = quoteFields;
    }

    /**
     * <p>
     * A value that indicates whether all output fields should be contained within quotation marks.
     * </p>
     * 
     * @return A value that indicates whether all output fields should be contained within quotation marks.
     * @see QuoteFields
     */

    public String getQuoteFields() {
        return this.quoteFields;
    }

    /**
     * <p>
     * A value that indicates whether all output fields should be contained within quotation marks.
     * </p>
     * 
     * @param quoteFields
     *        A value that indicates whether all output fields should be contained within quotation marks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuoteFields
     */

    public CSVOutput withQuoteFields(String quoteFields) {
        setQuoteFields(quoteFields);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether all output fields should be contained within quotation marks.
     * </p>
     * 
     * @param quoteFields
     *        A value that indicates whether all output fields should be contained within quotation marks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuoteFields
     */

    public CSVOutput withQuoteFields(QuoteFields quoteFields) {
        this.quoteFields = quoteFields.toString();
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

    public CSVOutput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
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

    public CSVOutput withRecordDelimiter(String recordDelimiter) {
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

    public CSVOutput withFieldDelimiter(String fieldDelimiter) {
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

    public CSVOutput withQuoteCharacter(String quoteCharacter) {
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
        if (getQuoteFields() != null)
            sb.append("QuoteFields: ").append(getQuoteFields()).append(",");
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

        if (obj instanceof CSVOutput == false)
            return false;
        CSVOutput other = (CSVOutput) obj;
        if (other.getQuoteFields() == null ^ this.getQuoteFields() == null)
            return false;
        if (other.getQuoteFields() != null && other.getQuoteFields().equals(this.getQuoteFields()) == false)
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

        hashCode = prime * hashCode + ((getQuoteFields() == null) ? 0 : getQuoteFields().hashCode());
        hashCode = prime * hashCode + ((getQuoteEscapeCharacter() == null) ? 0 : getQuoteEscapeCharacter().hashCode());
        hashCode = prime * hashCode + ((getRecordDelimiter() == null) ? 0 : getRecordDelimiter().hashCode());
        hashCode = prime * hashCode + ((getFieldDelimiter() == null) ? 0 : getFieldDelimiter().hashCode());
        hashCode = prime * hashCode + ((getQuoteCharacter() == null) ? 0 : getQuoteCharacter().hashCode());
        return hashCode;
    }

    @Override
    public CSVOutput clone() {
        try {
            return (CSVOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.CSVOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
