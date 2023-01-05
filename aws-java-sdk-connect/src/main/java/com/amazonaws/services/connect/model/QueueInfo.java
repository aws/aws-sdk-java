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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If this contact was queued, this contains information about the queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/QueueInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueueInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     */
    private java.util.Date enqueueTimestamp;

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     * 
     * @param id
     *        The unique identifier for the queue.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     * 
     * @return The unique identifier for the queue.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     * 
     * @param id
     *        The unique identifier for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     * 
     * @param enqueueTimestamp
     *        The timestamp when the contact was added to the queue.
     */

    public void setEnqueueTimestamp(java.util.Date enqueueTimestamp) {
        this.enqueueTimestamp = enqueueTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     * 
     * @return The timestamp when the contact was added to the queue.
     */

    public java.util.Date getEnqueueTimestamp() {
        return this.enqueueTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     * 
     * @param enqueueTimestamp
     *        The timestamp when the contact was added to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueueInfo withEnqueueTimestamp(java.util.Date enqueueTimestamp) {
        setEnqueueTimestamp(enqueueTimestamp);
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
        if (getEnqueueTimestamp() != null)
            sb.append("EnqueueTimestamp: ").append(getEnqueueTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueInfo == false)
            return false;
        QueueInfo other = (QueueInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEnqueueTimestamp() == null ^ this.getEnqueueTimestamp() == null)
            return false;
        if (other.getEnqueueTimestamp() != null && other.getEnqueueTimestamp().equals(this.getEnqueueTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEnqueueTimestamp() == null) ? 0 : getEnqueueTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public QueueInfo clone() {
        try {
            return (QueueInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.QueueInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
