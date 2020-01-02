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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCalendarState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalendarStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a
     * <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your
     * command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     * </p>
     */
    private String atTime;
    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state
     * will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when
     * the calendar state changes to <code>CLOSED</code>, and vice-versa.
     * </p>
     */
    private String nextTransitionTime;

    /**
     * <p>
     * The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a
     * <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * </p>
     * 
     * @param state
     *        The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed,
     *        and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * @see CalendarState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a
     * <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * </p>
     * 
     * @return The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed,
     *         and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * @see CalendarState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a
     * <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * </p>
     * 
     * @param state
     *        The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed,
     *        and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CalendarState
     */

    public GetCalendarStateResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a
     * <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * </p>
     * 
     * @param state
     *        The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed,
     *        and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CalendarState
     */

    public GetCalendarStateResult withState(CalendarState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your
     * command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     * </p>
     * 
     * @param atTime
     *        The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified
     *        in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     */

    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your
     * command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     * </p>
     * 
     * @return The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified
     *         in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     */

    public String getAtTime() {
        return this.atTime;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your
     * command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     * </p>
     * 
     * @param atTime
     *        The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified
     *        in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalendarStateResult withAtTime(String atTime) {
        setAtTime(atTime);
        return this;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state
     * will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when
     * the calendar state changes to <code>CLOSED</code>, and vice-versa.
     * </p>
     * 
     * @param nextTransitionTime
     *        The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar
     *        state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code>
     *        indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.
     */

    public void setNextTransitionTime(String nextTransitionTime) {
        this.nextTransitionTime = nextTransitionTime;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state
     * will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when
     * the calendar state changes to <code>CLOSED</code>, and vice-versa.
     * </p>
     * 
     * @return The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar
     *         state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code>
     *         indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.
     */

    public String getNextTransitionTime() {
        return this.nextTransitionTime;
    }

    /**
     * <p>
     * The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state
     * will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when
     * the calendar state changes to <code>CLOSED</code>, and vice-versa.
     * </p>
     * 
     * @param nextTransitionTime
     *        The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar
     *        state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code>
     *        indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalendarStateResult withNextTransitionTime(String nextTransitionTime) {
        setNextTransitionTime(nextTransitionTime);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAtTime() != null)
            sb.append("AtTime: ").append(getAtTime()).append(",");
        if (getNextTransitionTime() != null)
            sb.append("NextTransitionTime: ").append(getNextTransitionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCalendarStateResult == false)
            return false;
        GetCalendarStateResult other = (GetCalendarStateResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAtTime() == null ^ this.getAtTime() == null)
            return false;
        if (other.getAtTime() != null && other.getAtTime().equals(this.getAtTime()) == false)
            return false;
        if (other.getNextTransitionTime() == null ^ this.getNextTransitionTime() == null)
            return false;
        if (other.getNextTransitionTime() != null && other.getNextTransitionTime().equals(this.getNextTransitionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        hashCode = prime * hashCode + ((getNextTransitionTime() == null) ? 0 : getNextTransitionTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCalendarStateResult clone() {
        try {
            return (GetCalendarStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
