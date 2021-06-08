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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DisableKinesisStreamingDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableKinesisStreamingDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the table being modified.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The ARN for the specific Kinesis data stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The current status of the replication.
     * </p>
     */
    private String destinationStatus;

    /**
     * <p>
     * The name of the table being modified.
     * </p>
     * 
     * @param tableName
     *        The name of the table being modified.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table being modified.
     * </p>
     * 
     * @return The name of the table being modified.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table being modified.
     * </p>
     * 
     * @param tableName
     *        The name of the table being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableKinesisStreamingDestinationResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The ARN for the specific Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN for the specific Kinesis data stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The ARN for the specific Kinesis data stream.
     * </p>
     * 
     * @return The ARN for the specific Kinesis data stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The ARN for the specific Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN for the specific Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableKinesisStreamingDestinationResult withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The current status of the replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of the replication.
     * @see DestinationStatus
     */

    public void setDestinationStatus(String destinationStatus) {
        this.destinationStatus = destinationStatus;
    }

    /**
     * <p>
     * The current status of the replication.
     * </p>
     * 
     * @return The current status of the replication.
     * @see DestinationStatus
     */

    public String getDestinationStatus() {
        return this.destinationStatus;
    }

    /**
     * <p>
     * The current status of the replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationStatus
     */

    public DisableKinesisStreamingDestinationResult withDestinationStatus(String destinationStatus) {
        setDestinationStatus(destinationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the replication.
     * </p>
     * 
     * @param destinationStatus
     *        The current status of the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationStatus
     */

    public DisableKinesisStreamingDestinationResult withDestinationStatus(DestinationStatus destinationStatus) {
        this.destinationStatus = destinationStatus.toString();
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getDestinationStatus() != null)
            sb.append("DestinationStatus: ").append(getDestinationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableKinesisStreamingDestinationResult == false)
            return false;
        DisableKinesisStreamingDestinationResult other = (DisableKinesisStreamingDestinationResult) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getDestinationStatus() == null ^ this.getDestinationStatus() == null)
            return false;
        if (other.getDestinationStatus() != null && other.getDestinationStatus().equals(this.getDestinationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationStatus() == null) ? 0 : getDestinationStatus().hashCode());
        return hashCode;
    }

    @Override
    public DisableKinesisStreamingDestinationResult clone() {
        try {
            return (DisableKinesisStreamingDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
