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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateRouteCalculator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRouteCalculatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the route calculator resource to update.
     * </p>
     */
    private String calculatorName;
    /**
     * <p>
     * Updates the description for the route calculator resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     */
    @Deprecated
    private String pricingPlan;

    /**
     * <p>
     * The name of the route calculator resource to update.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource to update.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource to update.
     * </p>
     * 
     * @return The name of the route calculator resource to update.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource to update.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteCalculatorRequest withCalculatorName(String calculatorName) {
        setCalculatorName(calculatorName);
        return this;
    }

    /**
     * <p>
     * Updates the description for the route calculator resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the route calculator resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the route calculator resource.
     * </p>
     * 
     * @return Updates the description for the route calculator resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the route calculator resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the route calculator resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteCalculatorRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @return No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public UpdateRouteCalculatorRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public UpdateRouteCalculatorRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
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
        if (getCalculatorName() != null)
            sb.append("CalculatorName: ").append(getCalculatorName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRouteCalculatorRequest == false)
            return false;
        UpdateRouteCalculatorRequest other = (UpdateRouteCalculatorRequest) obj;
        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null && other.getCalculatorName().equals(this.getCalculatorName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRouteCalculatorRequest clone() {
        return (UpdateRouteCalculatorRequest) super.clone();
    }

}
