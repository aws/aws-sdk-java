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
 * The measure type field with categorical type columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CategoricalMeasureField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoricalMeasureField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom field ID.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The column that is used in the <code>CategoricalMeasureField</code>.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The aggregation function of the measure field.
     * </p>
     */
    private String aggregationFunction;
    /**
     * <p>
     * The format configuration of the field.
     * </p>
     */
    private StringFormatConfiguration formatConfiguration;

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

    public CategoricalMeasureField withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The column that is used in the <code>CategoricalMeasureField</code>.
     * </p>
     * 
     * @param column
     *        The column that is used in the <code>CategoricalMeasureField</code>.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that is used in the <code>CategoricalMeasureField</code>.
     * </p>
     * 
     * @return The column that is used in the <code>CategoricalMeasureField</code>.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that is used in the <code>CategoricalMeasureField</code>.
     * </p>
     * 
     * @param column
     *        The column that is used in the <code>CategoricalMeasureField</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoricalMeasureField withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The aggregation function of the measure field.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function of the measure field.
     * @see CategoricalAggregationFunction
     */

    public void setAggregationFunction(String aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function of the measure field.
     * </p>
     * 
     * @return The aggregation function of the measure field.
     * @see CategoricalAggregationFunction
     */

    public String getAggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function of the measure field.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function of the measure field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoricalAggregationFunction
     */

    public CategoricalMeasureField withAggregationFunction(String aggregationFunction) {
        setAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * <p>
     * The aggregation function of the measure field.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function of the measure field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoricalAggregationFunction
     */

    public CategoricalMeasureField withAggregationFunction(CategoricalAggregationFunction aggregationFunction) {
        this.aggregationFunction = aggregationFunction.toString();
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

    public void setFormatConfiguration(StringFormatConfiguration formatConfiguration) {
        this.formatConfiguration = formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of the field.
     * </p>
     * 
     * @return The format configuration of the field.
     */

    public StringFormatConfiguration getFormatConfiguration() {
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

    public CategoricalMeasureField withFormatConfiguration(StringFormatConfiguration formatConfiguration) {
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
        if (getAggregationFunction() != null)
            sb.append("AggregationFunction: ").append(getAggregationFunction()).append(",");
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

        if (obj instanceof CategoricalMeasureField == false)
            return false;
        CategoricalMeasureField other = (CategoricalMeasureField) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getAggregationFunction() == null ^ this.getAggregationFunction() == null)
            return false;
        if (other.getAggregationFunction() != null && other.getAggregationFunction().equals(this.getAggregationFunction()) == false)
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
        hashCode = prime * hashCode + ((getAggregationFunction() == null) ? 0 : getAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getFormatConfiguration() == null) ? 0 : getFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CategoricalMeasureField clone() {
        try {
            return (CategoricalMeasureField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CategoricalMeasureFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
