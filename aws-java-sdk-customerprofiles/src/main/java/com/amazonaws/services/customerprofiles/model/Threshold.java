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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The threshold for the calculated attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/Threshold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Threshold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the threshold.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The operator of the threshold.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The value of the threshold.
     * </p>
     * 
     * @param value
     *        The value of the threshold.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the threshold.
     * </p>
     * 
     * @return The value of the threshold.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the threshold.
     * </p>
     * 
     * @param value
     *        The value of the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threshold withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The operator of the threshold.
     * </p>
     * 
     * @param operator
     *        The operator of the threshold.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator of the threshold.
     * </p>
     * 
     * @return The operator of the threshold.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator of the threshold.
     * </p>
     * 
     * @param operator
     *        The operator of the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Threshold withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator of the threshold.
     * </p>
     * 
     * @param operator
     *        The operator of the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Threshold withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Threshold == false)
            return false;
        Threshold other = (Threshold) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public Threshold clone() {
        try {
            return (Threshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
