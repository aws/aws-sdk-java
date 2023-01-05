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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Read options for an annotation import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReadOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file's comment character.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The file's encoding.
     * </p>
     */
    private String encoding;
    /**
     * <p>
     * A character for escaping quotes in the file.
     * </p>
     */
    private String escape;
    /**
     * <p>
     * Whether quotes need to be escaped in the file.
     * </p>
     */
    private Boolean escapeQuotes;
    /**
     * <p>
     * Whether the file has a header row.
     * </p>
     */
    private Boolean header;
    /**
     * <p>
     * A line separator for the file.
     * </p>
     */
    private String lineSep;
    /**
     * <p>
     * The file's quote character.
     * </p>
     */
    private String quote;
    /**
     * <p>
     * Whether all values need to be quoted, or just those that contain quotes.
     * </p>
     */
    private Boolean quoteAll;
    /**
     * <p>
     * The file's field separator.
     * </p>
     */
    private String sep;

    /**
     * <p>
     * The file's comment character.
     * </p>
     * 
     * @param comment
     *        The file's comment character.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The file's comment character.
     * </p>
     * 
     * @return The file's comment character.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The file's comment character.
     * </p>
     * 
     * @param comment
     *        The file's comment character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The file's encoding.
     * </p>
     * 
     * @param encoding
     *        The file's encoding.
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * The file's encoding.
     * </p>
     * 
     * @return The file's encoding.
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * The file's encoding.
     * </p>
     * 
     * @param encoding
     *        The file's encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * A character for escaping quotes in the file.
     * </p>
     * 
     * @param escape
     *        A character for escaping quotes in the file.
     */

    public void setEscape(String escape) {
        this.escape = escape;
    }

    /**
     * <p>
     * A character for escaping quotes in the file.
     * </p>
     * 
     * @return A character for escaping quotes in the file.
     */

    public String getEscape() {
        return this.escape;
    }

    /**
     * <p>
     * A character for escaping quotes in the file.
     * </p>
     * 
     * @param escape
     *        A character for escaping quotes in the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withEscape(String escape) {
        setEscape(escape);
        return this;
    }

    /**
     * <p>
     * Whether quotes need to be escaped in the file.
     * </p>
     * 
     * @param escapeQuotes
     *        Whether quotes need to be escaped in the file.
     */

    public void setEscapeQuotes(Boolean escapeQuotes) {
        this.escapeQuotes = escapeQuotes;
    }

    /**
     * <p>
     * Whether quotes need to be escaped in the file.
     * </p>
     * 
     * @return Whether quotes need to be escaped in the file.
     */

    public Boolean getEscapeQuotes() {
        return this.escapeQuotes;
    }

    /**
     * <p>
     * Whether quotes need to be escaped in the file.
     * </p>
     * 
     * @param escapeQuotes
     *        Whether quotes need to be escaped in the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withEscapeQuotes(Boolean escapeQuotes) {
        setEscapeQuotes(escapeQuotes);
        return this;
    }

    /**
     * <p>
     * Whether quotes need to be escaped in the file.
     * </p>
     * 
     * @return Whether quotes need to be escaped in the file.
     */

    public Boolean isEscapeQuotes() {
        return this.escapeQuotes;
    }

    /**
     * <p>
     * Whether the file has a header row.
     * </p>
     * 
     * @param header
     *        Whether the file has a header row.
     */

    public void setHeader(Boolean header) {
        this.header = header;
    }

    /**
     * <p>
     * Whether the file has a header row.
     * </p>
     * 
     * @return Whether the file has a header row.
     */

    public Boolean getHeader() {
        return this.header;
    }

    /**
     * <p>
     * Whether the file has a header row.
     * </p>
     * 
     * @param header
     *        Whether the file has a header row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withHeader(Boolean header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Whether the file has a header row.
     * </p>
     * 
     * @return Whether the file has a header row.
     */

    public Boolean isHeader() {
        return this.header;
    }

    /**
     * <p>
     * A line separator for the file.
     * </p>
     * 
     * @param lineSep
     *        A line separator for the file.
     */

    public void setLineSep(String lineSep) {
        this.lineSep = lineSep;
    }

    /**
     * <p>
     * A line separator for the file.
     * </p>
     * 
     * @return A line separator for the file.
     */

    public String getLineSep() {
        return this.lineSep;
    }

    /**
     * <p>
     * A line separator for the file.
     * </p>
     * 
     * @param lineSep
     *        A line separator for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withLineSep(String lineSep) {
        setLineSep(lineSep);
        return this;
    }

    /**
     * <p>
     * The file's quote character.
     * </p>
     * 
     * @param quote
     *        The file's quote character.
     */

    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     * <p>
     * The file's quote character.
     * </p>
     * 
     * @return The file's quote character.
     */

    public String getQuote() {
        return this.quote;
    }

    /**
     * <p>
     * The file's quote character.
     * </p>
     * 
     * @param quote
     *        The file's quote character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withQuote(String quote) {
        setQuote(quote);
        return this;
    }

    /**
     * <p>
     * Whether all values need to be quoted, or just those that contain quotes.
     * </p>
     * 
     * @param quoteAll
     *        Whether all values need to be quoted, or just those that contain quotes.
     */

    public void setQuoteAll(Boolean quoteAll) {
        this.quoteAll = quoteAll;
    }

    /**
     * <p>
     * Whether all values need to be quoted, or just those that contain quotes.
     * </p>
     * 
     * @return Whether all values need to be quoted, or just those that contain quotes.
     */

    public Boolean getQuoteAll() {
        return this.quoteAll;
    }

    /**
     * <p>
     * Whether all values need to be quoted, or just those that contain quotes.
     * </p>
     * 
     * @param quoteAll
     *        Whether all values need to be quoted, or just those that contain quotes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withQuoteAll(Boolean quoteAll) {
        setQuoteAll(quoteAll);
        return this;
    }

    /**
     * <p>
     * Whether all values need to be quoted, or just those that contain quotes.
     * </p>
     * 
     * @return Whether all values need to be quoted, or just those that contain quotes.
     */

    public Boolean isQuoteAll() {
        return this.quoteAll;
    }

    /**
     * <p>
     * The file's field separator.
     * </p>
     * 
     * @param sep
     *        The file's field separator.
     */

    public void setSep(String sep) {
        this.sep = sep;
    }

    /**
     * <p>
     * The file's field separator.
     * </p>
     * 
     * @return The file's field separator.
     */

    public String getSep() {
        return this.sep;
    }

    /**
     * <p>
     * The file's field separator.
     * </p>
     * 
     * @param sep
     *        The file's field separator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadOptions withSep(String sep) {
        setSep(sep);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding()).append(",");
        if (getEscape() != null)
            sb.append("Escape: ").append(getEscape()).append(",");
        if (getEscapeQuotes() != null)
            sb.append("EscapeQuotes: ").append(getEscapeQuotes()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getLineSep() != null)
            sb.append("LineSep: ").append(getLineSep()).append(",");
        if (getQuote() != null)
            sb.append("Quote: ").append(getQuote()).append(",");
        if (getQuoteAll() != null)
            sb.append("QuoteAll: ").append(getQuoteAll()).append(",");
        if (getSep() != null)
            sb.append("Sep: ").append(getSep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadOptions == false)
            return false;
        ReadOptions other = (ReadOptions) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        if (other.getEscape() == null ^ this.getEscape() == null)
            return false;
        if (other.getEscape() != null && other.getEscape().equals(this.getEscape()) == false)
            return false;
        if (other.getEscapeQuotes() == null ^ this.getEscapeQuotes() == null)
            return false;
        if (other.getEscapeQuotes() != null && other.getEscapeQuotes().equals(this.getEscapeQuotes()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getLineSep() == null ^ this.getLineSep() == null)
            return false;
        if (other.getLineSep() != null && other.getLineSep().equals(this.getLineSep()) == false)
            return false;
        if (other.getQuote() == null ^ this.getQuote() == null)
            return false;
        if (other.getQuote() != null && other.getQuote().equals(this.getQuote()) == false)
            return false;
        if (other.getQuoteAll() == null ^ this.getQuoteAll() == null)
            return false;
        if (other.getQuoteAll() != null && other.getQuoteAll().equals(this.getQuoteAll()) == false)
            return false;
        if (other.getSep() == null ^ this.getSep() == null)
            return false;
        if (other.getSep() != null && other.getSep().equals(this.getSep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        hashCode = prime * hashCode + ((getEscape() == null) ? 0 : getEscape().hashCode());
        hashCode = prime * hashCode + ((getEscapeQuotes() == null) ? 0 : getEscapeQuotes().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getLineSep() == null) ? 0 : getLineSep().hashCode());
        hashCode = prime * hashCode + ((getQuote() == null) ? 0 : getQuote().hashCode());
        hashCode = prime * hashCode + ((getQuoteAll() == null) ? 0 : getQuoteAll().hashCode());
        hashCode = prime * hashCode + ((getSep() == null) ? 0 : getSep().hashCode());
        return hashCode;
    }

    @Override
    public ReadOptions clone() {
        try {
            return (ReadOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReadOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
