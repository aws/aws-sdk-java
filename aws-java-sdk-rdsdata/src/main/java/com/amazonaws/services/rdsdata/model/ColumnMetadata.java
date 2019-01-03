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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Column Metadata
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ColumnMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnMetadata implements Serializable, Cloneable, StructuredPojo {

    /** Homogenous array base SQL type from java.sql.Types. */
    private Integer arrayBaseColumnType;
    /** Whether the designated column is automatically numbered */
    private Boolean isAutoIncrement;
    /** Whether values in the designated column's case matters */
    private Boolean isCaseSensitive;
    /** Whether values in the designated column is a cash value */
    private Boolean isCurrency;
    /** Whether values in the designated column are signed numbers */
    private Boolean isSigned;
    /** Usually specified by the SQL AS. If not specified, return column name. */
    private String label;
    /** Name of the column. */
    private String name;
    /**
     * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1),
     * columnNullableUnknown (2)
     */
    private Integer nullable;
    /**
     * Get the designated column's specified column size.For numeric data, this is the maximum precision. For character
     * data, this is the length in characters. For datetime datatypes, this is the length in characters of the String
     * representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this
     * is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is returned for data types where
     * the column size is not applicable.
     */
    private Integer precision;
    /**
     * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale
     * is not applicable.
     */
    private Integer scale;
    /** Designated column's table's schema */
    private String schemaName;
    /** Designated column's table name */
    private String tableName;
    /** SQL type from java.sql.Types. */
    private Integer type;
    /** Database-specific type name. */
    private String typeName;

    /**
     * Homogenous array base SQL type from java.sql.Types.
     * 
     * @param arrayBaseColumnType
     *        Homogenous array base SQL type from java.sql.Types.
     */

    public void setArrayBaseColumnType(Integer arrayBaseColumnType) {
        this.arrayBaseColumnType = arrayBaseColumnType;
    }

    /**
     * Homogenous array base SQL type from java.sql.Types.
     * 
     * @return Homogenous array base SQL type from java.sql.Types.
     */

    public Integer getArrayBaseColumnType() {
        return this.arrayBaseColumnType;
    }

    /**
     * Homogenous array base SQL type from java.sql.Types.
     * 
     * @param arrayBaseColumnType
     *        Homogenous array base SQL type from java.sql.Types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withArrayBaseColumnType(Integer arrayBaseColumnType) {
        setArrayBaseColumnType(arrayBaseColumnType);
        return this;
    }

    /**
     * Whether the designated column is automatically numbered
     * 
     * @param isAutoIncrement
     *        Whether the designated column is automatically numbered
     */

    public void setIsAutoIncrement(Boolean isAutoIncrement) {
        this.isAutoIncrement = isAutoIncrement;
    }

    /**
     * Whether the designated column is automatically numbered
     * 
     * @return Whether the designated column is automatically numbered
     */

    public Boolean getIsAutoIncrement() {
        return this.isAutoIncrement;
    }

    /**
     * Whether the designated column is automatically numbered
     * 
     * @param isAutoIncrement
     *        Whether the designated column is automatically numbered
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsAutoIncrement(Boolean isAutoIncrement) {
        setIsAutoIncrement(isAutoIncrement);
        return this;
    }

    /**
     * Whether the designated column is automatically numbered
     * 
     * @return Whether the designated column is automatically numbered
     */

    public Boolean isAutoIncrement() {
        return this.isAutoIncrement;
    }

    /**
     * Whether values in the designated column's case matters
     * 
     * @param isCaseSensitive
     *        Whether values in the designated column's case matters
     */

    public void setIsCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    /**
     * Whether values in the designated column's case matters
     * 
     * @return Whether values in the designated column's case matters
     */

    public Boolean getIsCaseSensitive() {
        return this.isCaseSensitive;
    }

    /**
     * Whether values in the designated column's case matters
     * 
     * @param isCaseSensitive
     *        Whether values in the designated column's case matters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsCaseSensitive(Boolean isCaseSensitive) {
        setIsCaseSensitive(isCaseSensitive);
        return this;
    }

    /**
     * Whether values in the designated column's case matters
     * 
     * @return Whether values in the designated column's case matters
     */

    public Boolean isCaseSensitive() {
        return this.isCaseSensitive;
    }

    /**
     * Whether values in the designated column is a cash value
     * 
     * @param isCurrency
     *        Whether values in the designated column is a cash value
     */

    public void setIsCurrency(Boolean isCurrency) {
        this.isCurrency = isCurrency;
    }

    /**
     * Whether values in the designated column is a cash value
     * 
     * @return Whether values in the designated column is a cash value
     */

    public Boolean getIsCurrency() {
        return this.isCurrency;
    }

    /**
     * Whether values in the designated column is a cash value
     * 
     * @param isCurrency
     *        Whether values in the designated column is a cash value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsCurrency(Boolean isCurrency) {
        setIsCurrency(isCurrency);
        return this;
    }

    /**
     * Whether values in the designated column is a cash value
     * 
     * @return Whether values in the designated column is a cash value
     */

    public Boolean isCurrency() {
        return this.isCurrency;
    }

    /**
     * Whether values in the designated column are signed numbers
     * 
     * @param isSigned
     *        Whether values in the designated column are signed numbers
     */

    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    /**
     * Whether values in the designated column are signed numbers
     * 
     * @return Whether values in the designated column are signed numbers
     */

    public Boolean getIsSigned() {
        return this.isSigned;
    }

    /**
     * Whether values in the designated column are signed numbers
     * 
     * @param isSigned
     *        Whether values in the designated column are signed numbers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsSigned(Boolean isSigned) {
        setIsSigned(isSigned);
        return this;
    }

    /**
     * Whether values in the designated column are signed numbers
     * 
     * @return Whether values in the designated column are signed numbers
     */

    public Boolean isSigned() {
        return this.isSigned;
    }

    /**
     * Usually specified by the SQL AS. If not specified, return column name.
     * 
     * @param label
     *        Usually specified by the SQL AS. If not specified, return column name.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Usually specified by the SQL AS. If not specified, return column name.
     * 
     * @return Usually specified by the SQL AS. If not specified, return column name.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * Usually specified by the SQL AS. If not specified, return column name.
     * 
     * @param label
     *        Usually specified by the SQL AS. If not specified, return column name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * Name of the column.
     * 
     * @param name
     *        Name of the column.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the column.
     * 
     * @return Name of the column.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of the column.
     * 
     * @param name
     *        Name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1),
     * columnNullableUnknown (2)
     * 
     * @param nullable
     *        Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable
     *        (1), columnNullableUnknown (2)
     */

    public void setNullable(Integer nullable) {
        this.nullable = nullable;
    }

    /**
     * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1),
     * columnNullableUnknown (2)
     * 
     * @return Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable
     *         (1), columnNullableUnknown (2)
     */

    public Integer getNullable() {
        return this.nullable;
    }

    /**
     * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1),
     * columnNullableUnknown (2)
     * 
     * @param nullable
     *        Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable
     *        (1), columnNullableUnknown (2)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withNullable(Integer nullable) {
        setNullable(nullable);
        return this;
    }

    /**
     * Get the designated column's specified column size.For numeric data, this is the maximum precision. For character
     * data, this is the length in characters. For datetime datatypes, this is the length in characters of the String
     * representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this
     * is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is returned for data types where
     * the column size is not applicable.
     * 
     * @param precision
     *        Get the designated column's specified column size.For numeric data, this is the maximum precision. For
     *        character data, this is the length in characters. For datetime datatypes, this is the length in characters
     *        of the String representation (assuming the maximum allowed precision of the fractional seconds component).
     *        For binary data, this is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is
     *        returned for data types where the column size is not applicable.
     */

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * Get the designated column's specified column size.For numeric data, this is the maximum precision. For character
     * data, this is the length in characters. For datetime datatypes, this is the length in characters of the String
     * representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this
     * is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is returned for data types where
     * the column size is not applicable.
     * 
     * @return Get the designated column's specified column size.For numeric data, this is the maximum precision. For
     *         character data, this is the length in characters. For datetime datatypes, this is the length in
     *         characters of the String representation (assuming the maximum allowed precision of the fractional seconds
     *         component). For binary data, this is the length in bytes. For the ROWID datatype, this is the length in
     *         bytes. 0 is returned for data types where the column size is not applicable.
     */

    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Get the designated column's specified column size.For numeric data, this is the maximum precision. For character
     * data, this is the length in characters. For datetime datatypes, this is the length in characters of the String
     * representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this
     * is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is returned for data types where
     * the column size is not applicable.
     * 
     * @param precision
     *        Get the designated column's specified column size.For numeric data, this is the maximum precision. For
     *        character data, this is the length in characters. For datetime datatypes, this is the length in characters
     *        of the String representation (assuming the maximum allowed precision of the fractional seconds component).
     *        For binary data, this is the length in bytes. For the ROWID datatype, this is the length in bytes. 0 is
     *        returned for data types where the column size is not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withPrecision(Integer precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale
     * is not applicable.
     * 
     * @param scale
     *        Designated column's number of digits to right of the decimal point. 0 is returned for data types where the
     *        scale is not applicable.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale
     * is not applicable.
     * 
     * @return Designated column's number of digits to right of the decimal point. 0 is returned for data types where
     *         the scale is not applicable.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale
     * is not applicable.
     * 
     * @param scale
     *        Designated column's number of digits to right of the decimal point. 0 is returned for data types where the
     *        scale is not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * Designated column's table's schema
     * 
     * @param schemaName
     *        Designated column's table's schema
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * Designated column's table's schema
     * 
     * @return Designated column's table's schema
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Designated column's table's schema
     * 
     * @param schemaName
     *        Designated column's table's schema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * Designated column's table name
     * 
     * @param tableName
     *        Designated column's table name
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Designated column's table name
     * 
     * @return Designated column's table name
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * Designated column's table name
     * 
     * @param tableName
     *        Designated column's table name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * SQL type from java.sql.Types.
     * 
     * @param type
     *        SQL type from java.sql.Types.
     */

    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * SQL type from java.sql.Types.
     * 
     * @return SQL type from java.sql.Types.
     */

    public Integer getType() {
        return this.type;
    }

    /**
     * SQL type from java.sql.Types.
     * 
     * @param type
     *        SQL type from java.sql.Types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withType(Integer type) {
        setType(type);
        return this;
    }

    /**
     * Database-specific type name.
     * 
     * @param typeName
     *        Database-specific type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Database-specific type name.
     * 
     * @return Database-specific type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Database-specific type name.
     * 
     * @param typeName
     *        Database-specific type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withTypeName(String typeName) {
        setTypeName(typeName);
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
        if (getArrayBaseColumnType() != null)
            sb.append("ArrayBaseColumnType: ").append(getArrayBaseColumnType()).append(",");
        if (getIsAutoIncrement() != null)
            sb.append("IsAutoIncrement: ").append(getIsAutoIncrement()).append(",");
        if (getIsCaseSensitive() != null)
            sb.append("IsCaseSensitive: ").append(getIsCaseSensitive()).append(",");
        if (getIsCurrency() != null)
            sb.append("IsCurrency: ").append(getIsCurrency()).append(",");
        if (getIsSigned() != null)
            sb.append("IsSigned: ").append(getIsSigned()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNullable() != null)
            sb.append("Nullable: ").append(getNullable()).append(",");
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnMetadata == false)
            return false;
        ColumnMetadata other = (ColumnMetadata) obj;
        if (other.getArrayBaseColumnType() == null ^ this.getArrayBaseColumnType() == null)
            return false;
        if (other.getArrayBaseColumnType() != null && other.getArrayBaseColumnType().equals(this.getArrayBaseColumnType()) == false)
            return false;
        if (other.getIsAutoIncrement() == null ^ this.getIsAutoIncrement() == null)
            return false;
        if (other.getIsAutoIncrement() != null && other.getIsAutoIncrement().equals(this.getIsAutoIncrement()) == false)
            return false;
        if (other.getIsCaseSensitive() == null ^ this.getIsCaseSensitive() == null)
            return false;
        if (other.getIsCaseSensitive() != null && other.getIsCaseSensitive().equals(this.getIsCaseSensitive()) == false)
            return false;
        if (other.getIsCurrency() == null ^ this.getIsCurrency() == null)
            return false;
        if (other.getIsCurrency() != null && other.getIsCurrency().equals(this.getIsCurrency()) == false)
            return false;
        if (other.getIsSigned() == null ^ this.getIsSigned() == null)
            return false;
        if (other.getIsSigned() != null && other.getIsSigned().equals(this.getIsSigned()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNullable() == null ^ this.getNullable() == null)
            return false;
        if (other.getNullable() != null && other.getNullable().equals(this.getNullable()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayBaseColumnType() == null) ? 0 : getArrayBaseColumnType().hashCode());
        hashCode = prime * hashCode + ((getIsAutoIncrement() == null) ? 0 : getIsAutoIncrement().hashCode());
        hashCode = prime * hashCode + ((getIsCaseSensitive() == null) ? 0 : getIsCaseSensitive().hashCode());
        hashCode = prime * hashCode + ((getIsCurrency() == null) ? 0 : getIsCurrency().hashCode());
        hashCode = prime * hashCode + ((getIsSigned() == null) ? 0 : getIsSigned().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNullable() == null) ? 0 : getNullable().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        return hashCode;
    }

    @Override
    public ColumnMetadata clone() {
        try {
            return (ColumnMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ColumnMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
