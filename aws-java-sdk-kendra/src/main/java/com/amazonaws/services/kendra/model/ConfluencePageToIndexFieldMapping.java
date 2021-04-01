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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field.
 * </p>
 * <p>
 * You must first create the index field using the <code>UpdateIndex</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluencePageToIndexFieldMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluencePageToIndexFieldMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field in the data source.
     * </p>
     */
    private String dataSourceFieldName;
    /**
     * <p>
     * The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code> is a
     * date field you must specify the date format. If the field is not a date field, an exception is thrown.
     * </p>
     */
    private String dateFieldFormat;
    /**
     * <p>
     * The name of the index field to map to the Confluence data source field. The index field type must match the
     * Confluence field type.
     * </p>
     */
    private String indexFieldName;

    /**
     * <p>
     * The name of the field in the data source.
     * </p>
     * 
     * @param dataSourceFieldName
     *        The name of the field in the data source.
     * @see ConfluencePageFieldName
     */

    public void setDataSourceFieldName(String dataSourceFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the field in the data source.
     * </p>
     * 
     * @return The name of the field in the data source.
     * @see ConfluencePageFieldName
     */

    public String getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the field in the data source.
     * </p>
     * 
     * @param dataSourceFieldName
     *        The name of the field in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluencePageFieldName
     */

    public ConfluencePageToIndexFieldMapping withDataSourceFieldName(String dataSourceFieldName) {
        setDataSourceFieldName(dataSourceFieldName);
        return this;
    }

    /**
     * <p>
     * The name of the field in the data source.
     * </p>
     * 
     * @param dataSourceFieldName
     *        The name of the field in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluencePageFieldName
     */

    public ConfluencePageToIndexFieldMapping withDataSourceFieldName(ConfluencePageFieldName dataSourceFieldName) {
        this.dataSourceFieldName = dataSourceFieldName.toString();
        return this;
    }

    /**
     * <p>
     * The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code> is a
     * date field you must specify the date format. If the field is not a date field, an exception is thrown.
     * </p>
     * 
     * @param dateFieldFormat
     *        The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code>
     *        is a date field you must specify the date format. If the field is not a date field, an exception is
     *        thrown.
     */

    public void setDateFieldFormat(String dateFieldFormat) {
        this.dateFieldFormat = dateFieldFormat;
    }

    /**
     * <p>
     * The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code> is a
     * date field you must specify the date format. If the field is not a date field, an exception is thrown.
     * </p>
     * 
     * @return The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code>
     *         is a date field you must specify the date format. If the field is not a date field, an exception is
     *         thrown.
     */

    public String getDateFieldFormat() {
        return this.dateFieldFormat;
    }

    /**
     * <p>
     * The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code> is a
     * date field you must specify the date format. If the field is not a date field, an exception is thrown.
     * </p>
     * 
     * @param dateFieldFormat
     *        The format for date fields in the data source. If the field specified in <code>DataSourceFieldName</code>
     *        is a date field you must specify the date format. If the field is not a date field, an exception is
     *        thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluencePageToIndexFieldMapping withDateFieldFormat(String dateFieldFormat) {
        setDateFieldFormat(dateFieldFormat);
        return this;
    }

    /**
     * <p>
     * The name of the index field to map to the Confluence data source field. The index field type must match the
     * Confluence field type.
     * </p>
     * 
     * @param indexFieldName
     *        The name of the index field to map to the Confluence data source field. The index field type must match
     *        the Confluence field type.
     */

    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }

    /**
     * <p>
     * The name of the index field to map to the Confluence data source field. The index field type must match the
     * Confluence field type.
     * </p>
     * 
     * @return The name of the index field to map to the Confluence data source field. The index field type must match
     *         the Confluence field type.
     */

    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    /**
     * <p>
     * The name of the index field to map to the Confluence data source field. The index field type must match the
     * Confluence field type.
     * </p>
     * 
     * @param indexFieldName
     *        The name of the index field to map to the Confluence data source field. The index field type must match
     *        the Confluence field type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluencePageToIndexFieldMapping withIndexFieldName(String indexFieldName) {
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

        if (obj instanceof ConfluencePageToIndexFieldMapping == false)
            return false;
        ConfluencePageToIndexFieldMapping other = (ConfluencePageToIndexFieldMapping) obj;
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
    public ConfluencePageToIndexFieldMapping clone() {
        try {
            return (ConfluencePageToIndexFieldMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluencePageToIndexFieldMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
