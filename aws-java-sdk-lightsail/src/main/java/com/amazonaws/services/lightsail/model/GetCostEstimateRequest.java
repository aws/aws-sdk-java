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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCostEstimate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostEstimateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource name.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The cost estimate start time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The cost estimate end time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @return The resource name.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimateRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The cost estimate start time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The cost estimate start time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The cost estimate start time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The cost estimate start time.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify
     *         <code>1538424000</code> as the start time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The cost estimate start time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The cost estimate start time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you want to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimateRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The cost estimate end time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The cost estimate end time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The cost estimate end time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The cost estimate end time.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify
     *         <code>1538427600</code> as the end time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The cost estimate end time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The cost estimate end time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you want to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimateRequest withEndTime(java.util.Date endTime) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof GetCostEstimateRequest == false)
            return false;
        GetCostEstimateRequest other = (GetCostEstimateRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCostEstimateRequest clone() {
        return (GetCostEstimateRequest) super.clone();
    }

}
