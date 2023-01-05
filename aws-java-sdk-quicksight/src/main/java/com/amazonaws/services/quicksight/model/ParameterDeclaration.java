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
 * The declaration definition of a parameter.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
 * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterDeclaration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A parameter declaration for the <code>String</code> data type.
     * </p>
     */
    private StringParameterDeclaration stringParameterDeclaration;
    /**
     * <p>
     * A parameter declaration for the <code>Decimal</code> data type.
     * </p>
     */
    private DecimalParameterDeclaration decimalParameterDeclaration;
    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     */
    private IntegerParameterDeclaration integerParameterDeclaration;
    /**
     * <p>
     * A parameter declaration for the <code>DateTime</code> data type.
     * </p>
     */
    private DateTimeParameterDeclaration dateTimeParameterDeclaration;

    /**
     * <p>
     * A parameter declaration for the <code>String</code> data type.
     * </p>
     * 
     * @param stringParameterDeclaration
     *        A parameter declaration for the <code>String</code> data type.
     */

    public void setStringParameterDeclaration(StringParameterDeclaration stringParameterDeclaration) {
        this.stringParameterDeclaration = stringParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>String</code> data type.
     * </p>
     * 
     * @return A parameter declaration for the <code>String</code> data type.
     */

    public StringParameterDeclaration getStringParameterDeclaration() {
        return this.stringParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>String</code> data type.
     * </p>
     * 
     * @param stringParameterDeclaration
     *        A parameter declaration for the <code>String</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withStringParameterDeclaration(StringParameterDeclaration stringParameterDeclaration) {
        setStringParameterDeclaration(stringParameterDeclaration);
        return this;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Decimal</code> data type.
     * </p>
     * 
     * @param decimalParameterDeclaration
     *        A parameter declaration for the <code>Decimal</code> data type.
     */

    public void setDecimalParameterDeclaration(DecimalParameterDeclaration decimalParameterDeclaration) {
        this.decimalParameterDeclaration = decimalParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Decimal</code> data type.
     * </p>
     * 
     * @return A parameter declaration for the <code>Decimal</code> data type.
     */

    public DecimalParameterDeclaration getDecimalParameterDeclaration() {
        return this.decimalParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Decimal</code> data type.
     * </p>
     * 
     * @param decimalParameterDeclaration
     *        A parameter declaration for the <code>Decimal</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withDecimalParameterDeclaration(DecimalParameterDeclaration decimalParameterDeclaration) {
        setDecimalParameterDeclaration(decimalParameterDeclaration);
        return this;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @param integerParameterDeclaration
     *        A parameter declaration for the <code>Integer</code> data type.
     */

    public void setIntegerParameterDeclaration(IntegerParameterDeclaration integerParameterDeclaration) {
        this.integerParameterDeclaration = integerParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @return A parameter declaration for the <code>Integer</code> data type.
     */

    public IntegerParameterDeclaration getIntegerParameterDeclaration() {
        return this.integerParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @param integerParameterDeclaration
     *        A parameter declaration for the <code>Integer</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withIntegerParameterDeclaration(IntegerParameterDeclaration integerParameterDeclaration) {
        setIntegerParameterDeclaration(integerParameterDeclaration);
        return this;
    }

    /**
     * <p>
     * A parameter declaration for the <code>DateTime</code> data type.
     * </p>
     * 
     * @param dateTimeParameterDeclaration
     *        A parameter declaration for the <code>DateTime</code> data type.
     */

    public void setDateTimeParameterDeclaration(DateTimeParameterDeclaration dateTimeParameterDeclaration) {
        this.dateTimeParameterDeclaration = dateTimeParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>DateTime</code> data type.
     * </p>
     * 
     * @return A parameter declaration for the <code>DateTime</code> data type.
     */

    public DateTimeParameterDeclaration getDateTimeParameterDeclaration() {
        return this.dateTimeParameterDeclaration;
    }

    /**
     * <p>
     * A parameter declaration for the <code>DateTime</code> data type.
     * </p>
     * 
     * @param dateTimeParameterDeclaration
     *        A parameter declaration for the <code>DateTime</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withDateTimeParameterDeclaration(DateTimeParameterDeclaration dateTimeParameterDeclaration) {
        setDateTimeParameterDeclaration(dateTimeParameterDeclaration);
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
        if (getStringParameterDeclaration() != null)
            sb.append("StringParameterDeclaration: ").append(getStringParameterDeclaration()).append(",");
        if (getDecimalParameterDeclaration() != null)
            sb.append("DecimalParameterDeclaration: ").append(getDecimalParameterDeclaration()).append(",");
        if (getIntegerParameterDeclaration() != null)
            sb.append("IntegerParameterDeclaration: ").append(getIntegerParameterDeclaration()).append(",");
        if (getDateTimeParameterDeclaration() != null)
            sb.append("DateTimeParameterDeclaration: ").append(getDateTimeParameterDeclaration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterDeclaration == false)
            return false;
        ParameterDeclaration other = (ParameterDeclaration) obj;
        if (other.getStringParameterDeclaration() == null ^ this.getStringParameterDeclaration() == null)
            return false;
        if (other.getStringParameterDeclaration() != null && other.getStringParameterDeclaration().equals(this.getStringParameterDeclaration()) == false)
            return false;
        if (other.getDecimalParameterDeclaration() == null ^ this.getDecimalParameterDeclaration() == null)
            return false;
        if (other.getDecimalParameterDeclaration() != null && other.getDecimalParameterDeclaration().equals(this.getDecimalParameterDeclaration()) == false)
            return false;
        if (other.getIntegerParameterDeclaration() == null ^ this.getIntegerParameterDeclaration() == null)
            return false;
        if (other.getIntegerParameterDeclaration() != null && other.getIntegerParameterDeclaration().equals(this.getIntegerParameterDeclaration()) == false)
            return false;
        if (other.getDateTimeParameterDeclaration() == null ^ this.getDateTimeParameterDeclaration() == null)
            return false;
        if (other.getDateTimeParameterDeclaration() != null && other.getDateTimeParameterDeclaration().equals(this.getDateTimeParameterDeclaration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringParameterDeclaration() == null) ? 0 : getStringParameterDeclaration().hashCode());
        hashCode = prime * hashCode + ((getDecimalParameterDeclaration() == null) ? 0 : getDecimalParameterDeclaration().hashCode());
        hashCode = prime * hashCode + ((getIntegerParameterDeclaration() == null) ? 0 : getIntegerParameterDeclaration().hashCode());
        hashCode = prime * hashCode + ((getDateTimeParameterDeclaration() == null) ? 0 : getDateTimeParameterDeclaration().hashCode());
        return hashCode;
    }

    @Override
    public ParameterDeclaration clone() {
        try {
            return (ParameterDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
