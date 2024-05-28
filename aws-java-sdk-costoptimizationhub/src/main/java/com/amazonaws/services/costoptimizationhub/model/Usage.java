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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/Usage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Usage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operation value.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The product code.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The usage unit.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The usage amount.
     * </p>
     */
    private Double usageAmount;
    /**
     * <p>
     * The usage type.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * The operation value.
     * </p>
     * 
     * @param operation
     *        The operation value.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation value.
     * </p>
     * 
     * @return The operation value.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation value.
     * </p>
     * 
     * @param operation
     *        The operation value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @param productCode
     *        The product code.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @return The product code.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @param productCode
     *        The product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The usage unit.
     * </p>
     * 
     * @param unit
     *        The usage unit.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The usage unit.
     * </p>
     * 
     * @return The usage unit.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The usage unit.
     * </p>
     * 
     * @param unit
     *        The usage unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The usage amount.
     * </p>
     * 
     * @param usageAmount
     *        The usage amount.
     */

    public void setUsageAmount(Double usageAmount) {
        this.usageAmount = usageAmount;
    }

    /**
     * <p>
     * The usage amount.
     * </p>
     * 
     * @return The usage amount.
     */

    public Double getUsageAmount() {
        return this.usageAmount;
    }

    /**
     * <p>
     * The usage amount.
     * </p>
     * 
     * @param usageAmount
     *        The usage amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withUsageAmount(Double usageAmount) {
        setUsageAmount(usageAmount);
        return this;
    }

    /**
     * <p>
     * The usage type.
     * </p>
     * 
     * @param usageType
     *        The usage type.
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The usage type.
     * </p>
     * 
     * @return The usage type.
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The usage type.
     * </p>
     * 
     * @param usageType
     *        The usage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Usage withUsageType(String usageType) {
        setUsageType(usageType);
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getUsageAmount() != null)
            sb.append("UsageAmount: ").append(getUsageAmount()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType());
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
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getUsageAmount() == null ^ this.getUsageAmount() == null)
            return false;
        if (other.getUsageAmount() != null && other.getUsageAmount().equals(this.getUsageAmount()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getUsageAmount() == null) ? 0 : getUsageAmount().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
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
        com.amazonaws.services.costoptimizationhub.model.transform.UsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
