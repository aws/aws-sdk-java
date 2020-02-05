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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data about a queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSqsQueueDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSqsQueueDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before
     * calling AWS KMS again.
     * </p>
     */
    private Integer kmsDataKeyReusePeriodSeconds;
    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     * </p>
     */
    private String kmsMasterKeyId;
    /**
     * <p>
     * The name of the new queue.
     * </p>
     */
    private String queueName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     */
    private String deadLetterTargetArn;

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before
     * calling AWS KMS again.
     * </p>
     * 
     * @param kmsDataKeyReusePeriodSeconds
     *        The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages
     *        before calling AWS KMS again.
     */

    public void setKmsDataKeyReusePeriodSeconds(Integer kmsDataKeyReusePeriodSeconds) {
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before
     * calling AWS KMS again.
     * </p>
     * 
     * @return The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages
     *         before calling AWS KMS again.
     */

    public Integer getKmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before
     * calling AWS KMS again.
     * </p>
     * 
     * @param kmsDataKeyReusePeriodSeconds
     *        The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages
     *        before calling AWS KMS again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSqsQueueDetails withKmsDataKeyReusePeriodSeconds(Integer kmsDataKeyReusePeriodSeconds) {
        setKmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     * </p>
     * 
     * @return The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSqsQueueDetails withKmsMasterKeyId(String kmsMasterKeyId) {
        setKmsMasterKeyId(kmsMasterKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * 
     * @param queueName
     *        The name of the new queue.
     */

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * 
     * @return The name of the new queue.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * 
     * @param queueName
     *        The name of the new queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSqsQueueDetails withQueueName(String queueName) {
        setQueueName(queueName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * 
     * @param deadLetterTargetArn
     *        The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value
     *        of <code>maxReceiveCount</code> is exceeded.
     */

    public void setDeadLetterTargetArn(String deadLetterTargetArn) {
        this.deadLetterTargetArn = deadLetterTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the
     *         value of <code>maxReceiveCount</code> is exceeded.
     */

    public String getDeadLetterTargetArn() {
        return this.deadLetterTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
     * <code>maxReceiveCount</code> is exceeded.
     * </p>
     * 
     * @param deadLetterTargetArn
     *        The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value
     *        of <code>maxReceiveCount</code> is exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSqsQueueDetails withDeadLetterTargetArn(String deadLetterTargetArn) {
        setDeadLetterTargetArn(deadLetterTargetArn);
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
        if (getKmsDataKeyReusePeriodSeconds() != null)
            sb.append("KmsDataKeyReusePeriodSeconds: ").append(getKmsDataKeyReusePeriodSeconds()).append(",");
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: ").append(getKmsMasterKeyId()).append(",");
        if (getQueueName() != null)
            sb.append("QueueName: ").append(getQueueName()).append(",");
        if (getDeadLetterTargetArn() != null)
            sb.append("DeadLetterTargetArn: ").append(getDeadLetterTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSqsQueueDetails == false)
            return false;
        AwsSqsQueueDetails other = (AwsSqsQueueDetails) obj;
        if (other.getKmsDataKeyReusePeriodSeconds() == null ^ this.getKmsDataKeyReusePeriodSeconds() == null)
            return false;
        if (other.getKmsDataKeyReusePeriodSeconds() != null && other.getKmsDataKeyReusePeriodSeconds().equals(this.getKmsDataKeyReusePeriodSeconds()) == false)
            return false;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getDeadLetterTargetArn() == null ^ this.getDeadLetterTargetArn() == null)
            return false;
        if (other.getDeadLetterTargetArn() != null && other.getDeadLetterTargetArn().equals(this.getDeadLetterTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsDataKeyReusePeriodSeconds() == null) ? 0 : getKmsDataKeyReusePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterTargetArn() == null) ? 0 : getDeadLetterTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsSqsQueueDetails clone() {
        try {
            return (AwsSqsQueueDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSqsQueueDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
