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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains usage information about the cost of Amazon Inspector operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Usage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Usage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The currency type used when calculating usage data.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The estimated monthly cost of Amazon Inspector.
     * </p>
     */
    private Double estimatedMonthlyCost;
    /**
     * <p>
     * The total of usage.
     * </p>
     */
    private Double total;
    /**
     * <p>
     * The type scan.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The currency type used when calculating usage data.
     * </p>
     * 
     * @param currency
     *        The currency type used when calculating usage data.
     * @see Currency
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency type used when calculating usage data.
     * </p>
     * 
     * @return The currency type used when calculating usage data.
     * @see Currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency type used when calculating usage data.
     * </p>
     * 
     * @param currency
     *        The currency type used when calculating usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public Usage withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency type used when calculating usage data.
     * </p>
     * 
     * @param currency
     *        The currency type used when calculating usage data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public Usage withCurrency(Currency currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The estimated monthly cost of Amazon Inspector.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        The estimated monthly cost of Amazon Inspector.
     */

    public void setEstimatedMonthlyCost(Double estimatedMonthlyCost) {
        this.estimatedMonthlyCost = estimatedMonthlyCost;
    }

    /**
     * <p>
     * The estimated monthly cost of Amazon Inspector.
     * </p>
     * 
     * @return The estimated monthly cost of Amazon Inspector.
     */

    public Double getEstimatedMonthlyCost() {
        return this.estimatedMonthlyCost;
    }

    /**
     * <p>
     * The estimated monthly cost of Amazon Inspector.
     * </p>
     * 
     * @param estimatedMonthlyCost
     *        The estimated monthly cost of Amazon Inspector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withEstimatedMonthlyCost(Double estimatedMonthlyCost) {
        setEstimatedMonthlyCost(estimatedMonthlyCost);
        return this;
    }

    /**
     * <p>
     * The total of usage.
     * </p>
     * 
     * @param total
     *        The total of usage.
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * The total of usage.
     * </p>
     * 
     * @return The total of usage.
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total of usage.
     * </p>
     * 
     * @param total
     *        The total of usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withTotal(Double total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The type scan.
     * </p>
     * 
     * @param type
     *        The type scan.
     * @see UsageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type scan.
     * </p>
     * 
     * @return The type scan.
     * @see UsageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type scan.
     * </p>
     * 
     * @param type
     *        The type scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public Usage withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type scan.
     * </p>
     * 
     * @param type
     *        The type scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public Usage withType(UsageType type) {
        this.type = type.toString();
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
        if (getEstimatedMonthlyCost() != null)
            sb.append("EstimatedMonthlyCost: ").append(getEstimatedMonthlyCost()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Usage == false)
            return false;
        Usage other = (Usage) obj;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getEstimatedMonthlyCost() == null ^ this.getEstimatedMonthlyCost() == null)
            return false;
        if (other.getEstimatedMonthlyCost() != null && other.getEstimatedMonthlyCost().equals(this.getEstimatedMonthlyCost()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlyCost() == null) ? 0 : getEstimatedMonthlyCost().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Usage clone() {
        try {
            return (Usage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.UsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
