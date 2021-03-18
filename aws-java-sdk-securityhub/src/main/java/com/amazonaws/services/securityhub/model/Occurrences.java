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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detected occurrences of sensitive data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Occurrences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Occurrences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files
     * include files such as HTML, XML, JSON, and TXT files.
     * </p>
     */
    private java.util.List<Range> lineRanges;
    /**
     * <p>
     * Occurrences of sensitive data detected in a binary text file.
     * </p>
     */
    private java.util.List<Range> offsetRanges;
    /**
     * <p>
     * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * </p>
     */
    private java.util.List<Page> pages;
    /**
     * <p>
     * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * </p>
     */
    private java.util.List<Record> records;
    /**
     * <p>
     * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     * tab-separated value (TSV) files.
     * </p>
     */
    private java.util.List<Cell> cells;

    /**
     * <p>
     * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files
     * include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @return Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary
     *         text files include files such as HTML, XML, JSON, and TXT files.
     */

    public java.util.List<Range> getLineRanges() {
        return lineRanges;
    }

    /**
     * <p>
     * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files
     * include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @param lineRanges
     *        Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     *        files include files such as HTML, XML, JSON, and TXT files.
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
     * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files
     * include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineRanges(java.util.Collection)} or {@link #withLineRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineRanges
     *        Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     *        files include files such as HTML, XML, JSON, and TXT files.
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
     * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files
     * include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @param lineRanges
     *        Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     *        files include files such as HTML, XML, JSON, and TXT files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withLineRanges(java.util.Collection<Range> lineRanges) {
        setLineRanges(lineRanges);
        return this;
    }

    /**
     * <p>
     * Occurrences of sensitive data detected in a binary text file.
     * </p>
     * 
     * @return Occurrences of sensitive data detected in a binary text file.
     */

    public java.util.List<Range> getOffsetRanges() {
        return offsetRanges;
    }

    /**
     * <p>
     * Occurrences of sensitive data detected in a binary text file.
     * </p>
     * 
     * @param offsetRanges
     *        Occurrences of sensitive data detected in a binary text file.
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
     * Occurrences of sensitive data detected in a binary text file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOffsetRanges(java.util.Collection)} or {@link #withOffsetRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param offsetRanges
     *        Occurrences of sensitive data detected in a binary text file.
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
     * Occurrences of sensitive data detected in a binary text file.
     * </p>
     * 
     * @param offsetRanges
     *        Occurrences of sensitive data detected in a binary text file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withOffsetRanges(java.util.Collection<Range> offsetRanges) {
        setOffsetRanges(offsetRanges);
        return this;
    }

    /**
     * <p>
     * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * </p>
     * 
     * @return Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     */

    public java.util.List<Page> getPages() {
        return pages;
    }

    /**
     * <p>
     * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * </p>
     * 
     * @param pages
     *        Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
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
     * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     *        Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
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
     * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * </p>
     * 
     * @param pages
     *        Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withPages(java.util.Collection<Page> pages) {
        setPages(pages);
        return this;
    }

    /**
     * <p>
     * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * </p>
     * 
     * @return Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     */

    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * </p>
     * 
     * @param records
     *        Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
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
     * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
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
     * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * </p>
     * 
     * @param records
     *        Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     * tab-separated value (TSV) files.
     * </p>
     * 
     * @return Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files,
     *         or tab-separated value (TSV) files.
     */

    public java.util.List<Cell> getCells() {
        return cells;
    }

    /**
     * <p>
     * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     * tab-separated value (TSV) files.
     * </p>
     * 
     * @param cells
     *        Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     *        tab-separated value (TSV) files.
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
     * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     * tab-separated value (TSV) files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     *        tab-separated value (TSV) files.
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
     * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     * tab-separated value (TSV) files.
     * </p>
     * 
     * @param cells
     *        Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or
     *        tab-separated value (TSV) files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Occurrences withCells(java.util.Collection<Cell> cells) {
        setCells(cells);
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
        if (getLineRanges() != null)
            sb.append("LineRanges: ").append(getLineRanges()).append(",");
        if (getOffsetRanges() != null)
            sb.append("OffsetRanges: ").append(getOffsetRanges()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append(getCells());
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
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineRanges() == null) ? 0 : getLineRanges().hashCode());
        hashCode = prime * hashCode + ((getOffsetRanges() == null) ? 0 : getOffsetRanges().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.OccurrencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
