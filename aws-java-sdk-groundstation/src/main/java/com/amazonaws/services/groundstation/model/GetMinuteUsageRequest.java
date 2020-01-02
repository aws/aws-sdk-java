/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMinuteUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The month being requested, with a value of 1-12.
     * </p>
     */
    private Integer month;
    /**
     * <p>
     * The year being requested, in the format of YYYY.
     * </p>
     */
    private Integer year;

    /**
     * <p>
     * The month being requested, with a value of 1-12.
     * </p>
     * 
     * @param month
     *        The month being requested, with a value of 1-12.
     */

    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * <p>
     * The month being requested, with a value of 1-12.
     * </p>
     * 
     * @return The month being requested, with a value of 1-12.
     */

    public Integer getMonth() {
        return this.month;
    }

    /**
     * <p>
     * The month being requested, with a value of 1-12.
     * </p>
     * 
     * @param month
     *        The month being requested, with a value of 1-12.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageRequest withMonth(Integer month) {
        setMonth(month);
        return this;
    }

    /**
     * <p>
     * The year being requested, in the format of YYYY.
     * </p>
     * 
     * @param year
     *        The year being requested, in the format of YYYY.
     */

    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * <p>
     * The year being requested, in the format of YYYY.
     * </p>
     * 
     * @return The year being requested, in the format of YYYY.
     */

    public Integer getYear() {
        return this.year;
    }

    /**
     * <p>
     * The year being requested, in the format of YYYY.
     * </p>
     * 
     * @param year
     *        The year being requested, in the format of YYYY.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageRequest withYear(Integer year) {
        setYear(year);
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
        if (getMonth() != null)
            sb.append("Month: ").append(getMonth()).append(",");
        if (getYear() != null)
            sb.append("Year: ").append(getYear());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMinuteUsageRequest == false)
            return false;
        GetMinuteUsageRequest other = (GetMinuteUsageRequest) obj;
        if (other.getMonth() == null ^ this.getMonth() == null)
            return false;
        if (other.getMonth() != null && other.getMonth().equals(this.getMonth()) == false)
            return false;
        if (other.getYear() == null ^ this.getYear() == null)
            return false;
        if (other.getYear() != null && other.getYear().equals(this.getYear()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonth() == null) ? 0 : getMonth().hashCode());
        hashCode = prime * hashCode + ((getYear() == null) ? 0 : getYear().hashCode());
        return hashCode;
    }

    @Override
    public GetMinuteUsageRequest clone() {
        return (GetMinuteUsageRequest) super.clone();
    }

}
