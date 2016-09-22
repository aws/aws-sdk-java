/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A PutTargetsResult contains a list of PutTargetsResultEntry.
 * </p>
 */
public class PutTargetsResultEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the target submitted to Amazon CloudWatch Events.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The error code representing why the target submission failed on this entry.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message explaining why the target submission failed on this entry.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The ID of the target submitted to Amazon CloudWatch Events.
     * </p>
     * 
     * @param targetId
     *        The ID of the target submitted to Amazon CloudWatch Events.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The ID of the target submitted to Amazon CloudWatch Events.
     * </p>
     * 
     * @return The ID of the target submitted to Amazon CloudWatch Events.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The ID of the target submitted to Amazon CloudWatch Events.
     * </p>
     * 
     * @param targetId
     *        The ID of the target submitted to Amazon CloudWatch Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsResultEntry withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The error code representing why the target submission failed on this entry.
     * </p>
     * 
     * @param errorCode
     *        The error code representing why the target submission failed on this entry.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code representing why the target submission failed on this entry.
     * </p>
     * 
     * @return The error code representing why the target submission failed on this entry.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code representing why the target submission failed on this entry.
     * </p>
     * 
     * @param errorCode
     *        The error code representing why the target submission failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsResultEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message explaining why the target submission failed on this entry.
     * </p>
     * 
     * @param errorMessage
     *        The error message explaining why the target submission failed on this entry.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message explaining why the target submission failed on this entry.
     * </p>
     * 
     * @return The error message explaining why the target submission failed on this entry.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message explaining why the target submission failed on this entry.
     * </p>
     * 
     * @param errorMessage
     *        The error message explaining why the target submission failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsResultEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTargetsResultEntry == false)
            return false;
        PutTargetsResultEntry other = (PutTargetsResultEntry) obj;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public PutTargetsResultEntry clone() {
        try {
            return (PutTargetsResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
