/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on termination recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TerminateRecommendationDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateRecommendationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     */
    private String estimatedMonthlySavings;
    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        Estimated savings resulting from modification, on a monthly basis.
     */

    public void setEstimatedMonthlySavings(String estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @return Estimated savings resulting from modification, on a monthly basis.
     */

    public String getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        Estimated savings resulting from modification, on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateRecommendationDetail withEstimatedMonthlySavings(String estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @return The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateRecommendationDetail withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
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
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateRecommendationDetail == false)
            return false;
        TerminateRecommendationDetail other = (TerminateRecommendationDetail) obj;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public TerminateRecommendationDetail clone() {
        try {
            return (TerminateRecommendationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.TerminateRecommendationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
