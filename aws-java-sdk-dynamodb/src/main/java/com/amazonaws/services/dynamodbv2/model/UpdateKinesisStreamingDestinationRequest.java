/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateKinesisStreamingDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKinesisStreamingDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in this
     * parameter.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Kinesis stream input.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The command to update the Kinesis stream configuration.
     * </p>
     */
    private UpdateKinesisStreamingConfiguration updateKinesisStreamingConfiguration;

    /**
     * <p>
     * The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in this
     * parameter.
     * </p>
     * 
     * @param tableName
     *        The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in
     *        this parameter.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in this
     * parameter.
     * </p>
     * 
     * @return The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in
     *         this parameter.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in this
     * parameter.
     * </p>
     * 
     * @param tableName
     *        The table name for the Kinesis streaming destination input. You can also provide the ARN of the table in
     *        this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKinesisStreamingDestinationRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Kinesis stream input.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Kinesis stream input.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Kinesis stream input.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Kinesis stream input.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Kinesis stream input.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Kinesis stream input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKinesisStreamingDestinationRequest withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The command to update the Kinesis stream configuration.
     * </p>
     * 
     * @param updateKinesisStreamingConfiguration
     *        The command to update the Kinesis stream configuration.
     */

    public void setUpdateKinesisStreamingConfiguration(UpdateKinesisStreamingConfiguration updateKinesisStreamingConfiguration) {
        this.updateKinesisStreamingConfiguration = updateKinesisStreamingConfiguration;
    }

    /**
     * <p>
     * The command to update the Kinesis stream configuration.
     * </p>
     * 
     * @return The command to update the Kinesis stream configuration.
     */

    public UpdateKinesisStreamingConfiguration getUpdateKinesisStreamingConfiguration() {
        return this.updateKinesisStreamingConfiguration;
    }

    /**
     * <p>
     * The command to update the Kinesis stream configuration.
     * </p>
     * 
     * @param updateKinesisStreamingConfiguration
     *        The command to update the Kinesis stream configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKinesisStreamingDestinationRequest withUpdateKinesisStreamingConfiguration(
            UpdateKinesisStreamingConfiguration updateKinesisStreamingConfiguration) {
        setUpdateKinesisStreamingConfiguration(updateKinesisStreamingConfiguration);
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
        if (getUpdateKinesisStreamingConfiguration() != null)
            sb.append("UpdateKinesisStreamingConfiguration: ").append(getUpdateKinesisStreamingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKinesisStreamingDestinationRequest == false)
            return false;
        UpdateKinesisStreamingDestinationRequest other = (UpdateKinesisStreamingDestinationRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getUpdateKinesisStreamingConfiguration() == null ^ this.getUpdateKinesisStreamingConfiguration() == null)
            return false;
        if (other.getUpdateKinesisStreamingConfiguration() != null
                && other.getUpdateKinesisStreamingConfiguration().equals(this.getUpdateKinesisStreamingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateKinesisStreamingConfiguration() == null) ? 0 : getUpdateKinesisStreamingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKinesisStreamingDestinationRequest clone() {
        return (UpdateKinesisStreamingDestinationRequest) super.clone();
    }

}
