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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A descriptor for a partition index in a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PartitionIndexDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartitionIndexDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the partition index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * </p>
     */
    private java.util.List<KeySchemaElement> keys;
    /**
     * <p>
     * The status of the partition index.
     * </p>
     * <p>
     * The possible statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The index creation succeeds.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: The index creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The index is deleted from the list of indexes.
     * </p>
     * </li>
     * </ul>
     */
    private String indexStatus;
    /**
     * <p>
     * A list of errors that can occur when registering partition indexes for an existing table.
     * </p>
     */
    private java.util.List<BackfillError> backfillErrors;

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @return The name of the partition index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the partition index.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndexDescriptor withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * </p>
     * 
     * @return A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     */

    public java.util.List<KeySchemaElement> getKeys() {
        return keys;
    }

    /**
     * <p>
     * A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * </p>
     * 
     * @param keys
     *        A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     */

    public void setKeys(java.util.Collection<KeySchemaElement> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<KeySchemaElement>(keys);
    }

    /**
     * <p>
     * A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndexDescriptor withKeys(KeySchemaElement... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<KeySchemaElement>(keys.length));
        }
        for (KeySchemaElement ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * </p>
     * 
     * @param keys
     *        A list of one or more keys, as <code>KeySchemaElement</code> structures, for the partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndexDescriptor withKeys(java.util.Collection<KeySchemaElement> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The status of the partition index.
     * </p>
     * <p>
     * The possible statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The index creation succeeds.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: The index creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The index is deleted from the list of indexes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The status of the partition index. </p>
     *        <p>
     *        The possible statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot
     *        be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The index creation succeeds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: The index creation fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The index is deleted from the list of indexes.
     *        </p>
     *        </li>
     * @see PartitionIndexStatus
     */

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The status of the partition index.
     * </p>
     * <p>
     * The possible statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The index creation succeeds.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: The index creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The index is deleted from the list of indexes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the partition index. </p>
     *         <p>
     *         The possible statuses are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot
     *         be deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE: The index creation succeeds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED: The index creation fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING: The index is deleted from the list of indexes.
     *         </p>
     *         </li>
     * @see PartitionIndexStatus
     */

    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * <p>
     * The status of the partition index.
     * </p>
     * <p>
     * The possible statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The index creation succeeds.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: The index creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The index is deleted from the list of indexes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The status of the partition index. </p>
     *        <p>
     *        The possible statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot
     *        be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The index creation succeeds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: The index creation fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The index is deleted from the list of indexes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionIndexStatus
     */

    public PartitionIndexDescriptor withIndexStatus(String indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * The status of the partition index.
     * </p>
     * <p>
     * The possible statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE: The index creation succeeds.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: The index creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING: The index is deleted from the list of indexes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The status of the partition index. </p>
     *        <p>
     *        The possible statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot
     *        be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE: The index creation succeeds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: The index creation fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING: The index is deleted from the list of indexes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionIndexStatus
     */

    public PartitionIndexDescriptor withIndexStatus(PartitionIndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of errors that can occur when registering partition indexes for an existing table.
     * </p>
     * 
     * @return A list of errors that can occur when registering partition indexes for an existing table.
     */

    public java.util.List<BackfillError> getBackfillErrors() {
        return backfillErrors;
    }

    /**
     * <p>
     * A list of errors that can occur when registering partition indexes for an existing table.
     * </p>
     * 
     * @param backfillErrors
     *        A list of errors that can occur when registering partition indexes for an existing table.
     */

    public void setBackfillErrors(java.util.Collection<BackfillError> backfillErrors) {
        if (backfillErrors == null) {
            this.backfillErrors = null;
            return;
        }

        this.backfillErrors = new java.util.ArrayList<BackfillError>(backfillErrors);
    }

    /**
     * <p>
     * A list of errors that can occur when registering partition indexes for an existing table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackfillErrors(java.util.Collection)} or {@link #withBackfillErrors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param backfillErrors
     *        A list of errors that can occur when registering partition indexes for an existing table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndexDescriptor withBackfillErrors(BackfillError... backfillErrors) {
        if (this.backfillErrors == null) {
            setBackfillErrors(new java.util.ArrayList<BackfillError>(backfillErrors.length));
        }
        for (BackfillError ele : backfillErrors) {
            this.backfillErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors that can occur when registering partition indexes for an existing table.
     * </p>
     * 
     * @param backfillErrors
     *        A list of errors that can occur when registering partition indexes for an existing table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionIndexDescriptor withBackfillErrors(java.util.Collection<BackfillError> backfillErrors) {
        setBackfillErrors(backfillErrors);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getIndexStatus() != null)
            sb.append("IndexStatus: ").append(getIndexStatus()).append(",");
        if (getBackfillErrors() != null)
            sb.append("BackfillErrors: ").append(getBackfillErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartitionIndexDescriptor == false)
            return false;
        PartitionIndexDescriptor other = (PartitionIndexDescriptor) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getBackfillErrors() == null ^ this.getBackfillErrors() == null)
            return false;
        if (other.getBackfillErrors() != null && other.getBackfillErrors().equals(this.getBackfillErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime * hashCode + ((getBackfillErrors() == null) ? 0 : getBackfillErrors().hashCode());
        return hashCode;
    }

    @Override
    public PartitionIndexDescriptor clone() {
        try {
            return (PartitionIndexDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PartitionIndexDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
