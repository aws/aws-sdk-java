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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLinkedRoleDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLinkedRoleDeletionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the deletion.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     */
    private DeletionTaskFailureReasonType reason;

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * 
     * @param status
     *        The status of the deletion.
     * @see DeletionTaskStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * 
     * @return The status of the deletion.
     * @see DeletionTaskStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * 
     * @param status
     *        The status of the deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionTaskStatusType
     */

    public GetServiceLinkedRoleDeletionStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * 
     * @param status
     *        The status of the deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionTaskStatusType
     */

    public GetServiceLinkedRoleDeletionStatusResult withStatus(DeletionTaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     * 
     * @param reason
     *        An object that contains details about the reason the deletion failed.
     */

    public void setReason(DeletionTaskFailureReasonType reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     * 
     * @return An object that contains details about the reason the deletion failed.
     */

    public DeletionTaskFailureReasonType getReason() {
        return this.reason;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     * 
     * @param reason
     *        An object that contains details about the reason the deletion failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLinkedRoleDeletionStatusResult withReason(DeletionTaskFailureReasonType reason) {
        setReason(reason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLinkedRoleDeletionStatusResult == false)
            return false;
        GetServiceLinkedRoleDeletionStatusResult other = (GetServiceLinkedRoleDeletionStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceLinkedRoleDeletionStatusResult clone() {
        try {
            return (GetServiceLinkedRoleDeletionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
