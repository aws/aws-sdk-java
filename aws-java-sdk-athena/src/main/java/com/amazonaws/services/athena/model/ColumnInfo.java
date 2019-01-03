/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the columns in a query execution result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ColumnInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     */
    private String catalogName;
    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The table name for the query results.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A column label.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The data type of the column.
     * </p>
     */
    private String type;
    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance reasons, we
     * recommend up to 18 digits.
     * </p>
     */
    private Integer precision;
    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the value.
     * Defaults to 0.
     * </p>
     */
    private Integer scale;
    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     */
    private String nullable;
    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     */
    private Boolean caseSensitive;

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     * 
     * @param catalogName
     *        The catalog to which the query results belong.
     */

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     * 
     * @return The catalog to which the query results belong.
     */

    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     * 
     * @param catalogName
     *        The catalog to which the query results belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withCatalogName(String catalogName) {
        setCatalogName(catalogName);
        return this;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     * 
     * @param schemaName
     *        The schema name (database name) to which the query results belong.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     * 
     * @return The schema name (database name) to which the query results belong.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     * 
     * @param schemaName
     *        The schema name (database name) to which the query results belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     * 
     * @param tableName
     *        The table name for the query results.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     * 
     * @return The table name for the query results.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     * 
     * @param tableName
     *        The table name for the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A column label.
     * </p>
     * 
     * @param label
     *        A column label.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A column label.
     * </p>
     * 
     * @return A column label.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A column label.
     * </p>
     * 
     * @param label
     *        A column label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @return The data type of the column.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance reasons, we
     * recommend up to 18 digits.
     * </p>
     * 
     * @param precision
     *        For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance
     *        reasons, we recommend up to 18 digits.
     */

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance reasons, we
     * recommend up to 18 digits.
     * </p>
     * 
     * @return For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance
     *         reasons, we recommend up to 18 digits.
     */

    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance reasons, we
     * recommend up to 18 digits.
     * </p>
     * 
     * @param precision
     *        For <code>DECIMAL</code> data types, specifies the total number of digits, up to 38. For performance
     *        reasons, we recommend up to 18 digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withPrecision(Integer precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the value.
     * Defaults to 0.
     * </p>
     * 
     * @param scale
     *        For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the
     *        value. Defaults to 0.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the value.
     * Defaults to 0.
     * </p>
     * 
     * @return For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the
     *         value. Defaults to 0.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the value.
     * Defaults to 0.
     * </p>
     * 
     * @param scale
     *        For <code>DECIMAL</code> data types, specifies the total number of digits in the fractional part of the
     *        value. Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * 
     * @param nullable
     *        Indicates the column's nullable status.
     * @see ColumnNullable
     */

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * 
     * @return Indicates the column's nullable status.
     * @see ColumnNullable
     */

    public String getNullable() {
        return this.nullable;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * 
     * @param nullable
     *        Indicates the column's nullable status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnNullable
     */

    public ColumnInfo withNullable(String nullable) {
        setNullable(nullable);
        return this;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * 
     * @param nullable
     *        Indicates the column's nullable status.
     * @see ColumnNullable
     */

    public void setNullable(ColumnNullable nullable) {
        withNullable(nullable);
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * 
     * @param nullable
     *        Indicates the column's nullable status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnNullable
     */

    public ColumnInfo withNullable(ColumnNullable nullable) {
        this.nullable = nullable.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     * 
     * @param caseSensitive
     *        Indicates whether values in the column are case-sensitive.
     */

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     * 
     * @return Indicates whether values in the column are case-sensitive.
     */

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     * 
     * @param caseSensitive
     *        Indicates whether values in the column are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withCaseSensitive(Boolean caseSensitive) {
        setCaseSensitive(caseSensitive);
        return this;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     * 
     * @return Indicates whether values in the column are case-sensitive.
     */

    public Boolean isCaseSensitive() {
        return this.caseSensitive;
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
        if (getCatalogName() != null)
            sb.append("CatalogName: ").append(getCatalogName()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getNullable() != null)
            sb.append("Nullable: ").append(getNullable()).append(",");
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: ").append(getCaseSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnInfo == false)
            return false;
        ColumnInfo other = (ColumnInfo) obj;
        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null && other.getCatalogName().equals(this.getCatalogName()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getNullable() == null ^ this.getNullable() == null)
            return false;
        if (other.getNullable() != null && other.getNullable().equals(this.getNullable()) == false)
            return false;
        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getNullable() == null) ? 0 : getNullable().hashCode());
        hashCode = prime * hashCode + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        return hashCode;
    }

    @Override
    public ColumnInfo clone() {
        try {
            return (ColumnInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ColumnInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
