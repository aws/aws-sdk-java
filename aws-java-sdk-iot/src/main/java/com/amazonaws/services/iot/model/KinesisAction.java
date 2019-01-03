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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to write data to an Amazon Kinesis stream.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The partition key.
     * </p>
     */
    private String partitionKey;

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon Kinesis stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisAction withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     * 
     * @param partitionKey
     *        The partition key.
     */

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     * 
     * @return The partition key.
     */

    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     * 
     * @param partitionKey
     *        The partition key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisAction withPartitionKey(String partitionKey) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
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

        if (obj instanceof KinesisAction == false)
            return false;
        KinesisAction other = (KinesisAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public KinesisAction clone() {
        try {
            return (KinesisAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.KinesisActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
