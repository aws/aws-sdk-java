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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/WriteRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the Timesream table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A record containing the common measure and dimension attributes shared across all the records in the request. The
     * measure and dimension attributes specified in here will be merged with the measure and dimension attributes in
     * the records object when the data is written into Timestream.
     * </p>
     */
    private Record commonAttributes;
    /**
     * <p>
     * An array of records containing the unique dimension and measure attributes for each time series data point.
     * </p>
     */
    private java.util.List<Record> records;

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRecordsRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the Timesream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timesream table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the Timesream table.
     * </p>
     * 
     * @return The name of the Timesream table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the Timesream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timesream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRecordsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A record containing the common measure and dimension attributes shared across all the records in the request. The
     * measure and dimension attributes specified in here will be merged with the measure and dimension attributes in
     * the records object when the data is written into Timestream.
     * </p>
     * 
     * @param commonAttributes
     *        A record containing the common measure and dimension attributes shared across all the records in the
     *        request. The measure and dimension attributes specified in here will be merged with the measure and
     *        dimension attributes in the records object when the data is written into Timestream.
     */

    public void setCommonAttributes(Record commonAttributes) {
        this.commonAttributes = commonAttributes;
    }

    /**
     * <p>
     * A record containing the common measure and dimension attributes shared across all the records in the request. The
     * measure and dimension attributes specified in here will be merged with the measure and dimension attributes in
     * the records object when the data is written into Timestream.
     * </p>
     * 
     * @return A record containing the common measure and dimension attributes shared across all the records in the
     *         request. The measure and dimension attributes specified in here will be merged with the measure and
     *         dimension attributes in the records object when the data is written into Timestream.
     */

    public Record getCommonAttributes() {
        return this.commonAttributes;
    }

    /**
     * <p>
     * A record containing the common measure and dimension attributes shared across all the records in the request. The
     * measure and dimension attributes specified in here will be merged with the measure and dimension attributes in
     * the records object when the data is written into Timestream.
     * </p>
     * 
     * @param commonAttributes
     *        A record containing the common measure and dimension attributes shared across all the records in the
     *        request. The measure and dimension attributes specified in here will be merged with the measure and
     *        dimension attributes in the records object when the data is written into Timestream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRecordsRequest withCommonAttributes(Record commonAttributes) {
        setCommonAttributes(commonAttributes);
        return this;
    }

    /**
     * <p>
     * An array of records containing the unique dimension and measure attributes for each time series data point.
     * </p>
     * 
     * @return An array of records containing the unique dimension and measure attributes for each time series data
     *         point.
     */

    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of records containing the unique dimension and measure attributes for each time series data point.
     * </p>
     * 
     * @param records
     *        An array of records containing the unique dimension and measure attributes for each time series data
     *        point.
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
     * An array of records containing the unique dimension and measure attributes for each time series data point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of records containing the unique dimension and measure attributes for each time series data
     *        point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRecordsRequest withRecords(Record... records) {
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
     * An array of records containing the unique dimension and measure attributes for each time series data point.
     * </p>
     * 
     * @param records
     *        An array of records containing the unique dimension and measure attributes for each time series data
     *        point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRecordsRequest withRecords(java.util.Collection<Record> records) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getCommonAttributes() != null)
            sb.append("CommonAttributes: ").append(getCommonAttributes()).append(",");
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

        if (obj instanceof WriteRecordsRequest == false)
            return false;
        WriteRecordsRequest other = (WriteRecordsRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCommonAttributes() == null ^ this.getCommonAttributes() == null)
            return false;
        if (other.getCommonAttributes() != null && other.getCommonAttributes().equals(this.getCommonAttributes()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getCommonAttributes() == null) ? 0 : getCommonAttributes().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public WriteRecordsRequest clone() {
        return (WriteRecordsRequest) super.clone();
    }

}
