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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableObjects" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableObjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog containing the governed table to update. Defaults to the caller’s account ID.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database containing the governed table to update.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The governed table to update.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The transaction at which to do the write.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest for a
     * governed table.
     * </p>
     */
    private java.util.List<WriteOperation> writeOperations;

    /**
     * <p>
     * The catalog containing the governed table to update. Defaults to the caller’s account ID.
     * </p>
     * 
     * @param catalogId
     *        The catalog containing the governed table to update. Defaults to the caller’s account ID.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog containing the governed table to update. Defaults to the caller’s account ID.
     * </p>
     * 
     * @return The catalog containing the governed table to update. Defaults to the caller’s account ID.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog containing the governed table to update. Defaults to the caller’s account ID.
     * </p>
     * 
     * @param catalogId
     *        The catalog containing the governed table to update. Defaults to the caller’s account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database containing the governed table to update.
     * </p>
     * 
     * @param databaseName
     *        The database containing the governed table to update.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database containing the governed table to update.
     * </p>
     * 
     * @return The database containing the governed table to update.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database containing the governed table to update.
     * </p>
     * 
     * @param databaseName
     *        The database containing the governed table to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The governed table to update.
     * </p>
     * 
     * @param tableName
     *        The governed table to update.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The governed table to update.
     * </p>
     * 
     * @return The governed table to update.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The governed table to update.
     * </p>
     * 
     * @param tableName
     *        The governed table to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The transaction at which to do the write.
     * </p>
     * 
     * @param transactionId
     *        The transaction at which to do the write.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction at which to do the write.
     * </p>
     * 
     * @return The transaction at which to do the write.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction at which to do the write.
     * </p>
     * 
     * @param transactionId
     *        The transaction at which to do the write.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest for a
     * governed table.
     * </p>
     * 
     * @return A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest
     *         for a governed table.
     */

    public java.util.List<WriteOperation> getWriteOperations() {
        return writeOperations;
    }

    /**
     * <p>
     * A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest for a
     * governed table.
     * </p>
     * 
     * @param writeOperations
     *        A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest
     *        for a governed table.
     */

    public void setWriteOperations(java.util.Collection<WriteOperation> writeOperations) {
        if (writeOperations == null) {
            this.writeOperations = null;
            return;
        }

        this.writeOperations = new java.util.ArrayList<WriteOperation>(writeOperations);
    }

    /**
     * <p>
     * A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest for a
     * governed table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWriteOperations(java.util.Collection)} or {@link #withWriteOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param writeOperations
     *        A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest
     *        for a governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withWriteOperations(WriteOperation... writeOperations) {
        if (this.writeOperations == null) {
            setWriteOperations(new java.util.ArrayList<WriteOperation>(writeOperations.length));
        }
        for (WriteOperation ele : writeOperations) {
            this.writeOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest for a
     * governed table.
     * </p>
     * 
     * @param writeOperations
     *        A list of <code>WriteOperation</code> objects that define an object to add to or delete from the manifest
     *        for a governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableObjectsRequest withWriteOperations(java.util.Collection<WriteOperation> writeOperations) {
        setWriteOperations(writeOperations);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getWriteOperations() != null)
            sb.append("WriteOperations: ").append(getWriteOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableObjectsRequest == false)
            return false;
        UpdateTableObjectsRequest other = (UpdateTableObjectsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getWriteOperations() == null ^ this.getWriteOperations() == null)
            return false;
        if (other.getWriteOperations() != null && other.getWriteOperations().equals(this.getWriteOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getWriteOperations() == null) ? 0 : getWriteOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableObjectsRequest clone() {
        return (UpdateTableObjectsRequest) super.clone();
    }

}
