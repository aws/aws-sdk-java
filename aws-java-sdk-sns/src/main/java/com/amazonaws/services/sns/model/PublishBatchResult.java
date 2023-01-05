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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/PublishBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PublishBatchResultEntry> successful;
    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry> failed;

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * 
     * @return A list of successful <code>PublishBatch</code> responses.
     */

    public java.util.List<PublishBatchResultEntry> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<PublishBatchResultEntry>();
        }
        return successful;
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * 
     * @param successful
     *        A list of successful <code>PublishBatch</code> responses.
     */

    public void setSuccessful(java.util.Collection<PublishBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<PublishBatchResultEntry>(successful);
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        A list of successful <code>PublishBatch</code> responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResult withSuccessful(PublishBatchResultEntry... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<PublishBatchResultEntry>(successful.length));
        }
        for (PublishBatchResultEntry ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * 
     * @param successful
     *        A list of successful <code>PublishBatch</code> responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResult withSuccessful(java.util.Collection<PublishBatchResultEntry> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * 
     * @return A list of failed <code>PublishBatch</code> responses.
     */

    public java.util.List<BatchResultErrorEntry> getFailed() {
        if (failed == null) {
            failed = new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>();
        }
        return failed;
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * 
     * @param failed
     *        A list of failed <code>PublishBatch</code> responses.
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
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        A list of failed <code>PublishBatch</code> responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResult withFailed(BatchResultErrorEntry... failed) {
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
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * 
     * @param failed
     *        A list of failed <code>PublishBatch</code> responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
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

        if (obj instanceof PublishBatchResult == false)
            return false;
        PublishBatchResult other = (PublishBatchResult) obj;
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
    public PublishBatchResult clone() {
        try {
            return (PublishBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
