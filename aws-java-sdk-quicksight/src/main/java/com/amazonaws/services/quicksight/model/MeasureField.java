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
 * The measure (metric) type field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MeasureField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeasureField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The measure type field with numerical type columns.
     * </p>
     */
    private NumericalMeasureField numericalMeasureField;
    /**
     * <p>
     * The measure type field with categorical type columns.
     * </p>
     */
    private CategoricalMeasureField categoricalMeasureField;
    /**
     * <p>
     * The measure type field with date type columns.
     * </p>
     */
    private DateMeasureField dateMeasureField;
    /**
     * <p>
     * The calculated measure field only used in pivot tables.
     * </p>
     */
    private CalculatedMeasureField calculatedMeasureField;

    /**
     * <p>
     * The measure type field with numerical type columns.
     * </p>
     * 
     * @param numericalMeasureField
     *        The measure type field with numerical type columns.
     */

    public void setNumericalMeasureField(NumericalMeasureField numericalMeasureField) {
        this.numericalMeasureField = numericalMeasureField;
    }

    /**
     * <p>
     * The measure type field with numerical type columns.
     * </p>
     * 
     * @return The measure type field with numerical type columns.
     */

    public NumericalMeasureField getNumericalMeasureField() {
        return this.numericalMeasureField;
    }

    /**
     * <p>
     * The measure type field with numerical type columns.
     * </p>
     * 
     * @param numericalMeasureField
     *        The measure type field with numerical type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureField withNumericalMeasureField(NumericalMeasureField numericalMeasureField) {
        setNumericalMeasureField(numericalMeasureField);
        return this;
    }

    /**
     * <p>
     * The measure type field with categorical type columns.
     * </p>
     * 
     * @param categoricalMeasureField
     *        The measure type field with categorical type columns.
     */

    public void setCategoricalMeasureField(CategoricalMeasureField categoricalMeasureField) {
        this.categoricalMeasureField = categoricalMeasureField;
    }

    /**
     * <p>
     * The measure type field with categorical type columns.
     * </p>
     * 
     * @return The measure type field with categorical type columns.
     */

    public CategoricalMeasureField getCategoricalMeasureField() {
        return this.categoricalMeasureField;
    }

    /**
     * <p>
     * The measure type field with categorical type columns.
     * </p>
     * 
     * @param categoricalMeasureField
     *        The measure type field with categorical type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureField withCategoricalMeasureField(CategoricalMeasureField categoricalMeasureField) {
        setCategoricalMeasureField(categoricalMeasureField);
        return this;
    }

    /**
     * <p>
     * The measure type field with date type columns.
     * </p>
     * 
     * @param dateMeasureField
     *        The measure type field with date type columns.
     */

    public void setDateMeasureField(DateMeasureField dateMeasureField) {
        this.dateMeasureField = dateMeasureField;
    }

    /**
     * <p>
     * The measure type field with date type columns.
     * </p>
     * 
     * @return The measure type field with date type columns.
     */

    public DateMeasureField getDateMeasureField() {
        return this.dateMeasureField;
    }

    /**
     * <p>
     * The measure type field with date type columns.
     * </p>
     * 
     * @param dateMeasureField
     *        The measure type field with date type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureField withDateMeasureField(DateMeasureField dateMeasureField) {
        setDateMeasureField(dateMeasureField);
        return this;
    }

    /**
     * <p>
     * The calculated measure field only used in pivot tables.
     * </p>
     * 
     * @param calculatedMeasureField
     *        The calculated measure field only used in pivot tables.
     */

    public void setCalculatedMeasureField(CalculatedMeasureField calculatedMeasureField) {
        this.calculatedMeasureField = calculatedMeasureField;
    }

    /**
     * <p>
     * The calculated measure field only used in pivot tables.
     * </p>
     * 
     * @return The calculated measure field only used in pivot tables.
     */

    public CalculatedMeasureField getCalculatedMeasureField() {
        return this.calculatedMeasureField;
    }

    /**
     * <p>
     * The calculated measure field only used in pivot tables.
     * </p>
     * 
     * @param calculatedMeasureField
     *        The calculated measure field only used in pivot tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureField withCalculatedMeasureField(CalculatedMeasureField calculatedMeasureField) {
        setCalculatedMeasureField(calculatedMeasureField);
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
        if (getNumericalMeasureField() != null)
            sb.append("NumericalMeasureField: ").append(getNumericalMeasureField()).append(",");
        if (getCategoricalMeasureField() != null)
            sb.append("CategoricalMeasureField: ").append(getCategoricalMeasureField()).append(",");
        if (getDateMeasureField() != null)
            sb.append("DateMeasureField: ").append(getDateMeasureField()).append(",");
        if (getCalculatedMeasureField() != null)
            sb.append("CalculatedMeasureField: ").append(getCalculatedMeasureField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeasureField == false)
            return false;
        MeasureField other = (MeasureField) obj;
        if (other.getNumericalMeasureField() == null ^ this.getNumericalMeasureField() == null)
            return false;
        if (other.getNumericalMeasureField() != null && other.getNumericalMeasureField().equals(this.getNumericalMeasureField()) == false)
            return false;
        if (other.getCategoricalMeasureField() == null ^ this.getCategoricalMeasureField() == null)
            return false;
        if (other.getCategoricalMeasureField() != null && other.getCategoricalMeasureField().equals(this.getCategoricalMeasureField()) == false)
            return false;
        if (other.getDateMeasureField() == null ^ this.getDateMeasureField() == null)
            return false;
        if (other.getDateMeasureField() != null && other.getDateMeasureField().equals(this.getDateMeasureField()) == false)
            return false;
        if (other.getCalculatedMeasureField() == null ^ this.getCalculatedMeasureField() == null)
            return false;
        if (other.getCalculatedMeasureField() != null && other.getCalculatedMeasureField().equals(this.getCalculatedMeasureField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumericalMeasureField() == null) ? 0 : getNumericalMeasureField().hashCode());
        hashCode = prime * hashCode + ((getCategoricalMeasureField() == null) ? 0 : getCategoricalMeasureField().hashCode());
        hashCode = prime * hashCode + ((getDateMeasureField() == null) ? 0 : getDateMeasureField().hashCode());
        hashCode = prime * hashCode + ((getCalculatedMeasureField() == null) ? 0 : getCalculatedMeasureField().hashCode());
        return hashCode;
    }

    @Override
    public MeasureField clone() {
        try {
            return (MeasureField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MeasureFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
