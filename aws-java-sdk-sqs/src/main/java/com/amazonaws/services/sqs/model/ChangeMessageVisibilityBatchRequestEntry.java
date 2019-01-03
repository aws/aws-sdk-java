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
 * Encloses a receipt handle and an entry id for each message in <code> <a>ChangeMessageVisibilityBatch</a>.</code>
 * </p>
 * <important>
 * <p>
 * All of the following list parameters must be prefixed with <code>ChangeMessageVisibilityBatchRequestEntry.n</code>,
 * where <code>n</code> is an integer value starting with <code>1</code>. For example, a parameter list for this action
 * might look like this:
 * </p>
 * </important>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code>
 * </p>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=your_receipt_handle</code>
 * </p>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ChangeMessageVisibilityBatchRequestEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeMessageVisibilityBatchRequestEntry implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * </note>
     */
    private String id;
    /**
     * <p>
     * A receipt handle.
     * </p>
     */
    private String receiptHandle;
    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for ChangeMessageVisibilityBatchRequestEntry object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public ChangeMessageVisibilityBatchRequestEntry() {
    }

    /**
     * Constructs a new ChangeMessageVisibilityBatchRequestEntry object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param id
     *        An identifier for this particular receipt handle used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     * @param receiptHandle
     *        A receipt handle.
     */
    public ChangeMessageVisibilityBatchRequestEntry(String id, String receiptHandle) {
        setId(id);
        setReceiptHandle(receiptHandle);
    }

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * </note>
     * 
     * @param id
     *        An identifier for this particular receipt handle used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * </note>
     * 
     * @return An identifier for this particular receipt handle used to communicate the result.</p> <note>
     *         <p>
     *         The <code>Id</code>s of a batch request need to be unique within a request
     *         </p>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * </note>
     * 
     * @param id
     *        An identifier for this particular receipt handle used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchRequestEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     * 
     * @param receiptHandle
     *        A receipt handle.
     */

    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     * 
     * @return A receipt handle.
     */

    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     * 
     * @param receiptHandle
     *        A receipt handle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchRequestEntry withReceiptHandle(String receiptHandle) {
        setReceiptHandle(receiptHandle);
        return this;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     * 
     * @param visibilityTimeout
     *        The new value (in seconds) for the message's visibility timeout.
     */

    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     * 
     * @return The new value (in seconds) for the message's visibility timeout.
     */

    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     * 
     * @param visibilityTimeout
     *        The new value (in seconds) for the message's visibility timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityBatchRequestEntry withVisibilityTimeout(Integer visibilityTimeout) {
        setVisibilityTimeout(visibilityTimeout);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getReceiptHandle() != null)
            sb.append("ReceiptHandle: ").append(getReceiptHandle()).append(",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: ").append(getVisibilityTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityBatchRequestEntry == false)
            return false;
        ChangeMessageVisibilityBatchRequestEntry other = (ChangeMessageVisibilityBatchRequestEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null)
            return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode());
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ChangeMessageVisibilityBatchRequestEntry clone() {
        try {
            return (ChangeMessageVisibilityBatchRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
