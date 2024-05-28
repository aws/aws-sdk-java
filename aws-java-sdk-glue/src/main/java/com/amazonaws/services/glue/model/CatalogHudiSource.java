/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a Hudi data source that is registered in the Glue Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CatalogHudiSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogHudiSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Hudi data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the database to read from.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     */
    private String table;
    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     */
    private java.util.Map<String, String> additionalHudiOptions;
    /**
     * <p>
     * Specifies the data schema for the Hudi source.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the Hudi data source.
     * </p>
     * 
     * @param name
     *        The name of the Hudi data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Hudi data source.
     * </p>
     * 
     * @return The name of the Hudi data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Hudi data source.
     * </p>
     * 
     * @param name
     *        The name of the Hudi data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @return The name of the database to read from.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @return The name of the table in the database to read from.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @return Specifies additional connection options.
     */

    public java.util.Map<String, String> getAdditionalHudiOptions() {
        return additionalHudiOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalHudiOptions
     *        Specifies additional connection options.
     */

    public void setAdditionalHudiOptions(java.util.Map<String, String> additionalHudiOptions) {
        this.additionalHudiOptions = additionalHudiOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalHudiOptions
     *        Specifies additional connection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withAdditionalHudiOptions(java.util.Map<String, String> additionalHudiOptions) {
        setAdditionalHudiOptions(additionalHudiOptions);
        return this;
    }

    /**
     * Add a single AdditionalHudiOptions entry
     *
     * @see CatalogHudiSource#withAdditionalHudiOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource addAdditionalHudiOptionsEntry(String key, String value) {
        if (null == this.additionalHudiOptions) {
            this.additionalHudiOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalHudiOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalHudiOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalHudiOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource clearAdditionalHudiOptionsEntries() {
        this.additionalHudiOptions = null;
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the Hudi source.
     * </p>
     * 
     * @return Specifies the data schema for the Hudi source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the Hudi source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Hudi source.
     */

    public void setOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        if (outputSchemas == null) {
            this.outputSchemas = null;
            return;
        }

        this.outputSchemas = new java.util.ArrayList<GlueSchema>(outputSchemas);
    }

    /**
     * <p>
     * Specifies the data schema for the Hudi source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Hudi source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withOutputSchemas(GlueSchema... outputSchemas) {
        if (this.outputSchemas == null) {
            setOutputSchemas(new java.util.ArrayList<GlueSchema>(outputSchemas.length));
        }
        for (GlueSchema ele : outputSchemas) {
            this.outputSchemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the Hudi source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Hudi source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogHudiSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        setOutputSchemas(outputSchemas);
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
        if (getAdditionalHudiOptions() != null)
            sb.append("AdditionalHudiOptions: ").append(getAdditionalHudiOptions()).append(",");
        if (getOutputSchemas() != null)
            sb.append("OutputSchemas: ").append(getOutputSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogHudiSource == false)
            return false;
        CatalogHudiSource other = (CatalogHudiSource) obj;
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
        if (other.getAdditionalHudiOptions() == null ^ this.getAdditionalHudiOptions() == null)
            return false;
        if (other.getAdditionalHudiOptions() != null && other.getAdditionalHudiOptions().equals(this.getAdditionalHudiOptions()) == false)
            return false;
        if (other.getOutputSchemas() == null ^ this.getOutputSchemas() == null)
            return false;
        if (other.getOutputSchemas() != null && other.getOutputSchemas().equals(this.getOutputSchemas()) == false)
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
        hashCode = prime * hashCode + ((getAdditionalHudiOptions() == null) ? 0 : getAdditionalHudiOptions().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public CatalogHudiSource clone() {
        try {
            return (CatalogHudiSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CatalogHudiSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
