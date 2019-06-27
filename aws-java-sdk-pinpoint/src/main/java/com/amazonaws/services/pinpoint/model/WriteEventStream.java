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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Amazon Resource Name (ARN) of an event stream to publish events to and the AWS Identity and Access
 * Management (IAM) role to use when publishing those events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteEventStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteEventStream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * that you want to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     */
    private String destinationStreamArn;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * that you want to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *        stream that you want to publish event data to.</p>
     *        <p>
     *        For a Kinesis data stream, the ARN format is:
     *        arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *        >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *        </p>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, the ARN format is:
     *        arn:aws:firehose:<replaceable>region</replaceable
     *        >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     */

    public void setDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * that you want to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *         stream that you want to publish event data to.</p>
     *         <p>
     *         For a Kinesis data stream, the ARN format is:
     *         arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *         >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *         </p>
     *         <p>
     *         For a Kinesis Data Firehose delivery stream, the ARN format is:
     *         arn:aws:firehose:<replaceable>region</replaceable
     *         >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     */

    public String getDestinationStreamArn() {
        return this.destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * that you want to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *        stream that you want to publish event data to.</p>
     *        <p>
     *        For a Kinesis data stream, the ARN format is:
     *        arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *        >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *        </p>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, the ARN format is:
     *        arn:aws:firehose:<replaceable>region</replaceable
     *        >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteEventStream withDestinationStreamArn(String destinationStreamArn) {
        setDestinationStreamArn(destinationStreamArn);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to
     *        the stream in your AWS account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data
     *         to the stream in your AWS account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to
     *        the stream in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteEventStream withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getDestinationStreamArn() != null)
            sb.append("DestinationStreamArn: ").append(getDestinationStreamArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteEventStream == false)
            return false;
        WriteEventStream other = (WriteEventStream) obj;
        if (other.getDestinationStreamArn() == null ^ this.getDestinationStreamArn() == null)
            return false;
        if (other.getDestinationStreamArn() != null && other.getDestinationStreamArn().equals(this.getDestinationStreamArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationStreamArn() == null) ? 0 : getDestinationStreamArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public WriteEventStream clone() {
        try {
            return (WriteEventStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteEventStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
