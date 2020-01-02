/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartActivityStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     */
    private String kinesisStreamName;
    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for encryption of messages in the database activity stream.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @return The AWS KMS key identifier for encryption of messages in the database activity stream.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for encryption of messages in the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream to be used for the database activity stream.
     */

    public void setKinesisStreamName(String kinesisStreamName) {
        this.kinesisStreamName = kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis data stream to be used for the database activity stream.
     */

    public String getKinesisStreamName() {
        return this.kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream to be used for the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamResult withKinesisStreamName(String kinesisStreamName) {
        setKinesisStreamName(kinesisStreamName);
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the database activity stream.
     * @see ActivityStreamStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @return The status of the database activity stream.
     * @see ActivityStreamStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public StartActivityStreamResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param status
     *        The status of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamStatus
     */

    public StartActivityStreamResult withStatus(ActivityStreamStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @see ActivityStreamMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @return The mode of the database activity stream.
     * @see ActivityStreamMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public StartActivityStreamResult withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * 
     * @param mode
     *        The mode of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public StartActivityStreamResult withMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     *        maintenance window for the database.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     *        maintenance window for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamResult withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Indicates whether or not the database activity stream will start as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getKinesisStreamName() != null)
            sb.append("KinesisStreamName: ").append(getKinesisStreamName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartActivityStreamResult == false)
            return false;
        StartActivityStreamResult other = (StartActivityStreamResult) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getKinesisStreamName() == null ^ this.getKinesisStreamName() == null)
            return false;
        if (other.getKinesisStreamName() != null && other.getKinesisStreamName().equals(this.getKinesisStreamName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamName() == null) ? 0 : getKinesisStreamName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public StartActivityStreamResult clone() {
        try {
            return (StartActivityStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
