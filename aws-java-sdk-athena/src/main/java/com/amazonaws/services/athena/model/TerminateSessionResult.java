/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TerminateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the session. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The session is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The session has been started.
     * </p>
     * <p>
     * <code>IDLE</code> - The session is able to accept a calculation.
     * </p>
     * <p>
     * <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The session is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The session and its resources are no longer running.
     * </p>
     * <p>
     * <code>DEGRADED</code> - The session has no healthy coordinators.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The state of the session. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The session is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The session has been started.
     * </p>
     * <p>
     * <code>IDLE</code> - The session is able to accept a calculation.
     * </p>
     * <p>
     * <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The session is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The session and its resources are no longer running.
     * </p>
     * <p>
     * <code>DEGRADED</code> - The session has no healthy coordinators.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * </p>
     * 
     * @param state
     *        The state of the session. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The session is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The session has been started.
     *        </p>
     *        <p>
     *        <code>IDLE</code> - The session is able to accept a calculation.
     *        </p>
     *        <p>
     *        <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The session is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The session and its resources are no longer running.
     *        </p>
     *        <p>
     *        <code>DEGRADED</code> - The session has no healthy coordinators.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * @see SessionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the session. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The session is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The session has been started.
     * </p>
     * <p>
     * <code>IDLE</code> - The session is able to accept a calculation.
     * </p>
     * <p>
     * <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The session is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The session and its resources are no longer running.
     * </p>
     * <p>
     * <code>DEGRADED</code> - The session has no healthy coordinators.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * </p>
     * 
     * @return The state of the session. A description of each state follows.</p>
     *         <p>
     *         <code>CREATING</code> - The session is being started, including acquiring resources.
     *         </p>
     *         <p>
     *         <code>CREATED</code> - The session has been started.
     *         </p>
     *         <p>
     *         <code>IDLE</code> - The session is able to accept a calculation.
     *         </p>
     *         <p>
     *         <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     *         </p>
     *         <p>
     *         <code>TERMINATING</code> - The session is in the process of shutting down.
     *         </p>
     *         <p>
     *         <code>TERMINATED</code> - The session and its resources are no longer running.
     *         </p>
     *         <p>
     *         <code>DEGRADED</code> - The session has no healthy coordinators.
     *         </p>
     *         <p>
     *         <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * @see SessionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the session. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The session is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The session has been started.
     * </p>
     * <p>
     * <code>IDLE</code> - The session is able to accept a calculation.
     * </p>
     * <p>
     * <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The session is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The session and its resources are no longer running.
     * </p>
     * <p>
     * <code>DEGRADED</code> - The session has no healthy coordinators.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * </p>
     * 
     * @param state
     *        The state of the session. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The session is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The session has been started.
     *        </p>
     *        <p>
     *        <code>IDLE</code> - The session is able to accept a calculation.
     *        </p>
     *        <p>
     *        <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The session is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The session and its resources are no longer running.
     *        </p>
     *        <p>
     *        <code>DEGRADED</code> - The session has no healthy coordinators.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionState
     */

    public TerminateSessionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the session. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The session is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The session has been started.
     * </p>
     * <p>
     * <code>IDLE</code> - The session is able to accept a calculation.
     * </p>
     * <p>
     * <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The session is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The session and its resources are no longer running.
     * </p>
     * <p>
     * <code>DEGRADED</code> - The session has no healthy coordinators.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * </p>
     * 
     * @param state
     *        The state of the session. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The session is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The session has been started.
     *        </p>
     *        <p>
     *        <code>IDLE</code> - The session is able to accept a calculation.
     *        </p>
     *        <p>
     *        <code>BUSY</code> - The session is processing another task and is unable to accept a calculation.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The session is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The session and its resources are no longer running.
     *        </p>
     *        <p>
     *        <code>DEGRADED</code> - The session has no healthy coordinators.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the session and its resources are no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionState
     */

    public TerminateSessionResult withState(SessionState state) {
        this.state = state.toString();
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
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateSessionResult == false)
            return false;
        TerminateSessionResult other = (TerminateSessionResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TerminateSessionResult clone() {
        try {
            return (TerminateSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
