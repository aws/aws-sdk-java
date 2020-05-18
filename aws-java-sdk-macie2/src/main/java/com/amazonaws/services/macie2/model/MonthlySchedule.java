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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/MonthlySchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonthlySchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     */
    private Integer dayOfMonth;

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @param dayOfMonth
     *        Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     */

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @return Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     */

    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @param dayOfMonth
     *        Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonthlySchedule withDayOfMonth(Integer dayOfMonth) {
        setDayOfMonth(dayOfMonth);
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
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonthlySchedule == false)
            return false;
        MonthlySchedule other = (MonthlySchedule) obj;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        return hashCode;
    }

    @Override
    public MonthlySchedule clone() {
        try {
            return (MonthlySchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.MonthlyScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
