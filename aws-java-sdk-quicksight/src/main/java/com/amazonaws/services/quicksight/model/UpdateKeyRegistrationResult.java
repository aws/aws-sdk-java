/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateKeyRegistration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeyRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all customer managed key registrations that failed to update.
     * </p>
     */
    private java.util.List<FailedKeyRegistrationEntry> failedKeyRegistration;
    /**
     * <p>
     * A list of all customer managed key registrations that were successfully updated.
     * </p>
     */
    private java.util.List<SuccessfulKeyRegistrationEntry> successfulKeyRegistration;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A list of all customer managed key registrations that failed to update.
     * </p>
     * 
     * @return A list of all customer managed key registrations that failed to update.
     */

    public java.util.List<FailedKeyRegistrationEntry> getFailedKeyRegistration() {
        return failedKeyRegistration;
    }

    /**
     * <p>
     * A list of all customer managed key registrations that failed to update.
     * </p>
     * 
     * @param failedKeyRegistration
     *        A list of all customer managed key registrations that failed to update.
     */

    public void setFailedKeyRegistration(java.util.Collection<FailedKeyRegistrationEntry> failedKeyRegistration) {
        if (failedKeyRegistration == null) {
            this.failedKeyRegistration = null;
            return;
        }

        this.failedKeyRegistration = new java.util.ArrayList<FailedKeyRegistrationEntry>(failedKeyRegistration);
    }

    /**
     * <p>
     * A list of all customer managed key registrations that failed to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedKeyRegistration(java.util.Collection)} or
     * {@link #withFailedKeyRegistration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedKeyRegistration
     *        A list of all customer managed key registrations that failed to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationResult withFailedKeyRegistration(FailedKeyRegistrationEntry... failedKeyRegistration) {
        if (this.failedKeyRegistration == null) {
            setFailedKeyRegistration(new java.util.ArrayList<FailedKeyRegistrationEntry>(failedKeyRegistration.length));
        }
        for (FailedKeyRegistrationEntry ele : failedKeyRegistration) {
            this.failedKeyRegistration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all customer managed key registrations that failed to update.
     * </p>
     * 
     * @param failedKeyRegistration
     *        A list of all customer managed key registrations that failed to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationResult withFailedKeyRegistration(java.util.Collection<FailedKeyRegistrationEntry> failedKeyRegistration) {
        setFailedKeyRegistration(failedKeyRegistration);
        return this;
    }

    /**
     * <p>
     * A list of all customer managed key registrations that were successfully updated.
     * </p>
     * 
     * @return A list of all customer managed key registrations that were successfully updated.
     */

    public java.util.List<SuccessfulKeyRegistrationEntry> getSuccessfulKeyRegistration() {
        return successfulKeyRegistration;
    }

    /**
     * <p>
     * A list of all customer managed key registrations that were successfully updated.
     * </p>
     * 
     * @param successfulKeyRegistration
     *        A list of all customer managed key registrations that were successfully updated.
     */

    public void setSuccessfulKeyRegistration(java.util.Collection<SuccessfulKeyRegistrationEntry> successfulKeyRegistration) {
        if (successfulKeyRegistration == null) {
            this.successfulKeyRegistration = null;
            return;
        }

        this.successfulKeyRegistration = new java.util.ArrayList<SuccessfulKeyRegistrationEntry>(successfulKeyRegistration);
    }

    /**
     * <p>
     * A list of all customer managed key registrations that were successfully updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulKeyRegistration(java.util.Collection)} or
     * {@link #withSuccessfulKeyRegistration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulKeyRegistration
     *        A list of all customer managed key registrations that were successfully updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationResult withSuccessfulKeyRegistration(SuccessfulKeyRegistrationEntry... successfulKeyRegistration) {
        if (this.successfulKeyRegistration == null) {
            setSuccessfulKeyRegistration(new java.util.ArrayList<SuccessfulKeyRegistrationEntry>(successfulKeyRegistration.length));
        }
        for (SuccessfulKeyRegistrationEntry ele : successfulKeyRegistration) {
            this.successfulKeyRegistration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all customer managed key registrations that were successfully updated.
     * </p>
     * 
     * @param successfulKeyRegistration
     *        A list of all customer managed key registrations that were successfully updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationResult withSuccessfulKeyRegistration(java.util.Collection<SuccessfulKeyRegistrationEntry> successfulKeyRegistration) {
        setSuccessfulKeyRegistration(successfulKeyRegistration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getFailedKeyRegistration() != null)
            sb.append("FailedKeyRegistration: ").append(getFailedKeyRegistration()).append(",");
        if (getSuccessfulKeyRegistration() != null)
            sb.append("SuccessfulKeyRegistration: ").append(getSuccessfulKeyRegistration()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyRegistrationResult == false)
            return false;
        UpdateKeyRegistrationResult other = (UpdateKeyRegistrationResult) obj;
        if (other.getFailedKeyRegistration() == null ^ this.getFailedKeyRegistration() == null)
            return false;
        if (other.getFailedKeyRegistration() != null && other.getFailedKeyRegistration().equals(this.getFailedKeyRegistration()) == false)
            return false;
        if (other.getSuccessfulKeyRegistration() == null ^ this.getSuccessfulKeyRegistration() == null)
            return false;
        if (other.getSuccessfulKeyRegistration() != null && other.getSuccessfulKeyRegistration().equals(this.getSuccessfulKeyRegistration()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedKeyRegistration() == null) ? 0 : getFailedKeyRegistration().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulKeyRegistration() == null) ? 0 : getSuccessfulKeyRegistration().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeyRegistrationResult clone() {
        try {
            return (UpdateKeyRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
