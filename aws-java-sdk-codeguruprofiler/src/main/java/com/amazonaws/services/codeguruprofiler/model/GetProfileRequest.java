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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the getProfileRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the returned profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     */
    private String accept;
    /**
     * <p>
     * The end time of the requested profile. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * <p>
     * If you specify <code>endTime</code>, then you must also specify <code>period</code> or <code>startTime</code>,
     * but not both.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     * CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     * <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is set to 2,
     * then the aggregated profile contains representations of methods <code>A</code> and <code>B</code>.
     * </p>
     */
    private Integer maxDepth;
    /**
     * <p>
     * Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned aggregated
     * profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     * </pre>
     */
    private String period;
    /**
     * <p>
     * The name of the profiling group to get.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The start time of the profile to get. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     * </pre>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The format of the returned profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param accept
     *        The format of the returned profiling data. The format maps to the <code>Accept</code> and
     *        <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *        default . </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The format of the returned profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @return The format of the returned profiling data. The format maps to the <code>Accept</code> and
     *         <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *         default . </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The format of the returned profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param accept
     *        The format of the returned profiling data. The format maps to the <code>Accept</code> and
     *        <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *        default . </p>
     * 
     *        <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * The end time of the requested profile. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * <p>
     * If you specify <code>endTime</code>, then you must also specify <code>period</code> or <code>startTime</code>,
     * but not both.
     * </p>
     * 
     * @param endTime
     *        The end time of the requested profile. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. </p>
     *        <p>
     *        If you specify <code>endTime</code>, then you must also specify <code>period</code> or
     *        <code>startTime</code>, but not both.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the requested profile. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * <p>
     * If you specify <code>endTime</code>, then you must also specify <code>period</code> or <code>startTime</code>,
     * but not both.
     * </p>
     * 
     * @return The end time of the requested profile. Specify using the ISO 8601 format. For example,
     *         2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. </p>
     *         <p>
     *         If you specify <code>endTime</code>, then you must also specify <code>period</code> or
     *         <code>startTime</code>, but not both.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the requested profile. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * <p>
     * If you specify <code>endTime</code>, then you must also specify <code>period</code> or <code>startTime</code>,
     * but not both.
     * </p>
     * 
     * @param endTime
     *        The end time of the requested profile. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. </p>
     *        <p>
     *        If you specify <code>endTime</code>, then you must also specify <code>period</code> or
     *        <code>startTime</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     * CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     * <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is set to 2,
     * then the aggregated profile contains representations of methods <code>A</code> and <code>B</code>.
     * </p>
     * 
     * @param maxDepth
     *        The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     *        CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     *        <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     *        set to 2, then the aggregated profile contains representations of methods <code>A</code> and
     *        <code>B</code>.
     */

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * <p>
     * The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     * CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     * <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is set to 2,
     * then the aggregated profile contains representations of methods <code>A</code> and <code>B</code>.
     * </p>
     * 
     * @return The maximum depth of the stacks in the code that is represented in the aggregated profile. For example,
     *         if CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     *         <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     *         set to 2, then the aggregated profile contains representations of methods <code>A</code> and
     *         <code>B</code>.
     */

    public Integer getMaxDepth() {
        return this.maxDepth;
    }

    /**
     * <p>
     * The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     * CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     * <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is set to 2,
     * then the aggregated profile contains representations of methods <code>A</code> and <code>B</code>.
     * </p>
     * 
     * @param maxDepth
     *        The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if
     *        CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls method
     *        <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     *        set to 2, then the aggregated profile contains representations of methods <code>A</code> and
     *        <code>B</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withMaxDepth(Integer maxDepth) {
        setMaxDepth(maxDepth);
        return this;
    }

    /**
     * <p>
     * Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned aggregated
     * profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param period
     *        Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned
     *        aggregated profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>. </p>
     * 
     * <pre><code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned aggregated
     * profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @return Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned
     *         aggregated profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>. </p>
     * 
     * <pre><code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned aggregated
     * profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param period
     *        Used with <code>startTime</code> or <code>endTime</code> to specify the time range for the returned
     *        aggregated profile. Specify using the ISO 8601 format. For example, <code>P1DT1H1M1S</code>. </p>
     * 
     *        <pre>
     * <code> &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group to get.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to get.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to get.
     * </p>
     * 
     * @return The name of the profiling group to get.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to get.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The start time of the profile to get. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param startTime
     *        The start time of the profile to get. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.</p>
     * 
     * <pre><code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the profile to get. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     * </pre>
     * 
     * @return The start time of the profile to get. Specify using the ISO 8601 format. For example,
     *         2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.</p>
     * 
     * <pre><code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the profile to get. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param startTime
     *        The start time of the profile to get. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.</p>
     * 
     *        <pre>
     * <code> &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxDepth() != null)
            sb.append("MaxDepth: ").append(getMaxDepth()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileRequest == false)
            return false;
        GetProfileRequest other = (GetProfileRequest) obj;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxDepth() == null ^ this.getMaxDepth() == null)
            return false;
        if (other.getMaxDepth() != null && other.getMaxDepth().equals(this.getMaxDepth()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxDepth() == null) ? 0 : getMaxDepth().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileRequest clone() {
        return (GetProfileRequest) super.clone();
    }

}
