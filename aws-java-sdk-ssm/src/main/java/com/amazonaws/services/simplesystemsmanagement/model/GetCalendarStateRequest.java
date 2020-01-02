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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCalendarState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalendarStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries
     * for which you want to get the state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> calendarNames;
    /**
     * <p>
     * (Optional) The specific time for which you want to get calendar state information, in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the
     * current time is assumed.
     * </p>
     */
    private String atTime;

    /**
     * <p>
     * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries
     * for which you want to get the state.
     * </p>
     * 
     * @return The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar
     *         entries for which you want to get the state.
     */

    public java.util.List<String> getCalendarNames() {
        if (calendarNames == null) {
            calendarNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return calendarNames;
    }

    /**
     * <p>
     * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries
     * for which you want to get the state.
     * </p>
     * 
     * @param calendarNames
     *        The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar
     *        entries for which you want to get the state.
     */

    public void setCalendarNames(java.util.Collection<String> calendarNames) {
        if (calendarNames == null) {
            this.calendarNames = null;
            return;
        }

        this.calendarNames = new com.amazonaws.internal.SdkInternalList<String>(calendarNames);
    }

    /**
     * <p>
     * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries
     * for which you want to get the state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCalendarNames(java.util.Collection)} or {@link #withCalendarNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param calendarNames
     *        The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar
     *        entries for which you want to get the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalendarStateRequest withCalendarNames(String... calendarNames) {
        if (this.calendarNames == null) {
            setCalendarNames(new com.amazonaws.internal.SdkInternalList<String>(calendarNames.length));
        }
        for (String ele : calendarNames) {
            this.calendarNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries
     * for which you want to get the state.
     * </p>
     * 
     * @param calendarNames
     *        The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar
     *        entries for which you want to get the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalendarStateRequest withCalendarNames(java.util.Collection<String> calendarNames) {
        setCalendarNames(calendarNames);
        return this;
    }

    /**
     * <p>
     * (Optional) The specific time for which you want to get calendar state information, in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the
     * current time is assumed.
     * </p>
     * 
     * @param atTime
     *        (Optional) The specific time for which you want to get calendar state information, in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>,
     *        the current time is assumed.
     */

    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * <p>
     * (Optional) The specific time for which you want to get calendar state information, in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the
     * current time is assumed.
     * </p>
     * 
     * @return (Optional) The specific time for which you want to get calendar state information, in <a
     *         href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>,
     *         the current time is assumed.
     */

    public String getAtTime() {
        return this.atTime;
    }

    /**
     * <p>
     * (Optional) The specific time for which you want to get calendar state information, in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the
     * current time is assumed.
     * </p>
     * 
     * @param atTime
     *        (Optional) The specific time for which you want to get calendar state information, in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>,
     *        the current time is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalendarStateRequest withAtTime(String atTime) {
        setAtTime(atTime);
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
        if (getCalendarNames() != null)
            sb.append("CalendarNames: ").append(getCalendarNames()).append(",");
        if (getAtTime() != null)
            sb.append("AtTime: ").append(getAtTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCalendarStateRequest == false)
            return false;
        GetCalendarStateRequest other = (GetCalendarStateRequest) obj;
        if (other.getCalendarNames() == null ^ this.getCalendarNames() == null)
            return false;
        if (other.getCalendarNames() != null && other.getCalendarNames().equals(this.getCalendarNames()) == false)
            return false;
        if (other.getAtTime() == null ^ this.getAtTime() == null)
            return false;
        if (other.getAtTime() != null && other.getAtTime().equals(this.getAtTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalendarNames() == null) ? 0 : getCalendarNames().hashCode());
        hashCode = prime * hashCode + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCalendarStateRequest clone() {
        return (GetCalendarStateRequest) super.clone();
    }

}
