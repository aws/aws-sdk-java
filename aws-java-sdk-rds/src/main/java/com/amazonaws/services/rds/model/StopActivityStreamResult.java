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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopActivityStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
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
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier used for encrypting messages in the database activity stream.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * 
     * @return The AWS KMS key identifier used for encrypting messages in the database activity stream.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier used for encrypting messages in the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopActivityStreamResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream used for the database activity stream.
     */

    public void setKinesisStreamName(String kinesisStreamName) {
        this.kinesisStreamName = kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis data stream used for the database activity stream.
     */

    public String getKinesisStreamName() {
        return this.kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity stream.
     * </p>
     * 
     * @param kinesisStreamName
     *        The name of the Amazon Kinesis data stream used for the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopActivityStreamResult withKinesisStreamName(String kinesisStreamName) {
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

    public StopActivityStreamResult withStatus(String status) {
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

    public StopActivityStreamResult withStatus(ActivityStreamStatus status) {
        this.status = status.toString();
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getKinesisStreamName() != null)
            sb.append("KinesisStreamName: ").append(getKinesisStreamName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopActivityStreamResult == false)
            return false;
        StopActivityStreamResult other = (StopActivityStreamResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamName() == null) ? 0 : getKinesisStreamName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopActivityStreamResult clone() {
        try {
            return (StopActivityStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
