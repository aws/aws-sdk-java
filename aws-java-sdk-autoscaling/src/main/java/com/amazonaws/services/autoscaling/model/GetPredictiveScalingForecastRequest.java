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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/GetPredictiveScalingForecast"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPredictiveScalingForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. At most, the date and time can be one
     * year before the current date and time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is 30 days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. At most, the date and time can be one
     * year before the current date and time.
     * </p>
     * 
     * @param startTime
     *        The inclusive start time of the time range for the forecast data to get. At most, the date and time can be
     *        one year before the current date and time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. At most, the date and time can be one
     * year before the current date and time.
     * </p>
     * 
     * @return The inclusive start time of the time range for the forecast data to get. At most, the date and time can
     *         be one year before the current date and time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. At most, the date and time can be one
     * year before the current date and time.
     * </p>
     * 
     * @param startTime
     *        The inclusive start time of the time range for the forecast data to get. At most, the date and time can be
     *        one year before the current date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is 30 days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @param endTime
     *        The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *        the start and end time is 30 days. </p>
     *        <p>
     *        Although this parameter can accept a date and time that is more than two days in the future, the
     *        availability of forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two
     *        days in advance.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is 30 days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @return The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *         the start and end time is 30 days. </p>
     *         <p>
     *         Although this parameter can accept a date and time that is more than two days in the future, the
     *         availability of forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of
     *         two days in advance.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is 30 days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @param endTime
     *        The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *        the start and end time is 30 days. </p>
     *        <p>
     *        Although this parameter can accept a date and time that is more than two days in the future, the
     *        availability of forecast data has limits. Amazon EC2 Auto Scaling only issues forecasts for periods of two
     *        days in advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictiveScalingForecastRequest == false)
            return false;
        GetPredictiveScalingForecastRequest other = (GetPredictiveScalingForecastRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetPredictiveScalingForecastRequest clone() {
        return (GetPredictiveScalingForecastRequest) super.clone();
    }

}
