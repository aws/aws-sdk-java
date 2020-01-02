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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Parameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * String parameters.
     * </p>
     */
    private java.util.List<StringParameter> stringParameters;
    /**
     * <p>
     * Integer parameters.
     * </p>
     */
    private java.util.List<IntegerParameter> integerParameters;
    /**
     * <p>
     * Decimal parameters.
     * </p>
     */
    private java.util.List<DecimalParameter> decimalParameters;
    /**
     * <p>
     * DateTime parameters.
     * </p>
     */
    private java.util.List<DateTimeParameter> dateTimeParameters;

    /**
     * <p>
     * String parameters.
     * </p>
     * 
     * @return String parameters.
     */

    public java.util.List<StringParameter> getStringParameters() {
        return stringParameters;
    }

    /**
     * <p>
     * String parameters.
     * </p>
     * 
     * @param stringParameters
     *        String parameters.
     */

    public void setStringParameters(java.util.Collection<StringParameter> stringParameters) {
        if (stringParameters == null) {
            this.stringParameters = null;
            return;
        }

        this.stringParameters = new java.util.ArrayList<StringParameter>(stringParameters);
    }

    /**
     * <p>
     * String parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringParameters(java.util.Collection)} or {@link #withStringParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stringParameters
     *        String parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withStringParameters(StringParameter... stringParameters) {
        if (this.stringParameters == null) {
            setStringParameters(new java.util.ArrayList<StringParameter>(stringParameters.length));
        }
        for (StringParameter ele : stringParameters) {
            this.stringParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * String parameters.
     * </p>
     * 
     * @param stringParameters
     *        String parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withStringParameters(java.util.Collection<StringParameter> stringParameters) {
        setStringParameters(stringParameters);
        return this;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * 
     * @return Integer parameters.
     */

    public java.util.List<IntegerParameter> getIntegerParameters() {
        return integerParameters;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * 
     * @param integerParameters
     *        Integer parameters.
     */

    public void setIntegerParameters(java.util.Collection<IntegerParameter> integerParameters) {
        if (integerParameters == null) {
            this.integerParameters = null;
            return;
        }

        this.integerParameters = new java.util.ArrayList<IntegerParameter>(integerParameters);
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerParameters(java.util.Collection)} or {@link #withIntegerParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param integerParameters
     *        Integer parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withIntegerParameters(IntegerParameter... integerParameters) {
        if (this.integerParameters == null) {
            setIntegerParameters(new java.util.ArrayList<IntegerParameter>(integerParameters.length));
        }
        for (IntegerParameter ele : integerParameters) {
            this.integerParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * 
     * @param integerParameters
     *        Integer parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withIntegerParameters(java.util.Collection<IntegerParameter> integerParameters) {
        setIntegerParameters(integerParameters);
        return this;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * 
     * @return Decimal parameters.
     */

    public java.util.List<DecimalParameter> getDecimalParameters() {
        return decimalParameters;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * 
     * @param decimalParameters
     *        Decimal parameters.
     */

    public void setDecimalParameters(java.util.Collection<DecimalParameter> decimalParameters) {
        if (decimalParameters == null) {
            this.decimalParameters = null;
            return;
        }

        this.decimalParameters = new java.util.ArrayList<DecimalParameter>(decimalParameters);
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDecimalParameters(java.util.Collection)} or {@link #withDecimalParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param decimalParameters
     *        Decimal parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withDecimalParameters(DecimalParameter... decimalParameters) {
        if (this.decimalParameters == null) {
            setDecimalParameters(new java.util.ArrayList<DecimalParameter>(decimalParameters.length));
        }
        for (DecimalParameter ele : decimalParameters) {
            this.decimalParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * 
     * @param decimalParameters
     *        Decimal parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withDecimalParameters(java.util.Collection<DecimalParameter> decimalParameters) {
        setDecimalParameters(decimalParameters);
        return this;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * 
     * @return DateTime parameters.
     */

    public java.util.List<DateTimeParameter> getDateTimeParameters() {
        return dateTimeParameters;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * 
     * @param dateTimeParameters
     *        DateTime parameters.
     */

    public void setDateTimeParameters(java.util.Collection<DateTimeParameter> dateTimeParameters) {
        if (dateTimeParameters == null) {
            this.dateTimeParameters = null;
            return;
        }

        this.dateTimeParameters = new java.util.ArrayList<DateTimeParameter>(dateTimeParameters);
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDateTimeParameters(java.util.Collection)} or {@link #withDateTimeParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dateTimeParameters
     *        DateTime parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withDateTimeParameters(DateTimeParameter... dateTimeParameters) {
        if (this.dateTimeParameters == null) {
            setDateTimeParameters(new java.util.ArrayList<DateTimeParameter>(dateTimeParameters.length));
        }
        for (DateTimeParameter ele : dateTimeParameters) {
            this.dateTimeParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * 
     * @param dateTimeParameters
     *        DateTime parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withDateTimeParameters(java.util.Collection<DateTimeParameter> dateTimeParameters) {
        setDateTimeParameters(dateTimeParameters);
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
        if (getStringParameters() != null)
            sb.append("StringParameters: ").append(getStringParameters()).append(",");
        if (getIntegerParameters() != null)
            sb.append("IntegerParameters: ").append(getIntegerParameters()).append(",");
        if (getDecimalParameters() != null)
            sb.append("DecimalParameters: ").append(getDecimalParameters()).append(",");
        if (getDateTimeParameters() != null)
            sb.append("DateTimeParameters: ").append(getDateTimeParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameters == false)
            return false;
        Parameters other = (Parameters) obj;
        if (other.getStringParameters() == null ^ this.getStringParameters() == null)
            return false;
        if (other.getStringParameters() != null && other.getStringParameters().equals(this.getStringParameters()) == false)
            return false;
        if (other.getIntegerParameters() == null ^ this.getIntegerParameters() == null)
            return false;
        if (other.getIntegerParameters() != null && other.getIntegerParameters().equals(this.getIntegerParameters()) == false)
            return false;
        if (other.getDecimalParameters() == null ^ this.getDecimalParameters() == null)
            return false;
        if (other.getDecimalParameters() != null && other.getDecimalParameters().equals(this.getDecimalParameters()) == false)
            return false;
        if (other.getDateTimeParameters() == null ^ this.getDateTimeParameters() == null)
            return false;
        if (other.getDateTimeParameters() != null && other.getDateTimeParameters().equals(this.getDateTimeParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringParameters() == null) ? 0 : getStringParameters().hashCode());
        hashCode = prime * hashCode + ((getIntegerParameters() == null) ? 0 : getIntegerParameters().hashCode());
        hashCode = prime * hashCode + ((getDecimalParameters() == null) ? 0 : getDecimalParameters().hashCode());
        hashCode = prime * hashCode + ((getDateTimeParameters() == null) ? 0 : getDateTimeParameters().hashCode());
        return hashCode;
    }

    @Override
    public Parameters clone() {
        try {
            return (Parameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
