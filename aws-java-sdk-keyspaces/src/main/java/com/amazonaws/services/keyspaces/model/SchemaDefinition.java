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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the schema of the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/SchemaDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The regular columns of the table.
     * </p>
     */
    private java.util.List<ColumnDefinition> allColumns;
    /**
     * <p>
     * The columns that are part of the partition key of the table .
     * </p>
     */
    private java.util.List<PartitionKey> partitionKeys;
    /**
     * <p>
     * The columns that are part of the clustering key of the table.
     * </p>
     */
    private java.util.List<ClusteringKey> clusteringKeys;
    /**
     * <p>
     * The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by all
     * rows in the same partition.
     * </p>
     */
    private java.util.List<StaticColumn> staticColumns;

    /**
     * <p>
     * The regular columns of the table.
     * </p>
     * 
     * @return The regular columns of the table.
     */

    public java.util.List<ColumnDefinition> getAllColumns() {
        return allColumns;
    }

    /**
     * <p>
     * The regular columns of the table.
     * </p>
     * 
     * @param allColumns
     *        The regular columns of the table.
     */

    public void setAllColumns(java.util.Collection<ColumnDefinition> allColumns) {
        if (allColumns == null) {
            this.allColumns = null;
            return;
        }

        this.allColumns = new java.util.ArrayList<ColumnDefinition>(allColumns);
    }

    /**
     * <p>
     * The regular columns of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllColumns(java.util.Collection)} or {@link #withAllColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allColumns
     *        The regular columns of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withAllColumns(ColumnDefinition... allColumns) {
        if (this.allColumns == null) {
            setAllColumns(new java.util.ArrayList<ColumnDefinition>(allColumns.length));
        }
        for (ColumnDefinition ele : allColumns) {
            this.allColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regular columns of the table.
     * </p>
     * 
     * @param allColumns
     *        The regular columns of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withAllColumns(java.util.Collection<ColumnDefinition> allColumns) {
        setAllColumns(allColumns);
        return this;
    }

    /**
     * <p>
     * The columns that are part of the partition key of the table .
     * </p>
     * 
     * @return The columns that are part of the partition key of the table .
     */

    public java.util.List<PartitionKey> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * The columns that are part of the partition key of the table .
     * </p>
     * 
     * @param partitionKeys
     *        The columns that are part of the partition key of the table .
     */

    public void setPartitionKeys(java.util.Collection<PartitionKey> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<PartitionKey>(partitionKeys);
    }

    /**
     * <p>
     * The columns that are part of the partition key of the table .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        The columns that are part of the partition key of the table .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withPartitionKeys(PartitionKey... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<PartitionKey>(partitionKeys.length));
        }
        for (PartitionKey ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that are part of the partition key of the table .
     * </p>
     * 
     * @param partitionKeys
     *        The columns that are part of the partition key of the table .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withPartitionKeys(java.util.Collection<PartitionKey> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * The columns that are part of the clustering key of the table.
     * </p>
     * 
     * @return The columns that are part of the clustering key of the table.
     */

    public java.util.List<ClusteringKey> getClusteringKeys() {
        return clusteringKeys;
    }

    /**
     * <p>
     * The columns that are part of the clustering key of the table.
     * </p>
     * 
     * @param clusteringKeys
     *        The columns that are part of the clustering key of the table.
     */

    public void setClusteringKeys(java.util.Collection<ClusteringKey> clusteringKeys) {
        if (clusteringKeys == null) {
            this.clusteringKeys = null;
            return;
        }

        this.clusteringKeys = new java.util.ArrayList<ClusteringKey>(clusteringKeys);
    }

    /**
     * <p>
     * The columns that are part of the clustering key of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusteringKeys(java.util.Collection)} or {@link #withClusteringKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clusteringKeys
     *        The columns that are part of the clustering key of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withClusteringKeys(ClusteringKey... clusteringKeys) {
        if (this.clusteringKeys == null) {
            setClusteringKeys(new java.util.ArrayList<ClusteringKey>(clusteringKeys.length));
        }
        for (ClusteringKey ele : clusteringKeys) {
            this.clusteringKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that are part of the clustering key of the table.
     * </p>
     * 
     * @param clusteringKeys
     *        The columns that are part of the clustering key of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withClusteringKeys(java.util.Collection<ClusteringKey> clusteringKeys) {
        setClusteringKeys(clusteringKeys);
        return this;
    }

    /**
     * <p>
     * The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by all
     * rows in the same partition.
     * </p>
     * 
     * @return The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by
     *         all rows in the same partition.
     */

    public java.util.List<StaticColumn> getStaticColumns() {
        return staticColumns;
    }

    /**
     * <p>
     * The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by all
     * rows in the same partition.
     * </p>
     * 
     * @param staticColumns
     *        The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by
     *        all rows in the same partition.
     */

    public void setStaticColumns(java.util.Collection<StaticColumn> staticColumns) {
        if (staticColumns == null) {
            this.staticColumns = null;
            return;
        }

        this.staticColumns = new java.util.ArrayList<StaticColumn>(staticColumns);
    }

    /**
     * <p>
     * The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by all
     * rows in the same partition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticColumns(java.util.Collection)} or {@link #withStaticColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param staticColumns
     *        The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by
     *        all rows in the same partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withStaticColumns(StaticColumn... staticColumns) {
        if (this.staticColumns == null) {
            setStaticColumns(new java.util.ArrayList<StaticColumn>(staticColumns.length));
        }
        for (StaticColumn ele : staticColumns) {
            this.staticColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by all
     * rows in the same partition.
     * </p>
     * 
     * @param staticColumns
     *        The columns that have been defined as <code>STATIC</code>. Static columns store values that are shared by
     *        all rows in the same partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withStaticColumns(java.util.Collection<StaticColumn> staticColumns) {
        setStaticColumns(staticColumns);
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
        if (getAllColumns() != null)
            sb.append("AllColumns: ").append(getAllColumns()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getClusteringKeys() != null)
            sb.append("ClusteringKeys: ").append(getClusteringKeys()).append(",");
        if (getStaticColumns() != null)
            sb.append("StaticColumns: ").append(getStaticColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaDefinition == false)
            return false;
        SchemaDefinition other = (SchemaDefinition) obj;
        if (other.getAllColumns() == null ^ this.getAllColumns() == null)
            return false;
        if (other.getAllColumns() != null && other.getAllColumns().equals(this.getAllColumns()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getClusteringKeys() == null ^ this.getClusteringKeys() == null)
            return false;
        if (other.getClusteringKeys() != null && other.getClusteringKeys().equals(this.getClusteringKeys()) == false)
            return false;
        if (other.getStaticColumns() == null ^ this.getStaticColumns() == null)
            return false;
        if (other.getStaticColumns() != null && other.getStaticColumns().equals(this.getStaticColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllColumns() == null) ? 0 : getAllColumns().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getClusteringKeys() == null) ? 0 : getClusteringKeys().hashCode());
        hashCode = prime * hashCode + ((getStaticColumns() == null) ? 0 : getStaticColumns().hashCode());
        return hashCode;
    }

    @Override
    public SchemaDefinition clone() {
        try {
            return (SchemaDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.SchemaDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
