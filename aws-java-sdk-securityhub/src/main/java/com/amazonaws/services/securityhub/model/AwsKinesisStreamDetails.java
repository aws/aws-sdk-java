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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Kinesis data stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsKinesisStreamDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsKinesisStreamDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and uses
     * that ID for the stream name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When specified, enables or updates server-side encryption using an KMS key for a specified stream. Removing this
     * property from your stack template and updating your stack disables encryption.
     * </p>
     */
    private AwsKinesisStreamStreamEncryptionDetails streamEncryption;
    /**
     * <p>
     * The number of shards that the stream uses.
     * </p>
     */
    private Integer shardCount;
    /**
     * <p>
     * The number of hours for the data records that are stored in shards to remain accessible.
     * </p>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and uses
     * that ID for the stream name.
     * </p>
     * 
     * @param name
     *        The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and
     *        uses that ID for the stream name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and uses
     * that ID for the stream name.
     * </p>
     * 
     * @return The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID
     *         and uses that ID for the stream name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and uses
     * that ID for the stream name.
     * </p>
     * 
     * @param name
     *        The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and
     *        uses that ID for the stream name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When specified, enables or updates server-side encryption using an KMS key for a specified stream. Removing this
     * property from your stack template and updating your stack disables encryption.
     * </p>
     * 
     * @param streamEncryption
     *        When specified, enables or updates server-side encryption using an KMS key for a specified stream.
     *        Removing this property from your stack template and updating your stack disables encryption.
     */

    public void setStreamEncryption(AwsKinesisStreamStreamEncryptionDetails streamEncryption) {
        this.streamEncryption = streamEncryption;
    }

    /**
     * <p>
     * When specified, enables or updates server-side encryption using an KMS key for a specified stream. Removing this
     * property from your stack template and updating your stack disables encryption.
     * </p>
     * 
     * @return When specified, enables or updates server-side encryption using an KMS key for a specified stream.
     *         Removing this property from your stack template and updating your stack disables encryption.
     */

    public AwsKinesisStreamStreamEncryptionDetails getStreamEncryption() {
        return this.streamEncryption;
    }

    /**
     * <p>
     * When specified, enables or updates server-side encryption using an KMS key for a specified stream. Removing this
     * property from your stack template and updating your stack disables encryption.
     * </p>
     * 
     * @param streamEncryption
     *        When specified, enables or updates server-side encryption using an KMS key for a specified stream.
     *        Removing this property from your stack template and updating your stack disables encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamDetails withStreamEncryption(AwsKinesisStreamStreamEncryptionDetails streamEncryption) {
        setStreamEncryption(streamEncryption);
        return this;
    }

    /**
     * <p>
     * The number of shards that the stream uses.
     * </p>
     * 
     * @param shardCount
     *        The number of shards that the stream uses.
     */

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream uses.
     * </p>
     * 
     * @return The number of shards that the stream uses.
     */

    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream uses.
     * </p>
     * 
     * @param shardCount
     *        The number of shards that the stream uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamDetails withShardCount(Integer shardCount) {
        setShardCount(shardCount);
        return this;
    }

    /**
     * <p>
     * The number of hours for the data records that are stored in shards to remain accessible.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The number of hours for the data records that are stored in shards to remain accessible.
     */

    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours for the data records that are stored in shards to remain accessible.
     * </p>
     * 
     * @return The number of hours for the data records that are stored in shards to remain accessible.
     */

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours for the data records that are stored in shards to remain accessible.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The number of hours for the data records that are stored in shards to remain accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamDetails withRetentionPeriodHours(Integer retentionPeriodHours) {
        setRetentionPeriodHours(retentionPeriodHours);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStreamEncryption() != null)
            sb.append("StreamEncryption: ").append(getStreamEncryption()).append(",");
        if (getShardCount() != null)
            sb.append("ShardCount: ").append(getShardCount()).append(",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: ").append(getRetentionPeriodHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsKinesisStreamDetails == false)
            return false;
        AwsKinesisStreamDetails other = (AwsKinesisStreamDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStreamEncryption() == null ^ this.getStreamEncryption() == null)
            return false;
        if (other.getStreamEncryption() != null && other.getStreamEncryption().equals(this.getStreamEncryption()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStreamEncryption() == null) ? 0 : getStreamEncryption().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        return hashCode;
    }

    @Override
    public AwsKinesisStreamDetails clone() {
        try {
            return (AwsKinesisStreamDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsKinesisStreamDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
