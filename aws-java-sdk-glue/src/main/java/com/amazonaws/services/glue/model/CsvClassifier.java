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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A classifier for custom <code>CSV</code> content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CsvClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvClassifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The version of this classifier.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. It must be different from the column
     * delimiter.
     * </p>
     */
    private String quoteSymbol;
    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     */
    private String containsHeader;
    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     */
    private java.util.List<String> header;
    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is <code>true</code>
     * .
     * </p>
     */
    private Boolean disableValueTrimming;
    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     */
    private Boolean allowSingleColumn;
    /**
     * <p>
     * Enables the custom datatype to be configured.
     * </p>
     */
    private Boolean customDatatypeConfigured;
    /**
     * <p>
     * A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT", "LONG",
     * "SHORT", "STRING", "TIMESTAMP".
     * </p>
     */
    private java.util.List<String> customDatatypes;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @return The name of the classifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     * 
     * @param creationTime
     *        The time that this classifier was registered.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     * 
     * @return The time that this classifier was registered.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     * 
     * @param creationTime
     *        The time that this classifier was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time that this classifier was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     * 
     * @return The time that this classifier was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time that this classifier was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @param version
     *        The version of this classifier.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @return The version of this classifier.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @param version
     *        The version of this classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @param delimiter
     *        A custom symbol to denote what separates each column entry in the row.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @return A custom symbol to denote what separates each column entry in the row.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * 
     * @param delimiter
     *        A custom symbol to denote what separates each column entry in the row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. It must be different from the column
     * delimiter.
     * </p>
     * 
     * @param quoteSymbol
     *        A custom symbol to denote what combines content into a single column value. It must be different from the
     *        column delimiter.
     */

    public void setQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. It must be different from the column
     * delimiter.
     * </p>
     * 
     * @return A custom symbol to denote what combines content into a single column value. It must be different from the
     *         column delimiter.
     */

    public String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column value. It must be different from the column
     * delimiter.
     * </p>
     * 
     * @param quoteSymbol
     *        A custom symbol to denote what combines content into a single column value. It must be different from the
     *        column delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withQuoteSymbol(String quoteSymbol) {
        setQuoteSymbol(quoteSymbol);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @see CsvHeaderOption
     */

    public void setContainsHeader(String containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @return Indicates whether the CSV file contains a header.
     * @see CsvHeaderOption
     */

    public String getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CsvHeaderOption
     */

    public CsvClassifier withContainsHeader(String containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * 
     * @param containsHeader
     *        Indicates whether the CSV file contains a header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CsvHeaderOption
     */

    public CsvClassifier withContainsHeader(CsvHeaderOption containsHeader) {
        this.containsHeader = containsHeader.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @return A list of strings representing column names.
     */

    public java.util.List<String> getHeader() {
        return header;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     */

    public void setHeader(java.util.Collection<String> header) {
        if (header == null) {
            this.header = null;
            return;
        }

        this.header = new java.util.ArrayList<String>(header);
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeader(java.util.Collection)} or {@link #withHeader(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withHeader(String... header) {
        if (this.header == null) {
            setHeader(new java.util.ArrayList<String>(header.length));
        }
        for (String ele : header) {
            this.header.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * 
     * @param header
     *        A list of strings representing column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withHeader(java.util.Collection<String> header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is <code>true</code>
     * .
     * </p>
     * 
     * @param disableValueTrimming
     *        Specifies not to trim values before identifying the type of column values. The default value is
     *        <code>true</code>.
     */

    public void setDisableValueTrimming(Boolean disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is <code>true</code>
     * .
     * </p>
     * 
     * @return Specifies not to trim values before identifying the type of column values. The default value is
     *         <code>true</code>.
     */

    public Boolean getDisableValueTrimming() {
        return this.disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is <code>true</code>
     * .
     * </p>
     * 
     * @param disableValueTrimming
     *        Specifies not to trim values before identifying the type of column values. The default value is
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withDisableValueTrimming(Boolean disableValueTrimming) {
        setDisableValueTrimming(disableValueTrimming);
        return this;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column values. The default value is <code>true</code>
     * .
     * </p>
     * 
     * @return Specifies not to trim values before identifying the type of column values. The default value is
     *         <code>true</code>.
     */

    public Boolean isDisableValueTrimming() {
        return this.disableValueTrimming;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @param allowSingleColumn
     *        Enables the processing of files that contain only one column.
     */

    public void setAllowSingleColumn(Boolean allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @return Enables the processing of files that contain only one column.
     */

    public Boolean getAllowSingleColumn() {
        return this.allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @param allowSingleColumn
     *        Enables the processing of files that contain only one column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withAllowSingleColumn(Boolean allowSingleColumn) {
        setAllowSingleColumn(allowSingleColumn);
        return this;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * 
     * @return Enables the processing of files that contain only one column.
     */

    public Boolean isAllowSingleColumn() {
        return this.allowSingleColumn;
    }

    /**
     * <p>
     * Enables the custom datatype to be configured.
     * </p>
     * 
     * @param customDatatypeConfigured
     *        Enables the custom datatype to be configured.
     */

    public void setCustomDatatypeConfigured(Boolean customDatatypeConfigured) {
        this.customDatatypeConfigured = customDatatypeConfigured;
    }

    /**
     * <p>
     * Enables the custom datatype to be configured.
     * </p>
     * 
     * @return Enables the custom datatype to be configured.
     */

    public Boolean getCustomDatatypeConfigured() {
        return this.customDatatypeConfigured;
    }

    /**
     * <p>
     * Enables the custom datatype to be configured.
     * </p>
     * 
     * @param customDatatypeConfigured
     *        Enables the custom datatype to be configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withCustomDatatypeConfigured(Boolean customDatatypeConfigured) {
        setCustomDatatypeConfigured(customDatatypeConfigured);
        return this;
    }

    /**
     * <p>
     * Enables the custom datatype to be configured.
     * </p>
     * 
     * @return Enables the custom datatype to be configured.
     */

    public Boolean isCustomDatatypeConfigured() {
        return this.customDatatypeConfigured;
    }

    /**
     * <p>
     * A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT", "LONG",
     * "SHORT", "STRING", "TIMESTAMP".
     * </p>
     * 
     * @return A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT",
     *         "LONG", "SHORT", "STRING", "TIMESTAMP".
     */

    public java.util.List<String> getCustomDatatypes() {
        return customDatatypes;
    }

    /**
     * <p>
     * A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT", "LONG",
     * "SHORT", "STRING", "TIMESTAMP".
     * </p>
     * 
     * @param customDatatypes
     *        A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT",
     *        "LONG", "SHORT", "STRING", "TIMESTAMP".
     */

    public void setCustomDatatypes(java.util.Collection<String> customDatatypes) {
        if (customDatatypes == null) {
            this.customDatatypes = null;
            return;
        }

        this.customDatatypes = new java.util.ArrayList<String>(customDatatypes);
    }

    /**
     * <p>
     * A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT", "LONG",
     * "SHORT", "STRING", "TIMESTAMP".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDatatypes(java.util.Collection)} or {@link #withCustomDatatypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customDatatypes
     *        A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT",
     *        "LONG", "SHORT", "STRING", "TIMESTAMP".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withCustomDatatypes(String... customDatatypes) {
        if (this.customDatatypes == null) {
            setCustomDatatypes(new java.util.ArrayList<String>(customDatatypes.length));
        }
        for (String ele : customDatatypes) {
            this.customDatatypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT", "LONG",
     * "SHORT", "STRING", "TIMESTAMP".
     * </p>
     * 
     * @param customDatatypes
     *        A list of custom datatypes including "BINARY", "BOOLEAN", "DATE", "DECIMAL", "DOUBLE", "FLOAT", "INT",
     *        "LONG", "SHORT", "STRING", "TIMESTAMP".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvClassifier withCustomDatatypes(java.util.Collection<String> customDatatypes) {
        setCustomDatatypes(customDatatypes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getQuoteSymbol() != null)
            sb.append("QuoteSymbol: ").append(getQuoteSymbol()).append(",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: ").append(getContainsHeader()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getDisableValueTrimming() != null)
            sb.append("DisableValueTrimming: ").append(getDisableValueTrimming()).append(",");
        if (getAllowSingleColumn() != null)
            sb.append("AllowSingleColumn: ").append(getAllowSingleColumn()).append(",");
        if (getCustomDatatypeConfigured() != null)
            sb.append("CustomDatatypeConfigured: ").append(getCustomDatatypeConfigured()).append(",");
        if (getCustomDatatypes() != null)
            sb.append("CustomDatatypes: ").append(getCustomDatatypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsvClassifier == false)
            return false;
        CsvClassifier other = (CsvClassifier) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getQuoteSymbol() == null ^ this.getQuoteSymbol() == null)
            return false;
        if (other.getQuoteSymbol() != null && other.getQuoteSymbol().equals(this.getQuoteSymbol()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getDisableValueTrimming() == null ^ this.getDisableValueTrimming() == null)
            return false;
        if (other.getDisableValueTrimming() != null && other.getDisableValueTrimming().equals(this.getDisableValueTrimming()) == false)
            return false;
        if (other.getAllowSingleColumn() == null ^ this.getAllowSingleColumn() == null)
            return false;
        if (other.getAllowSingleColumn() != null && other.getAllowSingleColumn().equals(this.getAllowSingleColumn()) == false)
            return false;
        if (other.getCustomDatatypeConfigured() == null ^ this.getCustomDatatypeConfigured() == null)
            return false;
        if (other.getCustomDatatypeConfigured() != null && other.getCustomDatatypeConfigured().equals(this.getCustomDatatypeConfigured()) == false)
            return false;
        if (other.getCustomDatatypes() == null ^ this.getCustomDatatypes() == null)
            return false;
        if (other.getCustomDatatypes() != null && other.getCustomDatatypes().equals(this.getCustomDatatypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getQuoteSymbol() == null) ? 0 : getQuoteSymbol().hashCode());
        hashCode = prime * hashCode + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getDisableValueTrimming() == null) ? 0 : getDisableValueTrimming().hashCode());
        hashCode = prime * hashCode + ((getAllowSingleColumn() == null) ? 0 : getAllowSingleColumn().hashCode());
        hashCode = prime * hashCode + ((getCustomDatatypeConfigured() == null) ? 0 : getCustomDatatypeConfigured().hashCode());
        hashCode = prime * hashCode + ((getCustomDatatypes() == null) ? 0 : getCustomDatatypes().hashCode());
        return hashCode;
    }

    @Override
    public CsvClassifier clone() {
        try {
            return (CsvClassifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CsvClassifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
