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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCostEstimate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostEstimateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the estimate's forecasted cost or usage.
     * </p>
     */
    private java.util.List<ResourceBudgetEstimate> resourcesBudgetEstimate;

    /**
     * <p>
     * Returns the estimate's forecasted cost or usage.
     * </p>
     * 
     * @return Returns the estimate's forecasted cost or usage.
     */

    public java.util.List<ResourceBudgetEstimate> getResourcesBudgetEstimate() {
        return resourcesBudgetEstimate;
    }

    /**
     * <p>
     * Returns the estimate's forecasted cost or usage.
     * </p>
     * 
     * @param resourcesBudgetEstimate
     *        Returns the estimate's forecasted cost or usage.
     */

    public void setResourcesBudgetEstimate(java.util.Collection<ResourceBudgetEstimate> resourcesBudgetEstimate) {
        if (resourcesBudgetEstimate == null) {
            this.resourcesBudgetEstimate = null;
            return;
        }

        this.resourcesBudgetEstimate = new java.util.ArrayList<ResourceBudgetEstimate>(resourcesBudgetEstimate);
    }

    /**
     * <p>
     * Returns the estimate's forecasted cost or usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesBudgetEstimate(java.util.Collection)} or
     * {@link #withResourcesBudgetEstimate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourcesBudgetEstimate
     *        Returns the estimate's forecasted cost or usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimateResult withResourcesBudgetEstimate(ResourceBudgetEstimate... resourcesBudgetEstimate) {
        if (this.resourcesBudgetEstimate == null) {
            setResourcesBudgetEstimate(new java.util.ArrayList<ResourceBudgetEstimate>(resourcesBudgetEstimate.length));
        }
        for (ResourceBudgetEstimate ele : resourcesBudgetEstimate) {
            this.resourcesBudgetEstimate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the estimate's forecasted cost or usage.
     * </p>
     * 
     * @param resourcesBudgetEstimate
     *        Returns the estimate's forecasted cost or usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimateResult withResourcesBudgetEstimate(java.util.Collection<ResourceBudgetEstimate> resourcesBudgetEstimate) {
        setResourcesBudgetEstimate(resourcesBudgetEstimate);
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
        if (getResourcesBudgetEstimate() != null)
            sb.append("ResourcesBudgetEstimate: ").append(getResourcesBudgetEstimate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostEstimateResult == false)
            return false;
        GetCostEstimateResult other = (GetCostEstimateResult) obj;
        if (other.getResourcesBudgetEstimate() == null ^ this.getResourcesBudgetEstimate() == null)
            return false;
        if (other.getResourcesBudgetEstimate() != null && other.getResourcesBudgetEstimate().equals(this.getResourcesBudgetEstimate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcesBudgetEstimate() == null) ? 0 : getResourcesBudgetEstimate().hashCode());
        return hashCode;
    }

    @Override
    public GetCostEstimateResult clone() {
        try {
            return (GetCostEstimateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
