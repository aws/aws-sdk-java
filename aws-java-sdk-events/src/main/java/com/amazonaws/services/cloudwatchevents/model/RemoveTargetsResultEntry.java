/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a target that failed to be removed from a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemoveTargetsResultEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTargetsResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the target.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The error code that indicates why the target removal failed. If the value is
     * <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message that explains why the target removal failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param targetId
     *        The ID of the target.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @return The ID of the target.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param targetId
     *        The ID of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResultEntry withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The error code that indicates why the target removal failed. If the value is
     * <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     * </p>
     * 
     * @param errorCode
     *        The error code that indicates why the target removal failed. If the value is
     *        <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the target removal failed. If the value is
     * <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     * </p>
     * 
     * @return The error code that indicates why the target removal failed. If the value is
     *         <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the target removal failed. If the value is
     * <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     * </p>
     * 
     * @param errorCode
     *        The error code that indicates why the target removal failed. If the value is
     *        <code>ConcurrentModificationException</code>, too many requests were made at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResultEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message that explains why the target removal failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message that explains why the target removal failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that explains why the target removal failed.
     * </p>
     * 
     * @return The error message that explains why the target removal failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that explains why the target removal failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message that explains why the target removal failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResultEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTargetsResultEntry == false)
            return false;
        RemoveTargetsResultEntry other = (RemoveTargetsResultEntry) obj;
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
    public RemoveTargetsResultEntry clone() {
        try {
            return (RemoveTargetsResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.RemoveTargetsResultEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
