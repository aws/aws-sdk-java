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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a usage charge for Amazon EC2 resources that repeats on a schedule.
 * </p>
 */
public class RecurringCharge implements Serializable {

    /**
     * The frequency of the recurring charge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     */
    private String frequency;

    /**
     * The amount of the recurring charge.
     */
    private Double amount;

    /**
     * The frequency of the recurring charge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     *
     * @return The frequency of the recurring charge.
     *
     * @see RecurringChargeFrequency
     */
    public String getFrequency() {
        return frequency;
    }
    
    /**
     * The frequency of the recurring charge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     *
     * @param frequency The frequency of the recurring charge.
     *
     * @see RecurringChargeFrequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    /**
     * The frequency of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     *
     * @param frequency The frequency of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RecurringChargeFrequency
     */
    public RecurringCharge withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * The frequency of the recurring charge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     *
     * @param frequency The frequency of the recurring charge.
     *
     * @see RecurringChargeFrequency
     */
    public void setFrequency(RecurringChargeFrequency frequency) {
        this.frequency = frequency.toString();
    }
    
    /**
     * The frequency of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Hourly
     *
     * @param frequency The frequency of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RecurringChargeFrequency
     */
    public RecurringCharge withFrequency(RecurringChargeFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * The amount of the recurring charge.
     *
     * @return The amount of the recurring charge.
     */
    public Double getAmount() {
        return amount;
    }
    
    /**
     * The amount of the recurring charge.
     *
     * @param amount The amount of the recurring charge.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    /**
     * The amount of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amount The amount of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RecurringCharge withAmount(Double amount) {
        this.amount = amount;
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
        if (getFrequency() != null) sb.append("Frequency: " + getFrequency() + ",");
        if (getAmount() != null) sb.append("Amount: " + getAmount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode()); 
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecurringCharge == false) return false;
        RecurringCharge other = (RecurringCharge)obj;
        
        if (other.getFrequency() == null ^ this.getFrequency() == null) return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false) return false; 
        if (other.getAmount() == null ^ this.getAmount() == null) return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false) return false; 
        return true;
    }
    
}
    