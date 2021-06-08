/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the location of 1-15 occurrences of sensitive data that was detected by managed data identifiers or a
 * custom data identifier and produced a sensitive data finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Occurrences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Occurrences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV
     * file. Each object specifies the cell or field that contains the data. This value is null for all other types of
     * files.
     * </p>
     */
    private java.util.List<Cell> cells;
    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text
     * file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the
     * position of the data on that line.
     * </p>
     * <p>
     * This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the
     * locations of data in: unstructured sections of an otherwise structured file, such as a comment in a file; a
     * malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that
     * contain sensitive data.
     * </p>
     */
    private java.util.List<Range> lineRanges;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.List<Range> offsetRanges;
    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each
     * object specifies the page that contains the data. This value is null for all other types of files.
     * </p>
     */
    private java.util.List<Page> pages;
    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache
     * Parquet file. Each object specifies the record index and the path to the field in the record that contains the
     * data. This value is null for all other types of files.
     * </p>
     */
    private java.util.List<Record> records;

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV
     * file. Each object specifies the cell or field that contains the data. This value is null for all other types of
     * files.
     * </p>
     * 
     * @return An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file,
     *         or TSV file. Each object specifies the cell or field that contains the data. This value is null for all
     *         other types of files.
     */

    public java.util.List<Cell> getCells() {
        return cells;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV
     * file. Each object specifies the cell or field that contains the data. This value is null for all other types of
     * files.
     * </p>
     * 
     * @param cells
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or
     *        TSV file. Each object specifies the cell or field that contains the data. This value is null for all other
     *        types of files.
     */

    public void setCells(java.util.Collection<Cell> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<Cell>(cells);
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV
     * file. Each object specifies the cell or field that contains the data. This value is null for all other types of
     * files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or
     *        TSV file. Each object specifies the cell or field that contains the data. This value is null for all other
     *        types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withCells(Cell... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<Cell>(cells.length));
        }
        for (Cell ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV
     * file. Each object specifies the cell or field that contains the data. This value is null for all other types of
     * files.
     * </p>
     * 
     * @param cells
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or
     *        TSV file. Each object specifies the cell or field that contains the data. This value is null for all other
     *        types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withCells(java.util.Collection<Cell> cells) {
        setCells(cells);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text
     * file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the
     * position of the data on that line.
     * </p>
     * <p>
     * This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the
     * locations of data in: unstructured sections of an otherwise structured file, such as a comment in a file; a
     * malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that
     * contain sensitive data.
     * </p>
     * 
     * @return An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary
     *         text file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the
     *         data, and the position of the data on that line.</p>
     *         <p>
     *         This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions
     *         are the locations of data in: unstructured sections of an otherwise structured file, such as a comment in
     *         a file; a malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any
     *         column names that contain sensitive data.
     */

    public java.util.List<Range> getLineRanges() {
        return lineRanges;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text
     * file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the
     * position of the data on that line.
     * </p>
     * <p>
     * This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the
     * locations of data in: unstructured sections of an otherwise structured file, such as a comment in a file; a
     * malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that
     * contain sensitive data.
     * </p>
     * 
     * @param lineRanges
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary
     *        text file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data,
     *        and the position of the data on that line.</p>
     *        <p>
     *        This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions
     *        are the locations of data in: unstructured sections of an otherwise structured file, such as a comment in
     *        a file; a malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any
     *        column names that contain sensitive data.
     */

    public void setLineRanges(java.util.Collection<Range> lineRanges) {
        if (lineRanges == null) {
            this.lineRanges = null;
            return;
        }

        this.lineRanges = new java.util.ArrayList<Range>(lineRanges);
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text
     * file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the
     * position of the data on that line.
     * </p>
     * <p>
     * This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the
     * locations of data in: unstructured sections of an otherwise structured file, such as a comment in a file; a
     * malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that
     * contain sensitive data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineRanges(java.util.Collection)} or {@link #withLineRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineRanges
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary
     *        text file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data,
     *        and the position of the data on that line.</p>
     *        <p>
     *        This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions
     *        are the locations of data in: unstructured sections of an otherwise structured file, such as a comment in
     *        a file; a malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any
     *        column names that contain sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withLineRanges(Range... lineRanges) {
        if (this.lineRanges == null) {
            setLineRanges(new java.util.ArrayList<Range>(lineRanges.length));
        }
        for (Range ele : lineRanges) {
            this.lineRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text
     * file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the
     * position of the data on that line.
     * </p>
     * <p>
     * This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the
     * locations of data in: unstructured sections of an otherwise structured file, such as a comment in a file; a
     * malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that
     * contain sensitive data.
     * </p>
     * 
     * @param lineRanges
     *        An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary
     *        text file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data,
     *        and the position of the data on that line.</p>
     *        <p>
     *        This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions
     *        are the locations of data in: unstructured sections of an otherwise structured file, such as a comment in
     *        a file; a malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any
     *        column names that contain sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withLineRanges(java.util.Collection<Range> lineRanges) {
        setLineRanges(lineRanges);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */

    public java.util.List<Range> getOffsetRanges() {
        return offsetRanges;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param offsetRanges
     *        <p>
     *        Reserved for future use.
     *        </p>
     */

    public void setOffsetRanges(java.util.Collection<Range> offsetRanges) {
        if (offsetRanges == null) {
            this.offsetRanges = null;
            return;
        }

        this.offsetRanges = new java.util.ArrayList<Range>(offsetRanges);
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOffsetRanges(java.util.Collection)} or {@link #withOffsetRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param offsetRanges
     *        <p>
     *        Reserved for future use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withOffsetRanges(Range... offsetRanges) {
        if (this.offsetRanges == null) {
            setOffsetRanges(new java.util.ArrayList<Range>(offsetRanges.length));
        }
        for (Range ele : offsetRanges) {
            this.offsetRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param offsetRanges
     *        <p>
     *        Reserved for future use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withOffsetRanges(java.util.Collection<Range> offsetRanges) {
        setOffsetRanges(offsetRanges);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each
     * object specifies the page that contains the data. This value is null for all other types of files.
     * </p>
     * 
     * @return An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file.
     *         Each object specifies the page that contains the data. This value is null for all other types of files.
     */

    public java.util.List<Page> getPages() {
        return pages;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each
     * object specifies the page that contains the data. This value is null for all other types of files.
     * </p>
     * 
     * @param pages
     *        An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file.
     *        Each object specifies the page that contains the data. This value is null for all other types of files.
     */

    public void setPages(java.util.Collection<Page> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Page>(pages);
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each
     * object specifies the page that contains the data. This value is null for all other types of files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     *        An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file.
     *        Each object specifies the page that contains the data. This value is null for all other types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withPages(Page... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<Page>(pages.length));
        }
        for (Page ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each
     * object specifies the page that contains the data. This value is null for all other types of files.
     * </p>
     * 
     * @param pages
     *        An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file.
     *        Each object specifies the page that contains the data. This value is null for all other types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withPages(java.util.Collection<Page> pages) {
        setPages(pages);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache
     * Parquet file. Each object specifies the record index and the path to the field in the record that contains the
     * data. This value is null for all other types of files.
     * </p>
     * 
     * @return An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or
     *         Apache Parquet file. Each object specifies the record index and the path to the field in the record that
     *         contains the data. This value is null for all other types of files.
     */

    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache
     * Parquet file. Each object specifies the record index and the path to the field in the record that contains the
     * data. This value is null for all other types of files.
     * </p>
     * 
     * @param records
     *        An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or
     *        Apache Parquet file. Each object specifies the record index and the path to the field in the record that
     *        contains the data. This value is null for all other types of files.
     */

    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<Record>(records);
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache
     * Parquet file. Each object specifies the record index and the path to the field in the record that contains the
     * data. This value is null for all other types of files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or
     *        Apache Parquet file. Each object specifies the record index and the path to the field in the record that
     *        contains the data. This value is null for all other types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withRecords(Record... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<Record>(records.length));
        }
        for (Record ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache
     * Parquet file. Each object specifies the record index and the path to the field in the record that contains the
     * data. This value is null for all other types of files.
     * </p>
     * 
     * @param records
     *        An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or
     *        Apache Parquet file. Each object specifies the record index and the path to the field in the record that
     *        contains the data. This value is null for all other types of files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withRecords(java.util.Collection<Record> records) {
        setRecords(records);
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
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
        if (getLineRanges() != null)
            sb.append("LineRanges: ").append(getLineRanges()).append(",");
        if (getOffsetRanges() != null)
            sb.append("OffsetRanges: ").append(getOffsetRanges()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Occurrences == false)
            return false;
        Occurrences other = (Occurrences) obj;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        if (other.getLineRanges() == null ^ this.getLineRanges() == null)
            return false;
        if (other.getLineRanges() != null && other.getLineRanges().equals(this.getLineRanges()) == false)
            return false;
        if (other.getOffsetRanges() == null ^ this.getOffsetRanges() == null)
            return false;
        if (other.getOffsetRanges() != null && other.getOffsetRanges().equals(this.getOffsetRanges()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getLineRanges() == null) ? 0 : getLineRanges().hashCode());
        hashCode = prime * hashCode + ((getOffsetRanges() == null) ? 0 : getOffsetRanges().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public Occurrences clone() {
        try {
            return (Occurrences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.OccurrencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
