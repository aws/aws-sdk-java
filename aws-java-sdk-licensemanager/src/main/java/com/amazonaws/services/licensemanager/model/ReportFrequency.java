/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on how frequently reports are generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ReportFrequency" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportFrequency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of times within the frequency period that a report will be generated. Currently only <code>1</code> is
     * supported.
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * Time period between each report. The period can be daily, weekly, or monthly.
     * </p>
     */
    private String period;

    /**
     * <p>
     * Number of times within the frequency period that a report will be generated. Currently only <code>1</code> is
     * supported.
     * </p>
     * 
     * @param value
     *        Number of times within the frequency period that a report will be generated. Currently only <code>1</code>
     *        is supported.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Number of times within the frequency period that a report will be generated. Currently only <code>1</code> is
     * supported.
     * </p>
     * 
     * @return Number of times within the frequency period that a report will be generated. Currently only
     *         <code>1</code> is supported.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Number of times within the frequency period that a report will be generated. Currently only <code>1</code> is
     * supported.
     * </p>
     * 
     * @param value
     *        Number of times within the frequency period that a report will be generated. Currently only <code>1</code>
     *        is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportFrequency withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Time period between each report. The period can be daily, weekly, or monthly.
     * </p>
     * 
     * @param period
     *        Time period between each report. The period can be daily, weekly, or monthly.
     * @see ReportFrequencyType
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * Time period between each report. The period can be daily, weekly, or monthly.
     * </p>
     * 
     * @return Time period between each report. The period can be daily, weekly, or monthly.
     * @see ReportFrequencyType
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * Time period between each report. The period can be daily, weekly, or monthly.
     * </p>
     * 
     * @param period
     *        Time period between each report. The period can be daily, weekly, or monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequencyType
     */

    public ReportFrequency withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * Time period between each report. The period can be daily, weekly, or monthly.
     * </p>
     * 
     * @param period
     *        Time period between each report. The period can be daily, weekly, or monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFrequencyType
     */

    public ReportFrequency withPeriod(ReportFrequencyType period) {
        this.period = period.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportFrequency == false)
            return false;
        ReportFrequency other = (ReportFrequency) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ReportFrequency clone() {
        try {
            return (ReportFrequency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ReportFrequencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
