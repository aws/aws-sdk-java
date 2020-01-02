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
 * Provides information about how Amazon Kendra should use the columns of a database in an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ColumnConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     */
    private String documentIdColumnName;
    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     */
    private String documentDataColumnName;
    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     */
    private String documentTitleColumnName;
    /**
     * <p>
     * An array of objects that map database column names to the corresponding fields in an index. You must first create
     * the fields in the index using the <a>UpdateIndex</a> operation.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * One to five columns that indicate when a document in the database has changed.
     * </p>
     */
    private java.util.List<String> changeDetectingColumns;

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * 
     * @param documentIdColumnName
     *        The column that provides the document's unique identifier.
     */

    public void setDocumentIdColumnName(String documentIdColumnName) {
        this.documentIdColumnName = documentIdColumnName;
    }

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * 
     * @return The column that provides the document's unique identifier.
     */

    public String getDocumentIdColumnName() {
        return this.documentIdColumnName;
    }

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * 
     * @param documentIdColumnName
     *        The column that provides the document's unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withDocumentIdColumnName(String documentIdColumnName) {
        setDocumentIdColumnName(documentIdColumnName);
        return this;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * 
     * @param documentDataColumnName
     *        The column that contains the contents of the document.
     */

    public void setDocumentDataColumnName(String documentDataColumnName) {
        this.documentDataColumnName = documentDataColumnName;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * 
     * @return The column that contains the contents of the document.
     */

    public String getDocumentDataColumnName() {
        return this.documentDataColumnName;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * 
     * @param documentDataColumnName
     *        The column that contains the contents of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withDocumentDataColumnName(String documentDataColumnName) {
        setDocumentDataColumnName(documentDataColumnName);
        return this;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * 
     * @param documentTitleColumnName
     *        The column that contains the title of the document.
     */

    public void setDocumentTitleColumnName(String documentTitleColumnName) {
        this.documentTitleColumnName = documentTitleColumnName;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * 
     * @return The column that contains the title of the document.
     */

    public String getDocumentTitleColumnName() {
        return this.documentTitleColumnName;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * 
     * @param documentTitleColumnName
     *        The column that contains the title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withDocumentTitleColumnName(String documentTitleColumnName) {
        setDocumentTitleColumnName(documentTitleColumnName);
        return this;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding fields in an index. You must first create
     * the fields in the index using the <a>UpdateIndex</a> operation.
     * </p>
     * 
     * @return An array of objects that map database column names to the corresponding fields in an index. You must
     *         first create the fields in the index using the <a>UpdateIndex</a> operation.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding fields in an index. You must first create
     * the fields in the index using the <a>UpdateIndex</a> operation.
     * </p>
     * 
     * @param fieldMappings
     *        An array of objects that map database column names to the corresponding fields in an index. You must first
     *        create the fields in the index using the <a>UpdateIndex</a> operation.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding fields in an index. You must first create
     * the fields in the index using the <a>UpdateIndex</a> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        An array of objects that map database column names to the corresponding fields in an index. You must first
     *        create the fields in the index using the <a>UpdateIndex</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding fields in an index. You must first create
     * the fields in the index using the <a>UpdateIndex</a> operation.
     * </p>
     * 
     * @param fieldMappings
     *        An array of objects that map database column names to the corresponding fields in an index. You must first
     *        create the fields in the index using the <a>UpdateIndex</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has changed.
     * </p>
     * 
     * @return One to five columns that indicate when a document in the database has changed.
     */

    public java.util.List<String> getChangeDetectingColumns() {
        return changeDetectingColumns;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has changed.
     * </p>
     * 
     * @param changeDetectingColumns
     *        One to five columns that indicate when a document in the database has changed.
     */

    public void setChangeDetectingColumns(java.util.Collection<String> changeDetectingColumns) {
        if (changeDetectingColumns == null) {
            this.changeDetectingColumns = null;
            return;
        }

        this.changeDetectingColumns = new java.util.ArrayList<String>(changeDetectingColumns);
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has changed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeDetectingColumns(java.util.Collection)} or
     * {@link #withChangeDetectingColumns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param changeDetectingColumns
     *        One to five columns that indicate when a document in the database has changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withChangeDetectingColumns(String... changeDetectingColumns) {
        if (this.changeDetectingColumns == null) {
            setChangeDetectingColumns(new java.util.ArrayList<String>(changeDetectingColumns.length));
        }
        for (String ele : changeDetectingColumns) {
            this.changeDetectingColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has changed.
     * </p>
     * 
     * @param changeDetectingColumns
     *        One to five columns that indicate when a document in the database has changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withChangeDetectingColumns(java.util.Collection<String> changeDetectingColumns) {
        setChangeDetectingColumns(changeDetectingColumns);
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
        if (getDocumentIdColumnName() != null)
            sb.append("DocumentIdColumnName: ").append(getDocumentIdColumnName()).append(",");
        if (getDocumentDataColumnName() != null)
            sb.append("DocumentDataColumnName: ").append(getDocumentDataColumnName()).append(",");
        if (getDocumentTitleColumnName() != null)
            sb.append("DocumentTitleColumnName: ").append(getDocumentTitleColumnName()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getChangeDetectingColumns() != null)
            sb.append("ChangeDetectingColumns: ").append(getChangeDetectingColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnConfiguration == false)
            return false;
        ColumnConfiguration other = (ColumnConfiguration) obj;
        if (other.getDocumentIdColumnName() == null ^ this.getDocumentIdColumnName() == null)
            return false;
        if (other.getDocumentIdColumnName() != null && other.getDocumentIdColumnName().equals(this.getDocumentIdColumnName()) == false)
            return false;
        if (other.getDocumentDataColumnName() == null ^ this.getDocumentDataColumnName() == null)
            return false;
        if (other.getDocumentDataColumnName() != null && other.getDocumentDataColumnName().equals(this.getDocumentDataColumnName()) == false)
            return false;
        if (other.getDocumentTitleColumnName() == null ^ this.getDocumentTitleColumnName() == null)
            return false;
        if (other.getDocumentTitleColumnName() != null && other.getDocumentTitleColumnName().equals(this.getDocumentTitleColumnName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getChangeDetectingColumns() == null ^ this.getChangeDetectingColumns() == null)
            return false;
        if (other.getChangeDetectingColumns() != null && other.getChangeDetectingColumns().equals(this.getChangeDetectingColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentIdColumnName() == null) ? 0 : getDocumentIdColumnName().hashCode());
        hashCode = prime * hashCode + ((getDocumentDataColumnName() == null) ? 0 : getDocumentDataColumnName().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitleColumnName() == null) ? 0 : getDocumentTitleColumnName().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getChangeDetectingColumns() == null) ? 0 : getChangeDetectingColumns().hashCode());
        return hashCode;
    }

    @Override
    public ColumnConfiguration clone() {
        try {
            return (ColumnConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ColumnConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
