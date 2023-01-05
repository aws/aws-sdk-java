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
 * Additional connection options for the connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JDBCConnectorOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JDBCConnectorOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Extra condition clause to filter data from source. For example:
     * </p>
     * <p>
     * <code>BillingCity='Mountain View'</code>
     * </p>
     * <p>
     * When using a query instead of a table name, you should validate that the query works with the specified
     * <code>filterPredicate</code>.
     * </p>
     */
    private String filterPredicate;
    /**
     * <p>
     * The name of an integer column that is used for partitioning. This option works only when it's included with
     * <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works the same way
     * as in the Spark SQL JDBC reader.
     * </p>
     */
    private String partitionColumn;
    /**
     * <p>
     * The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     */
    private Long lowerBound;
    /**
     * <p>
     * The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     */
    private Long upperBound;
    /**
     * <p>
     * The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and <code>upperBound</code>
     * (exclusive), form partition strides for generated <code>WHERE</code> clause expressions that are used to split
     * the <code>partitionColumn</code>.
     * </p>
     */
    private Long numPartitions;
    /**
     * <p>
     * The name of the job bookmark keys on which to sort.
     * </p>
     */
    private java.util.List<String> jobBookmarkKeys;
    /**
     * <p>
     * Specifies an ascending or descending sort order.
     * </p>
     */
    private String jobBookmarkKeysSortOrder;
    /**
     * <p>
     * Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example, the
     * option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type <code>FLOAT</code> into
     * the Java <code>String</code> type by calling the <code>ResultSet.getString()</code> method of the driver, and
     * uses it to build the Glue record. The <code>ResultSet</code> object is implemented by each driver, so the
     * behavior is specific to the driver you use. Refer to the documentation for your JDBC driver to understand how the
     * driver performs the conversions.
     * </p>
     */
    private java.util.Map<String, String> dataTypeMapping;

    /**
     * <p>
     * Extra condition clause to filter data from source. For example:
     * </p>
     * <p>
     * <code>BillingCity='Mountain View'</code>
     * </p>
     * <p>
     * When using a query instead of a table name, you should validate that the query works with the specified
     * <code>filterPredicate</code>.
     * </p>
     * 
     * @param filterPredicate
     *        Extra condition clause to filter data from source. For example:</p>
     *        <p>
     *        <code>BillingCity='Mountain View'</code>
     *        </p>
     *        <p>
     *        When using a query instead of a table name, you should validate that the query works with the specified
     *        <code>filterPredicate</code>.
     */

    public void setFilterPredicate(String filterPredicate) {
        this.filterPredicate = filterPredicate;
    }

    /**
     * <p>
     * Extra condition clause to filter data from source. For example:
     * </p>
     * <p>
     * <code>BillingCity='Mountain View'</code>
     * </p>
     * <p>
     * When using a query instead of a table name, you should validate that the query works with the specified
     * <code>filterPredicate</code>.
     * </p>
     * 
     * @return Extra condition clause to filter data from source. For example:</p>
     *         <p>
     *         <code>BillingCity='Mountain View'</code>
     *         </p>
     *         <p>
     *         When using a query instead of a table name, you should validate that the query works with the specified
     *         <code>filterPredicate</code>.
     */

    public String getFilterPredicate() {
        return this.filterPredicate;
    }

    /**
     * <p>
     * Extra condition clause to filter data from source. For example:
     * </p>
     * <p>
     * <code>BillingCity='Mountain View'</code>
     * </p>
     * <p>
     * When using a query instead of a table name, you should validate that the query works with the specified
     * <code>filterPredicate</code>.
     * </p>
     * 
     * @param filterPredicate
     *        Extra condition clause to filter data from source. For example:</p>
     *        <p>
     *        <code>BillingCity='Mountain View'</code>
     *        </p>
     *        <p>
     *        When using a query instead of a table name, you should validate that the query works with the specified
     *        <code>filterPredicate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withFilterPredicate(String filterPredicate) {
        setFilterPredicate(filterPredicate);
        return this;
    }

    /**
     * <p>
     * The name of an integer column that is used for partitioning. This option works only when it's included with
     * <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works the same way
     * as in the Spark SQL JDBC reader.
     * </p>
     * 
     * @param partitionColumn
     *        The name of an integer column that is used for partitioning. This option works only when it's included
     *        with <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works
     *        the same way as in the Spark SQL JDBC reader.
     */

    public void setPartitionColumn(String partitionColumn) {
        this.partitionColumn = partitionColumn;
    }

    /**
     * <p>
     * The name of an integer column that is used for partitioning. This option works only when it's included with
     * <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works the same way
     * as in the Spark SQL JDBC reader.
     * </p>
     * 
     * @return The name of an integer column that is used for partitioning. This option works only when it's included
     *         with <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works
     *         the same way as in the Spark SQL JDBC reader.
     */

    public String getPartitionColumn() {
        return this.partitionColumn;
    }

    /**
     * <p>
     * The name of an integer column that is used for partitioning. This option works only when it's included with
     * <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works the same way
     * as in the Spark SQL JDBC reader.
     * </p>
     * 
     * @param partitionColumn
     *        The name of an integer column that is used for partitioning. This option works only when it's included
     *        with <code>lowerBound</code>, <code>upperBound</code>, and <code>numPartitions</code>. This option works
     *        the same way as in the Spark SQL JDBC reader.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withPartitionColumn(String partitionColumn) {
        setPartitionColumn(partitionColumn);
        return this;
    }

    /**
     * <p>
     * The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @param lowerBound
     *        The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     */

    public void setLowerBound(Long lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * <p>
     * The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @return The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     */

    public Long getLowerBound() {
        return this.lowerBound;
    }

    /**
     * <p>
     * The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @param lowerBound
     *        The minimum value of <code>partitionColumn</code> that is used to decide partition stride.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withLowerBound(Long lowerBound) {
        setLowerBound(lowerBound);
        return this;
    }

    /**
     * <p>
     * The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @param upperBound
     *        The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     */

    public void setUpperBound(Long upperBound) {
        this.upperBound = upperBound;
    }

    /**
     * <p>
     * The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @return The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     */

    public Long getUpperBound() {
        return this.upperBound;
    }

    /**
     * <p>
     * The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     * </p>
     * 
     * @param upperBound
     *        The maximum value of <code>partitionColumn</code> that is used to decide partition stride.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withUpperBound(Long upperBound) {
        setUpperBound(upperBound);
        return this;
    }

    /**
     * <p>
     * The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and <code>upperBound</code>
     * (exclusive), form partition strides for generated <code>WHERE</code> clause expressions that are used to split
     * the <code>partitionColumn</code>.
     * </p>
     * 
     * @param numPartitions
     *        The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and
     *        <code>upperBound</code> (exclusive), form partition strides for generated <code>WHERE</code> clause
     *        expressions that are used to split the <code>partitionColumn</code>.
     */

    public void setNumPartitions(Long numPartitions) {
        this.numPartitions = numPartitions;
    }

    /**
     * <p>
     * The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and <code>upperBound</code>
     * (exclusive), form partition strides for generated <code>WHERE</code> clause expressions that are used to split
     * the <code>partitionColumn</code>.
     * </p>
     * 
     * @return The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and
     *         <code>upperBound</code> (exclusive), form partition strides for generated <code>WHERE</code> clause
     *         expressions that are used to split the <code>partitionColumn</code>.
     */

    public Long getNumPartitions() {
        return this.numPartitions;
    }

    /**
     * <p>
     * The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and <code>upperBound</code>
     * (exclusive), form partition strides for generated <code>WHERE</code> clause expressions that are used to split
     * the <code>partitionColumn</code>.
     * </p>
     * 
     * @param numPartitions
     *        The number of partitions. This value, along with <code>lowerBound</code> (inclusive) and
     *        <code>upperBound</code> (exclusive), form partition strides for generated <code>WHERE</code> clause
     *        expressions that are used to split the <code>partitionColumn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withNumPartitions(Long numPartitions) {
        setNumPartitions(numPartitions);
        return this;
    }

    /**
     * <p>
     * The name of the job bookmark keys on which to sort.
     * </p>
     * 
     * @return The name of the job bookmark keys on which to sort.
     */

    public java.util.List<String> getJobBookmarkKeys() {
        return jobBookmarkKeys;
    }

    /**
     * <p>
     * The name of the job bookmark keys on which to sort.
     * </p>
     * 
     * @param jobBookmarkKeys
     *        The name of the job bookmark keys on which to sort.
     */

    public void setJobBookmarkKeys(java.util.Collection<String> jobBookmarkKeys) {
        if (jobBookmarkKeys == null) {
            this.jobBookmarkKeys = null;
            return;
        }

        this.jobBookmarkKeys = new java.util.ArrayList<String>(jobBookmarkKeys);
    }

    /**
     * <p>
     * The name of the job bookmark keys on which to sort.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobBookmarkKeys(java.util.Collection)} or {@link #withJobBookmarkKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param jobBookmarkKeys
     *        The name of the job bookmark keys on which to sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withJobBookmarkKeys(String... jobBookmarkKeys) {
        if (this.jobBookmarkKeys == null) {
            setJobBookmarkKeys(new java.util.ArrayList<String>(jobBookmarkKeys.length));
        }
        for (String ele : jobBookmarkKeys) {
            this.jobBookmarkKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the job bookmark keys on which to sort.
     * </p>
     * 
     * @param jobBookmarkKeys
     *        The name of the job bookmark keys on which to sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withJobBookmarkKeys(java.util.Collection<String> jobBookmarkKeys) {
        setJobBookmarkKeys(jobBookmarkKeys);
        return this;
    }

    /**
     * <p>
     * Specifies an ascending or descending sort order.
     * </p>
     * 
     * @param jobBookmarkKeysSortOrder
     *        Specifies an ascending or descending sort order.
     */

    public void setJobBookmarkKeysSortOrder(String jobBookmarkKeysSortOrder) {
        this.jobBookmarkKeysSortOrder = jobBookmarkKeysSortOrder;
    }

    /**
     * <p>
     * Specifies an ascending or descending sort order.
     * </p>
     * 
     * @return Specifies an ascending or descending sort order.
     */

    public String getJobBookmarkKeysSortOrder() {
        return this.jobBookmarkKeysSortOrder;
    }

    /**
     * <p>
     * Specifies an ascending or descending sort order.
     * </p>
     * 
     * @param jobBookmarkKeysSortOrder
     *        Specifies an ascending or descending sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withJobBookmarkKeysSortOrder(String jobBookmarkKeysSortOrder) {
        setJobBookmarkKeysSortOrder(jobBookmarkKeysSortOrder);
        return this;
    }

    /**
     * <p>
     * Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example, the
     * option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type <code>FLOAT</code> into
     * the Java <code>String</code> type by calling the <code>ResultSet.getString()</code> method of the driver, and
     * uses it to build the Glue record. The <code>ResultSet</code> object is implemented by each driver, so the
     * behavior is specific to the driver you use. Refer to the documentation for your JDBC driver to understand how the
     * driver performs the conversions.
     * </p>
     * 
     * @return Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example,
     *         the option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type
     *         <code>FLOAT</code> into the Java <code>String</code> type by calling the
     *         <code>ResultSet.getString()</code> method of the driver, and uses it to build the Glue record. The
     *         <code>ResultSet</code> object is implemented by each driver, so the behavior is specific to the driver
     *         you use. Refer to the documentation for your JDBC driver to understand how the driver performs the
     *         conversions.
     */

    public java.util.Map<String, String> getDataTypeMapping() {
        return dataTypeMapping;
    }

    /**
     * <p>
     * Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example, the
     * option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type <code>FLOAT</code> into
     * the Java <code>String</code> type by calling the <code>ResultSet.getString()</code> method of the driver, and
     * uses it to build the Glue record. The <code>ResultSet</code> object is implemented by each driver, so the
     * behavior is specific to the driver you use. Refer to the documentation for your JDBC driver to understand how the
     * driver performs the conversions.
     * </p>
     * 
     * @param dataTypeMapping
     *        Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example,
     *        the option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type
     *        <code>FLOAT</code> into the Java <code>String</code> type by calling the
     *        <code>ResultSet.getString()</code> method of the driver, and uses it to build the Glue record. The
     *        <code>ResultSet</code> object is implemented by each driver, so the behavior is specific to the driver you
     *        use. Refer to the documentation for your JDBC driver to understand how the driver performs the
     *        conversions.
     */

    public void setDataTypeMapping(java.util.Map<String, String> dataTypeMapping) {
        this.dataTypeMapping = dataTypeMapping;
    }

    /**
     * <p>
     * Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example, the
     * option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type <code>FLOAT</code> into
     * the Java <code>String</code> type by calling the <code>ResultSet.getString()</code> method of the driver, and
     * uses it to build the Glue record. The <code>ResultSet</code> object is implemented by each driver, so the
     * behavior is specific to the driver you use. Refer to the documentation for your JDBC driver to understand how the
     * driver performs the conversions.
     * </p>
     * 
     * @param dataTypeMapping
     *        Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example,
     *        the option <code>"dataTypeMapping":{"FLOAT":"STRING"}</code> maps data fields of JDBC type
     *        <code>FLOAT</code> into the Java <code>String</code> type by calling the
     *        <code>ResultSet.getString()</code> method of the driver, and uses it to build the Glue record. The
     *        <code>ResultSet</code> object is implemented by each driver, so the behavior is specific to the driver you
     *        use. Refer to the documentation for your JDBC driver to understand how the driver performs the
     *        conversions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions withDataTypeMapping(java.util.Map<String, String> dataTypeMapping) {
        setDataTypeMapping(dataTypeMapping);
        return this;
    }

    /**
     * Add a single DataTypeMapping entry
     *
     * @see JDBCConnectorOptions#withDataTypeMapping
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions addDataTypeMappingEntry(String key, String value) {
        if (null == this.dataTypeMapping) {
            this.dataTypeMapping = new java.util.HashMap<String, String>();
        }
        if (this.dataTypeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dataTypeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DataTypeMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorOptions clearDataTypeMappingEntries() {
        this.dataTypeMapping = null;
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
        if (getFilterPredicate() != null)
            sb.append("FilterPredicate: ").append(getFilterPredicate()).append(",");
        if (getPartitionColumn() != null)
            sb.append("PartitionColumn: ").append(getPartitionColumn()).append(",");
        if (getLowerBound() != null)
            sb.append("LowerBound: ").append(getLowerBound()).append(",");
        if (getUpperBound() != null)
            sb.append("UpperBound: ").append(getUpperBound()).append(",");
        if (getNumPartitions() != null)
            sb.append("NumPartitions: ").append(getNumPartitions()).append(",");
        if (getJobBookmarkKeys() != null)
            sb.append("JobBookmarkKeys: ").append(getJobBookmarkKeys()).append(",");
        if (getJobBookmarkKeysSortOrder() != null)
            sb.append("JobBookmarkKeysSortOrder: ").append(getJobBookmarkKeysSortOrder()).append(",");
        if (getDataTypeMapping() != null)
            sb.append("DataTypeMapping: ").append(getDataTypeMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JDBCConnectorOptions == false)
            return false;
        JDBCConnectorOptions other = (JDBCConnectorOptions) obj;
        if (other.getFilterPredicate() == null ^ this.getFilterPredicate() == null)
            return false;
        if (other.getFilterPredicate() != null && other.getFilterPredicate().equals(this.getFilterPredicate()) == false)
            return false;
        if (other.getPartitionColumn() == null ^ this.getPartitionColumn() == null)
            return false;
        if (other.getPartitionColumn() != null && other.getPartitionColumn().equals(this.getPartitionColumn()) == false)
            return false;
        if (other.getLowerBound() == null ^ this.getLowerBound() == null)
            return false;
        if (other.getLowerBound() != null && other.getLowerBound().equals(this.getLowerBound()) == false)
            return false;
        if (other.getUpperBound() == null ^ this.getUpperBound() == null)
            return false;
        if (other.getUpperBound() != null && other.getUpperBound().equals(this.getUpperBound()) == false)
            return false;
        if (other.getNumPartitions() == null ^ this.getNumPartitions() == null)
            return false;
        if (other.getNumPartitions() != null && other.getNumPartitions().equals(this.getNumPartitions()) == false)
            return false;
        if (other.getJobBookmarkKeys() == null ^ this.getJobBookmarkKeys() == null)
            return false;
        if (other.getJobBookmarkKeys() != null && other.getJobBookmarkKeys().equals(this.getJobBookmarkKeys()) == false)
            return false;
        if (other.getJobBookmarkKeysSortOrder() == null ^ this.getJobBookmarkKeysSortOrder() == null)
            return false;
        if (other.getJobBookmarkKeysSortOrder() != null && other.getJobBookmarkKeysSortOrder().equals(this.getJobBookmarkKeysSortOrder()) == false)
            return false;
        if (other.getDataTypeMapping() == null ^ this.getDataTypeMapping() == null)
            return false;
        if (other.getDataTypeMapping() != null && other.getDataTypeMapping().equals(this.getDataTypeMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterPredicate() == null) ? 0 : getFilterPredicate().hashCode());
        hashCode = prime * hashCode + ((getPartitionColumn() == null) ? 0 : getPartitionColumn().hashCode());
        hashCode = prime * hashCode + ((getLowerBound() == null) ? 0 : getLowerBound().hashCode());
        hashCode = prime * hashCode + ((getUpperBound() == null) ? 0 : getUpperBound().hashCode());
        hashCode = prime * hashCode + ((getNumPartitions() == null) ? 0 : getNumPartitions().hashCode());
        hashCode = prime * hashCode + ((getJobBookmarkKeys() == null) ? 0 : getJobBookmarkKeys().hashCode());
        hashCode = prime * hashCode + ((getJobBookmarkKeysSortOrder() == null) ? 0 : getJobBookmarkKeysSortOrder().hashCode());
        hashCode = prime * hashCode + ((getDataTypeMapping() == null) ? 0 : getDataTypeMapping().hashCode());
        return hashCode;
    }

    @Override
    public JDBCConnectorOptions clone() {
        try {
            return (JDBCConnectorOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JDBCConnectorOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
