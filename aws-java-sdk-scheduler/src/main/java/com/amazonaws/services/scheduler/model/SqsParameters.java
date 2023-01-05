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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The templated target type for the Amazon SQS <a
 * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
 * <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO queue. If
 * you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication enabled. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
 * >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/SqsParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The FIFO message group ID to use as the target.
     * </p>
     */
    private String messageGroupId;

    /**
     * <p>
     * The FIFO message group ID to use as the target.
     * </p>
     * 
     * @param messageGroupId
     *        The FIFO message group ID to use as the target.
     */

    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * <p>
     * The FIFO message group ID to use as the target.
     * </p>
     * 
     * @return The FIFO message group ID to use as the target.
     */

    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    /**
     * <p>
     * The FIFO message group ID to use as the target.
     * </p>
     * 
     * @param messageGroupId
     *        The FIFO message group ID to use as the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsParameters withMessageGroupId(String messageGroupId) {
        setMessageGroupId(messageGroupId);
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
        if (getMessageGroupId() != null)
            sb.append("MessageGroupId: ").append(getMessageGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsParameters == false)
            return false;
        SqsParameters other = (SqsParameters) obj;
        if (other.getMessageGroupId() == null ^ this.getMessageGroupId() == null)
            return false;
        if (other.getMessageGroupId() != null && other.getMessageGroupId().equals(this.getMessageGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageGroupId() == null) ? 0 : getMessageGroupId().hashCode());
        return hashCode;
    }

    @Override
    public SqsParameters clone() {
        try {
            return (SqsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.SqsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
