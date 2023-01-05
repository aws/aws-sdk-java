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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the time window that utterance statistics are returned for. The time window is always relative to the last
 * time that the that utterances were aggregated. For example, if the <code>ListAggregatedUtterances</code> operation is
 * called at 1600, the time window is set to 1 hour, and the last refresh time was 1530, only utterances made between
 * 1430 and 1530 are returned.
 * </p>
 * <p>
 * You can choose the time window that statistics should be returned for.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Hours</b> - You can request utterance statistics for 1, 3, 6, 12, or 24 hour time windows. Statistics are
 * refreshed every half hour for 1 hour time windows, and hourly for the other time windows.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Days</b> - You can request utterance statistics for 3 days. Statistics are refreshed every 6 hours.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Weeks</b> - You can see statistics for one or two weeks. Statistics are refreshed every 12 hours for one week time
 * windows, and once per day for two week time windows.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/RelativeAggregationDuration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelativeAggregationDuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of time period that the <code>timeValue</code> field represents.
     * </p>
     */
    private String timeDimension;
    /**
     * <p>
     * The period of the time window to gather statistics for. The valid value depends on the setting of the
     * <code>timeDimension</code> field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Hours</code> - 1/3/6/12/24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code> - 3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Weeks</code> - 1/2
     * </p>
     * </li>
     * </ul>
     */
    private Integer timeValue;

    /**
     * <p>
     * The type of time period that the <code>timeValue</code> field represents.
     * </p>
     * 
     * @param timeDimension
     *        The type of time period that the <code>timeValue</code> field represents.
     * @see TimeDimension
     */

    public void setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
    }

    /**
     * <p>
     * The type of time period that the <code>timeValue</code> field represents.
     * </p>
     * 
     * @return The type of time period that the <code>timeValue</code> field represents.
     * @see TimeDimension
     */

    public String getTimeDimension() {
        return this.timeDimension;
    }

    /**
     * <p>
     * The type of time period that the <code>timeValue</code> field represents.
     * </p>
     * 
     * @param timeDimension
     *        The type of time period that the <code>timeValue</code> field represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeDimension
     */

    public RelativeAggregationDuration withTimeDimension(String timeDimension) {
        setTimeDimension(timeDimension);
        return this;
    }

    /**
     * <p>
     * The type of time period that the <code>timeValue</code> field represents.
     * </p>
     * 
     * @param timeDimension
     *        The type of time period that the <code>timeValue</code> field represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeDimension
     */

    public RelativeAggregationDuration withTimeDimension(TimeDimension timeDimension) {
        this.timeDimension = timeDimension.toString();
        return this;
    }

    /**
     * <p>
     * The period of the time window to gather statistics for. The valid value depends on the setting of the
     * <code>timeDimension</code> field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Hours</code> - 1/3/6/12/24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code> - 3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Weeks</code> - 1/2
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeValue
     *        The period of the time window to gather statistics for. The valid value depends on the setting of the
     *        <code>timeDimension</code> field.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Hours</code> - 1/3/6/12/24
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code> - 3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Weeks</code> - 1/2
     *        </p>
     *        </li>
     */

    public void setTimeValue(Integer timeValue) {
        this.timeValue = timeValue;
    }

    /**
     * <p>
     * The period of the time window to gather statistics for. The valid value depends on the setting of the
     * <code>timeDimension</code> field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Hours</code> - 1/3/6/12/24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code> - 3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Weeks</code> - 1/2
     * </p>
     * </li>
     * </ul>
     * 
     * @return The period of the time window to gather statistics for. The valid value depends on the setting of the
     *         <code>timeDimension</code> field.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Hours</code> - 1/3/6/12/24
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Days</code> - 3
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Weeks</code> - 1/2
     *         </p>
     *         </li>
     */

    public Integer getTimeValue() {
        return this.timeValue;
    }

    /**
     * <p>
     * The period of the time window to gather statistics for. The valid value depends on the setting of the
     * <code>timeDimension</code> field.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Hours</code> - 1/3/6/12/24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code> - 3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Weeks</code> - 1/2
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeValue
     *        The period of the time window to gather statistics for. The valid value depends on the setting of the
     *        <code>timeDimension</code> field.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Hours</code> - 1/3/6/12/24
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code> - 3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Weeks</code> - 1/2
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeAggregationDuration withTimeValue(Integer timeValue) {
        setTimeValue(timeValue);
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
        if (getTimeDimension() != null)
            sb.append("TimeDimension: ").append(getTimeDimension()).append(",");
        if (getTimeValue() != null)
            sb.append("TimeValue: ").append(getTimeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelativeAggregationDuration == false)
            return false;
        RelativeAggregationDuration other = (RelativeAggregationDuration) obj;
        if (other.getTimeDimension() == null ^ this.getTimeDimension() == null)
            return false;
        if (other.getTimeDimension() != null && other.getTimeDimension().equals(this.getTimeDimension()) == false)
            return false;
        if (other.getTimeValue() == null ^ this.getTimeValue() == null)
            return false;
        if (other.getTimeValue() != null && other.getTimeValue().equals(this.getTimeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeDimension() == null) ? 0 : getTimeDimension().hashCode());
        hashCode = prime * hashCode + ((getTimeValue() == null) ? 0 : getTimeValue().hashCode());
        return hashCode;
    }

    @Override
    public RelativeAggregationDuration clone() {
        try {
            return (RelativeAggregationDuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.RelativeAggregationDurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
