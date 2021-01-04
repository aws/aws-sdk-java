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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties (metadata) of a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ColumnMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default value of the column.
     * </p>
     */
    private String columnDefault;
    /**
     * <p>
     * A value that indicates whether the column is case-sensitive.
     * </p>
     */
    private Boolean isCaseSensitive;
    /**
     * <p>
     * A value that indicates whether the column contains currency values.
     * </p>
     */
    private Boolean isCurrency;
    /**
     * <p>
     * A value that indicates whether an integer column is signed.
     * </p>
     */
    private Boolean isSigned;
    /**
     * <p>
     * The label for the column.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The length of the column.
     * </p>
     */
    private Integer length;
    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A value that indicates whether the column is nullable.
     * </p>
     */
    private Integer nullable;
    /**
     * <p>
     * The precision value of a decimal number column.
     * </p>
     */
    private Integer precision;
    /**
     * <p>
     * The scale value of a decimal number column.
     * </p>
     */
    private Integer scale;
    /**
     * <p>
     * The name of the schema that contains the table that includes the column.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The name of the table that includes the column.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The database-specific data type of the column.
     * </p>
     */
    private String typeName;

    /**
     * <p>
     * The default value of the column.
     * </p>
     * 
     * @param columnDefault
     *        The default value of the column.
     */

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    /**
     * <p>
     * The default value of the column.
     * </p>
     * 
     * @return The default value of the column.
     */

    public String getColumnDefault() {
        return this.columnDefault;
    }

    /**
     * <p>
     * The default value of the column.
     * </p>
     * 
     * @param columnDefault
     *        The default value of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withColumnDefault(String columnDefault) {
        setColumnDefault(columnDefault);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the column is case-sensitive.
     * </p>
     * 
     * @param isCaseSensitive
     *        A value that indicates whether the column is case-sensitive.
     */

    public void setIsCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    /**
     * <p>
     * A value that indicates whether the column is case-sensitive.
     * </p>
     * 
     * @return A value that indicates whether the column is case-sensitive.
     */

    public Boolean getIsCaseSensitive() {
        return this.isCaseSensitive;
    }

    /**
     * <p>
     * A value that indicates whether the column is case-sensitive.
     * </p>
     * 
     * @param isCaseSensitive
     *        A value that indicates whether the column is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsCaseSensitive(Boolean isCaseSensitive) {
        setIsCaseSensitive(isCaseSensitive);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the column is case-sensitive.
     * </p>
     * 
     * @return A value that indicates whether the column is case-sensitive.
     */

    public Boolean isCaseSensitive() {
        return this.isCaseSensitive;
    }

    /**
     * <p>
     * A value that indicates whether the column contains currency values.
     * </p>
     * 
     * @param isCurrency
     *        A value that indicates whether the column contains currency values.
     */

    public void setIsCurrency(Boolean isCurrency) {
        this.isCurrency = isCurrency;
    }

    /**
     * <p>
     * A value that indicates whether the column contains currency values.
     * </p>
     * 
     * @return A value that indicates whether the column contains currency values.
     */

    public Boolean getIsCurrency() {
        return this.isCurrency;
    }

    /**
     * <p>
     * A value that indicates whether the column contains currency values.
     * </p>
     * 
     * @param isCurrency
     *        A value that indicates whether the column contains currency values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsCurrency(Boolean isCurrency) {
        setIsCurrency(isCurrency);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the column contains currency values.
     * </p>
     * 
     * @return A value that indicates whether the column contains currency values.
     */

    public Boolean isCurrency() {
        return this.isCurrency;
    }

    /**
     * <p>
     * A value that indicates whether an integer column is signed.
     * </p>
     * 
     * @param isSigned
     *        A value that indicates whether an integer column is signed.
     */

    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    /**
     * <p>
     * A value that indicates whether an integer column is signed.
     * </p>
     * 
     * @return A value that indicates whether an integer column is signed.
     */

    public Boolean getIsSigned() {
        return this.isSigned;
    }

    /**
     * <p>
     * A value that indicates whether an integer column is signed.
     * </p>
     * 
     * @param isSigned
     *        A value that indicates whether an integer column is signed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withIsSigned(Boolean isSigned) {
        setIsSigned(isSigned);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether an integer column is signed.
     * </p>
     * 
     * @return A value that indicates whether an integer column is signed.
     */

    public Boolean isSigned() {
        return this.isSigned;
    }

    /**
     * <p>
     * The label for the column.
     * </p>
     * 
     * @param label
     *        The label for the column.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label for the column.
     * </p>
     * 
     * @return The label for the column.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label for the column.
     * </p>
     * 
     * @param label
     *        The label for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The length of the column.
     * </p>
     * 
     * @param length
     *        The length of the column.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * The length of the column.
     * </p>
     * 
     * @return The length of the column.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * The length of the column.
     * </p>
     * 
     * @param length
     *        The length of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withLength(Integer length) {
        setLength(length);
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

    public ColumnMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the column is nullable.
     * </p>
     * 
     * @param nullable
     *        A value that indicates whether the column is nullable.
     */

    public void setNullable(Integer nullable) {
        this.nullable = nullable;
    }

    /**
     * <p>
     * A value that indicates whether the column is nullable.
     * </p>
     * 
     * @return A value that indicates whether the column is nullable.
     */

    public Integer getNullable() {
        return this.nullable;
    }

    /**
     * <p>
     * A value that indicates whether the column is nullable.
     * </p>
     * 
     * @param nullable
     *        A value that indicates whether the column is nullable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withNullable(Integer nullable) {
        setNullable(nullable);
        return this;
    }

    /**
     * <p>
     * The precision value of a decimal number column.
     * </p>
     * 
     * @param precision
     *        The precision value of a decimal number column.
     */

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * The precision value of a decimal number column.
     * </p>
     * 
     * @return The precision value of a decimal number column.
     */

    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * The precision value of a decimal number column.
     * </p>
     * 
     * @param precision
     *        The precision value of a decimal number column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withPrecision(Integer precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * <p>
     * The scale value of a decimal number column.
     * </p>
     * 
     * @param scale
     *        The scale value of a decimal number column.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale value of a decimal number column.
     * </p>
     * 
     * @return The scale value of a decimal number column.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale value of a decimal number column.
     * </p>
     * 
     * @param scale
     *        The scale value of a decimal number column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * The name of the schema that contains the table that includes the column.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema that contains the table that includes the column.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema that contains the table that includes the column.
     * </p>
     * 
     * @return The name of the schema that contains the table that includes the column.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema that contains the table that includes the column.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema that contains the table that includes the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The name of the table that includes the column.
     * </p>
     * 
     * @param tableName
     *        The name of the table that includes the column.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table that includes the column.
     * </p>
     * 
     * @return The name of the table that includes the column.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table that includes the column.
     * </p>
     * 
     * @param tableName
     *        The name of the table that includes the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The database-specific data type of the column.
     * </p>
     * 
     * @param typeName
     *        The database-specific data type of the column.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The database-specific data type of the column.
     * </p>
     * 
     * @return The database-specific data type of the column.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The database-specific data type of the column.
     * </p>
     * 
     * @param typeName
     *        The database-specific data type of the column.
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
        if (getColumnDefault() != null)
            sb.append("ColumnDefault: ").append(getColumnDefault()).append(",");
        if (getIsCaseSensitive() != null)
            sb.append("IsCaseSensitive: ").append(getIsCaseSensitive()).append(",");
        if (getIsCurrency() != null)
            sb.append("IsCurrency: ").append(getIsCurrency()).append(",");
        if (getIsSigned() != null)
            sb.append("IsSigned: ").append(getIsSigned()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
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
        if (other.getColumnDefault() == null ^ this.getColumnDefault() == null)
            return false;
        if (other.getColumnDefault() != null && other.getColumnDefault().equals(this.getColumnDefault()) == false)
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
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
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

        hashCode = prime * hashCode + ((getColumnDefault() == null) ? 0 : getColumnDefault().hashCode());
        hashCode = prime * hashCode + ((getIsCaseSensitive() == null) ? 0 : getIsCaseSensitive().hashCode());
        hashCode = prime * hashCode + ((getIsCurrency() == null) ? 0 : getIsCurrency().hashCode());
        hashCode = prime * hashCode + ((getIsSigned() == null) ? 0 : getIsSigned().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNullable() == null) ? 0 : getNullable().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
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
        com.amazonaws.services.redshiftdataapi.model.transform.ColumnMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
