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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The start and end time of the budget.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BudgetSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fixed start and end time of the budget's schedule.
     * </p>
     */
    private FixedBudgetSchedule fixed;

    /**
     * <p>
     * The fixed start and end time of the budget's schedule.
     * </p>
     * 
     * @param fixed
     *        The fixed start and end time of the budget's schedule.
     */

    public void setFixed(FixedBudgetSchedule fixed) {
        this.fixed = fixed;
    }

    /**
     * <p>
     * The fixed start and end time of the budget's schedule.
     * </p>
     * 
     * @return The fixed start and end time of the budget's schedule.
     */

    public FixedBudgetSchedule getFixed() {
        return this.fixed;
    }

    /**
     * <p>
     * The fixed start and end time of the budget's schedule.
     * </p>
     * 
     * @param fixed
     *        The fixed start and end time of the budget's schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSchedule withFixed(FixedBudgetSchedule fixed) {
        setFixed(fixed);
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
        if (getFixed() != null)
            sb.append("Fixed: ").append(getFixed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetSchedule == false)
            return false;
        BudgetSchedule other = (BudgetSchedule) obj;
        if (other.getFixed() == null ^ this.getFixed() == null)
            return false;
        if (other.getFixed() != null && other.getFixed().equals(this.getFixed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFixed() == null) ? 0 : getFixed().hashCode());
        return hashCode;
    }

    @Override
    public BudgetSchedule clone() {
        try {
            return (BudgetSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.BudgetScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
