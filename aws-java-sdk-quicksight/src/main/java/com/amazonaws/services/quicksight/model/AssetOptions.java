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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of analysis level configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the timezone for the analysis.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * Determines the week start day for an analysis.
     * </p>
     */
    private String weekStart;

    /**
     * <p>
     * Determines the timezone for the analysis.
     * </p>
     * 
     * @param timezone
     *        Determines the timezone for the analysis.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * Determines the timezone for the analysis.
     * </p>
     * 
     * @return Determines the timezone for the analysis.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * Determines the timezone for the analysis.
     * </p>
     * 
     * @param timezone
     *        Determines the timezone for the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetOptions withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * Determines the week start day for an analysis.
     * </p>
     * 
     * @param weekStart
     *        Determines the week start day for an analysis.
     * @see DayOfTheWeek
     */

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    /**
     * <p>
     * Determines the week start day for an analysis.
     * </p>
     * 
     * @return Determines the week start day for an analysis.
     * @see DayOfTheWeek
     */

    public String getWeekStart() {
        return this.weekStart;
    }

    /**
     * <p>
     * Determines the week start day for an analysis.
     * </p>
     * 
     * @param weekStart
     *        Determines the week start day for an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfTheWeek
     */

    public AssetOptions withWeekStart(String weekStart) {
        setWeekStart(weekStart);
        return this;
    }

    /**
     * <p>
     * Determines the week start day for an analysis.
     * </p>
     * 
     * @param weekStart
     *        Determines the week start day for an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfTheWeek
     */

    public AssetOptions withWeekStart(DayOfTheWeek weekStart) {
        this.weekStart = weekStart.toString();
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
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getWeekStart() != null)
            sb.append("WeekStart: ").append(getWeekStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetOptions == false)
            return false;
        AssetOptions other = (AssetOptions) obj;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getWeekStart() == null ^ this.getWeekStart() == null)
            return false;
        if (other.getWeekStart() != null && other.getWeekStart().equals(this.getWeekStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getWeekStart() == null) ? 0 : getWeekStart().hashCode());
        return hashCode;
    }

    @Override
    public AssetOptions clone() {
        try {
            return (AssetOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
