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
 * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GovernedCatalogTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GovernedCatalogTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     */
    private java.util.List<java.util.List<String>> partitionKeys;
    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     */
    private String table;
    /**
     * <p>
     * The name of the database to write to.
     * </p>
     */
    private String database;
    /**
     * <p>
     * A policy that specifies update behavior for the governed catalog.
     * </p>
     */
    private CatalogSchemaChangePolicy schemaChangePolicy;

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @return The name of the data target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @return The nodes that are inputs to the data target.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @return Specifies native partitioning using a sequence of keys.
     */

    public java.util.List<java.util.List<String>> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     */

    public void setPartitionKeys(java.util.Collection<java.util.List<String>> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<java.util.List<String>>(partitionKeys);
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withPartitionKeys(java.util.List<String>... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<java.util.List<String>>(partitionKeys.length));
        }
        for (java.util.List<String> ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withPartitionKeys(java.util.Collection<java.util.List<String>> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to write to.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @return The name of the table in the database to write to.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The name of the table in the database to write to.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @param database
     *        The name of the database to write to.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @return The name of the database to write to.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database to write to.
     * </p>
     * 
     * @param database
     *        The name of the database to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the governed catalog.
     * </p>
     * 
     * @param schemaChangePolicy
     *        A policy that specifies update behavior for the governed catalog.
     */

    public void setSchemaChangePolicy(CatalogSchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the governed catalog.
     * </p>
     * 
     * @return A policy that specifies update behavior for the governed catalog.
     */

    public CatalogSchemaChangePolicy getSchemaChangePolicy() {
        return this.schemaChangePolicy;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the governed catalog.
     * </p>
     * 
     * @param schemaChangePolicy
     *        A policy that specifies update behavior for the governed catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GovernedCatalogTarget withSchemaChangePolicy(CatalogSchemaChangePolicy schemaChangePolicy) {
        setSchemaChangePolicy(schemaChangePolicy);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: ").append(getSchemaChangePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GovernedCatalogTarget == false)
            return false;
        GovernedCatalogTarget other = (GovernedCatalogTarget) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
        return hashCode;
    }

    @Override
    public GovernedCatalogTarget clone() {
        try {
            return (GovernedCatalogTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.GovernedCatalogTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
