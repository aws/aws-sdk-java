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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/CancelReplay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelReplayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the replay to cancel.
     * </p>
     */
    private String replayArn;
    /**
     * <p>
     * The current state of the replay.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     */
    private String stateReason;

    /**
     * <p>
     * The ARN of the replay to cancel.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay to cancel.
     */

    public void setReplayArn(String replayArn) {
        this.replayArn = replayArn;
    }

    /**
     * <p>
     * The ARN of the replay to cancel.
     * </p>
     * 
     * @return The ARN of the replay to cancel.
     */

    public String getReplayArn() {
        return this.replayArn;
    }

    /**
     * <p>
     * The ARN of the replay to cancel.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelReplayResult withReplayArn(String replayArn) {
        setReplayArn(replayArn);
        return this;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @see ReplayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @return The current state of the replay.
     * @see ReplayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public CancelReplayResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public CancelReplayResult withState(ReplayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @return The reason that the replay is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelReplayResult withStateReason(String stateReason) {
        setStateReason(stateReason);
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
            sb.append("StateReason: ").append(getStateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelReplayResult == false)
            return false;
        CancelReplayResult other = (CancelReplayResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplayArn() == null) ? 0 : getReplayArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        return hashCode;
    }

    @Override
    public CancelReplayResult clone() {
        try {
            return (CancelReplayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
