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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the introspected data that was retrieved from the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DataSourceIntrospectionModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceIntrospectionModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model. For example, this could be the name of a single table in a database.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>DataSourceIntrospectionModelField</code> object data.
     * </p>
     */
    private java.util.List<DataSourceIntrospectionModelField> fields;
    /**
     * <p>
     * The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     * </p>
     */
    private DataSourceIntrospectionModelIndex primaryKey;
    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * </p>
     */
    private java.util.List<DataSourceIntrospectionModelIndex> indexes;
    /**
     * <p>
     * Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     * <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     * </p>
     */
    private String sdl;

    /**
     * <p>
     * The name of the model. For example, this could be the name of a single table in a database.
     * </p>
     * 
     * @param name
     *        The name of the model. For example, this could be the name of a single table in a database.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the model. For example, this could be the name of a single table in a database.
     * </p>
     * 
     * @return The name of the model. For example, this could be the name of a single table in a database.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the model. For example, this could be the name of a single table in a database.
     * </p>
     * 
     * @param name
     *        The name of the model. For example, this could be the name of a single table in a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelField</code> object data.
     * </p>
     * 
     * @return The <code>DataSourceIntrospectionModelField</code> object data.
     */

    public java.util.List<DataSourceIntrospectionModelField> getFields() {
        return fields;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelField</code> object data.
     * </p>
     * 
     * @param fields
     *        The <code>DataSourceIntrospectionModelField</code> object data.
     */

    public void setFields(java.util.Collection<DataSourceIntrospectionModelField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<DataSourceIntrospectionModelField>(fields);
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelField</code> object data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        The <code>DataSourceIntrospectionModelField</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withFields(DataSourceIntrospectionModelField... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<DataSourceIntrospectionModelField>(fields.length));
        }
        for (DataSourceIntrospectionModelField ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelField</code> object data.
     * </p>
     * 
     * @param fields
     *        The <code>DataSourceIntrospectionModelField</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withFields(java.util.Collection<DataSourceIntrospectionModelField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     * </p>
     * 
     * @param primaryKey
     *        The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     */

    public void setPrimaryKey(DataSourceIntrospectionModelIndex primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * <p>
     * The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     * </p>
     * 
     * @return The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     */

    public DataSourceIntrospectionModelIndex getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * <p>
     * The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     * </p>
     * 
     * @param primaryKey
     *        The primary key stored as a <code>DataSourceIntrospectionModelIndex</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withPrimaryKey(DataSourceIntrospectionModelIndex primaryKey) {
        setPrimaryKey(primaryKey);
        return this;
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * </p>
     * 
     * @return The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     */

    public java.util.List<DataSourceIntrospectionModelIndex> getIndexes() {
        return indexes;
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * </p>
     * 
     * @param indexes
     *        The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     */

    public void setIndexes(java.util.Collection<DataSourceIntrospectionModelIndex> indexes) {
        if (indexes == null) {
            this.indexes = null;
            return;
        }

        this.indexes = new java.util.ArrayList<DataSourceIntrospectionModelIndex>(indexes);
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexes(java.util.Collection)} or {@link #withIndexes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param indexes
     *        The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withIndexes(DataSourceIntrospectionModelIndex... indexes) {
        if (this.indexes == null) {
            setIndexes(new java.util.ArrayList<DataSourceIntrospectionModelIndex>(indexes.length));
        }
        for (DataSourceIntrospectionModelIndex ele : indexes) {
            this.indexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * </p>
     * 
     * @param indexes
     *        The array of <code>DataSourceIntrospectionModelIndex</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withIndexes(java.util.Collection<DataSourceIntrospectionModelIndex> indexes) {
        setIndexes(indexes);
        return this;
    }

    /**
     * <p>
     * Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     * <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     * </p>
     * 
     * @param sdl
     *        Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     *        <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     */

    public void setSdl(String sdl) {
        this.sdl = sdl;
    }

    /**
     * <p>
     * Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     * <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     * </p>
     * 
     * @return Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     *         <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     */

    public String getSdl() {
        return this.sdl;
    }

    /**
     * <p>
     * Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     * <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     * </p>
     * 
     * @param sdl
     *        Contains the output of the SDL that was generated from the introspected types. This is controlled by the
     *        <code>includeModelsSDL</code> parameter of the <code>GetDataSourceIntrospection</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModel withSdl(String sdl) {
        setSdl(sdl);
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getPrimaryKey() != null)
            sb.append("PrimaryKey: ").append(getPrimaryKey()).append(",");
        if (getIndexes() != null)
            sb.append("Indexes: ").append(getIndexes()).append(",");
        if (getSdl() != null)
            sb.append("Sdl: ").append(getSdl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceIntrospectionModel == false)
            return false;
        DataSourceIntrospectionModel other = (DataSourceIntrospectionModel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getPrimaryKey() == null ^ this.getPrimaryKey() == null)
            return false;
        if (other.getPrimaryKey() != null && other.getPrimaryKey().equals(this.getPrimaryKey()) == false)
            return false;
        if (other.getIndexes() == null ^ this.getIndexes() == null)
            return false;
        if (other.getIndexes() != null && other.getIndexes().equals(this.getIndexes()) == false)
            return false;
        if (other.getSdl() == null ^ this.getSdl() == null)
            return false;
        if (other.getSdl() != null && other.getSdl().equals(this.getSdl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKey() == null) ? 0 : getPrimaryKey().hashCode());
        hashCode = prime * hashCode + ((getIndexes() == null) ? 0 : getIndexes().hashCode());
        hashCode = prime * hashCode + ((getSdl() == null) ? 0 : getSdl().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceIntrospectionModel clone() {
        try {
            return (DataSourceIntrospectionModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DataSourceIntrospectionModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
