/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the DescribeReservedDBInstances and DescribeReservedDBInstancesOfferings actions.
 * </p>
 */
public class RecurringCharge implements Serializable {

    /**
     * The amount of the recurring charge.
     */
    private Double recurringChargeAmount;

    /**
     * The frequency of the recurring charge.
     */
    private String recurringChargeFrequency;

    /**
     * The amount of the recurring charge.
     *
     * @return The amount of the recurring charge.
     */
    public Double getRecurringChargeAmount() {
        return recurringChargeAmount;
    }
    
    /**
     * The amount of the recurring charge.
     *
     * @param recurringChargeAmount The amount of the recurring charge.
     */
    public void setRecurringChargeAmount(Double recurringChargeAmount) {
        this.recurringChargeAmount = recurringChargeAmount;
    }
    
    /**
     * The amount of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringChargeAmount The amount of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RecurringCharge withRecurringChargeAmount(Double recurringChargeAmount) {
        this.recurringChargeAmount = recurringChargeAmount;
        return this;
    }

    /**
     * The frequency of the recurring charge.
     *
     * @return The frequency of the recurring charge.
     */
    public String getRecurringChargeFrequency() {
        return recurringChargeFrequency;
    }
    
    /**
     * The frequency of the recurring charge.
     *
     * @param recurringChargeFrequency The frequency of the recurring charge.
     */
    public void setRecurringChargeFrequency(String recurringChargeFrequency) {
        this.recurringChargeFrequency = recurringChargeFrequency;
    }
    
    /**
     * The frequency of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringChargeFrequency The frequency of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RecurringCharge withRecurringChargeFrequency(String recurringChargeFrequency) {
        this.recurringChargeFrequency = recurringChargeFrequency;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecurringChargeAmount() != null) sb.append("RecurringChargeAmount: " + getRecurringChargeAmount() + ",");
        if (getRecurringChargeFrequency() != null) sb.append("RecurringChargeFrequency: " + getRecurringChargeFrequency() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRecurringChargeAmount() == null) ? 0 : getRecurringChargeAmount().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringChargeFrequency() == null) ? 0 : getRecurringChargeFrequency().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecurringCharge == false) return false;
        RecurringCharge other = (RecurringCharge)obj;
        
        if (other.getRecurringChargeAmount() == null ^ this.getRecurringChargeAmount() == null) return false;
        if (other.getRecurringChargeAmount() != null && other.getRecurringChargeAmount().equals(this.getRecurringChargeAmount()) == false) return false; 
        if (other.getRecurringChargeFrequency() == null ^ this.getRecurringChargeFrequency() == null) return false;
        if (other.getRecurringChargeFrequency() != null && other.getRecurringChargeFrequency().equals(this.getRecurringChargeFrequency()) == false) return false; 
        return true;
    }
    
}
    