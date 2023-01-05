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
 * The forecast scenario of a forecast in the line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ForecastScenario" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForecastScenario implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The what-if analysis forecast setup with the target date.
     * </p>
     */
    private WhatIfPointScenario whatIfPointScenario;
    /**
     * <p>
     * The what-if analysis forecast setup with the date range.
     * </p>
     */
    private WhatIfRangeScenario whatIfRangeScenario;

    /**
     * <p>
     * The what-if analysis forecast setup with the target date.
     * </p>
     * 
     * @param whatIfPointScenario
     *        The what-if analysis forecast setup with the target date.
     */

    public void setWhatIfPointScenario(WhatIfPointScenario whatIfPointScenario) {
        this.whatIfPointScenario = whatIfPointScenario;
    }

    /**
     * <p>
     * The what-if analysis forecast setup with the target date.
     * </p>
     * 
     * @return The what-if analysis forecast setup with the target date.
     */

    public WhatIfPointScenario getWhatIfPointScenario() {
        return this.whatIfPointScenario;
    }

    /**
     * <p>
     * The what-if analysis forecast setup with the target date.
     * </p>
     * 
     * @param whatIfPointScenario
     *        The what-if analysis forecast setup with the target date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastScenario withWhatIfPointScenario(WhatIfPointScenario whatIfPointScenario) {
        setWhatIfPointScenario(whatIfPointScenario);
        return this;
    }

    /**
     * <p>
     * The what-if analysis forecast setup with the date range.
     * </p>
     * 
     * @param whatIfRangeScenario
     *        The what-if analysis forecast setup with the date range.
     */

    public void setWhatIfRangeScenario(WhatIfRangeScenario whatIfRangeScenario) {
        this.whatIfRangeScenario = whatIfRangeScenario;
    }

    /**
     * <p>
     * The what-if analysis forecast setup with the date range.
     * </p>
     * 
     * @return The what-if analysis forecast setup with the date range.
     */

    public WhatIfRangeScenario getWhatIfRangeScenario() {
        return this.whatIfRangeScenario;
    }

    /**
     * <p>
     * The what-if analysis forecast setup with the date range.
     * </p>
     * 
     * @param whatIfRangeScenario
     *        The what-if analysis forecast setup with the date range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastScenario withWhatIfRangeScenario(WhatIfRangeScenario whatIfRangeScenario) {
        setWhatIfRangeScenario(whatIfRangeScenario);
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
        if (getWhatIfPointScenario() != null)
            sb.append("WhatIfPointScenario: ").append(getWhatIfPointScenario()).append(",");
        if (getWhatIfRangeScenario() != null)
            sb.append("WhatIfRangeScenario: ").append(getWhatIfRangeScenario());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastScenario == false)
            return false;
        ForecastScenario other = (ForecastScenario) obj;
        if (other.getWhatIfPointScenario() == null ^ this.getWhatIfPointScenario() == null)
            return false;
        if (other.getWhatIfPointScenario() != null && other.getWhatIfPointScenario().equals(this.getWhatIfPointScenario()) == false)
            return false;
        if (other.getWhatIfRangeScenario() == null ^ this.getWhatIfRangeScenario() == null)
            return false;
        if (other.getWhatIfRangeScenario() != null && other.getWhatIfRangeScenario().equals(this.getWhatIfRangeScenario()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfPointScenario() == null) ? 0 : getWhatIfPointScenario().hashCode());
        hashCode = prime * hashCode + ((getWhatIfRangeScenario() == null) ? 0 : getWhatIfRangeScenario().hashCode());
        return hashCode;
    }

    @Override
    public ForecastScenario clone() {
        try {
            return (ForecastScenario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ForecastScenarioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
