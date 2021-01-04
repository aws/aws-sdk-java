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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UpdateArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateArchiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     */
    private String archiveArn;
    /**
     * <p>
     * The state of the archive.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the archive is in the current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The time at which the archive was updated.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The ARN of the archive.
     */

    public void setArchiveArn(String archiveArn) {
        this.archiveArn = archiveArn;
    }

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @return The ARN of the archive.
     */

    public String getArchiveArn() {
        return this.archiveArn;
    }

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The ARN of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveResult withArchiveArn(String archiveArn) {
        setArchiveArn(archiveArn);
        return this;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @see ArchiveState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @return The state of the archive.
     * @see ArchiveState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public UpdateArchiveResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public UpdateArchiveResult withState(ArchiveState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the archive is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the archive is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that the archive is in the current state.
     * </p>
     * 
     * @return The reason that the archive is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that the archive is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the archive is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The time at which the archive was updated.
     * </p>
     * 
     * @param creationTime
     *        The time at which the archive was updated.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the archive was updated.
     * </p>
     * 
     * @return The time at which the archive was updated.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the archive was updated.
     * </p>
     * 
     * @param creationTime
     *        The time at which the archive was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getArchiveArn() != null)
            sb.append("ArchiveArn: ").append(getArchiveArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateArchiveResult == false)
            return false;
        UpdateArchiveResult other = (UpdateArchiveResult) obj;
        if (other.getArchiveArn() == null ^ this.getArchiveArn() == null)
            return false;
        if (other.getArchiveArn() != null && other.getArchiveArn().equals(this.getArchiveArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveArn() == null) ? 0 : getArchiveArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateArchiveResult clone() {
        try {
            return (UpdateArchiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
