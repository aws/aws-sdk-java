/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Kinesis data stream destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/KinesisDataStreamDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisDataStreamDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for a specific Kinesis data stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The current status of replication.
     * </p>
     */
    private String destinationStatus;
    /**
     * <p>
     * The human-readable string that corresponds to the replica status.
     * </p>
     */
    private String destinationStatusDescription;

    /**
     * <p>
     * The ARN for a specific Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN for a specific Kinesis data stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The ARN for a specific Kinesis data stream.
     * </p>
     * 
     * @return The ARN for a specific Kinesis data stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The ARN for a specific Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN for a specific Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisDataStreamDestination withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The current status of replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of replication.
     * @see DestinationStatus
     */

    public void setDestinationStatus(String destinationStatus) {
        this.destinationStatus = destinationStatus;
    }

    /**
     * <p>
     * The current status of replication.
     * </p>
     * 
     * @return The current status of replication.
     * @see DestinationStatus
     */

    public String getDestinationStatus() {
        return this.destinationStatus;
    }

    /**
     * <p>
     * The current status of replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationStatus
     */

    public KinesisDataStreamDestination withDestinationStatus(String destinationStatus) {
        setDestinationStatus(destinationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationStatus
     */

    public KinesisDataStreamDestination withDestinationStatus(DestinationStatus destinationStatus) {
        this.destinationStatus = destinationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The human-readable string that corresponds to the replica status.
     * </p>
     * 
     * @param destinationStatusDescription
     *        The human-readable string that corresponds to the replica status.
     */

    public void setDestinationStatusDescription(String destinationStatusDescription) {
        this.destinationStatusDescription = destinationStatusDescription;
    }

    /**
     * <p>
     * The human-readable string that corresponds to the replica status.
     * </p>
     * 
     * @return The human-readable string that corresponds to the replica status.
     */

    public String getDestinationStatusDescription() {
        return this.destinationStatusDescription;
    }

    /**
     * <p>
     * The human-readable string that corresponds to the replica status.
     * </p>
     * 
     * @param destinationStatusDescription
     *        The human-readable string that corresponds to the replica status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisDataStreamDestination withDestinationStatusDescription(String destinationStatusDescription) {
        setDestinationStatusDescription(destinationStatusDescription);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getDestinationStatus() != null)
            sb.append("DestinationStatus: ").append(getDestinationStatus()).append(",");
        if (getDestinationStatusDescription() != null)
            sb.append("DestinationStatusDescription: ").append(getDestinationStatusDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisDataStreamDestination == false)
            return false;
        KinesisDataStreamDestination other = (KinesisDataStreamDestination) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getDestinationStatus() == null ^ this.getDestinationStatus() == null)
            return false;
        if (other.getDestinationStatus() != null && other.getDestinationStatus().equals(this.getDestinationStatus()) == false)
            return false;
        if (other.getDestinationStatusDescription() == null ^ this.getDestinationStatusDescription() == null)
            return false;
        if (other.getDestinationStatusDescription() != null && other.getDestinationStatusDescription().equals(this.getDestinationStatusDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationStatus() == null) ? 0 : getDestinationStatus().hashCode());
        hashCode = prime * hashCode + ((getDestinationStatusDescription() == null) ? 0 : getDestinationStatusDescription().hashCode());
        return hashCode;
    }

    @Override
    public KinesisDataStreamDestination clone() {
        try {
            return (KinesisDataStreamDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.KinesisDataStreamDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
