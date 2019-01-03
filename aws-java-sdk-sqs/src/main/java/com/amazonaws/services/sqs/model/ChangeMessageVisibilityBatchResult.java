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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * For each message in the batch, the response contains a <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code>
 * tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ChangeMessageVisibilityBatch" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeMessageVisibilityBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchResultEntry> successful;
    /**
     * <p>
     * A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry> failed;

    /**
     * <p>
     * A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * </p>
     * 
     * @return A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     */

    public java.util.List<ChangeMessageVisibilityBatchResultEntry> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchResultEntry>();
        }
        return successful;
    }

    /**
     * <p>
     * A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * </p>
     * 
     * @param successful
     *        A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     */

    public void setSuccessful(java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchResultEntry>(successful);
    }

    /**
     * <p>
     * A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchResult withSuccessful(ChangeMessageVisibilityBatchResultEntry... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchResultEntry>(successful.length));
        }
        for (ChangeMessageVisibilityBatchResultEntry ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * </p>
     * 
     * @param successful
     *        A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchResult withSuccessful(java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * </p>
     * 
     * @return A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     */

    public java.util.List<BatchResultErrorEntry> getFailed() {
        if (failed == null) {
            failed = new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>();
        }
        return failed;
    }

    /**
     * <p>
     * A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * </p>
     * 
     * @param failed
     *        A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     */

    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>(failed);
    }

    /**
     * <p>
     * A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (this.failed == null) {
            setFailed(new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>(failed.length));
        }
        for (BatchResultErrorEntry ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * </p>
     * 
     * @param failed
     *        A list of <code> <a>BatchResultErrorEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        setFailed(failed);
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
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityBatchResult == false)
            return false;
        ChangeMessageVisibilityBatchResult other = (ChangeMessageVisibilityBatchResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public ChangeMessageVisibilityBatchResult clone() {
        try {
            return (ChangeMessageVisibilityBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
