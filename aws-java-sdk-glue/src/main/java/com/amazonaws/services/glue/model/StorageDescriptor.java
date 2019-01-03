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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the physical storage of table data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StorageDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     */
    private java.util.List<Column> columns;
    /**
     * <p>
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the
     * database location in the warehouse, followed by the table name.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a custom
     * format.
     * </p>
     */
    private String inputFormat;
    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or <code>IgnoreKeyTextOutputFormat</code>, or
     * a custom format.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * True if the data in the table is compressed, or False if not.
     * </p>
     */
    private Boolean compressed;
    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     */
    private Integer numberOfBuckets;
    /**
     * <p>
     * Serialization/deserialization (SerDe) information.
     * </p>
     */
    private SerDeInfo serdeInfo;
    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * </p>
     */
    private java.util.List<String> bucketColumns;
    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     */
    private java.util.List<Order> sortColumns;
    /**
     * <p>
     * User-supplied properties in key-value form.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * Information about values that appear very frequently in a column (skewed values).
     * </p>
     */
    private SkewedInfo skewedInfo;
    /**
     * <p>
     * True if the table data is stored in subdirectories, or False if not.
     * </p>
     */
    private Boolean storedAsSubDirectories;

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * 
     * @return A list of the <code>Columns</code> in the table.
     */

    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * 
     * @param columns
     *        A list of the <code>Columns</code> in the table.
     */

    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        A list of the <code>Columns</code> in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withColumns(Column... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<Column>(columns.length));
        }
        for (Column ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>Columns</code> in the table.
     * </p>
     * 
     * @param columns
     *        A list of the <code>Columns</code> in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the
     * database location in the warehouse, followed by the table name.
     * </p>
     * 
     * @param location
     *        The physical location of the table. By default this takes the form of the warehouse location, followed by
     *        the database location in the warehouse, followed by the table name.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the
     * database location in the warehouse, followed by the table name.
     * </p>
     * 
     * @return The physical location of the table. By default this takes the form of the warehouse location, followed by
     *         the database location in the warehouse, followed by the table name.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the
     * database location in the warehouse, followed by the table name.
     * </p>
     * 
     * @param location
     *        The physical location of the table. By default this takes the form of the warehouse location, followed by
     *        the database location in the warehouse, followed by the table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a custom
     * format.
     * </p>
     * 
     * @param inputFormat
     *        The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a
     *        custom format.
     */

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a custom
     * format.
     * </p>
     * 
     * @return The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a
     *         custom format.
     */

    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * <p>
     * The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a custom
     * format.
     * </p>
     * 
     * @param inputFormat
     *        The input format: <code>SequenceFileInputFormat</code> (binary), or <code>TextInputFormat</code>, or a
     *        custom format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withInputFormat(String inputFormat) {
        setInputFormat(inputFormat);
        return this;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or <code>IgnoreKeyTextOutputFormat</code>, or
     * a custom format.
     * </p>
     * 
     * @param outputFormat
     *        The output format: <code>SequenceFileOutputFormat</code> (binary), or
     *        <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or <code>IgnoreKeyTextOutputFormat</code>, or
     * a custom format.
     * </p>
     * 
     * @return The output format: <code>SequenceFileOutputFormat</code> (binary), or
     *         <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The output format: <code>SequenceFileOutputFormat</code> (binary), or <code>IgnoreKeyTextOutputFormat</code>, or
     * a custom format.
     * </p>
     * 
     * @param outputFormat
     *        The output format: <code>SequenceFileOutputFormat</code> (binary), or
     *        <code>IgnoreKeyTextOutputFormat</code>, or a custom format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * True if the data in the table is compressed, or False if not.
     * </p>
     * 
     * @param compressed
     *        True if the data in the table is compressed, or False if not.
     */

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    /**
     * <p>
     * True if the data in the table is compressed, or False if not.
     * </p>
     * 
     * @return True if the data in the table is compressed, or False if not.
     */

    public Boolean getCompressed() {
        return this.compressed;
    }

    /**
     * <p>
     * True if the data in the table is compressed, or False if not.
     * </p>
     * 
     * @param compressed
     *        True if the data in the table is compressed, or False if not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withCompressed(Boolean compressed) {
        setCompressed(compressed);
        return this;
    }

    /**
     * <p>
     * True if the data in the table is compressed, or False if not.
     * </p>
     * 
     * @return True if the data in the table is compressed, or False if not.
     */

    public Boolean isCompressed() {
        return this.compressed;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     * 
     * @param numberOfBuckets
     *        Must be specified if the table contains any dimension columns.
     */

    public void setNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     * 
     * @return Must be specified if the table contains any dimension columns.
     */

    public Integer getNumberOfBuckets() {
        return this.numberOfBuckets;
    }

    /**
     * <p>
     * Must be specified if the table contains any dimension columns.
     * </p>
     * 
     * @param numberOfBuckets
     *        Must be specified if the table contains any dimension columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withNumberOfBuckets(Integer numberOfBuckets) {
        setNumberOfBuckets(numberOfBuckets);
        return this;
    }

    /**
     * <p>
     * Serialization/deserialization (SerDe) information.
     * </p>
     * 
     * @param serdeInfo
     *        Serialization/deserialization (SerDe) information.
     */

    public void setSerdeInfo(SerDeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    /**
     * <p>
     * Serialization/deserialization (SerDe) information.
     * </p>
     * 
     * @return Serialization/deserialization (SerDe) information.
     */

    public SerDeInfo getSerdeInfo() {
        return this.serdeInfo;
    }

    /**
     * <p>
     * Serialization/deserialization (SerDe) information.
     * </p>
     * 
     * @param serdeInfo
     *        Serialization/deserialization (SerDe) information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withSerdeInfo(SerDeInfo serdeInfo) {
        setSerdeInfo(serdeInfo);
        return this;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * </p>
     * 
     * @return A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     */

    public java.util.List<String> getBucketColumns() {
        return bucketColumns;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * </p>
     * 
     * @param bucketColumns
     *        A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     */

    public void setBucketColumns(java.util.Collection<String> bucketColumns) {
        if (bucketColumns == null) {
            this.bucketColumns = null;
            return;
        }

        this.bucketColumns = new java.util.ArrayList<String>(bucketColumns);
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketColumns(java.util.Collection)} or {@link #withBucketColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param bucketColumns
     *        A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withBucketColumns(String... bucketColumns) {
        if (this.bucketColumns == null) {
            setBucketColumns(new java.util.ArrayList<String>(bucketColumns.length));
        }
        for (String ele : bucketColumns) {
            this.bucketColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * </p>
     * 
     * @param bucketColumns
     *        A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withBucketColumns(java.util.Collection<String> bucketColumns) {
        setBucketColumns(bucketColumns);
        return this;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * 
     * @return A list specifying the sort order of each bucket in the table.
     */

    public java.util.List<Order> getSortColumns() {
        return sortColumns;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * 
     * @param sortColumns
     *        A list specifying the sort order of each bucket in the table.
     */

    public void setSortColumns(java.util.Collection<Order> sortColumns) {
        if (sortColumns == null) {
            this.sortColumns = null;
            return;
        }

        this.sortColumns = new java.util.ArrayList<Order>(sortColumns);
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortColumns(java.util.Collection)} or {@link #withSortColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortColumns
     *        A list specifying the sort order of each bucket in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withSortColumns(Order... sortColumns) {
        if (this.sortColumns == null) {
            setSortColumns(new java.util.ArrayList<Order>(sortColumns.length));
        }
        for (Order ele : sortColumns) {
            this.sortColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list specifying the sort order of each bucket in the table.
     * </p>
     * 
     * @param sortColumns
     *        A list specifying the sort order of each bucket in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withSortColumns(java.util.Collection<Order> sortColumns) {
        setSortColumns(sortColumns);
        return this;
    }

    /**
     * <p>
     * User-supplied properties in key-value form.
     * </p>
     * 
     * @return User-supplied properties in key-value form.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * User-supplied properties in key-value form.
     * </p>
     * 
     * @param parameters
     *        User-supplied properties in key-value form.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * User-supplied properties in key-value form.
     * </p>
     * 
     * @param parameters
     *        User-supplied properties in key-value form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public StorageDescriptor addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Information about values that appear very frequently in a column (skewed values).
     * </p>
     * 
     * @param skewedInfo
     *        Information about values that appear very frequently in a column (skewed values).
     */

    public void setSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    /**
     * <p>
     * Information about values that appear very frequently in a column (skewed values).
     * </p>
     * 
     * @return Information about values that appear very frequently in a column (skewed values).
     */

    public SkewedInfo getSkewedInfo() {
        return this.skewedInfo;
    }

    /**
     * <p>
     * Information about values that appear very frequently in a column (skewed values).
     * </p>
     * 
     * @param skewedInfo
     *        Information about values that appear very frequently in a column (skewed values).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withSkewedInfo(SkewedInfo skewedInfo) {
        setSkewedInfo(skewedInfo);
        return this;
    }

    /**
     * <p>
     * True if the table data is stored in subdirectories, or False if not.
     * </p>
     * 
     * @param storedAsSubDirectories
     *        True if the table data is stored in subdirectories, or False if not.
     */

    public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    /**
     * <p>
     * True if the table data is stored in subdirectories, or False if not.
     * </p>
     * 
     * @return True if the table data is stored in subdirectories, or False if not.
     */

    public Boolean getStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

    /**
     * <p>
     * True if the table data is stored in subdirectories, or False if not.
     * </p>
     * 
     * @param storedAsSubDirectories
     *        True if the table data is stored in subdirectories, or False if not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageDescriptor withStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        setStoredAsSubDirectories(storedAsSubDirectories);
        return this;
    }

    /**
     * <p>
     * True if the table data is stored in subdirectories, or False if not.
     * </p>
     * 
     * @return True if the table data is stored in subdirectories, or False if not.
     */

    public Boolean isStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
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
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getInputFormat() != null)
            sb.append("InputFormat: ").append(getInputFormat()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getCompressed() != null)
            sb.append("Compressed: ").append(getCompressed()).append(",");
        if (getNumberOfBuckets() != null)
            sb.append("NumberOfBuckets: ").append(getNumberOfBuckets()).append(",");
        if (getSerdeInfo() != null)
            sb.append("SerdeInfo: ").append(getSerdeInfo()).append(",");
        if (getBucketColumns() != null)
            sb.append("BucketColumns: ").append(getBucketColumns()).append(",");
        if (getSortColumns() != null)
            sb.append("SortColumns: ").append(getSortColumns()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getSkewedInfo() != null)
            sb.append("SkewedInfo: ").append(getSkewedInfo()).append(",");
        if (getStoredAsSubDirectories() != null)
            sb.append("StoredAsSubDirectories: ").append(getStoredAsSubDirectories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageDescriptor == false)
            return false;
        StorageDescriptor other = (StorageDescriptor) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getCompressed() == null ^ this.getCompressed() == null)
            return false;
        if (other.getCompressed() != null && other.getCompressed().equals(this.getCompressed()) == false)
            return false;
        if (other.getNumberOfBuckets() == null ^ this.getNumberOfBuckets() == null)
            return false;
        if (other.getNumberOfBuckets() != null && other.getNumberOfBuckets().equals(this.getNumberOfBuckets()) == false)
            return false;
        if (other.getSerdeInfo() == null ^ this.getSerdeInfo() == null)
            return false;
        if (other.getSerdeInfo() != null && other.getSerdeInfo().equals(this.getSerdeInfo()) == false)
            return false;
        if (other.getBucketColumns() == null ^ this.getBucketColumns() == null)
            return false;
        if (other.getBucketColumns() != null && other.getBucketColumns().equals(this.getBucketColumns()) == false)
            return false;
        if (other.getSortColumns() == null ^ this.getSortColumns() == null)
            return false;
        if (other.getSortColumns() != null && other.getSortColumns().equals(this.getSortColumns()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getSkewedInfo() == null ^ this.getSkewedInfo() == null)
            return false;
        if (other.getSkewedInfo() != null && other.getSkewedInfo().equals(this.getSkewedInfo()) == false)
            return false;
        if (other.getStoredAsSubDirectories() == null ^ this.getStoredAsSubDirectories() == null)
            return false;
        if (other.getStoredAsSubDirectories() != null && other.getStoredAsSubDirectories().equals(this.getStoredAsSubDirectories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getCompressed() == null) ? 0 : getCompressed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBuckets() == null) ? 0 : getNumberOfBuckets().hashCode());
        hashCode = prime * hashCode + ((getSerdeInfo() == null) ? 0 : getSerdeInfo().hashCode());
        hashCode = prime * hashCode + ((getBucketColumns() == null) ? 0 : getBucketColumns().hashCode());
        hashCode = prime * hashCode + ((getSortColumns() == null) ? 0 : getSortColumns().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getSkewedInfo() == null) ? 0 : getSkewedInfo().hashCode());
        hashCode = prime * hashCode + ((getStoredAsSubDirectories() == null) ? 0 : getStoredAsSubDirectories().hashCode());
        return hashCode;
    }

    @Override
    public StorageDescriptor clone() {
        try {
            return (StorageDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StorageDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
