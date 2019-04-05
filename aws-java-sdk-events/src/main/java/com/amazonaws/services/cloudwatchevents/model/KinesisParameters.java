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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon
 * Kinesis data stream, so that you can control the shard to which the event goes. If you do not include this parameter,
 * the default is to use the <code>eventId</code> as the partition key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/KinesisParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis Streams Key
     * Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     */
    private String partitionKeyPath;

    /**
     * <p>
     * The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis Streams Key
     * Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @param partitionKeyPath
     *        The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis
     *        Streams Key Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     */

    public void setPartitionKeyPath(String partitionKeyPath) {
        this.partitionKeyPath = partitionKeyPath;
    }

    /**
     * <p>
     * The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis Streams Key
     * Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @return The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     *         href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis
     *         Streams Key Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     */

    public String getPartitionKeyPath() {
        return this.partitionKeyPath;
    }

    /**
     * <p>
     * The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis Streams Key
     * Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * 
     * @param partitionKeyPath
     *        The JSON path to be extracted from the event and used as the partition key. For more information, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key">Amazon Kinesis
     *        Streams Key Concepts</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisParameters withPartitionKeyPath(String partitionKeyPath) {
        setPartitionKeyPath(partitionKeyPath);
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
        if (getPartitionKeyPath() != null)
            sb.append("PartitionKeyPath: ").append(getPartitionKeyPath());
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
        if (other.getPartitionKeyPath() == null ^ this.getPartitionKeyPath() == null)
            return false;
        if (other.getPartitionKeyPath() != null && other.getPartitionKeyPath().equals(this.getPartitionKeyPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitionKeyPath() == null) ? 0 : getPartitionKeyPath().hashCode());
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
        com.amazonaws.services.cloudwatchevents.model.transform.KinesisParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
