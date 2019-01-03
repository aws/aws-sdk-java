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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBulkTemplatedEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BulkEmailDestinationStatus> status;

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * </p>
     * 
     * @return The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     */

    public java.util.List<BulkEmailDestinationStatus> getStatus() {
        if (status == null) {
            status = new com.amazonaws.internal.SdkInternalList<BulkEmailDestinationStatus>();
        }
        return status;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * </p>
     * 
     * @param status
     *        The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     */

    public void setStatus(java.util.Collection<BulkEmailDestinationStatus> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new com.amazonaws.internal.SdkInternalList<BulkEmailDestinationStatus>(status);
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailResult withStatus(BulkEmailDestinationStatus... status) {
        if (this.status == null) {
            setStatus(new com.amazonaws.internal.SdkInternalList<BulkEmailDestinationStatus>(status.length));
        }
        for (BulkEmailDestinationStatus ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * </p>
     * 
     * @param status
     *        The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailResult withStatus(java.util.Collection<BulkEmailDestinationStatus> status) {
        setStatus(status);
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBulkTemplatedEmailResult == false)
            return false;
        SendBulkTemplatedEmailResult other = (SendBulkTemplatedEmailResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SendBulkTemplatedEmailResult clone() {
        try {
            return (SendBulkTemplatedEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
