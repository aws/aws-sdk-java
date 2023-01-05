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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by adopting Compute
 * Optimizer recommendations for a given resource.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/compute-optimizer/latest/ug/view-ec2-recommendations.html#ec2-savings-calculation"
 * >Estimated monthly savings and savings opportunities</a> in the <i>Compute Optimizer User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/EstimatedMonthlySavings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimatedMonthlySavings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The currency of the estimated monthly savings.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The value of the estimated monthly savings.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The currency of the estimated monthly savings.
     * </p>
     * 
     * @param currency
     *        The currency of the estimated monthly savings.
     * @see Currency
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency of the estimated monthly savings.
     * </p>
     * 
     * @return The currency of the estimated monthly savings.
     * @see Currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency of the estimated monthly savings.
     * </p>
     * 
     * @param currency
     *        The currency of the estimated monthly savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public EstimatedMonthlySavings withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency of the estimated monthly savings.
     * </p>
     * 
     * @param currency
     *        The currency of the estimated monthly savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public EstimatedMonthlySavings withCurrency(Currency currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The value of the estimated monthly savings.
     * </p>
     * 
     * @param value
     *        The value of the estimated monthly savings.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the estimated monthly savings.
     * </p>
     * 
     * @return The value of the estimated monthly savings.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the estimated monthly savings.
     * </p>
     * 
     * @param value
     *        The value of the estimated monthly savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedMonthlySavings withValue(Double value) {
        setValue(value);
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
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimatedMonthlySavings == false)
            return false;
        EstimatedMonthlySavings other = (EstimatedMonthlySavings) obj;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EstimatedMonthlySavings clone() {
        try {
            return (EstimatedMonthlySavings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.EstimatedMonthlySavingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
