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
 * Provides the forecast to meet the target for a particular date.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WhatIfPointScenario" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfPointScenario implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date that you need the forecast results for.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The target value that you want to meet for the provided date.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The date that you need the forecast results for.
     * </p>
     * 
     * @param date
     *        The date that you need the forecast results for.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date that you need the forecast results for.
     * </p>
     * 
     * @return The date that you need the forecast results for.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date that you need the forecast results for.
     * </p>
     * 
     * @param date
     *        The date that you need the forecast results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfPointScenario withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date.
     * </p>
     * 
     * @param value
     *        The target value that you want to meet for the provided date.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date.
     * </p>
     * 
     * @return The target value that you want to meet for the provided date.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The target value that you want to meet for the provided date.
     * </p>
     * 
     * @param value
     *        The target value that you want to meet for the provided date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfPointScenario withValue(Double value) {
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
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

        if (obj instanceof WhatIfPointScenario == false)
            return false;
        WhatIfPointScenario other = (WhatIfPointScenario) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
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

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public WhatIfPointScenario clone() {
        try {
            return (WhatIfPointScenario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WhatIfPointScenarioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
