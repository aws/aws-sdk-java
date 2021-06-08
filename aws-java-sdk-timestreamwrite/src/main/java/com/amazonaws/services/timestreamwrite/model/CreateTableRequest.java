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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The duration for which your time series data must be stored in the memory store and the magnetic store.
     * </p>
     */
    private RetentionProperties retentionProperties;
    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @return The name of the Timestream table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The duration for which your time series data must be stored in the memory store and the magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The duration for which your time series data must be stored in the memory store and the magnetic store.
     */

    public void setRetentionProperties(RetentionProperties retentionProperties) {
        this.retentionProperties = retentionProperties;
    }

    /**
     * <p>
     * The duration for which your time series data must be stored in the memory store and the magnetic store.
     * </p>
     * 
     * @return The duration for which your time series data must be stored in the memory store and the magnetic store.
     */

    public RetentionProperties getRetentionProperties() {
        return this.retentionProperties;
    }

    /**
     * <p>
     * The duration for which your time series data must be stored in the memory store and the magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The duration for which your time series data must be stored in the memory store and the magnetic store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withRetentionProperties(RetentionProperties retentionProperties) {
        setRetentionProperties(retentionProperties);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @return A list of key-value pairs to label the table.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the table.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRetentionProperties() != null)
            sb.append("RetentionProperties: ").append(getRetentionProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTableRequest == false)
            return false;
        CreateTableRequest other = (CreateTableRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRetentionProperties() == null ^ this.getRetentionProperties() == null)
            return false;
        if (other.getRetentionProperties() != null && other.getRetentionProperties().equals(this.getRetentionProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getRetentionProperties() == null) ? 0 : getRetentionProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTableRequest clone() {
        return (CreateTableRequest) super.clone();
    }

}
