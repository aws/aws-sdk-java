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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Includes details about the failed items.
 * </p>
 */
public class FailedItemDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * Indicates whether you can immediately retry a request for this item for a specified resource.
     * </p>
     */
    private Boolean retryable;

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param failureCode
     *        The status code of a failed item.
     * @see FailedItemErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @return The status code of a failed item.
     * @see FailedItemErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param failureCode
     *        The status code of a failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailedItemErrorCode
     */

    public FailedItemDetails withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param failureCode
     *        The status code of a failed item.
     * @see FailedItemErrorCode
     */

    public void setFailureCode(FailedItemErrorCode failureCode) {
        this.failureCode = failureCode.toString();
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * 
     * @param failureCode
     *        The status code of a failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailedItemErrorCode
     */

    public FailedItemDetails withFailureCode(FailedItemErrorCode failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * Indicates whether you can immediately retry a request for this item for a specified resource.
     * </p>
     * 
     * @param retryable
     *        Indicates whether you can immediately retry a request for this item for a specified resource.
     */

    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    /**
     * <p>
     * Indicates whether you can immediately retry a request for this item for a specified resource.
     * </p>
     * 
     * @return Indicates whether you can immediately retry a request for this item for a specified resource.
     */

    public Boolean getRetryable() {
        return this.retryable;
    }

    /**
     * <p>
     * Indicates whether you can immediately retry a request for this item for a specified resource.
     * </p>
     * 
     * @param retryable
     *        Indicates whether you can immediately retry a request for this item for a specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedItemDetails withRetryable(Boolean retryable) {
        setRetryable(retryable);
        return this;
    }

    /**
     * <p>
     * Indicates whether you can immediately retry a request for this item for a specified resource.
     * </p>
     * 
     * @return Indicates whether you can immediately retry a request for this item for a specified resource.
     */

    public Boolean isRetryable() {
        return this.retryable;
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
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getRetryable() != null)
            sb.append("Retryable: " + getRetryable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedItemDetails == false)
            return false;
        FailedItemDetails other = (FailedItemDetails) obj;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getRetryable() == null ^ this.getRetryable() == null)
            return false;
        if (other.getRetryable() != null && other.getRetryable().equals(this.getRetryable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getRetryable() == null) ? 0 : getRetryable().hashCode());
        return hashCode;
    }

    @Override
    public FailedItemDetails clone() {
        try {
            return (FailedItemDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
