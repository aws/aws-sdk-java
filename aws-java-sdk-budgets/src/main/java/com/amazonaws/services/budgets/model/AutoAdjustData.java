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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters that determine the budget amount for an auto-adjusting budget.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoAdjustData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * </p>
     */
    private String autoAdjustType;
    /**
     * <p>
     * The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     * </p>
     */
    private HistoricalOptions historicalOptions;
    /**
     * <p>
     * The last time that your budget was auto-adjusted.
     * </p>
     */
    private java.util.Date lastAutoAdjustTime;

    /**
     * <p>
     * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * </p>
     * 
     * @param autoAdjustType
     *        The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * @see AutoAdjustType
     */

    public void setAutoAdjustType(String autoAdjustType) {
        this.autoAdjustType = autoAdjustType;
    }

    /**
     * <p>
     * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * </p>
     * 
     * @return The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * @see AutoAdjustType
     */

    public String getAutoAdjustType() {
        return this.autoAdjustType;
    }

    /**
     * <p>
     * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * </p>
     * 
     * @param autoAdjustType
     *        The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAdjustType
     */

    public AutoAdjustData withAutoAdjustType(String autoAdjustType) {
        setAutoAdjustType(autoAdjustType);
        return this;
    }

    /**
     * <p>
     * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * </p>
     * 
     * @param autoAdjustType
     *        The string that defines whether your budget auto-adjusts based on historical or forecasted data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAdjustType
     */

    public AutoAdjustData withAutoAdjustType(AutoAdjustType autoAdjustType) {
        this.autoAdjustType = autoAdjustType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     * </p>
     * 
     * @param historicalOptions
     *        The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     */

    public void setHistoricalOptions(HistoricalOptions historicalOptions) {
        this.historicalOptions = historicalOptions;
    }

    /**
     * <p>
     * The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     * </p>
     * 
     * @return The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     */

    public HistoricalOptions getHistoricalOptions() {
        return this.historicalOptions;
    }

    /**
     * <p>
     * The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     * </p>
     * 
     * @param historicalOptions
     *        The parameters that define or describe the historical data that your auto-adjusting budget is based on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoAdjustData withHistoricalOptions(HistoricalOptions historicalOptions) {
        setHistoricalOptions(historicalOptions);
        return this;
    }

    /**
     * <p>
     * The last time that your budget was auto-adjusted.
     * </p>
     * 
     * @param lastAutoAdjustTime
     *        The last time that your budget was auto-adjusted.
     */

    public void setLastAutoAdjustTime(java.util.Date lastAutoAdjustTime) {
        this.lastAutoAdjustTime = lastAutoAdjustTime;
    }

    /**
     * <p>
     * The last time that your budget was auto-adjusted.
     * </p>
     * 
     * @return The last time that your budget was auto-adjusted.
     */

    public java.util.Date getLastAutoAdjustTime() {
        return this.lastAutoAdjustTime;
    }

    /**
     * <p>
     * The last time that your budget was auto-adjusted.
     * </p>
     * 
     * @param lastAutoAdjustTime
     *        The last time that your budget was auto-adjusted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoAdjustData withLastAutoAdjustTime(java.util.Date lastAutoAdjustTime) {
        setLastAutoAdjustTime(lastAutoAdjustTime);
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
        if (getAutoAdjustType() != null)
            sb.append("AutoAdjustType: ").append(getAutoAdjustType()).append(",");
        if (getHistoricalOptions() != null)
            sb.append("HistoricalOptions: ").append(getHistoricalOptions()).append(",");
        if (getLastAutoAdjustTime() != null)
            sb.append("LastAutoAdjustTime: ").append(getLastAutoAdjustTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoAdjustData == false)
            return false;
        AutoAdjustData other = (AutoAdjustData) obj;
        if (other.getAutoAdjustType() == null ^ this.getAutoAdjustType() == null)
            return false;
        if (other.getAutoAdjustType() != null && other.getAutoAdjustType().equals(this.getAutoAdjustType()) == false)
            return false;
        if (other.getHistoricalOptions() == null ^ this.getHistoricalOptions() == null)
            return false;
        if (other.getHistoricalOptions() != null && other.getHistoricalOptions().equals(this.getHistoricalOptions()) == false)
            return false;
        if (other.getLastAutoAdjustTime() == null ^ this.getLastAutoAdjustTime() == null)
            return false;
        if (other.getLastAutoAdjustTime() != null && other.getLastAutoAdjustTime().equals(this.getLastAutoAdjustTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoAdjustType() == null) ? 0 : getAutoAdjustType().hashCode());
        hashCode = prime * hashCode + ((getHistoricalOptions() == null) ? 0 : getHistoricalOptions().hashCode());
        hashCode = prime * hashCode + ((getLastAutoAdjustTime() == null) ? 0 : getLastAutoAdjustTime().hashCode());
        return hashCode;
    }

    @Override
    public AutoAdjustData clone() {
        try {
            return (AutoAdjustData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.AutoAdjustDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
