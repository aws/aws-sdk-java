/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A parameter that is created in a dataset. The parameter can be a string, integer, decimal, or datetime data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DatasetParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string parameter that is created in the dataset.
     * </p>
     */
    private StringDatasetParameter stringDatasetParameter;
    /**
     * <p>
     * A decimal parameter that is created in the dataset.
     * </p>
     */
    private DecimalDatasetParameter decimalDatasetParameter;
    /**
     * <p>
     * An integer parameter that is created in the dataset.
     * </p>
     */
    private IntegerDatasetParameter integerDatasetParameter;
    /**
     * <p>
     * A date time parameter that is created in the dataset.
     * </p>
     */
    private DateTimeDatasetParameter dateTimeDatasetParameter;

    /**
     * <p>
     * A string parameter that is created in the dataset.
     * </p>
     * 
     * @param stringDatasetParameter
     *        A string parameter that is created in the dataset.
     */

    public void setStringDatasetParameter(StringDatasetParameter stringDatasetParameter) {
        this.stringDatasetParameter = stringDatasetParameter;
    }

    /**
     * <p>
     * A string parameter that is created in the dataset.
     * </p>
     * 
     * @return A string parameter that is created in the dataset.
     */

    public StringDatasetParameter getStringDatasetParameter() {
        return this.stringDatasetParameter;
    }

    /**
     * <p>
     * A string parameter that is created in the dataset.
     * </p>
     * 
     * @param stringDatasetParameter
     *        A string parameter that is created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withStringDatasetParameter(StringDatasetParameter stringDatasetParameter) {
        setStringDatasetParameter(stringDatasetParameter);
        return this;
    }

    /**
     * <p>
     * A decimal parameter that is created in the dataset.
     * </p>
     * 
     * @param decimalDatasetParameter
     *        A decimal parameter that is created in the dataset.
     */

    public void setDecimalDatasetParameter(DecimalDatasetParameter decimalDatasetParameter) {
        this.decimalDatasetParameter = decimalDatasetParameter;
    }

    /**
     * <p>
     * A decimal parameter that is created in the dataset.
     * </p>
     * 
     * @return A decimal parameter that is created in the dataset.
     */

    public DecimalDatasetParameter getDecimalDatasetParameter() {
        return this.decimalDatasetParameter;
    }

    /**
     * <p>
     * A decimal parameter that is created in the dataset.
     * </p>
     * 
     * @param decimalDatasetParameter
     *        A decimal parameter that is created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withDecimalDatasetParameter(DecimalDatasetParameter decimalDatasetParameter) {
        setDecimalDatasetParameter(decimalDatasetParameter);
        return this;
    }

    /**
     * <p>
     * An integer parameter that is created in the dataset.
     * </p>
     * 
     * @param integerDatasetParameter
     *        An integer parameter that is created in the dataset.
     */

    public void setIntegerDatasetParameter(IntegerDatasetParameter integerDatasetParameter) {
        this.integerDatasetParameter = integerDatasetParameter;
    }

    /**
     * <p>
     * An integer parameter that is created in the dataset.
     * </p>
     * 
     * @return An integer parameter that is created in the dataset.
     */

    public IntegerDatasetParameter getIntegerDatasetParameter() {
        return this.integerDatasetParameter;
    }

    /**
     * <p>
     * An integer parameter that is created in the dataset.
     * </p>
     * 
     * @param integerDatasetParameter
     *        An integer parameter that is created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withIntegerDatasetParameter(IntegerDatasetParameter integerDatasetParameter) {
        setIntegerDatasetParameter(integerDatasetParameter);
        return this;
    }

    /**
     * <p>
     * A date time parameter that is created in the dataset.
     * </p>
     * 
     * @param dateTimeDatasetParameter
     *        A date time parameter that is created in the dataset.
     */

    public void setDateTimeDatasetParameter(DateTimeDatasetParameter dateTimeDatasetParameter) {
        this.dateTimeDatasetParameter = dateTimeDatasetParameter;
    }

    /**
     * <p>
     * A date time parameter that is created in the dataset.
     * </p>
     * 
     * @return A date time parameter that is created in the dataset.
     */

    public DateTimeDatasetParameter getDateTimeDatasetParameter() {
        return this.dateTimeDatasetParameter;
    }

    /**
     * <p>
     * A date time parameter that is created in the dataset.
     * </p>
     * 
     * @param dateTimeDatasetParameter
     *        A date time parameter that is created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withDateTimeDatasetParameter(DateTimeDatasetParameter dateTimeDatasetParameter) {
        setDateTimeDatasetParameter(dateTimeDatasetParameter);
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
        if (getStringDatasetParameter() != null)
            sb.append("StringDatasetParameter: ").append(getStringDatasetParameter()).append(",");
        if (getDecimalDatasetParameter() != null)
            sb.append("DecimalDatasetParameter: ").append(getDecimalDatasetParameter()).append(",");
        if (getIntegerDatasetParameter() != null)
            sb.append("IntegerDatasetParameter: ").append(getIntegerDatasetParameter()).append(",");
        if (getDateTimeDatasetParameter() != null)
            sb.append("DateTimeDatasetParameter: ").append(getDateTimeDatasetParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetParameter == false)
            return false;
        DatasetParameter other = (DatasetParameter) obj;
        if (other.getStringDatasetParameter() == null ^ this.getStringDatasetParameter() == null)
            return false;
        if (other.getStringDatasetParameter() != null && other.getStringDatasetParameter().equals(this.getStringDatasetParameter()) == false)
            return false;
        if (other.getDecimalDatasetParameter() == null ^ this.getDecimalDatasetParameter() == null)
            return false;
        if (other.getDecimalDatasetParameter() != null && other.getDecimalDatasetParameter().equals(this.getDecimalDatasetParameter()) == false)
            return false;
        if (other.getIntegerDatasetParameter() == null ^ this.getIntegerDatasetParameter() == null)
            return false;
        if (other.getIntegerDatasetParameter() != null && other.getIntegerDatasetParameter().equals(this.getIntegerDatasetParameter()) == false)
            return false;
        if (other.getDateTimeDatasetParameter() == null ^ this.getDateTimeDatasetParameter() == null)
            return false;
        if (other.getDateTimeDatasetParameter() != null && other.getDateTimeDatasetParameter().equals(this.getDateTimeDatasetParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringDatasetParameter() == null) ? 0 : getStringDatasetParameter().hashCode());
        hashCode = prime * hashCode + ((getDecimalDatasetParameter() == null) ? 0 : getDecimalDatasetParameter().hashCode());
        hashCode = prime * hashCode + ((getIntegerDatasetParameter() == null) ? 0 : getIntegerDatasetParameter().hashCode());
        hashCode = prime * hashCode + ((getDateTimeDatasetParameter() == null) ? 0 : getDateTimeDatasetParameter().hashCode());
        return hashCode;
    }

    @Override
    public DatasetParameter clone() {
        try {
            return (DatasetParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DatasetParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
