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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a table cell in a table excerpt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TableCell" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCell implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actual value or content within a table cell. A table cell could contain a date value of a year, or a string
     * value of text, for example.
     * </p>
     */
    private String value;
    /**
     * <p>
     * <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content with the
     * highest confidence score or is the most relevant to the query.
     * </p>
     */
    private Boolean topAnswer;
    /**
     * <p>
     * <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so the
     * value or content should be highlighted.
     * </p>
     */
    private Boolean highlighted;
    /**
     * <p>
     * <code>TRUE</code> means that the table cell should be treated as a header.
     * </p>
     */
    private Boolean header;

    /**
     * <p>
     * The actual value or content within a table cell. A table cell could contain a date value of a year, or a string
     * value of text, for example.
     * </p>
     * 
     * @param value
     *        The actual value or content within a table cell. A table cell could contain a date value of a year, or a
     *        string value of text, for example.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The actual value or content within a table cell. A table cell could contain a date value of a year, or a string
     * value of text, for example.
     * </p>
     * 
     * @return The actual value or content within a table cell. A table cell could contain a date value of a year, or a
     *         string value of text, for example.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The actual value or content within a table cell. A table cell could contain a date value of a year, or a string
     * value of text, for example.
     * </p>
     * 
     * @param value
     *        The actual value or content within a table cell. A table cell could contain a date value of a year, or a
     *        string value of text, for example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content with the
     * highest confidence score or is the most relevant to the query.
     * </p>
     * 
     * @param topAnswer
     *        <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content
     *        with the highest confidence score or is the most relevant to the query.
     */

    public void setTopAnswer(Boolean topAnswer) {
        this.topAnswer = topAnswer;
    }

    /**
     * <p>
     * <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content with the
     * highest confidence score or is the most relevant to the query.
     * </p>
     * 
     * @return <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content
     *         with the highest confidence score or is the most relevant to the query.
     */

    public Boolean getTopAnswer() {
        return this.topAnswer;
    }

    /**
     * <p>
     * <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content with the
     * highest confidence score or is the most relevant to the query.
     * </p>
     * 
     * @param topAnswer
     *        <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content
     *        with the highest confidence score or is the most relevant to the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell withTopAnswer(Boolean topAnswer) {
        setTopAnswer(topAnswer);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content with the
     * highest confidence score or is the most relevant to the query.
     * </p>
     * 
     * @return <code>TRUE</code> if the response of the table cell is the top answer. This is the cell value or content
     *         with the highest confidence score or is the most relevant to the query.
     */

    public Boolean isTopAnswer() {
        return this.topAnswer;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so the
     * value or content should be highlighted.
     * </p>
     * 
     * @param highlighted
     *        <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so
     *        the value or content should be highlighted.
     */

    public void setHighlighted(Boolean highlighted) {
        this.highlighted = highlighted;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so the
     * value or content should be highlighted.
     * </p>
     * 
     * @return <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so
     *         the value or content should be highlighted.
     */

    public Boolean getHighlighted() {
        return this.highlighted;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so the
     * value or content should be highlighted.
     * </p>
     * 
     * @param highlighted
     *        <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so
     *        the value or content should be highlighted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell withHighlighted(Boolean highlighted) {
        setHighlighted(highlighted);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so the
     * value or content should be highlighted.
     * </p>
     * 
     * @return <code>TRUE</code> means that the table cell has a high enough confidence and is relevant to the query, so
     *         the value or content should be highlighted.
     */

    public Boolean isHighlighted() {
        return this.highlighted;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell should be treated as a header.
     * </p>
     * 
     * @param header
     *        <code>TRUE</code> means that the table cell should be treated as a header.
     */

    public void setHeader(Boolean header) {
        this.header = header;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell should be treated as a header.
     * </p>
     * 
     * @return <code>TRUE</code> means that the table cell should be treated as a header.
     */

    public Boolean getHeader() {
        return this.header;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell should be treated as a header.
     * </p>
     * 
     * @param header
     *        <code>TRUE</code> means that the table cell should be treated as a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell withHeader(Boolean header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> means that the table cell should be treated as a header.
     * </p>
     * 
     * @return <code>TRUE</code> means that the table cell should be treated as a header.
     */

    public Boolean isHeader() {
        return this.header;
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTopAnswer() != null)
            sb.append("TopAnswer: ").append(getTopAnswer()).append(",");
        if (getHighlighted() != null)
            sb.append("Highlighted: ").append(getHighlighted()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableCell == false)
            return false;
        TableCell other = (TableCell) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTopAnswer() == null ^ this.getTopAnswer() == null)
            return false;
        if (other.getTopAnswer() != null && other.getTopAnswer().equals(this.getTopAnswer()) == false)
            return false;
        if (other.getHighlighted() == null ^ this.getHighlighted() == null)
            return false;
        if (other.getHighlighted() != null && other.getHighlighted().equals(this.getHighlighted()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTopAnswer() == null) ? 0 : getTopAnswer().hashCode());
        hashCode = prime * hashCode + ((getHighlighted() == null) ? 0 : getHighlighted().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        return hashCode;
    }

    @Override
    public TableCell clone() {
        try {
            return (TableCell) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.TableCellMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
