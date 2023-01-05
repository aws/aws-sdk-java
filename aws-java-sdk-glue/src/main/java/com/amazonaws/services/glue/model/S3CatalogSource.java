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
 * Specifies an Amazon S3 data store in the Glue Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3CatalogSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CatalogSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The database to read from.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database table to read from.
     * </p>
     */
    private String table;
    /**
     * <p>
     * Partitions satisfying this predicate are deleted. Files within the retention period in these partitions are not
     * deleted. Set to <code>""</code> – empty by default.
     * </p>
     */
    private String partitionPredicate;
    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     */
    private S3SourceAdditionalOptions additionalOptions;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CatalogSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @param database
     *        The database to read from.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @return The database to read from.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database to read from.
     * </p>
     * 
     * @param database
     *        The database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CatalogSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param table
     *        The database table to read from.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @return The database table to read from.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param table
     *        The database table to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CatalogSource withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * Partitions satisfying this predicate are deleted. Files within the retention period in these partitions are not
     * deleted. Set to <code>""</code> – empty by default.
     * </p>
     * 
     * @param partitionPredicate
     *        Partitions satisfying this predicate are deleted. Files within the retention period in these partitions
     *        are not deleted. Set to <code>""</code> – empty by default.
     */

    public void setPartitionPredicate(String partitionPredicate) {
        this.partitionPredicate = partitionPredicate;
    }

    /**
     * <p>
     * Partitions satisfying this predicate are deleted. Files within the retention period in these partitions are not
     * deleted. Set to <code>""</code> – empty by default.
     * </p>
     * 
     * @return Partitions satisfying this predicate are deleted. Files within the retention period in these partitions
     *         are not deleted. Set to <code>""</code> – empty by default.
     */

    public String getPartitionPredicate() {
        return this.partitionPredicate;
    }

    /**
     * <p>
     * Partitions satisfying this predicate are deleted. Files within the retention period in these partitions are not
     * deleted. Set to <code>""</code> – empty by default.
     * </p>
     * 
     * @param partitionPredicate
     *        Partitions satisfying this predicate are deleted. Files within the retention period in these partitions
     *        are not deleted. Set to <code>""</code> – empty by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CatalogSource withPartitionPredicate(String partitionPredicate) {
        setPartitionPredicate(partitionPredicate);
        return this;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options.
     */

    public void setAdditionalOptions(S3SourceAdditionalOptions additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @return Specifies additional connection options.
     */

    public S3SourceAdditionalOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CatalogSource withAdditionalOptions(S3SourceAdditionalOptions additionalOptions) {
        setAdditionalOptions(additionalOptions);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getPartitionPredicate() != null)
            sb.append("PartitionPredicate: ").append(getPartitionPredicate()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3CatalogSource == false)
            return false;
        S3CatalogSource other = (S3CatalogSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getPartitionPredicate() == null ^ this.getPartitionPredicate() == null)
            return false;
        if (other.getPartitionPredicate() != null && other.getPartitionPredicate().equals(this.getPartitionPredicate()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getPartitionPredicate() == null) ? 0 : getPartitionPredicate().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        return hashCode;
    }

    @Override
    public S3CatalogSource clone() {
        try {
            return (S3CatalogSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3CatalogSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
