/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the format for a source file or files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UploadSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * File format.
     * </p>
     */
    private String format;
    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     */
    private Integer startFromRow;
    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     */
    private Boolean containsHeader;
    /**
     * <p>
     * Text qualifier.
     * </p>
     */
    private String textQualifier;
    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * File format.
     * </p>
     * 
     * @param format
     *        File format.
     * @see FileFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * File format.
     * </p>
     * 
     * @return File format.
     * @see FileFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * File format.
     * </p>
     * 
     * @param format
     *        File format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UploadSettings withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * File format.
     * </p>
     * 
     * @param format
     *        File format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UploadSettings withFormat(FileFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * 
     * @param startFromRow
     *        A row number to start reading data from.
     */

    public void setStartFromRow(Integer startFromRow) {
        this.startFromRow = startFromRow;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * 
     * @return A row number to start reading data from.
     */

    public Integer getStartFromRow() {
        return this.startFromRow;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * 
     * @param startFromRow
     *        A row number to start reading data from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadSettings withStartFromRow(Integer startFromRow) {
        setStartFromRow(startFromRow);
        return this;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     * 
     * @param containsHeader
     *        Whether the file has a header row, or the files each have a header row.
     */

    public void setContainsHeader(Boolean containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     * 
     * @return Whether the file has a header row, or the files each have a header row.
     */

    public Boolean getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     * 
     * @param containsHeader
     *        Whether the file has a header row, or the files each have a header row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadSettings withContainsHeader(Boolean containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     * 
     * @return Whether the file has a header row, or the files each have a header row.
     */

    public Boolean isContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * 
     * @param textQualifier
     *        Text qualifier.
     * @see TextQualifier
     */

    public void setTextQualifier(String textQualifier) {
        this.textQualifier = textQualifier;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * 
     * @return Text qualifier.
     * @see TextQualifier
     */

    public String getTextQualifier() {
        return this.textQualifier;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * 
     * @param textQualifier
     *        Text qualifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextQualifier
     */

    public UploadSettings withTextQualifier(String textQualifier) {
        setTextQualifier(textQualifier);
        return this;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * 
     * @param textQualifier
     *        Text qualifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextQualifier
     */

    public UploadSettings withTextQualifier(TextQualifier textQualifier) {
        this.textQualifier = textQualifier.toString();
        return this;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * 
     * @param delimiter
     *        The delimiter between values in the file.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * 
     * @return The delimiter between values in the file.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * 
     * @param delimiter
     *        The delimiter between values in the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadSettings withDelimiter(String delimiter) {
        setDelimiter(delimiter);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getStartFromRow() != null)
            sb.append("StartFromRow: ").append(getStartFromRow()).append(",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: ").append(getContainsHeader()).append(",");
        if (getTextQualifier() != null)
            sb.append("TextQualifier: ").append(getTextQualifier()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSettings == false)
            return false;
        UploadSettings other = (UploadSettings) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getStartFromRow() == null ^ this.getStartFromRow() == null)
            return false;
        if (other.getStartFromRow() != null && other.getStartFromRow().equals(this.getStartFromRow()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getTextQualifier() == null ^ this.getTextQualifier() == null)
            return false;
        if (other.getTextQualifier() != null && other.getTextQualifier().equals(this.getTextQualifier()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getStartFromRow() == null) ? 0 : getStartFromRow().hashCode());
        hashCode = prime * hashCode + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getTextQualifier() == null) ? 0 : getTextQualifier().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public UploadSettings clone() {
        try {
            return (UploadSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.UploadSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
