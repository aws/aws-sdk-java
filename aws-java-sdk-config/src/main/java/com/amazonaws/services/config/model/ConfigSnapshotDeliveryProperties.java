/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * Options for how AWS Config delivers configuration snapshots to the
 * Amazon S3 bucket in your delivery channel.
 * </p>
 */
public class ConfigSnapshotDeliveryProperties implements Serializable, Cloneable {

    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     */
    private String deliveryFrequency;

    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @return The frequency with which a AWS Config recurringly delivers
     *         configuration snapshots.
     *
     * @see MaximumExecutionFrequency
     */
    public String getDeliveryFrequency() {
        return deliveryFrequency;
    }
    
    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param deliveryFrequency The frequency with which a AWS Config recurringly delivers
     *         configuration snapshots.
     *
     * @see MaximumExecutionFrequency
     */
    public void setDeliveryFrequency(String deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }
    
    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param deliveryFrequency The frequency with which a AWS Config recurringly delivers
     *         configuration snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MaximumExecutionFrequency
     */
    public ConfigSnapshotDeliveryProperties withDeliveryFrequency(String deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
        return this;
    }

    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param deliveryFrequency The frequency with which a AWS Config recurringly delivers
     *         configuration snapshots.
     *
     * @see MaximumExecutionFrequency
     */
    public void setDeliveryFrequency(MaximumExecutionFrequency deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency.toString();
    }
    
    /**
     * The frequency with which a AWS Config recurringly delivers
     * configuration snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     *
     * @param deliveryFrequency The frequency with which a AWS Config recurringly delivers
     *         configuration snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MaximumExecutionFrequency
     */
    public ConfigSnapshotDeliveryProperties withDeliveryFrequency(MaximumExecutionFrequency deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency.toString();
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
        if (getDeliveryFrequency() != null) sb.append("DeliveryFrequency: " + getDeliveryFrequency() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryFrequency() == null) ? 0 : getDeliveryFrequency().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigSnapshotDeliveryProperties == false) return false;
        ConfigSnapshotDeliveryProperties other = (ConfigSnapshotDeliveryProperties)obj;
        
        if (other.getDeliveryFrequency() == null ^ this.getDeliveryFrequency() == null) return false;
        if (other.getDeliveryFrequency() != null && other.getDeliveryFrequency().equals(this.getDeliveryFrequency()) == false) return false; 
        return true;
    }
    
    @Override
    public ConfigSnapshotDeliveryProperties clone() {
        try {
            return (ConfigSnapshotDeliveryProperties) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    