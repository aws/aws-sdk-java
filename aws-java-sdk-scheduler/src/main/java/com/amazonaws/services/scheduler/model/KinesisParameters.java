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
 * The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
 * <code>PutRecord</code> </a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/KinesisParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams terminology
     * and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     */
    private String partitionKey;

    /**
     * <p>
     * Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams terminology
     * and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @param partitionKey
     *        Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams
     *        terminology and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     */

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams terminology
     * and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     *         href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams
     *         terminology and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     */

    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * <p>
     * Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams terminology
     * and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @param partitionKey
     *        Specifies the shard to which EventBridge Scheduler sends the event. For more information, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html">Amazon Kinesis Data Streams
     *        terminology and concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisParameters withPartitionKey(String partitionKey) {
        setPartitionKey(partitionKey);
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
        if (getPartitionKey() != null)
            sb.append("PartitionKey: ").append(getPartitionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisParameters == false)
            return false;
        KinesisParameters other = (KinesisParameters) obj;
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null)
            return false;
        if (other.getPartitionKey() != null && other.getPartitionKey().equals(this.getPartitionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public KinesisParameters clone() {
        try {
            return (KinesisParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.KinesisParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
