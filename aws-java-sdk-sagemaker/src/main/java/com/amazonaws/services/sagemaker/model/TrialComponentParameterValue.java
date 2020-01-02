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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value of a hyperparameter. Only one of <code>NumberValue</code> or <code>StringValue</code> can be specified.
 * </p>
 * <p>
 * This object is specified in the <a>CreateTrialComponent</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentParameterValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify
     * the <code>NumberValue</code> parameter.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the
     * <code>StringValue</code> parameter.
     * </p>
     */
    private Double numberValue;

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify
     * the <code>NumberValue</code> parameter.
     * </p>
     * 
     * @param stringValue
     *        The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't
     *        specify the <code>NumberValue</code> parameter.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify
     * the <code>NumberValue</code> parameter.
     * </p>
     * 
     * @return The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't
     *         specify the <code>NumberValue</code> parameter.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify
     * the <code>NumberValue</code> parameter.
     * </p>
     * 
     * @param stringValue
     *        The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't
     *        specify the <code>NumberValue</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentParameterValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the
     * <code>StringValue</code> parameter.
     * </p>
     * 
     * @param numberValue
     *        The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't
     *        specify the <code>StringValue</code> parameter.
     */

    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the
     * <code>StringValue</code> parameter.
     * </p>
     * 
     * @return The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't
     *         specify the <code>StringValue</code> parameter.
     */

    public Double getNumberValue() {
        return this.numberValue;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the
     * <code>StringValue</code> parameter.
     * </p>
     * 
     * @param numberValue
     *        The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't
     *        specify the <code>StringValue</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentParameterValue withNumberValue(Double numberValue) {
        setNumberValue(numberValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getNumberValue() != null)
            sb.append("NumberValue: ").append(getNumberValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentParameterValue == false)
            return false;
        TrialComponentParameterValue other = (TrialComponentParameterValue) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getNumberValue() == null ^ this.getNumberValue() == null)
            return false;
        if (other.getNumberValue() != null && other.getNumberValue().equals(this.getNumberValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getNumberValue() == null) ? 0 : getNumberValue().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentParameterValue clone() {
        try {
            return (TrialComponentParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
