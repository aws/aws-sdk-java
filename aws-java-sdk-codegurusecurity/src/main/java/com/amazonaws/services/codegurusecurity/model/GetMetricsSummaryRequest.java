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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricsSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within the past
     * two years since metrics data is only stored for two years. If a date outside of this range is passed, the
     * response will be empty.
     * </p>
     */
    private java.util.Date date;

    /**
     * <p>
     * The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within the past
     * two years since metrics data is only stored for two years. If a date outside of this range is passed, the
     * response will be empty.
     * </p>
     * 
     * @param date
     *        The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within
     *        the past two years since metrics data is only stored for two years. If a date outside of this range is
     *        passed, the response will be empty.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within the past
     * two years since metrics data is only stored for two years. If a date outside of this range is passed, the
     * response will be empty.
     * </p>
     * 
     * @return The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within
     *         the past two years since metrics data is only stored for two years. If a date outside of this range is
     *         passed, the response will be empty.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within the past
     * two years since metrics data is only stored for two years. If a date outside of this range is passed, the
     * response will be empty.
     * </p>
     * 
     * @param date
     *        The date you want to retrieve summary metrics from, rounded to the nearest day. The date must be within
     *        the past two years since metrics data is only stored for two years. If a date outside of this range is
     *        passed, the response will be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsSummaryRequest withDate(java.util.Date date) {
        setDate(date);
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
            sb.append("Date: ").append(getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricsSummaryRequest == false)
            return false;
        GetMetricsSummaryRequest other = (GetMetricsSummaryRequest) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricsSummaryRequest clone() {
        return (GetMetricsSummaryRequest) super.clone();
    }

}
