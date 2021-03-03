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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageTotalsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for this parameter,
     * Amazon Macie provides aggregated usage data for the preceding 30 days.
     * </p>
     */
    private String timeRange;

    /**
     * <p>
     * The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for this parameter,
     * Amazon Macie provides aggregated usage data for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current
     *        calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for
     *        this parameter, Amazon Macie provides aggregated usage data for the preceding 30 days.
     */

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for this parameter,
     * Amazon Macie provides aggregated usage data for the preceding 30 days.
     * </p>
     * 
     * @return The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current
     *         calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for
     *         this parameter, Amazon Macie provides aggregated usage data for the preceding 30 days.
     */

    public String getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current calendar
     * month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for this parameter,
     * Amazon Macie provides aggregated usage data for the preceding 30 days.
     * </p>
     * 
     * @param timeRange
     *        The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current
     *        calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for
     *        this parameter, Amazon Macie provides aggregated usage data for the preceding 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageTotalsRequest withTimeRange(String timeRange) {
        setTimeRange(timeRange);
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
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageTotalsRequest == false)
            return false;
        GetUsageTotalsRequest other = (GetUsageTotalsRequest) obj;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageTotalsRequest clone() {
        return (GetUsageTotalsRequest) super.clone();
    }

}
