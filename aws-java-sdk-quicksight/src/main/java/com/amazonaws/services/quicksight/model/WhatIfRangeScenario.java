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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the forecast to meet the target for a particular date range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WhatIfRangeScenario" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfRangeScenario implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start date in the date range that you need the forecast results for.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The end date in the date range that you need the forecast results for.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The target value that you want to meet for the provided date range.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The start date in the date range that you need the forecast results for.
     * </p>
     * 
     * @param startDate
     *        The start date in the date range that you need the forecast results for.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date in the date range that you need the forecast results for.
     * </p>
     * 
     * @return The start date in the date range that you need the forecast results for.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start date in the date range that you need the forecast results for.
     * </p>
     * 
     * @param startDate
     *        The start date in the date range that you need the forecast results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfRangeScenario withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end date in the date range that you need the forecast results for.
     * </p>
     * 
     * @param endDate
     *        The end date in the date range that you need the forecast results for.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end date in the date range that you need the forecast results for.
     * </p>
     * 
     * @return The end date in the date range that you need the forecast results for.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end date in the date range that you need the forecast results for.
     * </p>
     * 
     * @param endDate
     *        The end date in the date range that you need the forecast results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfRangeScenario withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date range.
     * </p>
     * 
     * @param value
     *        The target value that you want to meet for the provided date range.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date range.
     * </p>
     * 
     * @return The target value that you want to meet for the provided date range.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date range.
     * </p>
     * 
     * @param value
     *        The target value that you want to meet for the provided date range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfRangeScenario withValue(Double value) {
        setValue(value);
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WhatIfRangeScenario == false)
            return false;
        WhatIfRangeScenario other = (WhatIfRangeScenario) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public WhatIfRangeScenario clone() {
        try {
            return (WhatIfRangeScenario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WhatIfRangeScenarioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
