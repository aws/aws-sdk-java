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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansUtilizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * </p>
     */
    private java.util.List<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime;
    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     * </p>
     */
    private SavingsPlansUtilizationAggregates total;

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * </p>
     * 
     * @return The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     */

    public java.util.List<SavingsPlansUtilizationByTime> getSavingsPlansUtilizationsByTime() {
        return savingsPlansUtilizationsByTime;
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * </p>
     * 
     * @param savingsPlansUtilizationsByTime
     *        The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     */

    public void setSavingsPlansUtilizationsByTime(java.util.Collection<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime) {
        if (savingsPlansUtilizationsByTime == null) {
            this.savingsPlansUtilizationsByTime = null;
            return;
        }

        this.savingsPlansUtilizationsByTime = new java.util.ArrayList<SavingsPlansUtilizationByTime>(savingsPlansUtilizationsByTime);
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlansUtilizationsByTime(java.util.Collection)} or
     * {@link #withSavingsPlansUtilizationsByTime(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param savingsPlansUtilizationsByTime
     *        The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationResult withSavingsPlansUtilizationsByTime(SavingsPlansUtilizationByTime... savingsPlansUtilizationsByTime) {
        if (this.savingsPlansUtilizationsByTime == null) {
            setSavingsPlansUtilizationsByTime(new java.util.ArrayList<SavingsPlansUtilizationByTime>(savingsPlansUtilizationsByTime.length));
        }
        for (SavingsPlansUtilizationByTime ele : savingsPlansUtilizationsByTime) {
            this.savingsPlansUtilizationsByTime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * </p>
     * 
     * @param savingsPlansUtilizationsByTime
     *        The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationResult withSavingsPlansUtilizationsByTime(
            java.util.Collection<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime) {
        setSavingsPlansUtilizationsByTime(savingsPlansUtilizationsByTime);
        return this;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     * </p>
     * 
     * @param total
     *        The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     */

    public void setTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     * </p>
     * 
     * @return The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     */

    public SavingsPlansUtilizationAggregates getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     * </p>
     * 
     * @param total
     *        The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationResult withTotal(SavingsPlansUtilizationAggregates total) {
        setTotal(total);
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
        if (getSavingsPlansUtilizationsByTime() != null)
            sb.append("SavingsPlansUtilizationsByTime: ").append(getSavingsPlansUtilizationsByTime()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansUtilizationResult == false)
            return false;
        GetSavingsPlansUtilizationResult other = (GetSavingsPlansUtilizationResult) obj;
        if (other.getSavingsPlansUtilizationsByTime() == null ^ this.getSavingsPlansUtilizationsByTime() == null)
            return false;
        if (other.getSavingsPlansUtilizationsByTime() != null
                && other.getSavingsPlansUtilizationsByTime().equals(this.getSavingsPlansUtilizationsByTime()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlansUtilizationsByTime() == null) ? 0 : getSavingsPlansUtilizationsByTime().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansUtilizationResult clone() {
        try {
            return (GetSavingsPlansUtilizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
