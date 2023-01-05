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
 * The dimension type field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DimensionField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension type field with numerical type columns.
     * </p>
     */
    private NumericalDimensionField numericalDimensionField;
    /**
     * <p>
     * The dimension type field with categorical type columns.
     * </p>
     */
    private CategoricalDimensionField categoricalDimensionField;
    /**
     * <p>
     * The dimension type field with date type columns.
     * </p>
     */
    private DateDimensionField dateDimensionField;

    /**
     * <p>
     * The dimension type field with numerical type columns.
     * </p>
     * 
     * @param numericalDimensionField
     *        The dimension type field with numerical type columns.
     */

    public void setNumericalDimensionField(NumericalDimensionField numericalDimensionField) {
        this.numericalDimensionField = numericalDimensionField;
    }

    /**
     * <p>
     * The dimension type field with numerical type columns.
     * </p>
     * 
     * @return The dimension type field with numerical type columns.
     */

    public NumericalDimensionField getNumericalDimensionField() {
        return this.numericalDimensionField;
    }

    /**
     * <p>
     * The dimension type field with numerical type columns.
     * </p>
     * 
     * @param numericalDimensionField
     *        The dimension type field with numerical type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionField withNumericalDimensionField(NumericalDimensionField numericalDimensionField) {
        setNumericalDimensionField(numericalDimensionField);
        return this;
    }

    /**
     * <p>
     * The dimension type field with categorical type columns.
     * </p>
     * 
     * @param categoricalDimensionField
     *        The dimension type field with categorical type columns.
     */

    public void setCategoricalDimensionField(CategoricalDimensionField categoricalDimensionField) {
        this.categoricalDimensionField = categoricalDimensionField;
    }

    /**
     * <p>
     * The dimension type field with categorical type columns.
     * </p>
     * 
     * @return The dimension type field with categorical type columns.
     */

    public CategoricalDimensionField getCategoricalDimensionField() {
        return this.categoricalDimensionField;
    }

    /**
     * <p>
     * The dimension type field with categorical type columns.
     * </p>
     * 
     * @param categoricalDimensionField
     *        The dimension type field with categorical type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionField withCategoricalDimensionField(CategoricalDimensionField categoricalDimensionField) {
        setCategoricalDimensionField(categoricalDimensionField);
        return this;
    }

    /**
     * <p>
     * The dimension type field with date type columns.
     * </p>
     * 
     * @param dateDimensionField
     *        The dimension type field with date type columns.
     */

    public void setDateDimensionField(DateDimensionField dateDimensionField) {
        this.dateDimensionField = dateDimensionField;
    }

    /**
     * <p>
     * The dimension type field with date type columns.
     * </p>
     * 
     * @return The dimension type field with date type columns.
     */

    public DateDimensionField getDateDimensionField() {
        return this.dateDimensionField;
    }

    /**
     * <p>
     * The dimension type field with date type columns.
     * </p>
     * 
     * @param dateDimensionField
     *        The dimension type field with date type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionField withDateDimensionField(DateDimensionField dateDimensionField) {
        setDateDimensionField(dateDimensionField);
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
        if (getNumericalDimensionField() != null)
            sb.append("NumericalDimensionField: ").append(getNumericalDimensionField()).append(",");
        if (getCategoricalDimensionField() != null)
            sb.append("CategoricalDimensionField: ").append(getCategoricalDimensionField()).append(",");
        if (getDateDimensionField() != null)
            sb.append("DateDimensionField: ").append(getDateDimensionField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionField == false)
            return false;
        DimensionField other = (DimensionField) obj;
        if (other.getNumericalDimensionField() == null ^ this.getNumericalDimensionField() == null)
            return false;
        if (other.getNumericalDimensionField() != null && other.getNumericalDimensionField().equals(this.getNumericalDimensionField()) == false)
            return false;
        if (other.getCategoricalDimensionField() == null ^ this.getCategoricalDimensionField() == null)
            return false;
        if (other.getCategoricalDimensionField() != null && other.getCategoricalDimensionField().equals(this.getCategoricalDimensionField()) == false)
            return false;
        if (other.getDateDimensionField() == null ^ this.getDateDimensionField() == null)
            return false;
        if (other.getDateDimensionField() != null && other.getDateDimensionField().equals(this.getDateDimensionField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumericalDimensionField() == null) ? 0 : getNumericalDimensionField().hashCode());
        hashCode = prime * hashCode + ((getCategoricalDimensionField() == null) ? 0 : getCategoricalDimensionField().hashCode());
        hashCode = prime * hashCode + ((getDateDimensionField() == null) ? 0 : getDateDimensionField().hashCode());
        return hashCode;
    }

    @Override
    public DimensionField clone() {
        try {
            return (DimensionField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DimensionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
