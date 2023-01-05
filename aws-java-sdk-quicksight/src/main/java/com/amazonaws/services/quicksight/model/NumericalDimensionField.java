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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dimension type field with numerical type columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericalDimensionField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericalDimensionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom field ID.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The column that is used in the <code>NumericalDimensionField</code>.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The custom hierarchy ID.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The format configuration of the field.
     * </p>
     */
    private NumberFormatConfiguration formatConfiguration;

    /**
     * <p>
     * The custom field ID.
     * </p>
     * 
     * @param fieldId
     *        The custom field ID.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The custom field ID.
     * </p>
     * 
     * @return The custom field ID.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The custom field ID.
     * </p>
     * 
     * @param fieldId
     *        The custom field ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericalDimensionField withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The column that is used in the <code>NumericalDimensionField</code>.
     * </p>
     * 
     * @param column
     *        The column that is used in the <code>NumericalDimensionField</code>.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that is used in the <code>NumericalDimensionField</code>.
     * </p>
     * 
     * @return The column that is used in the <code>NumericalDimensionField</code>.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that is used in the <code>NumericalDimensionField</code>.
     * </p>
     * 
     * @param column
     *        The column that is used in the <code>NumericalDimensionField</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericalDimensionField withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The custom hierarchy ID.
     * </p>
     * 
     * @param hierarchyId
     *        The custom hierarchy ID.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The custom hierarchy ID.
     * </p>
     * 
     * @return The custom hierarchy ID.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The custom hierarchy ID.
     * </p>
     * 
     * @param hierarchyId
     *        The custom hierarchy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericalDimensionField withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The format configuration of the field.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of the field.
     */

    public void setFormatConfiguration(NumberFormatConfiguration formatConfiguration) {
        this.formatConfiguration = formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of the field.
     * </p>
     * 
     * @return The format configuration of the field.
     */

    public NumberFormatConfiguration getFormatConfiguration() {
        return this.formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of the field.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericalDimensionField withFormatConfiguration(NumberFormatConfiguration formatConfiguration) {
        setFormatConfiguration(formatConfiguration);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getHierarchyId() != null)
            sb.append("HierarchyId: ").append(getHierarchyId()).append(",");
        if (getFormatConfiguration() != null)
            sb.append("FormatConfiguration: ").append(getFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericalDimensionField == false)
            return false;
        NumericalDimensionField other = (NumericalDimensionField) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        if (other.getFormatConfiguration() == null ^ this.getFormatConfiguration() == null)
            return false;
        if (other.getFormatConfiguration() != null && other.getFormatConfiguration().equals(this.getFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        hashCode = prime * hashCode + ((getFormatConfiguration() == null) ? 0 : getFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NumericalDimensionField clone() {
        try {
            return (NumericalDimensionField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericalDimensionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
