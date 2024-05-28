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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the automation configuration in numeric questions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormNumericQuestionAutomation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormNumericQuestionAutomation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property value of the automation.
     * </p>
     */
    private NumericQuestionPropertyValueAutomation propertyValue;

    /**
     * <p>
     * The property value of the automation.
     * </p>
     * 
     * @param propertyValue
     *        The property value of the automation.
     */

    public void setPropertyValue(NumericQuestionPropertyValueAutomation propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * <p>
     * The property value of the automation.
     * </p>
     * 
     * @return The property value of the automation.
     */

    public NumericQuestionPropertyValueAutomation getPropertyValue() {
        return this.propertyValue;
    }

    /**
     * <p>
     * The property value of the automation.
     * </p>
     * 
     * @param propertyValue
     *        The property value of the automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionAutomation withPropertyValue(NumericQuestionPropertyValueAutomation propertyValue) {
        setPropertyValue(propertyValue);
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
        if (getPropertyValue() != null)
            sb.append("PropertyValue: ").append(getPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormNumericQuestionAutomation == false)
            return false;
        EvaluationFormNumericQuestionAutomation other = (EvaluationFormNumericQuestionAutomation) obj;
        if (other.getPropertyValue() == null ^ this.getPropertyValue() == null)
            return false;
        if (other.getPropertyValue() != null && other.getPropertyValue().equals(this.getPropertyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyValue() == null) ? 0 : getPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormNumericQuestionAutomation clone() {
        try {
            return (EvaluationFormNumericQuestionAutomation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormNumericQuestionAutomationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
