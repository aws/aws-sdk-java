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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the status of a notebook session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/SessionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the session started.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The most recent date and time that the session was modified.
     * </p>
     */
    private java.util.Date lastModifiedDateTime;
    /**
     * <p>
     * The date and time that the session ended.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * The date and time starting at which the session became idle. Can be empty if the session is not currently idle.
     * </p>
     */
    private java.util.Date idleSinceDateTime;
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
     * The reason for the session state change (for example, canceled because the session was terminated).
     * </p>
     */
    private String stateChangeReason;

    /**
     * <p>
     * The date and time that the session started.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the session started.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that the session started.
     * </p>
     * 
     * @return The date and time that the session started.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that the session started.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the session started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatus withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the session was modified.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        The most recent date and time that the session was modified.
     */

    public void setLastModifiedDateTime(java.util.Date lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    /**
     * <p>
     * The most recent date and time that the session was modified.
     * </p>
     * 
     * @return The most recent date and time that the session was modified.
     */

    public java.util.Date getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * <p>
     * The most recent date and time that the session was modified.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        The most recent date and time that the session was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatus withLastModifiedDateTime(java.util.Date lastModifiedDateTime) {
        setLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the session ended.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that the session ended.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time that the session ended.
     * </p>
     * 
     * @return The date and time that the session ended.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time that the session ended.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that the session ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatus withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time starting at which the session became idle. Can be empty if the session is not currently idle.
     * </p>
     * 
     * @param idleSinceDateTime
     *        The date and time starting at which the session became idle. Can be empty if the session is not currently
     *        idle.
     */

    public void setIdleSinceDateTime(java.util.Date idleSinceDateTime) {
        this.idleSinceDateTime = idleSinceDateTime;
    }

    /**
     * <p>
     * The date and time starting at which the session became idle. Can be empty if the session is not currently idle.
     * </p>
     * 
     * @return The date and time starting at which the session became idle. Can be empty if the session is not currently
     *         idle.
     */

    public java.util.Date getIdleSinceDateTime() {
        return this.idleSinceDateTime;
    }

    /**
     * <p>
     * The date and time starting at which the session became idle. Can be empty if the session is not currently idle.
     * </p>
     * 
     * @param idleSinceDateTime
     *        The date and time starting at which the session became idle. Can be empty if the session is not currently
     *        idle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatus withIdleSinceDateTime(java.util.Date idleSinceDateTime) {
        setIdleSinceDateTime(idleSinceDateTime);
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

    public SessionStatus withState(String state) {
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

    public SessionStatus withState(SessionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the session state change (for example, canceled because the session was terminated).
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the session state change (for example, canceled because the session was terminated).
     */

    public void setStateChangeReason(String stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the session state change (for example, canceled because the session was terminated).
     * </p>
     * 
     * @return The reason for the session state change (for example, canceled because the session was terminated).
     */

    public String getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for the session state change (for example, canceled because the session was terminated).
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the session state change (for example, canceled because the session was terminated).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStatus withStateChangeReason(String stateChangeReason) {
        setStateChangeReason(stateChangeReason);
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
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getLastModifiedDateTime() != null)
            sb.append("LastModifiedDateTime: ").append(getLastModifiedDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getIdleSinceDateTime() != null)
            sb.append("IdleSinceDateTime: ").append(getIdleSinceDateTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionStatus == false)
            return false;
        SessionStatus other = (SessionStatus) obj;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getLastModifiedDateTime() == null ^ this.getLastModifiedDateTime() == null)
            return false;
        if (other.getLastModifiedDateTime() != null && other.getLastModifiedDateTime().equals(this.getLastModifiedDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getIdleSinceDateTime() == null ^ this.getIdleSinceDateTime() == null)
            return false;
        if (other.getIdleSinceDateTime() != null && other.getIdleSinceDateTime().equals(this.getIdleSinceDateTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDateTime() == null) ? 0 : getLastModifiedDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getIdleSinceDateTime() == null) ? 0 : getIdleSinceDateTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public SessionStatus clone() {
        try {
            return (SessionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.SessionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
