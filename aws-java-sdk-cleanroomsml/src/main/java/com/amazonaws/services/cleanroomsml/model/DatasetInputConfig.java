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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Glue data source and schema mapping information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DatasetInputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A DataSource object that specifies the Glue data source for the training data.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The schema information for the training data.
     * </p>
     */
    private java.util.List<ColumnSchema> schema;

    /**
     * <p>
     * A DataSource object that specifies the Glue data source for the training data.
     * </p>
     * 
     * @param dataSource
     *        A DataSource object that specifies the Glue data source for the training data.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * A DataSource object that specifies the Glue data source for the training data.
     * </p>
     * 
     * @return A DataSource object that specifies the Glue data source for the training data.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * A DataSource object that specifies the Glue data source for the training data.
     * </p>
     * 
     * @param dataSource
     *        A DataSource object that specifies the Glue data source for the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputConfig withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The schema information for the training data.
     * </p>
     * 
     * @return The schema information for the training data.
     */

    public java.util.List<ColumnSchema> getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema information for the training data.
     * </p>
     * 
     * @param schema
     *        The schema information for the training data.
     */

    public void setSchema(java.util.Collection<ColumnSchema> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<ColumnSchema>(schema);
    }

    /**
     * <p>
     * The schema information for the training data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchema(java.util.Collection)} or {@link #withSchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param schema
     *        The schema information for the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputConfig withSchema(ColumnSchema... schema) {
        if (this.schema == null) {
            setSchema(new java.util.ArrayList<ColumnSchema>(schema.length));
        }
        for (ColumnSchema ele : schema) {
            this.schema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schema information for the training data.
     * </p>
     * 
     * @param schema
     *        The schema information for the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputConfig withSchema(java.util.Collection<ColumnSchema> schema) {
        setSchema(schema);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetInputConfig == false)
            return false;
        DatasetInputConfig other = (DatasetInputConfig) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public DatasetInputConfig clone() {
        try {
            return (DatasetInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.DatasetInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
