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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the specific price and frequency of a recurring charges for a reserved Elasticsearch instance, or for a
 * reserved Elasticsearch instance offering.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecurringCharge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The monetary amount of the recurring charge.
     * </p>
     */
    private Double recurringChargeAmount;
    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     */
    private String recurringChargeFrequency;

    /**
     * <p>
     * The monetary amount of the recurring charge.
     * </p>
     * 
     * @param recurringChargeAmount
     *        The monetary amount of the recurring charge.
     */

    public void setRecurringChargeAmount(Double recurringChargeAmount) {
        this.recurringChargeAmount = recurringChargeAmount;
    }

    /**
     * <p>
     * The monetary amount of the recurring charge.
     * </p>
     * 
     * @return The monetary amount of the recurring charge.
     */

    public Double getRecurringChargeAmount() {
        return this.recurringChargeAmount;
    }

    /**
     * <p>
     * The monetary amount of the recurring charge.
     * </p>
     * 
     * @param recurringChargeAmount
     *        The monetary amount of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringCharge withRecurringChargeAmount(Double recurringChargeAmount) {
        setRecurringChargeAmount(recurringChargeAmount);
        return this;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param recurringChargeFrequency
     *        The frequency of the recurring charge.
     */

    public void setRecurringChargeFrequency(String recurringChargeFrequency) {
        this.recurringChargeFrequency = recurringChargeFrequency;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @return The frequency of the recurring charge.
     */

    public String getRecurringChargeFrequency() {
        return this.recurringChargeFrequency;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param recurringChargeFrequency
     *        The frequency of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringCharge withRecurringChargeFrequency(String recurringChargeFrequency) {
        setRecurringChargeFrequency(recurringChargeFrequency);
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
        if (getRecurringChargeAmount() != null)
            sb.append("RecurringChargeAmount: ").append(getRecurringChargeAmount()).append(",");
        if (getRecurringChargeFrequency() != null)
            sb.append("RecurringChargeFrequency: ").append(getRecurringChargeFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecurringCharge == false)
            return false;
        RecurringCharge other = (RecurringCharge) obj;
        if (other.getRecurringChargeAmount() == null ^ this.getRecurringChargeAmount() == null)
            return false;
        if (other.getRecurringChargeAmount() != null && other.getRecurringChargeAmount().equals(this.getRecurringChargeAmount()) == false)
            return false;
        if (other.getRecurringChargeFrequency() == null ^ this.getRecurringChargeFrequency() == null)
            return false;
        if (other.getRecurringChargeFrequency() != null && other.getRecurringChargeFrequency().equals(this.getRecurringChargeFrequency()) == false)
            return false;
        return true;
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
    public RecurringCharge clone() {
        try {
            return (RecurringCharge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.RecurringChargeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
