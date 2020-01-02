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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateBudgetFromResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateBudgetFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget you want to disassociate.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * 
     * @return The name of the budget you want to disassociate.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget you want to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateBudgetFromResourceRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     * </p>
     * 
     * @return The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateBudgetFromResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateBudgetFromResourceRequest == false)
            return false;
        DisassociateBudgetFromResourceRequest other = (DisassociateBudgetFromResourceRequest) obj;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateBudgetFromResourceRequest clone() {
        return (DisassociateBudgetFromResourceRequest) super.clone();
    }

}
