/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Maps a column or attribute in the data source to an index field. You must first create the fields in the index using
 * the <a>UpdateIndex</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceToIndexFieldMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceToIndexFieldMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     */
    private String dataSourceFieldName;
    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     */
    private String dateFieldFormat;
    /**
     * <p>
     * The name of the field in the index.
     * </p>
     */
    private String indexFieldName;

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * 
     * @param dataSourceFieldName
     *        The name of the column or attribute in the data source.
     */

    public void setDataSourceFieldName(String dataSourceFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * 
     * @return The name of the column or attribute in the data source.
     */

    public String getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * 
     * @param dataSourceFieldName
     *        The name of the column or attribute in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceToIndexFieldMapping withDataSourceFieldName(String dataSourceFieldName) {
        setDataSourceFieldName(dataSourceFieldName);
        return this;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * 
     * @param dateFieldFormat
     *        The type of data stored in the column or attribute.
     */

    public void setDateFieldFormat(String dateFieldFormat) {
        this.dateFieldFormat = dateFieldFormat;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * 
     * @return The type of data stored in the column or attribute.
     */

    public String getDateFieldFormat() {
        return this.dateFieldFormat;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * 
     * @param dateFieldFormat
     *        The type of data stored in the column or attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceToIndexFieldMapping withDateFieldFormat(String dateFieldFormat) {
        setDateFieldFormat(dateFieldFormat);
        return this;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * 
     * @param indexFieldName
     *        The name of the field in the index.
     */

    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * 
     * @return The name of the field in the index.
     */

    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * 
     * @param indexFieldName
     *        The name of the field in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceToIndexFieldMapping withIndexFieldName(String indexFieldName) {
        setIndexFieldName(indexFieldName);
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
        if (getDataSourceFieldName() != null)
            sb.append("DataSourceFieldName: ").append(getDataSourceFieldName()).append(",");
        if (getDateFieldFormat() != null)
            sb.append("DateFieldFormat: ").append(getDateFieldFormat()).append(",");
        if (getIndexFieldName() != null)
            sb.append("IndexFieldName: ").append(getIndexFieldName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceToIndexFieldMapping == false)
            return false;
        DataSourceToIndexFieldMapping other = (DataSourceToIndexFieldMapping) obj;
        if (other.getDataSourceFieldName() == null ^ this.getDataSourceFieldName() == null)
            return false;
        if (other.getDataSourceFieldName() != null && other.getDataSourceFieldName().equals(this.getDataSourceFieldName()) == false)
            return false;
        if (other.getDateFieldFormat() == null ^ this.getDateFieldFormat() == null)
            return false;
        if (other.getDateFieldFormat() != null && other.getDateFieldFormat().equals(this.getDateFieldFormat()) == false)
            return false;
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null)
            return false;
        if (other.getIndexFieldName() != null && other.getIndexFieldName().equals(this.getIndexFieldName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceFieldName() == null) ? 0 : getDataSourceFieldName().hashCode());
        hashCode = prime * hashCode + ((getDateFieldFormat() == null) ? 0 : getDateFieldFormat().hashCode());
        hashCode = prime * hashCode + ((getIndexFieldName() == null) ? 0 : getIndexFieldName().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceToIndexFieldMapping clone() {
        try {
            return (DataSourceToIndexFieldMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DataSourceToIndexFieldMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
