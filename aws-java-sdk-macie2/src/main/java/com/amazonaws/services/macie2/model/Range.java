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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the location of an occurrence of sensitive data in an Adobe Portable Document Format file,
 * Apache Avro object container, Microsoft Word document, or non-binary text file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Range" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Range implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     * </p>
     * </li>
     * </ul>
     */
    private Long end;
    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     * </p>
     * </li>
     * </ul>
     */
    private Long start;
    /**
     * <p>
     * The column number for the column that contains the data, if the file contains structured data.
     * </p>
     */
    private Long startColumn;

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param end
     *        Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In an Occurrences.lineRanges array, the number of lines from the end of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     *        </p>
     *        </li>
     */

    public void setEnd(Long end) {
        this.end = end;
    }

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In an Occurrences.lineRanges array, the number of lines from the end of the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     *         </p>
     *         </li>
     */

    public Long getEnd() {
        return this.end;
    }

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param end
     *        Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In an Occurrences.lineRanges array, the number of lines from the end of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an Occurrences.offsetRanges array, the number of characters from the end of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a Page object, the number of lines (lineRange) or characters (offsetRange) from the end of the page.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withEnd(Long end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param start
     *        Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In an Occurrences.lineRanges array, the number of lines from the start of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     *        </p>
     *        </li>
     */

    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In an Occurrences.lineRanges array, the number of lines from the start of the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     *         </p>
     *         </li>
     */

    public Long getStart() {
        return this.start;
    }

    /**
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In an Occurrences.lineRanges array, the number of lines from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param start
     *        Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In an Occurrences.lineRanges array, the number of lines from the start of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an Occurrences.offsetRanges array, the number of characters from the start of the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a Page object, the number of lines (lineRange) or characters (offsetRange) from the start of the page.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withStart(Long start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The column number for the column that contains the data, if the file contains structured data.
     * </p>
     * 
     * @param startColumn
     *        The column number for the column that contains the data, if the file contains structured data.
     */

    public void setStartColumn(Long startColumn) {
        this.startColumn = startColumn;
    }

    /**
     * <p>
     * The column number for the column that contains the data, if the file contains structured data.
     * </p>
     * 
     * @return The column number for the column that contains the data, if the file contains structured data.
     */

    public Long getStartColumn() {
        return this.startColumn;
    }

    /**
     * <p>
     * The column number for the column that contains the data, if the file contains structured data.
     * </p>
     * 
     * @param startColumn
     *        The column number for the column that contains the data, if the file contains structured data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withStartColumn(Long startColumn) {
        setStartColumn(startColumn);
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getStartColumn() != null)
            sb.append("StartColumn: ").append(getStartColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Range == false)
            return false;
        Range other = (Range) obj;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getStartColumn() == null ^ this.getStartColumn() == null)
            return false;
        if (other.getStartColumn() != null && other.getStartColumn().equals(this.getStartColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getStartColumn() == null) ? 0 : getStartColumn().hashCode());
        return hashCode;
    }

    @Override
    public Range clone() {
        try {
            return (Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.RangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
