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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteObjectsOnCancel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteObjectsOnCancelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Glue data catalog that contains the governed table. Defaults to the current account ID.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database that contains the governed table.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the governed table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * ID of the transaction that the writes occur in.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     * cancels.
     * </p>
     */
    private java.util.List<VirtualObject> objects;

    /**
     * <p>
     * The Glue data catalog that contains the governed table. Defaults to the current account ID.
     * </p>
     * 
     * @param catalogId
     *        The Glue data catalog that contains the governed table. Defaults to the current account ID.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The Glue data catalog that contains the governed table. Defaults to the current account ID.
     * </p>
     * 
     * @return The Glue data catalog that contains the governed table. Defaults to the current account ID.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The Glue data catalog that contains the governed table. Defaults to the current account ID.
     * </p>
     * 
     * @param catalogId
     *        The Glue data catalog that contains the governed table. Defaults to the current account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database that contains the governed table.
     * </p>
     * 
     * @param databaseName
     *        The database that contains the governed table.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database that contains the governed table.
     * </p>
     * 
     * @return The database that contains the governed table.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database that contains the governed table.
     * </p>
     * 
     * @param databaseName
     *        The database that contains the governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the governed table.
     * </p>
     * 
     * @param tableName
     *        The name of the governed table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the governed table.
     * </p>
     * 
     * @return The name of the governed table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the governed table.
     * </p>
     * 
     * @param tableName
     *        The name of the governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * ID of the transaction that the writes occur in.
     * </p>
     * 
     * @param transactionId
     *        ID of the transaction that the writes occur in.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * ID of the transaction that the writes occur in.
     * </p>
     * 
     * @return ID of the transaction that the writes occur in.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * ID of the transaction that the writes occur in.
     * </p>
     * 
     * @param transactionId
     *        ID of the transaction that the writes occur in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     * cancels.
     * </p>
     * 
     * @return A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the
     *         transaction cancels.
     */

    public java.util.List<VirtualObject> getObjects() {
        return objects;
    }

    /**
     * <p>
     * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     * cancels.
     * </p>
     * 
     * @param objects
     *        A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     *        cancels.
     */

    public void setObjects(java.util.Collection<VirtualObject> objects) {
        if (objects == null) {
            this.objects = null;
            return;
        }

        this.objects = new java.util.ArrayList<VirtualObject>(objects);
    }

    /**
     * <p>
     * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     * cancels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjects(java.util.Collection)} or {@link #withObjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param objects
     *        A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     *        cancels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withObjects(VirtualObject... objects) {
        if (this.objects == null) {
            setObjects(new java.util.ArrayList<VirtualObject>(objects.length));
        }
        for (VirtualObject ele : objects) {
            this.objects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     * cancels.
     * </p>
     * 
     * @param objects
     *        A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction
     *        cancels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectsOnCancelRequest withObjects(java.util.Collection<VirtualObject> objects) {
        setObjects(objects);
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
        if (getObjects() != null)
            sb.append("Objects: ").append(getObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectsOnCancelRequest == false)
            return false;
        DeleteObjectsOnCancelRequest other = (DeleteObjectsOnCancelRequest) obj;
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
        if (other.getObjects() == null ^ this.getObjects() == null)
            return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false)
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
        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode());
        return hashCode;
    }

    @Override
    public DeleteObjectsOnCancelRequest clone() {
        return (DeleteObjectsOnCancelRequest) super.clone();
    }

}
