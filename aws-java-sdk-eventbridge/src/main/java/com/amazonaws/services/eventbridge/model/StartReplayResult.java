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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/StartReplay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     */
    private String replayArn;
    /**
     * <p>
     * The state of the replay.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the replay is in the state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The time at which the replay started.
     * </p>
     */
    private java.util.Date replayStartTime;

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay.
     */

    public void setReplayArn(String replayArn) {
        this.replayArn = replayArn;
    }

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @return The ARN of the replay.
     */

    public String getReplayArn() {
        return this.replayArn;
    }

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayResult withReplayArn(String replayArn) {
        setReplayArn(replayArn);
        return this;
    }

    /**
     * <p>
     * The state of the replay.
     * </p>
     * 
     * @param state
     *        The state of the replay.
     * @see ReplayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the replay.
     * </p>
     * 
     * @return The state of the replay.
     * @see ReplayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the replay.
     * </p>
     * 
     * @param state
     *        The state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public StartReplayResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the replay.
     * </p>
     * 
     * @param state
     *        The state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public StartReplayResult withState(ReplayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the replay is in the state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the state.
     * </p>
     * 
     * @return The reason that the replay is in the state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The time at which the replay started.
     * </p>
     * 
     * @param replayStartTime
     *        The time at which the replay started.
     */

    public void setReplayStartTime(java.util.Date replayStartTime) {
        this.replayStartTime = replayStartTime;
    }

    /**
     * <p>
     * The time at which the replay started.
     * </p>
     * 
     * @return The time at which the replay started.
     */

    public java.util.Date getReplayStartTime() {
        return this.replayStartTime;
    }

    /**
     * <p>
     * The time at which the replay started.
     * </p>
     * 
     * @param replayStartTime
     *        The time at which the replay started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayResult withReplayStartTime(java.util.Date replayStartTime) {
        setReplayStartTime(replayStartTime);
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
        if (getReplayArn() != null)
            sb.append("ReplayArn: ").append(getReplayArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getReplayStartTime() != null)
            sb.append("ReplayStartTime: ").append(getReplayStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplayResult == false)
            return false;
        StartReplayResult other = (StartReplayResult) obj;
        if (other.getReplayArn() == null ^ this.getReplayArn() == null)
            return false;
        if (other.getReplayArn() != null && other.getReplayArn().equals(this.getReplayArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getReplayStartTime() == null ^ this.getReplayStartTime() == null)
            return false;
        if (other.getReplayStartTime() != null && other.getReplayStartTime().equals(this.getReplayStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplayArn() == null) ? 0 : getReplayArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getReplayStartTime() == null) ? 0 : getReplayStartTime().hashCode());
        return hashCode;
    }

    @Override
    public StartReplayResult clone() {
        try {
            return (StartReplayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
